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
package org.neo4j.kernel.impl.transaction.state.storeview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.neo4j.kernel.impl.api.index.TokenScanConsumer;

import static java.util.Collections.synchronizedList;

public class TestTokenScanConsumer implements TokenScanConsumer
{
    public final List<List<Record>> batches = synchronizedList( new ArrayList<>() );
    private final Set<Long> entities = new HashSet<>();

    public long consumedEntities()
    {
        return entities.size();
    }

    @Override
    public TokenScanConsumer.Batch newBatch()
    {
        return new TokenScanConsumer.Batch()
        {
            final List<Record> batchTokenUpdates = new ArrayList<>();

            @Override
            public void addRecord( long entityId, long[] tokens )
            {
                batchTokenUpdates.add( new Record( entityId, tokens ) );
                entities.add( entityId );
            }

            @Override
            public void process()
            {
                batches.add( batchTokenUpdates );
            }
        };
    }

    public static class Record
    {
        private final long entityId;
        private final long[] tokens;

        public Record( long entityId, long[] tokens )
        {
            this.entityId = entityId;
            this.tokens = tokens;
        }

        public long getEntityId()
        {
            return entityId;
        }

        public long[] getTokens()
        {
            return tokens;
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
            Record record = (Record) o;
            return entityId == record.entityId &&
                    Arrays.equals( tokens, record.tokens );
        }

        @Override
        public int hashCode()
        {
            int result = Objects.hash( entityId );
            result = 31 * result + Arrays.hashCode( tokens );
            return result;
        }
    }
}
