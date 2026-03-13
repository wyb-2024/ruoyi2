package org.ruoyi.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.ChatPayOrder;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatPayOrderBoToChatPayOrderMapperImpl implements ChatPayOrderBoToChatPayOrderMapper {

    @Override
    public ChatPayOrder convert(ChatPayOrderBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatPayOrder chatPayOrder = new ChatPayOrder();

        chatPayOrder.setSearchValue( arg0.getSearchValue() );
        chatPayOrder.setCreateDept( arg0.getCreateDept() );
        chatPayOrder.setCreateBy( arg0.getCreateBy() );
        chatPayOrder.setCreateTime( arg0.getCreateTime() );
        chatPayOrder.setUpdateBy( arg0.getUpdateBy() );
        chatPayOrder.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            chatPayOrder.setParams( new LinkedHashMap<String, Object>( map ) );
        }
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
    public ChatPayOrder convert(ChatPayOrderBo arg0, ChatPayOrder arg1) {
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
