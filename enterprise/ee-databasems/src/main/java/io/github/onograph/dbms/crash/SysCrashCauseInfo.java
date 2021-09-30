package io.github.onograph.dbms.crash;


public enum SysCrashCauseInfo implements CrashSignaler.CauseInfo {


  CCI_MTI_IT_PROC(
      io.github.onograph.I18N.format("io.github.onograph.dbms.crash.SysCrashCauseInfo.OE"), 0),

  CCI_ERR_ISSUE(
      io.github.onograph.I18N.format("io.github.onograph.dbms.crash.SysCrashCauseInfo.OE2"), 1),

  CCI_SGDB_ERR(
      io.github.onograph.I18N.format("io.github.onograph.dbms.crash.SysCrashCauseInfo.OE3"), 2),

  CCI_UNREC_DISC_ERR(
      io.github.onograph.I18N.format("io.github.onograph.dbms.crash.SysCrashCauseInfo.OE4"), 3);

  final int insCType;


  private final String info;

  SysCrashCauseInfo(String desc, int _iEc) {
    this.info = desc;
    this.insCType = _iEc;
  }

  @Override
  public String getInfo() {
    return this.info;
  }


}
