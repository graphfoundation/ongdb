/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.server.security.enterprise.auth;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Ticker;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ShiroCaffeineCache<K, V> implements Cache<K,V>
{
    private final com.github.benmanes.caffeine.cache.Cache<K,V> caffCache;

    ShiroCaffeineCache( Ticker ticker, long ttl, int maxCapacity, boolean useTTL )
    {
        this( ticker, ForkJoinPool.commonPool(), ttl, maxCapacity, useTTL );
    }

    ShiroCaffeineCache( Ticker ticker, Executor maintenanceExecutor, long ttl, int maxCapacity, boolean useTTL )
    {
        Caffeine<Object,Object> builder = Caffeine.newBuilder().maximumSize( maxCapacity ).executor( maintenanceExecutor );
        if ( useTTL )
        {
            if ( ttl <= 0L )
            {
                throw new IllegalArgumentException( "TTL must be larger than zero." );
            }

            builder.ticker( ticker ).expireAfterWrite( ttl, TimeUnit.MILLISECONDS );
        }

        this.caffCache = builder.build();
    }

    public V get( K key ) throws CacheException
    {
        return this.caffCache.getIfPresent( key );
    }

    public V put( K key, V value ) throws CacheException
    {
        return this.caffCache.asMap().put( key, value );
    }

    public V remove( K key ) throws CacheException
    {
        return this.caffCache.asMap().remove( key );
    }

    public void clear() throws CacheException
    {
        this.caffCache.invalidateAll();
    }

    public int size()
    {
        return this.caffCache.asMap().size();
    }

    public Set<K> keys()
    {
        return this.caffCache.asMap().keySet();
    }

    public Collection<V> values()
    {
        return this.caffCache.asMap().values();
    }

    private static class NullCache<K, V> implements Cache<K,V>
    {
        public V get( K key ) throws CacheException
        {
            return null;
        }

        public V put( K key, V value ) throws CacheException
        {
            return null;
        }

        public V remove( K key ) throws CacheException
        {
            return null;
        }

        public void clear() throws CacheException
        {
        }

        public int size()
        {
            return 0;
        }

        public Set<K> keys()
        {
            return Collections.emptySet();
        }

        public Collection<V> values()
        {
            return Collections.emptySet();
        }
    }

    public static class Manager implements CacheManager
    {
        private final Map<String,Cache<?,?>> caches;
        private final Ticker ticker;
        private final long ttl;
        private final int maxCapacity;
        private final boolean useTTL;

        public Manager( Ticker ticker, long ttl, int maxCapacity, boolean useTTL )
        {
            this.ticker = ticker;
            this.ttl = ttl;
            this.maxCapacity = maxCapacity;
            this.useTTL = useTTL;
            this.caches = new HashMap();
        }

        public <K, V> Cache<K,V> getCache( String s ) throws CacheException
        {
            //noinspection unchecked
            return (Cache<K,V>) this.caches.computeIfAbsent( s, ( ignored ) ->
            {
                return (Cache<K,V>) (this.useTTL && this.ttl <= 0L ? new ShiroCaffeineCache.NullCache()
                                                                   : new ShiroCaffeineCache( this.ticker, this.ttl, this.maxCapacity, this.useTTL ));
            } );
        }
    }
}