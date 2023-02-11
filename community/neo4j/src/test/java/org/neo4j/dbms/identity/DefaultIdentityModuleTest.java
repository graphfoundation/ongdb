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
package org.neo4j.dbms.identity;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.EphemeralTestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATA_DIR_NAME;

@EphemeralTestDirectoryExtension
public class DefaultIdentityModuleTest
{
    @Inject
    private TestDirectory testDirectory;

    @Test
    void shouldCreateServerIdAndReReadIt() throws IOException
    {
        // given
        var dataDir = testDirectory.file( DEFAULT_DATA_DIR_NAME );
        var layout = Neo4jLayout.of( testDirectory.homePath() );
        var fs = testDirectory.getFileSystem();
        assertFalse( fs.fileExists( dataDir ) );

        // when
        var identityModule = new DefaultIdentityModule( NullLogService.getInstance(), fs, layout, EmptyMemoryTracker.INSTANCE );

        // then
        assertTrue( fs.fileExists( dataDir ) );
        assertTrue( fs.fileExists( layout.serverIdFile() ) );
        assertNotNull( identityModule.serverId() );

        // when
        var secondIdentityModule = new DefaultIdentityModule( NullLogService.getInstance(), fs, layout, EmptyMemoryTracker.INSTANCE );

        // then
        assertEquals( identityModule.serverId(), secondIdentityModule.serverId() );

        fs.deleteRecursively( dataDir );
        var thirdIdentityModule = new DefaultIdentityModule( NullLogService.getInstance(), fs, layout, EmptyMemoryTracker.INSTANCE );

        // then
        assertNotEquals( secondIdentityModule.serverId(), thirdIdentityModule.serverId() );
    }
}
