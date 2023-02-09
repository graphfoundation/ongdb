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
package org.neo4j.kernel.impl.index.schema;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.index.internal.gbptree.Writer;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.index.IndexPopulator;
import org.neo4j.kernel.api.index.IndexSample;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.kernel.api.index.UniqueIndexSampler;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.NodePropertyAccessor;
import org.neo4j.storageengine.api.ValueIndexEntryUpdate;
import org.neo4j.util.Preconditions;
import org.neo4j.values.storable.Value;

import static org.neo4j.index.internal.gbptree.GBPTree.NO_HEADER_WRITER;

/**
 * {@link IndexPopulator} backed by a {@link GBPTree}.
 *
 * @param <KEY> type of {@link NativeIndexKey}.
 */
public abstract class NativeIndexPopulator<KEY extends NativeIndexKey<KEY>>
        extends NativeIndex<KEY> implements IndexPopulator, ConsistencyCheckable
{
    public static final byte BYTE_FAILED = 0;
    static final byte BYTE_ONLINE = 1;
    static final byte BYTE_POPULATING = 2;
    protected final IndexUpdateIgnoreStrategy ignoreStrategy;

    private final KEY treeKey;
    private final UniqueIndexSampler uniqueSampler;

    private ConflictDetectingValueMerger<KEY,Value[]> mainConflictDetector;
    private ConflictDetectingValueMerger<KEY,Value[]> updatesConflictDetector;

    private byte[] failureBytes;
    private boolean dropped;
    private boolean closed;

    NativeIndexPopulator( DatabaseIndexContext databaseIndexContext, IndexFiles indexFiles, IndexLayout<KEY> layout,
            IndexDescriptor descriptor )
    {
        super( databaseIndexContext, layout, indexFiles, descriptor );
        this.treeKey = layout.newKey();
        this.uniqueSampler = descriptor.isUnique() ? new UniqueIndexSampler() : null;
        this.ignoreStrategy = indexUpdateIgnoreStrategy();
    }

    abstract NativeIndexReader<KEY> newReader();

    /**
     * {@link IndexUpdateIgnoreStrategy Ignore strategy} to be used by index updater.
     * Sub-classes are expected to override this method if they want to use something
     * other than {@link IndexUpdateIgnoreStrategy#NO_IGNORE}.
     * @return {@link IndexUpdateIgnoreStrategy} to be used by index updater.
     */
    protected IndexUpdateIgnoreStrategy indexUpdateIgnoreStrategy()
    {
        return IndexUpdateIgnoreStrategy.NO_IGNORE;
    }

    @Override
    public synchronized void create() throws IOException
    {
        assertNotDropped();
        assertNotClosed();

        indexFiles.clear();
        NativeIndexHeaderWriter headerWriter = new NativeIndexHeaderWriter( BYTE_POPULATING );
        instantiateTree( RecoveryCleanupWorkCollector.immediate(), headerWriter );

        // true:  tree uniqueness is (value,entityId)
        // false: tree uniqueness is (value) <-- i.e. more strict
        mainConflictDetector = new ThrowingConflictDetector<>( !descriptor.isUnique() );
        // for updates we have to have uniqueness on (value,entityId) to allow for intermediary violating updates.
        // there are added conflict checks after updates have been applied.
        updatesConflictDetector = new ThrowingConflictDetector<>( true );
    }

    @Override
    public synchronized void drop()
    {
        try
        {
            if ( tree != null )
            {
                tree.setDeleteOnClose( true );
            }
            closeTree();
            indexFiles.clear();
        }
        finally
        {
            dropped = true;
            closed = true;
        }
    }

    @Override
    public void add( Collection<? extends IndexEntryUpdate<?>> updates, CursorContext cursorContext ) throws IndexEntryConflictException
    {
        processUpdates( updates, mainConflictDetector, cursorContext );
    }

    @Override
    public void verifyDeferredConstraints( NodePropertyAccessor nodePropertyAccessor )
    {
        // No-op, uniqueness is checked for each update in add(IndexEntryUpdate)
    }

    @Override
    public IndexUpdater newPopulatingUpdater( NodePropertyAccessor accessor, CursorContext cursorContext )
    {
        return newPopulatingUpdater( cursorContext );
    }

    IndexUpdater newPopulatingUpdater( CursorContext cursorContext )
    {
        IndexUpdater updater = new CollectingIndexUpdater( updates -> processUpdates( updates, updatesConflictDetector, cursorContext ) );
        if ( descriptor.isUnique() )
        {
            // The index population detects conflicts on the fly, however for updates coming in we're in a position
            // where we cannot detect conflicts while applying, but instead afterwards.
            updater = new DeferredConflictCheckingIndexUpdater( updater, this::newReader, descriptor, cursorContext );
        }
        return updater;
    }

    @Override
    public synchronized void close( boolean populationCompletedSuccessfully, CursorContext cursorContext )
    {
        if ( populationCompletedSuccessfully && failureBytes != null )
        {
            throw new IllegalStateException( "Can't mark index as online after it has been marked as failure" );
        }

        try
        {
            assertNotDropped();
            if ( populationCompletedSuccessfully )
            {
                // Successful and completed population
                assertPopulatorOpen();
                flushTreeAndMarkAs( BYTE_ONLINE, cursorContext );
            }
            else if ( failureBytes != null )
            {
                // Failed population
                ensureTreeInstantiated();
                markTreeAsFailed( cursorContext );
            }
            // else cancelled population. Here we simply close the tree w/o checkpointing it and it will look like POPULATING state on next open
        }
        finally
        {
            closeTree();
            closed = true;
        }
    }

    @Override
    public void markAsFailed( String failure )
    {
        failureBytes = failure.getBytes( StandardCharsets.UTF_8 );
    }

    @Override
    public void includeSample( IndexEntryUpdate<?> update )
    {
        if ( descriptor.isUnique() )
        {
            updateUniqueSample( update );
        }
        // else don't do anything here, we'll do a scan in the end instead
    }

    @Override
    public IndexSample sample( CursorContext cursorContext )
    {
        if ( descriptor.isUnique() )
        {
            return uniqueSampler.result();
        }
        return buildNonUniqueIndexSample( cursorContext );
    }

    void flushTreeAndMarkAs( byte state, CursorContext cursorContext )
    {
        tree.checkpoint( new NativeIndexHeaderWriter( state ), cursorContext );
    }

    IndexSample buildNonUniqueIndexSample( CursorContext cursorContext )
    {
        return new FullScanNonUniqueIndexSampler<>( tree, layout ).sample( cursorContext );
    }

    private void markTreeAsFailed( CursorContext cursorContext )
    {
        Preconditions.checkState( failureBytes != null, "markAsFailed hasn't been called, populator not actually failed?" );
        tree.checkpoint( new FailureHeaderWriter( failureBytes ), cursorContext );
    }

    private void processUpdates( Iterable<? extends IndexEntryUpdate<?>> indexEntryUpdates, ConflictDetectingValueMerger<KEY,Value[]> conflictDetector,
            CursorContext cursorContext ) throws IndexEntryConflictException
    {
        try ( Writer<KEY,NullValue> writer = tree.writer( cursorContext ) )
        {
            for ( IndexEntryUpdate<?> indexEntryUpdate : indexEntryUpdates )
            {
                NativeIndexUpdater.processUpdate( treeKey, (ValueIndexEntryUpdate<?>) indexEntryUpdate, writer, conflictDetector, ignoreStrategy );
            }
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    private void updateUniqueSample( IndexEntryUpdate<?> update )
    {
        switch ( update.updateMode() )
        {
        case ADDED:
            uniqueSampler.increment( 1 );
            break;
        case REMOVED:
            uniqueSampler.increment( -1 );
            break;
        case CHANGED:
            break;
        default:
            throw new IllegalArgumentException( "Unsupported update mode type:" + update.updateMode() );
        }
    }

    private void assertNotDropped()
    {
        if ( dropped )
        {
            throw new IllegalStateException( "Populator has already been dropped." );
        }
    }

    private void assertNotClosed()
    {
        if ( closed )
        {
            throw new IllegalStateException( "Populator has already been closed." );
        }
    }

    private void ensureTreeInstantiated()
    {
        if ( tree == null )
        {
            instantiateTree( RecoveryCleanupWorkCollector.ignore(), NO_HEADER_WRITER );
        }
    }

    private void assertPopulatorOpen()
    {
        if ( tree == null )
        {
            throw new IllegalStateException( "Populator has already been closed." );
        }
    }
}
