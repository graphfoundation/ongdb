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
package org.neo4j.index.internal.gbptree;

/**
 * Decides what to do when inserting key which already exists in index. Different implementations of
 * {@link ValueMerger} can result in unique/non-unique indexes for example.
 *
 * @param <KEY> type of keys to merge.
 * @param <VALUE> type of values to merge.
 */
public interface ValueMerger<KEY,VALUE>
{
    /**
     * Merge an existing value with a new value.
     *
     * @param existingKey existing key
     * @param newKey new key
     * @param existingValue existing value
     * @param newValue new value
     * @return result of the merge. What the various results mean:
     * <ul>
     *     <li>{@link MergeResult#UNCHANGED} the existing value will remain unchanged, i.e. no change to the tree whatsoever</li>
     *     <li>{@link MergeResult#REPLACED} the existing value will be overwritten with the contents of the new value</li>
     *     <li>{@link MergeResult#MERGED} the existing value will be overwritten with a value which is a merge between the existing and the new value,
     *     i.e. the contents of the {@code existingValue} parameter, as it looks after this call has completed will overwrite the value in the tree</li>
     *     <li>{@link MergeResult#REMOVED} the merged value resulted in something that should be removed from the tree.
     *     The existing key and value will be removed from the tree</li>
     * </ul>
     */
    MergeResult merge( KEY existingKey, KEY newKey, VALUE existingValue, VALUE newValue );

    /**
     * Result of a merge, i.e. what the (mutable) values passed into {@link #merge(Object, Object, Object, Object)} mean when the call is completed.
     */
    enum MergeResult
    {
        /**
         * Existing value will remain unchanged.
         */
        UNCHANGED,

        /**
         * Existing value will be replaced by the new value in its entirety.
         */
        REPLACED,

        /**
         * New value will be merged into the existing value, resulting in a value which is neither the existing value, nor the new value,
         * but a merge between the two.
         */
        MERGED,

        /**
         * Merge resulted in value that will no longer need to be in the tree. Existing value along with the key will be removed.
         */
        REMOVED
    }
}
