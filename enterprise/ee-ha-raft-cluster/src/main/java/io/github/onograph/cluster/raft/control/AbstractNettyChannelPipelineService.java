package io.github.onograph.cluster.raft.control;

import io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
import io.netty.util.ReferenceCountUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.net.ssl.SSLException;
import org.neo4j.function.ThrowingAction;
import org.neo4j.logging.Log;
import org.neo4j.ssl.SslPolicy;
import org.neo4j.util.FeatureToggles;


public abstract class AbstractNettyChannelPipelineService<O extends io.github.onograph.cluster.raft.control.CPFConfigurator.CPFDirection, BUILDER extends AbstractNettyChannelPipelineService<O, BUILDER>> {


  static final String ERO_EVXHDLR_HEA = io.github.onograph.TokenConstants.ERROR_HANDLER_HEAD;


  static final String ERO_EVXHDLR_TAI = io.github.onograph.TokenConstants.ERROR_HANDLER_TAIL;


  static final String MSX_GAT_NME = io.github.onograph.TokenConstants.MESSAGE_GATE;


  static final String SSL_EVXHDLR_NME = io.github.onograph.TokenConstants.SSL_HANDLER;


  private static final boolean DEU = FeatureToggles.flag(AbstractNettyChannelPipelineService.class,
      io.github.onograph.TokenConstants.DEBUG, false);


  private final BUILDER bidrSel = (BUILDER) this;


  private final ChannelPipeline channelPipeline;


  private final List<io.github.onograph.cluster.raft.control.AbstractNettyChannelPipelineService.NettyChannelHandlerWrapper>
      listIhNettyChannelHandlerWrapper = new ArrayList();


  private final Log log;


  private final SslPolicy sslPolicy;


  private Predicate<Object> predicatePgObject;


  AbstractNettyChannelPipelineService(ChannelPipeline _channelPipeline, Log _log,
      SslPolicy _sslPolicy) {
    this.channelPipeline = _channelPipeline;
    this.log = _log;
    this.sslPolicy = _sslPolicy;
  }


  private static void _lobebfForChStObLo(ChannelHandlerContext _cChannelHandlerContext, Log _log,
      Object m, String _strPei) {
    if (DEU) {

    }
  }


  private static void _swlwForTh(ThrowingAction<Exception> _throwingActionAtoException) {
    try {
      _throwingActionAtoException.apply();
    } catch (

        Throwable _throwable) {
    }
  }


  public static ClientPipelineService cleClientPipelineService(ChannelPipeline _channelPipeline,
      Log _log, SslPolicy _sslPolicy) {
    return new ClientPipelineService(_channelPipeline, _log, _sslPolicy);
  }


  public static ServerPipelineService sevServerPipelineService(ChannelPipeline _channelPipeline,
      Log _log, SslPolicy _sslPolicy) {
    return new ServerPipelineService(_channelPipeline, _log, _sslPolicy);
  }


  private void _cluhar() {

    Stream<String>
        _streamVr00String =
        this.channelPipeline.names().stream().filter(this::_isNodeuForSt).filter(this::_isNeheForSt)
            .filter(this::_isNogaForSt)
            .filter(this::_isNshnForSt);

    ChannelPipeline _channelPipeline = this.channelPipeline;
    Objects.requireNonNull(_channelPipeline);
    _streamVr00String.forEach(_channelPipeline::remove);
  }


  private void _eneerhl() {

    int sz = this.channelPipeline.names().size();
    if (this.channelPipeline.names().get(0)
        .equals(io.github.onograph.TokenConstants.ERROR_HANDLER_HEAD)) {
      if (!this.channelPipeline.names().get(sz - 2)
          .equals(io.github.onograph.TokenConstants.ERROR_HANDLER_TAIL)) {

        throw new IllegalStateException("*** Error:  8a2246e8-d84e-460c-8a3a-48a6742816f4");
      }
    } else {
      this.channelPipeline.addLast(io.github.onograph.TokenConstants.ERROR_HANDLER_TAIL,
          new io.github.onograph.cluster.raft.control.AbstractNettyChannelPipelineService.EndChannelDuplexHandler(
              this.log));
      this.channelPipeline.addFirst(io.github.onograph.TokenConstants.ERROR_HANDLER_HEAD,
          new io.github.onograph.cluster.raft.control.AbstractNettyChannelPipelineService.BegChannelDuplexHandler(
              this.log));
    }
  }


