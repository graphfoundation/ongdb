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
package org.neo4j.consistency.checker;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

import org.neo4j.consistency.report.ConsistencyReport.RelationshipGroupConsistencyReport;
import org.neo4j.exceptions.KernelException;
import org.neo4j.internal.helpers.collection.LongRange;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.KernelTransaction;

import static org.mockito.ArgumentMatchers.any;

class RelationshipGroupCheckerTest extends CheckerTestBase
{
    private int type1;
    private int type2;
    private int type3;

    @Override
    void initialData( KernelTransaction tx ) throws KernelException
    {
        type1 = tx.tokenWrite().relationshipTypeGetOrCreateForName( "A" );
        type2 = tx.tokenWrite().relationshipTypeGetOrCreateForName( "B" );
        type3 = tx.tokenWrite().relationshipTypeGetOrCreateForName( "C" );
    }

    @Test
    void shouldReportRelationshipTypeNotInUse() throws Exception
    {
        testRelationshipGroupInconsistency(
                owner -> relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, owner, 999, NULL, NULL, NULL ),
                report -> report.relationshipTypeNotInUse( any() ) );
    }

    @Test
    void shouldReportNextGroupNotInUse() throws Exception
    {
        testRelationshipGroupInconsistency(
                owner -> relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), relationshipGroupStore.nextId( CursorContext.NULL ),
                        owner, type1, NULL, NULL, NULL ),
                RelationshipGroupConsistencyReport::nextGroupNotInUse );
    }

    @Test
    void shouldReportInvalidTypeSortOrder() throws Exception
    {
        testRelationshipGroupInconsistency( owner ->
        {
            long group1 = relationshipGroupStore.nextId( CursorContext.NULL );
            long group2 = relationshipGroupStore.nextId( CursorContext.NULL );
            long group3 = relationshipGroupStore.nextId( CursorContext.NULL );
            relationshipGroup( group1, group2, owner, type2, NULL, NULL, NULL );
            relationshipGroup( group2, group3, owner, type3, NULL, NULL, NULL );
            relationshipGroup( group3, NULL, owner, type1, NULL, NULL, NULL );
        }, RelationshipGroupConsistencyReport::invalidTypeSortOrder );
    }

    @Test
    void shouldReportFirstOutgoingRelationshipNotInUse() throws Exception
    {
        testRelationshipGroupInconsistency( owner -> relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, owner, type1,
                relationshipStore.nextId( CursorContext.NULL ), NULL, NULL ),
                RelationshipGroupConsistencyReport::firstOutgoingRelationshipNotInUse );
    }

    @Test
    void shouldReportFirstIncomingRelationshipNotInUse() throws Exception
    {
        testRelationshipGroupInconsistency( owner -> relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, owner, type1, NULL,
                relationshipStore.nextId( CursorContext.NULL ), NULL ),
                RelationshipGroupConsistencyReport::firstIncomingRelationshipNotInUse );
    }

    @Test
    void shouldReportFirstLoopRelationshipNotInUse() throws Exception
    {
        testRelationshipGroupInconsistency( owner -> relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, owner, type1, NULL, NULL,
                relationshipStore.nextId( CursorContext.NULL ) ),
                RelationshipGroupConsistencyReport::firstLoopRelationshipNotInUse );
    }

    @Test
    void shouldReportFirstOutgoingRelationshipNotFirstInChain() throws Exception
    {
        testRelationshipGroupInconsistency(
                owner ->
                {
                    long otherNode = nodePlusCached( nodeStore.nextId( CursorContext.NULL ), NULL, NULL );
                    long relationship =
                            relationship( relationshipStore.nextId( CursorContext.NULL ), owner, otherNode, type1, NULL, NULL, NULL, NULL, false, true );
                    relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, owner, type1, relationship, NULL, NULL );
                },
                RelationshipGroupConsistencyReport::firstOutgoingRelationshipNotFirstInChain );
    }

    @Test
    void shouldReportFirstIncomingRelationshipNotFirstInChain() throws Exception
    {
        testRelationshipGroupInconsistency(
                owner ->
                {
                    long otherNode = nodePlusCached( nodeStore.nextId( CursorContext.NULL ), NULL, NULL );
                    long relationship =
                            relationship( relationshipStore.nextId( CursorContext.NULL ), owner, otherNode, type1, NULL, NULL, NULL, NULL, true, false );
                    relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, owner, type1, NULL, relationship, NULL );
                },
                RelationshipGroupConsistencyReport::firstIncomingRelationshipNotFirstInChain );
    }

    @Test
    void shouldReportFirstLoopRelationshipNotFirstInChain() throws Exception
    {
        testRelationshipGroupInconsistency(
                owner ->
                {
                    long otherNode = nodePlusCached( nodeStore.nextId( CursorContext.NULL ), NULL, NULL );
                    long relationship =
                            relationship( relationshipStore.nextId( CursorContext.NULL ), owner, otherNode, type1, NULL, NULL, NULL, NULL, false, false );
                    relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, owner, type1, NULL, NULL, relationship );
                },
                RelationshipGroupConsistencyReport::firstLoopRelationshipNotFirstInChain );
    }

    @Test
    void shouldReportFirstOutgoingRelationshipOfOfOtherType() throws Exception
    {
        testRelationshipGroupInconsistency(
                owner ->
                {
                    long otherNode = nodePlusCached( nodeStore.nextId( CursorContext.NULL ), NULL, NULL );
                    long relationship =
                            relationship( relationshipStore.nextId( CursorContext.NULL ), owner, otherNode, type2, NULL, NULL, NULL, NULL, true, true );
                    relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, owner, type1, relationship, NULL, NULL );
                },
                RelationshipGroupConsistencyReport::firstOutgoingRelationshipOfOtherType );
    }

    @Test
    void shouldReportFirstIncomingRelationshipOfOfOtherType() throws Exception
    {
        testRelationshipGroupInconsistency(
                owner ->
                {
                    long otherNode = nodePlusCached( nodeStore.nextId( CursorContext.NULL ), NULL, NULL );
                    long relationship =
                            relationship( relationshipStore.nextId( CursorContext.NULL ), owner, otherNode, type2, NULL, NULL, NULL, NULL, true, true );
                    relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, owner, type1, NULL, relationship, NULL );
                },
                RelationshipGroupConsistencyReport::firstIncomingRelationshipOfOtherType );
    }

    @Test
    void shouldReportFirstLoopRelationshipOfOfOtherType() throws Exception
    {
        testRelationshipGroupInconsistency(
                owner ->
                {
                    long otherNode = nodePlusCached( nodeStore.nextId( CursorContext.NULL ), NULL, NULL );
                    long relationship =
                            relationship( relationshipStore.nextId( CursorContext.NULL ), owner, otherNode, type2, NULL, NULL, NULL, NULL, true, true );
                    relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, owner, type1, NULL, NULL, relationship );
                },
                RelationshipGroupConsistencyReport::firstLoopRelationshipOfOtherType );
    }

    @Test
    void shouldReportOwnerNotInUse() throws Exception
    {
        // given
        try ( AutoCloseable ignored = tx() )
        {
            relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, nodeStore.nextId( CursorContext.NULL ), type1, NULL, NULL,
                    NULL );
        }

        // when
        check();

        // then
        expect( RelationshipGroupConsistencyReport.class, RelationshipGroupConsistencyReport::ownerNotInUse );
    }

    @Test
    void shouldReportIllegalOwner() throws Exception
    {
        // given
        try ( AutoCloseable ignored = tx() )
        {
            relationshipGroup( relationshipGroupStore.nextId( CursorContext.NULL ), NULL, -1, type1, NULL, NULL, NULL );
        }

        // when
        check();

        // then
        expect( RelationshipGroupConsistencyReport.class, RelationshipGroupConsistencyReport::illegalOwner );
    }

    @Test
    void shouldReportNextHasOtherOwner() throws Exception
    {
        // given
        try ( AutoCloseable ignored = tx() )
        {
            long node1 = nodePlusCached( nodeStore.nextId( CursorContext.NULL ), NULL, NULL );
            long node2 = nodePlusCached( nodeStore.nextId( CursorContext.NULL ), NULL, NULL );
            long group1 = relationshipGroupStore.nextId( CursorContext.NULL );
            long group2 = relationshipGroupStore.nextId( CursorContext.NULL );
            relationshipGroup( group1, group2, node1, type1, NULL, NULL, NULL );
            relationshipGroup( group2, NULL, node2, type2, NULL, NULL, NULL );
        }

        // when
        check();

        // then
        expect( RelationshipGroupConsistencyReport.class, report -> report.nextHasOtherOwner( any() ) );
    }

    private void testRelationshipGroupInconsistency( LongConsumer groupCreator, Consumer<RelationshipGroupConsistencyReport> report ) throws Exception
    {
        // given
        try ( AutoCloseable ignored = tx() )
        {
            long owner = nodePlusCached( nodeStore.nextId( CursorContext.NULL ), NULL, NULL );
            groupCreator.accept( owner );
        }

        // when
        check();

        // then
        expect( RelationshipGroupConsistencyReport.class, report );
    }

    private void check() throws Exception
    {
        new RelationshipGroupChecker( context() ).check( LongRange.range( 0, nodeStore.getHighId() ), true, true );
    }
}
