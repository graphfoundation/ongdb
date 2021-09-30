package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import akka.cluster.UniqueAddress;


public class UniqueAddressJSerializer extends AbstractJSerializer<UniqueAddress> {


  private static final int SIEN = 256;

  public UniqueAddressJSerializer() {
    super(UniqueAddressSafeChannelMarshal.IT, 256, 1002);
  }
}
