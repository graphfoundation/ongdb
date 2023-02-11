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
package org.neo4j.cypher.internal.parser.privilege

import org.neo4j.cypher.internal.ast
import org.neo4j.cypher.internal.parser.AdministrationCommandParserTestBase

class DatabasePrivilegeAdministrationCommandParserTest extends AdministrationCommandParserTestBase {
  private val databaseScopeFoo = ast.NamedDatabaseScope(literalFoo)(_)
  private val databaseScopeParamFoo = ast.NamedDatabaseScope(paramFoo)(_)
  private val databaseScopeBar = ast.NamedDatabaseScope(literalBar)(_)
  private val databaseScopeParamBar = ast.NamedDatabaseScope(param("bar"))(_)

  Seq(
    ("GRANT", "TO", grantDatabasePrivilege: databasePrivilegeFunc),
    ("DENY", "TO", denyDatabasePrivilege: databasePrivilegeFunc),
    ("REVOKE GRANT", "FROM", revokeGrantDatabasePrivilege: databasePrivilegeFunc),
    ("REVOKE DENY", "FROM", revokeDenyDatabasePrivilege: databasePrivilegeFunc),
    ("REVOKE", "FROM", revokeDatabasePrivilege: databasePrivilegeFunc)
  ).foreach {
    case (verb: String, preposition: String, privilegeFunc: databasePrivilegeFunc) =>

      Seq(
        ("ACCESS", ast.AccessDatabaseAction),
        ("START", ast.StartDatabaseAction),
        ("STOP", ast.StopDatabaseAction),
        ("CREATE INDEX", ast.CreateIndexAction),
        ("CREATE INDEXES", ast.CreateIndexAction),
        ("DROP INDEX", ast.DropIndexAction),
        ("DROP INDEXES", ast.DropIndexAction),
        ("SHOW INDEX", ast.ShowIndexAction),
        ("SHOW INDEXES", ast.ShowIndexAction),
        ("INDEX", ast.AllIndexActions),
        ("INDEXES", ast.AllIndexActions),
        ("INDEX MANAGEMENT", ast.AllIndexActions),
        ("INDEXES MANAGEMENT", ast.AllIndexActions),
        ("CREATE CONSTRAINT", ast.CreateConstraintAction),
        ("CREATE CONSTRAINTS", ast.CreateConstraintAction),
        ("DROP CONSTRAINT", ast.DropConstraintAction),
        ("DROP CONSTRAINTS", ast.DropConstraintAction),
        ("SHOW CONSTRAINT", ast.ShowConstraintAction),
        ("SHOW CONSTRAINTS", ast.ShowConstraintAction),
        ("CONSTRAINT", ast.AllConstraintActions),
        ("CONSTRAINTS", ast.AllConstraintActions),
        ("CONSTRAINT MANAGEMENT", ast.AllConstraintActions),
        ("CONSTRAINTS MANAGEMENT", ast.AllConstraintActions),
        ("CREATE NEW LABEL", ast.CreateNodeLabelAction),
        ("CREATE NEW LABELS", ast.CreateNodeLabelAction),
        ("CREATE NEW NODE LABEL", ast.CreateNodeLabelAction),
        ("CREATE NEW NODE LABELS", ast.CreateNodeLabelAction),
        ("CREATE NEW TYPE", ast.CreateRelationshipTypeAction),
        ("CREATE NEW TYPES", ast.CreateRelationshipTypeAction),
        ("CREATE NEW RELATIONSHIP TYPE", ast.CreateRelationshipTypeAction),
        ("CREATE NEW RELATIONSHIP TYPES", ast.CreateRelationshipTypeAction),
        ("CREATE NEW NAME", ast.CreatePropertyKeyAction),
        ("CREATE NEW NAMES", ast.CreatePropertyKeyAction),
        ("CREATE NEW PROPERTY NAME", ast.CreatePropertyKeyAction),
        ("CREATE NEW PROPERTY NAMES", ast.CreatePropertyKeyAction),
        ("NAME", ast.AllTokenActions),
        ("NAME MANAGEMENT", ast.AllTokenActions),
        ("ALL", ast.AllDatabaseAction),
        ("ALL PRIVILEGES", ast.AllDatabaseAction),
        ("ALL DATABASE PRIVILEGES", ast.AllDatabaseAction)
      ).foreach {
        case (privilege: String, action: ast.DatabaseAction) =>

          test(s"$verb $privilege ON DATABASE * $preposition $$role") {
            yields(privilegeFunc(action, List(ast.AllDatabasesScope() _), Seq(paramRole)))
          }

          test(s"$verb $privilege ON DATABASES * $preposition role") {
            yields(privilegeFunc(action, List(ast.AllDatabasesScope() _), Seq(literalRole)))
          }

          test(s"$verb $privilege ON DATABASE * $preposition role1, role2") {
            yields(privilegeFunc(action, List(ast.AllDatabasesScope() _), Seq(literalRole1, literalRole2)))
          }

          test(s"$verb $privilege ON DATABASE foo $preposition role") {
            yields(privilegeFunc(action, List(databaseScopeFoo), Seq(literalRole)))
          }

          test(s"$verb $privilege ON DATABASE `fo:o` $preposition role") {
            yields(privilegeFunc(action, List(ast.NamedDatabaseScope(literal("fo:o")) _), Seq(literalRole)))
          }

          test(s"$verb $privilege ON DATABASE more.Dots.more.Dots $preposition role") {
            yields(privilegeFunc(action, List(ast.NamedDatabaseScope(literal("more.Dots.more.Dots")) _), Seq(literalRole)))
          }

          test(s"$verb $privilege ON DATABASE foo $preposition `r:ole`") {
            yields(privilegeFunc(action, List(databaseScopeFoo), Seq(literalRColonOle)))
          }

          test(s"$verb $privilege ON DATABASE foo $preposition role1, $$role2") {
            yields(privilegeFunc(action, List(databaseScopeFoo), Seq(literalRole1, paramRole2)))
          }

          test(s"$verb $privilege ON DATABASE $$foo $preposition role") {
            yields(privilegeFunc(action, List(databaseScopeParamFoo), Seq(literalRole)))
          }

          test(s"$verb $privilege ON DATABASE foo, bar $preposition role") {
            yields(privilegeFunc(action, List(databaseScopeFoo, databaseScopeBar), Seq(literalRole)))
          }

          test(s"$verb $privilege ON DATABASES foo, $$bar $preposition role") {
            yields(privilegeFunc(action, List(databaseScopeFoo, databaseScopeParamBar), Seq(literalRole)))
          }

          test(s"$verb $privilege ON HOME DATABASE $preposition role") {
            yields(privilegeFunc(action, List(ast.HomeDatabaseScope() _), Seq(literalRole)))
          }

          test(s"$verb $privilege ON HOME DATABASE $preposition $$role1, role2") {
            yields(privilegeFunc(action, List(ast.HomeDatabaseScope() _), Seq(paramRole1, literalRole2)))
          }

          test(s"$verb $privilege ON DEFAULT DATABASE $preposition role") {
            yields(privilegeFunc(action, List(ast.DefaultDatabaseScope() _), Seq(literalRole)))
          }

          test(s"$verb $privilege ON DEFAULT DATABASE $preposition $$role1, role2") {
            yields(privilegeFunc(action, List(ast.DefaultDatabaseScope() _), Seq(paramRole1, literalRole2)))
          }

          test(s"$verb $privilege ON GRAPH * $preposition role") {
            // GRAPH instead of DATABASE
            if (!(privilege.equals("ALL") || privilege.equals("ALL PRIVILEGES"))) {
              failsToParse
            }
          }

          test(s"$verb $privilege ON DATABASE fo:o $preposition role") {
            // invalid database name
            failsToParse
          }

          test(s"$verb $privilege ON DATABASE foo, * $preposition role") {
            // specific database followed by *
            failsToParse
          }

          test(s"$verb $privilege ON DATABASE *, foo $preposition role") {
            // * followed by specific database
            failsToParse
          }

          test(s"$verb $privilege ON DATABASE foo $preposition r:ole") {
            // invalid role name
            failsToParse
          }

          test(s"$verb $privilege ON DATABASES * $preposition") {
            // Missing role
            failsToParse
          }

          test(s"$verb $privilege ON DATABASES *") {
            // Missing role and preposition
            failsToParse
          }

          test(s"$verb $privilege ON DATABASES $preposition role") {
            // Missing dbName
            failsToParse
          }

          test(s"$verb $privilege ON * $preposition role") {
            // Missing DATABASE keyword
            failsToParse
          }

          test(s"$verb $privilege DATABASE foo $preposition role") {
            // Missing ON keyword
            failsToParse
          }

          test(s"$verb $privilege ON HOME DATABASES $preposition role") {
            // 'databases' instead of 'database'
            failsToParse
          }

          test(s"$verb $privilege ON HOME DATABASE foo $preposition role") {
            // both home and database name
            failsToParse
          }

          test(s"$verb $privilege ON HOME DATABASE * $preposition role") {
            // both home and *
            failsToParse
          }

          test(s"$verb $privilege ON DEFAULT DATABASES $preposition role") {
            // 'databases' instead of 'database'
            failsToParse
          }

          test(s"$verb $privilege ON DEFAULT DATABASE foo $preposition role") {
            // both default and database name
            failsToParse
          }

          test(s"$verb $privilege ON DEFAULT DATABASE * $preposition role") {
            // both default and *
            failsToParse
          }
      }

      // Dropping instead of creating name management privileges

      test(s"$verb DROP NEW LABEL ON DATABASE * $preposition role") {
        failsToParse
      }

      test(s"$verb DROP NEW TYPE ON DATABASE * $preposition role") {
        failsToParse
      }

      test(s"$verb DROP NEW NAME ON DATABASE * $preposition role") {
        failsToParse
      }

      test(s"$verb DROP LABEL ON DATABASE * $preposition role") {
        failsToParse
      }

      test(s"$verb DROP TYPE ON DATABASE * $preposition role") {
        failsToParse
      }

      test(s"$verb DROP NAME ON DATABASE * $preposition role") {
        failsToParse
      }

  }

