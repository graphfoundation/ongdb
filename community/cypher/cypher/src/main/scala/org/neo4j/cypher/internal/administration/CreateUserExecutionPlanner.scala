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
package org.neo4j.cypher.internal.administration

import org.neo4j.cypher.internal.AdministrationCommandRuntime.makeCreateUserExecutionPlan
import org.neo4j.cypher.internal.AdministrationCommandRuntime.runtimeStringValue
import org.neo4j.cypher.internal.ExecutionEngine
import org.neo4j.cypher.internal.ExecutionPlan
import org.neo4j.cypher.internal.logical.plans.CreateUser
import org.neo4j.cypher.internal.procs.PredicateExecutionPlan
import org.neo4j.exceptions.CantCompileQueryException
import org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler

case class CreateUserExecutionPlanner(normalExecutionEngine: ExecutionEngine, securityAuthorizationHandler: SecurityAuthorizationHandler) {

  def planCreateUser(createUser: CreateUser, sourcePlan: Option[ExecutionPlan]): ExecutionPlan = {

    def failWithError(command: String) : PredicateExecutionPlan = {
      new PredicateExecutionPlan((_, _) => false, sourcePlan, (params, _) => {
        val user = runtimeStringValue(createUser.userName, params)
        throw new CantCompileQueryException(s"Failed to create the specified user '$user': '$command' is not available in community edition.")
      })
    }

    if (createUser.suspended.isDefined) { // Users are always active in community
      failWithError("SET STATUS")
    } else if (createUser.defaultDatabase.isDefined) { // There is only one database in community
      failWithError("HOME DATABASE")
    }
    else {
      makeCreateUserExecutionPlan(
        createUser.userName, createUser.isEncryptedPassword, createUser.initialPassword, createUser.requirePasswordChange, suspended = false, defaultDatabase = None
      )(sourcePlan, normalExecutionEngine, securityAuthorizationHandler)
    }
  }

}
