package io.github.onograph.cluster.raft.share.meta.fsm.comp;

import io.github.onograph.cluster.raft.share.sync.SyncMeta;
import io.github.onograph.cluster.raft.share.sync.Syncerator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import org.neo4j.configuration.helpers.DatabaseReadOnlyChecker;
import org.neo4j.exceptions.KernelException;
import org.neo4j.graphdb.TransientTransactionFailureException;
import org.neo4j.internal.id.IdGeneratorFactory;
import org.neo4j.internal.id.IdType;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.api.txstate.TransactionState;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.api.state.TxState;
import org.neo4j.kernel.impl.util.collection.OnHeapCollectionsFactory;
import org.neo4j.lock.LockTracer;
import org.neo4j.lock.ResourceLocker;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.storageengine.api.CommandCreationContext;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.StorageEngine;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.txstate.TxStateVisitor;
import org.neo4j.token.AbstractTokenHolderBase;
import org.neo4j.token.TokenRegistry;


public class TokenHolderReplicaImpl extends AbstractTokenHolderBase {


  private static final String COPD_HTOK_HOD_CRAR_LT = io.github.onograph.TokenConstants.REPLICATED_TOKEN_HOLDER_CREATOR;


  private final DatabaseReadOnlyChecker cdorDatabaseReadOnlyChecker;


  private final ReplicaTokenBuilder ctReplicaTokenBuilder;


  private final IdGeneratorFactory idGeneratorFactory;


  private final NamedDatabaseId namedDatabaseId;


  private final PageCacheTracer pageCacheTracer;


  private final Syncerator rpiaoSyncerator;


  private final Supplier<StorageEngine> supplierSesStorageEngine;


  private final ReplicaTokenType tNme;


  private final IdType tknIdType;

  TokenHolderReplicaImpl(NamedDatabaseId _namedDatabaseId, TokenRegistry _tokenRegistry,
      Syncerator _rpiaoSyncerator, IdGeneratorFactory _idGeneratorFactory, IdType _tknIdType,
      Supplier<StorageEngine> _supplierSesStorageEngine, ReplicaTokenType tNme,
      ReplicaTokenBuilder _ctReplicaTokenBuilder, PageCacheTracer _pageCacheTracer,
      DatabaseReadOnlyChecker _cdorDatabaseReadOnlyChecker) {
    super(_tokenRegistry);
    this.rpiaoSyncerator = _rpiaoSyncerator;
    this.idGeneratorFactory = _idGeneratorFactory;
    this.tknIdType = _tknIdType;
    this.tNme = tNme;
    this.supplierSesStorageEngine = _supplierSesStorageEngine;
    this.ctReplicaTokenBuilder = _ctReplicaTokenBuilder;
    this.namedDatabaseId = _namedDatabaseId;
    this.pageCacheTracer = _pageCacheTracer;
    this.cdorDatabaseReadOnlyChecker = _cdorDatabaseReadOnlyChecker;
  }


