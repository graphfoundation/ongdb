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

import org.neo4j.dbms.api.DatabaseNotFoundException;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;

public final class LocalGraphDbOperator extends GraphDbOperator
{
    private final DatabaseIdRepository databaseIdRepository;

    LocalGraphDbOperator( DatabaseIdRepository databaseIdRepository )
    {
        this.databaseIdRepository = databaseIdRepository;
    }

    public void dropDatabase( String databaseName )
    {
        NamedDatabaseId id = this.getNamedDatabaseIdForDatabaseName( databaseName );
        this.desiredStateMap.put( databaseName, new EnterpriseGraphDbState( id, EnterpriseOperatorState.DROPPED ) );
        this.trigger( GraphDbReconcilerRequest.force() ).await( id );
    }

    public void startDatabase( String databaseName )
    {
        NamedDatabaseId id = this.getNamedDatabaseIdForDatabaseName( databaseName );
        this.desiredStateMap.put( databaseName, new EnterpriseGraphDbState( id, EnterpriseOperatorState.STARTED ) );
        this.trigger( GraphDbReconcilerRequest.force() ).await( id );
    }

    public void stopDatabase( String databaseName )
    {
        NamedDatabaseId id = this.getNamedDatabaseIdForDatabaseName( databaseName );
        this.desiredStateMap.put( databaseName, new EnterpriseGraphDbState( id, EnterpriseOperatorState.STOPPED ) );
        this.trigger( GraphDbReconcilerRequest.force() ).await( id );
    }

    private NamedDatabaseId getNamedDatabaseIdForDatabaseName( String databaseName )
    {
        return this.databaseIdRepository.getByName( databaseName ).orElseThrow( () ->
                                                                                {
                                                                                    return new DatabaseNotFoundException(
                                                                                            "Cannot find db: " + databaseName );
                                                                                } );
    }
}
