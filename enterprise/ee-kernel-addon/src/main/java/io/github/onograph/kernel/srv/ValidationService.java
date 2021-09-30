package io.github.onograph.kernel.srv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import org.eclipse.collections.api.IntIterable;
import org.eclipse.collections.api.iterator.MutableLongIterator;
import org.eclipse.collections.api.map.primitive.MutableLongObjectMap;
import org.eclipse.collections.api.set.primitive.IntSet;
import org.eclipse.collections.api.set.primitive.LongSet;
import org.eclipse.collections.api.set.primitive.MutableIntSet;
import org.eclipse.collections.impl.map.mutable.primitive.LongObjectHashMap;
import org.eclipse.collections.impl.set.mutable.primitive.IntHashSet;
import org.neo4j.collection.PrimitiveArrays;
import org.neo4j.common.TokenNameLookup;
import org.neo4j.internal.kernel.api.CursorFactory;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.PropertyCursor;
import org.neo4j.internal.kernel.api.Read;
import org.neo4j.internal.kernel.api.RelationshipScanCursor;
import org.neo4j.internal.kernel.api.TokenSet;
import org.neo4j.internal.kernel.api.exceptions.schema.ConstraintValidationException;
import org.neo4j.internal.kernel.api.exceptions.schema.ConstraintValidationException.Phase;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.LabelSchemaDescriptor;
import org.neo4j.internal.schema.RelationTypeSchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.internal.schema.SchemaProcessor;
import org.neo4j.io.IOUtils;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.exceptions.schema.NodePropertyExistenceException;
import org.neo4j.kernel.api.exceptions.schema.RelationshipPropertyExistenceException;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.StorageProperty;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.txstate.RelationshipModifications;
import org.neo4j.storageengine.api.txstate.TxStateVisitor;
import org.neo4j.storageengine.api.txstate.TxStateVisitor.Delegator;


class ValidationService {


  private static final ValidationService NOOTIS_VALIDATION_SERVICE =
      new ValidationService(Collections.emptyList(), Collections.emptyList(), null) {
        @Override
        TxStateVisitor deotTxStateVisitor(CursorContext _cursorContext,
            CursorFactory _cursorFactory, MemoryTracker _memoryTracker, Read _read,
            TxStateVisitor _txStateVisitor) {
          return _txStateVisitor;
        }
      };


  private static final Function<StorageReader, ValidationService> FUNCTION_FATYSV = (storageReader) ->
  {

    final List<LabelSchemaDescriptor> _listNdsLabelSchemaDescriptor = new ArrayList();

    final List<RelationTypeSchemaDescriptor> _listRltosRelationTypeSchemaDescriptor = new ArrayList();

    Iterator _cntanIterator = storageReader.constraintsGetAll();

    while (_cntanIterator.hasNext()) {

      ConstraintDescriptor _constraintDescriptor = (ConstraintDescriptor) _cntanIterator.next();
      if (_constraintDescriptor.enforcesPropertyExistence()) {
        _constraintDescriptor.schema().processWith(new SchemaProcessor() {
          @Override
          public void processSpecific(LabelSchemaDescriptor _labelSchemaDescriptor) {
            _listNdsLabelSchemaDescriptor.add(_labelSchemaDescriptor);
          }

          @Override
          public void processSpecific(RelationTypeSchemaDescriptor _relationTypeSchemaDescriptor) {
            _listRltosRelationTypeSchemaDescriptor.add(_relationTypeSchemaDescriptor);
          }

          @Override
          public void processSpecific(SchemaDescriptor _schemaDescriptor) {

            throw new UnsupportedOperationException(
                "*** Error:  803d830d-680b-407c-9215-0e6fc014b011");
          }
        });
      }
    }

    if (_listNdsLabelSchemaDescriptor.isEmpty()
        && _listRltosRelationTypeSchemaDescriptor.isEmpty()) {
      return NOOTIS_VALIDATION_SERVICE;
    } else {
      return new ValidationService(_listNdsLabelSchemaDescriptor,
          _listRltosRelationTypeSchemaDescriptor, storageReader.tokenNameLookup());
    }
  };


