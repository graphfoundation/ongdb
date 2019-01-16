/*
 * Copyright (c) 2019 "GraphFoundation" [https://graphfoundation.org]
 *
 * The included source code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html)
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 */

package org.neo4j.causalclustering.readreplica;

import org.neo4j.causalclustering.core.CausalClusteringSettings;
import org.neo4j.causalclustering.discovery.DiscoveryServiceFactory;
import org.neo4j.causalclustering.discovery.SecureHazelcastDiscoveryServiceFactory;
import org.neo4j.causalclustering.handlers.DuplexPipelineWrapperFactory;
import org.neo4j.causalclustering.handlers.SecurePipelineWrapperFactory;
import org.neo4j.causalclustering.identity.MemberId;
import org.neo4j.graphdb.factory.module.PlatformModule;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.configuration.ssl.SslPolicyLoader;
import org.neo4j.kernel.impl.util.Dependencies;
import org.neo4j.logging.LogProvider;
import org.neo4j.ssl.SslPolicy;

/**
 *
 */
public class OpenEnterpriseReadReplicaEditionModule extends EnterpriseReadReplicaEditionModule
{

    /**
     * @param platformModule
     * @param discoveryServiceFactory
     * @param myself
     */
    OpenEnterpriseReadReplicaEditionModule( PlatformModule platformModule, DiscoveryServiceFactory discoveryServiceFactory, MemberId myself )
    {
        super( platformModule, discoveryServiceFactory, myself );
    }

    /**
     * @param discoveryServiceFactory
     * @param dependencies
     * @param config
     * @param logProvider
     */
    protected void configureDiscoveryService( DiscoveryServiceFactory discoveryServiceFactory, Dependencies dependencies, Config config,
            LogProvider logProvider )
    {
        SslPolicyLoader sslPolicyFactory = (SslPolicyLoader) dependencies.satisfyDependency( SslPolicyLoader.create( config, logProvider ) );
        SslPolicy clusterSslPolicy = sslPolicyFactory.getPolicy( (String) config.get( CausalClusteringSettings.ssl_policy ) );
        if ( discoveryServiceFactory instanceof SecureHazelcastDiscoveryServiceFactory )
        {
            ((SecureHazelcastDiscoveryServiceFactory) discoveryServiceFactory).setSslPolicy( clusterSslPolicy );
        }
    }

    /**
     * We need to override this method because the parent class returns a VoidPipelineWrapperFactory.
     *
     * @return SecurePipelineWrapperFactory
     */
    protected DuplexPipelineWrapperFactory pipelineWrapperFactory()
    {
        return new SecurePipelineWrapperFactory();
    }
}
