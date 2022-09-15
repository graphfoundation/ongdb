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
package org.neo4j.server.http.cypher;

import java.net.URI;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.neo4j.kernel.database.DefaultDatabaseResolver;
import org.neo4j.logging.Log;
import org.neo4j.memory.MemoryPool;
import org.neo4j.time.SystemNanoClock;

@Path( LegacyTransactionService.DB_TRANSACTION_PATH )
public class LegacyTransactionService extends AbstractCypherResource
{
    private static final String TRANSACTION = "transaction";
    static final String DB_TRANSACTION_PATH = "/" + TRANSACTION;

    public LegacyTransactionService(
            @Context HttpServletRequest request,
            @Context DefaultDatabaseResolver databaseResolver,
            @Context HttpTransactionManager httpTransactionManager,
            @Context UriInfo uriInfo,
            @Context MemoryPool memoryPool,
            @Context Log log,
            @Context SystemNanoClock clock )
    {
        super( httpTransactionManager, uriInfo, memoryPool, log, databaseResolver.defaultDatabase( request.getUserPrincipal().getName() ), clock );
    }

    @Override
    protected URI dbUri( UriInfo uriInfo, String databaseName )
    {
        UriBuilder builder = uriInfo.getBaseUriBuilder();
        return builder.build();
    }

    @Override
    protected URI cypherUri( UriInfo uriInfo, String databaseName )
    {
        UriBuilder builder = uriInfo.getBaseUriBuilder();
        return builder.path( TRANSACTION ).build();
    }
}
