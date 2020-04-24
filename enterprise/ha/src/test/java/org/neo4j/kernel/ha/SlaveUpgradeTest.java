/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.kernel.ha;

import org.junit.Rule;
import org.junit.Test;

import java.io.File;

import org.neo4j.cluster.ClusterSettings;
import org.neo4j.graphdb.factory.TestHighlyAvailableGraphDatabaseFactory;
import org.neo4j.helpers.Exceptions;
import org.neo4j.kernel.impl.storemigration.MigrationTestUtils;
import org.neo4j.kernel.impl.storemigration.UpgradeNotAllowedByConfigurationException;
import org.neo4j.test.rule.TestDirectory;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class SlaveUpgradeTest
{
    @Rule
    public final TestDirectory testDirectory = TestDirectory.testDirectory();

    @Test
    public void haShouldFailToStartWithOldStore()
    {
        try
        {
            File storeDirectory = testDirectory.directory( "haShouldFailToStartWithOldStore" );
            File databaseDirectory = testDirectory.databaseDir( storeDirectory );
            MigrationTestUtils.find23FormatStoreDirectory( databaseDirectory );

            new TestHighlyAvailableGraphDatabaseFactory()
                    .newEmbeddedDatabaseBuilder( databaseDirectory )
                    .setConfig( ClusterSettings.server_id, "1" )
                    .setConfig( ClusterSettings.initial_hosts, "localhost:9999" )
                    .newGraphDatabase();

            fail( "Should exit abnormally" );
        }
        catch ( Exception e )
        {
            Throwable rootCause = Exceptions.rootCause( e );
            assertThat( rootCause, instanceOf( UpgradeNotAllowedByConfigurationException.class ) );
        }
    }
}
