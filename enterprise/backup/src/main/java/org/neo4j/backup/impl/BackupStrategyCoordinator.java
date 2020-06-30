/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.backup.impl;

import java.io.File;

import org.neo4j.backup.exceptions.BackupException;
import org.neo4j.backup.exceptions.ConsistencyException;
import org.neo4j.consistency.ConsistencyCheckService;
import org.neo4j.consistency.ConsistencyCheckService.Result;
import org.neo4j.consistency.checking.full.ConsistencyFlags;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.logging.LogProvider;

/**
 * Controls the outcome of the backup tool. Iterates over multiple backup strategies and stops when a backup was successful, there was a critical failure or
 * when none of the backups worked. Also handles the consistency check
 */
class BackupStrategyCoordinator
{
    private static final int STATUS_CC_ERROR = 2;
    private static final int STATUS_CC_INCONSISTENT = 3;

    private final FileSystemAbstraction fs;
    private final ConsistencyCheckService consistencyCheckService;
    private final LogProvider logProvider;
    private final ProgressMonitorFactory progressMonitorFactory;
    private final BackupStrategyWrapper strategy;

    BackupStrategyCoordinator( FileSystemAbstraction fs, ConsistencyCheckService consistencyCheckService, LogProvider logProvider,
                               ProgressMonitorFactory progressMonitorFactory, BackupStrategyWrapper strategy )
    {
        this.fs = fs;
        this.consistencyCheckService = consistencyCheckService;
        this.logProvider = logProvider;
        this.progressMonitorFactory = progressMonitorFactory;
        this.strategy = strategy;
    }

    /**
     * Iterate over all the provided strategies trying to perform a successful backup. Will also do consistency checks if specified in {@link
     * OnlineBackupContext}
     *
     * @param context
     * @throws BackupException
     * @throws ConsistencyException
     */
    public void performBackup( OnlineBackupContext context ) throws BackupException, ConsistencyException
    {
        File destination = context.getDatabaseBackupDir().toFile();
        ConsistencyFlags consistencyFlags = context.getConsistencyFlags();
        this.strategy.doBackup( context );
        if ( context.getConsistencyCheck() )
        {
            this.performConsistencyCheck( context, consistencyFlags, DatabaseLayout.ofFlat( destination ) );
        }
    }

    private void performConsistencyCheck( OnlineBackupContext context, ConsistencyFlags consistencyFlags, DatabaseLayout layout )
            throws ConsistencyException
    {
        Result ccResult;
        try
        {
            ccResult =
                    this.consistencyCheckService.runFullConsistencyCheck( layout, context.getConfig(), this.progressMonitorFactory, this.logProvider, this.fs,
                                                                          false, context.getReportDir().toFile(), consistencyFlags );
        }
        catch ( Exception e )
        {
            throw new ConsistencyException( "Failed to do consistency check on the backup", e, true );
        }

        if ( !ccResult.isSuccessful() )
        {
            throw new ConsistencyException( String.format( "Inconsistencies found. See '%s' for details.", ccResult.reportFile() ), false );
        }
    }
}
