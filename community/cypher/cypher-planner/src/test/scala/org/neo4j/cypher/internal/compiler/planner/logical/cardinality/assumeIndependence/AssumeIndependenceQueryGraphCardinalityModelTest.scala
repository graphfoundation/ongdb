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
package org.neo4j.cypher.internal.compiler.planner.logical.cardinality.assumeIndependence

import org.neo4j.cypher.internal.compiler.planner.logical.cardinality.ABCDECardinalityData
import org.neo4j.cypher.internal.compiler.planner.logical.cardinality.assumeIndependence.PatternRelationshipMultiplierCalculator.uniquenessSelectivityForNRels
import org.neo4j.cypher.internal.logical.plans.Aggregation
import org.neo4j.cypher.internal.logical.plans.Argument
import org.neo4j.cypher.internal.logical.plans.Create
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.NodeByLabelScan
import org.neo4j.cypher.internal.logical.plans.NodeIndexSeek
import org.neo4j.cypher.internal.logical.plans.Projection
import org.neo4j.cypher.internal.logical.plans.UnwindCollection
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.cypher.internal.util.test_helpers.Extractors.MapKeys
import org.neo4j.cypher.internal.util.test_helpers.TestName

import scala.math.cbrt
import scala.math.sqrt

class AssumeIndependenceQueryGraphCardinalityModelTest extends CypherFunSuite with ABCDECardinalityData with TestName {

  test("MATCH (n)") {
    expectCardinality(N)
  }

  test("MATCH (n:A)") {
    expectCardinality(A)
  }

  test("MATCH (n:A) MATCH (m:B)") {
    expectCardinality(A * B)
  }

  test("MATCH (a), (b)") {
    expectCardinality(N * N)
  }

  test("empty query") {
    queryShouldHaveCardinality("", 1.0)
  }

  test("MATCH (a), (b:B)") {
    expectCardinality(N * B)
  }

  test("MATCH (a:A:B)") {
    expectCardinality(N * Asel * Bsel)
  }

  test("MATCH (a:B:A)") {
    expectCardinality(N * Asel * Bsel)
  }

  test("MATCH (a:A:B) WHERE a.prop = 42") {
    expectCardinality(N * Asel * Bsel * or(Aprop, Bprop))
  }

  test("MATCH (a:A:B) WHERE a.prop IN [17, 42]") {
    expectCardinality(N * Asel * Bsel * or(or(Aprop, Aprop), or(Bprop, Bprop)))
  }

  test("MATCH (a:A) WHERE a.prop = 42") {
    expectCardinality(A * Aprop)
  }

  test("MATCH (e:E) WHERE e.some = 42") {
    expectCardinality(E * EsomeExists * EsomeUnique)
  }

  test("MATCH (e:E) WHERE e.some IS NOT NULL") {
    expectCardinality(E * EsomeExists)
  }

  test("MATCH (e:E) WHERE e.some = 42 or e.some = 23") {
    expectCardinality(E * EsomeExists * or(EsomeUnique, EsomeUnique))
  }

  test("MATCH (a:A) WHERE a.prop STARTS WITH 'p'") {
    expectCardinality(A * DEFAULT_RANGE_SEEK_FACTOR)
  }

  test("MATCH (a:B) WHERE a.bar = 42") {
    expectCardinality(B * DEFAULT_PROPERTY_SELECTIVITY * DEFAULT_EQUALITY_SELECTIVITY)
  }

  test("MATCH (a:A) WHERE NOT a.prop = 42") {
    expectCardinality(A * (1 - Aprop))
  }

  test("MATCH (a:A) WHERE a.prop = 42 OR a.prop = 43") {
    expectCardinality(A * or(Aprop, Aprop))
  }

  test("MATCH (a:A) WHERE a.prop = 42 OR a.bar = 43") {
    expectCardinality(A * or(Aprop, Abar))
  }

  test("MATCH (a:B) WHERE a.prop = 42 OR a.bar = 43") {
    expectCardinality(B * or(Bprop, DEFAULT_PROPERTY_SELECTIVITY * DEFAULT_EQUALITY_SELECTIVITY))
  }

  test("MATCH (a) WHERE false") {
    expectCardinality(0)
  }

  test("MATCH (a:A) WHERE a.prop = 42 AND a.bar = 43") {
    expectCardinality(A * Aprop * Abar)
  }

