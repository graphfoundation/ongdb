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
package org.neo4j.bolt.v3.runtime;

import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.api.parallel.ResourceLock;

import org.neo4j.bolt.BoltChannel;
import org.neo4j.bolt.runtime.SessionExtension;
import org.neo4j.bolt.testing.BoltTestUtil;
import org.neo4j.bolt.v3.BoltProtocolV3;
import org.neo4j.bolt.v3.BoltStateMachineV3;
import org.neo4j.bolt.v3.messaging.request.HelloMessage;
import org.neo4j.internal.helpers.collection.MapUtil;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.values.virtual.MapValue;
import org.neo4j.values.virtual.VirtualValues;

@ResourceLock( "boltStateMachineV3" )
public class BoltStateMachineV3StateTestBase
{
    protected static final MapValue EMPTY_PARAMS = VirtualValues.EMPTY_MAP;
    protected static final String USER_AGENT = "BoltConnectionIT/0.0";
    protected static final BoltChannel BOLT_CHANNEL = BoltTestUtil.newTestBoltChannel( "conn-v3-test-boltchannel-id" );
    protected static final MemoryTracker MEMORY_TRACKER = EmptyMemoryTracker.INSTANCE;

    @RegisterExtension
    static final SessionExtension env = new SessionExtension();

    protected BoltStateMachineV3 newStateMachine()
    {
        return (BoltStateMachineV3) env.newMachine( BoltProtocolV3.VERSION, BOLT_CHANNEL, MEMORY_TRACKER );
    }

    protected static HelloMessage newHelloMessage()
    {
        return new HelloMessage( MapUtil.map( "user_agent", USER_AGENT ) );
    }
}
