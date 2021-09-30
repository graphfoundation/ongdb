package io.github.onograph.cluster.raft.module.cuprot.exhandlers;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


abstract class ChannelInboundHandlerAdapterErrorImpl<T extends AbstractCatchupManagementMessageWrapper> extends
    SimpleChannelInboundHandler<T> {


  private final Log log;


  private final ServerRef poooServerRef;


  ChannelInboundHandlerAdapterErrorImpl(Class<T> _classTmT, LogProvider _logProvider,
      ServerRef _poooServerRef) {
    super(_classTmT);
    this.poooServerRef = _poooServerRef;
    this.log = _logProvider.getLog(this.getClass());
  }

  @Override
  protected final void channelRead0(ChannelHandlerContext _cChannelHandlerContext, T _tRqet) {

    CatchupProblem _reCatchupProblem = this.neerrseCatchupProblem(_tRqet);

    _cChannelHandlerContext.write(AnswerMessageType.AMT_ERR);
    _cChannelHandlerContext.writeAndFlush(_reCatchupProblem);
    this.poooServerRef.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
  }


  abstract CatchupProblem neerrseCatchupProblem(T _tVa);
}
