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
package org.neo4j.internal.id.indexed;

import org.eclipse.collections.api.set.primitive.ImmutableLongSet;
import org.eclipse.collections.api.set.primitive.MutableLongSet;
import org.eclipse.collections.impl.factory.Sets;
import org.eclipse.collections.impl.factory.primitive.LongSets;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.configuration.Config;
import org.neo4j.internal.id.IdGenerator;
import org.neo4j.internal.id.IdGenerator.Marker;
import org.neo4j.internal.id.TestIdType;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.EphemeralPageCacheExtension;
import org.neo4j.test.utils.PageCacheSupport;
import org.neo4j.test.utils.TestDirectory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.internal.id.FreeIds.NO_FREE_IDS;
import static org.neo4j.internal.id.IdSlotDistribution.SINGLE_IDS;
import static org.neo4j.internal.id.indexed.IndexedIdGenerator.NO_MONITOR;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.test.utils.PageCacheConfig.config;

@EphemeralPageCacheExtension
class IndexedIdGeneratorRecoverabilityTest
{
    private static final TestIdType ID_TYPE = TestIdType.TEST;

    private static final String ID_FILE_NAME = "some.id";

    @Inject
    private PageCache pageCache;
    @Inject
    private TestDirectory testDirectory;
    @Inject
    private EphemeralFileSystemAbstraction fs;

    @Test
    void persistHighIdBetweenCleanRestarts()
    {
        try ( IdGenerator freelist = instantiateFreelist() )
        {
            freelist.nextId( NULL );
            assertEquals( 1, freelist.getHighId() );
            freelist.nextId( NULL );
            assertEquals( 2, freelist.getHighId() );
            freelist.checkpoint( NULL );
        }
        try ( IdGenerator freelist = instantiateFreelist() )
        {
            assertEquals( 2, freelist.getHighId() );
        }
    }

    @Test
    void doNotPersistHighIdBetweenCleanRestartsWithoutCheckpoint()
    {
        try ( IdGenerator freelist = instantiateFreelist() )
        {
            freelist.nextId( NULL );
            assertEquals( 1, freelist.getHighId() );
            freelist.nextId( NULL );
            assertEquals( 2, freelist.getHighId() );
        }
        try ( IdGenerator freelist = instantiateFreelist() )
        {
            assertEquals( 0, freelist.getHighId() );
        }
    }

    @Test
    void simpleCrashTest() throws Exception
    {
        final EphemeralFileSystemAbstraction snapshot;
        final long id1;
        final long id2;
        try ( IdGenerator freelist = instantiateFreelist() )
        {
            id1 = freelist.nextId( NULL );
            id2 = freelist.nextId( NULL );
            markUsed( freelist, id1, id2 );
            freelist.checkpoint( NULL );
            markDeleted( freelist, id1, id2 );
            pageCache.flushAndForce();
            snapshot = fs.snapshot();
        }

        try ( PageCache newPageCache = getPageCache( snapshot );
                IdGenerator freelist = instantiateFreelist() )
        {
            markDeleted( freelist, id1, id2 );

            // Recovery is completed ^^^
            freelist.start( NO_FREE_IDS, NULL );
            markFree( freelist, id1, id2 );

            freelist.maintenance( NULL );
            final ImmutableLongSet reused = LongSets.immutable.of( freelist.nextId( NULL ), freelist.nextId( NULL ) );
            assertEquals( LongSets.immutable.of( id1, id2 ), reused, "IDs are not reused" );
        }
        finally
        {
            snapshot.close();
        }
    }

    @Test
    void resetUsabilityOnRestart() throws IOException
    {
        // Create the freelist
        try ( IdGenerator freelist = instantiateFreelist() )
        {
            freelist.checkpoint( NULL );
        }

        final long id1;
        final long id2;
        try ( IdGenerator freelist = instantiateFreelist() )
        {
            id1 = freelist.nextId( NULL );
            id2 = freelist.nextId( NULL );
            markUsed( freelist, id1, id2 );
            markDeleted( freelist, id1, id2 );
            freelist.checkpoint( NULL );
        }

        try ( IdGenerator freelist = instantiateFreelist() )
        {
            freelist.start( NO_FREE_IDS, NULL );
            final ImmutableLongSet reused = LongSets.immutable.of( freelist.nextId( NULL ), freelist.nextId( NULL ) );
            assertEquals( LongSets.immutable.of( id1, id2 ), reused, "IDs are not reused" );
        }
    }

