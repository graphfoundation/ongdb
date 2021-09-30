package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSync;
import io.github.onograph.config.TxFlowType;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.Optional;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.DatabaseLogProvider;
import org.neo4j.storageengine.api.KernelVersionRepository;
import org.neo4j.storageengine.api.TransactionIdStore;


public class TransactionSyncSimpleChannelInboundHandler extends
    SimpleChannelInboundHandler<RequestTransactionSync> {


  private final Log log;


  private final TransactionSyncRequestWatcher mntrTransactionSyncRequestWatcher;


  private final ServerRef poooServerRef;


  private final TransactionBlockGenerator psTransactionBlockGenerator;


  public TransactionSyncSimpleChannelInboundHandler(LogProvider _logProvider,
      TransactionSyncRequestWatcher _mntrTransactionSyncRequestWatcher, ServerRef _poooServerRef,
      TransactionBlockGenerator _psTransactionBlockGenerator) {
    this.poooServerRef = _poooServerRef;
    this.mntrTransactionSyncRequestWatcher = _mntrTransactionSyncRequestWatcher;
    this.log = _logProvider.getLog(this.getClass());
    this.psTransactionBlockGenerator = _psTransactionBlockGenerator;
  }


  public static TransactionSyncSimpleChannelInboundHandler froTransactionSyncSimpleChannelInboundHandler(
      Database _dDatabase, ServerRef _poooServerRef, TxFlowType _ssTxFlowType) {

    TransactionIdStore _transactionIdStore = _dDatabase.getDependencyResolver()
        .resolveDependency(TransactionIdStore.class);

    LogicalTransactionStore _logicalTransactionStore =
        _dDatabase.getDependencyResolver().resolveDependency(LogicalTransactionStore.class);

    DatabaseLogProvider _databaseLogProvider = _dDatabase.getInternalLogProvider();

    TransactionSyncRequestWatcher _mntrTransactionSyncRequestWatcher =
        _dDatabase.getMonitors().newMonitor(TransactionSyncRequestWatcher.class, new String[0]);

    KernelVersionRepository _kernelVersionRepository = _dDatabase.getDependencyResolver()
        .resolveDependency(KernelVersionRepository.class);

    TransactionBlockGenerator _psTransactionBlockGenerator =
        new TransactionBlockGenerator(_dDatabase, _kernelVersionRepository, _databaseLogProvider,
            _ssTxFlowType, _logicalTransactionStore,
            _transactionIdStore);
    return new TransactionSyncSimpleChannelInboundHandler(_databaseLogProvider,
        _mntrTransactionSyncRequestWatcher, _poooServerRef,
        _psTransactionBlockGenerator);
  }


  private void _coptstaForChTr(ChannelHandlerContext _cChannelHandlerContext,
      TransactionChunkingCompleted _rsosTransactionChunkingCompleted) {
    _cChannelHandlerContext.write(AnswerMessageType.AMT_TRX_IS_COMPLETE);
    _cChannelHandlerContext.writeAndFlush(_rsosTransactionChunkingCompleted);
    this.poooServerRef.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      RequestTransactionSync m) throws Exception {
    this.mntrTransactionSyncRequestWatcher.inre();

    TransactionBlockGenerator.Setup setup = this.psTransactionBlockGenerator.prpeTransactionBlockGeneratorSetup(
        m);

    Optional<TransactionChunkingCompleted> _optionalRpTransactionChunkingCompleted = setup.repsOptional();
    if (_optionalRpTransactionChunkingCompleted.isPresent()) {
      this._coptstaForChTr(_cChannelHandlerContext, _optionalRpTransactionChunkingCompleted.get());
    } else {

      TransactionBlockService transactionBlockService = setup.txstaOptional(this.poooServerRef)
          .orElseThrow(() ->
          {
            return new IllegalStateException(
                "*** Error: 0bc937bb-d1df-406d-99f1-f5518553b328");
          });
      _cChannelHandlerContext.writeAndFlush(transactionBlockService).addListener((f) ->
      {
        if (!f.isSuccess()) {

          _cChannelHandlerContext.close();
        } else if (this.log.isDebugEnabled()) {

        }
      });
    }
  }
}
