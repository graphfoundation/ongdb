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
package org.neo4j.internal.kernel.api.helpers;

import java.util.Map;

import org.neo4j.internal.kernel.api.TokenSet;
import org.neo4j.values.storable.Value;

class NodeData
{
    final long id;
    private final long[] labels;
    final Map<Integer,Value> properties;

    NodeData( long id, long[] labels, Map<Integer,Value> properties )
    {
        this.id = id;
        this.labels = labels;
        this.properties = properties;
    }

    TokenSet labelSet()
    {
        return new TokenSet()
        {
            @Override
            public int numberOfTokens()
            {
                return labels.length;
            }

            @Override
            public int token( int offset )
            {
                return (int) labels[offset];
            }

            @Override
            public boolean contains( int token )
            {
                for ( long label : labels )
                {
                    if ( label == token )
                    {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public long[] all()
            {
                return labels;
            }
        };
    }
}
