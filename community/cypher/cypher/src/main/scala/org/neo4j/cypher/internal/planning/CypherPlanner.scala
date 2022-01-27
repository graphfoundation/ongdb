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
package org.neo4j.cypher.internal.planning

import org.neo4j.cypher.internal.AdministrationCommandRuntime
import org.neo4j.cypher.internal.CacheTracer
import org.neo4j.cypher.internal.CompilerWithExpressionCodeGenOption
import org.neo4j.cypher.internal.CypherQueryObfuscator
import org.neo4j.cypher.internal.CypherRuntime
import org.neo4j.cypher.internal.FineToReuse
import org.neo4j.cypher.internal.FullyParsedQuery
import org.neo4j.cypher.internal.MaybeReusable
import org.neo4j.cypher.internal.PlanFingerprint
import org.neo4j.cypher.internal.PlanFingerprintReference
import org.neo4j.cypher.internal.PreParsedQuery
import org.neo4j.cypher.internal.QueryCache
import org.neo4j.cypher.internal.QueryCache.CacheKey
import org.neo4j.cypher.internal.QueryCache.ParameterTypeMap
import org.neo4j.cypher.internal.QueryOptions
import org.neo4j.cypher.internal.ReusabilityState
import org.neo4j.cypher.internal.SchemaCommandRuntime
import org.neo4j.cypher.internal.ast.Statement
import org.neo4j.cypher.internal.cache.CaffeineCacheFactory
import org.neo4j.cypher.internal.cache.LFUCache
import org.neo4j.cypher.internal.compiler
import org.neo4j.cypher.internal.compiler.CypherPlannerConfiguration
import org.neo4j.cypher.internal.compiler.CypherPlannerFactory
import org.neo4j.cypher.internal.compiler.ExecutionModel.BatchedParallel
import org.neo4j.cypher.internal.compiler.ExecutionModel.BatchedSingleThreaded
import org.neo4j.cypher.internal.compiler.ExecutionModel.Volcano
import org.neo4j.cypher.internal.compiler.MissingParametersNotification
import org.neo4j.cypher.internal.compiler.UpdateStrategy
import org.neo4j.cypher.internal.compiler.defaultUpdateStrategy
import org.neo4j.cypher.internal.compiler.eagerUpdateStrategy
import org.neo4j.cypher.internal.compiler.phases.CypherCompatibilityVersion
import org.neo4j.cypher.internal.compiler.phases.LogicalPlanState
import org.neo4j.cypher.internal.compiler.phases.PlannerContext
import org.neo4j.cypher.internal.compiler.planner.logical.CachedSimpleMetricsFactory
import org.neo4j.cypher.internal.compiler.planner.logical.idp.ComponentConnectorPlanner
import org.neo4j.cypher.internal.compiler.planner.logical.idp.ConfigurableIDPSolverConfig
import org.neo4j.cypher.internal.compiler.planner.logical.idp.DPSolverConfig
import org.neo4j.cypher.internal.compiler.planner.logical.idp.IDPQueryGraphSolver
import org.neo4j.cypher.internal.compiler.planner.logical.idp.IDPQueryGraphSolverMonitor
import org.neo4j.cypher.internal.compiler.planner.logical.idp.SingleComponentPlanner
import org.neo4j.cypher.internal.compiler.planner.logical.idp.cartesianProductsOrValueJoins
import org.neo4j.cypher.internal.compiler.planner.logical.simpleExpressionEvaluator
import org.neo4j.cypher.internal.expressions.AutoExtractedParameter
import org.neo4j.cypher.internal.expressions.Parameter
import org.neo4j.cypher.internal.expressions.SensitiveLiteral
import org.neo4j.cypher.internal.expressions.SensitiveParameter
import org.neo4j.cypher.internal.frontend.phases.BaseState
import org.neo4j.cypher.internal.frontend.phases.CompilationPhaseTracer
import org.neo4j.cypher.internal.frontend.phases.Monitors
import org.neo4j.cypher.internal.logical.plans.AdministrationCommandLogicalPlan
import org.neo4j.cypher.internal.logical.plans.LoadCSV
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.ProcedureCall
import org.neo4j.cypher.internal.logical.plans.ResolvedCall
import org.neo4j.cypher.internal.logical.plans.SystemProcedureCall
import org.neo4j.cypher.internal.options.CypherConnectComponentsPlannerOption
import org.neo4j.cypher.internal.options.CypherPlannerOption
import org.neo4j.cypher.internal.options.CypherRuntimeOption
import org.neo4j.cypher.internal.options.CypherUpdateStrategy
import org.neo4j.cypher.internal.planner.spi.CostBasedPlannerName
import org.neo4j.cypher.internal.planner.spi.DPPlannerName
import org.neo4j.cypher.internal.planner.spi.IDPPlannerName
import org.neo4j.cypher.internal.planner.spi.PlanContext
import org.neo4j.cypher.internal.planning.CypherPlanner.createQueryGraphSolver
import org.neo4j.cypher.internal.runtime.interpreted.TransactionalContextWrapper
import org.neo4j.cypher.internal.spi.ExceptionTranslatingPlanContext
import org.neo4j.cypher.internal.spi.TransactionBoundPlanContext
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.InternalNotification
import org.neo4j.cypher.internal.util.InternalNotificationLogger
import org.neo4j.cypher.internal.util.RecordingNotificationLogger
import org.neo4j.cypher.internal.util.attribution.SequentialIdGen
import org.neo4j.exceptions.DatabaseAdministrationException
import org.neo4j.exceptions.Neo4jException
import org.neo4j.exceptions.SyntaxException
import org.neo4j.kernel.api.query.QueryObfuscator
import org.neo4j.kernel.impl.api.SchemaStateKey
import org.neo4j.kernel.impl.query.TransactionalContext
import org.neo4j.logging.Log
import org.neo4j.monitoring
import org.neo4j.values.virtual.MapValue
import org.neo4j.values.virtual.MapValueBuilder

