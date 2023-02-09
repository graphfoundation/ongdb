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
package org.neo4j.internal.batchimport;

import org.neo4j.internal.batchimport.cache.idmapping.IdMapper;
import org.neo4j.internal.batchimport.input.Collector;
import org.neo4j.internal.batchimport.staging.LonelyProcessingStep;
import org.neo4j.internal.batchimport.staging.StageControl;
import org.neo4j.internal.batchimport.staging.Step;
import org.neo4j.internal.batchimport.stats.StatsProvider;
import org.neo4j.internal.helpers.progress.ProgressListener;

/**
 * Preparation of an {@link IdMapper}, {@link IdMapper#prepare(PropertyValueLookup, Collector, ProgressListener)}
 * under running as a normal {@link Step} so that normal execution monitoring can be applied.
 * Useful since preparing an {@link IdMapper} can take a significant amount of time.
 */
public class IdMapperPreparationStep extends LonelyProcessingStep
{
    private final IdMapper idMapper;
    private final PropertyValueLookup allIds;
    private final Collector collector;

    public IdMapperPreparationStep( StageControl control, Configuration config,
            IdMapper idMapper, PropertyValueLookup allIds, Collector collector,
            StatsProvider... additionalStatsProviders )
    {
        super( control, "" /*named later in the progress listener*/, config, additionalStatsProviders );
        this.idMapper = idMapper;
        this.allIds = allIds;
        this.collector = collector;
    }

    @Override
    protected void process()
    {
        idMapper.prepare( allIds, collector, new ProgressListener.Adapter()
        {
            @Override
            public void started( String task )
            {
                changeName( task );
            }

            @Override
            public void failed( Throwable e )
            {
                issuePanic( e );
            }

            @Override
            public synchronized void add( long progress )
            {   // Directly feed into the progress of this step.
                // Expected to be called by multiple threads, although quite rarely,
                // so synchronization overhead should be negligible.
                progress( progress );
            }

            @Override
            public void done()
            {   // Nothing to do
            }
        } );
    }
}
