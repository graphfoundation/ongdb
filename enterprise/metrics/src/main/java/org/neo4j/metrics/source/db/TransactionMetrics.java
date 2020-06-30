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
package org.neo4j.metrics.source.db;

import com.codahale.metrics.MetricRegistry;

import java.util.function.Supplier;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.kernel.impl.transaction.stats.TransactionCounters;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.metrics.meter.MeterCounter;
import org.neo4j.storageengine.api.TransactionIdStore;

@Documented( ".Database transaction metrics" )
public class TransactionMetrics extends LifecycleAdapter
{
    private static final String TRANSACTION_PREFIX = "transaction";
    @Documented( "The total number of started transactions." )
    private static final String TX_STARTED_TEMPLATE = MetricRegistry.name( "transaction", "started" );
    @Documented( "The highest peak of concurrent transactions." )
    private static final String TX_PEAK_CONCURRENT_TEMPLATE = MetricRegistry.name( "transaction", "peak_concurrent" );
    @Documented( "The number of currently active transactions." )
    private static final String TX_ACTIVE_TEMPLATE = MetricRegistry.name( "transaction", "active" );
    @Documented( "The number of currently active read transactions." )
    private static final String READ_TX_ACTIVE_TEMPLATE = MetricRegistry.name( "transaction", "active_read" );
    @Documented( "The number of currently active write transactions." )
    private static final String WRITE_TX_ACTIVE_TEMPLATE = MetricRegistry.name( "transaction", "active_write" );
    @Documented( "The total number of committed transactions." )
    private static final String TX_COMMITTED_TEMPLATE = MetricRegistry.name( "transaction", "committed" );
    @Documented( "The total number of committed read transactions." )
    private static final String READ_TX_COMMITTED_TEMPLATE = MetricRegistry.name( "transaction", "committed_read" );
    @Documented( "The total number of committed write transactions." )
    private static final String WRITE_TX_COMMITTED_TEMPLATE = MetricRegistry.name( "transaction", "committed_write" );
    @Documented( "The total number of rolled back transactions." )
    private static final String TX_ROLLBACKS_TEMPLATE = MetricRegistry.name( "transaction", "rollbacks" );
    @Documented( "The total number of rolled back read transactions." )
    private static final String READ_TX_ROLLBACKS_TEMPLATE = MetricRegistry.name( "transaction", "rollbacks_read" );
    @Documented( "The total number of rolled back write transactions." )
    private static final String WRITE_TX_ROLLBACKS_TEMPLATE = MetricRegistry.name( "transaction", "rollbacks_write" );
    @Documented( "The total number of terminated transactions." )
    private static final String TX_TERMINATED_TEMPLATE = MetricRegistry.name( "transaction", "terminated" );
    @Documented( "The total number of terminated read transactions." )
    private static final String READ_TX_TERMINATED_TEMPLATE = MetricRegistry.name( "transaction", "terminated_read" );
    @Documented( "The total number of terminated write transactions." )
    private static final String WRITE_TX_TERMINATED_TEMPLATE = MetricRegistry.name( "transaction", "terminated_write" );
    @Documented( "The ID of the last committed transaction." )
    private static final String LAST_COMMITTED_TX_ID_TEMPLATE = MetricRegistry.name( "transaction", "last_committed_tx_id" );
    @Documented( "The ID of the last closed transaction." )
    private static final String LAST_CLOSED_TX_ID_TEMPLATE = MetricRegistry.name( "transaction", "last_closed_tx_id" );
    private final String txStarted;
    private final String txPeakConcurrent;
    private final String txActive;
    private final String readTxActive;
    private final String writeTxActive;
    private final String txCommitted;
    private final String readTxCommitted;
    private final String writeTxCommitted;
    private final String txRollbacks;
    private final String readTxRollbacks;
    private final String writeTxRollbacks;
    private final String txTerminated;
    private final String readTxTerminated;
    private final String writeTxTerminated;
    private final String lastCommittedTxId;
    private final String lastClosedTxId;
    private final MetricRegistry registry;
    private final TransactionCounters transactionCounters;
    private final Supplier<TransactionIdStore> transactionIdStoreSupplier;

