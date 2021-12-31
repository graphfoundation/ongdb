/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

public class StringMarshalTest
{
    @Test
    public void shouldSerializeAndDeserializeString()
    {
        // given
        final String TEST_STRING = "ABC123_?";
        final ByteBuf buffer = UnpooledByteBufAllocator.DEFAULT.buffer();

        // when
        StringMarshal.marshal( buffer, TEST_STRING );
        String reconstructed = StringMarshal.unmarshal( buffer );

        // then
        assertNotSame( TEST_STRING, reconstructed );
        assertEquals( TEST_STRING, reconstructed );
    }

    @Test
    public void shouldSerializeAndDeserializeEmptyString()
    {
        // given
        final String TEST_STRING = "";
        final ByteBuf buffer = UnpooledByteBufAllocator.DEFAULT.buffer();

        // when
        StringMarshal.marshal( buffer, TEST_STRING );
        String reconstructed = StringMarshal.unmarshal( buffer );

        // then
        assertNotSame( TEST_STRING, reconstructed );
        assertEquals( TEST_STRING, reconstructed );
    }

    @Test
    public void shouldSerializeAndDeserializeNull()
    {
        // given
        final ByteBuf buffer = UnpooledByteBufAllocator.DEFAULT.buffer();

        // when
        StringMarshal.marshal( buffer, null );
        String reconstructed = StringMarshal.unmarshal( buffer );

        // then
        assertNull( reconstructed );
    }
}
