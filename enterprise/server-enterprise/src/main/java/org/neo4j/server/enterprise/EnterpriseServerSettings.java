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
package org.neo4j.server.enterprise;

import java.time.Duration;

import org.neo4j.configuration.Description;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.graphdb.config.Setting;

@Description( "Settings available in the Enterprise server" )
public class EnterpriseServerSettings implements SettingsDeclaration
{
    @Description( "Configure the Neo4j Browser to time out logged in users after this idle period. Setting this to 0 indicates no limit." )
    public static final Setting<Duration> browser_credentialTimeout;
    @Description( "Configure the Neo4j Browser to store or not store user credentials." )
    public static final Setting<Boolean> browser_retainConnectionCredentials;
    @Description( "Configure the policy for outgoing Neo4j Browser connections." )
    public static final Setting<Boolean> browser_allowOutgoingBrowserConnections;

    static
    {
        browser_credentialTimeout = SettingImpl.newBuilder( "browser.credential_timeout", SettingValueParsers.DURATION, Duration.ZERO ).build();
        browser_retainConnectionCredentials = SettingImpl.newBuilder( "browser.retain_connection_credentials", SettingValueParsers.BOOL, true ).build();
        browser_allowOutgoingBrowserConnections = SettingImpl.newBuilder( "browser.allow_outgoing_connections", SettingValueParsers.BOOL, true ).build();
    }
}
