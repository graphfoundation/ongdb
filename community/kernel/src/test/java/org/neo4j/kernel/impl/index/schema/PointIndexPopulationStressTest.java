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

import org.neo4j.internal.schema.IndexType;

import static org.neo4j.configuration.Config.defaults;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.values.storable.ValueType.CARTESIAN_POINT;
import static org.neo4j.values.storable.ValueType.CARTESIAN_POINT_3D;
import static org.neo4j.values.storable.ValueType.GEOGRAPHIC_POINT;
import static org.neo4j.values.storable.ValueType.GEOGRAPHIC_POINT_3D;

class PointIndexPopulationStressTest extends IndexPopulationStressTest
{

    PointIndexPopulationStressTest()
    {
        super( true, randomValues -> randomValues.nextValueOfTypes( GEOGRAPHIC_POINT, GEOGRAPHIC_POINT_3D, CARTESIAN_POINT, CARTESIAN_POINT_3D ), test ->
        {
            DatabaseIndexContext context = DatabaseIndexContext.builder( test.pageCache, test.fs, DEFAULT_DATABASE_NAME ).build();
            return new PointIndexProvider( context, test.directory(), immediate(), defaults() );
        } );
    }

    @Override
    IndexType indexType()
    {
        return IndexType.POINT;
    }
}
