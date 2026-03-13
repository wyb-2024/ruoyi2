package org.ruoyi.domain;

import java.text.SimpleDateFormat;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.ChatSessionVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatSessionToChatSessionVoMapperImpl implements ChatSessionToChatSessionVoMapper {

    @Override
    public ChatSessionVo convert(ChatSession arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatSessionVo chatSessionVo = new ChatSessionVo();

        chatSessionVo.setId( arg0.getId() );
        chatSessionVo.setUserId( arg0.getUserId() );
        chatSessionVo.setSessionTitle( arg0.getSessionTitle() );
        chatSessionVo.setSessionContent( arg0.getSessionContent() );
        chatSessionVo.setRemark( arg0.getRemark() );
        if ( arg0.getCreateTime() != null ) {
            chatSessionVo.setCreateTime( new SimpleDateFormat().format( arg0.getCreateTime() ) );
        }
        chatSessionVo.setConversationId( arg0.getConversationId() );

        return chatSessionVo;
    }

    @Override
    public ChatSessionVo convert(ChatSession arg0, ChatSessionVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setSessionTitle( arg0.getSessionTitle() );
        arg1.setSessionContent( arg0.getSessionContent() );
        arg1.setRemark( arg0.getRemark() );
        if ( arg0.getCreateTime() != null ) {
            arg1.setCreateTime( new SimpleDateFormat().format( arg0.getCreateTime() ) );
        }
        else {
            arg1.setCreateTime( null );
        }
        arg1.setConversationId( arg0.getConversationId() );

        return arg1;
    }
}
