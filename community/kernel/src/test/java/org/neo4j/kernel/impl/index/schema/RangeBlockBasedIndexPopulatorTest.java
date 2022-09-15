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

import java.io.IOException;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.io.memory.ByteBufferFactory;
import org.neo4j.memory.MemoryTracker;

class RangeBlockBasedIndexPopulatorTest extends GenericBlockBasedIndexPopulatorTest<RangeKey>
{
    @Override
    IndexType indexType()
    {
        return IndexType.RANGE;
    }

    @Override
    BlockBasedIndexPopulator<RangeKey> instantiatePopulator( BlockStorage.Monitor monitor, ByteBufferFactory bufferFactory,
            MemoryTracker memoryTracker ) throws IOException
    {
        RangeLayout layout = layout();
        Config config = Config.defaults( GraphDatabaseInternalSettings.index_populator_merge_factor, 2 );
        RangeBlockBasedIndexPopulator populator =
                new RangeBlockBasedIndexPopulator( databaseIndexContext, indexFiles, layout, INDEX_DESCRIPTOR, false, bufferFactory, config, memoryTracker,
                        tokenNameLookup, monitor );
        populator.create();
        return populator;
    }

    @Override
    RangeLayout layout()
    {
        return new RangeLayout( 1 );
    }
}
