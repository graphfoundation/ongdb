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
import org.neo4j.internal.kernel.api.exceptions.schema.ConstraintValidationException;
import org.neo4j.internal.schema.LabelSchemaDescriptor;
import org.neo4j.internal.schema.constraints.ConstraintDescriptorFactory;
import org.neo4j.token.api.TokenIdPrettyPrinter;

import static java.lang.String.format;

public class NodePropertyExistenceException extends ConstraintValidationException
{
    private final long nodeId;
    private final LabelSchemaDescriptor schema;

    public NodePropertyExistenceException( LabelSchemaDescriptor schema, ConstraintValidationException.Phase phase, long nodeId,
            TokenNameLookup tokenNameLookup )
    {
        super( ConstraintDescriptorFactory.existsForSchema( schema ), phase, format( "Node(%d)", nodeId ), tokenNameLookup );
        this.schema = schema;
        this.nodeId = nodeId;
    }

    @Override
    public String getUserMessage( TokenNameLookup tokenNameLookup )
    {
        boolean pluralProps = schema.getPropertyIds().length > 1;
        String propertyNoun = pluralProps ? "properties" : "property";
        String sep = pluralProps ? "" : "`";
        String props = pluralProps ? TokenIdPrettyPrinter.niceProperties( tokenNameLookup, schema.getPropertyIds() ) :
                       tokenNameLookup.propertyKeyGetName( schema.getPropertyId() );
        return format( "Node(%d) with label `%s` must have the %s %s%s%s",
                nodeId,
                tokenNameLookup.labelGetName( schema.getLabelId() ), propertyNoun,
                sep, props, sep );
    }
}
