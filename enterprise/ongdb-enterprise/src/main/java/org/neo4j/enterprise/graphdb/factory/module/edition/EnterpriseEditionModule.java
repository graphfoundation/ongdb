/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.enterprise.graphdb.factory.module.edition;

import java.time.Duration;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.neo4j.bolt.txtracking.DefaultReconciledTransactionTracker;
import org.neo4j.bolt.txtracking.ReconciledTransactionTracker;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.cypher.internal.javacompat.EnterpriseCypherEngineProvider;
import org.neo4j.dbms.GraphDbStartAborter;
import org.neo4j.dbms.EnterpriseDefaultSystemGraphInitializer;
import org.neo4j.dbms.EnterpriseSystemGraphDbmsModel;
import org.neo4j.dbms.StandaloneDbmsReconcilerModule;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.EnterpriseMultiDatabaseManager;
import org.neo4j.dbms.database.MultiDatabaseManager;
import org.neo4j.dbms.database.StandaloneDatabaseContext;
import org.neo4j.dbms.database.SystemGraphInitializer;
import org.neo4j.exceptions.KernelException;
import org.neo4j.function.Predicates;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.CommunityEditionModule;
import org.neo4j.kernel.api.Kernel;
import org.neo4j.kernel.api.net.NetworkConnectionTracker;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.api.security.provider.SecurityProvider;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.DatabaseStartupController;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.enterprise.api.security.provider.EnterpriseNoAuthSecurityProvider;
import org.neo4j.kernel.enterprise.builtinprocs.EnterpriseBuiltInDbmsProcedures;
import org.neo4j.kernel.enterprise.builtinprocs.EnterpriseBuiltInProcedures;
import org.neo4j.kernel.enterprise.builtinprocs.dbms.DbmsSettingsWhitelist;
import org.neo4j.kernel.impl.constraints.ConstraintSemantics;
import org.neo4j.kernel.impl.enterprise.EnterpriseConstraintSemantics;
import org.neo4j.kernel.impl.enterprise.transaction.log.checkpoint.ConfigurableIOLimiter;
import org.neo4j.kernel.impl.factory.StatementLocksFactorySelector;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.kernel.impl.locking.StatementLocksFactory;
import org.neo4j.kernel.impl.net.DefaultNetworkConnectionTracker;
import org.neo4j.kernel.impl.query.QueryEngineProvider;
import org.neo4j.logging.internal.LogService;
import org.neo4j.server.security.enterprise.EnterpriseSecurityModule;
import org.neo4j.token.DelegatingTokenHolder;
import org.neo4j.token.TokenHolders;

// Fabric

//import org.neo4j.cypher.internal.javacompat.EnterpriseCypherEngineProvider;

/**
 * This implementation of {@link EnterpriseAbstractEditionModule} creates the implementations of services that are specific to the Enterprise edition, without
 * HA
 */
public class EnterpriseEditionModule extends CommunityEditionModule implements EnterpriseAbstractEditionModule
{
    private final ReconciledTransactionTracker reconciledTxTracker;
    //private final FabricDatabaseManager fabricDatabaseManager;
    //private final FabricServicesBootstrap fabricServicesBootstrap;
    private GraphDbStartAborter graphDbStartAborter;

    public EnterpriseEditionModule( GlobalModule globalModule )
    {
        this( globalModule, globalModule.getGlobalDependencies() );
    }

    protected EnterpriseEditionModule( GlobalModule globalModule, Dependencies dependencies )
    {
        super( globalModule );
        this.registerDependencies( globalModule );
        this.ioLimiter = new ConfigurableIOLimiter( globalModule.getGlobalConfig() );
        this.reconciledTxTracker = new DefaultReconciledTransactionTracker( globalModule.getLogService() );
        //this.fabricServicesBootstrap = new FabricServicesBootstrap( globalModule.getGlobalLife(), dependencies, globalModule.getLogService() );
        //this.fabricDatabaseManager = (FabricDatabaseManager) dependencies.resolveDependency( FabricDatabaseManager.class );
        DbmsSettingsWhitelist dbmsSettingsWhiteList = new DbmsSettingsWhitelist( globalModule.getGlobalConfig() );
        dependencies.satisfyDependency( dbmsSettingsWhiteList );
    }

    public QueryEngineProvider getQueryEngineProvider()
    {
        return new EnterpriseCypherEngineProvider();
    }

    public void registerEditionSpecificProcedures( GlobalProcedures globalProcedures, DatabaseManager<?> databaseManager ) throws KernelException
    {
        super.registerEditionSpecificProcedures( globalProcedures, databaseManager );
        globalProcedures.registerProcedure( EnterpriseBuiltInDbmsProcedures.class, true );
        globalProcedures.registerProcedure( EnterpriseBuiltInProcedures.class, true );
        //this.fabricServicesBootstrap.registerProcedures( globalProcedures );
    }

