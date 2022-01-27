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
package org.neo4j.index.internal.gbptree;

import org.apache.commons.lang3.mutable.MutableLong;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.RandomSupport;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.index.internal.gbptree.GBPTreeTestUtil.contains;
import static org.neo4j.index.internal.gbptree.KeySearch.search;
import static org.neo4j.index.internal.gbptree.SimpleLongLayout.longLayout;
import static org.neo4j.index.internal.gbptree.TreeNode.Overflow.NO;
import static org.neo4j.index.internal.gbptree.TreeNode.Type.INTERNAL;
import static org.neo4j.index.internal.gbptree.TreeNode.Type.LEAF;
import static org.neo4j.io.pagecache.ByteArrayPageCursor.wrap;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;

@ExtendWith( RandomExtension.class )
class KeySearchTest
{
    private static final int STABLE_GENERATION = 1;
    private static final int UNSTABLE_GENERATION = 2;

    private static final int KEY_COUNT = 10;
    private static final int PAGE_SIZE = 512;
    private final PageCursor cursor = wrap( new byte[PAGE_SIZE], 0, PAGE_SIZE );
    private final Layout<MutableLong,MutableLong> layout = longLayout().build();
    private final TreeNode<MutableLong,MutableLong> node = new TreeNodeFixedSize<>( PAGE_SIZE, layout );
    private final MutableLong readKey = layout.newKey();
    private final MutableLong searchKey = layout.newKey();
    private final MutableLong insertKey = layout.newKey();
    private final MutableLong dummyValue = layout.newValue();

    @Inject
    private RandomSupport random;

    @Test
    void searchEmptyLeaf()
    {
        // given
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        int keyCount = TreeNode.keyCount( cursor );

        // then
        int result = search( cursor, node, LEAF, searchKey, readKey, keyCount, NULL );
        assertSearchResult( false, 0, result );
    }

    @Test
    void searchEmptyInternal()
    {
        // given
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        int keyCount = TreeNode.keyCount( cursor );

        // then
        final int result = search( cursor, node, INTERNAL, searchKey, readKey, keyCount, NULL );
        assertSearchResult( false, 0, result );
    }

    @Test
    void searchNoHitLessThanWithOneKeyInLeaf() throws IOException
    {
        // given
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        appendKey( 1L );

        // then
        int result = searchKey( 0L );
        assertSearchResult( false, 0, result );
    }

    @Test
    void searchNoHitLessThanWithOneKeyInInternal() throws IOException
    {
        // given
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        appendKey( 1L );

        // then
        int result = searchKey( 0L );
        assertSearchResult( false, 0, result );
    }

    @Test
    void searchHitWithOneKeyInLeaf() throws IOException
    {
        // given
        long key = 1L;
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        appendKey( key );

        // then
        int result = searchKey( key );
        assertSearchResult( true, 0, result );
    }

    @Test
    void searchHitWithOneKeyInInternal() throws IOException
    {
        // given
        long key = 1L;
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        appendKey( key );

        // then
        int result = searchKey( key );
        assertSearchResult( true, 0, result );
    }

    @Test
    void searchNoHitGreaterThanWithOneKeyInLeaf() throws IOException
    {
        // given
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        appendKey( 1L );

        // then
        int result = searchKey( 2L );
        assertSearchResult( false, 1, result );
    }

    @Test
    void searchNoHitGreaterThanWithOneKeyInInternal() throws IOException
    {
        // given
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        appendKey( 1L );

        // then
        int result = searchKey( 2L );
        assertSearchResult( false, 1, result );
    }

