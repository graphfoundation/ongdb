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
package org.neo4j.cypher.internal.compiler.planner.logical.plans

import org.neo4j.cypher.internal.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.expressions.AndedPropertyInequalities
import org.neo4j.cypher.internal.expressions.Equals
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.FunctionInvocation
import org.neo4j.cypher.internal.expressions.FunctionName
import org.neo4j.cypher.internal.expressions.GreaterThan
import org.neo4j.cypher.internal.expressions.GreaterThanOrEqual
import org.neo4j.cypher.internal.expressions.In
import org.neo4j.cypher.internal.expressions.InequalityExpression
import org.neo4j.cypher.internal.expressions.IsNotNull
import org.neo4j.cypher.internal.expressions.LessThan
import org.neo4j.cypher.internal.expressions.LessThanOrEqual
import org.neo4j.cypher.internal.expressions.ListLiteral
import org.neo4j.cypher.internal.expressions.LogicalProperty
import org.neo4j.cypher.internal.expressions.LogicalVariable
import org.neo4j.cypher.internal.expressions.Namespace
import org.neo4j.cypher.internal.expressions.NotEquals
import org.neo4j.cypher.internal.expressions.PartialPredicate
import org.neo4j.cypher.internal.expressions.Property
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.RegexMatch
import org.neo4j.cypher.internal.expressions.StartsWith
import org.neo4j.cypher.internal.expressions.StringLiteral
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.expressions.functions
import org.neo4j.cypher.internal.logical.plans.ExclusiveBound
import org.neo4j.cypher.internal.logical.plans.InclusiveBound
import org.neo4j.cypher.internal.logical.plans.InequalitySeekRange
import org.neo4j.cypher.internal.logical.plans.InequalitySeekRangeWrapper
import org.neo4j.cypher.internal.logical.plans.ManySeekableArgs
import org.neo4j.cypher.internal.logical.plans.PointBoundingBoxRange
import org.neo4j.cypher.internal.logical.plans.PointBoundingBoxSeekRangeWrapper
import org.neo4j.cypher.internal.logical.plans.PointDistanceRange
import org.neo4j.cypher.internal.logical.plans.PointDistanceSeekRangeWrapper
import org.neo4j.cypher.internal.logical.plans.PrefixRange
import org.neo4j.cypher.internal.logical.plans.PrefixSeekRangeWrapper
import org.neo4j.cypher.internal.logical.plans.QueryExpression
import org.neo4j.cypher.internal.logical.plans.RangeQueryExpression
import org.neo4j.cypher.internal.logical.plans.SeekRange
import org.neo4j.cypher.internal.logical.plans.SeekableArgs
import org.neo4j.cypher.internal.logical.plans.SingleSeekableArg
import org.neo4j.cypher.internal.util.Last
import org.neo4j.cypher.internal.util.NonEmptyList
import org.neo4j.cypher.internal.util.symbols.CTAny
import org.neo4j.cypher.internal.util.symbols.CTPoint
import org.neo4j.cypher.internal.util.symbols.CTString
import org.neo4j.cypher.internal.util.symbols.CypherType
import org.neo4j.cypher.internal.util.symbols.TypeSpec

object WithSeekableArgs {
  def unapply(v: Any): Option[(Expression, SeekableArgs)] = v match {
    case In(lhs, rhs) => Some(lhs -> ManySeekableArgs(rhs))
    case Equals(lhs, rhs) => Some(lhs -> SingleSeekableArg(rhs))
    case _ => None
  }
}

object AsIdSeekable {
  def unapply(v: Any): Option[IdSeekable] = v match {
    case WithSeekableArgs(func@FunctionInvocation(_, _, _, IndexedSeq(ident: LogicalVariable)), rhs)
      if func.function == functions.Id && !rhs.dependencies(ident) =>
      Some(IdSeekable(func, ident, rhs))
    case _ =>
      None
  }
}

object AsPropertySeekable {
  def unapply(v: Any): Option[PropertySeekable] = v match {
    case WithSeekableArgs(prop@Property(ident: LogicalVariable, _), rhs)
      if !rhs.dependencies(ident) =>
      Some(PropertySeekable(prop, ident, rhs))
    case _ =>
      None
  }
}

object AsExplicitlyPropertyScannable {
  def unapply(v: Any): Option[ExplicitlyPropertyScannable] = v match {
    case expr@IsNotNull(property@Property(ident: LogicalVariable, _)) =>
      Some(ExplicitlyPropertyScannable(expr, ident, property))

    case _ =>
      None
  }
}

