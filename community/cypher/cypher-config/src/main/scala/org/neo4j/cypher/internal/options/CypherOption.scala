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

import org.neo4j.configuration.Config
import org.neo4j.cypher.internal.config.CypherConfiguration
import org.neo4j.graphdb.config.Setting

object CypherOption {
  val DEFAULT: String = "default"
}

/**
 * Represents values of cypher options, like `4.3` in `CYPHER 4.3`
 *
 * @param inputName Used to parse values and in error messages etc.
 */
abstract class CypherOption(inputName: String) {
  /** The canonical name for this value */
  val name: String = OptionReader.canonical(inputName)

  /** The companion object to this option type */
  def companion: CypherOptionCompanion[_ <: CypherOption]

  /** Renders this option value to a string */
  def render: String = if (this == companion.default) "" else name

  /** Renders this option value to a string for use in query cache keys */
  def cacheKey: String = render
}

/**
 * Represents values of key-value cypher options, like `bar` in `CYPHER foo=bar`
 *
 * @param inputName Used to parse values and in error messages etc.
 */
abstract class CypherKeyValueOption(inputName: String) extends CypherOption(inputName) {
  override def render: String = if (this == companion.default) "" else s"${companion.name}=$name"
}

/**
 * Used to define the range of values for a cypher option, and the sources that determine its value
 *
 * @param name                 Name of this option, like `foo` in `foo=bar`
 * @param setting              A setting, if this option can also be set in config
 * @param cypherConfigField    A function to fetch the value of this option from CypherConfiguration, if this option can also be set in config
 * @param cypherConfigBooleans A map of values to booleans in CypherConfiguration that sets those values (used for debug options)
 * @tparam Opt                 The corresponding option value type
 */
abstract class CypherOptionCompanion[Opt <: CypherOption](
  val name: String,
  setting: Option[Setting[_]] = None,
  cypherConfigField: Option[CypherConfiguration => Opt] = None,
  cypherConfigBooleans: Map[Opt, CypherConfiguration => Boolean] = Map.empty[Opt, CypherConfiguration => Boolean],
) {
  self: Product =>

  private val key = OptionReader.canonical(name)

  /**
   * The default value for this option
   */
  def default: Opt

  /**
   * The set of all values for this option
   *
   * When overriding this, make sure it is not defined as val, to avoid hitting this:
   * https://stackoverflow.com/questions/28151338/case-object-gets-initialized-to-null-how-is-that-even-possible
   */
  def values: Set[Opt]

  /**
   * Read this option from config
   */
  def fromConfig(configuration: Config): Opt = {
    setting.map(s => configuration.get(s))
           .map(_.toString)
           .map(fromValue)
           .getOrElse(default)
  }

  /**
   * An OptionReader for reading exactly one value of this option
   * Fails if there are more than one.
   */
  def singleOptionReader(): OptionReader[Opt] =
    (input: OptionReader.Input) =>
      input.extract(key)
           .map(values => fromValues(values).headOption)
           .map(value => value.getOrElse(fromCypherConfiguration(input.config)))

  /**
   * An OptionReader for reading all values of this option
   */
  def multiOptionReader(): OptionReader[Set[Opt]] =
    (input: OptionReader.Input) =>
      input.extract(key)
           .map(values => values.map(fromValue))
           .map(opts => opts ++ fromCypherConfigurationBooleans(input.config))

  private def fromCypherConfiguration(configuration: CypherConfiguration): Opt =
    cypherConfigField.map(f => f(configuration))
                     .getOrElse(default)

  private def fromCypherConfigurationBooleans(configuration: CypherConfiguration): Set[Opt] =
    cypherConfigBooleans.toSet.collect(fromCypherConfigurationBoolean(configuration))

  private def fromCypherConfigurationBoolean(configuration: CypherConfiguration): PartialFunction[(Opt, CypherConfiguration => Boolean), Opt] = {
    case (opt, cond) if cond(configuration) => opt
  }

  private def fromValues(input: Set[String]): Set[Opt] = input.size match {
    case 0 => Set.empty
    case 1 => Set(fromValue(input.head))
    case _ => conflictingValuesError()
  }

  protected def fromValue(input: String): Opt = OptionReader.canonical(input) match {
    case CypherOption.DEFAULT => default
    case value                => values.find(_.name == value).getOrElse(invalidValueError(input))

  }

  private def invalidValueError(input: String): Nothing =
    throw new InvalidCypherOption(s"$input is not a valid option for $name. Valid options are: ${values.map(_.name).mkString(", ")}")

  private def conflictingValuesError(): Nothing =
    throw new InvalidCypherOption(s"Can't specify multiple conflicting values for $name")
}
