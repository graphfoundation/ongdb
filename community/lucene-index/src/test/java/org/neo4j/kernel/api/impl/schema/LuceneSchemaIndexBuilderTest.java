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
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.kernel.api.impl.schema;

import org.junit.Rule;
import org.junit.Test;

import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.kernel.api.schema.index.SchemaIndexDescriptor;
import org.neo4j.kernel.api.schema.index.SchemaIndexDescriptorFactory;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.configuration.Settings;
import org.neo4j.kernel.impl.factory.OperationalMode;
import org.neo4j.test.rule.TestDirectory;
import org.neo4j.test.rule.fs.DefaultFileSystemRule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LuceneSchemaIndexBuilderTest
{
    @Rule
    public final TestDirectory testDir = TestDirectory.testDirectory();
    @Rule
    public final DefaultFileSystemRule fileSystemRule = new DefaultFileSystemRule();

    private final SchemaIndexDescriptor descriptor = SchemaIndexDescriptorFactory.forLabel( 0, 0 );

    @Test
    public void readOnlyIndexCreation() throws Exception
    {
        try ( SchemaIndex schemaIndex = LuceneSchemaIndexBuilder.create( descriptor, getReadOnlyConfig() )
                .withFileSystem( fileSystemRule.get() )
                .withOperationalMode( OperationalMode.single )
                .withIndexRootFolder( testDir.directory( "a" ) )
                .build() )
        {
            assertTrue( "Builder should construct read only index.", schemaIndex.isReadOnly() );
        }
    }

    @Test
    public void writableIndexCreation() throws Exception
    {
        try ( SchemaIndex schemaIndex = LuceneSchemaIndexBuilder.create( descriptor, getDefaultConfig() )
                .withFileSystem( fileSystemRule.get() )
                .withOperationalMode( OperationalMode.single )
                .withIndexRootFolder( testDir.directory( "b" ) )
                .build() )
        {
            assertFalse( "Builder should construct writable index.", schemaIndex.isReadOnly() );
        }
    }

    private Config getDefaultConfig()
    {
        return Config.defaults();
    }

    private Config getReadOnlyConfig()
    {
        return Config.defaults( GraphDatabaseSettings.read_only, Settings.TRUE );
    }
}
