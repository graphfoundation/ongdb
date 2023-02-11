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
package org.neo4j.cypher.internal.compiler.phases

import org.neo4j.cypher.internal.ast.semantics.SemanticErrorDef
import org.neo4j.cypher.internal.compiler.CypherPlannerConfiguration
import org.neo4j.cypher.internal.compiler.ExecutionModel
import org.neo4j.cypher.internal.compiler.Neo4jCypherExceptionFactory
import org.neo4j.cypher.internal.compiler.SyntaxExceptionCreator
import org.neo4j.cypher.internal.compiler.UpdateStrategy
import org.neo4j.cypher.internal.compiler.planner.logical.ExpressionEvaluator
import org.neo4j.cypher.internal.compiler.planner.logical.Metrics
import org.neo4j.cypher.internal.compiler.planner.logical.MetricsFactory
import org.neo4j.cypher.internal.compiler.planner.logical.QueryGraphSolver
import org.neo4j.cypher.internal.frontend.phases.BaseContext
import org.neo4j.cypher.internal.frontend.phases.CompilationPhaseTracer
import org.neo4j.cypher.internal.frontend.phases.Monitors
import org.neo4j.cypher.internal.options.CypherDebugOptions
import org.neo4j.cypher.internal.planner.spi.PlanContext
import org.neo4j.cypher.internal.util.CancellationChecker
import org.neo4j.cypher.internal.util.CypherExceptionFactory
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.InternalNotificationLogger
import org.neo4j.cypher.internal.util.attribution.IdGen
import org.neo4j.values.virtual.MapValue

import java.time.Clock

class BaseContextImpl(val cypherExceptionFactory: CypherExceptionFactory,
                      val tracer: CompilationPhaseTracer,
                      val notificationLogger: InternalNotificationLogger,
                      val monitors: Monitors,
                      val cancellationChecker: CancellationChecker) extends BaseContext {

  override val errorHandler: Seq[SemanticErrorDef] => Unit =
    SyntaxExceptionCreator.throwOnError(cypherExceptionFactory)
}

object BaseContextImpl {
  def apply(tracer: CompilationPhaseTracer,
            notificationLogger: InternalNotificationLogger,
            queryText: String,
            offset: Option[InputPosition],
            monitors: Monitors,
            cancellationChecker: CancellationChecker): BaseContextImpl = {
    val exceptionFactory = Neo4jCypherExceptionFactory(queryText, offset)
    new BaseContextImpl(exceptionFactory, tracer, notificationLogger, monitors, cancellationChecker)
  }
}

class PlannerContext(cypherExceptionFactory: CypherExceptionFactory,
                     tracer: CompilationPhaseTracer,
                     notificationLogger: InternalNotificationLogger,
                     val planContext: PlanContext,
                     monitors: Monitors,
                     val metrics: Metrics,
                     val config: CypherPlannerConfiguration,
                     val queryGraphSolver: QueryGraphSolver,
                     val updateStrategy: UpdateStrategy,
                     val debugOptions: CypherDebugOptions,
                     val clock: Clock,
                     val logicalPlanIdGen: IdGen,
                     val params: MapValue,
                     val executionModel: ExecutionModel,
                     cancellationChecker: CancellationChecker,
                     val materializedEntitiesMode: Boolean
) extends BaseContextImpl(cypherExceptionFactory, tracer, notificationLogger, monitors, cancellationChecker)

object PlannerContext {
  def apply(tracer: CompilationPhaseTracer,
            notificationLogger: InternalNotificationLogger,
            planContext: PlanContext,
            queryText: String,
            debugOptions: CypherDebugOptions,
            executionModel: ExecutionModel,
            offset: Option[InputPosition],
            monitors: Monitors,
            metricsFactory: MetricsFactory,
            queryGraphSolver: QueryGraphSolver,
            config: CypherPlannerConfiguration,
            updateStrategy: UpdateStrategy,
            clock: Clock,
            logicalPlanIdGen: IdGen,
            evaluator: ExpressionEvaluator,
            params: MapValue,
            cancellationChecker: CancellationChecker,
            materializedEntitiesMode: Boolean
  ): PlannerContext = {
    val exceptionFactory = Neo4jCypherExceptionFactory(queryText, offset)

    val metrics = metricsFactory.newMetrics(planContext, evaluator, executionModel, config.planningTextIndexesEnabled)

    new PlannerContext(exceptionFactory,
      tracer,
      notificationLogger,
      planContext,
      monitors,
      metrics,
      config,
      queryGraphSolver,
      updateStrategy,
      debugOptions,
      clock,
      logicalPlanIdGen,
      params,
      executionModel,
      cancellationChecker,
      materializedEntitiesMode
    )
  }
}
