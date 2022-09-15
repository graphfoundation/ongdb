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
package org.neo4j.kernel.impl.api.integrationtest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.collection.RawIterator;
import org.neo4j.cypher.internal.ExecutionEngineQueryCacheMonitor;
import org.neo4j.graphdb.Resource;
import org.neo4j.internal.kernel.api.IndexMonitor;
import org.neo4j.internal.kernel.api.SchemaReadCore;
import org.neo4j.internal.kernel.api.SchemaWrite;
import org.neo4j.internal.kernel.api.TokenWrite;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.kernel.api.procs.ProcedureCallContext;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.LabelSchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.security.AnonymousContext;
import org.neo4j.kernel.impl.api.index.IndexSamplingMode;
import org.neo4j.kernel.internal.Version;
import org.neo4j.monitoring.Monitors;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.Values;
import org.neo4j.values.virtual.ListValue;
import org.neo4j.values.virtual.VirtualValues;

import static java.util.Collections.singletonList;
import static java.util.concurrent.TimeUnit.MINUTES;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.configuration.GraphDatabaseSettings.SYSTEM_DATABASE_NAME;
import static org.neo4j.internal.helpers.collection.Iterators.asList;
import static org.neo4j.internal.helpers.collection.Iterators.single;
import static org.neo4j.internal.kernel.api.procs.ProcedureCallContext.EMPTY;
import static org.neo4j.internal.kernel.api.procs.ProcedureSignature.procedureName;
import static org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED;
import static org.neo4j.internal.schema.SchemaDescriptors.forLabel;
import static org.neo4j.values.storable.Values.doubleValue;
import static org.neo4j.values.storable.Values.longValue;
import static org.neo4j.values.storable.Values.stringValue;

class BuiltInProceduresIT extends CommunityProcedureITBase
{
    @Test
    void listAllLabels() throws Throwable
    {
        // Given
        KernelTransaction transaction = newTransaction( AnonymousContext.writeToken() );
        long nodeId = transaction.dataWrite().nodeCreate();
        int labelId = transaction.tokenWrite().labelGetOrCreateForName( "MyLabel" );
        transaction.dataWrite().nodeAddLabel( nodeId, labelId );
        commit();

        // When
        RawIterator<AnyValue[],ProcedureException> stream =
                procs().procedureCallRead( procs().procedureGet( procedureName( "db", "labels" ) ).id(), new AnyValue[0], ProcedureCallContext.EMPTY );

        // Then
        assertThat( asList( stream ) ).containsExactly( new AnyValue[]{stringValue( "MyLabel" )} );
    }

    @Test
    void databaseInfo() throws ProcedureException
    {
        RawIterator<AnyValue[],ProcedureException> stream =
                procs().procedureCallRead( procs().procedureGet( procedureName( "db", "info" ) ).id(), new AnyValue[0], EMPTY );

        var procedureResult = asList( stream );
        assertFalse( procedureResult.isEmpty() );
        var dbInfoRow = procedureResult.get( 0 );
        assertThat( dbInfoRow ).contains( stringValue( db.databaseName() ) );
        assertThat( dbInfoRow ).hasSize( 3 );
    }

    @Test
    void dbmsInfo() throws ProcedureException
    {
        RawIterator<AnyValue[],ProcedureException> stream =
                procs().procedureCallRead( procs().procedureGet( procedureName( "dbms", "info" ) ).id(), new AnyValue[0], EMPTY );

        var procedureResult = asList( stream );
        assertFalse( procedureResult.isEmpty() );
        var dbmsInfoRow = procedureResult.get( 0 );
        assertThat( dbmsInfoRow ).contains( stringValue( SYSTEM_DATABASE_NAME ) );
        assertThat( dbmsInfoRow ).hasSize( 3 );
    }

