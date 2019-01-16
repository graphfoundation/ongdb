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

package org.neo4j.backup.impl;

import org.neo4j.causalclustering.handlers.PipelineWrapper;
import org.neo4j.causalclustering.handlers.SecurePipelineWrapperFactory;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.configuration.ssl.SslPolicyLoader;
import org.neo4j.kernel.impl.enterprise.configuration.OnlineBackupSettings;
import org.neo4j.kernel.impl.util.Dependencies;

/**
 * This file allows us to create our on SecurePipelineWrapperFactory object.
 * The default BackupSupportingClassesFactory.createPipelineWrapper method returns a VoidPipelineWrapperFactory
 * We simply create a SecurePipelineWrapper
 */
public class OpenEnterpriseBackupSupportingClassesFactory extends BackupSupportingClassesFactory
{
    OpenEnterpriseBackupSupportingClassesFactory( BackupModule backupModule )
    {
        super( backupModule );
    }

    /**
     * @param config
     * @return
     */
    protected PipelineWrapper createPipelineWrapper( Config config )
    {
        SecurePipelineWrapperFactory factory = new SecurePipelineWrapperFactory();
        Dependencies deps = new Dependencies();
        deps.satisfyDependencies( new Object[]{SslPolicyLoader.create( config, this.logProvider )} );
        return factory.forClient( config, deps, this.logProvider, OnlineBackupSettings.ssl_policy );
    }
}

