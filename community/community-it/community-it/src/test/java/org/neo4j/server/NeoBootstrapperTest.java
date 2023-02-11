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
package org.neo4j.server;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.api.parallel.Resources;

import java.lang.management.MemoryUsage;
import java.nio.file.Path;
import java.util.Map;

import org.neo4j.configuration.BootloaderSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.helpers.collection.MapUtil;
import org.neo4j.memory.MachineMemory;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.SuppressOutput;
import org.neo4j.test.extension.SuppressOutputExtension;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@TestDirectoryExtension
@ExtendWith( SuppressOutputExtension.class )
@ResourceLock( Resources.SYSTEM_OUT )
class NeoBootstrapperTest
{
    @Inject
    private TestDirectory homeDir;
    @Inject
    private SuppressOutput suppress;
    private NeoBootstrapper neoBootstrapper;
    private Path dir;

    @AfterEach
    void tearDown()
    {
        if ( neoBootstrapper != null )
        {
            neoBootstrapper.stop();
            // Even if we didn't start a database management system because of a configuration error we should log a stopped message to allow users to
            // distinguish between a neo4j process that completed shutdown and one that was terminated without performing shutdown
            assertThat( suppress.getOutputVoice().lines() ).last().asString().endsWith( "Stopped." );
        }
    }

    @BeforeEach
    void setUp()
    {
        dir = homeDir.directory( "test-server-bootstrapper" );
    }

    @Test
    void shouldNotThrowNullPointerExceptionIfConfigurationValidationFails()
    {
        // given
        neoBootstrapper = new CommunityBootstrapper();

        // when
        assertThatThrownBy( () -> neoBootstrapper.start( dir, Map.of( "dbms.default_database", "$%^&*#)@!" ) ) )
                .isInstanceOf( IllegalArgumentException.class )
                .hasNoSuppressedExceptions()
                .getRootCause().isInstanceOf( IllegalArgumentException.class );

        // then no exceptions are thrown on stop and logs are written
        neoBootstrapper.stop();
        assertThat( suppress.getOutputVoice().lines() ).last().asString().endsWith( "Stopped." );
        neoBootstrapper = null;
    }

    @Test
    void shouldFailToStartIfRequestedPageCacheMemoryExceedsTotal()
    {
        // given
        neoBootstrapper = new CommunityBootstrapper();
        Map<String,String> config = MapUtil.stringMap();
        config.put( GraphDatabaseSettings.pagecache_memory.name(), "10B" );

        // Mock heap usage and free memory.
        MachineMemory mockedMemory = mock( MachineMemory.class );
        MemoryUsage heapMemory = new MemoryUsage( 0, 1, 1, 1 );
        when( mockedMemory.getTotalPhysicalMemory() ).thenReturn( 8L );
        when( mockedMemory.getHeapMemoryUsage() ).thenReturn( heapMemory );
        neoBootstrapper.setMachineMemory( mockedMemory );

        assertThat( neoBootstrapper.start( dir, config ) ).isNotEqualTo( NeoBootstrapper.OK );
        assertThat( suppress.getOutputVoice().lines() )
                .anySatisfy( line -> assertThat( line ).containsSubsequence( "Invalid memory configuration - exceeds physical memory." ) );
    }

    @Test
    void shouldFailToStartIfRequestedHeapMemoryExceedsTotal()
    {
        // given
        neoBootstrapper = new CommunityBootstrapper();
        Map<String,String> config = MapUtil.stringMap();
        config.put( BootloaderSettings.max_heap_size.name(), "10B" );
        config.put( GraphDatabaseSettings.pagecache_memory.name(), "1B" );

        // Mock heap usage and free memory.
        MachineMemory mockedMemory = mock( MachineMemory.class );
        MemoryUsage heapMemory = new MemoryUsage( 0, 1, 1, 10 );
        when( mockedMemory.getTotalPhysicalMemory() ).thenReturn( 8L );
        when( mockedMemory.getHeapMemoryUsage() ).thenReturn( heapMemory );
        neoBootstrapper.setMachineMemory( mockedMemory );

        assertThat( neoBootstrapper.start( dir, config ) ).isNotEqualTo( NeoBootstrapper.OK );
        assertThat( suppress.getOutputVoice().lines() )
                .anySatisfy( line -> assertThat( line ).containsSubsequence( "Invalid memory configuration - exceeds physical memory." ) );
    }

    @Test
    void shouldFailToStartIfRequestedHeapAndPageCacheMemoryExceedsTotal()
    {
        // given
        neoBootstrapper = new CommunityBootstrapper();
        Map<String,String> config = MapUtil.stringMap();
        config.put( BootloaderSettings.max_heap_size.name(), "10B" );
        config.put( GraphDatabaseSettings.pagecache_memory.name(), "10B" );

        // Mock heap usage and free memory.
        MachineMemory mockedMemory = mock( MachineMemory.class );
        MemoryUsage heapMemory = new MemoryUsage( 0, 1, 1, 10 );
        when( mockedMemory.getTotalPhysicalMemory() ).thenReturn( 18L );
        when( mockedMemory.getHeapMemoryUsage() ).thenReturn( heapMemory );
        neoBootstrapper.setMachineMemory( mockedMemory );

        assertThat( neoBootstrapper.start( dir, config ) ).isNotEqualTo( NeoBootstrapper.OK );
        assertThat( suppress.getOutputVoice().lines() )
                .anySatisfy( line -> assertThat( line ).containsSubsequence( "Invalid memory configuration - exceeds physical memory." ) );
    }

    @Test
    void shouldFailToStartIfCalculatedPageCacheSizeExceedsTotalMemory()
    {
        // given
        neoBootstrapper = new CommunityBootstrapper();
        Map<String,String> config = MapUtil.stringMap();
        config.put( BootloaderSettings.max_heap_size.name(), "10B" );

        // Mock heap usage and free memory.
        MachineMemory mockedMemory = mock( MachineMemory.class );
        MemoryUsage heapMemory = new MemoryUsage( 0, 1, 1, 10 );
        when( mockedMemory.getTotalPhysicalMemory() ).thenReturn( 1000L );
        when( mockedMemory.getHeapMemoryUsage() ).thenReturn( heapMemory );
        neoBootstrapper.setMachineMemory( mockedMemory );

        assertThat( neoBootstrapper.start( dir, config ) ).isNotEqualTo( NeoBootstrapper.OK );
        assertThat( suppress.getOutputVoice().lines() )
                .anySatisfy( line -> assertThat( line ).containsSubsequence( "Invalid memory configuration - exceeds physical memory." ) );
    }

    @Test
    void ignoreMemoryChecksIfTotalMemoryIsNotAvailable()
    {
        // given
        neoBootstrapper = new CommunityBootstrapper();
        Map<String,String> config = MapUtil.stringMap();

        // Mock heap usage and free memory.
        MachineMemory mockedMemory = mock( MachineMemory.class );
        MemoryUsage heapMemory = new MemoryUsage( 0, 1, 1, 10 );
        when( mockedMemory.getTotalPhysicalMemory() ).thenReturn( 0L );
        when( mockedMemory.getHeapMemoryUsage() ).thenReturn( heapMemory );
        neoBootstrapper.setMachineMemory( mockedMemory );

        assertThat( neoBootstrapper.start( dir, config ) ).isEqualTo( NeoBootstrapper.OK );
        assertThat( suppress.getOutputVoice().containsMessage( "Unable to determine total physical memory of machine." ) ).isTrue();
    }
}
