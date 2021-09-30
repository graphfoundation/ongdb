package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.serialization.DepartingMessageManagerMessageToMessageEncoder;
import io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder;
import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.MutableComProFamily;
import io.github.onograph.cluster.raft.control.MutatingProComClientManager;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ConsensusClientConfigurator implements
    CPFConfigurator<CPFConfigurator.CPFDirection.OutProcessor> {


  private final PipelineBuilderManager fbpcPipelineBuilderManager;


  private final Log log;


  private final List<MutatingProComClientManager<CPFDirection.OutProcessor>> mdrSrt;


  private final ConsensusMessageServiceMeta.Processor<Boolean, Exception> processorMsbe;


  private final Supplier<DepartingMessageManagerMessageToMessageEncoder> supplierEcDepartingMessageManagerMessageToMessageEncoder;


  private final Supplier<MessageToByteEncoder<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager>>
      supplierEmMessageToByteEncoder;


  public ConsensusClientConfigurator(PipelineBuilderManager _fbpcPipelineBuilderManager,
      LogProvider _logProvider, List<MutatingProComClientManager<CPFDirection.OutProcessor>> mdrSrt,
      ConsensusMessageServiceMeta.Processor<Boolean, Exception> _processorMsbe,
      Supplier<DepartingMessageManagerMessageToMessageEncoder> _supplierCeDepartingMessageManagerMessageToMessageEncoder,
      Supplier<MessageToByteEncoder<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager>> _supplierEmMessageToByteEncoder) {
    this.mdrSrt = mdrSrt;
    this.log = _logProvider.getLog(this.getClass());
    this.fbpcPipelineBuilderManager = _fbpcPipelineBuilderManager;
    this.processorMsbe = _processorMsbe;
    this.supplierEmMessageToByteEncoder = _supplierEmMessageToByteEncoder;
    this.supplierEcDepartingMessageManagerMessageToMessageEncoder = _supplierCeDepartingMessageManagerMessageToMessageEncoder;
  }

  @Override
  public void intlForCh(Channel _channel) {
    this.fbpcPipelineBuilderManager
        .cleClientPipelineService(_channel, this.log).moi(this.mdrSrt).adfmg()
        .add(io.github.onograph.TokenConstants.RAFT_MESSAGE_ENCODER,
            new ChannelHandler[]{
                this.supplierEmMessageToByteEncoder.get()})
        .add(io.github.onograph.TokenConstants.RAFT_CONTENT_TYPE_ENCODER,
            new ChannelHandler[]{new MessageDataTypeMessageToByteEncoder()})
        .add(io.github.onograph.TokenConstants.RAFT_CHUNKED_WRITER,
            new ChannelHandler[]{new ChunkedWriteHandler()})
        .add(io.github.onograph.TokenConstants.RAFT_MESSAGE_CONTENT_ENCODER,
            new ChannelHandler[]{
                this.supplierEcDepartingMessageManagerMessageToMessageEncoder.get()})
        .add(io.github.onograph.TokenConstants.MESSAGE_VALIDATOR,
            new ChannelHandler[]{new ConsensusMessageToMessageEncoder(this.processorMsbe)}).intl();
  }

  @Override
  public Collection<Collection<MutableComProFamily>> moieCollection() {
    return this.mdrSrt.stream().map(MutatingProComClientManager::prtoCollection)
        .collect(Collectors.toList());
  }


  public static class CPFConfiguratorBuilder
      extends
      io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<CPFDirection.OutProcessor, ConsensusClientConfigurator> {

    public CPFConfiguratorBuilder(PipelineBuilderManager _fbpcPipelineBuilderManager,
        LogProvider _logProvider,
        ConsensusMessageServiceMeta.Processor<Boolean, Exception> _processorMsbe,
        Supplier<MessageToByteEncoder<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager>> _supplierEmMessageToByteEncoder,
        Supplier<DepartingMessageManagerMessageToMessageEncoder> _supplierCeDepartingMessageManagerMessageToMessageEncoder,
        ApplicationComProFamilyType _paApplicationComProFamilyType) {
      super(_paApplicationComProFamilyType, (mods) ->
      {
        return new ConsensusClientConfigurator(_fbpcPipelineBuilderManager, _logProvider, mods,
            _processorMsbe,
            _supplierCeDepartingMessageManagerMessageToMessageEncoder,
            _supplierEmMessageToByteEncoder);
      });
    }
  }
}
