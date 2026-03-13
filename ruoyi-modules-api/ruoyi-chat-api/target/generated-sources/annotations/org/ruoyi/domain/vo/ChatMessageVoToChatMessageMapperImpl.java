package org.ruoyi.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.ChatMessage;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatMessageVoToChatMessageMapperImpl implements ChatMessageVoToChatMessageMapper {

    @Override
    public ChatMessage convert(ChatMessageVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatMessage chatMessage = new ChatMessage();

        chatMessage.setCreateTime( arg0.getCreateTime() );
        chatMessage.setId( arg0.getId() );
        chatMessage.setUserId( arg0.getUserId() );
        chatMessage.setSessionId( arg0.getSessionId() );
        chatMessage.setContent( arg0.getContent() );
        chatMessage.setRole( arg0.getRole() );
        chatMessage.setDeductCost( arg0.getDeductCost() );
        chatMessage.setTotalTokens( arg0.getTotalTokens() );
        chatMessage.setModelName( arg0.getModelName() );
        chatMessage.setRemark( arg0.getRemark() );
        chatMessage.setBillingType( arg0.getBillingType() );

        return chatMessage;
    }

    @Override
    public ChatMessage convert(ChatMessageVo arg0, ChatMessage arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setId( arg0.getId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setSessionId( arg0.getSessionId() );
        arg1.setContent( arg0.getContent() );
        arg1.setRole( arg0.getRole() );
        arg1.setDeductCost( arg0.getDeductCost() );
        arg1.setTotalTokens( arg0.getTotalTokens() );
        arg1.setModelName( arg0.getModelName() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setBillingType( arg0.getBillingType() );

        return arg1;
    }
}
