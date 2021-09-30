package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSync;
import io.github.onograph.cluster.raft.utils.RemoteStoreVerifier;
import io.github.onograph.config.TxFlowType;
import java.io.IOException;
import java.util.Objects;
import java.util.Optional;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore;
import org.neo4j.kernel.impl.transaction.log.NoSuchTransactionException;
import org.neo4j.kernel.impl.transaction.log.TransactionCursor;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.KernelVersionRepository;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionIdStore;


public class TransactionBlockGenerator {


  private final Database dDatabase;


  private final KernelVersionRepository kernelVersionRepository;


  private final Log log;


  private final LogProvider logProvider;


  private final TransactionIdStore sitTransactionIdStore;


  private final TxFlowType ssTxFlowType;


  private final LogicalTransactionStore stlLogicalTransactionStore;


  public TransactionBlockGenerator(Database _dDatabase,
      KernelVersionRepository _kernelVersionRepository, LogProvider _logProvider,
      TxFlowType _ssTxFlowType, LogicalTransactionStore _stlLogicalTransactionStore,
      TransactionIdStore _tisTransactionIdStore) {
    this.log = _logProvider.getLog(this.getClass());
    this.logProvider = _logProvider;
    this.sitTransactionIdStore = _tisTransactionIdStore;
    this.dDatabase = _dDatabase;
    this.stlLogicalTransactionStore = _stlLogicalTransactionStore;
    this.ssTxFlowType = _ssTxFlowType;
    this.kernelVersionRepository = _kernelVersionRepository;
  }


  private TransactionBlockLimiters _crecttTransactionBlockLimiters(long _lgItcl,
      TxFlowType _srtgTxFlowType) {
    switch (_srtgTxFlowType) {
      case TFT_START:
        return new TransactionBlockLimiters.Configured(_lgItcl);
      case TFT_UNLMT:
        return TransactionBlockLimiters.UNOD_TRANSACTION_BLOCK_LIMITERS;
      default:

        throw new IllegalArgumentException("*** Error: a2447032-26fe-422b-9a34-af4b857c0f51");
    }
  }


  public Setup prpeTransactionBlockGeneratorSetup(RequestTransactionSync _requestTransactionSync)
      throws IOException {
    if (!_requestTransactionSync.isVad()) {

      return Setup.faiTransactionBlockGeneratorSetup(CatchupStatusType.CST_BAD_REQ);
    } else {

      long _lgItf = _requestTransactionSync.getLgItp() + 1L;
      if (!this.dDatabase.getDatabaseAvailabilityGuard().isAvailable()) {

        return Setup.faiTransactionBlockGeneratorSetup(
            CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR);
      } else {

        StoreId _epceStoreId = _requestTransactionSync.getEpceStoreId();

        StoreId _lclStoreId = this.dDatabase.getStoreId();
        if (!RemoteStoreVerifier.isVaretuetsofoForStStSt(_lclStoreId, _epceStoreId,
            this.dDatabase.getStorageEngineFactory())) {

          return Setup.faiTransactionBlockGeneratorSetup(CatchupStatusType.CST_STORE_NOT_SAME_ERR);
        } else {

          long _lgPit;
          try {
            _lgPit = this.sitTransactionIdStore.getLastCommittedTransactionId();
          } catch (

              Exception _exception) {

            return Setup.faiTransactionBlockGeneratorSetup(
                CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR);
          }

          if (_lgPit < _lgItf) {
            return Setup.nohgtsdTransactionBlockGeneratorSetup(_lgPit);
          } else {
            try {

              TransactionCursor _tasciTransactionCursor = this.stlLogicalTransactionStore.getTransactions(
                  _lgItf);

              TransactionBlockLimiters _cntanTransactionBlockLimiters = this._crecttTransactionBlockLimiters(
                  _lgPit, this.ssTxFlowType);

              KernelVersion _kernelVersion = this.kernelVersionRepository.kernelVersion();

              TransactionSyncEnvironment _cTransactionSyncEnvironment =
                  new TransactionSyncEnvironment(_cntanTransactionBlockLimiters, _kernelVersion,
                      _lclStoreId, _lgItf, _lgPit,
                      _tasciTransactionCursor, this.sitTransactionIdStore);

              Log _log = this.logProvider.getLog(TransactionBlockServiceMemImpl.class);
              return Setup.okTransactionBlockGeneratorSetup((protocol) ->
              {
                return new TransactionBlockServiceMemImpl(_log, protocol,
                    _cTransactionSyncEnvironment);
              });
            } catch (

                NoSuchTransactionException _noSuchTransactionException) {

              return Setup.faiTransactionBlockGeneratorSetup(CatchupStatusType.CST_TRX_PRN_ERR);
            }
          }
        }
      }
    }
  }


  @FunctionalInterface
  public interface TransactionBlockServiceBuilder {


    TransactionBlockService build(ServerRef _serverRef);
  }


  public static class Setup {


    private final TransactionBlockServiceBuilder fcoyTransactionBlockServiceBuilder;


    private final CatchupStatusType rsosCatchupStatusType;


    private final long transIdx;


    protected Setup(TransactionBlockServiceBuilder _fcoyTransactionBlockServiceBuilder,
        CatchupStatusType _rsosCatchupStatusType, long transIdx) {
      this.fcoyTransactionBlockServiceBuilder = _fcoyTransactionBlockServiceBuilder;
      this.rsosCatchupStatusType = _rsosCatchupStatusType;
      this.transIdx = transIdx;
    }


    public static Setup faiTransactionBlockGeneratorSetup(CatchupStatusType _rcCatchupStatusType) {
      return new Setup(null, _rcCatchupStatusType, -1L);
    }


    public static Setup nohgtsdTransactionBlockGeneratorSetup(long transIdx) {
      return new Setup(null, CatchupStatusType.CST_OK_STREAM_COMPLETE, transIdx);
    }


    public static Setup okTransactionBlockGeneratorSetup(
        TransactionBlockServiceBuilder _fcoyTransactionBlockServiceBuilder) {
      return new Setup(_fcoyTransactionBlockServiceBuilder, null, -1L);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        Setup setup = (Setup) obj;
        return this.transIdx == setup.transIdx
            && this.rsosCatchupStatusType == setup.rsosCatchupStatusType;
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.rsosCatchupStatusType, this.transIdx);
    }


    public Optional<TransactionChunkingCompleted> repsOptional() {
      return Optional.ofNullable(this.rsosCatchupStatusType).map((result) ->
      {
        return new TransactionChunkingCompleted(this.transIdx, result);
      });
    }


    public Optional<TransactionBlockService> txstaOptional(ServerRef _poooServerRef) {
      return Optional.ofNullable(this.fcoyTransactionBlockServiceBuilder).map((fact) ->
      {
        return fact.build(_poooServerRef);
      });
    }


  }
}
