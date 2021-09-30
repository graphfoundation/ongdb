package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.util.OptionalLong;
import org.neo4j.storageengine.api.StoreId;


class CatchupStoreTxFacade {


  private final StoreId epceStoreId;


  private final boolean isIsfh;


  private final CatchupMDTxsWrapper trCatchupMDTxsWrapper;


  private CatchupStoreTxFacade(StoreId _epceStoreId, boolean _isHfsi,
      CatchupMDTxsWrapper _trCatchupMDTxsWrapper) {
    this.epceStoreId = _epceStoreId;
    this.isIsfh = _isHfsi;
    this.trCatchupMDTxsWrapper = _trCatchupMDTxsWrapper;
  }


  private CatchupStoreTxFacade(StoreId _epceStoreId, CatchupMDTxsWrapper _trCatchupMDTxsWrapper) {
    this(_epceStoreId, false, _trCatchupMDTxsWrapper);
  }


  static CatchupStoreTxFacade crecefoccuCatchupStoreTxFacade(TxMeta _csTxMeta,
      StoreId _epceStoreId) {
    if (_csTxMeta.tranlinOptional().isPresent()) {
      return new CatchupStoreTxFacade(_epceStoreId,
          CatchupMDTxsWrapper.nocotiCatchupMDTxsWrapper(_csTxMeta.tranlinOptional().get() + 1L));
    } else {

      long _lgIsdm = _csTxMeta.getLgIsdm();
      return _lgIsdm == 1L ? new CatchupStoreTxFacade(_epceStoreId,
          CatchupMDTxsWrapper.nocotiCatchupMDTxsWrapper(_lgIsdm + 1L))
          : new CatchupStoreTxFacade(_epceStoreId, true,
              CatchupMDTxsWrapper.nocotiCatchupMDTxsWrapper(_lgIsdm));
    }
  }


  static CatchupStoreTxFacade crecefosrcyCatchupStoreTxFacade(StoreId _epceStoreId,
      CatchupMDTxsWrapper _trCatchupMDTxsWrapper) {
    return new CatchupStoreTxFacade(_epceStoreId, _trCatchupMDTxsWrapper);
  }


  OptionalLong faasaiOptionalLong() {
    return this.isIsfh ? OptionalLong.of(this.sttiexi() + 1L) : OptionalLong.empty();
  }


  StoreId getEpceStoreId() {
    return this.epceStoreId;
  }


  boolean isCorre(long _lgTwl) {
    return this.trCatchupMDTxsWrapper.isNoreidti()
        || this.trCatchupMDTxsWrapper.getLgTr() <= _lgTwl;
  }


  long sttiexi() {
    return this.trCatchupMDTxsWrapper.getLgIts() - 1L;
  }
}
