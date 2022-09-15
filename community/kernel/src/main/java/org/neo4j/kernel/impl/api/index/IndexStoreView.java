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
package org.neo4j.kernel.impl.api.index;

import java.util.function.IntPredicate;

import org.neo4j.internal.kernel.api.PopulationProgress;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.NodePropertyAccessor;

/** The indexing services view of the universe. */
public interface IndexStoreView
{
    /**
     * Retrieve all nodes in the database which have got one or more of the given labels AND
     * one or more of the given property key ids. This scan additionally accepts a consumer
     * for label updates for a joint scan.
     *
     * @param labelIds array of label ids to generate updates for. Empty array means all.
     * This filter is used only for property scan consumer and not for label scan consumer.
     * @param propertyKeyIdFilter property key ids to generate updates for.
     * This filter is used only for property scan consumer and not for label scan consumer.
     * @param propertyScanConsumer a consumer of a scan over nodes generating a tuple of
     * node id, labels and property map for each scanned node.
     * @param labelScanConsumer a consumer of a scan over nodes generating a tuple of node id and labels
     * for each scanned node.
     * @param forceStoreScan overrides decision about which source to scan from. If {@code true}
     * then store scan will be used, otherwise if {@code false} then the best suited will be used.
     * @param parallelWrite whether or not the visitors can be called by multiple threads concurrently.
     * @param cacheTracer underlying page cursor events tracer.
     * @return a {@link StoreScan} to start and to stop the scan.
     */
    StoreScan visitNodes( int[] labelIds, IntPredicate propertyKeyIdFilter, PropertyScanConsumer propertyScanConsumer, TokenScanConsumer labelScanConsumer,
            boolean forceStoreScan, boolean parallelWrite, PageCacheTracer cacheTracer, MemoryTracker memoryTracker );

    /**
     * Retrieve all relationships in the database which have any of the the given relationship types AND
     * one or more of the given property key ids. This scan additionally accepts a consumer
     * for relationship type updates for a joint scan.
     *
     * @param relationshipTypeIds array of relationship type ids to generate updates for. Empty array means all.
     * This filter is used only for property scan consumer and not for relationship type scan consumer.
     * @param propertyKeyIdFilter property key ids to generate updates for.
     * This filter is used only for property scan consumer and not for relationship type scan consumer.
     * @param propertyScanConsumer a consumer of a scan over relationships generating a tuple of
     * relationship id, relationshipType and property map for each scanned relationship.
     * @param relationshipTypeScanConsumer a consumer of a scan over relationships generating a tuple of
     * relationship id and relationshipType for each scanned relationship.
     * @param forceStoreScan overrides decision about which source to scan from. If {@code true}
     * then store scan will be used, otherwise if {@code false} then the best suited will be used.
     * @param parallelWrite whether or not the visitors can be called by multiple threads concurrently.
     * @param cacheTracer underlying page cursor events tracer.
     * @return a {@link StoreScan} to start and to stop the scan.
     */
    StoreScan visitRelationships( int[] relationshipTypeIds, IntPredicate propertyKeyIdFilter,
            PropertyScanConsumer propertyScanConsumer, TokenScanConsumer relationshipTypeScanConsumer,
            boolean forceStoreScan, boolean parallelWrite, PageCacheTracer cacheTracer, MemoryTracker memoryTracker );

    NodePropertyAccessor newPropertyAccessor( CursorContext cursorContext, MemoryTracker memoryTracker );

    StoreScan EMPTY_SCAN = new StoreScan()
    {
        @Override
        public void run( ExternalUpdatesCheck externalUpdatesCheck )
        {
        }

        @Override
        public void stop()
        {
        }

        @Override
        public PopulationProgress getProgress()
        {
            return PopulationProgress.DONE;
        }
    };

    IndexStoreView EMPTY = new Adaptor();

    boolean isEmpty();

    class Adaptor implements IndexStoreView
    {
        @Override
        public StoreScan visitNodes( int[] labelIds, IntPredicate propertyKeyIdFilter, PropertyScanConsumer propertyScanConsumer,
                TokenScanConsumer labelScanConsumer, boolean forceStoreScan, boolean parallelWrite, PageCacheTracer cacheTracer,
                MemoryTracker memoryTracker )
        {
            return EMPTY_SCAN;
        }

        @Override
        public StoreScan visitRelationships( int[] relationshipTypeIds, IntPredicate propertyKeyIdFilter, PropertyScanConsumer propertyScanConsumer,
                TokenScanConsumer relationshipTypeScanConsumer, boolean forceStoreScan, boolean parallelWrite, PageCacheTracer cacheTracer,
                MemoryTracker memoryTracker )
        {
            return EMPTY_SCAN;
        }

        @Override
        public NodePropertyAccessor newPropertyAccessor( CursorContext cursorContext, MemoryTracker memoryTracker )
        {
            return NodePropertyAccessor.EMPTY;
        }

        @Override
        public boolean isEmpty()
        {
            return true;
        }
    }
}
