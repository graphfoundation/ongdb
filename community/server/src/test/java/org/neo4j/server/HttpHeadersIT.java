/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) 2002-2020 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.server;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.neo4j.kernel.configuration.ssl.SslPolicyConfig;
import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.helpers.CommunityServerBuilder;
import org.neo4j.ssl.ClientAuth;
import org.neo4j.test.server.ExclusiveServerTestBase;
import org.neo4j.test.server.InsecureTrustManager;

import static java.util.Collections.emptyList;
import static org.eclipse.jetty.http.HttpHeader.SERVER;
import static org.eclipse.jetty.http.HttpHeader.STRICT_TRANSPORT_SECURITY;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.neo4j.server.helpers.CommunityServerBuilder.serverOnRandomPorts;

public class HttpHeadersIT extends ExclusiveServerTestBase
{
    private static final String HSTS_HEADER_VALUE = "max-age=31536000; includeSubDomains; preload";

    private SSLSocketFactory originalSslSocketFactory;
    private CommunityNeoServer server;

    @Before
    public void setUp()
    {
        originalSslSocketFactory = HttpsURLConnection.getDefaultSSLSocketFactory();
    }

    @After
    public void tearDown() throws Exception
    {
        HttpsURLConnection.setDefaultSSLSocketFactory( originalSslSocketFactory );
        if ( server != null )
        {
            server.stop();
        }
    }

    @Test
    public void shouldNotSendJettyVersionWithHttpResponseHeaders() throws Exception
    {
        startServer();
        testNoJettyVersionInResponseHeaders( httpUri() );
    }

    @Test
    public void shouldNotSendJettyVersionWithHttpsResponseHeaders() throws Exception
    {
        startServer();
        testNoJettyVersionInResponseHeaders( httpsUri() );
    }

    @Test
    public void shouldNotSendHstsHeaderWithHttpResponse() throws Exception
    {
        startServer( HSTS_HEADER_VALUE );
        assertNull( runRequestAndGetHstsHeaderValue( httpUri() ) );
    }

    @Test
    public void shouldSendHstsHeaderWithHttpsResponse() throws Exception
    {
        startServer( HSTS_HEADER_VALUE );
        assertEquals( HSTS_HEADER_VALUE, runRequestAndGetHstsHeaderValue( httpsUri() ) );
    }

    @Test
    public void shouldNotSendHstsHeaderWithHttpsResponseWhenNotConfigured() throws Exception
    {
        startServer();
        assertNull( runRequestAndGetHstsHeaderValue( httpsUri() ) );
    }

    private void startServer() throws Exception
    {
        startServer( null );
    }

    private void startServer( String hstsValue ) throws Exception
    {
        server = buildServer( hstsValue );
        server.start();
    }

    private CommunityNeoServer buildServer( String hstsValue ) throws Exception
    {
        SslPolicyConfig httpsSslPolicyConfig = new SslPolicyConfig( "default" );
        CommunityServerBuilder builder = serverOnRandomPorts()
                .withHttpsEnabled()
                .usingDataDir( folder.directory( name.getMethodName() ).getAbsolutePath() )
                .withProperty( "https.ssl_policy", "default" )
                .withProperty( httpsSslPolicyConfig.base_directory.name(), folder.directory( "cert" ).getAbsolutePath() )
                .withProperty( httpsSslPolicyConfig.allow_key_generation.name(), "true" )
                .withProperty( httpsSslPolicyConfig.client_auth.name(), ClientAuth.NONE.name() )
                .withProperty( httpsSslPolicyConfig.ciphers.name(), getSupportedCipherInACommaSeparatedString() );

        if ( hstsValue != null )
        {
            builder.withProperty( ServerSettings.http_strict_transport_security.name(), hstsValue );
        }

        return builder.build();
    }

    private URI httpUri()
    {
        return server.baseUri();
    }

    private URI httpsUri()
    {
        return server.httpsUri().orElseThrow( IllegalStateException::new );
    }

    private static void testNoJettyVersionInResponseHeaders( URI baseUri ) throws Exception
    {
        Map<String,List<String>> headers = runRequestAndGetHeaders( baseUri );

        assertNull( headers.get( SERVER.asString() ) ); // no 'Server' header

        for ( List<String> values : headers.values() )
        {
            assertFalse( values.stream().anyMatch( value -> value.toLowerCase().contains( "jetty" ) ) ); // no 'jetty' in other header values
        }
    }

    private static String runRequestAndGetHstsHeaderValue( URI baseUri ) throws Exception
    {
        return runRequestAndGetHeaderValue( baseUri, STRICT_TRANSPORT_SECURITY.asString() );
    }

    private static String runRequestAndGetHeaderValue( URI baseUri, String header ) throws Exception
    {
        List<String> values = runRequestAndGetHeaderValues( baseUri, header );
        if ( values.isEmpty() )
        {
            return null;
        }
        else if ( values.size() == 1 )
        {
            return values.get( 0 );
        }
        else
        {
            throw new IllegalStateException( "Unexpected number of " + STRICT_TRANSPORT_SECURITY.asString() + " header values: " + values );
        }
    }

    private static List<String> runRequestAndGetHeaderValues( URI baseUri, String header ) throws Exception
    {
        return runRequestAndGetHeaders( baseUri ).getOrDefault( header, emptyList() );
    }

    private static Map<String,List<String>> runRequestAndGetHeaders( URI baseUri ) throws Exception
    {
        URI uri = baseUri.resolve( "db/data/transaction/commit" );
        ClientRequest request = createClientRequest( uri );

        ClientResponse response = createClient().handle( request );
        assertEquals( 200, response.getStatus() );

        return response.getHeaders();
    }

    private static ClientRequest createClientRequest( URI uri )
    {
        return ClientRequest.create()
                .header( "Accept", "application/json" )
                .build( uri, "POST" );
    }

    private static Client createClient() throws Exception
    {
        SSLContext ctx = SSLContext.getInstance( "TLSv1.2" );
        ctx.init( null, new TrustManager[]{new InsecureTrustManager()}, null );
        HttpsURLConnection.setDefaultSSLSocketFactory( ctx.getSocketFactory() );
        return Client.create();
    }

    private static String getSupportedCipherInACommaSeparatedString() throws Exception
    {
        SSLServerSocketFactory ssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        String[] defaultCiphers = ssf.getDefaultCipherSuites();
        return String.join( ",", defaultCiphers );
    }
}
