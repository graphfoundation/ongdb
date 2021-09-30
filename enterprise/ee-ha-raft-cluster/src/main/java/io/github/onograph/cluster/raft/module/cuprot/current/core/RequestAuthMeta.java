package io.github.onograph.cluster.raft.module.cuprot.current.core;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;


public class RequestAuthMeta extends AbstractCatchupManagementMessageWrapper {


  public final String gdbName;


  public final AuthMetaOptions indmaAuthMetaOptions;

  public RequestAuthMeta(String gdbName, String _strMi) {
    super(AskMessageType.AMT_MD_ASK);
    this.gdbName = gdbName;
    this.indmaAuthMetaOptions = AuthMetaOptions.valueOf(_strMi);
  }

  @Override
  public String decbString() {
    return this.getClass().getSimpleName();
  }
}
