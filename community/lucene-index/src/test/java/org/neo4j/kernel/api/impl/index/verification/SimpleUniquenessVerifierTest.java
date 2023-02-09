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
package org.neo4j.kernel.api.impl.index.verification;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.search.SearcherManager;
import org.apache.lucene.store.Directory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.neo4j.configuration.Config;
import org.neo4j.io.IOUtils;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.impl.index.IndexWriterConfigs;
import org.neo4j.kernel.api.impl.index.TestPropertyAccessor;
import org.neo4j.kernel.api.impl.index.partition.Neo4jSearcherFactory;
import org.neo4j.kernel.api.impl.index.partition.PartitionSearcher;
import org.neo4j.kernel.api.impl.index.storage.DirectoryFactory;
import org.neo4j.kernel.api.impl.schema.LuceneDocumentStructure;
import org.neo4j.kernel.api.impl.schema.verification.SimpleUniquenessVerifier;
import org.neo4j.kernel.api.impl.schema.verification.UniquenessVerifier;
import org.neo4j.storageengine.api.NodePropertyAccessor;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.neo4j.kernel.api.impl.LuceneTestUtil.valueTupleList;

@TestDirectoryExtension
class SimpleUniquenessVerifierTest
{
    private static final int[] PROPERTY_KEY_IDS = new int[]{42};

    @Inject
    private TestDirectory testDir;

    private DirectoryFactory dirFactory;
    private IndexWriter writer;
    private SearcherManager searcherManager;

    @BeforeEach
    void initLuceneResources() throws Exception
    {
        dirFactory = new DirectoryFactory.InMemoryDirectoryFactory();
        Directory dir = dirFactory.open( testDir.directory( "test" ) );
        writer = new IndexWriter( dir, IndexWriterConfigs.standard( Config.defaults() ) );
        searcherManager = new SearcherManager( writer, new Neo4jSearcherFactory() );
    }

    @AfterEach
    void closeLuceneResources() throws Exception
    {
        IOUtils.closeAll( searcherManager, writer, dirFactory );
    }

    @Test
    void partitionSearcherIsClosed() throws IOException
    {
        PartitionSearcher partitionSearcher = mock( PartitionSearcher.class );
        SimpleUniquenessVerifier verifier = new SimpleUniquenessVerifier( partitionSearcher );

        verifier.close();

        verify( partitionSearcher ).close();
    }

    @Test
    void populationVerificationNoDuplicates() throws Exception
    {
        List<Object> data = asList( "string1", "42", "43", "44", "45L", "(byte) 46", "47.0", "(float) 48.1", "string2" );
        NodePropertyAccessor nodePropertyAccessor = newPropertyAccessor( data );

        insert( data );

        assertNoDuplicates( nodePropertyAccessor );
    }

    @Test
    void populationVerificationOneDuplicate() throws IOException
    {
        List<Object> data = asList( "cat", "21", "22", "23", "24L", "(byte) 25", "26.0", "22", "dog" );
        NodePropertyAccessor nodePropertyAccessor = newPropertyAccessor( data );

        insert( data );

        assertHasDuplicates( nodePropertyAccessor );
    }

    @Test
    void populationVerificationManyDuplicate() throws IOException
    {
        List<Object> data = asList( "dog", "cat", "dog", "dog", "dog", "dog" );
        NodePropertyAccessor nodePropertyAccessor = newPropertyAccessor( data );

        insert( data );

        assertHasDuplicates( nodePropertyAccessor );
    }

    @Test
    void updatesVerificationNoDuplicates() throws Exception
    {
        List<Object> data = asList( "lucene", "1337975550", "43.10", 'a', 'b', 'c', "(byte) 12" );
        NodePropertyAccessor nodePropertyAccessor = newPropertyAccessor( data );

        insert( data );

        assertNoDuplicatesCreated( nodePropertyAccessor, valueTupleList( "1337975550", 'c', "(byte) 12" ) );
    }

    @Test
    void updatesVerificationOneDuplicate() throws IOException
    {
        List<Object> data = asList( "foo", "bar", "baz", "100", "200", 'q', 'u', 'x', "aa", "300", 'u', "-100" );
        NodePropertyAccessor nodePropertyAccessor = newPropertyAccessor( data );

        insert( data );

        assertDuplicatesCreated( nodePropertyAccessor, valueTupleList( "aa", 'u', "-100" ) );
    }

    @Test
    void updatesVerificationManyDuplicate() throws IOException
    {
        List<Object> data = asList( "-99", 'a', "-10.0", "-99.99999", "apa", "-99.99999", "mod", "div", "div", "-10" );
        NodePropertyAccessor nodePropertyAccessor = newPropertyAccessor( data );

        insert( data );

        assertDuplicatesCreated( nodePropertyAccessor, valueTupleList( "-99.99999", 'a', "-10", "div" ) );
    }

    private void assertNoDuplicates( NodePropertyAccessor nodePropertyAccessor ) throws Exception
    {
        try ( UniquenessVerifier verifier = newSimpleUniquenessVerifier() )
        {
            verifier.verify( nodePropertyAccessor, PROPERTY_KEY_IDS );
        }
    }

    private void assertNoDuplicatesCreated( NodePropertyAccessor nodePropertyAccessor, List<Value[]> updatedPropertyValues )
            throws Exception
    {
        try ( UniquenessVerifier verifier = newSimpleUniquenessVerifier() )
        {
            verifier.verify( nodePropertyAccessor, PROPERTY_KEY_IDS, updatedPropertyValues );
        }
    }

    private void assertHasDuplicates( NodePropertyAccessor nodePropertyAccessor ) throws IOException
    {
        try ( UniquenessVerifier verifier = newSimpleUniquenessVerifier() )
        {
            assertThrows( IndexEntryConflictException.class, () -> verifier.verify( nodePropertyAccessor, PROPERTY_KEY_IDS ) );
        }
    }

    private void assertDuplicatesCreated( NodePropertyAccessor nodePropertyAccessor, List<Value[]> updatedPropertyValues ) throws IOException
    {
        try ( UniquenessVerifier verifier = newSimpleUniquenessVerifier() )
        {
            assertThrows( IndexEntryConflictException.class, () -> verifier.verify( nodePropertyAccessor, PROPERTY_KEY_IDS, updatedPropertyValues ) );
        }
    }

    private void insert( List<Object> data ) throws IOException
    {
        for ( int i = 0; i < data.size(); i++ )
        {
            Document doc = LuceneDocumentStructure.documentRepresentingProperties( i, Values.of( data.get( i ) ) );
            writer.addDocument( doc );
        }
        searcherManager.maybeRefreshBlocking();
    }

    private static NodePropertyAccessor newPropertyAccessor( List<Object> propertyValues )
    {
        return new TestPropertyAccessor(
                propertyValues.stream()
                        .map( Values::of )
                        .collect( Collectors.toList() ) );
    }

    private UniquenessVerifier newSimpleUniquenessVerifier() throws IOException
    {
        PartitionSearcher partitionSearcher = new PartitionSearcher( searcherManager );
        return new SimpleUniquenessVerifier( partitionSearcher );
    }
}
