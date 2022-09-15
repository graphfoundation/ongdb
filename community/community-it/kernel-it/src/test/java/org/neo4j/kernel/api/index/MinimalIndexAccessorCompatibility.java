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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.kernel.impl.api.index.IndexSamplingConfig;
import org.neo4j.values.storable.Value;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.io.memory.ByteBufferFactory.heapBufferFactory;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.api.schema.SchemaTestUtil.SIMPLE_NAME_LOOKUP;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

class MinimalIndexAccessorCompatibility extends IndexProviderCompatabilityTestBase
{
    MinimalIndexAccessorCompatibility( IndexProviderCompatibilityTestSuite testSuite, IndexPrototype indexPrototype )
    {
        super( testSuite, indexPrototype );
    }

    abstract static class General extends MinimalIndexAccessorCompatibility
    {
        private MinimalIndexAccessor minimalIndexAccessor;

        General( IndexProviderCompatibilityTestSuite testSuite )
        {
            super( testSuite, testSuite.indexPrototype() );
        }

        @BeforeEach
        void before() throws IOException
        {
            IndexSamplingConfig indexSamplingConfig = new IndexSamplingConfig( Config.defaults() );
            fs.mkdir( homePath );
            IndexPopulator populator = indexProvider.getPopulator( descriptor, indexSamplingConfig, heapBufferFactory( 1024 ), INSTANCE, SIMPLE_NAME_LOOKUP );
            populator.create();
            populator.close( true, NULL );
            minimalIndexAccessor = indexProvider.getMinimalIndexAccessor( descriptor );
        }

        @Test
        void indexDropperMustDropIndex() throws IOException
        {
            // given
            Path rootDirectory = indexProvider.directoryStructure().rootDirectory();
            Path[] files = fs.listFiles( rootDirectory );
            assertEquals( 1, files.length );

            // when
            minimalIndexAccessor.drop();

            // then
            files = fs.listFiles( rootDirectory );
            assertEquals( 0, files.length );
        }

        @Test
        void indexDropperMustProvideIndexConfiguration()
        {
            // when
            Map<String,Value> dropperConfiguration = minimalIndexAccessor.indexConfig();

            // then
            assertEquals( descriptor.getIndexConfig().asMap(), dropperConfiguration );
        }
    }

    abstract static class ReadOnly extends MinimalIndexAccessorCompatibility
    {
        ReadOnly( IndexProviderCompatibilityTestSuite testSuite )
        {
            super( testSuite, testSuite.indexPrototype() );
        }

        @Override
        void additionalConfig( Config.Builder configBuilder )
        {
            configBuilder.set( GraphDatabaseSettings.read_only_database_default, true );
        }

        @Test
        void dropShouldBeBlockedIfReadOnly()
        {
            MinimalIndexAccessor minimalIndexAccessor = indexProvider.getMinimalIndexAccessor( descriptor );
            IllegalStateException e = assertThrows( IllegalStateException.class, minimalIndexAccessor::drop );
            assertThat( e ).hasMessageContaining( "read-only" );
        }
    }
}
