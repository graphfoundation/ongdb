package io.github.onograph.cluster.raft.control.connect;


public interface ServerComProMessageProcessor {


  void hadForMu(ComProFamilyRequestServiceImpl _comProFamilyRequestServiceImpl);


  void hadForMu(MutatingComProFamilyRequestService _mutatingComProFamilyRequestService);


  void hadForMu(ChangeComProRequestImpl _changeComProRequestImpl);
}