    public TransactionMetrics( String metricsPrefix, MetricRegistry registry, Supplier<TransactionIdStore> transactionIdStoreSupplier,
                               TransactionCounters transactionCounters )
    {
        this.txStarted = MetricRegistry.name( metricsPrefix, TX_STARTED_TEMPLATE );
        this.txPeakConcurrent = MetricRegistry.name( metricsPrefix, TX_PEAK_CONCURRENT_TEMPLATE );
        this.txActive = MetricRegistry.name( metricsPrefix, TX_ACTIVE_TEMPLATE );
        this.readTxActive = MetricRegistry.name( metricsPrefix, READ_TX_ACTIVE_TEMPLATE );
        this.writeTxActive = MetricRegistry.name( metricsPrefix, WRITE_TX_ACTIVE_TEMPLATE );
        this.txCommitted = MetricRegistry.name( metricsPrefix, TX_COMMITTED_TEMPLATE );
        this.readTxCommitted = MetricRegistry.name( metricsPrefix, READ_TX_COMMITTED_TEMPLATE );
        this.writeTxCommitted = MetricRegistry.name( metricsPrefix, WRITE_TX_COMMITTED_TEMPLATE );
        this.txRollbacks = MetricRegistry.name( metricsPrefix, TX_ROLLBACKS_TEMPLATE );
        this.readTxRollbacks = MetricRegistry.name( metricsPrefix, READ_TX_ROLLBACKS_TEMPLATE );
        this.writeTxRollbacks = MetricRegistry.name( metricsPrefix, WRITE_TX_ROLLBACKS_TEMPLATE );
        this.txTerminated = MetricRegistry.name( metricsPrefix, TX_TERMINATED_TEMPLATE );
        this.readTxTerminated = MetricRegistry.name( metricsPrefix, READ_TX_TERMINATED_TEMPLATE );
        this.writeTxTerminated = MetricRegistry.name( metricsPrefix, WRITE_TX_TERMINATED_TEMPLATE );
        this.lastCommittedTxId = MetricRegistry.name( metricsPrefix, LAST_COMMITTED_TX_ID_TEMPLATE );
        this.lastClosedTxId = MetricRegistry.name( metricsPrefix, LAST_CLOSED_TX_ID_TEMPLATE );
        this.registry = registry;
        this.transactionIdStoreSupplier = transactionIdStoreSupplier;
        this.transactionCounters = transactionCounters;
    }

    @Override
    public void start()
    {
        registry.register( txStarted, new MeterCounter( transactionCounters::getNumberOfStartedTransactions ) );
        registry.register( txPeakConcurrent,
                           new MeterCounter( transactionCounters::getPeakConcurrentNumberOfTransactions ) );

        registry.register( txActive, new MeterCounter( transactionCounters::getNumberOfActiveTransactions ) );
        registry.register( readTxActive, new MeterCounter( transactionCounters::getNumberOfActiveReadTransactions ) );
        registry.register( writeTxActive, new MeterCounter( transactionCounters::getNumberOfActiveWriteTransactions ) );

        registry.register( txCommitted, new MeterCounter( transactionCounters::getNumberOfCommittedTransactions ) );
        registry.register( readTxCommitted, new MeterCounter( transactionCounters::getNumberOfCommittedReadTransactions ) );
        registry.register( writeTxCommitted,
                           new MeterCounter( transactionCounters::getNumberOfCommittedWriteTransactions ) );

        registry.register( txRollbacks, new MeterCounter( transactionCounters::getNumberOfRolledBackTransactions ) );
        registry.register( readTxRollbacks,
                           new MeterCounter( transactionCounters::getNumberOfRolledBackReadTransactions ) );
        registry.register( writeTxRollbacks,
                           new MeterCounter( transactionCounters::getNumberOfRolledBackWriteTransactions ) );

        registry.register( txTerminated, new MeterCounter( transactionCounters::getNumberOfTerminatedTransactions ) );
        registry.register( readTxTerminated,
                           new MeterCounter( transactionCounters::getNumberOfTerminatedReadTransactions ) );
        registry.register( writeTxTerminated,
                           new MeterCounter( transactionCounters::getNumberOfTerminatedWriteTransactions ) );

        registry.register( lastCommittedTxId, new MeterCounter( () ->
                                                                        transactionIdStoreSupplier.get().getLastCommittedTransactionId() ) );
        registry.register( lastClosedTxId, new MeterCounter( () ->
                                                                     transactionIdStoreSupplier.get().getLastClosedTransactionId() ) );
    }

    @Override
    public void stop()
    {
        this.registry.remove( this.txStarted );
        this.registry.remove( this.txPeakConcurrent );
        this.registry.remove( this.txActive );
        this.registry.remove( this.readTxActive );
        this.registry.remove( this.writeTxActive );
        this.registry.remove( this.txCommitted );
        this.registry.remove( this.readTxCommitted );
        this.registry.remove( this.writeTxCommitted );
        this.registry.remove( this.txRollbacks );
        this.registry.remove( this.readTxRollbacks );
        this.registry.remove( this.writeTxRollbacks );
        this.registry.remove( this.txTerminated );
        this.registry.remove( this.readTxTerminated );
        this.registry.remove( this.writeTxTerminated );
        this.registry.remove( this.lastCommittedTxId );
        this.registry.remove( this.lastClosedTxId );
    }
}
