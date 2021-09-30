package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.control.connect.MessageChannelDuplexHandlerAction;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


@Sharable
public class MessageChannelDuplexHandler extends ChannelDuplexHandler {


  private final Predicate<Object> predicateGtdObject;


  private List<io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler.ChannelPromiseMessageWrapper> listPnigChannelPromiseMessageWrapper =
      new ArrayList();

  public MessageChannelDuplexHandler(Predicate<Object> _predicateGtdObject) {
    this.predicateGtdObject = _predicateGtdObject;
  }

  @Override
  public void userEventTriggered(ChannelHandlerContext _cChannelHandlerContext, Object _obE)
      throws Exception {
    if (_obE instanceof MessageChannelDuplexHandlerAction) {
      if (MessageChannelDuplexHandlerAction.gescsMessageChannelDuplexHandlerAction().equals(_obE)) {

        Iterator _iterator = this.listPnigChannelPromiseMessageWrapper.iterator();

        while (_iterator.hasNext()) {

          io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler.ChannelPromiseMessageWrapper _wieChannelPromiseMessageWrapper =
              (io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler.ChannelPromiseMessageWrapper) _iterator.next();
          _cChannelHandlerContext.write(_wieChannelPromiseMessageWrapper.m,
              _wieChannelPromiseMessageWrapper.channelPromise);
        }

        _cChannelHandlerContext.channel().pipeline().remove(this);
      }

      this.listPnigChannelPromiseMessageWrapper.clear();
      this.listPnigChannelPromiseMessageWrapper = null;
    } else {
      super.userEventTriggered(_cChannelHandlerContext, _obE);
    }
  }

  @Override
  public void write(ChannelHandlerContext _cChannelHandlerContext, Object m,
      ChannelPromise _channelPromise) {
    if (!this.predicateGtdObject.test(m)) {
      _cChannelHandlerContext.write(m, _channelPromise);
    } else if (this.listPnigChannelPromiseMessageWrapper != null) {
      this.listPnigChannelPromiseMessageWrapper.add(
          new io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler.ChannelPromiseMessageWrapper(
              _channelPromise, m));
    } else {

      _channelPromise.setFailure(
          new RuntimeException("*** Error:  40a11c54-7b31-4cda-bad9-59c05eed4986"));
    }
  }


  static class ChannelPromiseMessageWrapper {

    final ChannelPromise channelPromise;

    final Object m;


    ChannelPromiseMessageWrapper(ChannelPromise _channelPromise, Object m) {
      this.channelPromise = _channelPromise;
      this.m = m;
    }
  }
}
