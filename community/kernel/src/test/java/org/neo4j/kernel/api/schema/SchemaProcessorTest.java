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
package org.neo4j.kernel.api.schema;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.internal.schema.LabelSchemaDescriptor;
import org.neo4j.internal.schema.RelationTypeSchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.internal.schema.SchemaProcessor;

import static org.assertj.core.api.Assertions.assertThat;

class SchemaProcessorTest
{
    private static final int LABEL_ID = 0;
    private static final int REL_TYPE_ID = 0;

    @Test
    void shouldHandleCorrectDescriptorVersions()
    {
        List<String> callHistory = new ArrayList<>();
        SchemaProcessor processor = new SchemaProcessor()
        {
            @Override
            public void processSpecific( LabelSchemaDescriptor schema )
            {
                callHistory.add( "LabelSchemaDescriptor" );
            }

            @Override
            public void processSpecific( RelationTypeSchemaDescriptor schema )
            {
                callHistory.add( "RelationTypeSchemaDescriptor" );
            }

            @Override
            public void processSpecific( SchemaDescriptor schemaDescriptor )
            {
                callHistory.add( "SchemaDescriptor" );
            }
        };

        disguisedLabel().processWith( processor );
        disguisedLabel().processWith( processor );
        disguisedRelType().processWith( processor );
        disguisedLabel().processWith( processor );
        disguisedRelType().processWith( processor );
        disguisedRelType().processWith( processor );

        assertThat( callHistory ).containsExactly( "LabelSchemaDescriptor", "LabelSchemaDescriptor", "RelationTypeSchemaDescriptor", "LabelSchemaDescriptor",
                "RelationTypeSchemaDescriptor", "RelationTypeSchemaDescriptor" );
    }

    private static SchemaDescriptor disguisedLabel()
    {
        return SchemaDescriptors.forLabel( LABEL_ID, 1 );
    }

    private static SchemaDescriptor disguisedRelType()
    {
        return SchemaDescriptors.forRelType( REL_TYPE_ID, 1 );
    }
}
