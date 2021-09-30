package io.github.onograph.cluster.raft.module.cuprot.current;

import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.ClientPipelineService;
import io.github.onograph.cluster.raft.control.MutableComProFamily;
import io.github.onograph.cluster.raft.control.MutatingProComClientManager;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.ClientMessageChannelInboundHandlerAdapter;
import io.github.onograph.cluster.raft.module.cuprot.GdbStoreInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.MessageRequestChannelInboundHandlerAdapter;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMetaMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIdsByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIdsInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.info.MetaByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.info.MetaInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.info.RequestMetaMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSyncMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.TransactionSyncReplyByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResourceMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncCompletedByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncRequestMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceSimpleChannelInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseIdByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseIdInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataByteToMessageDecoder;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataInboundHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class CurrentCPFClientServiceConfigurator implements
    CPFConfigurator<CPFConfigurator.CPFDirection.OutProcessor> {


  private static final ApplicationComProFamilyType APCNO_APPLICATION_COM_PRO_FAMILY_TYPE;

  static {
    APCNO_APPLICATION_COM_PRO_FAMILY_TYPE = ApplicationComProFamilyType.CT_CURRV;
  }


  private final CatchupAnswerLimitHandler catchupAnswerLimitHandler;


  private final Log log;


  private final LogProvider logProvider;


  private final List<MutatingProComClientManager<CPFDirection.OutProcessor>> mdrSrt;


  private final PipelineBuilderManager pipelineBuilderManager;


  public CurrentCPFClientServiceConfigurator(CatchupAnswerLimitHandler _catchupAnswerLimitHandler,
      LogProvider _logProvider, List<MutatingProComClientManager<CPFDirection.OutProcessor>> mdrSrt,
      PipelineBuilderManager _pipelineBuilderManager) {
    this.mdrSrt = mdrSrt;
    this.logProvider = _logProvider;
    this.log = _logProvider.getLog(this.getClass());
    this.pipelineBuilderManager = _pipelineBuilderManager;
    this.catchupAnswerLimitHandler = _catchupAnswerLimitHandler;
  }


  protected void deorForMe(
      MessageRequestChannelInboundHandlerAdapter<io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType> _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType) {
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new StoreDatabaseIdByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.STORE_GUID);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new GdbIdByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.GDB_UUID);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new TransactionSyncReplyByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.TRF_IN_ANSWER);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new SnapshotDataByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.CS);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new StoreSyncCompletedByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.SC_COMPLETE);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new TransactionChunkingCompletedByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.TRX_STM_COMPLETE);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new SliceMetaByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.F_HDR_VAL);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.SETUP_SC_ANSWER);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new SliceByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.FPART);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new CatchupProblemByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.ERR_ANSWER);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new AllGdbIdsByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_GDB_UIDS);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new MetaByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_INFO);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new AuthMetaByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_META);
  }


  protected ClientPipelineService enorClientPipelineService(
      ClientPipelineService _bidrClientPipelineService) {
    return _bidrClientPipelineService
        .add(io.github.onograph.TokenConstants.ENC_REQ_TX,
            new ChannelHandler[]{new RequestTransactionSyncMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_REQ_STORE,
            new ChannelHandler[]{new RequestStoreResourceMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_REQ_SNAPSHOT,
            new ChannelHandler[]{new RequestSnapshotMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_REQ_STORE_ID,
            new ChannelHandler[]{new RequestStoreDatabaseIdMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_REQ_DATABASE_ID,
            new ChannelHandler[]{new RequestGdbIdMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_REQ_TYPE,
            new ChannelHandler[]{new AnswerMessageTypeMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_RES_TYPE,
            new ChannelHandler[]{new AskMessageTypeMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_REQ_PRECOPY,
            new ChannelHandler[]{new StoreSyncRequestMessageToByteEncoder()})

        .add(io.github.onograph.TokenConstants.ENC_GET_ALL_DATABASE_IDS,
            new ChannelHandler[]{
                new RequestAllGdbIdsMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_REQ_INFO,
            new ChannelHandler[]{new RequestMetaMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_GET_METADATA,
            new ChannelHandler[]{new RequestAuthMetaMessageToByteEncoder()});
  }


  protected CatchupAnswerLimitHandler getCatchupAnswerLimitHandler() {
    return this.catchupAnswerLimitHandler;
  }


  protected ClientPipelineService hadrClientPipelineService(
      ClientPipelineService _bidrClientPipelineService,
      RefCatchupManagerImpl _poooRefCatchupManagerImpl) {
    return _bidrClientPipelineService
        .add(io.github.onograph.TokenConstants.HND_RES_TX, new ChannelHandler[]{
            new CatchupIncomingTransactionReplySimpleChannelInboundHandler(
                this.catchupAnswerLimitHandler, _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_RES_SNAPSHOT,
            new ChannelHandler[]{new SnapshotDataInboundHandler(this.catchupAnswerLimitHandler,
                _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_RES_COPY_FIN,
            new ChannelHandler[]{
                new StoreSyncCompletedSimpleChannelInboundHandler(this.catchupAnswerLimitHandler,
                    _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_RES_TX_FIN,
            new ChannelHandler[]{
                new TransactionChunkingCompletedInboundHandler(this.catchupAnswerLimitHandler,
                    _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_RES_FILE_HEADER,
            new ChannelHandler[]{
                new SliceMetaSimpleChannelInboundHandler(this.catchupAnswerLimitHandler, this.log,
                    _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_RES_FILE_CHUNK,
            new ChannelHandler[]{
                new SliceSimpleChannelInboundHandler(this.catchupAnswerLimitHandler,
                    _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_RES_STORE_ID,
            new ChannelHandler[]{new StoreDatabaseIdInboundHandler(this.catchupAnswerLimitHandler,
                _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_RES_DATABASE_ID,
            new ChannelHandler[]{new GdbIdInboundHandler(this.catchupAnswerLimitHandler,
                _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_RES_STORE_LISTING,
            new ChannelHandler[]{new GdbStoreInboundHandler(this.catchupAnswerLimitHandler,
                _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_RES_CATCHUP_ERROR,
            new ChannelHandler[]{new CatchupProblemInboundHandler(this.catchupAnswerLimitHandler,
                _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_INFO,
            new ChannelHandler[]{
                new MetaInboundHandler(
                    this.getCatchupAnswerLimitHandler(),
                    _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_GET_ALL_DATABASE_IDS,
            new ChannelHandler[]{new AllGdbIdsInboundHandler(this.getCatchupAnswerLimitHandler(),
                _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.HND_GET_METADATA,
            new ChannelHandler[]{new AuthMetaInboundHandler(this.getCatchupAnswerLimitHandler(),
                _poooRefCatchupManagerImpl)});
  }

  @Override
  public void intlForCh(Channel _channel) {

    RefCatchupManagerImpl _poooRefCatchupManagerImpl = new RefCatchupManagerImpl();

    MessageRequestChannelInboundHandlerAdapter<io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType>
        _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType =
        new MessageRequestChannelInboundHandlerAdapter(this.logProvider,
            _poooRefCatchupManagerImpl);
    this.deorForMe(_messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType);

    ClientPipelineService _bidrClientPipelineService =
        this.pipelineBuilderManager.cleClientPipelineService(_channel, this.log).moi(this.mdrSrt)
            .adfmg();
    this.enorClientPipelineService(_bidrClientPipelineService)
        .add(io.github.onograph.TokenConstants.IN_RES_TYPE,
            new ChannelHandler[]{new ClientMessageChannelInboundHandlerAdapter(this.logProvider,
                _poooRefCatchupManagerImpl)})
        .add(io.github.onograph.TokenConstants.DEC_DISPATCH,
            _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType);
    this.hadrClientPipelineService(_bidrClientPipelineService, _poooRefCatchupManagerImpl).intl();
  }

  @Override
  public Collection<Collection<MutableComProFamily>> moieCollection() {
    return this.mdrSrt.stream().map(MutatingProComClientManager::prtoCollection)
        .collect(Collectors.toList());
  }


  public static class AbstractBuilder extends
      io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<CPFDirection.OutProcessor, CurrentCPFClientServiceConfigurator> {

    public AbstractBuilder(CatchupAnswerLimitHandler _catchupAnswerLimitHandler,
        LogProvider _logProvider, PipelineBuilderManager _pipelineBuilderManager) {
      super(CurrentCPFClientServiceConfigurator.APCNO_APPLICATION_COM_PRO_FAMILY_TYPE,
          (modifiers) ->
          {
            return new CurrentCPFClientServiceConfigurator(_catchupAnswerLimitHandler, _logProvider,
                modifiers, _pipelineBuilderManager);
          });
    }
  }
}