  test("MATCH (a:B) WHERE a.prop = 42 AND a.bar = 43") {
    expectCardinality(B * Bprop * DEFAULT_PROPERTY_SELECTIVITY * DEFAULT_EQUALITY_SELECTIVITY)
  }

  test("MATCH (c:C) WHERE c.prop = 42 AND c.bar = 43") {
    expectCardinality(C * CpropBarExists * CpropBarUnique)
  }

  test("MATCH (c:C) WHERE c.prop = 42 AND c.bar IS NOT NULL") {
    expectCardinality(C * CpropBarExists * sqrt(CpropBarUnique))
  }

  test("MATCH (c:C) WHERE c.prop IS NOT NULL AND c.bar = 42") {
    expectCardinality(C * CpropBarExists * sqrt(CpropBarUnique))
  }

  test("MATCH (c:C) WHERE c.prop = 42 AND c.bar STARTS WITH 'p'") {
    expectCardinality(C * CpropBarExists * sqrt(CpropBarUnique) * DEFAULT_RANGE_SEEK_FACTOR)
  }

  test("MATCH (c:C) WHERE c.prop STARTS WITH 'q' AND c.bar STARTS WITH 'p'") {
    expectCardinality(C * CpropBarExists * DEFAULT_RANGE_SEEK_FACTOR * DEFAULT_RANGE_SEEK_FACTOR)
  }

  test("MATCH (c:C) WITH *, 1 AS horizon MATCH (c) WHERE c.prop = 2 AND c.bar = 42") {
    expectCardinality(C * CpropBarExists * CpropBarUnique)
  }

  test("MATCH (c:C) OPTIONAL MATCH (c) WHERE c.prop = 17 AND c.bar = 42") {
    expectCardinality(Math.max(C, C * CpropBarExists * CpropBarUnique))
  }

  test("MATCH (c:C) OPTIONAL MATCH (c), (n) WHERE c.prop = 17 AND c.bar = 42") {
    expectCardinality(C * N * CpropBarExists * CpropBarUnique)
  }

  test("MATCH (c:C) WITH * CALL { WITH c MATCH (c) WHERE c.prop = 17 AND c.bar = 42 RETURN 42 as ft }") {
    expectCardinality(C * CpropBarExists * CpropBarUnique)
  }

  test("MATCH (c:C) WITH *, 1 AS horizon MATCH (n) WHERE c.prop = 42 AND c.bar IS NOT NULL") {
    expectCardinality(C * N * CpropBarExists * sqrt(CpropBarUnique))
  }

  test("MATCH (c:C) WITH *, 1 AS horizon WHERE c.prop = 42 AND c.bar IS NOT NULL") {
    expectCardinality(C * CpropBarExists * sqrt(CpropBarUnique))
  }

  test("MATCH (d:D) WHERE d.foo = 0 AND d.bar = 1 WITH max(d.baz) AS maxBaz") {
    expectPlanCardinality({
      case _:NodeIndexSeek => true
    }, D * DfooBarBazExists * cbrt(DfooBarBazUnique) * cbrt(DfooBarBazUnique))
  }

  test("MATCH (c:C) WHERE c.prop = 0") {
    expectCardinality(C * CpropBarExists * sqrt(CpropBarUnique))
  }

  test("MATCH (c:C) WHERE c.prop IN [0, 1]") {
    expectCardinality(C * CpropBarExists * or(sqrt(CpropBarUnique), sqrt(CpropBarUnique)))
  }

  test("MATCH (a)-->(b)") {
    expectCardinality(R)
  }

  test("MATCH (a:A)-[r:T1]->(b:B)") {
    expectCardinality(A_T1_B)
  }

  test("MATCH (b:B)<-[r:T1]-(a:A)") {
    expectCardinality(A_T1_B)
  }

  test("MATCH (a:A)-[r:T2]->(b:B)") { // This pattern has on avg more than one rel per pair of nodes
    expectCardinality(A_T2_B)
  }

  test("MATCH (a:A)-[r:T1]-(b:B)") {
    expectCardinality(A * B * (A_T1_B_sel + B_T1_A_sel))
  }

  test("MATCH (a:A)-[r:T1]-(b)") {
    expectCardinality(A_T1_ANY + ANY_T1_A)
  }

  test("MATCH (a:A)-[*0..0]-(b:A)") {
    // This is a simplification, because *0..0 relationships mean something weird and icky
    // It's not really right, but should not be fixed by the cardinality model. It should have
    // been rewritten away before this stage
    expectCardinality(N * Asel * Asel)
  }

