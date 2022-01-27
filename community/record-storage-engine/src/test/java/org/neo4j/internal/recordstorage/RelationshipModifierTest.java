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
package org.neo4j.internal.recordstorage;

import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableLong;
import org.eclipse.collections.api.map.primitive.MutableLongObjectMap;
import org.eclipse.collections.impl.factory.primitive.LongObjectMaps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.neo4j.configuration.Config;
import org.neo4j.internal.counts.RelationshipGroupDegreesStore;
import org.neo4j.internal.helpers.Exceptions;
import org.neo4j.internal.id.IdSequence;
import org.neo4j.internal.recordstorage.FlatRelationshipModifications.RelationshipData;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.Record;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.lock.LockType;
import org.neo4j.lock.ResourceLocker;
import org.neo4j.lock.ResourceType;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.RelationshipDirection;
import org.neo4j.storageengine.api.StorageLocks;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.storageengine.api.txstate.ReadableTransactionState;
import org.neo4j.storageengine.api.txstate.RelationshipModifications;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;

import static java.lang.Integer.min;
import static java.util.Collections.singletonList;
import static org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.neo4j.internal.helpers.ArrayUtil.indexOf;
import static org.neo4j.internal.helpers.collection.Iterables.asSet;
import static org.neo4j.internal.recordstorage.Command.GroupDegreeCommand.combinedKeyOnGroupAndDirection;
import static org.neo4j.internal.recordstorage.FlatRelationshipModifications.creations;
import static org.neo4j.internal.recordstorage.FlatRelationshipModifications.deletions;
import static org.neo4j.internal.recordstorage.FlatRelationshipModifications.modifications;
import static org.neo4j.internal.recordstorage.FlatRelationshipModifications.relationship;
import static org.neo4j.internal.recordstorage.FlatRelationshipModifications.relationships;
import static org.neo4j.internal.recordstorage.FlatRelationshipModifications.singleCreate;
import static org.neo4j.internal.recordstorage.FlatRelationshipModifications.singleDelete;
import static org.neo4j.internal.recordstorage.RecordAccess.LoadMonitor.NULL_MONITOR;
import static org.neo4j.internal.recordstorage.RelationshipChainVisitor.relationshipCollector;
import static org.neo4j.kernel.impl.store.record.Record.NO_LABELS_FIELD;
import static org.neo4j.kernel.impl.store.record.Record.isNull;
import static org.neo4j.lock.LockTracer.NONE;
import static org.neo4j.lock.LockType.EXCLUSIVE;
import static org.neo4j.lock.ResourceLocker.IGNORE;
import static org.neo4j.lock.ResourceTypes.NODE;
import static org.neo4j.lock.ResourceTypes.RELATIONSHIP;
import static org.neo4j.lock.ResourceTypes.RELATIONSHIP_DELETE;
import static org.neo4j.lock.ResourceTypes.RELATIONSHIP_GROUP;
import static org.neo4j.storageengine.api.RelationshipDirection.INCOMING;
import static org.neo4j.storageengine.api.RelationshipDirection.LOOP;
import static org.neo4j.storageengine.api.RelationshipDirection.OUTGOING;

@ExtendWith( RandomExtension.class )
class RelationshipModifierTest
{
    private static final RelationshipDirection[] DIRECTIONS = {OUTGOING, INCOMING, LOOP};
    private static final Supplier<RelationshipDirection> OUT = () -> OUTGOING;
    private static final Supplier<RelationshipDirection> IN = () -> INCOMING;
    private static final long NULL = Record.NULL_REFERENCE.longValue();
    private static final int DENSE_THRESHOLD = 15;

    @Inject
    private RandomSupport random;

    private final Supplier<RelationshipDirection> RANDOM_DIRECTION = () -> random.among( DIRECTIONS );
    private RelationshipModifier modifier;
    private TrackingResourceLocker locks;
    private MapRecordStore store;
    private GroupUpdater groupUpdater;
    private long nextNodeId;
    private long nextRelationshipId;
    private Monitors monitors;
    private ReadableTransactionState txState;

