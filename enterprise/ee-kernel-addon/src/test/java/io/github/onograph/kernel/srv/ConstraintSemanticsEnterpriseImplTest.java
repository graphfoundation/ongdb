package io.github.onograph.kernel.srv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.function.Predicate;
import org.junit.jupiter.api.Test;
import org.neo4j.common.EntityType;
import org.neo4j.internal.kernel.api.RelationshipScanCursor;
import org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor;
import org.neo4j.internal.kernel.api.exceptions.schema.CreateConstraintFailureException;
import org.neo4j.internal.kernel.api.helpers.StubNodeCursor;
import org.neo4j.internal.kernel.api.helpers.StubNodeLabelIndexCursor;
import org.neo4j.internal.kernel.api.helpers.StubPropertyCursor;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.PropertySchemaType;
import org.neo4j.internal.schema.SchemaDescriptorImplementation;
import org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor;
import org.neo4j.kernel.impl.newapi.FilteringRelationshipScanCursorWrapper;
import org.neo4j.test.InMemoryTokens;

class ConstraintSemanticsEnterpriseImplTest {

  @Test
  void testConstructor() {
    assertEquals("enterpriseConstraints", (new ConstraintSemanticsEnterpriseImpl()).getName());
    assertEquals(2, (new ConstraintSemanticsEnterpriseImpl()).getPriority());
  }

  @Test
  void testCreateExistenceConstraint() {
    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();
    ConstraintDescriptor constraintDescriptor = mock(ConstraintDescriptor.class);
    when(constraintDescriptor.withId(anyLong())).thenReturn(mock(ConstraintDescriptor.class));
    constraintSemanticsEnterpriseImpl.createExistenceConstraint(1L, constraintDescriptor);
    verify(constraintDescriptor).withId(anyLong());
  }

  @Test
  void testCreateNodeKeyConstraintRule() {
    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();
    NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor = mock(
        NodeKeyConstraintDescriptor.class);
    when(nodeKeyConstraintDescriptor.withOwnedIndexId(anyLong())).thenReturn(
        mock(NodeKeyConstraintDescriptor.class));
    NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor1 = mock(
        NodeKeyConstraintDescriptor.class);
    when(nodeKeyConstraintDescriptor1.withId(anyLong())).thenReturn(nodeKeyConstraintDescriptor);
    constraintSemanticsEnterpriseImpl.createNodeKeyConstraintRule(1L, nodeKeyConstraintDescriptor1,
        1L);
    verify(nodeKeyConstraintDescriptor1).withId(anyLong());
    verify(nodeKeyConstraintDescriptor).withOwnedIndexId(anyLong());
  }

  @Test
  void testReadNonStandardConstraint() {
    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();
    ConstraintDescriptor constraintDescriptor = mock(ConstraintDescriptor.class);
    when(constraintDescriptor.enforcesPropertyExistence()).thenReturn(true);
    constraintSemanticsEnterpriseImpl.readNonStandardConstraint(constraintDescriptor, " str Em");
    verify(constraintDescriptor).enforcesPropertyExistence();
  }

  @Test
  void testReadNonStandardConstraint2() {
    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();
    ConstraintDescriptor constraintDescriptor = mock(ConstraintDescriptor.class);
    when(constraintDescriptor.enforcesPropertyExistence()).thenReturn(false);
    assertThrows(IllegalStateException.class,
        () -> constraintSemanticsEnterpriseImpl.readNonStandardConstraint(constraintDescriptor,
            " str Em"));
    verify(constraintDescriptor).enforcesPropertyExistence();
  }

  @Test
  void testValidateNodeKeyConstraint() throws CreateConstraintFailureException {

    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();
    StubNodeCursor _nodeCursor = new StubNodeCursor(true);
    StubPropertyCursor _propertyCursor = new StubPropertyCursor();
    SchemaDescriptorImplementation _labelSchemaDescriptor = new SchemaDescriptorImplementation(
        EntityType.NODE,
        PropertySchemaType.COMPLETE_ALL_TOKENS,
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1});

