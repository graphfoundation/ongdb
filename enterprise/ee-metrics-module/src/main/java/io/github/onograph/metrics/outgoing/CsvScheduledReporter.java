package io.github.onograph.metrics.outgoing;

import com.codahale.metrics.Clock;
import com.codahale.metrics.Counter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import com.codahale.metrics.Snapshot;
import com.codahale.metrics.Timer;
import io.github.onograph.config.Metrics;
import java.io.IOException;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.concurrent.TimeUnit;
import org.neo4j.io.IOUtils;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.Log;
import org.neo4j.logging.log4j.RotatingLogFileWriter;


public class CsvScheduledReporter extends ScheduledReporter {


  private final Metrics.CompressionOption compressionOption;


  private final RotatingLogFileWriterService fflRotatingLogFileWriterService;


  private final FileSystemAbstraction fileSystemAbstraction;


  private final Log gLog;


  private final int iAm;


  private final long lgTr;


  private final Map<Path, RotatingLogFileWriter> mapWiespr;


  private final Path pdPath;


  private boolean notRunning;

  public CsvScheduledReporter(MetricRegistry _metricRegistry,
      FileSystemAbstraction _fileSystemAbstraction, Path _pdPath, long _lgTr, int _iAm,
      Metrics.CompressionOption _compressionOption,
      RotatingLogFileWriterService _fflRotatingLogFileWriterService, Log _gLog) {
    super(_metricRegistry, io.github.onograph.TokenConstants.CSV_REPORTER, MetricFilter.ALL,
        TimeUnit.SECONDS, TimeUnit.MILLISECONDS);
    this.pdPath = _pdPath;
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.lgTr = _lgTr;
    this.iAm = _iAm;
    this.compressionOption = _compressionOption;
    this.fflRotatingLogFileWriterService = _fflRotatingLogFileWriterService;
    this.gLog = _gLog;
    this.mapWiespr = new HashMap();
  }


  private void _reoForStStStOb(String hdrByte, long _lgTmsap, String _strL, String title,
      Object... valArr) {

    Path _pfPath = this.pdPath.resolve(
        io.github.onograph.I18N.format(
            "io.github.onograph.metrics.outgoing.CsvScheduledReporter.resolve", title));

    RotatingLogFileWriter _wcRotatingLogFileWriter = this.mapWiespr.computeIfAbsent(_pfPath,
        (fileName) ->
        {
          return this.fflRotatingLogFileWriterService.crawtRotatingLogFileWriter(
              this.fileSystemAbstraction, fileName, this.lgTr, this.iAm,
              this.compressionOption == Metrics.CompressionOption.NONE ? ""
                  : io.github.onograph.I18N.format(
                      "io.github.onograph.metrics.outgoing.CsvScheduledReporter.crawtRotatingLogFileWriter",
                      this.compressionOption.name()
                          .toLowerCase()),
              io.github.onograph.I18N.format(
                  "io.github.onograph.metrics.outgoing.CsvScheduledReporter.crawtRotatingLogFileWriter2",
                  hdrByte));
        });
    _wcRotatingLogFileWriter.printf(String.format(Locale.US, "%d,%s", _lgTmsap, _strL), valArr);
  }


  private void _reocnrForStCo(Counter _counter, long _lgTmsap, String title) {
    this._reoForStStStOb(io.github.onograph.TokenConstants.COUNT, _lgTmsap, "%d", title,
        _counter.getCount());
  }


  private void _reoggForStGa(Gauge _gauge, long _lgTmsap, String title) {
    this._reoForStStStOb(io.github.onograph.TokenConstants.VALUE, _lgTmsap, "%s", title,
        _gauge.getValue());
  }


  private void _reomeForStMe(long _lgTmsap, Meter _meter, String title) {
    this._reoForStStStOb("count,mean_rate,m1_rate,m5_rate,m15_rate,rate_unit", _lgTmsap,
        "%d,%f,%f,%f,%f,events/%s", title,
        _meter.getCount(),
        this.convertRate(_meter.getMeanRate()), this.convertRate(_meter.getOneMinuteRate()),
        this.convertRate(_meter.getFiveMinuteRate()),
        this.convertRate(_meter.getFifteenMinuteRate()), this.getRateUnit());
  }


