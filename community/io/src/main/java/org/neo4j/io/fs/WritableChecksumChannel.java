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
package org.neo4j.io.fs;

import java.io.IOException;

/**
 * Represents an infinite channel to write primitive data to that can have a checksum calculated over.
 */
public interface WritableChecksumChannel extends WritableChannel, ChecksumWriter
{
    @Override
    WritableChecksumChannel put( byte value ) throws IOException;

    @Override
    WritableChecksumChannel putShort( short value ) throws IOException;

    @Override
    WritableChecksumChannel putInt( int value ) throws IOException;

    @Override
    WritableChecksumChannel putLong( long value ) throws IOException;

    @Override
    WritableChecksumChannel putFloat( float value ) throws IOException;

    @Override
    WritableChecksumChannel putDouble( double value ) throws IOException;

    @Override
    default WritableChecksumChannel put( byte[] value, int length ) throws IOException
    {
        return put( value, 0, length );
    }

    @Override
    WritableChecksumChannel put( byte[] value, int offset, int length ) throws IOException;
}
