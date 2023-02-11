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
package org.neo4j.cypher.internal.parser

import org.neo4j.cypher.internal.ast
import org.neo4j.cypher.internal.ast.AllDatabasesScope
import org.neo4j.cypher.internal.ast.DefaultDatabaseScope
import org.neo4j.cypher.internal.ast.DestroyData
import org.neo4j.cypher.internal.ast.DumpData
import org.neo4j.cypher.internal.ast.HomeDatabaseScope
import org.neo4j.cypher.internal.ast.IfExistsThrowError
import org.neo4j.cypher.internal.ast.IndefiniteWait
import org.neo4j.cypher.internal.ast.NamedDatabaseScope
import org.neo4j.cypher.internal.ast.NoOptions
import org.neo4j.cypher.internal.ast.NoWait
import org.neo4j.cypher.internal.ast.OptionsMap
import org.neo4j.cypher.internal.ast.OptionsParam
import org.neo4j.cypher.internal.ast.TimeoutAfter
import org.neo4j.cypher.internal.ast.YieldOrWhere
import org.neo4j.cypher.internal.util.symbols.CTMap

class MultiDatabaseAdministrationCommandParserTest extends AdministrationCommandParserTestBase {
  private val literalFooBar = literal("foo.bar")

  // SHOW DATABASE

  Seq(
    ("DATABASES", ast.ShowDatabase.apply(AllDatabasesScope()(pos), _: YieldOrWhere) _),
    ("DEFAULT DATABASE", ast.ShowDatabase.apply(DefaultDatabaseScope()(pos), _: YieldOrWhere) _),
    ("HOME DATABASE", ast.ShowDatabase.apply(HomeDatabaseScope()(pos), _: YieldOrWhere) _),
    ("DATABASE $db", ast.ShowDatabase.apply(NamedDatabaseScope(param("db"))(pos), _: YieldOrWhere) _),
    ("DATABASE neo4j", ast.ShowDatabase.apply(NamedDatabaseScope(literal("neo4j"))(pos), _: YieldOrWhere) _)
  ).foreach { case (dbType, privilege) =>

    test(s"SHOW $dbType") {
      yields(privilege(None))
    }

    test(s"USE system SHOW $dbType") {
      yields(privilege(None))
    }

    test(s"SHOW $dbType WHERE access = 'GRANTED'") {
      yields(privilege(Some(Right(where(equals(accessVar, grantedString))))))
    }

    test(s"SHOW $dbType WHERE access = 'GRANTED' AND action = 'match'") {
      val accessPredicate = equals(accessVar, grantedString)
      val matchPredicate = equals(varFor(actionString), literalString("match"))
      yields(privilege(Some(Right(where(and(accessPredicate, matchPredicate))))))
    }

    test(s"SHOW $dbType YIELD access ORDER BY access") {
      val orderByClause = orderBy(sortItem(accessVar))
      val columns = yieldClause(returnItems(variableReturnItem(accessString)), Some(orderByClause))
      yields(privilege(Some(Left((columns, None)))))
    }

    test(s"SHOW $dbType YIELD access ORDER BY access WHERE access ='none'") {
      val orderByClause = orderBy(sortItem(accessVar))
      val whereClause = where(equals(accessVar, noneString))
      val columns = yieldClause(returnItems(variableReturnItem(accessString)), Some(orderByClause), where = Some(whereClause))
      yields(privilege(Some(Left((columns, None)))))
    }

    test(s"SHOW $dbType YIELD access ORDER BY access SKIP 1 LIMIT 10 WHERE access ='none'") {
      val orderByClause = orderBy(sortItem(accessVar))
      val whereClause = where(equals(accessVar, noneString))
      val columns = yieldClause(returnItems(variableReturnItem(accessString)), Some(orderByClause), Some(skip(1)), Some(limit(10)), Some(whereClause))
      yields(privilege(Some(Left((columns, None)))))
    }

    test(s"SHOW $dbType YIELD access SKIP -1") {
      val columns = yieldClause(returnItems(variableReturnItem(accessString)), skip = Some(skip(-1)))
      yields(privilege(Some(Left((columns, None)))))
    }

    test(s"SHOW $dbType YIELD access ORDER BY access RETURN access") {
      yields(privilege(
        Some(Left((yieldClause(returnItems(variableReturnItem(accessString)), Some(orderBy(sortItem(accessVar)))),
          Some(returnClause(returnItems(variableReturnItem(accessString))))
        )))
      ))
    }

    test(s"SHOW $dbType WHERE access = 'GRANTED' RETURN action") {
      failsToParse
    }

    test(s"SHOW $dbType YIELD * RETURN *") {
      yields(privilege(Some(Left((yieldClause(returnAllItems),Some(returnClause(returnAllItems)))))))
    }
  }

