package io.github.onograph.cluster.raft.control;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.compression.JdkZlibDecoder;
import io.netty.handler.codec.compression.JdkZlibEncoder;
import io.netty.handler.codec.compression.Lz4FrameDecoder;
import io.netty.handler.codec.compression.Lz4FrameEncoder;
import io.netty.handler.codec.compression.SnappyFrameDecoder;
import io.netty.handler.codec.compression.SnappyFrameEncoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;


public interface MutatingProComClientManager<O extends io.github.onograph.cluster.raft.control.CPFConfigurator.CPFDirection> {


  List<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>> listCltcroitrMutatingProComClientManager =
      Arrays.asList(
          new io.github.onograph.cluster.raft.control.MutatingProComClientManager.SnappyFrameEncoderClient(),
          new io.github.onograph.cluster.raft.control.MutatingProComClientManager.Lz4FrameEncoderClient(),
          new io.github.onograph.cluster.raft.control.MutatingProComClientManager.Lz4FrameEncoderHighCompressionClient(),
          new io.github.onograph.cluster.raft.control.MutatingProComClientManager.JdkZlibEncoderClient());

  List<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>> listAlciinlMutatingProComClientManager =
      listCltcroitrMutatingProComClientManager;

  List<MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>> listSercroitrMutatingProComClientManager =
      Arrays.asList(
          new io.github.onograph.cluster.raft.control.MutatingProComClientManager.SnappyFrameDecoderServer(),
          new io.github.onograph.cluster.raft.control.MutatingProComClientManager.SnappyFrameDecoderValidateChecksumsServer(),
          new io.github.onograph.cluster.raft.control.MutatingProComClientManager.Lz4FrameDecoderServer(),
          new io.github.onograph.cluster.raft.control.MutatingProComClientManager.Lz4ChecksumFrameDecoderServer(),
          new io.github.onograph.cluster.raft.control.MutatingProComClientManager.JdkZlibDecoderServer());

  List<MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>> listAlsrinlMutatingProComClientManager =
      listSercroitrMutatingProComClientManager;


  <BUILDER extends AbstractNettyChannelPipelineService<O, BUILDER>> void aplForAb(
      AbstractNettyChannelPipelineService<O, BUILDER> _abstractNettyChannelPipelineServiceVarob);


  Collection<MutableComProFamily> prtoCollection();


  abstract class AbstractClient implements
      MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor> {


    private final Collection<MutableComProFamily> collectionMpMutableComProFamily;


    private final String strNep;


    private final Supplier<MessageToByteEncoder<ByteBuf>> supplierEcdrMessageToByteEncoder;

    protected AbstractClient(String _strNep,
        Supplier<MessageToByteEncoder<ByteBuf>> _supplierEcdrMessageToByteEncoder,
        MutableComProFamily... _pmMutableComProFamilyArray) {
      this.strNep = _strNep;
      this.supplierEcdrMessageToByteEncoder = _supplierEcdrMessageToByteEncoder;
      this.collectionMpMutableComProFamily = Arrays.asList(_pmMutableComProFamilyArray);
    }

    @Override
    public final <BUILDER extends AbstractNettyChannelPipelineService<CPFConfigurator.CPFDirection.OutProcessor, BUILDER>> void aplForAb(
        AbstractNettyChannelPipelineService<CPFConfigurator.CPFDirection.OutProcessor, BUILDER> _abstractNettyChannelPipelineServiceBpncb) {
      _abstractNettyChannelPipelineServiceBpncb.add(this.strNep,
          this.supplierEcdrMessageToByteEncoder.get());
    }

    @Override
    public final Collection<MutableComProFamily> prtoCollection() {
      return this.collectionMpMutableComProFamily;
    }
  }


  abstract class AbstractServer implements
      MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor> {


    private final Collection<MutableComProFamily> collectionMpMutableComProFamily;


    private final String strNdp;


    private final Supplier<ByteToMessageDecoder> supplierDcdrByteToMessageDecoder;

    protected AbstractServer(String _strNdp,
        Supplier<ByteToMessageDecoder> _supplierDcdrByteToMessageDecoder,
        MutableComProFamily... _pmMutableComProFamilyArray) {
      this.strNdp = _strNdp;
      this.supplierDcdrByteToMessageDecoder = _supplierDcdrByteToMessageDecoder;
      this.collectionMpMutableComProFamily = Arrays.asList(_pmMutableComProFamilyArray);
    }

    @Override
    public final <BUILDER extends AbstractNettyChannelPipelineService<CPFConfigurator.CPFDirection.InProcessor, BUILDER>> void aplForAb(
        AbstractNettyChannelPipelineService<CPFConfigurator.CPFDirection.InProcessor, BUILDER> _abstractNettyChannelPipelineServiceBpncb) {
      _abstractNettyChannelPipelineServiceBpncb.add(this.strNdp,
          this.supplierDcdrByteToMessageDecoder.get());
    }

    @Override
    public final Collection<MutableComProFamily> prtoCollection() {
      return this.collectionMpMutableComProFamily;
    }
  }


