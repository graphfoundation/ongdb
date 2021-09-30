package io.github.onograph.cluster.raft.module.dprot;


public class AddressNotFoundException extends RuntimeException {

  AddressNotFoundException(java.net.UnknownHostException _unknownHostException) {
    super(_unknownHostException);
  }
}
