package io.github.onograph.cluster.raft.module.cuprot.current.info;

import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.kernel.availability.UnavailableException;


public class RequestMetaInboundHandler extends SimpleChannelInboundHandler<RequestMeta> {


  private final MetaService ipMetaService;


  private final ServerRef poooServerRef;


  public RequestMetaInboundHandler(DatabaseManager<?> _databaseManagerDmObject,
      DatabaseStateService _databaseStateService, ServerRef _poooServerRef) {
    this.poooServerRef = _poooServerRef;
    this.ipMetaService = new MetaService(_databaseManagerDmObject, _databaseStateService);
  }


  private void _sederForChCaSt(ChannelHandlerContext _cChannelHandlerContext, String m,
      CatchupStatusType stat) {
    _cChannelHandlerContext.write(AnswerMessageType.AMT_ERR);
    _cChannelHandlerContext.writeAndFlush(new CatchupProblem(m, stat));
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext, RequestMeta m)
      throws Exception {
    try {

      Meta _rsosMeta = this.ipMetaService.geioMeta(m.getNamedDatabaseId());
      _cChannelHandlerContext.write(AnswerMessageType.AMT_D_ANSWER);
      _cChannelHandlerContext.writeAndFlush(_rsosMeta);
    } catch (

        UnavailableException _unavailableException) {
      this._sederForChCaSt(_cChannelHandlerContext, _unavailableException.getMessage(),
          CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR);
    } catch (

        Throwable _throwable) {
      this._sederForChCaSt(_cChannelHandlerContext, _throwable.toString(),
          CatchupStatusType.CST_ERR);
    }

    this.poooServerRef.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
  }
}
