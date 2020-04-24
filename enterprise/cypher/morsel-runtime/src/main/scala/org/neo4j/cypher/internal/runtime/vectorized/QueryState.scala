/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.cypher.internal.runtime.vectorized

import org.neo4j.cypher.result.QueryResult.QueryResultVisitor
import org.neo4j.values.virtual.{MapValue, VirtualValues}

object QueryState {
  val EMPTY = QueryState(VirtualValues.EMPTY_MAP, null, 10000, singeThreaded = true)
}

/**
  * The query state of the morsel runtime
  */
case class QueryState(params: MapValue,
                      visitor: QueryResultVisitor[_],
                      morselSize: Int,
                      singeThreaded: Boolean, // hack until we solve [Transaction 1 - * Threads] problem
                      reduceCollector: Option[ReduceCollector] = None)
