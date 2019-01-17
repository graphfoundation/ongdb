/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * Modifications Copyright (c) 2018-2019 "GraphFoundation" [https://graphfoundation.org]
 *
 * The included source code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html)
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 */

package org.neo4j.server.enterprise;

import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory.Dependencies;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.server.database.GraphFactory;

/**
 * See
 * https://github.com/neo4j/neo4j/blob/3.2/enterprise/server-enterprise/src/main/java/org/neo4j/server/enterprise/EnterpriseNeoServer.java
 * https://github.com/neo4j/neo4j/blob/625e26f3f0a46a52085b5d65600c5521ca80a34d/community/server/src/main/java/org/neo4j/server/rest/management/VersionAndEditionService.java
 */
public class EnterpriseNeoServer extends OpenEnterpriseNeoServer
{
    /**
     * @param config
     * @param dependencies
     */
    public EnterpriseNeoServer( Config config, Dependencies dependencies )
    {
        super( config, new OpenEnterpriseGraphFactory(), dependencies );
    }

    /**
     * @param config
     * @param graphFactory
     * @param dependencies
     */
    public EnterpriseNeoServer( Config config, GraphFactory graphFactory, Dependencies dependencies )
    {
        super( config, graphFactory, dependencies );
    }
}

