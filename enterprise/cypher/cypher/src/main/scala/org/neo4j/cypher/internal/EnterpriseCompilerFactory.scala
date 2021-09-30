package org.neo4j.cypher.internal

import org.neo4j.common.DependencyResolver
import org.neo4j.cypher.internal.cache.ExecutorBasedCaffeineCacheFactory
import org.neo4j.cypher.internal.compiler.CypherPlannerConfiguration
import org.neo4j.cypher.internal.compiler.phases._
import org.neo4j.cypher.internal.options.{CypherPlannerOption, CypherRuntimeOption, CypherUpdateStrategy, CypherVersion}
import org.neo4j.cypher.internal.planning.CypherPlanner
import org.neo4j.kernel.GraphDatabaseQueryService
import org.neo4j.kernel.database.DatabaseMemoryTrackers
import org.neo4j.kernel.impl.query.QueryEngineProvider
import org.neo4j.logging.Log
import org.neo4j.memory.MemoryTracker
import org.neo4j.scheduler.{Group, JobMonitoringParams, MonitoredJobExecutor}

// Reference CommunityCompilerFactory

class EnterpriseCompilerFactory(graph: GraphDatabaseQueryService,
                                spi: QueryEngineProvider.SPI,
                                plannerConfig: CypherPlannerConfiguration,
                                runtimeConfig: CypherRuntimeConfiguration) extends CompilerFactory {

  val resolver: DependencyResolver = graph.getDependencyResolver();
  val otherMemoryTracker: MemoryTracker = resolver.resolveDependency(classOf[DatabaseMemoryTrackers]).getOtherTracker
  private val log: Log = spi.logProvider().getLog(getClass)
  private val runtimeEnvironment =
    RuntimeEnvironment.of(
      runtimeConfig,
      spi.jobScheduler(),
      spi.kernel().cursors(),
      spi.lifeSupport(),
      otherMemoryTracker)

  override def supportsAdministrativeCommands(): Boolean = plannerConfig.planSystemCommands

  override def createCompiler(cypherVersion: CypherVersion,
                              cypherPlanner: CypherPlannerOption,
                              cypherRuntime: CypherRuntimeOption,
                              cypherUpdateStrategy: CypherUpdateStrategy, executionEngineProvider: () => ExecutionEngine): Compiler = {
    val compatibilityMode = cypherVersion match {
      case CypherVersion.`v3_5` => Compatibility3_5
      case CypherVersion.`v4_2` => Compatibility4_2
      case CypherVersion.`v4_3` => Compatibility4_3
      case _ => Compatibility4_3
    }

    val monitoredExecutor: MonitoredJobExecutor = spi.jobScheduler.monitoredJobExecutor(Group.CYPHER_CACHE)
    val planner =
      CypherPlanner(
        plannerConfig,
        MasterCompiler.CLOCK,
        spi.monitors(),
        log,
        new ExecutorBasedCaffeineCacheFactory(job => monitoredExecutor.execute(JobMonitoringParams.systemJob("Query plan cache maintenance"), job)),
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
      EnterpriseRuntimeContextManager(log, runtimeConfig, runtimeEnvironment),
      spi.monitors())

  }

}
