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

import java.io.IOException;

import org.neo4j.common.ProgressReporter;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.helpers.ArrayUtil;
import org.neo4j.internal.id.DefaultIdGeneratorFactory;
import org.neo4j.internal.id.ScanOnOpenReadOnlyIdGeneratorFactory;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.RecordStore;
import org.neo4j.kernel.impl.store.StoreFactory;
import org.neo4j.kernel.impl.store.StoreType;
import org.neo4j.kernel.impl.store.cursor.CachedStoreCursors;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.record.AbstractBaseRecord;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.eclipse.collections.impl.factory.Sets.immutable;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.readOnly;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.internal.helpers.ArrayUtil.contains;

/**
 * Idea is to migrate a {@link NeoStores} store by store, record by record in a sequential fashion for
 * quick migration from one {@link RecordFormats} to another.
 */
class DirectRecordStoreMigrator
{
    private static final String DIRECT_STORE_MIGRATOR_TAG = "directStoreMigrator";
    private final PageCache pageCache;
    private final FileSystemAbstraction fs;
    private final Config config;
    private final PageCacheTracer cacheTracer;

    DirectRecordStoreMigrator( PageCache pageCache, FileSystemAbstraction fs, Config config, PageCacheTracer cacheTracer )
    {
        this.pageCache = pageCache;
        this.fs = fs;
        this.config = config;
        this.cacheTracer = cacheTracer;
    }

    public void migrate( RecordDatabaseLayout fromDirectoryStructure, RecordFormats fromFormat, RecordDatabaseLayout toDirectoryStructure,
            RecordFormats toFormat, ProgressReporter progressReporter, StoreType[] types, StoreType... additionalTypesToOpen ) throws IOException
    {
        StoreType[] storesToOpen = ArrayUtil.concat( types, additionalTypesToOpen );
        progressReporter.start( storesToOpen.length );

        try (
                NeoStores fromStores = new StoreFactory( fromDirectoryStructure, config, new ScanOnOpenReadOnlyIdGeneratorFactory(),
                    pageCache, fs, fromFormat, NullLogProvider.getInstance(), cacheTracer, readOnly(), immutable.empty() )
                        .openNeoStores( true, storesToOpen );
                NeoStores toStores = new StoreFactory( toDirectoryStructure, withPersistedStoreHeadersAsConfigFrom( fromStores, storesToOpen ),
                        new DefaultIdGeneratorFactory( fs, immediate(), toDirectoryStructure.getDatabaseName() ), pageCache, fs, toFormat,
                        NullLogProvider.getInstance(), cacheTracer, writable(), immutable.empty() )
                        .openNeoStores( true, storesToOpen );
                var cursorContext = new CursorContext( cacheTracer.createPageCursorTracer( DIRECT_STORE_MIGRATOR_TAG ) );
                var toStoreCursors = new CachedStoreCursors( toStores, cursorContext ) )
        {
            toStores.start( cursorContext );
            for ( StoreType type : types )
            {
                // This condition will exclude counts store first and foremost.
                migrate( fromStores.getRecordStore( type ), toStores.getRecordStore( type ), cursorContext, toStoreCursors );
                progressReporter.progress( 1 );
            }
        }
    }

    private static <RECORD extends AbstractBaseRecord> void migrate( RecordStore<RECORD> from, RecordStore<RECORD> to, CursorContext cursorContext,
            StoreCursors toStoreCursors )
    {
        to.setHighestPossibleIdInUse( from.getHighestPossibleIdInUse( cursorContext ) );
        try ( var toCursor = to.openPageCursorForWriting( 0, cursorContext );
              var fromCursor = from.openPageCursorForReading( 0, cursorContext ) )
        {
            from.scanAllRecords( record ->
            {
                to.prepareForCommit( record, cursorContext );
                to.updateRecord( record, toCursor, cursorContext, toStoreCursors );
                return false;
            }, fromCursor );
        }
    }

    /**
     * Creates a configuration to include dynamic record store sizes where data size in old a new format
     * will be the same. This is important because we're doing a record-to-record migration and so
     * data which fits into one record must fit into the other as to not needing additional blocks
     * in the dynamic record chain.
     *
     * @param legacyStores {@link NeoStores} to read dynamic record data sizes from.
     * @param types array of {@link StoreType} which we know that legacy stores have opened.
     * @return a {@link Config} which mimics dynamic record data sizes from the {@code legacyStores}.
     */
    private Config withPersistedStoreHeadersAsConfigFrom( NeoStores legacyStores, StoreType[] types )
    {
        if ( contains( types, StoreType.RELATIONSHIP_GROUP ) )
        {
            config.set( GraphDatabaseSettings.dense_node_threshold, legacyStores.getRelationshipGroupStore().getStoreHeaderInt() );
        }
        if ( contains( types, StoreType.PROPERTY ) )
        {
            config.set( GraphDatabaseInternalSettings.array_block_size, legacyStores.getPropertyStore().getArrayStore().getRecordDataSize() );
            config.set( GraphDatabaseInternalSettings.string_block_size, legacyStores.getPropertyStore().getStringStore().getRecordDataSize() );
        }
        if ( contains( types, StoreType.NODE_LABEL ) )
        {
            config.set( GraphDatabaseInternalSettings.label_block_size, legacyStores.getNodeStore().getDynamicLabelStore().getRecordDataSize() );
        }
        return config;
    }
}
