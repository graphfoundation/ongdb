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
package org.neo4j.kernel.api.impl.schema.populator;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.io.IOException;
import java.util.List;

import org.neo4j.internal.schema.SchemaDescriptorSupplier;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.impl.schema.LuceneIndexProvider;
import org.neo4j.kernel.api.impl.schema.SchemaIndex;
import org.neo4j.kernel.api.impl.schema.writer.LuceneIndexWriter;
import org.neo4j.kernel.api.index.IndexSample;
import org.neo4j.kernel.api.index.UniqueIndexSampler;
import org.neo4j.storageengine.api.NodePropertyAccessor;
import org.neo4j.values.storable.Value;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.neo4j.kernel.api.impl.LuceneTestUtil.documentRepresentingProperties;
import static org.neo4j.kernel.api.impl.LuceneTestUtil.valueTupleList;
import static org.neo4j.kernel.api.impl.schema.LuceneDocumentStructure.newTermForChangeOrRemove;
import static org.neo4j.kernel.api.index.IndexQueryHelper.add;
import static org.neo4j.kernel.api.index.IndexQueryHelper.change;
import static org.neo4j.kernel.api.index.IndexQueryHelper.remove;

class UniqueDatabaseIndexPopulatingUpdaterTest
{
    private static final SchemaDescriptorSupplier descriptor = () -> SchemaDescriptors.forLabel( 1, 42 );

    @Test
    void closeVerifiesUniquenessOfAddedValues() throws Exception
    {
        SchemaIndex index = mock( SchemaIndex.class );
        UniqueLuceneIndexPopulatingUpdater updater = newUpdater( index );

        updater.process( add( 1, descriptor, "foo" ) );
        updater.process( add( 1, descriptor, "bar" ) );
        updater.process( add( 1, descriptor, "baz" ) );

        verifyNoInteractions( index );

        updater.close();
        verifyVerifyUniqueness( index, descriptor, "foo", "bar", "baz" );
    }

    @Test
    void closeVerifiesUniquenessOfChangedValues() throws Exception
    {
        SchemaIndex index = mock( SchemaIndex.class );
        UniqueLuceneIndexPopulatingUpdater updater = newUpdater( index );

        updater.process( change( 1, descriptor, "foo1", "foo2" ) );
        updater.process( change( 1, descriptor, "bar1", "bar2" ) );
        updater.process( change( 1, descriptor, "baz1", "baz2" ) );

        verifyNoMoreInteractions( index );

        updater.close();

        verifyVerifyUniqueness( index, descriptor, "foo2", "bar2", "baz2" );
    }

    @Test
    void closeVerifiesUniquenessOfAddedAndChangedValues() throws Exception
    {
        SchemaIndex index = mock( SchemaIndex.class );
        UniqueLuceneIndexPopulatingUpdater updater = newUpdater( index );

        updater.process( add( 1, descriptor, "added1" ) );
        updater.process( add( 2, descriptor, "added2" ) );
        updater.process( change( 3, descriptor, "before1", "after1" ) );
        updater.process( change( 4, descriptor, "before2", "after2" ) );
        updater.process( remove( 5, descriptor, "removed1" ) );

        verifyNoInteractions( index );

        updater.close();

        verifyVerifyUniqueness( index, descriptor, "added1", "added2", "after1", "after2" );
    }

    @Test
    void addedNodePropertiesIncludedInSample()
    {
        UniqueIndexSampler sampler = new UniqueIndexSampler();
        UniqueLuceneIndexPopulatingUpdater updater = newUpdater( sampler );

        updater.process( add( 1, descriptor, "foo" ) );
        updater.process( add( 2, descriptor, "bar" ) );
        updater.process( add( 3, descriptor, "baz" ) );
        updater.process( add( 4, descriptor, "qux" ) );

        verifySamplingResult( sampler, 4 );
    }

    @Test
    void changedNodePropertiesDoNotInfluenceSample()
    {
        UniqueIndexSampler sampler = new UniqueIndexSampler();
        UniqueLuceneIndexPopulatingUpdater updater = newUpdater( sampler );

        updater.process( change( 1, descriptor, "before1", "after1" ) );
        updater.process( change( 2, descriptor, "before2", "after2" ) );

        verifySamplingResult( sampler, 0 );
    }

    @Test
    void removedNodePropertyIncludedInSample()
    {
        long initialValue = 10;
        UniqueIndexSampler sampler = new UniqueIndexSampler();
        sampler.increment( initialValue );

        UniqueLuceneIndexPopulatingUpdater updater = newUpdater( sampler );

        updater.process( remove( 1, descriptor, "removed1" ) );
        updater.process( remove( 2, descriptor, "removed2" ) );

        verifySamplingResult( sampler, initialValue - 2 );
    }