  test("MATCH (a:A:B)-->()") {
    val maxRelCount = N * Asel * Bsel * N
    val A_relMult = A_ANY_ANY / maxRelCount * Bsel
    val B_relMult = B_ANY_ANY / maxRelCount * Asel
    val relMult = Math.min(A_relMult, B_relMult)
    expectCardinality(maxRelCount * relMult)
  }

  test("MATCH (a:A:B)-[:T1]->(:C)") {
    val maxRelCount = N * Asel * Bsel * N * Csel
    val A_relMult = A_T1_C / maxRelCount * Bsel
    val B_relMult = B_T1_C / maxRelCount * Asel
    val relMult = Math.min(A_relMult, B_relMult)
    expectCardinality(maxRelCount * relMult)
  }

  test("MATCH (a:A)-[:T1|T2]->(:B)") {
    val maxRelCount = N  * Asel * N * Bsel
    val relMult = A_T1_B / maxRelCount + A_T2_B / maxRelCount
    expectCardinality(maxRelCount * relMult)
  }

  test("MATCH (a:A:E)-[:T1|T2]->()") {
    val maxRelCount = N * Asel * Esel * N
    val relMultT1 = Math.min(A_T1_ANY / maxRelCount * Esel, E_T1_ANY / maxRelCount * Asel)
    val relMultT2 = Math.min(A_T2_ANY / maxRelCount * Esel, E_T2_ANY / maxRelCount * Asel)
    val relMult = relMultT1 + relMultT2
    expectCardinality(maxRelCount * relMult)
  }

  test("MATCH (a:A:D)-[:T1|T2]->()") {
    val maxRelCount = N * Asel * Dsel * N
    val relMultT1 = Math.min(A_T1_ANY / maxRelCount * Dsel, D_T1_ANY / maxRelCount * Asel)
    val relMultT2 = Math.min(A_T2_ANY / maxRelCount * Dsel, D_T2_ANY / maxRelCount * Asel)
    val relMult = relMultT1 + relMultT2
    expectCardinality(maxRelCount * relMult)
  }

  test("MATCH (a:A:B)-[:T1]->(c:C:D)") {
    val maxRelCount = N * Asel * Bsel * N * Csel * Dsel
    val relMult = Seq(
      A_T1_C / maxRelCount * Bsel * Dsel,
      A_T1_D / maxRelCount * Bsel * Csel,
      B_T1_C / maxRelCount * Asel * Dsel,
      B_T1_D / maxRelCount * Asel * Csel,
    ).min
    expectCardinality(maxRelCount * relMult)
  }

  test("MATCH (a:A:B)-[:T1|T2]->(c:C:D)") {
    val maxRelCount = N * Asel * Bsel * N * Csel * Dsel
    val relMultT1 = Seq(
      A_T1_C / maxRelCount * Bsel * Dsel,
      A_T1_D / maxRelCount * Bsel * Csel,
      B_T1_C / maxRelCount * Asel * Dsel,
      B_T1_D / maxRelCount * Asel * Csel,
    ).min
    val relMultT2 = Seq(
      A_T2_C / maxRelCount * Bsel * Dsel,
      A_T2_D / maxRelCount * Bsel * Csel,
      B_T2_C / maxRelCount * Asel * Dsel,
      B_T2_D / maxRelCount * Asel * Csel,
    ).min
    val relMult = relMultT1 + relMultT2
    expectCardinality(maxRelCount * relMult)
  }

  test("MATCH ()-[t: T1]->() WHERE t.prop IS NOT NULL") {
    expectCardinality(ANY_T1_ANY)
  }

  test("MATCH ()-[t: T1]->() WHERE t.prop = 2") {
    expectCardinality(ANY_T1_ANY * T1prop)
  }

  test("MATCH ()-[t: T1|T2]->() WHERE t.prop = 2") {
    expectCardinality(R * DEFAULT_PROPERTY_SELECTIVITY * DEFAULT_EQUALITY_SELECTIVITY)
  }

  test("MATCH ()-[t: T1 {prop: 2}]->()") {
    expectCardinality(ANY_T1_ANY * T1prop)
  }

  test("MATCH ()-[t: T2 {prop: 2}]->()") {
    expectCardinality(ANY_T2_ANY * DEFAULT_PROPERTY_SELECTIVITY * DEFAULT_EQUALITY_SELECTIVITY)
  }

