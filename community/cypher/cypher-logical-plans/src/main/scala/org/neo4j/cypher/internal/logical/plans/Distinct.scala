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
package org.neo4j.cypher.internal.logical.plans

import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.util.attribution.IdGen

/**
 * Distinct produces source rows without changing them, but omitting rows
 * which have been produced before. That is, the order of rows is unchanged, but each
 * unique combination of values is only produced once.
 */
case class Distinct(override val source: LogicalPlan,
                    override val groupingExpressions: Map[String, Expression])
                   (implicit idGen: IdGen) extends LogicalUnaryPlan(idGen) with ProjectingPlan with AggregatingPlan {

  override def withLhs(newLHS: LogicalPlan)(idGen: IdGen): LogicalUnaryPlan = copy(source = newLHS)(idGen)

  override val projectExpressions: Map[String, Expression] = groupingExpressions
  override val availableSymbols: Set[String] = groupingExpressions.keySet

  override def aggregationExpressions: Map[String, Expression] = Map.empty
}
