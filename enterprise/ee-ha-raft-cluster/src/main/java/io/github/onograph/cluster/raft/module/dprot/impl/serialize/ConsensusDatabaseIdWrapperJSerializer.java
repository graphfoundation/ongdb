package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;


public class ConsensusDatabaseIdWrapperJSerializer extends
    AbstractJSerializer<ConsensusMemberGroupId> {


  static final int SIEN = 16;

  public ConsensusDatabaseIdWrapperJSerializer() {
    super(ConsensusMemberGroupId.SafeStateMarshalImpl.IT, 16, 1001);
  }
}
