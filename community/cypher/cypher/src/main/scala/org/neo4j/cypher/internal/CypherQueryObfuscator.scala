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
package org.neo4j.cypher.internal

import org.neo4j.cypher.internal.util.ObfuscationMetadata
import org.neo4j.kernel.api.query.QueryObfuscator
import org.neo4j.values.storable.Values.utf8Value
import org.neo4j.values.virtual.MapValue

class CypherQueryObfuscator(state: ObfuscationMetadata) extends QueryObfuscator {

  override def obfuscateText(rawQueryText: String): String =
    if (state.sensitiveLiteralOffsets.isEmpty)
      rawQueryText
    else {
      val sb = new StringBuilder()
      var i = 0
      val adjacentCharacters = rawQueryText.sliding(2).toVector
      for (literalOffset <- state.sensitiveLiteralOffsets) {
        val start = literalOffset.start
        if (start >= rawQueryText.length || start < i)
          throw new IllegalStateException(s"Literal offset out of bounds: $literalOffset.")

        sb.append(rawQueryText.substring(i, start))
        sb.append(CypherQueryObfuscator.OBFUSCATED_LITERAL)
        i = start + literalOffset.length.getOrElse(literalStringLength(adjacentCharacters, rawQueryText, start))
      }
      if (i < rawQueryText.length)
        sb.append(rawQueryText.substring(i))

      sb.toString()
    }

  override def obfuscateParameters(rawQueryParameters: MapValue): MapValue =
    if (state.sensitiveParameterNames.isEmpty)
      rawQueryParameters
    else {
      var params = rawQueryParameters
      for (p <- state.sensitiveParameterNames)
        params = params.updatedWith(p, CypherQueryObfuscator.OBFUSCATED)
      params
    }

  //We don't know the length of strings ahead of time since the amount of characters they use in the raw query text
  //depends on if we use single quotes or double quotes.
  private def literalStringLength(adjacentCharacters: Seq[String], rawQueryText: String, fromIndex: Int): Int = {
    val openingQuote = rawQueryText(fromIndex)
    if (openingQuote != '"' && openingQuote != '\'')
      throw new IllegalStateException(s"Expected opening quote at offset $fromIndex.")

    val lastCharacterIndex = adjacentCharacters.indexWhere(s => s(0) != '\\' && s(1) == openingQuote, fromIndex)
    if (lastCharacterIndex == -1)
      throw new IllegalStateException("Expected to find closing quote.")

    lastCharacterIndex - fromIndex + 2 // + 2 to account for quotes
  }
}

object CypherQueryObfuscator {
  private val OBFUSCATED_LITERAL = "******"
  private val OBFUSCATED = utf8Value(OBFUSCATED_LITERAL)

  def apply(obfuscationMetadata: ObfuscationMetadata): QueryObfuscator =
    if (obfuscationMetadata.isEmpty) QueryObfuscator.PASSTHROUGH else new CypherQueryObfuscator(obfuscationMetadata)
}
