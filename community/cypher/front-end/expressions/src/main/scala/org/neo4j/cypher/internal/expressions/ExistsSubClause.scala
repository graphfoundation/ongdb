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
package org.neo4j.cypher.internal.expressions

import org.neo4j.cypher.internal.util.InputPosition

case class ExistsSubClause(pattern: Pattern, optionalWhereExpression: Option[Expression])
                          (val position: InputPosition, override val outerScope: Set[LogicalVariable]) extends ScopeExpression with BooleanExpression with ExpressionWithOuterScope {

  self =>

  val patternElements: Seq[PatternElement] = pattern.patternParts.map(_.element)

  override def withOuterScope(outerScope: Set[LogicalVariable]): ExistsSubClause = copy()(position, outerScope)

  override val introducedVariables: Set[LogicalVariable] = patternElements.collect { case e => e.allVariables }.flatten.toSet -- outerScope

  override def dup(children: Seq[AnyRef]): this.type = {
    ExistsSubClause(
      children(0).asInstanceOf[Pattern],
      children(1).asInstanceOf[Option[Expression]],
    )(position, outerScope).asInstanceOf[this.type]
  }
}
