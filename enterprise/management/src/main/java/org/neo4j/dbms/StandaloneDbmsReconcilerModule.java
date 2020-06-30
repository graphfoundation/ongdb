/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.dbms;

import java.util.stream.Stream;

import org.neo4j.bolt.txtracking.ReconciledTransactionTracker;
import org.neo4j.common.DependencyResolver;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.dbms.database.GraphDbOperationMonitor;
import org.neo4j.dbms.database.GraphDbOperationMonitorListener;
import org.neo4j.dbms.database.MultiDatabaseManager;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.event.TransactionData;
import org.neo4j.graphdb.event.TransactionEventListenerAdapter;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.extension.GlobalExtensions;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.kernel.lifecycle.LifecycleListener;
import org.neo4j.kernel.lifecycle.LifecycleStatus;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.TransactionIdStore;

import static org.neo4j.configuration.GraphDatabaseSettings.SYSTEM_DATABASE_NAME;

public class StandaloneDbmsReconcilerModule extends LifecycleAdapter
{
    protected final DatabaseIdRepository databaseIdRepository;
    private final GlobalModule globalModule;
    private final MultiDatabaseManager<?> databaseManager;
    private final LocalGraphDbOperator localOperator;
    private final EnterpriseSystemGraphGraphDbOperator systemOperator;
    private final GraphDbShutdownOperator graphDbShutdownOperator;
    private final ReconciledTransactionTracker reconciledTxTracker;
    private final GraphDbStateReconciler graphDbStateReconciler;

    public StandaloneDbmsReconcilerModule( GlobalModule globalModule, MultiDatabaseManager<?> databaseManager, ReconciledTransactionTracker reconciledTxTracker,
                                           EnterpriseSystemGraphDbmsModel dbmsModel )
    {
        this( globalModule, databaseManager, reconciledTxTracker, buildGraphDbStateReconciler( globalModule, databaseManager ), dbmsModel );
    }

    protected StandaloneDbmsReconcilerModule( GlobalModule globalModule, MultiDatabaseManager<?> databaseManager,
                                              ReconciledTransactionTracker reconciledTxTracker, GraphDbStateReconciler graphDbStateReconciler,
                                              EnterpriseSystemGraphDbmsModel dbmsModel )
    {
        LogProvider internalLogProvider = globalModule.getLogService().getInternalLogProvider();
        this.globalModule = globalModule;
        this.databaseManager = databaseManager;
        this.databaseIdRepository = databaseManager.databaseIdRepository();
        this.localOperator = new LocalGraphDbOperator( this.databaseIdRepository );
        this.reconciledTxTracker = reconciledTxTracker;
        this.systemOperator = new EnterpriseSystemGraphGraphDbOperator( dbmsModel, reconciledTxTracker, internalLogProvider );
        this.graphDbShutdownOperator = new GraphDbShutdownOperator( databaseManager );
        this.graphDbStateReconciler = graphDbStateReconciler;
        GraphDbOperationMonitorListener databaseCountMonitor = new GraphDbOperationMonitorListener(
                globalModule.getGlobalMonitors().newMonitor( GraphDbOperationMonitor.class,
                                                             this.getClass().getName() ) );
        graphDbStateReconciler.registerListener( databaseCountMonitor );
        globalModule.getGlobalLife().addLifecycleListener( this.createGraphDbOperationResetListener( databaseCountMonitor ) );
        globalModule.getGlobalDependencies().satisfyDependency( graphDbStateReconciler );
        globalModule.getGlobalDependencies().satisfyDependencies( localOperator, systemOperator );
    }

    /**
     * @param globalModule
     * @param databaseManager
     * @return
     */
    private static GraphDbStateReconciler buildGraphDbStateReconciler( GlobalModule globalModule, MultiDatabaseManager<?> databaseManager )
    {
        return new GraphDbStateReconciler( databaseManager, globalModule.getGlobalConfig(), globalModule.getLogService().getInternalLogProvider(),
                                           globalModule.getJobScheduler() );
    }

    @Override
    public void start() throws Exception
    {
        this.register( this.globalModule, this.systemOperator );
        GraphDbOperatorConnector connector = new GraphDbOperatorConnector( this.graphDbStateReconciler );
        this.getGraphDbOperators().forEach( ( op ) ->
                                            {
                                                op.connect( connector );
                                            } );
        this.startGraphDbs();
    }

    /**
     * @throws DatabaseManagementException
     */
    private void startGraphDbs() throws DatabaseManagementException
    {
        this.systemOperator.trigger( GraphDbReconcilerRequest.simple() ).join( DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID );
        GraphDatabaseAPI systemDatabase = this.getNamedSystemDatabase( this.databaseManager );
        long lastClosedTxId = this.getLastClosedTransactionId( systemDatabase );
        this.systemOperator.updateDesiredStates();
        this.systemOperator.trigger( GraphDbReconcilerRequest.simple() ).awaitAll();
        this.reconciledTxTracker.enable( lastClosedTxId );
    }

    private void stopGraphDbs()
    {
        this.graphDbShutdownOperator.stopAll();
    }

    @Override
    public void stop()
    {
        this.stopGraphDbs();
    }

    public GraphDbStateReconciler getGraphDbStateReconciler()
    {
        return this.graphDbStateReconciler;
    }

    protected Stream<GraphDbOperator> getGraphDbOperators()
    {
        return Stream.of( this.localOperator, this.systemOperator, this.graphDbShutdownOperator );
    }

    protected void register( GlobalModule globalModule, final EnterpriseSystemGraphGraphDbOperator systemOperator )
    {
        globalModule.getTransactionEventListeners().registerTransactionEventListener( SYSTEM_DATABASE_NAME, new TransactionEventListenerAdapter()
        {
            public void afterCommit( TransactionData txData, Object state, GraphDatabaseService systemDatabase )
            {
                systemOperator.transactionCommitted( txData.getTransactionId(), txData );
            }
        } );
    }

    /**
     * @param databaseManager
     * @return
     */
    private GraphDatabaseAPI getNamedSystemDatabase( MultiDatabaseManager<?> databaseManager )
    {
        return (databaseManager.getDatabaseContext( DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID ).orElseThrow()).databaseFacade();
    }

    /**
     * @param db
     * @return
     */
    private long getLastClosedTransactionId( GraphDatabaseAPI db )
    {
        DependencyResolver resolver = db.getDependencyResolver();
        TransactionIdStore txIdStore = (TransactionIdStore) resolver.resolveDependency( TransactionIdStore.class );
        return txIdStore.getLastClosedTransactionId();
    }

    /**
     * @param graphDbOperationMonitorListener
     * @return
     */
    private LifecycleListener createGraphDbOperationResetListener( GraphDbOperationMonitorListener graphDbOperationMonitorListener )
    {
        return ( instance, from, to ) ->
        {
            if ( instance instanceof GlobalExtensions && to.equals( LifecycleStatus.STARTED ) )
            {
                graphDbOperationMonitorListener.reset( this.graphDbStateReconciler.getStatesSnapshot() );
            }
        };
    }
}
