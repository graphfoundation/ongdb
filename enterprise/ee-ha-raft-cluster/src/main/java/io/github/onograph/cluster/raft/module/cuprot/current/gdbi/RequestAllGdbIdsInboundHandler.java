package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.kernel.database.NamedDatabaseId;


public class RequestAllGdbIdsInboundHandler extends SimpleChannelInboundHandler<RequestAllGdbIds> {


  private final DatabaseManager<?> databaseManagerMdObject;


  private final ServerRef poooServerRef;


  public RequestAllGdbIdsInboundHandler(DatabaseManager<?> _databaseManagerMdObject,
      ServerRef _poooServerRef) {
    this.databaseManagerMdObject = _databaseManagerMdObject;
    this.poooServerRef = _poooServerRef;
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      RequestAllGdbIds _requestAllGdbIds)
      throws Exception {

    Set<NamedDatabaseId> _setIdNamedDatabaseId = this.databaseManagerMdObject.registeredDatabases()
        .keySet().stream().map((d) ->
        {
          return DatabaseIdFactory.from(
              d.name(),
              d.databaseId()
                  .uuid());
        })
        .collect(Collectors.toSet());
    _cChannelHandlerContext.writeAndFlush(AnswerMessageType.AMT_ALL_GDB_GUID_ANSWER);
    _cChannelHandlerContext.writeAndFlush(new AllGdbIds(_setIdNamedDatabaseId));
    this.poooServerRef.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
  }
}
