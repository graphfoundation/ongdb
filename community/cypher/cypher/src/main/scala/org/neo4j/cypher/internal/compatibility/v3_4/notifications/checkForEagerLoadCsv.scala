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
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.cypher.internal.compatibility.v3_4.notifications

import org.neo4j.cypher.internal.frontend.v3_4.notification.{EagerLoadCsvNotification, InternalNotification}
import org.neo4j.cypher.internal.v3_4.logical.plans.{Eager, LoadCSV, LogicalPlan}

object checkForEagerLoadCsv extends NotificationChecker {

  def apply(plan: LogicalPlan): Seq[InternalNotification] = {
    import org.neo4j.cypher.internal.util.v3_4.Foldable._
    sealed trait SearchState
    case object NoEagerFound extends SearchState
    case object EagerFound extends SearchState
    case object EagerWithLoadCsvFound extends SearchState

    // Walk over the pipe tree and check if an Eager is to be executed after a LoadCsv
    val resultState = plan.treeFold[SearchState](NoEagerFound) {
      case _: LoadCSV => {
        case EagerFound => (EagerWithLoadCsvFound, None)
        case e => (e, None)
      }
      case _: Eager =>
        acc =>
          (EagerFound, Some(identity))
    }

    resultState match {
      case EagerWithLoadCsvFound => Seq(EagerLoadCsvNotification)
      case _ => Seq.empty
    }
  }
}
