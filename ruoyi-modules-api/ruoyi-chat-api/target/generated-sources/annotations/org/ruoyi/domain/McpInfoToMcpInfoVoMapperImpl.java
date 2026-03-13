package org.ruoyi.domain;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.vo.McpInfoVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class McpInfoToMcpInfoVoMapperImpl implements McpInfoToMcpInfoVoMapper {

    @Override
    public McpInfoVo convert(McpInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        McpInfoVo mcpInfoVo = new McpInfoVo();

        mcpInfoVo.setMcpId( arg0.getMcpId() );
        mcpInfoVo.setServerName( arg0.getServerName() );
        mcpInfoVo.setTransportType( arg0.getTransportType() );
        mcpInfoVo.setCommand( arg0.getCommand() );
        mcpInfoVo.setArguments( arg0.getArguments() );
        mcpInfoVo.setDescription( arg0.getDescription() );
        mcpInfoVo.setEnv( arg0.getEnv() );
        mcpInfoVo.setStatus( arg0.getStatus() );

        return mcpInfoVo;
    }

    @Override
    public McpInfoVo convert(McpInfo arg0, McpInfoVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setMcpId( arg0.getMcpId() );
        arg1.setServerName( arg0.getServerName() );
        arg1.setTransportType( arg0.getTransportType() );
        arg1.setCommand( arg0.getCommand() );
        arg1.setArguments( arg0.getArguments() );
        arg1.setDescription( arg0.getDescription() );
        arg1.setEnv( arg0.getEnv() );
        arg1.setStatus( arg0.getStatus() );

        return arg1;
    }
}
