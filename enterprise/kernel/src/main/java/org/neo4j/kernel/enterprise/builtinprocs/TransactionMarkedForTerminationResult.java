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

package org.neo4j.kernel.enterprise.builtinprocs;

public class TransactionMarkedForTerminationResult
{

    private static final String TERMINATION_MESSAGE = "Transaction terminated.";
    public final String transactionId;
    public final String username;
    public final String message;

    TransactionMarkedForTerminationResult( String transactionId, String userName )
    {
        this( transactionId, userName, TERMINATION_MESSAGE );
    }

    TransactionMarkedForTerminationResult( String transactionId, String username, String message )
    {
        this.transactionId = transactionId;
        this.username = username;
        this.message = message;
    }
}