    @BeforeEach
    void setUp()
    {
        RelationshipGroupGetter relationshipGroupGetter = new RelationshipGroupGetter( idSequence(), CursorContext.NULL );
        PropertyDeleter propertyDeleter =
                new PropertyDeleter( new PropertyTraverser(), null, null, NullLogProvider.getInstance(), Config.defaults(),
                        CursorContext.NULL, EmptyMemoryTracker.INSTANCE, StoreCursors.NULL );
        modifier = new RelationshipModifier( relationshipGroupGetter, propertyDeleter, DENSE_THRESHOLD - 1/*because the trigger happens on > */,
                true, CursorContext.NULL, EmptyMemoryTracker.INSTANCE );
        monitors = new Monitors( null, ( t, m ) ->
        {
            Exceptions.throwIfUnchecked( t );
            throw new RuntimeException( t );
        } );
        locks = new TrackingResourceLocker( random, monitors.newMonitor( TrackingResourceLocker.LockAcquisitionMonitor.class ) );
        txState = mock( ReadableTransactionState.class );
        store = new MapRecordStore();
        monitors.addMonitorListener( new LockVerificationMonitor( locks, txState, store ) );
        groupUpdater = new GroupUpdater( store );
    }

    @Test
    void sparseCreate()
    {
        // given
        long node1 = createEmptyNode();
        long node2 = createEmptyNode();

        // when
        modify( singleCreate( 99, 1, node1, node2 ) );

        // then
        locks.assertHasLock( NODE, EXCLUSIVE, node1 );
        locks.assertHasLock( RELATIONSHIP_GROUP, EXCLUSIVE, node1 );
        locks.assertHasLock( NODE, EXCLUSIVE, node2 );
        locks.assertHasLock( RELATIONSHIP_GROUP, EXCLUSIVE, node2 );
    }

    @Test
    void sparseThatConcurrentlyBecomesDenseCreate()
    {
        // given
        long node1 = createEmptyNode();
        long node2 = createEmptyNode();
        LockStoreChangerMonitor lockStoreChanger = new LockStoreChangerMonitor( store );
        monitors.addMonitorListener( lockStoreChanger );
        lockStoreChanger.on( NODE, EXCLUSIVE, node1, store ->
                createRelationships( generateRelationshipData( DENSE_THRESHOLD, node1, type( 1 ), RelationshipModifierTest.this::createEmptyNode, OUT ) ) );

        // when
        modify( singleCreate( 99, 1, node1, node2 ) );

        // then
        locks.assertNoLock( NODE, EXCLUSIVE, node1 );
        locks.assertNoLock( RELATIONSHIP_GROUP, EXCLUSIVE, node1 );
        locks.assertHasLock( NODE, EXCLUSIVE, node2 );
        assertThat( store.loadNode( node1 ).isDense() ).isTrue();
    }

    @Test
    void sparseDelete()
    {
        // given
        long node1 = createEmptyNode();
        long node2 = createEmptyNode();
        RelationshipData relationship = relationship( 99, 1, node1, node2 );
        createRelationships( singletonList( relationship ) );

        // when
        modify( singleDelete( relationship ) );

        // then
        locks.assertHasLock( NODE, EXCLUSIVE, node1 );
        locks.assertNoLock( RELATIONSHIP_GROUP, EXCLUSIVE, node1 );
        locks.assertHasLock( NODE, EXCLUSIVE, node2 );
        locks.assertNoLock( RELATIONSHIP_GROUP, EXCLUSIVE, node2 );
    }

    @Test
    void denseNoChainCreate()
    {
        // given
        long node = createEmptyNode();
        createRelationships( generateRelationshipData( DENSE_THRESHOLD, node, type( 1 ), this::createEmptyNode, OUT ) );
        assertThat( store.loadNode( node ).isDense() ).isTrue();

        // when
        modify( singleCreate( relationship( nextRelationshipId(), 2, node, createEmptyNode() ) ) );

        // then
        locks.assertHasLock( NODE, EXCLUSIVE, node );
        locks.assertHasLock( RELATIONSHIP_GROUP, EXCLUSIVE, node );
    }

    @Test
    void denseSomeTypeExistSomeNotCreate()
    {
        // given
        long node = createEmptyNode();
        createRelationships( generateRelationshipData( DENSE_THRESHOLD * 3, node, alternatingTypes( 1, 3 ), this::createEmptyNode, OUT ) );

        // when
        modify( creations(
                relationship( nextRelationshipId(), 1, node, createEmptyNode() ),
                relationship( nextRelationshipId(), 2, node, createEmptyNode() ),
                relationship( nextRelationshipId(), 3, node, createEmptyNode() ) ) );

        // then
        locks.assertHasLock( NODE, EXCLUSIVE, node );
        locks.assertHasLock( RELATIONSHIP_GROUP, EXCLUSIVE, node );
    }

