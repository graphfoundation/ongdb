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
package org.neo4j.kernel.api.index;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;

import java.nio.file.Path;
import java.util.Locale;
import java.util.concurrent.Callable;

import org.neo4j.common.TokenNameLookup;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.function.ThrowingConsumer;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.api.schema.SchemaTestUtil;
import org.neo4j.kernel.impl.api.index.PhaseTracker;
import org.neo4j.kernel.impl.scheduler.JobSchedulerFactory;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobMonitoringParams;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.neo4j.io.pagecache.context.CursorContext.NULL;

@PageCacheExtension
@ExtendWith( RandomExtension.class )
abstract class IndexProviderCompatabilityTestBase
{
    @Inject
    private PageCache pageCache;
    @Inject
    RandomSupport random;
    @Inject
    FileSystemAbstraction fs;

    private TestDirectory testDirectory;
    private final IndexPrototype incompleteIndexPrototype;
    final IndexProviderCompatibilityTestSuite testSuite;
    private final JobScheduler jobScheduler;
    IndexProvider indexProvider;
    IndexDescriptor descriptor;
    TokenNameLookup tokenNameLookup;
    final IndexPopulator.PopulationWorkScheduler populationWorkScheduler;
    Config config;
    Path homePath;

    @BeforeEach
    void setup( TestInfo info ) throws Exception
    {
        testDirectory = TestDirectory.testDirectory( fs );
        Class<?> testClass = info.getTestClass().orElseThrow();
        String testName = info.getTestMethod().orElseThrow().getName().toLowerCase( Locale.ROOT );
        testDirectory.prepareDirectory( testClass, testSuite.getClass().getSimpleName() );
        homePath = testDirectory.homePath( testName );

        Config.Builder configBuilder = Config.newBuilder();
        configBuilder.set( GraphDatabaseSettings.neo4j_home, homePath );
        testSuite.additionalConfig( configBuilder );
        additionalConfig( configBuilder );
        this.config = configBuilder.build();

        indexProvider = testSuite.createIndexProvider( pageCache, fs, homePath, config );
        descriptor = indexProvider.completeConfiguration( incompleteIndexPrototype.withName( "index_17" ).materialise( 17 ) );
        jobScheduler.start();
    }

    @AfterEach
    void tearDown() throws Exception
    {
        if ( jobScheduler != null )
        {
            jobScheduler.shutdown();
        }
        testDirectory.complete( false );
    }

    void additionalConfig( Config.Builder configBuilder )
    {
        //can be overridden in sub-classes that wants to add additional Config settings.
    }

    IndexProviderCompatabilityTestBase( IndexProviderCompatibilityTestSuite testSuite, IndexPrototype prototype )
    {
        this.testSuite = testSuite;
        this.incompleteIndexPrototype = prototype;
        jobScheduler = JobSchedulerFactory.createInitialisedScheduler();
        populationWorkScheduler = new IndexPopulator.PopulationWorkScheduler()
        {

            @Override
            public <T> JobHandle<T> schedule( IndexPopulator.JobDescriptionSupplier descriptionSupplier, Callable<T> job )
            {
                return jobScheduler.schedule( Group.INDEX_POPULATION_WORK, new JobMonitoringParams( null, null, null ), job );
            }
        };
        tokenNameLookup = SchemaTestUtil.SIMPLE_NAME_LOOKUP;
    }

    void withPopulator( IndexPopulator populator, ThrowingConsumer<IndexPopulator,Exception> runWithPopulator ) throws Exception
    {
        withPopulator( populator, runWithPopulator, true );
    }

    void withPopulator( IndexPopulator populator, ThrowingConsumer<IndexPopulator,Exception> runWithPopulator, boolean closeSuccessfully ) throws Exception
    {
        try
        {
            populator.create();
            runWithPopulator.accept( populator );
            if ( closeSuccessfully )
            {
                populator.scanCompleted( PhaseTracker.nullInstance, populationWorkScheduler, NULL );
                testSuite.consistencyCheck( populator );
            }
        }
        finally
        {
            populator.close( closeSuccessfully, NULL );
        }
    }
}
