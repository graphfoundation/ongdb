/*
 * Copyright (c) 2002-2018 "Neo4j,"
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
package org.neo4j.cypher.internal.runtime.slotted.expressions

//import org.neo4j.cypher.internal.compatibility.v3_5.runtime.SlotAllocation.PhysicalPlan
//import org.neo4j.cypher.internal.planner.v3_5.spi.TokenContext

import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.cypher.internal.runtime.compiled.expressions.CompiledExpression
import org.neo4j.cypher.internal.runtime.compiled.expressions.CompiledProjection
import org.neo4j.cypher.internal.runtime.interpreted.commands.AstNode
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.ExtendedExpression
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.RandFunction
import org.neo4j.cypher.internal.runtime.interpreted.pipes.Pipe
import org.neo4j.cypher.internal.runtime.slotted.SlottedQueryState
import org.neo4j.cypher.internal.v4_0.expressions
import org.neo4j.cypher.internal.v4_0.util.attribution.Id
import org.neo4j.exceptions.InternalException
import org.neo4j.logging.Log
import org.neo4j.values.AnyValue
//import org.neo4j.cypher.internal.v3_5.expressions.FunctionInvocation
//import org.neo4j.cypher.internal.v3_5.expressions.functions.AggregatingFunction
//import org.neo4j.cypher.internal.v3_5.util.attribution.Id
//import org.neo4j.cypher.internal.v3_5.{expressions => ast}
import org.neo4j.codegen.api.CodeGeneration.CodeGenerationMode
import org.neo4j.cypher.internal.physicalplanning.PhysicalPlan
import org.neo4j.cypher.internal.planner.spi.TokenContext
import org.neo4j.cypher.internal.runtime.interpreted.CommandProjection
import org.neo4j.cypher.internal.runtime.interpreted.GroupingExpression
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.CommunityExpressionConverter
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.ExpressionConverter
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.ExpressionConverters
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState
import org.neo4j.cypher.internal.v4_0.expressions.FunctionInvocation
import org.neo4j.cypher.internal.v4_0.expressions.functions.AggregatingFunction

class CompiledExpressionConverter(log: Log, physicalPlan: PhysicalPlan, tokenContext: TokenContext, readOnly: Boolean
                                  , codeGenerationMode: CodeGenerationMode, neverFail: Boolean) extends ExpressionConverter {

  //uses an inner converter to simplify compliance with Expression trait
  private val inner = new ExpressionConverters(SlottedExpressionConverters(physicalPlan), CommunityExpressionConverter(tokenContext))

  override def toCommandExpression(id: Id, expression: org.neo4j.cypher.internal.v4_0.expressions.Expression,
                                   self: ExpressionConverters): Option[Expression] = expression match {

    //we don't deal with aggregations
    case f: FunctionInvocation if f.function.isInstanceOf[AggregatingFunction] => None

    // don't bother with small expressions, not worth it
    // TODO: Implement
    case _ => None
  }

  //import org.neo4j.cypher.internal.v3_5.util.Foldable._

  override def toCommandProjection(id: Id, projections: Map[String, org.neo4j.cypher.internal.v4_0.expressions.Expression],
                                   self: ExpressionConverters): Option[CommandProjection] = {
    try {
      val totalSize = projections.values.foldLeft(0)((acc, current) => acc + sizeOf(current))

      // TODO: Implement - see 3.5 and 3.6 for reference.
      None
    }
    catch {
      case t: Throwable =>
        //Something horrible happened, maybe we exceeded the bytecode size or introduced a bug so that we tried
        //to load invalid bytecode, whatever is the case we should silently fallback to the next expression
        //converter
        log.debug(s"Failed to compile projection: $projections", t)
        None
    }
  }

  override def toGroupingExpression(id: Id,
                                    groupings: Map[String, expressions.Expression],
                                    orderToLeverage: Seq[expressions.Expression],
                                    self: ExpressionConverters): Option[GroupingExpression] = null

  private def sizeOf(expression: org.neo4j.cypher.internal.v4_0.expressions.Expression) = expression.treeCount {
    case _: org.neo4j.cypher.internal.v4_0.expressions.Expression => true
  }

}

object CompiledExpressionConverter {
  private val COMPILE_LIMIT = 2

  def parametersOrFail(state: QueryState): Array[AnyValue] = if (state.isInstanceOf[SlottedQueryState]) {
    val stateObj = state.asInstanceOf[SlottedQueryState]
    stateObj.params
  }
  else {
    throw new InternalException("We are expecting a slotted query state")
  }
}

case class CompileWrappingProjection(projection: CompiledProjection, isEmpty: Boolean) extends CommandProjection {

  override def registerOwningPipe(pipe: Pipe): Unit = {}

  override def project(ctx: ExecutionContext, state: QueryState): Unit =

    projection.project(ctx, state.query, CompiledExpressionConverter.parametersOrFail(state), state.cursors, state.expressionVariables)
}

case class CompileWrappingExpression(ce: CompiledExpression, legacy: Expression) extends ExtendedExpression {

  override val isDeterministic: Boolean = !legacy.exists {
    case RandFunction() => true
    case _ => false
  }

  override def rewrite(f: Expression => Expression): Expression = f(this)

  override def arguments: Seq[Expression] = legacy.arguments

  override def apply(ctx: ExecutionContext, state: QueryState): AnyValue =
    ce.evaluate(ctx, state.query, CompiledExpressionConverter.parametersOrFail(state), state.cursors, state.expressionVariables)

  override def toString: String = legacy.toString

  override def children: Seq[AstNode[_]] = Seq(legacy)
}
