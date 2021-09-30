package io.github.onograph.cluster.raft.module.dprot.pit;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.id.CoreNodeServerIdentity;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.dbms.DatabaseState;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.OperatorState;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;


public final class GdbServerPointInTimeImpl implements GdbServerPointInTime {


  static final Set<OperatorState> DICEB_GDB_STT;

  static {
    DICEB_GDB_STT = Set.of(OperatorStateEnterpriseTypeImpl.SETI_IS,
        OperatorStateEnterpriseTypeImpl.SETI_RUNNING,
        OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS);
  }


  private final Map<DatabaseId, NodeServerMemberLeaderMeta> mapLddn;


  private final Map<DatabaseId, ConsensusNodeId> mapMddc;


  private final Map<DatabaseId, DatabaseState> mapSddd;


  public GdbServerPointInTimeImpl(Map<DatabaseId, NodeServerMemberLeaderMeta> _mapDldn,
      Map<DatabaseId, ConsensusNodeId> _mapMddc, Map<DatabaseId, DatabaseState> _mapSddd) {
    this.mapLddn = _mapDldn;
    this.mapMddc = _mapMddc;
    this.mapSddd = _mapSddd;
  }


  public static PointInTimeBackupService cosnoftPointInTimeBackupService(
      CoreNodeServerIdentity _miCoreNodeServerIdentity) {
    return (databaseStateService, databaseLeaderships) ->
    {
      return new GdbServerPointInTimeImpl(
          Map.copyOf(databaseLeaderships),
          daammhMap(databaseStateService, _miCoreNodeServerIdentity),
          daassteMap(databaseStateService));
    };
  }


  private static Map<DatabaseId, ConsensusNodeId> daammhMap(
      DatabaseStateService _databaseStateService,
      CoreNodeServerIdentity _miCoreNodeServerIdentity) {
    return _databaseStateService.stateOfAllDatabases().keySet().stream()
        .collect(Collectors.toUnmodifiableMap(NamedDatabaseId::databaseId, (dbId) ->
        {
          return _miCoreNodeServerIdentity.ratmmriConsensusNodeId(dbId.databaseId());
        }));
  }


  private static Map<DatabaseId, DatabaseState> daassteMap(
      DatabaseStateService _databaseStateService) {
    return _databaseStateService.stateOfAllDatabases().entrySet().stream()
        .collect(Collectors.toUnmodifiableMap((entry) ->
        {
          return entry
              .getKey().databaseId();
        }, Entry::getValue));
  }


  public static GdbServerPointInTimeImpl rrsnstGdbServerPointInTimeImpl(
      DatabaseStateService _databaseStateService,
      Map<DatabaseId, NodeServerMemberLeaderMeta> _mapLddn) {
    return new GdbServerPointInTimeImpl(Map.copyOf(_mapLddn), Map.of(),
        daassteMap(_databaseStateService));
  }

  @Override
  public Map<DatabaseId, NodeServerMemberLeaderMeta> daalahMap() {
    return this.mapLddn;
  }

  @Override
  public Map<DatabaseId, ConsensusNodeId> daammhMap() {
    return this.mapMddc;
  }

  @Override
  public Map<DatabaseId, DatabaseState> daassteMap() {
    return this.mapSddd;
  }

  @Override
  public Set<DatabaseId> divldasSet() {
    return this.mapSddd.entrySet().stream().filter((entry) ->
    {
      return DICEB_GDB_STT
          .contains(entry.getValue().operatorState());
    }).map(Entry::getKey).collect(Collectors.toUnmodifiableSet());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      GdbServerPointInTimeImpl _thaGdbServerPointInTimeImpl = (GdbServerPointInTimeImpl) obj;
      return Objects.equals(this.mapSddd, _thaGdbServerPointInTimeImpl.mapSddd) &&
          Objects.equals(this.mapMddc, _thaGdbServerPointInTimeImpl.mapMddc) &&
          Objects.equals(this.mapLddn, _thaGdbServerPointInTimeImpl.mapLddn);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mapSddd, this.mapMddc, this.mapLddn);
  }


}
