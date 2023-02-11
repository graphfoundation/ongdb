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

import org.neo4j.index.internal.gbptree.ValueMerger;

import static org.neo4j.index.internal.gbptree.ValueMerger.MergeResult.MERGED;
import static org.neo4j.index.internal.gbptree.ValueMerger.MergeResult.REMOVED;
import static org.neo4j.index.internal.gbptree.ValueMerger.MergeResult.UNCHANGED;
import static org.neo4j.internal.id.indexed.IndexedIdGenerator.NO_MONITOR;

/**
 * Merges ID state changes for a particular tree entry. Differentiates between recovery/normal mode.
 * Updates to a tree entry of an older generation during normal mode will first normalize states before applying new changes.
 */
final class IdRangeMerger implements ValueMerger<IdRangeKey, IdRange>
{
    public static final IdRangeMerger DEFAULT = new IdRangeMerger( false, NO_MONITOR );
    public static final IdRangeMerger RECOVERY = new IdRangeMerger( true, NO_MONITOR );

    private final boolean recoveryMode;
    private final IndexedIdGenerator.Monitor monitor;

    IdRangeMerger( boolean recoveryMode, IndexedIdGenerator.Monitor monitor )
    {
        this.recoveryMode = recoveryMode;
        this.monitor = monitor;
    }

    @Override
    public MergeResult merge( IdRangeKey existingKey, IdRangeKey newKey, IdRange existingValue, IdRange newValue )
    {
        if ( !recoveryMode && existingValue.getGeneration() != newValue.getGeneration() )
        {
            existingValue.normalize();
            existingValue.setGeneration( newValue.getGeneration() );
            monitor.normalized( existingKey.getIdRangeIdx() );
        }

        final boolean changed = existingValue.mergeFrom( existingKey, newValue, recoveryMode );
        if ( !changed )
        {
            return UNCHANGED;
        }

        return existingValue.isEmpty() ? REMOVED : MERGED;
    }
}
