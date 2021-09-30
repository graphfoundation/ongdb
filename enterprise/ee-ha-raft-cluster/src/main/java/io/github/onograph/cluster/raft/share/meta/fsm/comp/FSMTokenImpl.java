package io.github.onograph.cluster.raft.share.meta.fsm.comp;

import io.github.onograph.cluster.raft.share.meta.FSMData;
import io.github.onograph.cluster.raft.share.meta.fsm.FSM;
import io.github.onograph.cluster.raft.share.meta.fsm.FSMUtils;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogHeadWrapper;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import org.neo4j.graphdb.TransientTransactionFailureException;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.kernel.api.exceptions.Status.Transaction;
import org.neo4j.kernel.impl.api.TransactionCommitProcess;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.StorageCommand.TokenCommand;
import org.neo4j.token.TokenRegistry;
import org.neo4j.token.api.NamedToken;


public class FSMTokenImpl implements FSM<RequestData> {


  private final FSMUtils chFSMUtils;


  private final Log log;


  private final TokenRegistry tokenRegistry;


  private CommandReaderFactory commandReaderFactory;


  private long lgIcl = -1L;


  private TransactionCommitProcess transactionCommitProcess;

  public FSMTokenImpl(FSMUtils _hcFSMUtils, TokenRegistry _tokenRegistry,
      LogProvider _logProvider) {
    this.chFSMUtils = _hcFSMUtils;
    this.tokenRegistry = _tokenRegistry;
    this.log = _logProvider.getLog(this.getClass());
  }


  private void _apltosoForLi(List<StorageCommand> _listCmadStorageCommand, long lgIdx) {

    PhysicalTransactionRepresentation _physicalTransactionRepresentation = new PhysicalTransactionRepresentation(
        _listCmadStorageCommand);
    _physicalTransactionRepresentation.setHeader(TransactionLogHeadWrapper.enelinastha(lgIdx), 0L,
        0L, 0L, 0, AuthSubject.AUTH_DISABLED);

    try {
      this.chFSMUtils.comForTrTr(lgIdx, _physicalTransactionRepresentation,
          this.transactionCommitProcess);
    } catch (

        TransactionFailureException _transactionFailureException) {
      throw new RuntimeException(_transactionFailureException);
    }
  }


  private int _exrttkiForCo(Collection<StorageCommand> _collectionCmadStorageCommand) {

    TokenCommand _tokenCommand = this._gesntocodStorageCommandTokenCommand(
        _collectionCmadStorageCommand);
    return _tokenCommand.tokenId();
  }


  private TokenCommand _gesntocodStorageCommandTokenCommand(
      Collection<StorageCommand> _collectionCmadStorageCommand) {

    StorageCommand _storageCommand = Iterables.single(_collectionCmadStorageCommand);
    if (!(_storageCommand instanceof TokenCommand)) {

      throw new IllegalArgumentException("*** Error: ce510326-7481-4189-9658-a29c243e0a15");
    } else {
      return (TokenCommand) _storageCommand;
    }
  }


  private boolean _isInrlForCo(Collection<StorageCommand> _collectionCmadStorageCommand) {

    TokenCommand _tokenCommand = this._gesntocodStorageCommandTokenCommand(
        _collectionCmadStorageCommand);
    return _tokenCommand.isInternal();
  }

  @Override
  public synchronized void aplcoaForCoCo(RequestData _rtRequestData, long caIdx,
      Consumer<FSMData> _consumerClbcFSMData) {
    if (caIdx <= this.lgIcl) {

    } else {

      List<StorageCommand> _listCmadStorageCommand = ActionMarshaller.bytcmList(
          _rtRequestData.getCmadByteArray(), this.commandReaderFactory);

      int _iItn = this._exrttkiForCo(_listCmadStorageCommand);

      boolean _isItra = this._isInrlForCo(_listCmadStorageCommand);

      String title = _rtRequestData.getStrNt();

      Integer _iIte =
          _isItra ? this.tokenRegistry.getIdInternal(title) : this.tokenRegistry.getId(title);
      if (_iIte != null) {

        _consumerClbcFSMData.accept(FSMData.ofFSMData(_iIte));
      } else {

        NamedToken _etNamedToken = _isItra ? this.tokenRegistry.getTokenInternal(_iItn)
            : this.tokenRegistry.getToken(_iItn);
        if (_etNamedToken != null) {

          _consumerClbcFSMData.accept(
              FSMData.ofFSMData(
                  new TransientTransactionFailureException(Transaction.Outdated,
                      "*** Error:  5073e56c-f7cc-4099-96dc-bc286305d16a")));
        } else {

          this._apltosoForLi(_listCmadStorageCommand, caIdx);
          _consumerClbcFSMData.accept(FSMData.ofFSMData(_iItn));
        }
      }
    }
  }

  @Override
  public synchronized void fls() {
  }


  public synchronized void inlcmpoForTr(long _lgIcl,
      TransactionCommitProcess _transactionCommitProcess) {
    this.transactionCommitProcess = _transactionCommitProcess;
    this.lgIcl = _lgIcl;
    this.chFSMUtils.upelaecmin(_lgIcl);


  }


  public synchronized void inlcmrefrForCo(CommandReaderFactory _commandReaderFactory) {
    this.commandReaderFactory = _commandReaderFactory;
  }

  @Override
  public long laapdix() {
    if (this.transactionCommitProcess == null) {

      throw new IllegalStateException("*** Error:  ac6b4acb-136c-45c7-83f1-6163690c82db");
    } else {
      return this.lgIcl;
    }
  }
}
