package org.ruoyi.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.ChatModel;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class ChatModelBoToChatModelMapperImpl implements ChatModelBoToChatModelMapper {

    @Override
    public ChatModel convert(ChatModelBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChatModel chatModel = new ChatModel();

        chatModel.setSearchValue( arg0.getSearchValue() );
        chatModel.setCreateDept( arg0.getCreateDept() );
        chatModel.setCreateBy( arg0.getCreateBy() );
        chatModel.setCreateTime( arg0.getCreateTime() );
        chatModel.setUpdateBy( arg0.getUpdateBy() );
        chatModel.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            chatModel.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        chatModel.setId( arg0.getId() );
        chatModel.setCategory( arg0.getCategory() );
        chatModel.setModelName( arg0.getModelName() );
        chatModel.setModelDescribe( arg0.getModelDescribe() );
        chatModel.setModelPrice( arg0.getModelPrice() );
        chatModel.setModelType( arg0.getModelType() );
        chatModel.setModelShow( arg0.getModelShow() );
        chatModel.setSystemPrompt( arg0.getSystemPrompt() );
        chatModel.setApiHost( arg0.getApiHost() );
        chatModel.setApiKey( arg0.getApiKey() );
        chatModel.setPriority( arg0.getPriority() );
        chatModel.setProviderName( arg0.getProviderName() );
        chatModel.setRemark( arg0.getRemark() );

        return chatModel;
    }

    @Override
    public ChatModel convert(ChatModelBo arg0, ChatModel arg1) {
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
        arg1.setCategory( arg0.getCategory() );
        arg1.setModelName( arg0.getModelName() );
        arg1.setModelDescribe( arg0.getModelDescribe() );
        arg1.setModelPrice( arg0.getModelPrice() );
        arg1.setModelType( arg0.getModelType() );
        arg1.setModelShow( arg0.getModelShow() );
        arg1.setSystemPrompt( arg0.getSystemPrompt() );
        arg1.setApiHost( arg0.getApiHost() );
        arg1.setApiKey( arg0.getApiKey() );
        arg1.setPriority( arg0.getPriority() );
        arg1.setProviderName( arg0.getProviderName() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
