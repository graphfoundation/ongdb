/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.cypher.internal.ir

import org.neo4j.cypher.internal.expressions.RelTypeName
import org.neo4j.cypher.internal.expressions.SemanticDirection

final case class PatternRelationship(name: String, nodes: (String, String), dir: SemanticDirection,
                                     types: Seq[RelTypeName], length: PatternLength) {

  def directionRelativeTo(node: String): SemanticDirection = if (node == left) dir else dir.reversed

  def otherSide(node: String): String =
    if (node == left) {
      right
    } else if (node == right) {
      left
    } else {
      throw new IllegalArgumentException(s"Did not provide either side as an argument to otherSide. Rel: $this, argument: $node")
    }

  def coveredIds: Set[String] = Set(name, left, right)

  def left = nodes._1

  def right = nodes._2

  def inOrder = dir match {
    case SemanticDirection.INCOMING => (right, left)
    case _ => (left, right)
  }

  override def toString: String = {
    val lArrow = if (dir == SemanticDirection.INCOMING) "<" else ""
    val rArrow = if (dir == SemanticDirection.OUTGOING) ">" else ""
    val typesStr = if (types.isEmpty) {
      ""
    } else {
      types.map(_.name).mkString(":", "|", "")
    }
    val lengthStr = length match {
      case SimplePatternLength => ""
      case VarPatternLength(1, None) => "*"
      case VarPatternLength(x, None) => s"*$x.."
      case VarPatternLength(min, Some(max)) => s"*$min..$max"
    }
    s"(${nodes._1})$lArrow-[$name$typesStr$lengthStr]-$rArrow(${nodes._2})"
  }
}

object PatternRelationship {
  implicit val byName = Ordering.by { patternRel: PatternRelationship => patternRel.name }
}

trait PatternLength {
  def implicitPatternNodeCount: Int
  def isSimple: Boolean
}

case object SimplePatternLength extends PatternLength {
  def isSimple = true

  def implicitPatternNodeCount: Int = 0
}

final case class VarPatternLength(min: Int, max: Option[Int]) extends PatternLength {
  def isSimple = false

  def implicitPatternNodeCount = max.getOrElse(VarPatternLength.STAR_LENGTH)
}

object VarPatternLength {
  val STAR_LENGTH = 16

  def unlimited = VarPatternLength(1, None)

  def fixed(length: Int) = VarPatternLength(length, Some(length))
}
