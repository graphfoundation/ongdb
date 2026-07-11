/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
package org.neo4j.causalclustering.discovery;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.SecureRequestCustomizer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.SslConnectionFactory;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.neo4j.causalclustering.core.CausalClusteringSettings;
import org.neo4j.helpers.AdvertisedSocketAddress;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.configuration.ssl.SslPolicyConfig;
import org.neo4j.kernel.configuration.ssl.SslPolicyLoader;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.ports.allocation.PortAuthority;
import org.neo4j.ssl.SslPolicy;
import org.neo4j.ssl.SslResource;
import org.neo4j.test.rule.TestDirectory;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.neo4j.causalclustering.discovery.MultiRetryStrategyTest.testRetryStrategy;
import static org.neo4j.ssl.SslResourceBuilder.selfSignedKeyId;

public class KubernetesResolverIT
{
    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Rule
    public TestDirectory testDirectory = TestDirectory.testDirectory();

    private final int port = PortAuthority.allocatePort();
    private final AssertableLogProvider logProvider = new AssertableLogProvider();
    private final AssertableLogProvider userLogProvider = new AssertableLogProvider();
    private final String testPortName = "test-port-name";
    private final String testServiceName = "test-service-name";
    private final int testPortNumber = 4313;
    private final String testNamespace = "test-namespace";
    private final String testLabelSelector = "test-label-selector";
    private final String testAuthToken = "Oh go on then";
    private final Config config = Config
            .builder()
            .withSetting( CausalClusteringSettings.kubernetes_address, "localhost:" + port )
            .withSetting( CausalClusteringSettings.kubernetes_label_selector, testLabelSelector )
            .withSetting( CausalClusteringSettings.kubernetes_service_port_name, testPortName )
            .build();

    private AdvertisedSocketAddress expectedAddress =
            new AdvertisedSocketAddress( String.format( "%s.%s.svc.cluster.local", testServiceName, testNamespace ), testPortNumber );

    private final HttpClient httpClient = new HttpClient( new SslContextFactory( true ) );

    private final HostnameResolver resolver = new KubernetesResolver.KubernetesClient(
            logProvider,
            userLogProvider,
            httpClient,
            testAuthToken,
            testNamespace,
            config,
            testRetryStrategy( 1 ) );

    @Test
    public void shouldResolveAddressesFromApiReturningShortJson() throws Throwable
    {
        withServer( shortJson(), () ->
        {
            Collection<AdvertisedSocketAddress> addresses = resolver.resolve( null );

            assertThat( addresses, contains( expectedAddress ) );
        } );
    }

    @Test
    public void shouldResolveAddressesFromApiReturningLongJson() throws Throwable
    {
        withServer( longJson(), () ->
        {
            Collection<AdvertisedSocketAddress> addresses = resolver.resolve( null );

            assertThat( addresses, contains( expectedAddress ) );
        } );
    }

    @Test
    public void shouldLogResolvedAddressesToUserLog() throws Throwable
    {
        withServer( longJson(), () ->
        {
            resolver.resolve( null );

            userLogProvider.rawMessageMatcher().assertContains(
                    Matchers.allOf(
                            Matchers.containsString( "Resolved %s from Kubernetes API at %s namespace %s labelSelector %s" )
                    )
            );
        } );
    }

    @Test
    public void shouldLogEmptyAddressesToDebugLog() throws Throwable
    {
        String response = "{ \"kind\":\"ServiceList\", \"items\":[] }";
        withServer( response, () ->
        {
            resolver.resolve( null );

            logProvider.rawMessageMatcher().assertContains(
                    Matchers.allOf(
                            Matchers.containsString( "Resolved empty hosts from Kubernetes API at %s namespace %s labelSelector %s" )
                    )
            );
        } );
    }

    @Test
    public void shouldLogParseErrorToDebugLog() throws Throwable
    {
        String response = "{}";
        withServer( response, () ->
        {
            resolver.resolve( null );
            logProvider.formattedMessageMatcher().assertContains( "Failed to parse result from Kubernetes API" );
        } );
    }

    @Test
    public void shouldReportFailureDueToAuth() throws Throwable
    {
        expected.expect( IllegalStateException.class );
        expected.expectMessage( "Forbidden" );

        withServer( failJson(), () ->
        {
            resolver.resolve( null );
        } );
    }

    public void withServer( String json, Runnable test ) throws Exception
    {
        Server server = setUp( json );

        try
        {
            test.run();
        }
        finally
        {
            tearDown( server );
        }
    }

    private String failJson() throws IOException, URISyntaxException
    {
        return readJsonFile( "authFail.json" );
    }

    private String shortJson() throws IOException, URISyntaxException
    {
        return readJsonFile( "short.json" );
    }

    private String longJson() throws IOException, URISyntaxException
    {
        return readJsonFile( "long.json" );
    }

