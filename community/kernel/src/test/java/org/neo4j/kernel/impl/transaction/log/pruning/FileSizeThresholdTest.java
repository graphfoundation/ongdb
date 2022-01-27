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
package org.neo4j.kernel.impl.transaction.log.pruning;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.impl.transaction.log.LogFileInformation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FileSizeThresholdTest
{

    private FileSystemAbstraction fs = mock( FileSystemAbstraction.class );
    private final LogFileInformation source = mock( LogFileInformation.class );
    private final Path file = mock( Path.class );
    private final long version = 1;

    @Test
    void shouldReturnFalseWhenFileSizeIsLowerThanMaxSize() throws IOException
    {
        // given
        final long maxSize = 10;
        final FileSizeThreshold threshold = new FileSizeThreshold( fs, maxSize );

        when( fs.getFileSize( file ) ).thenReturn( 5L );

        // when
        threshold.init();
        final boolean result = threshold.reached( file, version, source );

        // then
        assertFalse( result );
    }

    @Test
    void shouldReturnTrueWhenASingleFileSizeIsGreaterOrEqualThanMaxSize() throws IOException
    {
        // given
        long sixteenGigabytes = 16L * 1024 * 1024 * 1024;

        final FileSizeThreshold threshold = new FileSizeThreshold( fs, sixteenGigabytes );

        when( fs.getFileSize( file ) ).thenReturn( sixteenGigabytes );

        // when
        threshold.init();
        final boolean result = threshold.reached( file, version, source );

        // then
        assertTrue( result );
    }

    @Test
    void shouldSumSizeWhenCalledMultipleTimes() throws IOException
    {
        // given
        final long maxSize = 10;
        final FileSizeThreshold threshold = new FileSizeThreshold( fs, maxSize );

        when( fs.getFileSize( file ) ).thenReturn( 5L );

        // when
        threshold.init();
        threshold.reached( file, version, source );
        final boolean result = threshold.reached( file, version, source );

        // then
        assertTrue( result );
    }

    @Test
    void shouldForgetPreviousValuesAfterAInitCall() throws IOException
    {
        // given
        final long maxSize = 10;
        final FileSizeThreshold threshold = new FileSizeThreshold( fs, maxSize );

        when( fs.getFileSize( file ) ).thenReturn( 5L );

        // when
        threshold.init();
        threshold.reached( file, version, source );
        threshold.reached( file, version, source );
        threshold.init();
        final boolean result = threshold.reached( file, version, source );

        // then
        assertFalse( result );
    }
}
