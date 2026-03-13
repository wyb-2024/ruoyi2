package org.ruoyi.domain.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.ChatSession;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatSessionVoToChatSessionMapperImpl implements ChatSessionVoToChatSessionMapper {

    @Override
    public ChatSession convert(ChatSessionVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatSession chatSession = new ChatSession();

        try {
            if ( arg0.getCreateTime() != null ) {
                chatSession.setCreateTime( new SimpleDateFormat().parse( arg0.getCreateTime() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
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
    public ChatSession convert(ChatSessionVo arg0, ChatSession arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        try {
            if ( arg0.getCreateTime() != null ) {
                arg1.setCreateTime( new SimpleDateFormat().parse( arg0.getCreateTime() ) );
            }
            else {
                arg1.setCreateTime( null );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
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
