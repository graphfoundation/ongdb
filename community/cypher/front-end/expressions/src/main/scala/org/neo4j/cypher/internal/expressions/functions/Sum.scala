/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.cypher.internal.expressions.functions

import org.neo4j.cypher.internal.expressions.FunctionTypeSignature
import org.neo4j.cypher.internal.util.symbols.CTDuration
import org.neo4j.cypher.internal.util.symbols.CTFloat
import org.neo4j.cypher.internal.util.symbols.CTInteger

case object Sum extends AggregatingFunction {
  def name = "sum"

  override val signatures: Vector[FunctionTypeSignature] = Vector(
     FunctionTypeSignature(function = this, names = Vector("input"), argumentTypes = Vector(CTInteger), outputType = CTInteger,
      description = "Returns the sum of a set of integers", category = Category.AGGREGATING),
     FunctionTypeSignature(function = this, names = Vector("input"), argumentTypes = Vector(CTFloat), outputType = CTFloat,
      description = "Returns the sum of a set of floats", category = Category.AGGREGATING),
     FunctionTypeSignature(function = this, names = Vector("input"), argumentTypes = Vector(CTDuration), outputType = CTDuration,
      description = "Returns the sum of a set of durations", category = Category.AGGREGATING)
  )
}
