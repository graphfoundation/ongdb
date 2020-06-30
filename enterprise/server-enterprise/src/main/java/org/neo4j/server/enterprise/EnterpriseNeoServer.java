/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * Modifications Copyright (c) 2018-2019 "GraphFoundation" [https://graphfoundation.org]
 *
 * The included source code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html)
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 */

package org.neo4j.server.enterprise;
//import org.neo4j.causalclustering.core.CausalClusteringSettings;

import org.eclipse.jetty.util.thread.ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.regex.Pattern;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.exceptions.UnsatisfiedDependencyException;
import org.neo4j.graphdb.facade.ExternalDependencies;
import org.neo4j.kernel.impl.enterprise.settings.metrics.MetricsSettings;
import org.neo4j.logging.Log;
import org.neo4j.metrics.source.server.ServerThreadView;
import org.neo4j.metrics.source.server.ServerThreadViewSetter;
import org.neo4j.server.CommunityNeoServer;
import org.neo4j.server.database.EnterpriseGraphFactory;
import org.neo4j.server.database.GraphFactory;
import org.neo4j.server.enterprise.modules.EnterpriseAuthorizationModule;
import org.neo4j.server.modules.AuthorizationModule;
import org.neo4j.server.modules.DBMSModule;
import org.neo4j.server.modules.ServerModule;
import org.neo4j.server.rest.DatabaseRoleInfoServerModule;
import org.neo4j.server.rest.EnterpriseDiscoverableURIs;
import org.neo4j.server.rest.LegacyEnterpriseManagementModule;
import org.neo4j.server.rest.discovery.DiscoverableURIs;
import org.neo4j.server.web.Jetty9WebServer;
import org.neo4j.server.web.WebServer;

/**
 * See https://github.com/graphfoundation/ongdb/blob/3.2/enterprise/server-enterprise/src/main/java/org/neo4j/server/enterprise/EnterpriseNeoServer.java
 * https://github.com/graphfoundation/ongdb/blob/625e26f3f0a46a52085b5d65600c5521ca80a34d/community/server/src/main/java/org/neo4j/server/rest/management/VersionAndEditionService.java
 */
public class EnterpriseNeoServer extends CommunityNeoServer
{
    /**
     * @param config
     * @param dependencies
     */
    public EnterpriseNeoServer( Config config, ExternalDependencies dependencies )
    {
        super( config, new EnterpriseGraphFactory(), dependencies );
    }

    /**
     * @param config
     * @param graphFactory
     * @param dependencies
     */
    public EnterpriseNeoServer( Config config, GraphFactory graphFactory, ExternalDependencies dependencies )
    {
        super( config, graphFactory, dependencies );
    }

    /**
     * @return
     */
    protected WebServer createWebServer()
    {
        Jetty9WebServer webServer = (Jetty9WebServer) super.createWebServer();
        webServer.setJettyCreatedCallback( ( jetty ) ->
                                           {
                                               if ( (Boolean) this.getConfig().get( MetricsSettings.metricsEnabled ) )
                                               {
                                                   final ThreadPool threadPool = jetty.getThreadPool();

                                                   assert threadPool != null;

                                                   try
                                                   {
                                                       ServerThreadViewSetter setter =
                                                               (ServerThreadViewSetter) this.getSystemDatabaseDependencyResolver()
                                                                                            .resolveDependency( ServerThreadViewSetter.class );
                                                       setter.set( new ServerThreadView()
                                                       {
                                                           public int allThreads()
                                                           {
                                                               return threadPool.getThreads();
                                                           }

                                                           public int idleThreads()
                                                           {
                                                               return threadPool.getIdleThreads();
                                                           }
                                                       } );
                                                   }
                                                   catch ( UnsatisfiedDependencyException e )
                                                   {
                                                       Log log = this.userLogProvider.getLog( this.getClass() );
                                                       log.warn( "Metrics dependencies not found.", e );
                                                   }
                                               }
                                           } );
        return webServer;
    }

    protected AuthorizationModule createAuthorizationModule()
    {
        return new EnterpriseAuthorizationModule( this.webServer, this.authManagerSupplier, this.userLogProvider, this.getConfig(), this.getUriWhitelist() );
    }

    protected DBMSModule createDBMSModule()
    {
        Supplier<DiscoverableURIs> discoverableURIs = () ->
        {
            return EnterpriseDiscoverableURIs.enterpriseDiscoverableURIs( this.getConfig(),
                                                                          (ConnectorPortRegister) this.getSystemDatabaseDependencyResolver()
                                                                                                      .resolveDependency( ConnectorPortRegister.class ) );
        };
        return new DBMSModule( this.webServer, this.getConfig(), discoverableURIs, this.userLogProvider );
    }

    protected Iterable<ServerModule> createServerModules()
    {
        List<ServerModule> modules = new ArrayList();
        modules.add( new DatabaseRoleInfoServerModule( this.webServer, this.getConfig() ) );
        modules.add( new LegacyEnterpriseManagementModule( this.webServer, this.getConfig() ) );
        Iterable<ServerModule> serverModuleIterable = super.createServerModules();
        Objects.requireNonNull( modules );
        serverModuleIterable.forEach( modules::add );
        return modules;
    }

    protected List<Pattern> getUriWhitelist()
    {
        ArrayList<Pattern> result = new ArrayList( super.getUriWhitelist() );
        //if ( !this.getConfig().get( CausalClusteringSettings.status_auth_enabled ) )
        if ( false )
        {
            //result.add( CausalClusteringService.databaseClusterUriPattern( this.getConfig() ) );
            //result.add( LegacyCausalClusteringRedirectService.databaseLegacyClusterUriPattern( this.getConfig() ) );
        }

        return result;
    }
}
