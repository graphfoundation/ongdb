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
package org.neo4j.cypher.internal.parser

import org.neo4j.cypher.internal.ast.factory.neo4j.JavaCCParser
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class JavaCCParserFallbackTest extends CypherFunSuite {

  test("should fall back") {
    Seq(
      // Not (yet) supported commands
      "SHOW PRIVILEGES",
      "SHOW USER username PRIVILEGES",
      "SHOW ROLE foo PRIVILEGE",
      "SHOW PRIVILEGES AS COMMANDS",
      "GRANT EXECUTE FUNCTION * ON DBMS TO role",
      "DENY EXECUTE BOOSTED PROCEDURE apoc.match ON DBMS TO role",
      "START n=node:people(name = 'neo') RETURN n",

      // Supported commands containing fallback keywords
      "MATCH (n) RETURN n // EXECUTE",
      "MATCH (n) RETURN n.Id as privilege",
      "MATCH (n:Label) WHERE n.cypher = 'SHOW PRIVILEGES' and n.access = 'DENY' RETURN n",
      "RETURN 42 AS start"
    ).foreach(t => {
      withClue(t) { JavaCCParser.shouldFallback(t) shouldBe true }
    })
  }

  test("should not fall back") {
    Seq(
      "MATCH (n) RETURN n",
      "CREATE (n:Label)",
      "CREATE INDEX people FOR (n:Person) ON n.name",
      "DROP CONSTRAINT constr IF EXISTS",
      "SHOW DATABASE foo",
      "CREATE USER username SET PASSWORD 'secret'",
      "SHOW ROLES",
      "GRANT ACCESS ON DATABASE foo TO role"
    ).foreach(t => {
      withClue(t) { JavaCCParser.shouldFallback(t) shouldBe false }
    })
  }

}
