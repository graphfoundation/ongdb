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
package org.neo4j.causalclustering.core.state;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;

import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.test.rule.TestDirectory;
import org.neo4j.test.rule.fs.DefaultFileSystemRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClusterStateDirectoryTest
{
    @Rule
    public DefaultFileSystemRule fsRule = new DefaultFileSystemRule();
    private FileSystemAbstraction fs = fsRule.get();

    @Rule
    public TestDirectory testDirectory = TestDirectory.testDirectory( fs );

    private File dataDir;
    private File stateDir;

    @Before
    public void setup()
    {
        dataDir = testDirectory.directory( "data" );
        stateDir = new File( dataDir, ClusterStateDirectory.CLUSTER_STATE_DIRECTORY_NAME );
    }

    @Test
    public void shouldMigrateClusterStateFromStoreDir() throws Exception
    {
        // given
        File storeDir = new File( new File( dataDir, "databases" ), GraphDatabaseSettings.DEFAULT_DATABASE_NAME );

        String fileName = "file";

        File oldStateDir = new File( storeDir, ClusterStateDirectory.CLUSTER_STATE_DIRECTORY_NAME );
        File oldClusterStateFile = new File( oldStateDir, fileName );

        fs.mkdirs( oldStateDir );
        fs.create( oldClusterStateFile ).close();

        // when
        ClusterStateDirectory clusterStateDirectory = new ClusterStateDirectory( dataDir, storeDir, false );
        clusterStateDirectory.initialize( fs );

        // then
        assertEquals( clusterStateDirectory.get(), stateDir );
        assertTrue( fs.fileExists( new File( clusterStateDirectory.get(), fileName ) ) );
    }

    @Test
    public void shouldHandleCaseOfStoreDirBeingDataDir() throws Exception
    {
        // given
        File storeDir = dataDir;

        String fileName = "file";

        File oldStateDir = new File( storeDir, ClusterStateDirectory.CLUSTER_STATE_DIRECTORY_NAME );
        File oldClusterStateFile = new File( oldStateDir, fileName );

        fs.mkdirs( oldStateDir );
        fs.create( oldClusterStateFile ).close();

        // when
        ClusterStateDirectory clusterStateDirectory = new ClusterStateDirectory( dataDir, storeDir, false );
        clusterStateDirectory.initialize( fs );

        // then
        assertEquals( clusterStateDirectory.get(), stateDir );
        assertTrue( fs.fileExists( new File( clusterStateDirectory.get(), fileName ) ) );
    }
}
