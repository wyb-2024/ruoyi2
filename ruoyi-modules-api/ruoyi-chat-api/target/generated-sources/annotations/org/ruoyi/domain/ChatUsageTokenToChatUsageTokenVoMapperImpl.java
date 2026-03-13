package org.ruoyi.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.ChatUsageTokenVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatUsageTokenToChatUsageTokenVoMapperImpl implements ChatUsageTokenToChatUsageTokenVoMapper {

    @Override
    public ChatUsageTokenVo convert(ChatUsageToken arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatUsageTokenVo chatUsageTokenVo = new ChatUsageTokenVo();

        chatUsageTokenVo.setId( arg0.getId() );
        chatUsageTokenVo.setUserId( arg0.getUserId() );
        chatUsageTokenVo.setToken( arg0.getToken() );
        chatUsageTokenVo.setModelName( arg0.getModelName() );
        chatUsageTokenVo.setTotalToken( arg0.getTotalToken() );

        return chatUsageTokenVo;
    }

    @Override
    public ChatUsageTokenVo convert(ChatUsageToken arg0, ChatUsageTokenVo arg1) {
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
