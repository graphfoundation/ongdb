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
package org.neo4j.internal.id;

import org.eclipse.collections.api.set.ImmutableSet;

import java.io.IOException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.LongSupplier;

import org.neo4j.annotations.documented.ReporterFactory;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;

import static java.util.Collections.emptyList;

public class EmptyIdGeneratorFactory implements IdGeneratorFactory
{
    public static final IdGeneratorFactory EMPTY_ID_GENERATOR_FACTORY = new EmptyIdGeneratorFactory();

    private EmptyIdGeneratorFactory()
    {
    }

    @Override
    public IdGenerator open( PageCache pageCache, Path filename, IdType idType, LongSupplier highIdScanner, long maxId, DatabaseReadOnlyChecker readOnlyChecker,
            Config config, CursorContext cursorContext, ImmutableSet<OpenOption> openOptions, IdSlotDistribution slotDistribution ) throws IOException
    {
        return EmptyIdGenerator.EMPTY_ID_GENERATOR;
    }

    @Override
    public IdGenerator create( PageCache pageCache, Path filename, IdType idType, long highId, boolean throwIfFileExists, long maxId,
            DatabaseReadOnlyChecker readOnlyChecker, Config config, CursorContext cursorContext, ImmutableSet<OpenOption> openOptions,
            IdSlotDistribution slotDistribution ) throws IOException
    {
        return EmptyIdGenerator.EMPTY_ID_GENERATOR;
    }

    @Override
    public IdGenerator get( IdType idType )
    {
        return EmptyIdGenerator.EMPTY_ID_GENERATOR;
    }

    @Override
    public void visit( Consumer<IdGenerator> visitor )
    {
        // nothing
    }

    @Override
    public void clearCache( CursorContext cursorContext )
    {
        // nothing
    }

    @Override
    public Collection<Path> listIdFiles()
    {
        return emptyList();
    }

    private static class EmptyIdGenerator implements IdGenerator
    {
        private static final EmptyIdGenerator EMPTY_ID_GENERATOR = new EmptyIdGenerator();
        private static final int EMPTY_ID = -1;

        private EmptyIdGenerator()
        {
        }

        @Override
        public void setHighId( long id )
        {
            // nothing
        }

        @Override
        public void markHighestWrittenAtHighId()
        {
            // nothing
        }

        @Override
        public long getHighestWritten()
        {
            return EMPTY_ID;
        }

        @Override
        public long getHighId()
        {
            return EMPTY_ID;
        }

        @Override
        public long getHighestPossibleIdInUse()
        {
            return EMPTY_ID;
        }

        @Override
        public Marker marker( CursorContext cursorContext )
        {
            return NOOP_MARKER;
        }

        @Override
        public void close()
        {
            // nothing
        }

        @Override
        public long getNumberOfIdsInUse()
        {
            return -1;
        }

        @Override
        public long getDefragCount()
        {
            return -1;
        }

        @Override
        public void checkpoint( CursorContext cursorContext )
        {
            // nothing
        }

        @Override
        public void maintenance( CursorContext cursorContext )
        {
            // nothing
        }

        @Override
        public void start( FreeIds freeIdsForRebuild, CursorContext cursorContext ) throws IOException
        {
            // nothing
        }

        @Override
        public void clearCache( CursorContext cursorContext )
        {
            // nothing
        }

        @Override
        public long nextId( CursorContext cursorContext )
        {
            return EMPTY_ID;
        }

        @Override
        public long nextConsecutiveIdRange( int numberOfIds, boolean favorSamePage, CursorContext cursorContext )
        {
            return EMPTY_ID;
        }

        @Override
        public boolean consistencyCheck( ReporterFactory reporterFactory, CursorContext cursorContext )
        {
            return true;
        }
    }
}
