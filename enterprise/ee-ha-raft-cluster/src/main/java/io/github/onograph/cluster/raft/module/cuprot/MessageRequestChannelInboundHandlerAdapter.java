package io.github.onograph.cluster.raft.module.cuprot;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import java.util.HashMap;
import java.util.Map;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class MessageRequestChannelInboundHandlerAdapter<E extends Enum<E>> extends
    ChannelInboundHandlerAdapter {


  private final Log log;


  private final Map<E, ChannelInboundHandler> mapDcdrec = new HashMap();


  private final Ref<E> refPoooE;


  public MessageRequestChannelInboundHandlerAdapter(LogProvider _logProvider, Ref<E> _refPoooE) {
    this.refPoooE = _refPoooE;
    this.log = _logProvider.getLog(this.getClass());
  }

  @Override
  public void channelRead(ChannelHandlerContext _cChannelHandlerContext, Object m)
      throws Exception {

    ChannelInboundHandler _dlgtChannelInboundHandler = this.refPoooE.see(this.mapDcdrec);
    if (_dlgtChannelInboundHandler == null) {

      ReferenceCountUtil.release(m);
    } else {
      _dlgtChannelInboundHandler.channelRead(_cChannelHandlerContext, m);
    }
  }


  public void reieForECh(ChannelInboundHandler _dcdrChannelInboundHandler, E tNme) {
    assert !this.mapDcdrec.containsKey(tNme) :
        "registering twice a decoder for the same type (" + tNme + ")?";

    this.mapDcdrec.put(tNme, _dcdrChannelInboundHandler);
  }
}