object AsPropertyScannable {
  def unapply(v: Any): Option[Scannable[Expression]] = v match {

    case AsExplicitlyPropertyScannable(scannable) =>
      Some(scannable)

    case expr: Equals =>
      partialPropertyPredicate(expr, expr.lhs, solves = false)

    case expr: InequalityExpression =>
      partialPropertyPredicate(expr, expr.lhs, solves = false)

    case outerExpr@AndedPropertyInequalities(_, _, NonEmptyList(expr: InequalityExpression)) =>
      partialPropertyPredicate(outerExpr, expr.lhs, solves = false)

    case startsWith: StartsWith =>
      partialPropertyPredicate(startsWith, startsWith.lhs, solves = false)

    case regex: RegexMatch =>
      partialPropertyPredicate(regex, regex.lhs, solves = false)

    case expr: NotEquals =>
      partialPropertyPredicate(expr, expr.lhs, solves = false)

    case _ =>
      None
  }

  private def partialPropertyPredicate[P <: Expression](predicate: P, lhs: Expression, solves: Boolean) = lhs match {
    case property@Property(ident: LogicalVariable, _) =>
      PartialPredicate.ifNotEqual(
        IsNotNull(property)(predicate.position),
        predicate
      ).map(ImplicitlyPropertyScannable(_, ident, property, solves))

    case _ =>
      None
  }
}

object AsStringRangeSeekable {
  def unapply(v: Any): Option[PrefixRangeSeekable] = v match {
    case startsWith@StartsWith(prop@Property(ident: LogicalVariable, propertyKey), lit@StringLiteral(prefix)) if prefix.nonEmpty =>
      Some(PrefixRangeSeekable(PrefixRange(lit), startsWith, ident, prop))
    case startsWith@StartsWith(prop@Property(ident: LogicalVariable, propertyKey), rhs) =>
      Some(PrefixRangeSeekable(PrefixRange(rhs), startsWith, ident, prop))
    case _ =>
      None
  }
}

object AsValueRangeSeekable {
  def unapply(v: Any): Option[InequalityRangeSeekable] = v match {
    case inequalities@AndedPropertyInequalities(ident, prop, _) =>
      Some(InequalityRangeSeekable(ident, prop, inequalities))
    case inequality@LessThan(property@Property(variable: Variable, _), _) =>
      Some(InequalityRangeSeekable(variable, property, AndedPropertyInequalities(variable, property, Last(inequality))))
    case inequality@LessThanOrEqual(property@Property(variable: Variable, _), _) =>
      Some(InequalityRangeSeekable(variable, property, AndedPropertyInequalities(variable, property, Last(inequality))))
    case inequality@GreaterThan(property@Property(variable: Variable, _), _) =>
      Some(InequalityRangeSeekable(variable, property, AndedPropertyInequalities(variable, property, Last(inequality))))
    case inequality@GreaterThanOrEqual(property@Property(variable: Variable, _), _) =>
      Some(InequalityRangeSeekable(variable, property, AndedPropertyInequalities(variable, property, Last(inequality))))
    case _ =>
      None
  }
}

// WHERE distance(p.prop, otherPoint) < number
// and the like
object AsDistanceSeekable {
  def unapply(v: Any): Option[PointDistanceSeekable] = v match {
    case LessThan(DistanceFunction(prop@Property(variable: Variable, _), otherPoint), distanceExpr) =>
      Some(PointDistanceSeekable(variable, prop, PointDistanceRange(otherPoint, distanceExpr, inclusive = false)))
    case LessThan(DistanceFunction(otherPoint, prop@Property(variable: Variable, _)), distanceExpr) =>
      Some(PointDistanceSeekable(variable, prop, PointDistanceRange(otherPoint, distanceExpr, inclusive = false)))
    case LessThanOrEqual(DistanceFunction(prop@Property(variable: Variable, _), otherPoint), distanceExpr) =>
      Some(PointDistanceSeekable(variable, prop, PointDistanceRange(otherPoint, distanceExpr, inclusive = true)))
    case LessThanOrEqual(DistanceFunction(otherPoint, prop@Property(variable: Variable, _)), distanceExpr) =>
      Some(PointDistanceSeekable(variable, prop, PointDistanceRange(otherPoint, distanceExpr, inclusive = true)))


    case GreaterThan(distanceExpr, DistanceFunction(prop@Property(variable: Variable, _), otherPoint)) =>
      Some(PointDistanceSeekable(variable, prop, PointDistanceRange(otherPoint, distanceExpr, inclusive = false)))
    case GreaterThan(distanceExpr, DistanceFunction(otherPoint, prop@Property(variable: Variable, _))) =>
      Some(PointDistanceSeekable(variable, prop, PointDistanceRange(otherPoint, distanceExpr, inclusive = false)))
    case GreaterThanOrEqual(distanceExpr, DistanceFunction(prop@Property(variable: Variable, _), otherPoint)) =>
      Some(PointDistanceSeekable(variable, prop, PointDistanceRange(otherPoint, distanceExpr, inclusive = true)))
    case GreaterThanOrEqual(distanceExpr, DistanceFunction(otherPoint, prop@Property(variable: Variable, _))) =>
      Some(PointDistanceSeekable(variable, prop, PointDistanceRange(otherPoint, distanceExpr, inclusive = true)))

    case AndedPropertyInequalities(_, _, inequalities) if inequalities.size == 1 =>
      inequalities.head match {
        case AsDistanceSeekable(seekable) => Some(seekable)
        case _ => None
      }

    case _ =>
      None
  }
}

