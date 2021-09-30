package io.github.onograph.cluster.raft.module.dprot;

import java.net.InetAddress;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class DomainToInetAddressProviderConfImpl implements DomainToInetAddressProvider {


  private final Map<String, InetAddress[]> inetAddressMap;

  public DomainToInetAddressProviderConfImpl(Map<String, InetAddress[]> _inetAddressMap) {
    this.inetAddressMap = _inetAddressMap;
  }


  private static InetAddress _intadsInetAddress(String _strAdes) {
    try {
      return InetAddress.getByName(_strAdes);
    } catch (

        java.net.UnknownHostException _unknownHostException) {
      throw new AddressNotFoundException(_unknownHostException);
    }
  }

  @Override
  public InetAddress[] revdanmInetAddress(String _strHsnm) throws AddressNotFoundException {
    return Optional.ofNullable(this.inetAddressMap.get(_strHsnm)).orElse(new InetAddress[0]);
  }


  public void sehseaeForStCo(Collection<String> _collectionAdessString, String _strHsnm) {

    InetAddress[] _apInetAddressArray = new InetAddress[_collectionAdessString.size()];
    ((List) _collectionAdessString.stream()
        .map(DomainToInetAddressProviderConfImpl::_intadsInetAddress)
        .collect(Collectors.toList())).toArray(
        _apInetAddressArray);
    this.inetAddressMap.put(_strHsnm, _apInetAddressArray);
  }
}
