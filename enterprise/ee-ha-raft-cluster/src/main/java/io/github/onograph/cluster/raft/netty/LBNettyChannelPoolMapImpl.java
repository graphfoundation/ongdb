package io.github.onograph.cluster.raft.netty;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.pool.ChannelPool;
import io.netty.channel.pool.ChannelPoolHandler;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import org.neo4j.configuration.helpers.SocketAddress;


public class LBNettyChannelPoolMapImpl extends
    DefaultNettyChannelPoolMapImpl<LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO> {


  private final BiFunction<SocketAddress, Integer, Integer> biFunctionRrsii;


  private final int iCm;


  private final Map<SocketAddress, List<ChannelPool>> mapCanlsl = new HashMap();


  private final Map<SocketAddress, Integer> mapCcsi = new HashMap();

  public LBNettyChannelPoolMapImpl(Bootstrap _bBootstrap, ChannelPoolHandler _channelPoolHandler,
      NettyChannelPoolBuilder _fpNettyChannelPoolBuilder, int _iCm) {
    super(_bBootstrap, _channelPoolHandler, _fpNettyChannelPoolBuilder,
        ConsensusSocketAddressDTO::unostaeInetSocketAddress);
    this.iCm = _iCm;
    this.biFunctionRrsii = (k, v) ->
    {
      return v == null ? 0 : (v + 1) % _iCm;
    };
  }


  private ChannelPool _crenchlChannelPool(ConsensusSocketAddressDTO consensusSocketAddressDTO,
      List<ChannelPool> _listScChannelPool) {

    ChannelPool _channelPool = super.newPool(consensusSocketAddressDTO);
    _listScChannelPool.add(_channelPool);
    return _channelPool;
  }


  private ChannelPool _gentcaeChannelPool(List<ChannelPool> _listCsChannelPool,
      SocketAddress _socketAddress) {

    Integer _iIc = this.mapCcsi.compute(_socketAddress, this.biFunctionRrsii);
    return _listCsChannelPool.get(_iIc);
  }

  @Override
  protected synchronized ChannelPool newPool(ConsensusSocketAddressDTO consensusSocketAddressDTO) {

    SocketAddress _socketAddress = consensusSocketAddressDTO.socketAddress;

    List<ChannelPool> _listCsChannelPool = this.mapCanlsl.computeIfAbsent(_socketAddress,
        (ignored) ->
        {
          return new ArrayList(this.iCm);
        });
    return _listCsChannelPool.size() < this.iCm ? this._crenchlChannelPool(
        consensusSocketAddressDTO, _listCsChannelPool)
        : this._gentcaeChannelPool(_listCsChannelPool, _socketAddress);
  }


  public static class ConsensusSocketAddressDTO {


    private final ConsensusMemberGroupId consensusMemberGroupId;


    private final SocketAddress socketAddress;

    public ConsensusSocketAddressDTO(ConsensusMemberGroupId _consensusMemberGroupId,
        SocketAddress _socketAddress) {
      this.consensusMemberGroupId = _consensusMemberGroupId;
      this.socketAddress = _socketAddress;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        ConsensusSocketAddressDTO _thaConsensusSocketAddressDTO = (ConsensusSocketAddressDTO) obj;
        return Objects.equals(this.consensusMemberGroupId,
            _thaConsensusSocketAddressDTO.consensusMemberGroupId) &&
            Objects.equals(this.socketAddress, _thaConsensusSocketAddressDTO.socketAddress);
      } else {
        return false;
      }
    }


    public SocketAddress getSocketAddress() {
      return this.socketAddress;
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.consensusMemberGroupId, this.socketAddress);
    }


    public InetSocketAddress unostaeInetSocketAddress() {
      return InetSocketAddress.createUnresolved(this.getSocketAddress().getHostname(),
          this.getSocketAddress().getPort());
    }
  }
}
