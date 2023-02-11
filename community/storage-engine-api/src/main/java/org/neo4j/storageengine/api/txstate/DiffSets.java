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
package org.neo4j.storageengine.api.txstate;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Given a sequence of add and removal operations, instances of DiffSets track
 * which elements need to actually be added and removed at minimum from some
 * hypothetical target collection such that the result is equivalent to just
 * executing the sequence of additions and removals in order
 *
 * @param <T> type of elements
 */
public interface DiffSets<T>
{

    boolean isAdded( T elem );

    boolean isRemoved( T elem );

    Set<T> getAdded();

    Set<T> getRemoved();

    boolean isEmpty();

    Iterator<T> apply( Iterator<? extends T> source );

    DiffSets<T> filterAdded( Predicate<T> addedFilter );

    final class Empty<T> implements DiffSets<T>
    {
        @SuppressWarnings( "unchecked" )
        public static <T> DiffSets<T> instance()
        {
            return (DiffSets<T>) INSTANCE;
        }

        @SuppressWarnings( "unchecked" )
        public static <T> DiffSets<T> ifNull( DiffSets<T> diffSets )
        {
            return diffSets == null ? (DiffSets<T>) INSTANCE : diffSets;
        }

        private static final DiffSets<?> INSTANCE = new Empty<>();

        private Empty()
        {
            // singleton
        }

        @Override
        public boolean isAdded( T elem )
        {
            return false;
        }

        @Override
        public boolean isRemoved( T elem )
        {
            return false;
        }

        @Override
        public Set<T> getAdded()
        {
            return Collections.emptySet();
        }

        @Override
        public Set<T> getRemoved()
        {
            return Collections.emptySet();
        }

        @Override
        public boolean isEmpty()
        {
            return true;
        }

        @SuppressWarnings( "unchecked" )
        @Override
        public Iterator<T> apply( Iterator<? extends T> source )
        {
            return (Iterator<T>)source;
        }

        @Override
        public DiffSets<T> filterAdded( Predicate<T> addedFilter )
        {
            return this;
        }
    }
}
