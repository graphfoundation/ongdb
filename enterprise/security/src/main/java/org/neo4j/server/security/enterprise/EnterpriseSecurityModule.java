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
package org.neo4j.server.security.enterprise;

import com.github.benmanes.caffeine.cache.Ticker;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.Realm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.neo4j.causalclustering.ReplicationEventNotificationService;
import org.neo4j.collection.Dependencies;
import org.neo4j.commandline.admin.security.SetDefaultAdminCommand;
import org.neo4j.common.DependencySatisfier;
import org.neo4j.configuration.Config;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.dbms.DatabaseManagementSystemSettings;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.SystemGraphInitializer;
import org.neo4j.graphdb.factory.module.DatabaseInitializer;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.kernel.api.security.SecurityModule;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.enterprise.api.security.EnterpriseAuthManager;
import org.neo4j.kernel.enterprise.api.security.EnterpriseSecurityContext;
import org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings;
import org.neo4j.kernel.internal.event.GlobalTransactionEventListeners;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.server.security.auth.CommunitySecurityModule;
import org.neo4j.server.security.auth.FileUserRepository;
import org.neo4j.server.security.auth.UserRepository;
import org.neo4j.server.security.enterprise.auth.EnterpriseSystemGraphRealm;
import org.neo4j.server.security.enterprise.auth.EnterpriseUserSecurityGraphInitializer;
import org.neo4j.server.security.enterprise.auth.FileRoleRepository;
import org.neo4j.server.security.enterprise.auth.LdapRealm;
import org.neo4j.server.security.enterprise.auth.MultiRealmAuthManager;
import org.neo4j.server.security.enterprise.auth.RoleRepository;
import org.neo4j.server.security.enterprise.auth.SecurityProcedures;
import org.neo4j.server.security.enterprise.auth.ShiroCaffeineCache;
import org.neo4j.server.security.enterprise.auth.UserManagementProcedures;
import org.neo4j.server.security.enterprise.auth.plugin.PluginRealm;
import org.neo4j.server.security.enterprise.auth.plugin.spi.AuthPlugin;
import org.neo4j.server.security.enterprise.auth.plugin.spi.AuthenticationPlugin;
import org.neo4j.server.security.enterprise.auth.plugin.spi.AuthorizationPlugin;
import org.neo4j.server.security.enterprise.configuration.SecuritySettings;
import org.neo4j.server.security.enterprise.log.SecurityLog;
import org.neo4j.server.security.systemgraph.SecurityGraphInitializer;
import org.neo4j.service.Services;
import org.neo4j.time.Clocks;

import static java.lang.String.format;

public class EnterpriseSecurityModule extends SecurityModule
{
    private static final String ROLE_STORE_FILENAME = "roles";
    private static final String DEFAULT_ADMIN_STORE_FILENAME = SetDefaultAdminCommand.ADMIN_INI;
    private static final String SYSTEM_DATABASE_NAME = "system";
    private final Config config;
    private final GlobalProcedures globalProcedures;
    private final JobScheduler scheduler;
    private final LogProvider logProvider;
    private final Log log;
    private final FileSystemAbstraction fileSystem;
    private final DependencySatisfier dependencySatisfier;
    private final GlobalTransactionEventListeners transactionEventListeners;
    private DatabaseManager<?> databaseManager;
    private boolean isClustered;
    private SystemGraphInitializer systemGraphInitializer;
    private EnterpriseAuthManager authManager;
    private EnterpriseSecurityModule.SecurityConfig securityConfig;
    private SecureHasher secureHasher;

    public EnterpriseSecurityModule( LogProvider logProvider, Config config, GlobalProcedures procedures, JobScheduler scheduler,
                                     FileSystemAbstraction fileSystem, DependencySatisfier dependencySatisfier,
                                     GlobalTransactionEventListeners transactionEventListeners )
    {
        this.logProvider = logProvider;
        this.config = config;
        this.globalProcedures = procedures;
        this.scheduler = scheduler;
        this.fileSystem = fileSystem;
        this.dependencySatisfier = dependencySatisfier;
        this.transactionEventListeners = transactionEventListeners;
        this.log = logProvider.getLog( this.getClass() );
    }

