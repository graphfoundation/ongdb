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

import java.util.Set;

import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.kernel.enterprise.api.security.EnterpriseLoginContext;
import org.neo4j.kernel.enterprise.api.security.EnterpriseSecurityContext;

// See BasicLoginContext.java in community - we just change the name from basic to fabric to keep with neo4j conventions.
public class FabricLoginContext implements EnterpriseLoginContext
{
    private final EnterpriseLoginContext enterpriseLoginContext;
    private final FabricAuthSubject authSubject;

    public FabricLoginContext( EnterpriseLoginContext enterpriseLoginContext, FabricAuthSubject authSubject )
    {
        this.enterpriseLoginContext = enterpriseLoginContext;
        this.authSubject = authSubject;
    }

    @Override
    public Set<String> roles()
    {
        return this.enterpriseLoginContext.roles();
    }

    @Override
    public AuthSubject subject()
    {
        return this.authSubject;
    }

    @Override
    public EnterpriseSecurityContext authorize( IdLookup idLookup, String dbName )
    {
        return this.enterpriseLoginContext.authorize( idLookup, dbName );
    }
}



