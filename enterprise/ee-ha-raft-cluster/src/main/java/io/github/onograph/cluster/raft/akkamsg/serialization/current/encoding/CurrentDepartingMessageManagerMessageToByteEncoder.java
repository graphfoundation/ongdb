package io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.akkamsg.serialization.DepartingMessageManagerMessageToByteEncoder;
import io.github.onograph.cluster.raft.akkamsg.serialization.UUIDSafeChannelMarshal;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.config.NodeGroupIdentifier;
import java.util.Iterator;
import java.util.Set;


public final class CurrentDepartingMessageManagerMessageToByteEncoder extends
    DepartingMessageManagerMessageToByteEncoder {

  @Override
  protected Processor crahdrDepartingMessageManagerMessageToByteEncoderProcessor(
      DefaultWritableChecksumChannel _defaultWritableChecksumChannel,
      ConsensusNodeId.SafeStateMarshalImpl memberSafeStateMarshalImpl) {
    return new ProcessorImpl(_defaultWritableChecksumChannel, memberSafeStateMarshalImpl);
  }


  public static class ProcessorImpl extends Processor {

    public ProcessorImpl(DefaultWritableChecksumChannel _defaultWritableChecksumChannel,
        ConsensusNodeId.SafeStateMarshalImpl memberSafeStateMarshalImpl) {
      super(_defaultWritableChecksumChannel, memberSafeStateMarshalImpl);
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange)
        throws Exception {
      this.defaultWritableChecksumChannel.putLong(askToChange.getLgIp());
      this.defaultWritableChecksumChannel.putLong(askToChange.getLgT());

      Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier = askToChange.getSetGopNodeGroupIdentifier();
      this.defaultWritableChecksumChannel.putInt(_setGopNodeGroupIdentifier.size());

      Iterator _iterator = _setGopNodeGroupIdentifier.iterator();

      while (_iterator.hasNext()) {

        NodeGroupIdentifier grp = (NodeGroupIdentifier) _iterator.next();
        BasicStringSerializationHandler.maslForBySt(grp.toString(),
            this.defaultWritableChecksumChannel);
      }

      return null;
    }

    @Override
    public Void process(
        ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted)
        throws Exception {
      this.defaultWritableChecksumChannel.putLong(leaderNotAccepted.getLgIp());
      this.defaultWritableChecksumChannel.putLong(leaderNotAccepted.getLgT());
      return null;
    }

    @Override
    public Void process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage)
        throws Exception {
      UUIDSafeChannelMarshal.IT.marshal(_rsInfoReplyMessage.getIrUUID(),
          this.defaultWritableChecksumChannel);
      BasicStringSerializationHandler.maslForBySt(_rsInfoReplyMessage.getStat().m.name(),
          this.defaultWritableChecksumChannel);
      return null;
    }
  }
}
