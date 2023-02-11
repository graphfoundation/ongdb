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
package org.neo4j.cypher.internal.planning.notification

import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito.when
import org.mockito.invocation.InvocationOnMock
import org.mockito.stubbing.Answer
import org.neo4j.cypher.internal.compiler.LargeLabelWithLoadCsvNotification
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport
import org.neo4j.cypher.internal.ir.HasHeaders
import org.neo4j.cypher.internal.logical.plans.Argument
import org.neo4j.cypher.internal.logical.plans.CartesianProduct
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.logical.plans.LoadCSV
import org.neo4j.cypher.internal.logical.plans.NodeByLabelScan
import org.neo4j.cypher.internal.planner.spi.InstrumentedGraphStatistics
import org.neo4j.cypher.internal.planner.spi.PlanContext
import org.neo4j.cypher.internal.runtime.interpreted.CSVResources
import org.neo4j.cypher.internal.util.Cardinality
import org.neo4j.cypher.internal.util.LabelId
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class CheckForLoadCsvAndMatchOnLargeLabelTest
  extends CypherFunSuite
  with LogicalPlanningTestSupport {

  private val url = literalString("file:///tmp/foo.csv")

  private val THRESHOLD = 100
  private val labelOverThreshold = "A"
  private val labelUnderThreshold = "B"
  private val indexFor = Map(labelOverThreshold -> 1, labelUnderThreshold -> 2)
  private val planContext = mock[PlanContext]
  when(planContext.getOptLabelId(anyString)).thenAnswer(new Answer[Option[Int]] {
    override def answer(invocationOnMock: InvocationOnMock): Option[Int] = {
      val label: String = invocationOnMock.getArgument(0)
      indexFor.get(label)
    }
  })
  private val statistics = mock[InstrumentedGraphStatistics]
  when(statistics.nodesWithLabelCardinality(Some(LabelId(1)))).thenReturn(Cardinality(101))
  when(statistics.nodesWithLabelCardinality(Some(LabelId(2)))).thenReturn(Cardinality(99))
  when(planContext.statistics).thenReturn(statistics)
  private val checker = checkForLoadCsvAndMatchOnLargeLabel(planContext, THRESHOLD)

  test("should notify when doing LoadCsv on top of large label scan") {
    val loadCsv =
      LoadCSV(
        Argument(),
        url,
        "foo",
        HasHeaders,
        None,
        legacyCsvQuoteEscaping = false,
        CSVResources.DEFAULT_BUFFER_SIZE
      )

    val plan = CartesianProduct(
      loadCsv,
      NodeByLabelScan("bar", labelName(labelOverThreshold), Set.empty, IndexOrderNone)
    )

    checker(plan) should equal(List(LargeLabelWithLoadCsvNotification))
  }

  test("should not notify when doing LoadCsv on top of a small label scan") {
    val loadCsv =
      LoadCSV(
        Argument(),
        url,
        "foo",
        HasHeaders,
        None,
        legacyCsvQuoteEscaping = false,
        CSVResources.DEFAULT_BUFFER_SIZE
      )

    val plan =
      CartesianProduct(
        loadCsv,
        NodeByLabelScan("bar", labelName(labelUnderThreshold), Set.empty, IndexOrderNone)
      )

    checker(plan) should equal(List.empty)
  }

  test("should not notify when doing large label scan on top of LoadCSV") {
    val start = NodeByLabelScan("bar", labelName(labelOverThreshold), Set.empty, IndexOrderNone)
    val plan =
      LoadCSV(start, url, "foo", HasHeaders, None, legacyCsvQuoteEscaping = false,
        CSVResources.DEFAULT_BUFFER_SIZE)

    checker(plan) should equal(List.empty)
  }
}
