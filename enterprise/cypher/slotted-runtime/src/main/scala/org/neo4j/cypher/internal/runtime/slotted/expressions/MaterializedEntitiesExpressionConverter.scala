/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.cypher.internal.runtime.slotted.expressions

import org.neo4j.cypher.internal.planner.spi.TokenContext
import org.neo4j.cypher.internal.runtime.interpreted.CommandProjection
import org.neo4j.cypher.internal.runtime.interpreted.GroupingExpression
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.ExpressionConverter
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.ExpressionConverters
import org.neo4j.cypher.internal.v4_0.util.attribution.Id

case class MaterializedEntitiesExpressionConverter(val tokenContext: TokenContext) extends ExpressionConverter {
  override def toCommandExpression(id: Id,
                                   expression: org.neo4j.cypher.internal.v4_0.expressions.Expression,
                                   self: ExpressionConverters): Option[org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression] = {
    ???
  }

  override def toGroupingExpression(id: Id,
                                    groupings: Map[String, org.neo4j.cypher.internal.v4_0.expressions.Expression],
                                    orderToLeverage: Seq[org.neo4j.cypher.internal.v4_0.expressions.Expression],
                                    self: ExpressionConverters): Option[GroupingExpression] = {
    ???
  }

  override def toCommandProjection(id: Id,
                                   projections: Map[String, org.neo4j.cypher.internal.v4_0.expressions.Expression],
                                   self: ExpressionConverters): Option[CommandProjection] = {
    ???
  }
}