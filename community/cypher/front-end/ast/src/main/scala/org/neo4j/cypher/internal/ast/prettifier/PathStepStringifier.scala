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
package org.neo4j.cypher.internal.ast.prettifier

import org.neo4j.cypher.internal.expressions.LogicalVariable
import org.neo4j.cypher.internal.expressions.MultiRelationshipPathStep
import org.neo4j.cypher.internal.expressions.NilPathStep
import org.neo4j.cypher.internal.expressions.NodePathStep
import org.neo4j.cypher.internal.expressions.PathStep
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.expressions.SingleRelationshipPathStep

case class PathStepStringifier(expr: ExpressionStringifier) {

  def apply(pathStep: PathStep): String = pathStep match {
    case SingleRelationshipPathStep(rel, direction, toNode, next) => relationshipPathStep(rel, direction, toNode, next, isMultiRel = false)

    case NodePathStep(node, next) => s"(${expr(node)})${apply(next)}"

    case MultiRelationshipPathStep(rel, direction, toNode, next) => relationshipPathStep(rel, direction, toNode, next, isMultiRel = true)

    case NilPathStep() => ""
  }

  private def relationshipPathStep(rel: LogicalVariable, direction: SemanticDirection, toNode: Option[LogicalVariable], next: PathStep, isMultiRel: Boolean) = {
    val lArrow = if (direction == SemanticDirection.INCOMING) "<" else ""
    val rArrow = if (direction == SemanticDirection.OUTGOING) ">" else ""
    val stringifiedToNode = toNode.map(expr(_)).getOrElse("")
    val stringifiedRel = expr(rel)
    val multiRel = if (isMultiRel) "*" else ""

    s"$lArrow-[$stringifiedRel$multiRel]-$rArrow($stringifiedToNode)" + this(next)
  }
}
