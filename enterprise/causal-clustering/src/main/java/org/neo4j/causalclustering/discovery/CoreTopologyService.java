/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.causalclustering.discovery;

import org.neo4j.causalclustering.core.consensus.LeaderInfo;
import org.neo4j.causalclustering.discovery.procedures.ClusterOverviewProcedure;
import org.neo4j.causalclustering.identity.ClusterId;

/**
 * Extends upon the topology service with a few extra services, connected to
 * the underlying discovery service.
 */
public interface CoreTopologyService extends TopologyService
{
    void addLocalCoreTopologyListener( Listener listener );

    void removeLocalCoreTopologyListener( Listener listener );

    /**
     * Publishes the cluster ID so that other members might discover it.
     * Should only succeed to publish if one missing or already the same (CAS logic).
     *
     * @param clusterId The cluster ID to publish.
     *
     * @return True if the cluster ID was successfully CAS:ed, otherwise false.
     */
    boolean setClusterId( ClusterId clusterId, String dbName ) throws InterruptedException;

    /**
     * Sets or updates the leader memberId for the given database (i.e. Raft consensus group).
     * This is intended for informational purposes **only**, e.g. in {@link ClusterOverviewProcedure}.
     * The leadership information should otherwise be communicated via raft as before.
     * @param leaderInfo Information about the new leader
     * @param dbName The database name for which memberId is the new leader
     */
    void setLeader( LeaderInfo leaderInfo, String dbName );

    /**
     * Set the leader memberId to null for a given database (i.e. Raft consensus group).
     * This is intended to trigger state cleanup for informational procedures like {@link ClusterOverviewProcedure}
     *
     * @param term The term for which this topology member should handle a stepdown
     * @param dbName The database for which this topology member should handle a stepdown
     */
    void handleStepDown( long term, String dbName );

    interface Listener
    {
        void onCoreTopologyChange( CoreTopology coreTopology );
        String dbName();
    }
}
