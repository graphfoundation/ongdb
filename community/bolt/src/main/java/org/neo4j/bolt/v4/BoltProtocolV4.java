/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.bolt.v4;

import org.neo4j.bolt.BoltChannel;
import org.neo4j.bolt.BoltProtocolVersion;
import org.neo4j.bolt.messaging.BoltRequestMessageReader;
import org.neo4j.bolt.messaging.BoltResponseMessageWriter;
import org.neo4j.bolt.packstream.Neo4jPack;
import org.neo4j.bolt.runtime.BoltConnection;
import org.neo4j.bolt.runtime.BoltConnectionFactory;
import org.neo4j.bolt.runtime.BookmarksParser;
import org.neo4j.bolt.runtime.statemachine.BoltStateMachineFactory;
import org.neo4j.bolt.transport.AbstractBoltProtocol;
import org.neo4j.bolt.transport.TransportThrottleGroup;
import org.neo4j.bolt.transport.pipeline.ChannelProtector;
import org.neo4j.bolt.v3.messaging.BoltResponseMessageWriterV3;
import org.neo4j.bolt.v4.messaging.BoltRequestMessageReaderV4;
import org.neo4j.configuration.Config;
import org.neo4j.logging.internal.LogService;
import org.neo4j.memory.MemoryTracker;

/**
 * Bolt protocol V4. It hosts all the components that are specific to BoltV4
 */
public class BoltProtocolV4 extends AbstractBoltProtocol
{
    public static final BoltProtocolVersion VERSION = new BoltProtocolVersion( 4, 0 );

    public BoltProtocolV4( BoltChannel channel, BoltConnectionFactory connectionFactory, BoltStateMachineFactory stateMachineFactory,
                           Config config, BookmarksParser bookmarksParser, LogService logging, TransportThrottleGroup throttleGroup,
                           ChannelProtector channelProtector, MemoryTracker memoryTracker )
    {
        super( channel, connectionFactory, stateMachineFactory, config, bookmarksParser, logging, throttleGroup, channelProtector, memoryTracker );
    }

    @Override
    public BoltProtocolVersion version()
    {
        return VERSION;
    }

    @Override
    protected BoltRequestMessageReader createMessageReader( BoltConnection connection,
                                                            BoltResponseMessageWriter messageWriter, BookmarksParser bookmarksParser, LogService logging,
                                                            ChannelProtector channelProtector, MemoryTracker memoryTracker )
    {
        memoryTracker.allocateHeap( BoltRequestMessageReaderV4.SHALLOW_SIZE );
        return new BoltRequestMessageReaderV4( connection, messageWriter, bookmarksParser, channelProtector, logging );
    }

    @Override
    protected BoltResponseMessageWriter createMessageWriter( Neo4jPack neo4jPack,
                                                             LogService logging, MemoryTracker memoryTracker )
    {
        var output = createPackOutput( memoryTracker );

        memoryTracker.allocateHeap( BoltResponseMessageWriterV3.SHALLOW_SIZE );
        return new BoltResponseMessageWriterV3( neo4jPack, output, logging );
    }
}
