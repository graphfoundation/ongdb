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
package counts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.UncloseableDelegatingFileSystemAbstraction;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.kernel.api.Kernel;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.kernel.impl.store.MetaDataStore;
import org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointer;
import org.neo4j.kernel.impl.transaction.log.checkpoint.SimpleTriggerInfo;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.EphemeralNeo4jLayoutExtension;
import org.neo4j.test.extension.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.index_background_sampling_enabled;
import static org.neo4j.graphdb.Label.label;
import static org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED;
import static org.neo4j.kernel.api.KernelTransaction.Type.EXPLICIT;
import static org.neo4j.logging.AssertableLogProvider.Level.WARN;
import static org.neo4j.logging.LogAssertions.assertThat;

@EphemeralNeo4jLayoutExtension
class RebuildCountsTest
{
    private static final int ALIENS = 16;
    private static final int HUMANS = 16;
    private static final Label ALIEN = label( "Alien" );
    private static final Label HUMAN = label( "Human" );

    @Inject
    private EphemeralFileSystemAbstraction fileSystem;
    @Inject
    private RecordDatabaseLayout databaseLayout;

    private final AssertableLogProvider userLogProvider = new AssertableLogProvider();
    private final AssertableLogProvider internalLogProvider = new AssertableLogProvider();

    private GraphDatabaseService db;
    private DatabaseManagementService managementService;

    @BeforeEach
    void before()
    {
        restart( fileSystem );
    }

    @AfterEach
    void after()
    {
        doCleanShutdown();
    }

    @Test
    void shouldRebuildMissingCountsStoreOnStart() throws IOException, TransactionFailureException
    {
        // given
        createAliensAndHumans();

        // when
        FileSystemAbstraction fs = shutdown();
        deleteCounts( fs );
        restart( fs );

        // then
        Kernel kernel = ((GraphDatabaseAPI) db).getDependencyResolver().resolveDependency( Kernel.class );
        try ( KernelTransaction tx = kernel.beginTransaction( EXPLICIT, AUTH_DISABLED ) )
        {
            assertEquals( ALIENS + HUMANS, tx.dataRead().countsForNode( -1 ) );
            assertEquals( ALIENS, tx.dataRead().countsForNode( labelId( ALIEN ) ) );
            assertEquals( HUMANS, tx.dataRead().countsForNode( labelId( HUMAN ) ) );
        }

        // and also
        assertRebuildLogged();
    }

    @Test
    void shouldRebuildMissingCountsStoreAfterRecovery() throws IOException, TransactionFailureException
    {
        // given
        createAliensAndHumans();

        // when
        rotateLog();
        deleteHumans();
        FileSystemAbstraction fs = crash();
        deleteCounts( fs );
        restart( fs );

        // then
        Kernel kernel = ((GraphDatabaseAPI) db).getDependencyResolver().resolveDependency( Kernel.class );
        try ( KernelTransaction tx = kernel.beginTransaction( EXPLICIT, AUTH_DISABLED ) )
        {
            assertEquals( ALIENS, tx.dataRead().countsForNode( -1 ) );
            assertEquals( ALIENS, tx.dataRead().countsForNode( labelId( ALIEN ) ) );
            assertEquals( 0, tx.dataRead().countsForNode( labelId( HUMAN ) ) );
        }

        // and also
        assertRebuildLogged();
    }

    private void createAliensAndHumans()
    {
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < ALIENS; i++ )
            {
                tx.createNode( ALIEN );
            }
            for ( int i = 0; i < HUMANS; i++ )
            {
                tx.createNode( HUMAN );
            }
            tx.commit();
        }
    }

    private void deleteHumans()
    {
        try ( Transaction tx = db.beginTx() )
        {
            try ( ResourceIterator<Node> humans = tx.findNodes( HUMAN ) )
            {
                while ( humans.hasNext() )
                {
                    humans.next().delete();
                }
            }
            tx.commit();
        }
    }

    private int labelId( Label alien )
    {
        try ( Transaction tx = db.beginTx() )
        {
            return ((InternalTransaction) tx).kernelTransaction().tokenRead().nodeLabel( alien.name() );
        }
    }

    private void deleteCounts( FileSystemAbstraction snapshot ) throws IOException
    {
        snapshot.deleteFile( databaseLayout.countStore() );
    }

    private FileSystemAbstraction shutdown()
    {
        doCleanShutdown();
        return fileSystem.snapshot();
    }

    private void rotateLog() throws IOException
    {
        ((GraphDatabaseAPI) db).getDependencyResolver()
                               .resolveDependency( CheckPointer.class ).forceCheckPoint( new SimpleTriggerInfo( "test" ) );
    }

    private FileSystemAbstraction crash()
    {
        return fileSystem.snapshot();
    }

    private void restart( FileSystemAbstraction fs )
    {
        if ( db != null )
        {
            managementService.shutdown();
        }

        managementService = new TestDatabaseManagementServiceBuilder( databaseLayout )
                .setUserLogProvider( userLogProvider )
                .setInternalLogProvider( internalLogProvider )
                .setFileSystem( new UncloseableDelegatingFileSystemAbstraction( fs ) )
                .impermanent()
                .setConfig( index_background_sampling_enabled, false )
                .build();
        db = managementService.database( DEFAULT_DATABASE_NAME );
    }

    private void doCleanShutdown()
    {
        try
        {
            managementService.shutdown();
        }
        finally
        {
            db = null;
        }
    }

    private void assertRebuildLogged()
    {
        assertThat( internalLogProvider ).forClass( MetaDataStore.class ).forLevel( WARN )
                .containsMessages( "Missing counts store, rebuilding it.", "Counts store rebuild completed." );
    }
}
