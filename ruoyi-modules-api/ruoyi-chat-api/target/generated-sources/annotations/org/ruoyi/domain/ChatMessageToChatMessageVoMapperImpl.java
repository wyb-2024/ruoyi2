package org.ruoyi.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.ChatMessageVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatMessageToChatMessageVoMapperImpl implements ChatMessageToChatMessageVoMapper {

    @Override
    public ChatMessageVo convert(ChatMessage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatMessageVo chatMessageVo = new ChatMessageVo();

        chatMessageVo.setId( arg0.getId() );
        chatMessageVo.setUserId( arg0.getUserId() );
        chatMessageVo.setSessionId( arg0.getSessionId() );
        chatMessageVo.setContent( arg0.getContent() );
        chatMessageVo.setRole( arg0.getRole() );
        chatMessageVo.setDeductCost( arg0.getDeductCost() );
        chatMessageVo.setTotalTokens( arg0.getTotalTokens() );
        chatMessageVo.setModelName( arg0.getModelName() );
        chatMessageVo.setBillingType( arg0.getBillingType() );
        chatMessageVo.setRemark( arg0.getRemark() );
        chatMessageVo.setCreateTime( arg0.getCreateTime() );

        return chatMessageVo;
    }

    @Override
    public ChatMessageVo convert(ChatMessage arg0, ChatMessageVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setSessionId( arg0.getSessionId() );
        arg1.setContent( arg0.getContent() );
        arg1.setRole( arg0.getRole() );
        arg1.setDeductCost( arg0.getDeductCost() );
        arg1.setTotalTokens( arg0.getTotalTokens() );
        arg1.setModelName( arg0.getModelName() );
        arg1.setBillingType( arg0.getBillingType() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setCreateTime( arg0.getCreateTime() );

        return arg1;
    }
}
