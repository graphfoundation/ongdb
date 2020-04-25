/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2020 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.kernel.impl.api.index.updater;

import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.kernel.impl.api.index.stats.IndexStatisticsStore;
import org.neo4j.storageengine.api.IndexEntryUpdate;

public class UpdateCountingIndexUpdater implements IndexUpdater
{
    private final IndexStatisticsStore indexStatisticsStore;
    private final long indexId;
    private final IndexUpdater delegate;
    private long updates;

    public UpdateCountingIndexUpdater( IndexStatisticsStore indexStatisticsStore, long indexId, IndexUpdater delegate )
    {
        this.indexStatisticsStore = indexStatisticsStore;
        this.indexId = indexId;
        this.delegate = delegate;
    }

    @Override
    public void process( IndexEntryUpdate<?> update ) throws IndexEntryConflictException
    {
        delegate.process( update );
        updates++;
    }

    @Override
    public void close() throws IndexEntryConflictException
    {
        delegate.close();
        indexStatisticsStore.incrementIndexUpdates( indexId, updates );
    }
}
