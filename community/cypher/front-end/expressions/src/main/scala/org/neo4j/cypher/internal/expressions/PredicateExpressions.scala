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

import org.neo4j.cypher.internal.expressions.CanonicalStringHelper.nodeRelationCanonicalString
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.symbols.CTAny
import org.neo4j.cypher.internal.util.symbols.CTBoolean
import org.neo4j.cypher.internal.util.symbols.CTString

case class And(lhs: Expression, rhs: Expression)(val position: InputPosition) extends BooleanExpression with BinaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector(CTBoolean, CTBoolean), outputType = CTBoolean)
  )
}

object Ands {

  def create(exprs: Seq[Expression]): Expression = {
    val size = exprs.size
    if(size == 0)
      True()(InputPosition.NONE)
    else if (size == 1)
      exprs.head
    else
      Ands(exprs)(exprs.head.position)
  }
}

/**
 * Conjunction of multiple expressions.
 * The order of expressions is retained as a Seq (was previously a Set),
 * but equals and hashCode are overridden to get set semantics for comparison
 * (we assume set semantics when tracking solved expressions during planing)
 */
case class Ands(exprs: Seq[Expression])(val position: InputPosition) extends BooleanExpression with MultiOperatorExpression {
  override def canonicalOperatorSymbol = "AND"

  private val exprSet = exprs.toSet

  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector.fill(exprs.size)(CTBoolean), outputType = CTBoolean)
  )

  override def equals(other: Any): Boolean =
    other match {
      case that: Ands => (that canEqual this) && (exprSet == that.exprSet)
      case _ => false
    }

  override def hashCode(): Int =
    31 * exprSet.hashCode()
}

case class Or(lhs: Expression, rhs: Expression)(val position: InputPosition) extends BooleanExpression with BinaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector(CTBoolean, CTBoolean), outputType = CTBoolean)
  )
}

/**
 * Disjunction of multiple expressions.
 * The order of expressions is retained as a Seq (was previously a Set),
 * but equals and hashCode are overridden to get set semantics for comparison
 * (we assume set semantics when tracking solved expressions during planing)
 */
case class Ors(exprs: Seq[Expression])(val position: InputPosition) extends BooleanExpression with MultiOperatorExpression {
  override def canonicalOperatorSymbol = "OR"

  private val exprSet = exprs.toSet

  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector.fill(exprs.size)(CTBoolean), outputType = CTBoolean)
  )

  override def equals(other: Any): Boolean =
    other match {
      case that: Ors => (that canEqual this) && (exprSet == that.exprSet)
      case _ => false
    }

  override def hashCode(): Int =
    31 * exprSet.hashCode()
}

case class Xor(lhs: Expression, rhs: Expression)(val position: InputPosition) extends BooleanExpression with BinaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(Vector(CTBoolean, CTBoolean), outputType = CTBoolean)
  )
}

case class Not(rhs: Expression)(val position: InputPosition) extends BooleanExpression with LeftUnaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(Vector(CTBoolean), outputType = CTBoolean)
  )
}

case class Equals(lhs: Expression, rhs: Expression)(val position: InputPosition) extends BooleanExpression with ChainableBinaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector(CTAny, CTAny), outputType = CTBoolean)
  )

  override def canonicalOperatorSymbol = "="

  def switchSides: Equals = copy(rhs, lhs)(position)
}

case class NotEquals(lhs: Expression, rhs: Expression)(val position: InputPosition) extends BooleanExpression with ChainableBinaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector(CTAny, CTAny), outputType = CTBoolean)
  )

  override def canonicalOperatorSymbol = "<>"
}

case class InvalidNotEquals(lhs: Expression, rhs: Expression)(val position: InputPosition) extends BooleanExpression with ChainableBinaryOperatorExpression {
  override def canonicalOperatorSymbol = "!="
}

case class RegexMatch(lhs: Expression, rhs: Expression)(val position: InputPosition) extends BooleanExpression with BinaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector(CTString, CTString), outputType = CTBoolean)
  )

  override def canonicalOperatorSymbol = "=~"
}

case class In(lhs: Expression, rhs: Expression)(val position: InputPosition) extends BooleanExpression with BinaryOperatorExpression

// Partial predicates are predicates that are covered by a larger predicate which is going to be solved later during planning
// (and then will replace this predicate).
// (i.e. final query graph matches up with original query)
sealed trait PartialPredicate[+P <: Expression] extends Expression {
  def coveredPredicate: P
  def coveringPredicate: Expression
}

object PartialPredicate {

  def apply[P <: Expression](coveredPredicate: P, coveringPredicate: Expression): Expression =
    ifNotEqual(coveredPredicate, coveringPredicate).getOrElse(coveringPredicate)

  def ifNotEqual[P <: Expression](coveredPredicate: P, coveringPredicate: Expression): Option[PartialPredicate[P]] =
    if (coveredPredicate == coveringPredicate) None else Some(PartialPredicateWrapper(coveredPredicate, coveringPredicate))

  final case class PartialPredicateWrapper[P <: Expression](coveredPredicate: P, coveringPredicate: Expression) extends PartialPredicate[P] {
    override def position: InputPosition = coveredPredicate.position
  }

  final case class PartialDistanceSeekWrapper[P <: Expression](predicate: P) extends PartialPredicate[P] {
    override def coveredPredicate: P = predicate
    override def coveringPredicate: Expression = predicate
    override def position: InputPosition = coveredPredicate.position
  }
}

