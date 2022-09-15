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

import org.neo4j.cypher.internal.runtime.ReadableRow
import org.neo4j.cypher.internal.runtime.interpreted.commands.AstNode
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Variable
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.VariableCommand
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState
import org.neo4j.cypher.internal.util.NonEmptyList

case class Ands(predicates: NonEmptyList[Predicate]) extends CompositeBooleanPredicate {
  override def shouldExitWhen = false
  override def andWith(other: Predicate): Predicate = Ands(predicates :+ other)
  override def rewrite(f: Expression => Expression): Expression = f(Ands(predicates.map(_.rewriteAsPredicate(f))))
  override def toString: String = {
    predicates.foldLeft("") {
      case (acc, next) if acc.isEmpty => next.toString
      case (acc, next) => s"$acc AND $next"
    }
  }

  override def children: Seq[AstNode[_]] = predicates.toIndexedSeq
}

object Ands {
  def apply(predicates: Predicate*): Predicate = predicates.filterNot(_ == True()).toList match {
    case Nil => True()
    case single :: Nil => single
    case manyPredicates => Ands(NonEmptyList.from(manyPredicates))
  }
}

@deprecated("Use Ands (plural) instead")
class And(val a: Predicate, val b: Predicate) extends Predicate {
  def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = Ands(NonEmptyList(a, b)).isMatch(ctx, state)

  override def atoms: Seq[Predicate] = a.atoms ++ b.atoms
  override def toString: String = s"($a AND $b)"
  override def containsIsNull: Boolean = a.containsIsNull || b.containsIsNull
  override def rewrite(f: Expression => Expression): Expression = f(And(a.rewriteAsPredicate(f), b.rewriteAsPredicate(f)))

  override def arguments: Seq[Expression] = Seq(a, b)

  override def children: Seq[AstNode[_]] = Seq(a, b)

  override def hashCode(): Int = a.hashCode + 37 * b.hashCode

  override def equals(p1: Any): Boolean = p1 match {
    case null       => false
    case other: And => a == other.a && b == other.b
    case _          => false
  }

}

@deprecated("Use Ands (plural) instead")
object And {
  def apply(a: Predicate, b: Predicate): Predicate = (a, b) match {
    case (True(), other) => other
    case (other, True()) => other
    case (_, _)          => new And(a, b)
  }
}

case class AndedPropertyComparablePredicates(ident: VariableCommand, prop: Expression,
                                             override val predicates: NonEmptyList[ComparablePredicate])
  extends CompositeBooleanPredicate {

  // some rewriters change the type of this, and we can't allow that
  private def rewriteVariableIfNotTypeChanged(f: Expression => Expression) =
    ident.rewrite(f) match {
      case i: Variable => i
      case _ => ident
    }

  override def rewrite(f: Expression => Expression): Expression =
    f(AndedPropertyComparablePredicates(rewriteVariableIfNotTypeChanged(f),
      prop.rewrite(f),
      predicates.map(_.rewriteAsPredicate(f).asInstanceOf[ComparablePredicate])))

  override def shouldExitWhen: Boolean = false

  override def children: Seq[AstNode[_]] = Seq(ident, prop) ++ predicates.toIndexedSeq
}
