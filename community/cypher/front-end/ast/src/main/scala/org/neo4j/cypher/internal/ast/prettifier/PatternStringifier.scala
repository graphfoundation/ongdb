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
package org.neo4j.cypher.internal.ast.prettifier

import org.neo4j.cypher.internal.expressions.EveryPath
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.NamedPatternPart
import org.neo4j.cypher.internal.expressions.NodePattern
import org.neo4j.cypher.internal.expressions.Pattern
import org.neo4j.cypher.internal.expressions.PatternElement
import org.neo4j.cypher.internal.expressions.PatternPart
import org.neo4j.cypher.internal.expressions.Range
import org.neo4j.cypher.internal.expressions.RelationshipChain
import org.neo4j.cypher.internal.expressions.RelationshipPattern
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.expressions.ShortestPaths

case class PatternStringifier(expr: ExpressionStringifier) {

  def apply(p: Pattern): String =
    p.patternParts.map(apply).mkString(", ")

  def apply(p: PatternPart): String = p match {
    case e: EveryPath        => apply(e.element)
    case s: ShortestPaths    => s"${s.name}(${apply(s.element)})"
    case n: NamedPatternPart => s"${expr(n.variable)} = ${apply(n.patternPart)}"
  }

  def apply(element: PatternElement): String = element match {
    case r: RelationshipChain => apply(r)
    case n: NodePattern       => apply(n)
  }

  def apply(nodePattern: NodePattern): String = {
    val name = nodePattern.variable.map(expr(_)).getOrElse("")
    val labels = if (nodePattern.labels.isEmpty) "" else
      nodePattern.labels.map(expr(_)).mkString(":", ":", "")
    val nameLabelsAndProperties = props(s"$name$labels", nodePattern.properties)
    val predicate = nodePattern.predicate.map { p =>
      s" WHERE ${expr(p)}"
    }.getOrElse("")
    s"($nameLabelsAndProperties$predicate)"
  }

  def apply(relationshipChain: RelationshipChain): String = {
    val r = apply(relationshipChain.rightNode)
    val middle = apply(relationshipChain.relationship)
    val l = apply(relationshipChain.element)

    s"$l$middle$r"
  }

  def apply(relationship: RelationshipPattern): String = {
    val lArrow = if (relationship.direction == SemanticDirection.INCOMING) "<" else ""
    val rArrow = if (relationship.direction == SemanticDirection.OUTGOING) ">" else ""
    val types = if (relationship.types.isEmpty)
      ""
    else
      relationship.types.map(expr(_)).mkString(":", "|", "")
    val name = relationship.variable.map(expr(_)).getOrElse("")
    val length = relationship.length match {
      case None              => ""
      case Some(None)        => "*"
      case Some(Some(range)) => apply(range)

    }
    val info = props(s"$name$types$length", relationship.properties)
    if (info == "")
      s"$lArrow--$rArrow"
    else
      s"$lArrow-[$info]-$rArrow"
  }

  private def apply(r: Range) =
    s"*${r.lower.map(_.stringVal).getOrElse("")}..${r.upper.map(_.stringVal).getOrElse("")}"

  private def props(prepend: String, e: Option[Expression]): String = {
    e.map(e => {
      val separator = if (prepend.isEmpty) "" else " "
      s"$prepend$separator${expr(e)}"
    }).getOrElse(prepend)
  }
}
