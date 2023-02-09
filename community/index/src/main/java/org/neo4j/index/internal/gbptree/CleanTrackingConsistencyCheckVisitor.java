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

import org.apache.commons.lang3.mutable.MutableBoolean;

import java.nio.file.Path;

class CleanTrackingConsistencyCheckVisitor<KEY> implements GBPTreeConsistencyCheckVisitor<KEY>
{
    private final MutableBoolean isConsistent = new MutableBoolean( true );
    private final GBPTreeConsistencyCheckVisitor<KEY> delegate;

    CleanTrackingConsistencyCheckVisitor( GBPTreeConsistencyCheckVisitor<KEY> delegate )
    {
        this.delegate = delegate;
    }

    boolean isConsistent()
    {
        return isConsistent.booleanValue();
    }

    @Override
    public void notATreeNode( long pageId, Path file )
    {
        isConsistent.setFalse();
        delegate.notATreeNode( pageId, file );
    }

    @Override
    public void unknownTreeNodeType( long pageId, byte treeNodeType, Path file )
    {
        isConsistent.setFalse();
        delegate.unknownTreeNodeType( pageId, treeNodeType, file );
    }

    @Override
    public void siblingsDontPointToEachOther( long leftNode, long leftNodeGeneration, long leftRightSiblingPointerGeneration, long leftRightSiblingPointer,
            long rightLeftSiblingPointer, long rightLeftSiblingPointerGeneration, long rightNode, long rightNodeGeneration, Path file )
    {
        isConsistent.setFalse();
        delegate.siblingsDontPointToEachOther( leftNode, leftNodeGeneration, leftRightSiblingPointerGeneration, leftRightSiblingPointer,
                rightLeftSiblingPointer, rightLeftSiblingPointerGeneration, rightNode, rightNodeGeneration, file
        );
    }

    @Override
    public void rightmostNodeHasRightSibling( long rightSiblingPointer, long rightmostNode, Path file )
    {
        isConsistent.setFalse();
        delegate.rightmostNodeHasRightSibling( rightSiblingPointer, rightmostNode, file );
    }

    @Override
    public void pointerToOldVersionOfTreeNode( long pageId, long successorPointer, Path file )
    {
        isConsistent.setFalse();
        delegate.pointerToOldVersionOfTreeNode( pageId, successorPointer, file );
    }

    @Override
    public void pointerHasLowerGenerationThanNode( GBPTreePointerType pointerType, long sourceNode, long pointerGeneration, long pointer,
            long targetNodeGeneration, Path file )
    {
        isConsistent.setFalse();
        delegate.pointerHasLowerGenerationThanNode( pointerType, sourceNode, pointerGeneration, pointer, targetNodeGeneration, file );
    }

    @Override
    public void keysOutOfOrderInNode( long pageId, Path file )
    {
        isConsistent.setFalse();
        delegate.keysOutOfOrderInNode( pageId, file );
    }

    @Override
    public void keysLocatedInWrongNode( KeyRange<KEY> range, KEY key, int pos, int keyCount, long pageId, Path file )
    {
        isConsistent.setFalse();
        delegate.keysLocatedInWrongNode( range, key, pos, keyCount, pageId, file );
    }

    @Override
    public void unusedPage( long pageId, Path file )
    {
        isConsistent.setFalse();
        delegate.unusedPage( pageId, file );
    }

    @Override
    public void pageIdExceedLastId( long lastId, long pageId, Path file )
    {
        isConsistent.setFalse();
        delegate.pageIdExceedLastId( lastId, pageId, file );
    }

    @Override
    public void nodeMetaInconsistency( long pageId, String message, Path file )
    {
        isConsistent.setFalse();
        delegate.nodeMetaInconsistency( pageId, message, file );
    }

    @Override
    public void pageIdSeenMultipleTimes( long pageId, Path file )
    {
        isConsistent.setFalse();
        delegate.pageIdSeenMultipleTimes( pageId, file );
    }

    @Override
    public void crashedPointer( long pageId, GBPTreePointerType pointerType, long generationA, long readPointerA, long pointerA, byte stateA, long generationB,
            long readPointerB, long pointerB, byte stateB, Path file )
    {
        isConsistent.setFalse();
        delegate.crashedPointer( pageId, pointerType, generationA, readPointerA, pointerA, stateA, generationB, readPointerB, pointerB, stateB, file );
    }

    @Override
    public void brokenPointer( long pageId, GBPTreePointerType pointerType, long generationA, long readPointerA, long pointerA, byte stateA, long generationB,
            long readPointerB, long pointerB, byte stateB, Path file )
    {
        isConsistent.setFalse();
        delegate.brokenPointer( pageId, pointerType, generationA, readPointerA, pointerA, stateA, generationB, readPointerB, pointerB, stateB, file );
    }

    @Override
    public void unreasonableKeyCount( long pageId, int keyCount, Path file )
    {
        isConsistent.setFalse();
        delegate.unreasonableKeyCount( pageId, keyCount, file );
    }

    @Override
    public void childNodeFoundAmongParentNodes( KeyRange<KEY> superRange, int level, long pageId, Path file )
    {
        isConsistent.setFalse();
        delegate.childNodeFoundAmongParentNodes( superRange, level, pageId, file );
    }

    @Override
    public void exception( Exception e )
    {
        isConsistent.setFalse();
        delegate.exception( e );
    }

    @Override
    public void dirtyOnStartup( Path file )
    {
        // This does not count as an inconsistency
        delegate.dirtyOnStartup( file );
    }
}