case class StartsWith(lhs: Expression, rhs: Expression)(val position: InputPosition) extends BooleanExpression with BinaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector(CTAny, CTAny), outputType = CTBoolean)
  )

  override def canonicalOperatorSymbol = "STARTS WITH"
}

case class EndsWith(lhs: Expression, rhs: Expression)(val position: InputPosition) extends BooleanExpression with BinaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector(CTAny, CTAny), outputType = CTBoolean)
  )

  override def canonicalOperatorSymbol = "ENDS WITH"
}

case class Contains(lhs: Expression, rhs: Expression)(val position: InputPosition) extends BooleanExpression with BinaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector(CTAny, CTAny), outputType = CTBoolean)
  )
}

case class IsNull(lhs: Expression)(val position: InputPosition) extends BooleanExpression with RightUnaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector(CTAny), outputType = CTBoolean)
  )

  override def canonicalOperatorSymbol = "IS NULL"
}

case class IsNotNull(lhs: Expression)(val position: InputPosition) extends BooleanExpression with RightUnaryOperatorExpression {
  override val signatures = Vector(
    TypeSignature(argumentTypes = Vector(CTAny), outputType = CTBoolean)
  )

  override def canonicalOperatorSymbol = "IS NOT NULL"
}

object InequalityExpression {
  def unapply(arg: InequalityExpression): Option[(Expression, Expression)] = Some((arg.lhs, arg.rhs))
}

sealed trait InequalityExpression extends BooleanExpression with ChainableBinaryOperatorExpression {
  override val signatures = Vector(TypeSignature(argumentTypes = Vector(CTAny, CTAny), outputType = CTBoolean))

  def includeEquality: Boolean

  def negated: InequalityExpression
  def swapped: InequalityExpression

  def lhs: Expression
  def rhs: Expression
}

final case class LessThan(lhs: Expression, rhs: Expression)(val position: InputPosition) extends InequalityExpression {
  override val canonicalOperatorSymbol = "<"

  override val includeEquality = false

  override def negated: InequalityExpression = GreaterThanOrEqual(lhs, rhs)(position)
  override def swapped: InequalityExpression = GreaterThan(rhs, lhs)(position)
}

final case class LessThanOrEqual(lhs: Expression, rhs: Expression)(val position: InputPosition) extends InequalityExpression {
  override val canonicalOperatorSymbol = "<="

  override val includeEquality = true

  override def negated: InequalityExpression = GreaterThan(lhs, rhs)(position)
  override def swapped: InequalityExpression = GreaterThanOrEqual(rhs, lhs)(position)
}

final case class GreaterThan(lhs: Expression, rhs: Expression)(val position: InputPosition) extends InequalityExpression {
  override val canonicalOperatorSymbol = ">"

  override val includeEquality = false

  override def negated: InequalityExpression = LessThanOrEqual(lhs, rhs)(position)
  override def swapped: InequalityExpression = LessThan(rhs, lhs)(position)
}

final case class GreaterThanOrEqual(lhs: Expression, rhs: Expression)(val position: InputPosition) extends InequalityExpression {
  override val canonicalOperatorSymbol = ">="

  override val includeEquality = true

  override def negated: InequalityExpression = LessThan(lhs, rhs)(position)
  override def swapped: InequalityExpression = LessThanOrEqual(rhs, lhs)(position)
}

case class HasDegreeLessThan(node: Expression,
                             relType: Option[RelTypeName],
                             dir: SemanticDirection,
                             degree: Expression
                            )(val position: InputPosition) extends BooleanExpression {

  override def asCanonicalStringVal: String =
    s"getDegree(${nodeRelationCanonicalString(node, relType, dir)}) < ${degree.asCanonicalStringVal}"
}

case class HasDegreeLessThanOrEqual(node: Expression,
                                    relType: Option[RelTypeName],
                                    dir: SemanticDirection,
                                    degree: Expression
                                   )(val position: InputPosition) extends BooleanExpression {

  override def asCanonicalStringVal: String =
    s"getDegree(${nodeRelationCanonicalString(node, relType, dir)}) <= ${degree.asCanonicalStringVal}"
}

case class HasDegreeGreaterThan(node: Expression,
                                relType: Option[RelTypeName],
                                dir: SemanticDirection,
                                degree: Expression
                               )(val position: InputPosition) extends BooleanExpression {

  override def asCanonicalStringVal: String =
    s"getDegree(${nodeRelationCanonicalString(node, relType, dir)}) > ${degree.asCanonicalStringVal}"
}

case class HasDegreeGreaterThanOrEqual(node: Expression,
                                       relType: Option[RelTypeName],
                                       dir: SemanticDirection,
                                       degree: Expression
                                      )(val position: InputPosition) extends BooleanExpression {

  override def asCanonicalStringVal: String =
    s"getDegree(${nodeRelationCanonicalString(node, relType, dir)}) >= ${degree.asCanonicalStringVal}"
}

case class HasDegree(node: Expression,
                     relType: Option[RelTypeName],
                     dir: SemanticDirection,
                     degree: Expression
                    )(val position: InputPosition) extends BooleanExpression {

  override def asCanonicalStringVal: String =
    s"getDegree(${nodeRelationCanonicalString(node, relType, dir)}) = ${degree.asCanonicalStringVal}"
}

case class AssertIsNode(lhs: Expression)(val position: InputPosition) extends BooleanExpression