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
package org.neo4j.kernel.api.impl.schema.populator;

import java.io.IOException;
import java.io.UncheckedIOException;

import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.impl.schema.SchemaIndex;
import org.neo4j.kernel.api.index.IndexSample;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.kernel.api.index.UniqueIndexSampler;
import org.neo4j.kernel.impl.index.schema.IndexUpdateIgnoreStrategy;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.NodePropertyAccessor;

/**
 * A {@link LuceneIndexPopulator} used for unique Lucene schema indexes.
 * Performs sampling using {@link UniqueIndexSampler}.
 * Verifies uniqueness of added and changed values using
 * {@link SchemaIndex#verifyUniqueness(NodePropertyAccessor, int[])} method.
 */
public class UniqueLuceneIndexPopulator extends LuceneIndexPopulator<SchemaIndex>
{
    private final int[] propertyKeyIds;
    private final UniqueIndexSampler sampler;

    public UniqueLuceneIndexPopulator( SchemaIndex index, IndexDescriptor descriptor, IndexUpdateIgnoreStrategy ignoreStrategy )
    {
        super( index, ignoreStrategy );
        this.propertyKeyIds = descriptor.schema().getPropertyIds();
        this.sampler = new UniqueIndexSampler();
    }

    @Override
    public void verifyDeferredConstraints( NodePropertyAccessor accessor ) throws IndexEntryConflictException
    {
        try
        {
            luceneIndex.verifyUniqueness( accessor, propertyKeyIds );
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    @Override
    public IndexUpdater newPopulatingUpdater( final NodePropertyAccessor accessor, CursorContext cursorContext )
    {
        return new UniqueLuceneIndexPopulatingUpdater( writer, propertyKeyIds, luceneIndex, accessor, sampler, ignoreStrategy );
    }

    @Override
    public void includeSample( IndexEntryUpdate<?> update )
    {
        sampler.increment( 1 );
    }

    @Override
    public IndexSample sample( CursorContext cursorContext )
    {
        return sampler.result();
    }
}