    @Test
    void denseMultipleTypesCreate()
    {
        // given
        long node = createEmptyNode();
        createRelationships( generateRelationshipData( DENSE_THRESHOLD * 3, node, alternatingTypes( 0, 1, 2 ), this::createEmptyNode, OUT ) );

        // when
        modify( creations(
                relationship( nextRelationshipId(), 0, node, createEmptyNode() ),
                relationship( nextRelationshipId(), 1, node, createEmptyNode() ),
                relationship( nextRelationshipId(), 2, node, createEmptyNode() ) ) );

        // then
        locks.assertNoLock( NODE, EXCLUSIVE, node );
        locks.assertNoLock( RELATIONSHIP_GROUP, EXCLUSIVE, node );
    }

    @Test
    void denseEmptyChainCreate()
    {
        // given
        long node = createEmptyNode();
        createRelationships( generateRelationshipData( DENSE_THRESHOLD, node, type( 1 ), this::createEmptyNode, OUT ) );

        // when
        modify( singleCreate( relationship( nextRelationshipId(), 1, createEmptyNode(), node ) ) );

        // then
        locks.assertNoLock( NODE, EXCLUSIVE, node );
        locks.assertHasLock( RELATIONSHIP_GROUP, EXCLUSIVE, node );
    }

    @Test
    void denseChainBelowExternalDegreesThresholdCreate()
    {
        // given
        long node = createEmptyNode();
        createRelationships( generateRelationshipData( DENSE_THRESHOLD, node, type( 1 ), this::createEmptyNode, OUT ) );
        createRelationships( generateRelationshipData( 1, node, type( 1 ), this::createEmptyNode, IN ) );

        // when
        modify( singleCreate( relationship( nextRelationshipId(), 1, createEmptyNode(), node ) ) );

        // then
        locks.assertNoLock( NODE, EXCLUSIVE, node );
        locks.assertHasLock( RELATIONSHIP_GROUP, EXCLUSIVE, node );
    }

    @Test
    void denseCreate()
    {
        // given
        long node = createEmptyNode();
        int numRelationships = DENSE_THRESHOLD * 2;
        createRelationships( generateRelationshipData( numRelationships, node, type( 1 ), this::createEmptyNode, OUT ) );
        assertThat( groupUpdater.degree( node, 1, OUTGOING ) ).isEqualTo( numRelationships );

        // when
        modify( singleCreate( relationship( nextRelationshipId(), 1, node, createEmptyNode() ) ) );

        // then
        assertThat( groupUpdater.degree( node, 1, OUTGOING ) ).isEqualTo( numRelationships + 1 );
        locks.assertNoLock( NODE, EXCLUSIVE, node );
        locks.assertNoLock( RELATIONSHIP_GROUP, EXCLUSIVE, node );
    }

    @Test
    void denseCreateAndDelete()
    {
        // given
        long node = createEmptyNode();
        Collection<RelationshipData> initialRelationships = generateRelationshipData( DENSE_THRESHOLD * 2, node, type( 1 ), this::createEmptyNode, OUT );
        createRelationships( initialRelationships );

        // when
        modify( modifications(
                relationships( relationship( nextRelationshipId(), 1, node, createEmptyNode() ) ),
                relationships( findRelationship( initialRelationships, node, false ) ) ) );

        // then
        locks.assertNoLock( NODE, EXCLUSIVE, node );
        locks.assertNoLock( RELATIONSHIP_GROUP, EXCLUSIVE, node );
    }

    @Test
    void denseDeleteFirstInChain()
    {
        // given
        long node = createEmptyNode();
        Collection<RelationshipData> initialRelationships = generateRelationshipData( DENSE_THRESHOLD * 2, node, type( 1 ), this::createEmptyNode, OUT );
        createRelationships( initialRelationships );
        assertThat( groupUpdater.degree( node, 1, OUTGOING ) ).isEqualTo( initialRelationships.size() );

        // when
        modify( deletions( relationships( findRelationship( initialRelationships, node, true ) ) ) );

        // then
        assertThat( groupUpdater.degree( node, 1, OUTGOING ) ).isEqualTo( initialRelationships.size() - 1 );
        locks.assertNoLock( NODE, EXCLUSIVE, node );
        locks.assertHasLock( RELATIONSHIP_GROUP, EXCLUSIVE, node );
    }