  test("MATCH ()-[t {prop: 2}]->() WHERE t:T1") {
    expectCardinality(ANY_T1_ANY * T1prop)
  }

  test("MATCH ()-[t]->() WHERE t:T1 AND t.prop = 2") {
    expectCardinality(ANY_T1_ANY * T1prop)
  }

  test("MATCH ()<-[t: T1]-() WHERE t.prop IS NOT NULL") {
    expectCardinality(ANY_T1_ANY)
  }

  test("MATCH ()-[t: T1]-() WHERE t.prop = 2") {
    expectCardinality(ANY_T1_ANY * 2 * T1prop)
  }

  test("MATCH (a:A)-[t: T1]->() WHERE t.prop = 2 AND a.prop = 2") {
    expectCardinality(A_T1_ANY * T1prop * Aprop)
  }

  test("MATCH (a:A)-[t: T1]->() WHERE t.prop = 2") {
    expectCardinality(A_T1_ANY * T1prop)
  }

  test("MATCH ()-[t:T1]->() WHERE t.bar = 42") {
    expectCardinality(ANY_T1_ANY * DEFAULT_PROPERTY_SELECTIVITY * DEFAULT_EQUALITY_SELECTIVITY)
  }

  test("MATCH ()-[t:T1]->() WHERE NOT t.prop = 42") {
    expectCardinality(ANY_T1_ANY * (1 - T1prop))
  }

  test("MATCH ()-[t:T1]->() WHERE t.prop = 42 OR t.prop = 43") {
    expectCardinality(ANY_T1_ANY * or(T1prop, T1prop))
  }

  test("MATCH ()-[t1: T1]->()-[t2:T2]->()") {
    expectCardinality(N * N * N * ANY_T1_ANY_sel * ANY_T2_ANY_sel)
  }

  test("MATCH ()-[t1: T1]->()-[t2:T2]->() WHERE t1.prop = 2") {
    expectCardinality(N * N * N * ANY_T1_ANY_sel * ANY_T2_ANY_sel * T1prop)
  }

  test("MATCH ()-[t1: T1]->()-[t2:T2]->() WHERE t1.prop = 2 AND t2.prop = 3") {
    expectCardinality(N * N * N * ANY_T1_ANY_sel * ANY_T2_ANY_sel * T1prop * DEFAULT_PROPERTY_SELECTIVITY * DEFAULT_EQUALITY_SELECTIVITY)
  }

  test("MATCH ()-[t1:T1]->()-[t2:T2*2..2]->() WHERE t1.prop = 2") {
    expectCardinality(N * N * N * N * ANY_T1_ANY_sel * ANY_T2_ANY_sel * ANY_T2_ANY_sel * uniquenessSelectivityForNRels(2).factor * T1prop)
  }

  test("MATCH ()-[t:T1]->() WHERE t.prop STARTS WITH 'prefix'") {
    expectCardinality(ANY_T1_ANY * (DEFAULT_RANGE_SEEK_FACTOR / "prefix".length))
  }

  test("MATCH ()-[t:T1]->() WHERE t.prop > 2") {
    expectCardinality(ANY_T1_ANY * (1 - T1prop) * DEFAULT_RANGE_SEEK_FACTOR)
  }

  test("MATCH ()-[t:T1]->() WHERE t.prop >= 2") {
    expectCardinality(ANY_T1_ANY * ((1 - T1prop) * DEFAULT_RANGE_SEEK_FACTOR + T1prop))
  }

  test("MATCH ()-[t: T1]->() WHERE t.prop IN [1, 2, 3]") {
    expectCardinality(ANY_T1_ANY * or(T1prop, T1prop, T1prop))
  }

  test("MATCH ()-[t: T1|T2]->() WHERE t.prop IN [1, 2]") {
    val listOfOne = DEFAULT_EQUALITY_SELECTIVITY
    expectCardinality(R * DEFAULT_PROPERTY_SELECTIVITY * or(listOfOne, listOfOne))
  }

  test("MATCH ()-[t: T1|T2]->() WHERE t.prop IN [1, 2, 3]") {
    val listOfOne = DEFAULT_EQUALITY_SELECTIVITY
    val listOfThree = or(listOfOne, listOfOne, listOfOne)
    expectCardinality(R * DEFAULT_PROPERTY_SELECTIVITY * listOfThree)
  }