    /**
     * @param configuredRealms
     * @param availableRealms
     * @return
     */
    private static List<Realm> selectOrderedActiveRealms( List<String> configuredRealms, List<Realm> availableRealms )
    {
        List<Realm> orderedActiveRealms = new ArrayList<>( configuredRealms.size() );
        for ( String configuredRealmName : configuredRealms )
        {
            for ( Realm realm : availableRealms )
            {
                if ( configuredRealmName.equals( realm.getName() ) )
                {
                    orderedActiveRealms.add( realm );
                    break;
                }
            }
        }
        return orderedActiveRealms;
    }

    private static CacheManager createCacheManager( Config config )
    {
        long ttl = config.get( SecuritySettings.auth_cache_ttl ).toMillis();
        boolean useTTL = config.get( SecuritySettings.auth_cache_use_ttl );
        int maxCapacity = config.get( SecuritySettings.auth_cache_max_capacity );
        return new ShiroCaffeineCache.Manager( Ticker.systemTicker(), ttl, maxCapacity, useTTL );
    }

    private static List<PluginRealm> createPluginRealms( Config config, SecurityLog securityLog, SecureHasher secureHasher,
                                                         EnterpriseSecurityModule.SecurityConfig securityConfig )
    {
        List<PluginRealm> availablePluginRealms = new ArrayList<>();
        Set<Class> excludedClasses = new HashSet<>();

        if ( securityConfig.pluginAuthentication && securityConfig.pluginAuthorization )
        {
            for ( AuthPlugin plugin : Services.loadAll( AuthPlugin.class ) )
            {
                PluginRealm pluginRealm =
                        new PluginRealm( plugin, config, securityLog, Clocks.systemClock(), secureHasher );
                availablePluginRealms.add( pluginRealm );
            }
        }

        if ( securityConfig.pluginAuthentication )
        {
            for ( AuthenticationPlugin plugin : Services.loadAll( AuthenticationPlugin.class ) )
            {
                PluginRealm pluginRealm;

                if ( securityConfig.pluginAuthorization && plugin instanceof AuthorizationPlugin )
                {
                    // This plugin implements both interfaces, create a combined plugin
                    pluginRealm = new PluginRealm( plugin, (AuthorizationPlugin) plugin, config, securityLog,
                                                   Clocks.systemClock(), secureHasher );

                    // We need to make sure we do not add a duplicate when the AuthorizationPlugin service gets loaded
                    // so we allow only one instance per combined plugin class
                    excludedClasses.add( plugin.getClass() );
                }
                else
                {
                    pluginRealm =
                            new PluginRealm( plugin, null, config, securityLog, Clocks.systemClock(), secureHasher );
                }
                availablePluginRealms.add( pluginRealm );
            }
        }

        if ( securityConfig.pluginAuthorization )
        {
            for ( AuthorizationPlugin plugin : Services.loadAll( AuthorizationPlugin.class ) )
            {
                if ( !excludedClasses.contains( plugin.getClass() ) )
                {
                    availablePluginRealms.add(
                            new PluginRealm( null, plugin, config, securityLog, Clocks.systemClock(), secureHasher )
                    );
                }
            }
        }

        for ( String pluginRealmName : securityConfig.pluginAuthProviders )
        {
            if ( availablePluginRealms.stream().noneMatch( r -> r.getName().equals( pluginRealmName ) ) )
            {
                throw illegalConfiguration( format( "Failed to load auth plugin '%s'.", pluginRealmName ) );
            }
        }

        List<PluginRealm> realms = availablePluginRealms.stream().filter( ( realm ) ->
                                                                          {
                                                                              return securityConfig.pluginAuthProviders.contains( realm.getName() );
                                                                          } ).collect( Collectors.toList() );
        boolean missingAuthenticatingRealm = securityConfig.onlyPluginAuthentication() && realms.stream().noneMatch( PluginRealm::canAuthenticate );
        boolean missingAuthorizingRealm = securityConfig.onlyPluginAuthorization() && realms.stream().noneMatch( PluginRealm::canAuthorize );
        if ( !missingAuthenticatingRealm && !missingAuthorizingRealm )
        {
            return realms;
        }
        else
        {
            String missingProvider = missingAuthenticatingRealm && missingAuthorizingRealm ? "authentication or authorization"
                                                                                           : (missingAuthenticatingRealm ? "authentication" : "authorization");
            throw illegalConfiguration( String.format( "No plugin %s provider loaded even though required by configuration.", missingProvider ) );
        }
    }

