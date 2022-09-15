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
package org.neo4j.kernel.impl.constraints;

import org.neo4j.annotations.service.ServiceProvider;
import org.neo4j.common.TokenNameLookup;
import org.neo4j.internal.kernel.api.CursorFactory;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.NodeLabelIndexCursor;
import org.neo4j.internal.kernel.api.PropertyCursor;
import org.neo4j.internal.kernel.api.Read;
import org.neo4j.internal.kernel.api.RelationshipScanCursor;
import org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor;
import org.neo4j.internal.kernel.api.exceptions.schema.CreateConstraintFailureException;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.LabelSchemaDescriptor;
import org.neo4j.internal.schema.RelationTypeSchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.internal.schema.constraints.ConstraintDescriptorFactory;
import org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor;
import org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.StandardConstraintRuleAccessor;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.txstate.ReadableTransactionState;
import org.neo4j.storageengine.api.txstate.TxStateVisitor;

@ServiceProvider
public class StandardConstraintSemantics extends ConstraintSemantics
{
    public static final String ERROR_MESSAGE_EXISTS = "Property existence constraint requires ONgDB Enterprise Edition";
    public static final String ERROR_MESSAGE_NODE_KEY = "Node Key constraint requires ONgDB Enterprise Edition";

    protected final StandardConstraintRuleAccessor accessor = new StandardConstraintRuleAccessor();

    public StandardConstraintSemantics()
    {
        this( 1 );
    }

    protected StandardConstraintSemantics( int priority )
    {
        super( priority );
    }

    @Override
    public String getName()
    {
        return "standardConstraints";
    }

    @Override
    public void assertNodeKeyConstraintAllowed( LabelSchemaDescriptor descriptor )
            throws CreateConstraintFailureException
    {
        throw nodeKeyConstraintsNotAllowed( descriptor );
    }

    @Override
    public void validateNodeKeyConstraint( NodeLabelIndexCursor allNodes, NodeCursor nodeCursor, PropertyCursor propertyCursor,
            LabelSchemaDescriptor descriptor, TokenNameLookup tokenNameLookup ) throws CreateConstraintFailureException
    {
        throw nodeKeyConstraintsNotAllowed( descriptor );
    }

    @Override
    public void validateNodePropertyExistenceConstraint( NodeLabelIndexCursor allNodes, NodeCursor nodeCursor, PropertyCursor propertyCursor,
            LabelSchemaDescriptor descriptor, TokenNameLookup tokenNameLookup ) throws CreateConstraintFailureException
    {
        throw propertyExistenceConstraintsNotAllowed( descriptor );
    }

    @Override
    public void validateRelationshipPropertyExistenceConstraint( RelationshipScanCursor relationshipCursor, PropertyCursor propertyCursor,
            RelationTypeSchemaDescriptor descriptor, TokenNameLookup tokenNameLookup )  throws CreateConstraintFailureException
    {
        throw propertyExistenceConstraintsNotAllowed( descriptor );
    }

    @Override
    public void validateRelationshipPropertyExistenceConstraint( RelationshipTypeIndexCursor allRelationships, RelationshipScanCursor relationshipCursor,
            PropertyCursor propertyCursor, RelationTypeSchemaDescriptor descriptor, TokenNameLookup tokenNameLookup ) throws CreateConstraintFailureException
    {
        throw propertyExistenceConstraintsNotAllowed( descriptor );
    }

    @Override
    public ConstraintDescriptor readConstraint( ConstraintDescriptor constraint )
    {
        switch ( constraint.type() )
        {
        case EXISTS:
            return readNonStandardConstraint( constraint, ERROR_MESSAGE_EXISTS );
        case UNIQUE_EXISTS:
            return readNonStandardConstraint( constraint, ERROR_MESSAGE_NODE_KEY );
        default:
            return constraint;
        }
    }

    protected ConstraintDescriptor readNonStandardConstraint( ConstraintDescriptor constraint, String errorMessage )
    {
        // When opening a store in Community Edition that contains a Property Existence Constraint
        throw new IllegalStateException( errorMessage );
    }

    private static CreateConstraintFailureException propertyExistenceConstraintsNotAllowed( SchemaDescriptor descriptor )
    {
        // When creating a Property Existence Constraint in Community Edition
        return new CreateConstraintFailureException(
                ConstraintDescriptorFactory.existsForSchema( descriptor ), ERROR_MESSAGE_EXISTS );
    }

    private static CreateConstraintFailureException nodeKeyConstraintsNotAllowed( SchemaDescriptor descriptor )
    {
        // When creating a Node Key Constraint in Community Edition
        return new CreateConstraintFailureException(
                ConstraintDescriptorFactory.existsForSchema( descriptor ), ERROR_MESSAGE_NODE_KEY );
    }

    @Override
    public ConstraintDescriptor createUniquenessConstraintRule(
            long ruleId, UniquenessConstraintDescriptor descriptor, long indexId )
    {
        return accessor.createUniquenessConstraintRule( ruleId, descriptor, indexId );
    }

    @Override
    public ConstraintDescriptor createNodeKeyConstraintRule(
            long ruleId, NodeKeyConstraintDescriptor descriptor, long indexId ) throws CreateConstraintFailureException
    {
        throw nodeKeyConstraintsNotAllowed( descriptor.schema() );
    }

    @Override
    public ConstraintDescriptor createExistenceConstraint( long ruleId, ConstraintDescriptor descriptor )
            throws CreateConstraintFailureException
    {
        throw propertyExistenceConstraintsNotAllowed( descriptor.schema() );
    }

    @Override
    public TxStateVisitor decorateTxStateVisitor( StorageReader storageReader, Read read, CursorFactory cursorFactory, ReadableTransactionState state,
            TxStateVisitor visitor, CursorContext cursorContext, MemoryTracker memoryTracker )
    {
        return visitor;
    }

    @Override
    public void validateNodePropertyExistenceConstraint( NodeCursor nodeCursor, PropertyCursor propertyCursor, LabelSchemaDescriptor descriptor,
                                                         TokenNameLookup tokenNameLookup ) throws CreateConstraintFailureException
    {
        throw propertyExistenceConstraintsNotAllowed( descriptor );
    }

    @Override
    public void validateNodeKeyConstraint( NodeCursor nodeCursor, PropertyCursor propertyCursor, LabelSchemaDescriptor descriptor,
                                           TokenNameLookup tokenNameLookup ) throws CreateConstraintFailureException
    {
        throw nodeKeyConstraintsNotAllowed( descriptor );
    }
}
