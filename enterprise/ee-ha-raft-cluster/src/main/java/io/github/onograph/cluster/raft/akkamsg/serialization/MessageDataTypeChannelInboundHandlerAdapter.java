package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.module.cuprot.Ref;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;


public class MessageDataTypeChannelInboundHandlerAdapter extends ChannelInboundHandlerAdapter {


  private final Ref<MessageDataType> refPtcMessageDataType;

  public MessageDataTypeChannelInboundHandlerAdapter(Ref<MessageDataType> _refPtcMessageDataType) {
    this.refPtcMessageDataType = _refPtcMessageDataType;
  }


  private MessageDataType _gectttpMessageDataType(byte _cmByte) {

    MessageDataType[] _messageDataTypeArray = MessageDataType.values();

    int _iV = _messageDataTypeArray.length;

    for (

        int _iV2 = 0; _iV2 < _iV; ++_iV2) {

      MessageDataType _tcMessageDataType = _messageDataTypeArray[_iV2];
      if (_tcMessageDataType.getMcd() == _cmByte) {
        return _tcMessageDataType;
      }
    }

    throw new IllegalArgumentException("*** Error: 5913ed60-0a06-4ce7-9c5c-60b38d9d0856");
  }

  @Override
  public void channelRead(ChannelHandlerContext _cChannelHandlerContext, Object m) {
    if (m instanceof ByteBuf) {

      ByteBuf _bfeByteBuf = (ByteBuf) m;
      if (this.refPtcMessageDataType.isExcnForE(MessageDataType.CT)) {

        byte _cmByte = _bfeByteBuf.readByte();

        MessageDataType _tcMessageDataType = this._gectttpMessageDataType(_cmByte);
        this.refPtcMessageDataType.exeForE(_tcMessageDataType);
        if (_bfeByteBuf.readableBytes() == 0) {
          ReferenceCountUtil.release(m);
          return;
        }
      }
    }

    _cChannelHandlerContext.fireChannelRead(m);
  }
}
