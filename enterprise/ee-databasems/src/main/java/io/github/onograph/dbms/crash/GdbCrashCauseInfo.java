package io.github.onograph.dbms.crash;


public enum GdbCrashCauseInfo implements CrashSignaler.CauseInfo {


  CCI_IT(io.github.onograph.I18N.format("io.github.onograph.dbms.crash.GdbCrashCauseInfo.OE")),

  CCI_NOT_KNOWN(
      io.github.onograph.I18N.format("io.github.onograph.dbms.crash.GdbCrashCauseInfo.OE2")),

  CCI_CONS_NODE_CATCHUP_ERR(
      io.github.onograph.I18N.format("io.github.onograph.dbms.crash.GdbCrashCauseInfo.OE3")),

  CCI_SP_ERR(io.github.onograph.I18N.format("io.github.onograph.dbms.crash.GdbCrashCauseInfo.OE4")),

  CCI_CMD_ERROR(
      io.github.onograph.I18N.format("io.github.onograph.dbms.crash.GdbCrashCauseInfo.OE5")),

  CCI_CONS_MSG_APP_ERR(
      io.github.onograph.I18N.format("io.github.onograph.dbms.crash.GdbCrashCauseInfo.OE6"));


  private final String info;

  GdbCrashCauseInfo(String desc) {
    this.info = desc;
  }

  @Override
  public String getInfo() {
    return this.info;
  }
}
