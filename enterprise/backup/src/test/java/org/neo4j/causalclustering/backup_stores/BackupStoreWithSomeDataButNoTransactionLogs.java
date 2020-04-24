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
package org.neo4j.causalclustering.backup_stores;

import java.io.File;

import org.neo4j.causalclustering.discovery.Cluster;
import org.neo4j.causalclustering.discovery.CoreClusterMember;

import static org.junit.Assert.assertTrue;
import static org.neo4j.causalclustering.helpers.DataCreator.createEmptyNodes;

public class BackupStoreWithSomeDataButNoTransactionLogs extends AbstractStoreGenerator
{
    @Override
    CoreClusterMember createData( Cluster<?> cluster ) throws Exception
    {
        return createEmptyNodes( cluster, 10 );
    }

    @Override
    void modify( File backup )
    {
        for ( File transaction : backup.listFiles( ( dir, name ) -> name.contains( "transaction" ) ) )
        {
            assertTrue( transaction.delete() );
        }
    }
}
