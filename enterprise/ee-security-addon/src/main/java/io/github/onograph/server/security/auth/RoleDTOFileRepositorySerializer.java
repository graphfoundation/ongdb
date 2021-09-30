package io.github.onograph.server.security.auth;

import java.util.SortedSet;
import java.util.TreeSet;
import org.neo4j.cypher.internal.security.FormatException;
import org.neo4j.server.security.auth.FileRepositorySerializer;


public class RoleDTOFileRepositorySerializer extends FileRepositorySerializer<RoleDTO> {


  private static final String roespar = ":";


  private static final String usrspar = ",";


  private static SortedSet<String> _deieusSortedSet(String _strPar) {

    String[] _strSltArray = _strPar.split(",", -1);

    SortedSet<String> _sortedSetUesString = new TreeSet();

    String[] _strVaArray = _strSltArray;

    int _iV = _strSltArray.length;

    for (

        int _iVar = 0; _iVar < _iV; ++_iVar) {

      String _strUse = _strVaArray[_iVar];
      if (!_strUse.trim().isEmpty()) {
        _sortedSetUesString.add(_strUse);
      }
    }

    return _sortedSetUesString;
  }

  @Override
  protected RoleDTO deserializeRecord(String _strLin, int _iNl)
      throws FormatException {

    String[] _strPrsArray = _strLin.split(":", -1);
    if (_strPrsArray.length != 2) {

      throw new FormatException("*** Error: 0839ef57-b74a-492b-b3f3-e9fea77912bb");
    } else {
      return (new RoleDTO.RoleDTOFactory()).roleName(_strPrsArray[0])
          .members(_deieusSortedSet(_strPrsArray[1])).create();
    }
  }

  @Override
  protected String serialize(RoleDTO r) {
    return String.join(":", r.getRoleName(), String.join(",", r.getMembers()));
  }
}