    constraintSemanticsEnterpriseImpl.validateNodeKeyConstraint(_nodeCursor, _propertyCursor,
        _labelSchemaDescriptor,
        new InMemoryTokens());
  }

  @Test
  void testValidateNodeKeyConstraint2() throws CreateConstraintFailureException {
    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();
    StubNodeLabelIndexCursor stubNodeLabelIndexCursor = new StubNodeLabelIndexCursor(
        new HashMap<Integer, long[]>(1));
    StubNodeCursor stubNodeCursor = new StubNodeCursor(true);
    StubPropertyCursor stubPropertyCursor = new StubPropertyCursor();
    SchemaDescriptorImplementation _labelSchemaDescriptor = new SchemaDescriptorImplementation(
        EntityType.NODE,
        PropertySchemaType.COMPLETE_ALL_TOKENS,
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1});

    constraintSemanticsEnterpriseImpl.validateNodeKeyConstraint(stubNodeLabelIndexCursor,
        stubNodeCursor,
        stubPropertyCursor, _labelSchemaDescriptor, new InMemoryTokens());
    assertEquals(0, stubNodeLabelIndexCursor.getToken());
    assertEquals(0, stubNodeCursor.getToken());
    assertEquals(0, stubPropertyCursor.getToken());
  }

  @Test
  void testValidateNodeKeyConstraint3() throws CreateConstraintFailureException {

    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();

    HashMap<Integer, long[]> integerLongArrayMap = new HashMap<Integer, long[]>(1);
    integerLongArrayMap.put(0, new long[]{42L, 42L, 42L, 42L});
    StubNodeLabelIndexCursor _naNodeLabelIndexCursor = new StubNodeLabelIndexCursor(
        integerLongArrayMap);
    StubNodeCursor _nodeCursor = new StubNodeCursor(true);
    StubPropertyCursor _propertyCursor = new StubPropertyCursor();
    SchemaDescriptorImplementation _labelSchemaDescriptor = new SchemaDescriptorImplementation(
        EntityType.NODE,
        PropertySchemaType.COMPLETE_ALL_TOKENS,
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1});

    constraintSemanticsEnterpriseImpl.validateNodeKeyConstraint(_naNodeLabelIndexCursor,
        _nodeCursor, _propertyCursor,
        _labelSchemaDescriptor, new InMemoryTokens());
  }

  @Test
  void testValidateNodePropertyExistenceConstraint() throws CreateConstraintFailureException {

    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();
    StubNodeCursor _nodeCursor = new StubNodeCursor(true);
    StubPropertyCursor _propertyCursor = new StubPropertyCursor();
    SchemaDescriptorImplementation _labelSchemaDescriptor = new SchemaDescriptorImplementation(
        EntityType.NODE,
        PropertySchemaType.COMPLETE_ALL_TOKENS,
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1});

    constraintSemanticsEnterpriseImpl.validateNodePropertyExistenceConstraint(_nodeCursor,
        _propertyCursor,
        _labelSchemaDescriptor, new InMemoryTokens());
  }

  @Test
  void testValidateNodePropertyExistenceConstraint2() throws CreateConstraintFailureException {
    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();
    StubNodeLabelIndexCursor stubNodeLabelIndexCursor = new StubNodeLabelIndexCursor(
        new HashMap<Integer, long[]>(1));
    StubNodeCursor stubNodeCursor = new StubNodeCursor(true);
    StubPropertyCursor stubPropertyCursor = new StubPropertyCursor();
    SchemaDescriptorImplementation _labelSchemaDescriptor = new SchemaDescriptorImplementation(
        EntityType.NODE,
        PropertySchemaType.COMPLETE_ALL_TOKENS,
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1});

    constraintSemanticsEnterpriseImpl.validateNodePropertyExistenceConstraint(
        stubNodeLabelIndexCursor, stubNodeCursor,
        stubPropertyCursor, _labelSchemaDescriptor, new InMemoryTokens());
    assertEquals(0, stubNodeLabelIndexCursor.getToken());
    assertEquals(0, stubNodeCursor.getToken());
    assertEquals(0, stubPropertyCursor.getToken());
  }

  @Test
  void testValidateNodePropertyExistenceConstraint3() throws CreateConstraintFailureException {

    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();

    HashMap<Integer, long[]> integerLongArrayMap = new HashMap<Integer, long[]>(1);
    integerLongArrayMap.put(0, new long[]{42L, 42L, 42L, 42L});
    StubNodeLabelIndexCursor _naNodeLabelIndexCursor = new StubNodeLabelIndexCursor(
        integerLongArrayMap);
    StubNodeCursor _nodeCursor = new StubNodeCursor(true);
    StubPropertyCursor _propertyCursor = new StubPropertyCursor();
    SchemaDescriptorImplementation _labelSchemaDescriptor = new SchemaDescriptorImplementation(
        EntityType.NODE,
        PropertySchemaType.COMPLETE_ALL_TOKENS,
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1});

    constraintSemanticsEnterpriseImpl.validateNodePropertyExistenceConstraint(
        _naNodeLabelIndexCursor, _nodeCursor,
        _propertyCursor, _labelSchemaDescriptor, new InMemoryTokens());
  }

  @Test
  void testValidateRelationshipPropertyExistenceConstraint()
      throws CreateConstraintFailureException {
    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();
    RelationshipScanCursor relationshipScanCursor = mock(RelationshipScanCursor.class);
    when(relationshipScanCursor.type()).thenReturn(1);
    doNothing().when(relationshipScanCursor)
        .properties((org.neo4j.internal.kernel.api.PropertyCursor) any());
    when(relationshipScanCursor.next()).thenReturn(false);
    Predicate<RelationshipScanCursor> predicate = (Predicate<RelationshipScanCursor>) mock(
        Predicate.class);
    when(predicate.test((RelationshipScanCursor) any())).thenReturn(true);
    FilteringRelationshipScanCursorWrapper delegate = new FilteringRelationshipScanCursorWrapper(
        relationshipScanCursor,
        predicate);

    Predicate<RelationshipScanCursor> predicate1 = (Predicate<RelationshipScanCursor>) mock(
        Predicate.class);
    when(predicate1.test((RelationshipScanCursor) any())).thenReturn(true);
    FilteringRelationshipScanCursorWrapper delegate1 = new FilteringRelationshipScanCursorWrapper(
        delegate, predicate1);

    Predicate<RelationshipScanCursor> predicate2 = (Predicate<RelationshipScanCursor>) mock(
        Predicate.class);
    when(predicate2.test((RelationshipScanCursor) any())).thenReturn(true);
    FilteringRelationshipScanCursorWrapper filteringRelationshipScanCursorWrapper = new FilteringRelationshipScanCursorWrapper(
        delegate1, predicate2);

    StubPropertyCursor _propertyCursor = new StubPropertyCursor();
    SchemaDescriptorImplementation _relationTypeSchemaDescriptor = new SchemaDescriptorImplementation(
        EntityType.NODE,
        PropertySchemaType.COMPLETE_ALL_TOKENS,
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1});

    constraintSemanticsEnterpriseImpl.validateRelationshipPropertyExistenceConstraint(
        filteringRelationshipScanCursorWrapper, _propertyCursor, _relationTypeSchemaDescriptor,
        new InMemoryTokens());
    verify(relationshipScanCursor).next();
    assertEquals(0, filteringRelationshipScanCursorWrapper.getToken());
  }

  @Test
  void testValidateRelationshipPropertyExistenceConstraint2()
      throws CreateConstraintFailureException {
    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();
    RelationshipTypeIndexCursor relationshipTypeIndexCursor = mock(
        RelationshipTypeIndexCursor.class);
    doThrow(new IllegalStateException("foo")).when(relationshipTypeIndexCursor)
        .relationship((RelationshipScanCursor) any());
    when(relationshipTypeIndexCursor.next()).thenReturn(true);
    FilteringRelationshipScanCursorWrapper _crRelationshipScanCursor = new FilteringRelationshipScanCursorWrapper(
        new FilteringRelationshipScanCursorWrapper(
            new FilteringRelationshipScanCursorWrapper(
                new FilteringRelationshipScanCursorWrapper(null,
                    (Predicate<RelationshipScanCursor>) mock(Predicate.class)),
                (Predicate<RelationshipScanCursor>) mock(Predicate.class)),
            (Predicate<RelationshipScanCursor>) mock(Predicate.class)),
        (Predicate<RelationshipScanCursor>) mock(Predicate.class));

    StubPropertyCursor _propertyCursor = new StubPropertyCursor();
    SchemaDescriptorImplementation _relationTypeSchemaDescriptor = new SchemaDescriptorImplementation(
        EntityType.NODE,
        PropertySchemaType.COMPLETE_ALL_TOKENS,
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1});

    assertThrows(IllegalStateException.class,
        () -> constraintSemanticsEnterpriseImpl.validateRelationshipPropertyExistenceConstraint(
            relationshipTypeIndexCursor, _crRelationshipScanCursor, _propertyCursor,
            _relationTypeSchemaDescriptor,
            new InMemoryTokens()));
    verify(relationshipTypeIndexCursor).next();
    verify(relationshipTypeIndexCursor).relationship((RelationshipScanCursor) any());
  }

  @Test
  void testValidateRelationshipPropertyExistenceConstraint3()
      throws CreateConstraintFailureException {
    ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl = new ConstraintSemanticsEnterpriseImpl();
    RelationshipTypeIndexCursor relationshipTypeIndexCursor = mock(
        RelationshipTypeIndexCursor.class);
    doThrow(new IllegalStateException("foo")).when(relationshipTypeIndexCursor)
        .relationship((RelationshipScanCursor) any());
    when(relationshipTypeIndexCursor.next()).thenReturn(false);
    FilteringRelationshipScanCursorWrapper _crRelationshipScanCursor = new FilteringRelationshipScanCursorWrapper(
        new FilteringRelationshipScanCursorWrapper(
            new FilteringRelationshipScanCursorWrapper(
                new FilteringRelationshipScanCursorWrapper(null,
                    (Predicate<RelationshipScanCursor>) mock(Predicate.class)),
                (Predicate<RelationshipScanCursor>) mock(Predicate.class)),
            (Predicate<RelationshipScanCursor>) mock(Predicate.class)),
        (Predicate<RelationshipScanCursor>) mock(Predicate.class));

    StubPropertyCursor _propertyCursor = new StubPropertyCursor();
    SchemaDescriptorImplementation _relationTypeSchemaDescriptor = new SchemaDescriptorImplementation(
        EntityType.NODE,
        PropertySchemaType.COMPLETE_ALL_TOKENS,
        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
        new int[]{1, 1, 1, 1, 1, 1, 1, 1});

    constraintSemanticsEnterpriseImpl.validateRelationshipPropertyExistenceConstraint(
        relationshipTypeIndexCursor,
        _crRelationshipScanCursor, _propertyCursor,
        _relationTypeSchemaDescriptor, new InMemoryTokens());
    verify(relationshipTypeIndexCursor).next();
  }
}

