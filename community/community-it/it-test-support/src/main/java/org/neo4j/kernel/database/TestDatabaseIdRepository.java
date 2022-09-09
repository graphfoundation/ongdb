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
package org.neo4j.kernel.database;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.util.Preconditions;

import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;

public final class TestDatabaseIdRepository
{
    private TestDatabaseIdRepository()
    { //no-op
    }

    /**
     * @return a DatabaseId with a random name and UUID. It is not stored, so subsequent calls will return different DatabaseIds.
     */
    public static NamedDatabaseId randomNamedDatabaseId()
    {
        return new NamedDatabaseId( RandomStringUtils.randomAlphabetic( 20 ), UUID.randomUUID() );
    }

    public static DatabaseId randomDatabaseId()
    {
        return new DatabaseId( UUID.randomUUID() );
    }

    public static class Caching extends MapCachingDatabaseIdRepository
    {
        private final String defaultDatabaseName;
        private final Set<String> filterSet;

        public Caching()
        {
            this( DEFAULT_DATABASE_NAME );
        }

        public Caching( Config config )
        {
            this( config.get( GraphDatabaseSettings.default_database ) );
        }

        public Caching( String defaultDbName )
        {
            super( new Random() );
            filterSet = new CopyOnWriteArraySet<>();
            this.defaultDatabaseName = defaultDbName;
        }

        public NamedDatabaseId defaultDatabase()
        {
            return getRaw( defaultDatabaseName );
        }

        public NamedDatabaseId getRaw( String databaseName )
        {
            var databaseIdOpt = getByName( databaseName );
            Preconditions.checkState( databaseIdOpt.isPresent(),
                    getClass().getSimpleName() + " should always produce a " + NamedDatabaseId.class.getSimpleName() + " for any database name" );
            return databaseIdOpt.get();
        }

        /**
         * Add a database to appear "not found" by the id repository
         */
        public void filter( String databaseName )
        {
            filterSet.add( databaseName );
        }

        @Override
        public Optional<NamedDatabaseId> getByName( NormalizedDatabaseName databaseName )
        {
            var id = super.getByName( databaseName );
            var nameIsFiltered = id.map( NamedDatabaseId::name ).map( filterSet::contains ).orElse( false );
            return nameIsFiltered ? Optional.empty() : id;
        }

        @Override
        public Optional<NamedDatabaseId> getById( DatabaseId databaseId )
        {
            var id = super.getById( databaseId );
            var uuidIsFiltered = id.map( i -> filterSet.contains( i.name() ) ).orElse( false );
            return uuidIsFiltered ? Optional.empty() : id;
        }
    }

    private static class Random implements DatabaseIdRepository
    {
        @Override
        public Optional<NamedDatabaseId> getByName( NormalizedDatabaseName databaseName )
        {
            return Optional.of( new NamedDatabaseId( databaseName.name(), UUID.randomUUID() ) );
        }

        @Override
        public Optional<NamedDatabaseId> getById( DatabaseId databaseId )
        {
            return Optional.of( new NamedDatabaseId( "db" + databaseId.hashCode(), databaseId.uuid() ) );
        }
    }
}
