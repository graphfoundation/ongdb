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
package org.neo4j.cypher.internal.compiler.planner.logical.steps.index

import org.neo4j.cypher.internal.ast.Hint
import org.neo4j.cypher.internal.ast.UsingIndexHint
import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.EntityIndexSeekPlanProvider.mergeQueryExpressionsToSingleOne
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.EntityIndexSeekPlanProvider.predicatesForIndexSeek
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.NodeIndexLeafPlanner.NodeIndexMatch
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.LabelToken
import org.neo4j.cypher.internal.ir.ordering.ProvidedOrder
import org.neo4j.cypher.internal.logical.plans.IndexOrder
import org.neo4j.cypher.internal.logical.plans.IndexedProperty
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.QueryExpression
import org.neo4j.cypher.internal.planner.spi.IndexDescriptor.IndexType

abstract class AbstractNodeIndexSeekPlanProvider extends NodeIndexPlanProvider {

  case class Solution(
    idName: String,
    label: LabelToken,
    properties: Seq[IndexedProperty],
    isUnique: Boolean,
    valueExpr: QueryExpression[Expression],
    hint: Option[UsingIndexHint],
    argumentIds: Set[String],
    providedOrder: ProvidedOrder,
    indexOrder: IndexOrder,
    solvedPredicates: Seq[Expression],
    indexType: IndexType,
  )

  protected def constructPlan(solution: Solution, context: LogicalPlanningContext): LogicalPlan

  def createSolution(indexMatch: NodeIndexMatch, hints: Set[Hint], argumentIds: Set[String], context: LogicalPlanningContext): Option[Solution] = {

    val predicateSet = indexMatch.predicateSet(predicatesForIndexSeek(indexMatch.propertyPredicates), exactPredicatesCanGetValue = true)

    if (predicateSet.propertyPredicates.forall(_.isExists)) {
      None
    } else {

      val queryExpression: QueryExpression[Expression] = mergeQueryExpressionsToSingleOne(predicateSet.propertyPredicates)

      val properties = predicateSet.indexedProperties(context)

      val hint = predicateSet
        .fulfilledHints(hints, indexMatch.indexDescriptor.indexType, planIsScan = false)
        .headOption

      Some(Solution(
        indexMatch.variableName,
        indexMatch.labelToken,
        properties,
        indexMatch.indexDescriptor.isUnique,
        queryExpression,
        hint,
        argumentIds,
        indexMatch.providedOrder,
        indexMatch.indexOrder,
        predicateSet.allSolvedPredicates,
        indexMatch.indexDescriptor.indexType,
      ))
    }
  }
}
