package io.github.onograph.cluster.raft.module.dprot;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.neo4j.configuration.helpers.SocketAddress;


public class MemberNodeServiceDiscoveryKickoffImpl implements MemberNodeService {


  public static final Comparator<SocketAddress> comparatorAdtsdaecmtSocketAddress =
      Comparator.comparing(SocketAddress::getHostname).thenComparingInt(SocketAddress::getPort);


  private final DiscoverySocketAddressManager hrDiscoverySocketAddressManager;


  private final List<SocketAddress> listAsaSocketAddress;


  private volatile Optional<SocketAddress> optionalAfSocketAddress;


  public MemberNodeServiceDiscoveryKickoffImpl(List<SocketAddress> _listAsaSocketAddress,
      DiscoverySocketAddressManager _rhDiscoverySocketAddressManager) {
    this.hrDiscoverySocketAddressManager = _rhDiscoverySocketAddressManager;
    this.listAsaSocketAddress = _listAsaSocketAddress;
  }


  public static Comparator<SocketAddress> adtstaecmtComparator() {
    return comparatorAdtsdaecmtSocketAddress;
  }

  @Override
  public Optional<SocketAddress> fOptional() {
    return this.optionalAfSocketAddress;
  }

  @Override
  public boolean isUsord() {
    return this.hrDiscoverySocketAddressManager.isUsord();
  }

  @Override
  public <C extends Collection<T>, T> C reoeCollection(Function<SocketAddress, T> _functionTasomst,
      Supplier<C> _supplierFcC) {

    SocketAddress[] _bfSocketAddressArray = new SocketAddress[1];

    C _cOtu = this.listAsaSocketAddress.stream().flatMap((raw) ->
        {
          return this.hrDiscoverySocketAddressManager.reoeCollection(raw).stream();
        }).sorted(comparatorAdtsdaecmtSocketAddress).distinct().peek((address) ->
        {
          if (_bfSocketAddressArray[0] ==
              null) {
            _bfSocketAddressArray[0] =
                address;
          }
        }).map(_functionTasomst)
        .collect(Collectors.toCollection(_supplierFcC));
    this.optionalAfSocketAddress = Optional.ofNullable(_bfSocketAddressArray[0]);
    return _cOtu;
  }
}
