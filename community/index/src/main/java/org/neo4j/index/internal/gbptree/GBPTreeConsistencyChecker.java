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

import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.api.list.primitive.MutableLongList;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.list.mutable.primitive.LongArrayList;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;

import org.neo4j.io.pagecache.CursorException;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.context.CursorContext;

import static java.lang.Math.toIntExact;
import static org.neo4j.index.internal.gbptree.GenerationSafePointerPair.pointer;
import static org.neo4j.index.internal.gbptree.PageCursorUtil.checkOutOfBounds;
import static org.neo4j.index.internal.gbptree.TreeNode.NO_OFFLOAD_ID;
import static org.neo4j.index.internal.gbptree.TreeNode.Type.INTERNAL;
import static org.neo4j.index.internal.gbptree.TreeNode.Type.LEAF;

/**
 * <ul>
 * Checks:
 * <li>order of keys in isolated nodes
 * <li>keys fit inside range given by parent node
 * <li>sibling pointers match
 * <li>GSPP
 * </ul>
 */
class GBPTreeConsistencyChecker<KEY>
{
    private final TreeNode<KEY,?> node;
    private final Comparator<KEY> comparator;
    private final Layout<KEY,?> layout;
    private final List<RightmostInChain> rightmostPerLevel = new ArrayList<>();
    private final IdProvider idProvider;
    private final long lastId;
    private final long stableGeneration;
    private final long unstableGeneration;
    private final boolean reportDirty;
    private final GenerationKeeper generationTarget = new GenerationKeeper();
    private final MutableLongList offloadIds = new LongArrayList();

    GBPTreeConsistencyChecker( TreeNode<KEY,?> node, Layout<KEY,?> layout, IdProvider idProvider, long stableGeneration,
            long unstableGeneration, boolean reportDirty )
    {
        this.node = node;
        this.comparator = node.keyComparator();
        this.layout = layout;
        this.idProvider = idProvider;
        this.lastId = idProvider.lastId();
        this.stableGeneration = stableGeneration;
        this.unstableGeneration = unstableGeneration;
        this.reportDirty = reportDirty;
    }

    /**
     * Checks so that all pages between {@link IdSpace#MIN_TREE_NODE_ID} and highest allocated id
     * are either in use in the tree, on the free-list or free-list nodes.
     *
     * @param file The file containing the gbptree
     * @param cursor {@link PageCursor} to use for reading.
     * @param root {@link Root} the root of the gbptree.
     * @param visitor {@link GBPTreeConsistencyCheckVisitor} visitor to report inconsistencies to.
     * @param cursorContext underlying page cursor context
     * @throws IOException on {@link PageCursor} error.
     */
    public void check( Path file, PageCursor cursor, Root root, GBPTreeConsistencyCheckVisitor<KEY> visitor, CursorContext cursorContext ) throws IOException
    {
        // TODO: limitation, can't run on an index larger than Integer.MAX_VALUE pages (which is fairly large)
        long highId = lastId + 1;
        BitSet seenIds = new BitSet( toIntExact( highId ) );

        // Log ids in freelist together with ids occupied by freelist pages.
        IdProvider.IdProviderVisitor freelistSeenIdsVisitor = new FreelistSeenIdsVisitor<>( file, seenIds, lastId, visitor );
        idProvider.visitFreelist( freelistSeenIdsVisitor, cursorContext );

        // Check structure of GBPTree
        long rootGeneration = root.goTo( cursor );
        KeyRange<KEY> openRange = new KeyRange<>( -1, -1, comparator, null, null, layout, null );
        checkSubtree( file, cursor, openRange, -1, rootGeneration, GBPTreePointerType.noPointer(), 0, visitor, seenIds, cursorContext );

        // Assert that rightmost node on each level has empty right sibling.
        rightmostPerLevel.forEach( rightmost -> rightmost.assertLast( visitor ) );

        // Assert that all pages in file are either present as an active tree node or in freelist.
        assertAllIdsOccupied( file, highId, seenIds, visitor );
        root.goTo( cursor );
    }

