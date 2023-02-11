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
package org.neo4j.cypher.internal.compiler.planner.logical.steps

import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.ir.ordering.ColumnOrder.Asc
import org.neo4j.cypher.internal.ir.ordering.ColumnOrder.Desc
import org.neo4j.cypher.internal.ir.ordering.ProvidedOrder

object leverageOrder {

  final case class OrderToLeverageWithAliases(orderToLeverage: Seq[Expression], groupingExpressionsMap: Map[String, Expression])

  /**
   * Given the order of a plan, some grouping expressions, and available symbols, return the prefix
   * of the provided order that is part of the grouping expressions.
   *
   * @param inputProvidedOrder     the provided order of the current plan
   * @param groupingExpressionsMap a Map of projected name to grouping expression
   * @param availableSymbols       the available symbols of the current plan
   * @return a tuple of A) the prefix of the provided order that is part of the grouping expressions
   *         and B) the grouping expressions map rewritten to use variables that are already available symbols
   */
  def apply(inputProvidedOrder: ProvidedOrder,
            groupingExpressionsMap: Map[String, Expression],
            availableSymbols: Set[String]): OrderToLeverageWithAliases = {
    // Collect aliases for all grouping expressions which project a variable that is already an available symbol
    val aliasMap: Map[Expression, Variable] = groupingExpressionsMap.collect {
      case (k, expr) if availableSymbols.contains(k) => (expr, Variable(k)(expr.position))
    }

    // When we can read variables instead of expressions in distinct, we should do that.
    // The new grouping expressions map contains aliases as values, where available.
    val newGroupingExpressionsMap = groupingExpressionsMap.map {
      case (k, expr) => (k, aliasMap.getOrElse(expr, expr))
    }

    val orderToLeverage = {
      // To find out if there are order columns of which we can leverage the order, we have to use the same aliases in the provided order.
      val aliasedInputProvidedOrder = inputProvidedOrder.mapColumns {
        case c@Asc(expression, _) => c.copy(aliasMap.getOrElse(expression, expression))
        case c@Desc(expression, _) => c.copy(aliasMap.getOrElse(expression, expression))
      }

      providedOrderPrefix(aliasedInputProvidedOrder, newGroupingExpressionsMap.values.toSet)
    }

    OrderToLeverageWithAliases(orderToLeverage, newGroupingExpressionsMap)
  }

  private def providedOrderPrefix(inputProvidedOrder: ProvidedOrder, groupingExpressions: Set[Expression]): Seq[Expression] = {
    // We use the instances of expressions from the groupingExpressions (instead of the instance of expressions from the ProvidedOrder).
    // This is important because some rewriters will rewrite expressions based on reference equality
    // and we need to make sure that orderToLeverage expressions are equal to grouping expressions, even after those rewriters.
    inputProvidedOrder.columns.map(_.expression)
      .map { exp =>
        groupingExpressions.find(_ == exp)
      }
      .takeWhile(_.isDefined)
      .flatten
  }
}