    // ... other known cases ...

    @RepeatedTest( 20 )
    void shouldCreateAndDelete()
    {
        // given and initial state
        long node = createEmptyNode();
        IntSupplier typeStrategy = randomTypes( 10 );
        Supplier<RelationshipDirection> directionStrategy = RANDOM_DIRECTION;
        LongSupplier otherNodeStrategy = this::createEmptyNode;
        int maxRelationships = 100;
        List<RelationshipData> expectedRelationships =
                generateRelationshipData( random.nextInt( 0, maxRelationships ), node, typeStrategy, otherNodeStrategy, directionStrategy );
        createRelationships( expectedRelationships );

        // ... a set of relationships to create and delete
        List<RelationshipData> relationshipsToCreate =
                generateRelationshipData( (int) random.among( new long[]{0, 1, 10, 100} ), node, typeStrategy, otherNodeStrategy, directionStrategy );
        int numRelationshipsToDelete = min( (int) random.among( new long[]{0, 1, 10, maxRelationships} ), expectedRelationships.size() );
        RelationshipData[] relationshipsToDelete =
                random.selection( expectedRelationships.toArray( RelationshipData[]::new ), numRelationshipsToDelete, numRelationshipsToDelete, false );

        // ... and rules for how the world changes "concurrently" while we perform these modifications
        // on locked
        monitors.addMonitorListener( new ResourceTypeLockOrderVerifier() );
        // on read
        monitors.addMonitorListener( new ChangeWorldOnReadMonitor( node, typeStrategy, otherNodeStrategy, directionStrategy, expectedRelationships ) );

        // when
        RelationshipModifications modifications = modifications( relationshipsToCreate.toArray( RelationshipData[]::new ), relationshipsToDelete );
        modify( modifications );
        applyModificationsToExpectedRelationships( modifications, expectedRelationships );

        // then
        assertThat( readRelationshipsFromStore( node, store ) ).isEqualTo( asSet( expectedRelationships ) );
    }

    @Test
    void shouldUpgradeToDenseEvenOnMismatchingDegree()
    {
        // given
        long node = createEmptyNode();
        long node2 = createEmptyNode();
        int numRels = 10;
        createRelationships( generateRelationshipData( numRels, node, () -> 0, () -> node2, () -> OUTGOING ) );
        NodeRecord nodeRecord = store.loadNode( node );
        assertThat( nodeRecord.isDense() ).isFalse();
        RelationshipRecord relationshipRecord = store.loadRelationship( nodeRecord.getNextRel() );
        // change the degree of 'node' to something less than what it really is
        assertThat( relationshipRecord.getPrevRel( node ) ).isEqualTo( numRels );
        relationshipRecord.setPrevRel( numRels / 2, node );
        store.write( relationshipRecord );

        // when
        createRelationships( generateRelationshipData( 100, node, () -> 1, () -> node2, () -> OUTGOING ) );

        // then
        assertThat( store.loadNode( node ).isDense() ).isTrue();
    }

    private static Set<RelationshipData> readRelationshipsFromStore( long node, MapRecordStore store )
    {
        Set<RelationshipData> relationships = new HashSet<>();
        store.relationshipChainVisitor().visit( node,
                relationshipCollector( r -> relationships.add( new RelationshipData( r.getId(), r.getType(), r.getFirstNode(), r.getSecondNode() ) ) ) );
        return relationships;
    }

    private RelationshipData findRelationship( Collection<RelationshipData> relationships, long node, Boolean firstInChain )
    {
        Stream<RelationshipData> stream = relationships.stream().filter( isFreeToLock() );
        if ( firstInChain != null )
        {
            stream = stream.filter( rel -> store.loadRelationship( rel.id ).isFirstInChain( node ) == firstInChain );
        }
        return stream.findFirst().orElse( null );
    }

    private Predicate<RelationshipData> isFreeToLock()
    {
        return rel ->
        {
            if ( relationshipIsLocked( rel.id ) )
            {
                return false;
            }
            RelationshipRecord record = store.loadRelationship( rel.id );
            return (record.isFirstInFirstChain() || !relationshipIsLocked( record.getFirstPrevRel() )) &&
                    (isNull( record.getFirstNextRel() ) || !relationshipIsLocked( record.getFirstNextRel() )) &&
                    (record.isFirstInSecondChain() || !relationshipIsLocked( record.getSecondPrevRel() )) &&
                    (isNull( record.getSecondNextRel() ) || !relationshipIsLocked( record.getSecondNextRel() ));
        };
    }

