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
package org.neo4j.index;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotFoundKernelException;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.api.Kernel;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.index.IndexSample;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;

import static java.nio.file.Files.delete;
import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED;
import static org.neo4j.kernel.api.KernelTransaction.Type.EXPLICIT;

@Neo4jLayoutExtension
class IndexSamplingIntegrationTest
{
    @Inject
    private DatabaseLayout databaseLayout;

    private static final String TOKEN = "Person";
    private final String property = "name";
    private final String schemaName = "schema_name";
    private final long entities = 1000;
    private final String[] names = {"ONgDB", "Graph", "Apa"};

    @ParameterizedTest
    @EnumSource( Entity.class )
    void shouldSampleNotUniqueIndex( Entity entity ) throws Throwable
    {
        GraphDatabaseService db;
        DatabaseManagementService managementService = null;
        long deletedNodes = 0;
        try
        {
            // Given
            managementService = new TestDatabaseManagementServiceBuilder( databaseLayout ).build();
            db = managementService.database( DEFAULT_DATABASE_NAME );
            try ( Transaction tx = db.beginTx() )
            {
                entity.createIndex( tx, schemaName, TOKEN, property );
                tx.commit();
            }

            try ( Transaction tx = db.beginTx() )
            {
                tx.schema().awaitIndexOnline( schemaName, 1, TimeUnit.MINUTES );
                tx.commit();
            }

            try ( Transaction tx = db.beginTx() )
            {
                for ( int i = 0; i < entities; i++ )
                {
                    entity.createEntity( tx, TOKEN, property, names[i % names.length] );
                }
                tx.commit();
            }

            try ( Transaction tx = db.beginTx() )
            {
                for ( int i = 0; i < (entities / 10); i++ )
                {
                    entity.deleteFirstFound( tx, TOKEN, property, names[i % names.length] );
                    deletedNodes++;
                }
                tx.commit();
            }
        }
        finally
        {
            if ( managementService != null )
            {
                managementService.shutdown();
            }
        }

        // When
        triggerIndexResamplingOnNextStartup();

        // Then

        // lucene will consider also the delete nodes, native won't
        var indexSample = fetchIndexSamplingValues();
        assertThat( indexSample.uniqueValues() ).as( "Unique values" ).isEqualTo( names.length );
        assertThat( indexSample.sampleSize() ).as( "Sample size" ).isGreaterThanOrEqualTo( entities - deletedNodes ).isLessThanOrEqualTo( entities );
        // but regardless, the deleted nodes should not be considered in the index size value
        assertThat( indexSample.updates() ).as( "Updates" ).isEqualTo( 0 );
        assertThat( indexSample.indexSize() ).as( "Index size" ).isEqualTo( entities - deletedNodes );
    }

    @ParameterizedTest
    @EnumSource( value = Entity.class, names = {"NODE"} )
    void shouldSampleUniqueIndex( Entity entity ) throws Throwable
    {
        GraphDatabaseService db = null;
        DatabaseManagementService managementService = null;
        long deletedNodes = 0;
        try
        {
            // Given
            managementService = new TestDatabaseManagementServiceBuilder( databaseLayout ).build();
            db = managementService.database( DEFAULT_DATABASE_NAME );
            try ( Transaction tx = db.beginTx() )
            {
                entity.createConstraint( tx, schemaName, TOKEN, property );
                tx.commit();
            }

            try ( Transaction tx = db.beginTx() )
            {
                for ( int i = 0; i < entities; i++ )
                {
                    entity.createEntity( tx, TOKEN, property, "" + i );
                }
                tx.commit();
            }

            try ( Transaction tx = db.beginTx() )
            {
                for ( int i = 0; i < entities; i++ )
                {
                    if ( i % 10 == 0 )
                    {
                        entity.deleteFirstFound( tx, TOKEN, property, "" + i );
                        deletedNodes++;
                    }
                }
                tx.commit();
            }
        }
        finally
        {
            if ( db != null )
            {
                managementService.shutdown();
            }
        }

        // When
        triggerIndexResamplingOnNextStartup();

        // Then
        var indexSample = fetchIndexSamplingValues();
        assertThat( indexSample.uniqueValues() ).as( "Unique values" ).isEqualTo( entities - deletedNodes );
        assertThat( indexSample.sampleSize() ).as( "Sample size" ).isEqualTo( entities - deletedNodes );
        assertThat( indexSample.updates() ).as( "Updates" ).isEqualTo( 0 );
        assertThat( indexSample.indexSize() ).as( "Index size" ).isEqualTo( entities - deletedNodes );
    }

