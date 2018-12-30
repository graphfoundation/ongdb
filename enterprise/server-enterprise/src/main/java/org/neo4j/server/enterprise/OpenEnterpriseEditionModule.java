package org.neo4j.server.enterprise;

import org.neo4j.graphdb.factory.module.PlatformModule;
import org.neo4j.kernel.impl.enterprise.EnterpriseEditionModule;

public class OpenEnterpriseEditionModule extends EnterpriseEditionModule
{
    public OpenEnterpriseEditionModule( PlatformModule platformModule )
    {
        super( platformModule );
    }
}
