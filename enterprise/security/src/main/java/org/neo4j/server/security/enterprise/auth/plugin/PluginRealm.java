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

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.nio.file.Path;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.kernel.internal.Version;
import org.neo4j.logging.Log;
import org.neo4j.server.security.auth.ShiroAuthToken;
import org.neo4j.server.security.enterprise.auth.RealmLifecycle;
import org.neo4j.server.security.enterprise.auth.ShiroAuthorizationInfoProvider;
import org.neo4j.server.security.enterprise.auth.plugin.api.AuthProviderOperations;
import org.neo4j.server.security.enterprise.auth.plugin.api.AuthToken;
import org.neo4j.server.security.enterprise.auth.plugin.api.AuthorizationExpiredException;
import org.neo4j.server.security.enterprise.auth.plugin.spi.AuthInfo;
import org.neo4j.server.security.enterprise.auth.plugin.spi.AuthPlugin;
import org.neo4j.server.security.enterprise.auth.plugin.spi.AuthenticationPlugin;
import org.neo4j.server.security.enterprise.auth.plugin.spi.AuthorizationPlugin;
import org.neo4j.server.security.enterprise.auth.plugin.spi.CustomCacheableAuthenticationInfo;
import org.neo4j.server.security.enterprise.log.SecurityLog;

public class PluginRealm extends AuthorizingRealm implements RealmLifecycle, ShiroAuthorizationInfoProvider
{
    private final Config config;
    private final Log log;
    private final Clock clock;
    private final SecureHasher secureHasher;
    private final AuthProviderOperations authProviderOperations;
    private AuthenticationPlugin authenticationPlugin;
    private AuthorizationPlugin authorizationPlugin;
    private AuthPlugin authPlugin;

    public PluginRealm( Config config, SecurityLog securityLog, Clock clock, SecureHasher secureHasher )
    {
        this.authProviderOperations = new PluginRealm.PluginRealmOperations();
        this.config = config;
        this.clock = clock;
        this.secureHasher = secureHasher;
        this.log = securityLog;
        this.setCredentialsMatcher( new PluginRealm.CredentialsMatcher() );
        // Synchronize this default value with the javadoc for AuthProviderOperations.setAuthenticationCachingEnabled
        this.setAuthenticationCachingEnabled( false );
        // Synchronize this default value with the javadoc for AuthProviderOperations.setAuthorizationCachingEnabled
        this.setAuthorizationCachingEnabled( true );
    }

    public PluginRealm( AuthenticationPlugin authenticationPlugin, AuthorizationPlugin authorizationPlugin, Config config, SecurityLog securityLog, Clock clock,
                        SecureHasher secureHasher )
    {
        this( config, securityLog, clock, secureHasher );
        this.authenticationPlugin = authenticationPlugin;
        this.authorizationPlugin = authorizationPlugin;
        this.resolvePluginName();
    }

    public PluginRealm( AuthPlugin authPlugin, Config config, SecurityLog securityLog, Clock clock, SecureHasher secureHasher )
    {
        this( config, securityLog, clock, secureHasher );
        this.authPlugin = authPlugin;
        this.resolvePluginName();
    }

    private static CustomCacheableAuthenticationInfo.CredentialsMatcher getCustomCredentialsMatcherIfPresent( AuthenticationInfo info )
    {
        return info instanceof CustomCredentialsMatcherSupplier ? ((CustomCredentialsMatcherSupplier) info).getCredentialsMatcher() : null;
    }

    private void resolvePluginName()
    {
        String pluginName = null;
        if ( this.authPlugin != null )
        {
            pluginName = this.authPlugin.name();
        }
        else if ( this.authenticationPlugin != null )
        {
            pluginName = this.authenticationPlugin.name();
        }
        else if ( this.authorizationPlugin != null )
        {
            pluginName = this.authorizationPlugin.name();
        }

        if ( pluginName != null && !pluginName.isEmpty() )
        {
            this.setName( "plugin-" + pluginName );
        }
    }

    private Collection<AuthorizationPlugin.PrincipalAndProvider> getPrincipalAndProviderCollection(
            PrincipalCollection principalCollection
    )
    {
        Collection<AuthorizationPlugin.PrincipalAndProvider> principalAndProviderCollection = new ArrayList<>();

        for ( String realm : principalCollection.getRealmNames() )
        {
            for ( Object principal : principalCollection.fromRealm( realm ) )
            {
                principalAndProviderCollection.add( new AuthorizationPlugin.PrincipalAndProvider( principal, realm ) );
            }
        }

        return principalAndProviderCollection;
    }

