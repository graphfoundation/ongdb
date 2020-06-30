/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j"
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
package org.neo4j.backup.impl;

import java.time.Clock;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.ssl.SslPolicyScope;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.ssl.SslPolicy;
import org.neo4j.ssl.config.SslPolicyLoader;
import org.neo4j.storageengine.api.StorageEngineFactory;

/**
 * The dependencies for the backup strategies require a valid configuration for initialisation. By having this factory we can wait until the configuration has
 * been loaded and the provide all the classes required for backups that are dependant on the config.
 */
public class BackupSupportingClassesFactory
{
    private final LogProvider logProvider;
    private final Clock clock;
    private final Monitors monitors;
    private final FileSystemAbstraction fileSystemAbstraction;
    private final StorageEngineFactory storageEngineFactory;

    public BackupSupportingClassesFactory( StorageEngineFactory storageEngineFactory, FileSystemAbstraction fileSystemAbstraction, LogProvider logProvider,
                                           Monitors monitors )
    {
        this.logProvider = logProvider;
        this.clock = Clock.systemUTC();
        this.monitors = monitors;
        this.fileSystemAbstraction = fileSystemAbstraction;

        this.storageEngineFactory = storageEngineFactory;
    }

    private SslPolicy getSslPolicy( Config config )
    {
        SslPolicyLoader sslPolicyLoader = SslPolicyLoader.create( config, this.logProvider );
        return sslPolicyLoader.hasPolicyForSource( SslPolicyScope.BACKUP ) ? sslPolicyLoader.getPolicy( SslPolicyScope.BACKUP ) : null;
    }

    public BackupSupportingClasses createSupportingClasses( OnlineBackupContext context )
    {
        return null;
    }
}
