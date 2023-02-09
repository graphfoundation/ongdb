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
package org.neo4j.kernel.api.impl.schema;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseManagementServiceBuilder;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotFoundKernelException;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.impl.api.index.IndexProxy;
import org.neo4j.kernel.impl.api.index.IndexingService;
import org.neo4j.kernel.impl.coreapi.schema.IndexDefinitionImpl;
import org.neo4j.kernel.impl.index.schema.GenericNativeIndexProvider;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.default_schema_provider;
import static org.neo4j.test.TestLabels.LABEL_ONE;

@TestDirectoryExtension
public class DefaultSchemaIndexConfigTest
{
    private static final String KEY = "key";

    @Inject
    private TestDirectory directory;
    private DatabaseManagementServiceBuilder dbBuilder;
    private IndexDescriptor index;

    @BeforeEach
    void setup()
    {
        dbBuilder = new TestDatabaseManagementServiceBuilder( directory.homePath() );
    }

    private static Stream<GraphDatabaseSettings.SchemaIndex> providers()
    {
        List<GraphDatabaseSettings.SchemaIndex> providers = new ArrayList<>( Arrays.asList( GraphDatabaseSettings.SchemaIndex.values() ) );
        providers.add( null ); // <-- to exercise the default option
        return providers.stream();
    }

    @ParameterizedTest
    @MethodSource( "providers" )
    void shouldUseConfiguredIndexProvider( GraphDatabaseSettings.SchemaIndex provider )
    {
        // given
        DatabaseManagementServiceBuilder
                databaseManagementServiceBuilder = dbBuilder.setConfig( default_schema_provider, provider == null ? null : provider.providerName() );
        DatabaseManagementService managementService = databaseManagementServiceBuilder.build();
        GraphDatabaseService db = managementService.database( DEFAULT_DATABASE_NAME );
        try
        {
            // when
            createIndex( db );

            // then
            assertIndexProvider( provider == null ? GenericNativeIndexProvider.DESCRIPTOR.name() : provider.providerName() );
        }
        finally
        {
            managementService.shutdown();
        }
    }

    @ParameterizedTest
    @MethodSource( "providers" )
    void indexShouldHaveIndexConfig( GraphDatabaseSettings.SchemaIndex provider ) throws IndexNotFoundKernelException
    {
        DatabaseManagementServiceBuilder
                databaseManagementServiceBuilder = dbBuilder.setConfig( default_schema_provider, provider == null ? null : provider.providerName() );
        DatabaseManagementService managementService = databaseManagementServiceBuilder.build();
        GraphDatabaseService db = managementService.database( DEFAULT_DATABASE_NAME );
        try
        {
            // when
            createIndex( db );

            // then
            validateIndexConfig( db );
        }
        finally
        {
            managementService.shutdown();
        }

        managementService = databaseManagementServiceBuilder.build();
        db = managementService.database( DEFAULT_DATABASE_NAME );
        try
        {
            validateIndexConfig( db );
        }
        finally
        {
            managementService.shutdown();
        }
    }

    private void validateIndexConfig( GraphDatabaseService db ) throws IndexNotFoundKernelException
    {
        try ( Transaction tx = db.beginTx() )
        {
            GraphDatabaseAPI api = (GraphDatabaseAPI) db;
            IndexingService indexingService = getIndexingService( api );
            IndexProxy indexProxy = indexingService.getIndexProxy( index );
            Map<String,Value> indexConfig = indexProxy.indexConfig();

            // Expected default values for schema index
            assertEquals( Values.doubleArray( new double[]{-1000000.0, -1000000.0} ), indexConfig.get( "spatial.cartesian.min" ) );
            assertEquals( Values.doubleArray( new double[]{1000000.0, 1000000.0} ), indexConfig.get( "spatial.cartesian.max" ) );
            assertEquals( Values.doubleArray( new double[]{-1000000.0, -1000000.0, -1000000.0} ), indexConfig.get( "spatial.cartesian-3d.min" ) );
            assertEquals( Values.doubleArray( new double[]{1000000.0, 1000000.0, 1000000.0} ), indexConfig.get( "spatial.cartesian-3d.max" ) );
            assertEquals( Values.doubleArray( new double[]{-180.0, -90.0} ), indexConfig.get( "spatial.wgs-84.min" ) );
            assertEquals( Values.doubleArray( new double[]{180.0, 90.0} ), indexConfig.get( "spatial.wgs-84.max" ) );
            assertEquals( Values.doubleArray( new double[]{-180.0, -90.0, -1000000.0} ), indexConfig.get( "spatial.wgs-84-3d.min" ) );
            assertEquals( Values.doubleArray( new double[]{180.0, 90.0, 1000000.0} ), indexConfig.get( "spatial.wgs-84-3d.max" ) );
            tx.commit();
        }
    }

    private static IndexingService getIndexingService( GraphDatabaseAPI db )
    {
        return db.getDependencyResolver().resolveDependency( IndexingService.class );
    }

    private void assertIndexProvider( String expectedProviderIdentifier )
    {
        assertThat( index.getIndexProvider().name() ).as( "expected IndexProvider.Descriptor" ).isEqualTo(  expectedProviderIdentifier );
    }

    private void createIndex( GraphDatabaseService db )
    {
        try ( Transaction tx = db.beginTx() )
        {
            IndexDefinitionImpl indexDefinition = (IndexDefinitionImpl) tx.schema().indexFor( LABEL_ONE ).on( KEY ).create();
            index = indexDefinition.getIndexReference();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 2, TimeUnit.MINUTES );
            tx.commit();
        }
    }
}
