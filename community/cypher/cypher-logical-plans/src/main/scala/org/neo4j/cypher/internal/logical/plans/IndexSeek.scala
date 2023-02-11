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
package org.neo4j.cypher.internal.logical.plans

import org.neo4j.cypher.internal.expressions.EntityType
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.LabelToken
import org.neo4j.cypher.internal.expressions.ListLiteral
import org.neo4j.cypher.internal.expressions.NODE_TYPE
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.PropertyKeyToken
import org.neo4j.cypher.internal.expressions.RELATIONSHIP_TYPE
import org.neo4j.cypher.internal.expressions.RelationshipTypeToken
import org.neo4j.cypher.internal.expressions.SignedDecimalIntegerLiteral
import org.neo4j.cypher.internal.expressions.StringLiteral
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.LabelId
import org.neo4j.cypher.internal.util.NonEmptyList
import org.neo4j.cypher.internal.util.PropertyKeyId
import org.neo4j.cypher.internal.util.RelTypeId
import org.neo4j.cypher.internal.util.attribution.IdGen
import org.neo4j.graphdb.schema.IndexType

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * Helper object for constructing node and relationship index operators from strings.
 */
object IndexSeek {

  // primitives
  private val ID = "([a-zA-Z][a-zA-Z0-9_]*)"
  private val VALUE = "([0-9]+|'.*'|\\?\\?\\?)"
  private val INT = "([0-9]+)".r
  private val STRING = s"'(.*)'".r
  private val PARAM = "???"

  // entry points
  private val NODE_INDEX_SEEK_PATTERN = s"$ID: ?$ID ?\\(([^\\)]+)\\)".r
  private val REL_INDEX_SEEK_PATTERN =  s"\\($ID\\)(<?)-\\[$ID: ?$ID ?\\(([^\\)]+)\\)]?-(>?)\\($ID\\)".r


  // predicates
  private val EXACT = s"$ID ?= ?$VALUE".r
  private val EXACT_TWO = s"$ID = ?$VALUE OR ?$VALUE".r
  private val IN = s"$ID IN \\?\\?\\?".r
  private val EXISTS = s"$ID".r
  private val LESS_THAN = s"$ID ?< ?$VALUE".r
  private val LESS_THAN_OR_EQ = s"$ID ?<= ?$VALUE".r
  private val GREATER_THAN = s"$ID ?> ?$VALUE".r
  private val GREATER_THAN_OR_EQ = s"$ID ?>= ?$VALUE".r
  private val GREATER_THAN_LESS_THAN = s"$VALUE ?< $ID ?< $VALUE".r
  private val GREATER_THAN_EQ_LESS_THAN = s"$VALUE ?<= $ID ?< $VALUE".r
  private val GREATER_THAN_LESS_THAN_EQ = s"$VALUE ?< $ID ?<= $VALUE".r
  private val GREATER_THAN_EQ_LESS_THAN_EQ = s"$VALUE ?<= $ID ?<= $VALUE".r
  private val LESS_THAN_LESS_THAN = s"$VALUE > $ID < $VALUE".r
  private val LESS_THAN_EQ_LESS_THAN = s"$VALUE >= $ID < $VALUE".r
  private val LESS_THAN_EQ_LESS_THAN_EQ = s"$VALUE >= $ID <= $VALUE".r
  private val LESS_THAN_LESS_THAN_EQ = s"$VALUE > $ID <= $VALUE".r
  private val GREATER_THAN_GREATER_THAN = s"$VALUE < $ID > $VALUE".r
  private val GREATER_THAN_EQ_GREATER_THAN = s"$VALUE <= $ID > $VALUE".r
  private val GREATER_THAN_EQ_GREATER_THAN_EQ = s"$VALUE <= $ID >= $VALUE".r
  private val GREATER_THAN_GREATER_THAN_EQ = s"$VALUE < $ID >= $VALUE".r
  private val STARTS_WITH = s"$ID STARTS WITH $VALUE".r
  private val ENDS_WITH = s"$ID ENDS WITH $VALUE".r
  private val CONTAINS = s"$ID CONTAINS $VALUE".r

  private val pos = InputPosition.NONE

  /**
   * Extracts just the label from an index seek string
   */
  def labelFromIndexSeekString(indexSeekString: String): String = {
    val NODE_INDEX_SEEK_PATTERN(_, labelStr, _) = indexSeekString.trim
    labelStr
  }

