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
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * Reference: https://raw.githubusercontent.com/neo4j/neo4j/3.4/enterprise/causal-clustering/src/test/java/org/neo4j/causalclustering/discovery/HazelcastCoreTopologyServiceTest.java
 */
package org.neo4j.causalclustering.discovery;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;
import java.util.Map;
import java.util.UUID;

import org.neo4j.causalclustering.core.CausalClusteringSettings;
import org.neo4j.causalclustering.identity.MemberId;
import org.neo4j.graphdb.factory.module.PlatformModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.kernel.configuration.BoltConnector;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.configuration.ssl.SslPolicyConfig;
import org.neo4j.kernel.configuration.ssl.SslPolicyLoader;
import org.neo4j.kernel.impl.enterprise.EnterpriseEditionModule;
import org.neo4j.kernel.impl.scheduler.JobSchedulerFactory;
import org.neo4j.kernel.monitoring.Monitors;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.ports.allocation.PortAuthority;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.PkiUtils;
import org.neo4j.ssl.SslPolicy;
import org.neo4j.test.rule.TestDirectory;

import static org.junit.Assert.fail;
import static org.neo4j.causalclustering.core.CausalClusteringSettings.initial_discovery_members;
import static org.neo4j.graphdb.facade.GraphDatabaseDependencies.newDependencies;
import static org.neo4j.graphdb.factory.GraphDatabaseSettings.neo4j_home;
import static org.neo4j.helpers.collection.MapUtil.stringMap;
import static org.neo4j.kernel.impl.factory.DatabaseInfo.ENTERPRISE;

public class SecureHazelcastCoreTopologyServiceTest
{
    @Rule
    public TestDirectory testDirectory = TestDirectory.testDirectory();

    private File home;
    private File publicCertificateFile;
    private File privateKeyFile;

    private static Config config()
    {
        return Config.defaults( stringMap( CausalClusteringSettings.raft_advertised_address.name(), "127.0.0.1:7000",
                CausalClusteringSettings.transaction_advertised_address.name(), "127.0.0.1:7001", new BoltConnector( "bolt" ).enabled.name(), "true",
                new BoltConnector( "bolt" ).advertised_address.name(), "127.0.0.1:7002" ) );
    }

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

    @Test( timeout = 120_000 )
    public void shouldBeAbleToStartAndStoreWithoutSuccessfulJoin()
    {
        // given
        Map<String,String> params = stringMap();

        SslPolicyConfig policyConfig = new SslPolicyConfig( "default" );

        params.put( neo4j_home.name(), home.getAbsolutePath() );
        params.put( policyConfig.base_directory.name(), "certificates/default" );

        JobScheduler jobScheduler = JobSchedulerFactory.createInitialisedScheduler();
        PlatformModule platformModule = new PlatformModule( testDirectory.storeDir(), Config.defaults(), ENTERPRISE, newDependencies() );
        AbstractEditionModule editionModule = new EnterpriseEditionModule( platformModule );
        // Random members that does not exists, discovery will never succeed
        String initialHosts = "localhost:" + PortAuthority.allocatePort() + ",localhost:" + PortAuthority.allocatePort();
        Config config = config();
        config.augment( initial_discovery_members, initialHosts );

        // Setup SslPolicy
        config.augment( neo4j_home.name(), home.getAbsolutePath() );
        config.augment( policyConfig.base_directory.name(), "certificates/default" );

        SslPolicyLoader sslPolicyLoader = SslPolicyLoader.create( config, NullLogProvider.getInstance() );

        RemoteMembersResolver remoteMembersResolver = ResolutionResolverFactory.chooseResolver( config, platformModule.logging );

        // then
        SslPolicy sslPolicy = sslPolicyLoader.getPolicy( "default" );
        Monitors monitors = new Monitors();
        SecureHazelcastCoreTopologyService service =
                new SecureHazelcastCoreTopologyService( config, sslPolicy, new MemberId( UUID.randomUUID() ), jobScheduler, NullLogProvider.getInstance(),
                        NullLogProvider.getInstance(), remoteMembersResolver, new TopologyServiceNoRetriesStrategy(), monitors );
        try
        {
            service.init();
            service.start();
            service.stop();
        }
        catch ( Throwable t )
        {
            fail( "Caught an Exception" );
        }
    }
}