    protected AuthorizationInfo doGetAuthorizationInfo( PrincipalCollection principals )
    {
        if ( this.authorizationPlugin != null )
        {
            org.neo4j.server.security.enterprise.auth.plugin.spi.AuthorizationInfo authorizationInfo;
            try
            {
                authorizationInfo = this.authorizationPlugin.authorize( this.getPrincipalAndProviderCollection( principals ) );
            }
            catch ( AuthorizationExpiredException e )
            {
                throw new org.neo4j.graphdb.security.AuthorizationExpiredException(
                        "Plugin '" + this.getName() + "' authorization info expired: " + e.getMessage(), e );
            }

            if ( authorizationInfo != null )
            {
                return PluginAuthorizationInfo.create( authorizationInfo );
            }
        }
        else if ( this.authPlugin != null && !principals.fromRealm( this.getName() ).isEmpty() )
        {
            // The cached authorization info has expired.
            // Since we do not have the subject's credentials we cannot perform a new
            // authenticateAndAuthorize() to renew authorization info.
            // Instead we need to fail with a special status, so that the client can react by re-authenticating.
            throw new org.neo4j.graphdb.security.AuthorizationExpiredException( "Plugin '" + this.getName() + "' authorization info expired." );
        }

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo( AuthenticationToken token ) throws AuthenticationException
    {
        if ( token instanceof ShiroAuthToken )
        {
            try
            {
                PluginApiAuthToken pluginAuthToken =
                        PluginApiAuthToken.createFromMap( ((ShiroAuthToken) token).getAuthTokenMap() );
                try
                {
                    if ( authPlugin != null )
                    {
                        AuthInfo authInfo = authPlugin.authenticateAndAuthorize( pluginAuthToken );
                        if ( authInfo != null )
                        {
                            PluginAuthInfo pluginAuthInfo =
                                    PluginAuthInfo.createCacheable( authInfo, getName(), secureHasher );

                            cacheAuthorizationInfo( pluginAuthInfo );

                            return pluginAuthInfo;
                        }
                    }
                    else if ( authenticationPlugin != null )
                    {
                        org.neo4j.server.security.enterprise.auth.plugin.spi.AuthenticationInfo authenticationInfo =
                                authenticationPlugin.authenticate( pluginAuthToken );
                        if ( authenticationInfo != null )
                        {
                            return PluginAuthenticationInfo.createCacheable( authenticationInfo, getName(), secureHasher );
                        }
                    }
                }
                finally
                {
                    // Clear credentials
                    pluginAuthToken.clearCredentials();
                }
            }
            catch ( org.neo4j.server.security.enterprise.auth.plugin.api.AuthenticationException |
                    InvalidAuthTokenException e )
            {
                throw new AuthenticationException( e.getMessage(), e.getCause() );
            }
        }
        return null;
    }

    private void cacheAuthorizationInfo( PluginAuthInfo authInfo )
    {
        Cache<Object,AuthorizationInfo> authorizationCache = this.getAuthorizationCache();
        Object key = this.getAuthorizationCacheKey( authInfo.getPrincipals() );
        authorizationCache.put( key, authInfo );
    }

    public boolean canAuthenticate()
    {
        return this.authPlugin != null || this.authenticationPlugin != null;
    }

    public boolean canAuthorize()
    {
        return this.authPlugin != null || this.authorizationPlugin != null;
    }

    public AuthorizationInfo getAuthorizationInfoSnapshot( PrincipalCollection principalCollection )
    {
        return this.getAuthorizationInfo( principalCollection );
    }

    protected Object getAuthorizationCacheKey( PrincipalCollection principals )
    {
        return this.getAvailablePrincipal( principals );
    }

    protected Object getAuthenticationCacheKey( AuthenticationToken token )
    {
        return token != null ? token.getPrincipal() : null;
    }

    public boolean supports( AuthenticationToken token )
    {
        return this.supportsSchemeAndRealm( token );
    }

    /**
     * @param token
     * @return
     */
    private boolean supportsSchemeAndRealm( AuthenticationToken token )
    {
        if ( token instanceof ShiroAuthToken )
        {
            ShiroAuthToken shiroAuthToken = (ShiroAuthToken) token;
            return shiroAuthToken.supportsRealm( this.getName() );
        }
        else
        {
            return false;
        }
    }

    @Override
    public void initialize() throws Exception
    {
        if ( this.authenticationPlugin != null )
        {
            this.authenticationPlugin.initialize( this.authProviderOperations );
        }

        if ( this.authorizationPlugin != null && this.authorizationPlugin != this.authenticationPlugin )
        {
            this.authorizationPlugin.initialize( this.authProviderOperations );
        }

        if ( this.authPlugin != null )
        {
            this.authPlugin.initialize( this.authProviderOperations );
        }
    }

    @Override
    public void start() throws Exception
    {
        if ( this.authenticationPlugin != null )
        {
            this.authenticationPlugin.start();
        }

        if ( this.authorizationPlugin != null && this.authorizationPlugin != this.authenticationPlugin )
        {
            this.authorizationPlugin.start();
        }

        if ( this.authPlugin != null )
        {
            this.authPlugin.start();
        }
    }

    @Override
    public void stop() throws Exception
    {
        if ( this.authenticationPlugin != null )
        {
            this.authenticationPlugin.stop();
        }

        if ( this.authorizationPlugin != null && this.authorizationPlugin != this.authenticationPlugin )
        {
            this.authorizationPlugin.stop();
        }

        if ( this.authPlugin != null )
        {
            this.authPlugin.stop();
        }
    }

    @Override
    public void shutdown()
    {
        if ( this.authenticationPlugin != null )
        {
            this.authenticationPlugin.shutdown();
        }

        if ( this.authorizationPlugin != null && this.authorizationPlugin != this.authenticationPlugin )
        {
            this.authorizationPlugin.shutdown();
        }

        if ( this.authPlugin != null )
        {
            this.authPlugin.shutdown();
        }
    }

    private class PluginRealmOperations implements AuthProviderOperations
    {
        private final AuthProviderOperations.Log innerLog = new AuthProviderOperations.Log()
        {
            private String withPluginName( String msg )
            {
                return "{" + getName() + "} " + msg;
            }

            @Override
            public void debug( String message )
            {
                log.debug( withPluginName( message ) );
            }

            @Override
            public void info( String message )
            {
                log.info( withPluginName( message ) );
            }

            @Override
            public void warn( String message )
            {
                log.warn( withPluginName( message ) );
            }

            @Override
            public void error( String message )
            {
                log.error( withPluginName( message ) );
            }

            @Override
            public boolean isDebugEnabled()
            {
                return log.isDebugEnabled();
            }
        };

        @Override
        public Path neo4jHome()
        {
            return (config.get( GraphDatabaseSettings.neo4j_home )).toFile().getAbsoluteFile().toPath();
        }

        @Override
        public Optional<Path> neo4jConfigFile()
        {
            return Optional.empty();
        }

        @Override
        public String neo4jVersion()
        {
            return Version.getNeo4jVersion();
        }

        @Override
        public Clock clock()
        {
            return clock;
        }

        @Override
        public AuthProviderOperations.Log log()
        {
            return this.innerLog;
        }

        @Override
        public void setAuthenticationCachingEnabled( boolean authenticationCachingEnabled )
        {
            setAuthenticationCachingEnabled( authenticationCachingEnabled );
        }

        @Override
        public void setAuthorizationCachingEnabled( boolean authorizationCachingEnabled )
        {
            setAuthorizationCachingEnabled( authorizationCachingEnabled );
        }
    }

    private class CredentialsMatcher implements org.apache.shiro.authc.credential.CredentialsMatcher
    {
        @Override
        public boolean doCredentialsMatch( AuthenticationToken token, AuthenticationInfo info )
        {
            CustomCacheableAuthenticationInfo.CredentialsMatcher
                    customCredentialsMatcher = getCustomCredentialsMatcherIfPresent( info );

            if ( customCredentialsMatcher != null )
            {
                // Authentication info is originating from a CustomCacheableAuthenticationInfo
                Map<String,Object> authToken = ((ShiroAuthToken) token).getAuthTokenMap();
                try
                {
                    AuthToken pluginApiAuthToken = PluginApiAuthToken.createFromMap( authToken );
                    try
                    {
                        return customCredentialsMatcher.doCredentialsMatch( pluginApiAuthToken );
                    }
                    finally
                    {
                        // Clear credentials
                        char[] credentials = pluginApiAuthToken.credentials();
                        if ( credentials != null )
                        {
                            Arrays.fill( credentials, (char) 0 );
                        }
                    }
                }
                catch ( InvalidAuthTokenException e )
                {
                    throw new AuthenticationException( e.getMessage() );
                }
            }
            else if ( info.getCredentials() != null )
            {
                // Authentication info is originating from a CacheableAuthenticationInfo or a CacheableAuthInfo
                PluginShiroAuthToken pluginShiroAuthToken = PluginShiroAuthToken.of( token );
                try
                {
                    return secureHasher.getHashedCredentialsMatcher().doCredentialsMatch( pluginShiroAuthToken, info );
                }
                finally
                {
                    pluginShiroAuthToken.clearCredentials();
                }
            }
            else
            {
                // Authentication info is originating from an AuthenticationInfo or an AuthInfo
                if ( PluginRealm.this.isAuthenticationCachingEnabled() )
                {
                    log.error( "Authentication caching is enabled in plugin %s but it does not return " +
                               "cacheable credentials. This configuration is not secure.", getName() );
                    return false;
                }
                return true; // Always match if we do not cache credentials
            }
        }
    }
}
