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
package org.neo4j.cypher.internal.frontend

import org.neo4j.cypher.internal.frontend.FoldableTest.Add
import org.neo4j.cypher.internal.frontend.FoldableTest.Sum
import org.neo4j.cypher.internal.frontend.FoldableTest.Val
import org.neo4j.cypher.internal.util.Foldable
import org.neo4j.cypher.internal.util.Foldable.SkipChildren
import org.neo4j.cypher.internal.util.Foldable.TraverseChildren
import org.neo4j.cypher.internal.util.Foldable.TraverseChildrenNewAccForSiblings
import org.neo4j.cypher.internal.util.Foldable.TreeAny
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

import scala.collection.convert.Wrappers.JListWrapper

object FoldableTest {
  trait Exp extends Foldable
  case class Val(int: Int) extends Exp
  case class Add(lhs: Exp, rhs: Exp) extends Exp
  case class Sum(args: Seq[Exp]) extends Exp
}

class FoldableTest extends CypherFunSuite {

  test("should fold value depth first over object tree") {
    val ast = Add(Val(55), Add(Val(43), Val(52)))

    val result = ast.fold(50) {
      case Val(x) => acc => acc + x
    }

    assert(result === 200)
  }

  test("should fold by depth then breadth left to right") {
    val ast = Add(Val(1), Add(Add(Val(2), Val(3)), Val(4)))

    val result = ast.fold(Seq.empty[Int]) {
      case Val(x) => acc => acc :+ x
    }

    assert(result === Seq(1, 2, 3, 4))
  }

  test("should tree fold over all objects") {
    val ast = Add(Val(55), Add(Val(43), Val(52)))

    val result = ast.treeFold(50) {
      case Val(x) => acc => TraverseChildren(acc + x)
    }

    result should be(50 + 55 + 43 + 52)
  }

  test("should be able to stop-recursion in tree fold") {
    val ast = Add(Val(55), Add(Val(43), Val(52)))

    val result = ast.treeFold(50) {
      case Val(x) => acc => TraverseChildren(acc + x)
      case Add(Val(43), _) => acc => SkipChildren(acc + 20)
    }

    result should be(50 + 55 + 20)
  }

  test("should be able merge accumulators in tree fold") {
    val ast = Sum(Seq(Val(55), Add(Val(43), Val(52)), Val(10)))

    val result = ast.treeFold(50) {
      case Val(x) => acc => TraverseChildren(acc + x)
      case Add(_, _) => acc => TraverseChildrenNewAccForSiblings(acc, acc => acc * 2)
    }

    result should be((50 + 55 + 43 + 52) * 2 + 10)
  }

  test("should reverse tree fold over all objects") {
    val ast = Add(Val(55), Add(Val(43), Val(52)))

    val result = ast.reverseTreeFold("x") {
      case Val(x) => acc => TraverseChildren(acc + "|" + x)
    }

    result should be("x|52|43|55")
  }

  test("should be able to stop-recursion in reverse tree fold") {
    val ast = Add(Val(55), Add(Val(43), Val(52)))

    val result = ast.reverseTreeFold("x") {
      case Val(x) => acc => TraverseChildren(acc + "|" + x)
      case Add(Val(43), _) => acc => SkipChildren(acc + "<>")
    }

    result should be("x<>|55")
  }

  test("should be able merge accumulators in reverse tree fold") {
    val ast = Sum(Seq(Val(55), Add(Val(43), Val(52)), Val(10)))

    val result = ast.reverseTreeFold("x") {
      case Val(x) => acc => TraverseChildren(acc + "|" + x)
      case Add(_, _) => acc => TraverseChildrenNewAccForSiblings(acc + ">", acc => acc + "<")
    }

    result should be("x|10>|52|43<|55")
  }

  test("should allow using exist to find patterns deeply nested") {
    val ast = Add(Val(1), Add(Val(2), Val(3)))

    ast.treeExists {
      case Val(x) => x == 2
    } should equal(true)

    ast.treeExists {
      case Val(x) => x == 42
    } should equal(false)
  }

  test("should get children") {
    val ast = Add(Val(1), Add(Val(2), Val(3)))

    ast.treeChildren.toList shouldEqual (Seq(Val(1), Add(Val(2), Val(3))))
  }

  test("should get children in reverse") {
    val ast = Add(Val(1), Add(Val(2), Val(3)))

    ast.reverseTreeChildren.toList shouldEqual (Seq(Add(Val(2), Val(3)), Val(1)))
  }

  test("should get children in list") {
    val ast = Seq(Val(1), Add(Val(2), Val(3)))

    ast.treeChildren.toList shouldEqual (Seq(Val(1), Add(Val(2), Val(3))))
  }

  test("should get children in list in reverse") {
    val ast = Seq(Val(1), Add(Val(2), Val(3)))

    ast.reverseTreeChildren.toList shouldEqual (Seq(Add(Val(2), Val(3)), Val(1)))
  }

  test("should get children in wrapping list") {
    val ast = JListWrapper(java.util.List.of(Val(1), Add(Val(2), Val(3))))

    ast.treeChildren.toList shouldEqual (Seq(Val(1), Add(Val(2), Val(3))))
  }

  test("should get children in wrapping list in reverse") {
    val ast = JListWrapper(java.util.List.of(Val(1), Add(Val(2), Val(3))))

    ast.reverseTreeChildren.toList shouldEqual (Seq(Add(Val(2), Val(3)), Val(1)))
  }

  test("should get children in Vector") {
    val ast = Vector(Val(1), Add(Val(2), Val(3)))

    ast.treeChildren.toList shouldEqual (Seq(Val(1), Add(Val(2), Val(3))))
  }

  test("should get children in Vector in reverse") {
    val ast = Vector(Val(1), Add(Val(2), Val(3)))

    ast.reverseTreeChildren.toList shouldEqual (Seq(Add(Val(2), Val(3)), Val(1)))
  }

  test("should get children in colon list") {
    val list = List(Val(1), Add(Val(2), Val(3)))

    list.treeChildren.toList shouldEqual List(Val(1), Add(Val(2), Val(3)))
  }

  test("should get children in colon in reverse") {
    val list = List(Val(1), Add(Val(2), Val(3)))

    list.reverseTreeChildren.toList shouldEqual (List(Add(Val(2), Val(3)), Val(1)))
  }

  test("should get children in Option") {
    val ast = Some(Val(1))

    ast.treeChildren.toList shouldEqual (Seq(Val(1)))
  }

  test("should get children in Option in reverse") {
    val ast = Some(Val(1))

    ast.reverseTreeChildren.toList shouldEqual (Seq(Val(1)))
  }

  test("should not get any children in empty lists") {
    val astEmptyList = Seq.empty[FoldableTest]
    val astEmptyOption = Option.empty[FoldableTest]
    val astEmptyWrappingList = JListWrapper(java.util.List.of[FoldableTest]())
    val astEmptyVector = Vector.empty[FoldableTest]

    astEmptyList.treeChildren.toList shouldEqual Seq.empty
    astEmptyList.reverseTreeChildren.toList shouldEqual Seq.empty
    astEmptyOption.treeChildren.toList shouldEqual Seq.empty
    astEmptyOption.reverseTreeChildren.toList shouldEqual Seq.empty
    astEmptyWrappingList.treeChildren.toList shouldEqual Seq.empty
    astEmptyWrappingList.reverseTreeChildren.toList shouldEqual Seq.empty
    astEmptyVector.treeChildren.toList shouldEqual Seq.empty
    astEmptyVector.reverseTreeChildren.toList shouldEqual Seq.empty
  }
}