object DistanceFunction {
  def unapply(v: Expression): Option[(Expression, Expression)] = v match {
    case FunctionInvocation(Namespace(List(namespace)), FunctionName("distance"), _, args) if namespace.toLowerCase == "point" => Some((args.head, args(1)))
    case _ => None
  }
}

object AsBoundingBoxSeekable {
  def unapply(v: Any): Option[PointBoundingBoxSeekable] = v match {
    case f@FunctionInvocation(Namespace(List("point")), FunctionName("withinBBox"), _, Seq(prop@Property(ident: LogicalVariable, PropertyKeyName(name)), lowerLeft, upperRight)) =>
      Some(PointBoundingBoxSeekable(ident, prop, f, PointBoundingBoxRange(lowerLeft, upperRight)))
    case _ =>
      None
  }
}

sealed trait Sargable[+T <: Expression] {
  def expr: T
  def ident: LogicalVariable

  def name: String = ident.name
}

object Seekable {
  /**
   * Find a common super-type for cases where we have multiple TypeSpecs, by combing all TypeSpecs as well as their contained type ranges.
   * For example two range predicates over the same property, with different value types.
   */
  def combineMultipleTypeSpecs(specs: Seq[TypeSpec]): CypherType = {
    val singleSpec = specs.reduceLeftOption {
      (spec1, spec2) => spec1 leastUpperBounds spec2
    }.getOrElse(CTAny.invariant)
    cypherTypeForTypeSpec(singleSpec)
  }

  /**
   * A single TypeSpec can include multiple ranges. Find the common super-type by combining all ranges.
   */
  def cypherTypeForTypeSpec(spec: TypeSpec): CypherType = {
    spec.ranges.map(_.lower).reduceLeftOption {
      (typ1, typ2) => typ1.leastUpperBound(typ2)
    }.getOrElse(CTAny)
  }
}

sealed trait Seekable[T <: Expression] extends Sargable[T] {
  def dependencies: Set[LogicalVariable]

  /**
   * Return the type of the property that this seekable refers to.
   * E.g., for "n.prop = 5" this would return CTInt
   */
  def propertyValueType(semanticTable: SemanticTable): CypherType
}

sealed trait EqualitySeekable[T <: Expression] extends Seekable[T] {
  def args: SeekableArgs
}

case class IdSeekable(expr: FunctionInvocation, ident: LogicalVariable, args: SeekableArgs)
  extends EqualitySeekable[FunctionInvocation] {

  def dependencies: Set[LogicalVariable] = args.dependencies

  override def propertyValueType(semanticTable: SemanticTable): CypherType = CTAny
}

case class PropertySeekable(expr: LogicalProperty, ident: LogicalVariable, args: SeekableArgs)
  extends EqualitySeekable[LogicalProperty] {

  def propertyKey: PropertyKeyName = expr.propertyKey
  def dependencies: Set[LogicalVariable] = args.dependencies

  override def propertyValueType(semanticTable: SemanticTable): CypherType = {

    def getTypeSpec(expr: Expression): TypeSpec =
      semanticTable.types.get(expr).map(_.actual).getOrElse(TypeSpec.exact(CTAny))

    // TypeSpec.unwrapLists does not cope with Any, so we use this ugly solution. Can be removed on updated front-end.
    def unwrapLists(x: TypeSpec): TypeSpec =
      try {
        x.unwrapLists
      } catch {
        case _: MatchError =>
          TypeSpec.exact(CTAny)
      }

    args match {
      case SingleSeekableArg(seekableExpr) =>
        Seekable.cypherTypeForTypeSpec(getTypeSpec(seekableExpr))
      case ManySeekableArgs(seekableExpr) =>
        seekableExpr match {
          // Equality is rewritten to IN AFTER semantic check. Thus, we are lacking type information for the ListLiteral
          case ListLiteral(expressions) =>
            Seekable.combineMultipleTypeSpecs(expressions.map(exp => getTypeSpec(exp)))
          // When the query actually contained an IN, the list could be autoparameterized
          case _ =>
            Seekable.cypherTypeForTypeSpec(unwrapLists(getTypeSpec(args.expr)))
        }
    }
  }
}

