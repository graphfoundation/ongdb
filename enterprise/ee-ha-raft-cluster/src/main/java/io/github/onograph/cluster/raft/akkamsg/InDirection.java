package io.github.onograph.cluster.raft.akkamsg;


public interface InDirection<M> {


  void rethnForIn(
      io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<M> _incomingMessageProcessorVM);


  interface IncomingMessageProcessor<M> {


    void hadForM(M _mVar);
  }
}
