package org.ruoyi.system.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.ChatConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:55+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatConfigVoToChatConfigMapperImpl implements ChatConfigVoToChatConfigMapper {

    @Override
    public ChatConfig convert(ChatConfigVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatConfig chatConfig = new ChatConfig();

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
    public ChatConfig convert(ChatConfigVo arg0, ChatConfig arg1) {
        if ( arg0 == null ) {
            return arg1;
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
