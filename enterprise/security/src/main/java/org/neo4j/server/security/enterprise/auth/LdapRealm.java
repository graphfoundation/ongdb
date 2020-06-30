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

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.AllowAllCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.ldap.DefaultLdapRealm;
import org.apache.shiro.realm.ldap.JndiLdapContextFactory;
import org.apache.shiro.realm.ldap.LdapContextFactory;
import org.apache.shiro.realm.ldap.LdapUtils;
import org.apache.shiro.subject.PrincipalCollection;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.naming.AuthenticationException;
import javax.naming.CommunicationException;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import javax.naming.ldap.StartTlsRequest;
import javax.naming.ldap.StartTlsResponse;

import org.neo4j.configuration.Config;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.graphdb.security.AuthProviderFailedException;
import org.neo4j.graphdb.security.AuthProviderTimeoutException;
import org.neo4j.graphdb.security.AuthorizationExpiredException;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.server.security.auth.ShiroAuthToken;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;
import org.neo4j.server.security.enterprise.configuration.SecuritySettings;
import org.neo4j.server.security.enterprise.log.SecurityLog;
import org.neo4j.string.SecureString;

import static java.lang.String.format;

public class LdapRealm extends DefaultLdapRealm implements RealmLifecycle, ShiroAuthorizationInfoProvider
{
    public static final String LDAP_REALM = "ldap";
    public static final String LDAP_CONNECTION_TIMEOUT_CLIENT_MESSAGE = "LDAP connection timed out.";
    public static final String LDAP_READ_TIMEOUT_CLIENT_MESSAGE = "LDAP response timed out.";
    public static final String LDAP_CONNECTION_REFUSED_CLIENT_MESSAGE = "LDAP connection refused.";
    private static final String GROUP_DELIMITER = ";";
    private static final String KEY_VALUE_DELIMITER = "=";
    private static final String ROLE_DELIMITER = ",";
    private static final String JNDI_LDAP_CONNECT_TIMEOUT = "com.sun.jndi.ldap.connect.timeout";
    private static final String JNDI_LDAP_READ_TIMEOUT = "com.sun.jndi.ldap.read.timeout";
    private static final String JNDI_LDAP_CONNECTION_TIMEOUT_MESSAGE_PART = "timed out";
    private static final String JNDI_LDAP_READ_TIMEOUT_MESSAGE_PART = "timed out";
    private static final String KEY_GROUP = "\\s*('(.+)'|\"(.+)\"|(\\S)|(\\S.*\\S))\\s*";
    private static final String VALUE_GROUP = "\\s*(.*)";
    private final SecurityLog securityLog;
    private final SecureHasher secureHasher;
    private final Boolean authenticationEnabled;
    private final Boolean authorizationEnabled;
    private final Pattern keyValuePattern = Pattern.compile( "\\s*('(.+)'|\"(.+)\"|(\\S)|(\\S.*\\S))\\s*=\\s*(.*)" );
    private Boolean useStartTls;
    private boolean useSAMAccountName;
    private String userSearchBase;
    private String userSearchFilter;
    private List<String> membershipAttributeNames;
    private Boolean useSystemAccountForAuthorization;
    private Map<String,Collection<String>> groupToRoleMapping;

    public LdapRealm( Config config, SecurityLog securityLog, SecureHasher secureHasher, boolean authenticationEnabled, boolean authorizationEnabled )
    {
        this.securityLog = securityLog;
        this.secureHasher = secureHasher;
        this.authenticationEnabled = authenticationEnabled;
        this.authorizationEnabled = authorizationEnabled;
        this.setName( "ldap" );
        this.configureRealm( config );
        if ( this.isAuthenticationCachingEnabled() )
        {
            this.setCredentialsMatcher( secureHasher.getHashedCredentialsMatcher() );
        }
        else
        {
            this.setCredentialsMatcher( new AllowAllCredentialsMatcher() );
        }
    }

    private String withRealm( String template, Object... args )
    {
        return "{LdapRealm}: " + format( template, args );
    }

    private String server( JndiLdapContextFactory jndiLdapContextFactory )
    {
        return "'" + jndiLdapContextFactory.getUrl() + "'" +
               (useStartTls ? " using StartTLS" : "");
    }

