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
package org.neo4j.test.ports;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.test.ports.PortConstants.EPHEMERAL_PORT_MINIMUM;

class PortRepositoryIT
{
    @Test
    void shouldReservePorts() throws Exception
    {
        PortRepository portRepository1 = new PortRepository( temporaryDirectory(), EPHEMERAL_PORT_MINIMUM );

        int port1 = portRepository1.reserveNextPort( "foo" );
        int port2 = portRepository1.reserveNextPort( "foo" );
        int port3 = portRepository1.reserveNextPort( "foo" );

        assertThat( new HashSet<>( asList( port1, port2, port3 ) ).size() ).isEqualTo( 3 );
    }

    @Test
    void shouldCoordinateUsingFileSystem() throws Exception
    {
        Path temporaryDirectory = temporaryDirectory();
        PortRepository portRepository1 = new PortRepository( temporaryDirectory, EPHEMERAL_PORT_MINIMUM );
        PortRepository portRepository2 = new PortRepository( temporaryDirectory, EPHEMERAL_PORT_MINIMUM );

        int port1 = portRepository1.reserveNextPort( "foo" );
        int port2 = portRepository1.reserveNextPort( "foo" );
        int port3 = portRepository1.reserveNextPort( "foo" );
        int port4 = portRepository2.reserveNextPort( "foo" );
        int port5 = portRepository2.reserveNextPort( "foo" );
        int port6 = portRepository1.reserveNextPort( "foo" );

        assertThat( new HashSet<>( asList( port1, port2, port3, port4, port5, port6 ) ).size() ).isEqualTo( 6 );
    }

    @Test
    void shouldNotOverrun() throws Exception
    {
        PortRepository portRepository1 = new PortRepository( temporaryDirectory(), 65534 );

        portRepository1.reserveNextPort( "foo" );
        portRepository1.reserveNextPort( "foo" );

        IllegalStateException exception = assertThrows( IllegalStateException.class, () -> portRepository1.reserveNextPort( "foo" ) );
        assertThat( exception.getMessage() ).isEqualTo( "There are no more ports available" );
    }

    private static Path temporaryDirectory() throws IOException
    {
        return Files.createTempDirectory( "portRepo" );
    }
}
