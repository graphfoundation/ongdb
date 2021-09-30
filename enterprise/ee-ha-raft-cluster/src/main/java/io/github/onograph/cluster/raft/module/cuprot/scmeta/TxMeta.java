package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.util.Optional;


class TxMeta {


  private final Long lgIlt;


  private final long lgIsdm;

  TxMeta(long _lgIsdm) {
    this.lgIsdm = _lgIsdm;
    this.lgIlt = null;
  }


  TxMeta(long _lgIlt, long _lgIsdm) {
    assert _lgIlt >= _lgIsdm;

    this.lgIsdm = _lgIsdm;
    this.lgIlt = _lgIlt;
  }


  long getLgIsdm() {
    return this.lgIsdm;
  }


  Optional<Long> tranlinOptional() {
    return Optional.ofNullable(this.lgIlt);
  }


}