  private byte[] _cracmdForSt(String _strTn, boolean _isItra) {

    StorageEngine _storageEngine = this.supplierSesStorageEngine.get();

    List<StorageCommand> _listCmadStorageCommand = new ArrayList();

    EmptyMemoryTracker _emptyMemoryTracker = EmptyMemoryTracker.INSTANCE;

    TransactionState _stTransactionState = new TxState(OnHeapCollectionsFactory.INSTANCE,
        _emptyMemoryTracker);

    CursorContext _cursorContext =
        new CursorContext(this.pageCacheTracer.createPageCursorTracer(
            io.github.onograph.TokenConstants.REPLICATED_TOKEN_HOLDER_CREATOR));

    try {

      int _iIt = Math.toIntExact(
          this.idGeneratorFactory.get(this.tknIdType).nextId(_cursorContext));
      this.ctReplicaTokenBuilder.crateForTrSt(_stTransactionState, _strTn, _isItra, _iIt);

      try {

        StorageReader RNME = _storageEngine.newReader();

        try {

          CommandCreationContext _commandCreationContext = _storageEngine.newCommandCreationContext(
              _emptyMemoryTracker);

          try {
            _commandCreationContext.initialize(_cursorContext);
            _storageEngine.createCommands(_listCmadStorageCommand, _stTransactionState, RNME,
                _commandCreationContext, ResourceLocker.PREVENT,
                LockTracer.NONE, Long.MAX_VALUE,
                TxStateVisitor.NO_DECORATION, _cursorContext, _emptyMemoryTracker);
          } catch (

              Throwable _throwable) {
            if (_commandCreationContext != null) {
              try {
                _commandCreationContext.close();
              } catch (

                  Throwable _throwable2) {
                _throwable.addSuppressed(_throwable2);
              }
            }

            throw _throwable;
          }

          if (_commandCreationContext != null) {
            _commandCreationContext.close();
          }
        } catch (

            Throwable _throwable3) {
          if (RNME != null) {
            try {
              RNME.close();
            } catch (

                Throwable _throwable4) {
              _throwable3.addSuppressed(_throwable4);
            }
          }

          throw _throwable3;
        }

        if (RNME != null) {
          RNME.close();
        }
      } catch (

          KernelException _kernelException) {

        throw new RuntimeException("*** Error: 5cdd1adc-e2b0-4ab0-a90e-9e85b7420080",
            _kernelException);
      }
    } catch (

        Throwable _throwable5) {
      try {
        _cursorContext.close();
      } catch (

          Throwable _throwable6) {
        _throwable5.addSuppressed(_throwable6);
      }

      throw _throwable5;
    }

    _cursorContext.close();
    return ActionMarshaller.contbForLi(_listCmadStorageCommand);
  }


  private void _vaantroForDa(DatabaseReadOnlyChecker _cdorDatabaseReadOnlyChecker) {
    _cdorDatabaseReadOnlyChecker.check();
  }

  @Override
  protected int createToken(String _strNt, boolean _isItra) {
    this._vaantroForDa(this.cdorDatabaseReadOnlyChecker);

    RequestData _rtRequestData =
        new RequestData(this._cracmdForSt(_strNt, _isItra), this.namedDatabaseId.databaseId(),
            _strNt, this.tNme);

    SyncMeta _rrSyncMeta = this.rpiaoSyncerator.relaSyncMeta(_rtRequestData);
    switch (_rrSyncMeta.getReslt()) {
      case SMT_NO_REP:

        throw new TransientTransactionFailureException(
            "*** Error: fa41b4c2-772d-477e-8607-bd9570327a2c", _rrSyncMeta.getFiueThrowable());
      case SMT_POS_REP:

        throw new TransientTransactionFailureException(
            "*** Error: 65ef98ad-1dd8-45b5-b512-541659756b6b", _rrSyncMeta.getFiueThrowable());
      case SMT_COM_OK:
        try {
          return _rrSyncMeta.getSmrFSMData().cose();
        } catch (

            TransientTransactionFailureException _transientTransactionFailureException) {
          throw _transientTransactionFailureException;
        } catch (

            Exception _exception) {
          throw new IllegalStateException(_exception);
        }
      default:

        throw new IllegalArgumentException("*** Error: 1c5d4b90-d244-49b0-b963-263c8a31fb57");
    }
  }

  @Override
  public void getOrCreateIds(String[] _strNmsArray, int[] _iIArray) throws KernelException {
    for (

        int cur = 0; cur < _strNmsArray.length; ++cur) {
      _iIArray[cur] = this.innerGetOrCreateId(_strNmsArray[cur], false);
    }
  }

  @Override
  public void getOrCreateInternalIds(String[] _strNmsArray, int[] _iIArray) throws KernelException {
    for (

        int cur = 0; cur < _strNmsArray.length; ++cur) {
      _iIArray[cur] = this.innerGetOrCreateId(_strNmsArray[cur], true);
    }
  }
}
