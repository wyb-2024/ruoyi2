package org.ruoyi.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.ChatModelVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:09+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatModelToChatModelVoMapperImpl implements ChatModelToChatModelVoMapper {

    @Override
    public ChatModelVo convert(ChatModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatModelVo chatModelVo = new ChatModelVo();

        chatModelVo.setId( arg0.getId() );
        chatModelVo.setCategory( arg0.getCategory() );
        chatModelVo.setModelName( arg0.getModelName() );
        chatModelVo.setModelDescribe( arg0.getModelDescribe() );
        chatModelVo.setModelPrice( arg0.getModelPrice() );
        chatModelVo.setModelType( arg0.getModelType() );
        chatModelVo.setModelShow( arg0.getModelShow() );
        chatModelVo.setSystemPrompt( arg0.getSystemPrompt() );
        chatModelVo.setApiHost( arg0.getApiHost() );
        chatModelVo.setApiKey( arg0.getApiKey() );
        chatModelVo.setPriority( arg0.getPriority() );
        chatModelVo.setProviderName( arg0.getProviderName() );
        chatModelVo.setRemark( arg0.getRemark() );

        return chatModelVo;
    }

    @Override
    public ChatModelVo convert(ChatModel arg0, ChatModelVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setCategory( arg0.getCategory() );
        arg1.setModelName( arg0.getModelName() );
        arg1.setModelDescribe( arg0.getModelDescribe() );
        arg1.setModelPrice( arg0.getModelPrice() );
        arg1.setModelType( arg0.getModelType() );
        arg1.setModelShow( arg0.getModelShow() );
        arg1.setSystemPrompt( arg0.getSystemPrompt() );
        arg1.setApiHost( arg0.getApiHost() );
        arg1.setApiKey( arg0.getApiKey() );
        arg1.setPriority( arg0.getPriority() );
        arg1.setProviderName( arg0.getProviderName() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
