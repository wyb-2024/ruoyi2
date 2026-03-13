package org.ruoyi.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.PromptTemplate;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class PromptTemplateVoToPromptTemplateMapperImpl implements PromptTemplateVoToPromptTemplateMapper {

    @Override
    public PromptTemplate convert(PromptTemplateVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PromptTemplate promptTemplate = new PromptTemplate();

        promptTemplate.setId( arg0.getId() );
        promptTemplate.setTemplateName( arg0.getTemplateName() );
        promptTemplate.setTemplateContent( arg0.getTemplateContent() );
        promptTemplate.setCategory( arg0.getCategory() );
        promptTemplate.setRemark( arg0.getRemark() );

        return promptTemplate;
    }

    @Override
    public PromptTemplate convert(PromptTemplateVo arg0, PromptTemplate arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setTemplateName( arg0.getTemplateName() );
        arg1.setTemplateContent( arg0.getTemplateContent() );
        arg1.setCategory( arg0.getCategory() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
