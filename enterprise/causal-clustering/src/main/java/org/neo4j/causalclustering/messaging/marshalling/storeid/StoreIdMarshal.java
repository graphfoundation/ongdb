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
package org.neo4j.causalclustering.messaging.marshalling.storeid;

import io.netty.handler.codec.DecoderException;

import java.io.IOException;

import org.neo4j.causalclustering.core.state.storage.SafeChannelMarshal;
import org.neo4j.causalclustering.identity.StoreId;
import org.neo4j.storageengine.api.ReadableChannel;
import org.neo4j.storageengine.api.WritableChannel;

public final class StoreIdMarshal extends SafeChannelMarshal<StoreId>
{
    public static final StoreIdMarshal INSTANCE = new StoreIdMarshal();

    private StoreIdMarshal() {}

    @Override
    public void marshal( StoreId storeId, WritableChannel channel ) throws IOException
    {
        if ( storeId == null )
        {
            channel.put( (byte) 0 );
            return;
        }

        channel.put( (byte) 1 );
        channel.putLong( storeId.getCreationTime() );
        channel.putLong( storeId.getRandomId() );
        channel.putLong( storeId.getUpgradeTime() );
        channel.putLong( storeId.getUpgradeId() );
    }

    @Override
    protected StoreId unmarshal0( ReadableChannel channel ) throws IOException
    {
        byte exists = channel.get();
        if ( exists == 0 )
        {
            return null;
        }
        else if ( exists != 1 )
        {
            throw new DecoderException( "Unexpected value: " + exists );
        }

        long creationTime = channel.getLong();
        long randomId = channel.getLong();
        long upgradeTime = channel.getLong();
        long upgradeId = channel.getLong();
        return new StoreId( creationTime, randomId, upgradeTime, upgradeId );
    }
}
