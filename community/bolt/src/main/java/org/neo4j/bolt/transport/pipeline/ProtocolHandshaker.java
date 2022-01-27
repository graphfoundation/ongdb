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
package org.neo4j.bolt.transport.pipeline;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

import java.util.ArrayList;
import java.util.Arrays;

import org.neo4j.bolt.BoltChannel;
import org.neo4j.bolt.BoltProtocol;
import org.neo4j.bolt.BoltProtocolVersion;
import org.neo4j.bolt.transport.BoltProtocolFactory;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.HeapEstimator;
import org.neo4j.memory.MemoryTracker;

public class ProtocolHandshaker extends ChannelInboundHandlerAdapter
{
    public static final long SHALLOW_SIZE = HeapEstimator.shallowSizeOfInstance( ProtocolHandshaker.class );

    public static final int BOLT_MAGIC_PREAMBLE = 0x6060B017;
    private static final int HANDSHAKE_BUFFER_SIZE = 5 * Integer.BYTES;

    private final BoltChannel boltChannel;
    private final BoltProtocolFactory boltProtocolFactory;
    private final Log log;
    private final boolean encryptionRequired;
    private final boolean encrypted;
    private final ChannelProtector channelProtector;
    private final MemoryTracker memoryTracker;

    private ByteBuf handshakeBuffer;
    private BoltProtocol protocol;

    public ProtocolHandshaker( BoltProtocolFactory boltProtocolFactory, BoltChannel boltChannel, LogProvider logging,
                               boolean encryptionRequired, boolean encrypted, ChannelProtector channelProtector, MemoryTracker memoryTracker )
    {
        this.boltProtocolFactory = boltProtocolFactory;
        this.boltChannel = boltChannel;
        this.log = logging.getLog( getClass() );
        this.encryptionRequired = encryptionRequired;
        this.encrypted = encrypted;
        this.channelProtector = channelProtector;
        this.memoryTracker = memoryTracker;
    }

    @Override
    public void handlerAdded( ChannelHandlerContext ctx )
    {
        handshakeBuffer = ctx.alloc().buffer( HANDSHAKE_BUFFER_SIZE, HANDSHAKE_BUFFER_SIZE );
    }

    @Override
    public void handlerRemoved( ChannelHandlerContext ctx )
    {
        handshakeBuffer.release();
        handshakeBuffer = null;

        memoryTracker.releaseHeap( SHALLOW_SIZE );
    }

    @Override
    public void channelRead( ChannelHandlerContext ctx, Object msg )
    {
        try
        {
            if ( !(msg instanceof ByteBuf) )
            {
                // we know it is HTTP as we only have HTTP (for Websocket) and TCP handlers installed.
                log.warn( "Unsupported connection type: 'HTTP'. Bolt protocol only operates over a TCP connection or WebSocket." );
                ctx.close();
                return;
            }
            ByteBuf buf = (ByteBuf) msg;

            assertEncryptedIfRequired();

            // try to fill out handshake buffer
            handshakeBuffer.writeBytes( buf, Math.min( buf.readableBytes(), handshakeBuffer.writableBytes() ) );

            // we filled up the handshake buffer
            if ( handshakeBuffer.writableBytes() == 0 )
            {
                if ( verifyBoltPreamble() )
                {
                    // let's handshake
                    if ( performHandshake() )
                    {
                        // announce selected protocol to the client
                        ctx.writeAndFlush( ctx.alloc().buffer( 4 ).writeInt( protocol.version().toInt() ) );

                        // install related protocol handlers into the pipeline
                        protocol.install();
                        ctx.pipeline().remove( this );

                        // if we somehow end up with more data in the incoming buffers, let's send them
                        // down to the pipeline for the chosen protocol handlers to handle whatever they
                        // are.
                        if ( buf.readableBytes() > 0 )
                        {
                            ctx.fireChannelRead( buf.readRetainedSlice( buf.readableBytes() ) );
                        }
                    }
                    else
                    {
                        ctx.writeAndFlush( ctx.alloc().buffer().writeBytes( new byte[]{0, 0, 0, 0} ) ).addListener( ChannelFutureListener.CLOSE );
                    }
                }
                else
                {
                    ctx.close();
                }
            }
        }
        finally
        {
            ReferenceCountUtil.release( msg );
        }
    }

    @Override
    public void exceptionCaught( ChannelHandlerContext ctx, Throwable cause )
    {
        log.error( "Fatal error occurred during protocol handshaking: " + ctx.channel(), cause );
        ctx.close();
    }

    @Override
    public void channelInactive( ChannelHandlerContext ctx )
    {
        ctx.close();
    }

    private void assertEncryptedIfRequired()
    {
        if ( encryptionRequired && !encrypted )
        {
            throw new SecurityException( "An unencrypted connection attempt was made where encryption is required." );
        }
    }

    private boolean verifyBoltPreamble()
    {
        if ( handshakeBuffer.getInt( 0 ) != BOLT_MAGIC_PREAMBLE )
        {
            log.debug( "Invalid Bolt handshake signature. Expected 0x%08X, but got: 0x%08X", BOLT_MAGIC_PREAMBLE, handshakeBuffer.getInt( 0 ) );
            return false;
        }

        return true;
    }

    private boolean performHandshake()
    {
        try ( var handshakeMemoryTracker = memoryTracker.getScopedMemoryTracker() )
        {
            ArrayList<BoltProtocolVersion> suggestions = new ArrayList<BoltProtocolVersion>();

            for ( int i = 0; i < 4; i++ )
            {
                int rawBytes = handshakeBuffer.getInt( (i + 1) * Integer.BYTES );
                int major = BoltProtocolVersion.getMajorFromRawBytes( rawBytes );
                int minor = BoltProtocolVersion.getMinorFromRawBytes( rawBytes );
                int range = BoltProtocolVersion.getRangeFromRawBytes( rawBytes );

                handshakeMemoryTracker.allocateHeap( BoltProtocolVersion.SHALLOW_SIZE * (range + 1) );
                for ( int j = 0; j <= range; j++ )   //Range is inclusive thus the use of <=
                {
                    int newMinor = Math.max( minor - j, 0 );
                    BoltProtocolVersion suggestion = new BoltProtocolVersion( major, newMinor );

                    protocol = boltProtocolFactory.create( suggestion, boltChannel, channelProtector, memoryTracker );
                    if ( protocol != null )
                    {
                        break;
                    }
                    suggestions.add( suggestion );
                }

                if ( protocol != null )
                {
                    break;
                }
            }

            if ( protocol == null )
            {
                log.debug( "Failed Bolt handshake: Bolt versions suggested by client '%s' are not supported by this server.",
                           Arrays.toString( suggestions.toArray() ) );
            }
        }

        return protocol != null;
    }
}
