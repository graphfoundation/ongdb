package io.github.onograph.cluster.raft.share.calg.meta;

import io.github.onograph.config.NodeGroupIdentifier;
import io.github.onograph.config.NodeGroupIdentifierSetSupplier;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.Set;
import java.util.function.BooleanSupplier;
import org.neo4j.configuration.Config;


public class ConsensusMetaManagingEnvironment {


  private final boolean isVps;


  private final BooleanSupplier oriBooleanSupplier;


  private final ConsensusMetaProvider saeConsensusMetaProvider;


  private final NodeGroupIdentifierSetSupplier sgsNodeGroupIdentifierSetSupplier;


  private final BooleanSupplier sipsBooleanSupplier;


  public ConsensusMetaManagingEnvironment(Config _config, BooleanSupplier _oriBooleanSupplier,
      ConsensusMetaProvider _saeConsensusMetaProvider,
      NodeGroupIdentifierSetSupplier _sgsNodeGroupIdentifierSetSupplier,
      BooleanSupplier _sipsBooleanSupplier) {
    this.saeConsensusMetaProvider = _saeConsensusMetaProvider;
    this.isVps = _config.get(SettingsDeclarationClusterImpl.settingEneoBoolean);
    this.sgsNodeGroupIdentifierSetSupplier = _sgsNodeGroupIdentifierSetSupplier;
    this.sipsBooleanSupplier = _sipsBooleanSupplier;
    this.oriBooleanSupplier = _oriBooleanSupplier;
  }


  public boolean getIsVps() {
    return this.isVps;
  }


  public ConsensusMetaProvider getSaeConsensusMetaProvider() {
    return this.saeConsensusMetaProvider;
  }


  public boolean isPcshwiprs() {
    return this.sipsBooleanSupplier.getAsBoolean();
  }


  public boolean isReoy() {
    return this.oriBooleanSupplier.getAsBoolean();
  }


  public Set<NodeGroupIdentifier> sevguSet() {
    return this.sgsNodeGroupIdentifierSetSupplier.get();
  }
}
