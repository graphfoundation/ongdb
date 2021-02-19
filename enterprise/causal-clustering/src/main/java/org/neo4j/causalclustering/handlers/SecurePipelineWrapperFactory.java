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
package org.neo4j.causalclustering.handlers;

import org.neo4j.graphdb.config.Setting;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.configuration.ssl.SslPolicyLoader;
import org.neo4j.kernel.impl.util.Dependencies;
import org.neo4j.logging.LogProvider;
import org.neo4j.ssl.SslPolicy;

public class SecurePipelineWrapperFactory implements DuplexPipelineWrapperFactory
{
    public SecurePipelineWrapperFactory()
    {
    }

    @Override
    public PipelineWrapper forServer( Config config, Dependencies dependencies, LogProvider logProvider, Setting<String> policyName )
    {
        SslPolicy policy = this.getSslPolicy( config, dependencies, policyName );
        return new SecureServerPipelineWrapper( policy );
    }

    @Override
    public PipelineWrapper forClient( Config config, Dependencies dependencies, LogProvider logProvider, Setting<String> policyName )
    {
        SslPolicy policy = this.getSslPolicy( config, dependencies, policyName );
        return new SecureClientPipelineWrapper( policy );
    }

    private SslPolicy getSslPolicy( Config config, Dependencies dependencies, Setting<String> policyNameSetting )
    {
        SslPolicyLoader sslPolicyLoader = (SslPolicyLoader) dependencies.resolveDependency( SslPolicyLoader.class );
        String policyName = (String) config.get( policyNameSetting );
        return sslPolicyLoader.getPolicy( policyName );
    }
}

