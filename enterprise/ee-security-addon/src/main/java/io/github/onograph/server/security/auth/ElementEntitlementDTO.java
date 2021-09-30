package io.github.onograph.server.security.auth;

import java.util.List;
import org.neo4j.internal.kernel.api.security.FunctionSegment;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.ProcedureSegment;
import org.neo4j.internal.kernel.api.security.Segment;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;


public class ElementEntitlementDTO {


  private final boolean defGdbName;


  private final String gdbName;


  private final boolean isDa;


  private final PrivilegeAction privilegeAction;


  private final SecurityElement securityElement;


  private final Segment segment;


  private final EntitlementActionType tpEntitlementActionType;


  public ElementEntitlementDTO(GdbEntitlementType gdbEntitlementType,
      PrivilegeAction _privilegeAction, SecurityElement securityElement, Segment _segment,
      EntitlementActionType _tpEntitlementActionType) throws InvalidArgumentsException {
    this.tpEntitlementActionType = _tpEntitlementActionType;
    this.privilegeAction = _privilegeAction;
    this.securityElement = securityElement;
    this.segment = _segment;
    this.gdbName = "";
    if (gdbEntitlementType.equals(GdbEntitlementType.EAT_EVERYTHING)) {
      this.isDa = true;
      this.defGdbName = false;
    } else {
      this.isDa = false;
      this.defGdbName = true;
    }

    securityElement.astvdcioForPr(_privilegeAction);
  }


  public ElementEntitlementDTO(String gdbName, PrivilegeAction _privilegeAction,
      EntitlementActionType _ptEntitlementActionType, SecurityElement securityElement,
      Segment _segment)
      throws InvalidArgumentsException {
    this.tpEntitlementActionType = _ptEntitlementActionType;
    this.privilegeAction = _privilegeAction;
    this.securityElement = securityElement;
    this.segment = _segment;
    this.gdbName = gdbName;
    this.isDa = false;
    this.defGdbName = false;
    securityElement.astvdcioForPr(_privilegeAction);
  }


  public List<String> _ascoafList(boolean _isRa, boolean _isWrp, String _strKr)
      throws RuntimeException {
    return this._ascoafList(false, _isWrp, _isRa, "", _strKr);
  }


  public List<String> _ascoafList(boolean _isRa, String r, String _strPd) throws RuntimeException {
    return this._ascoafList(true, false, _isRa, _strPd, r);
  }


