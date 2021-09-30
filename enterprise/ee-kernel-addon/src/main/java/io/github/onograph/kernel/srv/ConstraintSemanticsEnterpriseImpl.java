package io.github.onograph.kernel.srv;

import org.neo4j.common.TokenNameLookup;
import org.neo4j.internal.kernel.api.CursorFactory;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.NodeLabelIndexCursor;
import org.neo4j.internal.kernel.api.PropertyCursor;
import org.neo4j.internal.kernel.api.Read;
import org.neo4j.internal.kernel.api.RelationshipScanCursor;
import org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor;
import org.neo4j.internal.kernel.api.exceptions.schema.ConstraintValidationException;
import org.neo4j.internal.kernel.api.exceptions.schema.ConstraintValidationException.Phase;
import org.neo4j.internal.kernel.api.exceptions.schema.CreateConstraintFailureException;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.LabelSchemaDescriptor;
import org.neo4j.internal.schema.RelationTypeSchemaDescriptor;
import org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.exceptions.schema.NodePropertyExistenceException;
import org.neo4j.kernel.api.exceptions.schema.RelationshipPropertyExistenceException;
import org.neo4j.kernel.impl.constraints.StandardConstraintSemantics;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.txstate.ReadableTransactionState;
import org.neo4j.storageengine.api.txstate.TxStateVisitor;


public class ConstraintSemanticsEnterpriseImpl extends StandardConstraintSemantics {

  public ConstraintSemanticsEnterpriseImpl() {
    super(2);
  }


  private static CreateConstraintFailureException _crecttfuCreateConstraintFailureException(
      ConstraintValidationException _iConstraintValidationException) {
    return new CreateConstraintFailureException(_iConstraintValidationException.constraint(),
        _iConstraintValidationException);
  }


  private static boolean _isNosupptForPr(int prop, PropertyCursor _propertyCursor) {
    return !_propertyCursor.seekProperty(prop);
  }

  @Override
  public ConstraintDescriptor createExistenceConstraint(long _lgRi,
      ConstraintDescriptor _constraintDescriptor) {
    return this.accessor.createExistenceConstraint(_lgRi, _constraintDescriptor);
  }

  @Override
  public ConstraintDescriptor createNodeKeyConstraintRule(long _lgIr,
      NodeKeyConstraintDescriptor _nodeKeyConstraintDescriptor, long _lgIi) {
    return this.accessor.createNodeKeyConstraintRule(_lgIr, _nodeKeyConstraintDescriptor, _lgIi);
  }

  @Override
  public TxStateVisitor decorateTxStateVisitor(StorageReader _storageReader, Read _read,
      CursorFactory _cursorFactory, ReadableTransactionState _stReadableTransactionState,
      TxStateVisitor _txStateVisitor, CursorContext _cursorContext, MemoryTracker _memoryTracker) {
    return !_stReadableTransactionState.hasDataChanges() ? _txStateVisitor
        : ValidationService.geocepeexnefrfValidationService(_storageReader)
            .deotTxStateVisitor(_cursorContext, _cursorFactory,
                _memoryTracker, _read, _txStateVisitor);
  }

  @Override
  public String getName() {
    return io.github.onograph.TokenConstants.ENTERPRISE_CONSTRAINTS;
  }

  @Override
  protected ConstraintDescriptor readNonStandardConstraint(
      ConstraintDescriptor _constraintDescriptor, String _strEm) {
    if (!_constraintDescriptor.enforcesPropertyExistence()) {

      throw new IllegalStateException("*** Error: 1329fd3b-10e1-425a-b81d-8912e80dbdb6");
    } else {
      return _constraintDescriptor;
    }
  }

  @Override
  public void validateNodeKeyConstraint(NodeLabelIndexCursor _naNodeLabelIndexCursor,
      NodeCursor _nodeCursor, PropertyCursor _propertyCursor,
      LabelSchemaDescriptor _labelSchemaDescriptor, TokenNameLookup _tokenNameLookup)
      throws CreateConstraintFailureException {
    this.validateNodePropertyExistenceConstraint(_naNodeLabelIndexCursor, _nodeCursor,
        _propertyCursor, _labelSchemaDescriptor, _tokenNameLookup);
  }

  @Override
  public void validateNodeKeyConstraint(NodeCursor _nodeCursor, PropertyCursor _propertyCursor,
      LabelSchemaDescriptor _labelSchemaDescriptor, TokenNameLookup _tokenNameLookup)
      throws CreateConstraintFailureException {
    this.validateNodePropertyExistenceConstraint(_nodeCursor, _propertyCursor,
        _labelSchemaDescriptor, _tokenNameLookup);
  }

