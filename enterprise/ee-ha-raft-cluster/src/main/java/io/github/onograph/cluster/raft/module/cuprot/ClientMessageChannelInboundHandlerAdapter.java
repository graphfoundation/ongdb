package io.github.onograph.cluster.raft.module.cuprot;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ClientMessageChannelInboundHandlerAdapter extends ChannelInboundHandlerAdapter {


  private final Log log;


  private final RefCatchupManagerImpl poooRefCatchupManagerImpl;


  public ClientMessageChannelInboundHandlerAdapter(LogProvider _logProvider,
      RefCatchupManagerImpl _poooRefCatchupManagerImpl) {
    this.poooRefCatchupManagerImpl = _poooRefCatchupManagerImpl;
    this.log = _logProvider.getLog(this.getClass());
  }

  @Override
  public void channelRead(ChannelHandlerContext _cChannelHandlerContext, Object m) {
    if (this.poooRefCatchupManagerImpl.isExcnForE(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.MSG_TYPE_IDNT)) {

      byte _vByte = ((ByteBuf) m).readByte();

      AnswerMessageType _tmrAnswerMessageType = AnswerMessageType.mTypeByte(_vByte);
      switch (_tmrAnswerMessageType) {
        case AMT_STORE_GUID:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.STORE_GUID);
          break;
        case AMT_TRX:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.TRF_IN_ANSWER);
          break;
        case AMT_FP:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.F_HDR_VAL);
          break;
        case AMT_SC_COMPLETE:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.SC_COMPLETE);
          break;
        case AMT_CSNAP:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.CS);
          break;
        case AMT_TRX_IS_COMPLETE:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.TRX_STM_COMPLETE);
          break;
        case AMT_SETUP_CT_ANSWER:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.SETUP_SC_ANSWER);
          break;
        case AMT_IS_ANSWER:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.IDX_SS_ANSWER);
          break;
        case AMT_ERR:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.ERR_ANSWER);
          break;
        case AMT_GDB_GUID_ANSWER:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.GDB_UUID);
          break;
        case AMT_ALL_GDB_GUID_ANSWER:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_GDB_UIDS);
          break;
        case AMT_D_ANSWER:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_INFO);
          break;
        case AMT_MD_ANSWER:
          this.poooRefCatchupManagerImpl.exeForE(
              io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_META);
          break;
        default:


      }

      ReferenceCountUtil.release(m);
    } else {
      _cChannelHandlerContext.fireChannelRead(m);
    }
  }
}
