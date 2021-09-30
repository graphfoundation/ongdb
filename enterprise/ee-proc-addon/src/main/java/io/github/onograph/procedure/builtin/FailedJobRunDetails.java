package io.github.onograph.procedure.builtin;

import java.time.ZoneId;
import org.apache.commons.lang3.StringUtils;
import org.neo4j.procedure.builtin.ProceduresTimeFormatHelper;
import org.neo4j.scheduler.FailedJobRun;


public class FailedJobRunDetails {


  public final String daas;


  public final String desc;


  public final String excisr;


  public final String faletm;


  public final String fardci;


  public final String grp;


  public final String joi;


  public final String sumt;


  public final String sumt2;


  public final String tNme;

  FailedJobRunDetails(FailedJobRun _failedJobRun, ZoneId _zoneId) {
    this.joi = MonitoredJobInfoWrapper.seiijiString(_failedJobRun.getJobId());
    this.grp = _failedJobRun.getGroup().groupName();
    this.sumt = _failedJobRun.getSubmitter().describe();
    this.daas = StringUtils.defaultString(_failedJobRun.getTargetDatabaseName());
    this.desc = _failedJobRun.getDescription();
    this.tNme = _failedJobRun.getJobType().name();
    this.sumt2 = ProceduresTimeFormatHelper.formatTime(_failedJobRun.getSubmitted(), _zoneId);
    this.excisr = ProceduresTimeFormatHelper.formatTime(_failedJobRun.getExecutionStart(), _zoneId);
    this.faletm = ProceduresTimeFormatHelper.formatTime(_failedJobRun.getFailureTime(), _zoneId);
    this.fardci = _failedJobRun.getFailureDescription();
  }
}
