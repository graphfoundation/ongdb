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
package org.neo4j.cypher.testing.impl.driver

import org.neo4j.cypher.testing.api.StatementResult
import org.neo4j.driver.Result
import org.neo4j.graphdb.InputPosition
import org.neo4j.graphdb.Notification
import org.neo4j.graphdb.SeverityLevel

import scala.collection.JavaConverters.iterableAsScalaIterableConverter
import scala.collection.JavaConverters.mapAsScalaMapConverter

case class DriverStatementResult(private val driverResult: Result) extends StatementResult {

  override def columns(): Seq[String] = driverResult.keys().asScala.toList

  override def records(): Seq[Record] = driverResult.list().asScala.toList
    .map(record => record.asMap[AnyRef](DriverRecordConverter.convertValue).asScala.toMap)

  override def consume(): Unit = driverResult.consume()

  override def getNotifications(): List[Notification] = driverResult.consume().notifications().asScala.toList
    .map(driverNotification => new NotificationWrapper(driverNotification))


  private class NotificationWrapper(val notification: org.neo4j.driver.summary.Notification) extends Notification {
    override def getCode: String = notification.code

    override def getTitle: String = notification.title

    override def getDescription: String = notification.description

    override def getSeverity: SeverityLevel = SeverityLevel.valueOf(notification.severity)

    override def getPosition: InputPosition = {
      val pos = notification.position
      new InputPosition(pos.offset, pos.line, pos.column)
    }
  }
}
