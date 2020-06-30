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
package org.neo4j.backup;

import java.io.OutputStream;
import java.nio.file.Path;
import java.util.Objects;

import org.neo4j.backup.exceptions.BackupException;
import org.neo4j.backup.exceptions.ConsistencyException;
import org.neo4j.backup.impl.BackupExecutor;
import org.neo4j.backup.impl.OnlineBackupContext;
import org.neo4j.configuration.Config;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.kernel.impl.enterprise.settings.backup.OnlineBackupSettings;
import org.neo4j.logging.FormattedLogProvider;
import org.neo4j.logging.LogProvider;
import org.neo4j.util.Preconditions;

/**
 * This class encapsulates the information needed to perform an online backup against a running Neo4j instance configured to act as a backup server. This class
 * is not instantiable, instead factory methods are used to get instances configured to contact a specific backup server against which all possible backup
 * operations can be performed.
 * <p>
 * All backup methods return the same instance, allowing for chaining calls.
 */
public class OnlineBackup
{
    private static final int MAX_BACKUP_PORT = 65535;
    private final String hostNameOrIp;
    private final int port;
    private final Config config;
    private boolean fallbackToFullBackup = true;
    private boolean consistencyCheck = true;
    private OutputStream outputStream;

    /**
     * @param hostNameOrIp
     * @param port
     */
    OnlineBackup( String hostNameOrIp, int port )
    {
        this.hostNameOrIp = hostNameOrIp;
        this.port = port;
        this.outputStream = System.out;
        this.config = Config.defaults();
    }

    /**
     * Factory method for this class. The OnlineBackup instance returned will perform backup operations against the hostname and port passed in as parameters.
     *
     * @param hostNameOrIp The hostname or the IP address of the backup server
     * @param port         The port at which the remote backup server is listening
     * @return An OnlineBackup instance ready to perform backup operations from the given remote server
     */
    public static OnlineBackup from( String hostNameOrIp, int port )
    {
        return new OnlineBackup( hostNameOrIp, port );
    }

    /**
     * Factory method for this class. The OnlineBackup instance returned will perform backup operations against the hostname passed in as parameter, using the
     * default backup port.
     *
     * @param hostNameOrIp The hostname or IP address of the backup server
     * @return An OnlineBackup instance ready to perform backup operations from the given remote server
     */
    public static OnlineBackup from( String hostNameOrIp )
    {
        return new OnlineBackup( hostNameOrIp, OnlineBackupSettings.DEFAULT_BACKUP_PORT );
    }

    private static Config defaultConfig()
    {
        return Config.defaults();
    }

    private static int requireValidPort( int port )
    {
        Preconditions.checkArgument( port > 0 && port <= MAX_BACKUP_PORT, "Port is expected to be positive and less than or equal to 65535 but was: " + port );
        return port;
    }

    /**
     * Use standard with*** to represent the object being passed.
     *
     * @param fallbackToFullBackup
     * @return
     */
    public OnlineBackup withFallbackToFullBackup( boolean fallbackToFullBackup )
    {
        this.fallbackToFullBackup = fallbackToFullBackup;
        return this;
    }

    /**
     * Use standard with*** to represent the object being passed.
     *
     * @param consistencyCheck
     * @return
     */
    public OnlineBackup withConsistencyCheck( boolean consistencyCheck )
    {
        this.consistencyCheck = consistencyCheck;
        return this;
    }

    /**
     * Use standard with*** to represent the object being passed.
     *
     * @param outputStream
     * @return
     */
    public OnlineBackup withOutputStream( OutputStream outputStream )
    {
        this.outputStream = (OutputStream) Objects.requireNonNull( outputStream, "outputStream" );
        return this;
    }

    /**
     * @param databaseName
     * @param targetDirectory
     * @return
     */
    public BackupResult backup( String databaseName, Path targetDirectory )
    {
        Objects.requireNonNull( databaseName, "databaseName" );
        Objects.requireNonNull( targetDirectory, "targetDirectory" );
        FormattedLogProvider logProvider = FormattedLogProvider.toOutputStream( this.outputStream );

        try
        {
            this.runBackup( databaseName, targetDirectory, logProvider );
            return new BackupResult( this.consistencyCheck );
        }
        catch ( BackupException e )
        {
            throw new RuntimeException( "BackupExecutor failed", e );
        }
        catch ( ConsistencyException e )
        {
            logProvider.getLog( this.getClass() ).error( "Consistency check failed", e );
            return new BackupResult( false );
        }
    }

    /**
     * Run the backup.
     *
     * @param databaseName
     * @param targetDirectory
     * @param logProvider
     * @throws BackupException
     * @throws ConsistencyException
     */
    private void runBackup( String databaseName, Path targetDirectory, LogProvider logProvider )
            throws BackupException, ConsistencyException
    {
        BackupExecutor backupExecutor = BackupExecutor.builder().withUserLogProvider( logProvider ).withProgressMonitorFactory(
                ProgressMonitorFactory.textual( this.outputStream ) ).build();
        OnlineBackupContext context = OnlineBackupContext.builder().withAddress( hostNameOrIp, this.port ).withConfig( this.config ).withConsistencyCheck(
                this.consistencyCheck ).withFallbackToFullBackup( this.fallbackToFullBackup ).withBackupDirectory( targetDirectory ).withReportsDirectory(
                targetDirectory ).withDatabaseName( databaseName ).build();
        backupExecutor.backup( context );
    }

    public static class BackupResult
    {
        private final boolean consistent;

        private BackupResult( boolean consistent )
        {
            this.consistent = consistent;
        }

        public boolean isConsistent()
        {
            return this.consistent;
        }
    }
}


