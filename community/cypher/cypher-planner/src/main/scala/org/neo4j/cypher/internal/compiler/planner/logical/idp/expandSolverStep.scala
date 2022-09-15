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
package org.neo4j.cypher.internal.compiler.planner.logical.idp

import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.idp.expandSolverStep.planSinglePatternSide
import org.neo4j.cypher.internal.compiler.planner.logical.idp.expandSolverStep.planSingleProjectEndpoints
import org.neo4j.cypher.internal.expressions.Ands
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.ir.PatternRelationship
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.SimplePatternLength
import org.neo4j.cypher.internal.ir.VarPatternLength
import org.neo4j.cypher.internal.logical.plans.ExpandAll
import org.neo4j.cypher.internal.logical.plans.ExpandInto
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.VariablePredicate
import org.neo4j.cypher.internal.util.InputPosition

case class expandSolverStep(qg: QueryGraph) extends IDPSolverStep[PatternRelationship, LogicalPlan, LogicalPlanningContext] {


  override def apply(registry: IdRegistry[PatternRelationship], goal: Goal, table: IDPCache[LogicalPlan], context: LogicalPlanningContext): Iterator[LogicalPlan] = {
    val result: Iterator[Iterator[LogicalPlan]] =
      for {
        patternId <- goal.bitSet.iterator
        plan <- table(Goal(goal.bitSet - patternId)).iterator
        pattern <- registry.lookup(patternId)
      } yield {
        if (plan.availableSymbols.contains(pattern.name))
          Iterator(
            planSingleProjectEndpoints(pattern, plan, context)
          )
        else
          Iterator(
            planSinglePatternSide(qg, pattern, plan, pattern.left, context),
            planSinglePatternSide(qg, pattern, plan, pattern.right, context)
          ).flatten
      }

    result.flatten
  }
}

object expandSolverStep {

  def planSingleProjectEndpoints(patternRel: PatternRelationship, plan: LogicalPlan, context: LogicalPlanningContext): LogicalPlan = {
    val (start, end) = patternRel.inOrder
    val isStartInScope = plan.availableSymbols(start)
    val isEndInScope = plan.availableSymbols(end)
    context.logicalPlanProducer.planProjectEndpoints(plan, start, isStartInScope, end, isEndInScope, patternRel, context)
  }

  def planSinglePatternSide(qg: QueryGraph,
                            patternRel: PatternRelationship,
                            sourcePlan: LogicalPlan,
                            nodeId: String,
                            context: LogicalPlanningContext): Option[LogicalPlan] = {
    val availableSymbols = sourcePlan.availableSymbols

    if (availableSymbols(nodeId)) {
      Some(produceLogicalPlan(qg, patternRel, sourcePlan, nodeId, availableSymbols, context))
    } else {
      None
    }
  }

  private def produceLogicalPlan(qg: QueryGraph,
                                 patternRel: PatternRelationship,
                                 sourcePlan: LogicalPlan,
                                 nodeId: String,
                                 availableSymbols: Set[String],
                                 context: LogicalPlanningContext): LogicalPlan = {
    val dir = patternRel.directionRelativeTo(nodeId)
    val otherSide = patternRel.otherSide(nodeId)
    val overlapping = availableSymbols.contains(otherSide)
    val mode = if (overlapping) ExpandInto else ExpandAll

    patternRel.length match {
      case SimplePatternLength =>
        context.logicalPlanProducer.planSimpleExpand(sourcePlan, nodeId, dir, otherSide, patternRel, mode, context)

      case _: VarPatternLength =>
        val availablePredicates: Seq[Expression] =
          qg.selections.predicatesGiven(availableSymbols + patternRel.name + otherSide)
        val tempNode = patternRel.name + "_NODES"
        val tempRelationship = patternRel.name + "_RELS"
        val (nodePredicates: Seq[Expression], relationshipPredicates: Seq[Expression], solvedPredicates: Seq[Expression]) =
          extractPredicates(
            availablePredicates,
            originalRelationshipName = patternRel.name,
            tempRelationship = tempRelationship,
            tempNode = tempNode,
            originalNodeName = nodeId,
            targetNodeName = otherSide,
          )

        context.logicalPlanProducer.planVarExpand(
          source = sourcePlan,
          from = nodeId,
          dir = dir,
          to = otherSide,
          pattern = patternRel,
          nodePredicate = variablePredicate(tempNode, nodePredicates),
          relationshipPredicate = variablePredicate(tempRelationship, relationshipPredicates),
          solvedPredicates = solvedPredicates,
          mode = mode,
          context = context)
    }
  }

  private def variablePredicate(tempVariableName: String, predicates: Seq[Expression]): Option[VariablePredicate] =
    if (predicates.isEmpty)
      None
    else
      Some(VariablePredicate(Variable(tempVariableName)(InputPosition.NONE), Ands.create(predicates)))

}