    private static <KEY> void assertAllIdsOccupied( Path file, long highId, BitSet seenIds, GBPTreeConsistencyCheckVisitor<KEY> visitor )
    {
        long expectedNumberOfPages = highId - IdSpace.MIN_TREE_NODE_ID;
        if ( seenIds.cardinality() != expectedNumberOfPages )
        {
            int index = (int) IdSpace.MIN_TREE_NODE_ID;
            while ( index >= 0 && index < highId )
            {
                index = seenIds.nextClearBit( index );
                if ( index != -1 && index < highId )
                {
                    visitor.unusedPage( index, file );
                }
                index++;
            }
        }
    }

    private static <KEY> void addToSeenList( Path file, BitSet target, long id, long lastId, GBPTreeConsistencyCheckVisitor<KEY> visitor )
    {
        int index = toIntExact( id );
        if ( target.get( index ) )
        {
            visitor.pageIdSeenMultipleTimes( id, file );
        }
        if ( id > lastId )
        {
            visitor.pageIdExceedLastId( lastId, id, file );
        }
        target.set( index );
    }

    private void checkSubtree( Path file, PageCursor cursor, KeyRange<KEY> range, long parentNode, long pointerGeneration,
            GBPTreePointerType parentPointerType, int level, GBPTreeConsistencyCheckVisitor<KEY> visitor, BitSet seenIds,
            CursorContext cursorContext ) throws IOException
    {
        long pageId = cursor.getCurrentPageId();
        addToSeenList( file, seenIds, pageId, lastId, visitor );
        if ( range.hasPageIdInStack( pageId ) )
        {
            visitor.childNodeFoundAmongParentNodes( range, level, pageId, file );
            return;
        }
        byte nodeType;
        byte treeNodeType;
        int keyCount;
        long successor;

        long leftSiblingPointer;
        long rightSiblingPointer;
        long leftSiblingPointerGeneration;
        long rightSiblingPointerGeneration;
        long currentNodeGeneration;

        do
        {
            // for assertSiblings
            leftSiblingPointer = TreeNode.leftSibling( cursor, stableGeneration, unstableGeneration, generationTarget );
            leftSiblingPointerGeneration = generationTarget.generation;
            rightSiblingPointer = TreeNode.rightSibling( cursor, stableGeneration, unstableGeneration, generationTarget );
            rightSiblingPointerGeneration = generationTarget.generation;
            leftSiblingPointer = pointer( leftSiblingPointer );
            rightSiblingPointer = pointer( rightSiblingPointer );
            currentNodeGeneration = TreeNode.generation( cursor );

            successor = TreeNode.successor( cursor, stableGeneration, unstableGeneration, generationTarget );

            keyCount = TreeNode.keyCount( cursor );
            nodeType = TreeNode.nodeType( cursor );
            treeNodeType = TreeNode.treeNodeType( cursor );
        }
        while ( cursor.shouldRetry() );
        checkAfterShouldRetry( cursor );

        if ( nodeType != TreeNode.NODE_TYPE_TREE_NODE )
        {
            visitor.notATreeNode( pageId, file );
            return;
        }

        boolean isLeaf = treeNodeType == TreeNode.LEAF_FLAG;
        boolean isInternal = treeNodeType == TreeNode.INTERNAL_FLAG;
        if ( !isInternal && !isLeaf )
        {
            visitor.unknownTreeNodeType( pageId, treeNodeType, file );
            return;
        }

        // check header pointers
        assertNoCrashOrBrokenPointerInGSPP( file,
                cursor, stableGeneration, unstableGeneration, GBPTreePointerType.leftSibling(), TreeNode.BYTE_POS_LEFTSIBLING, visitor, reportDirty );
        assertNoCrashOrBrokenPointerInGSPP( file,
                cursor, stableGeneration, unstableGeneration, GBPTreePointerType.rightSibling(), TreeNode.BYTE_POS_RIGHTSIBLING, visitor, reportDirty );
        assertNoCrashOrBrokenPointerInGSPP( file,
                cursor, stableGeneration, unstableGeneration, GBPTreePointerType.successor(), TreeNode.BYTE_POS_SUCCESSOR, visitor, reportDirty );

        boolean reasonableKeyCount = node.reasonableKeyCount( keyCount );
        if ( !reasonableKeyCount )
        {
            visitor.unreasonableKeyCount( pageId, keyCount, file );
        }
        else

        {
            assertKeyOrder( file, cursor, range, keyCount, isLeaf ? LEAF : INTERNAL, offloadIds, visitor, cursorContext );
        }
        offloadIds.forEach( id -> addToSeenList( file, seenIds, id, lastId, visitor ) );

        String nodeMetaReport;
        boolean consistentNodeMeta;
        do
        {
            nodeMetaReport = node.checkMetaConsistency( cursor, keyCount, isLeaf ? LEAF : INTERNAL, visitor );
            consistentNodeMeta = nodeMetaReport.isEmpty();
        }
        while ( cursor.shouldRetry() );
        checkAfterShouldRetry( cursor );
        if ( !consistentNodeMeta )
        {
            visitor.nodeMetaInconsistency( pageId, nodeMetaReport, file );
        }

        assertPointerGenerationMatchesGeneration( file, parentPointerType, parentNode, pageId,
                pointerGeneration, currentNodeGeneration, visitor );
        assertSiblings( file, cursor, currentNodeGeneration, leftSiblingPointer, leftSiblingPointerGeneration,
                rightSiblingPointer, rightSiblingPointerGeneration, level, visitor );
        checkSuccessorPointerGeneration( file, cursor, successor, visitor );

        if ( isInternal && reasonableKeyCount && consistentNodeMeta )
        {
            assertSubtrees( file, cursor, range, keyCount, level, visitor, seenIds, cursorContext );
        }
    }

