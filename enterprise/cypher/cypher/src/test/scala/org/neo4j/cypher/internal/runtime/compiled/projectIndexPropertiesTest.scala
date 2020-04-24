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
package org.neo4j.cypher.internal.runtime.compiled

import org.neo4j.cypher.internal.compiler.v3_6.planner.LogicalPlanningTestSupport2
import org.neo4j.cypher.internal.v3_6.logical.plans._
import org.neo4j.cypher.internal.v3_6.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.v3_6.expressions._
import org.neo4j.cypher.internal.v3_6.util.test_helpers.CypherFunSuite
import org.neo4j.cypher.internal.v3_6.util.{LabelId, PropertyKeyId}

class projectIndexPropertiesTest extends CypherFunSuite with LogicalPlanningTestSupport2 {

  type IndexOperator = GetValueFromIndexBehavior => IndexLeafPlan

  val indexSeek: IndexOperator = getValue => IndexSeek("n:Awesome(prop = 42)", getValue)
  val uniqueIndexSeek: IndexOperator = getValue => NodeUniqueIndexSeek(
    "n",
    LabelToken("Awesome", LabelId(0)),
    Seq(IndexedProperty(PropertyKeyToken(PropertyKeyName("prop") _, PropertyKeyId(0)), getValue)),
    SingleQueryExpression(SignedDecimalIntegerLiteral("42") _),
    Set.empty,
    IndexOrderNone)
  val indexContainsScan: IndexOperator = getValue => IndexSeek("n:Awesome(prop CONTAINS 'foo')", getValue)
  val indexEndsWithScan: IndexOperator = getValue => IndexSeek("n:Awesome(prop ENDS WITH 'foo')", getValue)
  val indexScan: IndexOperator = getValue => IndexSeek("n:Awesome(prop)", getValue)

  val expectedProjections = Map("n.prop" -> prop("n", "prop"))

  val indexOperators = Seq(indexSeek, uniqueIndexSeek, indexContainsScan, indexEndsWithScan, indexScan)

  for(indexOperator <- indexOperators) {

    val doNotGetValues = indexOperator(DoNotGetValue)
    val getValues = indexOperator(GetValue)
    val operatorName = getValues.getClass.getSimpleName

    test(s"should introduce projection for $operatorName with index properties") {
      val updater = projectIndexProperties
      val emptyTable = SemanticTable()

      val (newPlan, newTable) = updater(getValues, emptyTable)
      newPlan should equal(Projection(doNotGetValues, expectedProjections)(idGen))
      // We have to use the exact var in the plan so that the input position is the same
      val varInNewPlan = newPlan.asInstanceOf[Projection].projectExpressions("n.prop").asInstanceOf[Property].map.asInstanceOf[Variable]
      newTable.isNode(varInNewPlan) should be(true)
    }

    test(s"should not introduce projection for $operatorName without index properties") {
      val updater = projectIndexProperties
      val emptyTable = SemanticTable()

      val (newPlan, newTable) = updater(doNotGetValues, emptyTable)
      newPlan should equal(doNotGetValues)
    }

  }

}
