/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.causalclustering.messaging.marshalling;

import io.netty.buffer.ByteBuf;
import org.junit.Rule;
import org.junit.Test;

import org.neo4j.causalclustering.helpers.Buffers;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ByteArrayChunkedEncoderTest
{
    @Rule
    public final Buffers buffers = new Buffers();

    @Test
    public void shouldWriteToBufferInChunks()
    {
        int chunkSize = 5;
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6};
        byte[] readData = new byte[6];
        ByteArrayChunkedEncoder byteArraySerializer = new ByteArrayChunkedEncoder( data, chunkSize );

        ByteBuf buffer = byteArraySerializer.readChunk( buffers );
        buffer.readBytes( readData, 0, chunkSize );
        assertEquals( 0, buffer.readableBytes() );

        buffer = byteArraySerializer.readChunk( buffers );
        buffer.readBytes( readData, chunkSize, 1 );
        assertArrayEquals( data, readData );
        assertEquals( 0, buffer.readableBytes() );

        assertNull( byteArraySerializer.readChunk( buffers ) );
    }

    @Test( expected = IllegalArgumentException.class )
    public void shouldThrowOnTooSmallChunk()
    {
        new ByteArrayChunkedEncoder( new byte[1], 0 );
    }
}
