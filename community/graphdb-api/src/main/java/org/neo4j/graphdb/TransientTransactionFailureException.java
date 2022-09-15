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
package org.neo4j.graphdb;

import org.neo4j.kernel.api.exceptions.Status;

/**
 * Indicates that a transaction couldn't complete successfully due to an intermediate failure.
 * <p>
 * A proper response to a caught exception of this type is to cancel the unit of work that produced this exception and retry the unit of work again, as a
 * whole.
 */
public class TransientTransactionFailureException extends TransientFailureException
{
    private static final Status DEFAULT_STATUS = Status.Transaction.TransientTransactionFailure;

    private final Status status;

    @Deprecated // A specific status should be provided
    public TransientTransactionFailureException( String message, Throwable cause )
    {
        this( DEFAULT_STATUS, message, cause );
    }

    public TransientTransactionFailureException( Status status, String message, Throwable cause )
    {
        super( message, cause );
        this.status = status;
    }

    public TransientTransactionFailureException( Status status, String message )
    {
        super( message );
        this.status = status;
    }

    @Override
    public Status status()
    {
        return status;
    }
}
