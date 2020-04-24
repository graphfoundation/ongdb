/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.cluster.protocol.cluster;

import java.net.URI;
import java.util.concurrent.Future;

/**
 * Cluster membership management. This is implemented by {@link ClusterState}
 *
 * @see ClusterState
 * @see ClusterMessage
 */
public interface Cluster
{
    void create( String clusterName );

    Future<ClusterConfiguration> join( String clusterName, URI... otherServerUrls );

    void leave();

    void addClusterListener( ClusterListener listener );

    void removeClusterListener( ClusterListener listener );
}