    protected Predicate<String> fileWatcherFileNameFilter()
    {
        return Predicates.any( new Predicate[]{( fileName ) ->
                                               {
                                                   return ((String) fileName).startsWith( "neostore.transaction.db" );
                                               }, ( fileName2 ) ->
                                               {
                                                   return ((String) fileName2).endsWith( ".cacheprof" );
                                               }} );
    }

    protected ConstraintSemantics createSchemaRuleVerifier()
    {
        return new EnterpriseConstraintSemantics();
    }

    protected NetworkConnectionTracker createConnectionTracker()
    {
        return new DefaultNetworkConnectionTracker();
    }

    protected StatementLocksFactory createStatementLocksFactory( Locks locks, Config config, LogService logService )
    {
        return (new StatementLocksFactorySelector( locks, config, logService )).select();
    }

    protected Function<NamedDatabaseId,TokenHolders> createTokenHolderProvider( GlobalModule platform )
    {
        Config globalConfig = platform.getGlobalConfig();
        return ( databaseId ) ->
        {
            DatabaseManager<?> databaseManager = (DatabaseManager) platform.getGlobalDependencies().resolveDependency( DatabaseManager.class );
            Supplier<Kernel> kernelSupplier = () ->
            {
                DatabaseContext databaseContext = (DatabaseContext) databaseManager.getDatabaseContext( databaseId ).orElseThrow( () ->
                                                                                                                                  {
                                                                                                                                      return new IllegalStateException(
                                                                                                                                              String.format(
                                                                                                                                                      "Database %s not found.",
                                                                                                                                                      databaseId
                                                                                                                                                              .name() ) );
                                                                                                                                  } );
                return (Kernel) databaseContext.dependencies().resolveDependency( Kernel.class );
            };
            return new TokenHolders( new DelegatingTokenHolder( createPropertyKeyCreator( globalConfig, databaseId, kernelSupplier ), "PropertyKey" ),
                                     new DelegatingTokenHolder( createLabelIdCreator( globalConfig, databaseId, kernelSupplier ), "Label" ),
                                     new DelegatingTokenHolder( createRelationshipTypeCreator( globalConfig, databaseId, kernelSupplier ),
                                                                "RelationshipType" ) );
        };
    }

    public DatabaseManager<?> createDatabaseManager( GlobalModule globalModule )
    {
        EnterpriseMultiDatabaseManager databaseManager = new EnterpriseMultiDatabaseManager( globalModule, this );
        this.createDatabaseManagerDependentModules( databaseManager );
        globalModule.getGlobalLife().add( databaseManager );
        globalModule.getGlobalDependencies().satisfyDependency( databaseManager );
        Supplier<GraphDatabaseService> systemDbSupplier = () ->
        {
            return ((StandaloneDatabaseContext) databaseManager.getDatabaseContext(
                    DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID ).orElseThrow()).databaseFacade();
        };
        EnterpriseSystemGraphDbmsModel dbmsModel = new EnterpriseSystemGraphDbmsModel( systemDbSupplier );
        StandaloneDbmsReconcilerModule reconcilerModule =
                new StandaloneDbmsReconcilerModule( globalModule, databaseManager, this.reconciledTxTracker, dbmsModel );
        this.databaseStateService = reconcilerModule.getGraphDbStateReconciler();
        this.graphDbStartAborter =
                new GraphDbStartAborter( globalModule.getGlobalAvailabilityGuard(), dbmsModel, globalModule.getGlobalClock(), Duration.ofSeconds( 5L ) );
        globalModule.getGlobalLife().add( reconcilerModule );
        globalModule.getGlobalDependencies().satisfyDependency( this.reconciledTxTracker );
        return databaseManager;
    }

    private void createDatabaseManagerDependentModules( MultiDatabaseManager<StandaloneDatabaseContext> databaseManager )
    {
        this.initBackupIfNeeded( this.globalModule, this.globalModule.getGlobalConfig(), databaseManager );
    }

    public SystemGraphInitializer createSystemGraphInitializer( GlobalModule globalModule, DatabaseManager<?> databaseManager )
    {
        SystemGraphInitializer initializer =
                (SystemGraphInitializer) tryResolveOrCreate( EnterpriseDefaultSystemGraphInitializer.class, globalModule.getExternalDependencyResolver(), () ->
                {
                    return new EnterpriseDefaultSystemGraphInitializer( databaseManager, globalModule.getGlobalConfig() );
                } );
        /*SystemGraphInitializer initializer =
                (SystemGraphInitializer) tryResolveOrCreate( SystemGraphInitializer.class, globalModule.getExternalDependencyResolver(), () -> {
                    return new FabricSystemGraphInitializer( databaseManager, globalModule.getGlobalConfig(), this.fabricDatabaseManager );
                } );

         */
        return (SystemGraphInitializer) globalModule.getGlobalDependencies().satisfyDependency(
                (SystemGraphInitializer) globalModule.getGlobalLife().add( initializer ) );
    }

