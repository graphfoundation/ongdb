package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.neo4j.cypher.internal.security.FormatException;

class RoleDTOFileRepositorySerializerTest {

  @Test
  void testDeserializeRecord() throws FormatException {
    assertThrows(FormatException.class,
        () -> (new RoleDTOFileRepositorySerializer()).deserializeRecord(" str Lin", 1));
  }

  @Test
  void testDeserializeRecord2() throws FormatException {
    RoleDTO actualDeserializeRecordResult = (new RoleDTOFileRepositorySerializer()).deserializeRecord(
        ":", 1);
    assertTrue(actualDeserializeRecordResult.getMembers().isEmpty());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualDeserializeRecordResult.getRoleName());
  }

  @Test
  void testDeserializeRecord3() throws FormatException {
    RoleDTO actualDeserializeRecordResult = (new RoleDTOFileRepositorySerializer())
        .deserializeRecord("*** Error: 0839ef57-b74a-492b-b3f3-e9fea77912bb", 1);
    assertEquals(1, actualDeserializeRecordResult.getMembers().size());
    assertEquals("*** Error", actualDeserializeRecordResult.getRoleName());
  }

  @Test
  void testSerialize() {
    RoleDTOFileRepositorySerializer roleDTOFileRepositorySerializer = new RoleDTOFileRepositorySerializer();
    assertEquals("Role Name:foo",
        roleDTOFileRepositorySerializer.serialize(new RoleDTO("Role Name", "foo", "foo", "foo")));
  }

  @Test
  void testSerialize2() {
    RoleDTOFileRepositorySerializer roleDTOFileRepositorySerializer = new RoleDTOFileRepositorySerializer();
    assertEquals("::Members,foo",
        roleDTOFileRepositorySerializer.serialize(new RoleDTO(":", "Members", "foo", "foo")));
  }
}

