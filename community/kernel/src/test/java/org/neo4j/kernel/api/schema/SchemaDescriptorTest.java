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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import org.neo4j.common.EntityType;
import org.neo4j.internal.schema.AnyTokenSchemaDescriptor;
import org.neo4j.internal.schema.LabelSchemaDescriptor;
import org.neo4j.internal.schema.PropertySchemaType;
import org.neo4j.internal.schema.RelationTypeSchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.kernel.api.schema.SchemaTestUtil.assertArray;

class SchemaDescriptorTest
{
    private static final int REL_TYPE_ID = 0;
    private static final int LABEL_ID = 0;

    @Test
    void shouldCreateLabelDescriptors()
    {
        LabelSchemaDescriptor labelDesc;
        labelDesc = SchemaDescriptors.forLabel( LABEL_ID, 1 );
        assertThat( labelDesc.getLabelId() ).isEqualTo( LABEL_ID );
        assertThat( labelDesc.entityType() ).isEqualTo( EntityType.NODE );
        assertThat( labelDesc.propertySchemaType() ).isEqualTo( PropertySchemaType.COMPLETE_ALL_TOKENS );
        assertArray( labelDesc.getPropertyIds(), 1 );

        labelDesc = SchemaDescriptors.forLabel( LABEL_ID, 1, 2, 3 );
        assertThat( labelDesc.getLabelId() ).isEqualTo( LABEL_ID );
        assertArray( labelDesc.getPropertyIds(), 1, 2, 3 );
    }

    @Test
    void shouldCreateRelTypeDescriptors()
    {
        RelationTypeSchemaDescriptor relTypeDesc;
        relTypeDesc = SchemaDescriptors.forRelType( REL_TYPE_ID, 1 );
        assertThat( relTypeDesc.getRelTypeId() ).isEqualTo( REL_TYPE_ID );
        assertThat( relTypeDesc.entityType() ).isEqualTo( EntityType.RELATIONSHIP );
        assertThat( relTypeDesc.propertySchemaType() ).isEqualTo( PropertySchemaType.COMPLETE_ALL_TOKENS );
        assertArray( relTypeDesc.getPropertyIds(), 1 );

        relTypeDesc = SchemaDescriptors.forRelType( REL_TYPE_ID, 1, 2, 3 );
        assertThat( relTypeDesc.getRelTypeId() ).isEqualTo( REL_TYPE_ID );
        assertArray( relTypeDesc.getPropertyIds(), 1, 2, 3 );
    }

    @Test
    void shouldCreateEqualLabels()
    {
        LabelSchemaDescriptor desc1 = SchemaDescriptors.forLabel( LABEL_ID, 1 );
        LabelSchemaDescriptor desc2 = SchemaDescriptors.forLabel( LABEL_ID, 1 );
        SchemaTestUtil.assertEquality( desc1, desc2 );
    }

    @Test
    void shouldCreateEqualRelTypes()
    {
        RelationTypeSchemaDescriptor desc1 = SchemaDescriptors.forRelType( REL_TYPE_ID, 1 );
        RelationTypeSchemaDescriptor desc2 = SchemaDescriptors.forRelType( REL_TYPE_ID, 1 );
        SchemaTestUtil.assertEquality( desc1, desc2 );
    }

    @Test
    void shouldGiveNiceUserDescriptions()
    {
        assertThat( SchemaDescriptors.forLabel( 1, 2 ).userDescription( SchemaTestUtil.SIMPLE_NAME_LOOKUP ) ).isEqualTo( "(:Label1 {property2})" );
        assertThat( SchemaDescriptors.forRelType( 1, 3 ).userDescription( SchemaTestUtil.SIMPLE_NAME_LOOKUP ) ).isEqualTo( "-[:RelType1 {property3}]-" );
        assertThat( SchemaDescriptors.forAnyEntityTokens( EntityType.NODE ).userDescription( SchemaTestUtil.SIMPLE_NAME_LOOKUP ) )
                .isEqualTo( "(:<any-labels>)" );
        assertThat( SchemaDescriptors.forAnyEntityTokens( EntityType.RELATIONSHIP ).userDescription( SchemaTestUtil.SIMPLE_NAME_LOOKUP ) )
                .isEqualTo( "-[:<any-types>]-" );
    }

    @ParameterizedTest
    @EnumSource( EntityType.class )
    void shouldCreateAllTokenDescriptors( EntityType entityType )
    {
        AnyTokenSchemaDescriptor allLabelsDesc = SchemaDescriptors.forAnyEntityTokens( entityType );
        assertThat( allLabelsDesc.entityType() ).isEqualTo( entityType );
        assertThat( allLabelsDesc.propertySchemaType() ).isEqualTo( PropertySchemaType.ENTITY_TOKENS );
        assertThat( allLabelsDesc.getEntityTokenIds() ).isEmpty();
        assertThat( allLabelsDesc.getPropertyIds() ).isEmpty();
    }
}
