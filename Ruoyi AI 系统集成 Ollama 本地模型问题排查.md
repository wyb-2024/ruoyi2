---

## 文档版本记录
| 版本 | 日期 | 作者 | 修改说明 |
| --- | --- | --- | --- |
| v1.0 | 2026-03-12 | 系统运维组 | 初始版本，记录Ollama集成问题排查全过程及双方案解决方案 |


---

## 一、问题背景
### 1.1 环境信息
| 项目 | 配置 |
| --- | --- |
| 操作系统 | Windows 10.0.26200.8037 |
| Ollama版本 | 最新版 |
| Ruoyi AI系统 | 本地部署版本 |
| 模型名称 | deepseek-r1:1.5b / qwen3:8b |
| 服务器IP | 10.3.181.242 |


### 1.2 问题现象
在Ruoyi AI前端页面发起聊天请求时，出现以下错误：

```json
{
  "message": "fetch error, please check url",
  "url": "/api/chat/send",
  "code": "fetch_error"
}
```

---

## 二、排查过程
### 2.1 第一阶段：Ollama服务状态检查
**问题现象：** 执行 `ollama serve` 命令时出现端口占用错误：

```plain
Error: listen tcp 0.0.0.0:11434: bind: Only one usage of each socket address 
(protocol/network address/port) is normally permitted.
```

**原因分析：** Ollama服务已在后台运行，再次启动导致端口冲突（正常现象，表明Ollama已就绪）

**解决方案：** 使用 `ollama list` 查看已有模型，确认模型已存在

### 2.2 第二阶段：配置混用问题
**问题现象：** 401认证错误、400 URL错误

**原因分析：** Ruoyi后台配置了智谱AI的API密钥，但请求地址错误指向阿里云百炼，或反之

**解决方案：** 统一服务商配置，确保密钥与请求地址匹配

### 2.3 第三阶段：Ollama服务无法访问（核心问题）
**排查步骤：**

1. **Ollama服务监听检查** ✅

```bash
curl http://10.3.181.242:11434/api/tags
```

2. **Windows防火墙检查** ✅ - 已添加到允许列表
3. **网络连通性测试** ✅ - 从Ruoyi后端连接Ollama成功
4. **关键发现：**
    - Ollama和Ruoyi后端运行在同一台服务器（10.3.181.242）
    - Ruoyi后台配置的请求地址为局域网IP：`http://10.3.181.242:11434`
    - **Windows对本机访问本机局域网IP的处理存在不稳定性**
    - 代码层面：`OllamaServiceImpl.java` 中当API Host为空或无效时，没有设置默认值

---

## 三、综合解决方案（双管齐下）
### 方案A：运维配置优化（推荐优先执行）
适用于：快速解决问题，无需修改代码

#### 步骤1：配置Ollama环境变量
在Windows系统中添加以下**系统环境变量**：

| 变量名 | 变量值 | 说明 |
| --- | --- | --- |
| `OLLAMA_HOST` | `0.0.0.0:11434` | 监听所有网络接口 |
| `OLLAMA_ORIGINS` | `*` | 允许所有跨域请求（生产环境建议指定具体域名） |
| `OLLAMA_MODELS` | `D:\ollama\models` | 模型存储路径（可选） |


#### 步骤2：彻底重启Ollama服务
1. 打开任务管理器（Ctrl + Shift + Esc）
2. 结束所有 `ollama.exe` 进程
3. 重新从开始菜单启动Ollama

#### 步骤3：验证配置
```bash
curl http://127.0.0.1:11434/api/tags
curl http://10.3.181.242:11434/api/tags
```

#### 步骤4：修改Ruoyi后台配置
| 配置项 | 修改前 | 修改后 |
| --- | --- | --- |
| 请求地址 | `http://10.3.181.242:11434` | `http://127.0.0.1:11434` |
| 模型名称 | `deepseek-r1:1.5b` | 保持不变 |
| 计费类型 | `token计费` | 保持不变 |


---

### 方案B：代码层修复（长期健壮性保障）
适用于：提升系统鲁棒性，防止配置错误导致故障

#### 修改文件
```plain
d:\ruoyi-ai\ruoyi-modules\ruoyi-chat\src\main\java\org\ruoyi\chat\service\chat\impl\OllamaServiceImpl.java
```

#### 修改内容
在 `chat` 方法中添加默认值逻辑：

```java
@Override
public SseEmitter chat(ChatRequest chatRequest, SseEmitter emitter) {
    ChatModelVo chatModelVo = chatModelService.selectModelByName(chatRequest.getModel());
    String host = chatModelVo.getApiHost();
    
    // 【新增】如果API Host为空或无效，使用本地地址作为默认值
    if (host == null || host.trim().isEmpty()) {
        host = "http://localhost:11434";
    }
    
    // 原有业务逻辑...
}
```

