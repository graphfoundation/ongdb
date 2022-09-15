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
package org.neo4j.bolt.messaging;

import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;

import org.neo4j.io.memory.ByteBuffers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

public class RecordingByteChannelTest
{

    @Test
    void shouldBeAbleToWriteToThenReadFromChannel()
    {
        // Given
        RecordingByteChannel channel = new RecordingByteChannel();

        // When
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        channel.write( ByteBuffer.wrap( data ) );
        ByteBuffer buffer = ByteBuffers.allocate( 10, INSTANCE );
        int bytesRead = channel.read( buffer );

        // Then
        assertThat( bytesRead ).isEqualTo( 5 );
        assertThat( buffer.array() ).isEqualTo( new byte[]{1, 2, 3, 4, 5, 0, 0, 0, 0, 0} );
    }

}
