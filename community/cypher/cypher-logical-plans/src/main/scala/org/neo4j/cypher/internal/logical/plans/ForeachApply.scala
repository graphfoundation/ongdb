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
package org.neo4j.cypher.internal.logical.plans

import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.util.attribution.IdGen

/**
 * ForeachApply is a side-effect type apply, which operates on a list value. Each left row is used to compute a
 * list, and each value in this list applied as the argument to right. Left rows are produced unchanged.
 *
 * {{{
 * for ( leftRow <- left)
 *   list <- expression.evaluate( leftRow )
 *   for ( value <- list )
 *     right.setArgument( value )
 *     for ( rightRow <- right )
 *       // just consume
 *
 *   produce leftRow
 * }}}
 */
case class ForeachApply(override val left: LogicalPlan, override val right: LogicalPlan, variable: String, expression: Expression)(implicit idGen: IdGen)
  extends LogicalBinaryPlan(idGen) with ApplyPlan {

  override def withLhs(newLHS: LogicalPlan)(idGen: IdGen): LogicalBinaryPlan = copy(left = newLHS)(idGen)
  override def withRhs(newRHS: LogicalPlan)(idGen: IdGen): LogicalBinaryPlan = copy(right = newRHS)(idGen)

  override val availableSymbols: Set[String] = left.availableSymbols // NOTE: right.availableSymbols and variable are not available outside
}
