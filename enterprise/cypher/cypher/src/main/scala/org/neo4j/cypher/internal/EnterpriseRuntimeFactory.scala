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

import org.neo4j.cypher.CypherRuntimeOption
import org.neo4j.cypher.internal.compatibility.{CypherRuntime, FallbackRuntime, InterpretedRuntime, ProcedureCallOrSchemaCommandRuntime}
// See: https://github.com/graphfoundation/ongdb/blob/e95e701325c53995a186b9222ff8cca022410286/community/cypher/cypher/src/main/scala/org/neo4j/cypher/internal/CommunityRuntimeFactory.scala
object EnterpriseRuntimeFactory {
  val interpreted = new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime, InterpretedRuntime), CypherRuntimeOption.interpreted)
  val slotted = new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime,SlottedRuntime, InterpretedRuntime), CypherRuntimeOption.slotted)
  val compiledWithoutFallback = new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime,CompiledRuntime), CypherRuntimeOption.compiled)
  val compiled = new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime,CompiledRuntime, SlottedRuntime, InterpretedRuntime), CypherRuntimeOption.compiled)
  val morselWithoutFallback = new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime,MorselRuntime), CypherRuntimeOption.morsel)
  val morsel = new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime,MorselRuntime, CompiledRuntime, SlottedRuntime, InterpretedRuntime), CypherRuntimeOption.morsel)
  val default = new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime,CompiledRuntime, SlottedRuntime, InterpretedRuntime), CypherRuntimeOption.default)

  def getRuntime(cypherRuntime: CypherRuntimeOption, disallowFallback: Boolean): CypherRuntime[EnterpriseRuntimeContext] =
    cypherRuntime match {
      case CypherRuntimeOption.interpreted => interpreted

      case CypherRuntimeOption.slotted => slotted

      case CypherRuntimeOption.compiled if disallowFallback => compiledWithoutFallback

      case CypherRuntimeOption.compiled => compiled

      case CypherRuntimeOption.morsel if disallowFallback => morselWithoutFallback

      case CypherRuntimeOption.morsel => morsel

      case CypherRuntimeOption.default => default
    }
}
