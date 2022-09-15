/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.kernel.impl.transaction.log;

import java.nio.file.Path;
import java.time.Instant;

import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryCommit;
import org.neo4j.kernel.impl.transaction.log.rotation.monitor.LogRotationMonitor;
import org.neo4j.kernel.recovery.RecoveryMonitor;
import org.neo4j.kernel.recovery.RecoveryPredicate;
import org.neo4j.kernel.recovery.RecoveryStartInformationProvider;
import org.neo4j.logging.Log;

import static java.lang.String.format;
import static org.neo4j.internal.helpers.Format.date;
import static org.neo4j.internal.helpers.Format.duration;

public class LoggingLogFileMonitor implements RecoveryMonitor, RecoveryStartInformationProvider.Monitor, LogRotationMonitor
{
    private long firstTransactionRecovered = -1;
    private long lastTransactionRecovered;
    private final Log log;

    public LoggingLogFileMonitor( Log log )
    {
        this.log = log;
    }

    @Override
    public void recoveryRequired( LogPosition startPosition )
    {
        log.info( "Recovery required from position " + startPosition );
    }

    @Override
    public void recoveryCompleted( int numberOfRecoveredTransactions, long recoveryTimeInMilliseconds )
    {
        if ( numberOfRecoveredTransactions != 0 )
        {
            log.info( format( "Recovery completed. %d transactions, first:%d, last:%d recovered, time spent: %s", numberOfRecoveredTransactions,
                    firstTransactionRecovered, lastTransactionRecovered, duration( recoveryTimeInMilliseconds ) ) );
        }
        else
        {
            log.info( "No recovery required" );
        }
    }

    @Override
    public void failToRecoverTransactionsAfterCommit( Throwable t, LogEntryCommit commitEntry, LogPosition recoveryToPosition )
    {
        log.warn( format( "Fail to recover all transactions. Last recoverable transaction id:%d, committed " +
                        "at:%d. Any later transaction after %s are unreadable and will be truncated.",
                commitEntry.getTxId(), commitEntry.getTimeWritten(), recoveryToPosition ), t );
    }

    @Override
    public void partialRecovery( RecoveryPredicate recoveryPredicate, CommittedTransactionRepresentation lastTransaction )
    {
        log.info( "Partial database recovery based on provided criteria: " + recoveryPredicate.describe() + ". Last replayed transaction: " +
                describeTransaction( lastTransaction ) + "." );
    }

    @Override
    public void failToRecoverTransactionsAfterPosition( Throwable t, LogPosition recoveryFromPosition )
    {
        log.warn( format( "Fail to recover all transactions. Any later transactions after position %s are " +
                "unreadable and will be truncated.", recoveryFromPosition ), t );
    }

    @Override
    public void failToExtractInitialFileHeader( Exception e )
    {
        log.warn( "Fail to read initial transaction log file header.", e );
    }

    @Override
    public void transactionRecovered( long txId )
    {
        if ( firstTransactionRecovered == -1 )
        {
            firstTransactionRecovered = txId;
        }
        lastTransactionRecovered = txId;
    }

    @Override
    public void noCommitsAfterLastCheckPoint( LogPosition logPosition )
    {
        log.info( format( "No commits found after last check point (which is at %s)",
                logPosition != null ? logPosition.toString() : "<no log position given>" ) );
    }

    @Override
    public void commitsAfterLastCheckPoint( LogPosition logPosition, long firstTxIdAfterLastCheckPoint )
    {
        log.info( format(
                "Commits found after last check point (which is at %s). First txId after last checkpoint: %d ",
                logPosition, firstTxIdAfterLastCheckPoint ) );
    }

    @Override
    public void noCheckPointFound()
    {
        log.info( "No check point found in transaction log" );
    }

    @Override
    public void started( Path logFile, long logVersion )
    {
        log.info( "Starting transaction log [%s] at version=%d", logFile, logVersion );
    }

    @Override
    public void startRotation( long currentLogVersion )
    {
    }

    @Override
    public void finishLogRotation( Path logFile, long logVersion, long lastTransactionId, long rotationMillis, long millisSinceLastRotation )
    {
        StringBuilder sb = new StringBuilder( "Rotated to transaction log [" );
        sb.append( logFile ).append( "] version=" ).append( logVersion ).append( ", last transaction in previous log=" );
        sb.append( lastTransactionId ).append( ", rotation took " ).append( rotationMillis ).append( " millis" );
        if ( millisSinceLastRotation > 0 )
        {
            sb.append( ", started after " ).append( millisSinceLastRotation ).append( " millis" );
        }
        log.info( sb.append( '.' ).toString() );
    }

    private static String describeTransaction( CommittedTransactionRepresentation lastTransaction )
    {
        if ( lastTransaction == null )
        {
            return "Not found.";
        }
        LogEntryCommit commitEntry = lastTransaction.getCommitEntry();
        return "transaction id: " + commitEntry.getTxId() + ", time " + date( Instant.ofEpochMilli( commitEntry.getTimeWritten() ) );
    }
}
