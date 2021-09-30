package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper;
import java.io.IOException;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerId.Marshal;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;


public class CoreGDMCWSafeChannelMarshal extends SafeChannelMarshal<GdbDiscoveryMetaCoreWrapper> {


  public static final CoreGDMCWSafeChannelMarshal IT = new CoreGDMCWSafeChannelMarshal();


  private final ChannelMarshal<ServerId> channelMarshalMisServerId;


  private final ChannelMarshal<GdbDiscoveryMetaCoreImpl> channelMarshalMiscGdbDiscoveryMetaCoreImpl;

  private CoreGDMCWSafeChannelMarshal() {
    this.channelMarshalMisServerId = Marshal.INSTANCE;
    this.channelMarshalMiscGdbDiscoveryMetaCoreImpl = CoreDiscoveryServerInfoMarshal.IT;
  }

  @Override
  public void marshal(GdbDiscoveryMetaCoreWrapper _isfiscGdbDiscoveryMetaCoreWrapper,
      WritableChannel _writableChannel) throws IOException {
    this.channelMarshalMisServerId.marshal(_isfiscGdbDiscoveryMetaCoreWrapper.getServerId(),
        _writableChannel);
    this.channelMarshalMiscGdbDiscoveryMetaCoreImpl.marshal(
        _isfiscGdbDiscoveryMetaCoreWrapper.getIscGdbDiscoveryMetaCoreImpl(), _writableChannel);
  }

  @Override
  protected GdbDiscoveryMetaCoreWrapper unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    ServerId _serverId = this.channelMarshalMisServerId.unmarshal(_readableChannel);

    GdbDiscoveryMetaCoreImpl _csiGdbDiscoveryMetaCoreImpl = this.channelMarshalMiscGdbDiscoveryMetaCoreImpl.unmarshal(
        _readableChannel);
    return new GdbDiscoveryMetaCoreWrapper(_csiGdbDiscoveryMetaCoreImpl, _serverId);
  }
}
