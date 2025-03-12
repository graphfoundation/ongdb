/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.impl.enterprise;

import org.eclipse.collections.api.IntIterable;
import org.eclipse.collections.api.set.primitive.LongSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import org.neo4j.collection.primitive.Primitive;
import org.neo4j.collection.primitive.PrimitiveIntIterator;
import org.neo4j.collection.primitive.PrimitiveIntObjectMap;
import org.neo4j.collection.primitive.PrimitiveIntSet;
import org.neo4j.internal.kernel.api.exceptions.schema.ConstraintValidationException;
import org.neo4j.internal.kernel.api.schema.LabelSchemaDescriptor;
import org.neo4j.internal.kernel.api.schema.RelationTypeSchemaDescriptor;
import org.neo4j.internal.kernel.api.schema.SchemaDescriptor;
import org.neo4j.internal.kernel.api.schema.SchemaProcessor;
import org.neo4j.internal.kernel.api.schema.constraints.ConstraintDescriptor;
import org.neo4j.kernel.api.exceptions.schema.NodePropertyExistenceException;
import org.neo4j.kernel.api.exceptions.schema.RelationshipPropertyExistenceException;
import org.neo4j.storageengine.api.StorageNodeCursor;
import org.neo4j.storageengine.api.StorageProperty;
import org.neo4j.storageengine.api.StoragePropertyCursor;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.StorageRelationshipScanCursor;
import org.neo4j.storageengine.api.txstate.ReadableTransactionState;
import org.neo4j.storageengine.api.txstate.TxStateVisitor;

import static java.lang.String.format;
import static java.util.Collections.emptyList;
import static org.neo4j.collection.primitive.PrimitiveArrays.union;
import static org.neo4j.internal.kernel.api.exceptions.schema.ConstraintValidationException.Phase.VALIDATION;

class PropertyExistenceEnforcer
{
    static PropertyExistenceEnforcer getOrCreatePropertyExistenceEnforcerFrom( StorageReader storageReader )
    {
        return storageReader.getOrCreateSchemaDependantState( PropertyExistenceEnforcer.class, FACTORY );
    }

    private final List<LabelSchemaDescriptor> nodeConstraints;
    private final List<RelationTypeSchemaDescriptor> relationshipConstraints;
    private final List<SchemaDescriptor> schemaConstraints;
    private final PrimitiveIntObjectMap<int[]> mandatoryNodePropertiesByLabel = Primitive.intObjectMap();
    private final PrimitiveIntObjectMap<int[]> mandatoryRelationshipPropertiesByType = Primitive.intObjectMap();

    private PropertyExistenceEnforcer( List<LabelSchemaDescriptor> nodes, List<RelationTypeSchemaDescriptor> rels, List<SchemaDescriptor> schemas )
    {
        this.nodeConstraints = nodes;
        this.relationshipConstraints = rels;
        this.schemaConstraints = schemas;
        for ( LabelSchemaDescriptor constraint : nodes )
        {
            update( mandatoryNodePropertiesByLabel, constraint.getLabelId(),
                    copyAndSortPropertyIds( constraint.getPropertyIds() ) );
        }
        for ( RelationTypeSchemaDescriptor constraint : rels )
        {
            update( mandatoryRelationshipPropertiesByType, constraint.getRelTypeId(),
                    copyAndSortPropertyIds( constraint.getPropertyIds() ) );
        }
    }

    private static void update( PrimitiveIntObjectMap<int[]> map, int key, int[] sortedValues )
    {
        int[] current = map.get( key );
        if ( current != null )
        {
            sortedValues = union( current, sortedValues );
        }
        map.put( key, sortedValues );
    }

    private static int[] copyAndSortPropertyIds( int[] propertyIds )
    {
        int[] values = new int[propertyIds.length];
        System.arraycopy( propertyIds, 0, values, 0, propertyIds.length );
        Arrays.sort( values );
        return values;
    }

    TxStateVisitor decorate( TxStateVisitor visitor, ReadableTransactionState txState, StorageReader storageReader )
    {
        return new Decorator( visitor, txState, storageReader );
    }

