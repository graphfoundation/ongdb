package io.github.onograph.server.security.systemgraph;

import com.github.benmanes.caffeine.cache.Cache;
import io.github.onograph.cluster.raft.module.cuprot.current.core.GdbAuthActions;
import io.github.onograph.cluster.raft.module.cuprot.current.core.GdbAuthActionsManager;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.auth.RoleService;
import io.github.onograph.server.security.auth.module.AuthoritiesConstants;
import io.github.onograph.server.security.systemgraph.versions.DisabledSecurityKnownSystemComponentVersionSecurity;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSecurityComponentVersion;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionA35;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionB36;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionC40;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionD41Drop1;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionE41;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionF42Drop4;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionG420Drop6;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionH420Drop7;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionI421;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionJ43Drop1;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionK43Drop3;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionL43Drop4;
import io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersionNext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.AbstractSystemGraphComponent;
import org.neo4j.dbms.database.ComponentVersion;
import org.neo4j.dbms.database.KnownSystemComponentVersions;
import org.neo4j.dbms.database.SystemGraphComponent;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;
import org.neo4j.server.security.auth.UserRepository;


public class DefaultSecuritySystemGraphComponent extends AbstractSystemGraphComponent implements
    GdbAuthActionsManager {


  private final AbstractSecurityLog abstractSecurityLog;


  private final UserRepository darUserRepository;


  private final SystemInitFileProcessor iscSystemInitFileProcessor;


  private final KnownSystemComponentVersions<SecurityKnownSecurityComponentVersion> knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion =
      new KnownSystemComponentVersions(new DisabledSecurityKnownSystemComponentVersionSecurity());


  public DefaultSecuritySystemGraphComponent(AbstractSecurityLog _abstractSecurityLog,
      Config _config, UserRepository _radUserRepository, RoleService _rrmRoleService) {
    super(_config);
    this.darUserRepository = _radUserRepository;
    this.iscSystemInitFileProcessor = new SystemInitFileProcessor(_abstractSecurityLog, _config);
    this.abstractSecurityLog = _abstractSecurityLog;

    SecurityKnownSecurityComponentVersion _vrinSecurityKnownSecurityComponentVersion =
        new SecurityKnownSystemComponentVersionA35(_abstractSecurityLog,
            this.iscSystemInitFileProcessor, _rrmRoleService);

    SecurityKnownSecurityComponentVersion _vrinSecurityKnownSecurityComponentVersion2 =
        new SecurityKnownSystemComponentVersionB36(_abstractSecurityLog, _config,
            _vrinSecurityKnownSecurityComponentVersion);

    SecurityKnownSecurityComponentVersion _vrinSecurityKnownSecurityComponentVersion3 =
        new SecurityKnownSystemComponentVersionC40(_abstractSecurityLog,
            _vrinSecurityKnownSecurityComponentVersion2);

    SecurityKnownSecurityComponentVersion _vrinSecurityKnownSecurityComponentVersion4 =
        new SecurityKnownSystemComponentVersionD41Drop1(_abstractSecurityLog,
            _vrinSecurityKnownSecurityComponentVersion3);

    SecurityKnownSecurityComponentVersion _vrinSecurityKnownSecurityComponentVersion5 =
        new SecurityKnownSystemComponentVersionE41(_abstractSecurityLog,
            _vrinSecurityKnownSecurityComponentVersion4);

    SecurityKnownSecurityComponentVersion _vrinSecurityKnownSecurityComponentVersion6 =
        new SecurityKnownSystemComponentVersionF42Drop4(_abstractSecurityLog,
            _vrinSecurityKnownSecurityComponentVersion5);

    SecurityKnownSecurityComponentVersion _vrinSecurityKnownSecurityComponentVersion7 =
        new SecurityKnownSystemComponentVersionG420Drop6(_abstractSecurityLog,
            _vrinSecurityKnownSecurityComponentVersion6);

    SecurityKnownSecurityComponentVersion _vrinSecurityKnownSecurityComponentVersion8 =
        new SecurityKnownSystemComponentVersionH420Drop7(_abstractSecurityLog,
            _vrinSecurityKnownSecurityComponentVersion7);

    SecurityKnownSecurityComponentVersion _vrinSecurityKnownSecurityComponentVersion9 =
        new SecurityKnownSystemComponentVersionI421(_abstractSecurityLog,
            _vrinSecurityKnownSecurityComponentVersion8);

    SecurityKnownSecurityComponentVersion _vrinSecurityKnownSecurityComponentVersion10 =
        new SecurityKnownSystemComponentVersionJ43Drop1(_abstractSecurityLog,
            _vrinSecurityKnownSecurityComponentVersion9);

    SecurityKnownSecurityComponentVersion _vrin0SecurityKnownSecurityComponentVersion =
        new SecurityKnownSystemComponentVersionK43Drop3(_abstractSecurityLog,
            _vrinSecurityKnownSecurityComponentVersion10);

    SecurityKnownSecurityComponentVersion _vrin1SecurityKnownSecurityComponentVersion =
        new SecurityKnownSystemComponentVersionL43Drop4(_abstractSecurityLog,
            _vrin0SecurityKnownSecurityComponentVersion);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrinSecurityKnownSecurityComponentVersion);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrinSecurityKnownSecurityComponentVersion2);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrinSecurityKnownSecurityComponentVersion3);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrinSecurityKnownSecurityComponentVersion4);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrinSecurityKnownSecurityComponentVersion5);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrinSecurityKnownSecurityComponentVersion6);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrinSecurityKnownSecurityComponentVersion7);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrinSecurityKnownSecurityComponentVersion8);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrinSecurityKnownSecurityComponentVersion9);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrinSecurityKnownSecurityComponentVersion10);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrin0SecurityKnownSecurityComponentVersion);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        _vrin1SecurityKnownSecurityComponentVersion);
    this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.add(
        new SecurityKnownSystemComponentVersionNext(_abstractSecurityLog,
            this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion
                .latestComponentVersion()));
  }


  private String _deeoamueeString(Transaction _tTransaction) throws Exception {

    String _strAn = null;

    SecurityKnownSecurityComponentVersion _clSecurityKnownSecurityComponentVersion =
        this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.latestComponentVersion();

    Set<String> _setUenmsString = SecurityKnownSecurityComponentVersion.geaneSet(
        SecurityKnownSecurityComponentVersion.USE_LBL, _tTransaction);
    this.darUserRepository.start();

    int _iAdon = this.darUserRepository.numberOfUsers();
    if (_iAdon > 1) {
      throw _clSecurityKnownSecurityComponentVersion.loadcteenInvalidArgumentsException(
          io.github.onograph.I18N.format(
              "io.github.onograph.server.security.systemgraph.DefaultSecuritySystemGraphComponent.loadcteenInvalidArgumentsException"));
    } else {
      if (_iAdon == 1) {
        _strAn = this.darUserRepository.getAllUsernames().iterator().next();
      }

      if (_strAn != null) {
        if (!_setUenmsString.contains(_strAn)) {
          throw _clSecurityKnownSecurityComponentVersion.loadcteenInvalidArgumentsException(
              io.github.onograph.I18N.format(
                  "io.github.onograph.server.security.systemgraph.DefaultSecuritySystemGraphComponent.loadcteenInvalidArgumentsException2",
                  _strAn));
        } else {
          return _strAn;
        }
      } else if (_setUenmsString.size() == 1) {
        return _setUenmsString.iterator().next();
      } else if (_setUenmsString.contains(io.github.onograph.TokenConstants.NEO4J)) {
        return io.github.onograph.TokenConstants.NEO4J;
      } else {
        throw _clSecurityKnownSecurityComponentVersion.loadcteenInvalidArgumentsException(
            io.github.onograph.I18N.format(
                "io.github.onograph.server.security.systemgraph.DefaultSecuritySystemGraphComponent.loadcteenInvalidArgumentsException3"));
      }
    }
  }


  private void _inaltsegpForTr(Transaction _tTransaction) throws Exception {

    SecurityKnownSecurityComponentVersion _ltsSecurityKnownSecurityComponentVersion =
        this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.latestComponentVersion();

    Map<String, Set<String>> _mapAmnss = new HashMap();
    _mapAmnss.put(io.github.onograph.TokenConstants.ADMIN,
        Set.of(this._deeoamueeString(_tTransaction)));
    _ltsSecurityKnownSecurityComponentVersion.inaplForTrLiMa(AuthoritiesConstants.listRoeString,
        _mapAmnss, _tTransaction);
    this.iscSystemInitFileProcessor.intleForTr(_tTransaction);
  }


  public void astutwhaoForTrPrElSe(ElementEntitlementDTO.GdbEntitlementType gdbEntitlementType,
      PrivilegeAction _privilegeAction, Segment _segment, Transaction _tTransaction)
      throws UnsupportedOperationException {

    SecurityKnownSecurityComponentVersion _securityKnownSecurityComponentVersion =
        this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.detectCurrentComponentVersion(
            _tTransaction);
    _securityKnownSecurityComponentVersion.astutwhaoForPrElSe(gdbEntitlementType, _privilegeAction,
        _segment);
  }

  @Override
  public String componentName() {
    return io.github.onograph.TokenConstants.SECURITY_PRIVILEGES;
  }

  @Override
  public Status detect(Transaction _tTransaction) {
    return this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.detectCurrentComponentVersion(
        _tTransaction).getStatus();
  }


  public SecurityKnownSecurityComponentVersion fetgpcptviSecurityKnownSecurityComponentVersion(
      ComponentVersion _componentVersion) {
    return this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.findComponentVersion(
        _componentVersion);
  }

  @Override
  public GdbAuthActions gebccodGdbAuthActions(boolean _isRs, boolean _isUs, String gdbName,
      Transaction _tTransaction) {

    SecurityKnownSecurityComponentVersion _securityKnownSecurityComponentVersion =
        this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.detectCurrentComponentVersion(
            _tTransaction);
    return _securityKnownSecurityComponentVersion.gebccodGdbAuthActions(_isRs, _isUs,
        gdbName.toLowerCase(), _tTransaction);
  }


  Set<ElementEntitlementDTO> gepigfrSet(Cache<String, Set<ElementEntitlementDTO>> _cachePcss,
      List<String> _listRlsString, Transaction _tTransaction) {

    SecurityKnownSecurityComponentVersion _securityKnownSecurityComponentVersion =
        this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.detectCurrentComponentVersion(
            _tTransaction);
    return !_securityKnownSecurityComponentVersion.runtimeSupported() ? Collections.emptySet()
        : _securityKnownSecurityComponentVersion.gepigfrSet(_cachePcss, _listRlsString,
            _tTransaction);
  }


  public Set<ElementEntitlementDTO> gepigfrrSet(String r, Transaction _tTransaction) {

    SecurityKnownSecurityComponentVersion _securityKnownSecurityComponentVersion =
        this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.detectCurrentComponentVersion(
            _tTransaction);
    return !_securityKnownSecurityComponentVersion.runtimeSupported() ? Collections.emptySet()
        : _securityKnownSecurityComponentVersion.cungplforeSet(r, _tTransaction);
  }

  @Override
  public void initializeSystemGraphConstraints(Transaction _tTransaction) {
    initializeSystemGraphConstraint(_tTransaction, SecurityKnownSecurityComponentVersion.RLX_LBL,
        io.github.onograph.TokenConstants.NAME);
  }

  @Override
  public void initializeSystemGraphModel(Transaction _tTransaction) throws Exception {

    SecurityKnownSecurityComponentVersion _ibcSecurityKnownSecurityComponentVersion =
        this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.detectCurrentComponentVersion(
            _tTransaction);

    this._inaltsegpForTr(_tTransaction);

    SecurityKnownSecurityComponentVersion _iacSecurityKnownSecurityComponentVersion =
        this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.detectCurrentComponentVersion(
            _tTransaction);


  }

  @Override
  public void upgradeToCurrent(GraphDatabaseService _sseGraphDatabaseService) throws Exception {
    SystemGraphComponent.executeWithFullAccess(_sseGraphDatabaseService, (tx) ->
    {

      SecurityKnownSecurityComponentVersion _vcSecurityKnownSecurityComponentVersion =
          this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.detectCurrentComponentVersion(
              tx);

      if (_vcSecurityKnownSecurityComponentVersion.version == -1) {

        this._inaltsegpForTr(tx);
      } else {
        if (!_vcSecurityKnownSecurityComponentVersion.migrationSupported()) {
          throw _vcSecurityKnownSecurityComponentVersion.unsupported();
        }

        this.knownSystemComponentVersionsVcskSecurityKnownSecurityComponentVersion.latestComponentVersion()
            .updsugForTr(_vcSecurityKnownSecurityComponentVersion.version, tx);
      }
    });
  }
}
