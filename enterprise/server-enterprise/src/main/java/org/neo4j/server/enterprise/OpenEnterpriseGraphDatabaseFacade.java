/*
 * Copyright (c) 2018-2019 "GraphFoundation" [https://graphfoundation.org]
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

import java.io.File;

import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory;
import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory.Dependencies;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.impl.factory.DatabaseInfo;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacade;

public class OpenEnterpriseGraphDatabaseFacade extends GraphDatabaseFacade
{
    public OpenEnterpriseGraphDatabaseFacade( File storeDir, Config config, Dependencies dependencies )
    {
        (new GraphDatabaseFacadeFactory( DatabaseInfo.ENTERPRISE, OpenEnterpriseEditionModule::new )).initFacade( storeDir, config, dependencies, this );
    }
}
