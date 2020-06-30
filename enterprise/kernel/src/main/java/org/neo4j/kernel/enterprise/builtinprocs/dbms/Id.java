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

package org.neo4j.kernel.enterprise.builtinprocs.dbms;

import java.util.Objects;

import org.neo4j.configuration.helpers.DatabaseNameValidator;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

public class Id
{

    private final String separator;
    private final NormalizedDatabaseName database;
    private final long internalId;

    public Id( String queryIdText, String separator ) throws InvalidArgumentsException
    {
        this.separator = separator;

        try
        {
            int i = queryIdText.lastIndexOf( separator );
            if ( i != -1 )
            {
                this.database = normalizeDatabaseName( queryIdText.substring( 0, i ) );
                if ( this.database.name().length() > 0 )
                {
                    String qid = queryIdText.substring( i + separator.length() );
                    this.internalId = Long.parseLong( qid );
                    if ( this.internalId <= 0L )
                    {
                        throw new InvalidArgumentsException(
                                "Negative ids are not supported (expected format: <databasename>" + separator
                                + "<id>)" );
                    }

                    return;
                }
            }
        }
        catch ( NumberFormatException e )
        {
            throw new InvalidArgumentsException(
                    "Could not parse id (expected format: <databasename>" + separator + "<id>)", e );
        }

        throw new InvalidArgumentsException(
                "Could not parse id (expected format: <databasename>" + separator + "<id>)" );
    }

    public Id( String database, long internalId, String separator ) throws InvalidArgumentsException
    {
        this.separator = separator;
        this.database = new NormalizedDatabaseName( (String) Objects.requireNonNull( database ) );
        if ( internalId <= 0L )
        {
            throw new InvalidArgumentsException(
                    "Negative ids are not supported (expected format: <databasename>" + separator + "<id>)" );
        }
        else
        {
            this.internalId = internalId;
        }
    }

    /**
     * @param databaseName
     * @return
     */
    private static NormalizedDatabaseName normalizeDatabaseName( String databaseName )
    {
        NormalizedDatabaseName normalizedDatabaseName = new NormalizedDatabaseName( databaseName );
        DatabaseNameValidator.validateInternalDatabaseName( normalizedDatabaseName );
        return normalizedDatabaseName;
    }

    /**
     * @return
     */
    public long getInternalId()
    {
        return this.internalId;
    }

    /**
     * @return
     */
    public NormalizedDatabaseName getDatabase()
    {
        return this.database;
    }

    /**
     * @param o
     * @return
     */
    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        else if ( o != null && this.getClass() == o.getClass() )
        {
            Id other = (Id) o;
            return this.internalId == other.internalId && this.database.equals( other.database );
        }
        else
        {
            return false;
        }
    }

    /**
     * @return
     */
    @Override
    public int hashCode()
    {
        return Objects.hash( database, internalId );
    }

    /**
     * @return
     */
    @Override
    public String toString()
    {
        return database.name() + separator + internalId;
    }
}
