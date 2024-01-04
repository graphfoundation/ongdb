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
package org.neo4j.cypher.internal

import org.neo4j.cypher.CypherRuntimeOption
import org.neo4j.cypher.internal.compatibility.CypherRuntime
import org.neo4j.cypher.internal.compatibility.FallbackRuntime
import org.neo4j.cypher.internal.compatibility.InterpretedRuntime
import org.neo4j.cypher.internal.compatibility.ProcedureCallOrSchemaCommandRuntime
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.EnterpriseRuntimeContext

object EnterpriseRuntimeBuilder {

  def create(runtimeName: CypherRuntimeOption, useErrorsOverWarnings: Boolean): CypherRuntime[EnterpriseRuntimeContext] = {

    runtimeName match {
      case CypherRuntimeOption.interpreted =>
        new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime, InterpretedRuntime), CypherRuntimeOption.interpreted)

      case CypherRuntimeOption.morsel if useErrorsOverWarnings =>
        new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime, MorselRuntime), CypherRuntimeOption.morsel)

      case CypherRuntimeOption.morsel =>
        new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime, MorselRuntime), CypherRuntimeOption.morsel)

      case CypherRuntimeOption.slotted if useErrorsOverWarnings =>
        new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime, SlottedRuntime), CypherRuntimeOption.slotted)

      case CypherRuntimeOption.slotted =>
        new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime, SlottedRuntime), CypherRuntimeOption.slotted)

      case CypherRuntimeOption.compiled if useErrorsOverWarnings =>
        new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime, CompiledRuntime), CypherRuntimeOption.compiled)

      case CypherRuntimeOption.compiled =>
        new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime, CompiledRuntime), CypherRuntimeOption.compiled)

      case CypherRuntimeOption.default =>
        new FallbackRuntime[EnterpriseRuntimeContext](List(ProcedureCallOrSchemaCommandRuntime, CompiledRuntime), CypherRuntimeOption.default)
    }
  }
}
