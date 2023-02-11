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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.exceptions.KernelException;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.internal.kernel.api.exceptions.RelationshipTypeIdNotFoundKernelException;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.constraints.ConstraintDescriptorFactory;
import org.neo4j.internal.schema.constraints.NodeExistenceConstraintDescriptor;
import org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor;
import org.neo4j.internal.schema.constraints.RelExistenceConstraintDescriptor;
import org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.impl.api.state.TxState;
import org.neo4j.lock.LockTracer;
import org.neo4j.lock.ResourceLocker;
import org.neo4j.storageengine.api.CommandCreationContext;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.TransactionApplicationMode;
import org.neo4j.storageengine.api.TransactionIdStore;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.test.extension.EphemeralNeo4jLayoutExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.EphemeralPageCacheExtension;
import org.neo4j.test.storage.RecordStorageEngineSupport;
import org.neo4j.token.DelegatingTokenHolder;
import org.neo4j.token.TokenHolders;
import org.neo4j.token.api.TokenHolder;
import org.neo4j.token.api.TokenNotFoundException;
import org.neo4j.values.storable.Values;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.graphdb.Label.label;
import static org.neo4j.internal.schema.SchemaDescriptors.forLabel;
import static org.neo4j.internal.schema.SchemaDescriptors.forRelType;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

/**
 * Base class for disk layer tests, which test read-access to committed data.
 */
@EphemeralPageCacheExtension
@EphemeralNeo4jLayoutExtension
public abstract class RecordStorageReaderTestBase
{
    private static final ResourceLocker IGNORE_LOCKING = ResourceLocker.IGNORE;

    private final RecordStorageEngineSupport storageEngineRule = new RecordStorageEngineSupport();

    @Inject
    protected PageCache pageCache;
    @Inject
    private FileSystemAbstraction fs;
    @Inject
    private RecordDatabaseLayout databaseLayout;

    protected final Label label1 = label( "FirstLabel" );
    protected final Label label2 = label( "SecondLabel" );
    protected final RelationshipType relType1 = RelationshipType.withName( "type1" );
    protected final RelationshipType relType2 = RelationshipType.withName( "type2" );
    protected final String propertyKey = "name";
    protected final String otherPropertyKey = "age";
    private final AtomicLong nextTxId = new AtomicLong( TransactionIdStore.BASE_TX_ID );
    private TokenHolders tokenHolders;
    protected RecordStorageReader storageReader;
    protected RecordStorageEngine storageEngine;
    private RecordStorageReader commitReader;
    private CommandCreationContext commitContext;
    protected StoreCursors storageCursors;

    @BeforeEach
    public void before() throws Throwable
    {
        this.tokenHolders = new TokenHolders(
                new DelegatingTokenHolder( new SimpleTokenCreator(), TokenHolder.TYPE_PROPERTY_KEY ),
                new DelegatingTokenHolder( new SimpleTokenCreator(), TokenHolder.TYPE_LABEL ),
                new DelegatingTokenHolder( new SimpleTokenCreator(), TokenHolder.TYPE_RELATIONSHIP_TYPE ) );
        RecordStorageEngineSupport.Builder builder =
                storageEngineRule.getWith( fs, pageCache, databaseLayout ).tokenHolders( tokenHolders );

        builder = modify( builder );
        this.storageEngine = builder.build();
        this.storageReader = storageEngine.newReader();
        this.commitReader = storageEngine.newReader();
        this.commitContext = storageEngine.newCommandCreationContext( INSTANCE );
        storageCursors = storageEngine.createStorageCursors( NULL );
        commitContext.initialize( NULL, storageCursors );
        storageEngineRule.before();
    }

    @AfterEach
    public void after() throws Throwable
    {
        storageCursors.close();
        storageEngineRule.after( true );
    }

    protected RecordStorageEngineSupport.Builder modify( RecordStorageEngineSupport.Builder builder )
    {
        return builder;
    }

    protected long createNode( Map<String, Object> properties, Label... labels ) throws Exception
    {
        TxState txState = new TxState();
        long nodeId = commitContext.reserveNode();
        txState.nodeDoCreate( nodeId );
        for ( Label label : labels )
        {
            txState.nodeDoAddLabel( getOrCreateLabelId( label ), nodeId );
        }
        for ( Map.Entry<String,Object> property : properties.entrySet() )
        {
            txState.nodeDoAddProperty( nodeId, getOrCreatePropertyKeyId( property.getKey() ), Values.of( property.getValue() ) );
        }
        apply( txState );
        return nodeId;
    }

    protected void deleteNode( long nodeId ) throws Exception
    {
        TxState txState = new TxState();
        txState.nodeDoDelete( nodeId );
        apply( txState );
    }

    protected long createRelationship( long sourceNode, long targetNode, RelationshipType relationshipType ) throws Exception
    {
        TxState txState = new TxState();
        long relationshipId = commitContext.reserveRelationship( sourceNode );
        txState.relationshipDoCreate( relationshipId, getOrCreateRelationshipTypeId( relationshipType ), sourceNode, targetNode );
        apply( txState );
        return relationshipId;
    }

    protected void deleteRelationship( long relationshipId ) throws Exception
    {
        TxState txState = new TxState();
        try ( RecordRelationshipScanCursor cursor = commitReader.allocateRelationshipScanCursor( NULL, StoreCursors.NULL ) )
        {
            cursor.single( relationshipId );
            assertTrue( cursor.next() );
            txState.relationshipDoDelete( relationshipId, cursor.type(), cursor.getFirstNode(), cursor.getSecondNode() );
        }
        apply( txState );
    }

