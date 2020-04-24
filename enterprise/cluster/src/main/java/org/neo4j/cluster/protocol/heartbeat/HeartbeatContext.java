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
package org.neo4j.cluster.protocol.heartbeat;

import java.util.List;
import java.util.Set;

import org.neo4j.cluster.InstanceId;
import org.neo4j.cluster.protocol.ConfigurationContext;
import org.neo4j.cluster.protocol.LoggingContext;
import org.neo4j.cluster.protocol.TimeoutsContext;

/**
 * Context used by the {@link HeartbeatState} state machine.
 */
public interface HeartbeatContext
    extends TimeoutsContext, ConfigurationContext, LoggingContext
{
    void started();

    /**
     * @return True iff the node was suspected
     */
    boolean alive( InstanceId node );

    void suspect( InstanceId node );

    void suspicions( InstanceId from, Set<InstanceId> suspicions );

    Set<InstanceId> getFailed();

    Iterable<InstanceId> getAlive();

    void addHeartbeatListener( HeartbeatListener listener );

    void removeHeartbeatListener( HeartbeatListener listener );

    void serverLeftCluster( InstanceId node );

    boolean isFailedBasedOnSuspicions( InstanceId node );

    List<InstanceId> getSuspicionsOf( InstanceId server );

    Set<InstanceId> getSuspicionsFor( InstanceId uri );

    Iterable<InstanceId> getOtherInstances();

    long getLastKnownLearnedInstanceInCluster();

    long getLastLearnedInstanceId();

    /**
     * Adds an instance in the failed set. Note that the {@link #isFailedBasedOnSuspicions(InstanceId)} method does not consult this set
     * or adds to it, instead deriving failed status from suspicions.
     */
    void failed( InstanceId instanceId );
}