  test("SHOW DATABASE `foo.bar`") {
    yields(ast.ShowDatabase(NamedDatabaseScope(literalFooBar)(pos), None))
  }

  test("SHOW DATABASE foo.bar") {
    yields(ast.ShowDatabase(NamedDatabaseScope(literalFooBar)(pos), None))
  }

  test("SHOW DATABASE") {
    failsToParse
  }

  test("SHOW DATABASE blah YIELD *,blah RETURN user") {
    failsToParse
  }

  // CREATE DATABASE

  test("CREATE DATABASE foo") {
    yields(ast.CreateDatabase(literalFoo, ast.IfExistsThrowError, NoOptions, NoWait))
  }

  test("USE system CREATE DATABASE foo") {
    // can parse USE clause, but is not included in AST
    yields(ast.CreateDatabase(literalFoo, ast.IfExistsThrowError, NoOptions, NoWait))
  }

  test("CREATE DATABASE $foo") {
    yields(ast.CreateDatabase(paramFoo, ast.IfExistsThrowError, NoOptions, NoWait))
  }

  test("CREATE DATABASE `foo.bar`") {
    yields(ast.CreateDatabase(literalFooBar, ast.IfExistsThrowError, NoOptions, NoWait))
  }

  test("CREATE DATABASE foo WAIT") {
    yields(ast.CreateDatabase(literal("foo"), ast.IfExistsThrowError, NoOptions, IndefiniteWait))
  }

  test("CREATE DATABASE foo WAIT 12") {
    yields(ast.CreateDatabase(literal("foo"), ast.IfExistsThrowError, NoOptions, TimeoutAfter(12)))
  }

  test("CREATE DATABASE foo WAIT 12 SEC") {
    yields(ast.CreateDatabase(literal("foo"), ast.IfExistsThrowError, NoOptions, TimeoutAfter(12)))
  }

  test("CREATE DATABASE foo WAIT 12 SECOND") {
    yields(ast.CreateDatabase(literal("foo"), ast.IfExistsThrowError, NoOptions, TimeoutAfter(12)))
  }

  test("CREATE DATABASE foo WAIT 12 SECONDS") {
    yields(ast.CreateDatabase(literal("foo"), ast.IfExistsThrowError, NoOptions, TimeoutAfter(12)))
  }

  test("CREATE DATABASE foo NOWAIT") {
    yields(ast.CreateDatabase(literal("foo"), ast.IfExistsThrowError, NoOptions, NoWait))
  }

  test("CATALOG CREATE DATABASE `foo.bar`") {
    yields(_ => ast.HasCatalog(ast.CreateDatabase(literalFooBar, ast.IfExistsThrowError, NoOptions, NoWait)(pos)))
  }

  test("CREATE DATABASE foo.bar") {
    yields(ast.CreateDatabase(literalFooBar, ast.IfExistsThrowError, NoOptions, NoWait))
  }

  test("CATALOG CREATE DATABASE foo.bar") {
    yields(_ => ast.HasCatalog(ast.CreateDatabase(literalFooBar, ast.IfExistsThrowError, NoOptions, NoWait)(pos)))
  }

  test("CATALOG CREATE DATABASE `graph.db`.`db.db`") {
    yields(_ => ast.HasCatalog(ast.CreateDatabase(literal("graph.db.db.db"), ast.IfExistsThrowError, NoOptions, NoWait)(pos)))
  }

