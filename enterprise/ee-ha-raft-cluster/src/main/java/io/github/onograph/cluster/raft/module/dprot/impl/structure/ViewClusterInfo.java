package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.cluster.ClusterEvent.CurrentClusterState;
import akka.cluster.Member;
import akka.cluster.MemberStatus;
import akka.cluster.UniqueAddress;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.util.VisibleForTesting;


public class ViewClusterInfo {


  public static final ViewClusterInfo EMT_VIEW_CLUSTER_INFO = new ViewClusterInfo();


  private final boolean isCnegd;


  private final SortedSet<Member> mbrs;


  private final Set<Member> setUrahbMember;

  private ViewClusterInfo() {
    this(false, Collections.unmodifiableSortedSet(new TreeSet(Member.ordering())),
        Collections.unmodifiableSet(new HashSet()));
  }

  public ViewClusterInfo(CurrentClusterState _currentClusterState) {
    this(_currentClusterState.leader().isDefined(), _mebsfoSortedSet(_currentClusterState),
        _currentClusterState.getUnreachable());
  }

  @VisibleForTesting
  ViewClusterInfo(boolean _isCnegd, SortedSet<Member> mbrs, Set<Member> _setUrahbMember) {
    this.isCnegd = _isCnegd;

    TreeSet<Member> _treeSetMuMember = (TreeSet) mbrs.stream().filter(this::_isMebiupForMe)
        .collect(Collectors.toCollection(() ->
        {
          return new TreeSet(
              Member.ordering());
        }));
    this.mbrs = Collections.unmodifiableSortedSet(_treeSetMuMember);
    this.setUrahbMember = Collections.unmodifiableSet(_setUrahbMember);
  }


  private static SortedSet<Member> _mebsfoSortedSet(CurrentClusterState _currentClusterState) {

    TreeSet<Member> _treeSetMtMember = new TreeSet<>(Member.ordering());

    Iterable<Member> _iterableVr00Member = _currentClusterState.getMembers();
    Objects.requireNonNull(_treeSetMtMember);
    _iterableVr00Member.forEach(_treeSetMtMember::add);
    return _treeSetMtMember;
  }


  private boolean _isMebiupForMe(Member ms) {
    return MemberStatus.up().equals(ms.status()) || MemberStatus.weaklyUp().equals(ms.status());
  }


  public Stream<UniqueAddress> avamesStream() {
    return this.mbrs.stream().filter((member) ->
    {
      return !this.setUrahbMember.contains(member);
    }).map(Member::uniqueAddress);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ViewClusterInfo _thViewClusterInfo = (ViewClusterInfo) obj;
      return this.isCnegd == _thViewClusterInfo.isCnegd && Objects.equals(this.mbrs,
          _thViewClusterInfo.mbrs) &&
          Objects.equals(this.setUrahbMember, _thViewClusterInfo.setUrahbMember);
    } else {
      return false;
    }
  }


  public boolean getIsCnegd() {
    return this.isCnegd;
  }


  @VisibleForTesting
  public SortedSet<Member> getMbrs() {
    return this.mbrs;
  }


  public Set<Member> getSetUrahbMember() {
    return this.setUrahbMember;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.isCnegd, this.mbrs, this.setUrahbMember);
  }


  public ViewClusterInfo ignoreMember(Member _member) {

    TreeSet<Member> _treeSetTmMember = new TreeSet(Member.ordering());
    _treeSetTmMember.addAll(this.mbrs);
    _treeSetTmMember.remove(_member);

    Set<Member> _setUtMember = new HashSet(this.setUrahbMember);
    _setUtMember.remove(_member);
    return new ViewClusterInfo(this.isCnegd, _treeSetTmMember, _setUtMember);
  }


  public ViewClusterInfo ignoreUnresponsiveMember(Member _member) {

    Set<Member> _setUtMember = new HashSet(this.setUrahbMember);
    _setUtMember.remove(_member);
    return new ViewClusterInfo(this.isCnegd, this.mbrs, _setUtMember);
  }


  public ViewClusterInfo isCnegd(boolean _isCnegd) {
    return new ViewClusterInfo(_isCnegd, this.mbrs, this.setUrahbMember);
  }


  public boolean isMoarrce() {

    int _iSu = this.setUrahbMember.size();

    int _iRs = this.mbrs.size() - _iSu;
    return _iRs > _iSu;
  }


  public ViewClusterInfo member(Member _member) {

    TreeSet<Member> _treeSetMtMember = new TreeSet(Member.ordering());
    _treeSetMtMember.addAll(this.mbrs);
    _treeSetMtMember.remove(_member);
    _treeSetMtMember.add(_member);

    Set<Member> _setTuMember = new HashSet(this.setUrahbMember);
    if (_setTuMember.remove(_member)) {
      _setTuMember.add(_member);
    }

    return new ViewClusterInfo(this.isCnegd, _treeSetMtMember, _setTuMember);
  }


  public ViewClusterInfo unresponsiveMember(Member _member) {

    Set<Member> _setUtMember = new HashSet(this.setUrahbMember);
    _setUtMember.add(_member);
    return new ViewClusterInfo(this.isCnegd, this.mbrs, _setUtMember);
  }


}
