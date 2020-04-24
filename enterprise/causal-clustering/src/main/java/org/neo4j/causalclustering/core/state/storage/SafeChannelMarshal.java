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
package org.neo4j.causalclustering.core.state.storage;

import java.io.IOException;

import org.neo4j.causalclustering.messaging.marshalling.ChannelMarshal;
import org.neo4j.causalclustering.messaging.EndOfStreamException;
import org.neo4j.storageengine.api.ReadPastEndException;
import org.neo4j.storageengine.api.ReadableChannel;

/**
 * Wrapper class to handle ReadPastEndExceptions in a safe manner transforming it
 * to the checked EndOfStreamException which does not inherit from an IOException.
 *
 * @param <STATE> The type of state marshalled.
 */
public abstract class SafeChannelMarshal<STATE> implements ChannelMarshal<STATE>
{
    @Override
    public final STATE unmarshal( ReadableChannel channel ) throws IOException, EndOfStreamException
    {
        try
        {
            return unmarshal0( channel );
        }
        catch ( ReadPastEndException e )
        {
            throw new EndOfStreamException( e );
        }
    }

    /**
     * The specific implementation of unmarshal which does not have to deal
     * with the IOException {@link ReadPastEndException} and can safely throw
     * the checked EndOfStreamException.
     *
     * @param channel The channel to read from.
     * @return An unmarshalled object.
     * @throws IOException
     * @throws EndOfStreamException
     */
    protected abstract STATE unmarshal0( ReadableChannel channel ) throws IOException, EndOfStreamException;
}