  /**
   * Extracts just the relationship type from an index seek string
   */
  def relTypeFromIndexSeekString(indexSeekString: String): String = {
    val REL_INDEX_SEEK_PATTERN(_, _, _, typeStr, _, _, _) = indexSeekString.trim
    typeStr
  }

  /**
   * Construct a node index seek/scan operator by parsing a string.
   */
  def nodeIndexSeek(indexSeekString: String,
                    getValue: String => GetValueFromIndexBehavior = _ => DoNotGetValue,
                    indexOrder: IndexOrder = IndexOrderNone,
                    paramExpr: Iterable[Expression] = Seq.empty,
                    argumentIds: Set[String] = Set.empty,
                    propIds: Option[PartialFunction[String, Int]] = None,
                    labelId: Int = 0,
                    unique: Boolean = false,
                    customQueryExpression: Option[QueryExpression[Expression]] = None,
                    indexType: IndexType = IndexType.BTREE)(implicit idGen: IdGen): NodeIndexLeafPlan = {

    val NODE_INDEX_SEEK_PATTERN(node, labelStr, predicateStr) = indexSeekString.trim
    val label = LabelToken(labelStr, LabelId(labelId))
    val predicates = predicateStr.split(',').map(_.trim)

    def createSeek(properties: Seq[IndexedProperty],
                   valueExpr: QueryExpression[Expression]): NodeIndexSeekLeafPlan =
      if (unique) {
        NodeUniqueIndexSeek(node, label, properties, valueExpr, argumentIds, indexOrder, indexType)
      } else {
        NodeIndexSeek(node, label, properties, valueExpr, argumentIds, indexOrder, indexType)
      }


    def createEndsWithScan(property: IndexedProperty, valueExpr: Expression): NodeIndexLeafPlan = {
      NodeIndexEndsWithScan(node, label, property, valueExpr, argumentIds, indexOrder, indexType)
    }

    def createContainsScan(property: IndexedProperty, valueExpr: Expression): NodeIndexLeafPlan = {
      NodeIndexContainsScan(node, label, property, valueExpr, argumentIds, indexOrder, indexType)
    }

    def createScan(properties: Seq[IndexedProperty]): NodeIndexLeafPlan = {
      NodeIndexScan(node, label, properties, argumentIds, indexOrder, indexType)
    }

    createPlan[NodeIndexLeafPlan](
      predicates,
      NODE_TYPE,
      getValue,
      paramExpr,
      propIds,
      customQueryExpression,
      createSeek,
      createScan,
      createEndsWithScan,
      createContainsScan)
  }

  /**
   * Construct a relationship index seek/scan operator by parsing a string.
   */
  def relationshipIndexSeek(indexSeekString: String,
                            getValue: String => GetValueFromIndexBehavior = _ => DoNotGetValue,
                            indexOrder: IndexOrder = IndexOrderNone,
                            paramExpr: Iterable[Expression] = Seq.empty,
                            argumentIds: Set[String] = Set.empty,
                            propIds: Option[PartialFunction[String, Int]] = None,
                            typeId: Int = 0,
                            customQueryExpression: Option[QueryExpression[Expression]] = None,
                            indexType: IndexType = IndexType.BTREE)(implicit idGen: IdGen): RelationshipIndexLeafPlan = {

    val REL_INDEX_SEEK_PATTERN(leftNode, incoming, rel, typeStr, predicateStr, outgoing, rightNode) = indexSeekString.trim
    val (startNode, endNode, directed) = (incoming, outgoing) match {
      case ("<", "") => (rightNode, leftNode, true)
      case ("", ">") => (leftNode, rightNode, true)
      case ("", "") => (leftNode, rightNode, false)
      case _ => throw new UnsupportedOperationException(s"Direction $incoming-$outgoing not supported")
    }
    val typeToken = RelationshipTypeToken(typeStr, RelTypeId(typeId))
    val predicates: Array[String] = predicateStr.split(',').map(_.trim)

    def createSeek(properties: Seq[IndexedProperty],
                   valueExpr: QueryExpression[Expression]): RelationshipIndexLeafPlan = {
      if (directed) {
        DirectedRelationshipIndexSeek(rel,  startNode, endNode, typeToken, properties, valueExpr, argumentIds, indexOrder, indexType)
      } else {
        UndirectedRelationshipIndexSeek(rel,  startNode, endNode, typeToken, properties, valueExpr, argumentIds, indexOrder, indexType)
      }
    }

    def createEndsWithScan(property: IndexedProperty, valueExpr: Expression): RelationshipIndexLeafPlan = {
      if (directed) {
        DirectedRelationshipIndexEndsWithScan(rel, startNode, endNode, typeToken, property, valueExpr, argumentIds, indexOrder, indexType)
      } else {
        UndirectedRelationshipIndexEndsWithScan(rel, startNode, endNode, typeToken, property, valueExpr, argumentIds, indexOrder, indexType)
      }
    }

    def createContainsScan(property: IndexedProperty, valueExpr: Expression): RelationshipIndexLeafPlan = {
      if (directed) {
        DirectedRelationshipIndexContainsScan(rel, startNode, endNode, typeToken, property, valueExpr, argumentIds, indexOrder, indexType)
      } else {
        UndirectedRelationshipIndexContainsScan(rel, startNode, endNode, typeToken, property, valueExpr, argumentIds, indexOrder, indexType)
      }
    }

    def createScan(properties: Seq[IndexedProperty]): RelationshipIndexLeafPlan = {
      if (directed) {
        DirectedRelationshipIndexScan(rel, startNode, endNode, typeToken, properties, argumentIds, indexOrder, indexType)
      } else {
        UndirectedRelationshipIndexScan(rel, startNode, endNode, typeToken, properties, argumentIds, indexOrder, indexType)
      }
    }

    createPlan[RelationshipIndexLeafPlan](
      predicates,
      RELATIONSHIP_TYPE,
      getValue,
      paramExpr,
      propIds,
      customQueryExpression,
      createSeek,
      createScan,
      createEndsWithScan,
      createContainsScan)
  }

