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
package org.neo4j.cypher.internal.options

import magnolia.CaseClass
import magnolia.Magnolia

import scala.language.experimental.macros


/**
 * Creates cache key strings from values
 */
trait OptionCacheKey[T] {
  def cacheKey(value: T): String
}

object OptionCacheKey {

  def create[T](func: T => String): OptionCacheKey[T] =
    (value: T) => func(value)

  // Magnolia generic derivation
  // Check out the tutorial at https://propensive.com/opensource/magnolia/tutorial

  type Typeclass[T] = OptionCacheKey[T]

  /**
   * Generic OptionCacheKey for any case class (given that there are OptionCacheKey:s for all its parameter types)
   * that combines smaller cache keys into a space-separated string
   */
  def combine[T](caseClass: CaseClass[OptionCacheKey, T]): OptionCacheKey[T] =
    (value: T) => caseClass.parameters
                           .map(param => param.typeclass.cacheKey(param.dereference(value)))
                           .filterNot(_.isBlank)
                           .mkString(" ")

  def derive[T]: OptionCacheKey[T] = macro Magnolia.gen[T]
}
