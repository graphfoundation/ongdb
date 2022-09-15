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
package org.neo4j.kernel.impl.index.schema.fusion;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.neo4j.annotations.documented.ReporterFactory;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.internal.helpers.collection.BoundedIterable;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.index.IndexAccessor;
import org.neo4j.kernel.api.index.IndexConfigProvider;
import org.neo4j.kernel.api.index.IndexEntriesReader;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.kernel.api.index.ValueIndexReader;
import org.neo4j.kernel.impl.api.index.IndexUpdateMode;
import org.neo4j.kernel.impl.index.schema.IndexFiles;
import org.neo4j.storageengine.api.NodePropertyAccessor;
import org.neo4j.values.storable.Value;

import static org.neo4j.internal.helpers.collection.Iterators.concatResourceIterators;

class FusionIndexAccessor extends FusionIndexBase<IndexAccessor> implements IndexAccessor
{
    private final IndexDescriptor descriptor;
    private final IndexFiles indexFiles;

    FusionIndexAccessor( SlotSelector slotSelector,
            InstanceSelector<IndexAccessor> instanceSelector,
            IndexDescriptor descriptor,
            IndexFiles indexFiles )
    {
        super( slotSelector, instanceSelector );
        this.descriptor = descriptor;
        this.indexFiles = indexFiles;
    }

    @Override
    public void drop()
    {
        instanceSelector.forAll( IndexAccessor::drop );
        indexFiles.clear();
    }

    @Override
    public IndexUpdater newUpdater( IndexUpdateMode mode, CursorContext cursorContext )
    {
        LazyInstanceSelector<IndexUpdater> updaterSelector = new LazyInstanceSelector<>( slot ->
                instanceSelector.select( slot ).newUpdater( mode, cursorContext ) );
        return new FusionIndexUpdater( slotSelector, updaterSelector );
    }

    @Override
    public void force( CursorContext cursorContext )
    {
        instanceSelector.forAll( accessor -> accessor.force( cursorContext ) );
    }

    @Override
    public void refresh()
    {
        instanceSelector.forAll( IndexAccessor::refresh );
    }

    @Override
    public void close()
    {
        instanceSelector.close( IndexAccessor::close );
    }

    @Override
    public ValueIndexReader newValueReader()
    {
        var readerSelector = new LazyInstanceSelector<>( slot -> instanceSelector.select( slot ).newValueReader() );
        return new FusionIndexReader( slotSelector, readerSelector, descriptor );
    }

    @Override
    public BoundedIterable<Long> newAllEntriesValueReader( long fromIdInclusive, long toIdExclusive, CursorContext cursorContext )
    {
        Iterable<BoundedIterable<Long>> entries =
                instanceSelector.transform( indexAccessor -> indexAccessor.newAllEntriesValueReader( fromIdInclusive, toIdExclusive, cursorContext ) );
        return new BoundedIterable<>()
        {
            @Override
            public long maxCount()
            {
                long sum = 0;
                for ( BoundedIterable entry : entries )
                {
                    long maxCount = entry.maxCount();
                    if ( maxCount == UNKNOWN_MAX_COUNT )
                    {
                        return UNKNOWN_MAX_COUNT;
                    }
                    sum += maxCount;
                }
                return sum;
            }

            @Override
            public void close() throws Exception
            {
                forAll( BoundedIterable::close, entries );
            }

            @Override
            public Iterator<Long> iterator()
            {
                return Iterables.concat( entries ).iterator();
            }
        };
    }

    @Override
    public IndexEntriesReader[] newAllEntriesValueReader( int partitions, CursorContext cursorContext )
    {
        if ( descriptor.schema().getPropertyIds().length == 1 )
        {
            return IndexAccessor.super.newAllEntriesValueReader( partitions, cursorContext );
        }
        // For composite fusion index it is just a plain btree index being used.
        // So we get the accessor for that slot and use its reader.
        IndexAccessor accessor = instanceSelector.select( IndexSlot.GENERIC );
        return accessor.newAllEntriesValueReader( partitions, cursorContext );
    }

    @Override
    public ResourceIterator<Path> snapshotFiles()
    {
        return concatResourceIterators( instanceSelector.transform( IndexAccessor::snapshotFiles ).iterator() );
    }

    @Override
    public Map<String,Value> indexConfig()
    {
        Map<String,Value> indexConfig = new HashMap<>();
        instanceSelector.transform( IndexAccessor::indexConfig ).forEach( source -> IndexConfigProvider.putAllNoOverwrite( indexConfig, source ) );
        return indexConfig;
    }

    @Override
    public void verifyDeferredConstraints( NodePropertyAccessor nodePropertyAccessor ) throws IndexEntryConflictException
    {
        for ( IndexSlot slot : IndexSlot.values() )
        {
            instanceSelector.select( slot ).verifyDeferredConstraints( nodePropertyAccessor );
        }
    }

    @Override
    public void validateBeforeCommit( long entityId, Value[] tuple )
    {
        instanceSelector.select( slotSelector.selectSlot( tuple, CATEGORY_OF ) ).validateBeforeCommit( entityId, tuple );
    }

    @Override
    public boolean consistencyCheck( ReporterFactory reporterFactory, CursorContext cursorContext )
    {
        return FusionIndexBase.consistencyCheck( instanceSelector.instances.values(), reporterFactory, cursorContext );
    }

    @Override
    public long estimateNumberOfEntries( CursorContext cursorContext )
    {
        List<Long> counts = instanceSelector.transform( accessor -> accessor.estimateNumberOfEntries( cursorContext ) );
        return counts.stream().anyMatch( count -> count == UNKNOWN_NUMBER_OF_ENTRIES )
               ? UNKNOWN_NUMBER_OF_ENTRIES
               : counts.stream().mapToLong( Long::longValue ).sum();
    }
}