  private def createPlan[T <: LogicalLeafPlan](predicates: Array[String],
                                               entityType: EntityType,
                                               getValue: String => GetValueFromIndexBehavior = _ => DoNotGetValue,
                                               paramExpr: Iterable[Expression],
                                               propIds: Option[PartialFunction[String, Int]],
                                               customQueryExpression: Option[QueryExpression[Expression]],
                                               createSeek: (Seq[IndexedProperty], QueryExpression[Expression]) => T,
                                               createScan: (Seq[IndexedProperty]) => T,
                                               createEndsWithScan: (IndexedProperty, Expression) => T,
                                               createContainsScan: (IndexedProperty, Expression) => T): T = {
    var propId = -1
    def nextPropId(): Int = {
      propId += 1
      propId
    }

    def prop(prop: String): IndexedProperty = {
      val id =
        if (propIds.isDefined) {
          val func = propIds.get
          if (func.isDefinedAt(prop)) {
            func(prop)
          } else {
            throw new IllegalArgumentException(s"Property `$prop` has no provided id. Either provide ids for all properties, or provide none.")
          }
        } else {
          nextPropId()
        }

      IndexedProperty(PropertyKeyToken(PropertyKeyName(prop)(pos), PropertyKeyId(id)), getValue(prop), entityType)
    }

    val paramQueue = mutable.Queue(paramExpr.toArray:_*)
    def value(value: String): Expression =
      value match {
        case INT(int) => SignedDecimalIntegerLiteral(int)(pos)
        case STRING(str) => StringLiteral(str)(pos)
        case PARAM =>
          if (paramQueue.isEmpty) throw new IllegalArgumentException("Cannot use parameter syntax '???' without providing parameter expression 'paramExpr'")
          paramQueue.dequeue()
        case _ => throw new IllegalArgumentException(s"Value `$value` is not supported")
      }

    if (predicates.length == 1) {
      predicates.head match {
        case EXACT_TWO(propStr, valueAStr, valueBStr) =>
          val valueExpr = ManyQueryExpression(ListLiteral(Seq(value(valueAStr), value(valueBStr)))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case IN(propStr) =>
          val valueExpr = ManyQueryExpression(paramQueue.dequeue())
          createSeek(List(prop(propStr)), valueExpr)

        case EXACT(propStr, valueStr) =>
          val valueExpr = SingleQueryExpression(value(valueStr))
          createSeek(List(prop(propStr)), valueExpr)

        case LESS_THAN(propStr, valueStr) =>
          val valueExpr = RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(ExclusiveBound(value(valueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case LESS_THAN_OR_EQ(propStr, valueStr) =>
          val valueExpr = RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(InclusiveBound(value(valueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case GREATER_THAN(propStr, valueStr) =>
          val valueExpr = RangeQueryExpression(InequalitySeekRangeWrapper(RangeGreaterThan(NonEmptyList(ExclusiveBound(value(valueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case GREATER_THAN_OR_EQ(propStr, valueStr) =>
          val valueExpr = RangeQueryExpression(InequalitySeekRangeWrapper(RangeGreaterThan(NonEmptyList(InclusiveBound(value(valueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case GREATER_THAN_LESS_THAN(firstValueStr, propStr, secondValueStr) =>
          val valueExpr = RangeQueryExpression(InequalitySeekRangeWrapper(
            RangeBetween(
              RangeGreaterThan(NonEmptyList(ExclusiveBound(value(firstValueStr)))),
              RangeLessThan(NonEmptyList(ExclusiveBound(value(secondValueStr))))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case GREATER_THAN_EQ_LESS_THAN(firstValueStr, propStr, secondValueStr) =>
          val valueExpr = RangeQueryExpression(InequalitySeekRangeWrapper(
            RangeBetween(
              RangeGreaterThan(NonEmptyList(InclusiveBound(value(firstValueStr)))),
              RangeLessThan(NonEmptyList(ExclusiveBound(value(secondValueStr))))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case GREATER_THAN_LESS_THAN_EQ(firstValueStr, propStr, secondValueStr) =>
          val valueExpr = RangeQueryExpression(InequalitySeekRangeWrapper(
            RangeBetween(
              RangeGreaterThan(NonEmptyList(ExclusiveBound(value(firstValueStr)))),
              RangeLessThan(NonEmptyList(InclusiveBound(value(secondValueStr))))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case GREATER_THAN_EQ_LESS_THAN_EQ(firstValueStr, propStr, secondValueStr) =>
          val valueExpr = RangeQueryExpression(InequalitySeekRangeWrapper(
            RangeBetween(
              RangeGreaterThan(NonEmptyList(InclusiveBound(value(firstValueStr)))),
              RangeLessThan(NonEmptyList(InclusiveBound(value(secondValueStr))))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case LESS_THAN_LESS_THAN(firstValueStr, propStr, secondValueStr) =>
          val valueExpr =
            RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(ExclusiveBound(value(firstValueStr)),
              ExclusiveBound(value(secondValueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case LESS_THAN_EQ_LESS_THAN(firstValueStr, propStr, secondValueStr) =>
          val valueExpr =
            RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(InclusiveBound(value(firstValueStr)),
              ExclusiveBound(value(secondValueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case LESS_THAN_LESS_THAN_EQ(firstValueStr, propStr, secondValueStr) =>
          val valueExpr =
            RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(ExclusiveBound(value(firstValueStr)),
              InclusiveBound(value(secondValueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case LESS_THAN_EQ_LESS_THAN_EQ(firstValueStr, propStr, secondValueStr) =>
          val valueExpr =
            RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(InclusiveBound(value(firstValueStr)),
              InclusiveBound(value(secondValueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case GREATER_THAN_GREATER_THAN(firstValueStr, propStr, secondValueStr) =>
          val valueExpr =
            RangeQueryExpression(InequalitySeekRangeWrapper(RangeGreaterThan(NonEmptyList(ExclusiveBound(value(firstValueStr)),
              ExclusiveBound(value(secondValueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case GREATER_THAN_EQ_GREATER_THAN(firstValueStr, propStr, secondValueStr) =>
          val valueExpr =
            RangeQueryExpression(InequalitySeekRangeWrapper(RangeGreaterThan(NonEmptyList(InclusiveBound(value(firstValueStr)),
              ExclusiveBound(value(secondValueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case GREATER_THAN_GREATER_THAN_EQ(firstValueStr, propStr, secondValueStr) =>
          val valueExpr =
            RangeQueryExpression(InequalitySeekRangeWrapper(RangeGreaterThan(NonEmptyList(ExclusiveBound(value(firstValueStr)),
              InclusiveBound(value(secondValueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case GREATER_THAN_EQ_GREATER_THAN_EQ(firstValueStr, propStr, secondValueStr) =>
          val valueExpr =
            RangeQueryExpression(InequalitySeekRangeWrapper(RangeGreaterThan(NonEmptyList(InclusiveBound(value(firstValueStr)),
              InclusiveBound(value(secondValueStr)))))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case STARTS_WITH(propStr, string) =>
          val valueExpr = RangeQueryExpression(PrefixSeekRangeWrapper(PrefixRange(value(string)))(pos))
          createSeek(List(prop(propStr)), valueExpr)

        case ENDS_WITH(propStr, string) =>
          createEndsWithScan(prop(propStr), value(string))

        case CONTAINS(propStr, string) =>
          createContainsScan(prop(propStr), value(string))

        case EXISTS(propStr) if customQueryExpression.isDefined =>
          createSeek(List(prop(propStr)), customQueryExpression.get)

        case EXISTS(propStr) =>
          createScan(Seq(prop(propStr)))
      }
    } else if (predicates.length > 1 && customQueryExpression.isEmpty) {
      val properties = new ArrayBuffer[IndexedProperty]()
      val valueExprs = new ArrayBuffer[QueryExpression[Expression]]()

      val equalityPred = predicates.takeWhile {
        case EXACT_TWO(_, _, _) => true
        case EXACT(_, _) => true
        case _ => false
      }
      val equalityAndNextPred =
        if (equalityPred sameElements predicates) equalityPred
        else equalityPred :+ predicates(equalityPred.length)

      val restOfPred = predicates.slice(equalityAndNextPred.length, predicates.length)

      for (predicate <- equalityAndNextPred)
        predicate match {
          case EXACT_TWO(propStr, valueAStr, valueBStr) =>
            valueExprs += ManyQueryExpression(ListLiteral(Seq(value(valueAStr), value(valueBStr)))(pos))
            properties += prop(propStr)
          case EXACT(propStr, valueStr) =>
            valueExprs += SingleQueryExpression(value(valueStr))
            properties += prop(propStr)
          case LESS_THAN(propStr, valueStr) =>
            valueExprs += RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(ExclusiveBound(value(valueStr)))))(pos))
            properties += prop(propStr)
          case LESS_THAN_OR_EQ(propStr, valueStr) =>
            valueExprs += RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(InclusiveBound(value(valueStr)))))(pos))
            properties += prop(propStr)
          case GREATER_THAN(propStr, valueStr) =>
            valueExprs += RangeQueryExpression(InequalitySeekRangeWrapper(RangeGreaterThan(NonEmptyList(ExclusiveBound(value(valueStr)))))(pos))
            properties += prop(propStr)
          case GREATER_THAN_OR_EQ(propStr, valueStr) =>
            valueExprs += RangeQueryExpression(InequalitySeekRangeWrapper(RangeGreaterThan(NonEmptyList(InclusiveBound(value(valueStr)))))(pos))
            properties += prop(propStr)
          case STARTS_WITH(propStr, string) =>
            valueExprs += RangeQueryExpression(PrefixSeekRangeWrapper(PrefixRange(value(string)))(pos))
            properties += prop(propStr)
          case EXISTS(propStr) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case ENDS_WITH(propStr, _) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case CONTAINS(propStr, _) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case _ => throw new IllegalArgumentException(s"$predicate is not allowed in composite seeks.")
        }

      for (predicate <- restOfPred)
        predicate match {
          case EXACT_TWO(propStr, _, _) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case EXACT(propStr, _) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case LESS_THAN(propStr, _) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case LESS_THAN_OR_EQ(propStr, _) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case GREATER_THAN(propStr, _) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case GREATER_THAN_OR_EQ(propStr, _) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case STARTS_WITH(propStr, _) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case EXISTS(propStr) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case ENDS_WITH(propStr, _) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case CONTAINS(propStr, _) =>
            valueExprs += ExistenceQueryExpression()
            properties += prop(propStr)
          case _ => throw new IllegalArgumentException(s"$predicate is not allowed in composite seeks.")
        }

      if (equalityAndNextPred.length == 1 && (equalityAndNextPred.head match {
        case EXISTS(_) => true
        case ENDS_WITH(_, _) => true
        case CONTAINS(_, _) => true
        case _ => false
      }))
        createScan(properties)
      else
        createSeek(properties, CompositeQueryExpression(valueExprs))
    } else if (predicates.length > 1 && customQueryExpression.isDefined) {
      createSeek(predicates.map(prop), customQueryExpression.get)
    } else
      throw new IllegalArgumentException(s"Cannot parse `${predicates.mkString("Array(", ", ", ")")}` as an index seek.")
  }
}
