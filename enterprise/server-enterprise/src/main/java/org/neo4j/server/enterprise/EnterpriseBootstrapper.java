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

import java.util.ArrayList;
import java.util.List;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GroupSettingValidator;
import org.neo4j.graphdb.facade.GraphDatabaseDependencies;
import org.neo4j.server.CommunityBootstrapper;
import org.neo4j.server.NeoServer;
import org.neo4j.server.database.EnterpriseGraphFactory;
import org.neo4j.server.database.GraphFactory;

/**
 * See https://github.com/graphfoundation/ongdb/blob/3.2/enterprise/server-enterprise/src/main/java/org/neo4j/server/enterprise/EnterpriseBootstrapper.java
 */
public class EnterpriseBootstrapper extends CommunityBootstrapper
{
    protected GraphFactory createGraphFactory( Config config )
    {
        return new EnterpriseGraphFactory();
    }

    protected NeoServer createNeoServer( GraphFactory graphFactory, Config config, GraphDatabaseDependencies dependencies )
    {
        return new EnterpriseNeoServer( config, graphFactory, dependencies );
    }

    protected List<Class<? extends GroupSettingValidator>> configurationValidators()
    {
        List<Class<? extends GroupSettingValidator>> validators = new ArrayList( super.configurationValidators() );
        //TODO: Add causal cluster validator(s) here.
        return validators;
    }
}
