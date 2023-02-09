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
package org.neo4j.kernel.impl.api.index;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.kernel.api.schema.SchemaTestUtil;
import org.neo4j.kernel.impl.api.index.MultipleIndexPopulator.IndexPopulation;
import org.neo4j.kernel.impl.api.index.stats.IndexStatisticsStore;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;

class PopulatingIndexProxyTest
{
    private final IndexDescriptor index = IndexPrototype.forSchema( SchemaDescriptors.forLabel( 1, 2 ) ).withName( "index" ).materialise( 13 );
    private final IndexProxyStrategy indexProxyStrategy =
            new ValueIndexProxyStrategy( index, mock( IndexStatisticsStore.class ), SchemaTestUtil.SIMPLE_NAME_LOOKUP );
    private final IndexPopulationJob indexPopulationJob = mock( IndexPopulationJob.class );
    private final IndexPopulation indexPopulation = mock( IndexPopulation.class );
    private PopulatingIndexProxy populatingIndexProxy;

    @BeforeEach
    void setUp()
    {
        populatingIndexProxy = new PopulatingIndexProxy( indexProxyStrategy, indexPopulationJob, indexPopulation );
    }

    @Test
    void stopPopulationJobOnClose()
    {
        populatingIndexProxy.close( NULL );

        verify( indexPopulationJob ).stop( indexPopulation, NULL );
    }

    @Test
    void cancelPopulationJobOnDrop()
    {
        populatingIndexProxy.drop();

        verify( indexPopulationJob ).dropPopulation( indexPopulation );
    }
}
