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
package org.neo4j.internal.kernel.api.security;

public class AdminActionOnResource
{
    private final PrivilegeAction action;
    private final DatabaseScope databaseScope;
    private final Segment segment;

    public AdminActionOnResource( PrivilegeAction action, DatabaseScope databaseScope, Segment segment )
    {
        this.action = action;
        this.databaseScope = databaseScope;
        this.segment = segment;
    }

    public boolean matches( AdminActionOnResource request )
    {
        return action.satisfies( request.action ) &&
               (databaseScope.all || databaseScope.name.equals( request.databaseScope.name )) &&
               segment.satisfies( request.segment );
    }

    public static final AdminActionOnResource ALL = new AdminActionOnResource( PrivilegeAction.ADMIN, DatabaseScope.ALL, Segment.ALL );

    public static class DatabaseScope
    {
        private final String name;
        private final boolean all;

        public DatabaseScope( String name )
        {
            this( name, false );
        }

        private DatabaseScope( String name, boolean all )
        {
            this.name = name;
            this.all = all;
        }

        public static final DatabaseScope ALL = new DatabaseScope( "*", true );
    }
}
