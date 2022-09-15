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
package org.neo4j.kernel.impl.index.schema;

import java.io.IOException;
import java.util.List;

import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.index.internal.gbptree.Layout;
import org.neo4j.index.internal.gbptree.Seeker;

import static org.neo4j.io.IOUtils.closeAll;

/**
 * Combines multiple {@link GBPTree} seekers into one seeker, keeping the total order among all keys.
 *
 * @param <KEY> type of key
 * @param <VALUE> type of value
 */
class CombinedPartSeeker<KEY,VALUE> implements Seeker<KEY,VALUE>
{
    private final KEY end;
    private final Seeker<KEY,VALUE>[] partCursors;
    private final Object[] partHeads;
    private final Layout<KEY,VALUE> layout;
    private KEY nextKey;
    private VALUE nextValue;

    CombinedPartSeeker( Layout<KEY,VALUE> layout, List<Seeker<KEY,VALUE>> parts )
    {
        this.layout = layout;
        int length = parts.size();
        this.end = layout.newKey();
        this.partCursors = parts.toArray( new Seeker[0] );
        this.partHeads = new Object[length];
    }

    @Override
    public boolean next() throws IOException
    {
        // Pick lowest among all candidates
        int nextKeyIndex = -1;
        for ( int i = 0; i < partCursors.length; i++ )
        {
            // Get candidate from already seen heads, if any
            KEY candidate = (KEY) partHeads[i];
            if ( candidate == end )
            {
                continue;
            }

            // Get candidate from seeker, if available
            if ( candidate == null )
            {
                if ( partCursors[i].next() )
                {
                    partHeads[i] = candidate = partCursors[i].key();
                }
                else
                {
                    partHeads[i] = end;
                }
            }

            // Was our candidate lower than lowest we've seen so far this round?
            if ( candidate != null )
            {
                if ( nextKeyIndex == -1 || layout.compare( candidate, nextKey ) < 0 )
                {
                    nextKey = candidate;
                    nextKeyIndex = i;
                }
            }
        }

        if ( nextKeyIndex != -1 )
        {
            // We have a next key/value
            nextValue = partCursors[nextKeyIndex].value();
            partHeads[nextKeyIndex] = null;
            return true;
        }

        // We've reached the end of all parts
        nextKey = null;
        nextValue = null;
        return false;
    }

    @Override
    public void close() throws IOException
    {
        closeAll( partCursors );
    }

    @Override
    public KEY key()
    {
        assert nextKey != null;
        return nextKey;
    }

    @Override
    public VALUE value()
    {
        assert nextValue != null;
        return nextValue;
    }
}
