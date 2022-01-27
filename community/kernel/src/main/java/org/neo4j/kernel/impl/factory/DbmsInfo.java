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
package org.neo4j.kernel.impl.factory;

import org.neo4j.annotations.api.IgnoreApiCheck;
import org.neo4j.common.Edition;

@IgnoreApiCheck
public enum DbmsInfo
{
    UNKNOWN( Edition.UNKNOWN, OperationalMode.UNKNOWN ),
    TOOL( Edition.UNKNOWN, OperationalMode.SINGLE ),
    COMMUNITY( Edition.COMMUNITY, OperationalMode.SINGLE ),
    ENTERPRISE( Edition.ENTERPRISE, OperationalMode.SINGLE ),
    CORE( Edition.ENTERPRISE, OperationalMode.CORE ),
    READ_REPLICA( Edition.ENTERPRISE, OperationalMode.READ_REPLICA );

    public final Edition edition;
    public final OperationalMode operationalMode;

    DbmsInfo( Edition edition, OperationalMode operationalMode )
    {
        this.edition = edition;
        this.operationalMode = operationalMode;
    }

    @Override
    public String toString()
    {
        return edition + " " + operationalMode;
    }

}
