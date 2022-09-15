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
package org.neo4j.cypher.internal.util.helpers

import org.neo4j.cypher.internal.util.helpers.Tapper.Tapped
import org.neo4j.cypher.internal.util.helpers.Tapper.TappedOption
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class TreeZipperTest extends CypherFunSuite {

  case class TestElem(name: String, children: Seq[TestElem]) extends TreeElem[TestElem] {
    def updateChildren(newChildren: Seq[TestElem]): TestElem = copy(children = newChildren.toVector)
  }

  implicit object TestElemZipper extends TreeZipper[TestElem]

  val grandChild1 = TestElem("grandchild1", Seq())
  val grandChild2 = TestElem("grandchild2", Seq())
  val child1 = TestElem("child1", Seq(grandChild1, grandChild2))
  val child2 = TestElem("child2", Seq())
  val child3 = TestElem("child3", Seq())
  val child4 = TestElem("child4", Seq())
  val root = TestElem("parent", Seq(child1, child2, child3, child4))

  test("Can get location in a single element tree") {
    root.location.elem should equal(root)
  }

  test("Can navigate to root of tree") {
    root.location.down.down.up.up.elem.get should equal(root)
  }

  test("Can navigate rightMost across children") {
    root.location.down.rightMost.elem.get should equal(child4)
  }

  test("Can navigate right across children") {
    root.location
      .down.tap { _.elem should equal(Some(child1)) }
      .right.tap { _.elem should equal(Some(child2)) }
      .right.tap { _.elem should equal(Some(child3)) }
      .right.tap { _.elem should equal(Some(child4)) }
  }

  test("Can navigate leftMost across children") {
    root.location.down.right.right.right.leftMost.elem should equal(Some(child1))
  }

  test("Can navigate left across children") {
    root.location
      .down.rightMost.tap { _.elem should equal(Some(child4)) }
      .left.tap { _.elem should equal(Some(child3)) }
      .left.tap { _.elem should equal(Some(child2)) }
      .left.tap { _.elem should equal(Some(child1)) }
  }

  test("Can get and change left list") {
    val elem = root.location.down.right.right.get //child3
    elem.leftList should equal(List(child2, child1))

    val elemWithNewLeft = elem.replaceLeftList(List(child4, child2))
    elemWithNewLeft.leftList should equal(List(child4, child2))
    elemWithNewLeft.right.leftList should equal(Some(List(child3, child4, child2)))
  }

  test("Correctly infers tree structure") {
    def assertRole(location: TestElemZipper.Location, isRoot: Boolean, isLeftMost: Boolean, isRightMost: Boolean, isLeaf: Boolean): Unit = {
      location.isRoot should equal(isRoot)
      location.isLeftMost should equal(isLeftMost)
      location.isRightMost should equal(isRightMost)
      location.isLeaf should equal(isLeaf)
      location.root.elem should equal(root)
    }

    root
      // root
      .location.tap { assertRole(_, isRoot = true, isLeftMost = true, isRightMost = true, isLeaf = false) }

      // child1
      .down.tapSomeOrFail { assertRole(_, isRoot = false, isLeftMost = true, isRightMost = false, isLeaf = false) }

      // grandchild1
      .down.tapSomeOrFail { assertRole(_, isRoot = false, isLeftMost = true, isRightMost = false, isLeaf = true) }

      // grandchild2
      .right.tapSomeOrFail { assertRole(_, isRoot = false, isLeftMost = false, isRightMost = true, isLeaf = true) }

      // child1
      .up.tapSomeOrFail { assertRole(_, isRoot = false, isLeftMost = true, isRightMost = false, isLeaf = false) }

      // child2
      .right.tapSomeOrFail { assertRole(_, isRoot = false, isLeftMost = false, isRightMost = false, isLeaf = true) }

      // child3
      .right.tapSomeOrFail { assertRole(_, isRoot = false, isLeftMost = false, isRightMost = false, isLeaf = true) }

      // child3
      .right.tapSomeOrFail { assertRole(_, isRoot = false, isLeftMost = false, isRightMost = true, isLeaf = true) }
  }

  test("Can replace elem without siblings") {
    val newElem = TestElem("updated", Seq())

    val updatedRoot = root.location.replace(newElem)

    updatedRoot.elem should equal(newElem)
  }

  test("Can replace elem with siblings") {
    val newElem = TestElem("updated", Seq())

    val updatedRoot = root.location.down.right.right.get.replace(newElem).root

    updatedRoot.elem.children should equal(Seq(child1, child2, newElem, child4))
  }

  test("Can add new elem to left") {
    val newElem = TestElem("child0", Seq())

    val child2Location = root.location.down.right.get
    val newChildLocation = child2Location.insertLeft(newElem).get
    newChildLocation.elem should equal(newElem)
    val updatedRoot = newChildLocation.root.elem

    updatedRoot should not equal root
    updatedRoot.children should equal(Seq(child1, newElem, child2, child3, child4))
  }

  test("Can add new elem to left of leftMost") {
    val newElem = TestElem("child0", Seq())

    val child1Location = root.location.down.get
    val newChildLocation = child1Location.insertLeft(newElem).get
    newChildLocation.elem should equal(newElem)
    val updatedRoot = newChildLocation.root.elem

    updatedRoot should not equal root
    updatedRoot.children should equal(Seq(newElem, child1, child2, child3, child4))
  }

  test("Can add new elem to right") {
    val newElem = TestElem("child0", Seq())

    val child1Location = root.location.down.get
    val newChildLocation = child1Location.insertRight(newElem).get
    newChildLocation.elem should equal(newElem)
    val updatedRoot = newChildLocation.root.elem

    updatedRoot should not equal root
    updatedRoot.children should equal(Seq(child1, newElem, child2, child3, child4))
  }

  test("Can add new elem to right of rightMost") {
    val newElem = TestElem("child0", Seq())

    val child4Location = root.location.down.rightMost.get
    val newChildLocation = child4Location.insertRight(newElem).get
    newChildLocation.elem should equal(newElem)
    val updatedRoot = newChildLocation.root.elem

    updatedRoot should not equal root
    updatedRoot.children should equal(Seq(child1, child2, child3, child4, newElem))
  }

  test("Can add new only child") {
    val newElem = TestElem("child0", Seq())

    val newChildLocation = root.location.down.right.get.insertChild(newElem)
    newChildLocation.elem should equal(newElem)
    val updatedRootLocation = newChildLocation.root

    updatedRootLocation.elem should not equal root

    val updatedChild2 = updatedRootLocation.down.right.get.elem
    updatedChild2 should not equal child2
    updatedChild2.name should equal(child2.name)
    updatedChild2.children should equal(Seq(newElem))
  }

  test("Can add new child to existing children") {
    val newElem = TestElem("child0", Seq())

    val newChildLocation = root.location.insertChild(newElem)
    newChildLocation.elem should equal(newElem)
    val updatedRoot = newChildLocation.root.elem

    updatedRoot should not equal root
    updatedRoot.children should equal(Seq(child1, child2, child3, child4, newElem))
  }
}

object Tapper {
  implicit class Tapped[V](value: V) {
    def tap(f: V => Unit): V = {
      f(value)
      value
    }
  }

  implicit class TappedOption[V](value: Option[V]) {
    def tapSomeOrFail(f: V => Unit): Option[V] = {
      f(value.get)
      value
    }
  }
}
