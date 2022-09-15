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

import java.io.File
import java.util.concurrent.TimeUnit

import org.neo4j.configuration.GraphDatabaseSettings
import org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME
import org.neo4j.cypher.ExecutionEngineHelper.createEngine
import org.neo4j.cypher.internal.javacompat.GraphDatabaseCypherService
import org.neo4j.exceptions.CypherExecutionException
import org.neo4j.exceptions.FailedIndexException
import org.neo4j.graphdb.Label
import org.neo4j.graphdb.Transaction
import org.neo4j.kernel.api.exceptions.schema.DropIndexFailureException
import org.neo4j.kernel.impl.index.schema.FailingGenericNativeIndexProviderFactory
import org.neo4j.kernel.impl.index.schema.FailingGenericNativeIndexProviderFactory.FailureType.POPULATION
import org.neo4j.test.TestDatabaseManagementServiceBuilder
import org.neo4j.test.utils.TestDirectory

import scala.collection.JavaConverters.iterableAsScalaIterableConverter

class IndexOpAcceptanceTest extends ExecutionEngineFunSuite with QueryStatisticsTestSupport {

  test("createIndex") {
    // WHEN
    execute("CREATE INDEX FOR (n:Person) ON (n.name)")

    // THEN
    graph.withTx(tx => {
      indexPropsForLabel(tx, "Person") should equal(List(List("name")))
    })
  }

  test("createIndexShouldFailWhenCreatedTwice") {
    // GIVEN
    execute("CREATE INDEX FOR (n:Person) ON (n.name)")

    // WHEN
    val e = intercept[CypherExecutionException](execute("CREATE INDEX FOR (n:Person) ON (n.name)"))

    // THEN
    val message = e.getCause.getMessage
    message should startWith("An equivalent index already exists")
    message should include("name='index_5c0607ad', type='GENERAL BTREE', schema=(:Person {name}), indexProvider='native-btree-1.0'")
  }

  test("secondIndexCreationShouldFailIfIndexesHasFailed") {
    // GIVEN
    createDbWithFailedIndex()
    try {
      // WHEN THEN
      val e = intercept[FailedIndexException](execute("CREATE INDEX FOR (n:Person) ON (n.name)"))
      e.getMessage should include (org.neo4j.kernel.impl.index.schema.FailingGenericNativeIndexProviderFactory.POPULATION_FAILURE_MESSAGE)
    } finally {
      managementService.shutdown()
    }
  }

  test("dropIndex") {
    // GIVEN
    execute("CREATE INDEX FOR (n:Person) ON (n.name)")

    // WHEN
    execute("DROP INDEX ON :Person(name)")

    // THEN
    graph.withTx( tx  => {
      indexPropsForLabel( tx, "Person") shouldBe empty
    } )
  }

  test("drop_index_that_does_not_exist") {
    // WHEN
    val e = intercept[CypherExecutionException](execute("DROP INDEX ON :Person(name)"))
    assert(e.getCause.isInstanceOf[DropIndexFailureException])
  }

  implicit class FileHelper(file: File) {
    def deleteAll(): Unit = {
      def deleteFile(dfile: File): Unit = {
        if (dfile.isDirectory)
          dfile.listFiles.foreach {
            f => deleteFile(f)
          }
        dfile.delete
      }
      deleteFile(file)
    }
  }

  def indexPropsForLabel(tx: Transaction, label: String): List[List[String]] = {
    val indexDefs = tx.schema.getIndexes(Label.label(label)).asScala.toList
    indexDefs.map(_.getPropertyKeys.asScala.toList)
  }

  private def createDbWithFailedIndex(): Unit = {
    val testDirectory = TestDirectory.testDirectory()
    testDirectory.prepareDirectory(getClass, "createDbWithFailedIndex")
    managementService.shutdown()
    val dbFactory = new TestDatabaseManagementServiceBuilder(testDirectory.homePath())
    dbFactory.noOpSystemGraphInitializer()
    // Build a properly failing index provider which is a wrapper around the default provider, but which throws exception
    // in its populator when trying to add updates to it
    val providerFactory = new FailingGenericNativeIndexProviderFactory(POPULATION)
    dbFactory.addExtension(providerFactory)
    dbFactory.setConfig( GraphDatabaseSettings.default_schema_provider, FailingGenericNativeIndexProviderFactory.DESCRIPTOR.name() )
    managementService = dbFactory.build()
    graphOps = managementService.database(DEFAULT_DATABASE_NAME)
    graph = new GraphDatabaseCypherService(graphOps)
    eengine = createEngine(graph)
    execute("create (:Person {name:42})")
    execute("CREATE INDEX FOR (n:Person) ON (n.name)")
    val tx = graph.beginTx()
    try {
      tx.schema().awaitIndexesOnline(3, TimeUnit.SECONDS)
      tx.commit()
    } catch {
      case e:IllegalStateException => assert(e.getMessage.contains("FAILED"), "Was expecting FAILED state")
    } finally {
      tx.close()
    }
  }
}
