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
package org.neo4j.internal.batchimport.cache;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.util.function.BiFunction;

import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.test.Race;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.utils.TestDirectory;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.DELETE_ON_CLOSE;
import static org.eclipse.collections.impl.factory.Sets.immutable;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;

@PageCacheExtension
@ExtendWith( RandomExtension.class )
public abstract class PageCacheNumberArrayConcurrencyTest
{
    @Inject
    private TestDirectory testDirectory;
    @Inject
    private PageCache pageCache;
    @Inject
    protected RandomSupport random;
    protected static final int COUNT = 100;
    static final int LAPS = 2_000;
    static final int CONTESTANTS = 10;

    @Test
    void shouldHandleConcurrentAccessToSameData() throws Throwable
    {
        doRace( this::wholeFileRacer );
    }

    @Test
    void shouldHandleConcurrentAccessToDifferentData() throws Throwable
    {
        doRace( this::fileRangeRacer );
    }

    private void doRace( BiFunction<NumberArray,Integer,Runnable> contestantCreator ) throws Throwable
    {
        PagedFile file = pageCache.map( testDirectory.file( "file" ), pageCache.pageSize(), DEFAULT_DATABASE_NAME, immutable.of( CREATE, DELETE_ON_CLOSE ) );
        Race race = new Race();
        try ( NumberArray array = getNumberArray( file ) )
        {
            for ( int i = 0; i < CONTESTANTS; i++ )
            {
                race.addContestant( contestantCreator.apply( array, i ) );
            }
            race.go();

        }
    }

    protected abstract Runnable fileRangeRacer( NumberArray array, int contestant );

    protected abstract NumberArray getNumberArray( PagedFile file ) throws IOException;

    protected abstract Runnable wholeFileRacer( NumberArray array, int contestant );

}
