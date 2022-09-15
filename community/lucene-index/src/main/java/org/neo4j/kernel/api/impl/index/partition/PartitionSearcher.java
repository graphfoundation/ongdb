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
package org.neo4j.kernel.api.impl.index.partition;

import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.ReferenceManager;

import java.io.IOException;

import org.neo4j.kernel.api.impl.index.SearcherReference;

/**
 * Container for {@link IndexSearcher} of the particular {@link AbstractIndexPartition partition}.
 * Manages lifecycle of the underlying {@link IndexSearcher searcher}.
 */
public class PartitionSearcher implements SearcherReference
{
    private Neo4jIndexSearcher indexSearcher;
    private ReferenceManager<IndexSearcher> referenceManager;

    public PartitionSearcher( ReferenceManager<IndexSearcher> referenceManager ) throws IOException
    {
        this.referenceManager = referenceManager;
        this.indexSearcher = (Neo4jIndexSearcher) referenceManager.acquire();
        this.indexSearcher.setQueryCache( null );
    }

    @Override
    public Neo4jIndexSearcher getIndexSearcher()
    {
        return indexSearcher;
    }

    @Override
    public void close() throws IOException
    {
        referenceManager.release( indexSearcher );
    }
}
