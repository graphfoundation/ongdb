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
package org.neo4j.kernel.impl.store;

import java.nio.file.Path;

import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.internal.id.IdGeneratorFactory;
import org.neo4j.internal.recordstorage.RecordCursorTypes;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.cursor.CursorType;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.storageengine.api.cursor.StoreCursorsAdapter;

import static org.eclipse.collections.api.factory.Sets.immutable;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.REL_TYPE_TOKEN_CURSOR;

class RelationshipTypeTokenStoreTest extends TokenStoreTestTemplate<RelationshipTypeTokenRecord>
{
    @Override
    protected PageCursor storeCursor()
    {
        return storeCursors.readCursor( REL_TYPE_TOKEN_CURSOR );
    }

    @Override
    protected StoreCursors createCursors( TokenStore<RelationshipTypeTokenRecord> store, DynamicStringStore nameStore )
    {
        return new RelTypeTokenStoreCursors( store, nameStore );
    }

    @Override
    protected TokenStore<RelationshipTypeTokenRecord> instantiateStore( Path file, Path idFile, IdGeneratorFactory generatorFactory, PageCache pageCache,
            LogProvider logProvider, DynamicStringStore nameStore, RecordFormats formats, Config config )
    {
        return new RelationshipTypeTokenStore( file, idFile, config, generatorFactory, pageCache, logProvider, nameStore, formats,
                DatabaseReadOnlyChecker.writable(), DEFAULT_DATABASE_NAME, immutable.empty() );
    }

    private static class RelTypeTokenStoreCursors extends StoreCursorsAdapter
    {
        private final TokenStore<?> store;
        private final DynamicStringStore nameStore;
        private PageCursor storeCursor;
        private PageCursor dynamicCursor;

        RelTypeTokenStoreCursors( TokenStore<?> store, DynamicStringStore nameStore )
        {
            this.store = store;
            this.nameStore = nameStore;
        }

        @Override
        public PageCursor readCursor( CursorType type )
        {
            switch ( (RecordCursorTypes) type )
            {
            case REL_TYPE_TOKEN_CURSOR:
                if ( storeCursor == null )
                {
                    storeCursor = store.openPageCursorForReading( 0, CursorContext.NULL );
                }
                return storeCursor;
            case DYNAMIC_REL_TYPE_TOKEN_CURSOR:
                if ( dynamicCursor == null )
                {
                    dynamicCursor = nameStore.openPageCursorForReading( 0, CursorContext.NULL );
                }
                return dynamicCursor;
            default:
                return super.readCursor( type );
            }
        }

        @Override
        public PageCursor writeCursor( CursorType type )
        {
            switch ( (RecordCursorTypes) type )
            {
            case REL_TYPE_TOKEN_CURSOR:
                return store.openPageCursorForWriting( 0, CursorContext.NULL );
            case DYNAMIC_REL_TYPE_TOKEN_CURSOR:
                return nameStore.openPageCursorForWriting( 0, CursorContext.NULL );
            default:
                return super.writeCursor( type );
            }
        }

        @Override
        public void close()
        {
            if ( dynamicCursor != null )
            {
                dynamicCursor.close();
                dynamicCursor = null;
            }
            if ( storeCursor != null )
            {
                storeCursor.close();
                storeCursor = null;
            }
            super.close();
        }
    }
}
