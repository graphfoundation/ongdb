package io.github.onograph.cluster.raft.control.connect;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public enum HandshakeStateType {


  OK(0),

  IN_PROCESS(1),

  ERROR(-1);


  private static final AtomicReference<Map<Integer, HandshakeStateType>> HS_STATES = new AtomicReference();


  private final int hsCodeVal;

  HandshakeStateType(int _iVc) {
    this.hsCodeVal = _iVc;
  }


  public static Optional<HandshakeStateType> frmcdvaeOptional(int _iVc) {

    Map<Integer, HandshakeStateType> _mapMih = HS_STATES.get();
    if (_mapMih == null) {
      _mapMih = Stream.of(values())
          .collect(Collectors.toMap(HandshakeStateType::getHsCodeVal, Function.identity()));
      HS_STATES.compareAndSet(null, _mapMih);
    }

    return Optional.ofNullable(_mapMih.get(_iVc));
  }


  public int getHsCodeVal() {
    return this.hsCodeVal;
  }
}
