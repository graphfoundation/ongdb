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
package org.neo4j.kernel.api.index;

import java.util.Arrays;

public final class IndexSample
{
    private final long indexSize;
    private final long uniqueValues;
    private final long sampleSize;
    private final long updates;

    public IndexSample()
    {
        this( 0, 0, 0 );
    }

    public IndexSample( long indexSize, long uniqueValues, long sampleSize )
    {
        this( indexSize, uniqueValues, sampleSize, 0 );
    }

    public IndexSample( long indexSize, long uniqueValues, long sampleSize, long updates )
    {
        this.indexSize = indexSize;
        this.uniqueValues = uniqueValues;
        this.sampleSize = sampleSize;
        this.updates = updates;
    }

    public long indexSize()
    {
        return indexSize;
    }

    public long uniqueValues()
    {
        return uniqueValues;
    }

    public long sampleSize()
    {
        return sampleSize;
    }

    public long updates()
    {
        return updates;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }
        IndexSample that = (IndexSample) o;
        return indexSize == that.indexSize && uniqueValues == that.uniqueValues && sampleSize == that.sampleSize && updates == that.updates;
    }

    @Override
    public int hashCode()
    {
        return Arrays.hashCode( new long[]{indexSize, uniqueValues, sampleSize, updates} );
    }

    @Override
    public String toString()
    {
        return "IndexSample{" +
               "indexSize=" + indexSize +
               ", uniqueValues=" + uniqueValues +
               ", sampleSize=" + sampleSize +
               ", updates=" + updates +
               '}';
    }
}
