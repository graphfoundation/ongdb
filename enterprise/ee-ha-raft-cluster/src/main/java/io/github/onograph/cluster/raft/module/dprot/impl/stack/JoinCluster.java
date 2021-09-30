package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import akka.actor.Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class JoinCluster {


  private final boolean isRr;


  private final List<Address> listAdessAddress;

  private JoinCluster(boolean _isRr, List<Address> _listAdessAddress) {
    this.isRr = _isRr;
    this.listAdessAddress = List.copyOf(_listAdessAddress);
  }


  static JoinCluster intlJoinCluster(Collection<Address> _collectionAdessAddress) {
    return new JoinCluster(true, new ArrayList(_collectionAdessAddress));
  }


  List<Address> allList() {
    return List.copyOf(this.listAdessAddress);
  }


  JoinCluster collectionNsAddress(Collection<Address> _collectionNsAddress) {

    List<Address> _listAnAddress = Stream.concat(_collectionNsAddress.stream(),
            this.listAdessAddress.stream().filter((a) ->
            {
              return !_collectionNsAddress.contains(
                  a);
            }))
        .collect(Collectors.toList());
    return new JoinCluster(_listAnAddress.isEmpty(), _listAnAddress);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      JoinCluster _tJoinCluster = (JoinCluster) obj;
      return this.isRr == _tJoinCluster.isRr && Objects.equals(this.listAdessAddress,
          _tJoinCluster.listAdessAddress);
    } else {
      return false;
    }
  }


  boolean getIsRr() {
    return this.isRr;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.isRr, this.listAdessAddress);
  }


  boolean isHaars() {
    return !this.listAdessAddress.isEmpty();
  }


  JoinCluster wirodaeJoinCluster() {

    LinkedList<Address> _linkedListAnAddress = new LinkedList(this.listAdessAddress);
    _linkedListAnAddress.addLast(_linkedListAnAddress.removeFirst());
    return new JoinCluster(false, _linkedListAnAddress);
  }


}
