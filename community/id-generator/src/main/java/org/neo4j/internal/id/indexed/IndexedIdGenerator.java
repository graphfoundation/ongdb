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

import org.apache.commons.lang3.mutable.MutableLong;
import org.eclipse.collections.api.set.ImmutableSet;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.LongSupplier;

import org.neo4j.annotations.documented.ReporterFactory;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.index.internal.gbptree.GBPTreeConsistencyCheckVisitor;
import org.neo4j.index.internal.gbptree.GBPTreeVisitor;
import org.neo4j.index.internal.gbptree.Layout;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.index.internal.gbptree.TreeFileNotFoundException;
import org.neo4j.internal.id.FreeIds;
import org.neo4j.internal.id.IdGenerator;
import org.neo4j.internal.id.IdSlotDistribution;
import org.neo4j.internal.id.IdType;
import org.neo4j.internal.id.IdValidator;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;

import static org.eclipse.collections.impl.block.factory.Comparators.naturalOrder;
import static org.eclipse.collections.impl.factory.Sets.immutable;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.readOnly;
import static org.neo4j.index.internal.gbptree.GBPTree.NO_HEADER_READER;
import static org.neo4j.index.internal.gbptree.GBPTree.NO_HEADER_WRITER;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.io.IOUtils.closeAllUnchecked;
import static org.neo4j.io.pagecache.tracing.PageCacheTracer.NULL;

/**
 * At the heart of this free-list sits a {@link GBPTree}, containing all deleted and freed ids. The tree is used as a bit-set and since it's
 * sorted then it can be later extended to allocate multiple consecutive ids. Another design feature of this free-list is that it's crash-safe,
 * that is if the {@link #marker(CursorContext)} is only used for applying committed data.
 */
public class IndexedIdGenerator implements IdGenerator
{
    public interface Monitor extends AutoCloseable
    {
        void opened( long highestWrittenId, long highId );

        @Override
        void close();

        void allocatedFromHigh( long allocatedId, int numberOfIds );

        void allocatedFromReused( long allocatedId, int numberOfIds );

        void cached( long cachedId, int numberOfIds );

        void markedAsUsed( long markedId, int numberOfIds );

        void markedAsDeleted( long markedId, int numberOfIds );

        void markedAsFree( long markedId, int numberOfIds );

        void markedAsReserved( long markedId, int numberOfIds );

        void markedAsUnreserved( long markedId );

        void markedAsDeletedAndFree( long markedId );

        void markSessionDone();

        void normalized( long idRange );

        void bridged( long bridgedId );

        void checkpoint( long highestWrittenId, long highId );

        void clearingCache();

        void clearedCache();

        void skippedIdsAtHighId( long firstSkippedId, int numberOfIds );

        class Adapter implements Monitor
        {
            @Override
            public void opened( long highestWrittenId, long highId )
            {
            }

            @Override
            public void allocatedFromHigh( long allocatedId, int numberOfIds )
            {
            }

            @Override
            public void allocatedFromReused( long allocatedId, int numberOfIds )
            {
            }

            @Override
            public void cached( long cachedId, int numberOfIds )
            {
            }

            @Override
            public void markedAsUsed( long markedId, int numberOfIds )
            {
            }

            @Override
            public void markedAsDeleted( long markedId, int numberOfIds )
            {
            }

            @Override
            public void markedAsFree( long markedId, int numberOfIds )
            {
            }

            @Override
            public void markedAsReserved( long markedId, int numberOfIds )
            {
            }

            @Override
            public void markedAsUnreserved( long markedId )
            {
            }

            @Override
            public void markedAsDeletedAndFree( long markedId )
            {
            }

            @Override
            public void markSessionDone()
            {
            }

            @Override
            public void normalized( long idRange )
            {
            }

            @Override
            public void bridged( long bridgedId )
            {
            }

            @Override
            public void checkpoint( long highestWrittenId, long highId )
            {
            }

            @Override
            public void clearingCache()
            {
            }

            @Override
            public void clearedCache()
            {
            }

            @Override
            public void skippedIdsAtHighId( long firstSkippedId, int numberOfIds )
            {
            }

            @Override
            public void close()
            {
            }
        }
    }

    public static final Monitor NO_MONITOR = new Monitor.Adapter();

    /**
     * Represents the absence of an id in the id cache.
     */
    static final long NO_ID = -1;