  test("MATCH ()-[t: T1]->() WHERE t.prop = 2 AND t.prop IN [1, 2, 3]") {
    expectCardinality(ANY_T1_ANY * T1prop * or(T1prop, T1prop, T1prop))
  }

  test("MATCH ()-[t: T1]->() WHERE t.prop = 2 AND t.bar = 2") {
    expectCardinality(ANY_T1_ANY * T1prop * DEFAULT_PROPERTY_SELECTIVITY * DEFAULT_EQUALITY_SELECTIVITY)
  }

  test("MATCH ()-[t: T1]->() WITH t AS t WHERE t.prop = 2") {
    expectCardinality(ANY_T1_ANY * T1prop)
  }

  test("MATCH ()-[t: T1]->() WITH *, 1 AS horizon MATCH ()-[t]->()") {
    expectCardinality(ANY_T1_ANY)
  }

  test("MATCH ()-[t: T1]->() WITH *, 1 AS horizon MATCH ()-[t]->() WHERE t.prop = 2") {
    expectCardinality(ANY_T1_ANY * T1prop)
  }

  test("MATCH ()-[t:T1]->() OPTIONAL MATCH ()-[t]->() WHERE t.prop = 17") {
    expectCardinality(Math.max(ANY_T1_ANY, ANY_T1_ANY * T1prop))
  }

  test("MATCH ()-[t1:T1]->() OPTIONAL MATCH ()-[t1]->(), (n) WHERE t1.prop = 17") {
    expectCardinality(ANY_T1_ANY * N * T1prop)
  }

  test("MATCH ()-[t: T1]->() WITH * CALL { WITH t MATCH ()-[t]->() WHERE t.prop = 17 RETURN 42 as ft }") {
    expectCardinality(ANY_T1_ANY * T1prop)
  }

  test("MATCH ()-[t: T2]-() WHERE t.prop = 2 AND t.foo = 42") {
    expectCardinality(ANY_T2_ANY * 2 * T2propFooExists * T2propFooUnique)
  }

  test("MATCH ()-[t: T2]-() WHERE t.prop = 2 AND t.foo IS NOT NULL") {
    expectCardinality(ANY_T2_ANY * 2 * T2propFooExists * sqrt(T2propFooUnique))
  }

  test("MATCH ()-[t: T2]->() WHERE t.prop = 2 AND t.foo = 42") {
    expectCardinality(ANY_T2_ANY * T2propFooExists * T2propFooUnique)
  }

  test("MATCH ()-[t: T2]->() WITH *, 1 AS horizon MATCH ()-[t]->() WHERE t.prop = 2 AND t.foo = 42") {
    expectCardinality(ANY_T2_ANY * T2propFooExists * T2propFooUnique)
  }

  test("MATCH ()-[t:T2]->() OPTIONAL MATCH ()-[t]->() WHERE t.prop = 17 AND t.foo = 42") {
    expectCardinality(Math.max(ANY_T2_ANY, ANY_T2_ANY * T2propFooExists * T2propFooUnique))
  }

  test("MATCH ()-[t:T2]->() OPTIONAL MATCH ()-[t]->(), (n) WHERE t.prop = 17 AND t.foo = 42") {
    expectCardinality(ANY_T2_ANY * N * T2propFooExists * T2propFooUnique)
  }

  test("MATCH ()-[t: T2]->() WITH * CALL { WITH t MATCH ()-[t]->() WHERE t.prop = 17 AND t.foo = 42 RETURN 42 as ft }") {
    expectCardinality(ANY_T2_ANY * T2propFooExists * T2propFooUnique)
  }

  test("MATCH (a) WITH a, 1 AS foo WHERE a:A AND a.prop = 2") {
    // Use index for a.prop = 2
    expectCardinality(A * Aprop)
  }

  test("MATCH (a) WITH a, 1 AS foo WHERE a:A MATCH (a) WHERE a.prop = 2") {
    // Propagate label info and use index for a.prop = 2
    expectCardinality(A * Aprop)
  }

  test("MATCH (a) WITH a, 1 AS foo WHERE a:A MATCH (n) WHERE a.prop = 2") {
    // Propagate label info and use index for a.prop = 2
    expectCardinality(A * Aprop * N)
  }

  test("MATCH (a:A) WITH 1 AS foo MATCH (a) WHERE a.prop = 2") {
    // Different a-variables, don't use index for a.prop = 2
    expectCardinality(A * N * DEFAULT_PROPERTY_SELECTIVITY * DEFAULT_EQUALITY_SELECTIVITY)
  }

