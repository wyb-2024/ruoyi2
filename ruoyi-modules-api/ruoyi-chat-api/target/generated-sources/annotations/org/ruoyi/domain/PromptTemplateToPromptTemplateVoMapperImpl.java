package org.ruoyi.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.PromptTemplateVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class PromptTemplateToPromptTemplateVoMapperImpl implements PromptTemplateToPromptTemplateVoMapper {

    @Override
    public PromptTemplateVo convert(PromptTemplate arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PromptTemplateVo promptTemplateVo = new PromptTemplateVo();

        promptTemplateVo.setId( arg0.getId() );
        promptTemplateVo.setTemplateName( arg0.getTemplateName() );
        promptTemplateVo.setTemplateContent( arg0.getTemplateContent() );
        promptTemplateVo.setCategory( arg0.getCategory() );
        promptTemplateVo.setRemark( arg0.getRemark() );

        return promptTemplateVo;
    }

    @Override
    public PromptTemplateVo convert(PromptTemplate arg0, PromptTemplateVo arg1) {
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