    protected AuthenticationInfo queryForAuthenticationInfo( AuthenticationToken token, LdapContextFactory ldapContextFactory ) throws NamingException
    {
        if ( !this.authenticationEnabled )
        {
            return null;
        }
        else if ( this.useSAMAccountName )
        {
            return this.queryForAuthenticationInfoSAM( token, ldapContextFactory );
        }
        else
        {
            String serverString = this.server( (JndiLdapContextFactory) ldapContextFactory );

            try
            {
                AuthenticationInfo info = this.useStartTls ? this.queryForAuthenticationInfoUsingStartTls( token, ldapContextFactory )
                                                           : super.queryForAuthenticationInfo( token, ldapContextFactory );
                this.securityLog.debug( this.withRealm( "Authenticated user '%s' against %s", token.getPrincipal(), serverString ) );
                return info;
            }
            catch ( Exception e )
            {
                if ( this.isExceptionAnLdapConnectionTimeout( e ) )
                {
                    throw new AuthProviderTimeoutException( "LDAP connection timed out.", e );
                }
                else if ( this.isExceptionAnLdapReadTimeout( e ) )
                {
                    throw new AuthProviderTimeoutException( "LDAP response timed out.", e );
                }
                else if ( this.isExceptionConnectionRefused( e ) )
                {
                    throw new AuthProviderFailedException( "LDAP connection refused.", e );
                }
                else
                {
                    throw e;
                }
            }
        }
    }

    protected AuthenticationInfo queryForAuthenticationInfoUsingStartTls( AuthenticationToken token, LdapContextFactory ldapContextFactory )
            throws NamingException
    {
        Object principal = this.getLdapPrincipal( token );
        Object credentials = token.getCredentials();
        LdapContext ctx = null;

        try
        {
            ctx = this.getLdapContextUsingStartTls( ldapContextFactory, principal, credentials );
            return this.createAuthenticationInfo( token, principal, credentials, ctx );
        }
        finally
        {
            LdapUtils.closeContext( ctx );
        }
    }

    private LdapContext getLdapContextUsingStartTls( LdapContextFactory ldapContextFactory, Object principal, Object credentials ) throws NamingException
    {
        JndiLdapContextFactory jndiLdapContextFactory = (JndiLdapContextFactory) ldapContextFactory;
        Hashtable<String,Object> env = new Hashtable();
        env.put( "java.naming.factory.initial", jndiLdapContextFactory.getContextFactoryClassName() );
        env.put( "java.naming.provider.url", jndiLdapContextFactory.getUrl() );
        InitialLdapContext ctx = null;

        try
        {
            ctx = new InitialLdapContext( env, null );
            StartTlsRequest startTlsRequest = new StartTlsRequest();
            StartTlsResponse tls = (StartTlsResponse) ctx.extendedOperation( startTlsRequest );
            tls.negotiate();
            ctx.addToEnvironment( "java.naming.security.authentication", jndiLdapContextFactory.getAuthenticationMechanism() );
            ctx.addToEnvironment( "java.naming.security.principal", principal );
            ctx.addToEnvironment( "java.naming.security.credentials", credentials );
            ctx.lookup( principal.toString() );
            return ctx;
        }
        catch ( IOException e )
        {
            LdapUtils.closeContext( ctx );
            this.securityLog.error( this.withRealm( "Failed to negotiate TLS connection with '%s': ", this.server( jndiLdapContextFactory ), e ) );
            throw new CommunicationException( e.getMessage() );
        }
        catch ( Throwable e )
        {
            LdapUtils.closeContext( ctx );
            this.securityLog.error(
                    this.withRealm( "Unexpected failure to negotiate TLS connection with '%s': ", this.server( jndiLdapContextFactory ), e ) );
            throw e;
        }
    }

    protected AuthorizationInfo queryForAuthorizationInfo( PrincipalCollection principals, LdapContextFactory ldapContextFactory ) throws NamingException
    {
        if ( this.authorizationEnabled )
        {
            String username = this.getUsername( principals );
            if ( username == null )
            {
                return null;
            }
            else if ( this.useSystemAccountForAuthorization )
            {
                LdapContext ldapContext =
                        this.useStartTls ? this.getSystemLdapContextUsingStartTls( ldapContextFactory ) : ldapContextFactory.getSystemLdapContext();

                Set roleNames;
                try
                {
                    roleNames = this.findRoleNamesForUser( username, ldapContext );
                }
                finally
                {
                    LdapUtils.closeContext( ldapContext );
                }

                return new SimpleAuthorizationInfo( roleNames );
            }
            else
            {
                Cache<Object,AuthorizationInfo> authorizationCache = this.getAuthorizationCache();
                AuthorizationInfo authorizationInfo = authorizationCache.get( username );
                if ( authorizationInfo == null )
                {
                    throw new AuthorizationExpiredException( "LDAP authorization info expired." );
                }
                else
                {
                    return authorizationInfo;
                }
            }
        }
        else
        {
            return null;
        }
    }

