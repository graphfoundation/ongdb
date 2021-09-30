package io.github.onograph.server.security.systemgraph;

import org.neo4j.dbms.database.ComponentVersion;


public enum SecurityComponentVersion implements ComponentVersion {


  BACK_COMPATIBLE_FOR_35(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE"), 0,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_36(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE2"), 1,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_40(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE3"), 2,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_41D1(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE4"), 3,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_41(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE5"), 4,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_42D4(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE6"), 5,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_42D6(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE7"), 6,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_42D7(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE8"), 7,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_42P1(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE9"), 8,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_43D1(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE10"), 9,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_43D3(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE11"), 10,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_43D4(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE12"), 11,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BAD_SEC_VERS(
      String.format(io.github.onograph.I18N.format(
              "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.format"),
          io.github.onograph.TokenConstants.SECURITY_PRIVILEGES), -1,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  BACK_COMPATIBLE_FOR_HOLDER_NEXT(
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE13"),
      Integer.MIN_VALUE,
      io.github.onograph.TokenConstants.SECURITY_PRIVILEGES),

  TEST_VER(io.github.onograph.I18N.format(
      "io.github.onograph.server.security.systemgraph.SecurityComponentVersion.OE14"),
      Integer.MAX_VALUE, io.github.onograph.TokenConstants.SECURITY_PRIVILEGES);


  public static final int CURRENT_SECURITY_COMP_VERS_NUM = BACK_COMPATIBLE_FOR_43D4.getVersion();


  public static final int EARLIEST_SECURITY_COMP_VERS_NUM = BACK_COMPATIBLE_FOR_35.getVersion();


  public static final int EARLIEST_SECURITY_COMP_VERS_NUM_FOR_RT = BACK_COMPATIBLE_FOR_40.getVersion();


  private final String desc;


  private final int moduleVers;


  private final String name;


  SecurityComponentVersion(String desc, int _iVrin, String _strNc) {
    this.desc = desc;
    this.moduleVers = _iVrin;
    this.name = _strNc;
  }

  @Override
  public String getComponentName() {
    return this.name;
  }

  @Override
  public String getDescription() {
    return this.desc;
  }

  @Override
  public int getVersion() {
    return this.moduleVers;
  }

  @Override
  public boolean isCurrent() {
    return this.moduleVers == CURRENT_SECURITY_COMP_VERS_NUM;
  }

  @Override
  public boolean migrationSupported() {
    return this.moduleVers >= EARLIEST_SECURITY_COMP_VERS_NUM
        && this.moduleVers <= CURRENT_SECURITY_COMP_VERS_NUM;
  }

  @Override
  public boolean runtimeSupported() {
    return this.moduleVers >= EARLIEST_SECURITY_COMP_VERS_NUM_FOR_RT
        && this.moduleVers <= CURRENT_SECURITY_COMP_VERS_NUM;
  }
}
