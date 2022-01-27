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
package org.neo4j.kernel.diagnostics.providers;

import java.util.Map;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.internal.diagnostics.DiagnosticsLogger;
import org.neo4j.internal.diagnostics.NamedDiagnosticsProvider;

import static java.lang.String.format;

public class ConfigDiagnostics extends NamedDiagnosticsProvider
{
    private final Config config;

    public ConfigDiagnostics( Config config )
    {
        super( "DBMS config" );
        this.config = config;
    }

    @Override
    public void dump( DiagnosticsLogger logger )
    {
        if ( config.getDeclaredSettings().values().stream().noneMatch( config::isExplicitlySet ) )
        {
            logger.log( "No provided DBMS settings." );
            return;
        }
        logger.log( "DBMS provided settings:" );
        config.getDeclaredSettings().entrySet().stream()
                .filter( entry -> config.isExplicitlySet( entry.getValue() ) )
                .sorted( Map.Entry.comparingByKey() )
                .forEachOrdered( e ->
                {
                    String value = ((SettingImpl<Object>) e.getValue()).valueToString( config.get( e.getValue() ) );
                    logger.log( format( "%s=%s", e.getKey(), value ) );
                } );
    }
}
