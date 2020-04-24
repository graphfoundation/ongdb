/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.causalclustering.core.state;

import java.io.IOException;

import org.neo4j.causalclustering.core.state.storage.SafeStateMarshal;
import org.neo4j.storageengine.api.ReadableChannel;
import org.neo4j.storageengine.api.WritableChannel;

/**
 * A marshal for an index that starts with -1 at the empty slot before the first real entry at 0.
 */
public class LongIndexMarshal extends SafeStateMarshal<Long>
{
    @Override
    public Long startState()
    {
        return -1L;
    }

    @Override
    public long ordinal( Long index )
    {
        return index;
    }

    @Override
    public void marshal( Long index, WritableChannel channel ) throws IOException
    {
        channel.putLong( index );
    }

    @Override
    protected Long unmarshal0( ReadableChannel channel ) throws IOException
    {
        return channel.getLong();
    }
}
