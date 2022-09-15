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
package org.neo4j.kernel.impl.storemigration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

import org.neo4j.configuration.Config;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.impl.store.MetaDataStore;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.format.StoreVersion;
import org.neo4j.kernel.impl.store.format.aligned.PageAligned;
import org.neo4j.kernel.impl.store.format.aligned.PageAlignedV4_1;
import org.neo4j.kernel.impl.store.format.standard.Standard;
import org.neo4j.kernel.impl.store.format.standard.StandardV3_4;
import org.neo4j.kernel.impl.store.format.standard.StandardV4_0;
import org.neo4j.storageengine.api.StoreVersionCheck;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.store.MetaDataStore.Position.STORE_VERSION;
import static org.neo4j.kernel.impl.storemigration.MigrationTestUtils.changeVersionNumber;

@PageCacheExtension
@Neo4jLayoutExtension
class RecordStoreVersionTest
{
    @Inject
    private TestDirectory testDirectory;
    @Inject
    private RecordDatabaseLayout databaseLayout;
    @Inject
    private PageCache pageCache;

    @Test
    void shouldFindLatestOfFormats()
    {
        assertVersionFindsLatest( StandardV4_0.RECORD_FORMATS, Standard.LATEST_RECORD_FORMATS );
        assertVersionFindsLatest( StandardV3_4.RECORD_FORMATS, Standard.LATEST_RECORD_FORMATS );
        assertVersionFindsLatest( PageAlignedV4_1.RECORD_FORMATS, PageAligned.LATEST_RECORD_FORMATS );
        assertVersionFindsLatest( PageAligned.LATEST_RECORD_FORMATS, PageAligned.LATEST_RECORD_FORMATS );
        assertVersionFindsLatest( Standard.LATEST_RECORD_FORMATS, Standard.LATEST_RECORD_FORMATS );
    }

    private static void assertVersionFindsLatest( RecordFormats format, RecordFormats latest )
    {
        assertThat( new RecordStoreVersion( format ).latestStoreVersion() ).isEqualTo( latest.storeVersion() );
    }

    @Nested
    class SupportedVersions
    {
        @BeforeEach
        void setup() throws IOException
        {
            MigrationTestUtils.findFormatStoreDirectoryForVersion( StandardV3_4.STORE_VERSION, databaseLayout.databaseDirectory() );
        }

        boolean storeFilesUpgradable( RecordStoreVersionCheck check )
        {
            return check.checkUpgrade( check.configuredVersion(), NULL ).outcome.isSuccessful();
        }

        @Test
        void shouldAcceptTheStoresInTheSampleDatabaseAsBeingEligibleForUpgrade()
        {
            // given
            final RecordStoreVersionCheck check = getVersionCheck();

            // when
            final boolean result = storeFilesUpgradable( check );

            // then
            assertTrue( result );
        }

        @Test
        void shouldDetectOldVersionAsDifferentFromCurrent()
        {
            // given
            final RecordStoreVersionCheck check = getVersionCheck();
            // when
            Optional<String> version = check.storeVersion( NULL );
            assertTrue( version.isPresent() );
            boolean currentVersion = version.get().equalsIgnoreCase( check.configuredVersion() );

            // then
            assertFalse( currentVersion );
        }

        private RecordStoreVersionCheck getVersionCheck()
        {
            return new RecordStoreVersionCheck( pageCache, databaseLayout, Standard.LATEST_RECORD_FORMATS, Config.defaults() );
        }
    }

    private static Stream<Arguments> unsupportedVersions()
    {
        return Stream.of( Arguments.of( "v0.A.4" ), Arguments.of( StoreVersion.HIGH_LIMIT_V3_4_0.versionString() ) );
    }

    private void setupUnsupported( String version ) throws IOException
    {
        // doesn't matter which version we pick we are changing it to the wrong one...
        MigrationTestUtils.findFormatStoreDirectoryForVersion( StandardV3_4.STORE_VERSION, databaseLayout.databaseDirectory() );
        changeVersionNumber( testDirectory.getFileSystem(), databaseLayout.metadataStore(), version );
        Path metadataStore = databaseLayout.metadataStore();
        MetaDataStore.setRecord( pageCache, metadataStore, STORE_VERSION, MetaDataStore.versionStringToLong( version ), databaseLayout.getDatabaseName(),
                NULL );
    }

    @ParameterizedTest
    @MethodSource( "unsupportedVersions" )
    void shouldDetectOldVersionAsDifferentFromCurrent( String version ) throws Exception
        {
            setupUnsupported( version );
            // given
            final RecordStoreVersionCheck check = getVersionCheck();

            // when
            Optional<String> storeVersion = check.storeVersion( NULL );
            assertTrue( storeVersion.isPresent() );
            boolean currentVersion = storeVersion.get().equals( check.configuredVersion() );

            // then
            assertFalse( currentVersion );
        }

    @ParameterizedTest
    @MethodSource( "unsupportedVersions" )
    void shouldCommunicateWhatCausesInabilityToUpgrade( String version ) throws Exception
    {
        setupUnsupported( version );

        // given
        final RecordStoreVersionCheck check = getVersionCheck();

        // when
        StoreVersionCheck.Result result = check.checkUpgrade( check.configuredVersion(), NULL );
        assertFalse( result.outcome.isSuccessful() );
        assertSame( StoreVersionCheck.Outcome.unexpectedStoreVersion, result.outcome );
    }

    private RecordStoreVersionCheck getVersionCheck()
    {
        return new RecordStoreVersionCheck( pageCache, databaseLayout, Standard.LATEST_RECORD_FORMATS, Config.defaults() );
    }
}

