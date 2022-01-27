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
package org.neo4j.kernel.api.impl.index.storage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.nio.file.Path;

import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.kernel.api.impl.index.storage.layout.IndexFolderLayout;
import org.neo4j.test.extension.EphemeralFileSystemExtension;
import org.neo4j.test.extension.Inject;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith( EphemeralFileSystemExtension.class )
class FailureStorageTest
{
    @Inject
    private EphemeralFileSystemAbstraction fs;
    private IndexFolderLayout indexFolderLayout;

    @BeforeEach
    void before() throws Exception
    {
        Path rootDirectory = Path.of( "dir" );
        fs.mkdirs( rootDirectory );
        indexFolderLayout = new IndexFolderLayout( rootDirectory );
    }

    @Test
    void shouldReserveFailureFile() throws Exception
    {
        // GIVEN
        FailureStorage storage = new FailureStorage( fs, indexFolderLayout );

        // WHEN
        storage.reserveForIndex();

        // THEN
        Path failureFile = storage.failureFile();
        assertTrue( fs.fileExists( failureFile ) );
        assertTrue( fs.getFileSize( failureFile ) > 100 );
    }

    @Test
    void shouldStoreFailure() throws Exception
    {
        // GIVEN
        FailureStorage storage = new FailureStorage( fs, indexFolderLayout );
        storage.reserveForIndex();
        String failure = format( "A failure message%nspanning%nmultiple lines." );

        // WHEN
        storage.storeIndexFailure( failure );

        // THEN
        Path failureFile = storage.failureFile();
        assertTrue( fs.fileExists( failureFile ) );
        assertTrue( fs.getFileSize( failureFile ) > 100 );
        assertEquals( failure, storage.loadIndexFailure() );
    }

    @Test
    void shouldClearFailure() throws Exception
    {
        // GIVEN
        FailureStorage storage = new FailureStorage( fs, indexFolderLayout );
        storage.reserveForIndex();
        String failure = format( "A failure message%nspanning%nmultiple lines." );
        storage.storeIndexFailure( failure );
        Path failureFile = storage.failureFile();
        assertTrue( fs.fileExists( failureFile ) );
        assertTrue( fs.getFileSize( failureFile ) > 100 );

        // WHEN
        storage.clearForIndex();

        // THEN
        assertFalse( fs.fileExists( failureFile ) );
    }

    @Test
    void shouldAppendFailureIfAlreadyExists() throws Exception
    {
        // GIVEN
        FailureStorage storage = new FailureStorage( fs, indexFolderLayout );
        storage.reserveForIndex();
        String failure1 = "Once upon a time there was a first failure";
        String failure2 = "Then there was another";
        storage.storeIndexFailure( failure1 );

        // WHEN
        storage.storeIndexFailure( failure2 );

        // THEN
        String allFailures = storage.loadIndexFailure();
        assertThat( allFailures ).contains( failure1 );
        assertThat( allFailures ).contains( failure2 );
    }
}
