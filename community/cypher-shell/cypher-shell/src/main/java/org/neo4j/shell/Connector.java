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
package org.neo4j.shell;


import org.neo4j.shell.exception.CommandException;
import org.neo4j.shell.exception.ThrowingAction;

/**
 * An object with the ability to connect and disconnect.
 */
public interface Connector
{

    /**
     * @return true if connected, false otherwise
     */
    boolean isConnected();

    /**
     * @throws CommandException if connection failed
     */
    default void connect( ConnectionConfig connectionConfig ) throws CommandException
    {
        connect( connectionConfig, null );
    }

    /**
     * Tries to connect to database.
     *
     * @throws CommandException if connection failed
     * @return connection configuration used to connect (can be different from the supplied)
     */
    ConnectionConfig connect( ConnectionConfig connectionConfig, ThrowingAction<CommandException> action ) throws CommandException;

    void disconnect();

    /**
     * Returns the version of Neo4j which the shell is connected to. If the version is before 3.1.0-M09, or we are not connected yet, this returns the empty
     * string.
     *
     * @return the version of neo4j (like '3.1.0') if connected and available, an empty string otherwise
     */
    String getServerVersion();

    /**
     * Returns Bolt protocol version
     *
     * @return the version of neo4j driver (like '4.3') if connected and available, an empty string otherwise
     */
    String getProtocolVersion();
}
