package org.ruoyi.domain.vo;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.KnowledgeFragment;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:23+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class KnowledgeFragmentVoToKnowledgeFragmentMapperImpl implements KnowledgeFragmentVoToKnowledgeFragmentMapper {

    @Override
    public KnowledgeFragment convert(KnowledgeFragmentVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        KnowledgeFragment knowledgeFragment = new KnowledgeFragment();

        knowledgeFragment.setId( arg0.getId() );
        knowledgeFragment.setKid( arg0.getKid() );
        knowledgeFragment.setDocId( arg0.getDocId() );
        knowledgeFragment.setFid( arg0.getFid() );
        if ( arg0.getIdx() != null ) {
            knowledgeFragment.setIdx( arg0.getIdx().intValue() );
        }
        knowledgeFragment.setContent( arg0.getContent() );
        knowledgeFragment.setRemark( arg0.getRemark() );

        return knowledgeFragment;
    }

    @Override
    public KnowledgeFragment convert(KnowledgeFragmentVo arg0, KnowledgeFragment arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setKid( arg0.getKid() );
        arg1.setDocId( arg0.getDocId() );
        arg1.setFid( arg0.getFid() );
        if ( arg0.getIdx() != null ) {
            arg1.setIdx( arg0.getIdx().intValue() );
        }
        else {
            arg1.setIdx( null );
        }
        arg1.setContent( arg0.getContent() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
