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

import java.util.Arrays;
import java.util.Optional;

import org.neo4j.kernel.database.NormalizedDatabaseName;
import org.neo4j.dbms.OperatorState;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.kernel.api.procedure.CallableProcedure;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.procedure.Mode;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.Values;

import static java.lang.String.format;
import static org.neo4j.internal.kernel.api.procs.ProcedureSignature.procedureSignature;
import static org.neo4j.kernel.api.exceptions.Status.Database.DatabaseNotFound;
import static org.neo4j.values.storable.Values.EMPTY_STRING;
import static org.neo4j.values.storable.Values.stringValue;

public abstract class DatabaseStateProcedure extends CallableProcedure.BasicProcedure
{
    private static final String PROCEDURE_NAME = "state";
    private static final String[] PROCEDURE_NAMESPACE = {"dbms","database"};
    private static final String PARAMETER_NAME = "databaseName";
    protected final DatabaseIdRepository idRepository;

    protected DatabaseStateProcedure( DatabaseIdRepository idRepository )
    {
        super( procedureSignature( new QualifiedName( PROCEDURE_NAMESPACE, PROCEDURE_NAME ) )
                .in( PARAMETER_NAME, Neo4jTypes.NTString )
                .out( "role", Neo4jTypes.NTString )
                .out( "address", Neo4jTypes.NTString )
                .out( "status", Neo4jTypes.NTString )
                .out( "error", Neo4jTypes.NTString )
                .description( "The actual status of the database with the provided name on this ONgDB instance." )
                .systemProcedure()
                .mode( Mode.DBMS )
                .build() );
        this.idRepository = idRepository;
    }

    protected NamedDatabaseId extractDatabaseId( AnyValue[] input ) throws ProcedureException
    {
        if ( input.length != 1 )
        {
            throw new IllegalArgumentException( "Illegal input:" + Arrays.toString( input ) );
        }
        var rawName = input[0];
        if ( !( rawName instanceof TextValue) )
        {
            throw new IllegalArgumentException( format( "Parameter '%s' value should have a string representation. Instead: %s", PARAMETER_NAME, rawName ) );
        }
        var name = new NormalizedDatabaseName( ((TextValue) rawName).stringValue() );
        return idRepository.getByName( name )
                .orElseThrow( () -> new ProcedureException( DatabaseNotFound, format( "Unable to retrieve the status " +
                        "for database with name %s because no database with this name exists!", name ) ) );
    }

    protected static AnyValue[] resultRowFactory( OperatorState status, Optional<String> error, String role, String address )
    {
        var formattedStatus = stringValue( status.description() );
        var formattedError = error.map( Values::stringValue ).orElse( EMPTY_STRING );
        return new AnyValue[]{stringValue( role ), stringValue( address ), formattedStatus, formattedError};
    }
}