    @Test
    void resetUsabilityOnRestartWithSomeWrites() throws IOException
    {
        // Create the freelist
        try ( IdGenerator freelist = instantiateFreelist() )
        {
            freelist.checkpoint( NULL );
        }

        final long id1;
        final long id2;
        final long id3;
        try ( IdGenerator freelist = instantiateFreelist() )
        {
            id1 = freelist.nextId( NULL );
            id2 = freelist.nextId( NULL );
            id3 = freelist.nextId( NULL );
            markUsed( freelist, id1, id2, id3 );
            markDeleted( freelist, id1, id2 ); // <-- Don't delete id3
            // Intentionally don't mark the ids as reusable
            freelist.checkpoint( NULL );
        }

        try ( IdGenerator freelist = instantiateFreelist() )
        {
            freelist.start( NO_FREE_IDS, NULL );

            // Here we expected that id1 and id2 will be reusable, even if they weren't marked as such in the previous session
            // Making changes to the tree entry where they live will update the generation and all of a sudden the reusable bits
            // in that entry will matter when we want to allocate. This is why we now want to make a change to that tree entry
            // and after that do an allocation to see if we still get them.
            markDeleted( freelist, id3 );

            final ImmutableLongSet reused = LongSets.immutable.of( freelist.nextId( NULL ), freelist.nextId( NULL ) );
            assertEquals( LongSets.immutable.of( id1, id2 ), reused, "IDs are not reused" );
        }
    }

    @Test
    void avoidNormalizationDuringRecovery() throws IOException
    {
        long id;
        long neighbourId;
        try ( IdGenerator freelist = instantiateFreelist() )
        {
            freelist.start( NO_FREE_IDS, NULL );
            id = freelist.nextId( NULL );
            neighbourId = freelist.nextId( NULL );
            markUsed( freelist, id, neighbourId );
            markDeleted( freelist, id, neighbourId );
            // Crash (no checkpoint)
        }

        try ( IdGenerator freelist = instantiateFreelist() )
        {
            // Recovery
            markUsed( freelist, id, neighbourId );
            markDeleted( freelist, id, neighbourId );
            // Neo4j does this on recovery, setHighId and checkpoint
            freelist.setHighId( neighbourId + 1 );
            freelist.checkpoint( NULL ); // mostly to get the generation persisted

            // Normal operations
            freelist.start( NO_FREE_IDS, NULL );
            markFree( freelist, id );
            freelist.maintenance( NULL );
            long idAfterRecovery = freelist.nextId( NULL );
            assertEquals( id, idAfterRecovery );
            markUsed( freelist, id );
        }

        try ( IdGenerator freelist = instantiateFreelist() )
        {
            // Recovery
            // If normalization happens on recovery then this transition, which really should be DELETED (last check-pointed state) -> USED
            // instead becomes normalized from DELETED -> FREE and the real transition becomes FREE -> RESERVED
            markUsed( freelist, id );

            // Normal operations
            freelist.start( NO_FREE_IDS, NULL );
            markDeleted( freelist, id ); // <-- this must be OK

            // And as an extra measure of verification
            markFree( freelist, id );
            MutableLongSet expected = LongSets.mutable.with( id, neighbourId );
            freelist.maintenance( NULL );
            assertTrue( expected.remove( freelist.nextId( NULL ) ) );
            assertTrue( expected.remove( freelist.nextId( NULL ) ) );
            assertTrue( expected.isEmpty() );
        }
    }

    private IndexedIdGenerator instantiateFreelist()
    {
        return new IndexedIdGenerator( pageCache, testDirectory.file( ID_FILE_NAME ), immediate(), ID_TYPE, true, () -> 0, Long.MAX_VALUE, writable(),
                Config.defaults(), DEFAULT_DATABASE_NAME, NULL, NO_MONITOR, Sets.immutable.empty(), SINGLE_IDS );
    }

    private static PageCache getPageCache( FileSystemAbstraction fs )
    {
        return new PageCacheSupport().getPageCache( fs, config() );
    }

    private static void markUsed( IdGenerator freelist, long... ids )
    {
        try ( Marker commitMarker = freelist.marker( NULL ) )
        {
            for ( long id : ids )
            {
                commitMarker.markUsed( id );
            }
        }
    }

    private static void markDeleted( IdGenerator freelist, long... ids )
    {
        try ( Marker commitMarker = freelist.marker( NULL ) )
        {
            for ( long id : ids )
            {
                commitMarker.markDeleted( id );
            }
        }
    }

    private static void markFree( IdGenerator freelist, long... ids )
    {
        try ( Marker reuseMarker = freelist.marker( NULL ) )
        {
            for ( long id : ids )
            {
                reuseMarker.markFree( id );
            }
        }
    }
}
