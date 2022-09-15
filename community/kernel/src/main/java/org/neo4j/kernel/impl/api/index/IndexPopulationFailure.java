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
package org.neo4j.kernel.impl.api.index;

import org.neo4j.internal.helpers.Exceptions;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.kernel.api.exceptions.index.IndexPopulationFailedKernelException;

public interface IndexPopulationFailure
{
    String asString();

    IndexPopulationFailedKernelException asIndexPopulationFailure( SchemaDescriptor descriptor, String indexUserDescriptor );

    static IndexPopulationFailure failure( final Throwable failure )
    {
        return new IndexPopulationFailure()
        {
            @Override
            public String asString()
            {
                return Exceptions.stringify( failure );
            }

            @Override
            public IndexPopulationFailedKernelException asIndexPopulationFailure(
                    SchemaDescriptor descriptor, String indexUserDescription )
            {
                return new IndexPopulationFailedKernelException( indexUserDescription, failure );
            }
        };
    }

    static IndexPopulationFailure failure( final String failure )
    {
        return new IndexPopulationFailure()
        {
            @Override
            public String asString()
            {
                return failure;
            }

            @Override
            public IndexPopulationFailedKernelException asIndexPopulationFailure(
                    SchemaDescriptor descriptor, String indexUserDescription )
            {
                return new IndexPopulationFailedKernelException( indexUserDescription, failure );
            }
        };
    }

    static String appendCauseOfFailure( String message, String causeOfFailure )
    {
        return String.format( "%s: Cause of failure:%n" +
                "==================%n%s%n==================", message, causeOfFailure );
    }
}
