/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.causalclustering.core;

import org.neo4j.causalclustering.core.state.ClusterStateDirectory;
import org.neo4j.causalclustering.core.state.ClusteringModule;
import org.neo4j.causalclustering.discovery.DiscoveryServiceFactory;
import org.neo4j.causalclustering.handlers.DuplexPipelineWrapperFactory;
import org.neo4j.causalclustering.handlers.SecurePipelineWrapperFactory;
import org.neo4j.kernel.api.bolt.BoltConnectionTracker;
import org.neo4j.kernel.impl.enterprise.EnterpriseEditionModule;
import org.neo4j.kernel.impl.enterprise.StandardBoltConnectionTracker;
import org.neo4j.kernel.impl.factory.PlatformModule;
import org.neo4j.kernel.impl.proc.Procedures;
import org.neo4j.kernel.impl.util.Dependencies;

public class OpenEnterpriseCoreEditionModule extends EnterpriseCoreEditionModule
{
    OpenEnterpriseCoreEditionModule( PlatformModule platformModule, DiscoveryServiceFactory discoveryServiceFactory )
    {
        super( platformModule, discoveryServiceFactory );
    }

    protected BoltConnectionTracker createSessionTracker()
    {
        return new StandardBoltConnectionTracker();
    }

    public void setupSecurityModule( PlatformModule platformModule, Procedures procedures )
    {
        EnterpriseEditionModule.setupEnterpriseSecurityModule( platformModule, procedures );
    }

    protected ClusteringModule getClusteringModule( PlatformModule platformModule, DiscoveryServiceFactory discoveryServiceFactory,
                                                    ClusterStateDirectory clusterStateDirectory, IdentityModule identityModule, Dependencies dependencies )
    {
        return new ClusteringModule( discoveryServiceFactory, identityModule.myself(),
                                     platformModule, clusterStateDirectory.get() );
    }

    protected DuplexPipelineWrapperFactory pipelineWrapperFactory()
    {
        return new SecurePipelineWrapperFactory();
    }
}