  // transaction management

  Seq(
    ("GRANT", "TO", grantTransactionPrivilege: transactionPrivilegeFunc),
    ("DENY", "TO", denyTransactionPrivilege: transactionPrivilegeFunc),
    ("REVOKE GRANT", "FROM", revokeGrantTransactionPrivilege: transactionPrivilegeFunc),
    ("REVOKE DENY", "FROM", revokeDenyTransactionPrivilege: transactionPrivilegeFunc),
    ("REVOKE", "FROM", revokeTransactionPrivilege: transactionPrivilegeFunc)
  ).foreach {
    case (verb: String, preposition: String, privilegeFunc: transactionPrivilegeFunc) =>

      test(s"$verb SHOW TRANSACTION (*) ON DATABASE * $preposition role") {
        yields(privilegeFunc(ast.ShowTransactionAction, List(ast.AllDatabasesScope() _), List(ast.UserAllQualifier() _), Seq(literalRole)))
      }

      test(s"$verb SHOW TRANSACTIONS (*) ON DATABASES foo $preposition role1, role2") {
        yields(privilegeFunc(ast.ShowTransactionAction, List(databaseScopeFoo), List(ast.UserAllQualifier() _), Seq(literalRole1, literalRole2)))
      }

      test(s"$verb SHOW TRANSACTIONS (*) ON DATABASES $$foo $preposition $$role1, $$role2") {
        yields(privilegeFunc(ast.ShowTransactionAction, List(databaseScopeParamFoo), List(ast.UserAllQualifier() _), Seq(paramRole1, paramRole2)))
      }

      test(s"$verb SHOW TRANSACTION (user) ON HOME DATABASE $preposition role") {
        yields(privilegeFunc(ast.ShowTransactionAction, List(ast.HomeDatabaseScope() _), List(ast.UserQualifier(literalUser)_), Seq(literalRole)))
      }

      test(s"$verb SHOW TRANSACTION ($$user) ON HOME DATABASE $preposition role") {
        yields(privilegeFunc(ast.ShowTransactionAction, List(ast.HomeDatabaseScope() _), List(ast.UserQualifier(paramUser)_),Seq(literalRole)))
      }

      test(s"$verb SHOW TRANSACTION (user) ON DEFAULT DATABASE $preposition role") {
        yields(privilegeFunc(ast.ShowTransactionAction, List(ast.DefaultDatabaseScope() _), List(ast.UserQualifier(literalUser)_), Seq(literalRole)))
      }

      test(s"$verb SHOW TRANSACTION ($$user) ON DEFAULT DATABASE $preposition role") {
        yields(privilegeFunc(ast.ShowTransactionAction, List(ast.DefaultDatabaseScope() _), List(ast.UserQualifier(paramUser)_),Seq(literalRole)))
      }

      test(s"$verb SHOW TRANSACTIONS (user1,user2) ON DATABASES * $preposition role1, role2") {
        yields(privilegeFunc(ast.ShowTransactionAction, List(ast.AllDatabasesScope() _), List(ast.UserQualifier(literalUser1)_, ast.UserQualifier(literal("user2"))_), Seq(literalRole1, literalRole2)))
      }

      test(s"$verb SHOW TRANSACTIONS ON DATABASES * $preposition role") {
        yields(privilegeFunc(ast.ShowTransactionAction, List(ast.AllDatabasesScope() _), List(ast.UserAllQualifier() _), Seq(literalRole)))
      }

      test(s"$verb SHOW TRANSACTION ON DATABASE foo, bar $preposition role") {
        yields(privilegeFunc(ast.ShowTransactionAction, List(databaseScopeFoo, databaseScopeBar), List(ast.UserAllQualifier() _), Seq(literalRole)))
      }

      test(s"$verb SHOW TRANSACTION (user) ON DATABASES foo, $$bar $preposition role") {
        yields(privilegeFunc(ast.ShowTransactionAction, List(databaseScopeFoo, databaseScopeParamBar), List(ast.UserQualifier(literalUser)_), Seq(literalRole)))
      }

      test(s"$verb TERMINATE TRANSACTION (*) ON DATABASE * $preposition $$role") {
        yields(privilegeFunc(ast.TerminateTransactionAction, List(ast.AllDatabasesScope() _), List(ast.UserAllQualifier() _), Seq(paramRole)))
      }

      test(s"$verb TERMINATE TRANSACTIONS (*) ON DATABASES foo $preposition role1, role2") {
        yields(privilegeFunc(ast.TerminateTransactionAction, List(databaseScopeFoo), List(ast.UserAllQualifier() _), Seq(literalRole1, literalRole2)))
      }

      test(s"$verb TERMINATE TRANSACTIONS (*) ON DATABASES $$foo $preposition role") {
        yields(privilegeFunc(ast.TerminateTransactionAction, List(databaseScopeParamFoo), List(ast.UserAllQualifier() _), Seq(literalRole)))
      }

      test(s"$verb TERMINATE TRANSACTION (user) ON HOME DATABASE $preposition role") {
        yields(privilegeFunc(ast.TerminateTransactionAction, List(ast.HomeDatabaseScope() _), List(ast.UserQualifier(literalUser)_), Seq(literalRole)))
      }

      test(s"$verb TERMINATE TRANSACTION (user) ON DEFAULT DATABASE $preposition role") {
        yields(privilegeFunc(ast.TerminateTransactionAction, List(ast.DefaultDatabaseScope() _), List(ast.UserQualifier(literalUser)_), Seq(literalRole)))
      }

      test(s"$verb TERMINATE TRANSACTIONS (user1,user2) ON DATABASES * $preposition role1, role2") {
        yields(privilegeFunc(ast.TerminateTransactionAction, List(ast.AllDatabasesScope() _), List(ast.UserQualifier(literalUser1)_,ast.UserQualifier(literal("user2"))_), Seq(literalRole1, literalRole2)))
      }

      test(s"$verb TERMINATE TRANSACTIONS ($$user1,$$user2) ON DATABASES * $preposition role1, role2") {
        yields(privilegeFunc(ast.TerminateTransactionAction, List(ast.AllDatabasesScope() _), List(ast.UserQualifier(param("user1")) _, ast.UserQualifier(param("user2"))_) , Seq(literalRole1, literalRole2)))
      }

      test(s"$verb TERMINATE TRANSACTIONS ON DATABASES * $preposition role") {
        yields(privilegeFunc(ast.TerminateTransactionAction, List(ast.AllDatabasesScope() _), List(ast.UserAllQualifier() _), Seq(literalRole)))
      }

      test(s"$verb TERMINATE TRANSACTION ON DATABASE foo, bar $preposition role") {
        yields(privilegeFunc(ast.TerminateTransactionAction, List(databaseScopeFoo, databaseScopeBar), List(ast.UserAllQualifier() _), Seq(literalRole)))
      }

      test(s"$verb TERMINATE TRANSACTION (user) ON DATABASES foo, $$bar $preposition role") {
        yields(privilegeFunc(ast.TerminateTransactionAction, List(databaseScopeFoo, databaseScopeParamBar), List(ast.UserQualifier(literalUser)_), Seq(literalRole)))
      }

      test(s"$verb TRANSACTION ON DATABASES * $preposition role1, role2") {
        yields(privilegeFunc(ast.AllTransactionActions, List(ast.AllDatabasesScope() _), List(ast.UserAllQualifier() _), Seq(literalRole1, literalRole2)))
      }

      test(s"$verb TRANSACTION (*) ON DATABASES foo $preposition role1, $$role2") {
        yields(privilegeFunc(ast.AllTransactionActions, List(databaseScopeFoo), List(ast.UserAllQualifier() _), Seq(literalRole1, paramRole2)))
      }

      test(s"$verb TRANSACTION (*) ON DATABASES $$foo $preposition role1, role2") {
        yields(privilegeFunc(ast.AllTransactionActions, List(databaseScopeParamFoo), List(ast.UserAllQualifier() _), Seq(literalRole1, literalRole2)))
      }

      test(s"$verb TRANSACTION (user) ON DATABASES * $preposition role") {
        yields(privilegeFunc(ast.AllTransactionActions, List(ast.AllDatabasesScope() _), List(ast.UserQualifier(literalUser)_), Seq(literalRole)))
      }

      test(s"$verb TRANSACTION ON DATABASE foo, bar $preposition role") {
        yields(privilegeFunc(ast.AllTransactionActions, List(databaseScopeFoo, databaseScopeBar), List(ast.UserAllQualifier() _), Seq(literalRole)))
      }

      test(s"$verb TRANSACTION (user) ON DATABASES foo, $$bar $preposition role") {
        yields(privilegeFunc(ast.AllTransactionActions, List(databaseScopeFoo, databaseScopeParamBar), List(ast.UserQualifier(literalUser)_), Seq(literalRole)))
      }

      test(s"$verb TRANSACTION MANAGEMENT ON HOME DATABASE $preposition role") {
        yields(privilegeFunc(ast.AllTransactionActions, List(ast.HomeDatabaseScope() _), List(ast.UserAllQualifier() _), Seq(literalRole)))
      }

      test(s"$verb TRANSACTION MANAGEMENT ON DEFAULT DATABASE $preposition role") {
        yields(privilegeFunc(ast.AllTransactionActions, List(ast.DefaultDatabaseScope() _), List(ast.UserAllQualifier() _), Seq(literalRole)))
      }

      test(s"$verb TRANSACTION MANAGEMENT (*) ON DATABASE * $preposition role") {
        yields(privilegeFunc(ast.AllTransactionActions, List(ast.AllDatabasesScope() _), List(ast.UserAllQualifier() _), Seq(literalRole)))
      }

      test(s"$verb TRANSACTION MANAGEMENT (user) ON DATABASES * $preposition role") {
        yields(privilegeFunc(ast.AllTransactionActions, List(ast.AllDatabasesScope() _), List(ast.UserQualifier(literalUser)_), Seq(literalRole)))
      }

      test(s"$verb TRANSACTION MANAGEMENT (user1, $$user2) ON DATABASES * $preposition role") {
        yields(privilegeFunc(ast.AllTransactionActions, List(ast.AllDatabasesScope() _), List(ast.UserQualifier(literalUser1) _, ast.UserQualifier(param("user2"))_), Seq(literalRole)))
      }

      test(s"$verb TRANSACTION MANAGEMENT ON DATABASE foo, bar $preposition role") {
        yields(privilegeFunc(ast.AllTransactionActions, List(databaseScopeFoo, databaseScopeBar), List(ast.UserAllQualifier() _), Seq(literalRole)))
      }

      test(s"$verb TRANSACTION MANAGEMENT (user) ON DATABASES foo, $$bar $preposition role") {
        yields(privilegeFunc(ast.AllTransactionActions, List(databaseScopeFoo, databaseScopeParamBar), List(ast.UserQualifier(literalUser) _), Seq(literalRole)))
      }

      test(s"$verb TRANSACTION ON DATABASE foo, * $preposition role") {
        failsToParse
      }

      test(s"$verb TRANSACTION ON DATABASE *, foo $preposition role") {
        failsToParse
      }

      test(s"$verb TRANSACTIONS ON DATABASES * $preposition role") {
        failsToParse
      }

      test(s"$verb TRANSACTIONS (*) ON DATABASES * $preposition role") {
        failsToParse
      }

      test(s"$verb TRANSACTIONS MANAGEMENT ON DATABASES * $preposition role") {
        failsToParse
      }

      test(s"$verb TRANSACTIONS MANAGEMENT (*) ON DATABASES * $preposition role") {
        failsToParse
      }
  }
}
