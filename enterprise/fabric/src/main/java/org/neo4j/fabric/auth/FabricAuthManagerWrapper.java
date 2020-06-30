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

package org.neo4j.fabric.auth;

import java.util.Arrays;
import java.util.Map;

import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.kernel.api.security.AuthToken;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.kernel.enterprise.api.security.EnterpriseAuthManager;
import org.neo4j.kernel.enterprise.api.security.EnterpriseLoginContext;

public class FabricAuthManagerWrapper implements EnterpriseAuthManager
{
    private final EnterpriseAuthManager enterpriseAuthManager;

    public FabricAuthManagerWrapper( EnterpriseAuthManager enterpriseAuthManager )
    {
        this.enterpriseAuthManager = enterpriseAuthManager;
    }

    public static UserProviderCredentials getCredentials( AuthSubject authSubject )
    {
        if ( !(authSubject instanceof FabricAuthSubject) )
        {
            throw new IllegalArgumentException( "The submitted subject was not created by Fabric Authentication manager: " + authSubject );
        }
        else
        {
            return ((FabricAuthSubject) authSubject).getUserProviderCredentials();
        }
    }

    @Override
    public EnterpriseLoginContext login( Map<String,Object> authToken ) throws InvalidAuthTokenException
    {
        boolean authProvided = !authToken.get( "scheme" ).equals( "none" );
        String username = null;
        byte[] password = null;
        if ( authToken.containsKey( "principal" ) && authToken.containsKey( "userProviderCredentials" ) )
        {
            username = AuthToken.safeCast( "principal", authToken );
            byte[] originalPassword = AuthToken.safeCastCredentials( "userProviderCredentials", authToken );
            password = Arrays.copyOf( originalPassword, originalPassword.length );
        }

        EnterpriseLoginContext wrappedLoginContext = this.enterpriseAuthManager.login( authToken );
        UserProviderCredentials userProviderCredentials = new UserProviderCredentials( username, password, authProvided );
        FabricAuthSubject fabricAuthSubject = new FabricAuthSubject( wrappedLoginContext.subject(), userProviderCredentials );
        return new FabricLoginContext( wrappedLoginContext, fabricAuthSubject );
    }

    @Override
    public void clearAuthCache()
    {
        this.enterpriseAuthManager.clearAuthCache();
    }

    @Override
    public void log( String message, SecurityContext securityContext )
    {
        this.enterpriseAuthManager.log( message, securityContext );
    }

    @Override
    public void init()
    {
    }

    @Override
    public void start()
    {
    }

    @Override
    public void stop()
    {
    }

    @Override
    public void shutdown()
    {
    }
}
