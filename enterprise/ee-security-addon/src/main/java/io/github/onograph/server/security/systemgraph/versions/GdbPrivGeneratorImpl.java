package io.github.onograph.server.security.systemgraph.versions;

import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.auth.SecurityElement;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;


class GdbPrivGeneratorImpl extends GdbPrivGenerator {

  GdbPrivGeneratorImpl(String _strAto,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {
    super((a) ->
    {
      return a.equals(io.github.onograph.TokenConstants.SCHEMA2) ? Set.of(PrivilegeAction.INDEX,
          PrivilegeAction.CONSTRAINT)
          : Collections.singleton(PrivilegeAction.valueOf(a));
    }, _strAto, _tpEntitlementActionType);
  }

  @Override
  Set<ElementEntitlementDTO> bulSet() throws InvalidArgumentsException {

    Set<ElementEntitlementDTO> _setPiieeElementEntitlementDTO = new HashSet();

    Iterator _iterator = this.setAcisPrivilegeAction.iterator();

    while (_iterator.hasNext()) {

      PrivilegeAction _privilegeAction = (PrivilegeAction) _iterator.next();

      SecurityElement actualSecurityElement = this.securityElement;
      if (_privilegeAction == PrivilegeAction.WRITE) {
        actualSecurityElement = new SecurityElement.Graph();
      }

      if (this.gdbEntitlementType != null) {
        _setPiieeElementEntitlementDTO.add(
            new ElementEntitlementDTO(this.gdbEntitlementType, _privilegeAction,
                actualSecurityElement, this.segment,
                this.prveteEntitlementActionType));
      } else {
        _setPiieeElementEntitlementDTO.add(
            new ElementEntitlementDTO(this.gdbName, _privilegeAction,
                this.prveteEntitlementActionType, actualSecurityElement, this.segment));
      }
    }

    return _setPiieeElementEntitlementDTO;
  }
}
