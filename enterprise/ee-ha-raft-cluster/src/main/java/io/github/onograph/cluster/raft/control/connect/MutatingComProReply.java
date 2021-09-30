package io.github.onograph.cluster.raft.control.connect;


public class MutatingComProReply extends AbstractComProFamilyReplyService<String> {


  static final int MSX_COD = 1;

  MutatingComProReply(HandshakeStateType _csHandshakeStateType, String pType, String _strIpeet) {
    super(_csHandshakeStateType, _strIpeet, pType);
  }


  static MutatingComProReply faleMutatingComProReply(String pType) {
    return new MutatingComProReply(HandshakeStateType.ERROR, pType, "");
  }

  @Override
  public void dipcForHa(HandshakeClientMessageProcessor _hnlrHandshakeClientMessageProcessor) {
    _hnlrHandshakeClientMessageProcessor.hadForCh(this);
  }
}
