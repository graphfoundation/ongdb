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
package org.neo4j.kernel.impl.newapi;

import org.eclipse.collections.api.list.primitive.LongList;
import org.eclipse.collections.api.list.primitive.MutableLongList;
import org.eclipse.collections.api.set.primitive.MutableLongSet;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.primitive.LongSets;
import org.eclipse.collections.impl.list.mutable.primitive.LongArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.ToLongFunction;

import org.neo4j.internal.kernel.api.Cursor;
import org.neo4j.internal.kernel.api.Scan;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.WorkerContext;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertTrue;

final class TestUtils
{
    private TestUtils()
    {
        throw new UnsupportedOperationException( "do not instantiate" );
    }

    static void assertDistinct( LongList... lists )
    {
        assertDistinct( Arrays.asList( lists ) );
    }

    static void assertDistinct( List<LongList> lists )
    {
        MutableLongSet seen = LongSets.mutable.empty();
        for ( LongList list : lists )
        {
            list.forEach( item -> assertTrue( seen.add( item ), format( "%s was seen multiple times", item ) ) );
        }
    }

    static LongList concat( LongList... lists )
    {
        return concat( Arrays.asList( lists ) );
    }

    static LongList concat( List<LongList> lists )
    {
        MutableLongList concat = LongLists.mutable.empty();
        lists.forEach( concat::addAll );
        return concat;
    }

    static <T extends Cursor> List<WorkerContext<T>> createContexts( KernelTransaction tx, Function<CursorContext,T> cursorFactory,
            int numberOfWorkers )
    {
        List<WorkerContext<T>> workers = new ArrayList<>( numberOfWorkers );
        for ( int i = 0; i < numberOfWorkers; i++ )
        {
            var executionContext = tx.createExecutionContext();
            WorkerContext<T> workerContext = new WorkerContext<>( cursorFactory.apply( executionContext.cursorContext() ), executionContext, tx );
            workers.add( workerContext );
        }
        return workers;
    }

    static <T extends Cursor> Callable<LongList> singleBatchWorker( Scan<T> scan, WorkerContext<T> workerContext, ToLongFunction<T> producer, int sizeHint )
    {
        return () ->
        {
            try
            {
                LongArrayList batch = new LongArrayList();
                T cursor = workerContext.getCursor();
                var executionContext = workerContext.getContext();
                scan.reserveBatch( cursor, sizeHint, executionContext.cursorContext(), executionContext.accessMode() );
                while ( cursor.next() )
                {
                    batch.add( producer.applyAsLong( cursor ) );
                }
                return batch;
            }
            finally
            {
                workerContext.complete();
            }
        };
    }

    static  <T extends Cursor> List<Callable<LongList>> createWorkers( int sizeHint, Scan<T> scan, int numberOfWorkers, List<WorkerContext<T>> workerContexts,
            ToLongFunction<T> toLongFunction )
    {
        ArrayList<Callable<LongList>> workers = new ArrayList<>( workerContexts.size() );
        for ( int i = 0; i < numberOfWorkers; i++ )
        {
            workers.add( singleBatchWorker( scan, workerContexts.get( i ), toLongFunction, sizeHint ) );
        }
        return workers;
    }

    static <T extends Cursor> List<Callable<LongList>> createRandomWorkers( Scan<T> scan, int numberOfWorkers, List<WorkerContext<T>> workerContexts,
            ToLongFunction<T> toLongFunction )
    {
        ArrayList<Callable<LongList>> workers = new ArrayList<>( workerContexts.size() );
        for ( int i = 0; i < numberOfWorkers; i++ )
        {
            workers.add( randomBatchWorker( scan, workerContexts.get( i ), toLongFunction ) );
        }
        return workers;
    }

    static <T extends Cursor> Callable<LongList> randomBatchWorker( Scan<T> scan, WorkerContext<T> workerContext, ToLongFunction<T> producer )
    {
        return () -> {
            try
            {
                ThreadLocalRandom random = ThreadLocalRandom.current();
                T cursor = workerContext.getCursor();
                int sizeHint = random.nextInt( 1, 5 );
                LongArrayList batch = new LongArrayList();
                var executionContext = workerContext.getContext();
                while ( scan.reserveBatch( cursor, sizeHint, executionContext.cursorContext(), executionContext.accessMode() ) )
                {
                    while ( cursor.next() )
                    {
                        batch.add( producer.applyAsLong( cursor ) );
                    }
                }
                return batch;
            }
            finally
            {
                workerContext.complete();
            }
        };
    }

    static <T extends AutoCloseable> void closeWorkContexts( List<WorkerContext<T>> workers )
    {
        for ( WorkerContext<T> worker : workers )
        {
            worker.close();
        }
    }

    static int count( Cursor cursor )
    {
        int count = 0;
        while ( cursor.next() )
        {
            count++;
        }
        return count;
    }
}
