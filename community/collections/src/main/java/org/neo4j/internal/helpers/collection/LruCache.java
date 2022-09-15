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

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.neo4j.util.VisibleForTesting;

/**
 * Simple implementation of Least-recently-used cache.
 * <p>
 * The cache has a <CODE>maxSize</CODE> set and when the number of cached
 * elements exceeds that limit the least recently used element will be removed.
 */
public class LruCache<K, E>
{
    private final String name;
    private final int maxSize;

    private final Map<K, E> cache = new LinkedHashMap<>( 500, 0.75f, true )
    {
        @Override
        protected boolean removeEldestEntry( Map.Entry<K,E> eldest )
        {
            // synchronization miss with old value on maxSize here is ok
            if ( super.size() > maxSize )
            {
                elementCleaned( eldest.getValue() );
                return true;
            }
            return false;
        }
    };

    /**
     * Creates a LRU cache. If {@code maxSize < 1} an
     * IllegalArgumentException is thrown.
     *
     * @param name    name of cache
     * @param maxSize maximum size of this cache
     */
    public LruCache( String name, int maxSize )
    {
        if ( name == null || maxSize < 1 )
        {
            throw new IllegalArgumentException( "maxSize=" + maxSize + ", name=" + name );
        }
        this.name = name;
        this.maxSize = maxSize;
    }

    public String getName()
    {
        return this.name;
    }

    /**
     * Returns the maximum size of this cache.
     *
     * @return maximum size
     */
    public int maxSize()
    {
        return maxSize;
    }

    public synchronized void put( K key, E element )
    {
        if ( key == null || element == null )
        {
            throw new IllegalArgumentException( "key=" + key + ", element=" + element );
        }
        cache.put( key, element );
    }

    public synchronized E remove( K key )
    {
        if ( key == null )
        {
            throw new IllegalArgumentException( "Null parameter" );
        }
        return cache.remove( key );
    }

    public synchronized E get( K key )
    {
        if ( key == null )
        {
            throw new IllegalArgumentException();
        }
        return cache.get( key );
    }

    public synchronized void clear()
    {
        for ( Map.Entry<K, E> keEntry : cache.entrySet() )
        {
            elementCleaned( keEntry.getValue() );
        }
        cache.clear();
    }

    public synchronized int size()
    {
        return cache.size();
    }

    public synchronized Set<K> keySet()
    {
        return cache.keySet();
    }

    @VisibleForTesting
    protected void elementCleaned( E element )
    {
    }
}
