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
package org.neo4j.cypher.internal.compiler.planner.logical.plans.rewriter

import org.neo4j.cypher.internal.compiler.ExecutionModel
import org.neo4j.cypher.internal.compiler.ExecutionModel.SelectedBatchSize
import org.neo4j.cypher.internal.compiler.ExecutionModel.VolcanoBatchSize
import org.neo4j.cypher.internal.compiler.planner.logical.CardinalityCostModel
import org.neo4j.cypher.internal.logical.plans.ApplyPlan
import org.neo4j.cypher.internal.logical.plans.CartesianProduct
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.Cardinalities
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.EffectiveCardinalities
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.ProvidedOrders
import org.neo4j.cypher.internal.util.Cardinality
import org.neo4j.cypher.internal.util.EffectiveCardinality
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.WorkReduction
import org.neo4j.cypher.internal.util.attribution.Id
import org.neo4j.cypher.internal.util.topDown

import scala.collection.mutable


/**
 * Traverse the LogicalPlan and update cardinalities to "effective cardinalities". The update is meant to represent how we, in certain cases, "push down" a
 * LIMIT to earlier operations.
 *
 */
case class recordEffectiveOutputCardinality(executionModel: ExecutionModel, cardinalities: Cardinalities, effectiveCardinalities: EffectiveCardinalities, providedOrders: ProvidedOrders) extends Rewriter {

  override def apply(input: AnyRef): AnyRef = {

    val workReductions: mutable.Map[Id, WorkReduction] = mutable.Map().withDefaultValue(WorkReduction.NoReduction)
    val rhsMultipliers: mutable.Map[Id, Cardinality] = mutable.Map().withDefaultValue(Cardinality.SINGLE)

    val batchSize = executionModel.selectBatchSize(input.asInstanceOf[LogicalPlan], cardinalities)

    val rewriter: Rewriter = {
      topDown(Rewriter.lift {
        case p: LogicalPlan =>
          val reduction = workReductions(p.id)
          val multiplier = rhsMultipliers(p.id)

          val effectiveBatchSize = CardinalityCostModel.getEffectiveBatchSize(batchSize, p, providedOrders)

          val theseEffectiveCardinalities = CardinalityCostModel.effectiveCardinalities(p, reduction, effectiveBatchSize, cardinalities)
          p.lhs.foreach { lhs => workReductions += (lhs.id -> theseEffectiveCardinalities.lhsReduction) }
          p.rhs.foreach { rhs => workReductions += (rhs.id -> theseEffectiveCardinalities.rhsReduction) }

          def findRHSMultipliers(left: LogicalPlan, right: LogicalPlan, batchSize: SelectedBatchSize): Unit = {
            // The RHS is executed for each chunk of LHS rows
            val lhsEffective = theseEffectiveCardinalities.lhsReduction.calculate(cardinalities.get(left.id))
            val rhsInvocations = batchSize.numBatchesFor(lhsEffective)
            // If nested, we want to multiply the new multiplier with any previous multiplier
            val rhsMultiplier = rhsInvocations * rhsMultipliers(right.id)
            right.flatten.foreach{c => rhsMultipliers(c.id) = rhsMultiplier}
          }

          p match {
            case CartesianProduct(left, right, _) =>
              findRHSMultipliers(left, right, effectiveBatchSize)
            case a:ApplyPlan =>
              findRHSMultipliers(a.left, a.right, VolcanoBatchSize)
            case _ =>
          }

          effectiveCardinalities.set(p.id, EffectiveCardinality((theseEffectiveCardinalities.outputCardinality * multiplier).amount, Some(cardinalities.get(p.id))))

          p
      })
    }

    rewriter.apply(input)
  }
}