import java.time.Clock
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object CypherPlanner {
  /**
   * This back-door is intended for quick handling of bugs and support cases
   * where we need to inject some specific indexes and statistics.
   */
  var customPlanContextCreator: Option[(TransactionalContextWrapper, InternalNotificationLogger, Log) => PlanContext] = None

  /**
   * Create a Query Graph solver that matches the configurations and pre-parser options.
   */
  private[planning] def createQueryGraphSolver(config: CypherPlannerConfiguration,
                                               plannerOption: CypherPlannerOption,
                                               connectComponentsPlannerOption: CypherConnectComponentsPlannerOption,
                                               monitors: Monitors): IDPQueryGraphSolver = {
    val plannerName: CostBasedPlannerName =
      plannerOption match {
        case CypherPlannerOption.default => CostBasedPlannerName.default
        case CypherPlannerOption.cost | CypherPlannerOption.idp => IDPPlannerName
        case CypherPlannerOption.dp => DPPlannerName
        case _ => throw new IllegalArgumentException(s"unknown cost based planner: ${plannerOption.name}")
      }

    // Let's only create a monitor when we have a valid plannerName
    val (monitor, solverConfig) = plannerName match {
      case IDPPlannerName =>
        val monitor = monitors.newMonitor[IDPQueryGraphSolverMonitor]()
        val solverConfig = new ConfigurableIDPSolverConfig(
          maxTableSize = config.idpMaxTableSize,
          iterationDurationLimit = config.idpIterationDuration
        )
        (monitor, solverConfig)
      case DPPlannerName =>
        val monitor = monitors.newMonitor[IDPQueryGraphSolverMonitor]()
        (monitor, DPSolverConfig)
    }

    val singleComponentPlanner = SingleComponentPlanner(solverConfig)(monitor)
    val componentConnectorPlanner = connectComponentsPlannerOption match {
      case CypherConnectComponentsPlannerOption.idp |
           CypherConnectComponentsPlannerOption.default => ComponentConnectorPlanner(singleComponentPlanner, solverConfig)(monitor)
      case CypherConnectComponentsPlannerOption.greedy  => cartesianProductsOrValueJoins
    }
    IDPQueryGraphSolver(singleComponentPlanner, componentConnectorPlanner)(monitor)
  }

}

