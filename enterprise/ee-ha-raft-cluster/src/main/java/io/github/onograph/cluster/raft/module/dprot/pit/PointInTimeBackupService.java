package io.github.onograph.cluster.raft.module.dprot.pit;

import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.util.Map;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.kernel.database.DatabaseId;


@FunctionalInterface
public interface PointInTimeBackupService {


  GdbServerPointInTime takePointInTimeImage(DatabaseStateService _databaseStateService,
      Map<DatabaseId, NodeServerMemberLeaderMeta> _mapVdn);
}
