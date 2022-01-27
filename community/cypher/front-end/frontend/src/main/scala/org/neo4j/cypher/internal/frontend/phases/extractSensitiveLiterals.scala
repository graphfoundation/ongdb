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

import org.neo4j.cypher.internal.expressions.Literal
import org.neo4j.cypher.internal.frontend.phases.CompilationPhaseTracer.CompilationPhase.AST_REWRITE
import org.neo4j.cypher.internal.rewriting.rewriters.LiteralsAreAvailable
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.StepSequencer
import org.neo4j.cypher.internal.util.StepSequencer.Step
import org.neo4j.cypher.internal.util.bottomUp

/**
 * Extracts all literals of the query and replaces them with `SensitiveLiteral`
 */
case object extractSensitiveLiterals extends Phase[BaseContext, BaseState, BaseState] with Step {

  override def process(from: BaseState,
                       context: BaseContext): BaseState = {
    val rewriter: Rewriter = bottomUp(Rewriter.lift {
      case l: Literal => l.asSensitiveLiteral
    })
    from.withStatement(from.statement().endoRewrite(rewriter))
  }

  override def phase = AST_REWRITE
  override def preConditions: Set[StepSequencer.Condition] = Set(LiteralsAreAvailable)
  override def postConditions: Set[StepSequencer.Condition] = Set.empty
  override def invalidatedConditions: Set[StepSequencer.Condition] = Set.empty
}
