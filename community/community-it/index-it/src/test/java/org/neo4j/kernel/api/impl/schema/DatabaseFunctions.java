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
package org.neo4j.kernel.api.impl.schema;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Transaction;

public final class DatabaseFunctions
{
    private DatabaseFunctions()
    {
        throw new AssertionError( "Not for instantiation!" );
    }

    public static Function<Transaction,Void> index( Label label, String propertyKey )
    {
        return tx ->
        {
            tx.schema().indexFor( label ).on( propertyKey ).create();
            return null;
        };
    }

    public static Function<Transaction,Void> uniquenessConstraint( Label label, String propertyKey )
    {
        return tx ->
        {
            tx.schema().constraintFor( label ).assertPropertyIsUnique( propertyKey ).create();
            return null;
        };
    }

    public static Function<Transaction,Void> awaitIndexesOnline( long timeout, TimeUnit unit )
    {
        return tx ->
        {
            tx.schema().awaitIndexesOnline( timeout, unit );
            return null;
        };
    }
}
