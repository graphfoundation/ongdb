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
package org.neo4j.kernel.impl.storemigration;

import org.eclipse.collections.api.tuple.Pair;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.neo4j.internal.schema.IndexConfig;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.io.memory.ByteBuffers;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.Log;
import org.neo4j.logging.NullLog;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.logging.AssertableLogProvider.Level.WARN;
import static org.neo4j.logging.LogAssertions.assertThat;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;
import static org.neo4j.test.Unzip.unzip;
import static org.neo4j.values.storable.Values.COMPARATOR;

@PageCacheExtension
class SpatialConfigExtractorTest
{
    private static final String ZIP_HEALTHY_SPATIAL_35_DIR = "healthy-spatial-35-dir.zip";
    private static final String HEALTHY_SPATIAL_35_DIR = "healthy-spatial-35-dir";
    private static final String ZIP_FAILED_SPATIAL_35_DIR = "failed-spatial-35-dir.zip";
    private static final String FAILED_SPATIAL_35_DIR = "failed-spatial-35-dir";
    private static final Map<String,Value> staticExpectedIndexConfig = new HashMap<>();

    static
    {
        /* Note on why maxLevels settings are commented out:
        Indexes in 3.5 where created with maxLevels configured. This setting was removed in
        4.0 and actual number was fixated. Therefore we don't migrate this index setting. */

//        staticExpectedIndexConfig.put( "spatial.wgs-84.maxLevels", Values.intValue( 15 ) );
        staticExpectedIndexConfig.put( "spatial.wgs-84.min", Values.doubleArray( new double[]{-1.0, -2.0} ) );
        staticExpectedIndexConfig.put( "spatial.wgs-84.max", Values.doubleArray( new double[]{3.0, 4.0} ) );

//        staticExpectedIndexConfig.put( "spatial.wgs-84-3d.maxLevels", Values.intValue( 10 ) );
        staticExpectedIndexConfig.put( "spatial.wgs-84-3d.min", Values.doubleArray( new double[]{-5.0, -6.0, -7.0} ) );
        staticExpectedIndexConfig.put( "spatial.wgs-84-3d.max", Values.doubleArray( new double[]{8.0, 9.0, 10.0} ) );

//        staticExpectedIndexConfig.put( "spatial.cartesian.maxLevels", Values.intValue( 15 ) );
        staticExpectedIndexConfig.put( "spatial.cartesian.min", Values.doubleArray( new double[]{-11.0, -12.0} ) );
        staticExpectedIndexConfig.put( "spatial.cartesian.max", Values.doubleArray( new double[]{13.0, 14.0} ) );

//        staticExpectedIndexConfig.put( "spatial.cartesian-3d.maxLevels", Values.intValue( 10 ) );
        staticExpectedIndexConfig.put( "spatial.cartesian-3d.min", Values.doubleArray( new double[]{-15.0, -16.0, -17.0} ) );
        staticExpectedIndexConfig.put( "spatial.cartesian-3d.max", Values.doubleArray( new double[]{18.0, 19.0, 20.0} ) );
    }

    @Inject
    FileSystemAbstraction fs;

    @Inject
    PageCache pageCache;

    @Inject
    TestDirectory directory;

    @Test
    void shouldLogFailureToExtractIndexConfigFromGenericBecauseOfIndexInFailedState() throws IOException
    {
        // given
        unzip( getClass(), ZIP_FAILED_SPATIAL_35_DIR, directory.homePath() );
        AssertableLogProvider logProvider = new AssertableLogProvider();
        Log myLog = logProvider.getLog( getClass() );

        // and
        Path spatialDirectory = directory.homePath().resolve( FAILED_SPATIAL_35_DIR );
        assertTrue( fs.fileExists( spatialDirectory ) );
        assertTrue( fs.isDirectory( spatialDirectory ) );

        // when
        List<SpatialFile> spatialFiles = IndexMigration.getSpatialFiles( fs, spatialDirectory );
        SpatialConfigExtractor.indexConfigFromSpatialFile( pageCache, spatialFiles, NULL, myLog, DEFAULT_DATABASE_NAME );

        // then
        String reason = "Index is in FAILED state.";
        assertContainsLogEntry( logProvider, spatialFiles.get( 0 ).getIndexFile(), reason );
    }

    @Test
    void shouldLogFailureToExtractIndexConfigFromGenericBecauseOfIndexInCorruptState() throws IOException
    {
        // given
        AssertableLogProvider logProvider = new AssertableLogProvider();
        Log myLog = logProvider.getLog( getClass() );
        SpatialFile spatialFile = new SpatialFile( CoordinateReferenceSystem.WGS84, directory.file( "spatialFile" ) );
        corruptFile( fs, spatialFile.getIndexFile() );

        // when
        SpatialConfigExtractor.indexConfigFromSpatialFile( pageCache, singletonList( spatialFile ), NULL, myLog, DEFAULT_DATABASE_NAME );

        // then
        String reason = "Index meta data is corrupt and can not be parsed.";
        assertContainsLogEntry( logProvider, spatialFile.getIndexFile(), reason );
    }

    @Test
    void shouldBeAbleToExtractConfigFromHealthy35File() throws IOException
    {
        // given
        unzip( getClass(), ZIP_HEALTHY_SPATIAL_35_DIR, directory.homePath() );
        Path spatialDir = directory.file( HEALTHY_SPATIAL_35_DIR );

        // and
        assertTrue( fs.fileExists( spatialDir ) );

        // when
        List<SpatialFile> spatialFiles = IndexMigration.getSpatialFiles( fs, spatialDir );
        IndexConfig indexConfig =
                SpatialConfigExtractor.indexConfigFromSpatialFile( pageCache, spatialFiles, NULL, NullLog.getInstance(), DEFAULT_DATABASE_NAME );

        // then
        assertExpectedIndexConfig( indexConfig );
    }

    private void assertContainsLogEntry( AssertableLogProvider logProvider, Path genericFile, String reason )
    {
        assertThat( logProvider ).forClass( getClass() ).forLevel( WARN )
                .containsMessages( "Could not extract index configuration from migrating index file. " + reason +
                        " Index will be recreated with currently configured settings instead, indexFile=" + genericFile.toAbsolutePath() );
    }

    private static void corruptFile( FileSystemAbstraction fs, Path spatialFile ) throws IOException
    {
        try ( StoreChannel write = fs.write( spatialFile ) )
        {
            int size = 100;
            byte[] bytes = new byte[size];
            Arrays.fill( bytes, (byte) 9 );
            ByteBuffer byteBuffer = ByteBuffers.allocate( size, INSTANCE );
            byteBuffer.put( bytes );
            write.writeAll( byteBuffer );
        }
        assertTrue( fs.fileExists( spatialFile ) );
    }

    private static void assertExpectedIndexConfig( IndexConfig indexConfig )
    {
        Map<String,Value> expectedIndexConfig = new HashMap<>( staticExpectedIndexConfig );
        for ( Pair<String,Value> entry : indexConfig.entries() )
        {
            String actualKey = entry.getOne();
            Value actualValue = entry.getTwo();
            Value expectedValue = expectedIndexConfig.remove( actualKey );
            assertNotNull( expectedValue, "Actual index config had map entry that was not among expected " + entry );
            assertEquals( 0, COMPARATOR.compare( expectedValue, actualValue ),
                    String.format( "Expected and actual index config value differed for %s, expected %s but was %s.", actualKey, expectedValue,
                            actualValue ) );
        }
        assertTrue( expectedIndexConfig.isEmpty(), "Actual index config was missing some values: " + expectedIndexConfig );
    }
}
