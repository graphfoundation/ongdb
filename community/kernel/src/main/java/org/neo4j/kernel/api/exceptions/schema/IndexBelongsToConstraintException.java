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
package org.neo4j.kernel.api.exceptions.schema;

import org.neo4j.common.TokenNameLookup;
import org.neo4j.internal.kernel.api.exceptions.schema.SchemaKernelException;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.kernel.api.exceptions.Status;

import static java.lang.String.format;

public class IndexBelongsToConstraintException extends SchemaKernelException
{
    private final SchemaDescriptor descriptor;
    private final String indexName;
    private static final String MESSAGE_SCHEMA = "Index belongs to constraint: %s";
    private static final String MESSAGE_NAME = "Index belongs to constraint: `%s`";

    public IndexBelongsToConstraintException( SchemaDescriptor descriptor )
    {
        super( Status.Schema.ForbiddenOnConstraintIndex, format( MESSAGE_SCHEMA, descriptor ) );
        this.descriptor = descriptor;
        this.indexName = null;
    }

    public IndexBelongsToConstraintException( String indexName, SchemaDescriptor descriptor )
    {
        super( Status.Schema.ForbiddenOnConstraintIndex, format( MESSAGE_NAME, indexName ) );
        this.descriptor = descriptor;
        this.indexName = indexName;
    }

    @Override
    public String getUserMessage( TokenNameLookup tokenNameLookup )
    {
        if ( indexName == null )
        {
            return format( MESSAGE_SCHEMA, descriptor.userDescription( tokenNameLookup ) );
        }
        else
        {
            return format( MESSAGE_NAME, indexName );
        }
    }
}
