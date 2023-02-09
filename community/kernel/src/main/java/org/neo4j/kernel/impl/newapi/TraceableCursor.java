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
package org.neo4j.kernel.impl.newapi;

import org.neo4j.internal.kernel.api.Cursor;
import org.neo4j.internal.kernel.api.DefaultCloseListenable;
import org.neo4j.internal.kernel.api.KernelReadTracer;
import org.neo4j.util.VisibleForTesting;

@VisibleForTesting
public abstract class TraceableCursor<CURSOR> extends DefaultCloseListenable implements Cursor
{
    private final CursorPool<CURSOR> pool;
    protected KernelReadTracer tracer;
    private boolean returnedToPool;

    TraceableCursor( CursorPool<CURSOR> pool )
    {
        this.pool = pool;
    }

    @Override
    public void setTracer( KernelReadTracer tracer )
    {
        this.tracer = tracer;
    }

    @Override
    public void removeTracer()
    {
        this.tracer = null;
    }

    void acquire()
    {
        if ( !returnedToPool )
        {
            throw new IllegalStateException( this + " hasn't been returned to pool yet" );
        }
        returnedToPool = false;
    }

    @Override
    public void closeInternal()
    {
        if ( !returnedToPool )
        {
            pool.accept( (CURSOR) this );
            returnedToPool = true;
        }
    }

    @VisibleForTesting
    public boolean returnedToPool()
    {
        return returnedToPool;
    }
}
