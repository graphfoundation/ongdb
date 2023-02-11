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
package org.neo4j.cypher.internal.compiler.planner.logical.steps

import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.expressions.Equals
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.ir.PatternRelationship
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.util.InputPosition

/**
 * Helper functions for relationship leaf planners.
 */
object RelationshipLeafPlanner {

  trait RelationshipLeafPlanProvider {
    /**
     * @param patternForLeafPlan the pattern to use for the leaf plan
     * @param originalPattern    the original pattern, as it appears in the query graph
     * @param hiddenSelections   selections that make the leaf plan solve the originalPattern instead
     * @return the leaf plan including the hidden selections
     */
    def getRelationshipLeafPlan(patternForLeafPlan: PatternRelationship,
                                originalPattern: PatternRelationship,
                                hiddenSelections: Seq[Expression]): LogicalPlan
  }

  /**
   * Plan a hidden selection on top of a relationship leaf plan, if needed.
   * This is needed if either the start or end node is already bound, or if the start and end node is the same.
   *
   * @param queryGraph   the query graph
   * @param relationship the relationship
   * @param context      the context
   * @param relationshipLeafPlanProvider a RelationshipLeafPlanProvider
   * @return the leaf plan, with the correct hidden selections.
   */
  def planHiddenSelectionAndRelationshipLeafPlan(queryGraph: QueryGraph,
                                                 relationship: PatternRelationship,
                                                 context: LogicalPlanningContext,
                                                 relationshipLeafPlanProvider: RelationshipLeafPlanProvider,
                                                 ): LogicalPlan = {
    val startNodeAndEndNodeIsSame = relationship.left == relationship.right
    val startOrEndNodeIsBound = relationship.coveredIds.intersect(queryGraph.argumentIds).nonEmpty
    if (!startOrEndNodeIsBound && !startNodeAndEndNodeIsSame) {
      relationshipLeafPlanProvider.getRelationshipLeafPlan(relationship, relationship, Seq.empty)
    } else if (startOrEndNodeIsBound) {
      // if start/end node variables are already bound, generate new variable names and plan a Selection after the seek
      val newRelationship = generateNewPatternRelationship(relationship, queryGraph.argumentIds, context)
      // For a pattern (a)-[r]-(b), nodePredicates will be something like `a = new_a AND b = new_B`,
      // where `new_a` and `new_b` are the newly generated variable names.
      // This case covers the scenario where (a)-[r]-(a), because the nodePredicate `a = new_a1 AND a = new_a2` implies `new_a1 = new_a2`
      val nodePredicates = buildNodePredicates(relationship.nodes, newRelationship.nodes)

      relationshipLeafPlanProvider.getRelationshipLeafPlan(newRelationship, relationship, nodePredicates)
    } else {
      // In the case where `startNodeAndEndNodeIsSame == true` we need to generate 1 new variable name for one side of the relationship
      // and plan a Selection after the seek so that both sides are the same
      val newRightNode = context.anonymousVariableNameGenerator.nextName
      val nodePredicate = equalsPredicate(relationship.right, newRightNode)
      val newRelationship = relationship.copy(nodes = (relationship.left, newRightNode))
      relationshipLeafPlanProvider.getRelationshipLeafPlan(newRelationship, relationship, Seq(nodePredicate))
    }
  }

  /**
   * Generate new variable names for start and end node, but only for those nodes that are arguments.
   * Otherwise, return the same variable name.
   */
  private def generateNewStartEndNodes(oldNodes: (String, String),
                                       argumentIds: Set[String],
                                       context: LogicalPlanningContext): (String, String) = {
    val (left, right) = oldNodes
    val newLeft = if (!argumentIds.contains(left)) left else context.anonymousVariableNameGenerator.nextName
    val newRight = if (!argumentIds.contains(right)) right else context.anonymousVariableNameGenerator.nextName
    (newLeft, newRight)
  }

  /**
   * Generate new variable names for start and end node of a PatternRelationship, but only for those nodes that are arguments.
   * Return a PatternRelationship with the updates nodes.
   */
  private def generateNewPatternRelationship(oldRelationship: PatternRelationship,
                                             argumentIds: Set[String],
                                             context: LogicalPlanningContext): PatternRelationship = {
    oldRelationship.copy(nodes = generateNewStartEndNodes(oldRelationship.nodes, argumentIds, context))
  }

  private def buildNodePredicates(oldNodes: (String, String), newNodes: (String, String)): Seq[Equals] = {
    def pred(oldName: String, newName: String) = {
      if (oldName == newName) {
        Seq.empty
      } else {
        Seq(equalsPredicate(oldName, newName))
      }
    }

    val (oldLeft, oldRight) = oldNodes
    val (newLeft, newRight) = newNodes

    pred(oldLeft, newLeft) ++ pred(oldRight, newRight)
  }

  private def equalsPredicate(left: String, right: String): Equals = {
    val pos = InputPosition.NONE
    Equals(
      Variable(left)(pos),
      Variable(right)(pos)
    )(pos)
  }
}
