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
package org.neo4j.kernel.ha;

import java.io.File;
import java.util.Map;

import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.ha.cluster.HighAvailabilityMemberState;
import org.neo4j.kernel.ha.cluster.modeswitch.HighAvailabilityModeSwitcher;
import org.neo4j.kernel.ha.factory.HighlyAvailableEditionModule;
import org.neo4j.kernel.impl.factory.DatabaseInfo;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacade;

/**
 * This has all the functionality of an Enterprise Edition embedded database, with the addition of services
 * for handling clustering.
 */
public class HighlyAvailableGraphDatabase extends GraphDatabaseFacade
{

    protected HighlyAvailableEditionModule module;

    public HighlyAvailableGraphDatabase( File storeDir, Map<String,String> params,
            GraphDatabaseFacadeFactory.Dependencies dependencies )
    {
        newHighlyAvailableFacadeFactory().initFacade( storeDir, params, dependencies, this );
    }

    public HighlyAvailableGraphDatabase( File storeDir, Config config,
            GraphDatabaseFacadeFactory.Dependencies dependencies )
    {
        newHighlyAvailableFacadeFactory().initFacade( storeDir, config, dependencies, this );
    }

    // used for testing in a different project, please do not remove
    protected GraphDatabaseFacadeFactory newHighlyAvailableFacadeFactory()
    {
        return new GraphDatabaseFacadeFactory( DatabaseInfo.HA, platformModule ->
        {
            module = new HighlyAvailableEditionModule( platformModule );
            return module;
        } );
    }

    public HighAvailabilityMemberState getInstanceState()
    {
        return module.memberStateMachine.getCurrentState();
    }

    public String role()
    {
        return module.members.getCurrentMemberRole();
    }

    public boolean isMaster()
    {
        return HighAvailabilityModeSwitcher.MASTER.equalsIgnoreCase( role() );
    }
}
