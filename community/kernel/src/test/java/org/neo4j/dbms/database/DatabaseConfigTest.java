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
package org.neo4j.dbms.database;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.DatabaseConfig;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.SettingChangeListener;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.test.Race;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.default_database;
import static org.neo4j.kernel.database.DatabaseIdFactory.from;

class DatabaseConfigTest
{
    @Test
    void shouldHandleRegisterDynamicUpdateListenersConcurrently() throws Throwable
    {
        // given
        NamedDatabaseId namedDatabaseId = from( DEFAULT_DATABASE_NAME, UUID.randomUUID() );
        DatabaseConfig dbConfig = new DatabaseConfig( Collections.emptyMap(), Config.defaults(), namedDatabaseId );
        Setting<GraphDatabaseSettings.TransactionTracingLevel> setting = GraphDatabaseSettings.transaction_tracing_level;
        int threads = 100; // big because we want to exercise what happens when the potentially backing List wants to grow
        Listener[] listeners = new Listener[threads];
        for ( int i = 0; i < threads; i++ )
        {
            listeners[i] = new Listener();
        }

        // when
        Race race = new Race();
        for ( int i = 0; i < threads; i++ )
        {
            int slot = i;
            race.addContestant( () -> dbConfig.addListener( setting, listeners[slot] ), 1 );
        }
        race.go();

        // then
        dbConfig.setDynamic( setting, GraphDatabaseSettings.TransactionTracingLevel.DISABLED, getClass().getSimpleName() );
        for ( int i = 0; i < threads; i++ )
        {
            assertEquals( 1, listeners[i].callCount );
        }
    }

    @Test
    void shouldBeAbleToBuildConfigFromDatabaseConfig()
    {
        //Given
        Config globalConfig = Config.defaults( default_database, "foo" );
        Config dbConfig = new DatabaseConfig( Map.of(), globalConfig, from( DEFAULT_DATABASE_NAME, UUID.randomUUID() ) );
        //When
        Config newConfig = Config.newBuilder().fromConfig( dbConfig ).build();
        //Then
        assertThat( newConfig.get( default_database ) ).isEqualTo( "foo" );
    }

    private static class Listener implements SettingChangeListener<GraphDatabaseSettings.TransactionTracingLevel>
    {
        private int callCount;

        @Override
        public void accept( GraphDatabaseSettings.TransactionTracingLevel from, GraphDatabaseSettings.TransactionTracingLevel to )
        {
            callCount++;
        }
    }
}