    private boolean relationshipIsLocked( long id )
    {
        return locks.hasLock( RELATIONSHIP, id ) || locks.hasLock( RELATIONSHIP_DELETE, id );
    }

    private void modify( RelationshipModifications modifications, RecordAccess.LoadMonitor loadMonitor, MapRecordStore.Monitor readMonitor,
            ResourceLocker locks )
    {
        // Acquire the "external" locks that the RelationshipModifier rely on when making decisions internally
        StorageLocks context = new RecordStorageLocks( locks );
        modifications.creations().forEach(
                ( id, type, start, end, addedProperties ) -> context.acquireRelationshipCreationLock( txState, NONE, start, end ) );
        modifications.deletions().forEach(
                ( id, type, start, end, noProperties ) -> context.acquireRelationshipDeletionLock( txState, NONE, start, end, id ) );

        RecordAccessSet changes = store.newRecordChanges( loadMonitor, readMonitor );
        modifier.modifyRelationships( modifications, changes, groupUpdater, locks, NONE );
        // Apply those changes back to our map store
        changes.getNodeRecords().changes().forEach( change -> store.write( change.forReadingLinkage() ) );
        changes.getRelRecords().changes().forEach( change -> store.write( change.forReadingLinkage() ) );
        changes.getRelGroupRecords().changes().forEach( change -> store.write( change.forReadingLinkage() ) );
    }

    private void modify( RelationshipModifications modifications )
    {
        modify( modifications, monitors.newMonitor( RecordAccess.LoadMonitor.class ), monitors.newMonitor( MapRecordStore.Monitor.class ), locks );
    }

    private void createRelationships( Collection<RelationshipData> relationships )
    {
        modify( creations( relationships.toArray( RelationshipData[]::new ) ), NULL_MONITOR, MapRecordStore.Monitor.NULL,
                IGNORE );
    }

    private List<RelationshipData> generateRelationshipData( int count, long node, IntSupplier typeStrategy, LongSupplier otherNodeStrategy,
            Supplier<RelationshipDirection> directionStrategy )
    {
        List<RelationshipData> relationships = new ArrayList<>( count );
        for ( int i = 0; i < count; i++ )
        {
            long otherNode = otherNodeStrategy.getAsLong();
            RelationshipDirection direction = directionStrategy.get();
            long start = direction == OUTGOING || direction == LOOP ? node : otherNode;
            long end = direction == INCOMING || direction == LOOP ? node : otherNode;
            relationships.add( new RelationshipData( nextRelationshipId(), typeStrategy.getAsInt(), start, end ) );
        }
        return relationships;
    }

    private long createEmptyNode()
    {
        long id = nextNodeId();
        store.write( new NodeRecord( id ).initialize( true, NULL, false, NULL, NO_LABELS_FIELD.longValue() ) );
        return id;
    }

    private long nextNodeId()
    {
        return nextNodeId++;
    }

    private long nextRelationshipId()
    {
        return nextRelationshipId++;
    }

    private static IntSupplier type( int type )
    {
        return () -> type;
    }

    private IntSupplier randomTypes( int numTypes )
    {
        return () -> random.nextInt( numTypes );
    }

    private static IntSupplier alternatingTypes( int... types )
    {
        return new IntSupplier()
        {
            private int count;

            @Override
            public int getAsInt()
            {
                int c = count++;
                return types[c % types.length];
            }
        };
    }

    private static IdSequence idSequence()
    {
        AtomicLong nextId = new AtomicLong();
        return cursorContext -> nextId.getAndIncrement();
    }

    private static void applyModificationsToExpectedRelationships( RelationshipModifications modifications, List<RelationshipData> expectedRelationships )
    {
        modifications.creations().forEach( ( relationshipId, typeId, startNodeId, endNodeId, addedProperties ) -> expectedRelationships.add(
                new RelationshipData( relationshipId, typeId, startNodeId, endNodeId ) ) );
        modifications.deletions().forEach( ( relationshipId, typeId, startNodeId, endNodeId, noProperties ) -> expectedRelationships.remove(
                new RelationshipData( relationshipId, typeId, startNodeId, endNodeId ) ) );
    }

    private static class GroupUpdater implements RelationshipGroupDegreesStore.Updater
    {
        // nodeId, direction, degree
        private final MutableLongObjectMap<MutableLong> degrees = LongObjectMaps.mutable.empty();
        private final MapRecordStore store;