    private static RoleRepository getRoleRepository( Config config, LogProvider logProvider, FileSystemAbstraction fileSystem )
    {
        return new FileRoleRepository( fileSystem, getRoleRepositoryFile( config ), logProvider );
    }

    private static UserRepository getDefaultAdminRepository( Config config, LogProvider logProvider, FileSystemAbstraction fileSystem )
    {
        return new FileUserRepository( fileSystem, getDefaultAdminRepositoryFile( config ), logProvider );
    }

    private static File getRoleRepositoryFile( Config config )
    {
        return new File( config.get( DatabaseManagementSystemSettings.auth_store_directory ).toFile(), "roles" );
    }

    private static File getDefaultAdminRepositoryFile( Config config )
    {
        return new File( config.get( DatabaseManagementSystemSettings.auth_store_directory ).toFile(), "admin.ini" );
    }

    private static IllegalArgumentException illegalConfiguration( String message )
    {
        return new IllegalArgumentException( "Illegal configuration: " + message );
    }

    /**
     * @param authenticationProviders
     * @param authorizationProviders
     * @return
     */
    static List<String> mergeAuthSegements( List<String> authenticationProviders, List<String> authorizationProviders )
    {
        Deque<String> authorizationDeque = new ArrayDeque( authorizationProviders );
        List<String> authProviders = new ArrayList();

        for ( String authenticationProvider : authenticationProviders )
        {
            if ( authProviders.contains( authenticationProvider ) )
            {
                throw illegalConfiguration( "The relative order of authentication providers and authorization providers must match." );
            }

            if ( !authorizationDeque.contains( authenticationProvider ) )
            {
                authProviders.add( authenticationProvider );
            }
            else
            {
                while ( !authorizationDeque.isEmpty() )
                {
                    String authDeque = authorizationDeque.pop();
                    authProviders.add( authDeque );
                    if ( authenticationProvider.equals( authDeque ) )
                    {
                        break;
                    }
                }
            }
        }
        authProviders.addAll( authorizationDeque );
        return authProviders;
    }

    /**
     *
     */
    public void setup()
    {
        secureHasher = new SecureHasher();
        Dependencies platformDependencies = (Dependencies) dependencySatisfier;
        this.databaseManager = platformDependencies.resolveDependency( DatabaseManager.class );
        this.systemGraphInitializer = platformDependencies.resolveDependency( SystemGraphInitializer.class );
        this.isClustered = this.config.get( EnterpriseEditionSettings.mode ) == EnterpriseEditionSettings.Mode.CORE ||
                           this.config.get( EnterpriseEditionSettings.mode ) == EnterpriseEditionSettings.Mode.READ_REPLICA;
        SecurityLog securityLog = this.setupSecurityLog();
        this.life.add( securityLog );
        this.authManager = this.newAuthManager( securityLog );
        this.life.add( this.dependencySatisfier.satisfyDependency( this.authManager ) );
        AuthManagerClearCacheEventListener databaseEventListener = new AuthManagerClearCacheEventListener( this.authManager );
        if ( this.isClustered )
        {
            ReplicationEventNotificationService replicationEventNotificationService =
                    platformDependencies.resolveDependency( ReplicationEventNotificationService.class );
            replicationEventNotificationService.registerListener( DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID, databaseEventListener );
        }
        else
        {
            this.transactionEventListeners.registerTransactionEventListener( SYSTEM_DATABASE_NAME, databaseEventListener );
        }

        this.globalProcedures.registerComponent( SecurityLog.class, ( ctx ) ->
        {
            return securityLog;
        }, false );
        this.globalProcedures.registerComponent( EnterpriseAuthManager.class, ( ctx ) ->
        {
            return this.authManager;
        }, false );
        this.globalProcedures.registerComponent( EnterpriseSecurityContext.class, ( ctx ) ->
        {
            return this.asEnterpriseEdition( ctx.securityContext() );
        }, true );
        if ( this.securityConfig.nativeAuthEnabled )
        {
            if ( (this.config.get( SecuritySettings.authentication_providers )).size() <= 1 &&
                 (this.config.get( SecuritySettings.authorization_providers )).size() <= 1 )
            {
                this.registerProcedure( this.globalProcedures, this.log, UserManagementProcedures.class, null );
            }
            else
            {
                this.registerProcedure( this.globalProcedures, this.log, UserManagementProcedures.class, "%s only applies to native users." );
            }
        }

        this.registerProcedure( this.globalProcedures, this.log, SecurityProcedures.class, null );
    }

