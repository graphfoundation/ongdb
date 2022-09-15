/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.configuration.connectors;

import org.neo4j.annotations.api.PublicApi;
import org.neo4j.annotations.service.ServiceProvider;
import org.neo4j.configuration.Description;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.graphdb.config.Setting;

import static org.neo4j.configuration.GraphDatabaseSettings.default_advertised_address;
import static org.neo4j.configuration.GraphDatabaseSettings.default_listen_address;
import static org.neo4j.configuration.SettingImpl.newBuilder;
import static org.neo4j.configuration.SettingValueParsers.SOCKET_ADDRESS;

@ServiceProvider
@PublicApi
public final class HttpsConnector implements SettingsDeclaration
{
    public static final int DEFAULT_PORT = 7473;
    public static final String NAME = "https";

    @Description( "Enable the https connector" )
    public static final Setting<Boolean> enabled = ConnectorDefaults.https_enabled;

    @Description( "Address the connector should bind to" )
    public static final Setting<SocketAddress> listen_address =
            newBuilder( "dbms.connector.https.listen_address", SOCKET_ADDRESS, new SocketAddress( DEFAULT_PORT ) )
                    .setDependency( default_listen_address )
                    .build();

    @Description( "Advertised address for this connector" )
    public static final Setting<SocketAddress> advertised_address =
            newBuilder( "dbms.connector.https.advertised_address", SOCKET_ADDRESS, new SocketAddress( DEFAULT_PORT ) )
                    .setDependency( default_advertised_address )
                    .build();
}
