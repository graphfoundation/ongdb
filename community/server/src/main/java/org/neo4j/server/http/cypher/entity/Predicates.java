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
package org.neo4j.server.http.cypher.entity;

import java.io.IOException;

import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.kernel.impl.core.NodeEntity;
import org.neo4j.kernel.impl.core.RelationshipEntity;

/**
 * Provides predicates for http cypher objects.
 */
public final class Predicates
{
    public static boolean isDeleted( Relationship relationship ) throws IOException
    {
        if ( relationship instanceof HttpRelationship )
        {
            return ((HttpRelationship) relationship).isDeleted();
        }
        throw new IOException( "Expected HttpRelationship" );
    }

    public static boolean isDeleted( Node node ) throws IOException
    {
        if ( node instanceof HttpNode )
        {
            return ((HttpNode) node).isDeleted();
        }
        throw new IOException( "Expected HttpNode" );
    }

    public static boolean isFullNode( Node node )
    {
        if ( node instanceof HttpNode )
        {
            return ((HttpNode) node).isFullNode();
        }
        return true;
    }

    private Predicates()
    {
    }
}