    @Test
    void nodePropertyUpdatesIncludedInSample()
    {
        UniqueIndexSampler sampler = new UniqueIndexSampler();
        UniqueLuceneIndexPopulatingUpdater updater = newUpdater( sampler );

        updater.process( add( 1, descriptor, "foo" ) );
        updater.process( change( 1, descriptor, "foo", "bar" ) );
        updater.process( add( 2, descriptor, "baz" ) );
        updater.process( add( 3, descriptor, "qux" ) );
        updater.process( remove( 4, descriptor, "qux" ) );

        verifySamplingResult( sampler, 2 );
    }

    @Test
    void additionsDeliveredToIndexWriter() throws Exception
    {
        LuceneIndexWriter writer = mock( LuceneIndexWriter.class );
        UniqueLuceneIndexPopulatingUpdater updater = newUpdater( writer );

        updater.process( add( 1, descriptor, "foo" ) );
        updater.process( add( 2, descriptor, "bar" ) );
        updater.process( add( 3, descriptor, "qux" ) );

        verify( writer ).updateDocument( newTermForChangeOrRemove( 1 ),
                                         documentRepresentingProperties( 1, "foo" ) );
        verify( writer ).updateDocument( newTermForChangeOrRemove( 2 ),
                                         documentRepresentingProperties( 2, "bar" ) );
        verify( writer ).updateDocument( newTermForChangeOrRemove( 3 ),
                                         documentRepresentingProperties( 3, "qux" ) );
    }

    @Test
    void changesDeliveredToIndexWriter() throws Exception
    {
        LuceneIndexWriter writer = mock( LuceneIndexWriter.class );
        UniqueLuceneIndexPopulatingUpdater updater = newUpdater( writer );

        updater.process( change( 1, descriptor, "before1", "after1" ) );
        updater.process( change( 2, descriptor, "before2", "after2" ) );

        verify( writer ).updateOrDeleteDocument( newTermForChangeOrRemove( 1 ),
                                                 documentRepresentingProperties( 1, "after1" ) );
        verify( writer ).updateOrDeleteDocument( newTermForChangeOrRemove( 2 ),
                                                 documentRepresentingProperties( 2, "after2" ) );
    }

    @Test
    void removalsDeliveredToIndexWriter() throws Exception
    {
        LuceneIndexWriter writer = mock( LuceneIndexWriter.class );
        UniqueLuceneIndexPopulatingUpdater updater = newUpdater( writer );

        updater.process( remove( 1, descriptor, "foo" ) );
        updater.process( remove( 2, descriptor, "bar" ) );
        updater.process( remove( 3, descriptor, "baz" ) );

        verify( writer ).deleteDocuments( newTermForChangeOrRemove( 1 ) );
        verify( writer ).deleteDocuments( newTermForChangeOrRemove( 2 ) );
        verify( writer ).deleteDocuments( newTermForChangeOrRemove( 3 ) );
    }

    private static void verifySamplingResult( UniqueIndexSampler sampler, long expectedValue )
    {
        IndexSample sample = sampler.result();

        assertEquals( expectedValue, sample.indexSize() );
        assertEquals( expectedValue, sample.uniqueValues() );
        assertEquals( expectedValue, sample.sampleSize() );
    }

    private static UniqueLuceneIndexPopulatingUpdater newUpdater( SchemaIndex index )
    {
        return newUpdater( index, mock( LuceneIndexWriter.class ), new UniqueIndexSampler() );
    }

    private static UniqueLuceneIndexPopulatingUpdater newUpdater( LuceneIndexWriter writer )
    {
        return newUpdater( mock( SchemaIndex.class ), writer, new UniqueIndexSampler() );
    }

    private static UniqueLuceneIndexPopulatingUpdater newUpdater( UniqueIndexSampler sampler )
    {
        return newUpdater( mock( SchemaIndex.class ), mock( LuceneIndexWriter.class ), sampler );
    }

    private static UniqueLuceneIndexPopulatingUpdater newUpdater( SchemaIndex index, LuceneIndexWriter writer, UniqueIndexSampler sampler )
    {
        return new UniqueLuceneIndexPopulatingUpdater( writer, descriptor.schema().getPropertyIds(), index,
                                                       mock( NodePropertyAccessor.class ), sampler, LuceneIndexProvider.UPDATE_IGNORE_STRATEGY );
    }

    private static void verifyVerifyUniqueness( SchemaIndex index, SchemaDescriptorSupplier descriptor, Object... values )
            throws IOException, IndexEntryConflictException
    {
        @SuppressWarnings( "unchecked" )
        ArgumentCaptor<List<Value[]>> captor = ArgumentCaptor.forClass( List.class );
        verify( index ).verifyUniqueness(
                any(), eq( descriptor.schema().getPropertyIds() ), captor.capture() );

        assertThat( captor.getValue() ).containsAll( valueTupleList( values ) );
    }
}
