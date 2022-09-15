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
package org.neo4j.kernel.api.impl.schema.writer;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;

import java.io.IOException;

/**
 * A thin wrapper around {@link org.apache.lucene.index.IndexWriter} that exposes only some part of it's
 * functionality that it really needed and hides a fact that index is partitioned.
 */
public interface LuceneIndexWriter
{
    void addDocument( Document document ) throws IOException;

    void addDocuments( int numDocs, Iterable<Document> document ) throws IOException;

    void updateDocument( Term term, Document document ) throws IOException;

    void deleteDocuments( Term term ) throws IOException;

    void deleteDocuments( Query query ) throws IOException;

    /**
     * addDocument variant that can handle adds where the document to add has become empty
     * (this can happen if properties doesn't have a value type we support).
     */
    default void nullableAddDocument( Document document ) throws IOException
    {
        if ( document != null )
        {
            addDocument( document );
        }
    }

    /**
     * updateDocument variant that handle updates where the document to update with has become empty and should be removed
     * (this can happen if properties doesn't have a value type we support).
     *
     * @param document The updated document or null if any existing version of it should be removed.
     */
    default void updateOrDeleteDocument( Term term, Document document ) throws IOException
    {
        if ( document != null )
        {
            updateDocument( term, document );
        }
        else
        {
            deleteDocuments( term );
        }
    }
}