  test("CATALOG CREATE DATABASE `foo-bar42`") {
    yields(_ => ast.HasCatalog(ast.CreateDatabase(literal("foo-bar42"), ast.IfExistsThrowError, NoOptions, NoWait)(pos)))
  }

  test("CATALOG CREATE DATABASE `_foo-bar42`") {
    yields(_ => ast.HasCatalog(ast.CreateDatabase(literal("_foo-bar42"), ast.IfExistsThrowError, NoOptions, NoWait)(pos)))
  }

  test("CATALOG CREATE DATABASE ``") {
    yields(_ => ast.HasCatalog(ast.CreateDatabase(literalEmpty, ast.IfExistsThrowError, NoOptions, NoWait)(pos)))
  }

  test("CREATE DATABASE foo IF NOT EXISTS") {
    yields(ast.CreateDatabase(literalFoo, ast.IfExistsDoNothing, NoOptions, NoWait))
  }

  test("CREATE DATABASE foo IF NOT EXISTS WAIT 10 SECONDS") {
    yields(ast.CreateDatabase(literalFoo, ast.IfExistsDoNothing, NoOptions, TimeoutAfter(10)))
  }

  test("CREATE DATABASE foo IF NOT EXISTS WAIT") {
    yields(ast.CreateDatabase(literalFoo, ast.IfExistsDoNothing, NoOptions, IndefiniteWait))
  }

  test("CREATE  DATABASE foo IF NOT EXISTS NOWAIT") {
    yields(ast.CreateDatabase(literalFoo, ast.IfExistsDoNothing, NoOptions, NoWait))
  }

  test("CATALOG CREATE DATABASE `_foo-bar42` IF NOT EXISTS") {
    yields(_ => ast.HasCatalog(ast.CreateDatabase(literal("_foo-bar42"), ast.IfExistsDoNothing, NoOptions, NoWait)(pos)))
  }

  test("CREATE OR REPLACE DATABASE foo") {
    yields(ast.CreateDatabase(literalFoo, ast.IfExistsReplace, NoOptions, NoWait))
  }

  test("CREATE OR REPLACE DATABASE foo WAIT 10 SECONDS") {
    yields(ast.CreateDatabase(literalFoo, ast.IfExistsReplace, NoOptions, TimeoutAfter(10)))
  }

  test("CREATE OR REPLACE DATABASE foo WAIT") {
    yields(ast.CreateDatabase(literalFoo, ast.IfExistsReplace, NoOptions, IndefiniteWait))
  }

  test("CREATE OR REPLACE DATABASE foo NOWAIT") {
    yields(ast.CreateDatabase(literalFoo, ast.IfExistsReplace, NoOptions, NoWait))
  }

  test("CATALOG CREATE OR REPLACE DATABASE `_foo-bar42`") {
    yields(_ => ast.HasCatalog(ast.CreateDatabase(literal("_foo-bar42"), ast.IfExistsReplace, NoOptions, NoWait)(pos)))
  }

  test("CREATE OR REPLACE DATABASE foo IF NOT EXISTS") {
    yields(ast.CreateDatabase(literalFoo, ast.IfExistsInvalidSyntax, NoOptions, NoWait))
  }

  test("CREATE DATABASE foo OPTIONS {existingData: 'use', existingDataSeedInstance: '84c3ee6f-260e-47db-a4b6-589c807f2c2e'}") {
    yields(ast.CreateDatabase(Left("foo"), IfExistsThrowError,  OptionsMap(Map("existingData" -> literalString("use"),
        "existingDataSeedInstance" -> literalString("84c3ee6f-260e-47db-a4b6-589c807f2c2e"))), NoWait))
  }

  test("CREATE DATABASE foo OPTIONS {existingData: 'use', existingDataSeedInstance: '84c3ee6f-260e-47db-a4b6-589c807f2c2e'} WAIT") {
    yields(ast.CreateDatabase(Left("foo"), IfExistsThrowError, OptionsMap(Map("existingData" -> literalString("use"),
        "existingDataSeedInstance" -> literalString("84c3ee6f-260e-47db-a4b6-589c807f2c2e"))), IndefiniteWait))
  }

