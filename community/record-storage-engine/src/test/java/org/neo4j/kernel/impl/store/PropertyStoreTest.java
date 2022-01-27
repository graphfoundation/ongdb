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
package org.neo4j.kernel.impl.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.configuration.Config;
import org.neo4j.internal.id.DefaultIdGeneratorFactory;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.impl.store.format.RecordFormatSelector;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.PropertyBlock;
import org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.test.extension.EphemeralNeo4jLayoutExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.PageCacheSupportExtension;

import static org.eclipse.collections.api.factory.Sets.immutable;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.store.record.RecordLoad.FORCE;
import static org.neo4j.test.utils.PageCacheConfig.config;

@EphemeralNeo4jLayoutExtension
class PropertyStoreTest
{
    @RegisterExtension
    static PageCacheSupportExtension pageCacheExtension = new PageCacheSupportExtension( config().withInconsistentReads( false ) );
    @Inject
    private EphemeralFileSystemAbstraction fs;
    @Inject
    private RecordDatabaseLayout databaseLayout;

    private Path storeFile;
    private Path idFile;

    @BeforeEach
    void setup()
    {
        storeFile = databaseLayout.propertyStore();
        idFile = databaseLayout.idPropertyStore();
    }

    @Test
    void shouldWriteOutTheDynamicChainBeforeUpdatingThePropertyRecord() throws IOException
    {
        // given
        try ( PageCache pageCache = pageCacheExtension.getPageCache( fs ) )
        {
            Config config = Config.defaults();

            DynamicStringStore stringPropertyStore = mock( DynamicStringStore.class );

            try ( var store = new PropertyStore( storeFile, idFile, config, new DefaultIdGeneratorFactory( fs, immediate(), databaseLayout.getDatabaseName() ),
                    pageCache, NullLogProvider.getInstance(), stringPropertyStore, mock( PropertyKeyTokenStore.class ), mock( DynamicArrayStore.class ),
                    RecordFormatSelector.defaultFormat(), writable(), databaseLayout.getDatabaseName(), immutable.empty() ) )
            {
                store.initialise( true, NULL );
                store.start( NULL );
                final long propertyRecordId = store.nextId( NULL );

                PropertyRecord record = new PropertyRecord( propertyRecordId );
                record.setInUse( true );

                DynamicRecord dynamicRecord = dynamicRecord();
                PropertyBlock propertyBlock = propertyBlockWith( dynamicRecord );
                record.setPropertyBlock( propertyBlock );

                doAnswer( invocation ->
                {
                    try ( var cursor = store.openPageCursorForReading( propertyRecordId, NULL ) )
                    {
                        PropertyRecord recordBeforeWrite = store.getRecordByCursor( propertyRecordId, store.newRecord(), FORCE, cursor );
                        assertFalse( recordBeforeWrite.inUse() );
                        return null;
                    }
                } ).when( stringPropertyStore ).updateRecord( eq( dynamicRecord ), any(), any(), any() );

                // when
                try ( var storeCursor = store.openPageCursorForWriting( 0, NULL ) )
                {
                    store.updateRecord( record, storeCursor, NULL, StoreCursors.NULL );
                }

                // then verify that our mocked method above, with the assert, was actually called
                verify( stringPropertyStore ).updateRecord( eq( dynamicRecord ), any(), any(), any(), any() );
            }
        }
    }

    private static DynamicRecord dynamicRecord()
    {
        DynamicRecord dynamicRecord = new DynamicRecord( 42 );
        dynamicRecord.setType( PropertyType.STRING.intValue() );
        dynamicRecord.setCreated();
        return dynamicRecord;
    }

    private static PropertyBlock propertyBlockWith( DynamicRecord dynamicRecord )
    {
        PropertyBlock propertyBlock = new PropertyBlock();

        PropertyKeyTokenRecord key = new PropertyKeyTokenRecord( 10 );
        propertyBlock.setSingleBlock( key.getId() | (((long) PropertyType.STRING.intValue()) << 24) | (dynamicRecord
                .getId() << 28) );
        propertyBlock.addValueRecord( dynamicRecord );

        return propertyBlock;
    }
}
