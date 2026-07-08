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

import org.neo4j.io.pagecache.PageCache;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;

import static org.neo4j.com.storecopy.StoreUtil.cleanStoreDir;
import static org.neo4j.com.storecopy.StoreUtil.deleteRecursive;
import static org.neo4j.com.storecopy.StoreUtil.getBranchedDataRootDirectory;
import static org.neo4j.com.storecopy.StoreUtil.isBranchedDataDirectory;
import static org.neo4j.com.storecopy.StoreUtil.moveAwayDb;
import static org.neo4j.com.storecopy.StoreUtil.newBranchedDataDir;

public enum BranchedDataPolicy
{
    keep_all
            {
                @Override
                public void handle( File storeDir, PageCache pageCache, LogService logService ) throws IOException
                {
                    File safeStoreDir = BranchedDataDirectoryGuard.assertSafeStoreDirectory( storeDir );
                    Log msgLog = logService.getInternalLog( getClass() );
                    File branchedDataDir = newBranchedDataDir( safeStoreDir );
                    msgLog.debug( "Moving store from " + safeStoreDir + " to " + branchedDataDir );
                    moveAwayDb( safeStoreDir, branchedDataDir );
                }
            },
    keep_last
            {
                @Override
                public void handle( File storeDir, PageCache pageCache, LogService logService ) throws IOException
                {
                    File safeStoreDir = BranchedDataDirectoryGuard.assertSafeStoreDirectory( storeDir );
                    Log msgLog = logService.getInternalLog( getClass() );

                    File branchedDataDir = newBranchedDataDir( safeStoreDir );
                    msgLog.debug( "Moving store from " + safeStoreDir + " to " + branchedDataDir );
                    moveAwayDb( safeStoreDir, branchedDataDir );
                    for ( File file : getBranchedDataRootDirectory( safeStoreDir ).listFiles() )
                    {
                        if ( isBranchedDataDirectory( file ) && !file.equals( branchedDataDir ) )
                        {
                            deleteRecursive( file );
                        }
                    }
                }
            },
    keep_none
            {
                @Override
                public void handle( File storeDir, PageCache pageCache, LogService logService ) throws IOException
                {
                    File safeStoreDir = BranchedDataDirectoryGuard.assertSafeStoreDirectory( storeDir );
                    Log msgLog = logService.getInternalLog( getClass() );
                    msgLog.debug( "Removing store  " + safeStoreDir );
                    cleanStoreDir( safeStoreDir );
                }
            };

    public abstract void handle( File storeDir, PageCache pageCache, LogService msgLog ) throws IOException;
}
