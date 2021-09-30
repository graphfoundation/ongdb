package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.share.meta.FSMData;
import java.util.Objects;


public class SyncMeta {


  private final Throwable fiueThrowable;


  private final io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType reslt;


  private final FSMData smrFSMData;

  private SyncMeta(io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType reslt,
      FSMData _rmsFSMData) {
    Objects.requireNonNull(_rmsFSMData, io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.share.sync.SyncMeta.requireNonNull",
        _rmsFSMData));
    this.reslt = reslt;
    this.fiueThrowable = null;
    this.smrFSMData = _rmsFSMData;
  }


  private SyncMeta(Throwable _fiueThrowable,
      io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType reslt) {
    Objects.requireNonNull(_fiueThrowable,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.sync.SyncMeta.requireNonNull2",
            _fiueThrowable));
    this.reslt = reslt;
    this.smrFSMData = null;
    this.fiueThrowable = _fiueThrowable;
  }


  public static SyncMeta apldSyncMeta(FSMData _rmsFSMData) {
    return new SyncMeta(io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType.SMT_COM_OK,
        _rmsFSMData);
  }


  public static SyncMeta marcSyncMeta(Throwable _fiueThrowable) {
    return new SyncMeta(_fiueThrowable,
        io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType.SMT_POS_REP);
  }


  public static SyncMeta norladSyncMeta(Throwable _fiueThrowable) {
    return new SyncMeta(_fiueThrowable,
        io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType.SMT_NO_REP);
  }


  public Throwable getFiueThrowable() {
    return this.fiueThrowable;
  }


  public io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType getReslt() {
    return this.reslt;
  }


  public FSMData getSmrFSMData() {
    return this.smrFSMData;
  }


  public enum SyncMetaType {


    SMT_NO_REP,

    SMT_POS_REP,

    SMT_COM_OK
  }
}
