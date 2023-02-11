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

import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableLong;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.extension.pagecache.PageCacheSupportExtension;
import org.neo4j.test.extension.testdirectory.EphemeralTestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.DELETE_ON_CLOSE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.eclipse.collections.impl.factory.Sets.immutable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.index.internal.gbptree.GBPTree.NO_MONITOR;
import static org.neo4j.index.internal.gbptree.SimpleLongLayout.longLayout;
import static org.neo4j.index.internal.gbptree.TreeNode.Overflow;
import static org.neo4j.index.internal.gbptree.TreeNode.setKeyCount;
import static org.neo4j.test.utils.PageCacheConfig.config;

@EphemeralTestDirectoryExtension
@ExtendWith( RandomExtension.class )
class CrashGenerationCleanerTest
{
    @RegisterExtension
    static PageCacheSupportExtension pageCacheExtension = new PageCacheSupportExtension();
    @Inject
    private FileSystemAbstraction fileSystem;
    @Inject
    private TestDirectory testDirectory;
    @Inject
    private RandomSupport randomRule;

    private static final String FILE_NAME = "index";
    private static final String DATABASE_NAME = "neo4j";
    private static final int PAGE_SIZE = 256;

    private PagedFile pagedFile;
    private PageCache pageCache;
    private final Layout<MutableLong,MutableLong> layout = longLayout().build();
    private final TreeNode<MutableLong,MutableLong> treeNode = new TreeNodeFixedSize<>( PAGE_SIZE, layout );
    private static ExecutorService executorService;
    private static CleanupJob.Executor executor;
    private final TreeState checkpointedTreeState = new TreeState( 0, 9, 10, 0, 0, 0, 0, 0, 0, 0, true, true );
    private final TreeState unstableTreeState = new TreeState( 0, 10, 12, 0, 0, 0, 0, 0, 0, 0, true, true );
    private final List<GBPTreeCorruption.PageCorruption> possibleCorruptionsInInternal = Arrays.asList(
            GBPTreeCorruption.crashed( GBPTreePointerType.leftSibling() ),
            GBPTreeCorruption.crashed( GBPTreePointerType.rightSibling() ),
            GBPTreeCorruption.crashed( GBPTreePointerType.successor() ),
            GBPTreeCorruption.crashed( GBPTreePointerType.child( 0 ) )
    );
    private final List<GBPTreeCorruption.PageCorruption> possibleCorruptionsInLeaf = Arrays.asList(
            GBPTreeCorruption.crashed( GBPTreePointerType.leftSibling() ),
            GBPTreeCorruption.crashed( GBPTreePointerType.rightSibling() ),
            GBPTreeCorruption.crashed( GBPTreePointerType.successor() )
    );

    @BeforeAll
    static void setUp()
    {
        executorService = Executors.newFixedThreadPool( Runtime.getRuntime().availableProcessors() );
        executor = new CleanupJob.Executor()
        {
            @Override
            public <T> CleanupJob.JobResult<T> submit( String jobDescription, Callable<T> job )
            {
                var future = executorService.submit( job );
                return future::get;
            }
        };
    }

    @AfterAll
    static void tearDown()
    {
        executorService.shutdown();
    }

    @BeforeEach
    void setupPagedFile() throws IOException
    {
        pageCache = PageCacheSupportExtension.getPageCache( fileSystem, config().withPageSize( PAGE_SIZE ).withAccessChecks( true ) );
        pagedFile = pageCache.map( testDirectory.file( FILE_NAME ), PAGE_SIZE, DATABASE_NAME, immutable.of( CREATE, DELETE_ON_CLOSE ) );
    }

    @AfterEach
    void teardownPagedFile()
    {
        pagedFile.close();
        pageCache.close();
    }

    @Test
    void shouldNotCrashOnEmptyFile() throws Exception
    {
        // GIVEN
        Page[] pages = with();
        initializeFile( pagedFile, pages );

        // WHEN
        SimpleCleanupMonitor monitor = new SimpleCleanupMonitor();
        crashGenerationCleaner( pagedFile, 0, pages.length, monitor ).clean( executor );

        // THEN
        assertPagesVisited( monitor, pages.length );
        assertTreeNodes( monitor, pages.length );
        assertCleanedCrashPointers( monitor, 0 );
    }

