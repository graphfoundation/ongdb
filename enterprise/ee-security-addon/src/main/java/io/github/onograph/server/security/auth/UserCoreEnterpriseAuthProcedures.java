package io.github.onograph.server.security.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Result.ResultRow;
import org.neo4j.graphdb.Result.ResultVisitor;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.kernel.api.exceptions.Status.Statement;
import org.neo4j.kernel.api.procedure.Sensitive;
import org.neo4j.kernel.api.procedure.SystemProcedure;
import org.neo4j.procedure.Admin;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Mode;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.Procedure;


public class UserCoreEnterpriseAuthProcedures extends CoreEnterpriseAuthProcedures {


  private static String _esepmString(String _strIpt) {
    return String.format("`%s`", _strIpt == null ? "" : _strIpt);
  }


  private static HashSet<String> _gesHashSet(Object _obOr) throws ProcedureException {

    HashSet<String> _hashSetRlsString = new HashSet();
    if (!(_obOr instanceof Collection)) {

      throw new ProcedureException(null, "*** Error:  c21e0a8d-dd80-459f-b91e-1e41bed4733d");
    } else {

      Iterator _iterator = ((Collection) _obOr).iterator();

      while (_iterator.hasNext()) {

        Object _obOr2 = _iterator.next();
        if (!(_obOr2 instanceof String)) {

          throw new ProcedureException(null, "*** Error:  d04117e7-45be-44a8-a232-9c36300abc3d");
        }

        _hashSetRlsString.add((String) _obOr2);
      }

      return _hashSetRlsString;
    }
  }


  private static void _trlexiForExSt(Exception _exception, String _strNp)
      throws ProcedureException {

    Status stat = Status.statusCodeOf(_exception);
    if (stat != null && stat.equals(Statement.NotSystemDatabaseError)) {

      throw new ProcedureException(
          org.neo4j.kernel.api.exceptions.Status.Procedure.ProcedureCallFailed, _exception,
          "*** Error: b46bd573-aad4-4650-8dde-48c7b7ebe089");
    } else {
      throw new ProcedureException(
          org.neo4j.kernel.api.exceptions.Status.Procedure.ProcedureCallFailed, _exception,
          _exception.getMessage());
    }
  }


  private boolean _isSeForSt(String uname) {
    return this.securityContext.subject().hasUsername(uname);
  }


  private void _russcodForStSt(String _strQey, String _strNp)
      throws ProcedureException {
    try {

      Result _eeueResult = this.transaction.execute(_strQey);
      _eeueResult.accept((row) ->
      {
        return true;
      });
    } catch (

        Exception _exception) {
      _trlexiForExSt(_exception, _strNp);
    }
  }