    private static <KEY> void assertPointerGenerationMatchesGeneration( Path file, GBPTreePointerType pointerType, long sourceNode, long pointer,
            long pointerGeneration, long targetNodeGeneration, GBPTreeConsistencyCheckVisitor<KEY> visitor )
    {
        if ( targetNodeGeneration > pointerGeneration )
        {
            visitor.pointerHasLowerGenerationThanNode( pointerType, sourceNode, pointerGeneration, pointer, targetNodeGeneration, file );
        }
    }

    private void checkSuccessorPointerGeneration( Path file, PageCursor cursor, long successor, GBPTreeConsistencyCheckVisitor<KEY> visitor )
    {
        if ( TreeNode.isNode( successor ) )
        {
            visitor.pointerToOldVersionOfTreeNode( cursor.getCurrentPageId(), pointer( successor ), file );
        }
    }

    // Assumption: We traverse the tree from left to right on every level
    private void assertSiblings( Path file, PageCursor cursor, long currentNodeGeneration, long leftSiblingPointer,
            long leftSiblingPointerGeneration, long rightSiblingPointer, long rightSiblingPointerGeneration, int level,
            GBPTreeConsistencyCheckVisitor<KEY> visitor )
    {
        // If this is the first time on this level, we will add a new entry
        for ( int i = rightmostPerLevel.size(); i <= level; i++ )
        {
            rightmostPerLevel.add( i, new RightmostInChain( file ) );
        }
        RightmostInChain rightmost = rightmostPerLevel.get( level );

        rightmost.assertNext( cursor, currentNodeGeneration, leftSiblingPointer, leftSiblingPointerGeneration, rightSiblingPointer,
                rightSiblingPointerGeneration, visitor );
    }

    private void assertSubtrees( Path file, PageCursor cursor, KeyRange<KEY> range, int keyCount, int level,
            GBPTreeConsistencyCheckVisitor<KEY> visitor, BitSet seenIds, CursorContext cursorContext ) throws IOException
    {
        long pageId = cursor.getCurrentPageId();
        KEY prev = null;
        KeyRange<KEY> childRange;
        KEY readKey = layout.newKey();

        // Check children, all except the last one
        int pos = 0;
        while ( pos < keyCount )
        {
            long child;
            long childGeneration;
            assertNoCrashOrBrokenPointerInGSPP( file,
                    cursor, stableGeneration, unstableGeneration, GBPTreePointerType.child( pos ), node.childOffset( pos ), visitor, reportDirty );
            do
            {
                child = childAt( cursor, pos, generationTarget );
                childGeneration = generationTarget.generation;
                node.keyAt( cursor, readKey, pos, INTERNAL, cursorContext );
            }
            while ( cursor.shouldRetry() );
            checkAfterShouldRetry( cursor );

            childRange = range.newSubRange( level, pageId ).restrictRight( readKey );
            if ( pos > 0 )
            {
                childRange = childRange.restrictLeft( prev );
            }

            TreeNode.goTo( cursor, "child at pos " + pos, child );
            checkSubtree( file, cursor, childRange, pageId, childGeneration, GBPTreePointerType.child( pos ), level + 1, visitor, seenIds, cursorContext );

            TreeNode.goTo( cursor, "parent", pageId );

            if ( pos == 0 )
            {
                prev = layout.newKey();
            }
            layout.copyKey( readKey, prev );
            pos++;
        }

        // Check last child
        long child;
        long childGeneration;
        assertNoCrashOrBrokenPointerInGSPP( file,
                cursor, stableGeneration, unstableGeneration, GBPTreePointerType.child( pos ), node.childOffset( pos ), visitor, reportDirty );
        do
        {
            child = childAt( cursor, pos, generationTarget );
            childGeneration = generationTarget.generation;
        }
        while ( cursor.shouldRetry() );
        checkAfterShouldRetry( cursor );

        TreeNode.goTo( cursor, "child at pos " + pos, child );
        childRange = range.newSubRange( level, pageId ).restrictLeft( prev );
        checkSubtree( file, cursor, childRange, pageId, childGeneration, GBPTreePointerType.child( pos ), level + 1, visitor, seenIds, cursorContext );
        TreeNode.goTo( cursor, "parent", pageId );
    }

