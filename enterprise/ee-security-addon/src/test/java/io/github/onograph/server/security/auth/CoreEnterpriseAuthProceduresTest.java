package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.Test;

class CoreEnterpriseAuthProceduresTest {

  @Test
  void testGenericReturnInfoConstructor() {
    assertEquals("Str", (new CoreEnterpriseAuthProcedures.GenericReturnInfo("Str")).str);
  }

  @Test
  void testRoleNameUsersWrapperConstructor() {
    CoreEnterpriseAuthProcedures.RoleNameUsersWrapper actualRoleNameUsersWrapper = new CoreEnterpriseAuthProcedures.RoleNameUsersWrapper(
        "Role Name", new HashSet<String>());

    assertTrue(actualRoleNameUsersWrapper.listUsrString.isEmpty());
    assertEquals("Role Name", actualRoleNameUsersWrapper.roleName);
  }

  @Test
  void testUserAuthProcReturnInfoConstructor() {
    ArrayList<String> stringList = new ArrayList<String>();
    CoreEnterpriseAuthProcedures.UserAuthProcReturnInfo actualUserAuthProcReturnInfo = new CoreEnterpriseAuthProcedures.UserAuthProcReturnInfo(
        "Uname", stringList, true, true);

    List<String> stringList1 = actualUserAuthProcReturnInfo.listFlgString;
    assertEquals(2, stringList1.size());
    assertEquals("password_change_required", stringList1.get(0));
    assertEquals("is_suspended", stringList1.get(1));
    assertEquals("Uname", actualUserAuthProcReturnInfo.uname);
    List<String> stringList2 = actualUserAuthProcReturnInfo.listRoeString;
    assertEquals(stringList, stringList2);
    assertTrue(stringList2.isEmpty());
  }

  @Test
  void testUserAuthProcReturnInfoConstructor2() {
    ArrayList<String> stringList = new ArrayList<String>();
    CoreEnterpriseAuthProcedures.UserAuthProcReturnInfo actualUserAuthProcReturnInfo = new CoreEnterpriseAuthProcedures.UserAuthProcReturnInfo(
        "Uname", stringList, false, true);

    List<String> stringList1 = actualUserAuthProcReturnInfo.listFlgString;
    assertEquals(1, stringList1.size());
    assertEquals("is_suspended", stringList1.get(0));
    assertEquals("Uname", actualUserAuthProcReturnInfo.uname);
    List<String> stringList2 = actualUserAuthProcReturnInfo.listRoeString;
    assertEquals(stringList, stringList2);
    assertTrue(stringList2.isEmpty());
  }

  @Test
  void testUserAuthProcReturnInfoConstructor3() {
    ArrayList<String> stringList = new ArrayList<String>();
    CoreEnterpriseAuthProcedures.UserAuthProcReturnInfo actualUserAuthProcReturnInfo = new CoreEnterpriseAuthProcedures.UserAuthProcReturnInfo(
        "Uname", stringList, true, false);

    List<String> stringList1 = actualUserAuthProcReturnInfo.listFlgString;
    assertEquals(1, stringList1.size());
    assertEquals("password_change_required", stringList1.get(0));
    assertEquals("Uname", actualUserAuthProcReturnInfo.uname);
    List<String> stringList2 = actualUserAuthProcReturnInfo.listRoeString;
    assertEquals(stringList, stringList2);
    assertTrue(stringList2.isEmpty());
  }
}

