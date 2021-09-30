package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.module.cuprot.exhandlers.AvailabilityHandler;
import io.github.onograph.cluster.raft.module.cuprot.exhandlers.GdbMissingHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.function.Function;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.kernel.availability.DatabaseAvailabilityGuard;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.LogProvider;


class SimpleChannelInboundHandlerRequestImpl<T extends io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId>
    extends SimpleChannelInboundHandler<T> {


  private final Class<T> classMtT;


  private final DatabaseManager<?> databaseManagerMdObject;


  private final Function<Database, SimpleChannelInboundHandler<T>> functionFhds;


  private final LogProvider logProvider;


  private final ServerRef poooServerRef;


  SimpleChannelInboundHandlerRequestImpl(Class<T> _classTmT,
      DatabaseManager<?> _databaseManagerMdObject,
      Function<Database, SimpleChannelInboundHandler<T>> _functionFhds, LogProvider _logProvider,
      ServerRef _poooServerRef) {
    super(_classTmT);
    this.classMtT = _classTmT;
    this.databaseManagerMdObject = _databaseManagerMdObject;
    this.functionFhds = _functionFhds;
    this.poooServerRef = _poooServerRef;
    this.logProvider = _logProvider;
  }


  private SimpleChannelInboundHandler<T> _crahdrSimpleChannelInboundHandler(
      DatabaseContext _databaseContext) {
    if (_databaseContext == null) {
      return new GdbMissingHandler(this.classMtT, this.logProvider, this.poooServerRef);
    } else {

      DatabaseAvailabilityGuard _databaseAvailabilityGuard = _databaseContext.database()
          .getDatabaseAvailabilityGuard();
      return !_databaseAvailabilityGuard.isAvailable() ? new AvailabilityHandler(
          _databaseAvailabilityGuard, this.classMtT, this.logProvider, this.poooServerRef)
          : (SimpleChannelInboundHandler) this.functionFhds
              .apply(_databaseContext.database());
    }
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext, T _tRqet)
      throws Exception {

    DatabaseId _databaseId = _tRqet.getDatabaseId();

    DatabaseContext _databaseContext = this.databaseManagerMdObject.getDatabaseContext(_databaseId)
        .orElse(null);

    SimpleChannelInboundHandler<T> _simpleChannelInboundHandlerHnlrT = this._crahdrSimpleChannelInboundHandler(
        _databaseContext);
    _simpleChannelInboundHandlerHnlrT.channelRead(_cChannelHandlerContext, _tRqet);
  }
}
