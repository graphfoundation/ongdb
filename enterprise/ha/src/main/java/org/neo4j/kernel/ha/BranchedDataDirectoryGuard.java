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

import java.io.File;
import java.io.IOException;

final class BranchedDataDirectoryGuard
{
    private BranchedDataDirectoryGuard()
    {
    }

    static File assertSafeStoreDirectory( File storeDir )
    {
        if ( storeDir == null )
        {
            throw new IllegalArgumentException( "Store directory is required for branched-data handling." );
        }

        File resolvedStoreDir = resolveStoreDir( storeDir );
        String unsafeReason = unsafeReason( resolvedStoreDir );
        if ( unsafeReason != null )
        {
            throw new IllegalStateException( "Refusing to branch store in unsafe directory '" + resolvedStoreDir +
                    "' (" + unsafeReason + "). Configure a dedicated database store directory, for example under " +
                    "target/test-data." );
        }
        return resolvedStoreDir;
    }

    private static File resolveStoreDir( File storeDir )
    {
        try
        {
            return storeDir.getCanonicalFile();
        }
        catch ( IOException e )
        {
            return storeDir.getAbsoluteFile();
        }
    }

    private static String unsafeReason( File resolvedStoreDir )
    {
        if ( resolvedStoreDir.getParentFile() == null )
        {
            return "filesystem root";
        }
        if ( looksLikeRepositoryRoot( resolvedStoreDir ) )
        {
            return "repository root";
        }
        if ( looksLikeProjectRoot( resolvedStoreDir ) )
        {
            return "project/module root";
        }
        return null;
    }

    private static boolean looksLikeRepositoryRoot( File resolvedStoreDir )
    {
        return new File( resolvedStoreDir, ".git" ).exists();
    }

    private static boolean looksLikeProjectRoot( File resolvedStoreDir )
    {
        boolean hasSourceDirectory = new File( resolvedStoreDir, "src" ).isDirectory();
        boolean hasMavenBuildFile = new File( resolvedStoreDir, "pom.xml" ).isFile();
        boolean hasGradleBuildFile = new File( resolvedStoreDir, "build.gradle" ).isFile() ||
                new File( resolvedStoreDir, "build.gradle.kts" ).isFile();
        return hasSourceDirectory && ( hasMavenBuildFile || hasGradleBuildFile );
    }
}
