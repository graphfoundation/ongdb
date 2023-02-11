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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.util.concurrent.atomic.AtomicBoolean;

import org.neo4j.configuration.Config;
import org.neo4j.internal.id.DefaultIdGeneratorFactory;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.cursor.CachedStoreCursors;
import org.neo4j.kernel.impl.store.record.AbstractBaseRecord;
import org.neo4j.kernel.impl.store.record.RecordLoad;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.test.extension.EphemeralNeo4jLayoutExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.PageCacheSupportExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.store.record.RecordLoad.NORMAL;
import static org.neo4j.test.utils.PageCacheConfig.config;

@EphemeralNeo4jLayoutExtension
abstract class RecordStoreConsistentReadTest<R extends AbstractBaseRecord, S extends RecordStore<R>>
{
    // Constants for the contents of the existing record
    protected static final int ID = 1;
    @RegisterExtension
    static PageCacheSupportExtension pageCacheExtension = new PageCacheSupportExtension( config().withInconsistentReads( false ) );
    @Inject
    private EphemeralFileSystemAbstraction fs;
    @Inject
    private RecordDatabaseLayout databaseLayout;

    private AtomicBoolean nextReadIsInconsistent;

    private NeoStores neoStores;
    private PageCache pageCache;
    protected CachedStoreCursors storeCursors;

    @BeforeEach
    void setUp()
    {
        nextReadIsInconsistent = new AtomicBoolean();
        pageCache = PageCacheSupportExtension.getPageCache( fs, config().withInconsistentReads( nextReadIsInconsistent ) );
        StoreFactory factory =
                new StoreFactory( databaseLayout, Config.defaults(), new DefaultIdGeneratorFactory( fs, immediate(), databaseLayout.getDatabaseName() ),
                        pageCache, fs, NullLogProvider.getInstance(), PageCacheTracer.NULL, writable() );
        neoStores = factory.openAllNeoStores( true );
        storeCursors = new CachedStoreCursors( neoStores, NULL );
        initialiseStore( neoStores );
    }

    @AfterEach
    void tearDown()
    {
        storeCursors.close();
        neoStores.close();
        pageCache.close();
    }

    protected S initialiseStore( NeoStores neoStores )
    {
        S store = getStore( neoStores );
        try ( var cursor = store.openPageCursorForWriting( 0, CursorContext.NULL ) )
        {
            store.updateRecord( createExistingRecord( false ), cursor, CursorContext.NULL, storeCursors );
        }
        return store;
    }

    protected abstract S getStore( NeoStores neoStores );

    protected abstract PageCursor getCursor( StoreCursors storeCursors );

    protected abstract R createNullRecord( long id );

    protected abstract R createExistingRecord( boolean light );

    protected abstract R getLight( long id, S store, PageCursor pageCursor );

    protected abstract void assertRecordsEqual( R actualRecord, R expectedRecord );

    protected R getHeavy( S store, long id, PageCursor pageCursor )
    {
        R record = store.getRecordByCursor( id, store.newRecord(), NORMAL, pageCursor );
        store.ensureHeavy( record, storeCursors );
        return record;
    }

    R getForce( S store, int id, PageCursor pageCursor )
    {
        return store.getRecordByCursor( id, store.newRecord(), RecordLoad.FORCE, pageCursor );
    }

    @Test
    void mustReadExistingRecord()
    {
        S store = getStore( neoStores );
        R record = getHeavy( store, ID, getCursor( storeCursors ) );
        assertRecordsEqual( record, createExistingRecord( false ) );
    }

    @Test
    void mustReadExistingLightRecord()
    {
        S store = getStore( neoStores );
        R record = getLight( ID, store, getCursor( storeCursors ) );
        assertRecordsEqual( record, createExistingRecord( true ) );
    }

    @Test
    void mustForceReadExistingRecord()
    {
        S store = getStore( neoStores );
        R record = getForce( store, ID, getCursor( storeCursors ) );
        assertRecordsEqual( record, createExistingRecord( true ) );
    }

    @Test
    void readingNonExistingRecordMustThrow()
    {
        assertThrows( InvalidRecordException.class, () ->
        {
            S store = getStore( neoStores );
            getHeavy( store, ID + 1, getCursor( storeCursors ) );
        } );
    }

    @Test
    void forceReadingNonExistingRecordMustReturnEmptyRecordWithThatId()
    {
        S store = getStore( neoStores );
        R record = getForce( store, ID + 1, getCursor( storeCursors ) );
        R nullRecord = createNullRecord( ID + 1 );
        assertRecordsEqual( record, nullRecord );
    }

    @Test
    void mustRetryInconsistentReads()
    {
        S store = getStore( neoStores );
        nextReadIsInconsistent.set( true );
        R record = getHeavy( store, ID, getCursor( storeCursors ) );
        assertRecordsEqual( record, createExistingRecord( false ) );
    }

    @Test
    void mustRetryInconsistentLightReads()
    {
        S store = getStore( neoStores );
        nextReadIsInconsistent.set( true );
        R record = getLight( ID, store, getCursor( storeCursors ) );
        assertRecordsEqual( record, createExistingRecord( true ) );
    }

    @Test
    void mustRetryInconsistentForcedReads()
    {
        S store = getStore( neoStores );
        nextReadIsInconsistent.set( true );
        R record = getForce( store, ID, getCursor( storeCursors ) );
        assertRecordsEqual( record, createExistingRecord( true ) );
    }
}
