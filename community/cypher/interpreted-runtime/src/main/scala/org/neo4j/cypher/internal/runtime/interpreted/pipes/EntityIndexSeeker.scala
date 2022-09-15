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
package org.neo4j.cypher.internal.runtime.interpreted.pipes

import org.neo4j.cypher.internal.frontend.helpers.SeqCombiner.combine
import org.neo4j.cypher.internal.logical.plans.CompositeQueryExpression
import org.neo4j.cypher.internal.logical.plans.ExistenceQueryExpression
import org.neo4j.cypher.internal.logical.plans.IndexOrder
import org.neo4j.cypher.internal.logical.plans.IndexOrderAscending
import org.neo4j.cypher.internal.logical.plans.IndexOrderDescending
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.logical.plans.InequalitySeekRange
import org.neo4j.cypher.internal.logical.plans.ManyQueryExpression
import org.neo4j.cypher.internal.logical.plans.MinMaxOrdering
import org.neo4j.cypher.internal.logical.plans.QueryExpression
import org.neo4j.cypher.internal.logical.plans.RangeBetween
import org.neo4j.cypher.internal.logical.plans.RangeGreaterThan
import org.neo4j.cypher.internal.logical.plans.RangeLessThan
import org.neo4j.cypher.internal.logical.plans.RangeQueryExpression
import org.neo4j.cypher.internal.logical.plans.SingleQueryExpression
import org.neo4j.cypher.internal.macros.AssertMacros.checkOnlyWhenAssertionsAreEnabled
import org.neo4j.cypher.internal.runtime.CompositeValueIndexCursor
import org.neo4j.cypher.internal.runtime.CypherRow
import org.neo4j.cypher.internal.runtime.IsList
import org.neo4j.cypher.internal.runtime.ReadableRow
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.InequalitySeekRangeExpression
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.PointBoundingBoxSeekRangeExpression
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.PointDistanceSeekRangeExpression
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.PrefixSeekRangeExpression
import org.neo4j.cypher.internal.runtime.makeValueNeoSafe
import org.neo4j.exceptions.CypherTypeException
import org.neo4j.exceptions.InternalException
import org.neo4j.internal.kernel.api.IndexReadSession
import org.neo4j.internal.kernel.api.NodeValueIndexCursor
import org.neo4j.internal.kernel.api.PropertyIndexQuery
import org.neo4j.internal.kernel.api.RelationshipValueIndexCursor
import org.neo4j.values.AnyValue
import org.neo4j.values.storable.NumberValue
import org.neo4j.values.storable.PointValue
import org.neo4j.values.storable.TextValue
import org.neo4j.values.storable.Value
import org.neo4j.values.storable.Values

import scala.collection.JavaConverters.asScalaBufferConverter

/**
 * Mixin trait with functionality for executing logical index queries.
 *
 * This trait maps the logical IndexSeekMode and QueryExpression into the kernel IndexQuery classes, which
 * are passed to the QueryContext for executing the index seek.
 */
trait EntityIndexSeeker {

  // dependencies

  def indexMode: IndexSeekMode
  def valueExpr: QueryExpression[Expression]
  def propertyIds: Array[Int]

  // index seek
  protected def indexSeek[RESULT <: AnyRef](state: QueryState,
                                            index: IndexReadSession,
                                            needsValues: Boolean,
                                            indexOrder: IndexOrder,
                                            baseContext: CypherRow): NodeValueIndexCursor =
    indexMode match {
      case _: ExactSeek |
           _: SeekByRange =>
        val indexQueries: Seq[Seq[PropertyIndexQuery]] = computeIndexQueries(state, baseContext)
        if (indexQueries.size == 1) {
          state.query.nodeIndexSeek(index, needsValues, indexOrder, indexQueries.head)
        } else {
          orderedCursor(indexOrder, indexQueries.map(query => state.query.nodeIndexSeek(index, needsValues = needsValues || indexOrder != IndexOrderNone, indexOrder, query)).toArray)
        }

      case LockingUniqueIndexSeek =>
        val indexQueries = computeExactQueries(state, baseContext)
        if (indexQueries.size == 1) {
          state.query.nodeLockingUniqueIndexSeek(index.reference(), indexQueries.head)
        } else {
          orderedCursor(indexOrder, indexQueries.map(query => state.query.nodeLockingUniqueIndexSeek(index.reference(), query)).toArray)
        }
    }

  protected def relationshipIndexSeek(state: QueryState,
                                      index: IndexReadSession,
                                      needsValues: Boolean,
                                      indexOrder: IndexOrder,
                                      baseContext: CypherRow): RelationshipValueIndexCursor = {
    val indexQueries: Seq[Seq[PropertyIndexQuery]] = computeIndexQueries(state, baseContext)
    if (indexQueries.size == 1) {
      state.query.relationshipIndexSeek(index, needsValues, indexOrder, indexQueries.head)
    } else {
      orderedCursor(indexOrder, indexQueries.map(query => state.query.relationshipIndexSeek(index, needsValues = needsValues || indexOrder != IndexOrderNone, indexOrder, query)).toArray)
    }
  }

