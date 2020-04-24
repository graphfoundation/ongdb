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

import org.neo4j.cluster.InstanceId;

/**
 * Listener interface for heart beat. Implementations will receive
 * callbacks when instances in the cluster are considered failed or alive.
 */
public interface HeartbeatListener
{
    void failed( InstanceId server );

    void alive( InstanceId server );

    class Adapter implements HeartbeatListener
    {
        @Override
        public void failed( InstanceId server )
        {
        }

        @Override
        public void alive( InstanceId server )
        {
        }
    }
}