    /**
     * Number of ids per entry in the GBPTree.
     */
    public static final int IDS_PER_ENTRY = 128;

    /**
     * Used for id generators that generally has low activity.
     * 2^8 == 256 and one ID takes up 8B, which results in a memory usage of 256 * 8 = ~2k memory
     */
    static final int SMALL_CACHE_CAPACITY = 1 << 8;

    /**
     * Used for id generators that generally has high activity.
     * 2^14 == 16384 and one ID takes up 8B, which results in a memory usage of 16384 * 8 = ~131k memory
     */
    static final int LARGE_CACHE_CAPACITY = 1 << 14;

    /**
     * First generation the tree entries will start at. Generation will be incremented each time an IndexedIdGenerator is opened,
     * i.e. not for every checkpoint. Generation is used to do lazy normalization of id states, so that DELETED ids from a previous generation
     * looks like FREE in the current session. Updates to tree items (except for recovery) will reset the generation that of the current session.
     */
    private static final long STARTING_GENERATION = 1;

    /**
     * {@link GBPTree} for storing and accessing the id states.
     */
    private final GBPTree<IdRangeKey,IdRange> tree;

    /**
     * Cache of free ids to be handed out from {@link #nextId(CursorContext)}. Populated by {@link FreeIdScanner}.
     */
    private final IdCache cache;

    /**
     * {@link IdType} that this id generator covers.
     */
    private final IdType idType;

    /**
     * Number of ids per {@link IdRange} in the {@link GBPTree}.
     */
    private final int idsPerEntry;

    /**
     * Cache low-watermark when to trigger {@link FreeIdScanner} for refill.
     */
    private final int cacheOptimisticRefillThreshold;

    /**
     * Note about contention: Calls to commitMarker() should be worksync'ed externally and will therefore not contend.
     * This lock is about guarding for calls to reuseMarker(), which comes in at arbitrary times outside transactions.
     */
    private final Lock commitAndReuseLock = new ReentrantLock();

    /**
     * {@link GBPTree} {@link Layout} for this id generator.
     */
    private final IdRangeLayout layout;

    /**
     * Scans the stored ids and places into cache for quick access in {@link #nextId(CursorContext)}.
     */
    private final FreeIdScanner scanner;

    /**
     * High id of this id generator (and to some extent the store this covers).
     */
    private final AtomicLong highId = new AtomicLong();

    /**
     * Maximum id that this id generator can allocate.
     */
    private final long maxId;

    /**
     * Means of communicating whether or not there are stored free ids that {@link FreeIdScanner} could pick up. Is also cleared by
     * {@link FreeIdScanner} as soon as it notices that it has run out of stored free ids.
     */
    private final AtomicBoolean atLeastOneIdOnFreelist = new AtomicBoolean();

    /**
     * Current generation of this id generator. Generation is used to normalize id states so that a deleted id of a previous generation
     * can be seen as free in the current generation. Generation is bumped on restart.
     */
    private final long generation;

    /**
     * Internal state kept between constructor and {@link #start(FreeIds, CursorContext)},
     * whether or not to rebuild the id generator from the supplied {@link FreeIds}.
     */
    private final boolean needsRebuild;

    /**
     * Highest ever written id in this id generator. This is used to not lose track of ids allocated off of high id that are not committed.
     * See more in {@link IdRangeMarker}.
     */
    private final AtomicLong highestWrittenId = new AtomicLong();
    private final Path path;

    /**
     * {@code false} after construction and before a call to {@link IdGenerator#start(FreeIds, CursorContext)},
     * where false means that operations made this freelist
     * is to be treated as recovery operations. After a call to {@link IdGenerator#start(FreeIds, CursorContext)}
     * the operations are to be treated as normal operations.
     */
    private volatile boolean started;

    private final IdRangeMerger defaultMerger;
    private final IdRangeMerger recoveryMerger;
    private final DatabaseReadOnlyChecker readOnlyChecker;

    private final Monitor monitor;
    private final boolean strictlyPrioritizeFreelist;
    private final int biggestSlotSize;

