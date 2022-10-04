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

package org.neo4j.batchinsert.internal;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.neo4j.batchinsert.BatchInserter;
import org.neo4j.batchinsert.BatchInserters;
import org.neo4j.common.EntityType;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.internal.kernel.api.TokenPredicate;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.index.TokenIndexReader;
import org.neo4j.kernel.impl.index.schema.DatabaseIndexContext;
import org.neo4j.kernel.impl.index.schema.IndexFiles;
import org.neo4j.kernel.impl.index.schema.TokenIndexAccessor;
import org.neo4j.kernel.impl.index.schema.TokenIndexProvider;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.storageengine.api.schema.SimpleEntityTokenClient;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.utils.TestDirectory;

import static java.util.Collections.emptyMap;
import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.ongdb_home;
import static org.neo4j.configuration.GraphDatabaseSettings.preallocate_logical_logs;
import static org.neo4j.internal.kernel.api.IndexQueryConstraints.unconstrained;
import static org.neo4j.internal.schema.IndexPrototype.forSchema;
import static org.neo4j.internal.schema.SchemaDescriptors.forAnyEntityTokens;

@PageCacheExtension
@Neo4jLayoutExtension
public class BatchInsertTokenIndexesTest
{
    @Inject
    private TestDirectory testDirectory;
    @Inject
    private FileSystemAbstraction fs;
    @Inject
    private PageCache pageCache;
    @Inject
    private DatabaseLayout databaseLayout;

    private DatabaseManagementService managementService;

    @Test
    void shouldPopulateTokenIndexesOnShutdown() throws Exception
    {
        // create empty database with SSTI enabled
        try
        {
            GraphDatabaseService db = instantiateGraphDatabaseService();
            //verify there are some indexes present
            try ( var tx = db.beginTx() )
            {
                var indexes = tx.schema().getIndexes();
                assertThat( indexes ).hasSize( 2 );
                tx.schema().awaitIndexesOnline( 1, TimeUnit.MINUTES );
            }
        }
        finally
        {
            managementService.shutdown();
        }

        // insert some nodes and rels
        BatchInserter inserter = BatchInserters.inserter( databaseLayout, fs, configuration() );

        long node1 = inserter.createNode( null, Labels.FIRST );
        long node2 = inserter.createNode( null, Labels.SECOND );
        long node3 = inserter.createNode( null, Labels.THIRD );
        long node4 = inserter.createNode( null, Labels.FIRST, Labels.SECOND );
        long node5 = inserter.createNode( null, Labels.FIRST, Labels.THIRD );

        long rel1 = inserter.createRelationship( node1, node2, RelTypes.REL_TYPE1, emptyMap() );
        long rel2 = inserter.createRelationship( node2, node3, RelTypes.REL_TYPE2, emptyMap() );
        long rel3 = inserter.createRelationship( node3, node4, RelTypes.REL_TYPE3, emptyMap() );
        long rel4 = inserter.createRelationship( node3, node4, RelTypes.REL_TYPE1, emptyMap() );
        long rel5 = inserter.createRelationship( node3, node4, RelTypes.REL_TYPE3, emptyMap() );

        inserter.shutdown();

        // verify token indexes contain inserted entities
        try ( var accesor = tokenIndexAccessor( EntityType.NODE );
              var reader = accesor.newTokenReader() )
        {
            assertTokenIndexContains( reader, 0, node1, node4, node5 );
            assertTokenIndexContains( reader, 1, node2, node4 );
            assertTokenIndexContains( reader, 2, node3, node5 );
        }

        try ( var accesor = tokenIndexAccessor( EntityType.RELATIONSHIP );
              var reader = accesor.newTokenReader() )
        {
            assertTokenIndexContains( reader, 0, rel1, rel4 );
            assertTokenIndexContains( reader, 1, rel2 );
            assertTokenIndexContains( reader, 2, rel3, rel5 );
        }
    }

    private static void assertTokenIndexContains( TokenIndexReader reader, int tokenId, Long... intityIds )
    {
        SimpleEntityTokenClient tokenClient = new SimpleEntityTokenClient();
        reader.query( tokenClient, unconstrained(), new TokenPredicate( tokenId ), CursorContext.NULL );

        var found = new ArrayList<Long>();
        while ( tokenClient.next() )
        {
            found.add( tokenClient.reference );
        }
        assertThat( found ).containsExactlyInAnyOrder( intityIds );
    }

    private GraphDatabaseAPI instantiateGraphDatabaseService()
    {
        TestDatabaseManagementServiceBuilder factory = new TestDatabaseManagementServiceBuilder( databaseLayout );
        factory.setFileSystem( fs );
        managementService = factory.setConfig( configuration() ).build();
        return (GraphDatabaseAPI) managementService.database( DEFAULT_DATABASE_NAME );
    }

    private Config configuration()
    {

        return Config.newBuilder()
                     .set( ongdb_home, testDirectory.absolutePath() )
                     .set( preallocate_logical_logs, false )
                     .build();
    }

    private TokenIndexAccessor tokenIndexAccessor( EntityType entityType )
    {
        var context = DatabaseIndexContext.builder( pageCache, fs, databaseLayout.getDatabaseName() ).build();

        var id = forSchema( forAnyEntityTokens( entityType ), TokenIndexProvider.DESCRIPTOR ).withName( "index" ).materialise( 0 );
        Path path = entityType == EntityType.NODE ? databaseLayout.labelScanStore() : databaseLayout.relationshipTypeScanStore();
        return new TokenIndexAccessor( context, databaseLayout, new IndexFiles.SingleFile( fs, path ), configuration(), id,
                RecoveryCleanupWorkCollector
                        .immediate() );
    }

    private enum Labels implements Label
    {
        FIRST,
        SECOND,
        THIRD
    }

    private enum RelTypes implements RelationshipType
    {
        REL_TYPE1,
        REL_TYPE2,
        REL_TYPE3
    }
}
