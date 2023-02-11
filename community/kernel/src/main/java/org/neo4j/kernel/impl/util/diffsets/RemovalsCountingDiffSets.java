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
package org.neo4j.kernel.impl.util.diffsets;

import org.eclipse.collections.api.set.primitive.MutableLongSet;

import org.neo4j.kernel.impl.util.collection.CollectionsFactory;
import org.neo4j.memory.HeapEstimator;
import org.neo4j.memory.MemoryTracker;

/**
 * This class works around the fact that create-delete in the same transaction is a no-op in {@link MutableDiffSetsImpl},
 * whereas we need to know total number of explicit removals.
 */
public class RemovalsCountingDiffSets extends MutableLongDiffSetsImpl
{
    private static final long REMOVALS_COUNTING_DIFF_SET_SHALLOW_SIZE = HeapEstimator.shallowSizeOfInstance( RemovalsCountingDiffSets.class );

    private final CollectionsFactory collectionsFactory;
    private final MemoryTracker memoryTracker;
    private MutableLongSet removedFromAdded;

    static RemovalsCountingDiffSets newRemovalsCountingDiffSets( CollectionsFactory collectionsFactory, MemoryTracker memoryTracker )
    {
        memoryTracker.allocateHeap( REMOVALS_COUNTING_DIFF_SET_SHALLOW_SIZE );
        return new RemovalsCountingDiffSets( collectionsFactory, memoryTracker );
    }

    private RemovalsCountingDiffSets( CollectionsFactory collectionsFactory, MemoryTracker memoryTracker )
    {
        super( collectionsFactory, memoryTracker );
        this.collectionsFactory = collectionsFactory;
        this.memoryTracker = memoryTracker;
    }

    @Override
    public boolean remove( long elem )
    {
        if ( isAdded( elem ) && super.remove( elem ) )
        {
            if ( removedFromAdded == null )
            {
                removedFromAdded = collectionsFactory.newLongSet( memoryTracker );
            }
            removedFromAdded.add( elem );
            return true;
        }
        return super.remove( elem );
    }

    public boolean wasRemoved( long id )
    {
        return (removedFromAdded != null && removedFromAdded.contains( id )) || super.isRemoved( id );
    }
}
