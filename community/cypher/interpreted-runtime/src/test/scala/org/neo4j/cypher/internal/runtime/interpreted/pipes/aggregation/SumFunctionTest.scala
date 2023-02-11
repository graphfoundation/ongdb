/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.cypher.internal.runtime.interpreted.pipes.aggregation

import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.exceptions.CypherTypeException
import org.neo4j.exceptions.InvalidArgumentException
import org.neo4j.values.storable.DoubleValue
import org.neo4j.values.storable.DurationValue
import org.neo4j.values.storable.LongValue
import org.neo4j.values.storable.Values
import org.neo4j.values.storable.Values.NO_VALUE
import org.neo4j.values.storable.Values.doubleValue
import org.neo4j.values.storable.Values.intValue
import org.neo4j.values.storable.Values.longValue
import org.neo4j.values.storable.Values.stringValue

class SumFunctionTest extends CypherFunSuite with AggregateTest {
  def createAggregator(inner: Expression) = new SumFunction(inner)

  test("singleValueReturnsThatNumber") {
    val result = aggregateOn(longValue(1))

    result should equal(longValue(1))
    result shouldBe a [LongValue]
  }

  test("singleValueReturnsThatDuration") {
    val durationValue = DurationValue.duration(0, 0, 0, 1)
    val result = aggregateOn(durationValue)

    result should equal(durationValue)
  }

  test("twoValuesReturnsDuration") {
    val durationValue = DurationValue.duration(0, 0, 0, 1)
    val durationValue2 = DurationValue.duration(0, 0, 1, 1)
    val result = aggregateOn(durationValue, durationValue2)

    result should equal(DurationValue.duration(0,0,1,2))
  }

  test("cantMixDurationAndNumber") {
    val durationValue = DurationValue.duration(0, 0, 0, 1)
    val numberValue = longValue(1)
    a[CypherTypeException] shouldBe thrownBy{
      aggregateOn(durationValue, numberValue)
    }
  }

  test("catches duration overflows") {
    val durationValue = DurationValue.duration(0, 0, Long.MaxValue, 0)
    an[InvalidArgumentException] shouldBe thrownBy{
      aggregateOn(durationValue, durationValue)
    }
  }

  test("singleValueOfDecimalReturnsDecimal") {
    val result = aggregateOn(doubleValue(1.0d))

    result should equal(doubleValue(1.0))
    result shouldBe a [DoubleValue]
  }

  test("mixOfIntAndDoubleYieldsDouble") {
    val result = aggregateOn(intValue(1), doubleValue(1.0d))

    result should equal(doubleValue(2.0))
    result shouldBe a [DoubleValue]
  }

  test("mixedLotsOfStuff") {
    val result = aggregateOn(Values.byteValue(1.byteValue()), Values.shortValue(1.shortValue()))

    result should equal(longValue(2))
    result shouldBe a [LongValue]
  }

  test("noNumbersEqualsZero") {
    val result = aggregateOn()

    result should equal(longValue(0))
    result shouldBe a [LongValue]
  }

  test("nullDoesNotChangeTheSum") {
    val result = aggregateOn(intValue(1), NO_VALUE)

    result should equal(longValue(1))
    result shouldBe a [LongValue]
  }

  test("noNumberValuesThrowAnException") {
    intercept[CypherTypeException](aggregateOn(intValue(1), stringValue("wut")))
  }

  test("intOverflowTransformsSumToLong") {
    val halfInt= Int.MaxValue
    val result = aggregateOn(intValue(halfInt), intValue(halfInt), intValue(halfInt))
    val expected = 3L * halfInt
    result should equal(longValue(expected))
  }

  test("typesArentUnnecessaryWidened") {
    val thirdOfMaxInt: Int = Int.MaxValue / 3
    val result = aggregateOn(intValue(thirdOfMaxInt), intValue(thirdOfMaxInt))
    val expected = thirdOfMaxInt + thirdOfMaxInt
    result should equal(longValue(expected))
    result shouldBe a [LongValue]
  }
}
