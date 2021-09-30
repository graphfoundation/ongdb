package io.github.onograph.server.security.systemgraph.versions;

import io.github.onograph.cluster.raft.module.cuprot.current.core.GdbAuthActions;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.auth.RoleDTO;
import io.github.onograph.server.security.auth.RoleService;
import io.github.onograph.server.security.systemgraph.SecurityComponentVersion;
import io.github.onograph.server.security.systemgraph.SystemInitFileProcessor;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;
import org.neo4j.server.security.auth.ListSnapshot;


public class SecurityKnownSystemComponentVersionA35 extends SecurityKnownSecurityComponentVersion {


  private final SystemInitFileProcessor iscSystemInitFileProcessor;


  private final RoleService rrRoleService;


  public SecurityKnownSystemComponentVersionA35(AbstractSecurityLog _abstractSecurityLog,
      SystemInitFileProcessor _iscSystemInitFileProcessor, RoleService _rrRoleService) {
    super(_abstractSecurityLog, SecurityComponentVersion.BACK_COMPATIBLE_FOR_35);
    this.rrRoleService = _rrRoleService;
    this.iscSystemInitFileProcessor = _iscSystemInitFileProcessor;
  }


  private static boolean _isVaaueirForSeLi(List<RoleDTO> _listRlsRoleDTO,
      Set<String> _setUiuString) {

    Set<String> _setUirString = _listRlsRoleDTO.stream().flatMap((rr) ->
    {
      return rr.getMembers().stream();
    }).collect(Collectors.toSet());
    return _setUiuString.containsAll(_setUirString);
  }


  private void _domiareForTrRo(RoleService _rrRoleService, Transaction _tTransaction)
      throws Exception {

    ListSnapshot<RoleDTO> _listSnapshotRrRoleDTO = _rrRoleService.gespoListSnapshot();

    Iterator _iterator = _listSnapshotRrRoleDTO.values().iterator();

    while (_iterator.hasNext()) {

      RoleDTO _rrRoleDTO = (RoleDTO) _iterator.next();

      Node r = _tTransaction.createNode(RLX_LBL);
      r.setProperty(io.github.onograph.TokenConstants.NAME, _rrRoleDTO.getRoleName());

      Iterator _iterator2 = _rrRoleDTO.getMembers().iterator();

      while (_iterator2.hasNext()) {

        String uname = (String) _iterator2.next();

        Node _uNode = _tTransaction.findNode(USE_LBL, io.github.onograph.TokenConstants.NAME,
            uname);
        if (_uNode != null) {
          _uNode.createRelationshipTo(r, USE_TO_RLX);
        }
      }
    }

    String _strSr =
        _listSnapshotRrRoleDTO.values().size() == 1 ? io.github.onograph.TokenConstants.ROLE
            : io.github.onograph.TokenConstants.ROLES;


  }

  @Override
  public void astutwhaoForPrElSe(ElementEntitlementDTO.GdbEntitlementType gdbEntitlementType,
      PrivilegeAction _privilegeAction, Segment _segment)
      throws UnsupportedOperationException {
    throw this.unsupported();
  }

  @Override
  public boolean detected(Transaction _tTransaction) {
    if (!nodesWithLabelExist(_tTransaction, RLX_LBL) && this.isConnoivennForTr(_tTransaction)) {
      try {
        this.rrRoleService.start();
        return this.rrRoleService.nuboros() > 0;
      } catch (

          Exception _exception) {
        return false;
      }
    } else {
      return false;
    }
  }

  @Override
  public GdbAuthActions gebccodGdbAuthActions(boolean _isRs, boolean _isUs, String gdbName,
      Transaction _tTransaction) {
    throw this.unsupported();
  }

  @Override
  public void grdlpveForNoStNo(Node r, NodeGdbPrivFacade _spNodeGdbPrivFacade, String prName) {
    throw this.unsupported();
  }

  @Override
  public void seudlpveForTrNo(NodeGdbPrivFacade _spNodeGdbPrivFacade, Transaction _tTransaction) {
    throw this.unsupported();
  }

  @Override
  public void updsugForTr(int sourceVInt, Transaction _tTransaction) throws Exception {
    this.rrRoleService.start();

    if (this.rrRoleService.gerebneRoleDTO(io.github.onograph.TokenConstants.PUBLIC) != null) {
      throw this.loadcteenInvalidArgumentsException(io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersion_0_35Security.loadcteenInvalidArgumentsException"));
    } else {

      Set<String> _setUenmsString = geaneSet(USE_LBL, _tTransaction);
      if (!_isVaaueirForSeLi(this.rrRoleService.gespoListSnapshot().values(), _setUenmsString)) {
        throw this
            .loadcteenInvalidArgumentsException(io.github.onograph.I18N.format(
                "io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersion_0_35Security.loadcteenInvalidArgumentsException2"));
      } else {
        this._domiareForTrRo(this.rrRoleService, _tTransaction);
        this.iscSystemInitFileProcessor.intleForTr(_tTransaction);
      }
    }
  }
}
