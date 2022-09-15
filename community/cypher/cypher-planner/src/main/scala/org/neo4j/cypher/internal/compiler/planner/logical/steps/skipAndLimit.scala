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
package org.neo4j.cypher.internal.compiler.planner.logical.steps

import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.PlanTransformer
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.ir.QueryProjection
import org.neo4j.cypher.internal.ir.SinglePlannerQuery
import org.neo4j.cypher.internal.logical.plans.EagerLogicalPlan
import org.neo4j.cypher.internal.logical.plans.ExhaustiveLimit
import org.neo4j.cypher.internal.logical.plans.Limit
import org.neo4j.cypher.internal.logical.plans.LogicalBinaryPlan
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.UpdatingPlan
import org.neo4j.cypher.internal.util.attribution.IdGen

import scala.annotation.tailrec

object skipAndLimit extends PlanTransformer {

    @tailrec
    def shouldPlanExhaustiveLimit(plan: LogicalPlan): Boolean = plan match {
      case _: UpdatingPlan => true
      case _: EagerLogicalPlan => false
      case p: LogicalBinaryPlan => p.right.folder.treeExists{case _: UpdatingPlan => true} || shouldPlanExhaustiveLimit(p.left)
      case p: LogicalPlan => if (p.lhs.nonEmpty) shouldPlanExhaustiveLimit(p.lhs.get) else false
    }

  def planLimitOnTopOf(plan: LogicalPlan, count: Expression)(implicit idGen: IdGen): LogicalPlan =
    if (shouldPlanExhaustiveLimit(plan)) ExhaustiveLimit(plan, count)(idGen)
    else Limit(plan, count)(idGen)

  def apply(plan: LogicalPlan, query: SinglePlannerQuery, context: LogicalPlanningContext): LogicalPlan = {
    query.horizon match {
      case p: QueryProjection =>
        val queryPagination = p.queryPagination
        (queryPagination.skip, queryPagination.limit) match {
          case (Some(skipExpr), Some(limitExpr)) =>
            context.logicalPlanProducer.planSkipAndLimit(plan, skipExpr, limitExpr, query.interestingOrder, context, shouldPlanExhaustiveLimit(plan))

          case (Some(skipExpr), _) =>
            context.logicalPlanProducer.planSkip(plan, skipExpr, query.interestingOrder, context)

          case (_, Some(limitExpr)) if shouldPlanExhaustiveLimit(plan) =>
            context.logicalPlanProducer.planExhaustiveLimit(plan, limitExpr, limitExpr, query.interestingOrder, context = context)

          case (_, Some(limitExpr)) =>
            context.logicalPlanProducer.planLimit(plan, limitExpr, limitExpr, query.interestingOrder, context = context)

          case _ =>
            plan
        }

      case _ => plan
    }
  }
}