    private String getUsername( PrincipalCollection principals )
    {
        String username = null;
        Collection ldapPrincipals = principals.fromRealm( this.getName() );
        if ( !ldapPrincipals.isEmpty() )
        {
            username = (String) ldapPrincipals.iterator().next();
        }
        else if ( this.useSystemAccountForAuthorization )
        {
            username = (String) principals.getPrimaryPrincipal();
        }

        return username;
    }

    private LdapContext getSystemLdapContextUsingStartTls( LdapContextFactory ldapContextFactory ) throws NamingException
    {
        JndiLdapContextFactory jndiLdapContextFactory = (JndiLdapContextFactory) ldapContextFactory;
        return this.getLdapContextUsingStartTls( ldapContextFactory, jndiLdapContextFactory.getSystemUsername(), jndiLdapContextFactory.getSystemPassword() );
    }

    protected AuthenticationInfo createAuthenticationInfo( AuthenticationToken token, Object ldapPrincipal, Object ldapCredentials, LdapContext ldapContext )
            throws NamingException
    {
        if ( this.authorizationEnabled && !this.useSystemAccountForAuthorization )
        {
            String username = (String) token.getPrincipal();
            Set<String> roleNames = this.findRoleNamesForUser( username, ldapContext );
            this.cacheAuthorizationInfo( username, roleNames );
        }

        if ( this.isAuthenticationCachingEnabled() )
        {
            SimpleHash hashedCredentials = this.secureHasher.hash( (byte[]) token.getCredentials() );
            return new ShiroAuthenticationInfo( token.getPrincipal(), hashedCredentials.getBytes(), hashedCredentials.getSalt(), this.getName(),
                                                AuthenticationResult.SUCCESS );
        }
        else
        {
            return new ShiroAuthenticationInfo( token.getPrincipal(), this.getName(), AuthenticationResult.SUCCESS );
        }
    }

    public boolean supports( AuthenticationToken token )
    {
        return this.supportsSchemeAndRealm( token );
    }

    private boolean supportsSchemeAndRealm( AuthenticationToken token )
    {
        try
        {
            if ( !(token instanceof ShiroAuthToken) )
            {
                return false;
            }
            else
            {
                ShiroAuthToken shiroAuthToken = (ShiroAuthToken) token;
                return shiroAuthToken.getScheme().equals( "basic" ) && shiroAuthToken.supportsRealm( "ldap" );
            }
        }
        catch ( InvalidAuthTokenException e )
        {
            return false;
        }
    }

    protected AuthorizationInfo doGetAuthorizationInfo( PrincipalCollection principals )
    {
        try
        {
            AuthorizationInfo info = super.doGetAuthorizationInfo( principals );
            this.securityLog.debug( this.withRealm( "Queried for authorization info for user '%s'", principals.getPrimaryPrincipal() ) );
            return info;
        }
        catch ( AuthorizationException e )
        {
            this.securityLog.warn( this.withRealm( "Failed to get authorization info: '%s' caused by '%s'", e.getMessage(), e.getCause().getMessage() ) );
            return null;
        }
    }

    private boolean isExceptionAnLdapReadTimeout( Exception e )
    {
        return e instanceof NamingException && e.getMessage().contains( "timed out" );
    }

    private boolean isExceptionAnLdapConnectionTimeout( Exception e )
    {
        return e instanceof CommunicationException && (((CommunicationException) e).getRootCause() instanceof SocketTimeoutException ||
                                                       ((CommunicationException) e).getRootCause().getMessage().contains( "timed out" ));
    }

    private boolean isExceptionConnectionRefused( Exception e )
    {
        return e instanceof CommunicationException && ((CommunicationException) e).getRootCause() instanceof ConnectException;
    }

    private void cacheAuthorizationInfo( String username, Set<String> roleNames )
    {
        Cache<Object,AuthorizationInfo> authorizationCache = this.getAuthorizationCache();
        authorizationCache.put( username, new SimpleAuthorizationInfo( roleNames ) );
    }

