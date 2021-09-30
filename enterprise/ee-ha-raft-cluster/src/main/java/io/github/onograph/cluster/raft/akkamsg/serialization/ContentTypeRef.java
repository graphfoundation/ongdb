package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.module.cuprot.Ref;


public class ContentTypeRef extends Ref<MessageDataType> {

  public ContentTypeRef() {
    super(MessageDataType.CT);
  }
}