  // helpers

  private def orderedCursor(indexOrder: IndexOrder, cursors: Array[NodeValueIndexCursor]) = indexOrder match {
    case IndexOrderNone => CompositeValueIndexCursor.unordered(cursors)
    case IndexOrderAscending => CompositeValueIndexCursor.ascending(cursors)
    case IndexOrderDescending => CompositeValueIndexCursor.descending(cursors)
  }

  private def orderedCursor(indexOrder: IndexOrder, cursors: Array[RelationshipValueIndexCursor]) = indexOrder match {
    case IndexOrderNone => CompositeValueIndexCursor.unordered(cursors)
    case IndexOrderAscending => CompositeValueIndexCursor.ascending(cursors)
    case IndexOrderDescending => CompositeValueIndexCursor.descending(cursors)
  }

  private val BY_VALUE: MinMaxOrdering[Value] = MinMaxOrdering(Ordering.comparatorToOrdering(Values.COMPARATOR))

  def computeIndexQueries(state: QueryState, row: ReadableRow): Seq[Seq[PropertyIndexQuery]] =
    valueExpr match {

      // Index range seek over range of values
      case RangeQueryExpression(rangeWrapper) =>
        checkOnlyWhenAssertionsAreEnabled(propertyIds.length == 1)
        computeRangeQueries(state, row, rangeWrapper, propertyIds.head).map(Seq(_))

      // Index composite seek over all values
      case CompositeQueryExpression(exprs) =>
        // ex:   x in [1] AND y in ["a", "b"] AND z > 3.0 AND exists(p)
        checkOnlyWhenAssertionsAreEnabled(exprs.lengthCompare(propertyIds.length) == 0)

        // indexQueries = [
        //                  [exact(1)],
        //                  [exact("a"), exact("b")],
        //                  [greaterThan(3.0)],
        //                  [exists(p)]
        //                ]
        val indexQueries = exprs.zip(propertyIds).map {
          case (expr, propId) =>
            computeCompositeQueries(state, row)(expr, propId)
        }

        // [
        //  [exact(1), exact("a"), greaterThan(3.0), exists(p)],
        //  [exact(1), exact("b"), greaterThan(3.0), exists(p)]
        // ]
        combine(indexQueries)

      case ExistenceQueryExpression() =>
        throw new InternalException("An ExistenceQueryExpression shouldn't be found outside of a CompositeQueryExpression")

      case _ =>
        computeExactQueries(state, row)
    }

  private def computeRangeQueries(state: QueryState, row: ReadableRow, rangeWrapper: Expression, propertyId: Int): Seq[PropertyIndexQuery] = {
    rangeWrapper match {
      case PrefixSeekRangeExpression(range) =>
        val expr = range.prefix
        expr(row, state) match {
          case text: TextValue =>
            Array(PropertyIndexQuery.stringPrefix(propertyId, text))
          case _ =>
            Nil
        }

      case InequalitySeekRangeExpression(innerRange) =>
        val valueRange: InequalitySeekRange[Value] = innerRange.mapBounds(expr => makeValueNeoSafe(expr(row, state)))
        val groupedRanges = valueRange.groupBy(bound => bound.endPoint.valueGroup())
        if (groupedRanges.size > 1) {
          Nil // predicates of more than one value group mean that no node can ever match
        } else {
          val (valueGroup, range) = groupedRanges.head
          range match {
            case rangeLessThan: RangeLessThan[Value] =>
              rangeLessThan.limit(BY_VALUE).map(limit => PropertyIndexQuery.range(propertyId, null, false, limit.endPoint, limit.isInclusive)).toSeq

            case rangeGreaterThan: RangeGreaterThan[Value] =>
              rangeGreaterThan.limit(BY_VALUE).map(limit => PropertyIndexQuery.range(propertyId, limit.endPoint, limit.isInclusive, null, false)).toSeq

            case RangeBetween(rangeGreaterThan, rangeLessThan) =>
              val greaterThanLimit = rangeGreaterThan.limit(BY_VALUE).get
              val lessThanLimit = rangeLessThan.limit(BY_VALUE).get
              val compare = Values.COMPARATOR.compare(greaterThanLimit.endPoint, lessThanLimit.endPoint)
              if (compare < 0) {
                    List(PropertyIndexQuery.range(propertyId,
                      greaterThanLimit.endPoint,
                      greaterThanLimit.isInclusive,
                      lessThanLimit.endPoint,
                      lessThanLimit.isInclusive))

              } else if (compare == 0 && greaterThanLimit.isInclusive && lessThanLimit.isInclusive) {
                List(PropertyIndexQuery.exact(propertyId, lessThanLimit.endPoint))
              } else {
                Nil
              }
          }
        }

      case PointDistanceSeekRangeExpression(range) =>
        val valueRange = range.map(expr => makeValueNeoSafe(expr(row, state)))
        (valueRange.distance, valueRange.point) match {
          case (distance: NumberValue, point: PointValue) =>
            val bboxes = point.getCoordinateReferenceSystem.getCalculator.boundingBox(point, distance.doubleValue()).asScala
            // The geographic calculator pads the range to avoid numerical errors, which means we rely more on post-filtering
            // This also means we can fix the date-line '<' case by simply being inclusive in the index seek, and again rely on post-filtering
            val inclusive = if (bboxes.length > 1) true else range.inclusive
            bboxes.map(bbox => PropertyIndexQuery.range(propertyId,
              bbox.first(),
              inclusive,
              bbox.other(),
              inclusive
            ))
          case _ => Nil
        }

      case PointBoundingBoxSeekRangeExpression(range) =>
        val valueRange = range.map(expr => makeValueNeoSafe(expr(row, state)))
        (valueRange.lowerLeft, valueRange.upperRight) match {
          case (lowerLeft: PointValue, upperRight: PointValue) if lowerLeft.getCoordinateReferenceSystem.equals(upperRight.getCoordinateReferenceSystem) =>
            val calculator = lowerLeft.getCoordinateReferenceSystem.getCalculator

            val bboxes = calculator.computeBBoxes(lowerLeft, upperRight).asScala
            bboxes.map(bbox => PropertyIndexQuery.range(propertyId,
              bbox.first(),
              true,
              bbox.other(),
              true
            ))
          case _ => Nil
        }
    }
  }

