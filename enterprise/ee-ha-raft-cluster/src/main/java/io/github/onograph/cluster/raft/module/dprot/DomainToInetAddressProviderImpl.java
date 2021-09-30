package io.github.onograph.cluster.raft.module.dprot;

import java.net.InetAddress;


public class DomainToInetAddressProviderImpl implements DomainToInetAddressProvider {

  @Override
  public InetAddress[] revdanmInetAddress(String _strHsnm) throws AddressNotFoundException {
    try {
      return InetAddress.getAllByName(_strHsnm);
    } catch (

        java.net.UnknownHostException _unknownHostException) {
      throw new AddressNotFoundException(_unknownHostException);
    }
  }
}
