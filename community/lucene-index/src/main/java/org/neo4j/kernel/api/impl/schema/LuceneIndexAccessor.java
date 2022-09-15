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
package org.neo4j.kernel.api.impl.schema;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.ToLongFunction;

import org.neo4j.common.TokenNameLookup;
import org.neo4j.internal.helpers.collection.BoundedIterable;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.impl.index.AbstractLuceneIndexAccessor;
import org.neo4j.kernel.api.index.IndexEntriesReader;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.kernel.api.index.ValueIndexReader;
import org.neo4j.kernel.impl.api.LuceneIndexValueValidator;
import org.neo4j.kernel.impl.api.index.IndexUpdateMode;
import org.neo4j.kernel.impl.index.schema.IndexUpdateIgnoreStrategy;
import org.neo4j.storageengine.api.NodePropertyAccessor;
import org.neo4j.values.storable.Value;

public class LuceneIndexAccessor extends AbstractLuceneIndexAccessor<ValueIndexReader,SchemaIndex>
{

    private final LuceneIndexValueValidator valueValidator;

    public LuceneIndexAccessor( SchemaIndex luceneIndex, IndexDescriptor descriptor, TokenNameLookup tokenNameLookup, IndexUpdateIgnoreStrategy ignoreStrategy )
    {
        super( luceneIndex, descriptor, ignoreStrategy );
        this.valueValidator = new LuceneIndexValueValidator( descriptor, tokenNameLookup );
    }

    @Override
    protected IndexUpdater getIndexUpdater( IndexUpdateMode mode )
    {
        return new LuceneSchemaIndexUpdater( mode.requiresIdempotency(), mode.requiresRefresh() );
    }

    @Override
    public BoundedIterable<Long> newAllEntriesValueReader( long fromIdInclusive, long toIdExclusive, CursorContext cursorContext )
    {
        return super.newAllEntriesReader( LuceneDocumentStructure::getNodeId, fromIdInclusive, toIdExclusive );
    }

    @Override
    public IndexEntriesReader[] newAllEntriesValueReader( ToLongFunction<Document> entityIdReader, int numPartitions )
    {
        return super.newAllEntriesValueReader( LuceneDocumentStructure::getNodeId, numPartitions );
    }

    @Override
    public void verifyDeferredConstraints( NodePropertyAccessor nodePropertyAccessor )
            throws IndexEntryConflictException
    {
        try
        {
            luceneIndex.verifyUniqueness( nodePropertyAccessor, descriptor.schema().getPropertyIds() );
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    @Override
    public void validateBeforeCommit( long entityId, Value[] tuple )
    {
        valueValidator.validate( entityId, tuple );
    }

    private class LuceneSchemaIndexUpdater extends AbstractLuceneIndexUpdater
    {

        LuceneSchemaIndexUpdater( boolean idempotent, boolean refresh )
        {
            super( idempotent, refresh );
        }

        @Override
        protected void addIdempotent( long entityId, Value[] values )
        {
            try
            {
                Document document = LuceneDocumentStructure.documentRepresentingProperties( entityId, values );
                writer.updateOrDeleteDocument( LuceneDocumentStructure.newTermForChangeOrRemove( entityId ), document );
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }
        }

        @Override
        protected void add( long entityId, Value[] values )
        {
            try
            {
                Document document = LuceneDocumentStructure.documentRepresentingProperties( entityId, values );
                writer.nullableAddDocument( document );
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }
        }

        @Override
        protected void change( long entityId, Value[] values )
        {
            try
            {
                Term term = LuceneDocumentStructure.newTermForChangeOrRemove( entityId );
                Document document = LuceneDocumentStructure.documentRepresentingProperties( entityId, values );
                writer.updateOrDeleteDocument( term, document );
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }
        }

        @Override
        protected void remove( long entityId )
        {
            try
            {
                Term term = LuceneDocumentStructure.newTermForChangeOrRemove( entityId );
                writer.deleteDocuments( term );
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }
        }
    }
}
