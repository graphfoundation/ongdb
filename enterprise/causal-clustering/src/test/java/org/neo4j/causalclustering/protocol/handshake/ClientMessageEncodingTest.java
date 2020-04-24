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
package org.neo4j.causalclustering.protocol.handshake;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

@RunWith( Parameterized.class )
public class ClientMessageEncodingTest
{
    private final ClientMessage message;
    private final ServerMessageEncoder encoder = new ServerMessageEncoder();
    private final ClientMessageDecoder decoder = new ClientMessageDecoder();

    private List<Object> encodeDecode( ClientMessage message ) throws ClientHandshakeException
    {
        ByteBuf byteBuf = Unpooled.directBuffer();
        List<Object> output = new ArrayList<>();

        encoder.encode( null, message, byteBuf );
        decoder.decode( null, byteBuf, output );

        return output;
    }

    @Parameterized.Parameters( name = "ResponseMessage-{0}" )
    public static Collection<ClientMessage> data()
    {
        return Arrays.asList(
                new ApplicationProtocolResponse( StatusCode.FAILURE, "protocol", 13 ),
                new ModifierProtocolResponse( StatusCode.SUCCESS, "modifier", "7" ),
                new SwitchOverResponse( StatusCode.FAILURE )
                );
    }

    public ClientMessageEncodingTest( ClientMessage message )
    {
        this.message = message;
    }

    @Test
    public void shouldCompleteEncodingRoundTrip() throws ClientHandshakeException
    {
        //when
        List<Object> output = encodeDecode( message );

        //then
        assertThat( output, hasSize( 1 ) );
        assertThat( output.get( 0 ), equalTo( message ) );
    }
}
