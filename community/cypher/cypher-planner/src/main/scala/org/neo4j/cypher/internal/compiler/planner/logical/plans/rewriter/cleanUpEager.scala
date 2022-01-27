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

import org.neo4j.cypher.internal.compiler.planner.logical.steps.skipAndLimit.planLimitOnTopOf
import org.neo4j.cypher.internal.logical.plans.Eager
import org.neo4j.cypher.internal.logical.plans.EagerLogicalPlan
import org.neo4j.cypher.internal.logical.plans.Limit
import org.neo4j.cypher.internal.logical.plans.LoadCSV
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.LogicalUnaryPlan
import org.neo4j.cypher.internal.logical.plans.UnwindCollection
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.Solveds
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.attribution.Attributes
import org.neo4j.cypher.internal.util.attribution.SameId
import org.neo4j.cypher.internal.util.bottomUp

case class cleanUpEager(solveds: Solveds, attributes: Attributes[LogicalPlan]) extends Rewriter {

  private val instance: Rewriter = bottomUp(Rewriter.lift {

    // E E L => E L
    case Eager(inner: LogicalUnaryPlan with EagerLogicalPlan, _) => inner

    // E U => U E
    case eager@Eager(unwind@UnwindCollection(source, _, _), reasons) =>
      val res = unwind.copy(source = eager.copy(source = source, reasons = reasons)(SameId(eager.id)))(attributes.copy(unwind.id))
      solveds.copy(eager.id, res.id)
      res

    // E LCSV => LCSV E
    case eager@Eager(loadCSV@LoadCSV(source, _, _, _, _, _,_), reasons) =>
      val res = loadCSV.copy(source = eager.copy(source = source, reasons = reasons)(SameId(eager.id)))(attributes.copy(loadCSV.id))
      solveds.copy(eager.id, res.id)
      res

    // LIMIT E => E LIMIT
    case limit@Limit(eager@Eager(source, reasons), _)  =>
      val res = eager.copy(source = planLimitOnTopOf(source, limit.count)(SameId(limit.id)), reasons)(attributes.copy(eager.id))
      solveds.copy(limit.id, res.id)
      res
  })

  override def apply(input: AnyRef): AnyRef = instance.apply(input)
}
