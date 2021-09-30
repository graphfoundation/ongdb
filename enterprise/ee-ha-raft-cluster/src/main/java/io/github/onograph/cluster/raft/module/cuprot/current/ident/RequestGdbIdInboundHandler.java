package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.Optional;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;


public class RequestGdbIdInboundHandler extends SimpleChannelInboundHandler<RequestGdbId> {


  private final DatabaseIdRepository databaseIdRepository;


  private final DatabaseManager<?> databaseManagerMdObject;


  private final ServerRef poooServerRef;

  public RequestGdbIdInboundHandler(DatabaseManager<?> _databaseManagerMdObject,
      ServerRef _poooServerRef) {
    this.poooServerRef = _poooServerRef;
    this.databaseManagerMdObject = _databaseManagerMdObject;
    this.databaseIdRepository = _databaseManagerMdObject.databaseIdRepository();
  }


  private static CatchupProblem _stedarnCatchupProblem(String gdbName) {
    return new CatchupProblem(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdInboundHandler.gdbName2",
            gdbName), CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR);
  }


  private static CatchupProblem _unwdarnCatchupProblem(String gdbName) {
    return new CatchupProblem(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdInboundHandler.gdbName",
            gdbName), CatchupStatusType.CST_UNKNOWN_GDB_ERR);
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext, RequestGdbId m) {

    String gdbName = m.getGdbName();

    Optional<NamedDatabaseId> _optionalOidNamedDatabaseId = this.databaseIdRepository.getByName(
        gdbName);

    Boolean _isBds = this.databaseManagerMdObject.getDatabaseContext(gdbName).map((dbContext) ->
    {
      return dbContext.database().isStarted();
    }).orElse(false);
    if (_optionalOidNamedDatabaseId.isPresent()) {
      if (!_isBds) {
        _cChannelHandlerContext.write(AnswerMessageType.AMT_ERR);
        _cChannelHandlerContext.writeAndFlush(_stedarnCatchupProblem(gdbName));
      } else {
        _cChannelHandlerContext.write(AnswerMessageType.AMT_GDB_GUID_ANSWER);
        _cChannelHandlerContext.writeAndFlush(_optionalOidNamedDatabaseId.get().databaseId());
      }
    } else {
      _cChannelHandlerContext.write(AnswerMessageType.AMT_ERR);
      _cChannelHandlerContext.writeAndFlush(_unwdarnCatchupProblem(gdbName));
    }

    this.poooServerRef.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
  }
}
