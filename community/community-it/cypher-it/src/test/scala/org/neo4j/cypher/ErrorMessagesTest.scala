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
package org.neo4j.cypher

import org.hamcrest.CoreMatchers.containsString
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.neo4j.cypher.internal.util.helpers.StringHelper.RichString
import org.neo4j.exceptions.Neo4jException
import org.neo4j.exceptions.SyntaxException

import java.util.Optional

class ErrorMessagesTest extends ExecutionEngineFunSuite {

  // pure syntax errors -- not sure if TCK material?

  test("foo") {
    execute("RETURN 42")
  }

  test("noReturnColumns") {
    expectError(
      "match (s) where id(s) = 0 return",
      "Invalid input '': expected \"*\", \"DISTINCT\" or an expression (line 1, column 33 (offset: 32))"
    )
  }

  test("bad node variable") {
    expectSyntaxError(
      "match (a) where id(a) = 0 match (a)-[WORKED_ON]-, return a",
      "Invalid input ',': expected ",
      48
    )
  }

  test("badStart") {
    //temporary fallback to parboiled parser since error message includes java cc Parsing.FALLBACK_TRIGGERS removed
    expectSyntaxError(
      "starta = node(0) return a",
      "Invalid input 'a'",
      5
    )
  }

  test("should consider extra offset in syntax error messages when there are pre-parsing options") {
    expectSyntaxError("PROFILE XX", "", 8)
  }

  test("should consider extra offset in semantic error messages when there are pre-parsing options") {
    expectSyntaxError(
      "explain match (a) where id(a) = 0 return dontDoIt(a)",
      "Unknown function 'dontDoIt' (line 1, column 42 (offset: 41))",
      41
    )
  }

  test("should consider extra offset in semantic error messages when there are pre-parsing options - multiline") {
    expectSyntaxError(
      """explain
        |match (a) where id(a) = 0 return dontDoIt(a)""".stripMargin,
      "Unknown function 'dontDoIt' (line 2, column 34 (offset: 41))",
      41
    )
  }

  test("should consider extra offset in semantic error messages when there are pre-parsing options - multiline 2") {
    expectSyntaxError(
      """explain match (a) where id(a) = 0
        |return dontDoIt(a)""".stripMargin,
      "Unknown function 'dontDoIt' (line 2, column 8 (offset: 41))",
      41
    )
  }

  test("noSuchProcedure") {
    expectError(
      "CALL no.such.procedure YIELD foo RETURN foo",
      "There is no procedure with the name `no.such.procedure` registered for this database instance. " +
        "Please ensure you've spelled the procedure name correctly and that the procedure is properly deployed."
    )
  }

  test("noSuchProcedure - standalone") {
    expectError(
      "CALL no.such.procedure",
      "There is no procedure with the name `no.such.procedure` registered for this database instance. " +
      "Please ensure you've spelled the procedure name correctly and that the procedure is properly deployed."
    )
  }

  test("badMatch2") {
    expectSyntaxError(
      "match (p) where id(p) = 2 match (p)-[:IS_A]>dude return dude.name",
      "Invalid input '>'",
      43
    )
  }

  test("badMatch3") {
    expectSyntaxError(
      "match (p) where id(p) = 2 match (p)-[:IS_A->dude return dude.name",
      "Invalid input '-'",
      42
    )
  }

  test("badMatch4") {
    expectSyntaxError(
      "match (p) where id(p) = 2 match (p)-[!]->dude return dude.name",
      "Invalid input '!'",
      37
    )
  }

  test("badMatch5") {
    expectSyntaxError(
      "match (p) where id(p) = 2 match (p)[:likes]->dude return dude.name",
      "Invalid input '['",
      35
    )
  }

  test("invalidLabel") {
    expectError(
      "match (p) where id(p) = 2 match (p:super-man) return p.name",
      "Invalid input"
    )
  }

  test("fail when using exclamation mark") {
    expectError(
      "match (n) where id(n) = 0 and n.foo != 2 return n",
      "Unknown operation '!=' (you probably meant to use '<>', which is the operator for inequality testing) (line 1, column 37 (offset: 36))"
    )
  }

  test("trying to drop constraint index should return sensible error") {
    graph.createUniqueConstraint("LabelName", "Prop")

    expectError(
      "DROP INDEX ON :LabelName(Prop)",
      "Unable to drop index: Index belongs to constraint: (:LabelName {Prop})"
    )
  }

  test("trying to drop non existent index") {
    expectError(
      "DROP INDEX ON :Person(name)",
      "Unable to drop index on (:Person {name}). There is no such index."
    )
  }

