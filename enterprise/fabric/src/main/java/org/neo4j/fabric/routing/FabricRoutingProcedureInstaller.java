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

package org.neo4j.fabric.routing;

import java.util.List;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.fabric.FabricDatabaseManager;
import org.neo4j.fabric.config.FabricConfig;
import org.neo4j.kernel.api.procedure.CallableProcedure;
import org.neo4j.logging.LogProvider;
import org.neo4j.procedure.builtin.routing.BaseRoutingProcedureInstaller;

public class FabricRoutingProcedureInstaller extends BaseRoutingProcedureInstaller
{
    private final DatabaseManager<?> databaseManager;
    private final ConnectorPortRegister portRegister;
    private final Config config;
    private final FabricDatabaseManager fabricDatabaseManager;
    private final FabricConfig fabricConfig;
    private final LogProvider logProvider;

    public FabricRoutingProcedureInstaller( DatabaseManager<?> databaseManager, ConnectorPortRegister portRegister, Config config,
                                            FabricDatabaseManager fabricDatabaseManager, FabricConfig fabricConfig, LogProvider logProvider )
    {
        this.databaseManager = databaseManager;
        this.portRegister = portRegister;
        this.config = config;
        this.fabricDatabaseManager = fabricDatabaseManager;
        this.fabricConfig = fabricConfig;
        this.logProvider = logProvider;
    }

    protected CallableProcedure createProcedure( List<String> namespace )
    {
        return new FabricSingleInstanceGetRoutingTableProcedure( namespace, this.databaseManager, this.portRegister, this.config, this.fabricDatabaseManager,
                                                                 this.fabricConfig, this.logProvider );
    }
}
