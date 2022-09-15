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
package org.neo4j.cypher

import org.neo4j.cypher.internal.ExecutionEngineQueryCacheMonitor
import org.neo4j.cypher.internal.QueryCache.CacheKey
import org.neo4j.cypher.internal.javacompat.GraphDatabaseCypherService
import org.neo4j.cypher.internal.planning.CypherCacheMonitor
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.graphdb.Entity
import org.neo4j.graphdb.Node
import org.neo4j.graphdb.Notification
import org.neo4j.graphdb.Relationship
import org.neo4j.graphdb.Result
import org.neo4j.kernel.api.exceptions.Status
import org.scalatest.matchers.MatchResult
import org.scalatest.matchers.Matcher

import scala.collection.JavaConverters.iterableAsScalaIterableConverter

abstract class ExecutionEngineFunSuite
  extends CypherFunSuite with GraphDatabaseTestSupport with ExecutionEngineTestSupport with QueryPlanTestSupport {

  case class haveProperty(propName: String) extends Matcher[Entity] {
    def apply(left: Entity): MatchResult = {
      val result = graph.withTx( tx => {
        val entity = left match {
          case _: Node => tx.getNodeById(left.getId)
          case _: Relationship => tx.getRelationshipById(left.getId)
        }
        entity.hasProperty(propName)
      } )

      MatchResult(
        result,
        s"Didn't have expected property `$propName`",
        s"Has property $propName, expected it not to"
      )
    }

    def withValue(value: Any) = this and new Matcher[Entity] {
      def apply(left: Entity): MatchResult = {
        val propValue = graph.withTx( tx => {
          val entity = left match {
            case _: Node => tx.getNodeById(left.getId)
            case _: Relationship => tx.getRelationshipById(left.getId)
          }
          entity.getProperty(propName)
        } )
        val result = propValue == value
        MatchResult(
          result,
          s"Property `$propName` didn't have expected value. Expected: $value\nbut was: $propValue",
          s"Expected `$propName` not to have value `$value`, but it does."
        )
      }
    }
  }

  case class haveLabels(expectedLabels: String*) extends Matcher[Node] {
    def apply(left: Node): MatchResult = {

      val labels = graph.withTx { tx =>
        tx.getNodeById(left.getId).getLabels.asScala.map(_.name()).toSet
      }

      val result = expectedLabels.forall(labels)

      MatchResult(
        result,
        s"Expected node to have labels $expectedLabels, but it was ${labels.mkString(":")}",
        s"Expected node to not have labels $expectedLabels, but it did."
      )
    }
  }

  def shouldHaveWarning(result: Result, statusCode: Status, detailMessage: String): Unit = {
    val notifications: Iterable[Notification] = result.getNotifications.asScala

    withClue(s"Expected a notification with status code: $statusCode and detail message: $detailMessage\nBut got: $notifications") {
      notifications.exists { notification =>
        notification.getCode == statusCode.code().serialize() &&
          notification.getDescription == detailMessage
      } should be(true)
    }
  }

  def shouldHaveNoWarnings(result: Result): Unit = {
    result.getNotifications.asScala should be(empty)
  }

  def selectDatabase(name: String): Unit = {
    graphOps = managementService.database(name)
    graph = new GraphDatabaseCypherService(graphOps)
    eengine = ExecutionEngineHelper.createEngine(graph)
  }
}

case class CacheCounts(hits: Int = 0, misses: Int = 0, flushes: Int = 0, evicted: Int = 0, compilations: Int = 0, compilationsWithExpressionCodeGen: Int =0) {
  override def toString = s"hits = $hits, misses = $misses, flushes = $flushes, evicted = $evicted, compilations = $compilations, compilationsWithExpressionCodeGen = $compilationsWithExpressionCodeGen"
}

class ExecutionEngineCacheCounter() extends ExecutionEngineQueryCacheMonitor with CypherCacheMonitor[CacheKey[String]] {
  var counts: CacheCounts = CacheCounts()
  override def cacheMiss(key: CacheKey[String]): Unit = counts = counts.copy(misses = counts.misses + 1)
  override def cacheHit(key: CacheKey[String]): Unit = counts = counts.copy(hits = counts.hits + 1)
  override def cacheFlushDetected(sizeBeforeFlush: Long): Unit = counts = counts.copy(flushes = counts.flushes + 1)
  override def cacheDiscard(key: CacheKey[String], key2: String, secondsSinceReplan: Int, maybeReason: Option[String]): Unit =
    counts = counts.copy(evicted = counts.evicted + 1)
  override def cacheCompile(key: CacheKey[String]): Unit = counts = counts.copy(compilations = counts.compilations + 1)
  override def cacheCompileWithExpressionCodeGen(key: CacheKey[String]): Unit = counts = counts.copy(compilationsWithExpressionCodeGen = counts.compilationsWithExpressionCodeGen + 1)
}
