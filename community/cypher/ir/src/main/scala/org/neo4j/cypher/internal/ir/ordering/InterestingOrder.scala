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
import org.neo4j.cypher.internal.expressions.Property
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.ir.ordering.ColumnOrder.Asc
import org.neo4j.cypher.internal.ir.ordering.ColumnOrder.Desc
import org.neo4j.cypher.internal.ir.ordering.ColumnOrder.projectExpression
import org.neo4j.cypher.internal.ir.ordering.InterestingOrder.FullSatisfaction
import org.neo4j.cypher.internal.ir.ordering.InterestingOrder.Satisfaction

import scala.annotation.tailrec

object InterestingOrder {

  /**
   * An [[InterestingOrder]] can be fully, partially, or not all all satisfied by a [[ProvidedOrder]].
   * This class specifies the satisfied prefix of columns and the missing suffix of columns.
   */
  case class Satisfaction(satisfiedPrefix: Seq[ColumnOrder], missingSuffix: Seq[ColumnOrder]){
    def withSatisfied(columnOrder: ColumnOrder): Satisfaction = this.copy(satisfiedPrefix :+ columnOrder, missingSuffix)
    def withMissing(columnOrder: ColumnOrder): Satisfaction = this.copy(satisfiedPrefix, missingSuffix :+ columnOrder)
  }

  object FullSatisfaction {
    def unapply(s: Satisfaction): Boolean = s.missingSuffix.isEmpty
  }

  object NoSatisfaction {
    def unapply(s: Satisfaction): Boolean = s.satisfiedPrefix.isEmpty && s.missingSuffix.nonEmpty
  }

  val empty: InterestingOrder = InterestingOrder(RequiredOrderCandidate.empty, Seq.empty)

  def required(candidate: RequiredOrderCandidate): InterestingOrder = InterestingOrder(candidate, Seq.empty)

  def interested(candidate: InterestingOrderCandidate): InterestingOrder = InterestingOrder(RequiredOrderCandidate.empty, Seq(candidate))
}

/**
 * A single PlannerQuery can require an ordering on its results. This ordering can emerge
 * from an ORDER BY, or even from distinct or aggregation. The requirement on the ordering can
 * be strict (it needs to be ordered for correct results) or weak (ordering will allow for optimizations).
 * A weak requirement might in addition not care about column order and sort direction.
 *
 * @param requiredOrderCandidate     a candidate for required sort directions of columns
 * @param interestingOrderCandidates a sequence of candidates for interesting sort directions of columns
 */
case class InterestingOrder(requiredOrderCandidate: RequiredOrderCandidate,
                            interestingOrderCandidates: Seq[InterestingOrderCandidate] = Seq.empty) {

  val isEmpty: Boolean = requiredOrderCandidate.isEmpty && interestingOrderCandidates.forall(_.isEmpty)

  // TODO maybe merge some candidates
  def interesting(candidate: InterestingOrderCandidate): InterestingOrder = InterestingOrder(requiredOrderCandidate, interestingOrderCandidates :+ candidate)

  // TODO maybe merge some candidates
  def asInteresting: InterestingOrder =
    if (requiredOrderCandidate.isEmpty) this
    else InterestingOrder(RequiredOrderCandidate.empty,
      interestingOrderCandidates :+ requiredOrderCandidate.asInteresting)

  def withReverseProjectedColumns(projectExpressions: Map[String, Expression], argumentIds: Set[String]): InterestingOrder = {
    def columnIfArgument(expression: Expression, column: ColumnOrder): Option[ColumnOrder] = {
      expression match {
        case Property(Variable(varName), _) if argumentIds.contains(varName) => Some(column)
        case Variable(varName) if argumentIds.contains(varName) => Some(column)
        case _ => None
      }
    }

    def projectedColumnOrder(column: ColumnOrder, projected: Expression, name: String) = {
      column match {
        case _: Asc => Some(Asc(projected, Map(name -> projectExpressions(name))))
        case _: Desc => Some(Desc(projected, Map(name -> projectExpressions(name))))
      }
    }

    def renameColumn(column: ColumnOrder): Option[ColumnOrder] = {
      // expression with all incoming projections applied
      val projected = projectExpression(column.expression, column.projections)
      projected match {
        case Property(Variable(prevVarName), _) if projectExpressions.contains(prevVarName) => projectedColumnOrder(column, projected, prevVarName)
        case Variable(prevVarName) if projectExpressions.contains(prevVarName) => projectedColumnOrder(column, projected, prevVarName)
        case _ =>
          columnIfArgument(projected, column)
      }
    }

    def renamePrefix(columns: Seq[ColumnOrder]): Seq[ColumnOrder] =
      columns.map(renameColumn).takeWhile(_.isDefined).flatten

    InterestingOrder(requiredOrderCandidate.renameColumns(renamePrefix),
      interestingOrderCandidates.map(_.renameColumns(renamePrefix)).filter(!_.isEmpty))
  }

  /**
   * Checks if a RequiredOrder is satisfied by a ProvidedOrder
   */
  def satisfiedBy(providedOrder: ProvidedOrder): Satisfaction = {
    @tailrec
    def satisfied(providedOrder: Expression, requiredOrder: Expression, projections: Map[String, Expression]): Boolean = {
      val projected = projectExpression(requiredOrder, projections)
      if (providedOrder == requiredOrder || providedOrder == projected) {
        true
      } else if (projected != requiredOrder) {
        satisfied(providedOrder, projected, projections)
      } else {
        false
      }
    }
    requiredOrderCandidate.order.zipAll(providedOrder.columns, null, null).foldLeft(Satisfaction(Seq.empty, Seq.empty)){
      case (s, (null, _)) => s // no required order left
      case (s@FullSatisfaction(), (satisfiedColumn@Asc(requiredExp, projections), Asc(providedExpr, _))) if satisfied(providedExpr, requiredExp, projections)  => s.withSatisfied(satisfiedColumn)
      case (s@FullSatisfaction(), (satisfiedColumn@Desc(requiredExp, projections), Desc(providedExpr, _))) if satisfied(providedExpr, requiredExp, projections) => s.withSatisfied(satisfiedColumn)
      case (s, (unsatisfiedColumn, _)) => s.withMissing(unsatisfiedColumn) // required order left but no provided or provided not matching or previous column not matching
    }
  }
}
