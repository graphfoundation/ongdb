/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.server.security.enterprise.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.kernel.enterprise.api.security.EnterpriseSecurityContext;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.procedure.Context;
import org.neo4j.server.security.enterprise.log.SecurityLog;

public class AuthProceduresBase
{
    @Context
    public EnterpriseSecurityContext securityContext;
    @Context
    public GraphDatabaseAPI graph;
    @Context
    public Transaction transaction;
    @Context
    public SecurityLog securityLog;

    protected AuthProceduresBase.UserResult userResultForSubject()
    {
        String username = this.securityContext.subject().username();
        boolean changeReq = this.securityContext.subject().getAuthenticationResult().equals( AuthenticationResult.PASSWORD_CHANGE_REQUIRED );
        return new AuthProceduresBase.UserResult( username, this.securityContext.roles(), changeReq, false );
    }

    public static class RoleResult
    {
        public final String role;
        public final List<String> users;

        RoleResult( String role, Set<String> users )
        {
            this.role = role;
            this.users = new ArrayList();
            this.users.addAll( users );
        }
    }

    public static class UserResult
    {
        public final String username;
        public final List<String> roles;
        public final List<String> flags;

        UserResult( String username, Collection<String> roles, boolean changeRequired, boolean suspended )
        {
            this.username = username;
            this.roles = new ArrayList();
            this.roles.addAll( roles );
            this.flags = new ArrayList();
            if ( changeRequired )
            {
                this.flags.add( "password_change_required" );
            }

            if ( suspended )
            {
                this.flags.add( "is_suspended" );
            }
        }
    }

    public static class StringResult
    {
        public final String value;

        StringResult( String value )
        {
            this.value = value;
        }
    }
}