    /**
     * @return
     */
    private SecurityLog setupSecurityLog()
    {
        try
        {
            return SecurityLog.create( this.config, this.fileSystem, this.scheduler );
        }
        catch ( IOException | SecurityException e )
        {
            String message = "Unable to create security log.";
            this.log.error( message, e );
            throw new RuntimeException( message, e );
        }
    }

    @Override
    public AuthManager authManager()
    {
        return this.authManager;
    }

    /**
     * @return
     */
    public DatabaseInitializer getDatabaseInitializer()
    {
        return ( database ) ->
        {
            Log log = this.logProvider.getLog( this.getClass() );
            EnterpriseUserSecurityGraphInitializer initializer = this.createSecurityInitializer( log );

            try
            {
                initializer.initializeSecurityGraph( database );
            }
            catch ( Throwable e )
            {
                throw new RuntimeException( e );
            }
        };
    }

    /**
     * @param securityContext
     * @return
     */
    private EnterpriseSecurityContext asEnterpriseEdition( SecurityContext securityContext )
    {
        if ( securityContext instanceof EnterpriseSecurityContext )
        {
            return (EnterpriseSecurityContext) securityContext;
        }
        else
        {
            throw new RuntimeException( "Expected " + EnterpriseSecurityContext.class.getName() + ", got " + securityContext.getClass().getName() );
        }
    }

    EnterpriseAuthManager newAuthManager( SecurityLog securityLog )
    {
        this.securityConfig = this.getValidatedSecurityConfig( this.config );
        List<Realm> realms = new ArrayList( this.securityConfig.authProviders.size() + 1 );
        SecureHasher secureHasher = new SecureHasher();
        EnterpriseSystemGraphRealm internalRealm = this.createSystemGraphRealm( this.config, securityLog );
        realms.add( internalRealm );
        if ( this.securityConfig.hasLdapProvider )
        {
            realms.add(
                    new LdapRealm( this.config, securityLog, secureHasher, this.securityConfig.ldapAuthentication, this.securityConfig.ldapAuthorization ) );
        }

        if ( !this.securityConfig.pluginAuthProviders.isEmpty() )
        {
            realms.addAll( createPluginRealms( this.config, securityLog, secureHasher, this.securityConfig ) );
        }

        List<Realm> orderedActiveRealms = selectOrderedActiveRealms( this.securityConfig.authProviders, realms );
        if ( orderedActiveRealms.isEmpty() )
        {
            throw illegalConfiguration( "No valid auth provider is active." );
        }
        else
        {
            return new MultiRealmAuthManager( internalRealm, orderedActiveRealms, createCacheManager( this.config ), securityLog,
                                              this.config.get( SecuritySettings.security_log_successful_authentication ) );
        }
    }

    private EnterpriseSecurityModule.SecurityConfig getValidatedSecurityConfig( Config config )
    {
        EnterpriseSecurityModule.SecurityConfig securityConfig = new EnterpriseSecurityModule.SecurityConfig( config );
        securityConfig.validateAuth();
        return securityConfig;
    }

    private EnterpriseUserSecurityGraphInitializer createSecurityInitializer( Log log )
    {
        UserRepository migrationUserRepository = CommunitySecurityModule.getUserRepository( this.config, this.logProvider, this.fileSystem );
        RoleRepository migrationRoleRepository = getRoleRepository( this.config, this.logProvider, this.fileSystem );
        UserRepository initialUserRepository = CommunitySecurityModule.getInitialUserRepository( this.config, this.logProvider, this.fileSystem );
        UserRepository defaultAdminRepository = getDefaultAdminRepository( this.config, this.logProvider, this.fileSystem );
        return new EnterpriseUserSecurityGraphInitializer( this.databaseManager, this.systemGraphInitializer, log, migrationUserRepository,
                                                           migrationRoleRepository,
                                                           initialUserRepository, defaultAdminRepository, this.secureHasher );
    }

    private EnterpriseSystemGraphRealm createSystemGraphRealm( Config config, SecurityLog securityLog )
    {
        SecurityGraphInitializer securityGraphInitializer = this.isClustered ? SecurityGraphInitializer.NO_OP : this.createSecurityInitializer( securityLog );
        return new EnterpriseSystemGraphRealm( securityGraphInitializer, this.databaseManager, this.secureHasher,
                                               CommunitySecurityModule.createAuthenticationStrategy( config ), this.securityConfig.nativeAuthentication,
                                               this.securityConfig.nativeAuthorization );
    }

