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
package org.neo4j.kernel.impl.index.schema;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.neo4j.configuration.Config;
import org.neo4j.kernel.impl.index.schema.config.IndexSpecificSpaceFillingCurveSettings;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static java.util.Collections.unmodifiableList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.kernel.impl.index.schema.NativeIndexKey.Inclusion.NEUTRAL;

class RawBitsTest
{
    private static final IndexSpecificSpaceFillingCurveSettings specificSettings = IndexSpecificSpaceFillingCurveSettings.fromConfig( Config.defaults() );
    public GenericLayout layout = new GenericLayout( 1, specificSettings );

    private final List<Object> objects = Arrays.asList(
            Double.NEGATIVE_INFINITY,
            -Double.MAX_VALUE,
            Long.MIN_VALUE,
            Long.MIN_VALUE + 1,
            Integer.MIN_VALUE,
            Short.MIN_VALUE,
            Byte.MIN_VALUE,
            0,
            Double.MIN_VALUE,
            Double.MIN_NORMAL,
            Float.MIN_VALUE,
            Float.MIN_NORMAL,
            1L,
            1.1d,
            1.2f,
            Math.E,
            Math.PI,
            (byte) 10,
            (short) 20,
            Byte.MAX_VALUE,
            Short.MAX_VALUE,
            Integer.MAX_VALUE,
            33554432,
            33554432F,
            33554433,
            33554433F,
            33554434,
            33554434F,
            9007199254740991L,
            9007199254740991D,
            9007199254740992L,
            9007199254740992D,
            9007199254740993L,
            9007199254740993D,
            9007199254740994L,
            9007199254740994D,
            Long.MAX_VALUE,
            Float.MAX_VALUE,
            Double.MAX_VALUE,
            Double.POSITIVE_INFINITY,
            Double.NaN,
            Math.nextDown( Math.E ),
            Math.nextUp( Math.E ),
            Math.nextDown( Math.PI ),
            Math.nextUp( Math.PI )
    );

    @Test
    void mustSortInSameOrderAsValueComparator()
    {
        // given
        List<Value> values = asValueObjects( objects );
        List<BtreeKey> numberIndexKeys = asNumberIndexKeys( values );
        Collections.shuffle( values );
        Collections.shuffle( numberIndexKeys );

        // when
        values.sort( Values.COMPARATOR );
        numberIndexKeys.sort( layout );
        List<Value> actual = asValues( numberIndexKeys );

        // then
        assertSameOrder( actual, values );
    }

    @Test
    void shouldCompareAllValuesToAllOtherValuesLikeValueComparator()
    {
        // given
        List<Value> values = asValueObjects( objects );
        List<BtreeKey> numberIndexKeys = asNumberIndexKeys( values );
        values.sort( Values.COMPARATOR );

        // when
        for ( BtreeKey genericKey : numberIndexKeys )
        {
            List<BtreeKey> withoutThisOne = new ArrayList<>( numberIndexKeys );
            assertTrue( withoutThisOne.remove( genericKey ) );
            withoutThisOne = unmodifiableList( withoutThisOne );
            for ( int i = 0; i < withoutThisOne.size(); i++ )
            {
                List<BtreeKey> withThisOneInWrongPlace = new ArrayList<>( withoutThisOne );
                withThisOneInWrongPlace.add( i, genericKey );
                withThisOneInWrongPlace.sort( layout );
                List<Value> actual = asValues( withThisOneInWrongPlace );

                // then
                assertSameOrder( actual, values );
            }
        }
    }

    @Test
    void shouldHaveSameCompareResultsAsValueCompare()
    {
        // given
        List<Value> values = asValueObjects( objects );
        List<BtreeKey> numberIndexKeys = asNumberIndexKeys( values );

        // when
        for ( int i = 0; i < values.size(); i++ )
        {
            Value value1 = values.get( i );
            BtreeKey numberIndexKey1 = numberIndexKeys.get( i );
            for ( int j = 0; j < values.size(); j++ )
            {
                // then
                Value value2 = values.get( j );
                BtreeKey numberIndexKey2 = numberIndexKeys.get( j );
                assertEquals( Values.COMPARATOR.compare( value1, value2 ),
                        layout.compare( numberIndexKey1, numberIndexKey2 ) );
                assertEquals( Values.COMPARATOR.compare( value2, value1 ),
                        layout.compare( numberIndexKey2, numberIndexKey1 ) );
            }
        }
    }

    private static List<Value> asValues( List<BtreeKey> numberIndexKeys )
    {
        return numberIndexKeys.stream()
                .map( k -> RawBits.asNumberValue( k.long0, (byte) k.long1 ) )
                .collect( Collectors.toList() );
    }

    private static void assertSameOrder( List<Value> actual, List<Value> values )
    {
        assertEquals( actual.size(), values.size() );
        for ( int i = 0; i < actual.size(); i++ )
        {
            Number actualAsNumber = (Number) actual.get( i ).asObject();
            Number valueAsNumber = (Number) values.get( i ).asObject();
            //noinspection StatementWithEmptyBody
            if ( Double.isNaN( actualAsNumber.doubleValue() ) && Double.isNaN( valueAsNumber.doubleValue() ) )
            {
                // Don't compare equals because NaN does not equal itself
            }
            else
            {
                assertEquals( actual.get( i ), values.get( i ) );
            }
        }
    }

    private static List<Value> asValueObjects( List<Object> objects )
    {
        List<Value> values = new ArrayList<>();
        for ( Object object : objects )
        {
            values.add( Values.of( object ) );
        }
        return values;
    }

    private List<BtreeKey> asNumberIndexKeys( List<Value> values )
    {
        List<BtreeKey> numberIndexKeys = new ArrayList<>();
        for ( Value value : values )
        {
            BtreeKey key = layout.newKey();
            key.initialize( 0 );
            key.initFromValue( 0, value, NEUTRAL );
            numberIndexKeys.add( key );
        }
        return numberIndexKeys;
    }
}
