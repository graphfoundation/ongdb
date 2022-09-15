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
package org.neo4j.kernel.api.impl.schema.populator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.neo4j.collection.PrimitiveLongCollections;
import org.neo4j.configuration.Config;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.SchemaDescriptorSupplier;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.io.IOUtils;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.kernel.api.impl.index.storage.DirectoryFactory;
import org.neo4j.kernel.api.impl.index.storage.PartitionedIndexStorage;
import org.neo4j.kernel.api.impl.schema.LuceneSchemaIndexBuilder;
import org.neo4j.kernel.api.impl.schema.SchemaIndex;
import org.neo4j.kernel.api.index.IndexSample;
import org.neo4j.kernel.api.index.ValueIndexReader;
import org.neo4j.kernel.impl.index.schema.NodeValueIterator;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.internal.kernel.api.IndexQueryConstraints.unconstrained;
import static org.neo4j.internal.kernel.api.QueryContext.NULL_CONTEXT;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.api.impl.schema.AbstractLuceneIndexProvider.UPDATE_IGNORE_STRATEGY;
import static org.neo4j.kernel.api.index.IndexQueryHelper.add;

@TestDirectoryExtension
class NonUniqueDatabaseIndexPopulatorTest
{
    private final DirectoryFactory dirFactory = new DirectoryFactory.InMemoryDirectoryFactory();
    @Inject
    private TestDirectory testDir;
    @Inject
    private DefaultFileSystemAbstraction fileSystem;

    private SchemaIndex index;
    private NonUniqueLuceneIndexPopulator populator;
    private final SchemaDescriptorSupplier labelSchemaDescriptor = () -> SchemaDescriptors.forLabel( 0, 0 );

    @BeforeEach
    void setUp()
    {
        Path folder = testDir.directory( "folder" );
        PartitionedIndexStorage indexStorage = new PartitionedIndexStorage( dirFactory, fileSystem, folder );

        IndexDescriptor descriptor = IndexPrototype.forSchema( labelSchemaDescriptor.schema() ).withName( "index" ).materialise( 13 );
        index = LuceneSchemaIndexBuilder.create( descriptor, writable(), Config.defaults() ).withIndexStorage( indexStorage ).build();
    }

    @AfterEach
    void tearDown() throws Exception
    {
        if ( populator != null )
        {
            populator.close( false, NULL );
        }
        IOUtils.closeAll( index, dirFactory );
    }

    @Test
    void sampleEmptyIndex()
    {
        populator = newPopulator();

        IndexSample sample = populator.sample( NULL );

        assertEquals( new IndexSample(), sample );
    }

    @Test
    void sampleIncludedUpdates()
    {
        populator = newPopulator();
        List<IndexEntryUpdate<?>> updates = Arrays.asList(
                add( 1, labelSchemaDescriptor, "aaa" ),
                add( 2, labelSchemaDescriptor, "bbb" ),
                add( 3, labelSchemaDescriptor, "ccc" ) );
        populator.add( updates, NULL );

        IndexSample sample = populator.sample( NULL );

        assertEquals( new IndexSample( 3, 3, 3 ), sample );
    }

    @Test
    void sampleIncludedUpdatesWithDuplicates()
    {
        populator = newPopulator();
        List<IndexEntryUpdate<?>> updates = Arrays.asList(
                add( 1, labelSchemaDescriptor, "foo" ),
                add( 2, labelSchemaDescriptor, "bar" ),
                add( 3, labelSchemaDescriptor, "foo" ) );
        populator.add( updates, NULL );

        IndexSample sample = populator.sample( NULL );

        assertEquals( new IndexSample( 3, 2, 3 ), sample );
    }

    @Test
    void addUpdates() throws Exception
    {
        populator = newPopulator();

        List<IndexEntryUpdate<?>> updates = Arrays.asList(
                add( 1, labelSchemaDescriptor, "foo" ),
                add( 2, labelSchemaDescriptor, "bar" ),
                add( 42, labelSchemaDescriptor, "bar" ) );

        populator.add( updates, NULL );

        index.maybeRefreshBlocking();
        try ( ValueIndexReader reader = index.getIndexReader();
              NodeValueIterator allEntities = new NodeValueIterator() )
        {
            int propertyKeyId = labelSchemaDescriptor.schema().getPropertyId();
            reader.query( allEntities, NULL_CONTEXT, AccessMode.Static.READ, unconstrained(), PropertyIndexQuery.exists( propertyKeyId ) );
            assertArrayEquals( new long[]{1, 2, 42}, PrimitiveLongCollections.asArray( allEntities ) );
        }
    }

    private NonUniqueLuceneIndexPopulator newPopulator()
    {
        NonUniqueLuceneIndexPopulator populator = new NonUniqueLuceneIndexPopulator( index, UPDATE_IGNORE_STRATEGY );
        populator.create();
        return populator;
    }
}
