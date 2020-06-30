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
package org.neo4j.cypher.internal.runtime.compiled

import org.neo4j.cypher.internal.plandescription.Argument
import org.neo4j.cypher.internal.profiling.ProfilingTracer
import org.neo4j.cypher.internal.runtime.ExecutionMode
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.result.RuntimeResult
import org.neo4j.kernel.impl.query.QuerySubscriber
import org.neo4j.values.virtual.MapValue

case class CompiledPlan(updating: Boolean,
                        columns: Seq[String],
                        executionResultBuilder: RunnablePlan)

trait RunnablePlan {
  def apply(queryContext: QueryContext,
            execMode: ExecutionMode,
            tracer: Option[ProfilingTracer],
            params: MapValue,
            prePopulateResults: Boolean,
            subscriber: QuerySubscriber,
           ): RuntimeResult

  def metadata: Seq[Argument]
}
