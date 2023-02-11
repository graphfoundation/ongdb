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
package org.neo4j.internal.counts;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.util.Map;

import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.counts.CountsAccessor;
import org.neo4j.counts.CountsStore;
import org.neo4j.counts.CountsVisitor;
import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;

import static java.lang.String.format;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;

/**
 * Counts store build on top of the {@link GBPTree}.
 * Changes between checkpoints are kept in memory and written out to the tree in {@link #checkpoint(CursorContext)}.
 * Multiple {@link #apply(long, CursorContext)} appliers} can run concurrently in a lock-free manner.
 * Checkpoint will acquire a write lock, wait for currently active appliers to close while at the same time blocking new appliers to start,
 * but doesn't wait for appliers that haven't even started yet, i.e. it doesn't require a gap-free transaction sequence to be completed.
 */
public class GBPTreeCountsStore extends GBPTreeGenericCountsStore implements CountsStore
{
    private static final String NAME = "Counts store";

    private static final byte TYPE_NODE = 1;
    private static final byte TYPE_RELATIONSHIP = 2;

    /**
     * Public utility method for instantiating a {@link CountsKey} for a node label id.
     *
     * Key data layout for this type:
     * <pre>
     * first:  4B (lsb) labelId
     * second: 0
     * </pre>
     *
     * @param labelId id of the label.
     * @return a {@link CountsKey for the node label id. The returned key can be put into {@link Map maps} and similar.
     */
    public static CountsKey nodeKey( long labelId )
    {
        return new CountsKey( TYPE_NODE, labelId, 0 );
    }

    /**
     * Public utility method for instantiating a {@link CountsKey} for a node start/end label and relationship type id.
     *
     * Key data layout for this type:
     * <pre>
     * first:  4B (msb) startLabelId, 4B (lsb) relationshipTypeId
     * second: 4B endLabelId
     * </pre>
     *
     * @param startLabelId id of the label of start node.
     * @param typeId id of the relationship type.
     * @param endLabelId id of the label of end node.
     * @return a {@link CountsKey for the node start/end label and relationship type id. The returned key can be put into {@link Map maps} and similar.
     */
    public static CountsKey relationshipKey( long startLabelId, long typeId, long endLabelId )
    {
        return new CountsKey( TYPE_RELATIONSHIP, (startLabelId << Integer.SIZE) | (typeId & 0xFFFFFFFFL), (int) endLabelId );
    }

    public GBPTreeCountsStore( PageCache pageCache, Path file, FileSystemAbstraction fileSystem, RecoveryCleanupWorkCollector recoveryCollector,
            CountsBuilder initialCountsBuilder, DatabaseReadOnlyChecker readOnlyChecker, PageCacheTracer pageCacheTracer, Monitor monitor, String databaseName,
            int maxCacheSize, LogProvider userLogProvider ) throws IOException
    {
        super( pageCache, file, fileSystem, recoveryCollector, new InitialCountsRebuilder( initialCountsBuilder ), readOnlyChecker, NAME, pageCacheTracer,
                monitor, databaseName, maxCacheSize, userLogProvider );
    }

    @Override
    public CountsAccessor.Updater apply( long txId, CursorContext cursorContext )
    {
        CountUpdater updater = updater( txId, cursorContext );
        return updater != null ? new Incrementer( updater ) : NO_OP_UPDATER;
    }

    @Override
    public long nodeCount( int labelId, CursorContext cursorContext )
    {
        return read( nodeKey( labelId ), cursorContext );
    }

    @Override
    public long relationshipCount( int startLabelId, int typeId, int endLabelId, CursorContext cursorContext )
    {
        return read( relationshipKey( startLabelId, typeId, endLabelId ), cursorContext );
    }

    @Override
    public void accept( CountsVisitor visitor, CursorContext cursorContext )
    {
        visitAllCounts( ( key, count ) ->
        {
            if ( key.type == TYPE_NODE )
            {
                visitor.visitNodeCount( (int) key.first, count );
            }
            else if ( key.type == TYPE_RELATIONSHIP )
            {
                visitor.visitRelationshipCount( key.extractHighFirstInt(), key.extractLowFirstInt(), key.second, count );
            }
            else
            {
                throw new IllegalArgumentException( "Unknown key type " + key.type );
            }
        }, cursorContext );
    }

    public static String keyToString( CountsKey key )
    {
        if ( key.type == TYPE_NODE )
        {
            return format( "Node[label:%d]", key.first );
        }
        else if ( key.type == TYPE_RELATIONSHIP )
        {
            return format( "Relationship[startLabel:%d, type:%d, endLabel:%d]", key.extractHighFirstInt(), key.extractLowFirstInt(), key.second );
        }
        throw new IllegalArgumentException( "Unknown type " + key.type );
    }

    public static void dump( PageCache pageCache, Path file, PrintStream out, CursorContext cursorContext ) throws IOException
    {
        GBPTreeGenericCountsStore.dump( pageCache, file, out, DEFAULT_DATABASE_NAME, NAME, cursorContext, GBPTreeCountsStore::keyToString );
    }

    private static class Incrementer implements CountsAccessor.Updater
    {
        private final CountUpdater actual;

        Incrementer( CountUpdater actual )
        {
            this.actual = actual;
        }

        @Override
        public void incrementNodeCount( long labelId, long delta )
        {
            actual.increment( nodeKey( labelId ), delta );
        }

        @Override
        public void incrementRelationshipCount( long startLabelId, int typeId, long endLabelId, long delta )
        {
            actual.increment( relationshipKey( startLabelId, typeId, endLabelId ), delta );
        }

        @Override
        public void close()
        {
            actual.close();
        }
    }

    private static class InitialCountsRebuilder implements Rebuilder
    {
        private final CountsBuilder initialCountsBuilder;

        InitialCountsRebuilder( CountsBuilder initialCountsBuilder )
        {
            this.initialCountsBuilder = initialCountsBuilder;
        }

        @Override
        public long lastCommittedTxId()
        {
            return initialCountsBuilder.lastCommittedTxId();
        }

        @Override
        public void rebuild( CountUpdater updater, CursorContext cursorContext, MemoryTracker memoryTracker )
        {
            initialCountsBuilder.initialize( new Incrementer( updater ), cursorContext, memoryTracker );
        }
    }
}
