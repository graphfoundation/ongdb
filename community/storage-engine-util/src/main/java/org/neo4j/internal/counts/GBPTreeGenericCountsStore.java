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
package org.neo4j.internal.counts;

import org.apache.commons.lang3.ArrayUtils;
import org.eclipse.collections.api.set.primitive.MutableLongSet;
import org.eclipse.collections.impl.set.mutable.primitive.LongHashSet;

import java.io.IOException;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import java.util.function.LongConsumer;

import org.neo4j.annotations.documented.ReporterFactory;
import org.neo4j.collection.PrimitiveLongArrayQueue;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.counts.CountsStorage;
import org.neo4j.counts.InvalidCountException;
import org.neo4j.exceptions.UnderlyingStorageException;
import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.index.internal.gbptree.GBPTreeConsistencyCheckVisitor;
import org.neo4j.index.internal.gbptree.GBPTreeVisitor;
import org.neo4j.index.internal.gbptree.MetadataMismatchException;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.index.internal.gbptree.Seeker;
import org.neo4j.index.internal.gbptree.TreeFileNotFoundException;
import org.neo4j.index.internal.gbptree.Writer;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.util.concurrent.ArrayQueueOutOfOrderSequence;
import org.neo4j.util.concurrent.OutOfOrderSequence;

import static org.eclipse.collections.api.factory.Sets.immutable;
import static org.neo4j.collection.PrimitiveLongCollections.EMPTY_LONG_ARRAY;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.readOnly;
import static org.neo4j.internal.counts.CountsChanges.ABSENT;
import static org.neo4j.internal.counts.CountsKey.MAX_STRAY_TX_ID;
import static org.neo4j.internal.counts.CountsKey.MIN_STRAY_TX_ID;
import static org.neo4j.internal.counts.CountsKey.strayTxId;
import static org.neo4j.io.IOUtils.closeAllUnchecked;
import static org.neo4j.io.pagecache.tracing.PageCacheTracer.NULL;
import static org.neo4j.storageengine.api.TransactionIdStore.BASE_TX_ID;
import static org.neo4j.util.Preconditions.checkState;

/**
 * A "counts store" backed by {@link GBPTree}. It solves the problem of incrementing/decrementing counts for arbitrary keys, while at the same time
 * being persistent and minimizing contention from concurrent writers.
 *
 * Updates that are {@link #updater(long, CursorContext) applied} are relative values (e.g. +10 or -5) and counts are read as their absolute values.
 * Multiple transactions can update counts concurrently where counts are CAS:ed to minimize contention.
 * Updates between {@link #checkpoint(CursorContext) checkpoints} are kept in an internal {@link CountsChanges} map and only written
 * as part of a checkpoint. Checkpoint has a very short critical section where it switches over to a new {@link CountsChanges} instance
 * and also snapshots data about which transactions have applied before letting updaters continue to make changes while the checkpointing thread
 * writes the changes to the backing tree concurrently.
 *
 * Data flow wise updates are accumulated and written in each checkpoint. Reads are served from the tree or directly from {@link CountsChanges}
 * if there's changes to that particular key.
 */
public class GBPTreeGenericCountsStore implements CountsStorage
{
    public static final Monitor NO_MONITOR = txId -> {};
    private static final long NEEDS_REBUILDING_HIGH_ID = 0;
    private static final String OPEN_COUNT_STORE_TAG = "openCountStore";
    static final long INVALID_COUNT = -1;

    protected final GBPTree<CountsKey,CountsValue> tree;
    private final OutOfOrderSequence idSequence;
    /**
     * Guards interaction between checkpoint (write-lock) and transactions (read-lock).
     */
    private final ReadWriteLock lock = new ReentrantReadWriteLock( true );
    protected final CountsLayout layout = new CountsLayout();
    private final Rebuilder rebuilder;
    private final boolean needsRebuild;
    private final DatabaseReadOnlyChecker readOnlyChecker;
    private final String name;
    private final Monitor monitor;
    private final String databaseName;
    private final int maxCacheSize;
    private final int highMarkCacheSize;
    protected volatile CountsChanges changes = new CountsChanges();
    private final TxIdInformation txIdInformation;
    private final LogProvider userLogProvider;
    private volatile boolean started;

