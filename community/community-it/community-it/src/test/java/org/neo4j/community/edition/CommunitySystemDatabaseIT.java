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
package org.neo4j.community.edition;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.configuration.Config;
import org.neo4j.consistency.ConsistencyCheckService;
import org.neo4j.consistency.checking.full.ConsistencyCheckIncompleteException;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacade;
import org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore;
import org.neo4j.kernel.impl.transaction.log.TransactionCursor;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.storageengine.api.TransactionIdStore;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static java.lang.String.valueOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.graphdb.Label.label;
import static org.neo4j.internal.helpers.collection.Iterables.count;
import static org.neo4j.internal.helpers.collection.Iterators.count;
import static org.neo4j.kernel.database.NamedDatabaseId.NAMED_SYSTEM_DATABASE_ID;

@TestDirectoryExtension
class CommunitySystemDatabaseIT
{
    @Inject
    private TestDirectory testDirectory;
    private GraphDatabaseService database;
    private DatabaseManager<?> databaseManager;
    private GraphDatabaseFacade defaultDb;
    private GraphDatabaseFacade systemDb;
    private DatabaseManagementService managementService;

    @BeforeEach
    void setUp()
    {
        managementService = new TestDatabaseManagementServiceBuilder( testDirectory.homePath() )
                .noOpSystemGraphInitializer()
                .build();
        database = managementService.database( DEFAULT_DATABASE_NAME );
        databaseManager = getDatabaseManager( database );
        defaultDb = getDatabaseByName( databaseManager, databaseManager.databaseIdRepository().getByName( DEFAULT_DATABASE_NAME ).get() );
        systemDb = getDatabaseByName( databaseManager, NAMED_SYSTEM_DATABASE_ID );
    }

    @AfterEach
    void tearDown()
    {
        managementService.shutdown();
    }

    @Test
    void systemAndDefaultDatabasesAvailable()
    {
        assertNotNull( defaultDb );
        assertNotNull( systemDb );
        assertNotSame( defaultDb, systemDb );
    }

    @Test
    void systemDatabaseDataNotAvailableInDefaultDatabase()
    {
        Label systemLabel = label( "systemLabel" );
        try ( Transaction transaction = systemDb.beginTx() )
        {
            Node node = transaction.createNode( systemLabel );
            node.setProperty( "a", "b" );
            transaction.commit();
        }
        try ( Transaction transaction = defaultDb.beginTx() )
        {
            assertEquals( 0, count( transaction.findNodes( systemLabel ) ) );
            assertEquals( 0, count( transaction.getAllLabels() ) );
        }
        try ( Transaction transaction = systemDb.beginTx() )
        {
            assertEquals( 1, count( transaction.findNodes( systemLabel ) ) );
            assertEquals( 1, count( transaction.getAllLabels() ) );
        }
    }

    @Test
    void separateTransactionLogsForSystemDatabase() throws IOException
    {

        int systemDatabaseTransactions = 100;
        int defaultDatabaseTransactions = 15;

        var systemTxCountBefore = countTransactionInLogicalStore( systemDb );
        var defaultTxCountBefore = countTransactionInLogicalStore( defaultDb );

        for ( int i = 0; i < systemDatabaseTransactions; i++ )
        {
            try ( Transaction transaction = systemDb.beginTx() )
            {
                Node nodeA = transaction.createNode();
                Node nodeB = transaction.createNode();
                nodeA.createRelationshipTo( nodeB, RelationshipType.withName( valueOf( i ) ) );
                transaction.commit();
            }
        }

        for ( int i = 0; i < defaultDatabaseTransactions; i++ )
        {
            try ( Transaction transaction = defaultDb.beginTx() )
            {
                transaction.createNode( label( valueOf( i ) ) );
                transaction.commit();
            }
        }

        var systemTxCountAfter = countTransactionInLogicalStore( systemDb );
        var defaultTxCountAfter = countTransactionInLogicalStore( defaultDb );

        assertEquals( systemTxCountAfter - systemTxCountBefore, systemDatabaseTransactions * 2 );
        assertEquals( defaultTxCountAfter - defaultTxCountBefore, defaultDatabaseTransactions * 2 );
    }

