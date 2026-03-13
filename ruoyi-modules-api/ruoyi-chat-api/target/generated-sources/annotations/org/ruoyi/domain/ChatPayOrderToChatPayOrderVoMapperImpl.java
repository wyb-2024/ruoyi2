package org.ruoyi.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.ChatPayOrderVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatPayOrderToChatPayOrderVoMapperImpl implements ChatPayOrderToChatPayOrderVoMapper {

    @Override
    public ChatPayOrderVo convert(ChatPayOrder arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatPayOrderVo chatPayOrderVo = new ChatPayOrderVo();

        chatPayOrderVo.setId( arg0.getId() );
        chatPayOrderVo.setOrderNo( arg0.getOrderNo() );
        chatPayOrderVo.setOrderName( arg0.getOrderName() );
        chatPayOrderVo.setAmount( arg0.getAmount() );
        chatPayOrderVo.setPaymentStatus( arg0.getPaymentStatus() );
        chatPayOrderVo.setPaymentMethod( arg0.getPaymentMethod() );
        chatPayOrderVo.setUserId( arg0.getUserId() );
        chatPayOrderVo.setRemark( arg0.getRemark() );

        return chatPayOrderVo;
    }

    @Override
    public ChatPayOrderVo convert(ChatPayOrder arg0, ChatPayOrderVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setOrderNo( arg0.getOrderNo() );
        arg1.setOrderName( arg0.getOrderName() );
        arg1.setAmount( arg0.getAmount() );
        arg1.setPaymentStatus( arg0.getPaymentStatus() );
        arg1.setPaymentMethod( arg0.getPaymentMethod() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
