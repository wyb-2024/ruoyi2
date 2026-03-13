# RuoYi AI 本地部署详细指南

本文档将指导您从零开始完成 RuoYi AI 项目的本地部署，包括所有环境配置、数据库初始化、服务启动等步骤。

## 目录

- [一、环境准备](#一环境准备)
- [二、数据库初始化](#二数据库初始化)
- [三、项目配置](#三项目配置)
- [四、启动后端服务](#四启动后端服务)
- [五、启动前端服务](#五启动前端服务)
- [六、常见问题解决](#六常见问题解决)

---

## 一、环境准备

### 1.1 必需软件

确保以下软件已安装：

| 软件 | 版本要求 | 下载地址 |
|------|---------|---------|
| JDK | 17+ | https://adoptium.net/ |
| Maven | 3.8+ | https://maven.apache.org/ |
| MySQL | 8.0+ | https://dev.mysql.com/ |
| Redis | 最新稳定版 | https://redis.io/ |
| Node.js | 16+ | https://nodejs.org/ |
| IntelliJ IDEA | 2023+ | https://www.jetbrains.com/idea/ |
| Navicat | 可选（数据库管理工具） | https://www.navicat.com/ |

### 1.2 验证安装

在命令行中执行以下命令验证安装：

```bash
# 验证 JDK
java -version

# 验证 Maven
mvn -version

# 验证 Node.js
node -v

# 验证 npm
npm -v
```

**预期输出示例：**
```
java version "17.0.18"
Apache Maven 3.9.13
v18.16.0
9.5.1
```

### 1.3 配置 Maven

**重要：** 修改 Maven 配置文件以使用阿里云镜像加速下载。

文件路径：`C:\Program Files\apache-maven-3.9.13\conf\settings.xml`

在 `<mirrors>` 标签内添加：

```xml
<mirror>
    <id>aliyunmaven</id>
    <mirrorOf>*</mirrorOf>
    <name>阿里云公共仓库</name>
    <url>https://maven.aliyun.com/repository/public</url>
</mirror>
```

**配置 JDK 编译版本：**

在 `<profiles>` 标签内添加：

```xml
<profile>
    <id>jdk-17</id>
    <activation>
        <activeByDefault>true</activeByDefault>
        <jdk>17</jdk>
    </activation>
    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <maven.compiler.compilerVersion>17</maven.compiler.compilerVersion>
    </properties>
</profile>
```

### 1.4 配置环境变量（可选但推荐）

将 Maven 添加到系统 PATH：

1. 右键"此电脑" → "属性" → "高级系统设置"
2. 点击"环境变量"
3. 在"系统变量"中找到 `Path`，点击"编辑"
4. 添加：`C:\Program Files\apache-maven-3.9.13\bin`
5. 点击"确定"保存

**验证：** 重新打开命令行，输入 `mvn -version` 应该能正常显示。

---

## 二、数据库初始化

### 2.1 启动 MySQL 服务

确保 MySQL 服务已启动：

```bash
# Windows 服务管理
services.msc
```

找到 MySQL 服务，确保状态为"正在运行"。

### 2.2 创建数据库

使用 Navicat 或命令行创建数据库：

**方法一：Navicat 图形界面**
1. 打开 Navicat，连接到 MySQL
2. 右键"连接" → "新建数据库"
3. 数据库名：`ruoyi_ai`（**注意：使用下划线，不是连字符**）
4. 字符集：`utf8mb4`
5. 排序规则：`utf8mb4_general_ci`

**方法二：命令行**
```sql
CREATE DATABASE ruoyi_ai DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
```

### 2.3 导入 SQL 文件

**重要警告：**
- ⚠️ **不要重复导入** SQL 文件，多次导入可能导致数据冲突
- ⚠️ 如果误操作重复导入，建议删除数据库重新创建

**步骤：**
1. 在 Navicat 中右键刚创建的 `ruoyi_ai` 数据库
2. 选择"运行 SQL 文件"
3. 选择文件：`D:\ruoyi-ai\script\sql\ruoyi-ai.sql`
4. 点击"开始"执行
5. 等待执行完成（可能需要几分钟）

**验证：** 导入成功后，刷新数据库应该能看到多个表（如 `sys_user`、`chat_config` 等）。

### 2.4 启动 Redis 服务

**Windows 启动 Redis：**

```bash
# 找到 Redis 安装目录，运行
redis-server.exe
```

或者作为 Windows 服务启动：

```bash
redis-server --service-install
redis-server --service-start
```

**验证 Redis 是否运行：**
```bash
redis-cli ping
# 应返回：PONG
```

---

## 三、项目配置

### 3.1 修改数据库配置文件

**文件路径：** `d:\ruoyi-ai\ruoyi-admin\src\main\resources\application-dev.yml`

**需要修改的内容：**

```yaml
spring:
  datasource:
    url: jdbc:mysql://127.0.0.1:3306/ruoyi_ai?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8&autoReconnect=true&rewriteBatchedStatements=true
    username: root
    password: 你的 MySQL 密码
```

**⚠️ 重点注意：**
1. 数据库名必须是 `ruoyi_ai`（下划线），不是 `ruoyi-ai`（连字符）
2. `username` 是你的 MySQL 用户名（默认通常是 `root`）
3. `password` 是你的 MySQL 密码（**务必修改为实际密码**）

### 3.2 配置编码设置

**文件路径：** `d:\ruoyi-ai\ruoyi-admin\src\main\resources\application.yml`

**添加或修改以下内容（防止乱码）：**

```yaml
server:
  servlet:
    encoding:
      charset: UTF-8
      enabled: true
      force: true
```

**⚠️ 注意：** 不要使用过时的 `spring.http.encoding` 配置。

### 3.3 配置前端（可选）

如果前端显示乱码，修改 Vite 配置：

**文件路径：** `d:\ruoyi-ai\ruoyi-web\vite.config.ts`

添加 headers 配置：

```typescript
server: {
  headers: {
    'Content-Type': 'text/html; charset=utf-8'
  }
}
```

---

## 四、启动后端服务

### 方法一：使用 IntelliJ IDEA（推荐）

#### 4.1.1 导入项目

1. 打开 IntelliJ IDEA
2. 点击 "Open" 或 "File" → "Open"
3. 选择项目根目录：`D:\ruoyi-ai`
4. 等待项目加载和索引完成

#### 4.1.2 配置 JDK

**首次使用 IDEA 时配置：**

1. 点击 "File" → "Project Structure"（或按 `Ctrl+Alt+Shift+S`）
2. 在 "Project" 标签页：
   - Project SDK: 选择或添加 JDK 17
   - Project language level: 选择 17
3. 点击 "OK" 保存

#### 4.1.3 配置 Maven

1. 点击 "File" → "Settings"（或按 `Ctrl+Alt+S`）
2. 导航到：Build, Execution, Deployment → Build Tools → Maven
3. 设置：
   - Maven home directory: `C:\Program Files\apache-maven-3.9.13`
   - User settings file: `C:\Program Files\apache-maven-3.9.13\conf\settings.xml`
4. 点击 "OK" 保存

#### 4.1.4 启动后端

1. 找到启动类：`ruoyi-admin\src\main\java\org\ruoyi\RuoYiAIApplication.java`
2. 右键点击文件 → "Run 'RuoYiAIApplication'"
3. 或点击顶部工具栏的绿色运行按钮

**⚠️ 如果遇到"文件名或扩展名太长"错误：**

1. 点击顶部工具栏的运行配置下拉框
2. 选择 "Edit Configurations..."
3. 在左侧选择 "RuoYiAIApplication"
4. 找到 "Shorten command line" 选项
5. 选择 "JAR manifest" 或 "classpath file"
6. 点击 "Apply" → "OK"
7. 重新启动

#### 4.1.5 验证启动成功

观察控制台输出，看到以下内容表示启动成功：

```
(๑•̀ㅂ•́)  ✧  RuoYiAI启动成功  ✧(•̀ㅂ•́ ๑)
```

后端服务默认运行在：`http://localhost:6039/`

### 方法二：使用 Maven 命令

如果不想使用 IDEA，可以用命令行启动：

```bash
cd D:\ruoyi-ai
& "C:\Program Files\apache-maven-3.9.13\bin\mvn.cmd" spring-boot:run -pl ruoyi-admin
```

**⚠️ 注意：** 如果 Maven 未添加到 PATH，必须使用完整路径。

### 4.2 处理端口占用

**如果启动失败，提示端口被占用：**

```
Port 6039 was already in use
```

**解决步骤：**

1. **查找占用端口的进程：**
   ```bash
   netstat -ano | findstr :6039
   ```
   
   输出示例：
   ```
   TCP    0.0.0.0:6039    0.0.0.0:0    LISTENING    32824
   ```

2. **终止占用进程：**
   ```bash
   taskkill /PID 32824 /F
   ```
   （将 32824 替换为实际 PID）

3. **重新启动后端服务**

---

## 五、启动前端服务

### 5.1 进入前端目录

```bash
cd D:\ruoyi-ai\ruoyi-web
```

### 5.2 安装依赖（首次运行需要）

```bash
npm install
```

**⚠️ 注意：** 首次安装可能需要较长时间，请耐心等待。

### 5.3 启动前端开发服务器

```bash
npm run dev
```

**⚠️ 注意：** 前端启动脚本是 `dev`，不是 `start`。

### 5.4 验证启动成功

看到以下输出表示启动成功：

```
VITE v4.3.1  ready in 1676 ms

➜  Local:   http://localhost:1003/
➜  Network: http://10.3.181.242:1003/
```

前端服务默认运行在：`http://localhost:1003/`

**⚠️ 注意：** 如果 1003 端口被占用，Vite 会自动使用其他端口（如 1004、5173 等）。

---

## 六、常见问题解决

### 6.1 Maven 命令无法识别

**错误信息：**
```
mvn: The term 'mvn' is not recognized as an internal or external command
```

**解决方案：**

**方案一：使用完整路径**
```bash
& "C:\Program Files\apache-maven-3.9.13\bin\mvn.cmd" clean install -DskipTests
```

**方案二：配置环境变量**（推荐）
参考 1.4 节配置 PATH 环境变量。

### 6.2 数据库连接失败

**错误信息：**
```
Access denied for user 'root'@'localhost'
```

**原因：** 数据库用户名或密码错误

**解决方案：**
1. 检查 `application-dev.yml` 中的 `username` 和 `password`
2. 确保密码与 MySQL 实际密码一致
3. 确保数据库名为 `ruoyi_ai`（下划线）

### 6.3 端口被占用

**错误信息：**
```
Port 6039 was already in use
```

**解决方案：**
参考 4.2 节，使用 `netstat` 和 `taskkill` 命令终止占用进程。

### 6.4 中文乱码问题

**现象：** 大模型回复显示乱码

**解决方案：**

1. **后端配置：** 确保 `application.yml` 中有：
   ```yaml
   server:
     servlet:
       encoding:
         charset: UTF-8
         enabled: true
         force: true
   ```

2. **前端配置：** 确保 `vite.config.ts` 中有：
   ```typescript
   server: {
     headers: {
       'Content-Type': 'text/html; charset=utf-8'
     }
   }
   ```

3. **重启服务：** 修改配置后必须重启后端和前端服务

### 6.5 前端依赖安装失败

**错误信息：**
```
npm ERR! code ERESOLVE
npm ERR! ERESOLVE unable to resolve dependency tree
```

**解决方案：**

```bash
# 清除缓存
npm cache clean --force

# 删除 node_modules
rm -rf node_modules package-lock.json

# 重新安装
npm install --legacy-peer-deps
```

### 6.6 IDEA 提示"未定义项目 SDK"

**解决方案：**
1. 点击提示中的 "Configure" 链接
2. 选择或添加 JDK 17
3. 路径示例：`C:\Program Files\Eclipse Adoptium\jdk-17.0.18.8-hotspot`

### 6.7 重复导入 SQL 文件

**问题：** 误操作多次导入 SQL 文件

**解决方案：**
1. 在 Navicat 中删除 `ruoyi_ai` 数据库
2. 重新创建数据库
3. 重新导入 SQL 文件（仅一次）

---

## 七、访问地址

启动成功后，可通过以下地址访问：

| 服务 | 地址 | 说明 |
|------|------|------|
| 后端 API | http://localhost:6039/ | Spring Boot 后端服务 |
| 前端用户界面 | http://localhost:1003/ | Vite 开发服务器 |
| 管理后台 | http://localhost:6039/admin | 管理后台（如有） |

**默认登录信息：**
- 用户名：`admin`
- 密码：`admin123`

**⚠️ 重要：** 首次登录后请立即修改默认密码！

---

## 八、停止服务

### 8.1 停止前端服务

在前端运行的终端按 `Ctrl+C`

### 8.2 停止后端服务

在 IDEA 中点击红色停止按钮，或在终端按 `Ctrl+C`

### 8.3 批量停止所有服务

```bash
# 查找并终止 Java 进程（后端）
taskkill /F /IM java.exe

# 查找并终止 Node 进程（前端）
taskkill /F /IM node.exe
```

**⚠️ 警告：** 这会终止所有 Java 和 Node 进程，请谨慎使用。

---

## 九、外部网络访问

### 9.1 允许局域网访问

**后端配置：** 修改 `application.yml`

```yaml
server:
  address: 0.0.0.0  # 允许所有网络接口访问
```

**前端配置：** 修改 `vite.config.ts`

```typescript
server: {
  host: '0.0.0.0',  # 允许所有网络接口访问
  port: 1003
}
```

### 9.2 防火墙设置

如果其他设备无法访问，需要配置 Windows 防火墙：

1. 打开"Windows Defender 防火墙"
2. 点击"高级设置"
3. 在"入站规则"中创建新规则
4. 允许端口 6039 和 1003

### 9.3 查看本机 IP

```bash
ipconfig
```

在输出中找到 IPv4 地址（如 `192.168.1.100`）

其他设备可通过以下地址访问：
- 后端：`http://192.168.1.100:6039/`
- 前端：`http://192.168.1.100:1003/`

---

## 十、部署检查清单

在报告问题前，请确认以下项目：

- [ ] JDK 17 已安装并配置
- [ ] Maven 3.8+ 已安装并配置
- [ ] MySQL 8.0+ 已安装并运行
- [ ] Redis 已安装并运行
- [ ] Node.js 16+ 已安装
- [ ] 数据库 `ruoyi_ai` 已创建
- [ ] SQL 文件已导入（仅一次）
- [ ] `application-dev.yml` 数据库配置正确
- [ ] 后端服务已启动（端口 6039）
- [ ] 前端服务已启动（端口 1003）
- [ ] 无端口占用错误
- [ ] 无中文乱码问题

---

## 附录：常用命令速查

```bash
# 检查端口占用
netstat -ano | findstr :6039
netstat -ano | findstr :1003

# 终止进程
taskkill /PID <进程 ID> /F

# Maven 构建
mvn clean install -DskipTests

# 启动后端
mvn spring-boot:run -pl ruoyi-admin

# 启动前端
cd ruoyi-web
npm run dev

# 查看 Redis 状态
redis-cli ping

# 查看 MySQL 服务
services.msc  # 找到 MySQL 服务
```

---

**文档版本：** 1.0  
**最后更新：** 2026-03-10  
**适用版本：** RuoYi AI 2.0