  private void _russcodwvoForStMaStRe(String _strQey, Map<String, Object> _mapPrmtrso,
      String _strNp, ResultVisitor<RuntimeException> _resultVisitorVstrRuntimeException)
      throws ProcedureException {
    try {

      Result _eeueResult = this.transaction.execute(_strQey, _mapPrmtrso);
      _eeueResult.accept(_resultVisitorVstrRuntimeException);
    } catch (

        Exception _exception) {
      _trlexiForExSt(_exception, _strNp);
    }
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY6)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME6,
      mode = Mode.WRITE,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY5
  )
  public void acitusForSt(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__UNAME) String uname,
      @Name(value = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME___IS_CPR__VALUE, defaultValue = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME___IS_CPR__DEFAULT_VALUE2) boolean _isCpr)
      throws ProcedureException {

    String _strQey =
        String.format(
            io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format11"),
            _esepmString(uname),
            _isCpr ? io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format12")
                : "");
    this._russcodForStSt(_strQey, io.github.onograph.TokenConstants.DBMS__SECURITY__ACTIVATE_USER);
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY2)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME2,
      mode = Mode.WRITE,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY2
  )
  public void adreturForStSt(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__ROLE) String role,
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__UNAME) String uname)
      throws ProcedureException {

    String _strQey = String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format7"),
        _esepmString(role), _esepmString(uname));
    this._russcodForStSt(_strQey,
        io.github.onograph.TokenConstants.DBMS__SECURITY__ADD_ROLE_TO_USER);
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__NAME,
      mode = Mode.WRITE,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__DEPRECATED_BY
  )
  public void cheupoForStSt(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__UNAME) String uname,
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME___STR_PN) @Sensitive String _strPn,
      @Name(value = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME___IS_CPR__VALUE, defaultValue = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME___IS_CPR__DEFAULT_VALUE2) boolean _isCpr)
      throws ProcedureException {

    String _strQey =
        String.format(
            io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format4"),
            _esepmString(uname), _strPn == null ? "" : _strPn,
            _isCpr ? io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format6")
                : io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format5"));
    this._russcodForStSt(_strQey,
        io.github.onograph.TokenConstants.DBMS__SECURITY__CHANGE_USER_PASSWORD);
  }


  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME,
      mode = Mode.WRITE,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY
  )
  public void chnpsrForSt(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__SECRET) @Sensitive String secret,
      @Name(value = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME___IS_CPR__VALUE, defaultValue = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME___IS_CPR__DEFAULT_VALUE) boolean _isCpr)
      throws ProcedureException {

    throw new ProcedureException(Statement.FeatureDeprecationWarning,
        "*** Error:  881abc74-fd9a-4266-ad92-b830c953aa6e");
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_USE)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_USE__NAME,
      mode = Mode.WRITE,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_USE__DEPRECATED_BY
  )
  public void crareForSt(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__ROLE) String role)
      throws ProcedureException {

    String _strQey = String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format13"),
        _esepmString(role));
    this._russcodForStSt(_strQey, io.github.onograph.TokenConstants.DBMS__SECURITY__CREATE_ROLE);
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_IPT)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_IPT__NAME,
      mode = Mode.WRITE,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_IPT__DEPRECATED_BY
  )
  public void craurForStSt(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__UNAME) String uname,
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__SECRET) @Sensitive String secret,
      @Name(value = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME___IS_RPC__VALUE, defaultValue = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME___IS_RPC__DEFAULT_VALUE) boolean _isRpc)
      throws ProcedureException {

    String _strQey = String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format"),
        _esepmString(uname), secret == null ? "" : secret,
        _isRpc ? io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format3")
            : io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format2"));
    this._russcodForStSt(_strQey, io.github.onograph.TokenConstants.DBMS__SECURITY__CREATE_USER);
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY8)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME8,
      mode = Mode.WRITE,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY7
  )
  public void deereForSt(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__ROLE) String role)
      throws ProcedureException {

    String _strQey = String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format14"),
        _esepmString(role));
    this._russcodForStSt(_strQey, io.github.onograph.TokenConstants.DBMS__SECURITY__DELETE_ROLE);
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY4)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME4,
      mode = Mode.WRITE,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY4
  )
  public void deeurForSt(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__UNAME) String uname)
      throws ProcedureException {

    String _strQey = String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format9"),
        _esepmString(uname));
    this._russcodForStSt(_strQey, io.github.onograph.TokenConstants.DBMS__SECURITY__DELETE_USER);
  }


  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION__E)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__E__NAME,
      mode = Mode.READ,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__E__DEPRECATED_BY
  )
  public Stream<GenericReturnInfo> lirofourStream(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__UNAME) String uname)
      throws ProcedureException, InvalidArgumentsException {

    final AtomicBoolean _euAtomicBoolean = new AtomicBoolean(false);

    final HashSet<GenericReturnInfo> _hashSetRslGenericReturnInfo = new HashSet();

    String _strQey = io.github.onograph.I18N.format(
        "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.var");

    Map<String, Object> _mapPrmtrso = Map.of(io.github.onograph.TokenConstants.USERNAME, uname);

    ResultVisitor<RuntimeException> _resultVisitorVstrRuntimeException = new ResultVisitor<RuntimeException>() {
      @Override
      public boolean visit(ResultRow _resultRow) throws RuntimeException {
        _euAtomicBoolean.set(true);

        String r = _resultRow.getString(io.github.onograph.TokenConstants.ROLE);
        _hashSetRslGenericReturnInfo.add(new GenericReturnInfo(r));
        return true;
      }
    };
    this._russcodwvoForStMaStRe(_strQey, _mapPrmtrso,
        io.github.onograph.TokenConstants.DBMS__SECURITY__LIST_ROLES_FOR_USER,
        _resultVisitorVstrRuntimeException);
    if (!_euAtomicBoolean.get()) {

      throw new InvalidArgumentsException("*** Error: 5167ee48-57c6-45db-98f9-6e73f33af231");
    } else {
      return _hashSetRslGenericReturnInfo.stream();
    }
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___IS_SSEDD)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___IS_SSEDD__NAME,
      mode = Mode.READ,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___IS_SSEDD__DEPRECATED_BY
  )
  public Stream<RoleNameUsersWrapper> litrlStream() throws ProcedureException {

    final HashMap<String, Set<String>> _hashMapRslss = new HashMap();

    ResultVisitor<RuntimeException> _resultVisitorVstrRuntimeException = new ResultVisitor<RuntimeException>() {
      @Override
      public boolean visit(ResultRow _resultRow) throws RuntimeException {

        String r = _resultRow.getString(io.github.onograph.TokenConstants.ROLE);

        String _strUse = _resultRow.getString(io.github.onograph.TokenConstants.MEMBER);

        Set<String> _setUesString = _hashMapRslss.computeIfAbsent(r, (k) ->
        {
          return new HashSet();
        });
        if (_strUse != null) {
          _setUesString.add(_strUse);
        }

        return true;
      }
    };
    this._russcodwvoForStMaStRe(io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.russcodwvoForStMaStRe2"),
        Collections.emptyMap(),
        io.github.onograph.TokenConstants.DBMS__SECURITY__LIST_ROLES,
        _resultVisitorVstrRuntimeException);
    return _hashMapRslss.entrySet().stream().map((e) ->
    {
      return new RoleNameUsersWrapper(e.getKey(), e.getValue());
    });
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY7)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME7,
      mode = Mode.READ,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY6
  )
  public Stream<UserAuthProcReturnInfo> litueStream() throws ProcedureException {

    final ArrayList<UserAuthProcReturnInfo> _arrayListRslUserAuthProcReturnInfo = new ArrayList();

    ResultVisitor<RuntimeException> _resultVisitorVstrRuntimeException = new ResultVisitor<RuntimeException>() {
      @Override
      public boolean visit(ResultRow _resultRow) throws RuntimeException {

        String _strUse = _resultRow.getString(io.github.onograph.TokenConstants.USER);

        List<String> _listRlsString = (List) _resultRow.get(
            io.github.onograph.TokenConstants.ROLES);

        Boolean _isCr = _resultRow.getBoolean(
            io.github.onograph.TokenConstants.PASSWORD_CHANGE_REQUIRED);

        Boolean _isSsedd = _resultRow.getBoolean(io.github.onograph.TokenConstants.SUSPENDED);
        _arrayListRslUserAuthProcReturnInfo.add(
            new UserAuthProcReturnInfo(_strUse, _listRlsString, _isCr, _isSsedd));
        return true;
      }
    };
    this._russcodwvoForStMaStRe(io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.russcodwvoForStMaStRe"),
        Collections.emptyMap(),
        io.github.onograph.TokenConstants.DBMS__SECURITY__LIST_USERS,
        _resultVisitorVstrRuntimeException);
    return _arrayListRslUserAuthProcReturnInfo.isEmpty() ? Stream.of(
        this.usrefsbCoreEnterpriseAuthProceduresUserAuthProcReturnInfo())
        : _arrayListRslUserAuthProcReturnInfo.stream();
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION__R)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__R__NAME,
      mode = Mode.READ,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__R__DEPRECATED_BY
  )
  public Stream<GenericReturnInfo> liusforeStream(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__ROLE) String role)
      throws ProcedureException, InvalidArgumentsException {

    final AtomicBoolean _erAtomicBoolean = new AtomicBoolean(false);

    final HashSet<GenericReturnInfo> _hashSetRslGenericReturnInfo = new HashSet();

    String _strQey = io.github.onograph.I18N.format(
        "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.var2");

    Map<String, Object> _mapPrmtrso = Map.of(io.github.onograph.TokenConstants.ROLE_NAME, role);

    ResultVisitor<RuntimeException> _resultVisitorVstrRuntimeException = new ResultVisitor<RuntimeException>() {
      @Override
      public boolean visit(ResultRow _resultRow) throws RuntimeException {
        _erAtomicBoolean.set(true);

        String _strUse = _resultRow.getString(io.github.onograph.TokenConstants.MEMBER);
        if (_strUse != null) {
          _hashSetRslGenericReturnInfo.add(new GenericReturnInfo(_strUse));
        }

        return true;
      }
    };
    this._russcodwvoForStMaStRe(_strQey, _mapPrmtrso,
        io.github.onograph.TokenConstants.DBMS__SECURITY__LIST_USERS_FOR_ROLE,
        _resultVisitorVstrRuntimeException);
    if (!_erAtomicBoolean.get()) {

      throw new InvalidArgumentsException("*** Error: fafe642e-16d2-46b0-a124-26c613a029ef");
    } else {
      return _hashSetRslGenericReturnInfo.stream();
    }
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY3)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME3,
      mode = Mode.WRITE,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY3
  )
  public void reerfusForStSt(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__ROLE) String role,
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__UNAME) String uname)
      throws ProcedureException {

    String _strQey = String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format8"),
        _esepmString(role), _esepmString(uname));
    this._russcodForStSt(_strQey,
        io.github.onograph.TokenConstants.DBMS__SECURITY__REMOVE_ROLE_FROM_USER);
  }


  @Admin
  @SystemProcedure
  @Deprecated
  @Description(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION___STR_QEY5)
  @Procedure(
      name = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__NAME5,
      mode = Mode.WRITE,
      deprecatedBy = io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE___STR_QEY__DEPRECATED_BY5
  )
  public void supdueForSt(
      @Name(io.github.onograph.TokenConstants.USER_CORE_ENTERPRISE_AUTH_PROCEDURES___NAME__UNAME) String uname)
      throws ProcedureException {

    String _strQey = String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures.format10"),
        _esepmString(uname));
    this._russcodForStSt(_strQey, io.github.onograph.TokenConstants.DBMS__SECURITY__SUSPEND_USER);
  }
}
