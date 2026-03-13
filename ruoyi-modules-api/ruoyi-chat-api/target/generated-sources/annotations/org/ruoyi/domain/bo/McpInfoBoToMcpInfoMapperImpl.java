package org.ruoyi.domain.bo;

import javax.annotation.processing.Generated;
import org.ruoyi.domain.McpInfo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-11T12:43:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.18 (Eclipse Adoptium)"
)
@Component
public class McpInfoBoToMcpInfoMapperImpl implements McpInfoBoToMcpInfoMapper {

    @Override
    public McpInfo convert(McpInfoBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        McpInfo mcpInfo = new McpInfo();

        mcpInfo.setMcpId( arg0.getMcpId() );
        mcpInfo.setServerName( arg0.getServerName() );
        mcpInfo.setTransportType( arg0.getTransportType() );
        mcpInfo.setCommand( arg0.getCommand() );
        mcpInfo.setArguments( arg0.getArguments() );
        mcpInfo.setDescription( arg0.getDescription() );
        mcpInfo.setEnv( arg0.getEnv() );
        mcpInfo.setStatus( arg0.getStatus() );

        return mcpInfo;
    }

    @Override
    public McpInfo convert(McpInfoBo arg0, McpInfo arg1) {
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
