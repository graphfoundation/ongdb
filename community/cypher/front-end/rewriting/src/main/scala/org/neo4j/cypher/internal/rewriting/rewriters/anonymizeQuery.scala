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
package org.neo4j.cypher.internal.rewriting.rewriters

import org.neo4j.cypher.internal.ast.CreateConstraint
import org.neo4j.cypher.internal.ast.CreateIndex
import org.neo4j.cypher.internal.ast.DropConstraintOnName
import org.neo4j.cypher.internal.ast.DropIndexOnName
import org.neo4j.cypher.internal.ast.UnaliasedReturnItem
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.LabelName
import org.neo4j.cypher.internal.expressions.LabelOrRelTypeName
import org.neo4j.cypher.internal.expressions.Parameter
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.RelTypeName
import org.neo4j.cypher.internal.expressions.StringLiteral
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.bottomUp

/**
 * Anonymizer which renames tokens and cypher parts using some scheme. All renames have to be reproducible and
 * unique to create a valid query.
 *
 * The intended usage of this rewriter is for anonymizing queries before storage, to avoid retaining domain specific
 * information which could harm the operation or integrity of the original cypher deployment. This anonymization would
 * execucted by 1) parsing the query, 2) running the rewriter, and 3) writing the query back to string form
 * using the Prettifier.
 */
trait Anonymizer {
  def variable(name: String): String
  def unaliasedReturnItemName(anonymizedExpression: Expression, input: String): String
  def label(name: String): String
  def relationshipType(name: String): String
  def labelOrRelationshipType(name: String): String
  def propertyKey(name: String): String
  def parameter(name: String): String
  def literal(value: String): String
  def indexName(name: String): String
  def constraintName(name: String): String
}

case class anonymizeQuery(anonymizer: Anonymizer) extends Rewriter {

  def apply(that: AnyRef): AnyRef = instance.apply(that)

  private val instance: Rewriter = bottomUp(Rewriter.lift {
    case v: Variable => Variable(anonymizer.variable(v.name))(v.position)
    case x: UnaliasedReturnItem => UnaliasedReturnItem(x.expression, anonymizer.unaliasedReturnItemName(x.expression, x.inputText))(x.position)
    case x: LabelName => LabelName(anonymizer.label(x.name))(x.position)
    case x: RelTypeName => RelTypeName(anonymizer.relationshipType(x.name))(x.position)
    case x: LabelOrRelTypeName => LabelOrRelTypeName(anonymizer.labelOrRelationshipType(x.name))(x.position)
    case x: PropertyKeyName => PropertyKeyName(anonymizer.propertyKey(x.name))(x.position)
    case x: Parameter => Parameter(anonymizer.parameter(x.name), x.parameterType)(x.position)
    case x: StringLiteral => StringLiteral(anonymizer.literal(x.value))(x.position)
    case x: CreateIndex => x.withName(x.name.map(anonymizer.indexName))
    case x: DropIndexOnName => x.copy(name = anonymizer.indexName(x.name))(x.position)
    case x: CreateConstraint => x.withName(x.name.map(anonymizer.constraintName))
    case x: DropConstraintOnName => x.copy(name = anonymizer.constraintName(x.name))(x.position)
  })
}
