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
package org.neo4j.cypher.internal

import org.neo4j.cypher.internal.compatibility.CypherRuntime
import org.neo4j.cypher.internal.compatibility.InterpretedRuntime
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.EnterpriseRuntimeContext
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.MorselRuntimeName
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.executionplan.DelegatingExecutionPlan
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.executionplan.ExecutionPlan
import org.neo4j.cypher.internal.compiler.v3_5.ExperimentalFeatureNotification
import org.neo4j.cypher.internal.compiler.v3_5.phases.LogicalPlanState
import org.neo4j.cypher.internal.v3_5.util.InternalNotification

/**
 * Morsel runtime selection entry. Until vectorized pipeline execution is wired on this line,
 * plans compile through the interpreted path while advertising MORSEL and the experimental warning.
 */
object MorselRuntime extends CypherRuntime[EnterpriseRuntimeContext] {

  private val experimentalNotification: Set[InternalNotification] = Set(
    ExperimentalFeatureNotification(
      "use the morsel runtime at your own peril, not recommended to be run on production systems"))

  override def compileToExecutable(logicalPlan: LogicalPlanState, context: EnterpriseRuntimeContext): ExecutionPlan = {
    val interpretedPlan = InterpretedRuntime.compileToExecutable(logicalPlan, context)
    new DelegatingExecutionPlan(interpretedPlan) {
      override def runtimeName = MorselRuntimeName
      override def notifications: Set[InternalNotification] = experimentalNotification
    }
  }
}
