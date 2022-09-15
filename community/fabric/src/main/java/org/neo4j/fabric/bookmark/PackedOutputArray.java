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
package org.neo4j.fabric.bookmark;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

import org.neo4j.bolt.packstream.PackOutput;

public class PackedOutputArray implements PackOutput
{
    private final ByteArrayOutputStream raw;
    private final DataOutputStream data;

    public PackedOutputArray()
    {
        raw = new ByteArrayOutputStream();
        data = new DataOutputStream( raw );
    }

    @Override
    public void beginMessage()
    {
        throw new IllegalStateException( "Not supported" );
    }

    @Override
    public void messageSucceeded()
    {
        throw new IllegalStateException( "Not supported" );
    }

    @Override
    public void messageFailed()
    {
        throw new IllegalStateException( "Not supported" );
    }

    @Override
    public void messageReset()
    {
        throw new IllegalStateException( "Not supported" );
    }

    @Override
    public PackOutput flush()
    {
        return this;
    }

    @Override
    public PackOutput writeByte( byte value ) throws IOException
    {
        data.write( value );
        return this;
    }

    @Override
    public PackOutput writeBytes( ByteBuffer buffer ) throws IOException
    {
        while ( buffer.remaining() > 0 )
        {
            data.writeByte( buffer.get() );
        }
        return this;
    }

    @Override
    public PackOutput writeBytes( byte[] bytes, int offset, int amountToWrite ) throws IOException
    {
        data.write( bytes, offset, amountToWrite );
        return this;
    }

    @Override
    public PackOutput writeShort( short value ) throws IOException
    {
        data.writeShort( value );
        return this;
    }

    @Override
    public PackOutput writeInt( int value ) throws IOException
    {
        data.writeInt( value );
        return this;
    }

    @Override
    public PackOutput writeLong( long value ) throws IOException
    {
        data.writeLong( value );
        return this;
    }

    @Override
    public PackOutput writeDouble( double value ) throws IOException
    {
        data.writeDouble( value );
        return this;
    }

    @Override
    public void close() throws IOException
    {
        data.close();
    }

    public byte[] bytes()
    {
        return raw.toByteArray();
    }

}
