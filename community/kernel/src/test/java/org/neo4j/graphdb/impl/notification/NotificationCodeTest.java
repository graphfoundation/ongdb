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
package org.neo4j.graphdb.impl.notification;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.neo4j.graphdb.InputPosition;
import org.neo4j.graphdb.Notification;
import org.neo4j.graphdb.SeverityLevel;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.graphdb.impl.notification.NotificationCode.CARTESIAN_PRODUCT;
import static org.neo4j.graphdb.impl.notification.NotificationCode.DEPRECATED_PROCEDURE;
import static org.neo4j.graphdb.impl.notification.NotificationCode.INDEX_HINT_UNFULFILLABLE;
import static org.neo4j.graphdb.impl.notification.NotificationCode.JOIN_HINT_UNFULFILLABLE;

class NotificationCodeTest
{
    @Test
    void shouldConstructNotificationFor_INDEX_HINT_UNFULFILLABLE_for_node_index()
    {
        NotificationDetail indexDetail = NotificationDetail.Factory.nodeAnyIndex( "person", "Person", "name" );
        Notification notification = INDEX_HINT_UNFULFILLABLE.notification( InputPosition.empty, indexDetail );

        assertThat( notification.getTitle() ).isEqualTo( "The request (directly or indirectly) referred to an index that does not exist." );
        assertThat( notification.getSeverity() ).isEqualTo( SeverityLevel.WARNING );
        assertThat( notification.getCode() ).isEqualTo( "Neo.ClientError.Schema.IndexNotFound" );
        assertThat( notification.getPosition() ).isEqualTo( InputPosition.empty );
        assertThat( notification.getDescription() ).isEqualTo(
                "The hinted index does not exist, please check the schema (index is: INDEX FOR (`person`:`Person`) ON (`person`.`name`))" );
    }

    @Test
    void shouldConstructNotificationFor_INDEX_HINT_UNFULFILLABLE_for_node_btree_index()
    {
        NotificationDetail indexDetail = NotificationDetail.Factory.nodeBtreeIndex( "person", "Person", "name" );
        Notification notification = INDEX_HINT_UNFULFILLABLE.notification( InputPosition.empty, indexDetail );

        assertThat( notification.getTitle() ).isEqualTo( "The request (directly or indirectly) referred to an index that does not exist." );
        assertThat( notification.getSeverity() ).isEqualTo( SeverityLevel.WARNING );
        assertThat( notification.getCode() ).isEqualTo( "Neo.ClientError.Schema.IndexNotFound" );
        assertThat( notification.getPosition() ).isEqualTo( InputPosition.empty );
        assertThat( notification.getDescription() ).isEqualTo(
                "The hinted index does not exist, please check the schema (index is: BTREE INDEX FOR (`person`:`Person`) ON (`person`.`name`))" );
    }

    @Test
    void shouldConstructNotificationFor_INDEX_HINT_UNFULFILLABLE_for_node_text_index()
    {
        NotificationDetail indexDetail = NotificationDetail.Factory.nodeTextIndex( "person", "Person", "name" );
        Notification notification = INDEX_HINT_UNFULFILLABLE.notification( InputPosition.empty, indexDetail );

        assertThat( notification.getTitle() ).isEqualTo( "The request (directly or indirectly) referred to an index that does not exist." );
        assertThat( notification.getSeverity() ).isEqualTo( SeverityLevel.WARNING );
        assertThat( notification.getCode() ).isEqualTo( "Neo.ClientError.Schema.IndexNotFound" );
        assertThat( notification.getPosition() ).isEqualTo( InputPosition.empty );
        assertThat( notification.getDescription() ).isEqualTo(
                "The hinted index does not exist, please check the schema (index is: TEXT INDEX FOR (`person`:`Person`) ON (`person`.`name`))" );
    }

    @Test
    void shouldConstructNotificationFor_INDEX_HINT_UNFULFILLABLE_for_rel_index()
    {
        NotificationDetail indexDetail = NotificationDetail.Factory.relationshipAnyIndex( "person", "Person", "name" );
        Notification notification = INDEX_HINT_UNFULFILLABLE.notification( InputPosition.empty, indexDetail );

        assertThat( notification.getTitle() ).isEqualTo( "The request (directly or indirectly) referred to an index that does not exist." );
        assertThat( notification.getSeverity() ).isEqualTo( SeverityLevel.WARNING );
        assertThat( notification.getCode() ).isEqualTo( "Neo.ClientError.Schema.IndexNotFound" );
        assertThat( notification.getPosition() ).isEqualTo( InputPosition.empty );
        assertThat( notification.getDescription() ).isEqualTo(
                "The hinted index does not exist, please check the schema (index is: INDEX FOR ()-[`person`:`Person`]-() ON (`person`.`name`))" );
    }

    @Test
    void shouldConstructNotificationFor_INDEX_HINT_UNFULFILLABLE_for_rel_btree_index()
    {
        NotificationDetail indexDetail = NotificationDetail.Factory.relationshipBtreeIndex( "person", "Person", "name" );
        Notification notification = INDEX_HINT_UNFULFILLABLE.notification( InputPosition.empty, indexDetail );

        assertThat( notification.getTitle() ).isEqualTo( "The request (directly or indirectly) referred to an index that does not exist." );
        assertThat( notification.getSeverity() ).isEqualTo( SeverityLevel.WARNING );
        assertThat( notification.getCode() ).isEqualTo( "Neo.ClientError.Schema.IndexNotFound" );
        assertThat( notification.getPosition() ).isEqualTo( InputPosition.empty );
        assertThat( notification.getDescription() ).isEqualTo(
                "The hinted index does not exist, please check the schema (index is: BTREE INDEX FOR ()-[`person`:`Person`]-() ON (`person`.`name`))" );
    }

