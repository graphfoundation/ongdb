package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.share.meta.fsm.AskState;
import io.github.onograph.cluster.raft.share.meta.fsm.DefaultSDEmptyReq;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync;
import java.util.function.Consumer;


public interface AutoCloseableActionProcessor extends AutoCloseable {

  @Override
  void close();


  void dipcForSyCo(Consumer<FSMData> _consumerVFSMData, long _lgV, RequestData _requestData);


  void dipcForSyCo(Consumer<FSMData> _consumerVFSMData, long _lgVar,
      SyncableLeasableCoreNodeData _syncableLeasableCoreNodeData);


  void dipcForSyCo(Consumer<FSMData> _consumerVFSMData, DefaultSDEmptyReq _defaultSDEmptyReq,
      long _lgV);


  void dipcForSyCo(AskState _askState, Consumer<FSMData> _consumerVFSMData, long _lgVa);


  void dipcForSyCo(AbstractTransactionSync _abstractTransactionSync,
      Consumer<FSMData> _consumerVarFSMData, long _lgV);
}
