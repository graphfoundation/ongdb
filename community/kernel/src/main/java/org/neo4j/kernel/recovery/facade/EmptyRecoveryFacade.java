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
package org.neo4j.kernel.recovery.facade;

import java.io.IOException;

import org.neo4j.io.layout.DatabaseLayout;

class EmptyRecoveryFacade implements RecoveryFacade
{
    static RecoveryFacade INSTANCE = new EmptyRecoveryFacade();

    private EmptyRecoveryFacade()
    {
    }

    @Override
    public void performRecovery( DatabaseLayout databaseLayout ) throws IOException
    {
        // noop
    }

    @Override
    public void performRecovery( DatabaseLayout databaseLayout, RecoveryFacadeMonitor monitor ) throws IOException
    {
        // noop
    }

    @Override
    public void performRecovery( DatabaseLayout databaseLayout, RecoveryCriteria recoveryCriteria, RecoveryFacadeMonitor monitor ) throws IOException
    {
        // noop
    }
}
