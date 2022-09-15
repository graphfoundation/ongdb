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

import org.neo4j.common.TokenNameLookup;
import org.neo4j.configuration.Config;
import org.neo4j.gis.spatial.index.curves.StandardConfiguration;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.impl.index.schema.config.IndexSpecificSpaceFillingCurveSettings;

import static org.neo4j.io.memory.ByteBufferFactory.heapBufferFactory;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

class NativeIndexPopulatorTestCases
{
    private static final Config config = Config.defaults();
    static final IndexSpecificSpaceFillingCurveSettings spaceFillingCurveSettings = IndexSpecificSpaceFillingCurveSettings.fromConfig( config );
    private static final StandardConfiguration configuration = new StandardConfiguration();

    static PopulatorFactory<BtreeKey> genericBlockBasedPopulatorFactory()
    {
        return ( nativeIndexContext, storeFile, layout, descriptor, tokenNameLookup ) ->
                new GenericBlockBasedIndexPopulator( nativeIndexContext, storeFile, layout, descriptor, spaceFillingCurveSettings, configuration, false,
                        heapBufferFactory( 10 * 1024 ), config, INSTANCE, tokenNameLookup );
    }

    static NativeIndexPopulatorTestCases.PopulatorFactory<RangeKey> rangeBlockBasedPopulatorFactory()
    {
        return ( nativeIndexContext, storeFile, layout, descriptor, tokenNameLookup ) ->
                new RangeBlockBasedIndexPopulator( nativeIndexContext, storeFile, layout, descriptor, false,
                        heapBufferFactory( 10 * 1024 ), config, INSTANCE, tokenNameLookup );
    }

    @FunctionalInterface
    public interface PopulatorFactory<KEY extends NativeIndexKey<KEY>>
    {
        NativeIndexPopulator<KEY> create( DatabaseIndexContext databaseIndexContext, IndexFiles indexFiles, IndexLayout<KEY> layout,
                IndexDescriptor descriptor, TokenNameLookup tokenNameLookup ) throws IOException;
    }
}
