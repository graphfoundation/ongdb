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

import org.apache.commons.lang3.mutable.MutableLong;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.neo4j.index.internal.gbptree.Seeker;
import org.neo4j.index.internal.gbptree.SimpleLongLayout;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.index.internal.gbptree.SimpleLongLayout.longLayout;

@ExtendWith( RandomExtension.class )
class CombinedPartSeekerTest
{
    private static final Comparator<Pair<MutableLong,MutableLong>> HIT_COMPARATOR = Comparator.comparing( Pair::getKey );

    @Inject
    RandomSupport random;

    @Test
    void shouldCombineAllParts() throws IOException
    {
        // given
        SimpleLongLayout layout = longLayout().withFixedSize( true ).build();
        List<Seeker<MutableLong,MutableLong>> parts = new ArrayList<>();
        int partCount = random.nextInt( 1, 20 );
        List<Pair<MutableLong,MutableLong>> expectedAllData = new ArrayList<>();
        int maxKey = random.nextInt( 100, 10_000 );
        for ( int i = 0; i < partCount; i++ )
        {
            int dataSize = random.nextInt( 0, 100 );
            List<Pair<MutableLong,MutableLong>> partData = new ArrayList<>( dataSize );
            for ( int j = 0; j < dataSize; j++ )
            {
                long key = random.nextLong( maxKey );
                partData.add( Pair.of( new MutableLong( key ), new MutableLong( key * 2 ) ) );
            }
            partData.sort( HIT_COMPARATOR );
            parts.add( new SimpleSeeker( partData ) );
            expectedAllData.addAll( partData );
        }
        expectedAllData.sort( HIT_COMPARATOR );

        // when
        CombinedPartSeeker<MutableLong,MutableLong> combinedSeeker = new CombinedPartSeeker<>( layout, parts );

        // then
        for ( Pair<MutableLong,MutableLong> expectedHit : expectedAllData )
        {
            assertTrue( combinedSeeker.next() );

            assertEquals( expectedHit.getKey().longValue(), combinedSeeker.key().longValue() );
            assertEquals( expectedHit.getValue().longValue(), combinedSeeker.value().longValue() );
        }
        assertFalse( combinedSeeker.next() );
        // And just ensure it will return false again after that
        assertFalse( combinedSeeker.next() );
    }

    private static class SimpleSeeker implements Seeker<MutableLong,MutableLong>
    {
        private final Iterator<Pair<MutableLong,MutableLong>> data;
        private Pair<MutableLong,MutableLong> current;

        private SimpleSeeker( Iterable<Pair<MutableLong,MutableLong>> data )
        {
            this.data = data.iterator();
        }

        @Override
        public boolean next()
        {
            if ( data.hasNext() )
            {
                current = data.next();
                return true;
            }
            return false;
        }

        @Override
        public void close()
        {
            // Nothing to close
        }

        @Override
        public MutableLong key()
        {
            return current.getKey();
        }

        @Override
        public MutableLong value()
        {
            return current.getValue();
        }
    }
}
