/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.internal.batchimport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.StandardCopyOption;

import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.FlushableChannel;
import org.neo4j.io.fs.PhysicalFlushableChannel;
import org.neo4j.io.fs.ReadAheadChannel;
import org.neo4j.io.fs.ReadPastEndException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.memory.BufferScope;
import org.neo4j.kernel.impl.store.PropertyType;
import org.neo4j.string.UTF8;

public class BatchImportStateStore
{

    static final String NO_STATE = "";
    static final String INIT = "init";
    static final String TMP_FILE_EXTENSTION = ".tmp";
    private final FileSystemAbstraction fs;
    private final File stateFile;
    private final File tempFile;

    BatchImportStateStore( FileSystemAbstraction fs, File stateFile )
    {
        this.fs = fs;
        this.stateFile = stateFile;
        this.tempFile = new File( stateFile.getAbsolutePath() + TMP_FILE_EXTENSTION );
    }

    public Pair<String,byte[]> get() throws IOException
    {
        if ( !this.stateFile.exists() )
        {
            return Pair.of( NO_STATE, PropertyType.EMPTY_BYTE_ARRAY );
        }
        else
        {
            try
            {
                BufferScope bufferScope = new BufferScope( ReadAheadChannel.DEFAULT_READ_AHEAD_SIZE );

                Pair checkpointName;
                try
                {
                    ReadAheadChannel channel = new ReadAheadChannel( this.fs.read( this.stateFile ),
                                                                     bufferScope.buffer );

                    try
                    {
                        String name = readString( channel );
                        byte[] checkPoint = new byte[channel.getInt()];
                        channel.get( checkPoint, checkPoint.length );
                        checkpointName = Pair.of( name, checkPoint );
                    }
                    catch ( Throwable e )
                    {
                        try
                        {
                            channel.close();
                        }
                        catch ( Throwable e2 )
                        {
                            e.addSuppressed( e2 );
                        }

                        throw e;
                    }

                    channel.close();
                }
                catch ( Throwable e )
                {
                    try
                    {
                        bufferScope.close();
                    }
                    catch ( Throwable e2 )
                    {
                        e.addSuppressed( e2 );
                    }

                    throw e;
                }

                bufferScope.close();
                return checkpointName;
            }
            catch ( FileNotFoundException e )
            {
                return Pair.of( NO_STATE, PropertyType.EMPTY_BYTE_ARRAY );
            }
            catch ( ReadPastEndException e )
            {
                return Pair.of( INIT, PropertyType.EMPTY_BYTE_ARRAY );
            }
        }
    }

    public void set( String name, byte[] checkPoint ) throws IOException
    {
        this.fs.mkdirs( this.tempFile.getParentFile() );
        PhysicalFlushableChannel channel = new PhysicalFlushableChannel( this.fs.write( this.tempFile ) );

        try
        {
            writeString( name, channel );
            channel.putInt( checkPoint.length );
            channel.put( checkPoint, checkPoint.length );
        }
        catch ( Throwable e )
        {
            try
            {
                channel.close();
            }
            catch ( Throwable e2 )
            {
                e.addSuppressed( e2 );
            }

            throw e;
        }

        channel.close();
        this.fs.renameFile( this.tempFile, this.stateFile,
                            new CopyOption[]{StandardCopyOption.ATOMIC_MOVE} );
    }

    public void remove() throws IOException
    {
        this.fs.renameFile( this.stateFile, this.tempFile,
                            new CopyOption[]{StandardCopyOption.ATOMIC_MOVE} );
        this.fs.deleteFileOrThrow( this.tempFile );
    }

    /**
     * Write a string to FlushableChannel
     *
     * @param name
     * @param channel
     * @throws IOException
     */
    protected void writeString( String name, FlushableChannel channel ) throws IOException
    {
        byte[] bytes = UTF8.encode( name );
        channel.putInt( bytes.length );
        channel.put( bytes, bytes.length );
    }

    /**
     * Read a string from ReadableChannel
     *
     * @param channel
     * @return
     * @throws IOException
     */
    protected String readString( ReadableChannel channel ) throws IOException
    {
        byte[] bytes = new byte[channel.getInt()];
        channel.get( bytes, bytes.length );
        return UTF8.decode( bytes );
    }
}
