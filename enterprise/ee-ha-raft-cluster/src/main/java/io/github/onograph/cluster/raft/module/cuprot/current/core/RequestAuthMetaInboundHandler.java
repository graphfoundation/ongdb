package io.github.onograph.cluster.raft.module.cuprot.current.core;

import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.List;
import org.neo4j.common.DependencyResolver;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.graphdb.Transaction;


public class RequestAuthMetaInboundHandler extends SimpleChannelInboundHandler<RequestAuthMeta> {


  private final DatabaseManager<?> databaseManagerMdObject;


  private final DependencyResolver dependencyResolver;


  private final ServerRef poooServerRef;


  public RequestAuthMetaInboundHandler(DatabaseManager<?> _databaseManagerMdObject,
      DependencyResolver _dependencyResolver, ServerRef _poooServerRef) {
    this.databaseManagerMdObject = _databaseManagerMdObject;
    this.dependencyResolver = _dependencyResolver;
    this.poooServerRef = _poooServerRef;
  }


  private GdbAuthActions _gebccodGdbAuthActions(RequestAuthMeta _requestAuthMeta) {

    GdbAuthActionsManager _bcpGdbAuthActionsManager =
        this.dependencyResolver.resolveDependency(GdbAuthActionsManager.class);
    return this.databaseManagerMdObject.getDatabaseContext(io.github.onograph.TokenConstants.SYSTEM)
        .map(DatabaseContext::databaseFacade)
        .map((facade) ->
        {

          Transaction _tTransaction =
              facade.beginTx();

          GdbAuthActions
              _gdbAuthActions;
          try {

            boolean
                _isAu =
                _requestAuthMeta.indmaAuthMetaOptions.isModUsers;

            boolean
                _isAr =
                _requestAuthMeta.indmaAuthMetaOptions.isModRoles;
            _gdbAuthActions =
                _bcpGdbAuthActionsManager
                    .gebccodGdbAuthActions(
                        _isAr,
                        _isAu,
                        _requestAuthMeta.gdbName,
                        _tTransaction);
          } catch (

              Throwable _throwable) {
            if (_tTransaction !=
                null) {
              try {
                _tTransaction.close();
              } catch (

                  Throwable _throwable2) {
                _throwable.addSuppressed(
                    _throwable2);
              }
            }

            throw _throwable;
          }

          if (_tTransaction != null) {
            _tTransaction.close();
          }

          return _gdbAuthActions;
        })
        .orElse(new GdbAuthActions(List.of(), List.of()));
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      RequestAuthMeta _requestAuthMeta)
      throws Exception {
    _cChannelHandlerContext.writeAndFlush(AnswerMessageType.AMT_MD_ANSWER);

    GdbAuthActions _cbGdbAuthActions = this._gebccodGdbAuthActions(_requestAuthMeta);
    _cChannelHandlerContext.writeAndFlush(new AuthMeta(_cbGdbAuthActions.gecmdList()));
    this.poooServerRef.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
  }
}
