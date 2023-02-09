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
package org.neo4j.test;

import java.util.concurrent.TimeUnit;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.schema.AnyTokens;
import org.neo4j.graphdb.schema.ConstraintDefinition;
import org.neo4j.graphdb.schema.IndexDefinition;

public class GraphDatabaseServiceCleaner
{
    private GraphDatabaseServiceCleaner()
    {
        throw new UnsupportedOperationException();
    }

    public static void cleanDatabaseContent( GraphDatabaseService db )
    {
        cleanupSchema( db );
        cleanupAllRelationshipsAndNodes( db );
    }

    public static void cleanupSchema( GraphDatabaseService db )
    {
        try ( Transaction tx = db.beginTx() )
        {
            for ( ConstraintDefinition constraint : tx.schema().getConstraints() )
            {
                constraint.drop();
            }

            for ( IndexDefinition index : tx.schema().getIndexes() )
            {
                index.drop();
            }
            tx.commit();
        }
        // re-create the default indexes
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().indexFor( AnyTokens.ANY_RELATIONSHIP_TYPES ).withName( "rti" ).create();
            tx.schema().indexFor( AnyTokens.ANY_LABELS ).withName( "lti" ).create();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 1, TimeUnit.MINUTES );
        }
    }

    public static void cleanupAllRelationshipsAndNodes( GraphDatabaseService db )
    {
        try ( Transaction tx = db.beginTx() )
        {
            for ( Relationship relationship : tx.getAllRelationships() )
            {
                relationship.delete();
            }

            for ( Node node : tx.getAllNodes() )
            {
                node.delete();
            }
            tx.commit();
        }
    }
}