    @Test
    void searchNoHitGreaterThanWithFullLeaf() throws IOException
    {
        // given
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i );
        }

        // then
        int result = searchKey( KEY_COUNT );
        assertSearchResult( false, KEY_COUNT, result );
    }

    @Test
    void searchNoHitGreaterThanWithFullInternal() throws IOException
    {
        // given
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i );
        }

        // then
        int result = searchKey( KEY_COUNT );
        assertSearchResult( false, KEY_COUNT, result );
    }

    @Test
    void searchHitOnLastWithFullLeaf() throws IOException
    {
        // given
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i );
        }

        // then
        int result = searchKey( KEY_COUNT - 1 );
        assertSearchResult( true, KEY_COUNT - 1, result );
    }

    @Test
    void searchHitOnLastWithFullInternal() throws IOException
    {
        // given
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i );
        }

        // then
        int result = searchKey( KEY_COUNT - 1 );
        assertSearchResult( true, KEY_COUNT - 1, result );
    }

    @Test
    void searchHitOnFirstWithFullLeaf() throws IOException
    {
        // given
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i );
        }

        // then
        int result = searchKey( 0 );
        assertSearchResult( true, 0, result );
    }

    @Test
    void searchHitOnFirstWithFullInternal() throws IOException
    {
        // given
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i );
        }

        // then
        int result = searchKey( 0 );
        assertSearchResult( true, 0, result );
    }

    @Test
    void searchNoHitLessThanWithFullLeaf() throws IOException
    {
        // given
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i + 1 );
        }

        // then
        int result = searchKey( 0 );
        assertSearchResult( false, 0, result );
    }

    @Test
    void searchNoHitLessThanWithFullInternal() throws IOException
    {
        // given
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i + 1 );
        }

        // then
        int result = searchKey( 0 );
        assertSearchResult( false, 0, result );
    }

    @Test
    void searchHitOnMiddleWithFullLeaf() throws IOException
    {
        // given
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i );
        }

        // then
        int middle = KEY_COUNT / 2;
        int result = searchKey( middle );
        assertSearchResult( true, middle, result );
    }

    @Test
    void searchHitOnMiddleWithFullInternal() throws IOException
    {
        // given
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i );
        }

        // then
        int middle = KEY_COUNT / 2;
        int result = searchKey( middle );
        assertSearchResult( true, middle, result );
    }

    @Test
    void searchNoHitInMiddleWithFullLeaf() throws IOException
    {
        // given
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i * 2 );
        }

        // then
        int middle = KEY_COUNT / 2;
        int result = searchKey( (middle * 2) - 1 );
        assertSearchResult( false, middle, result );
    }

    @Test
    void searchNoHitInMiddleWithFullInternal() throws IOException
    {
        // given
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            appendKey( i * 2 );
        }

        // then
        int middle = KEY_COUNT / 2;
        int result = searchKey( (middle * 2) - 1 );
        assertSearchResult( false, middle, result );
    }

    @Test
    void searchHitOnFirstNonUniqueKeysLeaf() throws IOException
    {
        // given
        long first = 1L;
        long second = 2L;
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            long key = i < KEY_COUNT / 2 ? first : second;
            appendKey( key );
        }

        // then
        int result = searchKey( first );
        assertSearchResult( true, 0, result );
    }

    @Test
    void searchHitOnFirstNonUniqueKeysInternal() throws IOException
    {
        // given
        long first = 1L;
        long second = 2L;
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            long key = i < KEY_COUNT / 2 ? first : second;
            appendKey( key );
        }

        // then
        int result = searchKey( first );
        assertSearchResult( true, 0, result );
    }

    @Test
    void searchHitOnMiddleNonUniqueKeysLeaf() throws IOException
    {
        // given
        long first = 1L;
        long second = 2L;
        int middle = KEY_COUNT / 2;
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            long key = i < middle ? first : second;
            appendKey( key );
        }

        // then
        int result = searchKey( second );
        assertSearchResult( true, middle, result );
    }

    @Test
    void searchHitOnMiddleNonUniqueKeysInternal() throws IOException
    {
        // given
        long first = 1L;
        long second = 2L;
        int middle = KEY_COUNT / 2;
        node.initializeInternal( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            long key = i < middle ? first : second;
            appendKey( key );
        }

        // then
        int result = searchKey( second );
        assertSearchResult( true, middle, result );
    }

    /* Below are more thorough tests that look at all keys in node */

    @Test
    void shouldFindExistingKey() throws IOException
    {
        // GIVEN
        fullLeafWithUniqueKeys();

        // WHEN
        MutableLong key = layout.newKey();
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            key.setValue( key( i ) );
            int result = search( cursor, node, LEAF, key, readKey, KEY_COUNT, NULL );

            // THEN
            assertSearchResult( true, i, result );
        }
    }

    @Test
    void shouldReturnCorrectIndexesForKeysInBetweenExisting() throws IOException
    {
        // GIVEN
        fullLeafWithUniqueKeys();

        // WHEN
        MutableLong key = layout.newKey();
        for ( int i = 1; i < KEY_COUNT - 1; i++ )
        {
            key.setValue( key( i ) - 1 );
            int result = search( cursor, node, LEAF, key, readKey, KEY_COUNT, NULL );

            // THEN
            assertSearchResult( false, i, result );
        }
    }

    @Test
    void shouldSearchAndFindOnRandomData() throws IOException
    {
        // GIVEN a leaf node with random, although sorted (as of course it must be to binary-search), data
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        List<MutableLong> keys = new ArrayList<>();
        int currentKey = random.nextInt( 10_000 );
        MutableLong key = layout.newKey();

        int keyCount = 0;
        while ( true )
        {
            MutableLong expectedKey = layout.newKey();
            key.setValue( currentKey );
            if ( node.leafOverflow( cursor, keyCount, key, dummyValue ) != NO )
            {
                break;
            }
            layout.copyKey( key, expectedKey );
            keys.add( keyCount, expectedKey );
            node.insertKeyValueAt( cursor, key, dummyValue, keyCount, keyCount, STABLE_GENERATION, UNSTABLE_GENERATION, NULL );
            currentKey += random.nextInt( 100 ) + 10;
            keyCount++;
        }
        TreeNode.setKeyCount( cursor, keyCount );

        // WHEN searching for random keys within that general range
        MutableLong searchKey = layout.newKey();
        for ( int i = 0; i < 1_000; i++ )
        {
            searchKey.setValue( random.nextInt( currentKey + 10 ) );
            int searchResult = search( cursor, node, LEAF, searchKey, readKey, keyCount, NULL );

            // THEN position should be as expected
            boolean exists = contains( keys, searchKey, layout );
            int position = KeySearch.positionOf( searchResult );
            assertEquals( exists, KeySearch.isHit( searchResult ) );
            if ( layout.compare( searchKey, keys.get( 0 ) ) <= 0 )
            {   // Our search key was lower than any of our keys, expect 0
                assertEquals( 0, position );
            }
            else
            {   // step backwards through our expected keys and see where it should fit, assert that fact
                boolean found = false;
                for ( int j = keyCount - 1; j >= 0; j-- )
                {
                    if ( layout.compare( searchKey, keys.get( j ) ) > 0 )
                    {
                        assertEquals( j + 1, position );
                        found = true;
                        break;
                    }
                }

                assertTrue( found );
            }
        }
    }

    /* Helper */

    private int searchKey( long key )
    {
        int keyCount = TreeNode.keyCount( cursor );
        TreeNode.Type type = TreeNode.isInternal( cursor ) ? INTERNAL : LEAF;
        searchKey.setValue( key );
        return search( cursor, node, type, searchKey, readKey, keyCount, NULL );
    }

    private void appendKey( long key ) throws IOException
    {
        insertKey.setValue( key );
        int keyCount = TreeNode.keyCount( cursor );
        if ( TreeNode.isInternal( cursor ) )
        {
            long dummyChild = 10;
            node.insertKeyAndRightChildAt( cursor, insertKey, dummyChild, keyCount, keyCount, STABLE_GENERATION, UNSTABLE_GENERATION, NULL );
        }
        else
        {
            node.insertKeyValueAt( cursor, insertKey, dummyValue, keyCount, keyCount, STABLE_GENERATION, UNSTABLE_GENERATION, NULL );
        }
        TreeNode.setKeyCount( cursor, keyCount + 1 );
    }

    private static void assertSearchResult( boolean hit, int position, int searchResult )
    {
        assertEquals( hit, KeySearch.isHit( searchResult ) );
        assertEquals( position, KeySearch.positionOf( searchResult ) );
    }

    private void fullLeafWithUniqueKeys() throws IOException
    {
        // [2,4,8,16,32,64,128,512,1024,2048]
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );
        MutableLong key = layout.newKey();
        for ( int i = 0; i < KEY_COUNT; i++ )
        {
            key.setValue( key( i ) );
            node.insertKeyValueAt( cursor, key, dummyValue, i, i, STABLE_GENERATION, UNSTABLE_GENERATION, NULL );
        }
        TreeNode.setKeyCount( cursor, KEY_COUNT );
    }

    private static int key( int i )
    {
        return 2 << i;
    }
}
