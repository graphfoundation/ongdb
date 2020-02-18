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

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.Sort;
import org.apache.lucene.search.SortField;
import org.apache.lucene.search.SortedNumericSortField;
import org.apache.lucene.search.TotalHitCountCollector;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import org.neo4j.kernel.api.impl.index.collector.DocValuesCollector;
import org.neo4j.kernel.api.impl.index.collector.ValuesIterator;
import org.neo4j.kernel.api.impl.schema.reader.IndexReaderCloseException;
import org.neo4j.kernel.impl.core.TokenHolder;
import org.neo4j.values.storable.Value;

/**
 * Lucene index reader that is able to read/sample a single partition of a partitioned Lucene index.
 *
 * @see PartitionedFulltextIndexReader
 */
class SimpleFulltextIndexReader extends FulltextIndexReader
{
    private final SearcherReference searcherRef;
    private final Analyzer analyzer;
    private final TokenHolder propertyKeyTokenHolder;
    private final String[] properties;

    private final String[] sortProperties;
    private final Map<String,String> sortTypes;

    SimpleFulltextIndexReader( SearcherReference searcherRef, String[] properties, Analyzer analyzer, TokenHolder propertyKeyTokenHolder,
                               String[] sortProperties, Map<String,String> sortTypes )
    {
        this.searcherRef = searcherRef;
        this.analyzer = analyzer;
        this.propertyKeyTokenHolder = propertyKeyTokenHolder;
        this.properties = properties;
        this.sortProperties = sortProperties;
        this.sortTypes = sortTypes;
    }

    @Override
    public void close()
    {
        try
        {
            searcherRef.close();
        }
        catch ( IOException e )
        {
            throw new IndexReaderCloseException( e );
        }
    }

    @Override
    public ScoreEntityIterator query( String queryString ) throws ParseException
    {
        MultiFieldQueryParser multiFieldQueryParser = new MultiFieldQueryParser( properties, analyzer );
        multiFieldQueryParser.setAllowLeadingWildcard( true );
        Query query = multiFieldQueryParser.parse( queryString );
        return indexQuery( query );
    }

    @Override
    public ScoreEntityIterator queryWithSort( String queryString, String sortField, String sortDirection ) throws ParseException
    {
        MultiFieldQueryParser multiFieldQueryParser = new MultiFieldQueryParser( properties, analyzer );
        multiFieldQueryParser.setAllowLeadingWildcard( true );
        Query query = multiFieldQueryParser.parse( queryString );
        return indexQueryWithSort( query, sortField, sortDirection );
    }

    private ScoreEntityIterator indexQuery( Query query )
    {
        try
        {
            DocValuesCollector docValuesCollector = new DocValuesCollector( true );
            getIndexSearcher().search( query, docValuesCollector );
            ValuesIterator sortedValuesIterator =
                    docValuesCollector.getSortedValuesIterator( LuceneFulltextDocumentStructure.FIELD_ENTITY_ID, Sort.RELEVANCE );
            return new ScoreEntityIterator( sortedValuesIterator );
        }
        catch ( IOException e )
        {
            throw new RuntimeException( e );
        }
    }

    private ScoreEntityIterator indexQueryWithSort( Query query, String sortFieldString, String sortDirection )
    {
        try
        {
            boolean reverseSortOrder = determineSortDirection( sortDirection );

            Sort sort;
            if ( Arrays.asList( sortProperties ).contains( sortFieldString ) )
            {
                sort = buildSort( sortFieldString, reverseSortOrder );
            }
            else if ( Arrays.asList( properties ).contains( sortFieldString ) )
            {
                sort = new Sort( new SortField( sortFieldString + LuceneFulltextDocumentStructure.FIELD_FULLTEXT_SORT_SUFFIX, SortField.Type.STRING,
                                                reverseSortOrder ) );
            }
            else
            {
                throw new IOException( "Sort Field '" + sortFieldString + "' is not an indexed property." );
            }

            DocValuesCollector docValuesCollector = new DocValuesCollector( true );
            getIndexSearcher().search( query, docValuesCollector );
            ValuesIterator sortedValuesIterator =
                    docValuesCollector.getSortedValuesIterator( LuceneFulltextDocumentStructure.FIELD_ENTITY_ID, sort );
            return new ScoreEntityIterator( sortedValuesIterator );
        }
        catch ( IOException e )
        {
            throw new RuntimeException( e );
        }
    }

    private Sort buildSort( String sortFieldString, boolean reverseSortOrder ) throws IOException
    {

        if ( sortTypes != null && sortTypes.containsKey( sortFieldString ) )
        {
            SortField sortField;
            String sortType = sortTypes.get( sortFieldString );

            FulltextSortType sortTypeEnum = FulltextSortType.valueOfIgnoreCase( sortType );

            if ( sortTypeEnum == null )
            {
                throw new RuntimeException( "Unable to determine sortField type '" + sortType + "'." );
            }

            switch ( sortTypeEnum )
            {
            case LONG:
                sortField = new SortedNumericSortField( sortFieldString, SortField.Type.LONG, reverseSortOrder );
                if ( !reverseSortOrder )
                {
                    sortField.setMissingValue( Long.MAX_VALUE );
                }
                break;
            case DOUBLE:
                sortField = new SortedNumericSortField( sortFieldString, SortField.Type.DOUBLE, reverseSortOrder );
                if ( !reverseSortOrder )
                {
                    sortField.setMissingValue( Double.MAX_VALUE );
                }
                break;
            case STRING:
                sortField = new SortField( sortFieldString, SortField.Type.STRING, reverseSortOrder );
                if ( !reverseSortOrder )
                {
                    sortField.setMissingValue( SortField.STRING_LAST );
                }
                break;
            default:
                throw new IOException( "Unable to determine sortField type '" + sortType + "'." );
            }

            return new Sort( sortField );
        }
        throw new IOException( "Either sortTypes map is null or sortField '" + sortFieldString + "' is not in sortTypes." );
    }

    // Returns boolean that is used by SortField. If true then it reverses sort direction
    private boolean determineSortDirection( String sortDirection ) throws IOException
    {
        FulltextSortDirection fulltextSortDirection = FulltextSortDirection.valueOfIgnoreCase( sortDirection );

        if ( fulltextSortDirection == null )
        {
            throw new IOException( "Sort Direction '" + sortDirection + "' is invalid. Valid sort directions are 'ASC' (default) and 'DESC'." );
        }

        switch ( fulltextSortDirection )
        {
        case ASC:
            return false;
        case DESC:
            return true;
        default:
            throw new IOException( "Sort Direction '" + sortDirection + "' is invalid. Valid sort directions are 'ASC' (default) and 'DESC'." );
        }
    }

    private IndexSearcher getIndexSearcher()
    {
        return searcherRef.getIndexSearcher();
    }

    @Override
    public long countIndexedNodes( long nodeId, int[] propertyKeyIds, Value... propertyValues )
    {
        try
        {
            String[] propertyKeys = new String[propertyKeyIds.length];
            for ( int i = 0; i < propertyKeyIds.length; i++ )
            {
                propertyKeys[i] = propertyKeyTokenHolder.getTokenById( propertyKeyIds[i] ).name();
            }
            Query query = LuceneFulltextDocumentStructure.newCountNodeEntriesQuery( nodeId, propertyKeys, propertyValues );
            TotalHitCountCollector collector = new TotalHitCountCollector();
            getIndexSearcher().search( query, collector );
            return collector.getTotalHits();
        }
        catch ( Exception e )
        {
            throw new RuntimeException( e );
        }
    }
}