case class ParsedQueriesCacheKey(key: String, parameterTypes: ParameterTypeMap)

object ParsedQueriesCacheKey {
  def key(preParsedQuery: PreParsedQuery, params: MapValue): ParsedQueriesCacheKey =
    ParsedQueriesCacheKey(preParsedQuery.cacheKey, QueryCache.extractParameterTypeMap(params))
}

/**
 * Cypher planner, which either parses and plans a [[PreParsedQuery]] into a [[LogicalPlanResult]] or just plans [[FullyParsedQuery]].
 *
 * @param lastCommittedTxIdProvider Last committed transaction id provider used to compute logical plan staleness
 */
case class CypherPlanner(config: CypherPlannerConfiguration,
                         clock: Clock,
                         kernelMonitors: monitoring.Monitors,
                         log: Log,
                         cacheFactory: CaffeineCacheFactory,
                         plannerOption: CypherPlannerOption,
                         updateStrategy: CypherUpdateStrategy,
                         lastCommittedTxIdProvider: () => Long,
                         compatibilityMode: CypherCompatibilityVersion
    ) {

  private val parsedQueries = new LFUCache[ParsedQueriesCacheKey, BaseState](cacheFactory, config.queryCacheSize)

  private val monitors: Monitors = WrappedMonitors(kernelMonitors)

  private val cacheTracer: CacheTracer[CacheKey[Statement]] = monitors.newMonitor[CacheTracer[CacheKey[Statement]]]("cypher")

  private val planCache: AstLogicalPlanCache[Statement] =
    new AstLogicalPlanCache(cacheFactory,
      config.queryCacheSize,
      cacheTracer,
      clock,
      config.statsDivergenceCalculator,
      lastCommittedTxIdProvider,
      log)

  monitors.addMonitorListener(planCache.logStalePlanRemovalMonitor(log), "cypher")

  private val maybeUpdateStrategy: Option[UpdateStrategy] = updateStrategy match {
    case CypherUpdateStrategy.eager => Some(eagerUpdateStrategy)
    case _ => None
  }

  private val planner: compiler.CypherPlanner[PlannerContext] =
    new CypherPlannerFactory().costBasedCompiler(config, clock, monitors, maybeUpdateStrategy)

  private val schemaStateKey: SchemaStateKey = SchemaStateKey.newKey()

  /**
   * Clear the caches of this caching compiler.
   *
   * @return the number of entries that were cleared
   */
  def clearCaches(): Long = {
    Math.max(parsedQueries.clear(), planCache.clear())
  }

  /**
   * Get the parsed query from cache, or parses and caches it.
   */
  @throws(classOf[SyntaxException])
  private def getOrParse(preParsedQuery: PreParsedQuery,
                         params: MapValue,
                         notificationLogger: InternalNotificationLogger,
                         offset: InputPosition,
                         tracer: CompilationPhaseTracer,
                        ): BaseState = {

    val key = ParsedQueriesCacheKey.key(preParsedQuery, params)
    parsedQueries.get(key).getOrElse {
      val parsedQuery = planner.parseQuery(preParsedQuery.statement,
        preParsedQuery.rawStatement,
        notificationLogger,
        preParsedQuery.options.queryOptions.planner.name,
        Some(offset),
        tracer,
        params,
        compatibilityMode)
      if (!config.planSystemCommands) parsedQueries.put(key, parsedQuery)
      parsedQuery
    }
  }

  /**
   * Compile pre-parsed query into a logical plan.
   *
   * @param preParsedQuery       pre-parsed query to convert
   * @param tracer               tracer to which events of the parsing and planning are reported
   * @param transactionalContext transactional context to use during parsing and planning
   * @throws Neo4jException public cypher exceptions on compilation problems
   * @return a logical plan result
   */
  def parseAndPlan(preParsedQuery: PreParsedQuery,
                   tracer: CompilationPhaseTracer,
                   transactionalContext: TransactionalContext,
                   params: MapValue,
                   runtime: CypherRuntime[_]
                  ): LogicalPlanResult = {
    val notificationLogger = new RecordingNotificationLogger(Some(preParsedQuery.options.offset))

    val syntacticQuery = getOrParse(preParsedQuery, params, notificationLogger, preParsedQuery.options.offset, tracer)

    // The parser populates the notificationLogger as a side-effect of its work, therefore
    // in the case of a cached query the notificationLogger will not be properly filled
    syntacticQuery.maybeSemantics.map(_.notifications).getOrElse(Set.empty).foreach(notificationLogger.log)

    doPlan(syntacticQuery, preParsedQuery.options, tracer, transactionalContext, params, runtime, notificationLogger,
      preParsedQuery.rawStatement)
  }

  /**
   * Plan fully-parsed query into a logical plan.
   *
   * @param fullyParsedQuery     a fully-parsed query to plan
   * @param tracer               tracer to which events of the parsing and planning are reported
   * @param transactionalContext transactional context to use during parsing and planning
   * @throws Neo4jException public cypher exceptions on compilation problems
   * @return a logical plan result
   */
  @throws[Neo4jException]
  def plan(fullyParsedQuery: FullyParsedQuery,
           tracer: CompilationPhaseTracer,
           transactionalContext: TransactionalContext,
           params: MapValue,
           runtime: CypherRuntime[_]
          ): LogicalPlanResult = {
    val notificationLogger = new RecordingNotificationLogger(Some(fullyParsedQuery.options.offset))
    doPlan(fullyParsedQuery.state, fullyParsedQuery.options, tracer, transactionalContext, params, runtime, notificationLogger,
      fullyParsedQuery.state.queryText)
  }

  private def doPlan(syntacticQuery: BaseState,
                     options: QueryOptions,
                     tracer: CompilationPhaseTracer,
                     transactionalContext: TransactionalContext,
                     params: MapValue,
                     runtime: CypherRuntime[_],
                     notificationLogger: InternalNotificationLogger,
                     rawQueryText: String
                    ): LogicalPlanResult = {
    val transactionalContextWrapper = TransactionalContextWrapper(transactionalContext)
    // Context used for db communication during planning
    val createPlanContext = CypherPlanner.customPlanContextCreator.getOrElse(TransactionBoundPlanContext.apply _)
    val planContext = new ExceptionTranslatingPlanContext(createPlanContext(transactionalContextWrapper, notificationLogger, log))

    val inferredRuntime: CypherRuntimeOption = options.queryOptions.runtime match {
      case CypherRuntimeOption.default => runtime.correspondingRuntimeOption.getOrElse(CypherRuntimeOption.default)
      case x => x
    }
    val containsUpdates: Boolean = syntacticQuery.statement().containsUpdates
    val executionModel = inferredRuntime match {
      case CypherRuntimeOption.pipelined => BatchedSingleThreaded(config.pipelinedBatchSizeSmall, config.pipelinedBatchSizeBig)
      case CypherRuntimeOption.parallel if !containsUpdates => BatchedParallel(config.pipelinedBatchSizeSmall, config.pipelinedBatchSizeBig)
      case _ => Volcano
    }

    // Context used to create logical plans
    val plannerContext = PlannerContext(
      tracer,
      notificationLogger,
      planContext,
      rawQueryText,
      options.queryOptions.debugOptions,
      executionModel,
      Some(options.offset),
      monitors,
      CachedSimpleMetricsFactory,
      createQueryGraphSolver(config, plannerOption, options.queryOptions.connectComponentsPlanner, monitors),
      config,
      maybeUpdateStrategy.getOrElse(defaultUpdateStrategy),
      clock,
      new SequentialIdGen(),
      simpleExpressionEvaluator,
      params)

    // Prepare query for caching
    val preparedQuery = planner.normalizeQuery(syntacticQuery, plannerContext)


    val (queryParamNames, autoExtractParams) = parameterNamesAndValues(preparedQuery.statement())

    // Get obfuscator out ASAP to make query text available for `dbms.listQueries`, etc
    val obfuscator = CypherQueryObfuscator(preparedQuery.obfuscationMetadata())
    transactionalContext.executingQuery.onObfuscatorReady(obfuscator)

    checkForSchemaChanges(transactionalContextWrapper)

    // If the query is not cached we want to do the full planning
    def createPlan(shouldBeCached: Boolean, missingParameterNames: Seq[String] = Seq.empty) =
      doCreatePlan(preparedQuery, plannerContext, notificationLogger, runtime, planContext, shouldBeCached, missingParameterNames)

    // Filter the parameters to retain only those that are actually used in the query (or a subset of them, if not enough
    // parameters where given in the first place)
    val filteredParams: MapValue = params.updatedWith(autoExtractParams).filter((name, _) => queryParamNames.contains(name))

    val enoughParametersSupplied = queryParamNames.size == filteredParams.size // this is relevant if the query has parameters

    val compilerWithExpressionCodeGenOption = new CompilerWithExpressionCodeGenOption[CacheableLogicalPlan] {
      override def compile(): CacheableLogicalPlan = createPlan(shouldBeCached = true)
      override def compileWithExpressionCodeGen(): CacheableLogicalPlan = compile()
      override def maybeCompileWithExpressionCodeGen(hitCount: Int): Option[CacheableLogicalPlan] = None
    }

    val cacheableLogicalPlan =
    // We don't want to cache any query without enough given parameters (although EXPLAIN queries will succeed)
      if (options.queryOptions.debugOptions.isEmpty && (queryParamNames.isEmpty || enoughParametersSupplied)) {
        val cacheKey = CacheKey(
          syntacticQuery.statement(),
          QueryCache.extractParameterTypeMap(filteredParams),
          transactionalContext.kernelTransaction().dataRead().transactionStateHasChanges()
        )

        planCache.computeIfAbsentOrStale(cacheKey,
          transactionalContext,
          compilerWithExpressionCodeGenOption,
          options.queryOptions.replan,
          transactionalContext.executingQuery().id())
      } else if (!enoughParametersSupplied) {
        createPlan(shouldBeCached = false, missingParameterNames = queryParamNames.filterNot(filteredParams.containsKey))
      } else {
        createPlan(shouldBeCached = false)
      }
    LogicalPlanResult(
      cacheableLogicalPlan.logicalPlanState,
      queryParamNames,
      autoExtractParams,
      cacheableLogicalPlan.reusability,
      plannerContext,
      cacheableLogicalPlan.notifications,
      cacheableLogicalPlan.shouldBeCached,
      obfuscator)
  }


  private def doCreatePlan(preparedQuery: BaseState,
                           context: PlannerContext,
                           notificationLogger: InternalNotificationLogger,
                           runtime: CypherRuntime[_],
                           planContext: PlanContext,
                           shouldBeCached: Boolean,
                           missingParameterNames: Seq[String]): CacheableLogicalPlan = {
    val logicalPlanStateOld = planner.planPreparedQuery(preparedQuery, context)
    val hasLoadCsv = logicalPlanStateOld.logicalPlan.treeFind[LogicalPlan] {
      case _: LoadCSV => true
    }.nonEmpty
    val logicalPlanState = logicalPlanStateOld.copy(hasLoadCSV = hasLoadCsv)
    notification.LogicalPlanNotifications
      .checkForNotifications(logicalPlanState.maybeLogicalPlan.get, planContext, config)
      .foreach(notificationLogger.log)
    if (missingParameterNames.nonEmpty) {
      notificationLogger.log(MissingParametersNotification(missingParameterNames))
    }
    val (reusabilityState, shouldCache) = runtime match {
      case m: AdministrationCommandRuntime =>
        if (m.isApplicableAdministrationCommand(logicalPlanState)) {
          val allowQueryCaching = logicalPlanState.maybeLogicalPlan match {
            case Some(_: SystemProcedureCall) => false
            case Some(ContainsSensitiveFields()) => false
            case _ => true
          }
          (FineToReuse, allowQueryCaching)
        } else {
          logicalPlanState.maybeLogicalPlan match {
            case Some(ProcedureCall(_, ResolvedCall(signature, _, _, _, _, _))) if signature.systemProcedure => (FineToReuse, false)
            case Some(_: ProcedureCall) => throw new DatabaseAdministrationException("Attempting invalid procedure call in administration runtime")
            case Some(plan: AdministrationCommandLogicalPlan) => throw plan.invalid("Unsupported administration command: " + logicalPlanState.queryText)
            case _ => throw new DatabaseAdministrationException("Attempting invalid administration command in administration runtime")
          }
        }
      case _ if SchemaCommandRuntime.isApplicable(logicalPlanState) => (FineToReuse, shouldBeCached)
      case _ =>
        val fingerprint = PlanFingerprint.take(clock, planContext.lastCommittedTxIdProvider, planContext.statistics)
        val fingerprintReference = new PlanFingerprintReference(fingerprint)
        (MaybeReusable(fingerprintReference), shouldBeCached)
    }
    CacheableLogicalPlan(logicalPlanState, reusabilityState, notificationLogger.notifications.toIndexedSeq, shouldCache)
  }

  private def checkForSchemaChanges(tcw: TransactionalContextWrapper): Unit =
    tcw.getOrCreateFromSchemaState(schemaStateKey, planCache.clear())

  private def parameterNamesAndValues(statement: Statement): (ArrayBuffer[String], MapValue) = {
    val names = mutable.ArrayBuffer.empty[String]
    val mapBuilder = new MapValueBuilder()
    val extractor = new ParameterLiteralExtractor
    statement.findAllByClass[Parameter].foreach {
      case AutoExtractedParameter(name, _, writer, _) =>
        names += name
        writer.writeTo(extractor)
        mapBuilder.add(name, extractor.value)
      case Parameter(name, _) =>
        names += name
    }
    (names.distinct, mapBuilder.build())
  }
}

