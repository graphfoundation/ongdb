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
package org.neo4j.kernel.impl.index.schema;

import java.io.Closeable;
import java.io.IOException;

/**
 * Cursor that traverse over {@link BlockEntry} = key-value pairs. Instead of handing out {@link BlockEntry} instances, it provides direct access to key and
 * value. Implementing classes are allowed to reuse key and value handed out through {@link #key()} and {@link #value()}.
 */
public interface BlockEntryCursor<KEY,VALUE> extends Closeable
{
    boolean next() throws IOException;

    KEY key();

    VALUE value();

    BlockEntryCursor EMPTY = new BlockEntryCursor()
    {
        @Override
        public boolean next()
        {
            return false;
        }

        @Override
        public Object key()
        {
            throw new IllegalStateException();
        }

        @Override
        public Object value()
        {
            throw new IllegalStateException();
        }

        @Override
        public void close()
        {
        }
    };

    static <KEY,VALUE> BlockEntryCursor<KEY,VALUE> empty()
    {
        return EMPTY;
    }
}
