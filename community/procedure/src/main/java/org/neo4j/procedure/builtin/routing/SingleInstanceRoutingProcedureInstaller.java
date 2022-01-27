/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.procedure.builtin.routing;

import java.util.List;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.logging.LogProvider;

import static org.neo4j.procedure.builtin.routing.RoutingTableTTLProvider.ttlFromConfig;

public final class SingleInstanceRoutingProcedureInstaller extends AbstractRoutingProcedureInstaller
{
    private static final String DESCRIPTION = "Returns endpoints of this instance.";

    private final DatabaseManager<?> databaseManager;
    private final ClientRoutingDomainChecker clientRoutingDomainChecker;
    private final ConnectorPortRegister portRegister;
    private final Config config;
    private final LogProvider logProvider;

    public SingleInstanceRoutingProcedureInstaller( DatabaseManager<?> databaseManager, ClientRoutingDomainChecker clientRoutingDomainChecker,
                                                    ConnectorPortRegister portRegister, Config config, LogProvider logProvider )
    {
        this.databaseManager = databaseManager;
        this.clientRoutingDomainChecker = clientRoutingDomainChecker;
        this.portRegister = portRegister;
        this.config = config;
        this.logProvider = logProvider;
    }

    @Override
    public GetRoutingTableProcedure createProcedure( List<String> namespace )
    {
        LocalRoutingTableProcedureValidator validator = new LocalRoutingTableProcedureValidator( databaseManager );
        SingleAddressRoutingTableProvider routingTableProvider = new SingleAddressRoutingTableProvider(
                portRegister, RoutingOption.ROUTE_WRITE_AND_READ, config, logProvider, ttlFromConfig( config ) );

        return new GetRoutingTableProcedure( namespace, DESCRIPTION, databaseManager, validator, routingTableProvider, clientRoutingDomainChecker,
                                             config, logProvider );
    }
}
