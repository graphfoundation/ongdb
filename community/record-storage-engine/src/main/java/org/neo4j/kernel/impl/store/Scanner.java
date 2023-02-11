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

import org.eclipse.collections.api.iterator.LongIterator;

import java.util.function.Predicate;

import org.neo4j.graphdb.ResourceIterable;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.internal.helpers.collection.PrefetchingResourceIterator;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.record.AbstractBaseRecord;
import org.neo4j.kernel.impl.store.record.RecordLoad;

/**
 * Scans all used records in a store, returned {@link ResourceIterable} must be properly used such that
 * its {@link ResourceIterable#iterator() resource iterators} are {@link ResourceIterator#close() closed}
 * after use.
 */
public class Scanner
{
    private static final String RECORD_STORE_SCANNER_TAG = "recordStoreScanner";

    private Scanner()
    {
    }

    @SafeVarargs
    public static <R extends AbstractBaseRecord> ResourceIterable<R> scan( final RecordStore<R> store, PageCacheTracer pageCacheTracer,
            final Predicate<? super R>... filters )
    {
        return scan( store, true, pageCacheTracer, filters );
    }

    @SafeVarargs
    public static <R extends AbstractBaseRecord> ResourceIterable<R> scan( final RecordStore<R> store,
            final boolean forward, PageCacheTracer pageCacheTracer, final Predicate<? super R>... filters )
    {
        return () -> new Scan<>( store, forward, pageCacheTracer, filters );
    }

    private static class Scan<R extends AbstractBaseRecord> extends PrefetchingResourceIterator<R>
    {
        private final LongIterator ids;
        private final RecordStore<R> store;
        private final PageCursor cursor;
        private final R record;
        private final Predicate<? super R>[] filters;
        private final CursorContext cursorContext;

        @SafeVarargs
        Scan( RecordStore<R> store, boolean forward, PageCacheTracer pageCacheTracer, final Predicate<? super R>... filters )
        {
            this.filters = filters;
            this.cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( RECORD_STORE_SCANNER_TAG ) );
            this.ids = new StoreIdIterator( store, forward, cursorContext );
            this.store = store;
            this.cursor = store.openPageCursorForReading( 0, cursorContext );
            this.record = store.newRecord();
        }

        @Override
        protected R fetchNextOrNull()
        {
            while ( ids.hasNext() )
            {
                // Use RecordLoad.FORCE because this code path is only used by the consistency checker.
                store.getRecordByCursor( ids.next(), record, RecordLoad.FORCE, cursor );
                if ( record.inUse() )
                {
                    if ( passesFilters( record ) )
                    {
                        return record;
                    }
                }
            }
            return null;
        }

        private boolean passesFilters( R record )
        {
            for ( Predicate<? super R> filter : filters )
            {
                if ( !filter.test( record ) )
                {
                    return false;
                }
            }
            return true;
        }

        @Override
        public void close()
        {
            cursor.close();
            cursorContext.close();
        }
    }
}
