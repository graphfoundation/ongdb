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
import java.nio.file.Path;
import java.time.Instant;

import org.neo4j.io.IOUtils;
import org.neo4j.io.memory.NativeScopedBuffer;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.PhysicalLogVersionedStoreChannel;
import org.neo4j.kernel.impl.transaction.log.PositionAwarePhysicalFlushableChecksumChannel;
import org.neo4j.kernel.impl.transaction.log.entry.DetachedCheckpointLogEntryWriter;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogChannelAllocator;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFilesContext;
import org.neo4j.kernel.impl.transaction.log.files.checkpoint.CheckpointFile;
import org.neo4j.kernel.impl.transaction.log.rotation.LogRotation;
import org.neo4j.kernel.impl.transaction.log.rotation.monitor.LogRotationMonitor;
import org.neo4j.kernel.impl.transaction.tracing.LogCheckPointEvent;
import org.neo4j.kernel.impl.transaction.tracing.LogForceEvent;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.monitoring.Health;
import org.neo4j.storageengine.api.LogVersionRepository;
import org.neo4j.storageengine.api.StoreId;

import static java.util.Objects.requireNonNull;
import static org.neo4j.io.ByteUnit.kibiBytes;

public class DetachedCheckpointAppender extends LifecycleAdapter implements CheckpointAppender
{
    private static final String CHECKPOINT_LOG_FILE_ROTATION_TAG = "checkpointLogFileRotation";
    private final CheckpointFile checkpointFile;
    private final TransactionLogChannelAllocator channelAllocator;
    private final TransactionLogFilesContext context;
    private final Health databaseHealth;
    private final LogRotation logRotation;
    private final PageCacheTracer pageCacheTracer;
    private StoreId storeId;
    private PositionAwarePhysicalFlushableChecksumChannel writer;
    private DetachedCheckpointLogEntryWriter checkpointWriter;
    private NativeScopedBuffer buffer;
    private PhysicalLogVersionedStoreChannel channel;
    private LogVersionRepository logVersionRepository;
    private final Log log;

    public DetachedCheckpointAppender( TransactionLogChannelAllocator channelAllocator, TransactionLogFilesContext context, CheckpointFile checkpointFile,
            LogRotation checkpointRotation )
    {
        this.checkpointFile = requireNonNull( checkpointFile );
        this.context = requireNonNull( context );
        this.pageCacheTracer = requireNonNull( context.getDatabaseTracers().getPageCacheTracer() );
        this.channelAllocator = requireNonNull( channelAllocator );
        this.databaseHealth = requireNonNull( context.getDatabaseHealth() );
        this.logRotation = requireNonNull( checkpointRotation );
        this.log = context.getLogProvider().getLog( DetachedCheckpointAppender.class );
    }

    @Override
    public void start() throws IOException
    {
        this.storeId = context.getStoreId();
        logVersionRepository = requireNonNull( context.getLogVersionRepository() );
        long initialVersion = getCheckpointLogVersion();
        channel = channelAllocator.createLogChannel( initialVersion, context::getLastCommittedTransactionId );
        context.getMonitors().newMonitor( LogRotationMonitor.class ).started( channel.getPath(), initialVersion );
        channel.position( channel.size() );
        buffer = new NativeScopedBuffer( kibiBytes( 1 ), context.getMemoryTracker() );
        writer = new PositionAwarePhysicalFlushableChecksumChannel( channel, buffer );
        checkpointWriter = new DetachedCheckpointLogEntryWriter( writer );
    }

    private long getCheckpointLogVersion()
    {
        long metadataStoreVersion = logVersionRepository.getCheckpointLogVersion();
        long highestLogVersion = checkpointFile.getHighestLogVersion();
        if ( metadataStoreVersion >= highestLogVersion )
        {
            return metadataStoreVersion;
        }
        log.warn( "Metadata store checkpoint version pointing to a file number %d that is lower to higher available file number %d. " +
                "Update metadata store to point to higher file.", metadataStoreVersion, highestLogVersion );
        logVersionRepository.setCheckpointLogVersion( highestLogVersion, CursorContext.NULL );
        return highestLogVersion;
    }

    @Override
    public void shutdown() throws Exception
    {
        IOUtils.closeAll( writer, buffer, channel );
        writer = null;
        buffer = null;
        channel = null;
    }

    @Override
    public void checkPoint( LogCheckPointEvent logCheckPointEvent, LogPosition logPosition, Instant checkpointTime, String reason ) throws IOException
    {
        if ( checkpointWriter == null )
        {
            // we were not started but on a failure path someone tried to shutdown everything with checkpoint.
            log.warn( "Checkpoint was attempted while appender is not started. No checkpoint record will be appended." );
            return;
        }
        synchronized ( checkpointFile )
        {
            try
            {
                databaseHealth.assertHealthy( IOException.class );
                var logPositionBeforeCheckpoint = writer.getCurrentPosition();
                checkpointWriter.writeCheckPointEntry( logPosition, checkpointTime, storeId, reason );
                var logPositionAfterCheckpoint = writer.getCurrentPosition();
                logCheckPointEvent.appendToLogFile( logPositionBeforeCheckpoint, logPositionAfterCheckpoint );
                forceAfterAppend( logCheckPointEvent );
            }
            catch ( Throwable cause )
            {
                databaseHealth.panic( cause );
                throw cause;
            }
        }
        logRotation.rotateLogIfNeeded( logCheckPointEvent );
    }

    public long getCurrentPosition()
    {
        return channel.position();
    }

    private void forceAfterAppend( LogCheckPointEvent logCheckPointEvent ) throws IOException
    {
        try ( LogForceEvent logForceEvent = logCheckPointEvent.beginLogForce() )
        {
            writer.prepareForFlush().flush();
        }
    }

    public Path rotate() throws IOException
    {
        try ( var cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( CHECKPOINT_LOG_FILE_ROTATION_TAG ) ) )
        {
            channel = rotateChannel( channel, cursorContext );
            writer.setChannel( channel );
            return channel.getPath();
        }
    }

    private PhysicalLogVersionedStoreChannel rotateChannel( PhysicalLogVersionedStoreChannel channel, CursorContext cursorContext ) throws IOException
    {
        long newLogVersion = logVersionRepository.incrementAndGetCheckpointLogVersion( cursorContext );
        writer.prepareForFlush().flush();
        var newChannel = channelAllocator.createLogChannel( newLogVersion, context::committingTransactionId );
        channel.close();
        return newChannel;
    }
}
