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
package org.neo4j.bolt.runtime;

import io.netty.channel.Channel;
import io.netty.channel.embedded.EmbeddedChannel;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.SocketAddress;

import org.neo4j.bolt.runtime.statemachine.BoltStateMachine;
import org.neo4j.bolt.transport.TransportThrottleGroup;
import org.neo4j.bolt.packstream.ChunkedOutput;
import org.neo4j.bolt.packstream.PackOutput;

public class SynchronousBoltConnection implements BoltConnection
{
    private final EmbeddedChannel channel;
    private final PackOutput output;
    private final BoltStateMachine machine;

    private boolean idle = true;

    public SynchronousBoltConnection( BoltStateMachine machine )
    {
        this.channel = new EmbeddedChannel();
        this.output = new ChunkedOutput( this.channel, TransportThrottleGroup.NO_THROTTLE );
        this.machine = machine;
    }

    @Override
    public String id()
    {
        return channel.id().asLongText();
    }

    @Override
    public boolean idle()
    {
        return idle;
    }

    @Override
    public SocketAddress localAddress()
    {
        return channel.localAddress();
    }

    @Override
    public SocketAddress remoteAddress()
    {
        return channel.remoteAddress();
    }

    @Override
    public Channel channel()
    {
        return channel;
    }

    @Override
    public boolean hasPendingJobs()
    {
        return false;
    }

    @Override
    public void start()
    {

    }

    @Override
    public void enqueue( Job job )
    {
        idle = false;

        try
        {
            job.perform( machine );
        }
        catch ( BoltConnectionFatality connectionFatality )
        {
            throw new RuntimeException( connectionFatality );
        }
        finally
        {
            idle = true;
        }
    }

    @Override
    public boolean processNextBatch()
    {
        return true;
    }

    @Override
    public void handleSchedulingError( Throwable t )
    {

    }

    @Override
    public void interrupt()
    {
        machine.interrupt();
    }

    @Override
    public void stop()
    {
        try
        {
            channel.finishAndReleaseAll();
            output.close();
            machine.close();
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    @Override
    public void keepAlive()
    {

    }

    @Override
    public void initKeepAliveTimer()
    {

    }
}
