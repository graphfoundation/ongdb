package io.github.onograph.cluster.raft.module.cuprot;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ServerChannelInboundHandlerAdapter extends ChannelInboundHandlerAdapter {


  private final Log log;


  private final ServerRef poooServerRef;


  public ServerChannelInboundHandlerAdapter(LogProvider _logProvider, ServerRef _poooServerRef) {
    this.poooServerRef = _poooServerRef;
    this.log = _logProvider.getLog(this.getClass());
  }

  @Override
  public void channelRead(ChannelHandlerContext _cChannelHandlerContext, Object m) {
    if (this.poooServerRef.isExcnForE(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE)) {

      AskMessageType _tmrAskMessageType = AskMessageType.froAskMessageType(
          ((ByteBuf) m).readByte());
      if (_tmrAskMessageType.equals(AskMessageType.AMT_TRX_IN_ASK)) {
        this.poooServerRef.exeForE(
            io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.TRX_IN);
      } else if (_tmrAskMessageType.equals(AskMessageType.AMT_STORE_GUID_ASK)) {
        this.poooServerRef.exeForE(
            io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_SUID);
      } else if (_tmrAskMessageType.equals(AskMessageType.AMT_GDB_GUID)) {
        this.poooServerRef.exeForE(
            io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_GDB_UID);
      } else if (_tmrAskMessageType.equals(AskMessageType.AMT_CS_ASK)) {
        this.poooServerRef.exeForE(
            io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_CSS);
      } else if (_tmrAskMessageType.equals(AskMessageType.AMT_SET_SC)) {
        this.poooServerRef.exeForE(
            io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.SET_SC);
      } else if (_tmrAskMessageType.equals(AskMessageType.AMT_SC_FP)) {
        this.poooServerRef.exeForE(
            io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_SF);
      } else if (_tmrAskMessageType.equals(AskMessageType.AMT_ALL_GDB_GUID_ASK)) {
        this.poooServerRef.exeForE(
            io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_GDB_UIDS);
      } else if (_tmrAskMessageType.equals(AskMessageType.AMT_STATS)) {
        this.poooServerRef.exeForE(
            io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_STAT_INFO);
      } else if (_tmrAskMessageType.equals(AskMessageType.AMT_MD_ASK)) {
        this.poooServerRef.exeForE(
            io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_META);
      } else {

      }

      ReferenceCountUtil.release(m);
    } else {
      _cChannelHandlerContext.fireChannelRead(m);
    }
  }
}
