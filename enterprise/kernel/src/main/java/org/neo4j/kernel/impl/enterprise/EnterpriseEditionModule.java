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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.impl.enterprise;

import java.util.function.Predicate;

import org.neo4j.function.Predicates;
import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.graphdb.factory.module.PlatformModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.graphdb.factory.module.edition.CommunityEditionModule;
import org.neo4j.graphdb.factory.module.id.IdContextFactory;
import org.neo4j.graphdb.factory.module.id.IdContextFactoryBuilder;
import org.neo4j.graphdb.factory.module.id.DatabaseIdContext;
import org.neo4j.internal.kernel.api.exceptions.KernelException;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.api.bolt.BoltConnectionTracker;
import org.neo4j.kernel.api.net.NetworkConnectionTracker;
import org.neo4j.kernel.api.security.SecurityModule;
import org.neo4j.kernel.enterprise.api.security.provider.EnterpriseNoAuthSecurityProvider;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.enterprise.builtinprocs.EnterpriseBuiltInDbmsProcedures;
import org.neo4j.kernel.impl.constraints.ConstraintSemantics;
import org.neo4j.kernel.impl.enterprise.id.EnterpriseIdTypeConfigurationProvider;
import org.neo4j.kernel.impl.enterprise.transaction.log.checkpoint.ConfigurableIOLimiter;
import org.neo4j.kernel.impl.factory.StatementLocksFactorySelector;
import org.neo4j.kernel.impl.index.IndexConfigStore;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.kernel.impl.locking.StatementLocksFactory;
import org.neo4j.kernel.impl.pagecache.PageCacheWarmer;
import org.neo4j.kernel.impl.proc.Procedures;
import org.neo4j.kernel.impl.store.stats.IdBasedStoreEntityCounters;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFiles;
import org.neo4j.logging.internal.LogService;

import static org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings.ENTERPRISE_SECURITY_MODULE_ID;

/**
 * This implementation of {@link AbstractEditionModule} creates the implementations of services
 * that are specific to the Enterprise edition, without HA
 */
public class EnterpriseEditionModule extends CommunityEditionModule
{
    @Override
    public void registerEditionSpecificProcedures( Procedures procedures ) throws KernelException
    {
        procedures.registerProcedure( EnterpriseBuiltInDbmsProcedures.class, true );
    }

    public EnterpriseEditionModule( PlatformModule platformModule )
    {
        super( platformModule );
        DatabaseIdContext idContext = idContextFactory.createIdContext( platformModule.config.get( GraphDatabaseSettings.active_database ) );
        platformModule.dependencies.satisfyDependency( new IdBasedStoreEntityCounters( idContext.getIdGeneratorFactory() ) );
        ioLimiter = new ConfigurableIOLimiter( platformModule.config );
        platformModule.dependencies.satisfyDependency( createConnectionTracker() );
        platformModule.dependencies.satisfyDependency( createBoltConnectionTracker() );
    }

    @Override
    protected Predicate<String> fileWatcherFileNameFilter()
    {
        return enterpriseNonClusterFileWatcherFileNameFilter();
    }

    static Predicate<String> enterpriseNonClusterFileWatcherFileNameFilter()
    {
        return Predicates.any(
                fileName -> fileName.startsWith( TransactionLogFiles.DEFAULT_NAME ),
                fileName -> fileName.startsWith( IndexConfigStore.INDEX_DB_FILE_NAME ),
                filename -> filename.endsWith( PageCacheWarmer.SUFFIX_CACHEPROF )
        );
    }

    @Override
    protected IdContextFactory createIdContextFactory( PlatformModule platformModule, FileSystemAbstraction fileSystem )
    {
        return IdContextFactoryBuilder.of( new EnterpriseIdTypeConfigurationProvider( platformModule.config ), platformModule.jobScheduler )
                                      .withFileSystem( fileSystem )
                                      .build();
    }

    @Override
    protected ConstraintSemantics createSchemaRuleVerifier()
    {
        return new EnterpriseConstraintSemantics();
    }

    @Override
    protected NetworkConnectionTracker createConnectionTracker()
    {
        return new StandardNetworkConnectionTracker();
    }

    protected BoltConnectionTracker createBoltConnectionTracker()
    {
        return new StandardBoltConnectionTracker();
    }

    @Override
    protected StatementLocksFactory createStatementLocksFactory( Locks locks, Config config, LogService logService )
    {
        return new StatementLocksFactorySelector( locks, config, logService ).select();
    }

    @Override
    public void createSecurityModule( PlatformModule platformModule, Procedures procedures )
    {
        createSecurityModule( this, platformModule, procedures );
    }

    public static void createSecurityModule( AbstractEditionModule editionModule, PlatformModule platformModule, Procedures procedures )
    {
        if ( platformModule.config.get( GraphDatabaseSettings.auth_enabled ) )
        {
            SecurityModule securityModule = setupSecurityModule( platformModule, editionModule,
                                                                 platformModule.logging.getUserLog( editionModule.getClass() ),
                                                                 procedures, ENTERPRISE_SECURITY_MODULE_ID );
            platformModule.life.add( securityModule );
            editionModule.setSecurityProvider( securityModule );
        }
        else
        {
            EnterpriseNoAuthSecurityProvider noAuthSecurityProvider = EnterpriseNoAuthSecurityProvider.INSTANCE;
            platformModule.life.add( noAuthSecurityProvider );
            editionModule.setSecurityProvider( noAuthSecurityProvider );
        }
    }
}
