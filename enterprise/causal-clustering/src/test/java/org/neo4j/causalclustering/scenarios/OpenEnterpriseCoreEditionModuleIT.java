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
package org.neo4j.causalclustering.scenarios;

import org.junit.Rule;
import org.junit.Test;

import java.util.Collections;

import org.neo4j.causalclustering.discovery.Cluster;
import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.test.causalclustering.ClusterRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.neo4j.causalclustering.core.CausalClusteringSettings.database;

public class OpenEnterpriseCoreEditionModuleIT
{
    private static final String DB_NAME = "foo";

    @Rule
    public final ClusterRule clusterRule = new ClusterRule()
            .withNumberOfCoreMembers( 3 )
            .withNumberOfReadReplicas( 0 )
            .withDatabaseNames( Collections.singleton( DB_NAME ) );

    @Test
    public void shouldStartCoreWithNonDefaultDatabaseNameAndAllowWrites() throws Exception
    {
        Cluster cluster = clusterRule.startCluster();

        assertNotNull( "Leader should be elected for configured database.", cluster.awaitLeader( DB_NAME ) );
        cluster.coreMembers().forEach( member ->
        {
            assertEquals( "Core member should keep configured causal-clustering database.",
                    DB_NAME, member.settingValue( database.name() ) );
            assertEquals( "Core member should keep configured active database.",
                    DB_NAME, member.settingValue( GraphDatabaseSettings.active_database.name() ) );
        } );

        cluster.coreTx( DB_NAME, ( db, tx ) ->
        {
            db.createNode();
            tx.success();
        } );
    }
}
