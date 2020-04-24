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
package org.neo4j.causalclustering.stresstests;

import java.io.File;
import java.util.Optional;

import org.neo4j.causalclustering.discovery.ClusterMember;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.Log;

class BackupRandomMember extends RepeatOnRandomMember
{
    private final Log log;
    private final BackupHelper backupHelper;
    private final FileSystemAbstraction fs;

    BackupRandomMember( Control control, Resources resources )
    {
        super( control, resources );
        this.log = resources.logProvider().getLog( getClass() );
        this.fs = resources.fileSystem();
        this.backupHelper = new BackupHelper( resources );
    }

    @Override
    public void doWorkOnMember( ClusterMember member ) throws Exception
    {
        Optional<File> backupDir = backupHelper.backup( member );
        if ( backupDir.isPresent() )
        {
            fs.deleteRecursively( backupDir.get() );
        }
    }

    @Override
    public void validate()
    {
        if ( backupHelper.successfulBackups.get() == 0 )
        {
            throw new IllegalStateException( "Failed to perform any backups" );
        }

        log.info( String.format( "Performed %d/%d successful backups.", backupHelper.successfulBackups.get(), backupHelper.backupNumber.get() ) );
    }
}
