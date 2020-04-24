/*
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Modifications Copyright (c) 2019 "GraphFoundation" [https://graphfoundation.org]
 *
 * The included source code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html).
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * Reference: https://raw.githubusercontent.com/neo4j/neo4j/3.4/enterprise/causal-clustering/src/test/java/org/neo4j/causalclustering/handlers/VoidPipelineWrapperFactoryTest.java
 */
package org.neo4j.causalclustering.handlers;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;

import org.neo4j.causalclustering.core.CausalClusteringSettings;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.configuration.ssl.SslPolicyConfig;
import org.neo4j.kernel.impl.enterprise.configuration.OnlineBackupSettings;
import org.neo4j.kernel.impl.util.Dependencies;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.ssl.PkiUtils;
import org.neo4j.test.rule.TestDirectory;

import static org.neo4j.graphdb.factory.GraphDatabaseSettings.neo4j_home;

public class SecurePipelineWrapperFactoryTest
{

    @Rule
    public TestDirectory testDirectory = TestDirectory.testDirectory();

    private File home;
    private File publicCertificateFile;
    private File privateKeyFile;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup() throws Exception
    {
        home = testDirectory.directory( "home" );
        File baseDir = new File( home, "certificates/default" );
        publicCertificateFile = new File( baseDir, "public.crt" );
        privateKeyFile = new File( baseDir, "private.key" );

        new PkiUtils().createSelfSignedCertificate( publicCertificateFile, privateKeyFile, "localhost" );

        File trustedDir = new File( baseDir, "trusted" );
        trustedDir.mkdir();
        FileUtils.copyFile( publicCertificateFile, new File( trustedDir, "public.crt" ) );
        new File( baseDir, "revoked" ).mkdir();
    }

    private SecurePipelineWrapperFactory createSecurePipelineWrapperFactory()
    {

        SecurePipelineWrapperFactory pipelineWrapperFactory = new SecurePipelineWrapperFactory();

        return pipelineWrapperFactory;
    }

    //@Test
    public void clientSslEncryptionPoliciesThrowException()
    {
        // given
        SecurePipelineWrapperFactory pipelineWrapperFactory = createSecurePipelineWrapperFactory();

        // and
        Config config = Config.defaults();
        config.augment( CausalClusteringSettings.ssl_policy, "cluster" );

        // and
        LogProvider logProvider = NullLogProvider.getInstance();
        Dependencies dependencies = null;

        // then
        expectedException.expectMessage( "Unexpected SSL policy causal_clustering.ssl_policy is a string" );

        // when
        pipelineWrapperFactory.forClient( config, dependencies, logProvider, CausalClusteringSettings.ssl_policy );
    }

    //@Test
    public void serverSslEncryptionPoliciesThrowException()
    {
        // given
        SecurePipelineWrapperFactory pipelineWrapperFactory = createSecurePipelineWrapperFactory();

        // and
        Config config = Config.defaults();
        config.augment( OnlineBackupSettings.ssl_policy, "backup" );

        // and
        LogProvider logProvider = NullLogProvider.getInstance();
        Dependencies dependencies = null;

        // then
        expectedException.expectMessage( "Unexpected SSL policy dbms.backup.ssl_policy is a string" );

        // when
        pipelineWrapperFactory.forServer( config, dependencies, logProvider, OnlineBackupSettings.ssl_policy );
    }

    //@Test
    public void clientAndServersWithoutPoliciesFail()
    {
        // given
        SecurePipelineWrapperFactory pipelineWrapperFactory = createSecurePipelineWrapperFactory();

        SslPolicyConfig policyConfig = new SslPolicyConfig( "default" );
        Config config = Config.defaults();

        // Setup SslPolicy
        config.augment( neo4j_home.name(), home.getAbsolutePath() );
        config.augment( policyConfig.base_directory.name(), "certificates/default" );

        // and
        LogProvider logProvider = NullLogProvider.getInstance();
        Dependencies dependencies = null;

        // when
        // expectedException.expect( java.lang.NullPointerException.class );
        pipelineWrapperFactory.forServer( config, dependencies, logProvider, CausalClusteringSettings.ssl_policy );
        pipelineWrapperFactory.forClient( config, dependencies, logProvider, CausalClusteringSettings.ssl_policy );
        pipelineWrapperFactory.forServer( config, dependencies, logProvider, OnlineBackupSettings.ssl_policy );
        pipelineWrapperFactory.forClient( config, dependencies, logProvider, OnlineBackupSettings.ssl_policy );
    }
}