  @Override
  public void validateNodePropertyExistenceConstraint(NodeLabelIndexCursor _naNodeLabelIndexCursor,
      NodeCursor _nodeCursor, PropertyCursor _propertyCursor,
      LabelSchemaDescriptor _labelSchemaDescriptor, TokenNameLookup _tokenNameLookup)
      throws CreateConstraintFailureException {
    while (_naNodeLabelIndexCursor.next()) {
      _naNodeLabelIndexCursor.node(_nodeCursor);
      this.validateNodePropertyExistenceConstraint(_nodeCursor, _propertyCursor,
          _labelSchemaDescriptor, _tokenNameLookup);
    }
  }

  @Override
  public void validateNodePropertyExistenceConstraint(NodeCursor _nodeCursor,
      PropertyCursor _propertyCursor, LabelSchemaDescriptor _labelSchemaDescriptor,
      TokenNameLookup _tokenNameLookup)
      throws CreateConstraintFailureException {
    label20:
    while (true) {
      if (_nodeCursor.next()) {

        int[] _iVarArray = _labelSchemaDescriptor.getPropertyIds();

        int _iV = _iVarArray.length;

        int _iV2 = 0;

        while (true) {
          if (_iV2 >= _iV) {
            continue label20;
          }

          int pk = _iVarArray[_iV2];
          _nodeCursor.properties(_propertyCursor);
          if (_isNosupptForPr(pk, _propertyCursor)) {
            throw _crecttfuCreateConstraintFailureException(
                new NodePropertyExistenceException(_labelSchemaDescriptor, Phase.VERIFICATION,
                    _nodeCursor.nodeReference(),
                    _tokenNameLookup));
          }

          ++_iV2;
        }
      }

      return;
    }
  }

  @Override
  public void validateRelationshipPropertyExistenceConstraint(
      RelationshipScanCursor _crRelationshipScanCursor, PropertyCursor _propertyCursor,
      RelationTypeSchemaDescriptor _relationTypeSchemaDescriptor, TokenNameLookup _tokenNameLookup)
      throws CreateConstraintFailureException {
    label22:
    while (true) {
      if (_crRelationshipScanCursor.next()) {
        _crRelationshipScanCursor.properties(_propertyCursor);

        int[] _iVaArray = _relationTypeSchemaDescriptor.getPropertyIds();

        int _iVar = _iVaArray.length;

        int _iVar2 = 0;

        while (true) {
          if (_iVar2 >= _iVar) {
            continue label22;
          }

          int pk = _iVaArray[_iVar2];
          if (_crRelationshipScanCursor.type() == _relationTypeSchemaDescriptor.getRelTypeId()
              && _isNosupptForPr(pk, _propertyCursor)) {
            throw _crecttfuCreateConstraintFailureException(
                new RelationshipPropertyExistenceException(_relationTypeSchemaDescriptor,
                    Phase.VERIFICATION,
                    _crRelationshipScanCursor.relationshipReference(),
                    _tokenNameLookup));
          }

          ++_iVar2;
        }
      }

      return;
    }
  }

  @Override
  public void validateRelationshipPropertyExistenceConstraint(
      RelationshipTypeIndexCursor _raRelationshipTypeIndexCursor,
      RelationshipScanCursor _crRelationshipScanCursor, PropertyCursor _propertyCursor,
      RelationTypeSchemaDescriptor _relationTypeSchemaDescriptor, TokenNameLookup _tokenNameLookup)
      throws CreateConstraintFailureException {
    while (_raRelationshipTypeIndexCursor.next()) {
      _raRelationshipTypeIndexCursor.relationship(_crRelationshipScanCursor);

      while (_crRelationshipScanCursor.next()) {

        int[] _iVArray = _relationTypeSchemaDescriptor.getPropertyIds();

        int _iVa = _iVArray.length;

        for (

            int _iV = 0; _iV < _iVa; ++_iV) {

          int pk = _iVArray[_iV];
          _crRelationshipScanCursor.properties(_propertyCursor);
          if (_isNosupptForPr(pk, _propertyCursor)) {
            throw _crecttfuCreateConstraintFailureException(
                new RelationshipPropertyExistenceException(_relationTypeSchemaDescriptor,
                    Phase.VERIFICATION,
                    _crRelationshipScanCursor.relationshipReference(),
                    _tokenNameLookup));
          }
        }
      }
    }
  }
}
