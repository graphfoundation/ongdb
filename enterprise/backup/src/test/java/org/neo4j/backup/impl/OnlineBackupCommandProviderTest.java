/*
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) with the
 * Commons Clause, as found in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * Neo4j object code can be licensed independently from the source
 * under separate terms from the AGPL. Inquiries can be directed to:
 * licensing@neo4j.com
 *
 * More information is also available at:
 * https://neo4j.com/licensing/
 */
package org.neo4j.backup.impl;

import org.junit.Test;

import org.neo4j.causalclustering.handlers.PipelineWrapper;
import org.neo4j.causalclustering.handlers.SecureClientPipelineWrapper;
import org.neo4j.commandline.admin.RealOutsideWorld;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.monitoring.Monitors;
import org.neo4j.logging.AssertableLogProvider;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.neo4j.backup.impl.BackupSupportingClassesFactoryProvider.getProvidersByPriority;
public class OnlineBackupCommandProviderTest
{
    @Test
    public void communityBackupSupportingFactory()
    {
        AssertableLogProvider logProvider = new AssertableLogProvider();

        //OutsideWorld outsideWorld = mock( OutsideWorld.class );

        RealOutsideWorld outsideWorld = new RealOutsideWorld();
        FileSystemAbstraction fileSystemMock = mock( FileSystemAbstraction.class );

        //outsideWorld.fileSystemAbstraction = fileSystemMock;
        Monitors monitors = mock( Monitors.class );

        BackupModule backupModule = new BackupModule( outsideWorld, logProvider, monitors );

        // when( backupModule.getOutsideWorld() ).thenReturn( outsideWorld );

        BackupSupportingClassesFactoryProvider provider = getProvidersByPriority().findFirst().get();

        BackupSupportingClassesFactory factory = provider.getFactory( backupModule );

        /*
        SecurePipelineWrapperFactory pipelineWrapperFactory = new SecurePipelineWrapperFactory();
        SslPolicyLoader sslPolicyLoader;
        // and
        Config config = Config.defaults();
        config.augment( CausalClusteringSettings.ssl_policy, "default" );

        // We want to create dependencies the same way factory.createPipelineWrapper does so.s
        Dependencies dependencies = new Dependencies(  );
        dependencies.satisfyDependencies(new Object[]{SslPolicyLoader.create(config, logProvider)});

        assertEquals( pipelineWrapperFactory.forClient(config, dependencies, logProvider, CausalClusteringSettings.ssl_policy),
                factory.createPipelineWrapper( Config.defaults() ) );
        */

        assertEquals( SecureClientPipelineWrapper.class, factory.createPipelineWrapper( Config.defaults() ).getClass() );
    }

    /**
     * This class must be public and static because it must be service loadable.
     */
    public static class DummyProvider extends BackupSupportingClassesFactoryProvider
    {
        @Override
        public BackupSupportingClassesFactory getFactory( BackupModule backupModule )
        {
            return new BackupSupportingClassesFactory( backupModule )
            {
                @Override
                protected PipelineWrapper createPipelineWrapper( Config config )
                {
                    throw new AssertionError( "This provider should never be loaded" );
                }
            };
        }

        @Override
        protected int getPriority()
        {
            return super.getPriority() - 1;
        }
    }
}
