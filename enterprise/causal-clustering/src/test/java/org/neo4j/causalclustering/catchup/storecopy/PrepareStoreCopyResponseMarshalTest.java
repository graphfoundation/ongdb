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
package org.neo4j.causalclustering.catchup.storecopy;

import io.netty.buffer.ByteBuf;
import io.netty.channel.embedded.EmbeddedChannel;
import org.eclipse.collections.api.set.primitive.LongSet;
import org.eclipse.collections.impl.factory.primitive.LongSets;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.stream.Stream;

public class PrepareStoreCopyResponseMarshalTest
{
    private EmbeddedChannel embeddedChannel;

    private static void sendToChannel( PrepareStoreCopyResponse prepareStoreCopyResponse, EmbeddedChannel embeddedChannel )
    {
        embeddedChannel.writeOutbound( prepareStoreCopyResponse );

        ByteBuf object = embeddedChannel.readOutbound();
        embeddedChannel.writeInbound( object );
    }

    @Before
    public void setup()
    {
        embeddedChannel = new EmbeddedChannel( new PrepareStoreCopyResponse.Encoder(), new PrepareStoreCopyResponse.Decoder() );
    }

    @Test
    public void transactionIdGetsTransmitted()
    {
        // given
        long transactionId = Long.MAX_VALUE;

        // when a transaction id is serialised
        PrepareStoreCopyResponse prepareStoreCopyResponse = PrepareStoreCopyResponse.success( new File[0], LongSets.immutable.empty(), transactionId );
        sendToChannel( prepareStoreCopyResponse, embeddedChannel );

        // then it can be deserialised
        PrepareStoreCopyResponse readPrepareStoreCopyResponse = embeddedChannel.readInbound();
        assertEquals( prepareStoreCopyResponse.lastTransactionId(), readPrepareStoreCopyResponse.lastTransactionId() );
    }

    @Test
    public void fileListGetsTransmitted()
    {
        // given
        File[] files =
                new File[]{new File( "File a.txt" ), new File( "file-b" ), new File( "aoifnoasndfosidfoisndfoisnodainfsonidfaosiidfna" ), new File( "" )};

        // when
        PrepareStoreCopyResponse prepareStoreCopyResponse = PrepareStoreCopyResponse.success( files, LongSets.immutable.empty(), 0L );
        sendToChannel( prepareStoreCopyResponse, embeddedChannel );

        // then it can be deserialised
        PrepareStoreCopyResponse readPrepareStoreCopyResponse = embeddedChannel.readInbound();
        assertEquals( prepareStoreCopyResponse.getFiles().length, readPrepareStoreCopyResponse.getFiles().length );
        for ( File file : files )
        {
            assertEquals( 1, Stream.of( readPrepareStoreCopyResponse.getFiles() ).map( File::getName ).filter( f -> f.equals( file.getName() ) ).count() );
        }
    }

    @Test
    public void descriptorsGetTransmitted()
    {
        // given
        File[] files =
                new File[]{new File( "File a.txt" ), new File( "file-b" ), new File( "aoifnoasndfosidfoisndfoisnodainfsonidfaosiidfna" ), new File( "" )};
        LongSet indexIds = LongSets.immutable.of( 13 );

        // when
        PrepareStoreCopyResponse prepareStoreCopyResponse = PrepareStoreCopyResponse.success( files, indexIds, 1L );
        sendToChannel( prepareStoreCopyResponse, embeddedChannel );

        // then it can be deserialised
        PrepareStoreCopyResponse readPrepareStoreCopyResponse = embeddedChannel.readInbound();
        assertEquals( prepareStoreCopyResponse.getFiles().length, readPrepareStoreCopyResponse.getFiles().length );
        for ( File file : files )
        {
            assertEquals( 1, Stream.of( readPrepareStoreCopyResponse.getFiles() ).map( File::getName ).filter( f -> f.equals( file.getName() ) ).count() );
        }
        assertEquals( prepareStoreCopyResponse.getIndexIds(), readPrepareStoreCopyResponse.getIndexIds() );
    }
}
