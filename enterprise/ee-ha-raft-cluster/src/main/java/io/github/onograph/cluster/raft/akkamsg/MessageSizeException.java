package io.github.onograph.cluster.raft.akkamsg;

import java.io.IOException;


public class MessageSizeException extends IOException {

  public MessageSizeException(String m) {
    super(m);
  }
}
