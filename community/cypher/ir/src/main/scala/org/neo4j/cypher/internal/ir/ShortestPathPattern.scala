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
package org.neo4j.cypher.internal.ir

import org.neo4j.cypher.internal.expressions.ShortestPaths
import org.neo4j.cypher.internal.util.Rewritable

//noinspection ZeroIndexToHead
final case class ShortestPathPattern(name: Option[String], rel: PatternRelationship, single: Boolean)
                                    (val expr: ShortestPaths) extends Rewritable {

  def dup(children: Seq[AnyRef]): this.type =
    copy(
      children(0).asInstanceOf[Option[String]],
      children(1).asInstanceOf[PatternRelationship],
      children(2).asInstanceOf[Boolean],
    )(expr).asInstanceOf[this.type]

  def isFindableFrom(symbols: Set[String]) = symbols.contains(rel.left) && symbols.contains(rel.right)

  def availableSymbols: Set[String] = name.toSet ++ rel.coveredIds
}

object ShortestPathPattern {
  implicit val byRelName = Ordering.by { sp: ShortestPathPattern => sp.rel }
}
