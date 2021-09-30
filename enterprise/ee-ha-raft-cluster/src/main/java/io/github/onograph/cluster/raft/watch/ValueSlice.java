package io.github.onograph.cluster.raft.watch;

import java.time.Instant;
import java.util.Objects;


class ValueSlice<T> {


  private final Instant instant;


  private final T val;

  ValueSlice(Instant _instant, T val) {
    this.instant = _instant;
    this.val = val;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ValueSlice<?> _valueSliceSmlObject = (ValueSlice) obj;
      return Objects.equals(this.instant, _valueSliceSmlObject.instant) && Objects.equals(this.val,
          _valueSliceSmlObject.val);
    } else {
      return false;
    }
  }


  Instant getInstant() {
    return this.instant;
  }


  T getVal() {
    return this.val;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.instant, this.val);
  }


}
