/*
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.fabric.pipeline

import org.neo4j.cypher.CypherExecutionMode
import org.neo4j.cypher.internal._
import org.neo4j.cypher.internal.compiler.Neo4jCypherExceptionFactory
import org.neo4j.cypher.internal.planner.spi.ProcedureSignatureResolver
import org.neo4j.cypher.internal.planning.WrappedMonitors
import org.neo4j.cypher.internal.tracing.CompilationTracer
import org.neo4j.cypher.internal.tracing.TimingCompilationTracer
import org.neo4j.cypher.internal.v4_0.ast.Statement
import org.neo4j.cypher.internal.v4_0.ast.semantics.SemanticErrorDef
import org.neo4j.cypher.internal.v4_0.frontend.phases._
import org.neo4j.cypher.internal.v4_0.util.CypherExceptionFactory
import org.neo4j.fabric.planning.FabricPlan
import org.neo4j.fabric.util.Errors
import org.neo4j.graphdb.Notification
import org.neo4j.monitoring
import org.neo4j.values.virtual.MapValue

case class FabricFrontEnd(
                           cypherConfig: CypherConfiguration,
                           kernelMonitors: monitoring.Monitors,
                           signatures: ProcedureSignatureResolver,
                         ) {

  val compilationTracer = new TimingCompilationTracer(
    kernelMonitors.newMonitor(classOf[TimingCompilationTracer.EventListener]))

  case class Pipeline(
                       query: PreParsedQuery,
                       params: MapValue,
                     ) {

    private val context: BaseContext = new BaseContext {
      val monitors: Monitors = WrappedMonitors(kernelMonitors)
      val tracer: CompilationPhaseTracer = CompilationPhaseTracer.NO_TRACING
      val notificationLogger: InternalNotificationLogger = new RecordingNotificationLogger(Some(query.options.offset))
      val cypherExceptionFactory: CypherExceptionFactory = Neo4jCypherExceptionFactory(query.rawStatement, Some(query.options.offset))

      val errorHandler: Seq[SemanticErrorDef] => Unit = (errors: Seq[SemanticErrorDef]) =>
        errors.foreach(e => throw cypherExceptionFactory.syntaxException(e.msg, e.position))
    }
    private val compatibilityMode = ???
    private val semanticFeatures = ???
    private val parsingConfig = ???

    def traceStart(): CompilationTracer.QueryCompilationEvent =
      compilationTracer.compileQuery(query.description)

    def notifications: Seq[Notification] =
      context.notificationLogger.notifications
        .toSeq.map(NotificationWrapping.asKernelNotification(Some(query.options.offset)))

    object parseAndPrepare {
      private val transformer = ???

      def process(): BaseState = ???

    }

    object checkAndFinalize {
      private val transformer = ???

      def process(statement: Statement): BaseState = {

        ???
      }
    }

  }

  object preParsing {

    private val preParser = new PreParser(
      cypherConfig.version,
      cypherConfig.planner,
      cypherConfig.runtime,
      cypherConfig.expressionEngineOption,
      cypherConfig.operatorEngine,
      cypherConfig.interpretedPipesFallback,
      cypherConfig.queryCacheSize,
    )

    def executionType(options: QueryOptions, inFabricContext: Boolean): FabricPlan.ExecutionType = options.executionMode match {
      case CypherExecutionMode.normal => FabricPlan.Execute
      case CypherExecutionMode.explain => FabricPlan.Explain
      case CypherExecutionMode.profile if inFabricContext => Errors.semantic("'PROFILE' not supported in Fabric context")
      case CypherExecutionMode.profile => FabricPlan.PROFILE
    }

    def preParse(queryString: String): PreParsedQuery = {
      preParser.preParseQuery(queryString)
    }

    def isPeriodicCommit(queryString: String): Boolean = {
      val preParsedQuery = preParser.preParseQuery(queryString)
      preParsedQuery.options.executionMode != CypherExecutionMode.explain && preParsedQuery.options.isPeriodicCommit
    }
  }

}

abstract class TransformerChain(parts: Transformer[BaseContext, BaseState, BaseState]*) {
  val transformer: Transformer[BaseContext, BaseState, BaseState] = parts.reduce(_ andThen _)
}

