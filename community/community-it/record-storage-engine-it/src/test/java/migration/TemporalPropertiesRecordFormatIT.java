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
package migration;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.LocalDate;

import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.recordstorage.RecordStorageEngineFactory;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.values.storable.DateValue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.neo4j.configuration.GraphDatabaseInternalSettings.storage_engine;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;

@TestDirectoryExtension
class TemporalPropertiesRecordFormatIT
{
    @Inject
    private TestDirectory testDirectory;

    @Test
    void createDatePropertyOnLatestDatabase()
    {
        Path storeDir = testDirectory.homePath();
        Label label = Label.label( "DateNode" );
        String propertyKey = "a";
        LocalDate date = DateValue.date( 1991, 5, 3 ).asObjectCopy();

        DatabaseManagementService managementService = startDatabaseService( storeDir );
        GraphDatabaseService database = getDefaultDatabase( managementService );
        try ( Transaction transaction = database.beginTx() )
        {
            Node node = transaction.createNode( label );
            node.setProperty( propertyKey, date );
            transaction.commit();
        }
        managementService.shutdown();

        managementService = startDatabaseService( storeDir );
        GraphDatabaseService restartedDatabase = getDefaultDatabase( managementService );
        try ( Transaction transaction = restartedDatabase.beginTx() )
        {
            assertNotNull( transaction.findNode( label, propertyKey, date ) );
        }
        managementService.shutdown();
    }

    @Test
    void createDateArrayOnLatestDatabase()
    {
        Path storeDir = testDirectory.homePath();
        Label label = Label.label( "DateNode" );
        String propertyKey = "a";
        LocalDate date = DateValue.date( 1991, 5, 3 ).asObjectCopy();

        DatabaseManagementService managementService = startDatabaseService( storeDir );
        GraphDatabaseService database = getDefaultDatabase( managementService );
        try ( Transaction transaction = database.beginTx() )
        {
            Node node = transaction.createNode( label );
            node.setProperty( propertyKey, new LocalDate[]{date, date} );
            transaction.commit();
        }
        managementService.shutdown();

        managementService = startDatabaseService( storeDir );
        GraphDatabaseService restartedDatabase = getDefaultDatabase( managementService );
        try ( Transaction transaction = restartedDatabase.beginTx() )
        {
            try ( ResourceIterator<Node> nodes = transaction.findNodes( label ) )
            {
                Node node = nodes.next();
                LocalDate[] points = (LocalDate[]) node.getProperty( propertyKey );
                assertThat( points ).hasSize( 2 );
            }
        }
        managementService.shutdown();
    }

    private static DatabaseManagementService startDatabaseService( Path storeDir )
    {
        return new TestDatabaseManagementServiceBuilder( storeDir ).setConfig( storage_engine, RecordStorageEngineFactory.NAME ).build();
    }

    private static GraphDatabaseService getDefaultDatabase( DatabaseManagementService managementService )
    {
        return managementService.database( DEFAULT_DATABASE_NAME );
    }
}
