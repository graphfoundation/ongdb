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
package org.neo4j.files;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.kernel.api.impl.schema.LuceneIndexProvider;
import org.neo4j.kernel.impl.index.schema.GenericNativeIndexProvider;
import org.neo4j.kernel.impl.index.schema.fusion.NativeLuceneFusionIndexProviderFactory30;
import org.neo4j.kernel.internal.NativeIndexFileFilter;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.kernel.api.index.IndexDirectoryStructure.directoriesByProvider;
import static org.neo4j.kernel.impl.index.schema.fusion.NativeLuceneFusionIndexProviderFactory30.subProviderDirectoryStructure;

@TestDirectoryExtension
class NativeIndexFileFilterTest
{
    private static final IndexProviderDescriptor LUCENE_DESCRTIPTOR = LuceneIndexProvider.DESCRIPTOR;

    @Inject
    private DefaultFileSystemAbstraction fs;
    @Inject
    private TestDirectory directory;

    private Path storeDir;
    private NativeIndexFileFilter filter;
    private static final IndexProviderDescriptor[] REMOVED_SUB_PROVIDERS = new IndexProviderDescriptor[]{
            new IndexProviderDescriptor( "string", "1.0" ),
            new IndexProviderDescriptor( "native", "1.0" ),
            new IndexProviderDescriptor( "temporal", "1.0" ),
            new IndexProviderDescriptor( "spatial", "1.0" )
    };
    private static final IndexProviderDescriptor[] REMOVE_FUSION_PROVIDERS = new IndexProviderDescriptor[]{
            new IndexProviderDescriptor( "lucene+native", "1.0" ),
            new IndexProviderDescriptor( "lucene+native", "2.0" )
    };
    private static final IndexProviderDescriptor fusion30 = NativeLuceneFusionIndexProviderFactory30.DESCRIPTOR;
    private static final IndexProviderDescriptor nativeBtree10 = GenericNativeIndexProvider.DESCRIPTOR;

    @BeforeEach
    void before()
    {
        storeDir = directory.homePath();
        filter = new NativeIndexFileFilter( storeDir );
    }

    @Test
    void shouldNotAcceptLuceneFileFromFusionProvider() throws IOException
    {
        // given
        Path dir = subProviderDirectoryStructure( storeDir, LUCENE_DESCRTIPTOR ).forProvider( LUCENE_DESCRTIPTOR ).directoryForIndex( 1 );
        shouldNotAcceptFileInDirectory( dir );
    }

    @Test
    void shouldNotAcceptRemoveIndexProviderFilesUnderFusion() throws IOException
    {
        for ( IndexProviderDescriptor fusionProvider : REMOVE_FUSION_PROVIDERS )
        {
            for ( IndexProviderDescriptor subProvider : REMOVED_SUB_PROVIDERS )
            {
                shouldNotAcceptNativeIndexFileFromFusionProvider( fusionProvider, subProvider );
            }
        }
    }

    @Test
    void shouldAcceptNativeBtreeIndexFileFromFusionProvider() throws IOException
    {
        shouldAcceptNativeIndexFileFromFusionProvider( fusion30, nativeBtree10 );
    }

    @Test
    void shouldAcceptPureNativeBtreeIndexFile() throws IOException
    {
        shouldAcceptNativeIndexFilePure( nativeBtree10 );
    }

    private void shouldAcceptNativeIndexFilePure( IndexProviderDescriptor provider ) throws IOException
    {
        // given
        Path dir = directoriesByProvider( storeDir ).forProvider( provider ).directoryForIndex( 1 );
        shouldAcceptFileInDirectory( dir );
    }

    private void shouldAcceptNativeIndexFileFromFusionProvider( IndexProviderDescriptor fusionProvider, IndexProviderDescriptor subProvider ) throws IOException
    {
        // given
        Path dir = subProviderDirectoryStructure( storeDir, fusionProvider ).forProvider( subProvider ).directoryForIndex( 1 );
        shouldAcceptFileInDirectory( dir );
    }

    private void shouldNotAcceptNativeIndexFileFromFusionProvider( IndexProviderDescriptor fusionProvider, IndexProviderDescriptor subProvider )
            throws IOException
    {
        // given
        Path dir = subProviderDirectoryStructure( storeDir, fusionProvider ).forProvider( subProvider ).directoryForIndex( 1 );
        shouldNotAcceptFileInDirectory( dir );
    }

    private void shouldAcceptFileInDirectory( Path dir ) throws IOException
    {
        Path file = dir.resolve( "some-file" );
        createFile( file );

        // when
        boolean accepted = filter.test( file );

        // then
        assertTrue( accepted, "Expected to accept file " + file );
    }

    private void shouldNotAcceptFileInDirectory( Path dir ) throws IOException
    {
        Path file = dir.resolve( "some-file" );
        createFile( file );

        // when
        boolean accepted = filter.test( file );

        // then
        assertFalse( accepted, "Did not expect to accept file " + file );
    }

    private void createFile( Path file ) throws IOException
    {
        fs.mkdirs( file.getParent() );
        ((StoreChannel) fs.write( file )).close();
    }
}