    protected static class SecurityConfig
    {
        final List<String> authProviders;
        final Set<String> pluginAuthProviders;
        final List<String> pluginAuthenticationProviders;
        final List<String> pluginAuthorizationProviders;
        final boolean nativeAuthentication;
        final boolean nativeAuthorization;
        final boolean ldapAuthentication;
        final boolean ldapAuthorization;
        final boolean pluginAuthentication;
        final boolean pluginAuthorization;
        final boolean nativeAuthEnabled;
        private final boolean propertyAuthorization;
        private final String propertyAuthMapping;
        boolean hasNativeProvider;
        boolean hasLdapProvider;

        SecurityConfig( Config config )
        {
            List<String> authenticationProviders = new ArrayList( config.get( SecuritySettings.authentication_providers ) );
            List<String> authorizationProviders = new ArrayList( config.get( SecuritySettings.authorization_providers ) );
            this.authProviders = EnterpriseSecurityModule.mergeAuthSegements( authenticationProviders, authorizationProviders );
            this.hasNativeProvider = authenticationProviders.contains( SecuritySettings.NATIVE_REALM_NAME ) ||
                                     authorizationProviders.contains( SecuritySettings.NATIVE_REALM_NAME );
            this.hasLdapProvider =
                    authenticationProviders.contains( SecuritySettings.LDAP_REALM_NAME ) || authorizationProviders.contains( SecuritySettings.LDAP_REALM_NAME );
            this.pluginAuthenticationProviders = authenticationProviders.stream().filter( ( r ) ->
                                                                                          {
                                                                                              return r.startsWith( SecuritySettings.PLUGIN_REALM_NAME_PREFIX );
                                                                                          } ).collect( Collectors.toList() );
            this.pluginAuthorizationProviders = authorizationProviders.stream().filter( ( r ) ->
                                                                                        {
                                                                                            return r.startsWith( SecuritySettings.PLUGIN_REALM_NAME_PREFIX );
                                                                                        } ).collect( Collectors.toList() );
            this.pluginAuthProviders = new HashSet<>();
            this.pluginAuthProviders.addAll( this.pluginAuthenticationProviders );
            this.pluginAuthProviders.addAll( this.pluginAuthorizationProviders );
            this.nativeAuthentication = authenticationProviders.contains( SecuritySettings.NATIVE_REALM_NAME );
            this.nativeAuthorization = authorizationProviders.contains( SecuritySettings.NATIVE_REALM_NAME );
            this.nativeAuthEnabled = this.nativeAuthentication || this.nativeAuthorization;
            this.ldapAuthentication = authenticationProviders.contains( SecuritySettings.LDAP_REALM_NAME );
            this.ldapAuthorization = authorizationProviders.contains( SecuritySettings.LDAP_REALM_NAME );
            this.pluginAuthentication = !this.pluginAuthenticationProviders.isEmpty();
            this.pluginAuthorization = !this.pluginAuthorizationProviders.isEmpty();
            this.propertyAuthorization = config.get( SecuritySettings.property_level_authorization_enabled );
            this.propertyAuthMapping = config.get( SecuritySettings.property_level_authorization_permissions );
        }

        /**
         *
         */
        protected void validateAuth()
        {
            if ( !this.nativeAuthentication && !this.ldapAuthentication && !this.pluginAuthentication )
            {
                throw EnterpriseSecurityModule.illegalConfiguration( "No authentication provider found." );
            }
            else if ( !this.nativeAuthorization && !this.ldapAuthorization && !this.pluginAuthorization )
            {
                throw EnterpriseSecurityModule.illegalConfiguration( "No authorization provider found." );
            }
            else if ( this.propertyAuthorization || this.propertyAuthMapping != null )
            {
                throw EnterpriseSecurityModule.illegalConfiguration(
                        "Property level blacklisting through configuration setting has been replaced by privilege management on roles, e.g. 'DENY READ {property} ON GRAPH * ELEMENTS * TO role'." );
            }
        }

        boolean onlyPluginAuthentication()
        {
            return !this.nativeAuthentication && !this.ldapAuthentication && this.pluginAuthentication;
        }

        boolean onlyPluginAuthorization()
        {
            return !this.nativeAuthorization && !this.ldapAuthorization && this.pluginAuthorization;
        }
    }
}
