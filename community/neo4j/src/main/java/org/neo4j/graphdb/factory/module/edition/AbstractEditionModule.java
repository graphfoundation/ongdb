/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.graphdb.factory.module.edition;

import java.util.function.Function;
import java.util.function.Predicate;

import org.neo4j.annotations.api.IgnoreApiCheck;
import org.neo4j.bolt.dbapi.BoltGraphDatabaseManagementServiceSPI;
import org.neo4j.collection.Dependencies;
import org.neo4j.common.DependencyResolver;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseInfoService;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.DbmsRuntimeRepository;
import org.neo4j.dbms.database.DbmsRuntimeSystemGraphComponent;
import org.neo4j.dbms.database.SystemGraphComponents;
import org.neo4j.dbms.database.SystemGraphInitializer;
import org.neo4j.dbms.database.readonly.ReadOnlyDatabases;
import org.neo4j.exceptions.KernelException;
import org.neo4j.function.Predicates;
import org.neo4j.graphdb.facade.DatabaseManagementServiceFactory;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.context.EditionDatabaseComponents;
import org.neo4j.internal.collector.DataCollectorProcedures;
import org.neo4j.io.fs.watcher.DatabaseLayoutWatcher;
import org.neo4j.io.fs.watcher.FileWatcher;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.api.net.DefaultNetworkConnectionTracker;
import org.neo4j.kernel.api.net.NetworkConnectionTracker;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.kernel.api.security.provider.SecurityProvider;
import org.neo4j.kernel.database.DatabaseReferenceRepository;
import org.neo4j.kernel.database.DatabaseStartupController;
import org.neo4j.kernel.database.DefaultDatabaseResolver;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.constraints.ConstraintSemantics;
import org.neo4j.kernel.impl.factory.DbmsInfo;
import org.neo4j.kernel.impl.query.QueryEngineProvider;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFilesHelper;
import org.neo4j.kernel.impl.transaction.stats.DatabaseTransactionStats;
import org.neo4j.kernel.impl.util.watcher.DefaultFileDeletionListenerFactory;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.LogService;
import org.neo4j.monitoring.Monitors;
import org.neo4j.procedure.builtin.BuiltInDbmsProcedures;
import org.neo4j.procedure.builtin.BuiltInProcedures;
import org.neo4j.procedure.builtin.FulltextProcedures;
import org.neo4j.procedure.builtin.TokenProcedures;
import org.neo4j.procedure.builtin.routing.AbstractRoutingProcedureInstaller;
import org.neo4j.procedure.builtin.routing.ClientRoutingDomainChecker;
import org.neo4j.procedure.builtin.routing.RoutingOption;
import org.neo4j.procedure.builtin.routing.RoutingTableTTLProvider;
import org.neo4j.procedure.builtin.routing.ServerSideRoutingTableProvider;
import org.neo4j.procedure.builtin.routing.SimpleClientRoutingDomainChecker;
import org.neo4j.procedure.builtin.routing.SingleAddressRoutingTableProvider;
import org.neo4j.procedure.impl.ProcedureConfig;
import org.neo4j.server.config.AuthConfigProvider;
import org.neo4j.time.SystemNanoClock;

import static org.neo4j.io.layout.CommonDatabaseFile.LABEL_SCAN_STORE;
import static org.neo4j.io.layout.CommonDatabaseFile.RELATIONSHIP_TYPE_SCAN_STORE;
import static org.neo4j.procedure.impl.temporal.TemporalFunction.registerTemporalFunctions;

/**
 * Edition module for {@link DatabaseManagementServiceFactory}. Implementations of this class
 * need to create all the services that would be specific for a particular edition of the database.
 */
@IgnoreApiCheck
public abstract class AbstractEditionModule
{
    protected NetworkConnectionTracker connectionTracker;
    protected ConstraintSemantics constraintSemantics;
    protected Function<DatabaseLayout,DatabaseLayoutWatcher> watcherServiceFactory;
    protected SecurityProvider securityProvider;
    protected DefaultDatabaseResolver defaultDatabaseResolver;
    protected DatabaseReferenceRepository databaseReferenceRepo;

    public abstract EditionDatabaseComponents createDatabaseComponents( NamedDatabaseId namedDatabaseId );

    protected static DatabaseLayoutWatcher createDatabaseFileSystemWatcher( FileWatcher watcher, DatabaseLayout databaseLayout, LogService logging,
            Predicate<String> fileNameFilter )
    {
        DefaultFileDeletionListenerFactory listenerFactory =
                new DefaultFileDeletionListenerFactory( databaseLayout, logging, fileNameFilter );
        return new DatabaseLayoutWatcher( watcher, databaseLayout, listenerFactory );
    }

    public void registerProcedures( GlobalProcedures globalProcedures, ProcedureConfig procedureConfig, GlobalModule globalModule,
            DatabaseManager<?> databaseManager ) throws KernelException
    {
        globalProcedures.registerProcedure( BuiltInProcedures.class );
        globalProcedures.registerProcedure( TokenProcedures.class );
        globalProcedures.registerProcedure( BuiltInDbmsProcedures.class );
        globalProcedures.registerProcedure( FulltextProcedures.class );
        globalProcedures.registerProcedure( DataCollectorProcedures.class );
        registerTemporalFunctions( globalProcedures, procedureConfig );

        registerEditionSpecificProcedures( globalProcedures, databaseManager );
        AbstractRoutingProcedureInstaller routingProcedureInstaller =
                createRoutingProcedureInstaller( globalModule, databaseManager,
                                                 globalModule.getGlobalDependencies().resolveDependency( ClientRoutingDomainChecker.class ),
                                                 defaultDatabaseResolver );
        routingProcedureInstaller.install( globalProcedures );
    }

