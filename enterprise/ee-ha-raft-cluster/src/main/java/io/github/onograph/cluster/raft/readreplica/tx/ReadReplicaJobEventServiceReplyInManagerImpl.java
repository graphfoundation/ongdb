package io.github.onograph.cluster.raft.readreplica.tx;

import io.github.onograph.cluster.raft.module.cuprot.CatchupReplyChannelManager;


class ReadReplicaJobEventServiceReplyInManagerImpl implements ReadReplicaJobEventService {


  private final CatchupReplyChannelManager catchupReplyChannelManager;


  private final long lgLl;


  private final long lgLu;


  private long lgVc;


  ReadReplicaJobEventServiceReplyInManagerImpl(
      CatchupReplyChannelManager catchupReplyChannelManager, long _lgLl, long _lgLu) {
    if (_lgLu <= _lgLl) {

      throw new IllegalArgumentException("*** Error:  346a7341-ad46-41e3-8743-901c07d63ca1");
    } else {
      this.lgLl = _lgLl;
      this.catchupReplyChannelManager = catchupReplyChannelManager;
      this.lgLu = _lgLu;
    }
  }


  private synchronized void _dere() {
    if (--this.lgVc == this.lgLl) {
      this.catchupReplyChannelManager.openChannel();
    }
  }


  synchronized void inre() {
    if (++this.lgVc == this.lgLu) {
      this.catchupReplyChannelManager.closeChannel();
    }
  }

  @Override
  public void onfauForEx(Exception _exception) {
    this._dere();
  }

  @Override
  public void onsue() {
    this._dere();
  }
}