  private final List<LabelSchemaDescriptor> listCnLabelSchemaDescriptor;


  private final List<RelationTypeSchemaDescriptor> listCrRelationTypeSchemaDescriptor;


  private final MutableLongObjectMap<int[]> mlEdgePropsTypMap = new LongObjectHashMap();


  private final MutableLongObjectMap<int[]> mlNodePLabelMap = new LongObjectHashMap();


  private final TokenNameLookup tokenNameLookup;

  private ValidationService(List<LabelSchemaDescriptor> _listNdsLabelSchemaDescriptor,
      List<RelationTypeSchemaDescriptor> _listRRelationTypeSchemaDescriptor,
      TokenNameLookup _tokenNameLookup) {
    this.listCnLabelSchemaDescriptor = _listNdsLabelSchemaDescriptor;
    this.listCrRelationTypeSchemaDescriptor = _listRRelationTypeSchemaDescriptor;
    this.tokenNameLookup = _tokenNameLookup;

    Iterator _iterator = _listNdsLabelSchemaDescriptor.iterator();

    while (_iterator.hasNext()) {

      LabelSchemaDescriptor _cntanLabelSchemaDescriptor = (LabelSchemaDescriptor) _iterator.next();
      _upaForMu(_coanstpeid(_cntanLabelSchemaDescriptor.getPropertyIds()),
          _cntanLabelSchemaDescriptor.getLabelId(), this.mlNodePLabelMap);
    }

    _iterator = _listRRelationTypeSchemaDescriptor.iterator();

    while (_iterator.hasNext()) {

      RelationTypeSchemaDescriptor _cntanRelationTypeSchemaDescriptor = (RelationTypeSchemaDescriptor) _iterator.next();
      _upaForMu(_coanstpeid(_cntanRelationTypeSchemaDescriptor.getPropertyIds()),
          _cntanRelationTypeSchemaDescriptor.getRelTypeId(),
          this.mlEdgePropsTypMap);
    }
  }


  private static int[] _coanstpeid(int[] _iIpArray) {

    int[] valArr = new int[_iIpArray.length];
    System.arraycopy(_iIpArray, 0, valArr, 0, _iIpArray.length);
    Arrays.sort(valArr);
    return valArr;
  }


