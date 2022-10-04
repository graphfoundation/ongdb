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
package org.neo4j.internal.recordstorage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.configuration.Config;
import org.neo4j.internal.id.DefaultIdGeneratorFactory;
import org.neo4j.internal.recordstorage.ConsistencyCheckingApplierFactory.ConsistencyCheckingApplier;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.RelationshipStore;
import org.neo4j.kernel.impl.store.StoreFactory;
import org.neo4j.kernel.impl.store.cursor.CachedStoreCursors;
import org.neo4j.kernel.impl.store.record.Record;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.lock.LockGroup;
import org.neo4j.lock.LockService;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.storageengine.api.CommandVersion;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.ongdb_home;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.io.IOUtils.closeAllUnchecked;

@PageCacheExtension
class ConsistencyCheckingApplierTest
{
    private static final long NULL = Record.NULL_REFERENCE.longValue();
    private static final int TYPE = 0;
    private static final long NODE1 = 0;
    private static final long NODE2 = 10;
    private static final long NODE3 = 20;

    @Inject
    private TestDirectory directory;

    @Inject
    private PageCache pageCache;

    private NeoStores neoStores;
    private ConsistencyCheckingApplier checker;
    private NeoStoreTransactionApplier applier;
    private TransactionApplier[] appliers;
    private CachedStoreCursors storeCursors;

    @BeforeEach
    void setUp()
    {
        Config config = Config.defaults( ongdb_home, directory.homePath() );
        RecordDatabaseLayout layout = RecordDatabaseLayout.of( config );
        neoStores = new StoreFactory( layout, config, new DefaultIdGeneratorFactory( directory.getFileSystem(), immediate(), DEFAULT_DATABASE_NAME ), pageCache,
                directory.getFileSystem(), NullLogProvider.getInstance(), PageCacheTracer.NULL, writable() ).openAllNeoStores( true );
        RelationshipStore relationshipStore = neoStores.getRelationshipStore();
        storeCursors = new CachedStoreCursors( neoStores, CursorContext.NULL );
        checker = new ConsistencyCheckingApplier( relationshipStore, CursorContext.NULL );
        BatchContext batchContext = mock( BatchContext.class );
        when( batchContext.getLockGroup() ).thenReturn( new LockGroup() );
        applier = new NeoStoreTransactionApplier( CommandVersion.AFTER, neoStores, mock( CacheAccessBackDoor.class ), LockService.NO_LOCK_SERVICE, 0,
                batchContext, CursorContext.NULL, storeCursors );
        appliers = new TransactionApplier[]{checker, applier};
    }

    @AfterEach
    void tearDown()
    {
        closeAllUnchecked( storeCursors, neoStores );
    }

    @Test
    void shouldNotReportAnythingOnConsistentChanges() throws Exception
    {
        // when
        apply(
                create( new RelationshipRecord( 0 ).initialize( true, NULL, 0, 1, TYPE, 1, 1, 1, 2, true, true ) ),
                create( new RelationshipRecord( 1 ).initialize( true, NULL, 0, 10, TYPE, 0, NULL, 1, NULL, false, true ) ),
                create( new RelationshipRecord( 2 ).initialize( true, NULL, 1, 20, TYPE, 0, NULL, 1, NULL, false, true ) )
        );

        // then not throwing exception is wonderful
    }

    // ===== PREV =====

