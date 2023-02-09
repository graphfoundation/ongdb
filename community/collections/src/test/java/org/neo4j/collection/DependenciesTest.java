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
package org.neo4j.collection;

import org.junit.jupiter.api.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.neo4j.exceptions.UnsatisfiedDependencyException;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DependenciesTest
{
    @Test
    void givenSatisfiedTypeWhenResolveWithTypeThenInstanceReturned()
    {
        // Given
        Dependencies dependencies = new Dependencies();

        String foo = "foo";
        dependencies.satisfyDependency( foo );

        // When
        String instance = dependencies.resolveDependency( String.class );

        // Then
        assertThat( instance ).isEqualTo( foo );
    }

    @Test
    void givenSatisfiedTypeWhenResolveWithSuperTypeThenInstanceReturned()
    {
        // Given
        Dependencies dependencies = new Dependencies();

        AbstractList foo = new ArrayList();
        dependencies.satisfyDependency( foo );

        // When
        AbstractList instance = dependencies.resolveDependency( AbstractList.class );

        // Then
        assertThat( instance ).isEqualTo( foo );
    }

    @Test
    void givenSatisfiedTypeWhenResolveWithInterfaceThenInstanceReturned()
    {
        // Given
        Dependencies dependencies = new Dependencies();

        List foo = new ArrayList();
        dependencies.satisfyDependency( foo );

        // When
        List instance = dependencies.resolveDependency( List.class );

        // Then
        assertThat( instance ).isEqualTo( foo );
    }

    @Test
    void givenSatisfiedTypeWhenResolveWithSubInterfaceThenInstanceReturned()
    {
        // Given
        Dependencies dependencies = new Dependencies();

        Collection foo = new ArrayList();
        dependencies.satisfyDependency( foo );

        // When
        Collection instance = dependencies.resolveDependency( Collection.class );

        // Then
        assertThat( instance ).isEqualTo( foo );
    }

    @Test
    void givenSatisfiedTypeInParentWhenResolveWithTypeInEmptyDependenciesThenInstanceReturned()
    {
        // Given
        Dependencies parent = new Dependencies();
        Dependencies dependencies = new Dependencies( parent );

        Collection foo = new ArrayList();
        dependencies.satisfyDependency( foo );

        // When
        Collection instance = dependencies.resolveDependency( Collection.class );

        // Then
        assertThat( instance ).isEqualTo( foo );
    }

    @Test
    void givenSatisfiedTypeInParentAndDependenciesWhenResolveWithTypeInDependenciesThenInstanceReturned()
    {
        // Given
        Dependencies parent = new Dependencies();
        Dependencies dependencies = new Dependencies( parent );

        Collection foo = new ArrayList();
        dependencies.satisfyDependency( foo );
        parent.satisfyDependency( new ArrayList() );

        // When
        Collection instance = dependencies.resolveDependency( Collection.class );

        // Then
        assertThat( instance ).isEqualTo( foo );
    }

    @Test
    void givenEmptyDependenciesWhenResolveWithTypeThenException()
    {
        Dependencies dependencies = new Dependencies();

        assertThrows( UnsatisfiedDependencyException.class, () -> dependencies.resolveDependency( Collection.class ) );
    }

    @Test
    void failSelectFromMultipleAvailableOptions()
    {
        Dependencies dependencies = new Dependencies();

        List foo = new ArrayList();
        List bar = singletonList( "a" );
        dependencies.satisfyDependency( foo );
        dependencies.satisfyDependency( bar );

        assertThrows( IllegalArgumentException.class, () -> dependencies.resolveDependency( List.class ) );
    }
}
