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

import org.apache.lucene.document.Document;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;

import org.neo4j.io.IOUtils;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.impl.index.DatabaseIndex;
import org.neo4j.kernel.api.impl.schema.LuceneDocumentStructure;
import org.neo4j.kernel.api.impl.schema.writer.LuceneIndexWriter;
import org.neo4j.kernel.api.index.IndexPopulator;
import org.neo4j.kernel.impl.index.schema.IndexUpdateIgnoreStrategy;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.ValueIndexEntryUpdate;

/**
 * An {@link IndexPopulator} used to create, populate and mark as online a Lucene schema index.
 */
public abstract class LuceneIndexPopulator<INDEX extends DatabaseIndex<?>> implements IndexPopulator
{
    protected final IndexUpdateIgnoreStrategy ignoreStrategy;
    protected INDEX luceneIndex;
    protected LuceneIndexWriter writer;

    protected LuceneIndexPopulator( INDEX luceneIndex, IndexUpdateIgnoreStrategy ignoreStrategy )
    {
        this.luceneIndex = luceneIndex;
        this.ignoreStrategy = ignoreStrategy;
    }

    @Override
    public void create()
    {
        try
        {
            luceneIndex.create();
            luceneIndex.open();
            writer = luceneIndex.getIndexWriter();
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    @Override
    public void drop()
    {
        luceneIndex.drop();
    }

    @Override
    public void add( Collection<? extends IndexEntryUpdate<?>> updates, CursorContext cursorContext )
    {
        assert updatesForCorrectIndex( updates );

        try
        {
            // Lucene documents stored in a ThreadLocal and reused so we can't create an eager collection of documents here
            // That is why we create a lazy Iterator and then Iterable
            writer.addDocuments( updates.size(), () -> updates.stream()
                    .map( u -> (ValueIndexEntryUpdate<?>) u )
                    .filter( Predicate.not( ignoreStrategy::ignore ) )
                    .map( LuceneIndexPopulator::updateAsDocument )
                    .filter( Objects::nonNull )
                    .iterator() );
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    @Override
    public void close( boolean populationCompletedSuccessfully, CursorContext cursorContext )
    {
        try
        {
            if ( populationCompletedSuccessfully )
            {
                luceneIndex.markAsOnline();
            }
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
        finally
        {
            IOUtils.closeAllSilently( luceneIndex );
        }
    }

    @Override
    public void markAsFailed( String failure )
    {
        try
        {
            luceneIndex.markAsFailed( failure );
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    private boolean updatesForCorrectIndex( Collection<? extends IndexEntryUpdate<?>> updates )
    {
        for ( IndexEntryUpdate<?> update : updates )
        {
            if ( !update.indexKey().schema().equals( luceneIndex.getDescriptor().schema() ) )
            {
                return false;
            }
        }
        return true;
    }

    private static Document updateAsDocument( ValueIndexEntryUpdate<?> update )
    {
        return LuceneDocumentStructure.documentRepresentingProperties( update.getEntityId(), update.values() );
    }
}
