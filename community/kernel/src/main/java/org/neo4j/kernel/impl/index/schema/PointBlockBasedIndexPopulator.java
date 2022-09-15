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
package org.neo4j.kernel.impl.index.schema;

import org.neo4j.configuration.Config;
import org.neo4j.gis.spatial.index.curves.SpaceFillingCurveConfiguration;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.memory.ByteBufferFactory;
import org.neo4j.kernel.api.index.IndexValueValidator;
import org.neo4j.kernel.impl.index.schema.config.IndexSpecificSpaceFillingCurveSettings;
import org.neo4j.memory.MemoryTracker;

import static org.neo4j.kernel.impl.index.schema.PointIndexProvider.UPDATE_IGNORE_STRATEGY;

public class PointBlockBasedIndexPopulator extends BlockBasedIndexPopulator<PointKey>
{
    private final IndexSpecificSpaceFillingCurveSettings spatialSettings;
    private final SpaceFillingCurveConfiguration configuration;

    PointBlockBasedIndexPopulator( DatabaseIndexContext databaseIndexContext, IndexFiles indexFiles,
            IndexLayout<PointKey> layout, IndexDescriptor descriptor, IndexSpecificSpaceFillingCurveSettings spatialSettings,
            SpaceFillingCurveConfiguration configuration, boolean archiveFailedIndex,
            ByteBufferFactory bufferFactory, Config config, MemoryTracker memoryTracker )
    {
        super( databaseIndexContext, indexFiles, layout, descriptor, archiveFailedIndex, bufferFactory, config, memoryTracker );
        this.spatialSettings = spatialSettings;
        this.configuration = configuration;
    }

    PointBlockBasedIndexPopulator( DatabaseIndexContext databaseIndexContext, IndexFiles indexFiles,
            IndexLayout<PointKey> layout, IndexDescriptor descriptor, IndexSpecificSpaceFillingCurveSettings spatialSettings,
            SpaceFillingCurveConfiguration configuration, boolean archiveFailedIndex,
            ByteBufferFactory bufferFactory, Config config, MemoryTracker memoryTracker, BlockStorage.Monitor blockStorageMonitor )
    {
        super( databaseIndexContext, indexFiles, layout, descriptor, archiveFailedIndex, bufferFactory, config, memoryTracker, blockStorageMonitor );
        this.spatialSettings = spatialSettings;
        this.configuration = configuration;
    }

    @Override
    protected IndexValueValidator instantiateValueValidator()
    {
        // Validation is supposed to check that the to-be-added values fit into the index key.
        // This is always true for the point index, because it does not support composite keys
        // and the supported values have only two possible sizes - serialised 2D point
        // and serialised 3D point.
        // Size of either of them is well under GBP-tree key limit.
        return IndexValueValidator.NO_VALIDATION;
    }

    @Override
    NativeIndexReader<PointKey> newReader()
    {
        return new PointIndexReader( tree, layout, descriptor, spatialSettings, configuration );
    }

    @Override
    protected IndexUpdateIgnoreStrategy indexUpdateIgnoreStrategy()
    {
        return UPDATE_IGNORE_STRATEGY;
    }
}
