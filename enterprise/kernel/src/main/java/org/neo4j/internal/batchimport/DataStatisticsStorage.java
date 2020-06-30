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
import java.io.IOException;
import java.util.Iterator;

import org.neo4j.internal.batchimport.DataStatistics.RelationshipTypeCount;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.PhysicalFlushableChannel;
import org.neo4j.io.fs.ReadAheadChannel;
import org.neo4j.io.memory.BufferScope;

class DataStatisticsStorage
{

    private final FileSystemAbstraction fs;
    private final File file;

    /**
     * @param fs
     * @param file
     */
    DataStatisticsStorage( FileSystemAbstraction fs, File file )
    {
        this.fs = fs;
        this.file = file;
    }

    /**
     * @param distribution
     * @throws IOException
     */
    void update( DataStatistics distribution ) throws IOException
    {
        PhysicalFlushableChannel channel = new PhysicalFlushableChannel( this.fs.write( this.file ) );

        try
        {
            channel.putLong( distribution.getNodeCount() );
            channel.putLong( distribution.getPropertyCount() );
            channel.putInt( distribution.getNumberOfRelationshipTypes() );
            Iterator iterator = distribution.iterator();

            while ( iterator.hasNext() )
            {
                RelationshipTypeCount entry = (RelationshipTypeCount) iterator.next();
                channel.putInt( entry.getTypeId() );
                channel.putLong( entry.getCount() );
            }
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

    /**
     * @return
     * @throws IOException
     */
    DataStatistics load() throws IOException
    {
        BufferScope bufferScope = new BufferScope( ReadAheadChannel.DEFAULT_READ_AHEAD_SIZE );

        DataStatistics dataStatistics;
        try
        {
            ReadAheadChannel channel = new ReadAheadChannel( this.fs.read( this.file ), bufferScope.buffer );

            try
            {
                long nodeCount = channel.getLong();
                long propertyCount = channel.getLong();
                RelationshipTypeCount[] entries = new RelationshipTypeCount[channel.getInt()];
                int i = 0;

                while ( true )
                {
                    if ( i >= entries.length )
                    {
                        dataStatistics = new DataStatistics( nodeCount, propertyCount, entries );
                        break;
                    }

                    int typeId = channel.getInt();
                    long count = channel.getLong();
                    entries[i] = new RelationshipTypeCount( typeId, count );
                    ++i;
                }
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
        return dataStatistics;
    }

    /**
     *
     */
    void deleteFile()
    {
        this.fs.deleteFile( this.file );
    }
}