    @Test
    @Timeout( value = 6, unit = MINUTES )
    void listAllLabelsMustNotBlockOnConstraintCreatingTransaction() throws Throwable
    {
        // Given
        KernelTransaction transaction = newTransaction( AnonymousContext.writeToken() );
        long nodeId = transaction.dataWrite().nodeCreate();
        int labelId = transaction.tokenWrite().labelGetOrCreateForName( "MyLabel" );
        int propKey = transaction.tokenWrite().propertyKeyCreateForName( "prop", false );
        transaction.dataWrite().nodeAddLabel( nodeId, labelId );
        commit();

        CountDownLatch constraintLatch = new CountDownLatch( 1 );
        CountDownLatch commitLatch = new CountDownLatch( 1 );
        FutureTask<Void> createConstraintTask = new FutureTask<>( () ->
        {
            SchemaWrite schemaWrite = schemaWriteInNewTransaction();
            try ( Resource ignore = captureTransaction() )
            {
                IndexPrototype prototype = IndexPrototype.uniqueForSchema( SchemaDescriptors.forLabel( labelId, propKey ) ).withName( "constraint name" );
                schemaWrite.uniquePropertyConstraintCreate( prototype );
                // We now hold a schema lock on the "MyLabel" label. Let the procedure calling transaction have a go.
                constraintLatch.countDown();
                commitLatch.await();
            }
            rollback();
            return null;
        } );
        Thread constraintCreator = new Thread( createConstraintTask );
        constraintCreator.start();

        // When
        constraintLatch.await();
        RawIterator<AnyValue[],ProcedureException> stream =
                procs().procedureCallRead( procs().procedureGet( procedureName( "db", "labels" ) ).id(), new AnyValue[0], ProcedureCallContext.EMPTY );

        // Then
        try
        {
            assertThat( asList( stream ) ).containsExactly( new AnyValue[]{stringValue( "MyLabel" )} );
        }
        finally
        {
            commitLatch.countDown();
        }
        createConstraintTask.get();
        constraintCreator.join();
    }

    @Test
    void listPropertyKeys() throws Throwable
    {
        // Given
        TokenWrite ops = tokenWriteInNewTransaction();
        ops.propertyKeyGetOrCreateForName( "MyProp" );
        commit();

        // When
        RawIterator<AnyValue[],ProcedureException> stream =
                procs().procedureCallRead( procs().procedureGet( procedureName( "db", "propertyKeys" ) ).id(), new AnyValue[0], ProcedureCallContext.EMPTY );

        // Then
        assertThat( asList( stream ) ).containsExactly( new AnyValue[]{stringValue( "MyProp" )} );
    }

    @Test
    void listRelationshipTypes() throws Throwable
    {
        // Given
        KernelTransaction transaction = newTransaction( AnonymousContext.writeToken() );
        int relType = transaction.tokenWrite().relationshipTypeGetOrCreateForName( "MyRelType" );
        long startNodeId = transaction.dataWrite().nodeCreate();
        long endNodeId = transaction.dataWrite().nodeCreate();
        transaction.dataWrite().relationshipCreate( startNodeId, relType, endNodeId );
        commit();

        // When
        RawIterator<AnyValue[],ProcedureException> stream =
                procs().procedureCallRead( procs().procedureGet( procedureName( "db", "relationshipTypes" ) ).id(), new AnyValue[0],
                        ProcedureCallContext.EMPTY );

        // Then
        assertThat( asList( stream ) ).containsExactly( new AnyValue[]{stringValue( "MyRelType" )} );
    }

    @Test
    void failWhenCallingNonExistingProcedures()
    {
        assertThrows( ProcedureException.class, () -> procs().procedureCallDbms( -1, new AnyValue[0], ProcedureCallContext.EMPTY ) );
    }