    private void configureRealm( Config config )
    {
        JndiLdapContextFactory contextFactory = new JndiLdapContextFactory();
        Map<String,Object> environment = contextFactory.getEnvironment();
        Long connectionTimeoutMillis = config.get( SecuritySettings.ldap_connection_timeout ).toMillis();
        Long readTimeoutMillis = config.get( SecuritySettings.ldap_read_timeout ).toMillis();
        environment.put( "com.sun.jndi.ldap.connect.timeout", connectionTimeoutMillis.toString() );
        environment.put( "com.sun.jndi.ldap.read.timeout", readTimeoutMillis.toString() );
        contextFactory.setEnvironment( environment );
        contextFactory.setUrl( this.parseLdapServerUrl( config.get( SecuritySettings.ldap_server ) ) );
        contextFactory.setAuthenticationMechanism( config.get( SecuritySettings.ldap_authentication_mechanism ) );
        contextFactory.setReferral( config.get( SecuritySettings.ldap_referral ) );
        contextFactory.setSystemUsername( config.get( SecuritySettings.ldap_authorization_system_username ) );
        SecureString password = config.get( SecuritySettings.ldap_authorization_system_password );
        contextFactory.setSystemPassword( password != null ? password.getString() : null );
        contextFactory.setPoolingEnabled( config.get( SecuritySettings.ldap_authorization_connection_pooling ) );
        this.setContextFactory( contextFactory );
        String userDnTemplate = config.get( SecuritySettings.ldap_authentication_user_dn_template );
        if ( userDnTemplate != null )
        {
            this.setUserDnTemplate( userDnTemplate );
        }

        this.useStartTls = config.get( SecuritySettings.ldap_use_starttls );
        this.userSearchBase = config.get( SecuritySettings.ldap_authorization_user_search_base );
        this.userSearchFilter = config.get( SecuritySettings.ldap_authorization_user_search_filter );
        this.useSAMAccountName = config.get( SecuritySettings.ldap_authentication_use_samaccountname );
        this.membershipAttributeNames = config.get( SecuritySettings.ldap_authorization_group_membership_attribute_names );
        this.useSystemAccountForAuthorization = config.get( SecuritySettings.ldap_authorization_use_system_account );
        this.groupToRoleMapping = this.parseGroupToRoleMapping( config.get( SecuritySettings.ldap_authorization_group_to_role_mapping ) );
        this.setAuthenticationCachingEnabled( config.get( SecuritySettings.ldap_authentication_cache_enabled ) );
        this.setAuthorizationCachingEnabled( true );
    }

    private String parseLdapServerUrl( String rawLdapServer )
    {
        return rawLdapServer == null ? null : (rawLdapServer.contains( "://" ) ? rawLdapServer : "ldap://" + rawLdapServer);
    }

    private Map<String,Collection<String>> parseGroupToRoleMapping( String groupToRoleMappingString )
    {
        Map<String,Collection<String>> map = new HashMap();
        if ( groupToRoleMappingString != null )
        {

            for ( String groupAndRoles : groupToRoleMappingString.split( ";" ) )
            {
                if ( !groupAndRoles.isEmpty() )
                {
                    Matcher matcher = this.keyValuePattern.matcher( groupAndRoles );
                    String group;
                    if ( !matcher.find() || matcher.groupCount() != 6 )
                    {
                        group = String.format( "Failed to parse setting %s: wrong number of fields",
                                               SecuritySettings.ldap_authorization_group_to_role_mapping.name() );
                        throw new IllegalArgumentException( group );
                    }

                    group = matcher.group( 2 ) != null ? matcher.group( 2 ) : (matcher.group( 3 ) != null ? matcher.group( 3 )
                                                                                                          : (matcher.group( 4 ) != null ? matcher.group( 4 ) : (
                                                                                                                  matcher.group( 5 ) != null ? matcher.group(
                                                                                                                          5 ) : "")));
                    if ( group.isEmpty() )
                    {
                        String errorMessage = String.format( "Failed to parse setting %s: empty group name",
                                                             SecuritySettings.ldap_authorization_group_to_role_mapping.name() );
                        throw new IllegalArgumentException( errorMessage );
                    }

                    Collection<String> roleList = new ArrayList<>();
                    for ( String role : matcher.group( 6 ).trim().split( "," ) )
                    {
                        if ( !role.isEmpty() )
                        {
                            roleList.add( role );
                        }
                    }

                    map.put( group.toLowerCase(), roleList );
                }
            }
        }

        return map;
    }

    private AuthenticationInfo queryForAuthenticationInfoSAM( AuthenticationToken token, LdapContextFactory ldapContextFactory ) throws NamingException
    {
        Object principal = token.getPrincipal();
        Object credentials = token.getCredentials();
        LdapContext ctx = null;

        AuthenticationInfo authenticationInfo;
        try
        {
            ctx = this.useStartTls ? this.getSystemLdapContextUsingStartTls( ldapContextFactory ) : ldapContextFactory.getSystemLdapContext();
            String[] attrs = new String[]{"cn"};
            SearchControls searchCtls = new SearchControls( 2, 1L, 0, attrs, false, false );
            Object[] searchArguments = new Object[]{principal};
            String filter = "sAMAccountName={0}";
            NamingEnumeration<SearchResult> search = ctx.search( this.userSearchBase, filter, searchArguments, searchCtls );
            if ( !search.hasMore() )
            {
                throw new AuthenticationException( "No user matching: " + principal );
            }

            SearchResult next = search.next();
            String loginUser = next.getNameInNamespace();
            if ( search.hasMore() )
            {
                this.securityLog.error( "More than one user matching: " + principal );
                throw new AuthenticationException( "More than one user matching: " + principal );
            }

            LdapContext ctx2 = ldapContextFactory.getLdapContext( loginUser, credentials );
            LdapUtils.closeContext( ctx2 );
            authenticationInfo = this.createAuthenticationInfo( token, principal, credentials, ctx );
        }
        finally
        {
            LdapUtils.closeContext( ctx );
        }

        return authenticationInfo;
    }

