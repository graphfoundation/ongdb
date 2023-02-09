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
package org.neo4j.kernel.impl.store;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.neo4j.batchinsert.BatchInserter;
import org.neo4j.batchinsert.BatchInserters;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.EphemeralNeo4jLayoutExtension;
import org.neo4j.test.extension.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;

@EphemeralNeo4jLayoutExtension
class PropertyKeyTest
{
    @Inject
    private EphemeralFileSystemAbstraction fs;
    @Inject
    private DatabaseLayout databaseLayout;

    @Test
    void lazyLoadWithinWriteTransaction() throws IOException
    {
        BatchInserter inserter = BatchInserters.inserter( databaseLayout, fs );
        int count = 3000;
        long nodeId = inserter.createNode( mapWithManyProperties( count /* larger than initial property index load threshold */ ) );
        inserter.shutdown();

        DatabaseManagementService managementService = new TestDatabaseManagementServiceBuilder( databaseLayout )
                .setFileSystem( fs )
                .impermanent()
                .build();
        GraphDatabaseService db = managementService.database( DEFAULT_DATABASE_NAME );

        // When
        try ( Transaction tx = db.beginTx() )
        {
            tx.createNode();
            Node node = tx.getNodeById( nodeId );

            // Then
            assertEquals( count, Iterables.count( node.getPropertyKeys() ) );
            tx.commit();
        }
        finally
        {
            managementService.shutdown();
        }
    }

    private static Map<String, Object> mapWithManyProperties( int count )
    {
        Map<String, Object> properties = new HashMap<>();
        for ( int i = 0; i < count; i++ )
        {
            properties.put( "key:" + i, "value" );
        }
        return properties;
    }
}
