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

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.mgt.SubjectDAO;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.CachingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.Initializable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.neo4j.graphdb.security.AuthProviderFailedException;
import org.neo4j.graphdb.security.AuthProviderTimeoutException;
import org.neo4j.internal.helpers.Strings;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.kernel.api.security.AuthToken;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.kernel.enterprise.api.security.EnterpriseAuthManager;
import org.neo4j.kernel.enterprise.api.security.EnterpriseLoginContext;
import org.neo4j.server.security.auth.ShiroAuthToken;
import org.neo4j.server.security.enterprise.log.SecurityLog;

public class MultiRealmAuthManager implements EnterpriseAuthManager
{
    private final EnterpriseSystemGraphRealm enterpriseSystemGraphRealm;
    private final Collection<Realm> realms;
    private final DefaultSecurityManager securityManager;
    private final CacheManager cacheManager;
    private final SecurityLog securityLog;
    private final boolean logSuccessfulLogin;

    public MultiRealmAuthManager( EnterpriseSystemGraphRealm enterpriseSystemGraphRealm, Collection<Realm> realms, CacheManager cacheManager,
                                  SecurityLog securityLog,
                                  boolean logSuccessfulLogin )
    {
        this.enterpriseSystemGraphRealm = enterpriseSystemGraphRealm;
        this.realms = realms;
        this.cacheManager = cacheManager;
        this.securityManager = new DefaultSecurityManager( realms );
        this.securityLog = securityLog;
        this.logSuccessfulLogin = logSuccessfulLogin;
        this.securityManager.setSubjectFactory( new ShiroSubjectFactory() );
        ((ModularRealmAuthenticator) this.securityManager.getAuthenticator()).setAuthenticationStrategy( new ShiroAuthenticationStrategy() );
        this.securityManager.setSubjectDAO( this.createSubjectDAO() );
    }

    private SubjectDAO createSubjectDAO()
    {
        DefaultSubjectDAO subjectDAO = new DefaultSubjectDAO();
        DefaultSessionStorageEvaluator sessionStorageEvaluator = new DefaultSessionStorageEvaluator();
        sessionStorageEvaluator.setSessionStorageEnabled( false );
        subjectDAO.setSessionStorageEvaluator( sessionStorageEvaluator );
        return subjectDAO;
    }

    public EnterpriseLoginContext login( Map<String,Object> authToken ) throws InvalidAuthTokenException
    {
        StandardEnterpriseLoginContext standardEnterpriseLoginContext;
        try
        {
            ShiroAuthToken token = new ShiroAuthToken( authToken );
            this.assertValidScheme( token );

            StandardEnterpriseLoginContext securityContext;
            Throwable cause;
            try
            {
                securityContext = new StandardEnterpriseLoginContext( this, (ShiroSubject) this.securityManager.login( null, token ) );
                AuthenticationResult authenticationResult = securityContext.subject().getAuthenticationResult();
                if ( authenticationResult == AuthenticationResult.SUCCESS )
                {
                    if ( this.logSuccessfulLogin )
                    {
                        this.securityLog.info( securityContext.subject(), "logged in" );
                    }
                }
                else if ( authenticationResult == AuthenticationResult.PASSWORD_CHANGE_REQUIRED )
                {
                    this.securityLog.info( securityContext.subject(), "logged in (password change required)" );
                }
                else
                {
                    String errorMessage = ((StandardEnterpriseLoginContext.NeoShiroSubject) securityContext.subject()).getAuthenticationFailureMessage();
                    this.securityLog.error( "[%s]: failed to log in: %s", Strings.escape( token.getPrincipal().toString() ), errorMessage );
                }

                ((StandardEnterpriseLoginContext.NeoShiroSubject) securityContext.subject()).clearAuthenticationInfo();
            }
            catch ( UnsupportedTokenException e )
            {
                this.securityLog.error( "Unknown user failed to log in: %s", e.getMessage() );
                cause = e.getCause();
                if ( cause instanceof InvalidAuthTokenException )
                {

                    throw new InvalidAuthTokenException( cause.getMessage() + ": " + token );
                }

                throw AuthToken.invalidToken( ": " + token );
            }
            catch ( ExcessiveAttemptsException e )
            {
                securityContext = new StandardEnterpriseLoginContext( this, new ShiroSubject( this.securityManager, AuthenticationResult.TOO_MANY_ATTEMPTS ) );
                this.securityLog.error( "[%s]: failed to log in: too many failed attempts", Strings.escape( token.getPrincipal().toString() ) );
            }
            catch ( AuthenticationException e )
            {
                if ( e.getCause() != null && e.getCause() instanceof AuthProviderTimeoutException )
                {
                    cause = e.getCause().getCause();
                    this.securityLog.error( "[%s]: failed to log in: auth server timeout%s", Strings.escape( token.getPrincipal().toString() ),
                                            cause != null && cause.getMessage() != null ? " (" + cause.getMessage() + ")" : "" );
                    throw new AuthProviderTimeoutException( e.getCause().getMessage(), e.getCause() );
                }

                if ( e.getCause() != null && e.getCause() instanceof AuthProviderFailedException )
                {
                    cause = e.getCause().getCause();
                    this.securityLog.error( "[%s]: failed to log in: auth server connection refused%s", Strings.escape( token.getPrincipal().toString() ),
                                            cause != null && cause.getMessage() != null ? " (" + cause.getMessage() + ")" : "" );
                    throw new AuthProviderFailedException( e.getCause().getMessage(), e.getCause() );
                }

                securityContext = new StandardEnterpriseLoginContext( this, new ShiroSubject( this.securityManager, AuthenticationResult.FAILURE ) );
                cause = e.getCause();
                Throwable causeCause = e.getCause() != null ? e.getCause().getCause() : null;
                String errorMessage = String.format( "invalid principal or credentials%s%s",
                                                     cause != null && cause.getMessage() != null ? " (" + cause.getMessage() + ")" : "",
                                                     causeCause != null && causeCause.getMessage() != null ? " (" + causeCause.getMessage() + ")" : "" );
                this.securityLog.error( "[%s]: failed to log in: %s", Strings.escape( token.getPrincipal().toString() ), errorMessage );
            }

            return securityContext;
        }
        finally
        {
            AuthToken.clearCredentials( authToken );
        }
    }

