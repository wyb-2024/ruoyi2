package org.ruoyi.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.ChatUsageToken;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatUsageTokenVoToChatUsageTokenMapperImpl implements ChatUsageTokenVoToChatUsageTokenMapper {

    @Override
    public ChatUsageToken convert(ChatUsageTokenVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatUsageToken chatUsageToken = new ChatUsageToken();

        chatUsageToken.setId( arg0.getId() );
        chatUsageToken.setUserId( arg0.getUserId() );
        chatUsageToken.setToken( arg0.getToken() );
        chatUsageToken.setModelName( arg0.getModelName() );
        chatUsageToken.setTotalToken( arg0.getTotalToken() );

        return chatUsageToken;
    }

    @Override
    public ChatUsageToken convert(ChatUsageTokenVo arg0, ChatUsageToken arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setToken( arg0.getToken() );
        arg1.setModelName( arg0.getModelName() );
        arg1.setTotalToken( arg0.getTotalToken() );

        return arg1;
    }
}
