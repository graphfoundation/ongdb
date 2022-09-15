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
package org.neo4j.dbms.procedures;

import org.neo4j.collection.RawIterator;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.api.ResourceTracker;
import org.neo4j.kernel.api.procedure.Context;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.values.AnyValue;

public class StandaloneDatabaseStateProcedure extends DatabaseStateProcedure
{
    private final DatabaseStateService stateService;
    private final String advertisedAddress;

    public StandaloneDatabaseStateProcedure( DatabaseStateService stateService, DatabaseIdRepository idRepository, String advertisedAddress )
    {
        super( idRepository );
        this.stateService = stateService;
        this.advertisedAddress = advertisedAddress;
    }

    @Override
    public RawIterator<AnyValue[],ProcedureException> apply( Context ctx, AnyValue[] input, ResourceTracker resourceTracker ) throws ProcedureException
    {
        var databaseId = extractDatabaseId( input );
        var status = stateService.stateOfDatabase( databaseId ).operatorState();
        var error = stateService.causeOfFailure( databaseId ).map( Throwable::getMessage );
        var resultRow = resultRowFactory( status, error, "standalone", advertisedAddress );
        return RawIterator.<AnyValue[],ProcedureException>of( resultRow );
    }
}