    protected IndexDescriptor createUniquenessConstraint( Label label, String propertyKey ) throws Exception
    {
        IndexDescriptor index = createUniqueIndex( label, propertyKey );
        TxState txState = new TxState();
        int labelId = getOrCreateLabelId( label );
        int propertyKeyId = getOrCreatePropertyKeyId( propertyKey );
        UniquenessConstraintDescriptor constraint = ConstraintDescriptorFactory.uniqueForLabel( labelId, propertyKeyId );
        constraint = constraint.withName( index.getName() ).withOwnedIndexId( index.getId() );
        txState.constraintDoAdd( constraint );
        apply( txState );
        return index;
    }

    protected void createNodeKeyConstraint( Label label, String propertyKey ) throws Exception
    {
        IndexDescriptor index = createUniqueIndex( label, propertyKey );
        TxState txState = new TxState();
        int labelId = getOrCreateLabelId( label );
        int propertyKeyId = getOrCreatePropertyKeyId( propertyKey );
        NodeKeyConstraintDescriptor constraint = ConstraintDescriptorFactory.nodeKeyForLabel( labelId, propertyKeyId );
        constraint = constraint.withName( index.getName() ).withOwnedIndexId( index.getId() );
        txState.constraintDoAdd( constraint );
        apply( txState );
    }

    private IndexDescriptor createUniqueIndex( Label label, String propertyKey ) throws Exception
    {
        TxState txState = new TxState();
        int labelId = getOrCreateLabelId( label );
        int propertyKeyId = getOrCreatePropertyKeyId( propertyKey );
        long id = commitContext.reserveSchema();
        IndexDescriptor index = IndexPrototype.uniqueForSchema( forLabel( labelId, propertyKeyId ) ).withName( "constraint_" + id ).materialise( id );
        txState.indexDoAdd( index );
        apply( txState );
        return index;
    }

    protected IndexDescriptor createIndex( Label label, String propertyKey ) throws Exception
    {
        TxState txState = new TxState();
        int labelId = getOrCreateLabelId( label );
        int propertyKeyId = getOrCreatePropertyKeyId( propertyKey );
        long id = commitContext.reserveSchema();
        IndexPrototype prototype = IndexPrototype.forSchema( forLabel( labelId, propertyKeyId ) ).withName( "index_" + id );
        IndexDescriptor index = prototype.materialise( id );
        txState.indexDoAdd( index );
        apply( txState );
        return index;
    }

    protected IndexDescriptor createIndex( RelationshipType relType, String propertyKey ) throws Exception
    {
        TxState txState = new TxState();
        int relTypeId = getOrCreateRelationshipTypeId( relType );
        int propertyKeyId = getOrCreatePropertyKeyId( propertyKey );
        long id = commitContext.reserveSchema();
        IndexPrototype prototype = IndexPrototype.forSchema( forRelType( relTypeId, propertyKeyId ) ).withName( "index_" + id );
        IndexDescriptor index = prototype.materialise( id );
        txState.indexDoAdd( index );
        apply( txState );
        return index;
    }

    protected void createNodePropertyExistenceConstraint( Label label, String propertyKey ) throws Exception
    {
        TxState txState = new TxState();
        NodeExistenceConstraintDescriptor constraint =
                ConstraintDescriptorFactory.existsForLabel( getOrCreateLabelId( label ), getOrCreatePropertyKeyId( propertyKey ) );
        long id = commitContext.reserveSchema();
        txState.constraintDoAdd( constraint.withId( id ).withName( "constraint_" + id ) );
        apply( txState );
    }

    protected void createRelPropertyExistenceConstraint( RelationshipType relationshipType, String propertyKey ) throws Exception
    {
        TxState txState = new TxState();
        RelExistenceConstraintDescriptor constraint =
                ConstraintDescriptorFactory.existsForRelType( getOrCreateRelationshipTypeId( relationshipType ), getOrCreatePropertyKeyId( propertyKey ) );
        long id = commitContext.reserveSchema();
        txState.constraintDoAdd( constraint.withId( id ).withName( "constraint_" + id ) );
        apply( txState );
    }

    private int getOrCreatePropertyKeyId( String propertyKey ) throws KernelException
    {
        return tokenHolders.propertyKeyTokens().getOrCreateId( propertyKey );
    }

    private int getOrCreateLabelId( Label label ) throws KernelException
    {
        return tokenHolders.labelTokens().getOrCreateId( label.name() );
    }

    private int getOrCreateRelationshipTypeId( RelationshipType relationshipType ) throws KernelException
    {
        return tokenHolders.relationshipTypeTokens().getOrCreateId( relationshipType.name() );
    }

    private void apply( TxState txState ) throws Exception
    {
        List<StorageCommand> commands = new ArrayList<>();
        long txId = nextTxId.incrementAndGet();
        storageEngine.createCommands( commands, txState, commitReader, commitContext, IGNORE_LOCKING, LockTracer.NONE, txId, state -> state, NULL,
                storageCursors, INSTANCE );
        storageEngine.apply( new GroupOfCommands( txId, storageCursors, commands.toArray( new StorageCommand[0] ) ), TransactionApplicationMode.EXTERNAL );
    }

    protected int labelId( Label label )
    {
        return tokenHolders.labelTokens().getIdByName( label.name() );
    }

    protected int relationshipTypeId( RelationshipType type )
    {
        return tokenHolders.relationshipTypeTokens().getIdByName( type.name() );
    }

    protected String relationshipType( int id ) throws KernelException
    {
        try
        {
            return tokenHolders.relationshipTypeTokens().getTokenById( id ).name();
        }
        catch ( TokenNotFoundException e )
        {
            throw new RelationshipTypeIdNotFoundKernelException( id, e );
        }
    }

    protected int propertyKeyId( String propertyKey )
    {
        return tokenHolders.propertyKeyTokens().getIdByName( propertyKey );
    }
}
