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
package org.neo4j.cypher.internal.rewriting.rewriters

import org.neo4j.cypher.internal.rewriting.AstRewritingMonitor
import org.neo4j.cypher.internal.util.ASTNode
import org.neo4j.cypher.internal.util.Foldable.FoldableAny
import org.neo4j.cypher.internal.util.Foldable.TraverseChildren
import org.neo4j.cypher.internal.util.Rewriter

import scala.annotation.tailrec

/*
This rewriter tries to limit rewriters that grow the product AST too much
 */
case class repeatWithSizeLimit(rewriter: Rewriter)(implicit val monitor: AstRewritingMonitor) extends Rewriter {

  private def astNodeSize(value: Any): Int = value.treeFold(1) {
    case _: ASTNode => acc => TraverseChildren(acc + 1)
  }

  final def apply(that: AnyRef): AnyRef = {
    val initialSize = astNodeSize(that)
    val limit = initialSize * initialSize

    innerApply(that, limit)
  }

  @tailrec
  private def innerApply(that: AnyRef, limit: Int): AnyRef = {
    val t = rewriter.apply(that)
    val newSize = astNodeSize(t)

    if (newSize > limit) {
      monitor.abortedRewriting(that)
      that
    }
    else if (t == that) {
      t
    }
    else {
      innerApply(t, limit)
    }
  }
}
