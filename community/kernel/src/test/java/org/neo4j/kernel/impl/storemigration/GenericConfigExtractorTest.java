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
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
class GenericConfigExtractorTest
{
    private static final String ZIP_HEALTHY_GENERIC_35_FILE = "healthy-generic-35-file.zip";
    private static final String HEALTHY_GENERIC_35_FILE = "healthy-generic-35-file";
    private static final String ZIP_FAILED_GENERIC_35_FILE = "failed-generic-35-file.zip";
    private static final String FAILED_GENERIC_35_FILE = "failed-generic-35-file";
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
    void shouldLogFailureToExtractIndexConfigFromGenericBecauseOfMissingFile() throws IOException
    {
        // given
        AssertableLogProvider logProvider = new AssertableLogProvider();
        Log myLog = logProvider.getLog( getClass() );
        Path genericFile = directory.file( "genericFile" );
        assertFalse( fs.fileExists( genericFile ) );

        // when
        GenericConfigExtractor.indexConfigFromGenericFile( fs, pageCache, genericFile, NULL, myLog, DEFAULT_DATABASE_NAME );

        // then
        String reason = "Index file does not exists.";
        assertContainsLogEntry( logProvider, genericFile, reason );
    }

    @Test
    void shouldLogFailureToExtractIndexConfigFromGenericBecauseOfIndexInFailedState() throws IOException
    {
        // given
        unzip( getClass(), ZIP_FAILED_GENERIC_35_FILE, directory.homePath() );
        Path genericFile = directory.file( FAILED_GENERIC_35_FILE );
        AssertableLogProvider logProvider = new AssertableLogProvider();
        Log myLog = logProvider.getLog( getClass() );

        // and
        assertTrue( fs.fileExists( genericFile ) );

        // when
        GenericConfigExtractor.indexConfigFromGenericFile( fs, pageCache, genericFile, NULL, myLog, DEFAULT_DATABASE_NAME );

        // then
        String reason = "Index is in FAILED state.";
        assertContainsLogEntry( logProvider, genericFile, reason );
    }

    @Test
    void shouldLogFailureToExtractIndexConfigFromGenericBecauseOfIndexInCorruptState() throws IOException
    {
        // given
        AssertableLogProvider logProvider = new AssertableLogProvider();
        Log myLog = logProvider.getLog( getClass() );
        Path genericFile = directory.file( "genericFile" );
        corruptFile( fs, genericFile );

        // when
        GenericConfigExtractor.indexConfigFromGenericFile( fs, pageCache, genericFile, NULL, myLog, DEFAULT_DATABASE_NAME );

        // then
        String reason = "Index meta data is corrupt and can not be parsed.";
        assertContainsLogEntry( logProvider, genericFile, reason );
    }

    @Test
    void shouldBeAbleToExtractConfigFromHealthy35File() throws IOException
    {
        // given
        unzip( getClass(), ZIP_HEALTHY_GENERIC_35_FILE, directory.homePath() );
        Path genericFile = directory.file( HEALTHY_GENERIC_35_FILE );

        // and
        assertTrue( fs.fileExists( genericFile ) );

        // when
        IndexConfig indexConfig =
                GenericConfigExtractor.indexConfigFromGenericFile( fs, pageCache, genericFile, NULL, NullLog.getInstance(), DEFAULT_DATABASE_NAME );

        // then
        assertExpectedIndexConfig( indexConfig );
    }

    private void assertContainsLogEntry( AssertableLogProvider logProvider, Path genericFile, String reason )
    {
        assertThat( logProvider ).forClass( getClass() ).forLevel( WARN )
                .containsMessages( "Could not extract index configuration from migrating index file. " + reason +
                        " Index will be recreated with currently configured settings instead, indexFile=" + genericFile.toAbsolutePath() );
    }

    private static void corruptFile( FileSystemAbstraction fs, Path genericFile ) throws IOException
    {
        try ( StoreChannel write = fs.write( genericFile ) )
        {
            int size = 100;
            byte[] bytes = new byte[size];
            Arrays.fill( bytes, (byte) 9 );
            ByteBuffer byteBuffer = ByteBuffers.allocate( size, INSTANCE );
            byteBuffer.put( bytes );
            write.writeAll( byteBuffer );
        }
        assertTrue( fs.fileExists( genericFile ) );
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
