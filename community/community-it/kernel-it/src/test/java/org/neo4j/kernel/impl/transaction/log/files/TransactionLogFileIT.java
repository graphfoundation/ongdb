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
package org.neo4j.kernel.impl.transaction.log.files;

import org.apache.commons.lang3.mutable.MutableLong;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Clock;

import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.kernel.database.DatabaseTracers;
import org.neo4j.kernel.impl.transaction.log.rotation.FileLogRotation;
import org.neo4j.kernel.impl.transaction.log.rotation.LogRotation;
import org.neo4j.kernel.impl.transaction.log.rotation.monitor.LogRotationMonitorAdapter;
import org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer;
import org.neo4j.kernel.impl.transaction.tracing.LogAppendEvent;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.lock.LockTracer;
import org.neo4j.logging.NullLog;
import org.neo4j.memory.LocalMemoryTracker;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.storageengine.api.LogVersionRepository;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionIdStore;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.LifeExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.monitoring.PanicEventGenerator.NO_OP;

@DbmsExtension
@ExtendWith( LifeExtension.class )
class TransactionLogFileIT
{
    @Inject
    private DatabaseLayout databaseLayout;
    @Inject
    private FileSystemAbstraction fileSystem;
    @Inject
    private LifeSupport life;
    @Inject
    private LogVersionRepository logVersionRepository;
    @Inject
    private TransactionIdStore transactionIdStore;

    @Test
    void tracePageCacheAccessOnRotate() throws IOException
    {
        var cacheTracer = new DefaultPageCacheTracer();
        LogFiles logFiles = LogFilesBuilder.builder( databaseLayout, fileSystem )
                .withTransactionIdStore( transactionIdStore )
                .withLogVersionRepository( logVersionRepository )
                .withStoreId( StoreId.UNKNOWN )
                .withDatabaseTracers( new DatabaseTracers( DatabaseTracer.NULL, LockTracer.NONE, cacheTracer ) )
                .build();
        life.add( logFiles );
        life.start();

        assertThat( cacheTracer.pins() ).isZero();
        assertThat( cacheTracer.unpins() ).isZero();
        assertThat( cacheTracer.pins() ).isZero();

        var logFile = logFiles.getLogFile();
        logFile.rotate();

        assertThat( cacheTracer.pins() ).isEqualTo( 1 );
        assertThat( cacheTracer.unpins() ).isEqualTo( 1 );
        assertThat( cacheTracer.hits() ).isEqualTo( 1 );
    }

    @Test
    @EnabledOnOs( OS.LINUX )
    void doNotScanDirectoryOnRotate() throws IOException
    {
        LogFiles logFiles = LogFilesBuilder.builder( databaseLayout, fileSystem )
                .withTransactionIdStore( transactionIdStore )
                .withLogVersionRepository( logVersionRepository )
                .withStoreId( StoreId.UNKNOWN )
                .build();
        life.add( logFiles );
        life.start();

        MutableLong rotationObservedVersion = new MutableLong();
        LogRotation logRotation =
                FileLogRotation.transactionLogRotation( logFiles.getLogFile(), Clock.systemUTC(), new DatabaseHealth( NO_OP, NullLog.getInstance() ),
                        new LogRotationMonitorAdapter()
                        {
                            @Override
                            public void startRotation( long currentLogVersion )
                            {
                                rotationObservedVersion.setValue( currentLogVersion );
                            }
                        } );

        for ( int i = 0; i < 6; i++ )
        {
            for ( Path path : logFiles.logFiles() )
            {
                FileUtils.deleteFile( path );
            }
            logRotation.rotateLogFile( LogAppendEvent.NULL );
        }

        assertEquals( 5, rotationObservedVersion.getValue() );
        assertEquals( 6, logFiles.getLogFile().getCurrentLogVersion() );
    }

    @Test
    void trackTransactionLogFileMemory() throws IOException
    {
        var memoryTracker = new LocalMemoryTracker();
        var life = new LifeSupport();
        LogFiles logFiles = LogFilesBuilder.builder( databaseLayout, fileSystem )
                .withTransactionIdStore( transactionIdStore )
                .withLogVersionRepository( logVersionRepository )
                .withStoreId( StoreId.UNKNOWN )
                .withMemoryTracker( memoryTracker )
                .build();

        life.add( logFiles );
        try
        {
            life.start();

            assertThat( memoryTracker.estimatedHeapMemory() ).isZero();
            assertThat( memoryTracker.usedNativeMemory() ).isGreaterThan( 0 );
        }
        finally
        {
            life.stop();
            life.shutdown();
        }

        assertThat( memoryTracker.usedNativeMemory() ).isZero();
        assertThat( memoryTracker.estimatedHeapMemory() ).isZero();
    }
}
