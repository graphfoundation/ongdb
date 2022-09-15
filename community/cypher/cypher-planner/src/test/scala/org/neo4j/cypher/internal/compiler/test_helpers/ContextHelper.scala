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
package org.neo4j.cypher.internal.compiler.test_helpers

import org.neo4j.cypher.internal.compiler.CypherPlannerConfiguration
import org.neo4j.cypher.internal.compiler.ExecutionModel
import org.neo4j.cypher.internal.compiler.Neo4jCypherExceptionFactory
import org.neo4j.cypher.internal.compiler.NotImplementedPlanContext
import org.neo4j.cypher.internal.compiler.UpdateStrategy
import org.neo4j.cypher.internal.compiler.phases.PlannerContext
import org.neo4j.cypher.internal.compiler.planner.logical.Metrics
import org.neo4j.cypher.internal.compiler.planner.logical.QueryGraphSolver
import org.neo4j.cypher.internal.frontend.phases.CompilationPhaseTracer
import org.neo4j.cypher.internal.frontend.phases.CompilationPhaseTracer.NO_TRACING
import org.neo4j.cypher.internal.frontend.phases.Monitors
import org.neo4j.cypher.internal.options.CypherDebugOptions
import org.neo4j.cypher.internal.planner.spi.PlanContext
import org.neo4j.cypher.internal.util.CancellationChecker
import org.neo4j.cypher.internal.util.CypherExceptionFactory
import org.neo4j.cypher.internal.util.InternalNotificationLogger
import org.neo4j.cypher.internal.util.attribution.IdGen
import org.neo4j.cypher.internal.util.attribution.SequentialIdGen
import org.neo4j.cypher.internal.util.devNullLogger
import org.neo4j.values.virtual.MapValue
import org.scalatest.mockito.MockitoSugar

import java.time.Clock

object ContextHelper extends MockitoSugar {
  def create(cypherExceptionFactory: CypherExceptionFactory = Neo4jCypherExceptionFactory("<QUERY>", None),
             tracer: CompilationPhaseTracer = NO_TRACING,
             notificationLogger: InternalNotificationLogger = devNullLogger,
             planContext: PlanContext = new NotImplementedPlanContext,
             monitors: Monitors = mock[Monitors],
             metrics: Metrics = mock[Metrics],
             config: CypherPlannerConfiguration = mock[CypherPlannerConfiguration],
             queryGraphSolver: QueryGraphSolver = mock[QueryGraphSolver],
             updateStrategy: UpdateStrategy = mock[UpdateStrategy],
             debugOptions: CypherDebugOptions = CypherDebugOptions.default,
             clock: Clock = Clock.systemUTC(),
             logicalPlanIdGen: IdGen = new SequentialIdGen(),
             params: MapValue = MapValue.EMPTY,
             executionModel: ExecutionModel = ExecutionModel.default,
             cancellationChecker: CancellationChecker = CancellationChecker.NeverCancelled,
            ): PlannerContext = {
    new PlannerContext(cypherExceptionFactory, tracer, notificationLogger, planContext,
      monitors, metrics, config, queryGraphSolver, updateStrategy, debugOptions, clock, logicalPlanIdGen, params, executionModel, cancellationChecker)
  }
}
