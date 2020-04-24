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
package org.neo4j.cypher.internal.runtime.vectorized.expressions

import org.neo4j.cypher.internal.compiler.v3_6.planner.CantCompileQueryException
import org.neo4j.cypher.internal.runtime.interpreted.CommandProjection
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.{ExpressionConverter, ExpressionConverters}
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.v3_6.logical.plans.NestedPlanExpression
import org.neo4j.cypher.internal.v3_6.expressions.functions.AggregatingFunction
import org.neo4j.cypher.internal.v3_6.expressions.{functions, _}
import org.neo4j.cypher.internal.v3_6.util.attribution.Id
import org.neo4j.cypher.internal.v3_6.{expressions => ast}

object MorselExpressionConverters extends ExpressionConverter {

  override def toCommandExpression(id: Id, expression: ast.Expression,
                                   self: ExpressionConverters): Option[Expression] = expression match {

    case c: FunctionInvocation if c.function == functions.Count =>
      Some(CountOperatorExpression(self.toCommandExpression(id, c.arguments.head)))
    case c: FunctionInvocation if c.function == functions.Avg =>
      Some(AvgOperatorExpression(self.toCommandExpression(id, c.arguments.head)))
    case c: FunctionInvocation if c.function == functions.Max =>
      Some(MaxOperatorExpression(self.toCommandExpression(id, c.arguments.head)))
    case c: FunctionInvocation if c.function == functions.Min =>
      Some(MinOperatorExpression(self.toCommandExpression(id, c.arguments.head)))
    case c: FunctionInvocation if c.function == functions.Collect =>
      Some(CollectOperatorExpression(self.toCommandExpression(id, c.arguments.head)))
    case _: CountStar => Some(CountStarOperatorExpression)

    //Queries containing these expression cant be handled by morsel runtime yet
    case f: FunctionInvocation if f.function.isInstanceOf[AggregatingFunction] => throw new CantCompileQueryException()
    case e: NestedPlanExpression => throw new CantCompileQueryException(s"$e is not yet supported by the morsel runtime")

    case _ => None
  }

  override def toCommandProjection(id: Id, projections: Map[String, ast.Expression],
                                   self: ExpressionConverters): Option[CommandProjection] = None
}






