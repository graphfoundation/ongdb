/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.ha.correctness;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.helpers.collection.Pair;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.test.TestGraphDatabaseFactory;

import static org.neo4j.graphdb.Label.label;

public class ProofDatabase
{
    private final GraphDatabaseService gds;
    private final Map<ClusterState, Node> stateNodes = new HashMap<>();

    public ProofDatabase( String location )
    {
        File dbDir = new File( location );
        cleanDbDir( dbDir );
        this.gds = new TestGraphDatabaseFactory().newEmbeddedDatabase( dbDir );
    }

    public Node newState( ClusterState state )
    {
        try ( Transaction tx = gds.beginTx() )
        {
            Node node = gds.createNode( label( "State" ) );
            node.setProperty( "description", state.toString() );
            tx.success();

            stateNodes.put( state, node );
            return node;
        }
    }

    public void newStateTransition( ClusterState originalState,
                            Pair<ClusterAction, ClusterState> transition )
    {
        try ( Transaction tx = gds.beginTx() )
        {
            Node stateNode = stateNodes.get( originalState );

            Node subStateNode = newState( transition.other() );

            Relationship msg = stateNode.createRelationshipTo( subStateNode, RelationshipType.withName( "MESSAGE" ) );
            msg.setProperty( "description", transition.first().toString() );
            tx.success();
        }
    }

    private void cleanDbDir( File dbDir )
    {
        if ( dbDir.exists() )
        {
            try
            {
                FileUtils.deleteRecursively( dbDir );
            }
            catch ( IOException e )
            {
                throw new RuntimeException( e );
            }
        }
        else
        {
            dbDir.getParentFile().mkdirs();
        }
    }

    public void shutdown()
    {
        gds.shutdown();
    }

    public boolean isKnownState( ClusterState state )
    {
        return stateNodes.containsKey( state );
    }

    public long numberOfKnownStates()
    {
        return stateNodes.size();
    }

    public long id( ClusterState nextState )
    {
        return stateNodes.get(nextState).getId();
    }

    public void export( GraphVizExporter graphVizExporter ) throws IOException
    {
        graphVizExporter.export( gds );
    }
}
