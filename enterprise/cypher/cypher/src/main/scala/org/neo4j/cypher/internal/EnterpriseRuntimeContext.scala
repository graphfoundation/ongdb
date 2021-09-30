package org.neo4j.cypher.internal

import org.neo4j.cypher.internal.options.{CypherDebugOptions, CypherInterpretedPipesFallbackOption, CypherOperatorEngineOption}
import org.neo4j.cypher.internal.planner.spi.TokenContext
import org.neo4j.internal.kernel.api.SchemaRead
import org.neo4j.logging.Log

import java.time.Clock

case class EnterpriseRuntimeContext(tokenContext: TokenContext,
                                    schemaRead: SchemaRead,
                                    log: Log,
                                    clock: Clock,
                                    debugOptions: CypherDebugOptions,
                                    config: CypherRuntimeConfiguration,
                                    runtimeEnvironment: RuntimeEnvironment,
                                    compileExpressions: Boolean,
                                    materializedEntitiesMode: Boolean,
                                    operatorEngine: CypherOperatorEngineOption,
                                    interpretedPipesFallback: CypherInterpretedPipesFallbackOption

                                   ) extends RuntimeContext

