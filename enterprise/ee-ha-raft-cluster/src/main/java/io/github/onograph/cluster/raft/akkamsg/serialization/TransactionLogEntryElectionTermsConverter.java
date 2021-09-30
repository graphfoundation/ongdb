package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;


class TransactionLogEntryElectionTermsConverter {


  static ByteBuf seiitmByteBuf(ByteBufAllocator _byteBufAllocator,
      ConsensusLogEntry[] _elrConsensusLogEntryArray) {

    int _iCpct = 40 + 64 * _elrConsensusLogEntryArray.length;

    ByteBuf _bfeByteBuf = _byteBufAllocator.buffer(_iCpct, _iCpct);
    _bfeByteBuf.writeByte(MessageDataType.CON_ENT_TMS.getMcd());
    _bfeByteBuf.writeInt(_elrConsensusLogEntryArray.length);

    ConsensusLogEntry[] _consensusLogEntryArray = _elrConsensusLogEntryArray;

    int _iVar = _elrConsensusLogEntryArray.length;

    for (

        int _iV = 0; _iV < _iVar; ++_iV) {

      ConsensusLogEntry _elrConsensusLogEntry = _consensusLogEntryArray[_iV];
      _bfeByteBuf.writeLong(_elrConsensusLogEntry.getLgTe());
    }

    return _bfeByteBuf;
  }
}
