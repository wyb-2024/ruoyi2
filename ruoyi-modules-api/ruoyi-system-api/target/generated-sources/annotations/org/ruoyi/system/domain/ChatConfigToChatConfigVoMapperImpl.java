package org.ruoyi.system.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.system.domain.vo.ChatConfigVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:42:55+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatConfigToChatConfigVoMapperImpl implements ChatConfigToChatConfigVoMapper {

    @Override
    public ChatConfigVo convert(ChatConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatConfigVo chatConfigVo = new ChatConfigVo();

        chatConfigVo.setId( arg0.getId() );
        chatConfigVo.setCategory( arg0.getCategory() );
        chatConfigVo.setConfigName( arg0.getConfigName() );
        chatConfigVo.setConfigValue( arg0.getConfigValue() );
        chatConfigVo.setConfigDict( arg0.getConfigDict() );
        chatConfigVo.setRemark( arg0.getRemark() );
        chatConfigVo.setUpdateIp( arg0.getUpdateIp() );

        return chatConfigVo;
    }

    @Override
    public ChatConfigVo convert(ChatConfig arg0, ChatConfigVo arg1) {
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
