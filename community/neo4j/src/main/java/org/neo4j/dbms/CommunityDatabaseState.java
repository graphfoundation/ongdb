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
package org.neo4j.dbms;

import java.util.Optional;

import org.neo4j.kernel.database.NamedDatabaseId;

public final class CommunityDatabaseState implements DatabaseState
{
    private final NamedDatabaseId namedDatabaseId;
    private final boolean unknown;
    private final boolean isStarted;
    private final boolean hasFailed;
    private final Throwable failureCause;

    public CommunityDatabaseState( NamedDatabaseId namedDatabaseId, boolean isStarted, boolean hasFailed, Throwable failureCause )
    {
        this( namedDatabaseId, isStarted, hasFailed, false, failureCause );
    }

    private CommunityDatabaseState( NamedDatabaseId namedDatabaseId, boolean isStarted, boolean hasFailed, boolean unknown, Throwable failureCause )
    {
        this.namedDatabaseId = namedDatabaseId;
        this.isStarted = isStarted;
        this.hasFailed = hasFailed;
        this.failureCause = failureCause;
        this.unknown = unknown;
    }

    public static CommunityDatabaseState unknown( NamedDatabaseId namedDatabaseId )
    {
        return new CommunityDatabaseState( namedDatabaseId, false, false, true, null );
    }

    @Override
    public NamedDatabaseId databaseId()
    {
        return namedDatabaseId;
    }

    @Override
    public OperatorState operatorState()
    {
        return unknown ? DefaultOperatorState.UNKNOWN :
               isStarted ? DefaultOperatorState.STARTED : DefaultOperatorState.STOPPED;
    }

    @Override
    public boolean hasFailed()
    {
        return hasFailed;
    }

    @Override
    public Optional<Throwable> failure()
    {
        return Optional.ofNullable( failureCause );
    }
}
