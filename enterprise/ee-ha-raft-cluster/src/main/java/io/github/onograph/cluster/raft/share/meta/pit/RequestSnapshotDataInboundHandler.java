package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.github.onograph.cluster.raft.share.meta.SnapshotDataManager;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.neo4j.kernel.database.Database;


public class RequestSnapshotDataInboundHandler extends
    SimpleChannelInboundHandler<RequestSnapshotData> {


  private final ServerRef poooServerRef;


  private final SnapshotDataManager ssSnapshotDataManager;


  public RequestSnapshotDataInboundHandler(Database _database, ServerRef _poooServerRef) {
    this.poooServerRef = _poooServerRef;
    this.ssSnapshotDataManager = _database.getDependencyResolver()
        .resolveDependency(SnapshotDataManager.class);
  }


  private void _sedsasForChSn(ChannelHandlerContext _cChannelHandlerContext,
      SnapshotData _scSnapshotData) {
    _cChannelHandlerContext.writeAndFlush(AnswerMessageType.AMT_CSNAP);
    _cChannelHandlerContext.writeAndFlush(_scSnapshotData);
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext, RequestSnapshotData m)
      throws Exception {
    this._sedsasForChSn(_cChannelHandlerContext, this.ssSnapshotDataManager.snpoSnapshotData());
    this.poooServerRef.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
  }
}
