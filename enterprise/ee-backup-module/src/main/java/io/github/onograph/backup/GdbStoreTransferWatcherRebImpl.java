package io.github.onograph.backup;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher;
import java.util.concurrent.TimeUnit;
import org.neo4j.internal.helpers.Format;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.time.Stopwatch;
import org.neo4j.time.SystemNanoClock;


public class GdbStoreTransferWatcherRebImpl implements GdbStoreTransferWatcher {


  private final Log log;


  private final SystemNanoClock systemNanoClock;


  private Stopwatch tsStopwatch;


  private Stopwatch tspStopwatch;

  public GdbStoreTransferWatcherRebImpl(LogProvider _logProvider,
      SystemNanoClock _systemNanoClock) {
    this.log = _logProvider.getLog(this.getClass());
    this.systemNanoClock = _systemNanoClock;
  }


  private String _dunprsrteString() {
    return Format.duration(this.tspStopwatch.elapsed(TimeUnit.MILLISECONDS));
  }


  private void _nopasatm() {
    this.tspStopwatch = this.systemNanoClock.startStopWatch();
  }

  @Override
  public void fihrf() {

  }

  @Override
  public void fihrfForSt(String _strFil) {

  }

  @Override
  public void fihrih(long _lgIi) {

  }

  @Override
  public void fihrih() {

  }

  @Override
  public void fihritan(long _lgIte) {

  }

  @Override
  public void fihrvgse() {

  }

  @Override
  public void fii() {

  }

  @Override
  public void str() {
    this.tsStopwatch = this.systemNanoClock.startStopWatch();
  }

  @Override
  public void stres() {

    this._nopasatm();
  }

  @Override
  public void strvinsno() {

    this._nopasatm();
  }

  @Override
  public void strvinsno(long _lgIi) {

  }

  @Override
  public void strvstfi() {

    this._nopasatm();
  }

  @Override
  public void strvstfiForSt(String _strFi) {

  }

  @Override
  public void strvtrcs(long _lgIts) {

    this._nopasatm();
  }
}
