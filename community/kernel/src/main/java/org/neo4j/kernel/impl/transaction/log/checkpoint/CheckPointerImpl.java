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
package org.neo4j.kernel.impl.transaction.log.checkpoint;

import java.io.IOException;
import java.time.Clock;
import java.util.function.BooleanSupplier;

import org.neo4j.graphdb.Resource;
import org.neo4j.io.pagecache.IOController;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.context.VersionContextSupplier;
import org.neo4j.kernel.database.DatabaseTracers;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.pruning.LogPruning;
import org.neo4j.kernel.impl.transaction.tracing.LogCheckPointEvent;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Health;
import org.neo4j.storageengine.api.MetadataProvider;
import org.neo4j.time.Stopwatch;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.neo4j.internal.helpers.Format.duration;

public class CheckPointerImpl extends LifecycleAdapter implements CheckPointer
{
    private static final String CHECKPOINT_TAG = "checkpoint";
    private static final long NO_TRANSACTION_ID = -1;

    private final CheckpointAppender checkpointAppender;
    private final MetadataProvider metadataProvider;
    private final CheckPointThreshold threshold;
    private final ForceOperation forceOperation;
    private final LogPruning logPruning;
    private final Health databaseHealth;
    private final IOController ioController;
    private final Log msgLog;
    private final DatabaseTracers tracers;
    private final StoreCopyCheckPointMutex mutex;
    private final VersionContextSupplier versionContextSupplier;
    private final Clock clock;

    private volatile long lastCheckPointedTx;

    public CheckPointerImpl(
            MetadataProvider metadataProvider,
            CheckPointThreshold threshold,
            ForceOperation forceOperation,
            LogPruning logPruning,
            CheckpointAppender checkpointAppender,
            Health databaseHealth,
            LogProvider logProvider,
            DatabaseTracers tracers,
            IOController ioController,
            StoreCopyCheckPointMutex mutex,
            VersionContextSupplier versionContextSupplier,
            Clock clock )
    {
        this.checkpointAppender = checkpointAppender;
        this.metadataProvider = metadataProvider;
        this.threshold = threshold;
        this.forceOperation = forceOperation;
        this.logPruning = logPruning;
        this.databaseHealth = databaseHealth;
        this.ioController = ioController;
        this.msgLog = logProvider.getLog( CheckPointerImpl.class );
        this.tracers = tracers;
        this.mutex = mutex;
        this.versionContextSupplier = versionContextSupplier;
        this.clock = clock;
    }

    @Override
    public void start()
    {
        var lastClosedTransaction = metadataProvider.getLastClosedTransaction();
        threshold.initialize( lastClosedTransaction.getTransactionId(), lastClosedTransaction.getLogPosition() );
    }

    @Override
    public long forceCheckPoint( TriggerInfo info ) throws IOException
    {
        ioController.disable();
        try ( Resource lock = mutex.checkPoint() )
        {
            return doCheckPoint( info );
        }
        finally
        {
            ioController.enable();
        }
    }

    @Override
    public long tryCheckPoint( TriggerInfo info ) throws IOException
    {
        return tryCheckPoint( info, () -> false );
    }

    @Override
    public long tryCheckPointNoWait( TriggerInfo info ) throws IOException
    {
        return tryCheckPoint( info, () -> true );
    }

    @Override
    public long tryCheckPoint( TriggerInfo info, BooleanSupplier timeout ) throws IOException
    {
        ioController.disable();
        try
        {
            Resource lockAttempt = mutex.tryCheckPoint();
            if ( lockAttempt != null )
            {
                try ( Resource lock = lockAttempt )
                {
                    return doCheckPoint( info );
                }
            }
            else
            {
                try ( Resource lock = mutex.tryCheckPoint( timeout ) )
                {
                    if ( lock != null )
                    {
                        msgLog.info( info.describe( lastCheckPointedTx ) +
                                " Check pointing was already running, completed now" );
                        return lastCheckPointedTx;
                    }
                    else
                    {
                        return NO_TRANSACTION_ID;
                    }
                }
            }
        }
        finally
        {
            ioController.enable();
        }
    }

    @Override
    public long checkPointIfNeeded( TriggerInfo info ) throws IOException
    {
        var lastClosedTransaction = metadataProvider.getLastClosedTransaction();
        if ( threshold.isCheckPointingNeeded( lastClosedTransaction.getTransactionId(), lastClosedTransaction.getLogPosition(), info ) )
        {
            try ( Resource lock = mutex.checkPoint() )
            {
                return doCheckPoint( info );
            }
        }
        return NO_TRANSACTION_ID;
    }

    private long doCheckPoint( TriggerInfo triggerInfo ) throws IOException
    {
        var databaseTracer = tracers.getDatabaseTracer();
        var pageCacheTracer = tracers.getPageCacheTracer();
        var versionContext = versionContextSupplier.createVersionContext();
        try ( var cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( CHECKPOINT_TAG ), versionContext );
              LogCheckPointEvent event = databaseTracer.beginCheckPoint() )
        {
            var lastClosedTxData = metadataProvider.getLastClosedTransaction();
            long lastClosedTransactionId = lastClosedTxData.getTransactionId();
            versionContext.initWrite( lastClosedTransactionId );
            LogPosition logPosition = lastClosedTxData.getLogPosition();
            String checkpointReason = triggerInfo.describe( lastClosedTransactionId );
            /*
             * Check kernel health before going into waiting for transactions to be closed, to avoid
             * getting into a scenario where we would await a condition that would potentially never
             * happen.
             */
            databaseHealth.assertHealthy( IOException.class );
            /*
             * First we flush the store. If we fail now or during the flush, on recovery we'll find the
             * earlier check point and replay from there all the log entries. Everything will be ok.
             */
            msgLog.info( checkpointReason + " checkpoint started..." );
            Stopwatch startTime = Stopwatch.start();
            forceOperation.flushAndForce( cursorContext );
            /*
             * Check kernel health before going to write the next check point.  In case of a panic this check point
             * will be aborted, which is the safest alternative so that the next recovery will have a chance to
             * repair the damages.
             */
            databaseHealth.assertHealthy( IOException.class );
            checkpointAppender.checkPoint( event, logPosition, clock.instant(), checkpointReason );
            threshold.checkPointHappened( lastClosedTransactionId, logPosition );
            long durationMillis = startTime.elapsed( MILLISECONDS );
            msgLog.info( checkpointReason + " checkpoint completed in " + duration( durationMillis ) );
            event.checkpointCompleted( durationMillis );

            /*
             * Prune up to the version pointed from the latest check point,
             * since it might be an earlier version than the current log version.
             */
            logPruning.pruneLogs( logPosition.getLogVersion() );
            lastCheckPointedTx = lastClosedTransactionId;
            return lastClosedTransactionId;
        }
        catch ( Throwable t )
        {
            // Why only log failure here? It's because check point can potentially be made from various
            // points of execution e.g. background thread triggering check point if needed and during
            // shutdown where it's better to have more control over failure handling.
            msgLog.error( "Checkpoint failed", t );
            throw t;
        }
    }

    @Override
    public long lastCheckPointedTransactionId()
    {
        return lastCheckPointedTx;
    }

    @FunctionalInterface
    public interface ForceOperation
    {
        void flushAndForce( CursorContext cursorContext ) throws IOException;
    }
}