    @Test
    void shouldConstructNotificationFor_INDEX_HINT_UNFULFILLABLE_for_rel_text_index()
    {
        NotificationDetail indexDetail = NotificationDetail.Factory.relationshipTextIndex( "person","Person", "name" );
        Notification notification = INDEX_HINT_UNFULFILLABLE.notification( InputPosition.empty, indexDetail );

        assertThat( notification.getTitle() ).isEqualTo( "The request (directly or indirectly) referred to an index that does not exist." );
        assertThat( notification.getSeverity() ).isEqualTo( SeverityLevel.WARNING );
        assertThat( notification.getCode() ).isEqualTo( "Neo.ClientError.Schema.IndexNotFound" );
        assertThat( notification.getPosition() ).isEqualTo( InputPosition.empty );
        assertThat( notification.getDescription() ).isEqualTo(
                "The hinted index does not exist, please check the schema (index is: TEXT INDEX FOR ()-[`person`:`Person`]-() ON (`person`.`name`))" );
    }

    @Test
    void shouldConstructNotificationFor_CARTESIAN_PRODUCT()
    {
        Set<String> idents = new TreeSet<>();
        idents.add( "n" );
        idents.add( "node2" );
        NotificationDetail identifierDetail = NotificationDetail.Factory.cartesianProduct( idents );
        Notification notification = CARTESIAN_PRODUCT.notification( InputPosition.empty, identifierDetail );

        assertThat( notification.getTitle() ).isEqualTo( "This query builds a cartesian product between disconnected patterns." );
        assertThat( notification.getSeverity() ).isEqualTo( SeverityLevel.WARNING );
        assertThat( notification.getCode() ).isEqualTo( "Neo.ClientNotification.Statement.CartesianProductWarning" );
        assertThat( notification.getPosition() ).isEqualTo( InputPosition.empty );
        assertThat( notification.getDescription() ).isEqualTo(
                "If a part of a query contains multiple disconnected patterns, this will build a cartesian product " +
                        "between all those parts. This may produce a large amount of data and slow down query processing. While " +
                        "occasionally intended, it may often be possible to reformulate the query that avoids the use of this cross " +
                        "product, perhaps by adding a relationship between the different parts or by using OPTIONAL MATCH " + "(identifiers are: (n, node2))" );
    }

    @Test
    void shouldConstructNotificationsFor_JOIN_HINT_UNFULFILLABLE()
    {
        List<String> idents = new ArrayList<>();
        idents.add( "n" );
        idents.add( "node2" );
        NotificationDetail identifierDetail = NotificationDetail.Factory.joinKey(idents);
        Notification notification = JOIN_HINT_UNFULFILLABLE.notification( InputPosition.empty, identifierDetail );

        assertThat( notification.getTitle() ).isEqualTo( "The database was unable to plan a hinted join." );
        assertThat( notification.getSeverity() ).isEqualTo( SeverityLevel.WARNING );
        assertThat( notification.getCode() ).isEqualTo( "Neo.ClientNotification.Statement.JoinHintUnfulfillableWarning" );
        assertThat( notification.getPosition() ).isEqualTo( InputPosition.empty );
        assertThat( notification.getDescription() ).isEqualTo(
                "The hinted join was not planned. This could happen because no generated plan contained the join key, " +
                        "please try using a different join key or restructure your query. " + "(hinted join key identifiers are: n, node2)" );
    }

    @Test
    void shouldConstructNotificationsFor_DEPRECATED_PROCEDURE()
    {
        NotificationDetail identifierDetail = NotificationDetail.Factory.deprecatedName("oldName", "newName");
        Notification notification = DEPRECATED_PROCEDURE.notification( InputPosition.empty, identifierDetail );

        assertThat( notification.getTitle() ).isEqualTo( "This feature is deprecated and will be removed in future versions." );
        assertThat( notification.getSeverity() ).isEqualTo( SeverityLevel.WARNING );
        assertThat( notification.getCode() ).isEqualTo( "Neo.ClientNotification.Statement.FeatureDeprecationWarning" );
        assertThat( notification.getPosition() ).isEqualTo( InputPosition.empty );
        assertThat( notification.getDescription() ).isEqualTo( "The query used a deprecated procedure. ('oldName' has been replaced by 'newName')" );
    }

    @Test
    void shouldConstructNotificationsFor_DEPRECATED_PROCEDURE_with_no_newName()
    {
        NotificationDetail identifierDetail = NotificationDetail.Factory.deprecatedName("oldName", "");
        Notification notification = DEPRECATED_PROCEDURE.notification( InputPosition.empty, identifierDetail );

        assertThat( notification.getTitle() ).isEqualTo( "This feature is deprecated and will be removed in future versions." );
        assertThat( notification.getSeverity() ).isEqualTo( SeverityLevel.WARNING );
        assertThat( notification.getCode() ).isEqualTo( "Neo.ClientNotification.Statement.FeatureDeprecationWarning" );
        assertThat( notification.getPosition() ).isEqualTo( InputPosition.empty );
        assertThat( notification.getDescription() ).isEqualTo( "The query used a deprecated procedure. ('oldName' is no longer supported)" );
    }
}
