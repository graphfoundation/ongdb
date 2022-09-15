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
package org.neo4j.kernel.impl.newapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.Iterator;

import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.internal.kernel.api.InternalIndexState;
import org.neo4j.internal.kernel.api.SchemaRead;
import org.neo4j.internal.kernel.api.SchemaReadCore;
import org.neo4j.internal.kernel.api.SchemaWrite;
import org.neo4j.internal.kernel.api.TokenWrite;
import org.neo4j.internal.kernel.api.Write;
import org.neo4j.internal.kernel.api.exceptions.schema.SchemaKernelException;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.ConstraintType;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.LabelSchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.impl.api.KernelTransactionImplementation;
import org.neo4j.values.storable.Values;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.common.EntityType.RELATIONSHIP;
import static org.neo4j.internal.helpers.collection.Iterators.asList;
import static org.neo4j.internal.helpers.collection.Iterators.single;
import static org.neo4j.internal.schema.IndexDescriptor.NO_INDEX;
import static org.neo4j.internal.schema.IndexPrototype.uniqueForSchema;
import static org.neo4j.internal.schema.SchemaDescriptors.forLabel;
import static org.neo4j.internal.schema.SchemaDescriptors.forRelType;
import static org.neo4j.internal.schema.SchemaDescriptors.fulltext;

public abstract class SchemaReadWriteTestBase<G extends KernelAPIWriteTestSupport> extends KernelAPIWriteTestBase<G>
{
    private int label, label2, type, prop1, prop2, prop3;

