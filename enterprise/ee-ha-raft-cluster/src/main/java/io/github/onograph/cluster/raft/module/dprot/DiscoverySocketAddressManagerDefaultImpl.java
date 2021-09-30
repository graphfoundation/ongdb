package io.github.onograph.cluster.raft.module.dprot;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.neo4j.configuration.helpers.SocketAddress;


public class DiscoverySocketAddressManagerDefaultImpl implements DiscoverySocketAddressManager {


  public static MemberNodeService reoeMemberNodeService(List<SocketAddress> _listMiSocketAddress) {
    return new MemberNodeServiceDiscoveryKickoffImpl(_listMiSocketAddress,
        new DiscoverySocketAddressManagerDefaultImpl());
  }

  @Override
  public boolean isUsord() {
    return true;
  }

  @Override
  public Collection<SocketAddress> reoeCollection(SocketAddress _avrieSocketAddress) {
    return Collections.singleton(_avrieSocketAddress);
  }
}
