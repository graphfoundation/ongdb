/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2020 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.cypher

import org.neo4j.cypher.planmatching.{CountInTree, ExactPlan, PlanInTree, PlanMatcher}
import org.neo4j.cypher.internal.RewindableExecutionResult
import org.scalatest.matchers.{MatchResult, Matcher}

trait QueryPlanTestSupport {

  /**
    * Allows the syntax
    * `plan should haveAsRoot.aPlan("ProduceResults")`
    */
  object haveAsRoot {
    def aPlan: PlanMatcher = ExactPlan()

    def aPlan(name: String): PlanMatcher = ExactPlan().withName(name)

    def aSourcePlan: PlanMatcher = ExactPlan(skipCachingPlans = true)

    def aSourcePlan(name: String): PlanMatcher = ExactPlan(skipCachingPlans = true).withName(name)
  }

  /**
    * Allows the syntax
    * ```
    * plan should includeSomewhere.aPlan("Filter")
    * plan should includeSomewhere.nTimes(2, aPlan("Filter"))
    * plan should includeSomewhere.atLeastNTimes(2, aPlan("Filter"))
    * ```
    */
  object includeSomewhere {
    def aPlan: PlanMatcher = PlanInTree(ExactPlan())

    def aPlan(name: String): PlanMatcher = PlanInTree(ExactPlan()).withName(name)

    def nTimes(n: Int, aPlan: PlanMatcher): PlanMatcher = CountInTree(n, aPlan)

    def atLeastNTimes(n: Int, aPlan: PlanMatcher): PlanMatcher = CountInTree(n, aPlan, atLeast = true)
  }

  /**
    * Allows the syntax
    * ```
    * plan should haveAsRoot.aPlan("ProduceResults")
    * .withLHS(aPlan("Filter"))
    * ```
    */
  object aPlan {
    def apply(): PlanMatcher = haveAsRoot.aPlan

    def apply(name: String): PlanMatcher = haveAsRoot.aPlan(name)
  }

  /**
    * Same as `aPlan`, but skips over plans that may be sporadically inserted by optimization passes
    * that is of no interest to the test assertion,
    * e.g. CacheProperties.
    * This can make a test more resilient to changes in how those optimizations are applied, that
    * are irrelevant to what is being tested.
    */
  object aSourcePlan {
    def apply(): PlanMatcher = haveAsRoot.aSourcePlan

    def apply(name: String): PlanMatcher = haveAsRoot.aSourcePlan(name)
  }

  def haveCount(count: Int): Matcher[RewindableExecutionResult] = new Matcher[RewindableExecutionResult] {
    override def apply(result: RewindableExecutionResult): MatchResult = {
      MatchResult(
        matches = count == result.size,
        rawFailureMessage = s"Result should have $count rows",
        rawNegatedFailureMessage = s"Result should not have $count rows")
    }
  }

}
