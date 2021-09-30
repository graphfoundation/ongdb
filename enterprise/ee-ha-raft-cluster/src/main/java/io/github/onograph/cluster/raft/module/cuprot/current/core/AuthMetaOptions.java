package io.github.onograph.cluster.raft.module.cuprot.current.core;


public enum AuthMetaOptions {

  roles(true, false),

  all(true, true),

  users(false, true);


  public final boolean isModRoles;


  public final boolean isModUsers;


  AuthMetaOptions(boolean _isModRoles, boolean _isModUsers) {
    this.isModRoles = _isModRoles;
    this.isModUsers = _isModUsers;
  }
}
