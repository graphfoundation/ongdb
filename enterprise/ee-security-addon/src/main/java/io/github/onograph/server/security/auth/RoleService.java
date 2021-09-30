package io.github.onograph.server.security.auth;

import java.io.IOException;
import java.util.Set;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.server.security.auth.ListSnapshot;
import org.neo4j.server.security.auth.exception.ConcurrentModificationException;


public interface RoleService extends Lifecycle {


  void astvdrnForSt(String _strV) throws InvalidArgumentsException;


  void cla();


  void craForRo(RoleDTO _roleDTO) throws InvalidArgumentsException, IOException;


  Set<String> gealrnSet();


  RoleDTO gerebneRoleDTO(String _strVa);


  Set<String> gerlnebusmSet(String _strV);


  ListSnapshot<RoleDTO> gespoListSnapshot() throws IOException;


  boolean isDeeForRo(RoleDTO _roleDTO) throws IOException;


  void makamre() throws IOException;


  int nuboros();


  void pug() throws IOException;


  void reeufalreForSt(String _strVar) throws ConcurrentModificationException, IOException;


  void sereForLi(ListSnapshot<RoleDTO> _listSnapshotVRoleDTO) throws InvalidArgumentsException;


  void upaForRoRo(RoleDTO _roleDTO, RoleDTO _roleDTO2)
      throws ConcurrentModificationException, IOException;
}
