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
package org.neo4j.bolt.runtime.statemachine.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;

import org.neo4j.bolt.BoltChannel;
import org.neo4j.bolt.BoltProtocolVersion;
import org.neo4j.bolt.dbapi.impl.BoltKernelDatabaseManagementServiceProvider;
import org.neo4j.bolt.transaction.StatementProcessorTxManager;
import org.neo4j.bolt.runtime.statemachine.BoltStateMachine;
import org.neo4j.bolt.security.auth.Authentication;
import org.neo4j.bolt.testing.BoltTestUtil;
import org.neo4j.bolt.v3.BoltStateMachineV3;
import org.neo4j.bolt.v4.BoltStateMachineV4;
import org.neo4j.bolt.v41.BoltStateMachineV41;
import org.neo4j.bolt.v42.BoltStateMachineV42;
import org.neo4j.bolt.v43.BoltStateMachineV43;
import org.neo4j.common.DependencyResolver;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.kernel.GraphDatabaseQueryService;
import org.neo4j.kernel.database.DefaultDatabaseResolver;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacade;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.monitoring.Monitors;
import org.neo4j.time.Clocks;
import org.neo4j.time.SystemNanoClock;
import org.neo4j.values.virtual.MapValue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.RETURNS_MOCKS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

class BoltStateMachineFactoryImplTest
{
    private static final String CUSTOM_DB_NAME = "customDbName";
    private static final SystemNanoClock CLOCK = Clocks.nanoClock();
    private static final BoltChannel CHANNEL = BoltTestUtil.newTestBoltChannel();

    @Test
    void shouldCreateBoltStateMachinesV3()
    {
        BoltStateMachineFactoryImpl factory = newBoltFactory();
        var memoryTracker = mock( MemoryTracker.class, RETURNS_MOCKS );

        BoltStateMachine boltStateMachine = factory.newStateMachine( new BoltProtocolVersion( 3, 0 ), CHANNEL, MapValue.EMPTY, memoryTracker );

        assertNotNull( boltStateMachine );
        assertThat( boltStateMachine ).isInstanceOf( BoltStateMachineV3.class );

        verify( memoryTracker ).getScopedMemoryTracker();
        verify( memoryTracker, times( 3 ) ).allocateHeap( anyLong() );
        verifyNoMoreInteractions( memoryTracker );
    }

    @Test
    void shouldCreateBoltStateMachinesV4()
    {
        BoltStateMachineFactoryImpl factory = newBoltFactory();
        var memoryTracker = mock( MemoryTracker.class, RETURNS_MOCKS );

        BoltStateMachine boltStateMachine = factory.newStateMachine( new BoltProtocolVersion( 4, 0 ), CHANNEL, MapValue.EMPTY, memoryTracker );

        assertNotNull( boltStateMachine );
        assertThat( boltStateMachine ).isInstanceOf( BoltStateMachineV4.class );

        verify( memoryTracker ).getScopedMemoryTracker();
        verify( memoryTracker, times( 3 ) ).allocateHeap( anyLong() );
        verifyNoMoreInteractions( memoryTracker );
    }

    @Test
    void shouldCreateBoltStateMachinesV41()
    {
        BoltStateMachineFactoryImpl factory = newBoltFactory();
        var memoryTracker = mock( MemoryTracker.class, RETURNS_MOCKS );

        BoltStateMachine boltStateMachine = factory.newStateMachine( new BoltProtocolVersion( 4, 1 ), CHANNEL, MapValue.EMPTY, memoryTracker );

        assertNotNull( boltStateMachine );
        assertThat( boltStateMachine ).isInstanceOf( BoltStateMachineV41.class );

        verify( memoryTracker ).getScopedMemoryTracker();
        verify( memoryTracker, times( 3 ) ).allocateHeap( anyLong() );
        verifyNoMoreInteractions( memoryTracker );
    }

    @Test
    void shouldCreateBoltStateMachinesV42()
    {
        BoltStateMachineFactoryImpl factory = newBoltFactory();
        var memoryTracker = mock( MemoryTracker.class, RETURNS_MOCKS );

        BoltStateMachine boltStateMachine = factory.newStateMachine( new BoltProtocolVersion( 4, 2 ), CHANNEL, MapValue.EMPTY, memoryTracker );

        assertNotNull( boltStateMachine );
        assertThat( boltStateMachine ).isInstanceOf( BoltStateMachineV42.class );

        verify( memoryTracker ).getScopedMemoryTracker();
        verify( memoryTracker, times( 3 ) ).allocateHeap( anyLong() );
        verifyNoMoreInteractions( memoryTracker );
    }

    @Test
    void shouldCreateBoltStateMachinesV43()
    {
        BoltStateMachineFactoryImpl factory = newBoltFactory();
        var memoryTracker = mock( MemoryTracker.class, RETURNS_MOCKS );

        BoltStateMachine boltStateMachine = factory.newStateMachine( new BoltProtocolVersion( 4, 3 ), CHANNEL, MapValue.EMPTY, memoryTracker );

        assertNotNull( boltStateMachine );
        assertThat( boltStateMachine ).isInstanceOf( BoltStateMachineV43.class );

        verify( memoryTracker ).getScopedMemoryTracker();
        verify( memoryTracker, times( 3 ) ).allocateHeap( anyLong() );
        verifyNoMoreInteractions( memoryTracker );
    }

    @ParameterizedTest( name = "V{0}" )
    @ValueSource( ints = {999, -1, 1, 2} )
    void shouldThrowExceptionIfVersionIsUnknown( int protocolVersion )
    {
        BoltStateMachineFactoryImpl factory = newBoltFactory();
        BoltProtocolVersion boltProtocolVersion = new BoltProtocolVersion( protocolVersion, 0 );
        var memoryTracker = mock( MemoryTracker.class );

        IllegalArgumentException error =
                assertThrows( IllegalArgumentException.class, () -> factory.newStateMachine( boltProtocolVersion, CHANNEL, MapValue.EMPTY, memoryTracker ) );
        assertThat( error.getMessage() ).startsWith( "Failed to create a state machine for protocol version" );

        verifyNoMoreInteractions( memoryTracker );
    }

    private static BoltStateMachineFactoryImpl newBoltFactory()
    {
        return newBoltFactory( newDbMock() );
    }

    private static BoltStateMachineFactoryImpl newBoltFactory( DatabaseManagementService managementService )
    {
        var config = Config.defaults( GraphDatabaseSettings.default_database, CUSTOM_DB_NAME );
        var dbProvider = new BoltKernelDatabaseManagementServiceProvider( managementService, new Monitors(), CLOCK, Duration.ZERO );
        return new BoltStateMachineFactoryImpl( dbProvider, mock( Authentication.class ), CLOCK, config, NullLogService.getInstance(),
                                                mock( DefaultDatabaseResolver.class), mock( StatementProcessorTxManager.class ) );
    }

    private static DatabaseManagementService newDbMock()
    {
        GraphDatabaseFacade db = mock( GraphDatabaseFacade.class );
        DependencyResolver dependencyResolver = mock( DependencyResolver.class );
        when( db.getDependencyResolver() ).thenReturn( dependencyResolver );
        GraphDatabaseQueryService queryService = mock( GraphDatabaseQueryService.class );
        when( queryService.getDependencyResolver() ).thenReturn( dependencyResolver );
        when( dependencyResolver.resolveDependency( GraphDatabaseQueryService.class ) ).thenReturn( queryService );
        DatabaseManagementService managementService = mock( DatabaseManagementService.class );
        when( managementService.database( CUSTOM_DB_NAME ) ).thenReturn( db );
        return managementService;
    }
}
