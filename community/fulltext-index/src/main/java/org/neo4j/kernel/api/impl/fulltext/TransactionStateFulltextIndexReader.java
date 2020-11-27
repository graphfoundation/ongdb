/*
 * Copyright (c) 2002-2020 "Neo4j,"
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

import org.apache.lucene.queryparser.classic.ParseException;
import org.eclipse.collections.api.set.primitive.MutableLongSet;

import org.neo4j.io.IOUtils;
import org.neo4j.values.storable.Value;

import static java.util.Arrays.asList;
import static org.neo4j.kernel.api.impl.fulltext.ScoreEntityIterator.mergeIterators;

class TransactionStateFulltextIndexReader extends FulltextIndexReader
{
    private final FulltextIndexReader baseReader;
    private final FulltextIndexReader nearRealTimeReader;
    private final MutableLongSet modifiedEntityIdsInThisTransaction;

    TransactionStateFulltextIndexReader( FulltextIndexReader baseReader, FulltextIndexReader nearRealTimeReader,
            MutableLongSet modifiedEntityIdsInThisTransaction )
    {
        this.baseReader = baseReader;
        this.nearRealTimeReader = nearRealTimeReader;
        this.modifiedEntityIdsInThisTransaction = modifiedEntityIdsInThisTransaction;
    }

    @Override
    public ScoreEntityIterator query( String query ) throws ParseException
    {
        ScoreEntityIterator iterator = baseReader.query( query );
        iterator = iterator.filter( entry -> !modifiedEntityIdsInThisTransaction.contains( entry.entityId() ) );
        iterator = mergeIterators( asList( iterator, nearRealTimeReader.query( query ) ) );
        return iterator;
    }

    @Override
    public ScoreEntityIterator query( String query, FulltextQueryConfig queryConfig ) throws ParseException
    {
        ScoreEntityIterator iterator = baseReader.query( query, queryConfig );
        iterator = iterator.filter( entry -> !modifiedEntityIdsInThisTransaction.contains( entry.entityId() ) );
        iterator = mergeIterators( asList( iterator, nearRealTimeReader.query( query, queryConfig ) ) );
        return iterator;
    }

    /**
     * Used to determine the count when the queried documents have been changed within the transaction.
     *
     * Currently relies on actually querying (searching) Lucene, retrieving a ScoreEntityIterator, and then counting the results.
     * Although this solution does work, could this be improved? Avoid querying for documents and traversing an iterator?
     *
     * Seems like there is no good way to determine the updated count of documents without searching the changed documents.
     * Is it not possible determine updated count from the baseRead and nearRealTimeReader counts alone? Necessary to search Lucene?
     */
    @Override
    public CountResult queryForCount( String query ) throws ParseException
    {
        long count = query( query ).stream().count();
        return new CountResult( count );
    }

    @Override
    public long countIndexedNodes( long nodeId, int[] propertyKeyIds, Value... propertyValues )
    {
        // This is only used in the Consistency Checker. We don't need to worry about this here.
        return 0;
    }

    @Override
    public void close()
    {
        // The 'baseReader' is managed by the kernel, so we don't need to close it here.
        IOUtils.closeAllUnchecked( nearRealTimeReader );
    }
}
