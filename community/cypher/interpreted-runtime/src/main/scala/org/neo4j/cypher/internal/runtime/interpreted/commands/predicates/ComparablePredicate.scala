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
package org.neo4j.cypher.internal.runtime.interpreted.commands.predicates

import org.neo4j.cypher.internal.runtime.IsFalseValue
import org.neo4j.cypher.internal.runtime.IsNoValue
import org.neo4j.cypher.internal.runtime.IsTrueValue
import org.neo4j.cypher.internal.runtime.ReadableRow
import org.neo4j.cypher.internal.runtime.interpreted.commands.AstNode
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Literal
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Variable
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState
import org.neo4j.cypher.operations.CypherBoolean
import org.neo4j.values.AnyValue
import org.neo4j.values.Equality
import org.neo4j.values.storable.Value
import org.neo4j.values.storable.Values.NO_VALUE

abstract sealed class ComparablePredicate(val left: Expression, val right: Expression) extends Predicate {

  def comparator: (AnyValue, AnyValue) => Value

  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = {
    val l = left(ctx, state)
    val r = right(ctx, state)
    comparator(l, r) match {
      case IsTrueValue() => Some(true)
      case IsFalseValue() => Some(false)
      case IsNoValue() => None
    }
  }

  def sign: String

  override def toString: String = left.toString() + " " + sign + " " + right.toString()

  override def containsIsNull = false

  override def arguments: Seq[Expression] = Seq(left, right)

  def other(e: Expression): Expression = if (e != left) {
    require(e == right, "This expression is neither LHS nor RHS")
    left
  } else {
    right
  }
}

case class Equals(a: Expression, b: Expression) extends Predicate {

  def other(x: Expression): Option[Expression] = {
    if (x == a) Some(b)
    else if (x == b) Some(a)
    else None
  }

  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = {
    val l = a(ctx, state)
    val r = b(ctx, state)

    l.ternaryEquals(r) match {
      case Equality.UNDEFINED => None
      case Equality.FALSE => Some(false)
      case Equality.TRUE => Some(true)
    }
  }

  override def toString = s"$a == $b"

  override def containsIsNull: Boolean = (a, b) match {
    case (Variable(_), Literal(NO_VALUE)) => true
    case _ => false
  }

  override def rewrite(f: Expression => Expression): Expression = f(Equals(a.rewrite(f), b.rewrite(f)))

  override def arguments: Seq[Expression] = Seq(a, b)

  override def children: Seq[AstNode[_]] = Seq(a, b)
}

case class LessThan(a: Expression, b: Expression) extends ComparablePredicate(a, b) {

  override def comparator: (AnyValue, AnyValue) => Value = CypherBoolean.lessThan

  override def sign: String = "<"

  override def rewrite(f: Expression => Expression): Expression = f(LessThan(a.rewrite(f), b.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(a, b)
}

case class GreaterThan(a: Expression, b: Expression) extends ComparablePredicate(a, b) {

  override def comparator: (AnyValue, AnyValue) => Value = CypherBoolean.greaterThan

  override def sign: String = ">"

  override def rewrite(f: Expression => Expression): Expression = f(GreaterThan(a.rewrite(f), b.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(a, b)
}

case class LessThanOrEqual(a: Expression, b: Expression) extends ComparablePredicate(a, b) {

  override def comparator: (AnyValue, AnyValue) => Value = CypherBoolean.lessThanOrEqual

  override def sign: String = "<="

  override def rewrite(f: Expression => Expression): Expression = f(LessThanOrEqual(a.rewrite(f), b.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(a, b)
}

case class GreaterThanOrEqual(a: Expression, b: Expression) extends ComparablePredicate(a, b) {

  override def comparator: (AnyValue, AnyValue) => Value = CypherBoolean.greaterThanOrEqual

  override def sign: String = ">="

  override def rewrite(f: Expression => Expression): Expression = f(GreaterThanOrEqual(a.rewrite(f), b.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(a, b)
}
