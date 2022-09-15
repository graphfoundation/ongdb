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
package org.neo4j.exceptions;

import org.eclipse.collections.impl.factory.Maps;

import java.util.Map;
import java.util.stream.Collectors;

import org.neo4j.kernel.api.exceptions.Status;

/**
 * Used to provide additional information on a Neo4jException.
 */
public class StatusWrapCypherException extends Neo4jException
{
    public enum ExtraInformation
    {
        LINE_NUMBER,
        TRANSACTIONS_COMMITTED
    }

    private final Map<ExtraInformation,String> extraInfoMap = Maps.mutable.of();

    public StatusWrapCypherException( Neo4jException cause )
    {
        super( cause.getMessage(), cause );
    }

    public StatusWrapCypherException addExtraInfo( ExtraInformation informationType, String extraInfo )
    {
        extraInfoMap.put( informationType, extraInfo );
        return this;
    }

    public boolean containsInfoFor( ExtraInformation informationType )
    {
        return extraInfoMap.containsKey( informationType );
    }

    @Override
    public String getMessage()
    {
        return String.format( "%s (%s)", getCause().getMessage(), extraInfoMap.entrySet().stream()
                                                                              .sorted( Map.Entry.comparingByKey() )
                                                                              .map( Map.Entry::getValue )
                                                                              .collect( Collectors.joining( ", " ) ) );
    }

    @Override
    public Status status()
    {
        return ((Neo4jException) getCause()).status();
    }
}