  protected def computeExactQueries(state: QueryState, row: ReadableRow): Seq[Seq[PropertyIndexQuery.ExactPredicate]] =
    valueExpr match {
      // Index exact value seek on single value
      case SingleQueryExpression(expr) =>
        val seekValue = makeValueNeoSafe(expr(row, state))
        Array(List(PropertyIndexQuery.exact(propertyIds.head, seekValue)))

      // Index exact value seek on multiple values, by combining the results of multiple index seeks
      case ManyQueryExpression(expr) =>
        expr(row, state) match {
          case IsList(coll) =>
            coll.asArray().toSet[AnyValue].map(
              seekAnyValue =>
                List(PropertyIndexQuery.exact(
                  propertyIds.head,
                  makeValueNeoSafe(seekAnyValue)
                ))
            ).toSeq

          case v if v eq Values.NO_VALUE => Array[Seq[PropertyIndexQuery.ExactPredicate]]()
          case other => throw new CypherTypeException(s"Expected list, got $other")
        }

      // Index exact value seek on multiple values, making use of a composite index over all values
      //    eg:   x in [1] AND y in ["a", "b"] AND z in [3.0]
      // Should only get here from LockingUniqueIndexSeek
      case CompositeQueryExpression(exprs) =>
        checkOnlyWhenAssertionsAreEnabled(exprs.lengthCompare(propertyIds.length) == 0)

        // indexQueries = [[1], ["a", "b"], [3.0]]
        val indexQueries: Seq[Seq[PropertyIndexQuery.ExactPredicate]] = exprs.zip(propertyIds).map {
          case (expr, propId) =>
            computeCompositeQueries(state, row)(expr, propId).flatMap {
              case e: PropertyIndexQuery.ExactPredicate => Some(e)
              case _ => throw new InternalException("Expected only exact for LockingUniqueIndexSeek")
            }
        }

        // combined = [[1, "a", 3.0], [1, "b", 3.0]]
        combine(indexQueries)
    }

  private def computeCompositeQueries(state: QueryState, row: ReadableRow)(queryExpression: QueryExpression[Expression], propertyId: Int): Seq[PropertyIndexQuery] =
    queryExpression match {
      case SingleQueryExpression(inner) =>
        Seq(PropertyIndexQuery.exact(propertyId, makeValueNeoSafe(inner(row, state))))

      case ManyQueryExpression(inner) =>
        val expr: Seq[AnyValue] = inner(row, state) match {
          case IsList(coll) => coll.asArray()
          case null => Seq.empty
          case _ => throw new CypherTypeException(s"Expected the value for $inner to be a collection but it was not.")
        }
        expr.map(e => PropertyIndexQuery.exact(propertyId, makeValueNeoSafe(e)))

      case CompositeQueryExpression(_) =>
        throw new InternalException("A CompositeQueryExpression can't be nested in a CompositeQueryExpression")

      case RangeQueryExpression(rangeWrapper) =>
        computeRangeQueries(state, row, rangeWrapper, propertyId)

      case ExistenceQueryExpression() =>
        Seq(PropertyIndexQuery.exists(propertyId))
    }
}
