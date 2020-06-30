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

import org.neo4j.cypher.CypherInterpretedPipesFallbackOption
import org.neo4j.cypher.CypherOperatorEngineOption
import org.neo4j.cypher.internal.executionplan.GeneratedQuery
import org.neo4j.cypher.internal.planner.spi.TokenContext
import org.neo4j.cypher.internal.runtime.compiled.codegen.spi.CodeStructure
import org.neo4j.internal.kernel.api.SchemaRead
import org.neo4j.logging.Log

case class EnterpriseRuntimeContextManager(codeStructure: CodeStructure[GeneratedQuery], log: Log,
                                           config: CypherRuntimeConfiguration,
                                           runtimeEnvironment: RuntimeEnvironment) extends RuntimeContextManager[EnterpriseRuntimeContext] {

  override def create(tokenContext: TokenContext, schemaRead: SchemaRead, clock: Clock, debugOptions: Set[String], compileExpressions: Boolean,
                      materializedEntitiesMode: Boolean,
                      operatorEngine: CypherOperatorEngineOption,
                      interpretedPipesFallback: CypherInterpretedPipesFallbackOption): EnterpriseRuntimeContext = {

    EnterpriseRuntimeContext(tokenContext, schemaRead, codeStructure, log, clock, debugOptions, config, runtimeEnvironment, compileExpressions, materializedEntitiesMode, operatorEngine, interpretedPipesFallback)
  }

  override def assertAllReleased(): Unit = {
    ???
  }
}

