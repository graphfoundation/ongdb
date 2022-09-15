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
package org.neo4j.cypher.internal.util

import scala.util.hashing.MurmurHash3

// Freely after the ATOM idea presented by Daniel Spiewak (@djspiewak) in
// the video "Functional Compilers: From CFG to EXE"
// This is a wrapper that allows values to be set multiple times, but can be trusted to never change once seen.
final class Unchangeable[A]() {
  private var _seen = false
  private var _value: Option[A] = None

  def hasValue: Boolean = _value.isDefined

  // Getter
  def value: A = {
    val result = _value.getOrElse(throw new IllegalStateException("Value still not set"))
    _seen = true
    result
  }

  // Setter
  def value_=(newValue: A): Unit = {
    if (_seen) throw new IllegalStateException("Can't change a seen value")
    _value = Some(newValue)
  }

  override def clone(): Unchangeable[A] = {
    val unchangeable = new Unchangeable[A]()
    unchangeable._value = _value
    unchangeable._seen = _seen
    unchangeable
  }

  // Copy from another Unchangeable[A] iff set
  def copyFrom(other: Unchangeable[A]): Unit = if(other.hasValue)
    value_=(other.value)

  override def toString: String = s"Unchangeable(${_value.getOrElse("NOT SET")})"

  override def hashCode(): Int = MurmurHash3.productHash((_seen, _value))

  def valueHashCode(): Int = _value.hashCode()

  override def equals(obj: Any): Boolean = {
    obj match {
      case that:Unchangeable[_] =>
        if (this eq that) return true
        this._seen == that._seen && this._value == that._value
      case _ => false
    }
  }
}
