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

package org.neo4j.dbms.api;

import java.io.File;
import java.util.function.Function;

import org.neo4j.annotations.api.PublicApi;
import org.neo4j.common.Edition;
import org.neo4j.enterprise.graphdb.factory.module.edition.EnterpriseEditionModule;
import org.neo4j.graphdb.facade.ExternalDependencies;
import org.neo4j.graphdb.facade.GraphDatabaseDependencies;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.kernel.impl.factory.DatabaseInfo;

@PublicApi
public class EnterpriseDatabaseManagementServiceBuilder extends DatabaseManagementServiceBuilder
{
    public EnterpriseDatabaseManagementServiceBuilder( File homeDirectory )
    {
        super( homeDirectory );
    }

    @Override
    public String getEdition()
    {
        return Edition.ENTERPRISE.toString();
    }
    @Override
    protected ExternalDependencies databaseDependencies()
    {
        return GraphDatabaseDependencies.newDependencies().monitors( this.monitors ).userLogProvider( this.userLogProvider ).dependencies(
                this.dependencies ).urlAccessRules( this.urlAccessRules ).extensions( this.extensions ).databaseEventListeners( this.databaseEventListeners );
    }
    @Override
    protected DatabaseInfo getDatabaseInfo()
    {
        return DatabaseInfo.ENTERPRISE;
    }
    @Override
    protected Function<GlobalModule,AbstractEditionModule> getEditionFactory()
    {
        return EnterpriseEditionModule::new;
    }
}