    public void createSecurityModule( GlobalModule globalModule )
    {
        Object securityProvider;
        if ( (Boolean) globalModule.getGlobalConfig().get( GraphDatabaseSettings.auth_enabled ) )
        {
            EnterpriseSecurityModule securityModule =
                    new EnterpriseSecurityModule( globalModule.getLogService().getUserLogProvider(), globalModule.getGlobalConfig(), this.globalProcedures,
                                                  globalModule.getJobScheduler(), globalModule.getFileSystem(), globalModule.getGlobalDependencies(),
                                                  globalModule.getTransactionEventListeners() );
            securityModule.setup();
            globalModule.getGlobalLife().add( securityModule );
            securityProvider = securityModule;
        }
        else
        {
            securityProvider = EnterpriseNoAuthSecurityProvider.INSTANCE;
        }

        this.setSecurityProvider( (SecurityProvider) securityProvider );
    }

    /*
    protected BaseRoutingProcedureInstaller createRoutingProcedureInstaller( GlobalModule globalModule, DatabaseManager<?> databaseManager )
    {
        ConnectorPortRegister portRegister = globalModule.getConnectorPortRegister();
        Config config = globalModule.getGlobalConfig();
        LogProvider logProvider = globalModule.getLogService().getInternalLogProvider();
        FabricConfig fabricConfig = (FabricConfig) globalModule.getGlobalDependencies().resolveDependency( FabricConfig.class );
        return new FabricRoutingProcedureInstaller( databaseManager, portRegister, config, this.fabricDatabaseManager, fabricConfig, logProvider );
    }

     */

    
    /*
    public AuthManager getBoltAuthManager( DependencyResolver dependencyResolver )
    {
        AuthManager authManager = super.getBoltAuthManager( dependencyResolver );
        FabricConfig fabricConfig = dependencyResolver.resolveDependency( FabricConfig.class );
        if ( !fabricConfig.isEnabled() )
        {
            return authManager;
        }
        else if ( !(authManager instanceof EnterpriseAuthManager) )
        {
            throw new IllegalStateException( "Unexpected type of Auth manager: " + authManager.getClass() );
        }
        else
        {
            return new FabricAuthManagerWrapper( (EnterpriseAuthManager) authManager );
        }
    }*/

    public DatabaseStartupController getDatabaseStartupController()
    {
        return this.graphDbStartAborter;
    }

    /*
    public BoltGraphDatabaseManagementServiceSPI createBoltDatabaseManagementServiceProvider( Dependencies dependencies,
            DatabaseManagementService managementService, Monitors monitors, SystemNanoClock clock, LogService logService )
    {
        FabricConfig config = (FabricConfig) dependencies.resolveDependency( FabricConfig.class );
        final BoltGraphDatabaseManagementServiceSPI kernelDatabaseManagementService =
                super.createBoltDatabaseManagementServiceProvider( dependencies, managementService, monitors, clock, logService );
        if ( !config.isEnabled() )
        {
            return kernelDatabaseManagementService;
        }
        else
        {
            FabricExecutor fabricExecutor = (FabricExecutor) dependencies.resolveDependency( FabricExecutor.class );
            TransactionManager transactionManager = (TransactionManager) dependencies.resolveDependency( TransactionManager.class );
            final FabricDatabaseManager fabricDatabaseManager = (FabricDatabaseManager) dependencies.resolveDependency( FabricDatabaseManager.class );
            Config serverConfig = (Config) dependencies.resolveDependency( Config.class );
            Duration bookmarkTimeout = (Duration) serverConfig.get( GraphDatabaseSettings.bookmark_ready_timeout );
            SimpleReconciledTransactionTracker reconciledTxTracker = new SimpleReconciledTransactionTracker( managementService, logService );
            TransactionIdTracker transactionIdTracker = new TransactionIdTracker( managementService, reconciledTxTracker, monitors, clock );
            final BoltFabricDatabaseManagementService fabricDatabaseManagementService =
                    new BoltFabricDatabaseManagementService( fabricExecutor, config, transactionManager, fabricDatabaseManager, bookmarkTimeout,
                            transactionIdTracker );
            return new BoltGraphDatabaseManagementServiceSPI()
            {
                public BoltGraphDatabaseServiceSPI db( String databaseName ) throws UnavailableException, DatabaseNotFoundException
                {
                    return fabricDatabaseManager.isFabricDatabase( databaseName ) ? fabricDatabaseManagementService.db( databaseName )
                                                                                  : kernelDatabaseManagementService.db( databaseName );
                }

                public Optional<CustomBookmarkFormatParser> getCustomBookmarkFormatParser()
                {
                    return fabricDatabaseManagementService.getCustomBookmarkFormatParser();
                }
            };
        }
    }

     */

    /**
     * @param globalModule
     * @param config
     * @param databaseManager
     */
    private void initBackupIfNeeded( GlobalModule globalModule, Config config, DatabaseManager<StandaloneDatabaseContext> databaseManager )
    {
        // TODO: Implement
    }
}
