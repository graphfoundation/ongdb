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
package org.neo4j.internal.recordstorage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import org.neo4j.common.EntityType;
import org.neo4j.graphdb.ConstraintViolationException;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.internal.schema.constraints.ConstraintDescriptorFactory;
import org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.store.MetaDataStore;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.storageengine.api.IndexUpdateListener;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class IntegrityValidatorTest
{
    @Test
    void shouldValidateUniquenessIndexes() throws Exception
    {
        // Given
        NeoStores store = mock( NeoStores.class );
        IndexUpdateListener indexes = mock( IndexUpdateListener.class );
        IntegrityValidator validator = new IntegrityValidator( store );
        validator.setIndexValidator( indexes );
        UniquenessConstraintDescriptor constraint = ConstraintDescriptorFactory.uniqueForLabel( 1, 1 );

        doThrow( new ConstraintViolationException( "error", new RuntimeException() ) ).when( indexes ).validateIndex( 2L );

        ConstraintDescriptor record = constraint.withId( 1 ).withOwnedIndexId( 2 );

        // When
        assertThrows( Exception.class, () -> validator.validateSchemaRule( record ) );
    }

    @Test
    void shouldOnlySupportOneIndexValidator()
    {
        // given
        NeoStores store = mock( NeoStores.class );
        IntegrityValidator validator = new IntegrityValidator( store );
        validator.setIndexValidator( mock( IndexUpdateListener.class ) );

        // when/then
        assertThrows( IllegalStateException.class, () -> validator.setIndexValidator( mock( IndexUpdateListener.class ) ) );
    }

    @Test
    void deletingNodeWithRelationshipsIsNotAllowed()
    {
        // Given
        NeoStores store = mock( NeoStores.class );
        IntegrityValidator validator = new IntegrityValidator( store );

        NodeRecord record = new NodeRecord( 1L ).initialize( false, -1L, false, 1L, 0 );
        record.setInUse( false );

        // When
        assertThrows( Exception.class, () -> IntegrityValidator.validateNodeRecord( record ) );
    }

    @Test
    void transactionsStartedBeforeAConstraintWasCreatedAreDisallowed()
    {
        // Given
        NeoStores store = mock( NeoStores.class );
        MetaDataStore metaDataStore = mock( MetaDataStore.class );
        when( store.getMetaDataStore() ).thenReturn( metaDataStore );
        when( metaDataStore.getLatestConstraintIntroducingTx() ).thenReturn( 10L );
        IntegrityValidator validator = new IntegrityValidator( store );

        // When
        assertThrows( Exception.class, () -> validator.validateTransactionStartKnowledge( 1 ) );
    }

    @Test
    void tokenIndexesNotAllowedForOldKernelVersions()
    {
        // Given
        NeoStores store = mock( NeoStores.class );
        MetaDataStore metaDataStore = mock( MetaDataStore.class );
        when( store.getMetaDataStore() ).thenReturn( metaDataStore );
        when( metaDataStore.kernelVersion() ).thenReturn( KernelVersion.V4_2 );

        IndexUpdateListener indexes = mock( IndexUpdateListener.class );
        IntegrityValidator validator = new IntegrityValidator( store );
        validator.setIndexValidator( indexes );

        var index = IndexPrototype.forSchema( SchemaDescriptors.forAnyEntityTokens( EntityType.NODE ) )
                                  .withIndexType( IndexType.LOOKUP )
                                  .withName( "any name" )
                                  .materialise( 4 );

        // When
        assertThatThrownBy( () -> validator.validateSchemaRule( index ) )
                .isInstanceOf( TransactionFailureException.class )
                .hasMessageContaining( "Required kernel version for this transaction is V4_3_D4, but actual version was V4_2." );
    }

    @Test
    void relationshipPropertyIndexesNotAllowedForOldKernelVersions()
    {
        // Given
        NeoStores store = mock( NeoStores.class );
        MetaDataStore metaDataStore = mock( MetaDataStore.class );
        when( store.getMetaDataStore() ).thenReturn( metaDataStore );
        when( metaDataStore.kernelVersion() ).thenReturn( KernelVersion.V4_2 );

        IndexUpdateListener indexes = mock( IndexUpdateListener.class );
        IntegrityValidator validator = new IntegrityValidator( store );
        validator.setIndexValidator( indexes );

        var index = IndexPrototype.forSchema( SchemaDescriptors.forRelType( 3, 14 ) )
                                  .withIndexType( IndexType.BTREE )
                                  .withName( "any name" )
                                  .materialise( 4 );

        // When
        assertThatThrownBy( () -> validator.validateSchemaRule( index ) )
                .isInstanceOf( TransactionFailureException.class )
                .hasMessageContaining( "Required kernel version for this transaction is V4_3_D4, but actual version was V4_2." );
    }

    @ParameterizedTest
    @EnumSource( value = IndexType.class, names = {"RANGE","POINT","TEXT"} )
    void newIndexesNotAllowedForOldKernelVersions( IndexType indexType )
    {
        // Given
        NeoStores store = mock( NeoStores.class );
        MetaDataStore metaDataStore = mock( MetaDataStore.class );
        when( store.getMetaDataStore() ).thenReturn( metaDataStore );
        when( metaDataStore.kernelVersion() ).thenReturn( KernelVersion.V4_3_D4 );

        IndexUpdateListener indexes = mock( IndexUpdateListener.class );
        IntegrityValidator validator = new IntegrityValidator( store );
        validator.setIndexValidator( indexes );

        var index = IndexPrototype.forSchema( SchemaDescriptors.forLabel( 10, 28 ) )
                .withIndexType( indexType )
                .withName( "any name" )
                .materialise( 4 );

        // When
        assertThatThrownBy( () -> validator.validateSchemaRule( index ) )
                .isInstanceOf( TransactionFailureException.class )
                .hasMessageContaining( "Required kernel version for this transaction is V4_4, but actual version was V4_3_D4." );
    }

    @Test
    void constraintBackedByRangeNotAllowedForOldKernelVersions()
    {
        // Given
        NeoStores store = mock( NeoStores.class );
        MetaDataStore metaDataStore = mock( MetaDataStore.class );
        when( store.getMetaDataStore() ).thenReturn( metaDataStore );
        when( metaDataStore.kernelVersion() ).thenReturn( KernelVersion.V4_3_D4 );

        IndexUpdateListener indexes = mock( IndexUpdateListener.class );
        IntegrityValidator validator = new IntegrityValidator( store );
        validator.setIndexValidator( indexes );

        ConstraintDescriptor constraint = ConstraintDescriptorFactory.uniqueForSchema( SchemaDescriptors.forLabel( 10, 28 ), IndexType.RANGE )
                .withOwnedIndexId( 4 )
                .withName( "any name" )
                .withId( 5 );

        // When
        assertThatThrownBy( () -> validator.validateSchemaRule( constraint ) )
                .isInstanceOf( TransactionFailureException.class )
                .hasMessageContaining( "Required kernel version for this transaction is V4_4, but actual version was V4_3_D4." );
    }
}
