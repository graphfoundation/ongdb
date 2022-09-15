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
package org.neo4j.kernel.impl.api;

import java.util.Objects;

public class KernelTransactionStamp
{
    private final KernelTransactionImplementation ktx;
    private final long reuseCount;

    public KernelTransactionStamp( KernelTransactionImplementation ktx )
    {
        this.reuseCount = ktx.getReuseCount();
        this.ktx = ktx;
    }

    public boolean isOpen()
    {
        return ktx.isOpen() && reuseCount == ktx.getReuseCount();
    }

    public boolean isClosing()
    {
        return ktx.isClosing() && reuseCount == ktx.getReuseCount();
    }

    long getReuseCount()
    {
        return reuseCount;
    }

    public boolean isNotExpired()
    {
        return reuseCount == ktx.getReuseCount();
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
        KernelTransactionStamp that = (KernelTransactionStamp) o;
        return reuseCount == that.reuseCount && Objects.equals( ktx, that.ktx );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( ktx, reuseCount );
    }

    boolean isTerminated()
    {
        return ktx.isTerminated() && reuseCount == ktx.getReuseCount();
    }
}
