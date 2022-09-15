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
package org.neo4j.graphdb.factory;

import org.junit.jupiter.api.Test;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.kernel.impl.locking.LocksFactory;
import org.neo4j.kernel.impl.locking.forseti.ForsetiLocksFactory;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.time.Clocks;
import org.neo4j.time.SystemNanoClock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.neo4j.graphdb.factory.EditionLocksFactories.createLockFactory;
import static org.neo4j.graphdb.factory.EditionLocksFactories.createLockManager;

class EditionLocksFactoriesTest
{

    @Test
    void createLocksForAllResourceTypes()
    {
        LocksFactory lockFactory = mock( LocksFactory.class );
        Config config = Config.defaults();
        SystemNanoClock clock = Clocks.nanoClock();

        createLockManager( lockFactory, config, clock );

        verify( lockFactory ).newInstance( eq( config ), eq( clock ) );
    }

    @Test
    void createForsetiLocksFactoryWhenNotConfigured()
    {
        Config config = Config.defaults();
        LocksFactory lockFactory = createLockFactory( config, NullLogService.getInstance() );

        assertThat( lockFactory ).isInstanceOf( ForsetiLocksFactory.class );
    }

    @Test
    void createForsetiWhenObsoleteCommunityLocksFactorySpecified()
    {
        Config config = Config.defaults( GraphDatabaseInternalSettings.lock_manager, "community");

        LocksFactory lockFactory = createLockFactory( config, NullLogService.getInstance() );

        assertThat( lockFactory ).isInstanceOf( ForsetiLocksFactory.class );
    }

    @Test
    void failToCreateWhenConfiguredFactoryNotFound()
    {
        Config config = Config.defaults( GraphDatabaseInternalSettings.lock_manager, "notFoundManager");

        IllegalArgumentException exception =
                assertThrows( IllegalArgumentException.class, () -> createLockFactory( config, NullLogService.getInstance() ) );

        assertEquals( "No lock manager found with the name 'notFoundManager'.", exception.getMessage() );
    }
}
