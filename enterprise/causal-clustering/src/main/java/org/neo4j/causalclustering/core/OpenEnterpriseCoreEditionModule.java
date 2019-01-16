/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * Modifications Copyright (c) 2018-2019 "GraphFoundation" [https://graphfoundation.org]
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

package org.neo4j.causalclustering.core;

import org.neo4j.causalclustering.core.state.ClusterStateDirectory;
import org.neo4j.causalclustering.core.state.ClusteringModule;
import org.neo4j.causalclustering.discovery.DiscoveryServiceFactory;
import org.neo4j.causalclustering.discovery.SecureHazelcastDiscoveryServiceFactory;
import org.neo4j.causalclustering.handlers.DuplexPipelineWrapperFactory;
import org.neo4j.causalclustering.handlers.SecurePipelineWrapperFactory;
import org.neo4j.graphdb.factory.module.PlatformModule;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.configuration.ssl.SslPolicyLoader;
import org.neo4j.kernel.impl.enterprise.EnterpriseEditionModule;
import org.neo4j.kernel.impl.proc.Procedures;
import org.neo4j.kernel.impl.util.Dependencies;
import org.neo4j.ssl.SslPolicy;


public class OpenEnterpriseCoreEditionModule extends EnterpriseCoreEditionModule
{
    /**
     * @param platformModule
     * @param discoveryServiceFactory
     */
    OpenEnterpriseCoreEditionModule( PlatformModule platformModule, DiscoveryServiceFactory discoveryServiceFactory )
    {
        super( platformModule, discoveryServiceFactory );

    }

    /**
     *
     * @param platformModule
     * @param procedures
     */
    public void createSecurityModule( PlatformModule platformModule, Procedures procedures )
    {
        EnterpriseEditionModule.createEnterpriseSecurityModule( this, platformModule, procedures );
    }

    /**
     *
     * @param platformModule
     * @param discoveryServiceFactory
     * @param clusterStateDirectory
     * @param identityModule
     * @param dependencies
     * @param databaseLayout
     * @return
     */
    protected ClusteringModule getClusteringModule( PlatformModule platformModule, DiscoveryServiceFactory discoveryServiceFactory,
            ClusterStateDirectory clusterStateDirectory, IdentityModule identityModule, Dependencies dependencies, DatabaseLayout databaseLayout )
    {
        SslPolicyLoader sslPolicyFactory = (SslPolicyLoader) dependencies.satisfyDependency( SslPolicyLoader.create( this.config, this.logProvider ) );
        SslPolicy sslPolicy = sslPolicyFactory.getPolicy( (String) this.config.get( CausalClusteringSettings.ssl_policy ) );
        if ( discoveryServiceFactory instanceof SecureHazelcastDiscoveryServiceFactory )
        {
            ((SecureHazelcastDiscoveryServiceFactory) discoveryServiceFactory).setSslPolicy( sslPolicy );
        }

        return new ClusteringModule( discoveryServiceFactory, identityModule.myself(), platformModule, clusterStateDirectory.get(), databaseLayout );
    }

    /**
     * @return SecurePipelineWrapperFactory
     */
    protected DuplexPipelineWrapperFactory pipelineWrapperFactory()
    {
        return new SecurePipelineWrapperFactory();
    }
}

