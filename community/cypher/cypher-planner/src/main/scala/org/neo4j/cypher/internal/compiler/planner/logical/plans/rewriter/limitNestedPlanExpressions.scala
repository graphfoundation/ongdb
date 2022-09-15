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
package org.neo4j.cypher.internal.compiler.planner.logical.plans.rewriter

import org.neo4j.cypher.internal.compiler.planner.logical.steps.skipAndLimit.planLimitOnTopOf
import org.neo4j.cypher.internal.expressions.Add
import org.neo4j.cypher.internal.expressions.ContainerIndex
import org.neo4j.cypher.internal.expressions.FunctionInvocation
import org.neo4j.cypher.internal.expressions.FunctionName
import org.neo4j.cypher.internal.expressions.ListSlice
import org.neo4j.cypher.internal.expressions.Namespace
import org.neo4j.cypher.internal.expressions.SignedDecimalIntegerLiteral
import org.neo4j.cypher.internal.expressions.functions.Head
import org.neo4j.cypher.internal.logical.plans.Limit
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.NestedPlanCollectExpression
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.Cardinalities
import org.neo4j.cypher.internal.util.Cardinality
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.attribution.Attributes
import org.neo4j.cypher.internal.util.bottomUp

/**
 * Places a Limit inside of NestedPlanExpressions, if the NestedPlanExpressions is inside an expression that does not need the whole list as a result.
 * These expressions are `head`, `ContainerIndex`, and `ListSlice`.
 */
case class limitNestedPlanExpressions(cardinalities: Cardinalities, otherAttributes: Attributes[LogicalPlan]) extends Rewriter {
  override def apply(input: AnyRef): AnyRef = instance.apply(input)

  private val instance: Rewriter = bottomUp(Rewriter.lift {
    case fi@FunctionInvocation(Namespace(List()), FunctionName(Head.name), _, IndexedSeq(npe@NestedPlanCollectExpression(plan, _, _))) if !plan.isInstanceOf[Limit] =>
      val newPlan = planLimitOnTopOf(plan, SignedDecimalIntegerLiteral("1")(npe.position))(otherAttributes.copy(plan.id))
      cardinalities.set(newPlan.id, Cardinality.SINGLE)
      fi.copy(args = IndexedSeq(npe.copy(newPlan)(npe.position)))(fi.position)

    case ci@ContainerIndex(npe@NestedPlanCollectExpression(plan, _, _), index) if !plan.isInstanceOf[Limit] =>
      val newPlan = planLimitOnTopOf(plan, Add(SignedDecimalIntegerLiteral("1")(npe.position), index)(npe.position))(otherAttributes.copy(plan.id))
      cardinalities.set(newPlan.id, Cardinality.SINGLE)
      ci.copy(expr = npe.copy(newPlan)(npe.position))(ci.position)

    case ls@ListSlice(npe@NestedPlanCollectExpression(plan, _, _), _, Some(to)) if !plan.isInstanceOf[Limit] =>
      val newPlan = planLimitOnTopOf(plan, Add(SignedDecimalIntegerLiteral("1")(npe.position), to)(npe.position))(otherAttributes.copy(plan.id))
      cardinalities.set(newPlan.id, Cardinality.SINGLE)
      ls.copy(list = npe.copy(newPlan)(npe.position))(ls.position)
  })
}
