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
package org.neo4j.storageengine.api;

import java.util.Arrays;

import org.neo4j.token.api.TokenConstants;
import org.neo4j.util.Preconditions;

import static org.neo4j.token.api.TokenConstants.ANY_PROPERTY_KEY;

/**
 * Specifies criteria for which properties to select.
 */
public abstract class PropertySelection
{
    private final boolean keysOnly;

    protected PropertySelection( boolean keysOnly )
    {
        this.keysOnly = keysOnly;
    }

    /**
     * @return {@code true} if this selection limits which keys will be selected, otherwise {@code false} if all will be selected.
     */
    public abstract boolean isLimited();

    /**
     * @return the number of keys in this selection. {@link #ALL_PROPERTIES} returns {@code 1} and with the key {@link TokenConstants#ANY_PROPERTY_KEY}
     * from a call to {@code key(0)}.
     */
    public abstract int numberOfKeys();

    /**
     * @param index the selection index. A selection can have multiple keys.
     * @return the key for the given selection index.
     */
    public abstract int key( int index );

    /**
     * @param key the key to tests whether or not it fits the criteria of this selection.
     * @return {@code true} if the given {@code key} is part of this selection, otherwise {@code false}.
     */
    public abstract boolean test( int key );

    /**
     * A hint that the creator of this selection isn't interested in the actual values, only the existence of the keys.
     * @return {@code true} if only keys will be extracted where this selection is used, otherwise {@code false} if also values will be extracted.
     */
    public boolean isKeysOnly()
    {
        return keysOnly;
    }

    @Override
    public String toString()
    {
        return String.format( "Property%sSelection", keysOnly ? "Key" : "" );
    }

    /**
     * Creates a {@link PropertySelection} with its criteria based on the given {@code keys}.
     *
     * @param keys one or more keys that should be part of the created selection.
     * @return a {@link PropertySelection} instance with the given {@code keys} as its criteria.
     */
    public static PropertySelection selection( int... keys )
    {
        return selection( false, keys );
    }

    /**
     * Creates a {@link PropertySelection} with its criteria based on the given {@code keys}.
     * This selection will hint that only the keys are interesting, not the values.
     *
     * @param keys one or more keys that should be part of the created selection.
     * @return a {@link PropertySelection} instance with the given {@code keys} as its criteria.
     */
    public static PropertySelection onlyKeysSelection( int... keys )
    {
        return selection( true, keys );
    }

    private static PropertySelection selection( boolean keysOnly, int[] keys )
    {
        if ( keys == null )
        {
            return keysOnly ? ALL_PROPERTY_KEYS : ALL_PROPERTIES;
        }
        Preconditions.checkState( keys.length > 0, "Can't make a property selection of zero keys" );
        return keys.length == 1 ? new SingleKey( keysOnly, keys[0] ) : new MultipleKeys( keysOnly, keys );
    }

    private static class SingleKey extends PropertySelection
    {
        private final int key;

        private SingleKey( boolean keysOnly, int key )
        {
            super( keysOnly );
            this.key = key;
        }

        @Override
        public boolean isLimited()
        {
            return true;
        }

        @Override
        public int numberOfKeys()
        {
            return 1;
        }

        @Override
        public int key( int index )
        {
            assert index == 0;
            return key;
        }

        @Override
        public boolean test( int key )
        {
            return this.key == key;
        }

        @Override
        public String toString()
        {
            return super.toString() + "[" + key + "]";
        }
    }

    private static class MultipleKeys extends PropertySelection
    {
        private final int[] keys;

        private MultipleKeys( boolean keysOnly, int[] keys )
        {
            super( keysOnly );
            this.keys = keys;
        }

        @Override
        public boolean isLimited()
        {
            return true;
        }

        @Override
        public int numberOfKeys()
        {
            return keys.length;
        }

        @Override
        public int key( int index )
        {
            assert index >= 0 && index < keys.length;
            return keys[index];
        }

        @Override
        public boolean test( int key )
        {
            for ( int k : keys )
            {
                if ( k == key )
                {
                    return true;
                }
            }
            return false;
        }

        @Override
        public String toString()
        {
            return super.toString() + "[" + Arrays.toString( keys ) + "]";
        }
    }

    public static final PropertySelection ALL_PROPERTIES = allProperties( false );
    public static final PropertySelection ALL_PROPERTY_KEYS = allProperties( true );

    private static PropertySelection allProperties( boolean keysOnly )
    {
        return new PropertySelection( keysOnly )
        {
            @Override
            public boolean isLimited()
            {
                return false;
            }

            @Override
            public int numberOfKeys()
            {
                return 1;
            }

            @Override
            public int key( int index )
            {
                return ANY_PROPERTY_KEY;
            }

            @Override
            public boolean test( int key )
            {
                return true;
            }

            @Override
            public String toString()
            {
                return super.toString() + "[*]";
            }
        };
    }
}
