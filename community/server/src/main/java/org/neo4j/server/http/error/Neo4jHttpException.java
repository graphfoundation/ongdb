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
package org.neo4j.server.http.error;

import java.util.Collections;
import java.util.List;

import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.server.rest.Neo4jError;

/**
 * An exception that is processed by {@link Neo4jHttpExceptionMapper},
 * which converts it into a HTTP response.
 */
public class Neo4jHttpException extends RuntimeException
{
    private final int httpStatus;
    private final List<Neo4jError> neo4jErrors;

    public Neo4jHttpException( int httpStatus, List<Neo4jError> neo4jErrors )
    {
        this.httpStatus = httpStatus;
        this.neo4jErrors = neo4jErrors;
    }

    public Neo4jHttpException( int httpStatus, Status status,  Throwable cause )
    {
        this.httpStatus = httpStatus;
        Neo4jError neo4jError = new Neo4jError( status, cause );
        neo4jErrors = Collections.singletonList( neo4jError );
    }

    public Neo4jHttpException( int httpStatus, Status status,  String message )
    {
        this.httpStatus = httpStatus;
        Neo4jError neo4jError = new Neo4jError( status, message );
        neo4jErrors = Collections.singletonList( neo4jError );
    }

    public int getHttpStatus()
    {
        return httpStatus;
    }

    public List<Neo4jError> getNeo4jErrors()
    {
        return neo4jErrors;
    }
}