    @Test
    void shouldNotReportErrorsOnCleanPages() throws Exception
    {
        // GIVEN
        Page[] pages = with(
                leafWith(),
                internalWith()
        );
        initializeFile( pagedFile, pages );

        // WHEN
        SimpleCleanupMonitor monitor = new SimpleCleanupMonitor();
        crashGenerationCleaner( pagedFile, 0, pages.length, monitor ).clean( executor );

        // THEN
        assertPagesVisited( monitor, pages.length );
        assertTreeNodes( monitor, pages.length );
        assertCleanedCrashPointers( monitor, 0 );
    }

    @Test
    void shouldCleanOneCrashPerPage() throws Exception
    {
        // GIVEN
        Page[] pages = with(
                /* left sibling */
                leafWith( GBPTreeCorruption.crashed( GBPTreePointerType.leftSibling() ) ),
                internalWith( GBPTreeCorruption.crashed( GBPTreePointerType.leftSibling() ) ),

                /* right sibling */
                leafWith( GBPTreeCorruption.crashed( GBPTreePointerType.rightSibling() ) ),
                internalWith( GBPTreeCorruption.crashed( GBPTreePointerType.rightSibling() ) ),

                /* successor */
                leafWith( GBPTreeCorruption.crashed( GBPTreePointerType.successor() ) ),
                internalWith( GBPTreeCorruption.crashed( GBPTreePointerType.successor() ) ),

                /* child */
                internalWith( GBPTreeCorruption.crashed( GBPTreePointerType.child( 0 ) ) )
        );
        initializeFile( pagedFile, pages );

        // WHEN
        SimpleCleanupMonitor monitor = new SimpleCleanupMonitor();
        crashGenerationCleaner( pagedFile, 0, pages.length, monitor ).clean( executor );

        // THEN
        assertPagesVisited( monitor, pages.length );
        assertTreeNodes( monitor, pages.length );
        assertCleanedCrashPointers( monitor, 7 );
    }

    @Test
    void shouldCleanMultipleCrashPerPage() throws Exception
    {
        // GIVEN
        Page[] pages = with(
                leafWith(
                        GBPTreeCorruption.crashed( GBPTreePointerType.leftSibling() ),
                        GBPTreeCorruption.crashed( GBPTreePointerType.rightSibling() ),
                        GBPTreeCorruption.crashed( GBPTreePointerType.successor() ) ),
                internalWith(
                        GBPTreeCorruption.crashed( GBPTreePointerType.leftSibling() ),
                        GBPTreeCorruption.crashed( GBPTreePointerType.rightSibling() ),
                        GBPTreeCorruption.crashed( GBPTreePointerType.successor() ),
                        GBPTreeCorruption.crashed( GBPTreePointerType.child( 0 ) ) )
        );
        initializeFile( pagedFile, pages );

        // WHEN
        SimpleCleanupMonitor monitor = new SimpleCleanupMonitor();
        crashGenerationCleaner( pagedFile, 0, pages.length, monitor ).clean( executor );

        // THEN
        assertPagesVisited( monitor, pages.length );
        assertTreeNodes( monitor, pages.length );
        assertCleanedCrashPointers( monitor, 7 );
    }

    @Test
    void shouldNotCleanOffloadOrFreelistPages() throws IOException
    {
        // GIVEN
        Page[] pages = with(
                offload(),
                freelist()
        );
        initializeFile( pagedFile, pages );

        // WHEN
        SimpleCleanupMonitor monitor = new SimpleCleanupMonitor();
        crashGenerationCleaner( pagedFile, 0, pages.length, monitor ).clean( executor );

        // THEN
        assertPagesVisited( monitor, 2 );
        assertTreeNodes( monitor, 0 );
        assertCleanedCrashPointers( monitor, 0 );
    }

    @Test
    void shouldCleanLargeFile() throws Exception
    {
        // GIVEN
        int numberOfPages = randomRule.intBetween( 1_000, 10_000 );
        int corruptionPercent = randomRule.nextInt( 90 );
        MutableInt totalNumberOfCorruptions = new MutableInt( 0 );

        Page[] pages = new Page[numberOfPages];
        for ( int i = 0; i < numberOfPages; i++ )
        {
            Page page = randomPage( corruptionPercent, totalNumberOfCorruptions );
            pages[i] = page;
        }
        initializeFile( pagedFile, pages );

        // WHEN
        SimpleCleanupMonitor monitor = new SimpleCleanupMonitor();
        crashGenerationCleaner( pagedFile, 0, numberOfPages, monitor ).clean( executor );

        // THEN
        assertPagesVisited( monitor, numberOfPages );
        assertTreeNodes( monitor, numberOfPages );
        assertCleanedCrashPointers( monitor, totalNumberOfCorruptions.getValue() );
    }

