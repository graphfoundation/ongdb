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
package org.neo4j.cypher.internal.plandescription

import org.neo4j.cypher.internal.ExecutionPlan
import org.neo4j.cypher.internal.RuntimeName
import org.neo4j.cypher.internal.frontend.PlannerName
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.options.CypherVersion
import org.neo4j.cypher.internal.plandescription.Arguments.Runtime
import org.neo4j.cypher.internal.plandescription.Arguments.RuntimeImpl
import org.neo4j.cypher.internal.plandescription.Arguments.Time
import org.neo4j.cypher.internal.plandescription.rewrite.InternalPlanDescriptionRewriter
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.EffectiveCardinalities
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.ProvidedOrders
import org.neo4j.cypher.internal.util.attribution.Id
import org.neo4j.cypher.result.OperatorProfile
import org.neo4j.cypher.result.QueryProfile

object PlanDescriptionBuilder {
  def apply(logicalPlan: LogicalPlan,
            plannerName: PlannerName,
            cypherVersion: CypherVersion,
            readOnly: Boolean,
            effectiveCardinalities: EffectiveCardinalities,
            withRawCardinalities: Boolean,
            providedOrders: ProvidedOrders,
            executionPlan: ExecutionPlan): PlanDescriptionBuilder = {
    // NOTE: We should not keep a reference to the ExecutionPlan in the PlanDescriptionBuilder since it can end up in long-lived caches, e.g. RecentQueryBuffer
    val runtimeName = executionPlan.runtimeName
    val runtimeMetadata = executionPlan.metadata
    val runtimeOperatorMetadata = executionPlan.operatorMetadata
    val internalPlanDescriptionRewriter = executionPlan.internalPlanDescriptionRewriter

    new PlanDescriptionBuilder(logicalPlan: LogicalPlan,
                               plannerName: PlannerName,
                               cypherVersion: CypherVersion,
                               readOnly: Boolean,
                               effectiveCardinalities: EffectiveCardinalities,
                               withRawCardinalities: Boolean,
                               providedOrders: ProvidedOrders,
                               runtimeName,
                               runtimeMetadata,
                               runtimeOperatorMetadata,
                               internalPlanDescriptionRewriter)
  }
}

class PlanDescriptionBuilder(logicalPlan: LogicalPlan,
                             plannerName: PlannerName,
                             cypherVersion: CypherVersion,
                             readOnly: Boolean,
                             effectiveCardinalities: EffectiveCardinalities,
                             withRawCardinalities: Boolean,
                             providedOrders: ProvidedOrders,
                             runtimeName: RuntimeName,
                             runtimeMetadata: Seq[Argument],
                             runtimeOperatorMetadata: Id => Seq[Argument],
                             internalPlanDescriptionRewriter: Option[InternalPlanDescriptionRewriter]) {

  def explain(): InternalPlanDescription = {
    val description =
      LogicalPlan2PlanDescription
        .create(logicalPlan, plannerName, cypherVersion, readOnly, effectiveCardinalities, withRawCardinalities, providedOrders, runtimeOperatorMetadata)
        .addArgument(Runtime(runtimeName.toTextOutput))
        .addArgument(RuntimeImpl(runtimeName.name))

    runtimeMetadata.foldLeft(description)((plan, metadata) => plan.addArgument(metadata))
  }

  def profile(queryProfile: QueryProfile): InternalPlanDescription = {

    val planDescription = BuildPlanDescription(explain())
      .addArgument(Arguments.GlobalMemory, queryProfile.maxAllocatedMemory())
      .plan
      .map { input: InternalPlanDescription =>
        val data = queryProfile.operatorProfile(input.id.x)

        BuildPlanDescription(input)
          .addArgument(Arguments.Rows, data.rows)
          .addArgument(Arguments.DbHits, data.dbHits)
          .addArgument(Arguments.PageCacheHits, data.pageCacheHits)
          .addArgument(Arguments.PageCacheMisses, data.pageCacheMisses)
          .addArgument(Time, data.time())
          .addArgument(Arguments.Memory, data.maxAllocatedMemory())
          .plan
      }

    internalPlanDescriptionRewriter match {
      case Some(rewriter) => rewriter.rewrite(planDescription)
      case None => planDescription
    }
  }

  case class BuildPlanDescription(plan: InternalPlanDescription) {

    def addArgument[T](argument: T => Argument,
                       value: T): BuildPlanDescription =
      if (value == OperatorProfile.NO_DATA) {
        this
      } else {
        BuildPlanDescription(plan.addArgument(argument(value)))
      }
  }
}
