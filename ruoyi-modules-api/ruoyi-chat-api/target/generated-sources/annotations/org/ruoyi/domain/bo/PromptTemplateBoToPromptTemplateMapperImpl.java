package org.ruoyi.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.ruoyi.domain.PromptTemplate;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:09+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class PromptTemplateBoToPromptTemplateMapperImpl implements PromptTemplateBoToPromptTemplateMapper {

    @Override
    public PromptTemplate convert(PromptTemplateBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PromptTemplate promptTemplate = new PromptTemplate();

        promptTemplate.setSearchValue( arg0.getSearchValue() );
        promptTemplate.setCreateDept( arg0.getCreateDept() );
        promptTemplate.setCreateBy( arg0.getCreateBy() );
        promptTemplate.setCreateTime( arg0.getCreateTime() );
        promptTemplate.setUpdateBy( arg0.getUpdateBy() );
        promptTemplate.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            promptTemplate.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        promptTemplate.setId( arg0.getId() );
        promptTemplate.setTemplateName( arg0.getTemplateName() );
        promptTemplate.setTemplateContent( arg0.getTemplateContent() );
        promptTemplate.setCategory( arg0.getCategory() );
        promptTemplate.setRemark( arg0.getRemark() );

        return promptTemplate;
    }

    @Override
    public PromptTemplate convert(PromptTemplateBo arg0, PromptTemplate arg1) {
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
        arg1.setTemplateName( arg0.getTemplateName() );
        arg1.setTemplateContent( arg0.getTemplateContent() );
        arg1.setCategory( arg0.getCategory() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
