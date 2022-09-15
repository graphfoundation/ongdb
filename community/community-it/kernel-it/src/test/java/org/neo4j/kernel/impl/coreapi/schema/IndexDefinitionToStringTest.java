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
package org.neo4j.kernel.impl.coreapi.schema;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.schema.AnyTokens;
import org.neo4j.graphdb.schema.IndexDefinition;
import org.neo4j.test.extension.ImpermanentDbmsExtension;
import org.neo4j.test.extension.Inject;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.graphdb.schema.IndexType.FULLTEXT;
import static org.neo4j.graphdb.schema.IndexType.POINT;
import static org.neo4j.graphdb.schema.IndexType.RANGE;
import static org.neo4j.graphdb.schema.IndexType.TEXT;

@ImpermanentDbmsExtension
class IndexDefinitionToStringTest
{
    @Inject
    private GraphDatabaseService db;

    @BeforeEach
    void setup()
    {
        try ( var tx = db.beginTx() )
        {
            tx.schema().getIndexes().forEach( IndexDefinition::drop );
            tx.commit();
        }
    }

    @Test
    void testToString()
    {
        try ( var tx = db.beginTx() )
        {
            var labelTokenIndex = tx.schema().indexFor( AnyTokens.ANY_LABELS ).withName( "labelTokenIndex" ).create();
            var labelProperty = tx.schema().indexFor( Label.label( "someLabel" ) )
                                  .on( "someProperty" ).withName( "labelIndexName" ).create();
            var labelProperties = tx.schema().indexFor( Label.label( "someLabel" ) )
                                    .on( "someProperty" ).on( "someOtherProperty" )
                                    .withName( "labelIndexNames" ).create();
            var rangeLabelProperties = tx.schema().indexFor( Label.label( "someLabel" ) )
                    .on( "someProperty" ).on( "someOtherProperty" ).withIndexType( RANGE ).withName( "rangeLabelIndexNames" ).create();
            var fulltextLabelProperty = tx.schema().indexFor( Label.label( "Label" ) ).on( "prop" ).withIndexType( FULLTEXT )
                    .withName( "fulltextLabelPropertyIndex" ).create();
            var fulltextLabelsProperties =
                    tx.schema().indexFor( Label.label( "Label" ), Label.label( "otherLabel" ) ).on( "prop" ).on( "otherProp" ).withIndexType( FULLTEXT )
                    .withName( "fulltextLabelPropertiesIndex" ).create();
            var textLabelProperty = tx.schema().indexFor( Label.label( "Label" ) ).on( "prop" ).withIndexType( TEXT )
                    .withName( "textLabelPropertyIndex" ).create();
            var pointLabelProperty = tx.schema().indexFor( Label.label( "Label" ) ).on( "prop" ).withIndexType( POINT )
                    .withName( "pointLabelPropertyIndex" ).create();

            var relTypeTokenIndex = tx.schema().indexFor( AnyTokens.ANY_RELATIONSHIP_TYPES ).withName( "relTypeTokenIndex" ).create();
            var relTypeProperty = tx.schema().indexFor( RelationshipType.withName( "someRelationship" ) )
                                    .on( "someProperty" ).withName( "relTypeIndexName" ).create();
            var relTypeProperties = tx.schema().indexFor( RelationshipType.withName( "someRelationship" ) )
                                      .on( "someProperty" ).on( "someOtherProperty" )
                                      .withName( "relTypeIndexNames" ).create();
            var rangeRelTypeProperties = tx.schema().indexFor( RelationshipType.withName( "someRelationship" ) )
                    .on( "someProperty" ).on( "someOtherProperty" ).withIndexType( RANGE ).withName( "rangeRelTypeIndexNames" ).create();
            var fulltextRelTypeProperty = tx.schema().indexFor( RelationshipType.withName( "TYPE" ) ).on( "prop" ).withIndexType( FULLTEXT )
                    .withName( "fulltextRelTypePropertyIndex" ).create();
            var fulltextRelTypesProperties =
                    tx.schema().indexFor( RelationshipType.withName( "TYPE" ), RelationshipType.withName( "OTHER_TYPE" ) ).on( "prop" ).on( "otherProp" )
                            .withIndexType( FULLTEXT ).withName( "fulltextRelTypesPropertiesIndex" ).create();
            var textRelTypeProperty = tx.schema().indexFor( RelationshipType.withName( "TYPE" ) ).on( "prop" ).withIndexType( TEXT )
                    .withName( "textRelTypePropertyIndex" ).create();
            var pointRelTypeProperty = tx.schema().indexFor( RelationshipType.withName( "TYPE" ) ).on( "prop" ).withIndexType( POINT )
                    .withName( "pointRelTypePropertyIndex" ).create();

            assertIndexString( labelTokenIndex,
                               "IndexDefinition[label:<any-labels>] " +
                               "(Index( id=%d, name='labelTokenIndex', type='TOKEN LOOKUP', " +
                               "schema=(:<any-labels>), indexProvider='token-lookup-1.0' ))" );
            assertIndexString( labelProperty,
                               "IndexDefinition[label:someLabel on:someProperty] " +
                               "(Index( id=%d, name='labelIndexName', type='GENERAL BTREE', " +
                               "schema=(:someLabel {someProperty}), indexProvider='native-btree-1.0' ))" );
            assertIndexString( labelProperties,
                               "IndexDefinition[label:someLabel on:someProperty,someOtherProperty] " +
                               "(Index( id=%d, name='labelIndexNames', type='GENERAL BTREE', " +
                               "schema=(:someLabel {someProperty, someOtherProperty}), indexProvider='native-btree-1.0' ))" );
            assertIndexString( rangeLabelProperties,
                               "IndexDefinition[label:someLabel on:someProperty,someOtherProperty] " +
                               "(Index( id=%d, name='rangeLabelIndexNames', type='GENERAL RANGE', " +
                               "schema=(:someLabel {someProperty, someOtherProperty}), indexProvider='range-1.0' ))" );
            assertIndexString( fulltextLabelProperty, "IndexDefinition[label:Label on:prop] " +
                               "(Index( id=%d, name='fulltextLabelPropertyIndex', type='GENERAL FULLTEXT', " +
                               "schema=(:Label {prop}), indexProvider='fulltext-1.0' ))" );
            assertIndexString( fulltextLabelsProperties, "IndexDefinition[labels:Label,otherLabel on:prop,otherProp] " +
                               "(Index( id=%d, name='fulltextLabelPropertiesIndex', type='GENERAL FULLTEXT', " +
                               "schema=(:Label:otherLabel {prop, otherProp}), indexProvider='fulltext-1.0' ))" );
            assertIndexString( textLabelProperty, "IndexDefinition[label:Label on:prop] " +
                               "(Index( id=%d, name='textLabelPropertyIndex', type='GENERAL TEXT', " +
                               "schema=(:Label {prop}), indexProvider='text-1.0' ))" );
            assertIndexString( pointLabelProperty, "IndexDefinition[label:Label on:prop] " +
                               "(Index( id=%d, name='pointLabelPropertyIndex', type='GENERAL POINT', " +
                               "schema=(:Label {prop}), indexProvider='point-1.0' ))" );

            assertIndexString( relTypeTokenIndex,
                               "IndexDefinition[relationship type:<any-types>] " +
                               "(Index( id=%d, name='relTypeTokenIndex', type='TOKEN LOOKUP', " +
                               "schema=-[:<any-types>]-, indexProvider='token-lookup-1.0' ))" );
            assertIndexString( relTypeProperty,
                               "IndexDefinition[relationship type:someRelationship on:someProperty] " +
                               "(Index( id=%d, name='relTypeIndexName', type='GENERAL BTREE', " +
                               "schema=-[:someRelationship {someProperty}]-, indexProvider='native-btree-1.0' ))" );
            assertIndexString( relTypeProperties,
                               "IndexDefinition[relationship type:someRelationship on:someProperty,someOtherProperty] " +
                               "(Index( id=%d, name='relTypeIndexNames', type='GENERAL BTREE', " +
                               "schema=-[:someRelationship {someProperty, someOtherProperty}]-, indexProvider='native-btree-1.0' ))" );
            assertIndexString( rangeRelTypeProperties,
                               "IndexDefinition[relationship type:someRelationship on:someProperty,someOtherProperty] " +
                               "(Index( id=%d, name='rangeRelTypeIndexNames', type='GENERAL RANGE', " +
                               "schema=-[:someRelationship {someProperty, someOtherProperty}]-, indexProvider='range-1.0' ))" );
            assertIndexString( fulltextRelTypeProperty, "IndexDefinition[relationship type:TYPE on:prop] " +
                               "(Index( id=%d, name='fulltextRelTypePropertyIndex', type='GENERAL FULLTEXT', " +
                               "schema=-[:TYPE {prop}]-, indexProvider='fulltext-1.0' ))" );
            assertIndexString( fulltextRelTypesProperties, "IndexDefinition[relationship types:TYPE,OTHER_TYPE on:prop,otherProp] " +
                               "(Index( id=%d, name='fulltextRelTypesPropertiesIndex', type='GENERAL FULLTEXT', " +
                               "schema=-[:TYPE:OTHER_TYPE {prop, otherProp}]-, indexProvider='fulltext-1.0' ))" );
            assertIndexString( textRelTypeProperty, "IndexDefinition[relationship type:TYPE on:prop] " +
                               "(Index( id=%d, name='textRelTypePropertyIndex', type='GENERAL TEXT', " +
                               "schema=-[:TYPE {prop}]-, indexProvider='text-1.0' ))" );
            assertIndexString( pointRelTypeProperty, "IndexDefinition[relationship type:TYPE on:prop] " +
                               "(Index( id=%d, name='pointRelTypePropertyIndex', type='GENERAL POINT', " +
                               "schema=-[:TYPE {prop}]-, indexProvider='point-1.0' ))" );
        }
    }

    private static void assertIndexString( IndexDefinition index, String expectedStringFormat )
    {
        assertThat( index.toString() ).isEqualTo( expectedStringFormat, ((IndexDefinitionImpl) index).getIndexReference().getId() );
    }
}
