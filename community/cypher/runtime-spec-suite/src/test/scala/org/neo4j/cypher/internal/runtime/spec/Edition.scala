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
package org.neo4j.cypher.internal.runtime.spec

import org.neo4j.common.DependencyResolver
import org.neo4j.configuration.Config
import org.neo4j.configuration.GraphDatabaseSettings
import org.neo4j.cypher.internal.CommunityRuntimeContextManager
import org.neo4j.cypher.internal.CypherRuntimeConfiguration
import org.neo4j.cypher.internal.RuntimeContext
import org.neo4j.cypher.internal.RuntimeContextManager
import org.neo4j.cypher.internal.config.CypherConfiguration
import org.neo4j.cypher.internal.options.CypherOperatorEngineOption
import org.neo4j.dbms.api.DatabaseManagementService
import org.neo4j.graphdb.config.Setting
import org.neo4j.kernel.lifecycle.LifeSupport
import org.neo4j.logging.LogProvider
import org.neo4j.test.TestDatabaseManagementServiceBuilder

import java.lang.Boolean.TRUE
import scala.collection.JavaConverters.mapAsJavaMapConverter

trait RuntimeContextManagerFactory[CONTEXT <: RuntimeContext] {
  def newRuntimeContextManager(cypherRuntimeConfiguration: CypherRuntimeConfiguration,
                               dependencyResolver: DependencyResolver,
                               lifeSupport: LifeSupport,
                               logProvider: LogProvider): RuntimeContextManager[CONTEXT]
}

class Edition[CONTEXT <: RuntimeContext](graphBuilderFactory: () => TestDatabaseManagementServiceBuilder,
                                         runtimeContextManagerFactory: RuntimeContextManagerFactory[CONTEXT],
                                         configs: (Setting[_], Object)*) {

  //----------------------------------------------
  // Specific plan or expression support helpers
  def supportsNestedPlanExpression: Boolean = {
    cypherConfig().operatorEngine != CypherOperatorEngineOption.compiled
  }
  //----------------------------------------------

  def newGraphManagementService(additionalConfigs: (Setting[_], Object)*): DatabaseManagementService = {
    val graphBuilder = graphBuilderFactory().impermanent
    configs.foreach {
      case (setting, value) => graphBuilder.setConfig(setting.asInstanceOf[Setting[Object]], value.asInstanceOf[Object])
    }
    additionalConfigs.foreach {
      case (setting, value) => graphBuilder.setConfig(setting.asInstanceOf[Setting[Object]], value.asInstanceOf[Object])
    }
    graphBuilder.build()
  }

  def copyWith(additionalConfigs: (Setting[_], Object)*): Edition[CONTEXT] = {
    val newConfigs = configs ++ additionalConfigs
    new Edition(graphBuilderFactory, runtimeContextManagerFactory, newConfigs: _*)
  }

  def copyWith(newRuntimeContextManagerFactory: RuntimeContextManagerFactory[CONTEXT], additionalConfigs: (Setting[_], Object)*): Edition[CONTEXT] = {
    val newConfigs = configs ++ additionalConfigs
    new Edition(graphBuilderFactory, newRuntimeContextManagerFactory, newConfigs: _*)
  }

  def getSetting[T](setting: Setting[T]): Option[T] = {
    configs.collectFirst { case (key, value) if key == setting => value.asInstanceOf[T] }
  }

  def newRuntimeContextManager(resolver: DependencyResolver, lifeSupport: LifeSupport, logProvider: LogProvider): RuntimeContextManager[CONTEXT] =
    runtimeContextManagerFactory.newRuntimeContextManager(runtimeConfig(), resolver, lifeSupport, logProvider)

  def runtimeConfig(): CypherRuntimeConfiguration = {
    CypherRuntimeConfiguration.fromCypherConfiguration(cypherConfig())
  }

  def cypherConfig(): CypherConfiguration = {
    val config = Config.defaults(configs.toMap.asJava)
    CypherConfiguration.fromConfig(config)
  }
}

object COMMUNITY {
  val EDITION = new Edition(
    () => new TestDatabaseManagementServiceBuilder,
    (runtimeConfig, _, _, logProvider) => CommunityRuntimeContextManager(logProvider.getLog("test"), runtimeConfig),
    GraphDatabaseSettings.cypher_hints_error -> TRUE)
}