    public IndexedIdGenerator( PageCache pageCache, Path path, RecoveryCleanupWorkCollector recoveryCleanupWorkCollector, IdType idType,
            boolean allowLargeIdCaches, LongSupplier initialHighId, long maxId, DatabaseReadOnlyChecker readOnlyChecker, Config config, String databaseName,
            CursorContext cursorContext, Monitor monitor, ImmutableSet<OpenOption> openOptions, IdSlotDistribution slotDistribution )
    {
        this.path = path;
        this.readOnlyChecker = readOnlyChecker;
        int cacheCapacity = idType.highActivity() && allowLargeIdCaches ? LARGE_CACHE_CAPACITY : SMALL_CACHE_CAPACITY;
        this.idType = idType;
        IdSlotDistribution.Slot[] slots = slotDistribution.slots( cacheCapacity );
        this.cache = new IdCache( slots );
        this.biggestSlotSize = Arrays.stream( slots ).map( IdSlotDistribution.Slot::slotSize ).max( naturalOrder() ).orElseThrow();
        this.maxId = maxId;
        this.monitor = monitor;
        this.defaultMerger = new IdRangeMerger( false, monitor );
        this.recoveryMerger = new IdRangeMerger( true, monitor );

        Optional<HeaderReader> header = readHeader( pageCache, path, databaseName, cursorContext );
        // We check generation here too since we could get into this scenario:
        // 1. start on existing store, but with missing .id file so that it gets created
        // 2. rebuild will happen in start(), but perhaps the db was shut down or killed before or during start()
        // 3. next startup would have said that it wouldn't need rebuild
        this.needsRebuild = header.isEmpty() || header.get().generation == STARTING_GENERATION;
        if ( !needsRebuild )
        {
            // This id generator exists, use the values from its header
            this.highId.set( header.get().highId );
            this.highestWrittenId.set( header.get().highestWrittenId );
            this.generation = header.get().generation + 1;
            this.idsPerEntry = header.get().idsPerEntry;
            // Let's optimistically think assume that there may be some free ids in here. This will ensure that a scan is triggered on first request
            this.atLeastOneIdOnFreelist.set( true );
        }
        else
        {
            // We'll create this index when constructing the GBPTree below. The generation on its creation will be STARTING_GENERATION,
            // as written by the HeaderWriter, but the active generation has to be +1 that
            this.highId.set( initialHighId.getAsLong() );
            this.highestWrittenId.set( highId.get() - 1 );
            this.generation = STARTING_GENERATION + 1;
            this.idsPerEntry = slotDistribution.idsPerEntry();
        }
        monitor.opened( highestWrittenId.get(), highId.get() );

        this.layout = new IdRangeLayout( idsPerEntry );
        this.tree = instantiateTree( pageCache, path, recoveryCleanupWorkCollector, readOnlyChecker, databaseName, openOptions );

        this.strictlyPrioritizeFreelist = config.get( GraphDatabaseInternalSettings.strictly_prioritize_id_freelist );
        this.cacheOptimisticRefillThreshold = strictlyPrioritizeFreelist ? 0 : cacheCapacity / 4;
        this.scanner = new FreeIdScanner( idsPerEntry, tree, layout, cache, atLeastOneIdOnFreelist,
                context -> lockAndInstantiateMarker( true, context ), generation, strictlyPrioritizeFreelist, monitor );
    }

    private GBPTree<IdRangeKey,IdRange> instantiateTree( PageCache pageCache, Path path, RecoveryCleanupWorkCollector recoveryCleanupWorkCollector,
            DatabaseReadOnlyChecker readOnlyChecker, String databaseName, ImmutableSet<OpenOption> openOptions )
    {
        try
        {
            final HeaderWriter headerWriter = new HeaderWriter( highId::get, highestWrittenId::get, STARTING_GENERATION, idsPerEntry );
            return new GBPTree<>( pageCache, path, layout, GBPTree.NO_MONITOR, NO_HEADER_READER, headerWriter, recoveryCleanupWorkCollector, readOnlyChecker,
                    NULL, openOptions, databaseName, "Indexed ID generator" );
        }
        catch ( TreeFileNotFoundException e )
        {
            throw new IllegalStateException(
                    "Id generator file could not be found, most likely this database needs to be recovered, file:" + path, e );
        }
    }

