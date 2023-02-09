/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.runtime.interpreted.commands

import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.expressions.SemanticDirection.INCOMING
import org.neo4j.cypher.internal.expressions.SemanticDirection.OUTGOING
import org.neo4j.cypher.internal.runtime.interpreted.GraphElementPropertyFunctions
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.commands.predicates.True
import org.neo4j.cypher.internal.runtime.interpreted.commands.values.KeyToken
import org.neo4j.cypher.internal.util.AnonymousVariableNameGenerator
import org.neo4j.cypher.internal.util.symbols.CTNode
import org.neo4j.cypher.internal.util.symbols.CypherType

import scala.collection.Map
import scala.collection.Seq

trait Pattern extends AstNode[Pattern] {
  def possibleStartPoints: Seq[(String,CypherType)]
  def relTypes:Seq[String]

  protected def leftArrow(dir: SemanticDirection): String = if (dir == INCOMING) "<-" else "-"
  protected def rightArrow(dir: SemanticDirection): String = if (dir == OUTGOING) "->" else "-"

  def rewrite( f : Expression => Expression) : Pattern

  def rels:Seq[String]

  def variables: Seq[String] = possibleStartPoints.map(_._1)
}

object Pattern {
  def variables(patterns: Seq[Pattern]): Set[String] = patterns.flatMap(_.variables).toSet
}

object RelationshipPattern {
  def unapply(x: Any): Option[(RelationshipPattern, SingleNode, SingleNode)] = x match {
    case pattern@ShortestPath(_, left, right, _, _, _, _, _, _)          => Some((pattern, left, right))
    case _                                                            => None
  }
}

trait RelationshipPattern {
  def left:SingleNode
  def right:SingleNode
  def changeEnds(left: SingleNode = this.left, right: SingleNode = this.right): Pattern
}

case class SingleNode(name: String,
                      labels: Seq[KeyToken] = Seq.empty,
                      properties: Map[String, Expression] = Map.empty) extends Pattern with GraphElementPropertyFunctions {
  override def possibleStartPoints: Seq[(String, CypherType)] = Seq(name -> CTNode)

  def predicate = True()

  override def rels: Seq[String] = Seq.empty

  override def relTypes: Seq[String] = Seq.empty

  override def rewrite(f: Expression => Expression) = SingleNode(name, labels.map(_.typedRewrite[KeyToken](f)), properties.rewrite(f))

  override def children: Seq[AstNode[_]] = labels ++ properties.values

  override def toString: String = {
    val namePart = if (AnonymousVariableNameGenerator.notNamed(name)) s"${name.drop(9)}" else name
    val labelPart = if (labels.isEmpty) "" else labels.mkString(":", ":", "")
    val props = if (properties.isEmpty) "" else " " + toString(properties)
    s"($namePart$labelPart$props)"
  }
}

abstract class PathPattern extends Pattern with RelationshipPattern {
  def pathName: String

  def cloneWithOtherName(newName: String): PathPattern

  def relIterator: Option[String]
}


case class ShortestPath(pathName: String,
                        left: SingleNode,
                        right: SingleNode,
                        relTypes: Seq[String],
                        dir: SemanticDirection,
                        allowZeroLength: Boolean,
                        maxDepth: Option[Int],
                        single: Boolean,
                        relIterator: Option[String])
  extends PathPattern {

  override def toString: String = pathName + "=" + algo + "(" + left + leftArrow(dir) + relInfo + rightArrow(dir) + right + ")"

  private def algo = if (single) "singleShortestPath" else "allShortestPath"

  override def cloneWithOtherName(newName: String): ShortestPath = copy(pathName = newName)

  private def relInfo: String = {
    var info = "["
    if (relTypes.nonEmpty) info += ":" + relTypes.mkString("|")
    info += "*"
    if (allowZeroLength) info += "0"
    if (allowZeroLength || maxDepth.nonEmpty) info += ".."
    if (maxDepth.nonEmpty) info += maxDepth.get
    info + "]"
  }

  override lazy val possibleStartPoints: Seq[(String, CypherType)] = left.possibleStartPoints ++ right.possibleStartPoints

  override def rewrite(f: Expression => Expression) =
    ShortestPath(pathName, left.rewrite(f), right.rewrite(f), relTypes, dir, allowZeroLength, maxDepth, single, relIterator)

  override def rels: Seq[String] = Seq()

  override def children: Seq[AstNode[_]] = Seq(left, right)

  override def changeEnds(left: SingleNode = this.left, right: SingleNode = this.right): ShortestPath =
    copy(left = left, right = right)
}
