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
package org.neo4j.kernel.impl.enterprise.settings.backup;

import org.neo4j.configuration.Description;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.graphdb.config.Setting;

/**
 * Settings for online backup
 */
@Description( "Online backup configuration settings" )
public class OnlineBackupSettings implements SettingsDeclaration
{

    public static final String DEFAULT_BACKUP_HOST = "127.0.0.1";
    public static final int DEFAULT_BACKUP_PORT = 6362;
    @Description( "Enable support for running online backups." )
    public static final Setting<Boolean> online_backup_enabled;
    @Description( "Network interface and port for the backup server to listen on." )
    public static final Setting<SocketAddress> online_backup_listen_address;

    static
    {
        online_backup_enabled = SettingImpl
                .newBuilder( "dbms.backup.enabled", SettingValueParsers.BOOL, true ).build();
        online_backup_listen_address =
                SettingImpl.newBuilder( "dbms.backup.listen_address", SettingValueParsers.SOCKET_ADDRESS,
                                        new SocketAddress( DEFAULT_BACKUP_HOST, DEFAULT_BACKUP_PORT ) ).build();
    }
}
