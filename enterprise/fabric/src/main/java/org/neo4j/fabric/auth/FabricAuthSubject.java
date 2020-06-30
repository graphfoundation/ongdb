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

import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;

// See BasicAuthSubject except this needs to be public.  Same naming convention.
public class FabricAuthSubject implements AuthSubject
{
    private final AuthSubject wrappedAuthSubject;
    private final UserProviderCredentials userProviderCredentials;

    public FabricAuthSubject( AuthSubject wrappedAuthSubject, UserProviderCredentials userProviderCredentials )
    {
        this.wrappedAuthSubject = wrappedAuthSubject;
        this.userProviderCredentials = userProviderCredentials;
    }

    @Override
    public void logout()
    {
        this.wrappedAuthSubject.logout();
    }

    @Override
    public AuthenticationResult getAuthenticationResult()
    {
        return this.wrappedAuthSubject.getAuthenticationResult();
    }

    @Override
    public void setPasswordChangeNoLongerRequired()
    {
        this.wrappedAuthSubject.setPasswordChangeNoLongerRequired();
    }

    @Override
    public boolean hasUsername( String username )
    {
        return this.wrappedAuthSubject.hasUsername( username );
    }

    @Override
    public String username()
    {
        return this.wrappedAuthSubject.username();
    }

    public UserProviderCredentials getUserProviderCredentials()
    {
        return this.userProviderCredentials;
    }
}

