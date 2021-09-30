package io.github.onograph.server.security.auth;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;


public class RoleDTO {


  private final SortedSet<String> members;


  private final String roleName;


  public RoleDTO(SortedSet<String> members, String roleName) {
    this.members = members;
    this.roleName = roleName;
  }

  public RoleDTO(String roleName, String... members) {
    this.roleName = roleName;
    this.members = new TreeSet();
    this.members.addAll(Arrays.asList(members));
  }


  public RoleDTOFactory copyThis() {
    return new RoleDTOFactory(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      RoleDTO r = (RoleDTO) obj;
      if (this.roleName != null) {
        if (this.roleName.equals(r.roleName)) {
          return this.members != null ? this.members.equals(r.members) : r.members == null;
        }
      } else if (r.roleName == null) {
        return this.members != null ? this.members.equals(r.members) : r.members == null;
      }

      return false;
    } else {
      return false;
    }
  }


  public SortedSet<String> getMembers() {
    return this.members;
  }


  public String getRoleName() {
    return this.roleName;
  }

  @Override
  public int hashCode() {

    int _iRsl = this.roleName != null ? this.roleName.hashCode() : 0;
    _iRsl = 31 * _iRsl + (this.members != null ? this.members.hashCode() : 0);
    return _iRsl;
  }


  public static class RoleDTOFactory {


    private SortedSet<String> members = new TreeSet();


    private String roleName;

    public RoleDTOFactory() {
    }

    public RoleDTOFactory(RoleDTO _baRoleDTO) {
      this.roleName = _baRoleDTO.roleName;
      this.members = new TreeSet(_baRoleDTO.members);
    }


    public RoleDTO create() {
      return new RoleDTO(this.members, this.roleName);
    }


    public RoleDTOFactory member(String _strU) {
      this.members.add(_strU);
      return this;
    }


    public RoleDTOFactory members(SortedSet<String> members) {
      this.members = members;
      return this;
    }


    public RoleDTOFactory removeMember(String _strUse) {
      this.members.remove(_strUse);
      return this;
    }


    public RoleDTOFactory roleName(String title) {
      this.roleName = title;
      return this;
    }


  }
}