  test("CREATE DATABASE foo OPTIONS $param") {
    yields(ast.CreateDatabase(Left("foo"), IfExistsThrowError, OptionsParam(parameter("param", CTMap)), NoWait))
  }

  test("CREATE DATABASE \"foo.bar\"") {
    failsToParse
  }

  test("CATALOG CREATE DATABASE foo-bar42") {
    failsToParse
  }

  test("CATALOG CREATE DATABASE _foo-bar42") {
    failsToParse
  }

  test("CATALOG CREATE DATABASE 42foo-bar") {
    failsToParse
  }

  test("CATALOG CREATE DATABASE") {
    failsToParse
  }

  test("CATALOG CREATE DATABASE _foo-bar42 IF NOT EXISTS") {
    failsToParse
  }

  test("CREATE DATABASE  IF NOT EXISTS") {
    failsToParse
  }

  test("CREATE DATABASE foo IF EXISTS") {
    failsToParse
  }

  test("CREATE DATABASE foo WAIT -12") {
    failsToParse
  }

  test("CREATE DATABASE foo WAIT 3.14") {
    failsToParse
  }

  test("CREATE DATABASE foo WAIT bar") {
    failsToParse
  }

  test("CATALOG CREATE OR REPLACE DATABASE _foo-bar42") {
    failsToParse
  }

  test("CREATE OR REPLACE DATABASE") {
    failsToParse
  }

  // DROP DATABASE

  test("DROP DATABASE foo") {
    yields(ast.DropDatabase(literalFoo, ifExists = false, DestroyData, NoWait))
  }

  test("DROP DATABASE $foo") {
    yields(ast.DropDatabase(paramFoo, ifExists = false, DestroyData, NoWait))
  }

  test("DROP DATABASE foo WAIT") {
    yields(ast.DropDatabase(literalFoo, ifExists = false, DestroyData, IndefiniteWait))
  }

  test("DROP DATABASE foo WAIT 10") {
    yields(ast.DropDatabase(literal("foo"), ifExists = false, DestroyData, TimeoutAfter(10)))
  }

  test("DROP DATABASE foo WAIT 10 SEC") {
    yields(ast.DropDatabase(literal("foo"), ifExists = false, DestroyData, TimeoutAfter(10)))
  }

  test("DROP DATABASE foo WAIT 10 SECOND") {
    yields(ast.DropDatabase(literal("foo"), ifExists = false, DestroyData, TimeoutAfter(10)))
  }

  test("DROP DATABASE foo WAIT 10 SECONDS") {
    yields(ast.DropDatabase(literal("foo"), ifExists = false, DestroyData, TimeoutAfter(10)))
  }

  test("DROP DATABASE foo NOWAIT") {
    yields(ast.DropDatabase(literalFoo, ifExists = false, DestroyData, NoWait))
  }

  test("CATALOG DROP DATABASE `foo.bar`") {
    yields(_ => ast.HasCatalog(ast.DropDatabase(literalFooBar, ifExists = false, DestroyData, NoWait)(pos)))
  }

  test("CATALOG DROP DATABASE foo.bar") {
    yields(_ => ast.HasCatalog(ast.DropDatabase(literalFooBar, ifExists = false, DestroyData, NoWait)(pos)))
  }

  test("DROP DATABASE foo IF EXISTS") {
    yields(ast.DropDatabase(literalFoo, ifExists = true, DestroyData, NoWait))
  }

  test("DROP DATABASE foo IF EXISTS WAIT") {
    yields(ast.DropDatabase(literalFoo, ifExists = true, DestroyData, IndefiniteWait))
  }

  test("DROP DATABASE foo IF EXISTS NOWAIT") {
    yields(ast.DropDatabase(literalFoo, ifExists = true, DestroyData, NoWait))
  }

  test("DROP DATABASE foo DUMP DATA") {
    yields(ast.DropDatabase(literalFoo, ifExists = false, DumpData, NoWait))
  }

