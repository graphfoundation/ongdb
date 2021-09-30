package io.github.onograph.cluster.raft.utils;

import java.util.OptionalLong;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;
import org.neo4j.logging.Log;


public final class ActionStatsWatcher<T> {


  private final Future<T> futureFtrT;


  private final long lgItm;


  private final Log log;


  private final Supplier<OptionalLong> supplierSrlsmOptionalLong;


  private ActionStatsWatcher(Future<T> _futureFtrT, long _lgMti, Log _log,
      Supplier<OptionalLong> _supplierSrlsmOptionalLong) {
    this.futureFtrT = _futureFtrT;
    this.lgItm = _lgMti;
    this.log = _log;
    this.supplierSrlsmOptionalLong = _supplierSrlsmOptionalLong;
  }


  public static <T> ActionStatsWatcher<T> ofActionStatsWatcher(Future<T> _futureFtrT, long _lgMti,
      Log _log, Supplier<OptionalLong> _supplierMslrsOptionalLong) {
    return new ActionStatsWatcher(_futureFtrT, _lgMti, _log, _supplierMslrsOptionalLong);
  }


  private void _thoontmuForSt(String m) throws TimeoutException {

    this.futureFtrT.cancel(false);

    throw new TimeoutException("*** Error: 1184018c-62eb-4fc3-9dbc-c3c9790ad8ab");
  }


  public T findCurrent() throws ExecutionException, InterruptedException, TimeoutException {

    long _lgMtr = this.lgItm;

    while (true) {
      try {
        return this.futureFtrT.get(_lgMtr, TimeUnit.MILLISECONDS);
      } catch (

          ExecutionException | InterruptedException _exception) {
        this.futureFtrT.cancel(false);
        throw _exception;
      } catch (

          TimeoutException _timeoutException) {

        OptionalLong _rlsmOptionalLong = this.supplierSrlsmOptionalLong.get();
        if (!_rlsmOptionalLong.isPresent()) {
          this._thoontmuForSt(io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.utils.ActionStatsWatcher.thoontmuForSt",
              this.lgItm));
        } else if (_rlsmOptionalLong.getAsLong() < this.lgItm) {
          _lgMtr = this.lgItm - _rlsmOptionalLong.getAsLong();
        } else {
          this._thoontmuForSt(
              io.github.onograph.I18N.format(
                  "io.github.onograph.cluster.raft.utils.ActionStatsWatcher.thoontmuForSt2",
                  _rlsmOptionalLong));
        }
      }
    }
  }
}
