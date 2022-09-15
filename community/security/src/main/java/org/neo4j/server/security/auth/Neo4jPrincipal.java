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
package org.neo4j.server.security.auth;

import java.util.Objects;
import java.util.Optional;

public class Neo4jPrincipal
{
    public static final String NO_ID = "NO_ID";

    private final String username;
    private final Optional<String> id;

    public Neo4jPrincipal( String username, String id )
    {
        this.username = username;
        this.id = Optional.ofNullable( id );
    }

    public Neo4jPrincipal( String username )
    {
        this.username = username;
        this.id = Optional.empty();
    }

    public String getUsername()
    {
        return username;
    }

    public Optional<String> getId()
    {
        return id;
    }

    @Override
    public boolean equals( Object other )
    {
        if ( this == other )
        {
            return true;
        }
        if ( other == null || getClass() != other.getClass() )
        {
            return false;
        }
        Neo4jPrincipal that = (Neo4jPrincipal) other;
        return Objects.equals( username, that.username ) && Objects.equals( id, that.id );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( username, id );
    }
}
