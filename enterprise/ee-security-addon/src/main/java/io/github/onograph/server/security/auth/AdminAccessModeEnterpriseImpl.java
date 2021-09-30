package io.github.onograph.server.security.auth;

import java.util.HashSet;
import java.util.Iterator;
import org.neo4j.internal.kernel.api.security.AdminAccessMode;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource.DatabaseScope;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;


public class AdminAccessModeEnterpriseImpl implements AdminAccessMode {


  private final HashSet<AdminActionOnResource> hashSetBakitAdminActionOnResource;


  private final HashSet<AdminActionOnResource> hashSetWieitAdminActionOnResource;


  AdminAccessModeEnterpriseImpl(HashSet<AdminActionOnResource> _hashSetBakitAdminActionOnResource,
      HashSet<AdminActionOnResource> _hashSetWieitAdminActionOnResource) {
    this.hashSetBakitAdminActionOnResource = _hashSetBakitAdminActionOnResource;
    this.hashSetWieitAdminActionOnResource = _hashSetWieitAdminActionOnResource;
  }


  public static boolean isMacsForHaAd(AdminActionOnResource _adminActionOnResource,
      HashSet<AdminActionOnResource> _hashSetAtosAdminActionOnResource) {

    Iterator _iterator = _hashSetAtosAdminActionOnResource.iterator();

    AdminActionOnResource _ruAdminActionOnResource;
    do {
      if (!_iterator.hasNext()) {
        return false;
      }

      _ruAdminActionOnResource = (AdminActionOnResource) _iterator.next();
    }
    while (!_ruAdminActionOnResource.matches(_adminActionOnResource));

    return true;
  }

  @Override
  public boolean allows(AdminActionOnResource _adminActionOnResource) {
    return isMacsForHaAd(_adminActionOnResource, this.hashSetWieitAdminActionOnResource) &&
        !isMacsForHaAd(_adminActionOnResource, this.hashSetBakitAdminActionOnResource);
  }


  public static class Factory {


    HashSet<AdminActionOnResource> hashSetBakitAdminActionOnResource = new HashSet();


    HashSet<AdminActionOnResource> hashSetWieitAdminActionOnResource = new HashSet();


    public Factory aloAdminAccessModeEnterpriseImplFactory(
        AdminActionOnResource _adminActionOnResource) {
      this.hashSetWieitAdminActionOnResource.add(_adminActionOnResource);
      return this;
    }


    public AdminAccessModeEnterpriseImpl bulAdminAccessModeEnterpriseImpl() {
      return new AdminAccessModeEnterpriseImpl(this.hashSetBakitAdminActionOnResource,
          this.hashSetWieitAdminActionOnResource);
    }


    public Factory denAdminAccessModeEnterpriseImplFactory(
        AdminActionOnResource _adminActionOnResource) {
      this.hashSetBakitAdminActionOnResource.add(_adminActionOnResource);
      return this;
    }


    public Factory fulAdminAccessModeEnterpriseImplFactory() {

      PrivilegeAction[] _privilegeActionArray = PrivilegeAction.values();

      int _iVa = _privilegeActionArray.length;

      for (

          int _iV = 0; _iV < _iVa; ++_iV) {

        PrivilegeAction _privilegeAction = _privilegeActionArray[_iV];
        this.hashSetWieitAdminActionOnResource.add(
            new AdminActionOnResource(_privilegeAction, DatabaseScope.ALL, Segment.ALL));
      }

      return this;
    }
  }
}