    @Test
    void tracePageCacheAccessInCleaners() throws IOException
    {
        int numberOfPages = randomRule.intBetween( 100, 1000 );
        Page[] pages = new Page[numberOfPages];
        for ( int i = 0; i < numberOfPages; i++ )
        {
            Page page = randomPage( 0, new MutableInt() );
            pages[i] = page;
        }
        initializeFile( pagedFile, pages );
        var cacheTracer = new DefaultPageCacheTracer();

        assertThat( cacheTracer.pins() ).isZero();
        assertThat( cacheTracer.unpins() ).isZero();
        assertThat( cacheTracer.hits() ).isZero();

        var cleaner = new CrashGenerationCleaner( pagedFile, treeNode, 0, pages.length,
                unstableTreeState.stableGeneration(), unstableTreeState.unstableGeneration(), NO_MONITOR, cacheTracer, "test tree" );
        cleaner.clean( executor );

        assertThat( cacheTracer.pins() ).isEqualTo( pages.length );
        assertThat( cacheTracer.unpins() ).isEqualTo( pages.length );
        assertThat( cacheTracer.hits() ).isEqualTo( pages.length );
    }

    private CrashGenerationCleaner crashGenerationCleaner( PagedFile pagedFile, int lowTreeNodeId, int highTreeNodeId, SimpleCleanupMonitor monitor )
    {
        return new CrashGenerationCleaner( pagedFile, treeNode, lowTreeNodeId, highTreeNodeId,
                unstableTreeState.stableGeneration(), unstableTreeState.unstableGeneration(), monitor, PageCacheTracer.NULL, "test tree" );
    }

    private void initializeFile( PagedFile pagedFile, Page... pages ) throws IOException
    {
        try ( PageCursor cursor = pagedFile.io( 0, PagedFile.PF_SHARED_WRITE_LOCK, CursorContext.NULL ) )
        {
            for ( Page page : pages )
            {
                cursor.next();
                page.write( cursor, treeNode, layout, checkpointedTreeState, unstableTreeState );
            }
        }
    }

    /* Assertions */
    private static void assertCleanedCrashPointers( SimpleCleanupMonitor monitor, int expectedNumberOfCleanedCrashPointers )
    {
        assertEquals( expectedNumberOfCleanedCrashPointers, monitor.numberOfCleanedCrashPointers,
                "Expected number of cleaned crash pointers to be " +
                        expectedNumberOfCleanedCrashPointers + " but was " + monitor.numberOfCleanedCrashPointers );
    }

    private static void assertPagesVisited( SimpleCleanupMonitor monitor, int expectedNumberOfPagesVisited )
    {
        assertEquals( expectedNumberOfPagesVisited, monitor.numberOfPagesVisited,
                "Expected number of visited pages to be " + expectedNumberOfPagesVisited +
                        " but was " + monitor.numberOfPagesVisited );
    }

    private static void assertTreeNodes( SimpleCleanupMonitor monitor, int expectedNumberOfTreeNodes )
    {
        assertEquals( expectedNumberOfTreeNodes, monitor.numberOfTreeNodes,
                "Expected number of TreeNodes to be " + expectedNumberOfTreeNodes +
                        " but was " + monitor.numberOfTreeNodes );
    }

    /* Random page */
    private Page randomPage( int corruptionPercent, MutableInt totalNumberOfCorruptions )
    {
        int numberOfCorruptions = 0;
        boolean internal = randomRule.nextBoolean();
        if ( randomRule.nextInt( 100 ) < corruptionPercent )
        {
            int maxCorruptions = internal ? possibleCorruptionsInInternal.size() : possibleCorruptionsInLeaf.size();
            numberOfCorruptions = randomRule.intBetween( 1, maxCorruptions );
            totalNumberOfCorruptions.add( numberOfCorruptions );
        }
        return internal ? randomInternal( numberOfCorruptions ) : randomLeaf( numberOfCorruptions );
    }

