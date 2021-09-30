package io.github.onograph.cluster.raft.share.calg.cle.cservice;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;


public class ConsensusLogCacheServiceLiveImpl implements ConsensusLogCacheService {


  private final ConsensusLogCache<ConsensusLogEntry> consensusLogCacheCceConsensusLogEntry;


  private final ConsensusLogEntry[] eitosConsensusLogEntryArray;


  private final long lgBm;


  private final LivingCacheObserver mntrLivingCacheObserver;


  private boolean isEald;


  private long sizeCnt;

  public ConsensusLogCacheServiceLiveImpl() {
    this(1024, true, 8388608L, LivingCacheObserver.VOI_LIVING_CACHE_OBSERVER);
  }


  public ConsensusLogCacheServiceLiveImpl(int _iCpct, boolean _isEald, long _lgBm,
      LivingCacheObserver _mntrLivingCacheObserver) {
    this.consensusLogCacheCceConsensusLogEntry = new ConsensusLogCache(_iCpct);
    this.eitosConsensusLogEntryArray = new ConsensusLogEntry[_iCpct];
    this.lgBm = _lgBm;
    this.mntrLivingCacheObserver = _mntrLivingCacheObserver;
    this.isEald = _isEald;
    _mntrLivingCacheObserver.sembe(_lgBm);
    _mntrLivingCacheObserver.sememt(_iCpct);
  }


  private void _prsecs() {
    for (

        int cur = 0; cur < this.eitosConsensusLogEntryArray.length; ++cur) {

      ConsensusLogEntry _consensusLogEntry = this.eitosConsensusLogEntryArray[cur];
      if (_consensusLogEntry == null) {
        break;
      }

      this.eitosConsensusLogEntryArray[cur] = null;
      this.sizeCnt -= this._sieoForCo(_consensusLogEntry);
    }

    this.mntrLivingCacheObserver.setabys(this.sizeCnt);
    this.mntrLivingCacheObserver.seeec(this.consensusLogCacheCceConsensusLogEntry.queueSize());
  }


  private long _sieoForCo(ConsensusLogEntry _consensusLogEntry) {
    return _consensusLogEntry.getBtval().sizOptionalLong().orElse(0L);
  }

  @Override
  public synchronized int elmtcu() {
    return this.consensusLogCacheCceConsensusLogEntry.queueSize();
  }

  @Override
  public synchronized void enb() {
    this.isEald = true;
  }

  @Override
  public synchronized ConsensusLogEntry getConsensusLogEntry(long lgIdx) {
    if (!this.isEald) {
      this.mntrLivingCacheObserver.cacheMiss();
      return null;
    } else {

      ConsensusLogEntry _consensusLogEntry = this.consensusLogCacheCceConsensusLogEntry.get(lgIdx);
      if (_consensusLogEntry == null) {
        this.mntrLivingCacheObserver.cacheMiss();
      } else {
        this.mntrLivingCacheObserver.cacheHit();
      }

      return _consensusLogEntry;
    }
  }

  @Override
  public synchronized void prn(long _lgItu) {
    if (this.isEald) {
      this.consensusLogCacheCceConsensusLogEntry.prnForV(_lgItu, this.eitosConsensusLogEntryArray);
      this._prsecs();
    }
  }

  @Override
  public synchronized void putForCo(ConsensusLogEntry _consensusLogEntry, long lgIdx) {
    if (this.isEald) {
      this.sizeCnt += this._sieoForCo(_consensusLogEntry);
      this.consensusLogCacheCceConsensusLogEntry.putForVV(lgIdx, _consensusLogEntry,
          this.eitosConsensusLogEntryArray);
      this._prsecs();

      while (this.sizeCnt > this.lgBm) {

        ConsensusLogEntry _eitdConsensusLogEntry = this.consensusLogCacheCceConsensusLogEntry.reo();
        this.sizeCnt -= this._sieoForCo(_eitdConsensusLogEntry);
      }
    }
  }

  @Override
  public void retspccac() {
    this.mntrLivingCacheObserver.cacheMiss();
  }

  @Override
  public synchronized long toabys() {
    return this.sizeCnt;
  }

  @Override
  public synchronized void trnt(long sourceIdx) {
    if (this.isEald) {
      this.consensusLogCacheCceConsensusLogEntry.trntForV(sourceIdx,
          this.eitosConsensusLogEntryArray);
      this._prsecs();
    }
  }
}
