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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.io.pagecache.IOController;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.monitoring.Health;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

class CheckpointerLifecycleTest
{
    private final CheckPointer checkPointer = mock( CheckPointer.class );
    private final Health databaseHealth = mock( DatabaseHealth.class );
    private final IOController ioController = mock( IOController.class );
    private final CheckpointerLifecycle checkpointLifecycle = new CheckpointerLifecycle( checkPointer, databaseHealth, ioController );

    @BeforeEach
    void setUp()
    {
        when( databaseHealth.isHealthy() ).thenReturn( true );
    }

    @Test
    void checkpointOnShutdown() throws Throwable
    {
        checkpointLifecycle.shutdown();

        verify( checkPointer ).forceCheckPoint( any( TriggerInfo.class ) );
    }

    @Test
    void skipCheckpointOnShutdownByRequest() throws Throwable
    {
        checkpointLifecycle.setCheckpointOnShutdown( false );
        checkpointLifecycle.shutdown();

        verifyNoInteractions( checkPointer );
    }

    @Test
    void disableIOControllerOnShutdown() throws Exception
    {
        checkpointLifecycle.shutdown();

        verify( ioController ).disable();
    }
}
