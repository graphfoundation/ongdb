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
package org.neo4j.capabilities;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.neo4j.exceptions.UnsatisfiedDependencyException;
import org.neo4j.logging.Log;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;

class CapabilityProviderDependenciesTest
{

    @Test
    void shouldRegisterAndGet()
    {
        var deps = new CapabilityProviderDependencies();
        var log = mock( Log.class );

        deps.register( Log.class, () -> log );
        assertThat( deps.get( Log.class ) ).isSameAs( log );
    }

    @Test
    void shouldNotRegisterTwice()
    {
        var deps = new CapabilityProviderDependencies();
        var log = mock( Log.class );

        assertThatCode( () -> deps.register( Log.class, () -> log ) ).doesNotThrowAnyException();
        assertThatCode( () -> deps.register( Log.class, () -> log ) ).isInstanceOf( UnsupportedOperationException.class );
    }

    @Test
    void shouldThrowIfNotRegistered()
    {
        var deps = new CapabilityProviderDependencies();
        assertThatCode( () -> deps.get( Log.class ) ).isInstanceOf( UnsatisfiedDependencyException.class );
    }
}
