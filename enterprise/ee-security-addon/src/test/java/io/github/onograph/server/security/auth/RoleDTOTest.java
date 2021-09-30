package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.TreeSet;
import org.junit.jupiter.api.Test;

class RoleDTOTest {

  @Test
  void testConstructor() {
    TreeSet<String> stringSet = new TreeSet<String>();
    RoleDTO actualRoleDTO = new RoleDTO(stringSet, "Role Name");

    assertSame(stringSet, actualRoleDTO.getMembers());
    assertEquals("Role Name", actualRoleDTO.getRoleName());
  }

  @Test
  void testConstructor2() {
    RoleDTO actualRoleDTO = new RoleDTO("Role Name", "foo", "foo", "foo");

    assertEquals(1, actualRoleDTO.getMembers().size());
    assertEquals("Role Name", actualRoleDTO.getRoleName());
  }

  @Test
  void testRoleDTOFactoryConstructor2() {

    new RoleDTO.RoleDTOFactory(new RoleDTO("Role Name", "foo", "foo", "foo"));
  }

  @Test
  void testRoleDTOFactoryConstructor3() {

    new RoleDTO.RoleDTOFactory(new RoleDTO("42", "Members", "foo", "foo"));
  }

  @Test
  void testCopyThis() {

    (new RoleDTO("Role Name", "foo", "foo", "foo")).copyThis();
  }

  @Test
  void testEquals() {
    assertFalse((new RoleDTO("Role Name", "foo", "foo", "foo")).equals(null));
    assertFalse(
        (new RoleDTO("Role Name", "foo", "foo", "foo")).equals("Different type to RoleDTO"));
  }

  @Test
  void testEquals2() {
    RoleDTO roleDTO = new RoleDTO("Role Name", "foo", "foo", "foo");
    assertTrue(roleDTO.equals(roleDTO));
    int expectedHashCodeResult = roleDTO.hashCode();
    assertEquals(expectedHashCodeResult, roleDTO.hashCode());
  }

  @Test
  void testEquals3() {
    RoleDTO roleDTO = new RoleDTO("Role Name", "foo", "foo", "foo");
    RoleDTO roleDTO1 = new RoleDTO("Role Name", "foo", "foo", "foo");

    assertTrue(roleDTO.equals(roleDTO1));
    int expectedHashCodeResult = roleDTO.hashCode();
    assertEquals(expectedHashCodeResult, roleDTO1.hashCode());
  }

  @Test
  void testEquals4() {
    RoleDTO roleDTO = new RoleDTO((String) null, "foo", "foo", "foo");
    assertFalse(roleDTO.equals(new RoleDTO("Role Name", "foo", "foo", "foo")));
  }

  @Test
  void testEquals5() {
    RoleDTO roleDTO = new RoleDTO("42", "foo", "foo", "foo");
    assertFalse(roleDTO.equals(new RoleDTO("Role Name", "foo", "foo", "foo")));
  }

  @Test
  void testEquals6() {
    RoleDTO roleDTO = new RoleDTO((String) null, "foo", "foo", "foo");
    RoleDTO roleDTO1 = new RoleDTO((String) null, "foo", "foo", "foo");

    assertTrue(roleDTO.equals(roleDTO1));
    int expectedHashCodeResult = roleDTO.hashCode();
    assertEquals(expectedHashCodeResult, roleDTO1.hashCode());
  }

  @Test
  void testRoleDTOFactoryConstructor() {

    RoleDTO.RoleDTOFactory actualRoleDTOFactory = new RoleDTO.RoleDTOFactory();
    actualRoleDTOFactory.members(new TreeSet<String>());
    actualRoleDTOFactory.roleName("Dr");
  }

  @Test
  void testRoleDTOFactoryCreate() {
    RoleDTO actualCreateResult = (new RoleDTO.RoleDTOFactory()).create();
    assertTrue(actualCreateResult.getMembers().isEmpty());
    assertNull(actualCreateResult.getRoleName());
  }

  @Test
  void testRoleDTOFactoryMember() {
    RoleDTO.RoleDTOFactory roleDTOFactory = new RoleDTO.RoleDTOFactory();
    assertSame(roleDTOFactory, roleDTOFactory.member(" str U"));
  }

  @Test
  void testRoleDTOFactoryRemoveMember() {
    RoleDTO.RoleDTOFactory roleDTOFactory = new RoleDTO.RoleDTOFactory();
    assertSame(roleDTOFactory, roleDTOFactory.removeMember(" str Use"));
  }
}

