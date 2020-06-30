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

import org.apache.shiro.authz.AuthorizationInfo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.graphdb.security.AuthorizationViolationException;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.kernel.api.exceptions.Status.Security;
import org.neo4j.kernel.enterprise.api.security.EnterpriseLoginContext;
import org.neo4j.kernel.enterprise.api.security.EnterpriseSecurityContext;

public class StandardEnterpriseLoginContext implements EnterpriseLoginContext
{
    private final MultiRealmAuthManager authManager;
    private final ShiroSubject shiroSubject;
    private final StandardEnterpriseLoginContext.NeoShiroSubject neoShiroSubject;

    StandardEnterpriseLoginContext( MultiRealmAuthManager authManager, ShiroSubject shiroSubject )
    {
        this.authManager = authManager;
        this.shiroSubject = shiroSubject;
        this.neoShiroSubject = new StandardEnterpriseLoginContext.NeoShiroSubject();
    }

    private static String buildMessageFromThrowables( String baseMessage, List<Throwable> throwables )
    {
        if ( throwables == null )
        {
            return baseMessage;
        }

        StringBuilder sb = new StringBuilder( baseMessage );

        for ( Throwable t : throwables )
        {
            if ( t.getMessage() != null )
            {
                sb.append( " (" );
                sb.append( t.getMessage() );
                sb.append( ")" );
            }
            Throwable cause = t.getCause();
            if ( cause != null && cause.getMessage() != null )
            {
                sb.append( " (" );
                sb.append( cause.getMessage() );
                sb.append( ")" );
            }
            Throwable causeCause = cause != null ? cause.getCause() : null;
            if ( causeCause != null && causeCause.getMessage() != null )
            {
                sb.append( " (" );
                sb.append( causeCause.getMessage() );
                sb.append( ")" );
            }
        }
        return sb.toString();
    }

    public AuthSubject subject()
    {
        return this.neoShiroSubject;
    }

    private DefaultAccessMode mode( IdLookup resolver, String dbName )
    {
        boolean isAuthenticated = this.shiroSubject.isAuthenticated();
        boolean passwordChangeRequired = this.shiroSubject.getAuthenticationResult() == AuthenticationResult.PASSWORD_CHANGE_REQUIRED;
        Set<String> roles = this.queryForRoleNames();
        DefaultAccessMode.Builder accessModeBuilder = new DefaultAccessMode.Builder( isAuthenticated, passwordChangeRequired, roles, resolver, dbName );
        Set<SecurityResourcePrivilege> privileges = this.authManager.getPermissions( roles );
        Iterator iterator = privileges.iterator();

        while ( iterator.hasNext() )
        {
            SecurityResourcePrivilege privilege = (SecurityResourcePrivilege) iterator.next();
            if ( privilege.appliesTo( dbName ) )
            {
                accessModeBuilder.addPrivilege( privilege );
            }
        }

        if ( dbName.equals( "system" ) )
        {
            accessModeBuilder.withAccess();
        }

        DefaultAccessMode mode = accessModeBuilder.build();
        if ( !mode.allowsAccess() )
        {
            throw mode.onViolation(
                    String.format( "Database access is not allowed for user '%s' with roles %s.", this.neoShiroSubject.username(), roles.toString() ) );
        }
        else
        {
            return mode;
        }
    }

    public EnterpriseSecurityContext authorize( IdLookup idLookup, String dbName )
    {
        if ( !this.shiroSubject.isAuthenticated() )
        {
            throw new AuthorizationViolationException( "Permission denied.", Security.Unauthorized );
        }
        else
        {
            DefaultAccessMode mode = this.mode( idLookup, dbName );
            return new EnterpriseSecurityContext( this.neoShiroSubject, mode, mode.roles(), mode.getEnterpriseAdminAccessMode() );
        }
    }

    public Set<String> roles()
    {
        return this.queryForRoleNames();
    }

    private Set<String> queryForRoleNames()
    {
        Collection<AuthorizationInfo> authorizationInfo = this.authManager.getAuthorizationInfo( this.shiroSubject.getPrincipals() );
        return authorizationInfo.stream().flatMap( ( authInfo ) ->
                                                   {
                                                       Collection<String> roles = authInfo.getRoles();
                                                       return roles == null ? Stream.empty() : roles.stream();
                                                   } ).collect( Collectors.toSet() );
    }

    class NeoShiroSubject implements AuthSubject
    {
        public String username()
        {
            Object principal = StandardEnterpriseLoginContext.this.shiroSubject.getPrincipal();
            return principal != null ? principal.toString() : "";
        }

        public void logout()
        {
            StandardEnterpriseLoginContext.this.shiroSubject.logout();
        }

        public AuthenticationResult getAuthenticationResult()
        {
            return StandardEnterpriseLoginContext.this.shiroSubject.getAuthenticationResult();
        }

        public void setPasswordChangeNoLongerRequired()
        {
            if ( this.getAuthenticationResult() == AuthenticationResult.PASSWORD_CHANGE_REQUIRED )
            {
                StandardEnterpriseLoginContext.this.shiroSubject.setAuthenticationResult( AuthenticationResult.SUCCESS );
            }
        }

        public boolean hasUsername( String username )
        {
            Object principal = StandardEnterpriseLoginContext.this.shiroSubject.getPrincipal();
            return username != null && username.equals( principal );
        }

        String getAuthenticationFailureMessage()
        {
            String message = "";
            List<Throwable> throwables = StandardEnterpriseLoginContext.this.shiroSubject.getAuthenticationInfo().getThrowables();
            switch ( StandardEnterpriseLoginContext.this.shiroSubject.getAuthenticationResult() )
            {
            case FAILURE:
                message = StandardEnterpriseLoginContext.buildMessageFromThrowables( "invalid principal or credentials", throwables );
                break;
            case TOO_MANY_ATTEMPTS:
                message = StandardEnterpriseLoginContext.buildMessageFromThrowables( "too many failed attempts", throwables );
                break;
            case PASSWORD_CHANGE_REQUIRED:
                message = StandardEnterpriseLoginContext.buildMessageFromThrowables( "password change required", throwables );
            }

            return message;
        }

        void clearAuthenticationInfo()
        {
            StandardEnterpriseLoginContext.this.shiroSubject.clearAuthenticationInfo();
        }
    }
}