  test("MATCH (a:A) WITH a, 1 AS foo MATCH (a) WHERE a.prop = 1") {
    // Propagate label info and use index for a.prop = 1
    expectCardinality(A * Aprop)
  }

  test("MATCH (a) OPTIONAL MATCH (a)-[:T1]->(:B)") {
    expectCardinality(A_T1_B + B_T1_B)
  }

  test("MATCH (a:A) OPTIONAL MATCH (a)-[:T1]->(:B)") {
    expectCardinality(A_T1_B)
  }

  test("MATCH (a:A) OPTIONAL MATCH (a)-[:T2]->(:C)") { // Does not exist
    expectCardinality(A)
  }

  test("MATCH (a) OPTIONAL MATCH (b)") {
    expectCardinality(N * N)
  }

  test("MATCH (a:A) OPTIONAL MATCH (b:B) OPTIONAL MATCH (c:C)") {
    expectCardinality(A * B * C)
  }

  test("MATCH (a:A) OPTIONAL MATCH (b:B) OPTIONAL MATCH (b)") {
    expectCardinality(A * B)
  }

  test("MATCH (a:A) OPTIONAL MATCH (b) OPTIONAL MATCH (b:B)") {
    expectCardinality(A * N)
  }

  test("MATCH (a:A) OPTIONAL MATCH (a)-[:T1]->(b:B) OPTIONAL MATCH (b)") {
    expectCardinality(Math.max(A, A_T1_B))
  }

  test("MATCH (a:A) OPTIONAL MATCH (a)-[:T1]->(b:B) OPTIONAL MATCH (a)-[:T1]->(c:C)") {
    val a = A
    val a_b = Math.max(a, a * B * A_T1_B_sel)
    val a_c = Math.max(a_b, a_b * C * A_T1_C_sel)
    expectCardinality(a_c)
  }

  test("MATCH (a:A) OPTIONAL MATCH (a)-[:T1]->(b:B) OPTIONAL MATCH (b)-[:T1]->(c:C)") {
    val a = A
    val a_b = Math.max(a, a * B * A_T1_B_sel)
    val b_c = Math.max(a_b, a_b * C * B_T1_C_sel)
    expectCardinality(b_c)
  }

  test("MATCH (a:A) OPTIONAL MATCH (a)-->(b) OPTIONAL MATCH (b)-->(c) OPTIONAL MATCH (c)-->(d)") {
    val a = A
    val a_b = Math.max(a, A_ANY_ANY)
    val b_c = Math.max(a_b, a_b * N * R_sel)
    val c_d = Math.max(b_c, b_c * N * R_sel)
    expectCardinality(c_d)
  }

  test("MATCH (a:A) OPTIONAL MATCH (a) WHERE a.prop = 1") {
    expectCardinality(Math.max(A, A * Aprop))
  }

  test("MATCH (a:A) OPTIONAL MATCH (b:B) WHERE a.prop = 1") {
    expectCardinality(Math.max(A, A * B * Aprop))
  }

  test("MATCH (a:A) OPTIONAL MATCH (b:B) WHERE a.prop = 1 AND b.prop = 1") {
    expectCardinality(Math.max(A, A * B * Aprop * Bprop))
  }

  test("MATCH (a:A) WHERE id(a) IN [1,2,3]") {
    expectCardinality(A * (3.0 / N))
  }

  test("MATCH (a:A)-[r1:T1]->(b:B)-[r2:T2]->(c:C)") {
    expectCardinality(N * N * N * Asel * A_T1_B_sel * Bsel * B_T2_C_sel * Csel)
  }

  test("MATCH (a:A)-[r1:T1]->(b:B)-[r2:T1]->(c:C)") {
    expectCardinality(N * N * N * Asel * A_T1_B_sel * Bsel * B_T1_C_sel * Csel * uniquenessSelectivityForNRels(2).factor)
  }

  test("MATCH (a:A)-[r1:T1]->(b:B)-[r2:T1]->(a)") {
    expectCardinality(N * N * Asel * A_T1_B_sel * Bsel * B_T1_A_sel * uniquenessSelectivityForNRels(2).factor)
  }

  test("MATCH (:A)-[r1:T1]->(:A)-[r2:T1]->(:B)-[r3:T1]->(:B)") {
    expectCardinality(A * A * B * B * A_T1_A_sel * A_T1_B_sel * B_T1_B_sel * uniquenessSelectivityForNRels(3).factor)
  }

