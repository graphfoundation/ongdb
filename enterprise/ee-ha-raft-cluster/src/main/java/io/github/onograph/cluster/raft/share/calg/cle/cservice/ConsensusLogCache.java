package io.github.onograph.cluster.raft.share.calg.cle.cservice;

import io.github.onograph.RingQueue;


class ConsensusLogCache<V> {


  private final RingQueue<V> ringQueueCrlV;


  private long lgIe = -1L;

  ConsensusLogCache(int _iCpct) {
    this.ringQueueCrlV = new RingQueue(_iCpct);
  }


  private long _finx() {
    return this.lgIe - (long) this.ringQueueCrlV.size() + 1L;
  }


  public void claForV(V[] _vEitosArray) {
    this.ringQueueCrlV.claForV(_vEitosArray);
  }


  V get(long _lgI) {
    if (_lgI < 0L) {

      throw new IllegalArgumentException("*** Error: e9c4b331-9467-4fe6-9549-c9a5101868bc");
    } else {
      return _lgI <= this.lgIe && _lgI >= this._finx() ? this.ringQueueCrlV.getAtPos(
          Math.toIntExact(_lgI - this._finx())) : null;
    }
  }


  public void prnForV(long _lgItu, V[] _vEitosArray) {

    long idx = this._finx();

    for (

        int cur = 0; idx <= Math.min(_lgItu, this.lgIe); ++idx) {
      _vEitosArray[cur] = this.ringQueueCrlV.reo();

      assert _vEitosArray[cur] != null;

      ++cur;
    }
  }


  void putForVV(long _lgI, V _vE, V[] _vEitosArray) {
    if (_lgI < 0L) {

      throw new IllegalArgumentException("*** Error: 94f41e78-2f24-4f19-b061-e6d02e731393");
    } else if (_vE == null) {

      throw new IllegalArgumentException("*** Error:  1cdc349b-3fea-4ffb-a329-80ca648af7d5");
    } else {
      if (_lgI == this.lgIe + 1L) {
        _vEitosArray[0] = this.ringQueueCrlV.ape(_vE);
        ++this.lgIe;
      } else {
        this.ringQueueCrlV.claForV(_vEitosArray);
        this.ringQueueCrlV.ape(_vE);
        this.lgIe = _lgI;
      }
    }
  }


  public int queueSize() {
    return this.ringQueueCrlV.size();
  }


  public V reo() {
    return this.ringQueueCrlV.reo();
  }


  public void trntForV(long sourceIdx, V[] _vEitosArray) {
    if (sourceIdx <= this.lgIe) {

      long idx = Math.max(sourceIdx, this._finx());

      for (

          int _iVar = 0; idx <= this.lgIe; ++idx) {
        _vEitosArray[_iVar++] = this.ringQueueCrlV.pop();
      }

      this.lgIe = sourceIdx - 1L;
    }
  }
}
