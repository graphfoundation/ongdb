/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.kernel.impl.transaction.log.checkpoint;

import org.neo4j.io.pagecache.IOController;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.monitoring.Health;

public class CheckpointerLifecycle extends LifecycleAdapter
{
    private final CheckPointer checkPointer;
    private final Health databaseHealth;
    private final IOController ioController;
    private volatile boolean checkpointOnShutdown = true;

    public CheckpointerLifecycle( CheckPointer checkPointer, Health databaseHealth, IOController ioController )
    {
        this.checkPointer = checkPointer;
        this.databaseHealth = databaseHealth;
        this.ioController = ioController;
    }

    public void setCheckpointOnShutdown( boolean checkpointOnShutdown )
    {
        this.checkpointOnShutdown = checkpointOnShutdown;
    }

    @Override
    public void shutdown() throws Exception
    {
        // Write new checkpoint in the log only if the database is healthy.
        // We cannot throw here since we need to shutdown without exceptions.
        if ( checkpointOnShutdown && databaseHealth.isHealthy() )
        {
            ioController.disable();
            checkPointer.forceCheckPoint( new SimpleTriggerInfo( "Database shutdown" ) );
        }
    }
}
