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
package org.neo4j.kernel.impl.index.schema;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.util.concurrent.Callable;

import org.neo4j.common.TokenNameLookup;
import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.index.internal.gbptree.GBPTreeBuilder;
import org.neo4j.index.internal.gbptree.Layout;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.api.index.IndexPopulator;
import org.neo4j.kernel.api.schema.SchemaTestUtil;
import org.neo4j.kernel.impl.scheduler.JobSchedulerFactory;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobMonitoringParams;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.extension.pagecache.PageCacheSupportExtension;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestDirectoryExtension
@ExtendWith( RandomExtension.class )
public abstract class IndexTestUtil<KEY,VALUE, LAYOUT extends Layout<KEY,VALUE>>
{
    static final long NON_EXISTENT_ENTITY_ID = 1_000_000_000;

    @RegisterExtension
    static PageCacheSupportExtension pageCacheExtension = new PageCacheSupportExtension();
    @Inject
    protected DefaultFileSystemAbstraction fs;
    @Inject
    protected TestDirectory directory;
    @Inject
    protected PageCache pageCache;
    @Inject
    protected RandomSupport random;

    IndexDescriptor indexDescriptor;
    LAYOUT layout;
    IndexFiles indexFiles;
    JobScheduler jobScheduler;
    IndexPopulator.PopulationWorkScheduler populationWorkScheduler;
    TokenNameLookup tokenNameLookup;

    @BeforeEach
    void setup()
    {
        indexDescriptor = indexDescriptor();
        layout = layout();
        this.indexFiles = createIndexFiles( fs, directory, indexDescriptor );
        indexFiles.ensureDirectoryExist();
        tokenNameLookup = SchemaTestUtil.SIMPLE_NAME_LOOKUP;
        jobScheduler = JobSchedulerFactory.createInitialisedScheduler();
        populationWorkScheduler = new IndexPopulator.PopulationWorkScheduler()
        {

            @Override
            public <T> JobHandle<T> schedule( IndexPopulator.JobDescriptionSupplier descriptionSupplier, Callable<T> job )
            {
                return jobScheduler.schedule( Group.INDEX_POPULATION_WORK, new JobMonitoringParams( null, null, null ), job );
            }
        };
    }

    @AfterEach
    void tearDown() throws Exception
    {
        jobScheduler.shutdown();
    }

    abstract IndexFiles createIndexFiles( FileSystemAbstraction fs, TestDirectory directory, IndexDescriptor indexDescriptor );

    abstract IndexDescriptor indexDescriptor();

    abstract LAYOUT layout();

    GBPTree<KEY,VALUE> getTree()
    {
        return new GBPTreeBuilder<>( pageCache, indexFiles.getStoreFile(), layout ).build();
    }

    void assertFilePresent()
    {
        assertTrue( fs.fileExists( indexFiles.getStoreFile() ) );
    }

    void assertFileNotPresent()
    {
        assertFalse( fs.fileExists( indexFiles.getStoreFile() ) );
    }

    // Useful when debugging
    void setSeed( long seed )
    {
        random.setSeed( seed );
        random.reset();
    }
}
