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
package org.neo4j.cypher.internal.ir.ordering

import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.ir.ordering.ColumnOrder.Asc
import org.neo4j.cypher.internal.ir.ordering.ColumnOrder.Desc
import org.neo4j.cypher.internal.ir.ordering.ProvidedOrder.OrderOrigin
import org.neo4j.cypher.internal.util.NonEmptyList

object ProvidedOrder {

  /**
   * The origin of a provided order.
   * If a plan introduced the ordering itself: [[Self]].
   * If it kept or modified a provided order from the left or right, [[Left]] or [[Right]].
   */
  sealed trait OrderOrigin
  final case object Self extends OrderOrigin
  final case object Left extends OrderOrigin
  final case object Right extends OrderOrigin
  final case object Both extends OrderOrigin

  def apply(columns: Seq[ColumnOrder], orderOrigin: OrderOrigin): ProvidedOrder = {
    if (columns.isEmpty) NoProvidedOrder
    else NonEmptyProvidedOrder(NonEmptyList.from(columns), orderOrigin)
  }

  def unapply(arg: ProvidedOrder): Option[Seq[ColumnOrder]] = arg match {
    case NoProvidedOrder => Some(Seq.empty)
    case NonEmptyProvidedOrder(allColumns, _) => Some(allColumns.toIndexedSeq)
  }

  val empty: ProvidedOrder = NoProvidedOrder

  def asc(expression: Expression, projections: Map[String, Expression] = Map.empty): NonEmptyProvidedOrder = NonEmptyProvidedOrder(NonEmptyList(Asc(expression, projections)), Self)
  def desc(expression: Expression, projections: Map[String, Expression] = Map.empty): NonEmptyProvidedOrder = NonEmptyProvidedOrder(NonEmptyList(Desc(expression, projections)), Self)
}

sealed trait ProvidedOrderFactory {
  def providedOrder(columns: Seq[ColumnOrder], orderOrigin: OrderOrigin): ProvidedOrder
  def asc(expression: Expression, projections: Map[String, Expression] = Map.empty): ProvidedOrder
  def desc(expression: Expression, projections: Map[String, Expression] = Map.empty): ProvidedOrder
}

case object DefaultProvidedOrderFactory extends ProvidedOrderFactory {
  override def providedOrder(columns: Seq[ColumnOrder], orderOrigin: OrderOrigin): ProvidedOrder =
    ProvidedOrder.apply(columns, orderOrigin)

  override def asc(expression: Expression, projections: Map[String, Expression] = Map.empty): NonEmptyProvidedOrder =
    ProvidedOrder.asc(expression, projections)

  override def desc(expression: Expression, projections: Map[String, Expression] = Map.empty): NonEmptyProvidedOrder =
    ProvidedOrder.desc(expression, projections)
}

case object NoProvidedOrderFactory extends ProvidedOrderFactory {
  override def providedOrder(columns: Seq[ColumnOrder], orderOrigin: OrderOrigin): ProvidedOrder = ProvidedOrder.empty
  override def asc(expression: Expression, projections: Map[String, Expression] = Map.empty): ProvidedOrder = ProvidedOrder.empty
  override def desc(expression: Expression, projections: Map[String, Expression] = Map.empty): ProvidedOrder = ProvidedOrder.empty
}

/**
 * A LogicalPlan can guarantee to provide its results in a particular order. This trait
 * is used for the purpose of conveying the information of which order the results are in,
 * if they are in any defined order.
 */
sealed trait ProvidedOrder {
  /**
   * @return sequence of columns with sort direction
   */
  def columns: Seq[ColumnOrder]

  /**
   * @return whether this ProvidedOrder is empty
   */
  def isEmpty: Boolean

  /**
   * @return the origin of the order, or None, if this is empty.
   */
  def orderOrigin: Option[OrderOrigin]

  /**
   * Returns a new provided order where the order columns of this are concatenated with
   * the order columns of the other provided order. Example:
   * [n.foo ASC, n.bar DESC].followedBy([n.baz ASC]) = [n.foo ASC, n.bar DESC, n.baz ASC]
   *
   * If this is empty, then the returned provided order will also be empty, regardless of the
   * given nextOrder.
   */
  def followedBy(nextOrder: ProvidedOrder): ProvidedOrder