    @BeforeEach
    void setUp() throws Exception
    {
        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            SchemaWrite schemaWrite = transaction.schemaWrite();
            Iterator<ConstraintDescriptor> constraints = schemaRead.constraintsGetAll();
            while ( constraints.hasNext() )
            {
                schemaWrite.constraintDrop( constraints.next() );
            }
            Iterator<IndexDescriptor> indexes = schemaRead.indexesGetAll();
            while ( indexes.hasNext() )
            {
                schemaWrite.indexDrop( indexes.next() );
            }

            TokenWrite tokenWrite = transaction.tokenWrite();
            label = tokenWrite.labelGetOrCreateForName( "label" );
            label2 = tokenWrite.labelGetOrCreateForName( "label2" );
            type = tokenWrite.relationshipTypeGetOrCreateForName( "relationship" );
            prop1 = tokenWrite.propertyKeyGetOrCreateForName( "prop1" );
            prop2 = tokenWrite.propertyKeyGetOrCreateForName( "prop2" );
            prop3 = tokenWrite.propertyKeyGetOrCreateForName( "prop3" );
            transaction.commit();
        }
    }

    @Test
    void shouldNotFindNonExistentIndex() throws Exception
    {
        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertThat( schemaRead.index( SchemaDescriptors.forLabel( label, prop1 ) ) ).isExhausted();
        }
    }

    @ParameterizedTest
    @EnumSource( IndexType.class )
    void shouldNotFindNonExistentIndexWithType( IndexType type ) throws Exception
    {
        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertThat( schemaRead.index( SchemaDescriptors.forLabel( label, prop1 ), type ) ).isEqualTo( NO_INDEX );
        }
    }

    @ParameterizedTest
    @EnumSource( value = IndexType.class, names = { "BTREE", "RANGE", "TEXT", "POINT" } )
    void shouldCreateIndex( IndexType type ) throws Exception
    {
        IndexDescriptor index;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            index = transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withIndexType( type ).withName( "my index" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertThat( single( schemaRead.index( SchemaDescriptors.forLabel( label, prop1 ) ) ) ).isEqualTo( index );
            assertThat( schemaRead.index( SchemaDescriptors.forLabel( label, prop1 ), type ) ).isEqualTo( index );
        }
    }

    @Test
    void createdIndexShouldPopulateInTx() throws Exception
    {
        IndexDescriptor index;
        try ( KernelTransaction tx = beginTransaction() )
        {
            SchemaReadCore before = tx.schemaRead().snapshot();
            index = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "my index" ) );
            assertThat( tx.schemaRead().indexGetState( index ) ).isEqualTo( InternalIndexState.POPULATING );
            assertThat( tx.schemaRead().snapshot().indexGetState( index ) ).isEqualTo( InternalIndexState.POPULATING );
            assertThat( before.indexGetState( index ) ).isEqualTo( InternalIndexState.POPULATING );
            tx.commit();
        }
    }

    @Test
    void shouldGetIndexStateNonLocking() throws Exception
    {
        IndexDescriptor index;
        try ( KernelTransaction tx = beginTransaction() )
        {
            SchemaReadCore before = tx.schemaRead().snapshot();
            index = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "my index" ) );
            assertThat( tx.schemaRead().indexGetStateNonLocking( index ) ).isEqualTo( InternalIndexState.POPULATING );
            assertThat( tx.schemaRead().snapshot().indexGetStateNonLocking( index ) ).isEqualTo( InternalIndexState.POPULATING );
            assertThat( before.indexGetStateNonLocking( index ) ).isEqualTo( InternalIndexState.POPULATING );
            Assertions.assertNotEquals( ((KernelTransactionImplementation) tx).lockClient().activeLockCount(), 0 );
            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            SchemaReadCore before = tx.schemaRead().snapshot();
            assertThat( tx.schemaRead().indexGetStateNonLocking( index ) ).isNotEqualTo( InternalIndexState.FAILED );
            assertThat( tx.schemaRead().snapshot().indexGetStateNonLocking( index ) ).isNotEqualTo( InternalIndexState.FAILED );
            assertThat( before.indexGetStateNonLocking( index ) ).isNotEqualTo( InternalIndexState.FAILED );
            assertEquals(((KernelTransactionImplementation) tx).lockClient().activeLockCount(), 0 );
            tx.commit();
        }
    }

    @ParameterizedTest
    @EnumSource( value = IndexType.class, names = { "BTREE", "RANGE", "TEXT", "POINT" } )
    void shouldDropIndex( IndexType type ) throws Exception
    {
        IndexDescriptor index;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            index = transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withIndexType( type ).withName( "my index" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexDrop( index );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.index( SchemaDescriptors.forLabel( label, prop1 ) ).hasNext() );
        }
    }

    @Test
    void shouldDropIndexBySchema() throws Exception
    {
        IndexDescriptor index;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            index = transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "my index" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexDrop( index.schema() );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.index( SchemaDescriptors.forLabel( label, prop1 ) ).hasNext() );
        }
    }

    @ParameterizedTest
    @EnumSource( value = IndexType.class, names = { "BTREE", "RANGE", "TEXT", "POINT" } )
    void shouldDropIndexByName( IndexType type ) throws Exception
    {
        String indexName = "My fancy index";
        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withIndexType( type ).withName( indexName ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexDrop( indexName );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.index( SchemaDescriptors.forLabel( label, prop1 ) ).hasNext() );
        }
    }

    @Test
    void shouldFailToDropNoIndex() throws Exception
    {
        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class, () -> transaction.schemaWrite().indexDrop( NO_INDEX ) );
            transaction.commit();
        }
    }

    @Test
    void shouldFailToDropNonExistentIndex() throws Exception
    {
        IndexDescriptor index;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            index = transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "my index" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexDrop( index );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class, () ->
                    transaction.schemaWrite().indexDrop( index ) );
            transaction.commit();
        }
    }

    @Test
    void shouldFailToDropNonExistentIndexSchema() throws Exception
    {
        IndexDescriptor index;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            index = transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "my index" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexDrop( index );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class, () ->
                    transaction.schemaWrite().indexDrop( index.schema() ) );
            transaction.commit();
        }
    }

    @Test
    void shouldFailToDropNonExistentIndexByName() throws Exception
    {
        String indexName = "My fancy index";
        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( indexName ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexDrop( indexName );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class, () ->
                    transaction.schemaWrite().indexDrop( indexName ) );
            transaction.commit();
        }
    }

    @ParameterizedTest
    @EnumSource( value = IndexType.class, names = { "BTREE", "RANGE", "TEXT", "POINT" } )
    void shouldFailIfExistingIndex( IndexType type ) throws Exception
    {
        //Given
        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withIndexType( type ).withName( "my index" ) );
            transaction.commit();
        }

        //When
        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class,
                    () -> transaction.schemaWrite()
                            .indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withIndexType( type ).withName( "my other index" ) ) );
            assertThrows( SchemaKernelException.class,
                    () -> transaction.schemaWrite()
                            .indexCreate( IndexPrototype.forSchema( forLabel( label, prop2 ) ).withIndexType( type ).withName( "my index" ) ) );
            transaction.commit();
        }
    }

    @Test
    void shouldSeeIndexFromTransaction() throws Exception
    {
        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "my index" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            LabelSchemaDescriptor schema = forLabel( label, prop2 );
            var otherIndex = transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( schema ).withName( "my other index" ) );
            SchemaRead schemaRead = transaction.schemaRead();
            IndexDescriptor index = single( schemaRead.index( schema ) );
            assertThat( index ).isEqualTo( otherIndex );

            var indexByType = schemaRead.index( schema, IndexType.BTREE );
            assertThat( indexByType ).isEqualTo( otherIndex );

            assertThat( 2 ).isEqualTo( Iterators.asList( schemaRead.indexesGetAll() ).size() );
        }
    }

    @Test
    void shouldSeeIndexFromTransactionInSnapshot() throws Exception
    {
        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "my index 1" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            var schema = forLabel( label, prop2 );

            SchemaReadCore schemaReadBefore = transaction.schemaRead().snapshot();
            IndexDescriptor createdIndex =
                    transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( schema ).withName( "my index 2" ) );
            SchemaReadCore schemaReadAfter = transaction.schemaRead().snapshot();

            var index = single( schemaReadBefore.index( schema ) );
            assertThat( index ).isEqualTo( createdIndex );
            var indexByType = schemaReadBefore.index( schema, IndexType.BTREE );
            assertThat( indexByType ).isEqualTo( createdIndex );

            assertThat( schemaReadBefore.indexGetForName( "my index 2" ) ).isEqualTo( createdIndex );
            assertThat( 2 ).isEqualTo( Iterators.asList( schemaReadBefore.indexesGetAll() ).size() );

            index = single( schemaReadAfter.index( schema ) );
            assertThat( index ).isEqualTo( createdIndex );
            indexByType = schemaReadAfter.index( schema, IndexType.BTREE );
            assertThat( indexByType ).isEqualTo( createdIndex );

            assertThat( schemaReadAfter.indexGetForName( "my index 2" ) ).isEqualTo( createdIndex );
            assertThat( 2 ).isEqualTo( Iterators.asList( schemaReadAfter.indexesGetAll() ).size() );
        }
    }

    @Test
    void shouldNotSeeDroppedIndexFromTransaction() throws Exception
    {
        IndexDescriptor index;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            index = transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "my index" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexDrop( index );
            SchemaRead schemaRead = transaction.schemaRead();
            assertThat( schemaRead.index( index.schema() ) ).isExhausted();
            assertThat( schemaRead.index( index.schema(), index.getIndexType() ) ).isEqualTo( NO_INDEX );
        }
    }

    @Test
    void shouldNotSeeDroppedIndexFromTransactionInSnapshot() throws Exception
    {
        IndexDescriptor index;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            index = transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "my index" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaReadCore schemaReadBefore = transaction.schemaRead().snapshot();
            transaction.schemaWrite().indexDrop( index );
            SchemaReadCore schemaReadAfter = transaction.schemaRead().snapshot();

            assertThat( schemaReadBefore.index( index.schema() ) ).isExhausted();
            assertThat( schemaReadBefore.index( index.schema(), index.getIndexType() ) ).isEqualTo( NO_INDEX );
            assertThat( schemaReadBefore.indexGetForName( "my index" ) ).isEqualTo( NO_INDEX );

            assertThat( schemaReadAfter.index( index.schema() ) ).isExhausted();
            assertThat( schemaReadAfter.index( index.schema(), index.getIndexType() ) ).isEqualTo( NO_INDEX );
            assertThat( schemaReadAfter.indexGetForName( "my index" ) ).isEqualTo( NO_INDEX );
        }
    }

    @Test
    void shouldListAllIndexes() throws Exception
    {
        IndexDescriptor toRetain;
        IndexDescriptor toRetain2;
        IndexDescriptor toDrop;
        IndexDescriptor created;

        try ( KernelTransaction tx = beginTransaction() )
        {
            toRetain = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "a" ) );
            toRetain2 = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label2, prop1 ) ).withName( "b" ) );
            toDrop = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop2 ) ).withName( "c" ) );
            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            created = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label2, prop2 ) ).withName( "d" ) );
            tx.schemaWrite().indexDrop( toDrop );

            Iterable<IndexDescriptor> allIndexes = () -> tx.schemaRead().indexesGetAll();
            assertThat( allIndexes ).contains( toRetain, toRetain2, created );

            tx.commit();
        }
    }

    @Test
    void shouldListAllIndexesInSnapshot() throws Exception
    {
        IndexDescriptor toRetain;
        IndexDescriptor toRetain2;
        IndexDescriptor toDrop;
        IndexDescriptor created;

        try ( KernelTransaction tx = beginTransaction() )
        {
            toRetain = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "a" ) );
            toRetain2 = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label2, prop1 ) ).withName( "b" ) );
            toDrop = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop2 ) ).withName( "c" ) );
            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            SchemaReadCore before = tx.schemaRead().snapshot();
            created = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label2, prop2 ) ).withName( "d" ) );
            tx.schemaWrite().indexDrop( toDrop );
            SchemaReadCore after = tx.schemaRead().snapshot();

            assertThat( before.indexesGetAll() ).toIterable().contains( toRetain, toRetain2, created );
            assertThat( after.indexesGetAll() ).toIterable().contains( toRetain, toRetain2, created );

            tx.commit();
        }
    }

    @Test
    void shouldListIndexesByLabel() throws Exception
    {
        int wrongLabel;

        IndexDescriptor inStore;
        IndexDescriptor droppedInTx;
        IndexDescriptor createdInTx;

        try ( KernelTransaction tx = beginTransaction() )
        {
            wrongLabel = tx.tokenWrite().labelGetOrCreateForName( "wrongLabel" );
            tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( wrongLabel, prop1 ) ) );

            inStore = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "a" ) );
            droppedInTx = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop2 ) ).withName( "b" ) );

            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            createdInTx = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop3 ) ).withName( "c" ) );
            tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( wrongLabel, prop2 ) ).withName( "d" ) );
            tx.schemaWrite().indexDrop( droppedInTx );

            Iterable<IndexDescriptor> indexes = () -> tx.schemaRead().indexesGetForLabel( label );
            assertThat( indexes ).contains( inStore, createdInTx );

            tx.commit();
        }
    }

    @Test
    void shouldListIndexesByLabelNonLocking() throws Exception
    {
        IndexDescriptor inStore;
        IndexDescriptor droppedInTx;
        IndexDescriptor createdInTx;

        try ( KernelTransaction tx = beginTransaction() )
        {
            inStore = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "a" ) );
            droppedInTx = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop2 ) ).withName( "b" ) );

            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            createdInTx = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop3 ) ).withName( "c" ) );
            tx.schemaWrite().indexDrop( droppedInTx );

            // Should include the index changes happening in the transaction
            Iterable<IndexDescriptor> labelIndexes = () -> tx.schemaRead().getLabelIndexesNonLocking( label );
            Iterable<IndexDescriptor> indexesBySchema = () -> tx.schemaRead().indexForSchemaNonLocking( createdInTx.schema() );
            assertThat( labelIndexes ).contains( inStore, createdInTx );
            assertThat( indexesBySchema ).contains( createdInTx );
            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            // Should not take any locks
            Iterable<IndexDescriptor> labelIndexes = () -> tx.schemaRead().getLabelIndexesNonLocking( label );
            Iterable<IndexDescriptor> indexesBySchema = () -> tx.schemaRead().indexForSchemaNonLocking( createdInTx.schema() );
            assertThat( labelIndexes ).contains( inStore, createdInTx );
            assertThat( indexesBySchema ).contains( createdInTx );
            assertEquals(((KernelTransactionImplementation) tx).lockClient().activeLockCount(), 0 );

            tx.commit();
        }
    }

    @Test
    void shouldListIndexesByLabelInSnapshot() throws Exception
    {
        int wrongLabel;

        IndexDescriptor inStore;
        IndexDescriptor droppedInTx;
        IndexDescriptor createdInTx;

        try ( KernelTransaction tx = beginTransaction() )
        {
            wrongLabel = tx.tokenWrite().labelGetOrCreateForName( "wrongLabel" );
            tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( wrongLabel, prop1 ) ) );

            inStore = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "a" ) );
            droppedInTx = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop2 ) ).withName( "b" ) );

            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            SchemaReadCore before = tx.schemaRead().snapshot();
            createdInTx = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop3 ) ).withName( "c" ) );
            tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( wrongLabel, prop2 ) ).withName( "d" ) );
            tx.schemaWrite().indexDrop( droppedInTx );

            Iterable<IndexDescriptor> indexes = () -> tx.schemaRead().snapshot().indexesGetForLabel( label );
            assertThat( indexes ).contains( inStore, createdInTx );
            assertThat( before.indexesGetForLabel( label ) ).toIterable().contains( inStore, createdInTx );

            tx.commit();
        }
    }

    @Test
    void shouldListIndexesByRelationshipTypeNonLocking() throws Exception
    {
        IndexDescriptor inStore;
        IndexDescriptor droppedInTx;
        IndexDescriptor createdInTx;

        try ( KernelTransaction tx = beginTransaction() )
        {
            inStore = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forRelType( type, prop1 ) ).withName( "a" ) );
            droppedInTx = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forRelType( type, prop2 ) ).withName( "b" ) );

            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            createdInTx = tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forRelType( type, prop3 ) ).withName( "c" ) );
            tx.schemaWrite().indexDrop( droppedInTx );

            // Should not include the index changes happening in the transaction
            Iterable<IndexDescriptor> indexes = () -> tx.schemaRead().getRelTypeIndexesNonLocking( type );
            assertThat( indexes ).contains( inStore, createdInTx );
            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            // Should not take any locks
            Iterable<IndexDescriptor> indexes = () -> tx.schemaRead().getRelTypeIndexesNonLocking( type );
            assertThat( indexes ).contains( inStore, createdInTx );
            assertEquals(((KernelTransactionImplementation) tx).lockClient().activeLockCount(), 0 );

            tx.commit();
        }
    }

    @Test
    void shouldCreateUniquePropertyConstraint() throws Exception
    {
        ConstraintDescriptor constraint;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            constraint = transaction.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertTrue( schemaRead.constraintExists( constraint ) );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).isEqualTo( singletonList( constraint ) );
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).isEqualTo( singletonList( constraint ) );
        }
    }

    @Test
    void shouldDropUniquePropertyConstraint() throws Exception
    {
        ConstraintDescriptor constraint;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            constraint = transaction.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().constraintDrop( constraint );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.constraintExists( constraint ) );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).isEmpty();
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).isEmpty();
        }
    }

    @Test
    void shouldDropConstraintByName() throws Exception
    {
        ConstraintDescriptor constraint;
        String constraintName = "my constraint";
        try ( KernelTransaction transaction = beginTransaction() )
        {
            constraint = transaction.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( constraintName ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().constraintDrop( constraintName );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.constraintExists( constraint ) );
        }
    }

    @Test
    void shouldOnlyDropBtreeConstraintBySchema() throws Exception
    {
        ConstraintDescriptor constraint;
        ConstraintDescriptor constraint2;
        final LabelSchemaDescriptor schema = forLabel( label, prop1 );
        IndexPrototype prototype = uniqueForSchema( schema );
        try ( KernelTransaction transaction = beginTransaction() )
        {
            constraint = transaction.schemaWrite().nodeKeyConstraintCreate( prototype );
            constraint2 = transaction.schemaWrite().nodeKeyConstraintCreate( prototype.withIndexType( IndexType.RANGE ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().constraintDrop( schema, ConstraintType.UNIQUE_EXISTS );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.constraintExists( constraint ) );
            assertTrue( schemaRead.constraintExists( constraint2 ) );
        }
    }

    @Test
    void shouldFailToCreateUniqueConstraintIfExistingIndex() throws Exception
    {
        //Given
        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "my index" ) );
            transaction.commit();
        }

        //When
        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class,
                    () -> transaction.schemaWrite().uniquePropertyConstraintCreate(
                            uniqueForSchema( forLabel( label, prop1 ) ).withName( "constraint name" ) ) );
            assertThrows( SchemaKernelException.class,
                    () -> transaction.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop2 ) ).withName( "my index" ) ) );
            transaction.commit();
        }
    }

    @Test
    void shouldFailToCreateIndexIfExistingUniqueConstraint() throws Exception
    {
        //Given
        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( "constraint name" ) );
            transaction.commit();
        }

        //When
        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class,
                          () -> transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "my index" ) ) );
            assertThrows( SchemaKernelException.class,
                          () -> transaction.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop2 ) ).withName( "constraint name" ) ) );
            transaction.commit();
        }
    }

    @Test
    void shouldFailToDropIndexIfExistingUniqueConstraint() throws Exception
    {
        //Given
        String schemaName = "constraint name";
        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( schemaName ) );
            transaction.commit();
        }

        //When
        try ( KernelTransaction transaction = beginTransaction() )
        {
            IndexDescriptor index = transaction.schemaRead().indexGetForName( schemaName );
            assertThrows( SchemaKernelException.class, () ->
                    transaction.schemaWrite().indexDrop( index ) );
            transaction.commit();
        }
    }

    @Test
    void shouldFailToDropIndexBySchemaIfExistingUniqueConstraint() throws Exception
    {
        //Given
        String schemaName = "constraint name";
        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( schemaName ) );
            transaction.commit();
        }

        //When
        try ( KernelTransaction transaction = beginTransaction() )
        {
            IndexDescriptor index = transaction.schemaRead().indexGetForName( schemaName );
            assertThrows( SchemaKernelException.class, () ->
                    transaction.schemaWrite().indexDrop( index.schema() ) );
            transaction.commit();
        }
    }

    @Test
    void shouldFailToDropIndexByNameIfExistingUniqueConstraint() throws Exception
    {
        //Given
        String schemaName = "constraint name";
        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( schemaName ) );
            transaction.commit();
        }

        //When
        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class, () ->
                    transaction.schemaWrite().indexDrop( schemaName ) );
            transaction.commit();
        }
    }

    @Test
    void shouldFailToCreateUniqueConstraintIfConstraintNotSatisfied() throws Exception
    {
        //Given
        try ( KernelTransaction transaction = beginTransaction() )
        {
            Write write = transaction.dataWrite();
            long node1 = write.nodeCreate();
            write.nodeAddLabel( node1, label );
            write.nodeSetProperty( node1, prop1, Values.intValue( 42 ) );
            long node2 = write.nodeCreate();
            write.nodeAddLabel( node2, label );
            write.nodeSetProperty( node2, prop1, Values.intValue( 42 ) );
            transaction.commit();
        }

        //When
        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class,
                    () -> transaction.schemaWrite().uniquePropertyConstraintCreate(
                            uniqueForSchema( forLabel( label, prop1 ) ) ) );
        }
    }

    @Test
    void shouldSeeUniqueConstraintFromTransaction() throws Exception
    {
        ConstraintDescriptor existing;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            existing = transaction.schemaWrite().uniquePropertyConstraintCreate(
                    uniqueForSchema( forLabel( label, prop1 ) ).withName( "existing constraint" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaReadCore before = transaction.schemaRead().snapshot();
            ConstraintDescriptor newConstraint =
                    transaction.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop2 ) ).withName( "new constraint" ) );
            SchemaRead schemaRead = transaction.schemaRead();
            SchemaReadCore after = schemaRead.snapshot();
            assertTrue( schemaRead.constraintExists( existing ) );
            assertTrue( schemaRead.constraintExists( newConstraint ) );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).contains( existing, newConstraint );
            assertThat( asList( before.constraintsGetForLabel( label ) ) ).contains( existing, newConstraint );
            assertThat( asList( after.constraintsGetForLabel( label ) ) ).contains( existing, newConstraint );
            assertThat( before.constraintGetForName( "existing constraint" ) ).isEqualTo( existing );
            assertThat( after.constraintGetForName( "existing constraint" ) ).isEqualTo( existing );
            assertThat( before.constraintGetForName( "new constraint" ) ).isEqualTo( newConstraint );
            assertThat( after.constraintGetForName( "new constraint" ) ).isEqualTo( newConstraint );
        }
    }

    @Test
    void shouldNotSeeDroppedUniqueConstraintFromTransaction() throws Exception
    {
        ConstraintDescriptor existing;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            existing = transaction.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaReadCore before = transaction.schemaRead().snapshot();
            transaction.schemaWrite().constraintDrop( existing );
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.constraintExists( existing ) );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).isEmpty();
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).isEmpty();
            assertThat( asList( before.constraintsGetForLabel( label ) ) ).isEmpty();
        }
    }

    @Test
    void shouldCreateNodeKeyConstraint() throws Exception
    {
        ConstraintDescriptor constraint;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            constraint = transaction.schemaWrite().nodeKeyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertTrue( schemaRead.constraintExists( constraint ) );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).isEqualTo( singletonList( constraint ) );
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).isEqualTo( singletonList( constraint ) );
        }
    }

    @Test
    void shouldDropNodeKeyConstraint() throws Exception
    {
        ConstraintDescriptor constraint;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            constraint = transaction.schemaWrite().nodeKeyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().constraintDrop( constraint );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.constraintExists( constraint ) );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).isEmpty();
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).isEmpty();
        }
    }

    @Test
    void shouldFailToNodeKeyConstraintIfConstraintNotSatisfied() throws Exception
    {
        //Given
        try ( KernelTransaction transaction = beginTransaction() )
        {
            Write write = transaction.dataWrite();
            long node = write.nodeCreate();
            write.nodeAddLabel( node, label );
            transaction.commit();
        }

        //When
        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class, () -> transaction.schemaWrite().nodeKeyConstraintCreate(
                    uniqueForSchema( forLabel( label, prop1 ) ) ) );
        }
    }

    @Test
    void shouldSeeNodeKeyConstraintFromTransaction() throws Exception
    {
        ConstraintDescriptor existing;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            existing =
                    transaction.schemaWrite().nodeKeyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( "existing constraint" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaReadCore before = transaction.schemaRead().snapshot();
            ConstraintDescriptor newConstraint =
                    transaction.schemaWrite().nodeKeyConstraintCreate( uniqueForSchema( forLabel( label, prop2 ) ).withName( "new constraint" ) );
            SchemaRead schemaRead = transaction.schemaRead();
            assertTrue( schemaRead.constraintExists( existing ) );
            assertTrue( schemaRead.constraintExists( newConstraint ) );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).contains( existing, newConstraint );
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).contains( existing, newConstraint );
            assertThat( asList( before.constraintsGetForLabel( label ) ) ).contains( existing, newConstraint );
        }
    }

    @Test
    void shouldNotSeeDroppedNodeKeyConstraintFromTransaction() throws Exception
    {
        ConstraintDescriptor existing;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            existing = transaction.schemaWrite().nodeKeyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( "constraint name" ) );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaReadCore before = transaction.schemaRead().snapshot();
            transaction.schemaWrite().constraintDrop( existing );
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.constraintExists( existing ) );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).isEmpty();
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).isEmpty();
            assertThat( asList( before.constraintsGetForLabel( label ) ) ).isEmpty();

        }
    }

    @Test
    void shouldCreateNodePropertyExistenceConstraint() throws Exception
    {
        ConstraintDescriptor constraint;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            constraint = transaction.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop1 ), "constraint name" );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertTrue( schemaRead.constraintExists( constraint ) );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).isEqualTo( singletonList( constraint ) );
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).isEqualTo( singletonList( constraint ) );
        }
    }

    @Test
    void shouldDropNodePropertyExistenceConstraint() throws Exception
    {
        ConstraintDescriptor constraint;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            constraint = transaction.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop1 ), "constraint name" );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().constraintDrop( constraint );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.constraintExists( constraint ) );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).isEmpty();
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).isEmpty();
        }
    }

    @Test
    void shouldFailToCreatePropertyExistenceConstraintIfConstraintNotSatisfied() throws Exception
    {
        //Given
        try ( KernelTransaction transaction = beginTransaction() )
        {
            Write write = transaction.dataWrite();
            long node = write.nodeCreate();
            write.nodeAddLabel( node, label );
            transaction.commit();
        }

        //When
        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class,
                    () -> transaction.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop1 ), "constraint name" ) );
        }
    }

    @Test
    void shouldSeeNodePropertyExistenceConstraintFromTransaction() throws Exception
    {
        ConstraintDescriptor existing;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            existing =
                    transaction.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop1 ), "existing constraint" );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaReadCore before = transaction.schemaRead().snapshot();
            ConstraintDescriptor newConstraint =
                    transaction.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop2 ), "new constraint" );
            SchemaRead schemaRead = transaction.schemaRead();
            assertTrue( schemaRead.constraintExists( existing ) );
            assertTrue( schemaRead.constraintExists( newConstraint ) );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).contains( existing, newConstraint );
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).contains( existing, newConstraint );
            assertThat( asList( before.constraintsGetForLabel( label ) ) ).contains( existing, newConstraint );
        }
    }

    @Test
    void shouldNotSeeDroppedNodePropertyExistenceConstraintFromTransaction() throws Exception
    {
        ConstraintDescriptor existing;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            existing = transaction.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop1 ), "constraint name" );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaReadCore before = transaction.schemaRead().snapshot();
            transaction.schemaWrite().constraintDrop( existing );
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.constraintExists( existing ) );

            assertFalse( schemaRead.index( SchemaDescriptors.forLabel( label, prop2 ) ).hasNext() );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).isEmpty();
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).isEmpty();
            assertThat( asList( before.constraintsGetForLabel( label ) ) ).isEmpty();

        }
    }

    @Test
    void shouldCreateRelationshipPropertyExistenceConstraint() throws Exception
    {
        ConstraintDescriptor constraint;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            constraint = transaction.schemaWrite()
                    .relationshipPropertyExistenceConstraintCreate( forRelType( type, prop1 ), "constraint name" );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertTrue( schemaRead.constraintExists( constraint ) );
            assertThat( asList( schemaRead.constraintsGetForRelationshipType( type ) ) ).isEqualTo( singletonList( constraint ) );
            assertThat( asList( schemaRead.snapshot().constraintsGetForRelationshipType( type ) ) ).isEqualTo( singletonList( constraint ) );
        }
    }

    @Test
    void shouldDropRelationshipPropertyExistenceConstraint() throws Exception
    {
        ConstraintDescriptor constraint;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            constraint = transaction.schemaWrite()
                    .relationshipPropertyExistenceConstraintCreate( forRelType( type, prop1 ), "constraint name" );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            transaction.schemaWrite().constraintDrop( constraint );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.constraintExists( constraint ) );
            assertThat( asList( schemaRead.constraintsGetForRelationshipType( type ) ) ).isEmpty();
            assertThat( asList( schemaRead.snapshot().constraintsGetForRelationshipType( type ) ) ).isEmpty();
        }
    }

    @Test
    void shouldFailToCreateRelationshipPropertyExistenceConstraintIfConstraintNotSatisfied() throws Exception
    {
        //Given
        try ( KernelTransaction transaction = beginTransaction() )
        {
            Write write = transaction.dataWrite();
            write.relationshipCreate( write.nodeCreate(), type, write.nodeCreate() );
            transaction.commit();
        }

        //When
        try ( KernelTransaction transaction = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class,
                    () -> transaction.schemaWrite().relationshipPropertyExistenceConstraintCreate( forRelType( type, prop1 ), "constraint name" ) );
        }
    }

    @Test
    void shouldSeeRelationshipPropertyExistenceConstraintFromTransaction() throws Exception
    {
        ConstraintDescriptor existing;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            existing =
                    transaction.schemaWrite().relationshipPropertyExistenceConstraintCreate( forRelType( type, prop1 ), "existing constraint" );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaReadCore before = transaction.schemaRead().snapshot();
            ConstraintDescriptor newConstraint =
                    transaction.schemaWrite().relationshipPropertyExistenceConstraintCreate( forRelType( type, prop2 ), "new constraint" );
            SchemaRead schemaRead = transaction.schemaRead();
            assertTrue( schemaRead.constraintExists( existing ) );
            assertTrue( schemaRead.constraintExists( newConstraint ) );
            assertThat( asList( schemaRead.constraintsGetForRelationshipType( type ) ) ).contains( existing, newConstraint );
            assertThat( asList( schemaRead.snapshot().constraintsGetForRelationshipType( type ) ) ).contains( existing, newConstraint );
            assertThat( asList( before.constraintsGetForRelationshipType( type ) ) ).contains( existing, newConstraint );
        }
    }

    @Test
    void shouldNotSeeDroppedRelationshipPropertyExistenceConstraintFromTransaction() throws Exception
    {
        ConstraintDescriptor existing;
        try ( KernelTransaction transaction = beginTransaction() )
        {
            existing = transaction.schemaWrite()
                    .relationshipPropertyExistenceConstraintCreate( forRelType( type, prop1 ), "constraint name" );
            transaction.commit();
        }

        try ( KernelTransaction transaction = beginTransaction() )
        {
            SchemaReadCore before = transaction.schemaRead().snapshot();
            transaction.schemaWrite().constraintDrop( existing );
            SchemaRead schemaRead = transaction.schemaRead();
            assertFalse( schemaRead.constraintExists( existing ) );

            assertFalse( schemaRead.index( SchemaDescriptors.forLabel( type, prop2 ) ).hasNext() );
            assertThat( asList( schemaRead.constraintsGetForLabel( label ) ) ).isEmpty();
            assertThat( asList( schemaRead.snapshot().constraintsGetForLabel( label ) ) ).isEmpty();
            assertThat( asList( before.constraintsGetForLabel( label ) ) ).isEmpty();

        }
    }

    @Test
    void shouldListAllConstraints() throws Exception
    {
        ConstraintDescriptor toRetain;
        ConstraintDescriptor toRetain2;
        ConstraintDescriptor toDrop;
        ConstraintDescriptor created;
        try ( KernelTransaction tx = beginTransaction() )
        {
            toRetain = tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( "first constraint" ) );
            toRetain2 = tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label2, prop1 ) ).withName( "second constraint" ) );
            toDrop = tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop2 ) ).withName( "third constraint" ) );
            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            created = tx.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop1 ), "new constraint" );
            tx.schemaWrite().constraintDrop( toDrop );

            Iterable<ConstraintDescriptor> allConstraints = () -> tx.schemaRead().constraintsGetAll();
            assertThat( allConstraints ).contains( toRetain, toRetain2, created );

            tx.commit();
        }
    }

    @Test
    void shouldListAllConstraintsInSnapshot() throws Exception
    {
        ConstraintDescriptor toRetain;
        ConstraintDescriptor toRetain2;
        ConstraintDescriptor toDrop;
        ConstraintDescriptor created;
        try ( KernelTransaction tx = beginTransaction() )
        {
            toRetain = tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( "first constraint" ) );
            toRetain2 = tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label2, prop1 ) ).withName( "second constraint" ) );
            toDrop = tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop2 ) ).withName( "third constraint" ) );
            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            SchemaReadCore before = tx.schemaRead().snapshot();
            created = tx.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop1 ), "new constraint" );
            tx.schemaWrite().constraintDrop( toDrop );

            Iterable<ConstraintDescriptor> allConstraints = () -> tx.schemaRead().snapshot().constraintsGetAll();
            assertThat( allConstraints ).contains( toRetain, toRetain2, created );
            assertThat( before.constraintsGetAll() ).toIterable().contains( toRetain, toRetain2, created );

            tx.commit();
        }
    }

    @Test
    void shouldListConstraintsByLabel() throws Exception
    {
        int wrongLabel;

        ConstraintDescriptor inStore;
        ConstraintDescriptor droppedInTx;
        ConstraintDescriptor createdInTx;

        try ( KernelTransaction tx = beginTransaction() )
        {
            wrongLabel = tx.tokenWrite().labelGetOrCreateForName( "wrongLabel" );
            tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( wrongLabel, prop1 ) ).withName( "first constraint" ) );

            inStore = tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( "second constraint" ) );
            droppedInTx = tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop2 ) ).withName( "third constraint" ) );

            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            SchemaReadCore before = tx.schemaRead().snapshot();
            createdInTx = tx.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop1 ), "fourth constraint" );
            tx.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( wrongLabel, prop1 ), "fifth constraint" );
            tx.schemaWrite().constraintDrop( droppedInTx );

            Iterable<ConstraintDescriptor> allConstraints = () -> tx.schemaRead().constraintsGetForLabel( label );
            assertThat( allConstraints ).contains( inStore, createdInTx );
            assertThat( before.constraintsGetForLabel( label ) ).toIterable().contains( inStore, createdInTx );

            tx.commit();
        }
    }

    @Test
    void shouldListConstraintsByLabelNonLocking() throws Exception
    {
        int wrongLabel;

        ConstraintDescriptor inStore;
        ConstraintDescriptor droppedInTx;
        ConstraintDescriptor createdInTx;

        // Init
        try ( KernelTransaction tx = beginTransaction() )
        {
            wrongLabel = tx.tokenWrite().labelGetOrCreateForName( "wrongLabel" );
            tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( wrongLabel, prop1 ) ).withName( "first constraint" ) );

            inStore = tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( "second constraint" ) );
            droppedInTx = tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop2 ) ).withName( "third constraint" ) );

            tx.commit();
        }

        // Verify constraints created in transaction
        try ( KernelTransaction tx = beginTransaction() )
        {
            SchemaReadCore before = tx.schemaRead().snapshot();
            createdInTx = tx.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop1 ), "fourth constraint" );
            tx.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( wrongLabel, prop1 ), "fifth constraint" );
            tx.schemaWrite().constraintDrop( droppedInTx );

            Iterable<ConstraintDescriptor> allConstraints = () -> tx.schemaRead().constraintsGetForLabelNonLocking( label );
            Iterable<ConstraintDescriptor> constraintBySchema = () -> tx.schemaRead().constraintsGetForSchemaNonLocking( createdInTx.schema() );
            assertThat( allConstraints ).contains( inStore, createdInTx );
            assertThat( constraintBySchema ).contains( createdInTx );
            assertThat( before.constraintsGetForLabelNonLocking( label ) ).toIterable().contains( inStore, createdInTx );

            tx.commit();
        }

        // Verify no locks are taken
        try ( KernelTransaction tx = beginTransaction() )
        {
            Iterable<ConstraintDescriptor> allConstraints = () -> tx.schemaRead().constraintsGetForLabelNonLocking( label );
            Iterable<ConstraintDescriptor> constraintBySchema = () -> tx.schemaRead().constraintsGetForSchemaNonLocking( createdInTx.schema() );
            assertThat( allConstraints ).contains( inStore, createdInTx );
            assertThat( constraintBySchema ).contains( createdInTx );
            // should not take any locks
            assertEquals( ((KernelTransactionImplementation) tx).lockClient().activeLockCount(), 0 );

            tx.commit();
        }
    }

    @Test
    void shouldListConstraintsByRelTypeNonLocking() throws Exception
    {

        ConstraintDescriptor inStore;
        ConstraintDescriptor droppedInTx;
        ConstraintDescriptor createdInTx;

        // Init
        try ( KernelTransaction tx = beginTransaction() )
        {
            inStore = tx.schemaWrite().relationshipPropertyExistenceConstraintCreate( forRelType( type, prop1 ), "second constraint" );
            droppedInTx = tx.schemaWrite().relationshipPropertyExistenceConstraintCreate( forRelType( type, prop2 ), "third constraint" );

            tx.commit();
        }

        // Verify constraints created in transaction
        try ( KernelTransaction tx = beginTransaction() )
        {
            SchemaReadCore before = tx.schemaRead().snapshot();
            createdInTx = tx.schemaWrite().relationshipPropertyExistenceConstraintCreate( forRelType( type, prop3 ), "fourth constraint" );
            tx.schemaWrite().constraintDrop( droppedInTx );

            Iterable<ConstraintDescriptor> constraintsForRelType = () -> tx.schemaRead().constraintsGetForRelationshipTypeNonLocking( type );
            assertThat( constraintsForRelType ).contains( inStore, createdInTx );
            assertThat( before.constraintsGetForRelationshipTypeNonLocking( type ) ).toIterable().contains( inStore, createdInTx );

            tx.commit();
        }

        // Verify no locks are taken
        try ( KernelTransaction tx = beginTransaction() )
        {
            Iterable<ConstraintDescriptor> constraintsForRelType = () -> tx.schemaRead().constraintsGetForRelationshipTypeNonLocking( type );
            assertThat( constraintsForRelType ).contains( inStore, createdInTx );
            assertEquals( ((KernelTransactionImplementation) tx).lockClient().activeLockCount(), 0 );

            tx.commit();
        }
    }

    @Test
    void shouldListAllConstraintsNonLocking() throws Exception
    {

        ConstraintDescriptor inStore;
        ConstraintDescriptor droppedInTx;
        ConstraintDescriptor createdInTx;

        // Init
        try ( KernelTransaction tx = beginTransaction() )
        {
            inStore = tx.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop1 ), "second constraint" );
            droppedInTx = tx.schemaWrite().relationshipPropertyExistenceConstraintCreate( forRelType( type, prop2 ), "third constraint" );

            tx.commit();
        }

        // Verify constraints created in transaction
        try ( KernelTransaction tx = beginTransaction() )
        {
            SchemaReadCore before = tx.schemaRead().snapshot();
            createdInTx = tx.schemaWrite().relationshipPropertyExistenceConstraintCreate( forRelType( type, prop3 ), "fourth constraint" );
            tx.schemaWrite().constraintDrop( droppedInTx );

            Iterable<ConstraintDescriptor> constraintsForRelType = () -> tx.schemaRead().constraintsGetAllNonLocking( );
            assertThat( constraintsForRelType ).contains( inStore, createdInTx );
            assertThat( before.constraintsGetAllNonLocking( ) ).toIterable().contains( inStore, createdInTx );

            tx.commit();
        }

        // Verify no locks are taken
        try ( KernelTransaction tx = beginTransaction() )
        {
            Iterable<ConstraintDescriptor> constraintsForRelType = () -> tx.schemaRead().constraintsGetAllNonLocking( );
            assertThat( constraintsForRelType ).contains( inStore, createdInTx );
            assertEquals( ((KernelTransactionImplementation) tx).lockClient().activeLockCount(), 0 );

            tx.commit();
        }
    }

    @Test
    void oldSnapshotShouldNotSeeNewlyCommittedIndexes() throws Exception
    {
        try ( KernelTransaction longRunning = beginTransaction() )
        {
            SchemaReadCore snapshot = longRunning.schemaRead().snapshot();

            try ( KernelTransaction overlapping = beginTransaction() )
            {
                overlapping.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1 ) ).withName( "a" ) );
                overlapping.schemaWrite().indexCreate( IndexPrototype.forSchema(
                        fulltext( RELATIONSHIP, new int[] {type}, new int[] {prop2} ) ).withIndexType( IndexType.FULLTEXT ).withName( "b" ) );
                overlapping.commit();
            }

            assertThat( snapshot.indexGetForName( "a" ) ).isEqualTo( NO_INDEX );
            assertThat( snapshot.indexGetForName( "b" ) ).isEqualTo( NO_INDEX );
            assertFalse( snapshot.indexesGetAll().hasNext() );
            assertFalse( snapshot.index( forLabel( label, prop1 ) ).hasNext() );
            assertFalse( snapshot.indexesGetForLabel( label ).hasNext() );
            assertFalse( snapshot.indexesGetForRelationshipType( type ).hasNext() );
        }
    }

    @Test
    void oldSnapshotShouldNotSeeNewlyCommittedConstraints() throws Exception
    {
        try ( KernelTransaction longRunning = beginTransaction() )
        {
            SchemaReadCore snapshot = longRunning.schemaRead().snapshot();

            try ( KernelTransaction overlapping = beginTransaction() )
            {
                overlapping.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1 ) ).withName( "a" ) );
                overlapping.schemaWrite().nodeKeyConstraintCreate( uniqueForSchema( forLabel( label2, prop1 ) ).withName( "b" ) );
                overlapping.schemaWrite().nodePropertyExistenceConstraintCreate( forLabel( label, prop2 ), "c" );
                overlapping.schemaWrite().relationshipPropertyExistenceConstraintCreate( forRelType( type, prop1 ), "d" );
                overlapping.commit();
            }

            assertThat( snapshot.constraintGetForName( "a" ) ).isNull();
            assertThat( snapshot.indexGetForName( "a" ) ).isEqualTo( NO_INDEX );
            assertThat( snapshot.constraintGetForName( "b" ) ).isNull();
            assertThat( snapshot.indexGetForName( "b" ) ).isEqualTo( NO_INDEX );
            assertThat( snapshot.constraintGetForName( "c" ) ).isNull();
            assertThat( snapshot.constraintGetForName( "d" ) ).isNull();
            assertFalse( snapshot.constraintsGetAll().hasNext() );
            assertFalse( snapshot.constraintsGetForLabel( label ).hasNext() );
            assertFalse( snapshot.constraintsGetForRelationshipType( type ).hasNext() );
        }
    }

    @Test
    void shouldFailIndexCreateForRepeatedProperties() throws Exception
    {
        try ( KernelTransaction tx = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class,
                          () -> tx.schemaWrite().indexCreate( IndexPrototype.forSchema( forLabel( label, prop1, prop1 ) ).withName( "my index" ) ) );
        }
    }

    @Test
    void shouldFailUniquenessConstraintCreateForRepeatedProperties() throws Exception
    {
        try ( KernelTransaction tx = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class,
                    () -> tx.schemaWrite().uniquePropertyConstraintCreate( uniqueForSchema( forLabel( label, prop1, prop1 ) ) ) );
        }
    }

    @Test
    void shouldFailNodeKeyCreateForRepeatedProperties() throws Exception
    {
        try ( KernelTransaction tx = beginTransaction() )
        {
            assertThrows( SchemaKernelException.class, () -> tx.schemaWrite().nodeKeyConstraintCreate(
                    uniqueForSchema( forLabel( label, prop1, prop1 ) ) ) );
        }
    }
}
