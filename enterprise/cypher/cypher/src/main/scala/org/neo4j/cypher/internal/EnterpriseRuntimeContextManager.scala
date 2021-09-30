package org.neo4j.cypher.internal

import org.neo4j.cypher.internal.options.{CypherDebugOptions, CypherInterpretedPipesFallbackOption, CypherOperatorEngineOption}
import org.neo4j.cypher.internal.planner.spi.TokenContext
import org.neo4j.internal.kernel.api.SchemaRead
import org.neo4j.logging.Log

import java.time.Clock

case class EnterpriseRuntimeContextManager(log: Log,
                                           config: CypherRuntimeConfiguration,
                                           runtimeEnvironment: RuntimeEnvironment) extends RuntimeContextManager[EnterpriseRuntimeContext] {

  override def create(tokenContext: TokenContext,
                      schemaRead: SchemaRead,
                      clock: Clock,
                      debugOptions: CypherDebugOptions,
                      compileExpressions: Boolean,
                      materializedEntitiesMode: Boolean,
                      operatorEngine: CypherOperatorEngineOption,
                      interpretedPipesFallback: CypherInterpretedPipesFallbackOption): EnterpriseRuntimeContext = {

    EnterpriseRuntimeContext(tokenContext,
      schemaRead,
      log, clock, debugOptions, config, runtimeEnvironment,
      compileExpressions, materializedEntitiesMode, operatorEngine,
      interpretedPipesFallback

    )
  }

  override def assertAllReleased() = {

  }

  override def waitForWorkersToIdle(timeoutMs: Int): Boolean = {
    true
  }
}


