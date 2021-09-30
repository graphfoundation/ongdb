package io.github.onograph.cluster.raft.share.meta.fsm;

import java.util.Objects;


public class State {


  public final State.MetaStateMessageType m;

  public State(State.MetaStateMessageType m) {
    this.m = m;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      State _thaState = (State) obj;
      return Objects.equals(this.m, _thaState.m);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.m);
  }


  public enum MetaStateMessageType {


    OK


  }
}
