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
package org.neo4j.kernel.api.impl.fulltext;

import org.junit.jupiter.api.Test;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Transaction;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.Inject;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DbmsExtension
class PartialNodeIndexUpdateIT
{
    @Inject
    private GraphDatabaseService database;

    @Test
    void partialIndexedNodePropertiesUpdate()
    {
        final Label userLabel = Label.label( "User" );
        try ( Transaction transaction = database.beginTx() )
        {
            transaction.execute( "CREATE FULLTEXT INDEX test FOR (n: Card | " + userLabel.name() + ") " +
                            "ON EACH [n.title, n.plainText, n.username, n.screenName]" );
            transaction.commit();
        }

        final String value = "asdf";
        try ( Transaction transaction = database.beginTx() )
        {
            transaction.execute( "UNWIND [{_id:48, properties:{screenName:\"" + value + "\"}}] as row " +
                    "CREATE (n:L1{_id: row._id}) SET n += row.properties SET n:" + userLabel.name() );
            transaction.commit();
        }

        try ( Transaction transaction = database.beginTx() )
        {
            assertNotNull( transaction.findNode( userLabel, "screenName", value ) );
        }
    }
}
