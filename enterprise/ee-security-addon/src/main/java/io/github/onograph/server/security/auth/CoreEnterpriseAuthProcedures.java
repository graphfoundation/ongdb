package io.github.onograph.server.security.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.procedure.Context;


public class CoreEnterpriseAuthProcedures {


  @Context
  public SecurityContext securityContext;


  @Context
  public Transaction transaction;


  protected UserAuthProcReturnInfo usrefsbCoreEnterpriseAuthProceduresUserAuthProcReturnInfo() {

    String uname = this.securityContext.subject().username();

    boolean _isRc = this.securityContext.subject().getAuthenticationResult()
        .equals(AuthenticationResult.PASSWORD_CHANGE_REQUIRED);
    return new UserAuthProcReturnInfo(uname, this.securityContext.roles(), _isRc, false);
  }


  public static class GenericReturnInfo {


    public final String str;

    GenericReturnInfo(String str) {
      this.str = str;
    }
  }


  public static class RoleNameUsersWrapper {


    public final List<String> listUsrString;


    public final String roleName;

    RoleNameUsersWrapper(String roleName, Set<String> _setUesString) {
      this.roleName = roleName;
      this.listUsrString = new ArrayList();
      this.listUsrString.addAll(_setUesString);
    }
  }


  public static class UserAuthProcReturnInfo {


    public final List<String> listFlgString;


    public final List<String> listRoeString;


    public final String uname;

    UserAuthProcReturnInfo(String uname, Collection<String> _collectionRlsString, boolean _isRc,
        boolean _isSsedd) {
      this.uname = uname;
      this.listRoeString = new ArrayList();
      this.listRoeString.addAll(_collectionRlsString);
      this.listFlgString = new ArrayList();
      if (_isRc) {
        this.listFlgString.add(io.github.onograph.TokenConstants.PASSWORD_CHANGE_REQUIRED2);
      }

      if (_isSsedd) {
        this.listFlgString.add(io.github.onograph.TokenConstants.IS_SUSPENDED);
      }
    }
  }
}
