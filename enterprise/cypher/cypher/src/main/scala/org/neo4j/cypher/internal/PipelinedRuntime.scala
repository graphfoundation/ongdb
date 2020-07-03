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

import org.neo4j.internal.kernel.api.security.SecurityContext

/**
 * Following the same conventions as other Runtimes. (InterpretedPipeline, etc).
 * We are calling this PipelinedRuntime as the convention suggests.
 * TODO: We will implement this runtime last
 */
class PipelinedRuntime extends CypherRuntime[EnterpriseRuntimeContext] with DebugPrettyPrinter {

  override def compileToExecutable(query: LogicalQuery, context: EnterpriseRuntimeContext,
                                   securityContext: SecurityContext = {
                                     null
                                   }): ExecutionPlan = {
    null
  }

  override def name: String = "pipelined"

  class PipelinedExecutionPlan

}

object PipelinedRuntime {
  // TODO: Placeholders - see org.neo4j.cypher.internal.RuntimeName
  val PIPELINED: org.neo4j.cypher.internal.PipelinedRuntime = {
    null
  }
  val PARALLEL: org.neo4j.cypher.internal.PipelinedRuntime = {
    null
  }
}

