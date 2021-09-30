package io.github.onograph.server.security.auth;

import io.github.onograph.kernel.api.security.DefaultAuthManager;
import java.util.stream.Stream;
import org.neo4j.kernel.api.procedure.SystemProcedure;
import org.neo4j.procedure.Admin;
import org.neo4j.procedure.Context;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Mode;
import org.neo4j.procedure.Procedure;


public class EnterpriseSecurityCoreEnterpriseAuthProcedures extends CoreEnterpriseAuthProcedures {


  @Context
  public DefaultAuthManager defaultAuthManager;


  @Admin
  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.ENTERPRISE_SECURITY_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION2)
  @Procedure(
      name = io.github.onograph.TokenConstants.ENTERPRISE_SECURITY_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__NAME2,
      mode = Mode.DBMS
  )
  public void clantca() {
    this.defaultAuthManager.claauch();
  }


  @SystemProcedure
  @Description(io.github.onograph.TokenConstants.ENTERPRISE_SECURITY_CORE_ENTERPRISE_AUTH_PROCEDURES___DESCRIPTION)
  @Procedure(
      name = io.github.onograph.TokenConstants.ENTERPRISE_SECURITY_CORE_ENTERPRISE_AUTH_PROCEDURES___PROCEDURE__NAME,
      mode = Mode.DBMS
  )
  public Stream<UserAuthProcReturnInfo> shcutuStream() {
    return Stream.of(this.usrefsbCoreEnterpriseAuthProceduresUserAuthProcReturnInfo());
  }
}
