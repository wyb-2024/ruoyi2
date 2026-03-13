package org.ruoyi.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.ChatPayOrder;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatPayOrderVoToChatPayOrderMapperImpl implements ChatPayOrderVoToChatPayOrderMapper {

    @Override
    public ChatPayOrder convert(ChatPayOrderVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatPayOrder chatPayOrder = new ChatPayOrder();

        chatPayOrder.setId( arg0.getId() );
        chatPayOrder.setOrderNo( arg0.getOrderNo() );
        chatPayOrder.setOrderName( arg0.getOrderName() );
        chatPayOrder.setAmount( arg0.getAmount() );
        chatPayOrder.setPaymentStatus( arg0.getPaymentStatus() );
        chatPayOrder.setPaymentMethod( arg0.getPaymentMethod() );
        chatPayOrder.setUserId( arg0.getUserId() );
        chatPayOrder.setRemark( arg0.getRemark() );

        return chatPayOrder;
    }

    @Override
    public ChatPayOrder convert(ChatPayOrderVo arg0, ChatPayOrder arg1) {
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
