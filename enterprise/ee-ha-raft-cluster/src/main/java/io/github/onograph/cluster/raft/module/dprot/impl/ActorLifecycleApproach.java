package io.github.onograph.cluster.raft.module.dprot.impl;

import akka.cluster.Cluster;
import akka.cluster.ClusterEvent.CurrentClusterState;
import akka.cluster.Member;
import akka.cluster.MemberStatus;
import io.github.onograph.cluster.raft.module.dprot.MemberNodeService;
import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.util.VisibleForTesting;


public abstract class ActorLifecycleApproach {


  private static final Duration STD_CK_FRQN = Duration.ofSeconds(10L);


  public Duration chcfrucDuration() {
    return STD_CK_FRQN;
  }


  public abstract String gersString();


  public abstract boolean isRerruForCl(Cluster _cluster);


  public static class ActorLifecycleApproachDefaultImpl extends ActorLifecycleApproach {


    private final AtomicReference<Instant> atomicReferenceDffcInstant = new AtomicReference();


    private final AtomicInteger cnt = new AtomicInteger();


    private final int iMxcne = 3;


    private final Supplier<Optional<SocketAddress>> supplierSfOptional;

    public ActorLifecycleApproachDefaultImpl(MemberNodeService _rmMemberNodeService) {
      Objects.requireNonNull(_rmMemberNodeService);
      this.supplierSfOptional = _rmMemberNodeService::fOptional;
    }


    private boolean _isFitseForMe(Member _seMember) {

      Optional<SocketAddress> _optionalSfSocketAddress = this.supplierSfOptional.get();
      return _optionalSfSocketAddress.map((socketAddress) ->
      {
        return socketAddress.getHostname() != null && socketAddress.getPort() > 0
            && _seMember != null &&
            _seMember.address() != null && _seMember.address().port().exists(Objects::nonNull) &&
            _seMember.address().host().exists(Objects::nonNull) &&
            socketAddress.getHostname().equals(_seMember.address().host().get()) &&
            Integer.toString(socketAddress.getPort())
                .equals(_seMember.address().port().get().toString());
      }).orElse(false);
    }

    @Override
    public String gersString() {

      Class _class1 = this.getClass();
      return io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.ActorLifecycleApproachDefaultImpl.gersString",
          _class1,
          this.cnt.get(), this.chcfrucDuration().toString());
    }


    @VisibleForTesting
    boolean isAnrqmunsForCl(Cluster _cluster) {

      CurrentClusterState _currentClusterState = _cluster.state();

      Set<Member> _setUrahbMember = _currentClusterState.getUnreachable();

      Set<Member> _setMrauMember = new HashSet();
      if (_cluster.selfMember().status() == MemberStatus.removed()) {
        return true;
      } else {

        Iterator _iterator = _currentClusterState.getMembers().iterator();

        while (_iterator.hasNext()) {

          Member ms = (Member) _iterator.next();
          if (!_setUrahbMember.contains(ms) && ms.status() == MemberStatus.up()) {
            _setMrauMember.add(ms);
          }
        }

        if (this._isFitseForMe(_cluster.selfMember()) && _setMrauMember.size() == 1
            && _setMrauMember.contains(_cluster.selfMember())) {
          return true;
        } else {
          return _setUrahbMember.size() > 0 && _setUrahbMember.size() > _setMrauMember.size();
        }
      }
    }

    @Override
    public boolean isRerruForCl(Cluster _cluster) {
      if (this.isAnrqmunsForCl(_cluster)) {

        Instant _nInstant = Instant.now();

        Instant _ffdaInstant = this.atomicReferenceDffcInstant.compareAndExchange(null, _nInstant);

        Instant _afInstant = (_ffdaInstant == null ? _nInstant : _ffdaInstant)
            .plus(ActorLifecycleApproach.STD_CK_FRQN.multipliedBy(3L));
        return this.cnt.incrementAndGet() >= 3 && _nInstant.isAfter(_afInstant);
      } else {
        this.cnt.set(0);
        this.atomicReferenceDffcInstant.set(null);
        return false;
      }
    }
  }


  public static class NoRestartFailure extends ActorLifecycleApproach {

    @Override
    public String gersString() {

      throw new IllegalStateException("*** Error:  46d1fe78-23f9-4560-a1a5-8b458f19d299");
    }

    @Override
    public boolean isRerruForCl(Cluster _cluster) {
      return false;
    }
  }


  public static class RestartAllConds extends ActorLifecycleApproach {

    @Override
    public String gersString() {

      Class _class1 = this.getClass();
      return io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartAllConds.gersString",
          _class1,
          this.chcfrucDuration().toString());
    }

    @Override
    public boolean isRerruForCl(Cluster _cluster) {
      return true;
    }
  }


  public static class RestartRules1 extends ActorLifecycleApproach {

    @Override
    public String gersString() {

      Class _class1 = this.getClass();
      return io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1.gersString",
          _class1,
          this.chcfrucDuration().toString());
    }

    @Override
    public boolean isRerruForCl(Cluster _cluster) {
      return Instant.now().getEpochSecond() % 200L <= this.chcfrucDuration().toSeconds();
    }
  }


  public static class StartOverIfSingleNotResponding extends ActorLifecycleApproach {

    @Override
    public String gersString() {
      return io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.StartOverIfSingleNotResponding.gersString",
          this.getClass());
    }

    @Override
    public boolean isRerruForCl(Cluster _cluster) {
      return _cluster.state().getUnreachable().size() > 0;
    }
  }
}
