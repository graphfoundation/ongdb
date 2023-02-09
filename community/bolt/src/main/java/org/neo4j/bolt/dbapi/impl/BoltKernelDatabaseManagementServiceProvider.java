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
package org.neo4j.bolt.dbapi.impl;

import java.time.Duration;

import org.neo4j.bolt.dbapi.BoltGraphDatabaseManagementServiceSPI;
import org.neo4j.bolt.dbapi.BoltGraphDatabaseServiceSPI;
import org.neo4j.bolt.txtracking.TransactionIdTracker;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseNotFoundException;
import org.neo4j.kernel.availability.UnavailableException;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.monitoring.Monitors;
import org.neo4j.time.SystemNanoClock;

import static java.lang.String.format;

public class BoltKernelDatabaseManagementServiceProvider implements BoltGraphDatabaseManagementServiceSPI
{
    private final DatabaseManagementService managementService;
    private final TransactionIdTracker transactionIdTracker;
    private final Duration bookmarkAwaitDuration;

    public BoltKernelDatabaseManagementServiceProvider( DatabaseManagementService managementService,
            Monitors monitors, SystemNanoClock clock, Duration bookmarkAwaitDuration )
    {
        this.managementService = managementService;
        this.transactionIdTracker = new TransactionIdTracker( managementService, monitors, clock );
        this.bookmarkAwaitDuration = bookmarkAwaitDuration;
    }

    @Override
    public BoltGraphDatabaseServiceSPI database( String databaseName, MemoryTracker memoryTracker ) throws DatabaseNotFoundException, UnavailableException
    {
        memoryTracker.allocateHeap( BoltKernelGraphDatabaseServiceProvider.SHALLOW_SIZE );

        var databaseAPI = (GraphDatabaseAPI) managementService.database( databaseName );

        if ( !databaseAPI.isAvailable( 0 ) )
        {
            throw new UnavailableException( format( "Database '%s' is unavailable.", databaseName ) );
        }
        return new BoltKernelGraphDatabaseServiceProvider( databaseAPI, transactionIdTracker, bookmarkAwaitDuration, memoryTracker );
    }
}