    public ClientRoutingDomainChecker createClientRoutingDomainChecker( GlobalModule globalModule )
    {
        Config config = globalModule.getGlobalConfig();
        var domainChecker = SimpleClientRoutingDomainChecker.fromConfig( config, globalModule.getLogService().getInternalLogProvider() );
        globalModule.getGlobalDependencies().satisfyDependencies( domainChecker );
        return domainChecker;
    }

    protected abstract void registerEditionSpecificProcedures( GlobalProcedures globalProcedures, DatabaseManager<?> databaseManager )
            throws KernelException;

    protected abstract AbstractRoutingProcedureInstaller createRoutingProcedureInstaller( GlobalModule globalModule,
                                                                                          DatabaseManager<?> databaseManager,
                                                                                          ClientRoutingDomainChecker clientRoutingDomainChecker,
                                                                                          DefaultDatabaseResolver defaultDatabaseResolver );

    protected abstract AuthConfigProvider createAuthConfigProvider( GlobalModule globalModule );

    public abstract <DB extends DatabaseContext> DatabaseManager<DB> createDatabaseManager( GlobalModule globalModule );

    public abstract SystemGraphInitializer createSystemGraphInitializer( GlobalModule globalModule );

    public abstract void registerSystemGraphComponents( SystemGraphComponents systemGraphComponents, GlobalModule globalModule );

    public abstract void createSecurityModule( GlobalModule globalModule );

    protected static NetworkConnectionTracker createConnectionTracker()
    {
        return new DefaultNetworkConnectionTracker();
    }

    public DatabaseTransactionStats createTransactionMonitor()
    {
        return new DatabaseTransactionStats();
    }

    public ConstraintSemantics getConstraintSemantics()
    {
        return constraintSemantics;
    }

    public Function<DatabaseLayout,DatabaseLayoutWatcher> getWatcherServiceFactory()
    {
        return watcherServiceFactory;
    }

    public NetworkConnectionTracker getConnectionTracker()
    {
        return connectionTracker;
    }

    public SecurityProvider getSecurityProvider()
    {
        return securityProvider;
    }

    public void setSecurityProvider( SecurityProvider securityProvider )
    {
        this.securityProvider = securityProvider;
    }

    public abstract void createDefaultDatabaseResolver( GlobalModule globalModule );

    public void setDefaultDatabaseResolver( DefaultDatabaseResolver defaultDatabaseResolver )
    {
        this.defaultDatabaseResolver = defaultDatabaseResolver;
    }

    public DefaultDatabaseResolver getDefaultDatabaseResolver()
    {
        return defaultDatabaseResolver;
    }

    /**
     * @return the query engine provider for this edition.
     */
    public abstract QueryEngineProvider getQueryEngineProvider();

    public abstract void bootstrapFabricServices();

    public abstract BoltGraphDatabaseManagementServiceSPI createBoltDatabaseManagementServiceProvider( Dependencies dependencies,
            DatabaseManagementService managementService, Monitors monitors, SystemNanoClock clock, LogService logService );

    public AuthManager getBoltAuthManager( DependencyResolver dependencyResolver )
    {
        return dependencyResolver.resolveDependency( AuthManager.class );
    }

    public AuthManager getBoltInClusterAuthManager()
    {
        return securityProvider.inClusterAuthManager();
    }

    public AuthManager getBoltLoopbackAuthManager()
    {
        return securityProvider.loopbackAuthManager();
    }

    public abstract DatabaseStartupController getDatabaseStartupController();

    public abstract Lifecycle createWebServer( DatabaseManagementService managementService, Dependencies globalDependencies,
            Config config, LogProvider userLogProvider, DbmsInfo dbmsInfo );

    public abstract DbmsRuntimeRepository createAndRegisterDbmsRuntimeRepository( GlobalModule globalModule, DatabaseManager<?> databaseManager,
            Dependencies dependencies, DbmsRuntimeSystemGraphComponent dbmsRuntimeSystemGraphComponent );

    protected ServerSideRoutingTableProvider serverSideRoutingTableProvider( GlobalModule globalModule )
    {
        ConnectorPortRegister portRegister = globalModule.getConnectorPortRegister();
        Config config = globalModule.getGlobalConfig();
        LogProvider logProvider = globalModule.getLogService().getInternalLogProvider();
        RoutingTableTTLProvider ttlProvider = RoutingTableTTLProvider.ttlFromConfig( config );
        return new SingleAddressRoutingTableProvider( portRegister, RoutingOption.ROUTE_WRITE_AND_READ, config, logProvider, ttlProvider );
    }

    public abstract DatabaseInfoService createDatabaseInfoService( DatabaseManager<?> databaseManager );

    public abstract ReadOnlyDatabases getReadOnlyChecker();

    protected static Predicate<String> defaultFileWatcherFilter()
    {
        return Predicates.any( TransactionLogFilesHelper.DEFAULT_FILENAME_PREDICATE, filename ->
                filename.contains( LABEL_SCAN_STORE.getName() ) || filename.contains( RELATIONSHIP_TYPE_SCAN_STORE.getName() ) );
    }
}
