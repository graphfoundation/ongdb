package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;


public class RequestAllGdbIds extends AbstractCatchupManagementMessageWrapper {

  public RequestAllGdbIds() {
    super(AskMessageType.AMT_ALL_GDB_GUID_ASK);
  }

  @Override
  public String decbString() {
    return this.getClass().getSimpleName();
  }
}
