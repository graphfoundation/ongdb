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
package org.neo4j.index.internal.gbptree;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.io.pagecache.PageCursor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;

public class TreeNodeDynamicSizeTest extends TreeNodeTestBase<RawBytes,RawBytes>
{
    private static final long STABLE_GENERATION = 3;
    private static final long UNSTABLE_GENERATION = 4;

    private final SimpleByteArrayLayout layout = new SimpleByteArrayLayout();

    @Override
    protected TestLayout<RawBytes,RawBytes> getLayout()
    {
        return layout;
    }

    @Override
    protected TreeNodeDynamicSize<RawBytes,RawBytes> getNode( int pageSize, Layout<RawBytes,RawBytes> layout,
            OffloadStore<RawBytes,RawBytes> offloadStore )
    {
        return new TreeNodeDynamicSize<>( pageSize, layout, offloadStore );
    }

    @Override
    void assertAdditionalHeader( PageCursor cursor, TreeNode<RawBytes,RawBytes> node, int pageSize )
    {
        // When
        int currentAllocSpace = ((TreeNodeDynamicSize<RawBytes,RawBytes>) node).getAllocOffset( cursor );

        // Then
        assertEquals( pageSize, currentAllocSpace, "allocSpace point to end of page" );
    }

    @Test
    void mustCompactKeyValueSizeHeader() throws IOException
    {
        int oneByteKeyMax = DynamicSizeUtil.MASK_ONE_BYTE_KEY_SIZE;
        int oneByteValueMax = DynamicSizeUtil.MASK_ONE_BYTE_VALUE_SIZE;

        TreeNodeDynamicSize<RawBytes,RawBytes> node = getNode( PAGE_SIZE, layout, createOffloadStore() );

        verifyOverhead( node, oneByteKeyMax, 0, 1 );
        verifyOverhead( node, oneByteKeyMax, 1, 2 );
        verifyOverhead( node, oneByteKeyMax, oneByteValueMax, 2 );
        verifyOverhead( node, oneByteKeyMax, oneByteValueMax +  1, 3 );
        verifyOverhead( node, oneByteKeyMax + 1, 0, 2 );
        verifyOverhead( node, oneByteKeyMax + 1, 1, 3 );
        verifyOverhead( node, oneByteKeyMax + 1, oneByteValueMax, 3 );
        verifyOverhead( node, oneByteKeyMax + 1, oneByteValueMax +  1, 4 );
    }

    private void verifyOverhead( TreeNodeDynamicSize<RawBytes,RawBytes> node, int keySize, int valueSize, int expectedOverhead ) throws IOException
    {
        cursor.zapPage();
        node.initializeLeaf( cursor, STABLE_GENERATION, UNSTABLE_GENERATION );

        RawBytes key = layout.newKey();
        RawBytes value = layout.newValue();
        key.bytes = new byte[keySize];
        value.bytes = new byte[valueSize];

        int allocOffsetBefore = node.getAllocOffset( cursor );
        node.insertKeyValueAt( cursor, key, value, 0, 0, STABLE_GENERATION, UNSTABLE_GENERATION, NULL );
        int allocOffsetAfter = node.getAllocOffset( cursor );
        assertEquals( allocOffsetBefore - keySize - valueSize - expectedOverhead, allocOffsetAfter );
    }
}