---

## 四、服务重启与验证
### 4.1 重启服务
```bash
# 停止当前服务
Ctrl + C

# 重新编译（如修改了代码）
mvn clean compile

# 启动后端服务
mvn spring-boot:run
```

### 4.2 验证清单
| 检查项 | 期望值 | 状态 |
| --- | --- | --- |
| OLLAMA_HOST 环境变量 | `0.0.0.0:11434` | ⬜ |
| OLLAMA_ORIGINS 环境变量 | `*` | ⬜ |
| 防火墙规则 | Ollama允许通过 | ⬜ |
| Ruoyi后台请求地址 | `http://127.0.0.1:11434` | ⬜ |
| 代码默认值逻辑 | 已添加空值判断 | ⬜ |
| curl测试（127.0.0.1） | 返回模型列表 | ⬜ |
| curl测试（局域网IP） | 返回模型列表 | ⬜ |
| 前端聊天测试 | 正常响应 | ⬜ |


### 4.3 测试命令
```bash
# 测试Ollama服务
ollama list
ollama ps

# 测试API连通性
curl http://127.0.0.1:11434/api/tags
curl http://localhost:11434/api/tags

# 测试模型生成
curl http://127.0.0.1:11434/api/generate -d '{
  "model": "deepseek-r1:1.5b",
  "prompt": "你好"
}'

# 测试Ruoyi接口
curl -X POST "http://localhost:6039/chat/send" \
  -H "Content-Type: application/json" \
  -d '{"model":"qwen3:8b","messages":[{"role":"user","content":"你好"}],"stream":true}'
```

---

## 五、方案对比与选择建议
| 维度 | 方案A（运维配置） | 方案B（代码修复） |
| --- | --- | --- |
| **实施难度** | 低（改配置） | 中（改代码需编译） |
| **生效速度** | 快（重启即可） | 慢（需重新部署） |
| **长期价值** | 依赖人工配置 | 提升系统健壮性 |
| **适用场景** | 紧急修复、单点部署 | 标准化部署、多环境 |
| **推荐度** | ⭐⭐⭐⭐⭐ 优先执行 | ⭐⭐⭐⭐⭐ 必须补充 |


**建议执行顺序：**

1. **立即执行方案A** - 快速恢复服务
2. **同步实施方案B** - 根治问题，防止复发

---

## 六、经验总结
### 6.1 关键问题点
1. **本机访问优先使用 **`127.0.0.1` - Windows对局域网IP回环存在不稳定性
2. **OLLAMA_HOST 必须设置为 **`0.0.0.0` - 否则只能本地访问
3. **代码需具备容错能力** - 配置为空时应有合理默认值
4. **环境变量修改需彻底重启进程** - 仅重启服务可能不生效

### 6.2 最佳实践配置
**Ollama环境变量（Windows）：**

```plain
OLLAMA_HOST=0.0.0.0:11434
OLLAMA_ORIGINS=http://localhost:8080,http://127.0.0.1:8080
OLLAMA_MODELS=D:\ollama\models
```

**Ruoyi后台配置规范：**

+ 同机部署：`http://127.0.0.1:11434`
+ 异机部署：`http://<目标服务器IP>:11434`（需确保防火墙放行）

### 6.3 故障快速定位
| 错误信息 | 可能原因 | 排查命令 |
| --- | --- | --- |
| `fetch error` | URL错误/服务未启动 | `curl http://127.0.0.1:11434/api/tags` |
| `401 Unauthorized` | API密钥错误 | 检查密钥格式 |
| `Connection refused` | 服务未监听/防火墙拦截 | `telnet 127.0.0.1 11434` |


---

## 七、附录
### 7.1 Ollama常用命令
| 命令 | 用途 |
| --- | --- |
| `ollama serve` | 启动Ollama服务 |
| `ollama list` | 查看已下载模型 |
| `ollama ps` | 查看运行中的模型 |
| `ollama run <模型名>` | 运行指定模型 |
| `ollama pull <模型名>` | 下载模型 |
| `ollama rm <模型名>` | 删除模型 |


### 7.2 相关文件路径
| 文件 | 路径 |
| --- | --- |
| Ollama配置 | Windows环境变量 |
| Ruoyi后端代码 | `ruoyi-modules/ruoyi-chat/src/main/java/.../OllamaServiceImpl.java` |
| Ruoyi后台管理 | 前端配置页面 |


---

这个合并版本将两个方案整合为**"运维+开发"的双层解决方案**，既保留了快速修复的手段，又提供了长期稳定的代码保障。建议两个方案同时实施，以达到最佳效果。

