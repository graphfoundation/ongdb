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
package org.neo4j.cypher.internal.expressions

import org.neo4j.cypher.internal.util.ASTNode
import org.neo4j.cypher.internal.util.InputPosition

object Pattern {
  sealed trait SemanticContext {
    def name: String = SemanticContext.name(this)
  }

  object SemanticContext {
    case object Match extends SemanticContext
    case object Merge extends SemanticContext
    case object Create extends SemanticContext
    case object Expression extends SemanticContext

    def name(ctx: SemanticContext): String = ctx match {
      case Match => "MATCH"
      case Merge => "MERGE"
      case Create => "CREATE"
      case Expression => "expression"
    }
  }
}

case class Pattern(patternParts: Seq[PatternPart])(val position: InputPosition) extends ASTNode {

  lazy val length: Int = this.fold(0) {
    case RelationshipChain(_, _, _) => _ + 1
    case _ => identity
  }
}

case class RelationshipsPattern(element: RelationshipChain)(val position: InputPosition) extends ASTNode


sealed abstract class PatternPart extends ASTNode {
  def element: PatternElement
}

case class NamedPatternPart(variable: Variable, patternPart: AnonymousPatternPart)(val position: InputPosition) extends PatternPart {
  def element: PatternElement = patternPart.element
}


sealed trait AnonymousPatternPart extends PatternPart

case class EveryPath(element: PatternElement) extends AnonymousPatternPart {
  def position = element.position
}

case class ShortestPaths(element: PatternElement, single: Boolean)(val position: InputPosition) extends AnonymousPatternPart {
  val name: String =
    if (single)
      "shortestPath"
    else
      "allShortestPaths"
}

sealed abstract class PatternElement extends ASTNode {
  def allVariables: Set[LogicalVariable]
  def variable: Option[LogicalVariable]

  def isSingleNode = false
}

case class RelationshipChain(
                              element: PatternElement,
                              relationship: RelationshipPattern,
                              rightNode: NodePattern
                            )(val position: InputPosition)
  extends PatternElement {

  def variable: Option[LogicalVariable] = relationship.variable

  override def allVariables: Set[LogicalVariable] = element.allVariables ++ relationship.variable ++ rightNode.variable

}

object RelationshipChain {
  /**
   * This method will traverse into any ASTNode and find duplicate relationship variables inside of RelationshipChains.
   *
   * For each rel variable that is duplicated, return the first occurrence of that variable.
   */
  def findDuplicateRelationships(treeNode: ASTNode): Seq[LogicalVariable] = {
    val duplicates = treeNode.fold(Map[String, List[LogicalVariable]]().withDefaultValue(Nil)) {
      case RelationshipChain(_, RelationshipPattern(Some(rel), _, None, _, _, _), _) =>
        map =>
          map.updated(rel.name, rel :: map(rel.name))
      case _ =>
        identity
    }
    duplicates.values.filter(_.size > 1).map(_.minBy(_.position)).toSeq
  }
}

object InvalidNodePattern {
  def apply(id: Variable, labels: Seq[LabelName], properties: Option[Expression])(position: InputPosition) =
    new InvalidNodePattern(id)(position)
}

class InvalidNodePattern(
                          val id: LogicalVariable
                        )(
                          position: InputPosition
) extends NodePattern(Some(id), Seq.empty, None, None)(position) {

  override def productPrefix: String = "InvalidNodePattern"

  override def productArity: Int = 1

  override def productIterator: Iterator[Any] = Iterator(id)

  override def productElement(n: Int): Any = productIterator.toList(n)

  override def toString: String = s"$productPrefix(${productIterator.mkString(",")})"

  override def canEqual(other: Any): Boolean = other.isInstanceOf[InvalidNodePattern]

  override def equals(other: Any): Boolean = other match {
    case that: InvalidNodePattern =>
      (that canEqual this) &&
        id == that.id
    case _ => false
  }

  override def hashCode(): Int = 31 * id.hashCode()

  override def allVariables: Set[LogicalVariable] = Set.empty
}

case class NodePattern(variable: Option[LogicalVariable],
                       labels: Seq[LabelName],
                       properties: Option[Expression],
                       predicate: Option[Expression])(val position: InputPosition)
  extends PatternElement {

  override def allVariables: Set[LogicalVariable] = variable.toSet

  override def isSingleNode = true
}

case class RelationshipPattern(
                                variable: Option[LogicalVariable],
                                types: Seq[RelTypeName],
                                length: Option[Option[Range]],
                                properties: Option[Expression],
                                direction: SemanticDirection,
                                legacyTypeSeparator: Boolean = false)(val position: InputPosition) extends ASTNode {

  def isSingleLength: Boolean = length.isEmpty

  def isDirected: Boolean = direction != SemanticDirection.BOTH
}
