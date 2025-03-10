/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.graphdb.factory;

import java.io.File;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.configuration.Settings;
import org.neo4j.kernel.enterprise.EnterpriseGraphDatabase;
import org.neo4j.kernel.impl.factory.Edition;

/**
 * Factory for ONgDB database instances with Enterprise Edition features.
 *
 * @see GraphDatabaseFactory
 */
public class EnterpriseGraphDatabaseFactory extends GraphDatabaseFactory
{
    @Override
    protected GraphDatabaseBuilder.DatabaseCreator createDatabaseCreator( final File storeDir,
                                                                          final GraphDatabaseFactoryState state )
    {
        return new GraphDatabaseBuilder.DatabaseCreator()
        {
            @Override
            public GraphDatabaseService newDatabase( Config config )
            {
                config.augment( GraphDatabaseSettings.ephemeral, Settings.FALSE );

                File absoluteStoreDir = storeDir.getAbsoluteFile();
                File databasesRoot = absoluteStoreDir.getParentFile();
                config.augment( GraphDatabaseSettings.active_database, absoluteStoreDir.getName() );
                config.augment( GraphDatabaseSettings.databases_root_path, databasesRoot.getAbsolutePath() );

                return new EnterpriseGraphDatabase( databasesRoot, config, state.databaseDependencies() );
            }
        };
    }

    @Override
    public String getEdition()
    {
        return Edition.enterprise.toString();
    }
}
