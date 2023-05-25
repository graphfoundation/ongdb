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
package org.neo4j.cypher.internal.runtime.interpreted.commands.showcommands

import org.neo4j.configuration.helpers.DatabaseNameValidator.MAXIMUM_DATABASE_NAME_LENGTH
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException

class TransactionCommandHelperTest extends CypherFunSuite {

  test("prints transaction ids") {
    TransactionId("ongdb", 12L).toString shouldBe "ongdb-transaction-12"
  }

  test("does not print negative transaction ids") {
    assertThrows[InvalidArgumentsException]( TransactionId("ongdb", -15L))
  }

  test("parses transaction ids") {
    TransactionId.parse("ongdb-transaction-14") shouldBe TransactionId("ongdb", 14L)
  }

  test("does not parse negative transaction ids") {
    assertThrows[InvalidArgumentsException]( TransactionId.parse("ongdb-transaction--12"))
  }

  test("does not parse wrong separator") {
    assertThrows[InvalidArgumentsException]( TransactionId.parse("ongdb-transactioo-12"))
  }

  test("does not parse random text") {
    assertThrows[InvalidArgumentsException]( TransactionId.parse("blarglbarf"))
  }

  test("does not parse trailing random text") {
    assertThrows[InvalidArgumentsException]( TransactionId.parse("ongdb-transaction-12  "))
  }

  test("does not parse empty text") {
    assertThrows[InvalidArgumentsException]( TransactionId.parse(""))
  }

  test("validate and normalise database name") {
    TransactionId.parse("ONGDB-transaction-14") shouldBe TransactionId("ongdb", 14L)
    val e = the[InvalidArgumentsException] thrownBy TransactionId.parse("a".repeat(MAXIMUM_DATABASE_NAME_LENGTH + 1) + "-transaction-14")
    e.getMessage should include(" must have a length between ")
  }

  test("prints query ids") {
    QueryId(12L).toString shouldBe "query-12"
  }

  test("does not print negative query ids") {
    assertThrows[InvalidArgumentsException](QueryId(-15L))
  }
}