        GroupUpdater( MapRecordStore store )
        {
            this.store = store;
        }

        @Override
        public void increment( long groupId, RelationshipDirection direction, long delta )
        {
            degrees.getIfAbsentPut( combinedKeyOnGroupAndDirection( groupId, direction ), MutableLong::new ).add( delta );
        }

        long degree( long nodeId, int type, RelationshipDirection direction )
        {
            RelationshipGroupRecord group =
                    store.loadRelationshipGroups().filter( g -> g.getOwningNode() == nodeId && g.getType() == type ).findFirst().orElseThrow();
            return degrees.get( combinedKeyOnGroupAndDirection( group.getId(), direction ) ).longValue();
        }

        @Override
        public void close()
        {
        }
    }

    private static class LockStoreChangerMonitor implements TrackingResourceLocker.LockAcquisitionMonitor
    {
        private final Map<ResourceKey,Consumer<MapRecordStore>> changers = new HashMap<>();
        private final MapRecordStore store;

        LockStoreChangerMonitor( MapRecordStore store )
        {
            this.store = store;
        }

        LockStoreChangerMonitor on( ResourceType resourceType, LockType lockType, long resourceId, Consumer<MapRecordStore> change )
        {
            changers.put( new ResourceKey( resourceType, lockType, resourceId ), change );
            return this;
        }

        @Override
        public void lockAcquired( ResourceType resourceType, LockType lockType, long resourceId, boolean tryLocked )
        {
            Consumer<MapRecordStore> changer = changers.get( new ResourceKey( resourceType, lockType, resourceId ) );
            if ( changer != null )
            {
                changer.accept( store );
            }
        }

        @Override
        public void lockReleased( ResourceType resourceType, LockType lockType, long resourceId, boolean wasTheLastOne )
        {
        }
    }

    private static class ResourceKey
    {
        private final ResourceType resourceType;
        private final LockType lockType;
        private final long resourceId;

        ResourceKey( ResourceType resourceType, LockType lockType, long resourceId )
        {
            this.resourceType = resourceType;
            this.lockType = lockType;
            this.resourceId = resourceId;
        }

        @Override
        public boolean equals( Object o )
        {
            if ( this == o )
            {
                return true;
            }
            if ( o == null || getClass() != o.getClass() )
            {
                return false;
            }
            ResourceKey that = (ResourceKey) o;
            return resourceId == that.resourceId && resourceType.equals( that.resourceType ) && lockType == that.lockType;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash( resourceType, lockType, resourceId );
        }
    }

    private class ResourceTypeLockOrderVerifier implements TrackingResourceLocker.LockAcquisitionMonitor
    {
        private final ResourceType[] expectedLockOrderByType = {NODE, RELATIONSHIP_GROUP, RELATIONSHIP};
        private final MutableLongObjectMap<MutableInt> lockIndexPerNode = LongObjectMaps.mutable.empty();
        private boolean anyRelationshipLockAcquired;

        @Override
        public void lockAcquired( ResourceType resourceType, LockType lockType, long resourceId, boolean tryLocked )
        {
            int index = index( resourceType );
            if ( tryLocked )
            {
                if ( index == -1 )
                {
                    // Some locks that gets acquired are about group deletion and other things... those are try-locked so let's not assert on those
                    return;
                }
            }
            else
            {
                if ( resourceType != RELATIONSHIP )
                {
                    // NODE/RELATIONSHIP_GROUP locks all need to be acquired before any RELATIONSHIP locks
                    assertThat( anyRelationshipLockAcquired ).isFalse();
                }
            }

            for ( long node : nodesAffectedByLock( resourceType, resourceId ) )
            {
                MutableInt lastIndex = lockIndexPerNode.getIfAbsentPut( node, () -> new MutableInt( -1 ) );
                if ( !tryLocked )
                {
                    assertThat( index ).as( "Acquired [%s,%s,%d] out of order, resource-type-wise", resourceType, lockType, resourceId )
                            .isGreaterThanOrEqualTo( lastIndex.intValue() );
                }
                lastIndex.setValue( index );
            }
            if ( resourceType == RELATIONSHIP )
            {
                anyRelationshipLockAcquired = true;
            }
        }

