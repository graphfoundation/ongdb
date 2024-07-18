/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled

import org.neo4j.cypher.internal.compatibility.RuntimeContext
import org.neo4j.cypher.internal.compatibility.RuntimeContextCreator
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.codegen.spi.CodeStructure
import org.neo4j.cypher.internal.compiler.v3_5.CypherPlannerConfiguration
import org.neo4j.cypher.internal.planner.v3_5.spi.TokenContext
import org.neo4j.cypher.internal.runtime.vectorized.dispatcher.Dispatcher
import org.neo4j.cypher.internal.v3_5.executionplan.GeneratedQuery
import org.neo4j.logging.Log

import java.time.Clock

case class EnterpriseRuntimeContext(tokenContext: TokenContext,
                                    readOnly: Boolean,
                                    config: CypherPlannerConfiguration,
                                    compileExpressions: Boolean,
                                    log: Log,
                                    clock: Clock,
                                    debugOptions: Set[String],
                                    codeStructure: CodeStructure[GeneratedQuery],
                                    dispatcher: Dispatcher) extends RuntimeContext

case class EnterpriseRuntimeContextCreator(codeStructure: CodeStructure[GeneratedQuery], log: Log, config: CypherPlannerConfiguration, dispatcher: Dispatcher)
  extends RuntimeContextCreator[EnterpriseRuntimeContext] {

  override def create(tokenContext: TokenContext,
                      clock: Clock,
                      debugOptions: Set[String],
                      readOnly: Boolean,
                      compileExpressions: Boolean): EnterpriseRuntimeContext =
    EnterpriseRuntimeContext(tokenContext, readOnly, config, compileExpressions, log, clock, debugOptions, codeStructure, dispatcher)

}