    private static final PropertyExistenceEnforcer NO_CONSTRAINTS = new PropertyExistenceEnforcer( emptyList(), emptyList(), emptyList() )
    {
        @Override
        TxStateVisitor decorate( TxStateVisitor visitor, ReadableTransactionState txState, StorageReader storageReader )
        {
            return visitor;
        }
    };
    private static final Function<StorageReader,PropertyExistenceEnforcer> FACTORY = storageReader ->
    {
        List<LabelSchemaDescriptor> nodes = new ArrayList<>();
        List<RelationTypeSchemaDescriptor> relationships = new ArrayList<>();
        List<SchemaDescriptor> schemas = new ArrayList<>();
        for ( Iterator<ConstraintDescriptor> constraints = storageReader.constraintsGetAll(); constraints.hasNext(); )
        {
            ConstraintDescriptor constraint = constraints.next();
            if ( constraint.enforcesPropertyExistence() )
            {
                constraint.schema().processWith( new SchemaProcessor()
                {
                    @Override
                    public void processSpecific( LabelSchemaDescriptor schema )
                    {
                        nodes.add( schema );
                    }

                    @Override
                    public void processSpecific( RelationTypeSchemaDescriptor schema )
                    {
                        relationships.add( schema );
                    }

                    @Override
                    public void processSpecific( SchemaDescriptor schema )
                    {
                        schemas.add( schema );
                    }
                } );
            }
        }
        if ( nodes.isEmpty() && relationships.isEmpty() && schemas.isEmpty() )
        {
            return NO_CONSTRAINTS;
        }
        return new PropertyExistenceEnforcer( nodes, relationships, schemas );
    };

    private class Decorator extends TxStateVisitor.Delegator
    {
        private final PrimitiveIntSet propertyKeyIds = Primitive.intSet();
        private final StorageReader storageReader;

        Decorator( TxStateVisitor next, ReadableTransactionState txState, StorageReader storageReader )
        {
            super( next );
            this.storageReader = storageReader;
        }

        @Override
        public void visitNodePropertyChanges( long id, Iterator<StorageProperty> added, Iterator<StorageProperty> changed, IntIterable removed )
                throws ConstraintValidationException
        {
            validateNode( id );
            super.visitNodePropertyChanges( id, added, changed, removed );
        }

        @Override
        public void visitNodeLabelChanges( long id, LongSet added, LongSet removed )
                throws ConstraintValidationException
        {
            validateNode( id );
            super.visitNodeLabelChanges( id, added, removed );
        }

        @Override
        public void visitCreatedRelationship( long id, int type, long startNode, long endNode )
                throws ConstraintValidationException
        {
            validateRelationship( id );
            super.visitCreatedRelationship( id, type, startNode, endNode );
        }

        @Override
        public void visitRelPropertyChanges( long id, Iterator<StorageProperty> added, Iterator<StorageProperty> changed, IntIterable removed )
                throws ConstraintValidationException
        {
            validateRelationship( id );
            super.visitRelPropertyChanges( id, added, changed, removed );
        }

        @Override
        public void close()
        {
            super.close();
            if ( storageReader != null )
            {
                storageReader.close();
            }
        }

        private void validateNode( long nodeId ) throws NodePropertyExistenceException
        {
            if ( mandatoryNodePropertiesByLabel.isEmpty() )
            {
                return;
            }

            long[] labelIds;
            try ( StorageNodeCursor node = node( nodeId ) )
            {
                if ( node.next() )
                {
                    labelIds = node.labels();
                    if ( labelIds.length == 0 )
                    {
                        return;
                    }
                    propertyKeyIds.clear();
                    try ( StoragePropertyCursor properties = properties( node ) )
                    {
                        while ( properties.next() )
                        {
                            propertyKeyIds.add( properties.propertyKey() );
                        }
                    }
                }
                else
                {
                    throw new IllegalStateException( format( "Node %d with changes should exist.", nodeId ) );
                }
            }

            validateNodeProperties( nodeId, labelIds, propertyKeyIds );
        }

