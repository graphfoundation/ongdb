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
package org.neo4j.cypher.internal.cache

import com.github.benmanes.caffeine.cache.Cache

/**
 * Simple thread-safe cache with a least-frequently-used eviction policy.
 */
class LFUCache[K <: AnyRef, V <: AnyRef](cacheFactory: CaffeineCacheFactory, val size: Int) {

  val inner: Cache[K, V] = cacheFactory.createCache(size)

  def computeIfAbsent(key: K, f: => V): V = inner.get(key, (_: K) => f)

  def get(key: K): Option[V] = Option(inner.getIfPresent(key))

  def put(key: K, value: V): Unit = inner.put(key, value)

  /**
   * Method for clearing the LRUCache
   * @return the number of elements in the cache prior to the clearing
   */
  def clear(): Long = {
    val priorSize = inner.estimatedSize()
    inner.invalidateAll()
    inner.cleanUp()
    priorSize
  }
}
