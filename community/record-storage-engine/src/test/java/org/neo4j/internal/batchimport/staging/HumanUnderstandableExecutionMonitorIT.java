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
package org.neo4j.internal.batchimport.staging;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.api.parallel.Resources;

import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.neo4j.collection.Dependencies;
import org.neo4j.csv.reader.Extractors;
import org.neo4j.internal.batchimport.Configuration;
import org.neo4j.internal.batchimport.DataStatistics;
import org.neo4j.internal.batchimport.ImportLogic;
import org.neo4j.internal.batchimport.IndexImporterFactory;
import org.neo4j.internal.batchimport.NodeDegreeCountStage;
import org.neo4j.internal.batchimport.ParallelBatchImporter;
import org.neo4j.internal.batchimport.cache.PageCacheArrayFactoryMonitor;
import org.neo4j.internal.batchimport.cache.idmapping.IdMappers;
import org.neo4j.internal.batchimport.input.Collector;
import org.neo4j.internal.batchimport.input.DataGeneratorInput;
import org.neo4j.internal.batchimport.input.IdType;
import org.neo4j.internal.batchimport.input.Input;
import org.neo4j.internal.batchimport.staging.HumanUnderstandableExecutionMonitor.ImportStage;
import org.neo4j.internal.batchimport.store.BatchingNeoStores;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.impl.store.NodeStore;
import org.neo4j.kernel.impl.store.RelationshipStore;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.LogFilesInitializer;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.extension.DefaultFileSystemExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.extension.SuppressOutputExtension;
import org.neo4j.test.extension.testdirectory.TestDirectorySupportExtension;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.neo4j.configuration.Config.defaults;
import static org.neo4j.internal.batchimport.AdditionalInitialIds.EMPTY;
import static org.neo4j.internal.batchimport.input.DataGeneratorInput.bareboneNodeHeader;
import static org.neo4j.internal.batchimport.input.DataGeneratorInput.bareboneRelationshipHeader;
import static org.neo4j.io.ByteUnit.mebiBytes;
import static org.neo4j.io.pagecache.tracing.PageCacheTracer.NULL;
import static org.neo4j.kernel.impl.store.format.standard.Standard.LATEST_RECORD_FORMATS;

@Neo4jLayoutExtension
@ExtendWith( {RandomExtension.class, SuppressOutputExtension.class,DefaultFileSystemExtension.class, TestDirectorySupportExtension.class} )
@ResourceLock( Resources.SYSTEM_OUT )
class HumanUnderstandableExecutionMonitorIT
{
    private static final long NODE_COUNT = 1_000;
    private static final long RELATIONSHIP_COUNT = 10_000;

    @Inject
    private RandomSupport random;
    @Inject
    private DatabaseLayout databaseLayout;
    @Inject
    private FileSystemAbstraction fileSystem;

    @Test
    void shouldReportProgressOfNodeImport() throws Exception
    {
        // given
        CapturingMonitor progress = new CapturingMonitor();
        HumanUnderstandableExecutionMonitor monitor = new HumanUnderstandableExecutionMonitor( progress );
        IdType idType = IdType.INTEGER;
        Input input = new DataGeneratorInput( NODE_COUNT, RELATIONSHIP_COUNT, idType, random.seed(),
                0, bareboneNodeHeader( idType, new Extractors( ';' ) ), bareboneRelationshipHeader( idType, new Extractors( ';' ) ),
                1, 1, 0, 0 );
        Configuration configuration = new Configuration.Overridden( Configuration.DEFAULT )
        {
            @Override
            public long pageCacheMemory()
            {
                return mebiBytes( 8 );
            }
        };

        // when
        try ( JobScheduler jobScheduler = new ThreadPoolJobScheduler() )
        {
            new ParallelBatchImporter( databaseLayout, fileSystem, NULL, configuration, NullLogService.getInstance(), monitor,
                    EMPTY, defaults(), LATEST_RECORD_FORMATS, ImportLogic.NO_MONITOR, jobScheduler, Collector.EMPTY,
                    LogFilesInitializer.NULL, IndexImporterFactory.EMPTY, EmptyMemoryTracker.INSTANCE ).doImport( input );

            // then
            progress.assertAllProgressReachedEnd();
        }
    }

    @Test
    void shouldStartFromNonFirstStage()
    {
        // given
        HumanUnderstandableExecutionMonitor monitor = new HumanUnderstandableExecutionMonitor( HumanUnderstandableExecutionMonitor.NO_MONITOR );
        Dependencies dependencies = new Dependencies();
        dependencies.satisfyDependency( Input.knownEstimates( 10, 10, 10, 10, 10, 10, 10 ) );
        BatchingNeoStores neoStores = mock( BatchingNeoStores.class );
        NodeStore nodeStore = mock( NodeStore.class );
        RelationshipStore relationshipStore = mock( RelationshipStore.class );
        when( neoStores.getNodeStore() ).thenReturn( nodeStore );
        when( neoStores.getRelationshipStore() ).thenReturn( relationshipStore );
        dependencies.satisfyDependency( neoStores );
        dependencies.satisfyDependency( IdMappers.actual() );
        dependencies.satisfyDependency( mock( PageCacheArrayFactoryMonitor.class ) );
        dependencies.satisfyDependency( new DataStatistics( 10, 10, new DataStatistics.RelationshipTypeCount[0] ) );
        monitor.initialize( dependencies );

        // when/then
        StageExecution execution = mock( StageExecution.class );
        when( execution.getStageName() ).thenReturn( NodeDegreeCountStage.NAME );
        assertThatCode( () -> monitor.start( execution ) ).doesNotThrowAnyException();
    }

    private static class CapturingMonitor implements HumanUnderstandableExecutionMonitor.Monitor
    {
        final EnumMap<ImportStage,AtomicInteger> progress = new EnumMap<>( ImportStage.class );

        @Override
        public void progress( ImportStage stage, int percent )
        {
            if ( percent > 100 )
            {
                fail( "Expected percentage to be 0..100% but was " + percent );
            }

            AtomicInteger stageProgress = progress.computeIfAbsent( stage, s -> new AtomicInteger() );
            int previous = stageProgress.getAndSet( percent );
            if ( previous > percent )
            {
                fail( "Progress should go forwards only, but went from " + previous + " to " + percent );
            }
        }

        void assertAllProgressReachedEnd()
        {
            Assertions.assertEquals( ImportStage.values().length, progress.size() );
            progress.values().forEach( p -> assertEquals( 100, p.get() ) );
        }
    }
}