    public GBPTreeGenericCountsStore( PageCache pageCache, Path file, FileSystemAbstraction fileSystem, RecoveryCleanupWorkCollector recoveryCollector,
            Rebuilder rebuilder, DatabaseReadOnlyChecker readOnlyChecker, String name, PageCacheTracer pageCacheTracer, Monitor monitor, String databaseName,
            int maxCacheSize, LogProvider userLogProvider ) throws IOException
    {
        this.userLogProvider = userLogProvider;
        this.readOnlyChecker = readOnlyChecker;
        this.name = name;
        this.monitor = monitor;
        this.databaseName = databaseName;
        this.maxCacheSize = maxCacheSize;
        this.highMarkCacheSize = (int) (maxCacheSize * 0.8);
        this.rebuilder = rebuilder;

        // First just read the header so that we can avoid creating it if this store is read-only
        CountsHeader header = new CountsHeader( NEEDS_REBUILDING_HIGH_ID );
        GBPTree<CountsKey,CountsValue> instantiatedTree;
        try
        {
            instantiatedTree = instantiateTree( pageCache, file, recoveryCollector, readOnlyChecker, header, pageCacheTracer );
        }
        catch ( MetadataMismatchException e )
        {
            // Corrupt, delete and rebuild
            fileSystem.deleteFileOrThrow( file );
            header = new CountsHeader( NEEDS_REBUILDING_HIGH_ID );
            instantiatedTree = instantiateTree( pageCache, file, recoveryCollector, readOnlyChecker, header, pageCacheTracer );
        }
        this.tree = instantiatedTree;
        boolean successful = false;
        try ( var cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( OPEN_COUNT_STORE_TAG ) ) )
        {
            this.txIdInformation = readTxIdInformation( header.highestGapFreeTxId(), cursorContext );
            // Recreate the tx id state as it was from last checkpoint (or base if empty)
            this.idSequence = new ArrayQueueOutOfOrderSequence( txIdInformation.highestGapFreeTxId, 200, EMPTY_LONG_ARRAY );
            this.txIdInformation.strayTxIds.forEach( txId -> idSequence.offer( txId, EMPTY_LONG_ARRAY ) );
            // Only care about initial counts rebuilding if the tree was created right now when opening this tree
            // The actual rebuilding will happen in start()
            this.needsRebuild = !header.wasRead() || header.highestGapFreeTxId() == NEEDS_REBUILDING_HIGH_ID;
            successful = true;
        }
        finally
        {
            if ( !successful )
            {
                closeAllUnchecked( tree );
            }
        }
    }

    private GBPTree<CountsKey,CountsValue> instantiateTree( PageCache pageCache, Path file, RecoveryCleanupWorkCollector recoveryCollector,
            DatabaseReadOnlyChecker readOnlyChecker, CountsHeader header, PageCacheTracer pageCacheTracer )
    {
        try
        {
            return new GBPTree<>( pageCache, file, layout, GBPTree.NO_MONITOR, header, header, recoveryCollector, readOnlyChecker, pageCacheTracer,
                    immutable.empty(), databaseName, name );
        }
        catch ( TreeFileNotFoundException e )
        {
            throw new IllegalStateException(
                    "Counts store file could not be found, most likely this database needs to be recovered, file:" + file, e );
        }
    }

    // === Life cycle ===

    @Override
    public void start( CursorContext cursorContext, StoreCursors storeCursors, MemoryTracker memoryTracker ) throws IOException
    {
        // Execute the initial counts building if we need to, i.e. if instantiation of this counts store had to create it
        if ( needsRebuild || rebuilder.lastCommittedTxId() != idSequence.getHighestGapFreeNumber() )
        {
            checkState( !readOnlyChecker.isReadOnly(), "Counts store needs rebuilding, most likely this database needs to be recovered." );
            try ( CountUpdater updater = directUpdater( false, cursorContext ) )
            {
                rebuilder.rebuild( updater, cursorContext, memoryTracker );
            }
            finally
            {
                idSequence.set( rebuilder.lastCommittedTxId(), ArrayUtils.EMPTY_LONG_ARRAY );
            }
        }
        started = true;
    }

    @Override
    public void close()
    {
        closeAllUnchecked( tree );
    }

    // === Writes ===

    protected CountUpdater updater( long txId, CursorContext cursorContext )
    {
        // In order to keep the cache limited then check if we need to flush to the tree
        if ( txId % 10 == 0 )
        {
            // Although it's somewhat costly to check map size so only do it every N transaction.
            checkCacheSizeAndPotentiallyFlush( cursorContext );
        }

        Lock lock = lock( this.lock.readLock() );

        boolean alreadyApplied = txIdInformation.txIdIsAlreadyApplied( txId );
        // Why have this check below? Why should we not apply transactions before started when we have an initial counts builder?
        // Consider the following scenario:
        // - Create node N
        // - Checkpoint
        // - Delete node N
        // - Crash
        // - Delete counts store
        // - Startup, where recovery starts
        // - Recovery replays deletion of N
        // - After recovery the counts store is rebuilt from scratch
        //
        // The deletion of N on the empty counts store would have resulted in a count of -1, which is not OK to write to the tree,
        // since there can never be a negative amount of, say nodes. The counts store will be rebuilt after recovery anyway,
        // so ignore these transactions.
        boolean inRecoveryOnEmptyCountsStore = needsRebuild && !started;
        if ( alreadyApplied || inRecoveryOnEmptyCountsStore )
        {
            lock.unlock();
            monitor.ignoredTransaction( txId );
            return null;
        }
        return new CountUpdater( new MapWriter( key -> readCountFromTree( key, cursorContext ), changes, idSequence, txId ), lock );
    }

    /**
     * Opens and returns a {@link CountUpdater} which makes direct insertions into the backing tree. This comes from the use case of having a way
     * to build the initial data set without the context of transactions, such as batch-insertion or initial import.
     *
     * @param applyDeltas if {@code true} the writer will apply the changes as deltas, which means reading from the tree.
     * If {@code false} all changes will be written as-is, i.e. as if they are absolute counts.
     */
    protected CountUpdater directUpdater( boolean applyDeltas, CursorContext cursorContext ) throws IOException
    {
        boolean success = false;
        Lock lock = this.lock.writeLock();
        lock.lock();
        try
        {
            CountUpdater.CountWriter writer = applyDeltas
                    ? new DeltaTreeWriter( () -> tree.writer( cursorContext ), key -> readCountFromTree( key, cursorContext ), layout, maxCacheSize,
                    userLogProvider )
                    : new TreeWriter( tree.writer( cursorContext ), userLogProvider );
            CountUpdater updater = new CountUpdater( writer, lock );
            success = true;
            return updater;
        }
        finally
        {
            if ( !success )
            {
                lock.unlock();
            }
        }
    }

    @Override
    public void checkpoint( CursorContext cursorContext ) throws IOException
    {
        try ( CriticalSection criticalSection = new CriticalSection( lock ) )
        {
            criticalSection.acquireExclusive();
            // Take a snapshot of applied transactions while in the exclusive critical section (but write it later, no need to write it under the lock)
            OutOfOrderSequence.Snapshot txIdSnapshot = idSequence.snapshot();
            writeChangesToTreeAndSwitchToSharedCriticalSection( criticalSection, cursorContext );

            // Write transaction information to the tree and checkpoint while still in the shared critical section
            updateTxIdInformationInTree( txIdSnapshot, cursorContext );
            tree.checkpoint( new CountsHeader( txIdSnapshot.highestGapFree()[0] ), cursorContext );
        }
    }

    private void checkCacheSizeAndPotentiallyFlush( CursorContext cursorContext )
    {
        int cacheSize = changes.size();
        if ( cacheSize > highMarkCacheSize )
        {
            try ( CriticalSection criticalSection = new CriticalSection( lock ) )
            {
                // The cache is getting big, try to get a write lock to flush the changes. If we can't get it then give up and let someone else try later.
                // Reasons for waiting for this lock could be:
                // - Another thread is flushing changes (in which case this updater would need to wait anyway)
                // - Other threads are making updates as we speak (more likely)
                if ( !criticalSection.tryAcquireExclusive() && cacheSize > maxCacheSize )
                {
                    // Although if the write pressure is really high then flushing may be starved so if the cache is much bigger then acquire the lock blocking
                    criticalSection.acquireExclusive();
                }

                if ( criticalSection.hasExclusive() && changes.size() > maxCacheSize )
                {
                    try
                    {
                        writeChangesToTreeAndSwitchToSharedCriticalSection( criticalSection, cursorContext );
                    }
                    catch ( IOException e )
                    {
                        throw new UncheckedIOException( e );
                    }
                }
            }
        }
    }

    private void writeChangesToTreeAndSwitchToSharedCriticalSection( CriticalSection criticalSection, CursorContext cursorContext ) throws IOException
    {
        criticalSection.acquireShared();
        CountsChanges changesToWrite;
        try
        {
            // Take the changes and instantiate a new map for other updates to apply to after we release this lock
            changesToWrite = changes;
            changes = changes.freezeAndFork();
        }
        finally
        {
            // The exclusive part of the critical section is completed, release that lock so that updaters can commence applying updates
            criticalSection.releaseExclusive();
        }

        // Now write all the things to the tree in the shared critical section
        writeCountsChanges( changesToWrite, cursorContext );
        changes.clearPreviousChanges();
    }

    private void writeCountsChanges( CountsChanges changes, CursorContext cursorContext ) throws IOException
    {
        try ( TreeWriter writer = new TreeWriter( tree.unsafeWriter( cursorContext ), userLogProvider ) )
        {
            // Sort the entries in the natural tree order to get more performance in the writer
            changes.sortedChanges( layout ).forEach( entry -> writer.write( entry.getKey(), entry.getValue().get() ) );
        }
    }

    private void updateTxIdInformationInTree( OutOfOrderSequence.Snapshot txIdSnapshot, CursorContext cursorContext ) throws IOException
    {
        PrimitiveLongArrayQueue strayIds = new PrimitiveLongArrayQueue();
        visitStrayTxIdsInTree( strayIds::enqueue, cursorContext );

        try ( Writer<CountsKey,CountsValue> writer = tree.unsafeWriter( cursorContext ) )
        {
            // First clear all the stray ids from the previous checkpoint
            CountsValue value = new CountsValue();
            while ( !strayIds.isEmpty() )
            {
                long strayTxId = strayIds.dequeue();
                writer.remove( strayTxId( strayTxId ) );
            }

            // And write all stray txIds into the tree
            value.initialize( 0 );
            long[][] strayTxIds = txIdSnapshot.idsOutOfOrder();
            for ( long[] strayTxId : strayTxIds )
            {
                long txId = strayTxId[0];
                writer.put( strayTxId( txId ), value );
            }
        }
    }

    // === Reads ===

    public long txId()
    {
        return idSequence.getHighestGapFreeNumber();
    }

    protected long read( CountsKey key, CursorContext cursorContext )
    {
        long changedCount = changes.get( key );
        return changedCount != ABSENT ? changedCount : readCountFromTree( key, cursorContext );
    }

    public void visitAllCounts( CountVisitor visitor, CursorContext cursorContext )
    {
        // First visit the changes that we haven't check-pointed yet
        for ( Map.Entry<CountsKey,AtomicLong> changedEntry : changes.sortedChanges( layout ) )
        {
            // Our simplistic approach to the changes map makes it contain 0 counts at times, we don't remove entries from it
            if ( changedEntry.getValue().get() != 0 )
            {
                visitor.visit( changedEntry.getKey(), changedEntry.getValue().get() );
            }
        }

        // Then visit the remaining stored changes from the last check-point
        try ( Seeker<CountsKey,CountsValue> seek = tree.seek( CountsKey.MIN_COUNT, CountsKey.MAX_COUNT, cursorContext ) )
        {
            while ( seek.next() )
            {
                CountsKey key = seek.key();
                if ( !changes.containsChange( key ) )
                {
                    visitor.visit( key, seek.value().count );
                }
            }
        }
        catch ( IOException e )
        {
            throw new UnderlyingStorageException( e );
        }
    }

    /**
     * Read the count from the store. For writes this is done on an unchanging tree because we have the read lock where check-pointing
     * (where changes are written to the tree) can only be done if the write-lock is acquired. For plain unmodified reads this is read from the tree
     * without a lock, which is fine and follows general transaction isolation guarantees.
     * @param key count value to read from the tree.
     * @return AtomicLong with the read count, or initialized to 0 if the count didn't exist in the tree.
     */
    private long readCountFromTree( CountsKey key, CursorContext cursorContext )
    {
        try ( Seeker<CountsKey,CountsValue> seek = tree.seek( key, key, cursorContext ) )
        {
            if ( !seek.next() )
            {
                return 0;
            }

            if ( seek.value().count == INVALID_COUNT )
            {
                throw new InvalidCountException( "The count value for key '" + key + "' is invalid. " +
                        "This is a serious error which is typically caused by a store corruption" );
            }

            return seek.value().count;
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    private void visitStrayTxIdsInTree( LongConsumer visitor, CursorContext cursorContext ) throws IOException
    {
        try ( Seeker<CountsKey,CountsValue> seek = tree.seek( MIN_STRAY_TX_ID, MAX_STRAY_TX_ID, cursorContext ) )
        {
            while ( seek.next() )
            {
                visitor.accept( seek.key().first );
            }
        }
    }

    private TxIdInformation readTxIdInformation( long highestGapFreeTxId, CursorContext cursorContext ) throws IOException
    {
        MutableLongSet strayTxIds = new LongHashSet();
        visitStrayTxIdsInTree( strayTxIds::add, cursorContext );
        return new TxIdInformation( highestGapFreeTxId, strayTxIds );
    }

    private static Lock lock( Lock lock )
    {
        lock.lock();
        return lock;
    }

    @Override
    public boolean consistencyCheck( ReporterFactory reporterFactory, CursorContext cursorContext )
    {
        return consistencyCheck( reporterFactory.getClass( GBPTreeConsistencyCheckVisitor.class ), cursorContext );
    }

    private boolean consistencyCheck( GBPTreeConsistencyCheckVisitor<CountsKey> visitor, CursorContext cursorContext )
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

    /**
     * Dumps the contents of a counts store.
     *
     * @param pageCache {@link PageCache} to use to map the counts store file into.
     * @param file {@link Path} pointing out the counts store.
     * @param out to print to.
     * @param databaseName name of the database tree belongs to.
     * @param name of the {@link GBPTree}.
     * @param cursorContext tracer for page cache access.
     * @param keyToString function for generating proper descriptions of the keys.
     * @throws IOException on missing file or I/O error.
     */
    protected static void dump( PageCache pageCache, Path file, PrintStream out, String databaseName, String name, CursorContext cursorContext,
            Function<CountsKey,String> keyToString ) throws IOException
    {
        // First check if it even exists as we don't really want to create it as part of dumping it. readHeader will throw if not found
        CountsHeader header = new CountsHeader( BASE_TX_ID );
        GBPTree.readHeader( pageCache, file, header, databaseName, cursorContext );

        // Now open it and dump its contents
        try ( GBPTree<CountsKey,CountsValue> tree = new GBPTree<>( pageCache, file, new CountsLayout(), GBPTree.NO_MONITOR, header, GBPTree.NO_HEADER_WRITER,
                RecoveryCleanupWorkCollector.ignore(), readOnly(), NULL, immutable.empty(), databaseName, name ) )
        {
            out.printf( "Highest gap-free txId: %d%n", header.highestGapFreeTxId() );
            tree.visit( new GBPTreeVisitor.Adaptor<>()
            {
                private CountsKey key;

                @Override
                public void key( CountsKey key, boolean isLeaf, long offloadId )
                {
                    this.key = key;
                }

                @Override
                public void value( CountsValue value )
                {
                    out.printf( "%s = %d%n", keyToString.apply( key ), value.count );
                }
            }, cursorContext );
        }
    }

    public interface Monitor
    {
        void ignoredTransaction( long txId );
    }

    public interface Rebuilder
    {
        long lastCommittedTxId();

        /**
         * @param updater the updater to write the counts into. Note: the updater will write all counts as absolute.
         */
        void rebuild( CountUpdater updater, CursorContext cursorContext, MemoryTracker memoryTracker );
    }

    public interface CountVisitor
    {
        void visit( CountsKey key, long count );
    }

    public static final Rebuilder EMPTY_REBUILD = new Rebuilder()
    {
        @Override
        public long lastCommittedTxId()
        {
            return BASE_TX_ID;
        }

        @Override
        public void rebuild( CountUpdater updater, CursorContext cursorContext, MemoryTracker memoryTracker )
        {
        }
    };

    /**
     * Lock logic for the critical section which writes changes to the tree. The critical section has two parts to it: one that blocks all other threads,
     * and another after that which blocks other critical sections, like so:
     *
     * <pre>
     * A time flow over the critical section:
     *
     *   UUU---UU-UUUU|E|SSSSS|-UU-UU...
     *   --UUU-UU--UU-| |UU-UUU--UUU-...
     *   UU-UUUU---UUU| |--UUUU-UU-UU...
     *   .....
     *
     * U: updater, i.e. {@link CountUpdater updaters} can be active here and make updates.
     * E: exclusive critical section, where only a single thread can be, the one making the switch to a new {@link CountsChanges}.
     * S: shared critical section, where only a single thread writing changes to the tree can be, but also other updaters.
     * </pre>
     *
     * First the exclusive lock is acquired. This is a fair lock and will wait for currently applying transactions (and potentially other critical section)
     * to finish. This could potentially block appliers around this point since they will respect the fairness too.
     * The good thing is that the exclusive section is held very very briefly.
     * Then the shared lock is acquired and held until the writing is done. For checkpointing this also includes doing checkpoint on the tree.
     * This will prevent others from entering another critical section, but still allow writers to make updates (once the exclusive lock has been released)
     */
    private static class CriticalSection implements AutoCloseable
    {
        private final ReadWriteLock lock;
        private boolean exclusive;
        private boolean shared;

        private CriticalSection( ReadWriteLock lock )
        {
            this.lock = lock;
        }

        boolean tryAcquireExclusive()
        {
            assert !exclusive && !shared;
            return exclusive = lock.writeLock().tryLock();
        }

        void acquireExclusive()
        {
            assert !exclusive && !shared;
            lock.writeLock().lock();
            exclusive = true;
        }

        void acquireShared()
        {
            assert exclusive && !shared;
            lock.readLock().lock();
            shared = true;
        }

        void releaseExclusive()
        {
            assert exclusive;
            lock.writeLock().unlock();
            exclusive = false;
        }

        @Override
        public void close()
        {
            if ( shared )
            {
                lock.readLock().unlock();
                shared = false;
            }
            if ( exclusive )
            {
                lock.writeLock().unlock();
                exclusive = false;
            }
        }

        boolean hasExclusive()
        {
            return exclusive;
        }
    }
}
