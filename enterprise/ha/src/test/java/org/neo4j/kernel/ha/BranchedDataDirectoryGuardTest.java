/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.ha;

import org.junit.Rule;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import org.neo4j.test.rule.TestDirectory;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BranchedDataDirectoryGuardTest
{
    @Rule
    public final TestDirectory testDirectory = TestDirectory.testDirectory();

    @Test
    public void shouldAllowRegularStoreDirectories() throws IOException
    {
        File storeDir = testDirectory.directory( "store/safe-db" );

        File resolved = BranchedDataDirectoryGuard.assertSafeStoreDirectory( storeDir );

        assertEquals( storeDir.getCanonicalFile(), resolved );
    }

    @Test
    public void shouldRejectRepositoryRootLikeDirectories()
    {
        File repoLikeDir = testDirectory.directory( "repo-root-like" );
        assertTrue( new File( repoLikeDir, ".git" ).mkdir() );

        IllegalStateException failure = expectUnsafeDirectory( repoLikeDir );
        assertThat( failure.getMessage(), containsString( "repository root" ) );
    }

    @Test
    public void shouldRejectProjectRootLikeDirectories() throws IOException
    {
        File projectLikeDir = testDirectory.directory( "module-root-like" );
        assertTrue( new File( projectLikeDir, "src" ).mkdir() );
        assertTrue( new File( projectLikeDir, "pom.xml" ).createNewFile() );

        IllegalStateException failure = expectUnsafeDirectory( projectLikeDir );
        assertThat( failure.getMessage(), containsString( "project/module root" ) );
    }

    private IllegalStateException expectUnsafeDirectory( File storeDir )
    {
        try
        {
            BranchedDataDirectoryGuard.assertSafeStoreDirectory( storeDir );
            fail( "Expected unsafe directory guard for " + storeDir );
            return null;
        }
        catch ( IllegalStateException e )
        {
            return e;
        }
    }
}