    @Override
    public long nextId( CursorContext cursorContext )
    {
        do
        {
            checkRefillCache( cursorContext );

            long id = cache.takeOrDefault( NO_ID );
            if ( id != NO_ID )
            {
                monitor.allocatedFromReused( id, 1 );
                return id;
            }
        }
        while ( scanner.hasMoreFreeIds( false ) );

        // There was no ID in the cache. This could be that either there are no free IDs in here (the typical case), or a benign
        // race where the cache ran out of IDs and it's very soon filled with more IDs from an ongoing scan. We have made the decision
        // to prioritise performance and so we don't just sit here waiting for an ongoing scan to find IDs (fast as it may be, although it can be I/O bound)
        // so we allocate from highId instead. This make highId slide a little even if there actually are free ids available,
        // but this should be a fairly rare event.
        long id;
        do
        {
            id = highId.getAndIncrement();
            IdValidator.assertIdWithinMaxCapacity( idType, id, maxId );
        }
        while ( IdValidator.isReservedId( id ) );
        monitor.allocatedFromHigh( id, 1 );
        return id;
    }

    @Override
    public long nextConsecutiveIdRange( int numberOfIds, boolean favorSamePage, CursorContext cursorContext )
    {
        if ( numberOfIds <= biggestSlotSize )
        {
            // TODO to fill cache in a do-while would be preferrable here too, but slightly harder since the scanner
            //  may say that there are more free IDs, but there may not actually be more free IDs of the given numberOfIds
            checkRefillCache( cursorContext );
            long id = cache.takeOrDefault( NO_ID, numberOfIds, scanner::queueWastedCachedId );
            if ( id != NO_ID )
            {
                monitor.allocatedFromReused( id, numberOfIds );
                return id;
            }
        }

        long readHighId;
        long endId;
        int skipped;
        long id;
        do
        {
            readHighId = highId.get();
            id = readHighId;
            endId = readHighId + numberOfIds - 1;
            skipped = 0;
            if ( favorSamePage && layout.idRangeIndex( readHighId ) != layout.idRangeIndex( endId ) )
            {
                // The page boundary was crossed. Go to the beginning of the next page
                long newId = layout.idRangeIndex( endId ) * idsPerEntry;
                skipped = (int) (newId - id);
                id = newId;
                endId = id + numberOfIds - 1;
            }
            IdValidator.assertIdWithinMaxCapacity( idType, endId, maxId );
        }
        while ( !highId.compareAndSet( readHighId, endId + 1 ) || IdValidator.hasReservedIdInRange( id, endId + 1 ) );
        monitor.allocatedFromHigh( id, numberOfIds );
        if ( skipped > 0 )
        {
            // Tell FreeIdScanner about this temporary waste?
            // What happens with this "waste" if we do nothing?
            // The IDs will be marked as deleted by the "ID gap bridging", but not marked as free because it's not allowed because of this scenario:
            //  - T1 allocates ID 10 from highId
            //  - T2 allocates ID 11 from highId
            //  - T2 commits and bridges the gap that it sees for ID 10
            //  - T1 commits
            // If the bridging of ID 10 would also mark it as free then there's a chance that the ID scanner would pick up 10 and hand it out
            // before T1 commits.
            // OK, so the skipped IDs will be marked as deleted, but will never be picked up by the ID scanner in this generation/session
            // and therefore temporarily wasted until next restart.
            scanner.queueSkippedHighId( readHighId, skipped );
            monitor.skippedIdsAtHighId( id, numberOfIds );
        }
        return id;
    }

    @Override
    public Marker marker( CursorContext cursorContext )
    {
        if ( !started && needsRebuild )
        {
            // If we're in recovery and know that we're building the id generator from scratch after recovery has completed then don't make any updates
            return NOOP_MARKER;
        }

        return lockAndInstantiateMarker( true, cursorContext );
    }

    IdRangeMarker lockAndInstantiateMarker( boolean bridgeIdGaps, CursorContext cursorContext )
    {
        commitAndReuseLock.lock();
        try
        {
            return new IdRangeMarker( idsPerEntry, layout, tree.unsafeWriter( cursorContext ), commitAndReuseLock,
                    started ? defaultMerger : recoveryMerger,
                    started, atLeastOneIdOnFreelist, generation, highestWrittenId, bridgeIdGaps, monitor );
        }
        catch ( Exception e )
        {
            commitAndReuseLock.unlock();
            throw new RuntimeException( e );
        }
    }

    @Override
    public void close()
    {
        closeAllUnchecked( scanner, tree, monitor );
    }

    @Override
    public long getHighId()
    {
        return highId.get();
    }

