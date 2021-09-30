package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.neo4j.kernel.database.Database;


public class RequestStoreDatabaseIdInboundHandler extends
    SimpleChannelInboundHandler<RequestStoreDatabaseIdCatchupManagement> {


  private final Database dDatabase;


  private final ServerRef poooServerRef;


  public RequestStoreDatabaseIdInboundHandler(Database _dDatabase, ServerRef _poooServerRef) {
    this.dDatabase = _dDatabase;
    this.poooServerRef = _poooServerRef;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      RequestStoreDatabaseIdCatchupManagement m) {
    _cChannelHandlerContext.writeAndFlush(AnswerMessageType.AMT_STORE_GUID);
    _cChannelHandlerContext.writeAndFlush(this.dDatabase.getStoreId());
    this.poooServerRef.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
  }
}