    public void log( String message, SecurityContext securityContext )
    {
        this.securityLog.info( securityContext.subject(), message );
    }

    private void assertValidScheme( ShiroAuthToken token ) throws InvalidAuthTokenException
    {
        String scheme = token.getSchemeSilently();
        if ( scheme == null )
        {
            throw AuthToken.invalidToken( "missing key `scheme`: " + token );
        }
        else if ( scheme.equals( "none" ) )
        {
            throw AuthToken.invalidToken( "scheme='none' only allowed when auth is disabled: " + token );
        }
    }

    public void init() throws Exception
    {
        boolean initUserManager = true;

        for ( Realm realm : realms )
        {

            if ( this.enterpriseSystemGraphRealm == realm )
            {
                initUserManager = false;
            }

            if ( realm instanceof Initializable )
            {
                ((Initializable) realm).init();
            }

            if ( realm instanceof CachingRealm )
            {
                ((CachingRealm) realm).setCacheManager( this.cacheManager );
            }

            if ( realm instanceof RealmLifecycle )
            {
                ((RealmLifecycle) realm).initialize();
            }
        }

        if ( initUserManager )
        {
            this.enterpriseSystemGraphRealm.init();
            this.enterpriseSystemGraphRealm.setCacheManager( this.cacheManager );
            this.enterpriseSystemGraphRealm.initialize();
        }
    }

    public void start() throws Exception
    {
        boolean startUserManager = true;

        for ( Realm realm : realms )
        {
            if ( this.enterpriseSystemGraphRealm == realm )
            {
                startUserManager = false;
            }

            if ( realm instanceof RealmLifecycle )
            {
                ((RealmLifecycle) realm).start();
            }
        }

        if ( startUserManager )
        {
            this.enterpriseSystemGraphRealm.start();
        }
    }

    public void stop() throws Exception
    {
        for ( Realm realm : realms )
        {
            if ( realm instanceof RealmLifecycle )
            {
                ((RealmLifecycle) realm).stop();
            }
        }
    }

    public void shutdown() throws Exception
    {
        for ( Realm realm : realms )
        {
            if ( realm instanceof CachingRealm )
            {
                ((CachingRealm) realm).setCacheManager( null );
            }

            if ( realm instanceof RealmLifecycle )
            {
                ((RealmLifecycle) realm).shutdown();
            }
        }
    }

    public void clearAuthCache()
    {
        Cache cache;
        for ( Realm realm : realms )
        {
            if ( realm instanceof AuthenticatingRealm )
            {
                cache = ((AuthenticatingRealm) realm).getAuthenticationCache();
                if ( cache != null )
                {
                    cache.clear();
                }
            }

            if ( realm instanceof AuthorizingRealm )
            {
                cache = ((AuthorizingRealm) realm).getAuthorizationCache();
                if ( cache != null )
                {
                    cache.clear();
                }
            }
        }

        this.enterpriseSystemGraphRealm.invalidatePrivilegeCache();
    }

    Collection<AuthorizationInfo> getAuthorizationInfo( PrincipalCollection principalCollection )
    {
        List<AuthorizationInfo> infoList = new ArrayList( 1 );
        for ( Realm realm : realms )
        {
            if ( realm instanceof ShiroAuthorizationInfoProvider )
            {
                AuthorizationInfo info = ((ShiroAuthorizationInfoProvider) realm).getAuthorizationInfoSnapshot( principalCollection );
                if ( info != null )
                {
                    infoList.add( info );
                }
            }
        }

        return infoList;
    }

    Set<SecurityResourcePrivilege> getPermissions( Set<String> roles )
    {
        return this.enterpriseSystemGraphRealm.getPrivilegesForRoles( roles );
    }
}
