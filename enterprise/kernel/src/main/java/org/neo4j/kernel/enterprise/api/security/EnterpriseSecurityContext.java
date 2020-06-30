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
package org.neo4j.kernel.enterprise.api.security;

import java.util.Collections;
import java.util.Set;

import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.SecurityContext;

/**
 * A logged in and authorized user.
 */
public class EnterpriseSecurityContext extends SecurityContext
{

    /**
     * Allows all operations.
     */
    public static final EnterpriseSecurityContext AUTH_DISABLED = authDisabled(
            AccessMode.Static.FULL );
    private final Set<String> roles;
    private final EnterpriseAdminAccessMode enterpriseAdminAccessMode;

    public EnterpriseSecurityContext( AuthSubject subject, AccessMode mode, Set<String> roles,
                                      EnterpriseAdminAccessMode enterpriseAdminAccessMode )
    {
        super( subject, mode );
        this.roles = roles;
        this.enterpriseAdminAccessMode = enterpriseAdminAccessMode;
    }

    private static EnterpriseSecurityContext authDisabled( AccessMode mode )
    {
        return new EnterpriseSecurityContext( AuthSubject.AUTH_DISABLED, mode, Collections.emptySet(),
                                              EnterpriseAdminAccessMode.FULL )
        {
            @Override
            public EnterpriseSecurityContext withMode( AccessMode mode )
            {
                return EnterpriseSecurityContext.authDisabled( mode );
            }

            @Override
            public String description()
            {
                return "AUTH_DISABLED with " + this.mode().name();
            }

            @Override
            public String toString()
            {
                return this.defaultString( "enterprise-auth-disabled" );
            }
        };
    }

    @Override
    public boolean isAdmin()
    {
        return enterpriseAdminAccessMode.allows( AdminActionOnResource.ALL );
    }

    @Override
    public boolean allowsAdminAction( AdminActionOnResource action )
    {
        return this.enterpriseAdminAccessMode.allows( action );
    }

    @Override
    public EnterpriseSecurityContext authorize( IdLookup idLookup, String dbName )
    {
        return this;
    }

    @Override
    public EnterpriseSecurityContext withMode( AccessMode mode )
    {
        return new EnterpriseSecurityContext( subject, mode, roles, enterpriseAdminAccessMode );
    }

    /**
     * Get the roles of the authenticated user.
     */
    @Override
    public Set<String> roles()
    {
        return roles;
    }
}