object ContainsSensitiveFields {
  def unapply(plan: LogicalPlan): Boolean = {
    plan.treeExists {
      case _: SensitiveLiteral => true
      case _: SensitiveParameter => true
    }
  }
}

case class LogicalPlanResult(logicalPlanState: LogicalPlanState,
                             paramNames: Seq[String],
                             extractedParams: MapValue,
                             reusability: ReusabilityState,
                             plannerContext: PlannerContext,
                             notifications: IndexedSeq[InternalNotification],
                             shouldBeCached: Boolean,
                             queryObfuscator: QueryObfuscator)

trait CypherCacheFlushingMonitor {
  def cacheFlushDetected(sizeBeforeFlush: Long): Unit = {}
}

trait CypherCacheHitMonitor[T] {
  def cacheHit(key: T): Unit = {}

  def cacheMiss(key: T): Unit = {}

  def cacheDiscard(key: T, userKey: String, secondsSinceReplan: Int, maybeReason: Option[String]): Unit = {}

  def cacheCompile(key: T): Unit = {}

  def cacheCompileWithExpressionCodeGen(key: T): Unit = {}
}

/**
 * See comment in MonitoringCacheTracer for justification of the existence of this type.
 */
trait CypherCacheMonitor[T] extends CypherCacheHitMonitor[T] with CypherCacheFlushingMonitor
