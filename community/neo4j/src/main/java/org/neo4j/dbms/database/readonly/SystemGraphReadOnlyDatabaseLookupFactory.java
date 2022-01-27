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
package org.neo4j.dbms.database.readonly;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.neo4j.dbms.database.CommunityTopologyGraphDbmsModel;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.TopologyGraphDbmsModel;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacade;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;

public final class SystemGraphReadOnlyDatabaseLookupFactory implements ReadOnlyDatabases.LookupFactory
{
    private final DatabaseManager<?> databaseManager;
    private final Log log;

    private volatile SystemGraphLookup previousLookup;

    public SystemGraphReadOnlyDatabaseLookupFactory( DatabaseManager<?> databaseManager, LogProvider logProvider )
    {
        this.databaseManager = databaseManager;
        this.previousLookup = SystemGraphLookup.ALWAYS_READONLY;
        this.log = logProvider.getLog( getClass() );
    }

    private Optional<GraphDatabaseFacade> systemDatabase()
    {
        var systemDb = databaseManager.getDatabaseContext( NamedDatabaseId.NAMED_SYSTEM_DATABASE_ID );
        var started = systemDb.map( db -> db.databaseFacade().isAvailable( 0 ) ).orElse( false );

        if ( started )
        {
            return systemDb.map( DatabaseContext::databaseFacade );
        }
        return Optional.empty();
    }

    @Override
    public ReadOnlyDatabases.Lookup lookupReadOnlyDatabases()
    {
        var previous = previousLookup;
        var next = previous;

        try
        {
            next = systemDatabase()
                    .map( this::lookupReadOnlyDatabases )
                    .map( dbs -> new SystemGraphLookup( dbs, false ) )
                    .orElse( previous );
        }
        catch ( Exception e )
        {
            log.warn( "Unable to lookup readonly databases from the system database due to error!" +
                      " Using previous lookup %s.%nUnderlying error: %s", previous, e.getMessage() );
        }

        this.previousLookup = next;
        return next;
    }

    private Set<NamedDatabaseId> lookupReadOnlyDatabases( GraphDatabaseFacade db )
    {
        try ( var tx = db.beginTx() )
        {
            var model = new CommunityTopologyGraphDbmsModel( tx );
            var databaseAccess = model.getAllDatabaseAccess();
            return databaseAccess.entrySet().stream()
                                 .filter( e -> e.getValue() == TopologyGraphDbmsModel.DatabaseAccess.READ_ONLY )
                                 .map( Map.Entry::getKey )
                                 .collect( Collectors.toUnmodifiableSet() );
        }
    }

    private static class SystemGraphLookup implements ReadOnlyDatabases.Lookup
    {
        static final SystemGraphLookup ALWAYS_READONLY = new SystemGraphLookup( Set.of(), true );

        private final Set<NamedDatabaseId> lookup;
        private final boolean alwaysReadOnly;

        SystemGraphLookup( Set<NamedDatabaseId> lookup, boolean alwaysReadOnly )
        {
            this.lookup = lookup;
            this.alwaysReadOnly = alwaysReadOnly;
        }

        @Override
        public boolean databaseIsReadOnly( NamedDatabaseId databaseId )
        {
            return alwaysReadOnly || lookup.contains( databaseId );
        }

        @Override
        public String toString()
        {
            return "SystemGraphLookup{" +
                   "readOnlyDatabases=" + lookup +
                   ", alwaysReadOnly=" + alwaysReadOnly +
                   '}';
        }
    }
}
