/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.server.rest;

import java.net.URI;
import java.util.Collections;
import java.util.List;

import org.neo4j.configuration.Config;
import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.modules.ServerModule;
import org.neo4j.server.web.WebServer;

public class LegacyEnterpriseManagementModule implements ServerModule
{
    private final WebServer server;
    private final Config config;

    public LegacyEnterpriseManagementModule( WebServer server, Config config )
    {
        this.server = server;
        this.config = config;
    }

    private static List<Class<?>> jaxRsClasses()
    {
        return Collections.emptyList();
    }

    public void start()
    {
        String mountPoint = this.mountPoint();
        this.server.addJAXRSClasses( jaxRsClasses(), mountPoint, null );
    }

    public void stop()
    {
        this.server.removeJAXRSClasses( jaxRsClasses(), this.mountPoint() );
    }

    private String mountPoint()
    {
        return ((URI) this.config.get( ServerSettings.management_api_path )).toString();
    }
}
