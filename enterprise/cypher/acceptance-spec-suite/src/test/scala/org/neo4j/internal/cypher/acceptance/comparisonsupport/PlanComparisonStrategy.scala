/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.internal.cypher.acceptance.comparisonsupport

import org.neo4j.cypher.internal.RewindableExecutionResult
import org.neo4j.cypher.internal.runtime.planDescription.InternalPlanDescription
import org.scalatest.Assertions

import scala.util.Failure
import scala.util.Success
import scala.util.Try

sealed trait PlanComparisonStrategy extends Assertions {
  def compare(expectSucceed: TestConfiguration, scenario: TestScenario, result: RewindableExecutionResult): Unit
}

case object DoNotComparePlans extends PlanComparisonStrategy {
  override def compare(expectSucceed: TestConfiguration, scenario: TestScenario, result: RewindableExecutionResult): Unit = {}
}

case class ComparePlansWithPredicate(predicate: InternalPlanDescription => Boolean,
                                     expectPlansToFailPredicate: TestConfiguration = TestConfiguration.empty,
                                     predicateFailureMessage: String = "") extends PlanComparisonStrategy {
  override def compare(expectSucceed: TestConfiguration, scenario: TestScenario, result: RewindableExecutionResult): Unit = {
    val comparePlans = expectSucceed - expectPlansToFailPredicate
    if (comparePlans.containsScenario(scenario)) {
      if (!predicate(result.executionPlanDescription())) {
        fail(s"plan for ${scenario.name} did not fulfill predicate.\n$predicateFailureMessage\n${result.executionPlanString()}")
      }
    } else {
      if (predicate(result.executionPlanDescription())) {
        fail(s"plan for ${scenario.name} did unexpectedly fulfill predicate\n$predicateFailureMessage\n${result.executionPlanString()}")
      }
    }
  }
}

case class ComparePlansWithAssertion(assertion: InternalPlanDescription => Unit,
                                     expectPlansToFail: TestConfiguration = TestConfiguration.empty) extends PlanComparisonStrategy {
  override def compare(expectSucceed: TestConfiguration, scenario: TestScenario, result: RewindableExecutionResult): Unit = {
    val comparePlans = expectSucceed - expectPlansToFail
    if (comparePlans.containsScenario(scenario)) {
      withClue(s"plan for ${scenario.name}\n") {
        assertion(result.executionPlanDescription())
      }
    } else {
      val tryResult = Try(assertion(result.executionPlanDescription()))
      tryResult match {
        case Success(_) =>
          fail(s"plan for ${scenario.name} did unexpectedly succeed \n${result.executionPlanString()}")
        case Failure(_) =>
        // Expected to fail
      }
    }
  }
}