  private static boolean _isCotn(int[] _iLisArray, int val) {

    int[] _iVArray = _iLisArray;

    int _iVar = _iLisArray.length;

    for (

        int _iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {

      int _iX = _iVArray[_iVar2];
      if (val == _iX) {
        return true;
      }
    }

    return false;
  }


  private static void _upaForMu(int[] _iVsArray, int k, MutableLongObjectMap<int[]> _mapToUD) {

    int[] _iCretArray = _mapToUD.get(k);
    if (_iCretArray != null) {
      _iVsArray = PrimitiveArrays.union(_iCretArray, _iVsArray);
    }

    _mapToUD.put(k, _iVsArray);
  }


  static ValidationService geocepeexnefrfValidationService(StorageReader _storageReader) {
    return _storageReader.getOrCreateSchemaDependantState(ValidationService.class, FUNCTION_FATYSV);
  }


  private void _falnd(long lbl, long _lgI, int pk)
      throws NodePropertyExistenceException {

    Iterator _iterator = this.listCnLabelSchemaDescriptor.iterator();

    LabelSchemaDescriptor _cntanLabelSchemaDescriptor;
    do {
      if (!_iterator.hasNext()) {

        throw new IllegalStateException("*** Error: 41fdeb28-d91f-4a3f-aabc-a5f50bec94a6");
      }

      _cntanLabelSchemaDescriptor = (LabelSchemaDescriptor) _iterator.next();
    }
    while ((long) _cntanLabelSchemaDescriptor.getLabelId() != lbl || !_isCotn(
        _cntanLabelSchemaDescriptor.getPropertyIds(), pk));

    throw new NodePropertyExistenceException(_cntanLabelSchemaDescriptor, Phase.VALIDATION, _lgI,
        this.tokenNameLookup);
  }


  private void _fareop(int _iTr, long _lgI, int pk)
      throws RelationshipPropertyExistenceException {

    Iterator _iterator = this.listCrRelationTypeSchemaDescriptor.iterator();

    RelationTypeSchemaDescriptor _cntanRelationTypeSchemaDescriptor;
    do {
      if (!_iterator.hasNext()) {

        throw new IllegalStateException("*** Error: e375dc3f-c244-4184-a3f7-abe96821419c");
      }

      _cntanRelationTypeSchemaDescriptor = (RelationTypeSchemaDescriptor) _iterator.next();
    }
    while (_cntanRelationTypeSchemaDescriptor.getRelTypeId() != _iTr || !_isCotn(
        _cntanRelationTypeSchemaDescriptor.getPropertyIds(), pk));

    throw new RelationshipPropertyExistenceException(_cntanRelationTypeSchemaDescriptor,
        Phase.VALIDATION, _lgI, this.tokenNameLookup);
  }


  private void _vaandppeForIn(IntSet _ikpIntSet, TokenSet _ilTokenSet, long _lgI)
      throws NodePropertyExistenceException {

    int _iLon = _ilTokenSet.numberOfTokens();

    long lbl;
    if (_iLon > this.mlNodePLabelMap.size()) {

      MutableLongIterator _lblMutableLongIterator = this.mlNodePLabelMap.keySet().longIterator();

      while (_lblMutableLongIterator.hasNext()) {
        lbl = _lblMutableLongIterator.next();
        if (_ilTokenSet.contains(Math.toIntExact(lbl))) {
          this._vaandppeForIn(this.mlNodePLabelMap.get(lbl), _ikpIntSet, lbl, _lgI);
        }
      }
    } else {
      for (

          int cur = 0; cur < _iLon; ++cur) {
        lbl = _ilTokenSet.token(cur);

        int[] _iKArray = this.mlNodePLabelMap.get(lbl);
        if (_iKArray != null) {
          this._vaandppeForIn(_iKArray, _ikpIntSet, lbl, _lgI);
        }
      }
    }
  }


  private void _vaandppeForIn(int[] _iRkArray, IntSet _ikpIntSet, long lbl, long _lgI)
      throws NodePropertyExistenceException {

    int[] _iVArray = _iRkArray;

    int _iVa = _iRkArray.length;

    for (

        int _iVar = 0; _iVar < _iVa; ++_iVar) {

      int k = _iVArray[_iVar];
      if (!_ikpIntSet.contains(k)) {
        this._falnd(lbl, _lgI, k);
      }
    }
  }


  TxStateVisitor deotTxStateVisitor(CursorContext _cursorContext, CursorFactory _cursorFactory,
      MemoryTracker _memoryTracker, Read _read, TxStateVisitor _txStateVisitor) {
    return new DefaultDelegator(_cursorContext, _cursorFactory, _memoryTracker, _txStateVisitor,
        _read);
  }


  private class DefaultDelegator extends Delegator {


    private final RelationshipScanCursor crRelationshipScanCursor;


    private final MutableIntSet ikpMutableIntSet = new IntHashSet();


    private final NodeCursor nodeCursor;


    private final PropertyCursor propertyCursor;


    private final Read read;


    DefaultDelegator(CursorContext _cursorContext, CursorFactory _cursorFactory,
        MemoryTracker _memoryTracker, TxStateVisitor _nexTxStateVisitor, Read _read) {
      super(_nexTxStateVisitor);
      this.read = _read;
      this.nodeCursor = _cursorFactory.allocateFullAccessNodeCursor(_cursorContext);
      this.propertyCursor = _cursorFactory.allocateFullAccessPropertyCursor(_cursorContext,
          _memoryTracker);
      this.crRelationshipScanCursor = _cursorFactory.allocateRelationshipScanCursor(_cursorContext);
    }


    private void _vaarln(long _lgI) throws RelationshipPropertyExistenceException {
      if (!ValidationService.this.mlEdgePropsTypMap.isEmpty()) {
        this.read.singleRelationship(_lgI, this.crRelationshipScanCursor);
        if (!this.crRelationshipScanCursor.next()) {

          throw new IllegalStateException("*** Error: 87a4b833-203f-4e03-ba26-5ea699d72af0");
        } else {

          int _iTr = this.crRelationshipScanCursor.type();

          int[] _iRqieArray = ValidationService.this.mlEdgePropsTypMap.get(_iTr);
          if (_iRqieArray != null) {
            this.ikpMutableIntSet.clear();
            this.crRelationshipScanCursor.properties(this.propertyCursor);

            while (this.propertyCursor.next()) {
              this.ikpMutableIntSet.add(this.propertyCursor.propertyKey());
            }

            int[] _iVArray = _iRqieArray;

            int _iV = _iRqieArray.length;

            for (

                int _iVa = 0; _iVa < _iV; ++_iVa) {

              int _iMnaoy = _iVArray[_iVa];
              if (!this.ikpMutableIntSet.contains(_iMnaoy)) {
                ValidationService.this._fareop(_iTr, _lgI, _iMnaoy);
              }
            }
          }
        }
      }
    }


    private void _vaitno(long _lgIn) throws NodePropertyExistenceException {
      if (!ValidationService.this.mlNodePLabelMap.isEmpty()) {
        this.read.singleNode(_lgIn, this.nodeCursor);
        if (!this.nodeCursor.next()) {

          throw new IllegalStateException("*** Error: f8ee3387-65ca-4f0b-a9d3-8d13e617a986");
        } else {

          TokenSet _ilTokenSet = this.nodeCursor.labels();
          if (_ilTokenSet.numberOfTokens() != 0) {
            this.ikpMutableIntSet.clear();
            this.nodeCursor.properties(this.propertyCursor);

            while (this.propertyCursor.next()) {
              this.ikpMutableIntSet.add(this.propertyCursor.propertyKey());
            }

            ValidationService.this._vaandppeForIn(this.ikpMutableIntSet, _ilTokenSet, _lgIn);
          }
        }
      }
    }

    @Override
    public void close() {
      super.close();
      IOUtils.closeAllUnchecked(this.nodeCursor, this.crRelationshipScanCursor,
          this.propertyCursor);
    }

    @Override
    public void visitNodeLabelChanges(long _lgI, LongSet _addLongSet, LongSet _rmvdLongSet)
        throws ConstraintValidationException {
      this._vaitno(_lgI);
      super.visitNodeLabelChanges(_lgI, _addLongSet, _rmvdLongSet);
    }

    @Override
    public void visitNodePropertyChanges(long _lgI,
        Iterator<StorageProperty> _iteratorAddStorageProperty,
        Iterator<StorageProperty> _iteratorCagdStorageProperty, IntIterable _rmvdIntIterable)
        throws ConstraintValidationException {
      this._vaitno(_lgI);
      super.visitNodePropertyChanges(_lgI, _iteratorAddStorageProperty,
          _iteratorCagdStorageProperty, _rmvdIntIterable);
    }

    @Override
    public void visitRelPropertyChanges(long _lgI,
        Iterator<StorageProperty> _iteratorAddStorageProperty,
        Iterator<StorageProperty> _iteratorCagdStorageProperty, IntIterable _rmvdIntIterable)
        throws ConstraintValidationException {
      this._vaarln(_lgI);
      super.visitRelPropertyChanges(_lgI, _iteratorAddStorageProperty, _iteratorCagdStorageProperty,
          _rmvdIntIterable);
    }

    @Override
    public void visitRelationshipModifications(RelationshipModifications _relationshipModifications)
        throws ConstraintValidationException {
      _relationshipModifications.creations().forEach((id, type, startNode, endNode) ->
      {
        this._vaarln(id);
      });
      super.visitRelationshipModifications(_relationshipModifications);
    }
  }
}
