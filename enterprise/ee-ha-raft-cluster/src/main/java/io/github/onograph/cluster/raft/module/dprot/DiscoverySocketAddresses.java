package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.configuration.connectors.BoltConnector;
import org.neo4j.configuration.connectors.HttpConnector;
import org.neo4j.configuration.connectors.HttpsConnector;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeChannelMarshal;


public class DiscoverySocketAddresses {


  private final io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper abcdSocketAddressWrapper;


  private final io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper ahdSocketAddressWrapper;


  private final io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper ahdSocketAddressWrapper2;


  private final io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper dicbaSocketAddressWrapper;


  private final List<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper> listUceSocketAddressWrapper;

  private DiscoverySocketAddresses(
      io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _abcSocketAddressWrapper,
      io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _abciSocketAddressWrapper,
      io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _ahSocketAddressWrapper,
      io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _ahSocketAddressWrapper2,
      List<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper> _listUceSocketAddressWrapper) {
    this.abcdSocketAddressWrapper = _abcSocketAddressWrapper;
    this.ahdSocketAddressWrapper = _ahSocketAddressWrapper;
    this.ahdSocketAddressWrapper2 = _ahSocketAddressWrapper2;
    this.dicbaSocketAddressWrapper = _abciSocketAddressWrapper;
    this.listUceSocketAddressWrapper = _listUceSocketAddressWrapper;
  }


  public static DiscoverySocketAddresses frmcngDiscoverySocketAddresses(Config _config) {

    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _abciSocketAddressWrapper = null;

    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _ahSocketAddressWrapper = null;

    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _ahSocketAddressWrapper2 = null;

    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _abcSocketAddressWrapper =
        new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
            _config.get(BoltConnector.advertised_address),
            io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt);

