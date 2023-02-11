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
package org.neo4j.kernel.api.exceptions.index;

import org.junit.jupiter.api.Test;

import org.neo4j.internal.schema.LabelSchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.kernel.api.StatementConstants;
import org.neo4j.test.InMemoryTokens;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.ValueTuple;
import org.neo4j.values.storable.Values;

import static org.assertj.core.api.Assertions.assertThat;

class IndexEntryConflictExceptionTest
{
    private static final int labelId = 1;
    private static final Value value = Values.of( "hi" );
    private static final InMemoryTokens tokens = new InMemoryTokens()
            .label( labelId, "label1" ).propertyKey( 2, "p2" ).propertyKey( 3, "p3" ).propertyKey( 4, "p4" );

    @Test
    void shouldMakeEntryConflicts()
    {
        LabelSchemaDescriptor schema = SchemaDescriptors.forLabel( labelId, 2 );
        IndexEntryConflictException e = new IndexEntryConflictException( 0L, 1L, value );

        assertThat( e.evidenceMessage( tokens, schema ) ).isEqualTo(
                "Both Node(0) and Node(1) have the label `label1` and property `p2` = 'hi'" );
    }

    @Test
    void shouldMakeEntryConflictsForOneNode()
    {
        LabelSchemaDescriptor schema = SchemaDescriptors.forLabel( labelId, 2 );
        IndexEntryConflictException e = new IndexEntryConflictException( 0L, StatementConstants.NO_SUCH_NODE, value );

        assertThat( e.evidenceMessage( tokens, schema ) ).isEqualTo(
                "Node(0) already exists with label `label1` and property `p2` = 'hi'" );
    }

    @Test
    void shouldMakeCompositeEntryConflicts()
    {
        LabelSchemaDescriptor schema = SchemaDescriptors.forLabel( labelId, 2, 3, 4 );
        ValueTuple values = ValueTuple.of( true, "hi", new long[]{6L, 4L} );
        IndexEntryConflictException e = new IndexEntryConflictException( 0L, 1L, values );

        assertThat( e.evidenceMessage( tokens, schema ) ).isEqualTo(
                "Both Node(0) and Node(1) have the label `label1` and properties `p2` = true, `p3` = 'hi', `p4` = [6, 4]" );
    }
}
