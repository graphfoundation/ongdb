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
package org.neo4j.kernel.impl.transaction.log.stresstest.workload;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BooleanSupplier;

import org.neo4j.configuration.Config;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.impl.api.TestCommandReaderFactory;
import org.neo4j.kernel.impl.transaction.SimpleLogVersionRepository;
import org.neo4j.kernel.impl.transaction.SimpleTransactionIdStore;
import org.neo4j.kernel.impl.transaction.log.TransactionAppender;
import org.neo4j.kernel.impl.transaction.log.TransactionMetadataCache;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.lifecycle.Lifespan;
import org.neo4j.logging.Log;
import org.neo4j.logging.NullLog;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.monitoring.PanicEventGenerator;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionIdStore;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;
import org.neo4j.util.concurrent.Futures;

import static org.neo4j.kernel.impl.transaction.log.TransactionAppenderFactory.createTransactionAppender;

public class Runner implements Callable<Long>
{
    private final DatabaseLayout databaseLayout;
    private final BooleanSupplier condition;
    private final int threads;

    public Runner( DatabaseLayout databaseLayout, BooleanSupplier condition, int threads )
    {
        this.databaseLayout = databaseLayout;
        this.condition = condition;
        this.threads = threads;
    }

    @Override
    public Long call() throws Exception
    {
        long lastCommittedTransactionId;

        try ( FileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
                var jobScheduler = new ThreadPoolJobScheduler();
                Lifespan life = new Lifespan() )
        {
            TransactionIdStore transactionIdStore = new SimpleTransactionIdStore();
            TransactionMetadataCache transactionMetadataCache = new TransactionMetadataCache();
            LogFiles logFiles = life.add( createLogFiles( transactionIdStore, fileSystem ) );

            TransactionAppender transactionAppender =
                    life.add( createBatchingTransactionAppender( transactionMetadataCache, logFiles, transactionIdStore, Config.defaults(), jobScheduler ) );

            ExecutorService executorService = Executors.newFixedThreadPool( threads );
            try
            {
                List<Future<?>> handlers = new ArrayList<>( threads );
                for ( int i = 0; i < threads; i++ )
                {
                    TransactionRepresentationFactory factory = new TransactionRepresentationFactory();
                    Worker task = new Worker( transactionAppender, factory, condition );
                    handlers.add( executorService.submit( task ) );
                }

                // wait for all the workers to complete
                Futures.getAll( handlers );
            }
            finally
            {
                executorService.shutdown();
            }

            lastCommittedTransactionId = transactionIdStore.getLastCommittedTransactionId();
        }

        return lastCommittedTransactionId;
    }

    private static TransactionAppender createBatchingTransactionAppender( TransactionMetadataCache transactionMetadataCache, LogFiles logFiles,
            TransactionIdStore transactionIdStore, Config config, JobScheduler jobScheduler )
    {
        Log log = NullLog.getInstance();
        DatabaseHealth databaseHealth = new DatabaseHealth( PanicEventGenerator.NO_OP, log );
        return createTransactionAppender( logFiles, transactionIdStore, transactionMetadataCache, config, databaseHealth,
                jobScheduler, NullLogProvider.getInstance() );
    }

    private LogFiles createLogFiles( TransactionIdStore transactionIdStore,
            FileSystemAbstraction fileSystemAbstraction ) throws IOException
    {
        SimpleLogVersionRepository logVersionRepository = new SimpleLogVersionRepository();
        return LogFilesBuilder.builder( databaseLayout, fileSystemAbstraction )
                .withTransactionIdStore( transactionIdStore )
                .withLogVersionRepository( logVersionRepository )
                .withLogEntryReader( new VersionAwareLogEntryReader( new TestCommandReaderFactory() ) )
                .withStoreId( StoreId.UNKNOWN )
                .build();
    }
}