  private void _enesharia() {
    if (this.sslPolicy != null
        && this.channelPipeline.get(io.github.onograph.TokenConstants.SSL_HANDLER) == null) {
      try {

        ChannelHandler _hsChannelHandler = this.cresharChannelHandler(
            this.channelPipeline.channel(), this.sslPolicy);
        this.channelPipeline.addAfter(io.github.onograph.TokenConstants.ERROR_HANDLER_HEAD,
            io.github.onograph.TokenConstants.SSL_HANDLER, _hsChannelHandler);
      } catch (

          SSLException _sSLException) {

        throw new IllegalStateException("*** Error:  958f90d1-f713-4956-b478-d53ac38344fa",
            _sSLException);
      }
    }
  }


  private String _fiushnhString() {
    return this.sslPolicy != null ? io.github.onograph.TokenConstants.SSL_HANDLER
        : io.github.onograph.TokenConstants.ERROR_HANDLER_HEAD;
  }


  private void _intlgt() {
    if (this.channelPipeline.get(io.github.onograph.TokenConstants.MESSAGE_GATE) != null
        && this.predicatePgObject != null) {

      throw new IllegalStateException("*** Error:  b2f35e8b-7719-44a5-9610-b5857312d827");
    } else {
      if (this.predicatePgObject != null) {
        this.channelPipeline.addBefore(io.github.onograph.TokenConstants.ERROR_HANDLER_TAIL,
            io.github.onograph.TokenConstants.MESSAGE_GATE,
            new MessageChannelDuplexHandler(this.predicatePgObject));
      }
    }
  }


  private boolean _isNeheForSt(String title) {
    return !title.equals(io.github.onograph.TokenConstants.ERROR_HANDLER_HEAD) &&
        !title.equals(io.github.onograph.TokenConstants.ERROR_HANDLER_TAIL);
  }


  private boolean _isNodeuForSt(String title) {
    return this.channelPipeline.get(title) != null;
  }


  private boolean _isNogaForSt(String title) {
    return !title.equals(io.github.onograph.TokenConstants.MESSAGE_GATE);
  }


  private boolean _isNshnForSt(String title) {
    return !title.equals(io.github.onograph.TokenConstants.SSL_HANDLER);
  }


  public BUILDER add(List<ChannelHandler> _listHnChannelHandler, String title) {

    Stream _stream = _listHnChannelHandler.stream().map((handler) ->
    {
      return new io.github.onograph.cluster.raft.control.AbstractNettyChannelPipelineService.NettyChannelHandlerWrapper(
          handler, title);
    });

    List _list = this.listIhNettyChannelHandlerWrapper;
    Objects.requireNonNull(_list);
    _stream.forEachOrdered(_list::add);
    return this.bidrSel;
  }


  public BUILDER add(String title, ChannelHandler... _hnChannelHandlerArray) {
    return this.add(Arrays.asList(_hnChannelHandlerArray), title);
  }


  public abstract BUILDER adfmg();


  public BUILDER adge(Predicate<Object> _predicatePgObject) {
    if (this.predicatePgObject != null) {

      throw new IllegalStateException("*** Error:  d56ecd47-a564-4b55-a15f-75e3c1f1f9b3");
    } else {
      this.predicatePgObject = _predicatePgObject;
      return this.bidrSel;
    }
  }


  abstract ChannelHandler cresharChannelHandler(Channel _channel, SslPolicy _sslPolicy)
      throws SSLException;