  test("MATCH (:A)-[r1:T1]->(:A)-[r2:T1]->(:B)-[r3:T1]->(:B)-[r4:T2]->(c:C)") {
    // r4 has a different relType so it does not need to be checked for rel-uniqueness against the other rels
    expectCardinality(A * A * B * B * C * A_T1_A_sel * A_T1_B_sel * B_T1_B_sel * B_T2_C_sel * uniquenessSelectivityForNRels(3).factor)
  }

  test("MATCH (a:A) CALL { WITH a MATCH (b:B) RETURN b }") {
    expectCardinality(A * B)
    expectPlanCardinality({
      case NodeByLabelScan("b", _, _, _) => true
    }, A * B)
  }

  test("MATCH (a:A) CALL { MATCH (b:B) RETURN b }") {
    expectCardinality(A * B)
    expectPlanCardinality({
      case NodeByLabelScan("b", _, _, _) => true
    }, A * B)
  }

  test("MATCH (a:A) CALL { MATCH (b:B) RETURN b } MATCH (c:C)") {
    expectCardinality(A * B * C)
    expectPlanCardinality({
      case NodeByLabelScan("c", _, _, _) => true
    }, A * B * C)
  }

  test("MATCH (a:A) CALL { WITH a MATCH (a)-[:T1]->(b:B) RETURN b }") {
    expectCardinality(A_T1_B)
  }

  test("MATCH (a:A) CALL { WITH a MATCH (a) WHERE a.prop = 42 RETURN 42 AS ft }") {
    expectCardinality(A * Aprop)
  }

  test("MATCH (a:A) CALL { MATCH (a) WHERE a.prop = 42 RETURN 42 AS ft }") {
    expectCardinality(A * N * DEFAULT_PROPERTY_SELECTIVITY * DEFAULT_EQUALITY_SELECTIVITY)
  }

  test("MATCH (a:A) CALL { WITH a MATCH (b:B) RETURN b AS x UNION ALL WITH a MATCH (c:C) RETURN c AS x}") {
    expectCardinality(A * (B + C))
    expectPlanCardinality({
      case NodeByLabelScan("b", _, _, _) => true
    }, A * B)
    expectPlanCardinality({
      case NodeByLabelScan("c", _, _, _) => true
    }, A * C)
  }

  test("MATCH (a:A) CALL { MATCH (b:B) RETURN b AS x UNION ALL MATCH (c:C) RETURN c AS x}") {
    expectCardinality(A * (B + C))
    expectPlanCardinality({
      case NodeByLabelScan("b", _, _, _) => true
    }, A * B)
    expectPlanCardinality({
      case NodeByLabelScan("c", _, _, _) => true
    }, A * C)
  }

  test("MATCH (a:A) CALL { WITH a UNWIND [1, 2] AS x WITH toFloat(x) AS f, x AS x RETURN x }") {
    expectCardinality(A * 2)
    expectPlanCardinality({
      case Projection(_, MapKeys("f")) => true
    }, A * 2)
    expectPlanCardinality({
      case UnwindCollection(_, "x", _) => true
    }, A * 2)
    expectPlanCardinality({
      case Argument(_) => true
    }, A)
  }

  test("MATCH (a:A) CALL { WITH a MATCH (a)-[:T1]->(b:B) RETURN count(*) AS c }") {
    expectCardinality(A)
    expectPlanCardinality({
      case Aggregation(_, _, _) => true
    }, A)
  }

  test("MATCH (a:A) CALL { CREATE (b:Label) WITH b CALL { RETURN 5 AS literal } RETURN * }") {
    expectCardinality(A)
    expectPlanCardinality({
      case Create(_, _, _) => true
    }, A)
    expectPlanCardinality({
      case Projection(_, _) => true
    }, A)
  }

  test("CALL { MATCH (b:B) CREATE (n:N) }") {
    expectCardinality(1)
  }

  test("MATCH (a:A) CALL { CREATE (n:N) }") {
    expectCardinality(A)
  }

  test("MATCH (a:A) CALL { MATCH (b:B) CREATE (n:N) }") {
    expectCardinality(A)
  }

  test("MATCH (a:A) CALL { MATCH (:B) CALL { MATCH (:B) CREATE (:N) } CREATE (:N) }") {
    expectCardinality(A)
  }

