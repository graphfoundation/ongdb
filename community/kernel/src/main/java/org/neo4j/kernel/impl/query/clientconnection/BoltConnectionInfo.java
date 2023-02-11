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
package org.neo4j.kernel.impl.query.clientconnection;

import java.net.SocketAddress;

import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;

import static org.neo4j.configuration.helpers.SocketAddress.format;

/**
 * @see ClientConnectionInfo Parent class for documentation and tests.
 */
public class BoltConnectionInfo extends ClientConnectionInfo
{
    private final String connectionId;
    private final String clientName;
    private final SocketAddress clientAddress;
    private final SocketAddress serverAddress;

    public BoltConnectionInfo(
            String connectionId,
            String clientName,
            SocketAddress clientAddress,
            SocketAddress serverAddress )
    {
        this.connectionId = connectionId;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.serverAddress = serverAddress;
    }

    @Override
    public String asConnectionDetails()
    {
        return String.format(
                "bolt-session\tbolt\t%s\t\tclient%s\tserver%s>",
                clientName,
                clientAddress,
                serverAddress );
    }

    @Override
    public String protocol()
    {
        return "bolt";
    }

    @Override
    public String connectionId()
    {
        return connectionId;
    }

    @Override
    public String clientAddress()
    {
        return format( clientAddress );
    }

    @Override
    public String requestURI()
    {
        return format( serverAddress );
    }
}
