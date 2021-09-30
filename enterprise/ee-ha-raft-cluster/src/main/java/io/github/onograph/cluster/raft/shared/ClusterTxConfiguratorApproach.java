package io.github.onograph.cluster.raft.shared;

import io.github.onograph.config.Backup;
import io.github.onograph.config.TxFlowType;
import java.util.function.Supplier;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.SettingChangeListener;


public class ClusterTxConfiguratorApproach implements SettingChangeListener<TxFlowType>,
    Supplier<TxFlowType> {


  private volatile TxFlowType scTxFlowType;

  private ClusterTxConfiguratorApproach(Config _config) {
    this.scTxFlowType = _config.get(Backup.settingInmluaTxFlowType);
    _config.addListener(Backup.settingInmluaTxFlowType, this);
  }


  public static ClusterTxConfiguratorApproach craClusterTxConfiguratorApproach(Config _config) {
    return new ClusterTxConfiguratorApproach(_config);
  }

  @Override
  public void accept(TxFlowType _bfrTxFlowType, TxFlowType _atrTxFlowType) {
    this.scTxFlowType = _atrTxFlowType;
  }

  @Override
  public TxFlowType get() {
    return this.scTxFlowType;
  }
}
