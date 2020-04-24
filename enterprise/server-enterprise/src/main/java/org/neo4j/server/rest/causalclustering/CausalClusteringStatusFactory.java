/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.server.rest.causalclustering;

import org.neo4j.causalclustering.core.CoreGraphDatabase;
import org.neo4j.causalclustering.readreplica.ReadReplicaGraphDatabase;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.server.rest.repr.OutputFormat;

public class CausalClusteringStatusFactory
{
    public static CausalClusteringStatus build( OutputFormat output, GraphDatabaseService db )
    {
        if ( db instanceof CoreGraphDatabase )
        {
            return new CoreStatus( output, (CoreGraphDatabase) db );
        }
        else if ( db instanceof ReadReplicaGraphDatabase )
        {
            return new ReadReplicaStatus( output, (ReadReplicaGraphDatabase) db );
        }
        else
        {
            return new NotCausalClustering( output );
        }
    }
}
