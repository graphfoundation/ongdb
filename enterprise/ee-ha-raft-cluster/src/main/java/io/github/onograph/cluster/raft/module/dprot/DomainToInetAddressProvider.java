package io.github.onograph.cluster.raft.module.dprot;

import java.net.InetAddress;


public interface DomainToInetAddressProvider {


  InetAddress[] revdanmInetAddress(String _strV) throws AddressNotFoundException;
}