    @Test
    void listAllComponents() throws Throwable
    {
        // Given a running database

        // When
        RawIterator<AnyValue[],ProcedureException> stream =
                procs().procedureCallRead( procs().procedureGet( procedureName( "dbms", "components" ) ).id(), new AnyValue[0],
                        ProcedureCallContext.EMPTY );

        // Then
        assertThat( asList( stream ) ).containsExactly(
                new AnyValue[]{stringValue( "Neo4j Kernel" ), VirtualValues.list( stringValue( Version.getNeo4jVersion() ) ), stringValue( "community" )} );

        commit();
    }

    @Test
    void listAllIndexes() throws Throwable
    {
        // Given
        KernelTransaction transaction = newTransaction( AUTH_DISABLED );
        int labelId1 = transaction.tokenWrite().labelGetOrCreateForName( "Person" );
        int labelId2 = transaction.tokenWrite().labelGetOrCreateForName( "Age" );
        int propertyKeyId1 = transaction.tokenWrite().propertyKeyGetOrCreateForName( "foo" );
        int propertyKeyId2 = transaction.tokenWrite().propertyKeyGetOrCreateForName( "bar" );
        LabelSchemaDescriptor personFooDescriptor = forLabel( labelId1, propertyKeyId1 );
        LabelSchemaDescriptor ageFooDescriptor = forLabel( labelId2, propertyKeyId1 );
        LabelSchemaDescriptor personFooBarDescriptor = forLabel( labelId1, propertyKeyId1, propertyKeyId2 );
        transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( personFooDescriptor ).withName( "person foo index" ) );
        transaction.schemaWrite().uniquePropertyConstraintCreate( IndexPrototype.uniqueForSchema( ageFooDescriptor ).withName( "constraint name" ) );
        transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( personFooBarDescriptor ).withName( "person foo bar index" ) );
        commit();

        //let indexes come online
        try ( org.neo4j.graphdb.Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 2, MINUTES );
            tx.commit();
        }

        transaction = newTransaction();
        IndexDescriptor personFooIndex = single( transaction.schemaRead().index( personFooDescriptor ) );
        IndexDescriptor ageFooIndex = single( transaction.schemaRead().index( ageFooDescriptor ) );
        IndexDescriptor personFooBarIndex = single( transaction.schemaRead().index( personFooBarDescriptor ) );

        // When
        RawIterator<AnyValue[],ProcedureException> stream =
                procs().procedureCallRead( procs().procedureGet( procedureName( "db", "indexes" ) ).id(), new AnyValue[0],
                        ProcedureCallContext.EMPTY );

        Set<AnyValue[]> result = new HashSet<>();
        while ( stream.hasNext() )
        {
            result.add( stream.next() );
        }

        // Then
        assertThat( result ).contains(
                dbIndexesResult( ageFooIndex.getId(), ageFooIndex.getName(), "ONLINE", 100D, "UNIQUE", "BTREE", "NODE", singletonList( "Age" ),
                        singletonList( "foo" ), ageFooIndex.getIndexProvider().name() ),
                dbIndexesResult( personFooIndex.getId(), personFooIndex.getName(), "ONLINE", 100D, "NONUNIQUE", "BTREE", "NODE", singletonList( "Person" ),
                        singletonList( "foo" ), personFooIndex.getIndexProvider().name() ),
                dbIndexesResult( personFooBarIndex.getId(), personFooBarIndex.getName(), "ONLINE", 100D, "NONUNIQUE", "BTREE", "NODE",
                        singletonList( "Person" ), Arrays.asList( "foo", "bar" ), personFooBarIndex.getIndexProvider().name() ) );
        commit();
    }

    private static AnyValue[] dbIndexesResult( long id, String name, String state, Double populationPercent, String uniqueness, String type, String entityType,
            List<String> labelsOrTypes, List<String> properties, String provider )
    {
        ListValue labelsOrTypesList = VirtualValues.list( labelsOrTypes.stream().map( Values::stringValue ).toArray( AnyValue[]::new ) );
        ListValue propertiesList = VirtualValues.list( properties.stream().map( Values::stringValue ).toArray( AnyValue[]::new ) );
        return new AnyValue[]
                {
                        longValue( id ),
                        stringValue( name ),
                        stringValue( state ),
                        doubleValue( populationPercent ),
                        stringValue( uniqueness ),
                        stringValue( type ),
                        stringValue( entityType ),
                        labelsOrTypesList,
                        propertiesList,
                        stringValue( provider )
                };
    }

    @Test
    @Timeout( value = 6, unit = MINUTES )
    void listAllIndexesMustNotBlockOnConstraintCreatingTransaction() throws Throwable
    {
        // Given
        KernelTransaction transaction = newTransaction( AUTH_DISABLED );
        int labelId1 = transaction.tokenWrite().labelGetOrCreateForName( "Person" );
        int labelId2 = transaction.tokenWrite().labelGetOrCreateForName( "Age" );
        int propertyKeyId1 = transaction.tokenWrite().propertyKeyGetOrCreateForName( "foo" );
        int propertyKeyId2 = transaction.tokenWrite().propertyKeyGetOrCreateForName( "bar" );
        int propertyKeyId3 = transaction.tokenWrite().propertyKeyGetOrCreateForName( "baz" );
        LabelSchemaDescriptor personFooDescriptor = forLabel( labelId1, propertyKeyId1 );
        LabelSchemaDescriptor ageFooDescriptor = forLabel( labelId2, propertyKeyId1 );
        LabelSchemaDescriptor personFooBarDescriptor = forLabel( labelId1, propertyKeyId1, propertyKeyId2 );
        LabelSchemaDescriptor personBazDescriptor = forLabel( labelId1, propertyKeyId3 );
        transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( personFooDescriptor ).withName( "person foo index" ) );
        transaction.schemaWrite().uniquePropertyConstraintCreate( IndexPrototype.uniqueForSchema( ageFooDescriptor ).withName( "age foo constraint" ) );
        transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( personFooBarDescriptor ).withName( "person foo bar index" ) );
        commit();

        //let indexes come online
        try ( org.neo4j.graphdb.Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 2, MINUTES );
            tx.commit();
        }

        CountDownLatch constraintLatch = new CountDownLatch( 1 );
        CountDownLatch commitLatch = new CountDownLatch( 1 );
        AtomicLong personBazIndexId = new AtomicLong();
        FutureTask<Void> createConstraintTask = new FutureTask<>( () ->
        {
            SchemaWrite schemaWrite = schemaWriteInNewTransaction();
            try ( Resource ignore = captureTransaction() )
            {
                ConstraintDescriptor personBazConstraint = schemaWrite.uniquePropertyConstraintCreate(
                        IndexPrototype.uniqueForSchema( personBazDescriptor ).withName( "person baz constraint" ) );
                personBazIndexId.set( personBazConstraint.asIndexBackedConstraint().ownedIndexId() );
                // We now hold a schema lock on the "MyLabel" label. Let the procedure calling transaction have a go.
                constraintLatch.countDown();
                commitLatch.await();
            }
            rollback();
            return null;
        } );
        Thread constraintCreator = new Thread( createConstraintTask );
        constraintCreator.start();

        // When
        constraintLatch.await();

        transaction = newTransaction();
        final SchemaReadCore schemaRead = transaction.schemaRead().snapshot();
        IndexDescriptor personFooIndex = single( schemaRead.index( personFooDescriptor ) );
        IndexDescriptor ageFooIndex = single( schemaRead.index( ageFooDescriptor ) );
        IndexDescriptor personFooBarIndex = single( schemaRead.index( personFooBarDescriptor ) );
        IndexDescriptor personBazIndex = single( schemaRead.index( personBazDescriptor ) );
        commit();

        RawIterator<AnyValue[],ProcedureException> stream =
                procs().procedureCallRead( procs().procedureGet( procedureName( "db", "indexes" ) ).id(), new AnyValue[0],
                        ProcedureCallContext.EMPTY );

        Set<Object[]> result = new HashSet<>();
        while ( stream.hasNext() )
        {
            result.add( stream.next() );
        }

        // Then
        try
        {
            assertThat( result ).contains(
                    dbIndexesResult( ageFooIndex.getId(), ageFooIndex.getName(), "ONLINE", 100D, "UNIQUE", "BTREE", "NODE", singletonList( "Age" ),
                            singletonList( "foo" ), ageFooIndex.getIndexProvider().name() ),
                    dbIndexesResult( personFooIndex.getId(), personFooIndex.getName(), "ONLINE", 100D, "NONUNIQUE", "BTREE", "NODE", singletonList( "Person" ),
                            singletonList( "foo" ), personFooIndex.getIndexProvider().name() ),
                    dbIndexesResult( personFooBarIndex.getId(), personFooBarIndex.getName(), "ONLINE", 100D, "NONUNIQUE", "BTREE", "NODE",
                            singletonList( "Person" ), Arrays.asList( "foo", "bar" ), personFooBarIndex.getIndexProvider().name() ),
                    dbIndexesResult( personBazIndex.getId(), personBazIndex.getName() /*???*/, "POPULATING", 100D, "UNIQUE", "BTREE", "NODE",
                            singletonList( "Person" ), singletonList( "baz" ), personBazIndex.getIndexProvider().name() ) );
            commit();
        }
        finally
        {
            commitLatch.countDown();
        }
        createConstraintTask.get();
        constraintCreator.join();
    }

    @Test
    void prepareForReplanningShouldEmptyQueryCache()
    {
        // Given, something is cached
        try ( org.neo4j.graphdb.Transaction transaction = db.beginTx() )
        {
            transaction.execute( "MATCH (n) RETURN n" ).close();
            transaction.commit();
        }

        ReplanMonitor monitor = replanMonitor();

        // When
        try ( org.neo4j.graphdb.Transaction transaction = db.beginTx() )
        {
            transaction.execute( "CALL db.prepareForReplanning()" ).close();
            transaction.commit();
        }

        // Then, the initial query and the procedure call should now have been cleared
        assertThat( monitor.numberOfFlushedItems() ).isEqualTo( 2L );
    }

    @Test
    void prepareForReplanningShouldTriggerIndexesSampling()
    {
        // Given
        ReplanMonitor monitor = replanMonitor();

        // When
        try ( org.neo4j.graphdb.Transaction transaction = db.beginTx() )
        {
            transaction.execute( "CALL db.prepareForReplanning()" ).close();
            transaction.commit();
        }

        // Then
        IndexSamplingMode mode = monitor.samplingMode();
        assertNotEquals( IndexSamplingMode.NO_WAIT, mode.millisToWaitForCompletion() );
        assertThat( mode.millisToWaitForCompletion() ).isGreaterThan( 0L );
    }

    private ReplanMonitor replanMonitor()
    {
        Monitors monitors = dependencyResolver.resolveDependency( Monitors.class );

        ReplanMonitor monitorListener = new ReplanMonitor();
        monitors.addMonitorListener( monitorListener );
        return monitorListener;
    }

    private static class ReplanMonitor extends IndexMonitor.MonitorAdapter implements ExecutionEngineQueryCacheMonitor
    {
        private long numberOfFlushedItems = -1L;
        private IndexSamplingMode samplingMode;

        @Override
        public void cacheFlushDetected( long sizeBeforeFlush )
        {
            numberOfFlushedItems = sizeBeforeFlush;
        }

        @Override
        public void indexSamplingTriggered( IndexSamplingMode mode )
        {
            samplingMode = mode;
        }

        long numberOfFlushedItems()
        {
            return numberOfFlushedItems;
        }

        IndexSamplingMode samplingMode()
        {
            return samplingMode;
        }
    }
}
