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
package org.neo4j.internal.batchimport.cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongBitsManipulatorTest
{
    @Test
    void shouldManageTwoSlots()
    {
        // GIVEN
        LongBitsManipulator manipulator = new LongBitsManipulator( 64 - 29, 29 );
        long field = 0;

        // WHEN
        field = manipulator.set( field, 0, 10 );
        field = manipulator.set( field, 1, 13 );

        // THEN
        assertEquals( 10, manipulator.get( field, 0 ) );
        assertEquals( 13, manipulator.get( field, 1 ) );
    }

    @Test
    void shouldInterpretAllOnesAsMinusOne()
    {
        // GIVEN
        LongBitsManipulator manipulator = new LongBitsManipulator( 64 - 29, 29 );

        // WHEN
        long field = manipulator.template( true, false );

        // THEN
        assertEquals( -1, manipulator.get( field, 0 ) );
    }

    @Test
    void shouldHandleMinusOneValues()
    {
        // GIVEN
        LongBitsManipulator manipulator = new LongBitsManipulator( 1, 5, 10, 16, 32 ); // = 64 bits

        // WHEN/THEN
        long field = 0;
        for ( int i = 0; i < 5; i++ )
        {   // For every value, set all others to 0, the current to -1 and verify all
            for ( int j = 0; j < 5; j++ )
            {
                if ( j == i )
                {   // The current one
                    long valueAfterClearWouldHaveChangedIt = manipulator.clear( field, j, true );
                    field = manipulator.set( field, j, -1 );
                    // We piggy pack testing of clear(true) vs. set -1 here
                    assertEquals( field, valueAfterClearWouldHaveChangedIt,
                            "Clear(true) and set -1 produced different results for i:" + i + ", j:" + j );
                }
                else
                {   // The other ones
                    long valueAfterClearWouldHaveChangedIt = manipulator.clear( field, j, false );
                    field = manipulator.set( field, j, 0 );
                    // We piggy pack testing of clear(false) vs. set 0 here
                    assertEquals( field, valueAfterClearWouldHaveChangedIt,
                            "Clear(false) and set 0 produced different results for i:" + i + ", j:" + j );
                }
            }

            for ( int j = 0; j < 5; j++ )
            {
                long value = manipulator.get( field, j );
                if ( j == i )
                {   // The current one
                    assertEquals( -1L, value );
                }
                else
                {   // The other ones
                    assertEquals( 0L, value );
                }
            }
        }
    }
}
