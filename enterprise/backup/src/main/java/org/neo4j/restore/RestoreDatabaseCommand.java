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
package org.neo4j.restore;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

import org.neo4j.cli.CommandFailedException;
import org.neo4j.commandline.Util;
import org.neo4j.commandline.dbms.CannotWriteException;
import org.neo4j.commandline.dbms.LockChecker;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.impl.util.Validators;
import org.neo4j.kernel.internal.locker.FileLockException;

public class RestoreDatabaseCommand
{
    private final FileSystemAbstraction fs;
    private final File fromDatabasePath;
    private final DatabaseLayout toDatabaseLayout;
    private final boolean forceOverwrite;

    /**
     * @param fs
     * @param fromDatabasePath
     * @param config
     * @param databaseName
     * @param forceOverwrite
     */
    public RestoreDatabaseCommand( FileSystemAbstraction fs, File fromDatabasePath, Config config, String databaseName, boolean forceOverwrite )
    {
        this.fs = fs;
        this.fromDatabasePath = fromDatabasePath;
        this.forceOverwrite = forceOverwrite;
        this.toDatabaseLayout = toDatabaseLayout( databaseName, config );
    }

    private static DatabaseLayout toDatabaseLayout( String databaseName, Config config )
    {
        return Neo4jLayout.of( config ).databaseLayout( databaseName );
    }

    public void execute() throws IOException
    {
        if ( !fs.fileExists( fromDatabasePath ) )
        {
            throw new IllegalArgumentException( String.format( "Directory does not exist [%s]", fromDatabasePath ) );
        }
        else
        {
            try
            {
                Validators.CONTAINS_EXISTING_DATABASE.validate( fromDatabasePath );
            }
            catch ( IllegalArgumentException e )
            {
                throw new IllegalArgumentException( String.format( "Directory is not a backup directory [%s]", fromDatabasePath ) );
            }

            if ( fs.fileExists( toDatabaseLayout.databaseDirectory() ) && !forceOverwrite )
            {
                throw new IllegalArgumentException( String.format( "Database name [%s] already exists : Location:  %s", toDatabaseLayout.getDatabaseName(),
                                                                   toDatabaseLayout.databaseDirectory() ) );
            }
            else
            {
                fs.mkdirs( toDatabaseLayout.databaseDirectory() );

                try
                {
                    Closeable ignored = LockChecker.checkDatabaseLock( toDatabaseLayout );

                    try
                    {
                        cleanTargetDatabaseDirectories();
                        revert();
                    }
                    catch ( Throwable e )
                    {
                        if ( ignored != null )
                        {
                            try
                            {
                                ignored.close();
                            }
                            catch ( Throwable e2 )
                            {
                                e.addSuppressed( e2 );
                            }
                        }

                        throw e;
                    }

                    if ( ignored != null )
                    {
                        ignored.close();
                    }
                }
                catch ( FileLockException e )
                {
                    throw new CommandFailedException(
                            "Please stop the db '" + toDatabaseLayout.getDatabaseName() + "' ", e );
                }
                catch ( CannotWriteException e )
                {
                    throw new CommandFailedException( "Can't restore this db.", e );
                }
            }
        }
    }

    private void cleanTargetDatabaseDirectories() throws IOException
    {
        File databaseDirectory = toDatabaseLayout.databaseDirectory();
        File transactionLogsDirectory = toDatabaseLayout.getTransactionLogsDirectory();
        File databaseLockFile = toDatabaseLayout.databaseLockFile();
        File[] filesToRemove = fs.listFiles( databaseDirectory, ( dir, name ) ->
                !name.equals( databaseLockFile.getName() ) );
        if ( filesToRemove != null )
        {

            for ( File file : filesToRemove )
            {
                fs.deleteRecursively( file );
            }
        }

        if ( !Util.isSameOrChildFile( databaseDirectory, transactionLogsDirectory ) )
        {
            fs.deleteRecursively( transactionLogsDirectory );
        }
    }

    /**
     * @throws IOException
     */
    private void revert() throws IOException
    {
        File[] databaseFiles = fs.listFiles( fromDatabasePath );
        LogFiles transactionLogFiles = LogFilesBuilder.logFilesBasedOnlyBuilder( fromDatabasePath, fs ).build();
        if ( databaseFiles != null )
        {
            File databaseDirectory = toDatabaseLayout.databaseDirectory();
            File transactionLogsDirectory = toDatabaseLayout.getTransactionLogsDirectory();
            File databaseLockFile = toDatabaseLayout.databaseLockFile();
            for ( File file : databaseFiles )
            {
                File targetDirectory;
                if ( file.isDirectory() )
                {
                    targetDirectory = new File( databaseDirectory, file.getName() );
                    fs.mkdirs( targetDirectory );
                    fs.copyRecursively( file, targetDirectory );
                }
                else
                {
                    targetDirectory = transactionLogFiles.isLogFile( file ) ? transactionLogsDirectory : databaseDirectory;
                    File targetFile = new File( targetDirectory, file.getName() );
                    if ( !databaseLockFile.equals( targetFile ) )
                    {
                        fs.copyToDirectory( file, targetDirectory );
                    }
                }
            }
        }
    }
}
