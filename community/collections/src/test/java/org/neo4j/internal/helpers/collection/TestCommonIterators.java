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
package org.neo4j.internal.helpers.collection;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.stream.Stream;

import org.neo4j.graphdb.Resource;
import org.neo4j.graphdb.ResourceIterable;
import org.neo4j.graphdb.ResourceIterator;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class TestCommonIterators
{
    @Test
    void testFirstElement()
    {
        Object object = new Object();
        Object object2 = new Object();
        Object defaultValue = new Object();

        // first Iterable
        assertEquals( object, Iterables.first( asList( object, object2 ) ) );
        assertEquals( object, Iterables.first( singletonList( object ) ) );
        assertThrows( NoSuchElementException.class, () -> Iterables.first( Collections.emptyList() ) );

        // first Iterator
        assertEquals( object, Iterators.first( asList( object, object2 ).iterator() ) );
        assertEquals( object, Iterators.first( singletonList( object ).iterator() ) );
        assertThrows( NoSuchElementException.class, () -> Iterators.first( Collections.emptyIterator() ) );

        // firstOrNull Iterable
        assertEquals( object, Iterables.firstOrNull( asList( object, object2 ) ) );
        assertEquals( object, Iterables.firstOrNull( singletonList( object ) ) );
        assertNull( Iterables.firstOrNull( Collections.emptyList() ) );

        // firstOrNull Iterator
        assertEquals( object, Iterators.firstOrNull( asList( object, object2 ).iterator() ) );
        assertEquals( object, Iterators.firstOrNull( singletonList( object ).iterator() ) );
        assertNull( Iterators.firstOrNull( Collections.emptyIterator() ) );

        // firstOrDefault
        assertEquals( object, Iterators.firstOrDefault( asList( object, object2 ).iterator(), defaultValue ) );
        assertEquals( object, Iterators.firstOrDefault( singletonList( object ).iterator(), defaultValue ) );
        assertEquals( defaultValue, Iterators.firstOrDefault( Collections.emptyIterator(), defaultValue ) );
    }

    @Test
    void testLastElement()
    {
        Object object = new Object();
        Object object2 = new Object();

        // last Iterable
        assertEquals( object2, Iterables.last( asList( object, object2 ) ) );
        assertEquals( object, Iterables.last( singletonList( object ) ) );
        assertThrows( NoSuchElementException.class, () -> Iterables.last( Collections.emptyList() ) );

        // last Iterator
        assertEquals( object2, Iterators.last( asList( object, object2 ).iterator() ) );
        assertEquals( object, Iterators.last( singletonList( object ).iterator() ) );
        assertThrows( NoSuchElementException.class, () -> Iterators.last( Collections.emptyIterator() ) );

        // lastOrNull Iterator
        assertEquals( object2, Iterators.lastOrNull( asList( object, object2 ).iterator() ) );
        assertEquals( object, Iterators.lastOrNull( singletonList( object ).iterator() ) );
        assertNull( Iterators.lastOrNull( Collections.emptyIterator() ) );
    }

    @Test
    void testSingleElement()
    {
        Object object = new Object();
        Object object2 = new Object();

        // single Iterable
        assertEquals( object, Iterables.single( singletonList( object ) ) );
        assertThrows( NoSuchElementException.class, () ->  Iterables.single( Collections.emptyList() ) );
        assertThrows( NoSuchElementException.class, () -> Iterables.single( asList( object, object2 ) ) );

        // single Iterator
        assertEquals( object, Iterators.single( singletonList( object ).iterator() ) );
        assertThrows( NoSuchElementException.class, () -> Iterators.single( Collections.emptyIterator() ) );
        assertThrows( NoSuchElementException.class, () -> Iterators.single( asList( object, object2 ).iterator() ) );

        // singleOrNull Iterable
        assertEquals( object, Iterables.singleOrNull( singletonList( object ) ) );
        assertNull( Iterables.singleOrNull( Collections.emptyList() ) );
        assertThrows( NoSuchElementException.class, () -> Iterables.singleOrNull( asList( object, object2 ) ) );

        // singleOrNull Iterator
        assertEquals( object, Iterators.singleOrNull( singletonList( object ).iterator() ) );
        assertNull( Iterators.singleOrNull( Collections.emptyIterator() ) );
        assertThrows( NoSuchElementException.class, () -> Iterators.singleOrNull( asList( object, object2 ).iterator() ) );
    }

    @Test
    void getItemFromEnd()
    {
        Iterable<Integer> ints = asList( 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 );
        assertEquals( (Integer) 9, Iterators.fromEnd( ints.iterator(), 0 ) );
        assertEquals( (Integer) 8, Iterators.fromEnd( ints.iterator(), 1 ) );
        assertEquals( (Integer) 7, Iterators.fromEnd( ints.iterator(), 2 ) );
    }

    @Test
    void iteratorsStreamForNull()
    {
        assertThrows( NullPointerException.class, () -> Iterators.stream( null ) );
    }

    @Test
    void iteratorsStream()
    {
        List<Object> list = asList( 1, 2, "3", '4', null, "abc", "56789" );

        Iterator<Object> iterator = list.iterator();

        assertEquals( list, Iterators.stream( iterator ).collect( toList() ) );
    }

    @Test
    void iteratorsStreamClosesResourceIterator()
    {
        List<Object> list = asList( "a", "b", "c", "def" );

        Resource resource = mock( Resource.class );
        ResourceIterator<Object> iterator = Iterators.resourceIterator( list.iterator(), resource );

        try ( Stream<Object> stream = Iterators.stream( iterator ) )
        {
            assertEquals( list, stream.collect( toList() ) );
        }
        verify( resource ).close();
    }

    @Test
    void iteratorsStreamCharacteristics()
    {
        Iterator<Integer> iterator = asList( 1, 2, 3 ).iterator();
        int characteristics = Spliterator.DISTINCT | Spliterator.ORDERED | Spliterator.SORTED;

        Stream<Integer> stream = Iterators.stream( iterator, characteristics );

        assertEquals( characteristics, stream.spliterator().characteristics() );
    }

    @Test
    void iterablesStreamForNull()
    {
        assertThrows( NullPointerException.class, () -> Iterables.stream( null ) );
    }

    @Test
    void iterablesStream()
    {
        List<Object> list = asList( 1, 2, "3", '4', null, "abc", "56789" );

        assertEquals( list, Iterables.stream( list ).collect( toList() ) );
    }

    @Test
    void iterablesStreamClosesResourceIterator()
    {
        List<Object> list = asList( "a", "b", "c", "def" );

        Resource resource = mock( Resource.class );
        ResourceIterable<Object> iterable = () -> Iterators.resourceIterator( list.iterator(), resource );

        try ( Stream<Object> stream = Iterables.stream( iterable ) )
        {
            assertEquals( list, stream.collect( toList() ) );
        }
        verify( resource ).close();
    }

    @Test
    void iterablesStreamCharacteristics()
    {
        Iterable<Integer> iterable = asList( 1, 2, 3 );
        int characteristics = Spliterator.DISTINCT | Spliterator.ORDERED | Spliterator.NONNULL;

        Stream<Integer> stream = Iterables.stream( iterable, characteristics );

        assertEquals( characteristics, stream.spliterator().characteristics() );
    }

    @Test
    void iteratorsToString()
    {
        assertEquals( "[a, b, c]", Iterators.toString( Iterators.iterator( "a", "b", "c" ), Object::toString, 5 ) );
        assertEquals( "[a, b, ...]", Iterators.toString( Iterators.iterator( "a", "b", "c" ), Object::toString, 2 ) );
    }
}