    private static void checkAfterShouldRetry( PageCursor cursor ) throws CursorException
    {
        checkOutOfBounds( cursor );
        cursor.checkAndClearCursorException();
    }

    private long childAt( PageCursor cursor, int pos, GBPTreeGenerationTarget childGeneration )
    {
        return node.childAt( cursor, pos, stableGeneration, unstableGeneration, childGeneration );
    }

    private void assertKeyOrder( Path file, PageCursor cursor, KeyRange<KEY> range, int keyCount, TreeNode.Type type,
            MutableLongList offloadIds, GBPTreeConsistencyCheckVisitor<KEY> visitor, CursorContext cursorContext ) throws IOException
    {
        DelayedVisitor<KEY> delayedVisitor = new DelayedVisitor<>( file );
        do
        {
            delayedVisitor.clear();
            offloadIds.clear();
            KEY prev = layout.newKey();
            KEY readKey = layout.newKey();
            boolean first = true;
            for ( int pos = 0; pos < keyCount; pos++ )
            {
                node.keyAt( cursor, readKey, pos, type, cursorContext );
                if ( !range.inRange( readKey ) )
                {
                    KEY keyCopy = layout.newKey();
                    layout.copyKey( readKey, keyCopy );
                    delayedVisitor.keysLocatedInWrongNode( range, keyCopy, pos, keyCount, cursor.getCurrentPageId(), file );
                }
                if ( !first )
                {
                    if ( comparator.compare( prev, readKey ) >= 0 )
                    {
                        delayedVisitor.keysOutOfOrderInNode( cursor.getCurrentPageId(), file );
                    }
                }
                else
                {
                    first = false;
                }
                layout.copyKey( readKey, prev );
                long offloadId = node.offloadIdAt( cursor, pos, type );
                if ( offloadId != NO_OFFLOAD_ID )
                {
                    offloadIds.add( offloadId );
                }
            }
        }
        while ( cursor.shouldRetry() );
        checkAfterShouldRetry( cursor );
        delayedVisitor.report( visitor );
    }

