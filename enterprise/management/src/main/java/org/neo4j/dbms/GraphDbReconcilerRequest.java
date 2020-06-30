/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.dbms;

import java.util.Objects;
import java.util.Optional;

import org.neo4j.kernel.database.NamedDatabaseId;

public class GraphDbReconcilerRequest
{
    private static final GraphDbReconcilerRequest SIMPLE = new GraphDbReconcilerRequest( false, (NamedDatabaseId) null, (Throwable) null );
    private static final GraphDbReconcilerRequest FORCE = new GraphDbReconcilerRequest( true, (NamedDatabaseId) null, (Throwable) null );
    private final boolean forceReconciliation;
    private final NamedDatabaseId panickedNamedDatabaseId;
    private final Throwable causeOfPanic;

    private GraphDbReconcilerRequest( boolean forceReconciliation, NamedDatabaseId panickedNamedDatabaseId, Throwable causeOfPanic )
    {
        this.forceReconciliation = forceReconciliation;
        this.panickedNamedDatabaseId = panickedNamedDatabaseId;
        this.causeOfPanic = causeOfPanic;
    }

    public static GraphDbReconcilerRequest simple()
    {
        return SIMPLE;
    }

    public static GraphDbReconcilerRequest force()
    {
        return FORCE;
    }

    public static GraphDbReconcilerRequest forPanickedDatabase( NamedDatabaseId namedDatabaseId, Throwable causeOfPanic )
    {
        return new GraphDbReconcilerRequest( false, namedDatabaseId, causeOfPanic );
    }

    boolean forceReconciliation()
    {
        return this.forceReconciliation;
    }

    Optional<Throwable> causeOfPanic( NamedDatabaseId namedDatabaseId )
    {
        boolean thisDatabaseHasPanicked = this.panickedNamedDatabaseId != null && this.panickedNamedDatabaseId.equals( namedDatabaseId );
        return thisDatabaseHasPanicked ? Optional.of( this.causeOfPanic ) : Optional.empty();
    }

    boolean isSimple()
    {
        return this.causeOfPanic == null && !this.forceReconciliation;
    }

    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        else if ( o != null && this.getClass() == o.getClass() )
        {
            GraphDbReconcilerRequest that = (GraphDbReconcilerRequest) o;
            return this.forceReconciliation == that.forceReconciliation && Objects.equals( this.panickedNamedDatabaseId, that.panickedNamedDatabaseId ) &&
                   Objects.equals( this.causeOfPanic, that.causeOfPanic );
        }
        else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return Objects.hash( new Object[]{this.forceReconciliation, this.panickedNamedDatabaseId, this.causeOfPanic} );
    }

    public String toString()
    {
        return "GraphDbReconcilerRequest{forceReconciliation=" + this.forceReconciliation + ", panickedDatabaseId=" + this.panickedNamedDatabaseId +
               ", causeOfPanic=" + this.causeOfPanic + "}";
    }
}
