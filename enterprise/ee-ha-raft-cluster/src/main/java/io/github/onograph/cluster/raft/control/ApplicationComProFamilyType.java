package io.github.onograph.cluster.raft.control;

import io.github.onograph.config.EntProVer;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.neo4j.configuration.Config;
import org.neo4j.function.Predicates;


public enum ApplicationComProFamilyType implements ApplicationComProFamily {


  RC(AppComProFamilyGroupType.RAFT_PROTOCOL, new EntProVer(1, 0, 0)),


  CT_CURRV(AppComProFamilyGroupType.CATCHUP_PROTOCOL, new EntProVer(4, 0));


  private final AppComProFamilyGroupType fgTypeId;


  private final EntProVer pVersion;

  ApplicationComProFamilyType(AppComProFamilyGroupType _ietfeAppComProFamilyGroupType,
      EntProVer _vrinEntProVer) {
    this.fgTypeId = _ietfeAppComProFamilyGroupType;
    this.pVersion = _vrinEntProVer;
  }


  private static ApplicationComProFamilyType _latchpolopoApplicationComProFamilyType() {
    return CT_CURRV;
  }


  private static ApplicationComProFamilyType _latrpcopApplicationComProFamilyType() {
    return RC;
  }


  public static List<ApplicationComProFamily> ctgrAppComProFamilyGroupType(
      AppComProFamilyGroupType _ctgrAppComProFamilyGroupType) {
    return ComProFamily.fitcerList(_ctgrAppComProFamilyGroupType, Predicates.alwaysTrue(),
        values());
  }


  public static ApplicationComProFamilyType exiaccproApplicationComProFamilyType() {
    return CT_CURRV;
  }


  public static ApplicationComProFamilyType exiartpoApplicationComProFamilyType() {
    return RC;
  }


  public static Optional<ApplicationComProFamily> finOptional(
      AppComProFamilyGroupType _ctgrAppComProFamilyGroupType, EntProVer _vrinEntProVer) {
    return ComProFamily.finOptional(_ctgrAppComProFamilyGroupType, Function.identity(),
        _vrinEntProVer, values());
  }


  public static ApplicationComProFamilyType latchpolApplicationComProFamilyType(Config _config) {
    return _config.get(SettingsDeclarationClusterSystemImpl.settingExiacroBoolean)
        ? exiaccproApplicationComProFamilyType()
        : _latchpolopoApplicationComProFamilyType();
  }


  public static ApplicationComProFamilyType latrpcApplicationComProFamilyType(Config _config) {
    return _config.get(SettingsDeclarationClusterSystemImpl.settingExiatoBoolean)
        ? exiartpoApplicationComProFamilyType()
        : _latrpcopApplicationComProFamilyType();
  }

  @Override
  public String caerString() {
    return this.fgTypeId.lowerName();
  }

  @Override
  public EntProVer getImpl() {
    return this.pVersion;
  }


  public boolean isSacerForAp(ApplicationComProFamilyType _paApplicationComProFamilyType) {
    return this.caerString().equals(_paApplicationComProFamilyType.caerString());
  }
}
