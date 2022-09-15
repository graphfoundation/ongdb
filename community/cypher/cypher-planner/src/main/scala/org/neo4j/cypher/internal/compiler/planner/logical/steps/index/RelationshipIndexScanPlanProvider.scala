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
package org.neo4j.cypher.internal.compiler.planner.logical.steps.index
import org.neo4j.cypher.internal.ast.Hint
import org.neo4j.cypher.internal.compiler.planner.logical.LeafPlanRestrictions
import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.EntityIndexScanPlanProvider.Solution
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.EntityIndexScanPlanProvider.isAllowedByRestrictions
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.EntityIndexScanPlanProvider.mergeSolutions
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.EntityIndexScanPlanProvider.predicatesForIndexScan
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.RelationshipIndexLeafPlanner.RelationshipIndexMatch
import org.neo4j.cypher.internal.expressions.RelationshipTypeToken
import org.neo4j.cypher.internal.ir.PatternRelationship
import org.neo4j.cypher.internal.logical.plans.IndexOrder
import org.neo4j.cypher.internal.logical.plans.IndexedProperty
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.planner.spi.IndexDescriptor

object RelationshipIndexScanPlanProvider extends RelationshipIndexPlanProvider {


  /**
   * Container for all values that define a RelationshipIndexScan plan
   */
  case class RelationshipIndexScanParameters(
                                              idName: String,
                                              token: RelationshipTypeToken,
                                              patternRelationship: PatternRelationship,
                                              properties: Seq[IndexedProperty],
                                              argumentIds: Set[String],
                                              indexOrder: IndexOrder,
                                            )

  override def createPlans(indexMatches: Set[RelationshipIndexMatch],
                           hints: Set[Hint],
                           argumentIds: Set[String],
                           restrictions: LeafPlanRestrictions,
                           context: LogicalPlanningContext): Set[LogicalPlan] = {

    val solutions = for {
      indexMatch <- indexMatches
      // Text indexes don't support scanning
      if indexMatch.indexDescriptor.indexType != IndexDescriptor.IndexType.Text
      if isAllowedByRestrictions(indexMatch.variableName, restrictions)
    } yield createSolution(indexMatch, hints, argumentIds, context)

    val distinctSolutions = mergeSolutions(solutions)

    distinctSolutions map { solution =>

      context.logicalPlanProducer.planRelationshipIndexScan(
        idName = solution.indexScanParameters.idName,
        solution.indexScanParameters.token,
        pattern = solution.indexScanParameters.patternRelationship,
        properties = solution.indexScanParameters.properties,
        solvedPredicates = solution.solvedPredicates,
        solvedHint = solution.solvedHint,
        argumentIds = argumentIds,
        providedOrder = solution.providedOrder,
        indexOrder = solution.indexScanParameters.indexOrder,
        context = context,
        indexType =  solution.indexType,
      )
    }
  }

  private def createSolution(indexMatch: RelationshipIndexMatch, hints: Set[Hint], argumentIds: Set[String], context: LogicalPlanningContext): Solution[RelationshipIndexScanParameters] = {
    val predicateSet = indexMatch.predicateSet(predicatesForIndexScan(indexMatch.propertyPredicates), exactPredicatesCanGetValue = false)

    val hint = predicateSet
      .fulfilledHints(hints, indexMatch.indexDescriptor.indexType, planIsScan = true)
      .headOption

    Solution(
      RelationshipIndexScanParameters(
        idName = indexMatch.variableName,
        token = indexMatch.relationshipTypeToken,
        patternRelationship = indexMatch.patternRelationship,
        properties = predicateSet.indexedProperties(context),
        argumentIds = argumentIds,
        indexOrder = indexMatch.indexOrder,
      ),
      solvedPredicates = predicateSet.allSolvedPredicates,
      solvedHint = hint,
      providedOrder = indexMatch.providedOrder,
      indexType = indexMatch.indexDescriptor.indexType
    )
  }
}
