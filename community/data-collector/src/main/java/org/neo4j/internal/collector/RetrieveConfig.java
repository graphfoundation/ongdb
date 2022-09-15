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
package org.neo4j.internal.collector;

import java.util.Map;

import org.neo4j.internal.collector.DataCollectorOptions.IntOption;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

/**
 * Configuration of retrieve procedure call.
 */
class RetrieveConfig
{
    private static final IntOption MAX_INVOCATIONS = new IntOption( "maxInvocations", 100 );

    static RetrieveConfig of( Map<String, Object> userMap ) throws InvalidArgumentsException
    {
        return new RetrieveConfig( MAX_INVOCATIONS.parseOrDefault( userMap ) );
    }

    final int maxInvocations;

    private RetrieveConfig( int maxInvocations )
    {
        this.maxInvocations = maxInvocations;
    }
}
