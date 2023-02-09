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
package org.neo4j.cypher.internal

import java.time.Clock

import org.neo4j.cypher.internal.options.CypherDebugOptions
import org.neo4j.cypher.internal.options.CypherInterpretedPipesFallbackOption
import org.neo4j.cypher.internal.options.CypherOperatorEngineOption
import org.neo4j.cypher.internal.planner.spi.ReadTokenContext
import org.neo4j.cypher.internal.util.AnonymousVariableNameGenerator
import org.neo4j.internal.kernel.api.SchemaRead
import org.neo4j.logging.Log

/**
 * The regular community runtime context.
 */
case class CommunityRuntimeContext(tokenContext: ReadTokenContext,
                                   schemaRead: SchemaRead,
                                   log: Log,
                                   config: CypherRuntimeConfiguration,
                                   anonymousVariableNameGenerator: AnonymousVariableNameGenerator,
                                  ) extends RuntimeContext {

  override def compileExpressions: Boolean = false
}

case class CommunityRuntimeContextManager(log: Log, config: CypherRuntimeConfiguration) extends RuntimeContextManager[CommunityRuntimeContext] {
  override def create(tokenContext: ReadTokenContext,
                      schemaRead: SchemaRead,
                      clock: Clock,
                      debugOptions: CypherDebugOptions,
                      ignore: Boolean,
                      ignore2: Boolean,
                      ignore3: CypherOperatorEngineOption,
                      ignore4: CypherInterpretedPipesFallbackOption,
                      anonymousVariableNameGenerator: AnonymousVariableNameGenerator,
                     ): CommunityRuntimeContext =
    CommunityRuntimeContext(tokenContext, schemaRead, log, config, anonymousVariableNameGenerator)

  // As we rely completely on transaction bound resources in community,
  // there is no need for further assertions here.
  override def assertAllReleased(): Unit = {}

  override def waitForWorkersToIdle(timeoutMs: Int): Boolean = true
}
