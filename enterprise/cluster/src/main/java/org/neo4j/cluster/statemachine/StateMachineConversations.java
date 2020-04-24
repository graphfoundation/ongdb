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
package org.neo4j.cluster.statemachine;

import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.cluster.InstanceId;

/**
 * Generate id's for state machine conversations. This should be shared between all state machines in a server.
 * <p>
 * These conversation id's can be used to uniquely identify conversations between distributed state machines.
 */
public class StateMachineConversations
{
    private final AtomicLong nextConversationId = new AtomicLong();
    private final String serverId;

    public StateMachineConversations( InstanceId me )
    {
        serverId = me.toString();
    }

    public String getNextConversationId()
    {
        return serverId + "/" + nextConversationId.incrementAndGet() + "#";
    }
}
