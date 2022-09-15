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
package org.neo4j.kernel.impl.index.schema;

import org.neo4j.storageengine.api.TokenIndexEntryUpdate;

import static org.neo4j.util.Preconditions.requireNonNegative;

class PhysicalToLogicalTokenChanges
{
    private PhysicalToLogicalTokenChanges()
    {
    }

    /**
     * Converts physical before/after state to logical remove/add state. This conversion copies the existing
     * long[] arrays from {@link TokenIndexEntryUpdate} and in the end possibly terminates them with -1 because the logical change set will be
     * equally big or smaller than the physical change set.
     *
     * @param update {@link TokenIndexEntryUpdate} containing physical before/after state.
     */
    static LogicalTokenUpdates convertToAdditionsAndRemovals( TokenIndexEntryUpdate<?> update )
    {
        int beforeLength = update.beforeValues().length;
        int afterLength = update.values().length;

        int rc = 0;
        int ac = 0;
        long[] removals = update.beforeValues().clone();
        long[] additions = update.values().clone();
        for ( int bi = 0, ai = 0; bi < beforeLength || ai < afterLength; )
        {
            long beforeId = bi < beforeLength ? requireNonNegative( removals[bi] ) : -1;
            long afterId = ai < afterLength ? requireNonNegative( additions[ai] ) : -1;
            if ( beforeId == afterId )
            {   // no change
                bi++;
                ai++;
                continue;
            }

            if ( smaller( beforeId, afterId ) )
            {
                while ( smaller( beforeId, afterId ) && bi < beforeLength )
                {
                    // looks like there's an id in before which isn't in after ==> REMOVE
                    removals[rc++] = beforeId;
                    bi++;
                    beforeId = bi < beforeLength ? removals[bi] : -1;
                }
            }
            else if ( smaller( afterId, beforeId ) )
            {
                while ( smaller( afterId, beforeId ) && ai < afterLength )
                {
                    // looks like there's an id in after which isn't in before ==> ADD
                    additions[ac++] = afterId;
                    ai++;
                    afterId = ai < afterLength ? additions[ai] : -1;
                }
            }
        }

        terminateWithMinusOneIfNeeded( removals, rc );
        terminateWithMinusOneIfNeeded( additions, ac );
        return new LogicalTokenUpdates( update.txId(), update.getEntityId(), removals, additions );
    }

    private static boolean smaller( long id, long otherId )
    {
        return id != -1 && (otherId == -1 || id < otherId);
    }

    private static void terminateWithMinusOneIfNeeded( long[] tokenIds, int actualLength )
    {
        if ( actualLength < tokenIds.length )
        {
            tokenIds[actualLength] = -1;
        }
    }

    static class LogicalTokenUpdates implements Comparable<LogicalTokenUpdates>
    {
        private final long txId;
        private final long entityId;
        private final long[] removals;
        private final long[] additions;

        LogicalTokenUpdates( long txId, long entityId, long[] removals, long[] additions )
        {
            this.txId = txId;
            this.entityId = entityId;
            this.removals = removals;
            this.additions = additions;
        }

        long txId()
        {
            return txId;
        }

        long entityId()
        {
            return entityId;
        }

        long[] removals()
        {
            return removals;
        }

        long[] additions()
        {
            return additions;
        }

        @Override
        public int compareTo( LogicalTokenUpdates o )
        {
            return Long.compare( entityId, o.entityId );
        }
    }
}
