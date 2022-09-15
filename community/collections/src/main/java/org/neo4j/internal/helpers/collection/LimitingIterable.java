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
package org.neo4j.internal.helpers.collection;

import java.util.Iterator;

import org.neo4j.graphdb.ResourceIterable;
import org.neo4j.graphdb.ResourceIterator;

/**
 * Limits the amount of items returned by an {@link ResourceIterable}, or rather
 * {@link ResourceIterator}s spawned from it.
 *
 * @param <T> the type of items in this {@link Iterable}.
 * @see LimitingIterator
 */
public class LimitingIterable<T> implements Iterable<T>
{
    private final Iterable<T> source;
    private final int limit;

    /**
     * Instantiates a new limiting {@link Iterable} which can limit the number
     * of items returned from iterators it spawns.
     *
     * @param source the source of items.
     * @param limit the limit, i.e. the max number of items to return.
     */
    public LimitingIterable( Iterable<T> source, int limit )
    {
        this.source = source;
        this.limit = limit;
    }

    @Override
    public Iterator<T> iterator()
    {
        return new LimitingIterator<>( source.iterator(), limit );
    }
}
