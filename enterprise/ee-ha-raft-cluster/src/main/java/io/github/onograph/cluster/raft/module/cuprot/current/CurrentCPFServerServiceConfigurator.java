package io.github.onograph.cluster.raft.module.cuprot.current;

import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.MutableComProFamily;
import io.github.onograph.cluster.raft.control.MutatingProComClientManager;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.github.onograph.cluster.raft.control.ServerPipelineService;
import io.github.onograph.cluster.raft.module.cuprot.AdapterChannelHandlerService;
import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.IncomingEventService;
import io.github.onograph.cluster.raft.module.cuprot.MessageRequestChannelInboundHandlerAdapter;
import io.github.onograph.cluster.raft.module.cuprot.ServerChannelInboundHandlerAdapter;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMetaByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIdsMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.info.MetaMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.info.RequestMetaByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.IncomingTxChannelOutboundHandlerAdapter;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSyncByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResourceByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSyncRequestByteToMessageDecoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreIdMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncCompletedMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMessageToMessageEncoder;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaMessageToByteEncoder;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataMessageToByteEncoder;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInboundHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class CurrentCPFServerServiceConfigurator implements
    CPFConfigurator<CPFConfigurator.CPFDirection.InProcessor> {


  private static final ApplicationComProFamilyType APCNO_APPLICATION_COM_PRO_FAMILY_TYPE;

  static {
    APCNO_APPLICATION_COM_PRO_FAMILY_TYPE = ApplicationComProFamilyType.CT_CURRV;
  }


  private final PipelineBuilderManager fbpPipelineBuilderManager;


  private final AdapterChannelHandlerService hscAdapterChannelHandlerService;


  private final Log log;


  private final LogProvider logProvider;


  private final IncomingEventService lseeIncomingEventService;


  private final List<MutatingProComClientManager<CPFDirection.InProcessor>> mdrSrt;


  public CurrentCPFServerServiceConfigurator(PipelineBuilderManager _fbpPipelineBuilderManager,
      AdapterChannelHandlerService _hscAdapterChannelHandlerService, LogProvider _logProvider,
      IncomingEventService _lseeIncomingEventService,
      List<MutatingProComClientManager<CPFDirection.InProcessor>> mdrSrt) {
    this.fbpPipelineBuilderManager = _fbpPipelineBuilderManager;
    this.mdrSrt = mdrSrt;
    this.log = _logProvider.getLog(this.getClass());
    this.logProvider = _logProvider;
    this.hscAdapterChannelHandlerService = _hscAdapterChannelHandlerService;
    this.lseeIncomingEventService = _lseeIncomingEventService;
  }


  private ChannelInboundHandler _resdoChannelInboundHandler(ServerRef _poooServerRef) {

    MessageRequestChannelInboundHandlerAdapter<io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType>
        _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType =
        new MessageRequestChannelInboundHandlerAdapter(this.logProvider, _poooServerRef);
    this.deorForMe(_messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType);
    return _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType;
  }


  private ChannelHandler _sermahnChannelHandler(ServerRef _saeServerRef) {
    return new ServerChannelInboundHandlerAdapter(this.logProvider, _saeServerRef);
  }


  protected void deorForMe(
      MessageRequestChannelInboundHandlerAdapter<io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType> _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType) {
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new RequestGdbIdByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_GDB_UID);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new RequestTransactionSyncByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.TRX_IN);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new RequestStoreDatabaseIdByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_SUID);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new RequestSnapshotByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_CSS);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new RequestSyncRequestByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.SET_SC);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new RequestStoreResourceByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_SF);

    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new RequestAllGdbIdsByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_GDB_UIDS);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new RequestMetaByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_STAT_INFO);
    _messageRequestChannelInboundHandlerAdapterDdCatchupManagerStatusType.reieForECh(
        new RequestAuthMetaByteToMessageDecoder(),
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_META);
  }


  protected ServerPipelineService enorServerPipelineService(
      ServerPipelineService _bidrServerPipelineService, ServerRef _saeServerRef) {

    return _bidrServerPipelineService
        .add(io.github.onograph.TokenConstants.ENC_REQ_TYPE,
            new ChannelHandler[]{new AskMessageTypeMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_RES_TYPE,
            new ChannelHandler[]{new AnswerMessageTypeMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_RES_TX_PULL,
            new ChannelHandler[]{new IncomingTxChannelOutboundHandlerAdapter()})
        .add(io.github.onograph.TokenConstants.ENC_RES_STORE_ID,
            new ChannelHandler[]{new StoreIdMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_RES_DATABASE_ID,
            new ChannelHandler[]{new GdbIdMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_RES_COPY_FIN,
            new ChannelHandler[]{new StoreSyncCompletedMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_RES_TX_FIN,
            new ChannelHandler[]{new TransactionChunkingCompletedMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_RES_PRE_COPY, new ChannelHandler[]{
            new io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_SNAPSHOT,
            new ChannelHandler[]{new SnapshotDataMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_FILE_CHUNK,
            new ChannelHandler[]{new SliceMessageToMessageEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_FILE_HEADER,
            new ChannelHandler[]{new SliceMetaMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_CATCHUP_ERROR,
            new ChannelHandler[]{new CatchupProblemMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_RES_ALL_DATABASES_ID,
            new ChannelHandler[]{
                new AllGdbIdsMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_RES_INFO,
            new ChannelHandler[]{new MetaMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.ENC_RES_METADATA,
            new ChannelHandler[]{new AuthMetaMessageToByteEncoder()});
  }


  protected AdapterChannelHandlerService getHscAdapterChannelHandlerService() {
    return this.hscAdapterChannelHandlerService;
  }


  protected ServerPipelineService hadrServerPipelineService(
      ServerPipelineService _bidrServerPipelineService, ServerRef _saeServerRef) {
    return _bidrServerPipelineService
        .add(io.github.onograph.TokenConstants.LOG_INBOUND_REQ,
            new ChannelHandler[]{
                new ServerSimpleChannelInboundHandler(this.lseeIncomingEventService)})
        .add(io.github.onograph.TokenConstants.HND_REQ_DATABASE_ID,
            new ChannelHandler[]{
                this.hscAdapterChannelHandlerService.gedteirqheChannelHandler(_saeServerRef)})
        .add(io.github.onograph.TokenConstants.HND_REQ_TX,
            new ChannelHandler[]{
                this.hscAdapterChannelHandlerService.txplrehnChannelHandler(_saeServerRef)})
        .add(io.github.onograph.TokenConstants.HND_REQ_STORE_ID,
            new ChannelHandler[]{
                this.hscAdapterChannelHandlerService.gesoirshdChannelHandler(_saeServerRef)})
        .add(io.github.onograph.TokenConstants.HND_REQ_STORE_LISTING,
            new ChannelHandler[]{
                this.hscAdapterChannelHandlerService.stlnruharChannelHandler(_saeServerRef)})
        .add(io.github.onograph.TokenConstants.HND_REQ_STORE_FILE,
            new ChannelHandler[]{
                this.hscAdapterChannelHandlerService.gesoflruharChannelHandler(_saeServerRef)})
        .add(io.github.onograph.TokenConstants.HND_REQ_SNAPSHOT,
            new ChannelHandler[]{
                this.hscAdapterChannelHandlerService.snhhnChannelHandler(_saeServerRef)})
        .add(io.github.onograph.TokenConstants.HND_REQ_GET_INFO, new ChannelHandler[]{
            this.getHscAdapterChannelHandlerService().geioChannelHandler(_saeServerRef)})
        .add(io.github.onograph.TokenConstants.HND_REQ_ALL_DATABASES_ID,
            new ChannelHandler[]{
                this.getHscAdapterChannelHandlerService().gealdbidChannelHandler(_saeServerRef)})
        .add(io.github.onograph.TokenConstants.HND_REQ_METADATA,
            new ChannelHandler[]{
                this.getHscAdapterChannelHandlerService().gematChannelHandler(_saeServerRef)});
  }

  @Override
  public void intlForCh(Channel _channel) {

    ServerRef _saeServerRef = new ServerRef();

    ServerPipelineService _bidrServerPipelineService =
        this.fbpPipelineBuilderManager.sevServerPipelineService(_channel, this.log).moi(this.mdrSrt)
            .adfmg();
    this.enorServerPipelineService(_bidrServerPipelineService, _saeServerRef)
        .add(io.github.onograph.TokenConstants.IN_REQ_TYPE,
            new ChannelHandler[]{this._sermahnChannelHandler(_saeServerRef)})
        .add(io.github.onograph.TokenConstants.DEC_REQ_DISPATCH,
            new ChannelHandler[]{this._resdoChannelInboundHandler(_saeServerRef)})
        .add(io.github.onograph.TokenConstants.OUT_CHUNKED_WRITE, new ChunkedWriteHandler());
    this.hadrServerPipelineService(_bidrServerPipelineService, _saeServerRef).intl();
  }

  @Override
  public Collection<Collection<MutableComProFamily>> moieCollection() {
    return this.mdrSrt.stream().map(MutatingProComClientManager::prtoCollection)
        .collect(Collectors.toList());
  }


  public static class AbstractBuilder
      extends
      io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<CPFDirection.InProcessor, CurrentCPFServerServiceConfigurator> {

    public AbstractBuilder(PipelineBuilderManager _fbpPipelineBuilderManager,
        AdapterChannelHandlerService _hscAdapterChannelHandlerService, LogProvider _logProvider,
        IncomingEventService _lseeIncomingEventService) {
      super(CurrentCPFServerServiceConfigurator.APCNO_APPLICATION_COM_PRO_FAMILY_TYPE,
          (modifiers) ->
          {
            return new CurrentCPFServerServiceConfigurator(_fbpPipelineBuilderManager,
                _hscAdapterChannelHandlerService, _logProvider,
                _lseeIncomingEventService, modifiers);
          });
    }
  }
}
