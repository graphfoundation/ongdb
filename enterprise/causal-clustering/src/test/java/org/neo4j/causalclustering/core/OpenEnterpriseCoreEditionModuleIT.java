/*
 *
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
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
 * Reference: https://github.com/graphfoundation/ongdb/blob/3.4/enterprise/causal-clustering/src/test/java/org/neo4j/causalclustering/core/EnterpriseCoreEditionModuleIT.java
 * https://github.com/graphfoundation/ongdb/blob/fc43ec9b0d751b2a1654866a6cd1927268294351/community/neo4j/src/test/java/org/neo4j/graphdb/factory/module/edition/CommunityEditionModuleIntegrationTest.java
 */

package org.neo4j.causalclustering.core;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.function.Predicate;

import org.neo4j.causalclustering.core.state.machines.id.FreeIdFilteredIdGeneratorFactory;
import org.neo4j.causalclustering.discovery.Cluster;
import org.neo4j.causalclustering.discovery.CoreClusterMember;
import org.neo4j.graphdb.DependencyResolver;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.impl.index.IndexConfigStore;
import org.neo4j.kernel.impl.pagecache.PageCacheWarmer;
import org.neo4j.kernel.impl.storageengine.impl.recordstorage.id.BufferedIdController;
import org.neo4j.kernel.impl.storageengine.impl.recordstorage.id.IdController;
import org.neo4j.kernel.impl.store.id.IdGeneratorFactory;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFiles;
import org.neo4j.test.causalclustering.ClusterRule;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.TestDirectoryExtension;
import org.neo4j.test.rule.TestDirectory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.neo4j.kernel.impl.store.StoreFile;
//import org.neo4j.kernel.impl.storemigration.StoreFileType;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertThat;
//import static org.junit.Assert.assertTrue;

@ExtendWith( TestDirectoryExtension.class )
public class OpenEnterpriseCoreEditionModuleIT
{

    @Inject
    private TestDirectory testDirectory;

    @Rule
    public ClusterRule clusterRule = new ClusterRule();

    @Test
    public void createBufferedIdComponentsByDefault() throws Exception
    {
        Cluster cluster = clusterRule.startCluster();
        CoreClusterMember leader = cluster.awaitLeader();
        DependencyResolver dependencyResolver = leader.database().getDependencyResolver();

        IdController idController = dependencyResolver.resolveDependency( IdController.class );
        IdGeneratorFactory idGeneratorFactory = dependencyResolver.resolveDependency( IdGeneratorFactory.class );

        assertThat( idController, instanceOf( BufferedIdController.class ) );
        assertThat( idGeneratorFactory, instanceOf( FreeIdFilteredIdGeneratorFactory.class ) );
    }

    @Test
    public void fileWatcherFileNameFilter()
    {
        DatabaseLayout layout = testDirectory.databaseLayout();

        Predicate<String> filter = EnterpriseCoreEditionModule.fileWatcherFileNameFilter();
        assertFalse( filter.test( layout.metadataStore().getName() ) );
        assertFalse( filter.test( layout.nodeStore().getName() ) );
        assertTrue( filter.test( TransactionLogFiles.DEFAULT_NAME + ".1" ) );
        assertTrue( filter.test( IndexConfigStore.INDEX_DB_FILE_NAME + ".any" ) );
        assertTrue( filter.test( layout.metadataStore().getName() + PageCacheWarmer.SUFFIX_CACHEPROF ) );
    }
}
