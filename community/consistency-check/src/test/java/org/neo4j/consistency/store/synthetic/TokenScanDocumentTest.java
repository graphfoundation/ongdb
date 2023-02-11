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
package org.neo4j.consistency.store.synthetic;

import org.junit.jupiter.api.Test;

import org.neo4j.kernel.impl.index.schema.EntityTokenRangeImpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.common.EntityType.NODE;
import static org.neo4j.common.EntityType.RELATIONSHIP;

class TokenScanDocumentTest
{
    @Test
    void shouldAdaptToStringToTypeOfRangeNode()
    {
        TokenScanDocument labelScanDocument = new TokenScanDocument( new EntityTokenRangeImpl( 0, new long[0][], NODE ) );
        assertThat( labelScanDocument.toString() ).contains( "NodeLabelRange" );
    }

    @Test
    void shouldAdaptToStringToTypeOfRangeRelationship()
    {
        TokenScanDocument relationshipTypeScanDocument = new TokenScanDocument( new EntityTokenRangeImpl( 0, new long[0][], RELATIONSHIP ) );
        assertThat( relationshipTypeScanDocument.toString() ).contains( "RelationshipTypeRange" );
    }
}