  test("trying to add unique constraint when duplicates exist") {
    val node1 = createLabeledNode(Map("name" -> "A"), "Person").getId
    val node2 = createLabeledNode(Map("name" -> "A"), "Person").getId

    expectError(
      "CREATE CONSTRAINT FOR (person:Person) REQUIRE person.name IS UNIQUE",
      String.format("Unable to create Constraint( name='constraint_550b2518', type='UNIQUENESS', schema=(:Person {name}) ):%n" +
        "Both Node(" + node1 + ") and Node(" + node2 + ") have the label `Person` and property `name` = 'A'")
    )
  }

  test("drop a non existent constraint") {
    expectError(
      "DROP CONSTRAINT ON (person:Person) ASSERT person.name IS UNIQUE",
      "No such constraint"
    )
  }

  test("report wrong usage of index hint") {
    graph.createUniqueConstraint("Person", "id")
    expectError(
      "MATCH (n:Person) USING INDEX n:Person(id) WHERE n.name = 'Andres' RETURN n",
      "Cannot use index hint in this context. Index hints are only supported for the following predicates in WHERE (either directly or as part of a top-level AND or OR): equality comparison, inequality (range) comparison, STARTS WITH, IN condition or checking property existence. The comparison cannot be performed between two property values. Note that the label/relationship type and property comparison must be specified on a non-optional node/relationship. (line 1, column 18 (offset: 17))"
    )
  }

  test("should forbid bound relationship list in shortestPath pattern parts") {
    expectError(
      "WITH [] AS r LIMIT 1 MATCH p = shortestPath((src)-[r*]->(dst)) RETURN src, dst",
      "Bound relationships not allowed in shortestPath(...)"
    )
  }

  test("should give nice error when trying to parse multiple statements") {
    expectError(
      "RETURN 42; RETURN 42",
      "Expected exactly one statement per query but got: 2")
  }

  test("should give proper error message when trying to use Node Key constraint on community") {
    expectError("CREATE CONSTRAINT FOR (n:Person) REQUIRE (n.firstname) IS NODE KEY",
                String.format("Unable to create Constraint( type='NODE PROPERTY EXISTENCE', schema=(:Person {firstname}) ):%n" +
                  "Node Key constraint requires ONgDB Enterprise Edition"))
  }

  test("trying to store mixed type array") {
    expectError("CREATE (a) SET a.value = [datetime(), time()] RETURN a.value",
      "Neo4j only supports a subset of Cypher types for storage as singleton or array properties. " +
        "Please refer to section cypher/syntax/values of the manual for more details."
    )
  }

  test("should render caret correctly in parser errors for queries without prefix") {
    testSyntaxErrorWithCaret(
      "Invalid input '1",
      "MATCH 123",
      "      ^")
  }

  test("should render caret correctly in parser errors for queries with prefix") {
    testSyntaxErrorWithCaret(
      "Invalid input '1",
      "EXPLAIN MATCH 123",
      "              ^")
  }

  test("should render caret correctly in planner errors for queries without prefix") {
    testSyntaxErrorWithCaret(
      "Type mismatch: expected Integer but was String (line 1, column 22 (offset: 21))",
      "CALL db.awaitIndexes('wrong')",
      "                     ^")
  }

  test("should render caret correctly in planner errors for queries with prefix") {
    testSyntaxErrorWithCaret(
      "Type mismatch: expected Integer but was String (line 1, column 30 (offset: 29))",
      "EXPLAIN CALL db.awaitIndexes('wrong')",
      "                             ^")
  }

  private def expectError(query: String, expectedError: String) {
    val error = intercept[Neo4jException](executeQuery(query))
    assertThat(error.getMessage, containsString(expectedError))
  }

  private def expectSyntaxError(query: String, expectedError: String, expectedOffset: Int) {
    val error = intercept[SyntaxException](executeQuery(query))
    assertThat(error.getMessage, containsString(expectedError))
    assertThat(error.getOffset, equalTo(Optional.of(expectedOffset.asInstanceOf[java.lang.Integer])))
  }

  private def testSyntaxErrorWithCaret(expectedError: String, query: String, expectedCaret: String) {
    val error = intercept[SyntaxException](executeQuery(query))
    val expected = String.format("\"%s\"\n %s", query, expectedCaret)
    val got = error.getMessage.linesIterator
    got.next() should startWith(expectedError)
    got.mkString("\n") should equal(expected)
  }

  private def executeQuery(query: String) {
    execute(query.fixNewLines).toList
  }
}