  /**
   * Trim provided order up until a sort column that matches any of the given args.
   */
  def upToExcluding(args: Set[String]): ProvidedOrder

  /**
   * Returns the common prefix between this and another provided order.
   */
  def commonPrefixWith(otherOrder: ProvidedOrder): ProvidedOrder

  /**
   * Map the columns with some mapping function
   */
  def mapColumns(f: ColumnOrder => ColumnOrder): ProvidedOrder

  /**
   * The same order columns, but with OrderOrigin = [[Left]]
   */
  def fromLeft: ProvidedOrder

  /**
   * The same order columns, but with OrderOrigin = [[Right]]
   */
  def fromRight: ProvidedOrder

  /**
   * The same order columns, but with OrderOrigin = [[Both]]
   */
  def fromBoth: ProvidedOrder
}

case object NoProvidedOrder extends ProvidedOrder {
  override def columns: Seq[ColumnOrder] = Seq.empty
  override def isEmpty: Boolean = true
  override def orderOrigin: Option[OrderOrigin] = None
  override def followedBy(nextOrder: ProvidedOrder): ProvidedOrder = this
  override def upToExcluding(args: Set[String]): ProvidedOrder = this
  override def commonPrefixWith(otherOrder: ProvidedOrder): ProvidedOrder = this
  override def mapColumns(f: ColumnOrder => ColumnOrder): ProvidedOrder = this
  override def fromLeft: ProvidedOrder = this
  override def fromRight: ProvidedOrder = this
  override def fromBoth: ProvidedOrder = this
}

case class NonEmptyProvidedOrder(allColumns: NonEmptyList[ColumnOrder], theOrderOrigin: OrderOrigin) extends ProvidedOrder {

  override def columns: Seq[ColumnOrder] = allColumns.toIndexedSeq

  override def isEmpty: Boolean = false

  override def orderOrigin: Option[OrderOrigin] = Some(theOrderOrigin)

  def asc(expression: Expression, projections: Map[String, Expression] = Map.empty): NonEmptyProvidedOrder = NonEmptyProvidedOrder(allColumns :+ Asc(expression, projections), theOrderOrigin)
  def desc(expression: Expression, projections: Map[String, Expression] = Map.empty): NonEmptyProvidedOrder = NonEmptyProvidedOrder(allColumns :+ Desc(expression, projections), theOrderOrigin)

  override def fromLeft: NonEmptyProvidedOrder = copy(theOrderOrigin = ProvidedOrder.Left)
  override def fromRight: NonEmptyProvidedOrder = copy(theOrderOrigin = ProvidedOrder.Right)
  override def fromBoth: ProvidedOrder = copy(theOrderOrigin = ProvidedOrder.Both)

  override def mapColumns(f: ColumnOrder => ColumnOrder): NonEmptyProvidedOrder = copy(allColumns = allColumns.map(f))

  override def followedBy(nextOrder: ProvidedOrder): NonEmptyProvidedOrder = {
    NonEmptyProvidedOrder(allColumns :++ nextOrder.columns, theOrderOrigin)
  }

  override def upToExcluding(args: Set[String]): ProvidedOrder = {
    val (_, trimmed) = columns.foldLeft((false,Seq.empty[ColumnOrder])) {
      case (acc, _) if acc._1 => acc
      case (acc, col) if args.intersect(col.dependencies.map(_.name)).nonEmpty => (true, acc._2)
      case (acc, col) => (acc._1, acc._2 :+ col)
    }
    if (trimmed.isEmpty) {
      NoProvidedOrder
    } else {
      NonEmptyProvidedOrder(NonEmptyList.from(trimmed), theOrderOrigin)
    }
  }

  override def commonPrefixWith(otherOrder: ProvidedOrder): ProvidedOrder = otherOrder match {
    case NoProvidedOrder => NoProvidedOrder
    case other:NonEmptyProvidedOrder =>
      val newColumns = columns.zip(other.columns).takeWhile { case (a, b) => a == b }.map(_._1)
      if (newColumns.isEmpty) NoProvidedOrder else copy(allColumns = NonEmptyList.from(newColumns))
  }
}
