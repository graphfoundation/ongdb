/*
 * Copyright (c) "Graph Foundation,"
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
 * Copyright (c) "Neo4j"
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
package org.neo4j.consistency.checker;

import org.junit.jupiter.api.Test;

import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.consistency.ConsistencyCheckService;
import org.neo4j.consistency.LookupAccessorsFromRunningDb;
import org.neo4j.consistency.checking.full.ConsistencyCheckIncompleteException;
import org.neo4j.consistency.checking.full.ConsistencyFlags;
import org.neo4j.consistency.checking.full.FullCheck;
import org.neo4j.consistency.checking.index.IndexAccessors;
import org.neo4j.consistency.report.ConsistencySummaryStatistics;
import org.neo4j.consistency.store.DirectStoreAccess;
import org.neo4j.counts.CountsAccessor;
import org.neo4j.counts.CountsStore;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.schema.IndexType;
import org.neo4j.internal.counts.RelationshipGroupDegreesStore;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.internal.id.IdGeneratorFactory;
import org.neo4j.internal.recordstorage.RecordStorageEngine;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.impl.api.index.IndexProviderMap;
import org.neo4j.kernel.impl.api.index.IndexingService;
import org.neo4j.kernel.impl.api.index.stats.IndexStatisticsStore;
import org.neo4j.kernel.impl.pagecache.ConfiguringPageCacheFactory;
import org.neo4j.kernel.impl.scheduler.JobSchedulerFactory;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.logging.NullLog;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.memory.MemoryPools;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.time.Clocks;
import org.neo4j.token.TokenHolders;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.Values;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.Config.defaults;
import static org.neo4j.configuration.GraphDatabaseSettings.memory_tracking;
import static org.neo4j.consistency.ConsistencyCheckService.defaultConsistencyCheckThreadsNumber;
import static org.neo4j.consistency.checking.full.ConsistencyFlags.DEFAULT;
import static org.neo4j.internal.helpers.progress.ProgressMonitorFactory.NONE;
import static org.neo4j.io.pagecache.tracing.PageCacheTracer.NULL;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@DbmsExtension
class IndexCheckingSelectorTest
{
    private static final Label label1 = Label.label( "Label1" );
    private static final String property1 = "property1";
    private final StringJoiner output = new StringJoiner( System.lineSeparator() );
    private final DebugContext debugContext = new DebugContext()
    {
        @Override
        public boolean debugEnabled()
        {
            return true;
        }

        @Override
        public void debug( String message )
        {
            output.add( message );
        }
    };

    @Inject
    private DatabaseManagementService dbms;
    @Inject
    private GraphDatabaseService db;
    @Inject
    private RecordDatabaseLayout layout;
    @Inject
    private PageCache pageCache;
    @Inject
    private IndexingService indexingService;
    @Inject
    private RecordStorageEngine recordStorageEngine;
    @Inject
    private IndexProviderMap indexProviderMap;
    @Inject
    private TokenHolders tokenHolders;
    @Inject
    private IndexStatisticsStore indexStatisticsStore;
    @Inject
    private IdGeneratorFactory idGeneratorFactory;
    @Inject
    private FileSystemAbstraction fs;

    @Test
    void checkLargeNodeIndexesWithIndexChecker() throws Exception
    {
        // An index is considered large if it contains more than 5% of the nodes.
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( label1 );
            node.setProperty( property1, "value" );
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().indexFor( label1 ).on( property1 ).create();
            tx.commit();
        }

        runConsistencyCheck();

        assertThat( output.toString() )
                .contains( "IndexChecker[entityType:NODE,indexesToCheck:1]" )
                .containsPattern( "NodeChecker\\[highId:.,indexesToCheck:0\\]" );
    }

    @Test
    void checkSmallNodeIndexesWithNodeChecker() throws Exception
    {
        // An index is considered small if it contains less than 5% of the nodes.
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( label1 );
            node.setProperty( property1, "value" );

            for ( int i = 0; i < 20; i++ )
            {
                tx.createNode();
            }
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().indexFor( label1 ).on( property1 ).create();
            tx.commit();
        }

        runConsistencyCheck();

        assertThat( output.toString() )
                .contains( "IndexChecker[entityType:NODE,indexesToCheck:0]" )
                .containsPattern( "NodeChecker\\[highId:..,indexesToCheck:1\\]" );
    }

    @Test
    void checkIndexesWithoutValuesWithNodeChecker() throws Exception
    {

        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( label1 );
            node.setProperty( property1, "value" );
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( "CREATE FULLTEXT INDEX FOR (n:Label1) ON EACH [n.property1]" );
            tx.commit();
        }
        dbms.shutdown();

        Config config = defaults( GraphDatabaseSettings.logs_directory, layout.databaseDirectory() );
        JobScheduler jobScheduler = JobSchedulerFactory.createInitialisedScheduler();
        ConfiguringPageCacheFactory pageCacheFactory =
                new ConfiguringPageCacheFactory( fs, config, NULL, NullLog.getInstance(),
                        jobScheduler, Clocks.nanoClock(), new MemoryPools( config.get( memory_tracking ) ) );
        PageCache pageCache = pageCacheFactory.getOrCreatePageCache();
        ConsistencyCheckService.Result result;
        try
        {
            result = new ConsistencyCheckService().runFullConsistencyCheck( layout, config, NONE, NullLogProvider.getInstance(), fs, pageCache, debugContext,
                    layout.databaseDirectory(), DEFAULT, NULL, INSTANCE );
        }
        finally
        {
            pageCache.close();
            jobScheduler.close();
        }

        assertTrue( result.isSuccessful() );

        assertThat( output.toString() )
                .contains( "IndexChecker[entityType:NODE,indexesToCheck:1]" )
                .containsPattern( "NodeChecker\\[highId:.,indexesToCheck:0\\]" );
    }

    @Test
    void checkAllRelationshipIndexesWithRelationshipChecker() throws ConsistencyCheckIncompleteException
    {
        RelationshipType relType1 = RelationshipType.withName( "RelType1" );
        RelationshipType relType2 = RelationshipType.withName( "RelType2" );

        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( label1 );
            Relationship relationship = node.createRelationshipTo( node, relType1 );
            relationship.setProperty( property1, "value" );

            for ( int i = 0; i < 20; i++ )
            {
                Node node2 = tx.createNode( label1 );
                Relationship relationship2 = node2.createRelationshipTo( node2, relType2 );
                relationship2.setProperty( property1, "value" );

            }
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            // Create one large and one small index.
            tx.schema().indexFor( relType1 ).on( property1 ).create();
            tx.schema().indexFor( relType2 ).on( property1 ).create();
            tx.commit();
        }

        runConsistencyCheck();

        // Both large and small relationship indexes should be checked by RelationshipChecker until there
        // is an IndexChecker variant that can handle relationship indexes.
        assertThat( output.toString() )
                .containsPattern( "RelationshipChecker\\[highId:..,indexesToCheck:2\\]" );
    }

    @Test
    void checkLargePointIndexesWithIndexChecker() throws ConsistencyCheckIncompleteException
    {
        // An index is considered large if it contains more than 5% of the nodes.
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( label1 );
            node.setProperty( property1, Values.pointValue( CoordinateReferenceSystem.Cartesian, 1.0, 2.0 ) );
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().indexFor( label1 ).on( property1 ).withIndexType( IndexType.POINT ).create();
            tx.commit();
        }

        runConsistencyCheck();

        assertThat( output.toString() )
                .contains( "IndexChecker[entityType:NODE,indexesToCheck:1]" )
                .containsPattern( "NodeChecker\\[highId:.,indexesToCheck:0\\]" );
    }

    private void runConsistencyCheck() throws ConsistencyCheckIncompleteException
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 1, TimeUnit.MINUTES );

            tx.commit();
        }

        ConsistencySummaryStatistics result = checkIndex();
        assertTrue( result.isConsistent() );
    }

    private ConsistencySummaryStatistics checkIndex() throws ConsistencyCheckIncompleteException
    {
        NeoStores neoStores = recordStorageEngine.testAccessNeoStores();
        DirectStoreAccess directStoreAccess = new DirectStoreAccess( neoStores,
                indexProviderMap,
                tokenHolders,
                indexStatisticsStore,
                idGeneratorFactory );
        CountsAccessor countsStore = recordStorageEngine.countsAccessor();
        RelationshipGroupDegreesStore groupDegreesStore = recordStorageEngine.relationshipGroupDegreesStore();
        IndexAccessors.IndexAccessorLookup indexAccessorLookup = new LookupAccessorsFromRunningDb( indexingService );

        FullCheck checker = new FullCheck( ProgressMonitorFactory.NONE, defaultConsistencyCheckThreadsNumber(), ConsistencyFlags.DEFAULT,
                Config.defaults(), debugContext, NodeBasedMemoryLimiter.DEFAULT );
        return checker.execute( pageCache, directStoreAccess, () -> (CountsStore) countsStore, () -> groupDegreesStore, indexAccessorLookup,
                NULL, INSTANCE, NullLog.getInstance() );
    }
}
