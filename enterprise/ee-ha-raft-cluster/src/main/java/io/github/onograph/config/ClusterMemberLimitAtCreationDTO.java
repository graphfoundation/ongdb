package io.github.onograph.config;

import java.util.Objects;
import org.neo4j.configuration.Config;


public class ClusterMemberLimitAtCreationDTO {


  private final int val;

  public ClusterMemberLimitAtCreationDTO(int val) {
    this.val = val;
  }


  public static ClusterMemberLimitAtCreationDTO froClusterMemberLimitAtCreationDTO(Config _config) {

    Integer val = _config.get(SettingsDeclarationClusterSystemImpl.settingMieaibmroiInteger);
    return new ClusterMemberLimitAtCreationDTO(val);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (!(obj instanceof ClusterMemberLimitAtCreationDTO)) {
      return false;
    } else {

      ClusterMemberLimitAtCreationDTO _thaClusterMemberLimitAtCreationDTO = (ClusterMemberLimitAtCreationDTO) obj;
      return this.val == _thaClusterMemberLimitAtCreationDTO.val;
    }
  }


  public int getVal() {
    return this.val;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.val);
  }


}
