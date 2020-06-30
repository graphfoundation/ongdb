/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.cypher.internal.compiled_runtime

import org.neo4j.cypher.ExecutionEngineFunSuite
import org.neo4j.cypher.internal.RewindableExecutionResult

class TypeConversionTest extends ExecutionEngineFunSuite {
  test("should not allow adding node and number") {
    val x = createNode()
    val failure = intercept[CypherTypeException] {
      val result = execute("debug=generate_java_source debug=show_java_source profile match (n) return n + {x} as res", "x" -> 5)
      // should not get here, if we do, this is for debugging:
      println(result.executionPlanDescription())
    }

    failure.getMessage should equal("Cannot add `NodeReference` and `Integer`")
  }

  test("shouldHandlePatternMatchingWithParameters") {
    val x = createNode()

    val result = execute("match (x) where x = {startNode} return x", "startNode" -> x)

    result.toList should equal(List(Map("x" -> x)))
  }

  override def execute(q: String, params: (String, Any)*): RewindableExecutionResult =
    super.execute(s"cypher runtime=compiled $q", params: _*)
}
