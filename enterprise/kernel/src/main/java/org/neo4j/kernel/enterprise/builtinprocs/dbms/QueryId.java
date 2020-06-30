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

import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

public final class QueryId extends Id
{

    public static final String QUERY_ID_SEPARATOR = "-query-";

    public QueryId( String database, long kernelQueryId ) throws InvalidArgumentsException
    {
        super( database, kernelQueryId, QUERY_ID_SEPARATOR );
    }

    public QueryId( String external ) throws InvalidArgumentsException
    {
        super( external, QUERY_ID_SEPARATOR );
    }
}
