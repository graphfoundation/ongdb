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
package org.neo4j.cypher.internal.compiler.planner.logical.cardinality

import org.neo4j.cypher.internal.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.compiler.planner.logical.Metrics.LabelInfo
import org.neo4j.cypher.internal.compiler.planner.logical.Metrics.RelTypeInfo
import org.neo4j.cypher.internal.compiler.planner.logical.PlannerDefaults.DEFAULT_EQUALITY_SELECTIVITY
import org.neo4j.cypher.internal.compiler.planner.logical.PlannerDefaults.DEFAULT_LIST_CARDINALITY
import org.neo4j.cypher.internal.compiler.planner.logical.PlannerDefaults.DEFAULT_NUMBER_OF_ID_LOOKUPS
import org.neo4j.cypher.internal.compiler.planner.logical.PlannerDefaults.DEFAULT_PREDICATE_SELECTIVITY
import org.neo4j.cypher.internal.compiler.planner.logical.PlannerDefaults.DEFAULT_PROPERTY_SELECTIVITY
import org.neo4j.cypher.internal.compiler.planner.logical.PlannerDefaults.DEFAULT_RANGE_SEEK_FACTOR
import org.neo4j.cypher.internal.compiler.planner.logical.PlannerDefaults.DEFAULT_RANGE_SELECTIVITY
import org.neo4j.cypher.internal.compiler.planner.logical.PlannerDefaults.DEFAULT_REL_UNIQUENESS_SELECTIVITY
import org.neo4j.cypher.internal.compiler.planner.logical.PlannerDefaults.DEFAULT_STRING_LENGTH
import org.neo4j.cypher.internal.compiler.planner.logical.PlannerDefaults.DEFAULT_TYPE_SELECTIVITY
import org.neo4j.cypher.internal.compiler.planner.logical.cardinality.ExpressionSelectivityCalculator.getPropertyPredicateRangeSelectivity
import org.neo4j.cypher.internal.compiler.planner.logical.cardinality.ExpressionSelectivityCalculator.getStringLength
import org.neo4j.cypher.internal.compiler.planner.logical.cardinality.ExpressionSelectivityCalculator.indexSelectivityForSubstringSargable
import org.neo4j.cypher.internal.compiler.planner.logical.cardinality.ExpressionSelectivityCalculator.indexSelectivityWithSizeHint
import org.neo4j.cypher.internal.compiler.planner.logical.plans.AsBoundingBoxSeekable
import org.neo4j.cypher.internal.compiler.planner.logical.plans.AsDistanceSeekable
import org.neo4j.cypher.internal.compiler.planner.logical.plans.AsIdSeekable
import org.neo4j.cypher.internal.compiler.planner.logical.plans.AsPropertyScannable
import org.neo4j.cypher.internal.compiler.planner.logical.plans.AsPropertySeekable
import org.neo4j.cypher.internal.compiler.planner.logical.plans.AsStringRangeSeekable
import org.neo4j.cypher.internal.compiler.planner.logical.plans.AsValueRangeSeekable
import org.neo4j.cypher.internal.compiler.planner.logical.plans.InequalityRangeSeekable
import org.neo4j.cypher.internal.compiler.planner.logical.plans.PointBoundingBoxSeekable
import org.neo4j.cypher.internal.compiler.planner.logical.plans.PointDistanceSeekable
import org.neo4j.cypher.internal.compiler.planner.logical.plans.PrefixRangeSeekable
import org.neo4j.cypher.internal.expressions.AssertIsNode
import org.neo4j.cypher.internal.expressions.Contains
import org.neo4j.cypher.internal.expressions.EndsWith
import org.neo4j.cypher.internal.expressions.Equals
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.False
import org.neo4j.cypher.internal.expressions.GreaterThan
import org.neo4j.cypher.internal.expressions.GreaterThanOrEqual
import org.neo4j.cypher.internal.expressions.HasLabels
import org.neo4j.cypher.internal.expressions.LabelName
import org.neo4j.cypher.internal.expressions.LessThan
import org.neo4j.cypher.internal.expressions.LessThanOrEqual
import org.neo4j.cypher.internal.expressions.Not
import org.neo4j.cypher.internal.expressions.Ors
import org.neo4j.cypher.internal.expressions.PartialPredicate
import org.neo4j.cypher.internal.expressions.Property
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.RelTypeName
import org.neo4j.cypher.internal.expressions.StringLiteral
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.logical.plans.PrefixRange
import org.neo4j.cypher.internal.planner.spi.GraphStatistics
import org.neo4j.cypher.internal.planner.spi.IndexDescriptor
import org.neo4j.cypher.internal.planner.spi.IndexDescriptor.IndexType
import org.neo4j.cypher.internal.util.Cardinality
import org.neo4j.cypher.internal.util.LabelId
import org.neo4j.cypher.internal.util.NameId
import org.neo4j.cypher.internal.util.PropertyKeyId
import org.neo4j.cypher.internal.util.RelTypeId
import org.neo4j.cypher.internal.util.Selectivity

