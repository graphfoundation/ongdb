package io.github.onograph.server.security.auth;

import io.github.onograph.server.security.systemgraph.AuthorizingRealmSystemImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.shiro.cache.CacheManager;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.kernel.api.security.FunctionSegment;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.ProcedureSegment;
import org.neo4j.internal.kernel.api.security.Segment;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;


public class AuthPrivilegeManager {


  public static final String EXTSRN = io.github.onograph.TokenConstants.EXECUTE_BOOSTED_FROM_CONFIG;


  private final AuthorizingRealmSystemImpl authorizingRealmSystemImpl;


  private final ElementEntitlementDTO ddcdElementEntitlementDTO;


  private final ElementEntitlementDTO dsdElementEntitlementDTO;


  private final ElementEntitlementDTO dsdElementEntitlementDTO2;


  private final Boolean isDcb;


  private final Boolean isSsb;


  private final Boolean isUr;


  private final Map<String, Set<ElementEntitlementDTO>> mapPtrss = new HashMap();


  private final String strAbtr;


  private final String strMbtr;


  private final ElementEntitlementDTO uedElementEntitlementDTO;

  public AuthPrivilegeManager(AuthorizingRealmSystemImpl authorizingRealmSystemImpl,
      Config _config) {
    this.authorizingRealmSystemImpl = authorizingRealmSystemImpl;
    this.isUr = _config.get(GraphDatabaseInternalSettings.block_upgrade_procedures);
    this.strAbtr = _config.get(GraphDatabaseSettings.default_allowed);
    this.strMbtr = _config.get(GraphDatabaseSettings.procedure_roles);
    this.isDcb = _config.get(GraphDatabaseInternalSettings.block_create_drop_database);
    this.isSsb = _config.get(GraphDatabaseInternalSettings.block_start_stop_database);

    try {
      this._inprupigfocf();

      ProcedureSegment _procedureSegment = new ProcedureSegment(
          io.github.onograph.TokenConstants.DBMS__UPGRADE_STAR_);
      this.uedElementEntitlementDTO =
          new ElementEntitlementDTO(
              ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.EXECUTE,
              new SecurityElement.Dbms(), _procedureSegment,
              ElementEntitlementDTO.EntitlementActionType.EAT_DENY);
      this.ddcdElementEntitlementDTO =
          new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
              PrivilegeAction.DATABASE_MANAGEMENT,
              new SecurityElement.Dbms(),
              Segment.ALL, ElementEntitlementDTO.EntitlementActionType.EAT_DENY);
      this.dsdElementEntitlementDTO =
          new ElementEntitlementDTO(
              ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
              PrivilegeAction.START_DATABASE, new SecurityElement.Dbms(), Segment.ALL,
              ElementEntitlementDTO.EntitlementActionType.EAT_DENY);
      this.dsdElementEntitlementDTO2 =
          new ElementEntitlementDTO(
              ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
              PrivilegeAction.STOP_DATABASE, new SecurityElement.Dbms(), Segment.ALL,
              ElementEntitlementDTO.EntitlementActionType.EAT_DENY);
    } catch (

        InvalidArgumentsException _invalidArgumentsException) {

      throw new IllegalStateException("*** Error:  3f2f2d6b-e2d0-456c-8578-bb225053ce3d",
          _invalidArgumentsException);
    }
  }


  private void _inprupigfocf() throws InvalidArgumentsException {

    String _strStigd = ";";

    String _strMpigd = ":";

    String _strRlsdl = ",";

    HashSet<ElementEntitlementDTO> _hashSetPbmaElementEntitlementDTO = new HashSet();

    String[] _strVarArray = this.strMbtr.split(";");

    int _iVar = _strVarArray.length;

    for (

        int _iVa = 0; _iVa < _iVar; ++_iVa) {

      String _strSrtp = _strVarArray[_iVa];

      String[] _strSpArray = _strSrtp.split(":");
      if (_strSpArray.length == 2) {

        ProcedureSegment _spProcedureSegment = new ProcedureSegment(_strSpArray[0].trim());

        FunctionSegment _fsFunctionSegment = new FunctionSegment(_strSpArray[0].trim());

        ElementEntitlementDTO _ppElementEntitlementDTO =
            new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
                PrivilegeAction.EXECUTE_BOOSTED,
                new SecurityElement.Dbms(),
                _spProcedureSegment, ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

        ElementEntitlementDTO _pfElementEntitlementDTO =
            new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
                PrivilegeAction.EXECUTE_BOOSTED,
                new SecurityElement.Dbms(),
                _fsFunctionSegment, ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);
        _hashSetPbmaElementEntitlementDTO.add(_ppElementEntitlementDTO);
        _hashSetPbmaElementEntitlementDTO.add(_pfElementEntitlementDTO);

        String[] _strVr4Array = _strSpArray[1].split(",");

        int _iVr5 = _strVr4Array.length;

        for (

            int _iVr6 = 0; _iVr6 < _iVr5; ++_iVr6) {

          String r = _strVr4Array[_iVr6];

          Set<ElementEntitlementDTO> _setPiieeElementEntitlementDTO = this.mapPtrss.computeIfAbsent(
              r.trim(), (x) ->
              {
                return new HashSet();
              });
          _setPiieeElementEntitlementDTO.add(_ppElementEntitlementDTO);
          _setPiieeElementEntitlementDTO.add(_pfElementEntitlementDTO);
        }
      }
    }

    if (!this.strAbtr.isBlank()) {

      Set<ElementEntitlementDTO> _setSpElementEntitlementDTO = this.mapPtrss.computeIfAbsent(
          this.strAbtr, (x) ->
          {
            return new HashSet();
          });
      _setSpElementEntitlementDTO.add(
          new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
              PrivilegeAction.EXECUTE_BOOSTED,
              new SecurityElement.Dbms(),
              ProcedureSegment.ALL, ElementEntitlementDTO.EntitlementActionType.EAT_GRANT));
      _setSpElementEntitlementDTO.add(
          new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
              PrivilegeAction.EXECUTE_BOOSTED,
              new SecurityElement.Dbms(),
              FunctionSegment.ALL, ElementEntitlementDTO.EntitlementActionType.EAT_GRANT));
      _hashSetPbmaElementEntitlementDTO.removeAll(_setSpElementEntitlementDTO);

      Iterator _iterator = _hashSetPbmaElementEntitlementDTO.iterator();

      while (_iterator.hasNext()) {

        ElementEntitlementDTO _piieeElementEntitlementDTO = (ElementEntitlementDTO) _iterator.next();
        _setSpElementEntitlementDTO.add(
            new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
                PrivilegeAction.EXECUTE_BOOSTED,
                new SecurityElement.Dbms(),
                _piieeElementEntitlementDTO.getSegment(),
                ElementEntitlementDTO.EntitlementActionType.EAT_DENY));
      }
    }
  }


  void clcfrl() {
    this.authorizingRealmSystemImpl.clcfrl();
  }


  List<Map<String, String>> gepiggatgcfList() {

    ArrayList<Map<String, String>> _arrayListRslMap = new ArrayList();

    Iterator _iterator = this.mapPtrss.entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<String, Set<ElementEntitlementDTO>> _entryEtyss = (Entry) _iterator.next();

      String r = _entryEtyss.getKey();

      ElementEntitlementDTO _piieeElementEntitlementDTO;

      String _strSs;
      for (

          Iterator _iterator2 = ((Set) _entryEtyss.getValue()).iterator(); _iterator2.hasNext();
          _arrayListRslMap.add(
              Map.of(io.github.onograph.TokenConstants.ROLE, r,
                  io.github.onograph.TokenConstants.GRAPH2, "*",
                  io.github.onograph.TokenConstants.SEGMENT, _strSs,
                  io.github.onograph.TokenConstants.RESOURCE,
                  io.github.onograph.TokenConstants.DATABASE,
                  io.github.onograph.TokenConstants.ACTION,
                  io.github.onograph.TokenConstants.EXECUTE_BOOSTED_FROM_CONFIG,
                  io.github.onograph.TokenConstants.ACCESS,
                  _piieeElementEntitlementDTO.getTpEntitlementActionType().relationshipTypeName))) {
        _piieeElementEntitlementDTO = (ElementEntitlementDTO) _iterator2.next();
        if (_piieeElementEntitlementDTO.getSegment() instanceof ProcedureSegment) {

          ProcedureSegment _procedureSegment = (ProcedureSegment) _piieeElementEntitlementDTO.getSegment();
          _strSs = String.format("PROCEDURE(%s)",
              _procedureSegment.equals(ProcedureSegment.ALL) ? "*"
                  : _procedureSegment.getProcedure());
        } else {

          FunctionSegment _functionSegment = (FunctionSegment) _piieeElementEntitlementDTO.getSegment();
          _strSs = String.format("FUNCTION(%s)",
              _functionSegment.equals(FunctionSegment.ALL) ? "*" : _functionSegment.getFunction());
        }
      }
    }

    return _arrayListRslMap;
  }


  HashSet<ElementEntitlementDTO> gepvesHashSet(Set<String> _setRlsString) {

    HashSet<ElementEntitlementDTO> _hashSetPiieeElementEntitlementDTO = this.authorizingRealmSystemImpl.gepigfrrsHashSet(
        _setRlsString);

    Iterator _iterator = _setRlsString.iterator();

    while (_iterator.hasNext()) {

      String r = (String) _iterator.next();
      _hashSetPiieeElementEntitlementDTO.addAll(
          this.mapPtrss.getOrDefault(r, Collections.emptySet()));
      if (r.equals(io.github.onograph.TokenConstants.PUBLIC)) {
        if (this.isUr) {
          _hashSetPiieeElementEntitlementDTO.add(this.uedElementEntitlementDTO);
        }

        if (this.isDcb) {
          _hashSetPiieeElementEntitlementDTO.add(this.ddcdElementEntitlementDTO);
        }

        if (this.isSsb) {
          _hashSetPiieeElementEntitlementDTO.add(this.dsdElementEntitlementDTO);
          _hashSetPiieeElementEntitlementDTO.add(this.dsdElementEntitlementDTO2);
        }
      }
    }

    return _hashSetPiieeElementEntitlementDTO;
  }


  void inanscmeForCa(CacheManager _cacheManager) {
    this.authorizingRealmSystemImpl.init();
    this.authorizingRealmSystemImpl.setCacheManager(_cacheManager);
    this.authorizingRealmSystemImpl.setup();
  }


  public void str() {
    this.authorizingRealmSystemImpl.start();
  }
}
