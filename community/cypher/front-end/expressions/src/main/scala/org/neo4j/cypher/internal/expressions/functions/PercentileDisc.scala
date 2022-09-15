/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
import org.neo4j.cypher.internal.util.symbols.CTFloat
import org.neo4j.cypher.internal.util.symbols.CTInteger

case object PercentileDisc extends AggregatingFunction {
  def name = "percentileDisc"

  override val signatures = Vector(
    FunctionTypeSignature(function = this, names = Vector("input", "percentile"), argumentTypes = Vector(CTInteger, CTFloat), outputType = CTInteger,
      description = "Returns the nearest integer value to the given percentile over a group using a rounding method.", category = Category.AGGREGATING),
    FunctionTypeSignature(function = this, names = Vector("input", "percentile"), argumentTypes = Vector(CTFloat, CTFloat), outputType = CTFloat,
      description = "Returns the nearest floating point value to the given percentile over a group using a rounding method.", category = Category.AGGREGATING)
  )
}
