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
package org.neo4j.server.enterprise.modules;

import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Pattern;

import org.neo4j.configuration.Config;
import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.logging.LogProvider;
import org.neo4j.server.modules.AuthorizationModule;
import org.neo4j.server.rest.dbms.AuthorizationDisabledFilter;
import org.neo4j.server.rest.dbms.EnterpriseAuthorizationDisabledFilter;
import org.neo4j.server.web.WebServer;

public class EnterpriseAuthorizationModule extends AuthorizationModule
{
    public EnterpriseAuthorizationModule( WebServer webServer, Supplier<AuthManager> authManager, LogProvider logProvider, Config config,
                                          List<Pattern> uriWhitelist )
    {
        super( webServer, authManager, logProvider, config, uriWhitelist );
    }

    @Override
    protected AuthorizationDisabledFilter createAuthorizationDisabledFilter()
    {
        return new EnterpriseAuthorizationDisabledFilter();
    }
}
