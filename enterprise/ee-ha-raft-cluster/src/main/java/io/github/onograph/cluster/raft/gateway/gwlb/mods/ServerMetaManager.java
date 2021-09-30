package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.dbms.OperatorState;
import org.neo4j.dbms.identity.ServerId;


public class ServerMetaManager {


  private final ServerMetaManager.ServerMetaAllWrapper floesServerMetaAllWrapper;


  private final ServerMetaManager.ServerMetaAllWrapper laeServerMetaAllWrapper;


  private final ServerMetaManager.ServerMetaAllWrapper rtServerMetaAllWrapper;


  private final ServerMetaManager.ServerMetaAllWrapper tcServerMetaAllWrapper;


  ServerMetaManager(ServerId _ilaServerId,
      ServerMetaManager.ServerMetaAllWrapper _tcServerMetaAllWrapper,
      ServerMetaManager.ServerMetaAllWrapper _trServerMetaAllWrapper) {
    this.rtServerMetaAllWrapper = _trServerMetaAllWrapper;
    this.tcServerMetaAllWrapper = _tcServerMetaAllWrapper;
    this.floesServerMetaAllWrapper = new ServerMetaManager.ServerMetaAllWrapper(
        new HashMap(_tcServerMetaAllWrapper.mapIslo));
    this.laeServerMetaAllWrapper =
        _ilaServerId == null ? new ServerMetaManager.ServerMetaAllWrapper(Map.of())
            : new ServerMetaManager.ServerMetaAllWrapper(
                _tcServerMetaAllWrapper.mapIslo.entrySet().stream().filter((entry) ->
                    {
                      return entry
                          .getKey()
                          .getServerId()
                          .equals(
                              _ilaServerId);
                    }).findFirst()
                    .stream().collect(
                        Collectors.toMap(Entry::getKey, Entry::getValue)));

    Set _set = this.laeServerMetaAllWrapper.alsvsSet();

    Map _map = this.floesServerMetaAllWrapper.mapIslo;
    Objects.requireNonNull(_map);
    _set.forEach(_map::remove);
  }


  ServerMetaManager.ServerMetaAllWrapper getFloesServerMetaAllWrapper() {
    return this.floesServerMetaAllWrapper;
  }


  ServerMetaManager.ServerMetaAllWrapper getLaeServerMetaAllWrapper() {
    return this.laeServerMetaAllWrapper;
  }


  ServerMetaManager.ServerMetaAllWrapper getRtServerMetaAllWrapper() {
    return this.rtServerMetaAllWrapper;
  }


  ServerMetaManager.ServerMetaAllWrapper getTcServerMetaAllWrapper() {
    return this.tcServerMetaAllWrapper;
  }


  public boolean isEmy() {
    return this.tcServerMetaAllWrapper.alsvsSet().isEmpty()
        && this.rtServerMetaAllWrapper.alsvsSet().isEmpty();
  }


  public boolean isOismr() {
    return !this.tcServerMetaAllWrapper.onvsSet().isEmpty()
        || !this.rtServerMetaAllWrapper.onvsSet().isEmpty();
  }


  static class ServerMetaAllWrapper {


    private final Map<LoadBalanceServerMeta, ? extends OperatorState> mapIslo;

    ServerMetaAllWrapper(Map<LoadBalanceServerMeta, ? extends OperatorState> _mapIslo) {
      this.mapIslo = _mapIslo;
    }


    Set<LoadBalanceServerMeta> alsvsSet() {
      return Set.copyOf(this.mapIslo.keySet());
    }


    Set<LoadBalanceServerMeta> onvsSet() {
      return this.mapIslo.entrySet().stream().filter((entry) ->
      {
        return entry.getValue() == OperatorStateEnterpriseTypeImpl.SETI_RUNNING;
      }).map(Entry::getKey).collect(Collectors.toUnmodifiableSet());
    }
  }
}