  test("DROP DATABASE foo DESTROY DATA") {
    yields(ast.DropDatabase(literalFoo, ifExists = false, DestroyData, NoWait))
  }

  test("DROP DATABASE foo IF EXISTS DUMP DATA") {
    yields(ast.DropDatabase(literalFoo, ifExists = true, DumpData, NoWait))
  }

  test("DROP DATABASE foo IF EXISTS DESTROY DATA") {
    yields(ast.DropDatabase(literalFoo, ifExists = true, DestroyData, NoWait))
  }

  test("DROP DATABASE foo IF EXISTS DESTROY DATA WAIT") {
    yields(ast.DropDatabase(literal("foo"), ifExists = true, DestroyData, IndefiniteWait))
  }

  test("DROP DATABASE") {
    failsToParse
  }

  test("DROP DATABASE  IF EXISTS") {
    failsToParse
  }

  test("DROP DATABASE foo IF NOT EXISTS") {
    failsToParse
  }

  test("DROP DATABASE  KEEP DATA") {
    failsToParse
  }

  // START DATABASE

  test("START DATABASE foo") {
    yields(ast.StartDatabase(literalFoo, NoWait))
  }

  test("START DATABASE $foo") {
    yields(ast.StartDatabase(paramFoo, NoWait))
  }

  test("START DATABASE foo WAIT") {
    yields(ast.StartDatabase(literalFoo, IndefiniteWait))
  }

  test("START DATABASE foo WAIT 5") {
    yields(ast.StartDatabase(literal("foo"), TimeoutAfter(5)))
  }

  test("START DATABASE foo WAIT 5 SEC") {
    yields(ast.StartDatabase(literal("foo"), TimeoutAfter(5)))
  }

  test("START DATABASE foo WAIT 5 SECOND") {
    yields(ast.StartDatabase(literal("foo"), TimeoutAfter(5)))
  }

  test("START DATABASE foo WAIT 5 SECONDS") {
    yields(ast.StartDatabase(literal("foo"), TimeoutAfter(5)))
  }

  test("START DATABASE foo NOWAIT") {
    yields(ast.StartDatabase(literalFoo, NoWait))
  }

  test("CATALOG START DATABASE `foo.bar`") {
    yields(_ => ast.HasCatalog(ast.StartDatabase(literalFooBar, NoWait)(pos)))
  }

  test("CATALOG START DATABASE foo.bar") {
    yields(_ => ast.HasCatalog(ast.StartDatabase(literalFooBar, NoWait)(pos)))
  }

  test("START DATABASE") {
    failsToParse
  }

  // STOP DATABASE

  test("STOP DATABASE foo") {
    yields(ast.StopDatabase(literalFoo, NoWait))
  }

  test("STOP DATABASE $foo") {
    yields(ast.StopDatabase(paramFoo, NoWait))
  }

  test("STOP DATABASE foo WAIT") {
    yields(ast.StopDatabase(literalFoo, IndefiniteWait))
  }

  test("STOP DATABASE foo WAIT 99") {
    yields(ast.StopDatabase(literal("foo"), TimeoutAfter(99)))
  }

  test("STOP DATABASE foo WAIT 99 SEC") {
    yields(ast.StopDatabase(literal("foo"), TimeoutAfter(99)))
  }

  test("STOP DATABASE foo WAIT 99 SECOND") {
    yields(ast.StopDatabase(literal("foo"), TimeoutAfter(99)))
  }

  test("STOP DATABASE foo WAIT 99 SECONDS") {
    yields(ast.StopDatabase(literal("foo"), TimeoutAfter(99)))
  }

  test("STOP DATABASE foo NOWAIT") {
    yields(ast.StopDatabase(literalFoo, NoWait))
  }

  test("CATALOG STOP DATABASE `foo.bar`") {
    yields(_ => ast.HasCatalog(ast.StopDatabase(literalFooBar, NoWait)(pos)))
  }

  test("CATALOG STOP DATABASE foo.bar") {
    yields(_ => ast.HasCatalog(ast.StopDatabase(literalFooBar, NoWait)(pos)))
  }

  test("STOP DATABASE") {
    failsToParse
  }
}
