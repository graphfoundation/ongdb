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
package cypher.features

class TestConfig(
                  val denylist: Option[String],
                  val executionPrefix: String,
                  val experimental: Boolean = false
)

case object DefaultTestConfig extends TestConfig(Some("default.txt"),"")

case object SlottedTestConfig extends TestConfig(Some("slotted.txt"),"CYPHER planner=cost runtime=slotted")

case object SlottedWithCompiledExpressionsTestConfig extends TestConfig(Some("slotted.txt"),"CYPHER planner=cost runtime=slotted expressionEngine=COMPILED")

case object PipelinedTestConfig extends TestConfig(Some("pipelined-single-threaded.txt"), "CYPHER planner=cost runtime=pipelined")

case object ParallelTestConfig extends TestConfig(Some("parallel.txt"), "CYPHER planner=cost runtime=parallel")

case object InterpretedTestConfig extends TestConfig(Some("interpreted.txt"),"CYPHER planner=cost runtime=interpreted")

case object PipelinedFullTestConfig extends TestConfig(
  Some("pipelined-single-threaded-full.txt"),
  "CYPHER planner=cost runtime=pipelined interpretedPipesFallback=all", experimental = true)
