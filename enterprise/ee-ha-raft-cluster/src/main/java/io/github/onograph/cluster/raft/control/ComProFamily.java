package io.github.onograph.cluster.raft.control;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public interface ComProFamily<IMPL extends Comparable<IMPL>> {


  static <IMPL extends Comparable<IMPL>, T extends ComProFamily<IMPL>> Optional<T> finOptional(
      io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<T> _comProFamilyGroupCtgrT,
      Function<IMPL, IMPL> _functionNraieii, IMPL _imIpeet, T[] valArr) {
    return Stream.of(valArr).filter((protocol) ->
    {
      return Objects.equals(protocol.caerString(), _comProFamilyGroupCtgrT.lowerName());
    }).filter((protocol) ->
    {
      return Objects
          .equals(_functionNraieii.apply(protocol.getImpl()), _functionNraieii.apply(_imIpeet));
    }).findFirst();
  }


  static <IMPL extends Comparable<IMPL>, T extends ComProFamily<IMPL>> List<T> fitcerList(
      io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<T> _comProFamilyGroupCtgrT,
      Predicate<IMPL> _predicatePiIMPL, T[] valArr) {
    return Stream.of(valArr).filter((protocol) ->
    {
      return Objects.equals(protocol.caerString(), _comProFamilyGroupCtgrT.lowerName());
    }).filter((protocol) ->
    {
      return _predicatePiIMPL.test(protocol.getImpl());
    }).collect(Collectors.toList());
  }


  String caerString();


  IMPL getImpl();


  interface ComProFamilyGroup<T extends ComProFamily<?>> {


    String lowerName();
  }
}
