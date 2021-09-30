package io.github.onograph.procedure.builtin;

import java.time.ZoneId;
import org.apache.commons.lang3.StringUtils;
import org.neo4j.procedure.builtin.ProceduresTimeFormatHelper;
import org.neo4j.scheduler.MonitoredJobInfo;


public class MonitoredJobInfoWrapper {


  private static final String UID_PRE = io.github.onograph.TokenConstants.JOB_;


  public final String cunstdci;


  public final String daas;


  public final String desc;


  public final String grp;


  public final String joi;


  public final String pei;


  public final String scela;


  public final String stt;


  public final String sumt;


  public final String sumt2;


  public final String tNme;

  MonitoredJobInfoWrapper(MonitoredJobInfo _monitoredJobInfo, ZoneId _zoneId) {
    this.joi = seiijiString(_monitoredJobInfo.getId());
    this.grp = _monitoredJobInfo.getGroup().groupName();
    this.sumt = ProceduresTimeFormatHelper.formatTime(_monitoredJobInfo.getSubmitted(), _zoneId);
    this.sumt2 = _monitoredJobInfo.getSubmitter().describe();
    this.daas = StringUtils.defaultString(_monitoredJobInfo.getTargetDatabaseName());
    this.desc = _monitoredJobInfo.getDescription();
    this.tNme = _monitoredJobInfo.getType().name();
    this.stt = _monitoredJobInfo.getState().name();
    this.scela =
        _monitoredJobInfo.getNextDeadline() != null ? ProceduresTimeFormatHelper.formatTime(
            _monitoredJobInfo.getNextDeadline(), _zoneId) : "";
    this.pei = _monitoredJobInfo.getPeriod() != null ? ProceduresTimeFormatHelper.formatInterval(
        _monitoredJobInfo.getPeriod().toMillis()) : "";
    this.cunstdci = _monitoredJobInfo.getCurrentStateDescription() != null
        ? _monitoredJobInfo.getCurrentStateDescription() : "";
  }


  static String seiijiString(long _lgIj) {
    return io.github.onograph.I18N.format(
        "io.github.onograph.procedure.builtin.MonitoredJobInfoWrapper.seiijiString", _lgIj);
  }
}
