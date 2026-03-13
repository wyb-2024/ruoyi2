package org.ruoyi.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.ChatConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:55+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatConfigBoToChatConfigMapperImpl implements ChatConfigBoToChatConfigMapper {

    @Override
    public ChatConfig convert(ChatConfigBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatConfig chatConfig = new ChatConfig();

        chatConfig.setSearchValue( arg0.getSearchValue() );
        chatConfig.setCreateDept( arg0.getCreateDept() );
        chatConfig.setCreateBy( arg0.getCreateBy() );
        chatConfig.setCreateTime( arg0.getCreateTime() );
        chatConfig.setUpdateBy( arg0.getUpdateBy() );
        chatConfig.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            chatConfig.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        chatConfig.setId( arg0.getId() );
        chatConfig.setCategory( arg0.getCategory() );
        chatConfig.setConfigName( arg0.getConfigName() );
        chatConfig.setConfigValue( arg0.getConfigValue() );
        chatConfig.setConfigDict( arg0.getConfigDict() );
        chatConfig.setRemark( arg0.getRemark() );
        chatConfig.setUpdateIp( arg0.getUpdateIp() );

        return chatConfig;
    }

    @Override
    public ChatConfig convert(ChatConfigBo arg0, ChatConfig arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setSearchValue( arg0.getSearchValue() );
        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        if ( arg1.getParams() != null ) {
            Map<String, Object> map = arg0.getParams();
            if ( map != null ) {
                arg1.getParams().clear();
                arg1.getParams().putAll( map );
            }
            else {
                arg1.setParams( null );
            }
        }
        else {
            Map<String, Object> map = arg0.getParams();
            if ( map != null ) {
                arg1.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
        arg1.setId( arg0.getId() );
        arg1.setCategory( arg0.getCategory() );
        arg1.setConfigName( arg0.getConfigName() );
        arg1.setConfigValue( arg0.getConfigValue() );
        arg1.setConfigDict( arg0.getConfigDict() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setUpdateIp( arg0.getUpdateIp() );

        return arg1;
    }
}