    private IndexDescriptor indexId( KernelTransaction tx )
    {
        return tx.schemaRead().indexGetForName( schemaName );
    }

    private IndexSample fetchIndexSamplingValues() throws IndexNotFoundKernelException, TransactionFailureException
    {
        DatabaseManagementService managementService = null;
        try
        {
            // Then
            managementService = new TestDatabaseManagementServiceBuilder( databaseLayout ).build();
            GraphDatabaseService db = managementService.database( DEFAULT_DATABASE_NAME );
            GraphDatabaseAPI api = (GraphDatabaseAPI) db;
            Kernel kernel = api.getDependencyResolver().resolveDependency( Kernel.class );
            try ( KernelTransaction tx = kernel.beginTransaction( EXPLICIT, AUTH_DISABLED ) )
            {
                return tx.schemaRead().indexSample( indexId( tx ) );
            }
        }
        finally
        {
            if ( managementService != null )
            {
                managementService.shutdown();
            }
        }
    }

    private void triggerIndexResamplingOnNextStartup() throws IOException
    {
        // Trigger index resampling on next at startup
        delete( databaseLayout.indexStatisticsStore() );
    }

    private enum Entity
    {
        NODE
                {
                    @Override
                    void createIndex( Transaction tx, String schemaName, String token, String property )
                    {
                        tx.schema().indexFor( Label.label( token ) ).on( property ).withName( schemaName ).create();
                    }

                    @Override
                    void createConstraint( Transaction tx, String schemaName, String token, String property )
                    {
                        tx.schema().constraintFor( Label.label( token ) ).assertPropertyIsUnique( property ).withName( schemaName ).create();
                    }

                    @Override
                    void createEntity( Transaction tx, String token, String property, String value )
                    {
                        tx.createNode( Label.label( token ) ).setProperty( property, value );
                    }

                    @Override
                    void deleteFirstFound( Transaction tx, String token, String property, String value )
                    {
                        try ( var nodes = tx.findNodes( Label.label( token ), property, value ) )
                        {
                            nodes.next().delete();
                        }
                    }
                },
        RELATIONSHIP
                {
                    @Override
                    void createIndex( Transaction tx, String schemaName, String token, String property )
                    {
                        tx.schema().indexFor( RelationshipType.withName( token ) ).on( property ).withName( schemaName ).create();
                    }

                    @Override
                    void createConstraint( Transaction tx, String schemaName, String token, String property )
                    {
                        throw new IllegalStateException( "Uniqueness constraint is not supported for relationships" );
                    }

                    @Override
                    void createEntity( Transaction tx, String token, String property, String value )
                    {
                        var from = tx.createNode();
                        var to = tx.createNode();
                        from.createRelationshipTo( to, RelationshipType.withName( token ) ).setProperty( property, value );
                    }

                    @Override
                    void deleteFirstFound( Transaction tx, String token, String property, String value )
                    {
                        try ( var rels = tx.findRelationships( RelationshipType.withName( token ), property, value ) )
                        {
                            rels.next().delete();
                        }
                    }
                };

        abstract void createIndex( Transaction tx, String schemaName, String token, String property );

        abstract void createConstraint( Transaction tx, String schemaName, String token, String property );

        abstract void createEntity( Transaction tx, String token, String property, String value );

        abstract void deleteFirstFound( Transaction tx, String token, String property, String value );
    }
}
