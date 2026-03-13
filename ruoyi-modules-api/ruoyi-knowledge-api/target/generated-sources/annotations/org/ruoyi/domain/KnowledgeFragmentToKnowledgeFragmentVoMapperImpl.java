package org.ruoyi.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.KnowledgeFragmentVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeFragmentToKnowledgeFragmentVoMapperImpl implements KnowledgeFragmentToKnowledgeFragmentVoMapper {

    @Override
    public KnowledgeFragmentVo convert(KnowledgeFragment arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeFragmentVo knowledgeFragmentVo = new KnowledgeFragmentVo();

        knowledgeFragmentVo.setId( arg0.getId() );
        knowledgeFragmentVo.setKid( arg0.getKid() );
        knowledgeFragmentVo.setDocId( arg0.getDocId() );
        knowledgeFragmentVo.setFid( arg0.getFid() );
        if ( arg0.getIdx() != null ) {
            knowledgeFragmentVo.setIdx( arg0.getIdx().longValue() );
        }
        knowledgeFragmentVo.setContent( arg0.getContent() );
        knowledgeFragmentVo.setRemark( arg0.getRemark() );

        return knowledgeFragmentVo;
    }

    @Override
    public KnowledgeFragmentVo convert(KnowledgeFragment arg0, KnowledgeFragmentVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setKid( arg0.getKid() );
        arg1.setDocId( arg0.getDocId() );
        arg1.setFid( arg0.getFid() );
        if ( arg0.getIdx() != null ) {
            arg1.setIdx( arg0.getIdx().longValue() );
        }
        else {
            arg1.setIdx( null );
        }
        arg1.setContent( arg0.getContent() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
