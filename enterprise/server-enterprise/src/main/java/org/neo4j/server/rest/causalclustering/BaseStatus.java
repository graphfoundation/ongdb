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
package org.neo4j.server.rest.causalclustering;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.neo4j.causalclustering.identity.MemberId;
import org.neo4j.server.rest.repr.OutputFormat;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN_TYPE;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.Status.OK;
import static javax.ws.rs.core.Response.status;
import static org.neo4j.server.rest.causalclustering.CausalClusteringService.BASE_PATH;

abstract class BaseStatus implements CausalClusteringStatus
{
    private final OutputFormat output;

    BaseStatus( OutputFormat output )
    {
        this.output = output;
    }

    @Override
    public Response discover()
    {
        return output.ok( new CausalClusteringDiscovery( BASE_PATH ) );
    }

    Response statusResponse( long lastAppliedRaftIndex, boolean isParticipatingInRaftGroup, Collection<MemberId> votingMembers, boolean isHealthy,
            MemberId memberId, MemberId leader, Duration millisSinceLastLeaderMessage, boolean isCore )
    {
        String jsonObject;
        ObjectMapper objectMapper = new ObjectMapper();
        try
        {
            jsonObject = objectMapper.writeValueAsString(
                    new ClusterStatusResponse( lastAppliedRaftIndex, isParticipatingInRaftGroup, votingMembers, isHealthy, memberId, leader,
                            millisSinceLastLeaderMessage, isCore ) );
        }
        catch ( IOException e )
        {
            throw new RuntimeException( e );
        }
        return status( OK ).type( MediaType.APPLICATION_JSON ).entity( jsonObject ).build();
    }

    Response positiveResponse()
    {
        return plainTextResponse( OK, "true" );
    }

    Response negativeResponse()
    {
        return plainTextResponse( NOT_FOUND, "false" );
    }

    private Response plainTextResponse( Response.Status status, String entityBody )
    {
        return status( status ).type( TEXT_PLAIN_TYPE ).entity( entityBody ).build();
    }
}
