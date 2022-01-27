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
package org.neo4j.kernel.impl.index.schema;

import org.neo4j.gis.spatial.index.curves.StandardConfiguration;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.kernel.api.index.IndexDirectoryStructure;
import org.neo4j.kernel.api.schema.index.TestIndexDescriptorFactory;

import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.kernel.impl.index.schema.PointIndexProvider.DESCRIPTOR;

class PointAccessorTilesTest extends BaseAccessorTilesTest<PointKey>
{
    @Override
    IndexDescriptor createDescriptor()
    {
        return TestIndexDescriptorFactory.forLabel( IndexType.POINT, 1, 1 );
    }

    @Override
    NativeIndexAccessor<PointKey> createAccessor()
    {
        IndexDirectoryStructure directoryStructure = IndexDirectoryStructure.directoriesByProvider( directory.homePath() ).forProvider( DESCRIPTOR );
        IndexFiles indexFiles = new IndexFiles.Directory( fs, directoryStructure, descriptor.getId() );
        PointLayout layout = new PointLayout( indexSettings );
        RecoveryCleanupWorkCollector collector = RecoveryCleanupWorkCollector.ignore();
        DatabaseIndexContext databaseIndexContext = DatabaseIndexContext.builder( pageCache, fs, DEFAULT_DATABASE_NAME ).build();
        StandardConfiguration configuration = new StandardConfiguration();
        return new PointIndexAccessor( databaseIndexContext, indexFiles, layout, collector, descriptor, indexSettings, configuration );
    }
}