        private void validateRelationship( long id ) throws RelationshipPropertyExistenceException
        {
            if ( mandatoryRelationshipPropertiesByType.isEmpty() )
            {
                return;
            }

            int relationshipType;
            int[] required;
            try ( StorageRelationshipScanCursor relationship = relationship( id ) )
            {
                if ( relationship.next() )
                {
                    relationshipType = relationship.type();
                    required = mandatoryRelationshipPropertiesByType.get( relationshipType );
                    if ( required == null )
                    {
                        return;
                    }
                    propertyKeyIds.clear();
                    try ( StoragePropertyCursor properties = properties( relationship ) )
                    {
                        while ( properties.next() )
                        {
                            propertyKeyIds.add( properties.propertyKey() );
                        }
                    }
                }
                else
                {
                    throw new IllegalStateException( format( "Relationship %d with changes should exist.", id ) );
                }
            }

            for ( int mandatory : required )
            {
                if ( !propertyKeyIds.contains( mandatory ) )
                {
                    failRelationship( id, relationshipType, mandatory );
                }
            }
        }

        private StorageNodeCursor node( long reference )
        {
            StorageNodeCursor cursor = storageReader.allocateNodeCursor();
            cursor.single( reference );
            return cursor;
        }

        private StorageRelationshipScanCursor relationship( long reference )
        {
            StorageRelationshipScanCursor cursor = storageReader.allocateRelationshipScanCursor();
            cursor.single( reference );
            return cursor;
        }

        private StoragePropertyCursor properties( StorageNodeCursor node )
        {
            StoragePropertyCursor cursor = storageReader.allocatePropertyCursor();
            cursor.init( node.propertiesReference() );
            return cursor;
        }

        private StoragePropertyCursor properties( StorageRelationshipScanCursor relationship )
        {
            StoragePropertyCursor cursor = storageReader.allocatePropertyCursor();
            cursor.init( relationship.propertiesReference() );
            return cursor;
        }
    }

    private void validateNodeProperties( long id, long[] labelIds, PrimitiveIntSet propertyKeyIds )
            throws NodePropertyExistenceException
    {
        if ( labelIds.length > mandatoryNodePropertiesByLabel.size() )
        {
            for ( PrimitiveIntIterator labels = mandatoryNodePropertiesByLabel.iterator(); labels.hasNext(); )
            {
                int label = labels.next();
                for ( long labelId : labelIds )
                {
                    if ( labelId == label )
                    {
                        validateNodeProperties( id, label, mandatoryNodePropertiesByLabel.get( label ), propertyKeyIds );
                    }
                }
            }
        }
        else
        {
            for ( long labelId : labelIds )
            {
                int label = (int) labelId;
                int[] keys = mandatoryNodePropertiesByLabel.get( label );
                if ( keys != null )
                {
                    validateNodeProperties( id, label, keys, propertyKeyIds );
                }
            }
        }
    }

    private void validateNodeProperties( long id, int label, int[] requiredKeys, PrimitiveIntSet propertyKeyIds ) throws NodePropertyExistenceException
    {
        for ( int key : requiredKeys )
        {
            if ( !propertyKeyIds.contains( key ) )
            {
                failNode( id, label, key );
            }
        }
    }

    private void failNode( long id, int label, int propertyKey ) throws NodePropertyExistenceException
    {
        for ( LabelSchemaDescriptor constraint : nodeConstraints )
        {
            if ( constraint.getLabelId() == label && contains( constraint.getPropertyIds(), propertyKey ) )
            {
                throw new NodePropertyExistenceException( constraint, VALIDATION, id );
            }
        }
        throw new IllegalStateException( format(
                "Node constraint for label=%d, propertyKey=%d should exist.",
                label, propertyKey ) );
    }

    private void failRelationship( long id, int relationshipType, int propertyKey ) throws RelationshipPropertyExistenceException
    {
        for ( RelationTypeSchemaDescriptor constraint : relationshipConstraints )
        {
            if ( constraint.getRelTypeId() == relationshipType && contains( constraint.getPropertyIds(), propertyKey ) )
            {
                throw new RelationshipPropertyExistenceException( constraint, VALIDATION, id );
            }
        }
        throw new IllegalStateException( format(
                "Relationship constraint for relationshipType=%d, propertyKey=%d should exist.",
                relationshipType, propertyKey ) );
    }

    private boolean contains( int[] list, int value )
    {
        for ( int x : list )
        {
            if ( value == x )
            {
                return true;
            }
        }
        return false;
    }
}
