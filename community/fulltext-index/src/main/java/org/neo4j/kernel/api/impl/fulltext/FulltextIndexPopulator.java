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
package org.neo4j.kernel.api.impl.fulltext;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Collection;
import java.util.Map;

import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.impl.index.DatabaseIndex;
import org.neo4j.kernel.api.impl.schema.populator.LuceneIndexPopulator;
import org.neo4j.kernel.api.index.IndexSample;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.kernel.impl.index.schema.IndexUpdateIgnoreStrategy;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.NodePropertyAccessor;
import org.neo4j.storageengine.api.ValueIndexEntryUpdate;
import org.neo4j.values.storable.Value;

public class FulltextIndexPopulator extends LuceneIndexPopulator<DatabaseIndex<FulltextIndexReader>>
{
    private final IndexDescriptor descriptor;
    private final String[] propertyNames;

    FulltextIndexPopulator( IndexDescriptor descriptor, DatabaseIndex<FulltextIndexReader> luceneFulltext, String[] propertyNames,
                            IndexUpdateIgnoreStrategy ignoreStrategy )
    {
        super( luceneFulltext, ignoreStrategy );
        this.descriptor = descriptor;
        this.propertyNames = propertyNames;
    }

    @Override
    public void add( Collection<? extends IndexEntryUpdate<?>> updates, CursorContext cursorContext )
    {
        try
        {
            for ( IndexEntryUpdate<?> update : updates )
            {
                final var valueUpdate = (ValueIndexEntryUpdate<?>) update;
                if ( ignoreStrategy.ignore( valueUpdate.values() ) )
                {
                    continue;
                }

                writer.updateOrDeleteDocument( LuceneFulltextDocumentStructure.newTermForChangeOrRemove( valueUpdate.getEntityId() ),
                                               updateAsDocument( valueUpdate ) );
            }
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    @Override
    public void verifyDeferredConstraints( NodePropertyAccessor propertyAccessor )
    {
        //Fulltext index does not care about constraints.
    }

    @Override
    public IndexUpdater newPopulatingUpdater( NodePropertyAccessor accessor, CursorContext cursorContext )
    {
        return new PopulatingFulltextIndexUpdater();
    }

    @Override
    public void includeSample( IndexEntryUpdate<?> update )
    {
        //Index sampling is not our thing, really.
    }

    @Override
    public IndexSample sample( CursorContext cursorContext )
    {
        return new IndexSample();
    }

    @Override
    public Map<String,Value> indexConfig()
    {
        return descriptor.getIndexConfig().asMap();
    }

    private Document updateAsDocument( ValueIndexEntryUpdate<?> update )
    {
        return LuceneFulltextDocumentStructure.documentRepresentingProperties( update.getEntityId(), propertyNames, update.values() );
    }

    private class PopulatingFulltextIndexUpdater implements IndexUpdater
    {
        @Override
        public void process( IndexEntryUpdate<?> update )
        {
            ValueIndexEntryUpdate<?> valueUpdate = asValueUpdate( update );
            if ( ignoreStrategy.ignore( valueUpdate ) )
            {
                return;
            }
            try
            {
                long nodeId = valueUpdate.getEntityId();
                Term term = LuceneFulltextDocumentStructure.newTermForChangeOrRemove( nodeId );
                switch ( valueUpdate.updateMode() )
                {
                case ADDED:
                case CHANGED:
                    luceneIndex.getIndexWriter().updateOrDeleteDocument( term,
                            LuceneFulltextDocumentStructure.documentRepresentingProperties( nodeId, propertyNames, valueUpdate.values() ) );
                    break;
                case REMOVED:
                    luceneIndex.getIndexWriter().deleteDocuments( term );
                    break;
                default:
                    throw new UnsupportedOperationException();
                }
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }
        }

        @Override
        public void close()
        {
        }
    }
}