sealed trait RangeSeekable[T <: Expression, V] extends Seekable[T] {
  def range: SeekRange[V]
}

case class PrefixRangeSeekable(override val range: PrefixRange[Expression], expr: StartsWith, ident: LogicalVariable, property: Property)
  extends RangeSeekable[StartsWith, Expression] {

  def dependencies: Set[LogicalVariable] = expr.rhs.dependencies

  def asQueryExpression: QueryExpression[Expression] =
    RangeQueryExpression(PrefixSeekRangeWrapper(range)(expr.rhs.position))

  override def propertyValueType(semanticTable: SemanticTable): CypherType = CTString

  def propertyKeyName: PropertyKeyName = property.propertyKey
}

case class PointDistanceSeekable(ident: LogicalVariable,
                                 property: LogicalProperty,
                                 range: PointDistanceRange[Expression])
  extends RangeSeekable[Expression, Expression] {

  override def expr: Expression = range.point

  override def dependencies: Set[LogicalVariable] = range.point.dependencies ++ range.distance.dependencies

  def asQueryExpression: QueryExpression[Expression] =
    RangeQueryExpression(PointDistanceSeekRangeWrapper(range)(range.point.position))

  override def propertyValueType(semanticTable: SemanticTable): CypherType = CTPoint

  def propertyKeyName: PropertyKeyName = property.propertyKey
}

case class PointBoundingBoxSeekable(ident: LogicalVariable,
                                    property: LogicalProperty,
                                    expr: Expression,
                                    range: PointBoundingBoxRange[Expression])
  extends RangeSeekable[Expression, Expression] {

  override def dependencies: Set[LogicalVariable] = range.lowerLeft.dependencies ++ range.upperRight.dependencies

  def asQueryExpression: QueryExpression[Expression] =
    RangeQueryExpression(PointBoundingBoxSeekRangeWrapper(range)(expr.position))

  override def propertyValueType(semanticTable: SemanticTable): CypherType = CTPoint

  def propertyKeyName: PropertyKeyName = property.propertyKey
}

case class InequalityRangeSeekable(ident: LogicalVariable, property: LogicalProperty, expr: AndedPropertyInequalities)
  extends RangeSeekable[AndedPropertyInequalities, Expression] {

  def dependencies: Set[LogicalVariable] = expr.inequalities.map(_.rhs.dependencies).toSet.flatten

  def range: InequalitySeekRange[Expression] =
    InequalitySeekRange.fromPartitionedBounds(expr.inequalities.partition {
      case GreaterThan(_, value) => Left(ExclusiveBound(value))
      case GreaterThanOrEqual(_, value) => Left(InclusiveBound(value))
      case LessThan(_, value) => Right(ExclusiveBound(value))
      case LessThanOrEqual(_, value) => Right(InclusiveBound(value))
    })

  def hasEquality: Boolean = expr.inequalities.map(_.includeEquality).reduceLeft(_ || _)

  def asQueryExpression: QueryExpression[Expression] =
    RangeQueryExpression(InequalitySeekRangeWrapper(range)(ident.position))

  override def propertyValueType(semanticTable: SemanticTable): CypherType = {
    Seekable.combineMultipleTypeSpecs(expr.inequalities.map(ineq => semanticTable.getActualTypeFor(ineq.rhs)).toIndexedSeq)
  }

  def propertyKeyName: PropertyKeyName = property.propertyKey
}

sealed trait Scannable[+T <: Expression] extends Sargable[T] {
  def ident: LogicalVariable
  def property: LogicalProperty
  def solvesPredicate: Boolean

  def propertyKey: PropertyKeyName = property.propertyKey
}

object Scannable {
  def isEquivalentScannable(predicate1: Expression, predicate2: Expression): Boolean = {
    def explicitlyScannableProperty(predicate: Expression) = predicate match {
      case AsExplicitlyPropertyScannable(scannable) => Some(scannable.property)
      case _                                        => None
    }

    explicitlyScannableProperty(predicate1) == explicitlyScannableProperty(predicate2)
  }
}

object ExplicitlyPropertyScannable {
  def apply(expr: FunctionInvocation, ident: LogicalVariable, property: LogicalProperty) =
    new ExplicitlyPropertyScannable(expr, ident, property)

  def apply(expr: IsNotNull, ident: LogicalVariable, property: LogicalProperty) =
    new ExplicitlyPropertyScannable(expr, ident, property)
}

case class ExplicitlyPropertyScannable private (expr: Expression, ident: LogicalVariable, property: LogicalProperty)
  extends Scannable[Expression] {
  val solvesPredicate = true
}

case class ImplicitlyPropertyScannable[+T <: Expression](expr: PartialPredicate[T], ident: LogicalVariable, property: LogicalProperty, solvesPredicate: Boolean)
  extends Scannable[PartialPredicate[T]]
