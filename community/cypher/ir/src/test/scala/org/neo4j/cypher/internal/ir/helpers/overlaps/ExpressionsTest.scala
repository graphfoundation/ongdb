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
package org.neo4j.cypher.internal.ir.helpers.overlaps

import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.expressions.Expression
import org.scalatest.FunSuite
import org.scalatest.Matchers
import org.scalatest.OptionValues

class ExpressionsTest extends FunSuite with Matchers with AstConstructionTestSupport with OptionValues {

  test("recursively split an expression into a list of conjoint expressions") {
    val a = varFor("a")
    val b = varFor("b")
    val c = varFor("c")
    val d = varFor("d")
    val e = varFor("e")
    val aOrB = or(a, b)
    val notE = not(e)

    Expressions.splitExpression(ands(aOrB, c, and(d, notE))) shouldEqual List(aOrB, c, d, notE)
  }

  test("extract property from In expression") {
    val itemQuantity = prop("item", "quantity")
    val inExpression = in(itemQuantity, listOf(literalInt(42), literalInt(10)))

    Expressions.extractPropertyExpression(inExpression) shouldEqual Some(itemQuantity.propertyKey)
  }

  test("extract property from IsNotNull expression") {
    val itemQuantity = prop("item", "quantity")
    val isNotNullExpression = isNotNull(itemQuantity)

    Expressions.extractPropertyExpression(isNotNullExpression) shouldEqual Some(itemQuantity.propertyKey)
  }

  test("reject compound property expression") {
    val itemQuantity = prop("item", "quantity")
    val expression =
      and(
        in(itemQuantity, listOf(literalInt(42))),
        or(
          in(itemQuantity, listOf(literalInt(10))),
          isNotNull(prop("item", "offer"))
        )
      )

    Expressions.extractPropertyExpression(expression) shouldEqual None
  }

  test("extract single label expression") {
    expectLabelExpression(hasLabels("item", "Item"), LabelExpression.label("Item"))
  }

  test("extract not label expression") {
    expectLabelExpression(not(hasLabels("item", "Item")), LabelExpression.label("Item").not)
  }

  test("extract and label expression") {
    expectLabelExpression(
      and(hasLabels("item", "Item"), hasLabels("item", "InStock")),
      LabelExpression.label("Item").and(LabelExpression.label("InStock"))
    )
  }

  test("extract ands label expression") {
    expectLabelExpression(
      ands(hasLabels("item", "Item"), hasLabels("item", "InStock"), not(hasLabels("item", "Deleted"))),
      LabelExpression.label("Item")
        .and(LabelExpression.label("InStock"))
        .and(LabelExpression.label("Deleted").not)
    )
  }

  test("extract or label expression") {
    expectLabelExpression(
      or(hasLabels("item", "Item"), hasLabels("item", "InStock")),
      LabelExpression.label("Item").or(LabelExpression.label("InStock"))
    )
  }

  test("extract ors label expression") {
    expectLabelExpression(
      ors(hasLabels("item", "Item"), hasLabels("item", "InStock"), not(hasLabels("item", "Deleted"))),
      LabelExpression.label("Item")
        .or(LabelExpression.label("InStock"))
        .or(LabelExpression.label("Deleted").not)
    )
  }

  test("extract xor label expression") {
    expectLabelExpression(
      xor(hasLabels("item", "Item"), hasLabels("item", "InStock")),
      LabelExpression.label("Item").xor(LabelExpression.label("InStock"))
    )
  }

  test("reject compound label expression") {
    val expression =
      and(
        hasLabels("item", "Item"),
        or(
          not(hasLabels("item", "Deleted")),
          isNotNull(prop("item", "quantity"))
        )
      )

    Expressions.extractLabelExpression(expression) shouldBe empty
  }

  def expectLabelExpression(expression: Expression, expected: LabelExpression): Unit = {
    val labelExpression = Expressions.extractLabelExpression(expression).value
    labelExpression.allLabels shouldEqual expected.allLabels
    labelExpression.solutions shouldEqual expected.solutions
  }
}