    @Test
    void differentDatabaseHaveDifferentTxLogsDirectories()
    {
        LogFiles systemLogFiles = systemDb.getDependencyResolver().resolveDependency( LogFiles.class );
        LogFiles defaultLogFiles = defaultDb.getDependencyResolver().resolveDependency( LogFiles.class );
        assertNotEquals( defaultLogFiles.logFilesDirectory(), systemLogFiles.logFilesDirectory() );
    }

    @Test
    void systemAndDefaultDatabasesAreConsistentAfterShutdown() throws ConsistencyCheckIncompleteException
    {
        int systemDatabaseTransactions = 100;
        int defaultDatabaseTransactions = 15;
        DatabaseLayout systemDatabaseLayout = systemDb.databaseLayout();
        DatabaseLayout defaultDbLayout = defaultDb.databaseLayout();

        for ( int i = 0; i < systemDatabaseTransactions; i++ )
        {
            try ( Transaction transaction = systemDb.beginTx() )
            {
                Node nodeA = transaction.createNode();
                Node nodeB = transaction.createNode();
                nodeA.createRelationshipTo( nodeB, RelationshipType.withName( valueOf( i ) ) );
                transaction.commit();
            }
        }

        for ( int i = 0; i < defaultDatabaseTransactions; i++ )
        {
            try ( Transaction transaction = defaultDb.beginTx() )
            {
                transaction.createNode( label( valueOf( i ) ) );
                transaction.commit();
            }
        }

        managementService.shutdown();

        ConsistencyCheckService consistencyCheckService = new ConsistencyCheckService();
        assertTrue( runConsistencyCheck( systemDatabaseLayout, consistencyCheckService ).isSuccessful() );
        assertTrue( runConsistencyCheck( defaultDbLayout, consistencyCheckService ).isSuccessful() );
    }

    @Test
    void systemDatabaseEnabledByDefault()
    {
        GraphDatabaseService databaseWithSystemDb = null;
        DatabaseManagementService managementService = null;
        try
        {
            Path disabledSystemDbDirectory = testDirectory.homePath( "withSystemDd" );
            managementService = new TestDatabaseManagementServiceBuilder( disabledSystemDbDirectory ).build();
            databaseWithSystemDb = managementService.database( DEFAULT_DATABASE_NAME );
            DatabaseManager<?> databaseManager = getDatabaseManager( databaseWithSystemDb );
            assertTrue( databaseManager.getDatabaseContext( NAMED_SYSTEM_DATABASE_ID ).isPresent() );
        }
        finally
        {
            if ( databaseWithSystemDb != null )
            {
                managementService.shutdown();
            }
        }
    }

    private static ConsistencyCheckService.Result runConsistencyCheck( DatabaseLayout systemDatabaseLayout, ConsistencyCheckService consistencyCheckService )
            throws ConsistencyCheckIncompleteException
    {
        return consistencyCheckService.runFullConsistencyCheck( systemDatabaseLayout, Config.defaults(), ProgressMonitorFactory.NONE,
                NullLogProvider.getInstance(), false );
    }

    private static int countTransactionInLogicalStore( GraphDatabaseFacade facade ) throws IOException
    {
        LogicalTransactionStore transactionStore = facade.getDependencyResolver().resolveDependency( LogicalTransactionStore.class );
        try ( TransactionCursor cursor = transactionStore.getTransactions( TransactionIdStore.BASE_TX_ID + 1 ) )
        {
            var count = 0;
            while ( cursor.next() )
            {
                count++;
            }
            return count;
        }
    }

    private static GraphDatabaseFacade getDatabaseByName( DatabaseManager<?> databaseManager, NamedDatabaseId namedDatabaseId )
    {
        return databaseManager.getDatabaseContext( namedDatabaseId ).orElseThrow( IllegalStateException::new ).databaseFacade();
    }

    private static DatabaseManager<?> getDatabaseManager( GraphDatabaseService database )
    {
        return ((GraphDatabaseAPI) database).getDependencyResolver().resolveDependency( DatabaseManager.class );
    }

}
