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
package org.neo4j.cluster.protocol.cluster;

import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.neo4j.cluster.InstanceId;
import org.neo4j.helpers.collection.Iterables;
import org.neo4j.logging.NullLogProvider;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.neo4j.test.mockito.matcher.IterableMatcher.matchesIterable;

public class ClusterConfigurationTest
{
    public static URI ONGDB_SERVER1_URI;
    public static InstanceId ONGDB_SERVER_ID;

    static
    {
        try
        {
            ONGDB_SERVER1_URI = new URI( "neo4j://server1" );
            ONGDB_SERVER_ID = new InstanceId( 1 );
        }
        catch ( URISyntaxException e )
        {
            e.printStackTrace();
        }
    }

    ClusterConfiguration configuration = new ClusterConfiguration( "default", NullLogProvider.getInstance(),
            new ArrayList<>() );

    @Test
    public void givenEmptyClusterWhenNodeAddedThenNodeWasAdded()
    {
        configuration.joined( ONGDB_SERVER_ID, ONGDB_SERVER1_URI );

        assertThat( configuration.getMemberIds(), matchesIterable( Iterables.iterable( ONGDB_SERVER_ID ) ) );
        assertThat( configuration.getUriForId( ONGDB_SERVER_ID ), equalTo( ONGDB_SERVER1_URI ) );
        assertThat( configuration.getMemberURIs(), equalTo( Arrays.asList( ONGDB_SERVER1_URI ) ) );
    }

    @Test
    public void givenEmptyClusterWhenNodeIsAddedTwiceThenNodeWasAddedOnce()
    {
        configuration.joined( ONGDB_SERVER_ID, ONGDB_SERVER1_URI );
        configuration.joined( ONGDB_SERVER_ID, ONGDB_SERVER1_URI );

        assertThat( configuration.getMemberIds(), matchesIterable( Iterables.iterable( ONGDB_SERVER_ID ) ) );
        assertThat( configuration.getUriForId( ONGDB_SERVER_ID ), equalTo( ONGDB_SERVER1_URI ) );
        assertThat( configuration.getMemberURIs(), equalTo( Arrays.asList( ONGDB_SERVER1_URI ) ) );
    }

    @Test
    public void givenClusterWithOneNodeWhenNodeIsRemovedThenClusterIsEmpty()
    {
        configuration.joined( ONGDB_SERVER_ID, ONGDB_SERVER1_URI );
        configuration.left( ONGDB_SERVER_ID );

        assertThat( configuration.getMemberIds(), matchesIterable( Iterables.empty() ) );
        assertThat( configuration.getUriForId( ONGDB_SERVER_ID ), equalTo( null ) );
        assertThat( configuration.getMemberURIs(), equalTo( Collections.<URI>emptyList() ) );

    }

    @Test
    public void givenClusterWithOneNodeWhenNodeIsRemovedTwiceThenClusterIsEmpty()
    {
        configuration.joined( ONGDB_SERVER_ID, ONGDB_SERVER1_URI );
        configuration.left( ONGDB_SERVER_ID );
        configuration.left( ONGDB_SERVER_ID );

        assertThat( configuration.getMemberIds(), matchesIterable( Iterables.empty() ) );
        assertThat( configuration.getUriForId( ONGDB_SERVER_ID ), equalTo( null ) );
        assertThat( configuration.getMemberURIs(), equalTo( Collections.<URI>emptyList() ) );

    }
}