    private Page randomLeaf( int numberOfCorruptions )
    {
        Collections.shuffle( possibleCorruptionsInLeaf );
        GBPTreeCorruption.PageCorruption[] corruptions = new GBPTreeCorruption.PageCorruption[numberOfCorruptions];
        for ( int i = 0; i < numberOfCorruptions; i++ )
        {
            corruptions[i] = possibleCorruptionsInLeaf.get( i );
        }
        return leafWith( corruptions );
    }

    private Page randomInternal( int numberOfCorruptions )
    {
        Collections.shuffle( possibleCorruptionsInInternal );
        GBPTreeCorruption.PageCorruption[] corruptions = new GBPTreeCorruption.PageCorruption[numberOfCorruptions];
        for ( int i = 0; i < numberOfCorruptions; i++ )
        {
            corruptions[i] = possibleCorruptionsInInternal.get( i );
        }
        return internalWith( corruptions );
    }

    /* Page */
    private static Page[] with( Page... pages )
    {
        return pages;
    }

    private static Page leafWith( GBPTreeCorruption.PageCorruption<MutableLong,MutableLong>... pageCorruptions )
    {
        return new Page( PageType.LEAF, pageCorruptions );
    }

    private static Page internalWith( GBPTreeCorruption.PageCorruption<MutableLong,MutableLong>... pageCorruptions )
    {
        return new Page( PageType.INTERNAL, pageCorruptions );
    }

    private static Page offload()
    {
        return new Page( PageType.OFFLOAD );
    }

    private static Page freelist()
    {
        return new Page( PageType.FREELIST );
    }

    private static class Page
    {
        private final PageType type;
        private final GBPTreeCorruption.PageCorruption<MutableLong,MutableLong>[] pageCorruptions;

        private Page( PageType type, GBPTreeCorruption.PageCorruption<MutableLong,MutableLong>... pageCorruptions )
        {
            this.type = type;
            this.pageCorruptions = pageCorruptions;
        }

        private void write( PageCursor cursor, TreeNode<MutableLong,MutableLong> node, Layout<MutableLong,MutableLong> layout, TreeState checkpointedTreeState,
                TreeState unstableTreeState ) throws IOException
        {
            type.write( cursor, node, layout, checkpointedTreeState );
            for ( GBPTreeCorruption.PageCorruption<MutableLong,MutableLong> pc : pageCorruptions )
            {
                pc.corrupt( cursor, layout, node, unstableTreeState );
            }
        }
    }

    enum PageType
    {
        LEAF
                {
                    @Override
                    void write( PageCursor cursor, TreeNode<MutableLong,MutableLong> treeNode, Layout<MutableLong,MutableLong> layout,
                            TreeState treeState )
                    {
                        treeNode.initializeLeaf( cursor, treeState.stableGeneration(), treeState.unstableGeneration() );
                    }
                },
        INTERNAL
                {
                    @Override
                    void write( PageCursor cursor, TreeNode<MutableLong,MutableLong> treeNode, Layout<MutableLong,MutableLong> layout,
                            TreeState treeState )
                    {
                        treeNode.initializeInternal( cursor, treeState.stableGeneration(), treeState.unstableGeneration() );
                        long base = IdSpace.MIN_TREE_NODE_ID;
                        int keyCount;
                        for ( keyCount = 0; treeNode.internalOverflow( cursor, keyCount, layout.newKey() ) == Overflow.NO;
                              keyCount++ )
                        {
                            long child = base + keyCount;
                            treeNode.setChildAt( cursor, child, keyCount, treeState.stableGeneration(), treeState.unstableGeneration() );
                        }
                        setKeyCount( cursor, keyCount );
                    }
                },
        OFFLOAD
                {
                    @Override
                    void write( PageCursor cursor, TreeNode<MutableLong,MutableLong> treeNode, Layout<MutableLong,MutableLong> layout,
                            TreeState treeState )
                    {
                        OffloadStoreImpl.writeHeader( cursor );
                    }
                },
        FREELIST
                {
                    @Override
                    void write( PageCursor cursor, TreeNode<MutableLong,MutableLong> treeNode, Layout<MutableLong,MutableLong> layout,
                            TreeState treeState )
                    {
                        FreelistNode.initialize( cursor );
                    }
                };

        abstract void write( PageCursor cursor, TreeNode<MutableLong,MutableLong> treeNode,
                Layout<MutableLong,MutableLong> layout, TreeState treeState );
    }
}
