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
package org.neo4j.internal.schema;

/**
 * The enum of all the types of constraints that we support.
 * This is the internal version of {@link org.neo4j.graphdb.schema.ConstraintType}.
 * <p>
 * NOTE: The ordinal is used in the hash function for the auto-generated SchemaRule names, so avoid changing the ordinals when modifying this enum.
 */
public enum ConstraintType
{
    UNIQUE( true, false ),
    EXISTS( false, true ),
    UNIQUE_EXISTS( true, true );

    private final boolean isUnique;
    private final boolean mustExist;

    ConstraintType( boolean isUnique, boolean mustExist )
    {
        this.isUnique = isUnique;
        this.mustExist = mustExist;
    }

    public boolean enforcesUniqueness()
    {
        return isUnique;
    }

    public boolean enforcesPropertyExistence()
    {
        return mustExist;
    }
}