    @Test
    void shouldDetectSourcePrevNotInUse()
    {
        // given
        Command.RelationshipCommand command = create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE1, NODE2, TYPE, 0, NULL, 1, NULL, false, true ) );
        //                                                                                                                    ^                   ^

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( command ) );
        assertThat( error.getMessage() ).contains( "prev refers to unused" );
    }

    @Test
    void shouldDetectTargetPrevNotInUse()
    {
        // given
        Command.RelationshipCommand command = create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE1, NODE2, TYPE, 1, NULL, 0, NULL, true, false ) );
        //                                                                                                                             ^                ^

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( command ) );
        assertThat( error.getMessage() ).contains( "prev refers to unused" );
    }

    @Test
    void shouldDetectSourcePrevNotReferringBack()
    {
        // given
        Command.RelationshipCommand[] commands = new Command.RelationshipCommand[]{
                create( new RelationshipRecord( 0 ).initialize( true, NULL, NODE1, NODE3, TYPE, 1, 99, 1, NULL, true, true ) ),
                //                                                                                 ^
                create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE1, NODE2, TYPE, 0, NULL, 1, NULL, false, true ) ),
                //                                                                              ^
                create( new RelationshipRecord( 99 ).initialize( true, NULL, NODE1, NODE2, TYPE, 1, NULL, 1, NULL, true, true ) ),
        };

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( commands ) );
        assertThat( error.getMessage() ).contains( "that doesn't refer back" );
    }

    @Test
    void shouldDetectTargetPrevNotReferringBack()
    {
        // given
        Command.RelationshipCommand[] commands = new Command.RelationshipCommand[]{
                create( new RelationshipRecord( 0 ).initialize( true, NULL, NODE2, NODE3, TYPE, 1, 99, 1, NULL, true, true ) ),
                //                                                                                 ^
                create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE1, NODE2, TYPE, 1, NULL, 0, NULL, true, false ) ),
                //                                                                                       ^
                create( new RelationshipRecord( 99 ).initialize( true, NULL, NODE2, NODE3, TYPE, 1, NULL, 1, NULL, true, true ) ),
        };

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( commands ) );
        assertThat( error.getMessage() ).contains( "that doesn't refer back" );
    }

    @Test
    void shouldDetectSourcePrevHasOtherNodes()
    {
        // given
        Command.RelationshipCommand[] commands = new Command.RelationshipCommand[]{
                create( new RelationshipRecord( 0 ).initialize( true, NULL, NODE1, NODE3, TYPE, 1, NULL, 1, NULL, false, true ) ),
                //                                                            ^                 ^
                create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE2, NODE3, TYPE, 1, NULL, 1, NULL, true, true ) ),
                //                                                            ^      ^
        };

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( commands ) );
        assertThat( error.getMessage() ).contains( "which is a relationship between other nodes" );
    }

    @Test
    void shouldDetectTargetPrevHasOtherNodes()
    {
        // given
        Command.RelationshipCommand[] commands = new Command.RelationshipCommand[]{
                create( new RelationshipRecord( 0 ).initialize( true, NULL, NODE1, NODE3, TYPE, 1, NULL, 1, NULL, true, false ) ),
                //                                                                   ^                   ^
                create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE2, NODE1, TYPE, 1, NULL, 1, NULL, true, true ) ),
                //                                                            ^      ^
        };

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( commands ) );
        assertThat( error.getMessage() ).contains( "which is a relationship between other nodes" );
    }

    // ===== NEXT =====

    @Test
    void shouldDetectSourceNextNotInUse()
    {
        // given
        Command.RelationshipCommand command = create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE1, NODE2, TYPE, 1, 0, 1, NULL, true, true ) );
        //                                                                                                                       ^

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( command ) );
        assertThat( error.getMessage() ).contains( "next refers to unused" );
    }

    @Test
    void shouldDetectTargetNextNotInUse()
    {
        // given
        Command.RelationshipCommand command = create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE1, NODE2, TYPE, 1, NULL, 1, 0, true, true ) );
        //                                                                                                                                ^

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( command ) );
        assertThat( error.getMessage() ).contains( "next refers to unused" );
    }

    @Test
    void shouldDetectSourceNextNotReferringBack()
    {
        // given
        Command.RelationshipCommand[] commands = new Command.RelationshipCommand[]{
                create( new RelationshipRecord( 0 ).initialize( true, NULL, NODE1, NODE2, TYPE, 1, 1, 1, NULL, true, true ) ),
                //                                                                                 ^
                create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE1, NODE2, TYPE, 99, NULL, 1, NULL, false, true ) ),
                //                                                                              ^
                create( new RelationshipRecord( 99 ).initialize( true, NULL, NODE1, NODE2, TYPE, 1, NULL, 1, NULL, true, true ) ),
        };

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( commands ) );
        assertThat( error.getMessage() ).contains( "that doesn't refer back" );
    }

    @Test
    void shouldDetectTargetNextNotReferringBack()
    {
        // given
        Command.RelationshipCommand[] commands = new Command.RelationshipCommand[]{
                create( new RelationshipRecord( 0 ).initialize( true, NULL, NODE1, NODE2, TYPE, 1, NULL, 1, 1, true, true ) ),
                //                                                                                          ^
                create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE1, NODE2, TYPE, 1, NULL, 99, NULL, true, false ) ),
                //                                                                                       ^
                create( new RelationshipRecord( 99 ).initialize( true, NULL, NODE2, NODE3, TYPE, 1, NULL, 1, NULL, true, true ) ),
        };

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( commands ) );
        assertThat( error.getMessage() ).contains( "that doesn't refer back" );
    }

    @Test
    void shouldDetectSourceNextHasOtherNodes()
    {
        // given
        Command.RelationshipCommand[] commands = new Command.RelationshipCommand[]{
                create( new RelationshipRecord( 0 ).initialize( true, NULL, NODE1, NODE2, TYPE, 1, 1, 1, NULL, true, true ) ),
                //                                                            ^                    ^
                create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE2, NODE3, TYPE, 1, NULL, 1, NULL, true, true ) ),
                //                                                            ^      ^
        };

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( commands ) );
        assertThat( error.getMessage() ).contains( "which is a relationship between other nodes" );
    }

    @Test
    void shouldDetectTargetNextHasOtherNodes()
    {
        // given
        Command.RelationshipCommand[] commands = new Command.RelationshipCommand[]{
                create( new RelationshipRecord( 0 ).initialize( true, NULL, NODE1, NODE2, TYPE, 1, NULL, 1, 1, true, true ) ),
                //                                                                   ^                      ^
                create( new RelationshipRecord( 1 ).initialize( true, NULL, NODE1, NODE3, TYPE, 1, NULL, 1, NULL, true, true ) ),
                //                                                            ^      ^
        };

        // when/then
        IllegalStateException error = assertThrows( IllegalStateException.class, () -> apply( commands ) );
        assertThat( error.getMessage() ).contains( "which is a relationship between other nodes" );
    }

    private void apply( Command.RelationshipCommand... commands ) throws Exception
    {
        for ( Command.RelationshipCommand command : commands )
        {
            for ( TransactionApplier applier : appliers )
            {
                applier.visit( command );
            }
        }
        // Close manually here to not wrap the exception
        for ( TransactionApplier applier : appliers )
        {
            applier.close();
        }
    }

    private static Command.RelationshipCommand create( RelationshipRecord relationship )
    {
        return new Command.RelationshipCommand( new RelationshipRecord( relationship.getId() ), relationship );
    }
}
