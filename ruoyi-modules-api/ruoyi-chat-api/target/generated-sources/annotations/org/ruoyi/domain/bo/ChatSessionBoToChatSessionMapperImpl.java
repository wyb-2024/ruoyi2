package org.ruoyi.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.ChatSession;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatSessionBoToChatSessionMapperImpl implements ChatSessionBoToChatSessionMapper {

    @Override
    public ChatSession convert(ChatSessionBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatSession chatSession = new ChatSession();

        chatSession.setSearchValue( arg0.getSearchValue() );
        chatSession.setCreateDept( arg0.getCreateDept() );
        chatSession.setCreateBy( arg0.getCreateBy() );
        chatSession.setCreateTime( arg0.getCreateTime() );
        chatSession.setUpdateBy( arg0.getUpdateBy() );
        chatSession.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            chatSession.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        chatSession.setId( arg0.getId() );
        chatSession.setUserId( arg0.getUserId() );
        chatSession.setSessionTitle( arg0.getSessionTitle() );
        chatSession.setSessionContent( arg0.getSessionContent() );
        chatSession.setRemark( arg0.getRemark() );
        chatSession.setConversationId( arg0.getConversationId() );

        return chatSession;
    }

    @Override
    public ChatSession convert(ChatSessionBo arg0, ChatSession arg1) {
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
        arg1.setSessionTitle( arg0.getSessionTitle() );
        arg1.setSessionContent( arg0.getSessionContent() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setConversationId( arg0.getConversationId() );

        return arg1;
    }
}
