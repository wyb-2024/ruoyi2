package org.ruoyi.domain.bo;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.ChatMessage;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatMessageBoToChatMessageMapperImpl implements ChatMessageBoToChatMessageMapper {

    @Override
    public ChatMessage convert(ChatMessageBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatMessage chatMessage = new ChatMessage();

        chatMessage.setSearchValue( arg0.getSearchValue() );
        chatMessage.setCreateDept( arg0.getCreateDept() );
        chatMessage.setCreateBy( arg0.getCreateBy() );
        chatMessage.setCreateTime( arg0.getCreateTime() );
        chatMessage.setUpdateBy( arg0.getUpdateBy() );
        chatMessage.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            chatMessage.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        chatMessage.setId( arg0.getId() );
        chatMessage.setUserId( arg0.getUserId() );
        chatMessage.setSessionId( arg0.getSessionId() );
        chatMessage.setContent( arg0.getContent() );
        chatMessage.setRole( arg0.getRole() );
        if ( arg0.getDeductCost() != null ) {
            chatMessage.setDeductCost( BigDecimal.valueOf( arg0.getDeductCost() ) );
        }
        if ( arg0.getTotalTokens() != null ) {
            chatMessage.setTotalTokens( arg0.getTotalTokens().longValue() );
        }
        chatMessage.setModelName( arg0.getModelName() );
        chatMessage.setRemark( arg0.getRemark() );
        chatMessage.setBillingType( arg0.getBillingType() );

        return chatMessage;
    }

    @Override
    public ChatMessage convert(ChatMessageBo arg0, ChatMessage arg1) {
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
        arg1.setUserId( arg0.getUserId() );
        arg1.setSessionId( arg0.getSessionId() );
        arg1.setContent( arg0.getContent() );
        arg1.setRole( arg0.getRole() );
        if ( arg0.getDeductCost() != null ) {
            arg1.setDeductCost( BigDecimal.valueOf( arg0.getDeductCost() ) );
        }
        else {
            arg1.setDeductCost( null );
        }
        if ( arg0.getTotalTokens() != null ) {
            arg1.setTotalTokens( arg0.getTotalTokens().longValue() );
        }
        else {
            arg1.setTotalTokens( null );
        }
        arg1.setModelName( arg0.getModelName() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setBillingType( arg0.getBillingType() );

        return arg1;
    }
}
