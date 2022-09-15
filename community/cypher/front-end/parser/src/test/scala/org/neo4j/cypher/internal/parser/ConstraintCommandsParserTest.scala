/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.cypher.internal.parser

import org.neo4j.cypher.internal.ast
import org.neo4j.cypher.internal.ast.ConstraintVersion0
import org.neo4j.cypher.internal.ast.ConstraintVersion1
import org.neo4j.cypher.internal.ast.ConstraintVersion2
import org.neo4j.cypher.internal.ast.NoOptions
import org.neo4j.cypher.internal.ast.OptionsMap
import org.neo4j.cypher.internal.ast.OptionsParam
import org.neo4j.cypher.internal.util.symbols.CTMap

/* Tests for creating and dropping constraints */
class ConstraintCommandsParserTest extends SchemaCommandsParserTestBase {

  Seq("ON", "FOR")
    .foreach { forOrOnString =>
      Seq("ASSERT", "REQUIRE")
        .foreach { requireOrAssertString =>
          val containsOn = forOrOnString == "ON"
          val constraintVersion = if (requireOrAssertString == "REQUIRE") ConstraintVersion2 else ConstraintVersion0
          val constraintVersionOneOrTwo = if (requireOrAssertString == "REQUIRE") ConstraintVersion2 else ConstraintVersion1

          // Create node key and uniqueness constraint: Without name
          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsThrowError, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE OR REPLACE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsReplace, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsDoNothing, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop1,node.prop2) IS NODE KEY") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"),
              Seq(prop("node", "prop1"), prop("node", "prop2")), None, ast.IfExistsThrowError, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE OR REPLACE CONSTRAINT IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString (node.prop1,node.prop2) IS NODE KEY") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"),
              Seq(prop("node", "prop1"), prop("node", "prop2")), None, ast.IfExistsInvalidSyntax, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY OPTIONS {indexProvider : 'native-btree-1.0'}") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")),
              None, ast.IfExistsThrowError, OptionsMap(Map("indexProvider" -> literalString("native-btree-1.0"))), containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY OPTIONS {indexProvider : 'lucene+native-3.0', indexConfig : {`spatial.cartesian.max`: [100.0,100.0], `spatial.cartesian.min`: [-100.0,-100.0] }}") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsThrowError,
              OptionsMap(Map("indexProvider" -> literalString("lucene+native-3.0"),
                "indexConfig" -> mapOf(
                  "spatial.cartesian.max" -> listOf(literalFloat(100.0), literalFloat(100.0)),
                  "spatial.cartesian.min" -> listOf(literalFloat(-100.0), literalFloat(-100.0))
                ))
              ), containsOn, constraintVersion
            ))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY OPTIONS {indexConfig : {`spatial.wgs-84.max`: [60.0,60.0], `spatial.wgs-84.min`: [-40.0,-40.0] }}") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsThrowError,
              OptionsMap(Map("indexConfig" -> mapOf(
                "spatial.wgs-84.max" -> listOf(literalFloat(60.0), literalFloat(60.0)),
                "spatial.wgs-84.min" -> listOf(literalFloat(-40.0), literalFloat(-40.0))
              ))), containsOn, constraintVersion
            ))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY OPTIONS {nonValidOption : 42}") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsThrowError,
              OptionsMap(Map("nonValidOption" -> literalInt(42))), containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY OPTIONS {}") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsThrowError, OptionsMap(Map.empty), containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY OPTIONS $$param") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsThrowError,
              OptionsParam(parameter("param", CTMap)), containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString node.prop IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsThrowError, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE OR REPLACE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString node.prop IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsReplace, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString node.prop IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsDoNothing, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsThrowError, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop1,node.prop2) IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"),
              Seq(prop("node", "prop1"), prop("node", "prop2")), None, ast.IfExistsThrowError, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE OR REPLACE CONSTRAINT IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString (node.prop1,node.prop2) IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"),
              Seq(prop("node", "prop1"), prop("node", "prop2")), None, ast.IfExistsInvalidSyntax, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS UNIQUE OPTIONS {indexConfig : {`spatial.wgs-84.max`: [60.0,60.0], `spatial.wgs-84.min`: [-40.0,-40.0]}, indexProvider : 'native-btree-1.0'}") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsThrowError,
              OptionsMap(Map("indexProvider" -> literalString("native-btree-1.0"),
                "indexConfig" -> mapOf(
                  "spatial.wgs-84.max" -> listOf(literalFloat(60.0), literalFloat(60.0)),
                  "spatial.wgs-84.min" -> listOf(literalFloat(-40.0), literalFloat(-40.0))
                )
              )), containsOn, constraintVersion
            ))
          }

          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS UNIQUE OPTIONS $$options") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), None, ast.IfExistsThrowError,
              OptionsParam(parameter("options", CTMap)), containsOn, constraintVersion))
          }

          // Create node key and uniqueness constraint: With name

          test(s"USE neo4j CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), Some("my_constraint"), ast.IfExistsThrowError, NoOptions, containsOn, constraintVersion, Some(use(varFor("neo4j")))))
          }

          test(s"USE neo4j CREATE OR REPLACE CONSTRAINT my_constraint IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), Some("my_constraint"), ast.IfExistsInvalidSyntax, NoOptions, containsOn, constraintVersion, Some(use(varFor("neo4j")))))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop1,node.prop2) IS NODE KEY") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"),
              Seq(prop("node", "prop1"), prop("node", "prop2")), Some("my_constraint"), ast.IfExistsThrowError, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE OR REPLACE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop1,node.prop2) IS NODE KEY") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"),
              Seq(prop("node", "prop1"), prop("node", "prop2")), Some("my_constraint"), ast.IfExistsReplace, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT my_constraint IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString (node.prop1,node.prop2) IS NODE KEY") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"),
              Seq(prop("node", "prop1"), prop("node", "prop2")), Some("my_constraint"), ast.IfExistsDoNothing, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NODE KEY OPTIONS {indexProvider : 'native-btree-1.0', indexConfig : {`spatial.wgs-84.max`: [60.0,60.0], `spatial.wgs-84.min`: [-40.0,-40.0]}}") {
            yields(ast.CreateNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), Some("my_constraint"), ast.IfExistsThrowError,
              OptionsMap(Map("indexProvider" -> literalString("native-btree-1.0"),
                "indexConfig" -> mapOf(
                  "spatial.wgs-84.max" -> listOf(literalFloat(60.0), literalFloat(60.0)),
                  "spatial.wgs-84.min" -> listOf(literalFloat(-40.0), literalFloat(-40.0))
                )
              )), containsOn, constraintVersion
            ))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString node.prop IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), Some("my_constraint"), ast.IfExistsThrowError, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), Some("my_constraint"), ast.IfExistsThrowError, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE OR REPLACE CONSTRAINT my_constraint IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), Some("my_constraint"), ast.IfExistsInvalidSyntax, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop1,node.prop2) IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"),
              Seq(prop("node", "prop1"), prop("node", "prop2")), Some("my_constraint"), ast.IfExistsThrowError, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE OR REPLACE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop1,node.prop2) IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"),
              Seq(prop("node", "prop1"), prop("node", "prop2")), Some("my_constraint"), ast.IfExistsReplace, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT my_constraint IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString (node.prop1,node.prop2) IS UNIQUE") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"),
              Seq(prop("node", "prop1"), prop("node", "prop2")), Some("my_constraint"), ast.IfExistsDoNothing, NoOptions, containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS UNIQUE OPTIONS {indexProvider : 'native-btree-1.0'}") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")),
              Some("my_constraint"), ast.IfExistsThrowError, OptionsMap(Map("indexProvider" -> literalString("native-btree-1.0"))), containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS UNIQUE OPTIONS {indexProvider : 'lucene+native-3.0', indexConfig : {`spatial.cartesian.max`: [100.0,100.0], `spatial.cartesian.min`: [-100.0,-100.0] }}") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), Some("my_constraint"), ast.IfExistsThrowError,
              OptionsMap(Map("indexProvider" -> literalString("lucene+native-3.0"),
                "indexConfig" -> mapOf(
                  "spatial.cartesian.max" -> listOf(literalFloat(100.0), literalFloat(100.0)),
                  "spatial.cartesian.min" -> listOf(literalFloat(-100.0), literalFloat(-100.0))
                )
              )), containsOn, constraintVersion
            ))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS UNIQUE OPTIONS {indexConfig : {`spatial.wgs-84.max`: [60.0,60.0], `spatial.wgs-84.min`: [-40.0,-40.0] }}") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")), Some("my_constraint"), ast.IfExistsThrowError,
              OptionsMap(Map("indexConfig" -> mapOf(
                "spatial.wgs-84.max" -> listOf(literalFloat(60.0), literalFloat(60.0)),
                "spatial.wgs-84.min" -> listOf(literalFloat(-40.0), literalFloat(-40.0))
              ))), containsOn, constraintVersion
            ))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS UNIQUE OPTIONS {nonValidOption : 42}") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop")),
              Some("my_constraint"), ast.IfExistsThrowError, OptionsMap(Map("nonValidOption" -> literalInt(42))), containsOn, constraintVersion))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString (node.prop1,node.prop2) IS UNIQUE OPTIONS {}") {
            yields(ast.CreateUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop1"), prop("node", "prop2")),
              Some("my_constraint"), ast.IfExistsThrowError, OptionsMap(Map.empty), containsOn, constraintVersion))
          }

          // Create existence constraint: Without name
          test(s"CREATE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString node.prop IS NOT NULL") {
            yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), None, ast.IfExistsThrowError, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE OR REPLACE CONSTRAINT $forOrOnString (node:Label) $requireOrAssertString node.prop IS NOT NULL") {
            yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), None, ast.IfExistsReplace, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE OR REPLACE CONSTRAINT IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString node.prop IS NOT NULL") {
            yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), None, ast.IfExistsInvalidSyntax, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE CONSTRAINT IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString (node.prop) IS NOT NULL") {
            yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), None, ast.IfExistsDoNothing, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE CONSTRAINT $forOrOnString ()-[r:R]-() $requireOrAssertString r.prop IS NOT NULL") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsThrowError, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE CONSTRAINT $forOrOnString ()-[r:R]->() $requireOrAssertString r.prop IS NOT NULL") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsThrowError, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE CONSTRAINT $forOrOnString ()<-[r:R]-() $requireOrAssertString (r.prop) IS NOT NULL") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsThrowError, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE OR REPLACE CONSTRAINT $forOrOnString ()<-[r:R]-() $requireOrAssertString r.prop IS NOT NULL") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsReplace, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE OR REPLACE CONSTRAINT IF NOT EXISTS $forOrOnString ()-[r:R]-() $requireOrAssertString r.prop IS NOT NULL") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsInvalidSyntax, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE CONSTRAINT IF NOT EXISTS $forOrOnString ()-[r:R]->() $requireOrAssertString r.prop IS NOT NULL") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsDoNothing, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE CONSTRAINT $forOrOnString ()-[r:R]-() $requireOrAssertString (r.prop) IS NOT NULL OPTIONS {}") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsThrowError, OptionsMap(Map.empty), containsOn, constraintVersionOneOrTwo))
          }

          // Create existence constraint: With name

          test(s"CREATE OR REPLACE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString node.prop IS NOT NULL") {
            yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), Some("my_constraint"), ast.IfExistsReplace, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE OR REPLACE CONSTRAINT my_constraint IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString node.prop IS NOT NULL") {
            yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), Some("my_constraint"), ast.IfExistsInvalidSyntax, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE CONSTRAINT my_constraint IF NOT EXISTS $forOrOnString (node:Label) $requireOrAssertString node.prop IS NOT NULL") {
            yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), Some("my_constraint"), ast.IfExistsDoNothing, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString (node:Label) $requireOrAssertString node.prop IS NOT NULL OPTIONS {}") {
            yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), Some("my_constraint"), ast.IfExistsThrowError, OptionsMap(Map.empty), containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE CONSTRAINT `$$my_constraint` $forOrOnString ()-[r:R]-() $requireOrAssertString r.prop IS NOT NULL") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), Some("$my_constraint"), ast.IfExistsThrowError, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE CONSTRAINT my_constraint $forOrOnString ()-[r:R]-() $requireOrAssertString (r.prop) IS NOT NULL") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), Some("my_constraint"), ast.IfExistsThrowError, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE OR REPLACE CONSTRAINT `$$my_constraint` $forOrOnString ()-[r:R]-() $requireOrAssertString r.prop IS NOT NULL") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), Some("$my_constraint"), ast.IfExistsReplace, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE OR REPLACE CONSTRAINT `$$my_constraint` IF NOT EXISTS $forOrOnString ()-[r:R]->() $requireOrAssertString (r.prop) IS NOT NULL") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), Some("$my_constraint"), ast.IfExistsInvalidSyntax, NoOptions, containsOn, constraintVersionOneOrTwo))
          }

          test(s"CREATE CONSTRAINT `$$my_constraint` IF NOT EXISTS $forOrOnString ()<-[r:R]-() $requireOrAssertString r.prop IS NOT NULL") {
            yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), Some("$my_constraint"), ast.IfExistsDoNothing, NoOptions, containsOn, constraintVersionOneOrTwo))
          }
        }
    }

  test("CREATE CONSTRAINT ON (node:Label) ASSERT EXISTS (node.prop)") {
    yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), None, ast.IfExistsThrowError, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE OR REPLACE CONSTRAINT ON (node:Label) ASSERT EXISTS (node.prop)") {
    yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), None, ast.IfExistsReplace, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE OR REPLACE CONSTRAINT IF NOT EXISTS ON (node:Label) ASSERT EXISTS (node.prop)") {
    yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), None, ast.IfExistsInvalidSyntax, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT IF NOT EXISTS ON (node:Label) ASSERT EXISTS (node.prop)") {
    yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), None, ast.IfExistsDoNothing, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT ON (node:Label) ASSERT EXISTS (node.prop) OPTIONS {}") {
    yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), None, ast.IfExistsThrowError, OptionsMap(Map.empty), containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT ON ()-[r:R]-() ASSERT EXISTS (r.prop)") {
    yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsThrowError, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT ON ()-[r:R]->() ASSERT EXISTS (r.prop)") {
    yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsThrowError, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT ON ()<-[r:R]-() ASSERT EXISTS (r.prop)") {
    yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsThrowError, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE OR REPLACE CONSTRAINT ON ()<-[r:R]-() ASSERT EXISTS (r.prop)") {
    yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsReplace, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE OR REPLACE CONSTRAINT IF NOT EXISTS ON ()-[r:R]-() ASSERT EXISTS (r.prop)") {
    yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsInvalidSyntax, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT IF NOT EXISTS ON ()-[r:R]->() ASSERT EXISTS (r.prop)") {
    yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), None, ast.IfExistsDoNothing, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT my_constraint ON (node:Label) ASSERT EXISTS (node.prop)") {
    yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), Some("my_constraint"), ast.IfExistsThrowError, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE OR REPLACE CONSTRAINT my_constraint ON (node:Label) ASSERT EXISTS (node.prop)") {
    yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), Some("my_constraint"), ast.IfExistsReplace, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE OR REPLACE CONSTRAINT my_constraint IF NOT EXISTS ON (node:Label) ASSERT EXISTS (node.prop)") {
    yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), Some("my_constraint"), ast.IfExistsInvalidSyntax, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT my_constraint IF NOT EXISTS ON (node:Label) ASSERT EXISTS (node.prop)") {
    yields(ast.CreateNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop"), Some("my_constraint"), ast.IfExistsDoNothing, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT `$my_constraint` ON ()-[r:R]-() ASSERT EXISTS (r.prop)") {
    yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), Some("$my_constraint"), ast.IfExistsThrowError, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT my_constraint ON ()-[r:R]-() ASSERT EXISTS (r.prop) OPTIONS {}") {
    yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), Some("my_constraint"), ast.IfExistsThrowError, OptionsMap(Map.empty), containsOn = true, ConstraintVersion0))
  }

  test("CREATE OR REPLACE CONSTRAINT `$my_constraint` ON ()-[r:R]-() ASSERT EXISTS (r.prop)") {
    yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), Some("$my_constraint"), ast.IfExistsReplace, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE OR REPLACE CONSTRAINT `$my_constraint` IF NOT EXISTS ON ()-[r:R]->() ASSERT EXISTS (r.prop)") {
    yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), Some("$my_constraint"), ast.IfExistsInvalidSyntax, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT `$my_constraint` IF NOT EXISTS ON ()<-[r:R]-() ASSERT EXISTS (r.prop)") {
    yields(ast.CreateRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop"), Some("$my_constraint"), ast.IfExistsDoNothing, NoOptions, containsOn = true, ConstraintVersion0))
  }

  test("CREATE CONSTRAINT ON (node:Label) ASSERT node.prop IS NODE KEY") {
    failsToParse
  }

  test("CREATE CONSTRAINT ON (node:Label) ASSERT (node.prop) IS NODE KEY {indexProvider : 'native-btree-1.0'}") {
    failsToParse
  }

  test("CREATE CONSTRAINT ON (node:Label) ASSERT (node.prop) IS NODE KEY OPTIONS") {
    failsToParse
  }

  test("CREATE CONSTRAINT ON (node:Label) ASSERT node.prop.part IS UNIQUE") {
    failsToParse
  }

  test("CREATE CONSTRAINT ON (node:Label) ASSERT (node.prop.part) IS UNIQUE") {
    failsToParse
  }

  test("CREATE CONSTRAINT ON (node:Label) ASSERT (node.prop) IS UNIQUE {indexProvider : 'native-btree-1.0'}") {
    failsToParse
  }

  test("CREATE CONSTRAINT ON (node:Label) ASSERT (node.prop1, node.prop2) IS UNIQUE OPTIONS") {
    failsToParse
  }

  test("CREATE CONSTRAINT ON (node:Label) ASSERT EXISTS node.prop") {
    failsToParse
  }

  test("CREATE CONSTRAINT my_constraint ON (node:Label) ASSERT EXISTS (node.prop) IS NOT NULL") {
    failsToParse
  }

  test("CREATE CONSTRAINT ON ()-[r:R]-() ASSERT EXISTS r.prop") {
    failsToParse
  }

  test("CREATE CONSTRAINT my_constraint ON ()-[r:R]-() ASSERT r.prop IS NULL") {
    failsToParse
  }

  test("CREATE CONSTRAINT my_constraint ON (node:Label) ASSERT node.prop IS NULL") {
    failsToParse
  }

  test("CREATE CONSTRAINT my_constraint ON ()-[r:R]-() ASSERT EXISTS (r.prop) IS NOT NULL") {
    failsToParse
  }

  test("CREATE CONSTRAINT $my_constraint ON ()-[r:R]-() ASSERT EXISTS (r.prop)") {
    failsToParse
  }

  test("CREATE CONSTRAINT FOR (node:Label) REQUIRE EXISTS (node.prop)") {
    failsToParse
  }

  test("CREATE CONSTRAINT FOR ()-[r:R]-() REQUIRE EXISTS (r.prop)") {
    failsToParse
  }

  test("CREATE CONSTRAINT FOR FOR (node:Label) REQUIRE (node.prop) IS NODE KEY") {
    // fails on second FOR since it doesn't think the first is the name but the keyword
    failsToParse
  }

  test("CREATE CONSTRAINT FOR FOR (node:Label) REQUIRE (node.prop) IS UNIQUE") {
    // fails on second FOR since it doesn't think the first is the name but the keyword
    failsToParse
  }

  test("CREATE CONSTRAINT FOR FOR (node:Label) REQUIRE node.prop IS NOT NULL") {
    // fails on second FOR since it doesn't think the first is the name but the keyword
    failsToParse
  }

  test("CREATE CONSTRAINT FOR FOR ()-[r:R]-() REQUIRE (r.prop) IS NOT NULL") {
    // fails on second FOR since it doesn't think the first is the name but the keyword
    failsToParse
  }

  // Drop constraint

  test("DROP CONSTRAINT ON (node:Label) ASSERT (node.prop) IS NODE KEY") {
    yields(ast.DropNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop"))))
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT (node.prop1,node.prop2) IS NODE KEY") {
    yields(ast.DropNodeKeyConstraint(varFor("node"), labelName("Label"),
      Seq(prop("node", "prop1"), prop("node", "prop2"))))
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT node.prop IS UNIQUE") {
    yields(ast.DropUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop"))))
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT (node.prop) IS UNIQUE") {
    yields(ast.DropUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "prop"))))
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT (node.prop1,node.prop2) IS UNIQUE") {
    yields(ast.DropUniquePropertyConstraint(varFor("node"), labelName("Label"),
      Seq(prop("node", "prop1"), prop("node", "prop2"))))
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT EXISTS (node.prop)") {
    yields(ast.DropNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "prop")))
  }

  test("DROP CONSTRAINT ON ()-[r:R]-() ASSERT EXISTS (r.prop)") {
    yields(ast.DropRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop")))
  }

  test("DROP CONSTRAINT ON ()-[r:R]->() ASSERT EXISTS (r.prop)") {
    yields(ast.DropRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop")))
  }

  test("DROP CONSTRAINT ON ()<-[r:R]-() ASSERT EXISTS (r.prop)") {
    yields(ast.DropRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "prop")))
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT node.prop IS NODE KEY") {
    failsToParse
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT EXISTS node.prop") {
    failsToParse
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT (node.prop) IS NOT NULL") {
    failsToParse
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT node.prop IS NOT NULL") {
    failsToParse
  }

  test("DROP CONSTRAINT ON ()-[r:R]-() ASSERT EXISTS r.prop") {
    failsToParse
  }

  test("DROP CONSTRAINT ON ()-[r:R]-() ASSERT (r.prop) IS NOT NULL") {
    failsToParse
  }

  test("DROP CONSTRAINT ON ()-[r:R]-() ASSERT r.prop IS NOT NULL") {
    failsToParse
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT (node.EXISTS) IS NODE KEY") {
    yields(ast.DropNodeKeyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "EXISTS"))))
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT (node.EXISTS) IS UNIQUE") {
    yields(ast.DropUniquePropertyConstraint(varFor("node"), labelName("Label"), Seq(prop("node", "EXISTS"))))
  }

  test("DROP CONSTRAINT ON (node:Label) ASSERT EXISTS (node.EXISTS)") {
    yields(ast.DropNodePropertyExistenceConstraint(varFor("node"), labelName("Label"), prop("node", "EXISTS")))
  }

  test("DROP CONSTRAINT ON ()-[r:R]-() ASSERT EXISTS (r.EXISTS)") {
    yields(ast.DropRelationshipPropertyExistenceConstraint(varFor("r"), relTypeName("R"), prop("r", "EXISTS")))
  }

  test("DROP CONSTRAINT my_constraint") {
    yields(ast.DropConstraintOnName("my_constraint", ifExists = false))
  }

  test("DROP CONSTRAINT `$my_constraint`") {
    yields(ast.DropConstraintOnName("$my_constraint", ifExists = false))
  }

  test("DROP CONSTRAINT my_constraint IF EXISTS") {
    yields(ast.DropConstraintOnName("my_constraint", ifExists = true))
  }

  test("DROP CONSTRAINT $my_constraint") {
    failsToParse
  }

  test("DROP CONSTRAINT my_constraint ON (node:Label) ASSERT (node.prop1,node.prop2) IS NODE KEY") {
    failsToParse
  }
}