        @Override
        public void lockReleased( ResourceType resourceType, LockType lockType, long resourceId, boolean wasTheLastOne )
        {
            if ( wasTheLastOne )
            {
                for ( long node : nodesAffectedByLock( resourceType, resourceId ) )
                {
                    MutableInt lastIndex = lockIndexPerNode.get( node );
                    lastIndex.decrement();
                }
            }
        }

        private int index( ResourceType resourceType )
        {
            return indexOf( expectedLockOrderByType, resourceType );
        }

        private long[] nodesAffectedByLock( ResourceType resourceType, long resourceId )
        {
            if ( resourceType == NODE || resourceType == RELATIONSHIP_GROUP )
            {
                return new long[]{resourceId};
            }
            if ( resourceType == RELATIONSHIP )
            {
                RelationshipRecord relationship = store.loadRelationship( resourceId );
                return new long[]{relationship.getFirstNode(), relationship.getSecondNode()};
            }
            return EMPTY_LONG_ARRAY;
        }
    }

    private class ChangeWorldOnReadMonitor implements MapRecordStore.Monitor
    {
        private final long node;
        private final IntSupplier typeStrategy;
        private final LongSupplier otherNodeStrategy;
        private final Supplier<RelationshipDirection> directionStrategy;
        private final List<RelationshipData> expectedRelationships;

        ChangeWorldOnReadMonitor( long node, IntSupplier typeStrategy, LongSupplier otherNodeStrategy, Supplier<RelationshipDirection> directionStrategy,
                List<RelationshipData> expectedRelationships )
        {
            this.node = node;
            this.typeStrategy = typeStrategy;
            this.otherNodeStrategy = otherNodeStrategy;
            this.directionStrategy = directionStrategy;
            this.expectedRelationships = expectedRelationships;
        }

        @Override
        public void nodeWasRead( NodeRecord record )
        {
            if ( record.getId() == node )
            {
                changeTheWorldWithinTheBoundsOfWhatWeAreAllowedTo();
            }
        }

        @Override
        public void relationshipWasRead( RelationshipRecord record )
        {
            changeTheWorldWithinTheBoundsOfWhatWeAreAllowedTo();
        }

        @Override
        public void relationshipGroupWasRead( RelationshipGroupRecord record )
        {
            if ( record.getOwningNode() == node )
            {
                changeTheWorldWithinTheBoundsOfWhatWeAreAllowedTo();
            }
        }

        private void changeTheWorldWithinTheBoundsOfWhatWeAreAllowedTo()
        {
            if ( locks.hasLock( NODE, EXCLUSIVE, node ) || locks.hasLock( RELATIONSHIP_GROUP, EXCLUSIVE, node ) )
            {
                return;
            }
            int numChanges = random.nextInt( 0, 3 );
            for ( int i = 0; i < numChanges; i++ )
            {
                boolean create = random.nextBoolean();
                RelationshipModifications modifications = null;
                if ( create )
                {
                    List<RelationshipData> newRelationships = generateRelationshipData( 1, node, typeStrategy, otherNodeStrategy, directionStrategy );
                    modifications = creations( newRelationships.toArray( RelationshipData[]::new ) );
                }
                else if ( expectedRelationships.size() > 1 )
                {
                    RelationshipData relationshipToDelete = findRelationship( expectedRelationships, node, null );
                    if ( relationshipToDelete != null )
                    {
                        modifications = deletions( relationshipToDelete );
                    }
                }

                if ( modifications != null )
                {
                    // Perform these creations/deletions with none of these monitors that themselves change the world,
                    // but with a view of the current locks that this main "transaction" has, so that the choices this inner
                    // transaction makes doesn't violate any contract that a real lock manager would uphold.
                    // Also we don't want the locks acquired to be registered in our lock tracker, which we will assert on later on.
                    try
                    {
                        modify( modifications, NULL_MONITOR, NULL, locks.sortOfReadOnlyView() );
                        applyModificationsToExpectedRelationships( modifications, expectedRelationships );
                    }
                    catch ( TrackingResourceLocker.AlreadyLockedException e )
                    {
                        // We tried. This is thrown from the sort-of-read-only view of the locker when doing creations in this inner transaction
                        // and whereas it could have been avoided by carefully looking at the chains and spotting whether or not there were
                        // any available entry points, it would have meant more mirroring of logic from the RelationshipModifier.
                        // For deletions it's easier and this test filters out candidates for deletion that are locked or for chains that are too short.
                    }
                }
            }
        }
    }
}
