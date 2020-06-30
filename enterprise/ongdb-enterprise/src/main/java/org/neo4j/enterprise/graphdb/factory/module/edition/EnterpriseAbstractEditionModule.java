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

package org.neo4j.enterprise.graphdb.factory.module.edition;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.cypher.internal.runtime.pipelined.PipelinedCypherWorker;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.scheduler.Group;

public interface EnterpriseAbstractEditionModule
{
    /**
     * Ensure we register dependencies specific to enterprise here.
     *
     * @param globalModule
     */
    default void registerDependencies( GlobalModule globalModule )
    {
        Config globalConfig = globalModule.getGlobalConfig();
        int configuredWorkers = (Integer) globalConfig.get( GraphDatabaseSettings.cypher_worker_count );
        int numberOfThreads = configuredWorkers == 0 ? Runtime.getRuntime().availableProcessors() : configuredWorkers;
        PipelinedCypherWorker pipelinedCypherWorker =
                new PipelinedCypherWorker( numberOfThreads, globalModule.getJobScheduler().threadFactory( Group.CYPHER_WORKER ) );
        globalModule.getGlobalDependencies().satisfyDependency( pipelinedCypherWorker );
        globalModule.getGlobalLife().add( pipelinedCypherWorker );
    }
}
