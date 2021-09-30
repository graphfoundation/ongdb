package io.github.onograph.cluster.raft.share.meta.fsm;

import io.github.onograph.cluster.raft.share.meta.FSMData;
import java.io.IOException;
import java.util.function.Consumer;


public interface FSM<Command> {


  void aplcoaForCoCo(Command _cV, long _lgVar, Consumer<FSMData> _consumerVarFSMData);


  void fls() throws IOException;


  long laapdix();
}
