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
package org.neo4j.internal.helpers;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.copyOf;

/**
 * Methods "missing" from {@link Arrays} are provided here.
 *
 */
public final class ArrayUtil
{
    public static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * Count missing items in an array.
     * The order of items doesn't matter.
     *
     * @param array Array to examine
     * @param contains Items to look for
     * @param <T> The type of the array items
     * @return how many of the items in {@code contains} are missing from {@code array}.
     */
    public static <T> int missing( T[] array, T[] contains )
    {
        int missing = 0;
        for ( T check : contains )
        {
            if ( !contains( array, check ) )
            {
                missing++;
            }
        }
        return missing;
    }

    /**
     * Count items from a different array contained in an array.
     * The order of items doesn't matter.
     *
     * @param array Array to examine
     * @param contains Items to look for
     * @param <T> The type of the array items
     * @return {@code true} if all items in {@code contains} exists in {@code array}, otherwise {@code false}.
     */
    public static <T> boolean containsAll( T[] array, T[] contains )
    {
        for ( T check : contains )
        {
            if ( !contains( array, check ) )
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if array contains item.
     *
     * @param array Array to examine
     * @param contains Single item to look for
     * @param <T> The type of the array items
     * @return {@code true} if {@code contains} exists in {@code array}, otherwise {@code false}.
     */
    public static <T> boolean contains( T[] array, T contains )
    {
        return contains( array, array.length, contains );
    }

    /**
     * Check if array contains item.
     *
     * @param array Array to examine
     * @param arrayLength Number of items to check, from the start of the array
     * @param contains Single item to look for
     * @param <T> The type of the array items
     * @return {@code true} if {@code contains} exists in {@code array}, otherwise {@code false}.
     */
    public static <T> boolean contains( T[] array, int arrayLength, T contains )
    {
        for ( int i = 0; i < arrayLength; i++ )
        {
            T item = array[i];
            if ( nullSafeEquals( item, contains ) )
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Compare two items for equality; if both are {@code null} they are regarded as equal.
     *
     * @param first First item to compare
     * @param other Other item to compare
     * @param <T> The type of the items
     * @return {@code true} if {@code first} and {@code other} are both {@code null} or are both equal.
     */
    public static <T> boolean nullSafeEquals( T first, T other )
    {
        return first == null ? first == other : first.equals( other );
    }

    /**
     * Get the union of two arrays.
     * The resulting array will not contain any duplicates.
     *
     * @param first First array
     * @param other Other array
     * @param <T> The type of the arrays
     * @return an array containing the union of {@code first} and {@code other}. Items occurring in
     * both {@code first} and {@code other} will only have of the two in the resulting union.
     */
    public static <T> T[] union( T[] first, T[] other )
    {
        if ( first == null || other == null )
        {
            return first == null ? other : first;
        }

        int missing = missing( first, other );
        if ( missing == 0 )
        {
            return first;
        }

        // An attempt to add the labels as efficiently as possible
        T[] union = copyOf( first, first.length + missing );
        int cursor = first.length;
        for ( T candidate : other )
        {
            if ( !contains( first, candidate ) )
            {
                union[cursor++] = candidate;
                missing--;
            }
        }
        assert missing == 0;
        return union;
    }

    /**
     * Create an array from a single first item and additional items following it.
     *
     * @param first the item to put first
     * @param additional the additional items to add to the array
     * @param <T> the type of the items
     * @return a concatenated array where {@code first} as the item at index {@code 0} and the additional
     * items following it.
     */
    @SafeVarargs
    public static <T> T[] concat( T first, T... additional )
    {
        @SuppressWarnings( "unchecked" )
        T[] result = (T[]) Array.newInstance( additional.getClass().getComponentType(), additional.length + 1 );
        result[0] = first;
        System.arraycopy( additional, 0, result, 1, additional.length );
        return result;
    }

    /**
     * Create a array from a existing array and additional items following it.
     *
     * @param initial the initial array
     * @param additional the additional items that would be added into the initial array
     * @param <T> the type of the array items
     * @return a concatenated array and the additional items following it.
     */
    @SafeVarargs
    public static <T> T[] concat( T[] initial, T... additional )
    {
        @SuppressWarnings( "unchecked" )
        T[] result = (T[]) Array.newInstance( additional.getClass().getComponentType(), initial.length + additional.length );
        System.arraycopy( initial, 0, result, 0, initial.length );
        System.arraycopy( additional, 0, result, initial.length, additional.length );
        return result;
    }

    /**
     * Create a single array from many arrays.
     *
     * @param initial an initial array
     * @param additional additional arrays to be concatenated with the initial array
     * @param <T> the type of the array items
     * @return the concatenated array
     */
    @SafeVarargs
    public static <T> T[] concatArrays( T[] initial, T[]... additional )
    {
        int length = initial.length;
        for ( T[] array : additional )
        {
            length += array.length;
        }
        T[] result = Arrays.copyOf( initial, length );
        int offset = initial.length;
        for ( T[] array : additional )
        {
            System.arraycopy( array, 0, result, offset, array.length );
            offset += array.length;
        }
        return result;
    }

    /**
     * Returns the array version of the vararg argument.
     *
     * @param varargs the items
     * @param <T> the type of the items
     * @return the array version of the vararg argument.
     */
    @SafeVarargs
    public static <T> T[] array( T... varargs )
    {
        return varargs;
    }

    public static <T> T lastOf( T[] array )
    {
        return array[array.length - 1];
    }

    public static <T> int indexOf( T[] array, T item )
    {
        for ( int i = 0; i < array.length; i++ )
        {
            if ( array[i].equals( item ) )
            {
                return i;
            }
        }
        return -1;
    }

    @SafeVarargs
    public static <T> T[] without( T[] source, T... toRemove )
    {
        T[] result = Arrays.copyOf( source, source.length );
        int length = result.length;
        for ( T candidate : toRemove )
        {
            int index = indexOf( result, candidate );
            if ( index != -1 )
            {
                if ( index + 1 < length )
                {   // not the last one
                    result[index] = result[length - 1];
                }
                length--;
            }
        }
        return length == result.length ? result : Arrays.copyOf( result, length );
    }

    public static <T> void reverse( T[] array )
    {
        for ( int low = 0, high = array.length - 1; high - low > 0; low++, high-- )
        {
            T lowItem = array[low];
            array[low] = array[high];
            array[high] = lowItem;
        }
    }

    public static <T> T single( T[] array )
    {
        if ( array.length == 0 )
        {
            throw new IllegalArgumentException( "Expected an array with one element, but the array was empty: " + array.getClass().getSimpleName() );
        }
        if ( array.length > 1 )
        {
            throw new IllegalArgumentException( "Expected an array with one element, but the array had " +
                    array.length + " elements: " + Arrays.toString( array ) );
        }
        return array[0];
    }

    private ArrayUtil()
    {   // No instances allowed
    }
}
