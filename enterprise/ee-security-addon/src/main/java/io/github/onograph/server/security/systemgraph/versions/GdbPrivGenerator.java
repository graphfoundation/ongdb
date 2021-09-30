package io.github.onograph.server.security.systemgraph.versions;

import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.auth.SecurityElement;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;
import org.neo4j.graphdb.Node;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.internal.kernel.api.security.FunctionSegment;
import org.neo4j.internal.kernel.api.security.LabelSegment;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.ProcedureSegment;
import org.neo4j.internal.kernel.api.security.RelTypeSegment;
import org.neo4j.internal.kernel.api.security.Segment;
import org.neo4j.internal.kernel.api.security.UserSegment;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;


public class GdbPrivGenerator {

  final ElementEntitlementDTO.EntitlementActionType prveteEntitlementActionType;


  ElementEntitlementDTO.GdbEntitlementType gdbEntitlementType;


  String gdbName;


  SecurityElement securityElement;


  Segment segment;


  Set<PrivilegeAction> setAcisPrivilegeAction;


  public GdbPrivGenerator(String _strAto,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {
    this((a) ->
    {
      return Collections.singleton(PrivilegeAction.valueOf(a));
    }, _strAto, _tpEntitlementActionType);
  }


  GdbPrivGenerator(Function<String, Set<PrivilegeAction>> _functionMass, String _strAto,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {
    this.gdbName = "";
    this.prveteEntitlementActionType = _tpEntitlementActionType;
    this.setAcisPrivilegeAction = _functionMass.apply(_strAto.toUpperCase());
  }


  private static SecurityElement.ElementType _asreuetpSecurityElementElementType(String _strSt)
      throws InvalidArgumentsException {
    try {
      return SecurityElement.ElementType.valueOf(_strSt.toUpperCase());
    } catch (

        IllegalArgumentException _illegalArgumentException) {

      throw new InvalidArgumentsException("*** Error: 0436086b-433c-4c8a-aedd-09e3cb47c969");
    }
  }


  Set<ElementEntitlementDTO> bulSet() throws InvalidArgumentsException {

    Set<ElementEntitlementDTO> _setPiieeElementEntitlementDTO = new HashSet();

    Iterator _iterator = this.setAcisPrivilegeAction.iterator();

    while (_iterator.hasNext()) {

      PrivilegeAction _privilegeAction = (PrivilegeAction) _iterator.next();
      if (this.gdbEntitlementType != null) {
        _setPiieeElementEntitlementDTO.add(
            new ElementEntitlementDTO(this.gdbEntitlementType, _privilegeAction,
                this.securityElement, this.segment,
                this.prveteEntitlementActionType));
      } else {
        _setPiieeElementEntitlementDTO.add(
            new ElementEntitlementDTO(this.gdbName, _privilegeAction,
                this.prveteEntitlementActionType, this.securityElement, this.segment));
      }
    }

    return _setPiieeElementEntitlementDTO;
  }


  GdbPrivGenerator foaldbGdbPrivGenerator() {
    this.gdbEntitlementType = ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING;
    return this;
  }


  GdbPrivGenerator fodasGdbPrivGenerator(String _strDtbs) {
    this.gdbName = _strDtbs;
    return this;
  }


  GdbPrivGenerator fodfdaGdbPrivGenerator() {
    this.gdbEntitlementType = ElementEntitlementDTO.GdbEntitlementType.EAT_GENERAL;
    return this;
  }


  GdbPrivGenerator onreueGdbPrivGenerator(Node _rsucNode) throws InvalidArgumentsException {

    String tNme = _rsucNode.getProperty(io.github.onograph.TokenConstants.TYPE).toString();

    SecurityElement.ElementType eType = _asreuetpSecurityElementElementType(tNme);
    switch (eType) {
      case DATABASE:
        this.securityElement = new SecurityElement.Dbms();
        break;
      case GRAPH:
        this.securityElement = new SecurityElement.Graph();
        break;
      case PROPERTY:

        String pk = _rsucNode.getProperty(io.github.onograph.TokenConstants.ARG1).toString();
        this.securityElement = new SecurityElement.Property(pk);
        break;
      case ALL_PROPERTIES:
        this.securityElement = new SecurityElement.Properties();
        break;
      case LABEL:

        String lbl = _rsucNode.getProperty(io.github.onograph.TokenConstants.ARG1).toString();
        this.securityElement = new SecurityElement.Label(lbl);
        break;
      case ALL_LABELS:
        this.securityElement = new SecurityElement.Labels();
        break;
      default:

        throw new IllegalArgumentException("*** Error: 53d683ff-afce-439f-b3bb-4f1567236ea9");
    }

    return this;
  }


  GdbPrivGenerator qaiirNode(Node _qaiirNode) {

    org.neo4j.graphdb.Label _tqLabel;
    try {
      _tqLabel = Iterables.single(_qaiirNode.getLabels());
    } catch (

        NoSuchElementException _noSuchElementException) {

      throw new IllegalStateException("*** Error: 30861bff-77c7-49a5-a255-0f8684d6f60b");
    }

    String _strVa = _tqLabel.name();

    byte _byte1 = -1;
    switch (_strVa.hashCode()) {
      case -1940868337:
        if (_strVa.equals(io.github.onograph.TokenConstants.RELATIONSHIP_QUALIFIER_ALL)) {
          _byte1 = 4;
        }
        break;
      case -1930519157:
        if (_strVa.equals(io.github.onograph.TokenConstants.LABEL_QUALIFIER_ALL)) {
          _byte1 = 2;
        }
        break;
      case -1894398153:
        if (_strVa.equals(io.github.onograph.TokenConstants.PROCEDURE_QUALIFIER)) {
          _byte1 = 7;
        }
        break;
      case -1773239262:
        if (_strVa.equals(io.github.onograph.TokenConstants.USER_QUALIFIER_ALL)) {
          _byte1 = 6;
        }
        break;
      case -619202225:
        if (_strVa.equals(io.github.onograph.TokenConstants.DATABASE_QUALIFIER)) {
          _byte1 = 0;
        }
        break;
      case -145040662:
        if (_strVa.equals(io.github.onograph.TokenConstants.PROCEDURE_QUALIFIER_ALL)) {
          _byte1 = 8;
        }
        break;
      case 170766226:
        if (_strVa.equals(io.github.onograph.TokenConstants.FUNCTION_QUALIFIER)) {
          _byte1 = 9;
        }
        break;
      case 608332082:
        if (_strVa.equals(io.github.onograph.TokenConstants.RELATIONSHIP_QUALIFIER)) {
          _byte1 = 3;
        }
        break;
      case 1506078774:
        if (_strVa.equals(io.github.onograph.TokenConstants.LABEL_QUALIFIER)) {
          _byte1 = 1;
        }
        break;
      case 1515022591:
        if (_strVa.equals(io.github.onograph.TokenConstants.USER_QUALIFIER)) {
          _byte1 = 5;
        }
        break;
      case 2055426223:
        if (_strVa.equals(io.github.onograph.TokenConstants.FUNCTION_QUALIFIER_ALL)) {
          _byte1 = 10;
        }
    }

    switch (_byte1) {
      case 0:
        this.segment = Segment.ALL;
        break;
      case 1:

        String lbl = _qaiirNode.getProperty(io.github.onograph.TokenConstants.LABEL2).toString();
        this.segment = new LabelSegment(lbl);
        break;
      case 2:
        this.segment = LabelSegment.ALL;
        break;
      case 3:

        String relationshipTypeName = _qaiirNode.getProperty(
            io.github.onograph.TokenConstants.LABEL2).toString();
        this.segment = new RelTypeSegment(relationshipTypeName);
        break;
      case 4:
        this.segment = RelTypeSegment.ALL;
        break;
      case 5:

        String uname = _qaiirNode.getProperty(io.github.onograph.TokenConstants.LABEL2).toString();
        this.segment = new UserSegment(uname);
        break;
      case 6:
        this.segment = UserSegment.ALL;
        break;
      case 7:

        String _strQp = _qaiirNode.getProperty(io.github.onograph.TokenConstants.LABEL2).toString();
        this.segment = new ProcedureSegment(_strQp);
        break;
      case 8:
        this.segment = ProcedureSegment.ALL;
        break;
      case 9:

        String _strQf = _qaiirNode.getProperty(io.github.onograph.TokenConstants.LABEL2).toString();
        this.segment = new FunctionSegment(_strQf);
        break;
      case 10:
        this.segment = FunctionSegment.ALL;
        break;
      default:

        throw new IllegalArgumentException("*** Error: 9b519c45-31da-4621-9139-9efeb2119fa6");
    }

    return this;
  }
}
