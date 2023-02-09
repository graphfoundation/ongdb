/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.cypher.internal.frontend.phases

import org.neo4j.cypher.internal.rewriting.ValidatingCondition
import org.neo4j.cypher.internal.util.StepSequencer

case class StatementCondition(inner: ValidatingCondition) extends ValidatingCondition {
  override def apply(state: Any): Seq[String] = state match {
    case s: BaseState => inner(s.statement())
    case x => throw new IllegalStateException(s"Unknown state: $x")
  }

  override def name: String = productPrefix
}

object StatementCondition {
  /**
   * Conditions that during Rewriting check the statement need to be checked on the Statement only.
   * When checking these same conditions during higher-level phases, we need to wrap ValidatingCondition in StatementCondition.
   */
  def wrap(condition: StepSequencer.Condition): StepSequencer.Condition = {
    condition match {
      case vc: ValidatingCondition => StatementCondition(vc)
      case _ => condition
    }
  }
}
