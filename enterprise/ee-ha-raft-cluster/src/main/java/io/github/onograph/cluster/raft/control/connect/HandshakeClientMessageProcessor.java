package io.github.onograph.cluster.raft.control.connect;


public interface HandshakeClientMessageProcessor {


  void hadForCh(ComProFamilyReplyServiceImpl _comProFamilyReplyServiceImpl);


  void hadForCh(MutatingComProReply _mutatingComProReply);


  void hadForCh(ChangeComProReplyImpl _changeComProReplyImpl);
}
