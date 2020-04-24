/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.com;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

import static org.junit.Assert.assertEquals;

public class ToAssertionWriter implements MadeUpWriter
{
    private int index;

    @Override
    public void write( ReadableByteChannel data )
    {
        ByteBuffer intermediate = ByteBuffer.allocate( 1000 );
        while ( true )
        {
            try
            {
                intermediate.clear();
                if ( data.read( intermediate ) == -1 )
                {
                    break;
                }
                intermediate.flip();
                while ( intermediate.remaining() > 0 )
                {
                    byte value = intermediate.get();
                    assertEquals( (index++) % 10, value );
                }
            }
            catch ( IOException e )
            {
                throw new RuntimeException( e );
            }
        }
    }
}
