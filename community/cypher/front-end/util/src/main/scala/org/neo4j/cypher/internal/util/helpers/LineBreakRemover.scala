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
package org.neo4j.cypher.internal.util.helpers

import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.topDown

import java.util.regex.Pattern

object LineBreakRemover {
  private val lineBreaksPattern: Pattern = Pattern.compile("[\n\r]")

  private val removeLineBreaksRewriter = topDown(Rewriter.lift {
    case s: String => removeLineBreaks(s)
  })

  def removeLineBreaks(s: String): String =
    lineBreaksPattern.matcher(s).replaceAll("")

  /**
   * Removes line breaks from any Strings found while traversing the tree of the given argument.
   */
  def removeLineBreaksOnTree[M <: AnyRef](a: M): M = {
    removeLineBreaksRewriter.apply(a).asInstanceOf[M]
  }

}