  private void _reoteForStTi(long _lgTmsap, Timer _timer, String title) {

    Snapshot _snapshot = _timer.getSnapshot();
    this._reoForStStStOb(
        "count,max,mean,min,stddev,p50,p75,p95,p98,p99,p999,mean_rate,m1_rate,m5_rate,m15_rate,rate_unit,duration_unit",
        _lgTmsap, "%d,%f,%f,%f,%f,%f,%f,%f,%f,%f,%f,%f,%f,%f,%f,calls/%s,%s",
        title, _timer.getCount(), this.convertDuration((double) _snapshot.getMax()),
        this.convertDuration(_snapshot.getMean()),
        this.convertDuration((double) _snapshot.getMin()),
        this.convertDuration(_snapshot.getStdDev()), this.convertDuration(_snapshot.getMedian()),
        this.convertDuration(_snapshot.get75thPercentile()),
        this.convertDuration(_snapshot.get95thPercentile()),
        this.convertDuration(_snapshot.get98thPercentile()),
        this.convertDuration(_snapshot.get99thPercentile()),
        this.convertDuration(_snapshot.get999thPercentile()),
        this.convertRate(_timer.getMeanRate()),
        this.convertRate(_timer.getOneMinuteRate()), this.convertRate(_timer.getFiveMinuteRate()),
        this.convertRate(_timer.getFifteenMinuteRate()), this.getRateUnit(),
        this.getDurationUnit());
  }


  private void _rethoForStHi(Histogram _histogram, long _lgTmsap, String title) {

    Snapshot _snapshot = _histogram.getSnapshot();
    this._reoForStStStOb("count,max,mean,min,stddev,p50,p75,p95,p98,p99,p999", _lgTmsap,
        "%d,%d,%f,%d,%f,%f,%f,%f,%f,%f,%f", title,
        _histogram.getCount(),
        _snapshot.getMax(), _snapshot.getMean(), _snapshot.getMin(), _snapshot.getStdDev(),
        _snapshot.getMedian(),
        _snapshot.get75thPercentile(),
        _snapshot.get95thPercentile(), _snapshot.get98thPercentile(), _snapshot.get99thPercentile(),
        _snapshot.get999thPercentile());
  }


  private void _trdeForPa(Path _path) {
    try {
      this.fileSystemAbstraction.delete(_path);
    } catch (

        IOException _iOException) {

    }
  }


  public synchronized void deeaForSt(String _strPei) {
    this.mapWiespr.entrySet().removeIf((entry) ->
    {

      Path _path = entry.getKey();
      if (_path.getFileName().toString().startsWith(_strPei)) {
        IOUtils.closeAllSilently(entry.getValue());
        this._trdeForPa(_path);
        return true;
      } else {
        return false;
      }
    });

    try {

      Path[] _vPathArray = this.fileSystemAbstraction.listFiles(this.pdPath, (pathx) ->
      {
        return pathx.getFileName().toString().startsWith(_strPei);
      });

      int _iVar = _vPathArray.length;

      for (

          int _iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {

        Path _path2 = _vPathArray[_iVar2];
        this._trdeForPa(_path2);
      }
    } catch (

        NotDirectoryException _notDirectoryException) {
    } catch (

        IOException _iOException) {

    }
  }


  public Path getPdPath() {
    return this.pdPath;
  }

  @Override
  public synchronized void report(SortedMap<String, Gauge> _sortedMapGuesg,
      SortedMap<String, Counter> _sortedMapCutrsc, SortedMap<String, Histogram> _sortedMapHsormsh,
      SortedMap<String, Meter> _sortedMapMtrsm, SortedMap<String, Timer> _sortedMapTmrst) {
    if (!this.notRunning) {

      long _lgTmsap = TimeUnit.MILLISECONDS.toSeconds(Clock.defaultClock().getTime());

      Iterator _iterator = _sortedMapGuesg.entrySet().iterator();

      Entry _entry;
      while (_iterator.hasNext()) {
        _entry = (Entry) _iterator.next();
        this._reoggForStGa((Gauge) _entry.getValue(), _lgTmsap, (String) _entry.getKey());
      }

      _iterator = _sortedMapCutrsc.entrySet().iterator();

      while (_iterator.hasNext()) {
        _entry = (Entry) _iterator.next();
        this._reocnrForStCo((Counter) _entry.getValue(), _lgTmsap, (String) _entry.getKey());
      }

      _iterator = _sortedMapHsormsh.entrySet().iterator();

      while (_iterator.hasNext()) {
        _entry = (Entry) _iterator.next();
        this._rethoForStHi((Histogram) _entry.getValue(), _lgTmsap, (String) _entry.getKey());
      }

      _iterator = _sortedMapMtrsm.entrySet().iterator();

      while (_iterator.hasNext()) {
        _entry = (Entry) _iterator.next();
        this._reomeForStMe(_lgTmsap, (Meter) _entry.getValue(), (String) _entry.getKey());
      }

      _iterator = _sortedMapTmrst.entrySet().iterator();

      while (_iterator.hasNext()) {
        _entry = (Entry) _iterator.next();
        this._reoteForStTi(_lgTmsap, (Timer) _entry.getValue(), (String) _entry.getKey());
      }
    }
  }

  @Override
  public synchronized void stop() {
    super.stop();
    this.notRunning = true;
    IOUtils.closeAllSilently(this.mapWiespr.values());
  }
}