import scala.language.postfixOps

case class ExpressionSelectivityCalculator(stats: GraphStatistics, combiner: SelectivityCombiner, planningTextIndexesEnabled: Boolean) {

  private val indexTypesPriorityForSubstringSargable: Seq[IndexType] = Seq(
    if (planningTextIndexesEnabled) Some(IndexType.Text) else None,
    Some(IndexType.Btree),
  ).flatten

  private val indexTypesPriorityForPropertyExistence: Seq[IndexType] = Seq(
    Some(IndexType.Btree),
    if (planningTextIndexesEnabled) Some(IndexType.Text) else None,
  ).flatten

  def apply(exp: Expression, labelInfo: LabelInfo, relTypeInfo: RelTypeInfo)(implicit semanticTable: SemanticTable): Selectivity = exp match {
    // WHERE a:Label
    case HasLabels(_, label :: Nil) =>
      calculateSelectivityForLabel(semanticTable.id(label))

    // WHERE false
    case False() =>
      Selectivity.ZERO

    // SubPredicate(sub, super)
    case partial: PartialPredicate[_] =>
      apply(partial.coveredPredicate, labelInfo, relTypeInfo)

    // WHERE x.prop =/IN ...
    case AsPropertySeekable(seekable) =>
      calculateSelectivityForPropertyEquality(seekable.name, seekable.args.sizeHint, labelInfo, relTypeInfo, seekable.propertyKey)

    // WHERE x.prop STARTS WITH 'prefix'
    case AsStringRangeSeekable(seekable@PrefixRangeSeekable(PrefixRange(StringLiteral(prefix)), _, _, _)) =>
      calculateSelectivityForSubstringSargable(seekable.name, labelInfo, relTypeInfo, seekable.propertyKeyName, Some(prefix))

    // WHERE x.prop STARTS WITH expression
    case AsStringRangeSeekable(seekable@PrefixRangeSeekable(_:PrefixRange[_], _, _, _)) =>
      calculateSelectivityForSubstringSargable(seekable.name, labelInfo, relTypeInfo, seekable.propertyKeyName, None)

    // WHERE x.prop CONTAINS 'substring'
    case Contains(Property(Variable(name), propertyKey), StringLiteral(substring)) =>
      calculateSelectivityForSubstringSargable(name, labelInfo, relTypeInfo, propertyKey, Some(substring))

    // WHERE x.prop CONTAINS expression
    case Contains(Property(Variable(name), propertyKey), expr) =>
      calculateSelectivityForSubstringSargable(name, labelInfo, relTypeInfo, propertyKey, None)

    // WHERE x.prop ENDS WITH 'substring'
    case EndsWith(Property(Variable(name), propertyKey), StringLiteral(substring)) =>
      calculateSelectivityForSubstringSargable(name, labelInfo, relTypeInfo, propertyKey, Some(substring))

    // WHERE x.prop ENDS WITH expression
    case EndsWith(Property(Variable(name), propertyKey), expr) =>
      calculateSelectivityForSubstringSargable(name, labelInfo, relTypeInfo, propertyKey, None)

    // WHERE distance(p.prop, otherPoint) <, <= number that could benefit from an index
    case AsDistanceSeekable(seekable) =>
      calculateSelectivityForPointDistanceSeekable(seekable, labelInfo, relTypeInfo)

    // WHERE point.withinBBox(p.prop, ll, ur) that could benefit from an index
    case AsBoundingBoxSeekable(seekable) =>
      calculateSelectivityForPointBoundingBoxSeekable(seekable, labelInfo, relTypeInfo)

    // WHERE x.prop <, <=, >=, > that could benefit from an index
    case AsValueRangeSeekable(seekable) =>
      calculateSelectivityForValueRangeSeekable(seekable, labelInfo, relTypeInfo)

    // WHERE x.prop IS NOT NULL
    case AsPropertyScannable(scannable) =>
      calculateSelectivityForPropertyExistence(scannable.name, labelInfo, relTypeInfo, scannable.propertyKey)

    // Implicit relation uniqueness predicates
    case Not(Equals(lhs: Variable, rhs: Variable))
      if areRelationships(semanticTable, lhs, rhs) =>
      DEFAULT_REL_UNIQUENESS_SELECTIVITY // This should not be the default. Instead, we should figure

    // WHERE NOT [...]
    case Not(inner) =>
      apply(inner, labelInfo, relTypeInfo).negate

    case Ors(expressions) =>
      val selectivities = expressions.toIndexedSeq.map(apply(_, labelInfo, relTypeInfo))
      combiner.orTogetherSelectivities(selectivities).get // We can trust the AST to never have empty ORs

    // WHERE id(x) =/IN [...]
    case AsIdSeekable(seekable) =>
      val lookups = seekable.args.sizeHint.map(Cardinality(_)).getOrElse(DEFAULT_NUMBER_OF_ID_LOOKUPS)
      if (semanticTable.isNode(seekable.ident)) {
        (lookups / stats.nodesAllCardinality()) getOrElse Selectivity.ONE
      } else {
        (lookups / stats.patternStepCardinality(None, None, None)) getOrElse Selectivity.ONE
      }

    // WHERE <expr> = <expr>
    case _: Equals =>
      DEFAULT_EQUALITY_SELECTIVITY

    // WHERE <expr> >= <expr>
    case _: GreaterThan | _: GreaterThanOrEqual | _: LessThan | _: LessThanOrEqual =>
      DEFAULT_RANGE_SELECTIVITY

    case _: AssertIsNode =>
      Selectivity.ONE

    case _ =>
      DEFAULT_PREDICATE_SELECTIVITY
  }

  private def areRelationships(semanticTable: SemanticTable, lhs: Variable, rhs: Variable): Boolean = {
    val l = semanticTable.isRelationship(lhs)
    val r = semanticTable.isRelationship(rhs)
    l && r
  }

  private def calculateSelectivityForLabel(label: Option[LabelId]): Selectivity = {
    val labelCardinality = stats.nodesWithLabelCardinality(label)
    labelCardinality / stats.nodesAllCardinality() getOrElse Selectivity.ONE
  }

  private def calculateSelectivityForPropertyExistence(variable: String,
                                                       labelInfo: LabelInfo,
                                                       relTypeInfo: RelTypeInfo,
                                                       propertyKey: PropertyKeyName)
                                                      (implicit semanticTable: SemanticTable): Selectivity = {
    val indexPropertyExistsSelectivities =
      multipleIndexPropertyExistsSelectivitiesFor(variable, labelInfo, relTypeInfo, propertyKey, indexTypesPriorityForPropertyExistence).map {
        case (selectivity, indexType) =>
          if (indexType == IndexType.Btree)
            selectivity
          else
            Selectivity
              .of(selectivity.factor + (selectivity.negate * DEFAULT_PROPERTY_SELECTIVITY).factor) // not as accurate as BTREE, but can be an improvement over the default value
              .getOrElse(DEFAULT_PROPERTY_SELECTIVITY)
      }

    combiner.orTogetherSelectivities(indexPropertyExistsSelectivities).getOrElse(DEFAULT_PROPERTY_SELECTIVITY)
  }

  private def indexPropertyExistsSelectivitiesFor(variable: String,
                                                  labelInfo: LabelInfo,
                                                  relTypeInfo: RelTypeInfo,
                                                  propertyKey: PropertyKeyName,
                                                  indexType: IndexType)
                                                 (implicit semanticTable: SemanticTable): Seq[Selectivity] = {
    multipleIndexPropertyExistsSelectivitiesFor(variable, labelInfo, relTypeInfo, propertyKey, Seq(indexType))
      .map(_._1)
  }

  private def multipleIndexPropertyExistsSelectivitiesFor(variable: String,
                                                          labelInfo: LabelInfo,
                                                          relTypeInfo: RelTypeInfo,
                                                          propertyKey: PropertyKeyName,
                                                          indexTypesPriorityOrder: Seq[IndexType])
                                                         (implicit semanticTable: SemanticTable): Seq[(Selectivity, IndexType)] = {
    val labels = labelInfo.getOrElse(variable, Set.empty)
    val relTypes = relTypeInfo.get(variable)

    val entityTypeAndPropertyIds: Seq[(NameId, PropertyKeyId)] = (labels ++ relTypes).toIndexedSeq.flatMap {
      case labelName: LabelName => for {
        labelId <- semanticTable.id(labelName)
        propId  <- semanticTable.id(propertyKey)
      } yield (labelId, propId)

      case relTypeName: RelTypeName => for {
        relTypeId <- semanticTable.id(relTypeName)
        propId  <- semanticTable.id(propertyKey)
      } yield (relTypeId, propId)
    }

    entityTypeAndPropertyIds.flatMap { case (entityTypeId, propertyKeyId) =>
      val selectivitiesInIndexPriorityOrder = for {
        indexType <- indexTypesPriorityOrder
        selectivity <- indexPropertyIsNotNullSelectivity(indexType, entityTypeId, propertyKeyId)
      } yield (selectivity, indexType)

      selectivitiesInIndexPriorityOrder.headOption
    }
  }

  private def indexPropertyIsNotNullSelectivity(indexType: IndexType, entityTypeId: NameId, propertyKeyId: PropertyKeyId): Option[Selectivity] = {
    entityTypeId match {
      case labelId: LabelId =>
        val descriptor = IndexDescriptor.forLabel(indexType, labelId, Seq(propertyKeyId))
        stats.indexPropertyIsNotNullSelectivity(descriptor)

      case relTypeId: RelTypeId =>
        val descriptor = IndexDescriptor.forRelType(indexType, relTypeId, Seq(propertyKeyId))
        stats.indexPropertyIsNotNullSelectivity(descriptor)

      case _ => Some(Selectivity.ZERO)
    }
  }

  private def calculateSelectivityForPropertyEquality(variable: String,
                                                      sizeHint: Option[Int],
                                                      labelInfo: LabelInfo,
                                                      relTypeInfo: RelTypeInfo,
                                                      propertyKey: PropertyKeyName)
                                                     (implicit semanticTable: SemanticTable): Selectivity = {
    indexSelectivityWithSizeHint(sizeHint, { size =>
      val labels = labelInfo.getOrElse(variable, Set.empty)
      val relTypes = relTypeInfo.get(variable)
      val indexSelectivities = (labels ++ relTypes).toIndexedSeq.flatMap { name =>

        val descriptor: Option[IndexDescriptor] = (name, semanticTable.id(propertyKey)) match {
          case (labelName: LabelName, Some(propKeyId)) => semanticTable.id(labelName).map(id => IndexDescriptor.forLabel(IndexType.Btree, id, Seq(propKeyId)))
          case (relTypeName: RelTypeName, Some(propKeyId)) => semanticTable.id(relTypeName).map(id => IndexDescriptor.forRelType(IndexType.Btree, id, Seq(propKeyId)))
          case _ => None
        }

        descriptor.flatMap(indexSelectivityForPropertyEquality(_, size))
      }

      combiner.orTogetherSelectivities(indexSelectivities)
        .orElse(defaultSelectivityForPropertyEquality(size))
        .getOrElse(DEFAULT_PREDICATE_SELECTIVITY)
    })
  }

  private def indexSelectivityForPropertyEquality(descriptor: IndexDescriptor, size: Int): Option[Selectivity] =
    selectivityForPropertyEquality(stats.indexPropertyIsNotNullSelectivity(descriptor), stats.uniqueValueSelectivity(descriptor), size)


  private def defaultSelectivityForPropertyEquality(size: Int): Option[Selectivity] =
    selectivityForPropertyEquality(Some(DEFAULT_PROPERTY_SELECTIVITY), Some(DEFAULT_EQUALITY_SELECTIVITY), size)

  private def selectivityForPropertyEquality(propertySelectivity: Option[Selectivity], uniqueValueSelectivity: Option[Selectivity], size: Int): Option[Selectivity] = for {
    propExists <- propertySelectivity
    propEqualsSingleValue <- uniqueValueSelectivity
    propEqualsAnyValue <- combiner.orTogetherSelectivities(Seq.fill(size)(propEqualsSingleValue))
    combinedSelectivity <- combiner.andTogetherSelectivities(Seq(propExists, propEqualsAnyValue))
  } yield combinedSelectivity

  private def calculateSelectivityForValueRangeSeekable(seekable: InequalityRangeSeekable,
                                                        labelInfo: LabelInfo,
                                                        relTypeInfo: RelTypeInfo)
                                                       (implicit semanticTable: SemanticTable): Selectivity = {
    def default = {
      val defaultRange = DEFAULT_RANGE_SELECTIVITY * Selectivity(1.0 / Math.min(seekable.expr.inequalities.size, 2))
      if (seekable.hasEquality) {
        // If the sum should ever (by changing the constants) be more than 1 we default to 1
        Selectivity.of(DEFAULT_EQUALITY_SELECTIVITY.factor + defaultRange.factor).getOrElse(Selectivity.ONE)
      } else {
        defaultRange
      }
    }

    val labels = labelInfo.getOrElse(seekable.ident.name, Set.empty)
    val relTypes = relTypeInfo.get(seekable.ident.name)
    val indexRangeSelectivities: Seq[Selectivity] = (labels ++ relTypes).toIndexedSeq.flatMap { name =>
      val ids = name match {
        case labelName: LabelName => (semanticTable.id(labelName), semanticTable.id(seekable.expr.property.propertyKey))
        case relTypeName: RelTypeName => (semanticTable.id(relTypeName), semanticTable.id(seekable.expr.property.propertyKey))
      }

      ids match {
        case (Some(labelOrRelTypeId), Some(propertyKeyId)) =>
          val descriptor = labelOrRelTypeId match {
            case labelId: LabelId => IndexDescriptor.forLabel(IndexType.Btree, labelId, Seq(propertyKeyId))
            case relTypeId: RelTypeId => IndexDescriptor.forRelType(IndexType.Btree, relTypeId, Seq(propertyKeyId))
          }

          for {
            propertyExistsSelectivity <- stats.indexPropertyIsNotNullSelectivity(descriptor)
            propEqValueSelectivity <- stats.uniqueValueSelectivity(descriptor)
          } yield {
            val pRangeBounded: Selectivity = getPropertyPredicateRangeSelectivity(seekable, propEqValueSelectivity)
            pRangeBounded * propertyExistsSelectivity
          }

        case _ => Some(Selectivity.ZERO)
      }
    }

    combiner.orTogetherSelectivities(indexRangeSelectivities).getOrElse(default)
  }

  private def calculateSelectivityForPointDistanceSeekable(seekable: PointDistanceSeekable,
                                                           labelInfo: LabelInfo,
                                                           relTypeInfo: RelTypeInfo)
                                                          (implicit semanticTable: SemanticTable): Selectivity = {
    val indexPropertyExistsSelectivities = indexPropertyExistsSelectivitiesFor(seekable.ident.name, labelInfo, relTypeInfo, seekable.propertyKeyName, IndexType.Btree)
    val indexDistanceSelectivities = indexPropertyExistsSelectivities.map(_ * Selectivity(DEFAULT_RANGE_SEEK_FACTOR))
    combiner.orTogetherSelectivities(indexDistanceSelectivities).getOrElse(DEFAULT_RANGE_SELECTIVITY)
  }

  private def calculateSelectivityForPointBoundingBoxSeekable(seekable: PointBoundingBoxSeekable,
                                                            labelInfo: LabelInfo,
                                                            relTypeInfo: RelTypeInfo)
                                                          (implicit semanticTable: SemanticTable): Selectivity = {
    //NOTE this equivalent to using two inequalities, like p1 <= n.prop <= p2
    def default = {
      val defaultRange = DEFAULT_RANGE_SELECTIVITY * Selectivity(0.5)
      Selectivity.of(DEFAULT_EQUALITY_SELECTIVITY.factor + defaultRange.factor).getOrElse(Selectivity.ONE)
    }

    //NOTE this equivalent to using two inequalities, like p1 <= n.prop <= p2
    def getPropertyPredicateRangeSelectivity(propEqValueSelectivity: Selectivity): Selectivity = {
      val pNeq = propEqValueSelectivity.negate
      val pNeqRange = pNeq.factor * DEFAULT_RANGE_SEEK_FACTOR / 2

      val pRange = Selectivity(propEqValueSelectivity.factor + pNeqRange)
      Selectivity(math.max(propEqValueSelectivity.factor, pRange.factor))
    }

    val labels = labelInfo.getOrElse(seekable.ident.name, Set.empty)
    val relTypes = relTypeInfo.get(seekable.ident.name)
    val indexRangeSelectivities: Seq[Selectivity] = (labels ++ relTypes).toIndexedSeq.flatMap { name =>
      val ids = name match {
        case labelName: LabelName => (semanticTable.id(labelName), semanticTable.id(seekable.property.propertyKey))
        case relTypeName: RelTypeName => (semanticTable.id(relTypeName), semanticTable.id(seekable.property.propertyKey))
      }

      ids match {
        case (Some(labelOrRelTypeId), Some(propertyKeyId)) =>
          val descriptor = labelOrRelTypeId match {
            case labelId: LabelId => IndexDescriptor.forLabel(IndexDescriptor.IndexType.Btree, labelId, Seq(propertyKeyId))
            case relTypeId: RelTypeId => IndexDescriptor.forRelType(IndexDescriptor.IndexType.Btree, relTypeId, Seq(propertyKeyId))
          }

          for {
            propertyExistsSelectivity <- stats.indexPropertyIsNotNullSelectivity(descriptor)
            propEqValueSelectivity <- stats.uniqueValueSelectivity(descriptor)
          } yield {
            val pRangeBounded: Selectivity = getPropertyPredicateRangeSelectivity(propEqValueSelectivity)
            pRangeBounded * propertyExistsSelectivity
          }

        case _ => Some(Selectivity.ZERO)
      }
    }
      combiner.orTogetherSelectivities(indexRangeSelectivities).getOrElse(default)
    }

  private def calculateSelectivityForSubstringSargable(variable: String,
                                                       labelInfo: LabelInfo,
                                                       relTypeInfo: RelTypeInfo,
                                                       propertyKey: PropertyKeyName,
                                                       maybeString: Option[String])
                                                      (implicit semanticTable: SemanticTable): Selectivity = {
    val stringLength = getStringLength(maybeString)

    def default = if (stringLength == 0) {
      // This is equal to exists && isString
      DEFAULT_PROPERTY_SELECTIVITY * DEFAULT_TYPE_SELECTIVITY
    } else {
      // This is equal to range, but anti-proportional to the string length
      Selectivity(DEFAULT_RANGE_SELECTIVITY.factor / stringLength)
    }

    val indexPropertyExistsSelectivities =
      multipleIndexPropertyExistsSelectivitiesFor(variable, labelInfo, relTypeInfo, propertyKey, indexTypesPriorityForSubstringSargable)

    val indexSubstringSelectivities = indexPropertyExistsSelectivities.map { case (exists, indexType) =>
      exists * indexSelectivityForSubstringSargable(stringLength, indexType)
    }
    combiner.orTogetherSelectivities(indexSubstringSelectivities).getOrElse(default)
  }
}

