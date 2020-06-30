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
package org.neo4j.server.security.enterprise.auth.plugin;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;
import org.neo4j.server.security.enterprise.auth.plugin.spi.AuthInfo;
import org.neo4j.server.security.enterprise.auth.plugin.spi.CacheableAuthInfo;

public class PluginAuthInfo extends ShiroAuthenticationInfo implements AuthorizationInfo
{
    Set<String> roles;

    private PluginAuthInfo( Object principal, String realmName, Set<String> roles )
    {
        super( principal, realmName, AuthenticationResult.SUCCESS );
        this.roles = roles;
    }

    private PluginAuthInfo( Object principal, Object hashedCredentials, ByteSource credentialsSalt,
                            String realmName, Set<String> roles )
    {
        super( principal, hashedCredentials, credentialsSalt, realmName, AuthenticationResult.SUCCESS );
        this.roles = roles;
    }

    private PluginAuthInfo( AuthInfo authInfo, SimpleHash hashedCredentials, String realmName )
    {
        this( authInfo.principal(), hashedCredentials.getBytes(), hashedCredentials.getSalt(), realmName,
              new HashSet<>( authInfo.roles() ) );
    }

    public static PluginAuthInfo create( AuthInfo authInfo, String realmName )
    {
        return new PluginAuthInfo( authInfo.principal(), realmName, new HashSet<>( authInfo.roles() ) );
    }

    public static PluginAuthInfo createCacheable( AuthInfo authInfo, String realmName, SecureHasher secureHasher )
    {
        if ( authInfo instanceof CacheableAuthInfo )
        {
            byte[] credentials = ((CacheableAuthInfo) authInfo).credentials();
            SimpleHash hashedCredentials = secureHasher.hash( credentials );
            return new PluginAuthInfo( authInfo, hashedCredentials, realmName );
        }
        else
        {
            return new PluginAuthInfo( authInfo.principal(), realmName, new HashSet<>( authInfo.roles() ) );
        }
    }

    @Override
    public Collection<String> getRoles()
    {
        return roles;
    }

    @Override
    public Collection<String> getStringPermissions()
    {
        return Collections.emptyList();
    }

    @Override
    public Collection<Permission> getObjectPermissions()
    {
        return Collections.emptyList();
    }
}
