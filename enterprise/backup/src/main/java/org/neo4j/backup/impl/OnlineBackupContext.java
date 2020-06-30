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

import java.nio.file.Path;
import java.nio.file.Paths;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.consistency.checking.full.ConsistencyFlags;
import org.neo4j.kernel.impl.enterprise.settings.backup.OnlineBackupSettings;

public class OnlineBackupContext
{

    private final SocketAddress address;
    private final String databaseName;
    private final Path databaseBackupDir;
    private final Path reportDir;
    private final boolean fallbackToFullBackup;
    private final boolean consistencyCheck;
    private final ConsistencyFlags consistencyFlags;
    private final Config config;

    /**
     * @param address
     * @param databaseName
     * @param databaseBackupDir
     * @param reportDir
     * @param fallbackToFullBackup
     * @param consistencyCheck
     * @param consistencyFlags
     * @param config
     */
    OnlineBackupContext( SocketAddress address, String databaseName, Path databaseBackupDir, Path reportDir, boolean fallbackToFullBackup,
                         boolean consistencyCheck, ConsistencyFlags consistencyFlags, Config config )
    {
        this.address = address;
        this.databaseName = databaseName;
        this.databaseBackupDir = databaseBackupDir;
        this.reportDir = reportDir;
        this.fallbackToFullBackup = fallbackToFullBackup;
        this.consistencyCheck = consistencyCheck;
        this.consistencyFlags = consistencyFlags;
        this.config = config;
    }

    /**
     * @return
     */
    public static OnlineBackupContext.Builder builder()
    {
        return new OnlineBackupContext.Builder();
    }

    /**
     * Getter
     *
     * @return
     */
    public SocketAddress getAddress()
    {
        return this.address;
    }

    /**
     * Getter
     *
     * @return
     */
    public String getDatabaseName()
    {
        return this.databaseName;
    }

    /**
     * Getter
     *
     * @return
     */
    public Path getDatabaseBackupDir()
    {
        return this.databaseBackupDir;
    }

    /**
     * Getter
     *
     * @return
     */
    public boolean getFallbackToFullBackup()
    {
        return this.fallbackToFullBackup;
    }

    public boolean getConsistencyCheck()
    {
        return this.consistencyCheck;
    }

    public Path getReportDir()
    {
        return this.reportDir;
    }

    Config getConfig()
    {
        return this.config;
    }

    ConsistencyFlags getConsistencyFlags()
    {
        return this.consistencyFlags;
    }

    /**
     * Builder pattern implemented.  We want all Builders to use the Builder class name for standardization following enterprise integration patterns. builder()
     * to generate new builder object , and build() to build the object.
     */
    public static final class Builder
    {

        private SocketAddress address;
        private String databaseName;
        private Path backupDirectory;
        private Path reportsDirectory;
        private boolean fallbackToFullBackup = true;
        private Config config;
        private boolean consistencyCheck = true;
        private boolean consistencyCheckGraph = true;
        private boolean consistencyCheckIndexes = true;
        private boolean consistencyCheckIndexStructure = true;
        private boolean consistencyCheckLabelScanStore = true;
        private boolean consistencyCheckPropertyOwners;

        private Builder()
        {
        }

        public OnlineBackupContext.Builder withAddress( String hostname, int port )
        {
            return this.withAddress( new SocketAddress( hostname, port ) );
        }

        public OnlineBackupContext.Builder withAddress( SocketAddress address )
        {
            this.address = address;
            return this;
        }

        public OnlineBackupContext.Builder withDatabaseName( String databaseName )
        {
            this.databaseName = databaseName;
            return this;
        }

        public OnlineBackupContext.Builder withBackupDirectory( Path backupDirectory )
        {
            this.backupDirectory = backupDirectory;
            return this;
        }

        public OnlineBackupContext.Builder withReportsDirectory( Path reportsDirectory )
        {
            this.reportsDirectory = reportsDirectory;
            return this;
        }

        public OnlineBackupContext.Builder withFallbackToFullBackup( boolean fallbackToFullBackup )
        {
            this.fallbackToFullBackup = fallbackToFullBackup;
            return this;
        }

        public OnlineBackupContext.Builder withConfig( Config config )
        {
            this.config = config;
            return this;
        }

        public OnlineBackupContext.Builder withConsistencyCheck( boolean consistencyCheck )
        {
            this.consistencyCheck = consistencyCheck;
            return this;
        }

        public OnlineBackupContext.Builder withConsistencyCheckGraph( Boolean consistencyCheckGraph )
        {
            this.consistencyCheckGraph = consistencyCheckGraph;
            return this;
        }

        public OnlineBackupContext.Builder withConsistencyCheckIndexes( Boolean consistencyCheckIndexes )
        {
            this.consistencyCheckIndexes = consistencyCheckIndexes;
            return this;
        }

        public OnlineBackupContext.Builder withConsistencyCheckIndexStructure( Boolean consistencyCheckIndexStructure )
        {
            this.consistencyCheckIndexStructure = consistencyCheckIndexStructure;
            return this;
        }

        public OnlineBackupContext.Builder withConsistencyCheckLabelScanStore( Boolean consistencyCheckLabelScanStore )
        {
            this.consistencyCheckLabelScanStore = consistencyCheckLabelScanStore;
            return this;
        }

        public OnlineBackupContext.Builder withConsistencyCheckPropertyOwners( Boolean consistencyCheckPropertyOwners )
        {
            this.consistencyCheckPropertyOwners = consistencyCheckPropertyOwners;
            return this;
        }

        public OnlineBackupContext build()
        {
            if ( this.config == null )
            {
                this.config = Config.defaults();
            }

            if ( this.databaseName == null )
            {
                this.databaseName = (String) this.config.get( GraphDatabaseSettings.default_database );
            }

            if ( this.backupDirectory == null )
            {
                this.backupDirectory = Paths.get( "." );
            }

            if ( this.reportsDirectory == null )
            {
                this.reportsDirectory = Paths.get( "." );
            }

            SocketAddress address = this.buildAddress();
            Path databaseBackupDirectory = this.backupDirectory.resolve( this.databaseName );
            ConsistencyFlags consistencyFlags = this.buildConsistencyFlags();
            return new OnlineBackupContext( address, this.databaseName, databaseBackupDirectory, this.reportsDirectory, this.fallbackToFullBackup,
                                            this.consistencyCheck, consistencyFlags, this.config );
        }

        private SocketAddress buildAddress()
        {
            if ( this.address == null )
            {
                SocketAddress defaultListenAddress = (SocketAddress) this.config.get( OnlineBackupSettings.online_backup_listen_address );
                this.address = new SocketAddress( defaultListenAddress.getHostname(), defaultListenAddress.getPort() );
            }

            return this.address;
        }

        private ConsistencyFlags buildConsistencyFlags()
        {
            return new ConsistencyFlags( this.consistencyCheckGraph, this.consistencyCheckIndexes, this.consistencyCheckIndexStructure,
                                         this.consistencyCheckLabelScanStore, this.consistencyCheckPropertyOwners );
        }
    }
}
