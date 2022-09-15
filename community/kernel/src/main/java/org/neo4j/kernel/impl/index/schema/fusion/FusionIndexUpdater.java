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

import java.util.concurrent.atomic.AtomicReference;

import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.ValueIndexEntryUpdate;

class FusionIndexUpdater extends FusionIndexBase<IndexUpdater> implements IndexUpdater
{
    FusionIndexUpdater( SlotSelector slotSelector, LazyInstanceSelector<IndexUpdater> instanceSelector )
    {
        super( slotSelector, instanceSelector );
    }

    @Override
    public void process( IndexEntryUpdate<?> update ) throws IndexEntryConflictException
    {
        ValueIndexEntryUpdate<?> valueUpdate = asValueUpdate( update );
        switch ( valueUpdate.updateMode() )
        {
        case ADDED:
            instanceSelector.select( slotSelector.selectSlot( valueUpdate.values(), CATEGORY_OF ) ).process( valueUpdate );
            break;
        case CHANGED:
            // Hmm, here's a little conundrum. What if we change from a value that goes into native
            // to a value that goes into fallback, or vice versa? We also don't want to blindly pass
            // all CHANGED updates to both updaters since not all values will work in them.
            IndexUpdater from = instanceSelector.select( slotSelector.selectSlot( valueUpdate.beforeValues(), CATEGORY_OF ) );
            IndexUpdater to = instanceSelector.select( slotSelector.selectSlot( valueUpdate.values(), CATEGORY_OF ) );
            // There are two cases:
            // - both before/after go into the same updater --> pass update into that updater
            if ( from == to )
            {
                from.process( valueUpdate );
            }
            // - before go into one and after into the other --> REMOVED from one and ADDED into the other
            else
            {
                from.process( IndexEntryUpdate.remove( valueUpdate.getEntityId(), valueUpdate.indexKey(), valueUpdate.beforeValues() ) );
                to.process( IndexEntryUpdate.add( valueUpdate.getEntityId(), valueUpdate.indexKey(), valueUpdate.values() ) );
            }
            break;
        case REMOVED:
            instanceSelector.select( slotSelector.selectSlot( valueUpdate.values(), CATEGORY_OF ) ).process( valueUpdate );
            break;
        default:
            throw new IllegalArgumentException( "Unknown update mode" );
        }
    }

    @Override
    public void close() throws IndexEntryConflictException
    {
        AtomicReference<IndexEntryConflictException> chainedExceptions = new AtomicReference<>();

        instanceSelector.close( indexUpdater ->
        {
            try
            {
                indexUpdater.close();
            }
            catch ( IndexEntryConflictException e )
            {
                if ( !chainedExceptions.compareAndSet( null, e ) )
                {
                    chainedExceptions.get().addSuppressed( e );
                }
            }
        } );

        if ( chainedExceptions.get() != null )
        {
            throw chainedExceptions.get();
        }
    }
}