    @Override
    public void setHighId( long newHighId )
    {
        // Apparently there's this thing where there's a check that highId is only set if it's higher than the current highId,
        // i.e. highId cannot be set to something lower than it already is. This check is done in the store implementation.
        // But can we rely on it always guarding this, and can this even happen at all? Anyway here's a simple guard for not setting it to something lower.
        long expect;
        do
        {
            expect = highId.get();
        }
        while ( newHighId > expect && !highId.compareAndSet( expect, newHighId ) );
    }

    @Override
    public void start( FreeIds freeIdsForRebuild, CursorContext cursorContext ) throws IOException
    {
        if ( needsRebuild )
        {
            assertNotReadOnly();
            // This id generator was created right now, it needs to be populated with all free ids from its owning store so that it's in sync
            try ( IdRangeMarker idRangeMarker = lockAndInstantiateMarker( false, cursorContext ) )
            {
                // We can mark the ids as free right away since this is before started which means we get the very liberal merger
                long highestId = freeIdsForRebuild.accept( id ->
                {
                    idRangeMarker.markDeleted( id, 1 );
                    idRangeMarker.markFree( id, 1 );
                } );
                highId.set( highestId + 1 );
                highestWrittenId.set( highestId );
            }
            // We can checkpoint here since the free ids we read are committed
            checkpoint( cursorContext );
            atLeastOneIdOnFreelist.set( true );
        }

        started = true;

        // After potentially recovery has been run and everything is prepared to get going let's call maintenance,
        // which will fill the ID buffers right away before any request comes to the db.
        maintenance( cursorContext );
    }

    @Override
    public void checkpoint( CursorContext cursorContext )
    {
        tree.checkpoint( new HeaderWriter( highId::get, highestWrittenId::get, generation, idsPerEntry ), cursorContext );
        monitor.checkpoint( highestWrittenId.get(), highId.get() );
    }

    @Override
    public void maintenance( CursorContext cursorContext )
    {
        if ( !cache.isFull() && !readOnlyChecker.isReadOnly() )
        {
            // We're just helping other allocation requests and avoiding unwanted sliding of highId here
            scanner.tryLoadFreeIdsIntoCache( true, cursorContext );
        }
    }

    private void checkRefillCache( CursorContext cursorContext )
    {
        if ( cache.size() <= cacheOptimisticRefillThreshold )
        {
            // We're just helping other allocation requests and avoiding unwanted sliding of highId here
            scanner.tryLoadFreeIdsIntoCache( false, cursorContext );
        }
    }

    @Override
    public void clearCache( CursorContext cursorContext )
    {
        if ( !readOnlyChecker.isReadOnly() )
        {
            // Make the scanner clear it because it needs to coordinate with the scan lock
            monitor.clearingCache();
            scanner.clearCache( cursorContext );
            monitor.clearedCache();
        }
    }

    @Override
    public long getHighestPossibleIdInUse()
    {
        return getHighId() - 1;
    }

    @Override
    public long getNumberOfIdsInUse()
    {
        return getHighId();
    }

    @Override
    public long getDefragCount()
    {
        // This is only correct up to cache capacity, but this method only seems to be used in tests and those tests only
        // check whether or not this id generator have a small number of ids that it just freed.
        return cache.size();
    }

    /**
     * A peculiar being this one. It's for the import case where all records are written w/o even touching the id generator.
     * When all have been written the id generator is told that it should consider highest written where it's at right now
     * So that it won't mark all ids as deleted on the first write (the id bridging).
     */
    @Override
    public void markHighestWrittenAtHighId()
    {
        assertNotReadOnly();
        this.highestWrittenId.set( highId.get() - 1 );
    }

    @Override
    public long getHighestWritten()
    {
        return highestWrittenId.get();
    }

    public Path path()
    {
        return path;
    }