    private String readJsonFile( final String fileName ) throws IOException, URISyntaxException
    {
        Path path = Paths.get( getClass().getResource( "/org.neo4j.causalclustering.discovery/" + fileName ).toURI() );
        String fullFile = Files.lines( path ).collect( Collectors.joining( "\n" ) );
        return String.format( fullFile, testServiceName, testPortName, testPortNumber );
    }

    private Server setUp( String response ) throws Exception
    {
        Server server = new Server();
        server.setHandler( new FakeKubernetesHandler( testNamespace, testLabelSelector, testAuthToken, response ) );

        HttpConfiguration https = new HttpConfiguration();
        https.addCustomizer( new SecureRequestCustomizer() );

        String keyStorePass = "key store pass";
        String privateKeyPass = "private key pass";
        SslResource server1 = selfSignedKeyId( 0 ).trustKeyId( 1 ).install( testDirectory.directory( "k8s" ) );
        SslPolicy sslPolicy = makeSslPolicy( server1 );
        KeyStore keyStore = sslPolicy.getKeyStore( keyStorePass.toCharArray(), privateKeyPass.toCharArray() );

        SslContextFactory sslContextFactory = new SslContextFactory();
        sslContextFactory.setKeyStore( keyStore );
        sslContextFactory.setKeyStorePassword( keyStorePass );
        sslContextFactory.setKeyManagerPassword( privateKeyPass );

        ServerConnector sslConnector = new ServerConnector(
                server,
                new SslConnectionFactory( sslContextFactory, "http/1.1" ),
                new HttpConnectionFactory( https )
        );

        sslConnector.setPort( port );

        server.setConnectors( new Connector[]{sslConnector} );

        server.start();

        httpClient.start();

        return server;
    }

    private static SslPolicy makeSslPolicy( SslResource sslResource )
    {
        Map<String,String> config = new HashMap<>();
        SslPolicyConfig policyConfig = new SslPolicyConfig( "default" );
        File baseDirectory = sslResource.privateKey().getParentFile();
        new File( baseDirectory, "trusted" ).mkdirs();
        new File( baseDirectory, "revoked" ).mkdirs();

        config.put( policyConfig.base_directory.name(), baseDirectory.getPath() );
        config.put( policyConfig.private_key.name(), sslResource.privateKey().getPath() );
        config.put( policyConfig.public_certificate.name(), sslResource.publicCertificate().getPath() );
        config.put( policyConfig.trusted_dir.name(), sslResource.trustedDirectory().getPath() );
        config.put( policyConfig.revoked_dir.name(), sslResource.revokedDirectory().getPath() );
        config.put( policyConfig.verify_hostname.name(), "false" );

        SslPolicyLoader sslPolicyFactory =
                SslPolicyLoader.create( Config.fromSettings( config ).build(), NullLogProvider.getInstance() );

        return sslPolicyFactory.getPolicy( "default" );
    }

    private void tearDown( Server server ) throws Exception
    {
        httpClient.stop();
        server.stop();
    }

    private static class FakeKubernetesHandler extends AbstractHandler
    {
        private final String expectedNamespace;
        private final String expectedLabelSelector;
        private final String expectedAuthToken;
        private final String body;

        private FakeKubernetesHandler( String expectedNamespace, String labelSelector, String authToken, String body )
        {
            this.expectedNamespace = expectedNamespace;
            this.expectedLabelSelector = labelSelector;
            this.expectedAuthToken = authToken;
            this.body = body;
        }

        @Override
        public void handle( String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response ) throws IOException
        {
            PrintWriter out = response.getWriter();
            response.setContentType( MimeTypes.Type.APPLICATION_JSON.asString() );

            String path = request.getPathInfo();
            String expectedPath = String.format( KubernetesResolver.KubernetesClient.path, expectedNamespace );

            String labelSelector = request.getParameter( "labelSelector" );
            String auth = request.getHeader( HttpHeader.AUTHORIZATION.name() );
            String expectedAuth = "Bearer " + expectedAuthToken;

            if ( !expectedPath.equals( path ) )
            {
                response.setStatus( HttpServletResponse.SC_BAD_REQUEST );
                out.println( fail( "Unexpected path: " + path ) );
            }
            else if ( !expectedLabelSelector.equals( labelSelector ) )
            {
                response.setStatus( HttpServletResponse.SC_BAD_REQUEST );
                out.println( fail( "Unexpected labelSelector: " + labelSelector ) );
            }
            else if ( !expectedAuth.equals( auth ) )
            {
                response.setStatus( HttpServletResponse.SC_BAD_REQUEST );
                out.println( fail( "Unexpected auth header value: " + auth ) );
            }
            else if ( !"GET".equals( request.getMethod() ) )
            {
                response.setStatus( HttpServletResponse.SC_BAD_REQUEST );
                out.println( fail( "Unexpected method: " + request.getMethod() ) );
            }
            else
            {
                response.setStatus( HttpServletResponse.SC_OK );
                if ( body != null )
                {
                    out.println( body );
                }
            }

            baseRequest.setHandled( true );
        }

        private String fail( String message )
        {
            return String.format( "{ \"kind\": \"Status\", \"message\": \"%s\"}", message );
        }
    }
}
