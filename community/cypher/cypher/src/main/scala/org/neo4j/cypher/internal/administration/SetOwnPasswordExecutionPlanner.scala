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
package org.neo4j.cypher.internal.administration

import org.neo4j.cypher.internal.AdministrationCommandRuntime.followerError
import org.neo4j.cypher.internal.AdministrationCommandRuntime.getPasswordExpression
import org.neo4j.cypher.internal.AdministrationCommandRuntime.getValidPasswordParameter
import org.neo4j.cypher.internal.AdministrationCommandRuntime.internalKey
import org.neo4j.cypher.internal.AdministrationCommandRuntime.validatePassword
import org.neo4j.cypher.internal.AdministrationCommandRuntime.validateStringParameterType
import org.neo4j.cypher.internal.ExecutionEngine
import org.neo4j.cypher.internal.ExecutionPlan
import org.neo4j.cypher.internal.expressions
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.Parameter
import org.neo4j.cypher.internal.procs.QueryHandler
import org.neo4j.cypher.internal.procs.UpdatingSystemCommandExecutionPlan
import org.neo4j.cypher.internal.security.SecureHasher
import org.neo4j.cypher.internal.security.SystemGraphCredential
import org.neo4j.exceptions.DatabaseAdministrationOnFollowerException
import org.neo4j.exceptions.InvalidArgumentException
import org.neo4j.exceptions.Neo4jException
import org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler
import org.neo4j.kernel.api.exceptions.Status
import org.neo4j.kernel.api.exceptions.Status.HasStatus
import org.neo4j.values.storable.ByteArray
import org.neo4j.values.storable.TextValue
import org.neo4j.values.storable.Value
import org.neo4j.values.storable.Values
import org.neo4j.values.virtual.MapValue
import org.neo4j.values.virtual.VirtualValues

case class SetOwnPasswordExecutionPlanner(normalExecutionEngine: ExecutionEngine, securityAuthorizationHandler: SecurityAuthorizationHandler) {

  private val secureHasher = new SecureHasher

  def planSetOwnPassword(newPassword: Expression, currentPassword: Expression): ExecutionPlan  = {
    val usernameKey = internalKey("username")
    val newPw = getPasswordExpression(None, newPassword, isEncryptedPassword = false, Array(usernameKey))
    val (currentKeyBytes, currentValueBytes, currentConverterBytes) = getPasswordFieldsCurrent(currentPassword)
    def currentUser(p: MapValue): String = p.get(usernameKey).asInstanceOf[TextValue].stringValue()
    val query =
      s"""MATCH (user:User {name: $$`$usernameKey`})
         |WITH user, user.credentials AS oldCredentials
         |SET user.credentials = $$`${newPw.key}`
         |SET user.passwordChangeRequired = false
         |RETURN oldCredentials""".stripMargin

    UpdatingSystemCommandExecutionPlan("AlterCurrentUserSetPassword", normalExecutionEngine,
      securityAuthorizationHandler,
      query,
      VirtualValues.map(Array(newPw.key, newPw.bytesKey, currentKeyBytes), Array(newPw.value, newPw.bytesValue, currentValueBytes)),
      QueryHandler
        .handleError {
          case (error: HasStatus, p) if error.status() == Status.Cluster.NotALeader =>
            new DatabaseAdministrationOnFollowerException(s"User '${currentUser(p)}' failed to alter their own password: $followerError", error)
          case (error: Neo4jException, _) => error
          case (error, p) => new IllegalStateException(s"User '${currentUser(p)}' failed to alter their own password.", error)
        }
        .handleResult((_, value, p) => {
          val oldCredentials = SystemGraphCredential.deserialize(value.asInstanceOf[TextValue].stringValue(), secureHasher)
          val newValue = p.get(newPw.bytesKey).asInstanceOf[ByteArray].asObject()
          val currentValue = p.get(currentKeyBytes).asInstanceOf[ByteArray].asObject()
          if (!oldCredentials.matchesPassword(currentValue))
            Some(new InvalidArgumentException(s"User '${currentUser(p)}' failed to alter their own password: Invalid principal or credentials."))
          else if (oldCredentials.matchesPassword(newValue))
            Some(new InvalidArgumentException(s"User '${currentUser(p)}' failed to alter their own password: Old password and new password cannot be the same."))
          else
            None
        })
        .handleNoResult( p => {
          if (currentUser(p).isEmpty) // This is true if the securityContext is AUTH_DISABLED (both for community and enterprise)
            Some(new IllegalStateException("User failed to alter their own password: Command not available with auth disabled."))
          else // The 'current user' doesn't exist in the system graph
            Some(new IllegalStateException(s"User '${currentUser(p)}' failed to alter their own password: User does not exist."))
        }),
      checkCredentialsExpired = false,
      finallyFunction = p => {
        p.get(newPw.bytesKey).asInstanceOf[ByteArray].zero()
        p.get(currentKeyBytes).asInstanceOf[ByteArray].zero()
      },
      parameterGenerator = (_, securityContext) => VirtualValues.map(Array(usernameKey), Array(Values.utf8Value(securityContext.subject().executingUser()))),
      parameterConverter = (tx, m) => newPw.mapValueConverter(tx, currentConverterBytes(m))
    )
  }

  private def getPasswordFieldsCurrent(password: expressions.Expression): (String, Value, MapValue => MapValue) = {
    password match {
      case parameterPassword: Parameter =>
        validateStringParameterType(parameterPassword)
        val passwordParameter = parameterPassword.name
        val renamedParameter = s"__current_${passwordParameter}_bytes"
        def convertPasswordParameters(params: MapValue): MapValue = {
          val encodedPassword = getValidPasswordParameter(params, passwordParameter)
          validatePassword(encodedPassword)
          params.updatedWith(renamedParameter, Values.byteArray(encodedPassword))
        }
        (renamedParameter, Values.NO_VALUE, convertPasswordParameters)
    }
  }
}