    /**
     * Reads contents of a header in an existing {@link IndexedIdGenerator}.
     *
     * @param pageCache {@link PageCache} to map id generator in.
     * @param path {@link Path} pointing to the id generator.
     * @param databaseName name of the database id generator belongs to
     * @return {@link Optional} with the data embedded inside the {@link HeaderReader} if the id generator existed and the header was read correctly,
     * otherwise {@link Optional#empty()}.
     */
    private static Optional<HeaderReader> readHeader( PageCache pageCache, Path path, String databaseName, CursorContext cursorContext )
    {
        try
        {
            HeaderReader headerReader = new HeaderReader();
            GBPTree.readHeader( pageCache, path, headerReader, databaseName, cursorContext );
            return Optional.of( headerReader );
        }
        catch ( NoSuchFileException e )
        {
            // That's OK, looks like we're creating this id generator for the first time
            return Optional.empty();
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    /**
     * Dumps the contents of an {@link IndexedIdGenerator} as human-readable text.
     *
     * @param pageCache {@link PageCache} to map id generator in.
     * @param path {@link Path} pointing to the id generator.
     * @param cacheTracer underlying page cache tracer
     * @throws IOException if the file was missing or some other I/O error occurred.
     */
    public static void dump( PageCache pageCache, Path path, PageCacheTracer cacheTracer, boolean onlySummary ) throws IOException
    {
        try ( var cursorContext = new CursorContext( cacheTracer.createPageCursorTracer( "IndexDump" ) ) )
        {
            HeaderReader header = readHeader( pageCache, path, DEFAULT_DATABASE_NAME, cursorContext ).orElseThrow(
                    () -> new NoSuchFileException( path.toAbsolutePath().toString() ) );
            IdRangeLayout layout = new IdRangeLayout( header.idsPerEntry );
            try ( GBPTree<IdRangeKey,IdRange> tree = new GBPTree<>( pageCache, path, layout, GBPTree.NO_MONITOR, NO_HEADER_READER, NO_HEADER_WRITER,
                    immediate(), readOnly(), cacheTracer, immutable.empty(), DEFAULT_DATABASE_NAME, "Indexed ID generator" ) )
            {
                System.out.println( header );
                if ( onlySummary )
                {
                    MutableLong numDeletedNotFreed = new MutableLong();
                    MutableLong numDeletedAndFreed = new MutableLong();
                    System.out.println( "Calculating summary..." );
                    tree.visit( new GBPTreeVisitor.Adaptor<>()
                    {
                        @Override
                        public void value( IdRange value )
                        {
                            for ( int i = 0; i < header.idsPerEntry; i++ )
                            {
                                IdRange.IdState state = value.getState( i );
                                if ( state == IdRange.IdState.FREE )
                                {
                                    numDeletedAndFreed.increment();
                                }
                                else if ( state == IdRange.IdState.DELETED )
                                {
                                    numDeletedNotFreed.increment();
                                }
                            }
                        }
                    }, cursorContext );

                    System.out.println();
                    System.out.println( "Number of IDs deleted and available for reuse: " + numDeletedAndFreed );
                    System.out.println( "Number of IDs deleted, but not yet available for reuse: " + numDeletedNotFreed );
                    System.out.printf(
                            "NOTE: A deleted ID not yet available for reuse is buffered until all transactions that were open%n" +
                            "at the time of its deletion have been closed, or the database is restarted" );
                }
                else
                {
                    tree.visit( new GBPTreeVisitor.Adaptor<>()
                    {
                        private IdRangeKey key;

                        @Override
                        public void key( IdRangeKey key, boolean isLeaf, long offloadId )
                        {
                            this.key = key;
                        }

                        @Override
                        public void value( IdRange value )
                        {
                            long rangeIndex = key.getIdRangeIdx();
                            int idsPerEntry = layout.idsPerEntry();
                            System.out.printf( "%s [rangeIndex: %d, i.e. IDs:%d-%d]%n", value, rangeIndex, rangeIndex * idsPerEntry,
                                    (rangeIndex + 1) * idsPerEntry - 1 );
                        }
                    }, cursorContext );
                }
                System.out.println( header );
            }
        }
    }

    @Override
    public boolean consistencyCheck( ReporterFactory reporterFactory, CursorContext cursorContext )
    {
        return consistencyCheck( reporterFactory.getClass( GBPTreeConsistencyCheckVisitor.class ), cursorContext );
    }

    private boolean consistencyCheck( GBPTreeConsistencyCheckVisitor<IdRangeKey> visitor, CursorContext cursorContext )
    {
        try
        {
            return tree.consistencyCheck( visitor, cursorContext );
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    private void assertNotReadOnly()
    {
        readOnlyChecker.check();
    }

    interface InternalMarker extends Marker
    {
        default void markReserved( long id )
        {
            markReserved( id, 1 );
        }

        void markReserved( long id, int numberOfIds );

        void markUnreserved( long id, int numberOfIds );
    }
}