    boolean _isRrni = _config.get(GraphDatabaseSettings.mode) != Mode.READ_REPLICA;
    if (_config.get(GraphDatabaseSettings.routing_enabled) && _isRrni) {
      _abciSocketAddressWrapper = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
          _config.get(GraphDatabaseSettings.routing_advertised_address),
          io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt);
    }

    if (_config.get(HttpConnector.enabled)) {
      _ahSocketAddressWrapper = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
          _config.get(HttpConnector.advertised_address),
          io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.http);
    }

    if (_config.get(HttpsConnector.enabled)) {
      _ahSocketAddressWrapper2 =
          new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
              _config.get(HttpsConnector.advertised_address),
              io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.https);
    }

    return new DiscoverySocketAddresses(_abcSocketAddressWrapper, _abciSocketAddressWrapper,
        _ahSocketAddressWrapper, _ahSocketAddressWrapper2,
        List.of());
  }


  public static DiscoverySocketAddresses frmlsDiscoverySocketAddresses(
      List<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper> _listUcSocketAddressWrapper) {

    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _abcSocketAddressWrapper = null;

    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _abciSocketAddressWrapper = null;

    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _ahSocketAddressWrapper = null;

    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _ahSocketAddressWrapper2 = null;

    ArrayList<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper> _arrayListUceSocketAddressWrapper =
        new ArrayList();

    Iterator _iterator = _listUcSocketAddressWrapper.iterator();

    while (true) {
      while (_iterator.hasNext()) {

        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _uSocketAddressWrapper =
            (io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper) _iterator.next();
        if (_uSocketAddressWrapper.socketAddressSchemeType ==
            io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt
            &&
            _abcSocketAddressWrapper == null) {
          _abcSocketAddressWrapper = _uSocketAddressWrapper;
        } else if (_uSocketAddressWrapper.socketAddressSchemeType ==
            io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt
            &&
            _abciSocketAddressWrapper == null) {
          _abciSocketAddressWrapper = _uSocketAddressWrapper;
        } else if (_uSocketAddressWrapper.socketAddressSchemeType ==
            io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.http
            &&
            _ahSocketAddressWrapper == null) {
          _ahSocketAddressWrapper = _uSocketAddressWrapper;
        } else if (_uSocketAddressWrapper.socketAddressSchemeType ==
            io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.https
            &&
            _ahSocketAddressWrapper2 == null) {
          _ahSocketAddressWrapper2 = _uSocketAddressWrapper;
        } else {
          _arrayListUceSocketAddressWrapper.add(_uSocketAddressWrapper);
        }
      }

      return new DiscoverySocketAddresses(_abcSocketAddressWrapper, _abciSocketAddressWrapper,
          _ahSocketAddressWrapper, _ahSocketAddressWrapper2,
          _arrayListUceSocketAddressWrapper);
    }
  }


  private Stream<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper> _orecnrStream() {

    Stream<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper> _streamCdSocketAddressWrapper =
        Stream.of(this.abcdSocketAddressWrapper, this.dicbaSocketAddressWrapper,
            this.ahdSocketAddressWrapper, this.ahdSocketAddressWrapper2);
    return Stream.concat(_streamCdSocketAddressWrapper.filter(Objects::nonNull),
        this.listUceSocketAddressWrapper.stream());
  }


  public SocketAddress cltbasSocketAddress() {
    if (this.abcdSocketAddressWrapper == null) {

      throw new IllegalArgumentException("*** Error:  1f418924-3c7c-4092-9334-6a7dacda5e8b");
    } else {
      return this.abcdSocketAddressWrapper.socketAddress;
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      DiscoverySocketAddresses _thDiscoverySocketAddresses = (DiscoverySocketAddresses) obj;
      return Objects.equals(this.abcdSocketAddressWrapper,
          _thDiscoverySocketAddresses.abcdSocketAddressWrapper) &&
          Objects.equals(this.dicbaSocketAddressWrapper,
              _thDiscoverySocketAddresses.dicbaSocketAddressWrapper) &&
          Objects.equals(this.ahdSocketAddressWrapper,
              _thDiscoverySocketAddresses.ahdSocketAddressWrapper) &&
          Objects.equals(this.ahdSocketAddressWrapper2,
              _thDiscoverySocketAddresses.ahdSocketAddressWrapper2) &&
          Objects.equals(this.listUceSocketAddressWrapper,
              _thDiscoverySocketAddresses.listUceSocketAddressWrapper);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.abcdSocketAddressWrapper, this.dicbaSocketAddressWrapper,
        this.ahdSocketAddressWrapper, this.ahdSocketAddressWrapper2,
        this.listUceSocketAddressWrapper);
  }


  public Optional<SocketAddress> incebtaeOptional() {
    return Optional.ofNullable(this.dicbaSocketAddressWrapper).map((rec$) ->
    {
      return rec$.getSocketAddress();
    });
  }


  public List<String> pulultList() {
    return this._orecnrStream().filter((uri) ->
    {
      return !Objects.equals(uri, this.dicbaSocketAddressWrapper);
    }).map(SocketAddressWrapper::toString).collect(Collectors.toList());
  }

  @Override
  public String toString() {
    return this._orecnrStream().map(SocketAddressWrapper::toString)
        .collect(Collectors.joining(","));
  }


  public enum SocketAddressSchemeType {


    bolt,

    http,

    https
  }


  public static class DiscoverySocketAddressesSafeChannelMarshal extends
      SafeChannelMarshal<DiscoverySocketAddresses> {


    public static final io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.DiscoverySocketAddressesSafeChannelMarshal IT =
        new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.DiscoverySocketAddressesSafeChannelMarshal();

    private DiscoverySocketAddressesSafeChannelMarshal() {
    }

    @Override
    public void marshal(DiscoverySocketAddresses _ucDiscoverySocketAddresses,
        WritableChannel _writableChannel)
        throws IOException {

      List<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper> _listUaSocketAddressWrapper =
          _ucDiscoverySocketAddresses._orecnrStream().collect(Collectors.toList());
      _writableChannel.putInt(_listUaSocketAddressWrapper.size());

      Iterator _iterator = _listUaSocketAddressWrapper.iterator();

      while (_iterator.hasNext()) {

        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _uSocketAddressWrapper =
            (io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper) _iterator.next();
        BasicStringSerializationHandler.maslForBySt(
            _uSocketAddressWrapper.socketAddressSchemeType.name(), _writableChannel);
        BasicStringSerializationHandler.maslForBySt(
            _uSocketAddressWrapper.socketAddress.getHostname(), _writableChannel);
        _writableChannel.putInt(_uSocketAddressWrapper.socketAddress.getPort());
      }
    }

    @Override
    protected DiscoverySocketAddresses unmarshal0(ReadableChannel _readableChannel)
        throws IOException {

      int sz = _readableChannel.getInt();

      List<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper> _listUcSocketAddressWrapper =
          new ArrayList(sz);

      for (

          int cur = 0; cur < sz; ++cur) {

        String _strSn = BasicStringSerializationHandler.unahString(_readableChannel);

        String _strNh = BasicStringSerializationHandler.unahString(_readableChannel);

        int portNumber = _readableChannel.getInt();
        _listUcSocketAddressWrapper
            .add(
                new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
                    new SocketAddress(_strNh, portNumber),
                    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.valueOf(
                        _strSn)));
      }

      return DiscoverySocketAddresses.frmlsDiscoverySocketAddresses(_listUcSocketAddressWrapper);
    }
  }


  public static class SocketAddressWrapper {


    private final SocketAddress socketAddress;


    private final io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType socketAddressSchemeType;


    public SocketAddressWrapper(SocketAddress _socketAddress,
        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType _socketAddressSchemeType) {
      this.socketAddress = _socketAddress;
      this.socketAddressSchemeType = _socketAddressSchemeType;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper _tSocketAddressWrapper =
            (io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper) obj;
        return this.socketAddressSchemeType == _tSocketAddressWrapper.socketAddressSchemeType &&
            Objects.equals(this.socketAddress, _tSocketAddressWrapper.socketAddress);
      } else {
        return false;
      }
    }


    private SocketAddress getSocketAddress() {
      return this.socketAddress;
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.socketAddressSchemeType, this.socketAddress);
    }

    @Override
    public String toString() {
      return String.format("%s://%s", this.socketAddressSchemeType.name().toLowerCase(),
          SocketAddress.format(this.socketAddress.getHostname(), this.socketAddress.getPort()));
    }
  }
}
