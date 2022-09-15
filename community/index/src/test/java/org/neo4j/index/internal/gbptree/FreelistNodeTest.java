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

import org.neo4j.io.pagecache.ByteArrayPageCursor;
import org.neo4j.io.pagecache.PageCursor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FreelistNodeTest
{
    private static final int PAGE_SIZE = 128;

    private final PageCursor cursor = ByteArrayPageCursor.wrap( PAGE_SIZE );
    private final FreelistNode freelist = new FreelistNode( PAGE_SIZE );
    private final int maxEntries = freelist.maxEntries();

    @Test
    void shouldInitializeTreeNode()
    {
        // GIVEN
        FreelistNode.initialize( cursor );

        // WHEN
        byte nodeType = TreeNode.nodeType( cursor );

        // THEN
        assertEquals( TreeNode.NODE_TYPE_FREE_LIST_NODE, nodeType );
    }

    @Test
    void shouldNodeOverwriteNodeType()
    {
        // GIVEN
        FreelistNode.initialize( cursor );
        byte nodeType = TreeNode.nodeType( cursor );
        assertEquals( TreeNode.NODE_TYPE_FREE_LIST_NODE, nodeType );

        // WHEN
        long someId = 1234;
        FreelistNode.setNext( cursor, someId );

        // THEN
        nodeType = TreeNode.nodeType( cursor );
        assertEquals( TreeNode.NODE_TYPE_FREE_LIST_NODE, nodeType );
    }

    @Test
    void shouldSetAndGetNext()
    {
        // GIVEN
        long nextId = 12345;

        // WHEN
        FreelistNode.setNext( cursor, nextId );
        long readNextId = FreelistNode.next( cursor );

        // THEN
        assertEquals( nextId, readNextId );
    }

    @Test
    void shouldReadAndWriteFreeListEntries()
    {
        // GIVEN
        long generationA = 34;
        long pointerA = 56;
        long generationB = 78;
        long pointerB = 90;

        // WHEN
        freelist.write( cursor, generationA, pointerA, 0 );
        freelist.write( cursor, generationB, pointerB, 1 );
        long readPointerA = freelist.read( cursor, generationA + 1, 0 );
        long readPointerB = freelist.read( cursor, generationB + 1, 1 );

        // THEN
        assertEquals( pointerA, readPointerA );
        assertEquals( pointerB, readPointerB );
    }

    @Test
    void shouldFailOnWritingBeyondMaxEntries()
    {
        assertThrows( IllegalArgumentException.class, () -> freelist.write( cursor, 1, 10, maxEntries ) );
    }

    @Test
    void shouldFailOnWritingTooBigPointer()
    {
        assertThrows( IllegalArgumentException.class, () -> freelist.write( cursor, 1, PageCursorUtil._6B_MASK + 1, 0 ) );
    }

    @Test
    void shouldFailOnWritingTooBigGeneration()
    {
        assertThrows( IllegalArgumentException.class, () -> freelist.write( cursor, GenerationSafePointer.MAX_GENERATION + 1, 1, 0 ) );
    }

    @Test
    void shouldReturnNoPageOnUnstableEntry()
    {
        // GIVEN
        long stableGeneration = 10;
        long unstableGeneration = stableGeneration + 1;
        long pageId = 20;
        int pos = 2;
        freelist.write( cursor, unstableGeneration, pageId, pos );

        // WHEN
        long read = freelist.read( cursor, stableGeneration, pos );

        // THEN
        assertEquals( FreelistNode.NO_PAGE_ID, read );
    }
}