  public void intl() {
    this._eneerhl();
    this._enesharia();
    this._intlgt();
    this._cluhar();

    String _strUh = this._fiushnhString();

    io.github.onograph.cluster.raft.control.AbstractNettyChannelPipelineService.NettyChannelHandlerWrapper _inNettyChannelHandlerWrapper;
    for (

        Iterator _iterator = this.listIhNettyChannelHandlerWrapper.iterator(); _iterator.hasNext();
        _strUh = _inNettyChannelHandlerWrapper.title) {
      _inNettyChannelHandlerWrapper =
          (io.github.onograph.cluster.raft.control.AbstractNettyChannelPipelineService.NettyChannelHandlerWrapper) _iterator.next();
      this.channelPipeline.addAfter(_strUh, _inNettyChannelHandlerWrapper.title,
          _inNettyChannelHandlerWrapper.channelHandler);
    }
  }


  public BUILDER moi(MutatingProComClientManager<O> _mutatingProComClientManagerMdfeO) {
    _mutatingProComClientManagerMdfeO.aplForAb(this);
    return this.bidrSel;
  }


  public BUILDER moi(List<MutatingProComClientManager<O>> mdrSrt) {
    mdrSrt.forEach(this::moi);
    return this.bidrSel;
  }


  private static class BegChannelDuplexHandler extends ChannelDuplexHandler {


    private final Log log;

    BegChannelDuplexHandler(Log _log) {
      this.log = _log;
    }

    @Override
    public void channelRead(ChannelHandlerContext _cChannelHandlerContext, Object m) {
      AbstractNettyChannelPipelineService._lobebfForChStObLo(_cChannelHandlerContext, this.log, m,
          io.github.onograph.TokenConstants.INBOUND2);
      _cChannelHandlerContext.fireChannelRead(m);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext _cChannelHandlerContext,
        Throwable _cueThrowable) {
      AbstractNettyChannelPipelineService._swlwForTh(() ->
      {

      });
      ReferenceCountUtil.release(_cueThrowable);
      Objects.requireNonNull(_cChannelHandlerContext);
      AbstractNettyChannelPipelineService._swlwForTh(_cChannelHandlerContext::close);
    }

    @Override
    public void write(ChannelHandlerContext _cChannelHandlerContext, Object m,
        ChannelPromise _channelPromise) {
      if (!(m instanceof ByteBuf)) {

        ReferenceCountUtil.release(m);
        _cChannelHandlerContext.close();
      } else {
        AbstractNettyChannelPipelineService._lobebfForChStObLo(_cChannelHandlerContext, this.log, m,
            io.github.onograph.TokenConstants.OUTBOUND2);
        _cChannelHandlerContext.write(m, _channelPromise);
      }
    }
  }


  private static class EndChannelDuplexHandler extends ChannelDuplexHandler {


    private final Log log;

    EndChannelDuplexHandler(Log _log) {
      this.log = _log;
    }

    @Override
    public void channelRead(ChannelHandlerContext _cChannelHandlerContext, Object m) {

      ReferenceCountUtil.release(m);
      _cChannelHandlerContext.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext _cChannelHandlerContext,
        Throwable _cueThrowable) {
      AbstractNettyChannelPipelineService._swlwForTh(() ->
      {

      });
      ReferenceCountUtil.release(_cueThrowable);
      Objects.requireNonNull(_cChannelHandlerContext);
      AbstractNettyChannelPipelineService._swlwForTh(_cChannelHandlerContext::close);
    }

    @Override
    public void write(ChannelHandlerContext _cChannelHandlerContext, Object m,
        ChannelPromise _channelPromise) {
      if (AbstractNettyChannelPipelineService.DEU) {

      }

      if (!_channelPromise.isVoid()) {
        _channelPromise.addListener((ChannelFutureListener) future ->
        {
          if (!future.isSuccess()) {
            AbstractNettyChannelPipelineService._swlwForTh(() ->
            {

            });
            Objects.requireNonNull(_cChannelHandlerContext);
            AbstractNettyChannelPipelineService._swlwForTh(_cChannelHandlerContext::close);
          }
        });
      }

      _cChannelHandlerContext.write(m, _channelPromise);
    }
  }


  private static class NettyChannelHandlerWrapper {


    private final ChannelHandler channelHandler;


    private final String title;


    NettyChannelHandlerWrapper(ChannelHandler _channelHandler, String title) {
      this.channelHandler = _channelHandler;
      this.title = title;
    }
  }
}