  class JdkZlibDecoderServer extends
      io.github.onograph.cluster.raft.control.MutatingProComClientManager.AbstractServer {

    JdkZlibDecoderServer() {
      super(io.github.onograph.TokenConstants.ZLIB_DECODER, JdkZlibDecoder::new,
          MutableProtocols.COM_TYPE_GZIP);
    }
  }


  class JdkZlibEncoderClient extends
      io.github.onograph.cluster.raft.control.MutatingProComClientManager.AbstractClient {

    JdkZlibEncoderClient() {
      super(io.github.onograph.TokenConstants.ZLIB_ENCODER, JdkZlibEncoder::new,
          MutableProtocols.COM_TYPE_GZIP);
    }
  }


  class Lz4ChecksumFrameDecoderServer extends
      io.github.onograph.cluster.raft.control.MutatingProComClientManager.AbstractServer {

    Lz4ChecksumFrameDecoderServer() {
      super(io.github.onograph.TokenConstants.LZ4_DECODER, () ->
      {
        return new Lz4FrameDecoder(true);
      }, MutableProtocols.COM_TYPE_LZ4_VAL, MutableProtocols.COM_TYPE_LZ4_HC_COM_VAL);
    }
  }


  class Lz4FrameDecoderServer extends
      io.github.onograph.cluster.raft.control.MutatingProComClientManager.AbstractServer {

    Lz4FrameDecoderServer() {
      super(io.github.onograph.TokenConstants.LZ4_DECODER, Lz4FrameDecoder::new,
          MutableProtocols.COM_TYPE_LZ4,
          MutableProtocols.COM_TYPE_LZ4_HC);
    }
  }


  class Lz4FrameEncoderClient extends
      io.github.onograph.cluster.raft.control.MutatingProComClientManager.AbstractClient {

    Lz4FrameEncoderClient() {
      super(io.github.onograph.TokenConstants.LZ4_ENCODER, Lz4FrameEncoder::new,
          MutableProtocols.COM_TYPE_LZ4,
          MutableProtocols.COM_TYPE_LZ4_VAL);
    }
  }


  class Lz4FrameEncoderHighCompressionClient extends
      io.github.onograph.cluster.raft.control.MutatingProComClientManager.AbstractClient {

    Lz4FrameEncoderHighCompressionClient() {
      super(io.github.onograph.TokenConstants.LZ4_ENCODER, () ->
      {
        return new Lz4FrameEncoder(true);
      }, MutableProtocols.COM_TYPE_LZ4_HC, MutableProtocols.COM_TYPE_LZ4_HC_COM_VAL);
    }
  }


  class SnappyFrameDecoderServer extends
      io.github.onograph.cluster.raft.control.MutatingProComClientManager.AbstractServer {

    SnappyFrameDecoderServer() {
      super(io.github.onograph.TokenConstants.SNAPPY_DECODER, SnappyFrameDecoder::new,
          MutableProtocols.COM_TYPE_SNAPPY);
    }
  }


  class SnappyFrameDecoderValidateChecksumsServer extends
      io.github.onograph.cluster.raft.control.MutatingProComClientManager.AbstractServer {

    SnappyFrameDecoderValidateChecksumsServer() {
      super(io.github.onograph.TokenConstants.SNAPPY_VALIDATING_DECODER, () ->
      {
        return new SnappyFrameDecoder(true);
      }, MutableProtocols.COM_TYPE__SNAPPY_VAL);
    }
  }


  class SnappyFrameEncoderClient extends
      io.github.onograph.cluster.raft.control.MutatingProComClientManager.AbstractClient {

    SnappyFrameEncoderClient() {
      super(io.github.onograph.TokenConstants.SNAPPY_ENCODER, SnappyFrameEncoder::new,
          MutableProtocols.COM_TYPE_SNAPPY,
          MutableProtocols.COM_TYPE__SNAPPY_VAL);
    }
  }
}
