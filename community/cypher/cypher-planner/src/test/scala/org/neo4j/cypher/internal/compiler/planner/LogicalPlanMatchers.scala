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
package org.neo4j.cypher.internal.compiler.planner

import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.scalatest.matchers.MatchResult
import org.scalatest.matchers.Matcher

trait LogicalPlanMatchers {

  /**
   * Matches if any sub-plan matches the partial function.
   * Also evaluates the partial function if it matches.
   */
  def containPlanMatching(pf: PartialFunction[LogicalPlan, Unit]): Matcher[LogicalPlan] =
    (plan: LogicalPlan) => MatchResult(
      matches = plan.treeExists({
        case p: LogicalPlan =>
          val matches = pf.isDefinedAt(p)
          if (matches) pf(p)
          matches

        case _ => false
      }),
      rawFailureMessage = "The plan:\n{0}\n did not contain the expected pattern",
      rawNegatedFailureMessage = "The plan:\n{0}\n contained the pattern when expected not to",
      failureMessageArgs = IndexedSeq(plan),
      negatedFailureMessageArgs = IndexedSeq(plan),
    )

}