    // TODO: Extract to an LdapAuthorizationStrategy ? This ("group by attribute") is one of multiple possible strategies
    Set<String> findRoleNamesForUser( String username, LdapContext ldapContext ) throws NamingException
    {
        Set<String> roleNames = new LinkedHashSet();
        SearchControls searchCtls = new SearchControls();
        searchCtls.setSearchScope( SearchControls.SUBTREE_SCOPE );
        searchCtls.setReturningAttributes( this.membershipAttributeNames.toArray( new String[1] ) );
        Object[] searchArguments = new Object[]{username};
        NamingEnumeration result = ldapContext.search( this.userSearchBase, this.userSearchFilter, searchArguments, searchCtls );
        if ( result.hasMoreElements() )
        {
            SearchResult searchResult = (SearchResult) result.next();
            if ( result.hasMoreElements() )
            {
                this.securityLog.warn( this.securityLog.isDebugEnabled() ? this.withRealm(
                        "LDAP user search for user principal '%s' is ambiguous. The first match that will be checked for group membership is '%s' but the search also matches '%s'. Please check your LDAP realm configuration.",
                        username, searchResult.toString(), result.next().toString() ) : this.withRealm(
                        "LDAP user search for user principal '%s' is ambiguous. The search matches more than one entry. Please check your LDAP realm configuration.",
                        username ) );
            }

            Attributes attributes = searchResult.getAttributes();
            if ( attributes != null )
            {
                NamingEnumeration attributeEnumeration = attributes.getAll();
                while ( attributeEnumeration.hasMore() )
                {
                    Attribute attribute = (Attribute) attributeEnumeration.next();
                    String attributeId = attribute.getID();
                    if ( membershipAttributeNames.stream().anyMatch( attributeId::equalsIgnoreCase ) )
                    {
                        Collection<String> groupNames = LdapUtils.getAllAttributeValues( attribute );
                        Collection<String> rolesForGroups = getRoleNamesForGroups( groupNames );
                        roleNames.addAll( rolesForGroups );
                    }
                }
            }
        }

        return roleNames;
    }

    private void assertValidUserSearchSettings()
    {
        boolean proceedWithSearch = true;
        if ( this.userSearchBase == null || this.userSearchBase.isEmpty() )
        {
            this.securityLog.error( "LDAP user search base is empty." );
            proceedWithSearch = false;
        }

        if ( this.userSearchFilter == null || !this.userSearchFilter.contains( "{0}" ) )
        {
            this.securityLog.warn(
                    "LDAP user search filter does not contain the argument placeholder {0}, so the search result will be independent of the user principal." );
        }

        if ( this.membershipAttributeNames == null || this.membershipAttributeNames.isEmpty() )
        {
            this.securityLog.error( "LDAP group membership attribute names are empty. Authorization will not be possible." );
            proceedWithSearch = false;
        }

        if ( !proceedWithSearch )
        {
            throw new IllegalArgumentException( "Illegal LDAP user search settings, see security log for details." );
        }
    }

    private Collection<String> getRoleNamesForGroups( Collection<String> groupNames )
    {
        Collection<String> roles = new ArrayList<>();
        for ( String group : groupNames )
        {
            Collection<String> rolesForGroup = groupToRoleMapping.get( group.toLowerCase() );
            if ( rolesForGroup != null )
            {
                roles.addAll( rolesForGroup );
            }
        }
        return roles;
    }

    // Exposed for testing
    Map<String,Collection<String>> getGroupToRoleMapping()
    {
        return this.groupToRoleMapping;
    }

    @Override
    public void initialize()
    {
        if ( this.authorizationEnabled )
        {
            this.assertValidUserSearchSettings();
        }
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

    public AuthorizationInfo getAuthorizationInfoSnapshot( PrincipalCollection principalCollection )
    {
        return this.getAuthorizationInfo( principalCollection );
    }
}

