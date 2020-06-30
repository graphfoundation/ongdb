/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
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

import java.time.Clock

import org.neo4j.common.DependencyResolver
import org.neo4j.cypher._
import org.neo4j.cypher.internal.compiler.CypherPlannerConfiguration
import org.neo4j.cypher.internal.executionplan.GeneratedQuery
import org.neo4j.cypher.internal.planner.spi.TokenContext
import org.neo4j.cypher.internal.planning.CypherPlanner
import org.neo4j.cypher.internal.runtime.compiled.codegen.spi.CodeStructure
import org.neo4j.cypher.internal.runtime.parallel.tracing.SchedulerTracer
import org.neo4j.cypher.internal.spi.codegen.GeneratedQueryStructure
import org.neo4j.internal.kernel.api.CursorFactory
import org.neo4j.internal.kernel.api.SchemaRead
import org.neo4j.kernel.GraphDatabaseQueryService
import org.neo4j.kernel.impl.query.QueryEngineProvider.SPI
import org.neo4j.kernel.lifecycle.LifeSupport
import org.neo4j.logging.Log
import org.neo4j.scheduler.JobScheduler

class EnterpriseCompilerFactory(
                                 graph: GraphDatabaseQueryService,
                                 spi: SPI,
                                 plannerConfig: CypherPlannerConfiguration,
                                 runtimeConfig: CypherRuntimeConfiguration
                               ) extends CompilerFactory {

  val resolver: DependencyResolver = graph.getDependencyResolver();

  private val log: Log = spi.logProvider().getLog(getClass)

  /*
  One compiler is created for every Planner:Runtime:Version combination, e.g., Cost-Morsel-3.4 & Cost-Morsel-3.6.
  Each compiler contains a runtime instance, and each morsel (now pipelined replaced it) runtime instance requires a dispatcher instance.
  This ensures only one (shared) dispatcher/tracer instance is created, even when there are multiple runtime instances.
   */
  private val runtimeEnvironment = getRuntimeEnvironment(runtimeConfig, spi.jobScheduler(), spi.kernel().cursors(), spi.lifeSupport())

  def getRuntimeEnvironment(config: CypherRuntimeConfiguration,
                            jobScheduler: JobScheduler,
                            cursors: CursorFactory,
                            lifeSupport: LifeSupport) = new RuntimeEnvironment(config, createTracer(config, jobScheduler, lifeSupport), cursors)

  override def createCompiler(cypherVersion: CypherVersion,
                              cypherPlanner: CypherPlannerOption,
                              cypherRuntime: CypherRuntimeOption,
                              cypherUpdateStrategy: CypherUpdateStrategy,
                              executionEngineProvider: () => ExecutionEngine): Compiler = {

    val compatibilityMode = cypherVersion match {
      case CypherVersion.`v3_5` => true // TODO: Add v3_6
      case CypherVersion.v4_0 => false // TODO: Review
    }

    val planner =
      CypherPlanner(
        plannerConfig,
        MasterCompiler.CLOCK,
        spi.monitors(),
        log,
        cypherPlanner,
        cypherUpdateStrategy,
        LastCommittedTxIdProvider(graph),
        compatibilityMode)

    val runtime = if (plannerConfig.planSystemCommands) {
      EnterpriseAdministrationCommandRuntime(executionEngineProvider(), graph.getDependencyResolver)
    } else {
      EnterpriseRuntimeFactory.getRuntime(cypherRuntime, plannerConfig.useErrorsOverWarnings)
    }
    CypherCurrentCompiler(
      planner,
      runtime,
      EnterpriseRuntimeContextManager(GeneratedQueryStructure, log, runtimeConfig, this.runtimeEnvironment),
      spi.monitors())
  }

  private def createTracer(config: CypherRuntimeConfiguration, jobScheduler: JobScheduler, lifeSupport: LifeSupport): SchedulerTracer = {
    SchedulerTracer.NoSchedulerTracer // TODO: We want to allow for multiple tracers.
  }

}

case class RuntimeEnvironment(config: CypherRuntimeConfiguration, tracer: SchedulerTracer, cursors: CursorFactory) {

  def of(config: CypherRuntimeConfiguration,
         jobScheduler: JobScheduler,
         cursors: CursorFactory,
         lifeSupport: LifeSupport
        ) = new RuntimeEnvironment(config, createTracer(config, jobScheduler, lifeSupport), cursors)

  private def createTracer(config: CypherRuntimeConfiguration, jobScheduler: JobScheduler, lifeSupport: LifeSupport): SchedulerTracer = {
    SchedulerTracer.NoSchedulerTracer // TODO: We want to allow for multiple tracers.
  }
}

/**
 * Enterprise runtime context. Enriches the community runtime context with infrastructure needed for
 * query compilation and parallel execution.
 */
case class EnterpriseRuntimeContext(tokenContext: TokenContext,
                                    //readOnly: Boolean,
                                    schemaRead: SchemaRead,
                                    codeStructure: CodeStructure[GeneratedQuery],
                                    log: Log,
                                    clock: Clock,
                                    debugOptions: Set[String],
                                    config: CypherRuntimeConfiguration,
                                    runtimeEnvironment: RuntimeEnvironment,
                                    compileExpressions: Boolean,
                                    materializedEntitiesMode: Boolean, // Added
                                    operatorEngine: CypherOperatorEngineOption, // Added
                                    interpretedPipesFallback: CypherInterpretedPipesFallbackOption // Added
                                   ) extends RuntimeContext