object ExpressionSelectivityCalculator {

  /**
   * The selectivity that a string starts with, contains or ends with a certain substring of length `stringLength`,
   * given that the property IS NOT NULL.
   */
  def indexSelectivityForSubstringSargable(stringLength: Int, indexType: IndexType): Selectivity = {
    if (stringLength == 0) {
      // selectivity is only that the property is of type string
      indexType match {
        case IndexType.Text => Selectivity.ONE
        case _ => DEFAULT_TYPE_SELECTIVITY
      }
    } else {
      // This is equal to range, but anti-proportional to the string length
      Selectivity(DEFAULT_RANGE_SEEK_FACTOR / stringLength)
    }
  }

  /**
   * The selectivity that a string starts with, contains or ends with a certain substring,
   * given that the property IS NOT NULL.
   */
  def indexSelectivityForSubstringSargable(maybeString: Option[String],
                                           indexType: IndexType = IndexType.Btree): Selectivity = {
    indexSelectivityForSubstringSargable(getStringLength(maybeString), indexType)
  }

  /**
   * The length of an optional string, or the default length.
   */
  def getStringLength(maybeString: Option[String]): Int = {
    maybeString match {
      case Some(n) => n.length
      case None => DEFAULT_STRING_LENGTH
    }
  }

  /**
   * Estimates the seekable predicate's selectivity assuming existence of the predicate's property.
   * @param seekable the predicate
   * @param propEqValueSelectivity selectivity for equality on that property
   */
  def getPropertyPredicateRangeSelectivity(seekable: InequalityRangeSeekable,
                                           propEqValueSelectivity: Selectivity): Selectivity = {
    val pNeq = propEqValueSelectivity.negate
    val pNeqRange = pNeq.factor * DEFAULT_RANGE_SEEK_FACTOR / Math.min(seekable.expr.inequalities.size, 2)

    val pRange = Selectivity(if (seekable.hasEquality) propEqValueSelectivity.factor + pNeqRange else pNeqRange)
    Selectivity(math.max(propEqValueSelectivity.factor, pRange.factor))
  }

  /**
   * Calculate a selectivity of an index with an optional list size hint.
   * @param sizeHint an optional hint for the size of the list
   * @param selectivityCalculator calculate the selectivity given a size
   */
  def indexSelectivityWithSizeHint(sizeHint: Option[Int],
                                   selectivityCalculator: Int => Selectivity): Selectivity = {
    sizeHint.getOrElse(DEFAULT_LIST_CARDINALITY.amount.toInt) match {
      case 0 => Selectivity.ZERO
      case size => selectivityCalculator(size)
    }
  }
}
