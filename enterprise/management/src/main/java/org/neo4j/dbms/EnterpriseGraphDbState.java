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

/**
 * See community/neo4j/src/main/java/org/neo4j/dbms/
 */
public class EnterpriseGraphDbState implements DatabaseState
{
    private final NamedDatabaseId namedDatabaseId;
    private final EnterpriseOperatorState operationalState;
    private final Throwable failure;

    public EnterpriseGraphDbState( NamedDatabaseId namedDatabaseId, EnterpriseOperatorState operationalState )
    {
        this( namedDatabaseId, operationalState, null );
    }

    private EnterpriseGraphDbState( NamedDatabaseId namedDatabaseId, EnterpriseOperatorState operationalState, Throwable failure )
    {
        this.namedDatabaseId = namedDatabaseId;
        this.operationalState = operationalState;
        this.failure = failure;
    }

    public static EnterpriseGraphDbState initial( NamedDatabaseId id )
    {
        return new EnterpriseGraphDbState( id, EnterpriseOperatorState.INITIAL, null );
    }

    public static EnterpriseGraphDbState unknown( NamedDatabaseId id )
    {
        return new EnterpriseGraphDbState( id, EnterpriseOperatorState.UNKNOWN, null );
    }

    static EnterpriseGraphDbState failedUnknownId( Throwable failure )
    {
        return new EnterpriseGraphDbState( null, EnterpriseOperatorState.UNKNOWN, failure );
    }

    public NamedDatabaseId databaseId()
    {
        return this.namedDatabaseId;
    }

    public EnterpriseOperatorState operatorState()
    {
        return this.operationalState;
    }

    public EnterpriseGraphDbState healthy()
    {
        return new EnterpriseGraphDbState( this.namedDatabaseId, this.operationalState, (Throwable) null );
    }

    public EnterpriseGraphDbState failed( Throwable failure )
    {
        return new EnterpriseGraphDbState( this.namedDatabaseId, this.operationalState, failure );
    }

    public boolean hasFailed()
    {
        return this.failure != null;
    }

    public Optional<Throwable> failure()
    {
        return Optional.ofNullable( this.failure );
    }

    public String toString()
    {
        return "EnterpriseGraphDbState{databaseId=" + namedDatabaseId + ", operatorState=" + this.operationalState + ", failed=" + this.hasFailed() + "}";
    }

    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        else if ( o != null && this.getClass() == o.getClass() )
        {
            EnterpriseGraphDbState that = (EnterpriseGraphDbState) o;
            return this.hasFailed() == that.hasFailed() && Objects.equals( this.namedDatabaseId, that.namedDatabaseId ) &&
                   this.operationalState == that.operationalState;
        }
        else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return Objects.hash( namedDatabaseId, this.operationalState, this.hasFailed() );
    }
}
