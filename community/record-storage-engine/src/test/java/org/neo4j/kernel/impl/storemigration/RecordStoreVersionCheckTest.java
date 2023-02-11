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

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;

import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.io.pagecache.tracing.cursor.PageCursorTracer;
import org.neo4j.kernel.impl.store.MetaDataStore;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.storageengine.api.StoreVersionCheck;
import org.neo4j.storageengine.api.StoreVersionCheck.Outcome;
import org.neo4j.string.UTF8;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;

@PageCacheExtension
@Neo4jLayoutExtension
class RecordStoreVersionCheckTest
{
    @Inject
    protected TestDirectory testDirectory;
    @Inject
    protected FileSystemAbstraction fileSystem;
    @Inject
    protected PageCache pageCache;
    @Inject
    private RecordDatabaseLayout databaseLayout;

    @Test
    void shouldFailIfFileDoesNotExist()
    {
        // given
        RecordStoreVersionCheck storeVersionCheck = newStoreVersionCheck();

        // when
        StoreVersionCheck.Result result = storeVersionCheck.checkUpgrade( "version", NULL );

        // then
        assertFalse( result.outcome.isSuccessful() );
        assertEquals( Outcome.missingStoreFile, result.outcome );
        assertNull( result.actualVersion );
    }

    @Test
    void tracePageCacheAccessOnCheckUpgradable() throws IOException
    {
        Path neoStore = emptyFile( fileSystem );
        String storeVersion = "V1";
        long v1 = MetaDataStore.versionStringToLong( storeVersion );
        MetaDataStore.setRecord( pageCache, neoStore, MetaDataStore.Position.STORE_VERSION, v1, databaseLayout.getDatabaseName(), NULL );
        RecordStoreVersionCheck storeVersionCheck = newStoreVersionCheck();
        var pageCacheTracer = new DefaultPageCacheTracer();
        var cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( "tracePageCacheAccessOnCheckUpgradable" ) );

        StoreVersionCheck.Result result = storeVersionCheck.checkUpgrade( storeVersion, cursorContext );

        assertTrue( result.outcome.isSuccessful() );
        PageCursorTracer cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.pins() ).isOne();
        assertThat( cursorTracer.unpins() ).isOne();
        assertThat( cursorTracer.faults() ).isOne();
    }

    @Test
    void tracePageCacheAccessOnConstruction() throws IOException
    {
        var pageCacheTracer = new DefaultPageCacheTracer();
        Path neoStore = emptyFile( fileSystem );
        String storeVersion = "V1";
        long v1 = MetaDataStore.versionStringToLong( storeVersion );
        MetaDataStore.setRecord( pageCache, neoStore, MetaDataStore.Position.STORE_VERSION, v1, databaseLayout.getDatabaseName(), NULL );

        assertNotNull( newStoreVersionCheck( pageCacheTracer ) );
        assertThat( pageCacheTracer.pins() ).isOne();
        assertThat( pageCacheTracer.unpins() ).isOne();
        assertThat( pageCacheTracer.faults() ).isOne();
    }

    @Test
    void tracePageCacheAccessOnStoreVersionAccessConstruction() throws IOException
    {
        var pageCacheTracer = new DefaultPageCacheTracer();
        var cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( "tracePageCacheAccessOnStoreVersionAccessConstruction" ) );

        Path neoStore = emptyFile( fileSystem );
        String storeVersion = "V1";
        long v1 = MetaDataStore.versionStringToLong( storeVersion );
        MetaDataStore.setRecord( pageCache, neoStore, MetaDataStore.Position.STORE_VERSION, v1, databaseLayout.getDatabaseName(), NULL );

        var versionCheck = newStoreVersionCheck();
        assertEquals( storeVersion, versionCheck.storeVersion( cursorContext ).get() );

        PageCursorTracer cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.pins() ).isOne();
        assertThat( cursorTracer.unpins() ).isOne();
        assertThat( cursorTracer.faults() ).isOne();
    }

    @Test
    void shouldReportShortFileDoesNotHaveSpecifiedVersion() throws IOException
    {
        // given
        metaDataFileContaining( databaseLayout, fileSystem, "nothing interesting" );
        RecordStoreVersionCheck storeVersionCheck = newStoreVersionCheck();

        // when
        StoreVersionCheck.Result result = storeVersionCheck.checkUpgrade( "version", NULL );

        // then
        assertFalse( result.outcome.isSuccessful() );
        assertEquals( Outcome.storeVersionNotFound, result.outcome );
        assertNull( result.actualVersion );
    }

    @Test
    void shouldReportFileWithIncorrectVersion() throws IOException
    {
        // given
        Path neoStore = emptyFile( fileSystem );
        long v1 = MetaDataStore.versionStringToLong( "V1" );
        MetaDataStore.setRecord( pageCache, neoStore, MetaDataStore.Position.STORE_VERSION, v1, databaseLayout.getDatabaseName(), NULL );
        RecordStoreVersionCheck storeVersionCheck = newStoreVersionCheck();

        // when
        StoreVersionCheck.Result result = storeVersionCheck.checkUpgrade( "V2", NULL );

        // then
        assertFalse( result.outcome.isSuccessful() );
        assertEquals( Outcome.unexpectedStoreVersion, result.outcome );
        assertEquals( "V1", result.actualVersion );
    }

    @Test
    void shouldReportFileWithCorrectVersion() throws IOException
    {
        // given
        Path neoStore = emptyFile( fileSystem );
        String storeVersion = "V1";
        long v1 = MetaDataStore.versionStringToLong( storeVersion );
        MetaDataStore.setRecord( pageCache, neoStore, MetaDataStore.Position.STORE_VERSION, v1, databaseLayout.getDatabaseName(), NULL );
        RecordStoreVersionCheck storeVersionCheck = newStoreVersionCheck();

        // when
        StoreVersionCheck.Result result = storeVersionCheck.checkUpgrade( storeVersion, NULL );

        // then
        assertTrue( result.outcome.isSuccessful() );
        assertEquals( Outcome.ok, result.outcome );
        assertEquals( storeVersion, result.actualVersion );
    }

    private Path emptyFile( FileSystemAbstraction fs ) throws IOException
    {
        Path shortFile = databaseLayout.metadataStore();
        fs.deleteFile( shortFile );
        fs.write( shortFile ).close();
        return shortFile;
    }

    private static void metaDataFileContaining( RecordDatabaseLayout layout, FileSystemAbstraction fs, String content ) throws IOException
    {
        Path shortFile = layout.metadataStore();
        fs.deleteFile( shortFile );
        try ( OutputStream outputStream = fs.openAsOutputStream( shortFile, false ) )
        {
            outputStream.write( UTF8.encode( content ) );
        }
    }

    private RecordStoreVersionCheck newStoreVersionCheck()
    {
        return newStoreVersionCheck( PageCacheTracer.NULL );
    }

    private RecordStoreVersionCheck newStoreVersionCheck( PageCacheTracer pageCacheTracer )
    {
        return new RecordStoreVersionCheck( fileSystem, pageCache, databaseLayout, NullLogProvider.getInstance(), Config.defaults(), pageCacheTracer );
    }
}