  private val varLength0_0 = N * Asel * Bsel
  test("varlength 0..0 should be equal to non-varlength") {
    queryShouldHaveCardinality("MATCH (:A:B)", varLength0_0)
    queryShouldHaveCardinality("MATCH (a:A)-[r:T1*0..0]->(b:B)", varLength0_0)
  }

  private val varLength1_1 = A_T1_B
  test("varlength 1..1 should be equal to non-varlength") {
    queryShouldHaveCardinality("MATCH (:A)-[r1:T1]->(:B)", varLength1_1)
    queryShouldHaveCardinality("MATCH (a:A)-[r:T1*1..1]->(b:B)", varLength1_1)
  }

  test("varlength 0..1 should equal sum of 0..0 and 1..1") {
    queryShouldHaveCardinality("MATCH (a:A)-[r:T1*0..1]->(b:B)", varLength0_0 + varLength1_1)
  }

  private val varLength2_2 = A * N * B * A_T1_ANY_sel * ANY_T1_B_sel * uniquenessSelectivityForNRels(2).factor
  test("varlength 2..2 should be equal to non-varlength") {
    queryShouldHaveCardinality("MATCH (:A)-[r1:T1]->()-[r2:T1]->(:B)", varLength2_2)
    queryShouldHaveCardinality("MATCH (a:A)-[r:T1*2..2]->(b:B)", varLength2_2)
  }

  test("varlength 1..2 should equal sum of 1..1 and 2..2") {
    queryShouldHaveCardinality("MATCH (a:A)-[r:T1*1..2]->(b:B)", varLength1_1 + varLength2_2)
  }

  test("varlength 0..2 should equal sum of 0..0 and 1..1 and 2..2") {
    queryShouldHaveCardinality("MATCH (a:A)-[r:T1*0..2]->(b:B)", varLength0_0 + varLength1_1 + varLength2_2)
  }

  private val varLength3_3 = A * N * N * B * A_T1_ANY_sel * ANY_T1_ANY_sel * ANY_T1_B_sel * uniquenessSelectivityForNRels(3).factor
  test("varlength 3..3 should be equal to non-varlength") {
    // The result includes all (:A)-[:T1]->()-[:T1]->()-[:T1]->(:B)
    queryShouldHaveCardinality("MATCH (:A)-[r1:T1]->()-[r2:T1]->()-[r3:T1]->(:B)", varLength3_3)
    queryShouldHaveCardinality("MATCH (a:A)-[r:T1*3..3]->(b:B)", varLength3_3)
  }

  test("varlength 1..3 should equal sum of 1..1 and 2..2 and 3..3") {
    queryShouldHaveCardinality("MATCH (a:A)-[r:T1*1..3]->(b:B)", varLength1_1 + varLength2_2 + varLength3_3)
  }

  test("MATCH (a:A)-[r:T1]->(b:B) WITH r SKIP 0 MATCH ()-[r]->()") {
    expectCardinality(A_T1_B)
  }

  test("MATCH (a:A)-[r:T1]->(b:B) WITH * SKIP 0 MATCH (a)-[r]->(b)") {
    expectCardinality(A_T1_B)
  }

  test("MATCH (a:A)-[r:T1]->(b:B) WITH a, r SKIP 0 MATCH (a)-[r]->()") {
    expectCardinality(A_T1_B)
  }

  test("MATCH (a:A)-[r:T1]->(b:B) WITH r SKIP 0 MATCH (a1)-[r]->()") {
    expectCardinality(A_T1_B)
  }

  test("MATCH (a:A)-[r:T1]->(b:B) WITH r SKIP 0 MATCH ()-[r]->()-[r2:T2]->(c:C)") {
    // Actually, we would expect N * N * N * Asel * A_T1_B_sel * Bsel * B_T2_C_sel * Csel rows.
    // But the label and rel type information from the first match is currently not propagated to the 2nd match.
    // This also means that the planner cannot prove that r != r2 and therefore applies a filter with the
    // selectivity for 2 unique relationships.
    expectCardinality(N * N * N * Asel * A_T1_B_sel * Bsel * ANY_T2_C_sel * Csel * uniquenessSelectivityForNRels(2).factor)
  }

  private def expectCardinality(expected: Double): Unit =
    queryShouldHaveCardinality(testName, expected)

  private def expectPlanCardinality(findPlanId: PartialFunction[LogicalPlan, Boolean], expected: Double): Unit =
    planShouldHaveCardinality(testName, findPlanId, expected)
}
