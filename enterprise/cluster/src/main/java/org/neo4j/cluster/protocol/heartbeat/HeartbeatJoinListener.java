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

import java.net.URI;

import org.neo4j.cluster.InstanceId;
import org.neo4j.cluster.com.message.Message;
import org.neo4j.cluster.com.message.MessageHolder;
import org.neo4j.cluster.protocol.cluster.ClusterListener;

/**
 * When an instance joins a cluster, setup a heartbeat for it
 */
public class HeartbeatJoinListener extends ClusterListener.Adapter
{
    private final MessageHolder outgoing;

    public HeartbeatJoinListener( MessageHolder outgoing )
    {
        this.outgoing = outgoing;
    }

    @Override
    public void joinedCluster( InstanceId member, URI atUri )
    {
        outgoing.offer( Message.internal( HeartbeatMessage.reset_send_heartbeat, member ) );
    }
}
