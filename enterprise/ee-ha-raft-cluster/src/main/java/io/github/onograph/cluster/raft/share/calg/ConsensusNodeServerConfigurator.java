package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef;
import io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType;
import io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeChannelInboundHandlerAdapter;
import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService;
import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.MutableComProFamily;
import io.github.onograph.cluster.raft.control.MutatingProComClientManager;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.github.onograph.cluster.raft.module.cuprot.MessageRequestChannelInboundHandlerAdapter;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInboundHandler;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ConsensusNodeServerConfigurator implements
    CPFConfigurator<CPFConfigurator.CPFDirection.InProcessor> {


  private final PipelineBuilderManager fbpPipelineBuilderManager;


  private final Function<ContentTypeRef, MessageRequestChannelInboundHandlerAdapter<MessageDataType>> functionDdcm;


  private final ChannelInboundHandler hmrChannelInboundHandler;


  private final Log log;


  private final List<MutatingProComClientManager<CPFDirection.InProcessor>> mdrSrt;


  private final Supplier<MessageToMessageDecoder<Object>> supplierCmMessageToMessageDecoder;


  public ConsensusNodeServerConfigurator(PipelineBuilderManager _fbpPipelineBuilderManager,
      Function<ContentTypeRef, MessageRequestChannelInboundHandlerAdapter<MessageDataType>> _functionDdcm,
      ChannelInboundHandler _hmrChannelInboundHandler, LogProvider _logProvider,
      List<MutatingProComClientManager<CPFDirection.InProcessor>> mdrSrt,
      Supplier<MessageToMessageDecoder<Object>> _supplierCmMessageToMessageDecoder) {
    this.hmrChannelInboundHandler = _hmrChannelInboundHandler;
    this.fbpPipelineBuilderManager = _fbpPipelineBuilderManager;
    this.mdrSrt = mdrSrt;
    this.functionDdcm = _functionDdcm;
    this.supplierCmMessageToMessageDecoder = _supplierCmMessageToMessageDecoder;
    this.log = _logProvider.getLog(this.getClass());
  }

  @Override
  public void intlForCh(Channel _channel) {

    ContentTypeRef _ptcContentTypeRef = new ContentTypeRef();
    this.fbpPipelineBuilderManager
        .sevServerPipelineService(_channel, this.log).moi(this.mdrSrt).adfmg()
        .add(io.github.onograph.TokenConstants.RAFT_CONTENT_TYPE_DISPATCHER, new ChannelHandler[]{
            new MessageDataTypeChannelInboundHandlerAdapter(_ptcContentTypeRef)})
        .add(io.github.onograph.TokenConstants.RAFT_COMPONENT_DECODER,
            new ChannelHandler[]{this.functionDdcm.apply(_ptcContentTypeRef)})
        .add(io.github.onograph.TokenConstants.RAFT_CONTENT_DECODER,
            new ChannelHandler[]{
                new SyncableDataDataManagerFactoryDecodingService(_ptcContentTypeRef)})
        .add(io.github.onograph.TokenConstants.RAFT_MESSAGE_COMPOSER,
            new ChannelHandler[]{this.supplierCmMessageToMessageDecoder.get()})
        .add(io.github.onograph.TokenConstants.RAFT_HANDLER,
            new ChannelHandler[]{this.hmrChannelInboundHandler}).intl();
  }

  @Override
  public Collection<Collection<MutableComProFamily>> moieCollection() {
    return this.mdrSrt.stream().map(MutatingProComClientManager::prtoCollection)
        .collect(Collectors.toList());
  }


  public static class CPFConfiguratorBuilder
      extends
      io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<CPFDirection.InProcessor, ConsensusNodeServerConfigurator> {

    public CPFConfiguratorBuilder(ChannelInboundHandler _hmrChannelInboundHandler,
        PipelineBuilderManager _fbpPipelineBuilderManager, LogProvider _logProvider,
        Function<ContentTypeRef, MessageRequestChannelInboundHandlerAdapter<MessageDataType>> _functionDdcm,
        Supplier<MessageToMessageDecoder<Object>> _supplierMcMessageToMessageDecoder,
        ApplicationComProFamily _paApplicationComProFamily) {
      super(_paApplicationComProFamily, (modifiers) ->
      {
        return new ConsensusNodeServerConfigurator(_fbpPipelineBuilderManager, _functionDdcm,
            _hmrChannelInboundHandler, _logProvider, modifiers,
            _supplierMcMessageToMessageDecoder);
      });
    }
  }
}
