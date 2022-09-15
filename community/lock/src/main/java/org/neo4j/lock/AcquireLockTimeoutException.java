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
package org.neo4j.lock;

import org.neo4j.exceptions.KernelException;
import org.neo4j.kernel.api.exceptions.Status;

/**
 * Acquiring a lock failed. This is a runtime exception now to ease the transition from the old lock interface, but
 * it should be made into a {@link KernelException} asap.
 */
public class AcquireLockTimeoutException extends RuntimeException implements Status.HasStatus
{
    private final Status statusCode;

    public AcquireLockTimeoutException( String message, Status statusCode )
    {
        this( message, null, statusCode );
    }

    public AcquireLockTimeoutException( String message, Throwable cause, Status statusCode )
    {
        super( message, cause );
        this.statusCode = statusCode;
    }

    @Override
    public Status status()
    {
        return statusCode;
    }
}