  private List<String> _ascoafList(boolean _isPdw, boolean _isPrw, boolean _isRa, String _strKd,
      String _strKr)
      throws RuntimeException {

    String _strPeoii =
        _isRa ? io.github.onograph.TokenConstants.FROM : io.github.onograph.TokenConstants.TO;

    String _strRo = _isRa ? io.github.onograph.I18N.format(
        "io.github.onograph.server.security.auth.ElementEntitlementDTO.var") : "";

    String r = _isPrw ? "$" + _strKr : "`" + _strKr + "`";
    switch (this.privilegeAction) {
      case ACCESS:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case TRAVERSE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format2"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.GRAPH, _strKd),
                this.segment.toString(),
                _strPeoii, r));
      case READ:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format3"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this.securityElement.toString(),
                this._fospString(_isPdw, io.github.onograph.TokenConstants.GRAPH, _strKd),
                this.segment.toString(),
                _strPeoii, r));
      case MATCH:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format4"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this.securityElement.toString(),
                this._fospString(_isPdw, io.github.onograph.TokenConstants.GRAPH, _strKd),
                this.segment.toString(),
                _strPeoii, r));
      case MERGE:
        if (this.tpEntitlementActionType.upperForNmePrefix.equals(
            EntitlementActionType.EAT_GRANT.upperForNmePrefix)) {
          return List.of(
              String.format(io.github.onograph.I18N.format(
                      "io.github.onograph.server.security.auth.ElementEntitlementDTO.format5"),
                  _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                  this.securityElement.toString(),
                  this._fospString(_isPdw, io.github.onograph.TokenConstants.GRAPH, _strKd),
                  this.segment.toString(),
                  _strPeoii, r));
        }

        return List.of();
      case WRITE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format6"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.GRAPH, _strKd),
                _strPeoii, r));
      case SET_LABEL:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format7"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this.securityElement.toString(),
                this._fospString(_isPdw, io.github.onograph.TokenConstants.GRAPH, _strKd),
                _strPeoii, r));
      case REMOVE_LABEL:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format8"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this.securityElement.toString(),
                this._fospString(_isPdw, io.github.onograph.TokenConstants.GRAPH, _strKd),
                _strPeoii, r));
      case CREATE_ELEMENT:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format9"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.GRAPH, _strKd),
                this.segment.toString(),
                _strPeoii, r));
      case DELETE_ELEMENT:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format10"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.GRAPH, _strKd),
                this.segment.toString(),
                _strPeoii, r));
      case SET_PROPERTY:
        return List
            .of(String.format(
                io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format11"),
                _strRo,
                this.tpEntitlementActionType.upperForNmePrefix, this.securityElement.toString(),
                this._fospString(_isPdw, io.github.onograph.TokenConstants.GRAPH, _strKd),
                this.segment.toString(), _strPeoii,
                r));
      case GRAPH_ACTIONS:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format12"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.GRAPH, _strKd),
                _strPeoii, r));
      case CREATE_LABEL:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format13"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case CREATE_RELTYPE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format14"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case CREATE_PROPERTYKEY:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format15"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case TOKEN:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format16"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case CREATE_INDEX:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format17"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case DROP_INDEX:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format18"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case SHOW_INDEX:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format19"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case INDEX:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format110"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case CREATE_CONSTRAINT:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format111"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case DROP_CONSTRAINT:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format112"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case SHOW_CONSTRAINT:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format113"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case CONSTRAINT:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format114"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case START_DATABASE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format115"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case STOP_DATABASE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format116"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case SHOW_TRANSACTION:
        return List
            .of(String.format(
                io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format117"),
                _strRo,
                this.tpEntitlementActionType.upperForNmePrefix, this.segment.toString(),
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case TERMINATE_TRANSACTION:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format118"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this.segment.toString(),
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case SHOW_CONNECTION:
        return List.of();
      case TERMINATE_CONNECTION:
        return List.of();
      case TRANSACTION_MANAGEMENT:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format119"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this.segment.toString(),
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case DATABASE_ACTIONS:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1110"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case CREATE_DATABASE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1111"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case DROP_DATABASE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1112"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case DATABASE_MANAGEMENT:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1113"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case SHOW_USER:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1114"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case CREATE_USER:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1115"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case RENAME_USER:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1116"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case SET_USER_STATUS:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1117"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case SET_PASSWORDS:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1118"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case SET_USER_HOME_DATABASE:
        return List
            .of(String.format(
                io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1119"),
                _strRo,
                this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case DROP_USER:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format11110"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case ALTER_USER:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format11111"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case USER_MANAGEMENT:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format11112"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case SHOW_ROLE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format11113"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case CREATE_ROLE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format11114"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case RENAME_ROLE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format11115"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case DROP_ROLE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format11116"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case ASSIGN_ROLE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format11117"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case REMOVE_ROLE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format11118"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case ROLE_MANAGEMENT:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format11119"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case SHOW_PRIVILEGE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format111110"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case ASSIGN_PRIVILEGE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format111111"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case REMOVE_PRIVILEGE:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format111112"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case PRIVILEGE_MANAGEMENT:
        return List
            .of(String.format(
                io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format111113"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case ADMIN:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format111114"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r),
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format111115"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r),
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format111116"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r),
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format111117"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this._fospString(_isPdw, io.github.onograph.TokenConstants.DATABASE3, _strKd),
                _strPeoii, r));
      case DBMS_ACTIONS:
        return List.of(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format111118"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, _strPeoii, r));
      case EXECUTE:
        if (this.segment instanceof ProcedureSegment) {
          return List.of(String.format(
              io.github.onograph.I18N.format(
                  "io.github.onograph.server.security.auth.ElementEntitlementDTO.format111119"),
              _strRo,
              this.tpEntitlementActionType.upperForNmePrefix, this.segment,
              _strPeoii, r));
        } else {
          if (this.segment instanceof FunctionSegment) {
            return List.of(String.format(
                io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1111110"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix, this.segment,
                _strPeoii, r));
          }

          throw new RuntimeException("*** Error: 4c54582d-f809-461c-b489-7c1ec1f050c3");
        }
      case EXECUTE_BOOSTED:
        if (this.segment instanceof ProcedureSegment) {
          return List.of(String.format(
              io.github.onograph.I18N.format(
                  "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1111111"),
              _strRo,
              this.tpEntitlementActionType.upperForNmePrefix,
              this.segment, _strPeoii, r));
        } else {
          if (this.segment instanceof FunctionSegment) {
            return List.of(String.format(
                io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1111112"),
                _strRo, this.tpEntitlementActionType.upperForNmePrefix,
                this.segment, _strPeoii, r));
          }

          throw new RuntimeException("*** Error: 289a54cf-8349-4e33-b6be-b244ba489b50");
        }
      case EXECUTE_ADMIN:
        return List.of(String.format(
            io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1111113"),
            _strRo,
            this.tpEntitlementActionType.upperForNmePrefix, _strPeoii,
            r));
      default:

        throw new RuntimeException("*** Error: 526c4416-fe49-45a5-b89e-48b106a77cf0");
    }
  }


  private String _fospString(boolean _isPdw, String _strKyod, String _strPrmtr) {
    if (_isPdw) {
      return io.github.onograph.I18N.format(
          "io.github.onograph.server.security.auth.ElementEntitlementDTO.fospString", _strKyod,
          _strPrmtr);
    } else if (this.isDa) {
      return io.github.onograph.I18N.format(
          "io.github.onograph.server.security.auth.ElementEntitlementDTO.fospString2", _strKyod);
    } else {
      return this.defGdbName ? io.github.onograph.I18N.format(
          "io.github.onograph.server.security.auth.ElementEntitlementDTO.fospString4",
          _strKyod)
          : io.github.onograph.I18N.format(
              "io.github.onograph.server.security.auth.ElementEntitlementDTO.fospString3",
              _strKyod, this.gdbName);
    }
  }

  @Override
  public boolean equals(Object _obO) {
    if (!(_obO instanceof ElementEntitlementDTO)) {
      return false;
    } else {

      ElementEntitlementDTO _ohrElementEntitlementDTO = (ElementEntitlementDTO) _obO;
      return _ohrElementEntitlementDTO.privilegeAction.equals(this.privilegeAction) &&
          _ohrElementEntitlementDTO.securityElement.equals(this.securityElement)
          && _ohrElementEntitlementDTO.segment.equals(this.segment) &&
          _ohrElementEntitlementDTO.gdbName.equals(this.gdbName) &&
          _ohrElementEntitlementDTO.tpEntitlementActionType == this.tpEntitlementActionType
          && _ohrElementEntitlementDTO.isDa == this.isDa;
    }
  }


  public boolean getDefGdbName() {
    return this.defGdbName;
  }


  public String getGdbName() {
    return this.gdbName;
  }


  public boolean getIsDa() {
    return this.isDa;
  }


  PrivilegeAction getPrivilegeAction() {
    return this.privilegeAction;
  }


  SecurityElement getSecurityElement() {
    return this.securityElement;
  }


  Segment getSegment() {
    return this.segment;
  }


  EntitlementActionType getTpEntitlementActionType() {
    return this.tpEntitlementActionType;
  }

  @Override
  public int hashCode() {
    return this.privilegeAction.hashCode() + 31 * this.securityElement.hashCode();
  }


  boolean isAplstForSt(String _strDtbs) {
    if (_strDtbs.equals(io.github.onograph.TokenConstants.SYSTEM)
        && PrivilegeAction.ADMIN.satisfies(this.privilegeAction)) {
      return true;
    } else {
      return this.isDa || _strDtbs.equals(this.gdbName)
          || PrivilegeAction.TRANSACTION_MANAGEMENT.satisfies(this.privilegeAction);
    }
  }


  public boolean isDspi() {
    return PrivilegeAction.DBMS_ACTIONS.satisfies(this.privilegeAction)
        || PrivilegeAction.EXECUTE.satisfies(this.privilegeAction) ||
        PrivilegeAction.EXECUTE_BOOSTED.satisfies(this.privilegeAction)
        || PrivilegeAction.ADMIN == this.privilegeAction;
  }

  @Override
  public String toString() {
    return String.format(io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.ElementEntitlementDTO.format1111114"),
        this.tpEntitlementActionType.upperForNmePrefix, this.getPrivilegeAction(),
        this.getSecurityElement(), this.getSegment());
  }


  public enum EntitlementActionType {


    EAT_GRANT(io.github.onograph.TokenConstants.GRANTED),

    EAT_DENY(io.github.onograph.TokenConstants.DENIED);


    public final String name = super.toString().toLowerCase();


    public final String relationshipTypeName;


    public final String upperForNmePrefix = super.toString().toUpperCase();

    EntitlementActionType(String relationshipTypeName) {
      this.relationshipTypeName = relationshipTypeName;
    }


    public static EntitlementActionType createUsingRelationshipType(String relationshipTypeName) {

      EntitlementActionType[] _entitlementActionTypeArray = values();

      int _iV = _entitlementActionTypeArray.length;

      for (

          int _iV2 = 0; _iV2 < _iV; ++_iV2) {

        EntitlementActionType entitlementActionType = _entitlementActionTypeArray[_iV2];
        if (entitlementActionType.relationshipTypeName.equals(relationshipTypeName)) {
          return entitlementActionType;
        }
      }

      throw new IllegalArgumentException("*** Error: 41ed527e-7e22-46dd-862e-d20f237c2b3c");
    }


    public boolean isDe() {
      return this == EAT_DENY;
    }


    public boolean isGrt() {
      return this == EAT_GRANT;
    }

    @Override
    public String toString() {
      return this.name;
    }
  }


  public enum GdbEntitlementType {


    EAT_EVERYTHING,

    EAT_GENERAL
  }
}