    static <KEY> void assertNoCrashOrBrokenPointerInGSPP( Path file, PageCursor cursor, long stableGeneration, long unstableGeneration,
            GBPTreePointerType pointerType, int offset, GBPTreeConsistencyCheckVisitor<KEY> visitor, boolean reportDirty ) throws IOException
    {
        long currentNodeId = cursor.getCurrentPageId();

        long generationA;
        long readPointerA;
        long pointerA;
        short checksumA;
        boolean correctChecksumA;
        byte stateA;

        long generationB;
        long readPointerB;
        long pointerB;
        short checksumB;
        boolean correctChecksumB;
        byte stateB;
        do
        {
            cursor.setOffset( offset );
            // A
            generationA = GenerationSafePointer.readGeneration( cursor );
            readPointerA = GenerationSafePointer.readPointer( cursor );
            pointerA = GenerationSafePointerPair.pointer( readPointerA );
            checksumA = GenerationSafePointer.readChecksum( cursor );
            correctChecksumA = GenerationSafePointer.checksumOf( generationA, readPointerA ) == checksumA;
            stateA = GenerationSafePointerPair.pointerState(
                    stableGeneration, unstableGeneration, generationA, readPointerA, correctChecksumA );

            // B
            generationB = GenerationSafePointer.readGeneration( cursor );
            readPointerB = GenerationSafePointer.readPointer( cursor );
            pointerB = GenerationSafePointerPair.pointer( readPointerA );
            checksumB = GenerationSafePointer.readChecksum( cursor );
            correctChecksumB = GenerationSafePointer.checksumOf( generationB, readPointerB ) == checksumB;
            stateB = GenerationSafePointerPair.pointerState(
                    stableGeneration, unstableGeneration, generationB, readPointerB, correctChecksumB );
        }
        while ( cursor.shouldRetry() );

        if ( reportDirty )
        {
            if ( stateA == GenerationSafePointerPair.CRASH || stateB == GenerationSafePointerPair.CRASH )
            {
                visitor.crashedPointer( currentNodeId, pointerType, generationA, readPointerA, pointerA, stateA, generationB, readPointerB, pointerB, stateB,
                        file );
            }
        }
        if ( stateA == GenerationSafePointerPair.BROKEN || stateB == GenerationSafePointerPair.BROKEN )
        {
            visitor.brokenPointer( currentNodeId, pointerType, generationA, readPointerA, pointerA, stateA, generationB, readPointerB, pointerB, stateB, file );
        }
    }

    private static class DelayedVisitor<KEY> extends GBPTreeConsistencyCheckVisitor.Adaptor<KEY>
    {
        private final Path path;
        MutableLongList keysOutOfOrder = LongLists.mutable.empty();
        MutableList<KeyInWrongNode<KEY>> keysLocatedInWrongNode = Lists.mutable.empty();

        DelayedVisitor( Path path )
        {
            this.path = path;
        }

        @Override
        public void keysOutOfOrderInNode( long pageId, Path file )
        {
            keysOutOfOrder.add( pageId );
        }

        @Override
        public void keysLocatedInWrongNode( KeyRange<KEY> range, KEY key, int pos, int keyCount, long pageId, Path file )
        {
            keysLocatedInWrongNode.add( new KeyInWrongNode<>( pageId, range, key, pos, keyCount ) );
        }

        void clear()
        {
            keysOutOfOrder.clear();
            keysLocatedInWrongNode.clear();
        }

        void report( GBPTreeConsistencyCheckVisitor<KEY> visitor )
        {
            if ( keysOutOfOrder.notEmpty() )
            {
                keysOutOfOrder.forEach( pageId -> visitor.keysOutOfOrderInNode( pageId, path ) );
            }
            if ( keysLocatedInWrongNode.notEmpty() )
            {
                keysLocatedInWrongNode.forEach( keyInWrongNode -> visitor.keysLocatedInWrongNode( keyInWrongNode.range, keyInWrongNode.key, keyInWrongNode.pos,
                        keyInWrongNode.keyCount, keyInWrongNode.pageId, path
                ) );
            }
        }

        private static class KeyInWrongNode<KEY>
        {
            final long pageId;
            final KeyRange<KEY> range;
            final KEY key;
            final int pos;
            final int keyCount;

            private KeyInWrongNode( long pageId, KeyRange<KEY> range, KEY key, int pos, int keyCount )
            {
                this.pageId = pageId;
                this.range = range;
                this.key = key;
                this.pos = pos;
                this.keyCount = keyCount;
            }
        }
    }

    private static class FreelistSeenIdsVisitor<KEY> implements IdProvider.IdProviderVisitor
    {
        private final Path path;
        private final BitSet seenIds;
        private final long lastId;
        private final GBPTreeConsistencyCheckVisitor<KEY> visitor;

        private FreelistSeenIdsVisitor( Path path, BitSet seenIds, long lastId, GBPTreeConsistencyCheckVisitor<KEY> visitor )
        {
            this.path = path;
            this.seenIds = seenIds;
            this.lastId = lastId;
            this.visitor = visitor;
        }

        @Override
        public void beginFreelistPage( long pageId )
        {
            addToSeenList( path, seenIds, pageId, lastId, visitor );
        }

        @Override
        public void endFreelistPage( long pageId )
        {
        }

        @Override
        public void freelistEntry( long pageId, long generation, int pos )
        {
            addToSeenList( path, seenIds, pageId, lastId, visitor );
        }
    }
}
