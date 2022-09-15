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
package org.neo4j.server.http.cypher;

import org.neo4j.server.http.cypher.format.api.TransactionNotificationState;
import org.neo4j.server.rest.Neo4jError;

/**
 * An invocation that produces output event stream representing an error that occurred before statement processing started.
 * <p>
 * This invocation should be used to produce response body for responses with 4** and 5** codes.
 */
class ErrorInvocation
{

    private final Neo4jError neo4jError;

    ErrorInvocation( Neo4jError neo4jError )
    {
        this.neo4jError = neo4jError;
    }

    void execute( OutputEventStream outputEventStream )
    {
        outputEventStream.writeFailure( neo4jError.status(), neo4jError.getMessage() );
        outputEventStream.writeTransactionInfo( TransactionNotificationState.NO_TRANSACTION, null, -1 );
    }
}
