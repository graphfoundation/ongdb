package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.control.AppComProFamilyGroupType;
import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import io.github.onograph.cluster.raft.control.ComProFamily;
import io.github.onograph.cluster.raft.control.MutableProtocols;
import io.github.onograph.cluster.raft.control.MutatingComProFamilyGroupType;
import io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper;
import io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper;
import io.github.onograph.config.EntProVer;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.configuration.Config;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ProFamilyManagementService {


  private final Config config;


  private final Log log;

  public ProFamilyManagementService(Config _config, LogProvider _logProvider) {
    this.config = _config;
    this.log = _logProvider.getLog(this.getClass());
  }


  private MutatingCurrentActiveComProFamilyWrapper _coenpovenMutatingCurrentActiveComProFamilyWrapper() {

    List<String> _listIpeetString =
        this._prcfocfList(MutatingComProFamilyGroupType.TYPE_COMP, (implementation) ->
            {
              return MutableProtocols.finOptional(MutatingComProFamilyGroupType.TYPE_COMP,
                  implementation);
            },
            this.config.get(SettingsDeclarationClusterImpl.settingCoeneasList));
    return new MutatingCurrentActiveComProFamilyWrapper(MutatingComProFamilyGroupType.TYPE_COMP,
        _listIpeetString);
  }


  private ApplicationCurrentActiveComProFamilyWrapper _geaptsutpolApplicationCurrentActiveComProFamilyWrapper(
      AppComProFamilyGroupType _ctgrAppComProFamilyGroupType, List<EntProVer> _listVcEntProVer) {
    if (_listVcEntProVer.isEmpty()) {
      return ApplicationCurrentActiveComProFamilyWrapper.foptoApplicationCurrentActiveComProFamilyWrapper(
          _ctgrAppComProFamilyGroupType,
          Collections.emptyList());
    } else {

      List<EntProVer> _listKvEntProVer = this._prcfocfList(_ctgrAppComProFamilyGroupType,
          (version) ->
          {
            return ApplicationComProFamilyType.finOptional(_ctgrAppComProFamilyGroupType, version);
          }, _listVcEntProVer);
      if (_listKvEntProVer.isEmpty()) {

        throw new IllegalArgumentException("*** Error: 02b79a96-fcab-4367-b515-e94a73bdace2");
      } else {
        return ApplicationCurrentActiveComProFamilyWrapper.foptoApplicationCurrentActiveComProFamilyWrapper(
            _ctgrAppComProFamilyGroupType,
            _listKvEntProVer);
      }
    }
  }


  private List<EntProVer> _geptoList(boolean _isPeu, List<EntProVer> _listPooosEntProVer,
      ApplicationComProFamilyType _vpeApplicationComProFamilyType) {
    return _listPooosEntProVer.isEmpty() && !_isPeu ? List.of(ApplicationComProFamilyType.values())
        .stream().filter((p) ->
        {
          return p.isSacerForAp(
              _vpeApplicationComProFamilyType);
        }).filter((p) ->
        {
          return !p
              .equals(
                  _vpeApplicationComProFamilyType);
        })
        .map(ApplicationComProFamilyType::getImpl).collect(Collectors.toList())
        : _listPooosEntProVer;
  }


  private <IMPL extends Comparable<IMPL>, T extends ComProFamily<IMPL>> void _loukpcForCoPa(
      io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<T> _comProFamilyGroupCtgrT,
      Pair<IMPL, Optional<T>> _pairIwpio) {
    if (_pairIwpio.other().isEmpty()) {

    }
  }


  private <IMPL extends Comparable<IMPL>, T extends ComProFamily<IMPL>> List<IMPL> _prcfocfList(
      io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<T> _comProFamilyGroupCtgrT,
      Function<IMPL, Optional<T>> _functionFneio, List<IMPL> _listIpeetIMPL) {
    return _listIpeetIMPL.stream().map((impl) ->
        {
          return Pair.of(impl, _functionFneio.apply(impl));
        }).peek((protocolWithImplementation) ->
        {
          this._loukpcForCoPa(_comProFamilyGroupCtgrT, protocolWithImplementation);
        }).map(Pair::other).flatMap(Optional::stream).map(ComProFamily::getImpl)
        .collect(Collectors.toList());
  }


  public ApplicationCurrentActiveComProFamilyWrapper surcappoApplicationCurrentActiveComProFamilyWrapper() {

    List<EntProVer> _listLcEntProVer = this.config.get(
        SettingsDeclarationClusterImpl.settingCaultnList);

    Boolean _isPeu = this.config.get(SettingsDeclarationClusterSystemImpl.settingExiacroBoolean);

    List<EntProVer> _listPooosEntProVer =
        this._geptoList(_isPeu, _listLcEntProVer,
            ApplicationComProFamilyType.exiaccproApplicationComProFamilyType());
    return this._geaptsutpolApplicationCurrentActiveComProFamilyWrapper(
        AppComProFamilyGroupType.CATCHUP_PROTOCOL, _listPooosEntProVer);
  }


  public List<MutatingCurrentActiveComProFamilyWrapper> surmoeptsList() {

    MutatingCurrentActiveComProFamilyWrapper _csMutatingCurrentActiveComProFamilyWrapper = this._coenpovenMutatingCurrentActiveComProFamilyWrapper();
    return Stream.of(_csMutatingCurrentActiveComProFamilyWrapper).filter((supportedProtocols) ->
    {
      return !supportedProtocols.getListVrinU().isEmpty();
    }).collect(Collectors.toList());
  }


  public ApplicationCurrentActiveComProFamilyWrapper surrapolApplicationCurrentActiveComProFamilyWrapper() {

    List<EntProVer> _listLirEntProVer = this.config.get(
        SettingsDeclarationClusterImpl.settingRameiList);

    Boolean _isReu = this.config.get(SettingsDeclarationClusterSystemImpl.settingExiatoBoolean);

    List<EntProVer> _listPooosEntProVer =
        this._geptoList(_isReu, _listLirEntProVer,
            ApplicationComProFamilyType.exiartpoApplicationComProFamilyType());
    return this._geaptsutpolApplicationCurrentActiveComProFamilyWrapper(
        AppComProFamilyGroupType.RAFT_PROTOCOL, _listPooosEntProVer);
  }
}
