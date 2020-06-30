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

import java.util.Map;

import org.neo4j.kernel.configuration.Settings;
import org.neo4j.kernel.extension.KernelExtensionFactoryContractTest;
import org.neo4j.kernel.impl.enterprise.settings.backup.OnlineBackupSettings;
import org.neo4j.ports.allocation.PortAuthority;

public class OnlineBackupExtensionIT extends KernelExtensionFactoryContractTest
{
    public OnlineBackupExtensionIT()
    {
        super( OnlineBackupExtensionFactory.KEY, OnlineBackupExtensionFactory.class );
    }

    @Override
    protected Map<String,String> configuration( int instance )
    {
        Map<String,String> configuration = super.configuration( instance );
        configuration.put( OnlineBackupSettings.online_backup_enabled.name(), Settings.TRUE );
        configuration.put( OnlineBackupSettings.online_backup_server.name(), "127.0.0.1:" + PortAuthority.allocatePort() );
        return configuration;
    }
}
