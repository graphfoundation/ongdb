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
import java.io.IOException;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.neo4j.causalclustering.catchup.storecopy.StoreFiles;
import org.neo4j.com.storecopy.FileMoveAction;
import org.neo4j.com.storecopy.FileMoveProvider;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.FileSystemUtils;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.StoreId;

import static java.lang.String.format;

public class BackupCopyService
{
    private static final int MAX_OLD_BACKUPS = 2000;

    private final FileSystemAbstraction fs;
    private final FileMoveProvider fileMoveProvider;
    private final StoreFiles storeFiles;
    private final Log log;

    /**
     * @param fs
     * @param fileMoveProvider
     * @param storeFiles
     * @param logProvider
     */
    BackupCopyService( FileSystemAbstraction fs, FileMoveProvider fileMoveProvider, StoreFiles storeFiles, LogProvider logProvider )
    {
        this.fs = fs;
        this.fileMoveProvider = fileMoveProvider;
        this.storeFiles = storeFiles;
        this.log = logProvider.getLog( this.getClass() );
    }

    /**
     * TODO: Re-implement
     *
     * @param file
     * @return
     */
    private static Supplier<RuntimeException> cantFindBackupLocation( Path file )
    {
        return () ->
        {
            return new RuntimeException(
                    String.format( "Unable to find a free backup location for the provided %s. %d possible locations were already taken.", file, 1000 ) );
        };
    }

    private static Supplier<RuntimeException> cantFindBackupLocation( Path file, AtomicLong counter )
    {
        return () -> new RuntimeException( String.format(
                "Unable to find a free backup location for the provided %s. %d possible locations were already taken.",
                file, counter.get() ) );
    }

    /**
     * @param originalBackupDirectory
     * @param pattern
     * @return
     */
    private static Stream<Path> availableBackupPaths( Path originalBackupDirectory, String pattern )
    {
        return IntStream.range( 0, MAX_OLD_BACKUPS )
                        .mapToObj( iteration -> modifiedBackupDirectoryName( pattern, originalBackupDirectory, iteration ) );
    }

    /**
     * @param pattern
     * @param directory
     * @param iteration
     * @return
     */
    private static Path modifiedBackupDirectoryName( String pattern, Path directory, int iteration )
    {
        Path directoryName = directory.getName( directory.getNameCount() - 1 );
        return directory.resolveSibling( format( pattern, directoryName, iteration ) );
    }

    protected void changeBackupLocation( Path oldLocation, Path newLocation ) throws IOException
    {
        try
        {
            File source = oldLocation.toFile();
            File target = newLocation.toFile();
            Iterator<FileMoveAction> moves = fileMoveProvider.traverseForMoving( source ).iterator();
            while ( moves.hasNext() )
            {
                moves.next().move( target );
            }
            this.fs.deleteRecursively( oldLocation.toFile() );
        }
        catch ( IOException e )
        {
            throw new IOException( "Failed to rename backup directory from " + oldLocation + " to " + newLocation, e );
        }
    }

    /**
     * @param preExistingBrokenBackupDir
     * @param newSuccessfulBackupDir
     * @throws IOException
     */
    void cleanupPreExistingBrokenBackupPath( Path preExistingBrokenBackupDir, Path newSuccessfulBackupDir ) throws IOException
    {
        DatabaseLayout preExistingBrokenBackupLayout = DatabaseLayout.ofFlat( preExistingBrokenBackupDir.toFile() );
        DatabaseLayout newSuccessfulBackupLayout = DatabaseLayout.ofFlat( newSuccessfulBackupDir.toFile() );

        StoreId preExistingBrokenBackupStoreId;
        try
        {
            preExistingBrokenBackupStoreId = this.storeFiles.readStoreId( preExistingBrokenBackupLayout );
        }
        catch ( IOException e )
        {
            this.log.warn( "Error reading store id.", e );
            return;
        }

        StoreId newBackupStoreId;
        try
        {
            newBackupStoreId = this.storeFiles.readStoreId( newSuccessfulBackupLayout );
        }
        catch ( IOException e )
        {
            throw new IOException( "Error reading store id.", e );
        }

        if ( newBackupStoreId.equals( preExistingBrokenBackupStoreId ) )
        {
            this.log.info( "New backup store id that worked %s",
                           newBackupStoreId );
            this.fs.deleteRecursively( preExistingBrokenBackupDir.toFile() );
        }
        else
        {
            this.log.info( "Cant remove store id %s ,  see conflicting store id %s",
                           preExistingBrokenBackupStoreId, newBackupStoreId );
        }
    }

    /**
     * @param databaseLayout
     * @return
     */
    protected boolean doesBackupExist( DatabaseLayout databaseLayout )
    {
        return this.fs.fileExists( databaseLayout.metadataStore() );
    }

    Path findNewBackupLocationForBrokenExisting( Path existingBackup )
    {
        return findAnAvailableBackupLocation( existingBackup, "%s.err.%d" );
    }

    Path findAnAvailableLocationForNewFullBackup( Path desiredBackupLocation )
    {
        return findAnAvailableBackupLocation( desiredBackupLocation, "%s.temp.%d" );
    }

    /**
     * Given a desired file name, find an available name that is similar to the given one that doesn't conflict with already existing backups
     *
     * @param file    desired ideal file name
     * @param pattern pattern to follow if desired name is taken (requires %s for original name, and %d for iteration)
     * @return the resolved file name which can be the original desired, or a variation that matches the pattern
     */
    private Path findAnAvailableBackupLocation( Path file, String pattern )
    {
        return FileSystemUtils.isEmptyOrNonExistingDirectory( this.fs, file.toFile() ) ? file
                                                                                       : availableBackupPaths( file, pattern ).filter( ( f ) ->
                                                                                                                                       {
                                                                                                                                           return FileSystemUtils
                                                                                                                                                   .isEmptyOrNonExistingDirectory(
                                                                                                                                                           this.fs,
                                                                                                                                                           f.toFile() );
                                                                                                                                       } )
                                                                                                                              .findFirst()
                                                                                                                              .orElseThrow(
                                                                                                                                      cantFindBackupLocation(
                                                                                                                                              file ) );
    }
}
