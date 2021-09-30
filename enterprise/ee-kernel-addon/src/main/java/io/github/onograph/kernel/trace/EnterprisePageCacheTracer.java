package io.github.onograph.kernel.trace;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.internal.helpers.TimeUtil;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.pagecache.PageSwapper;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.FlushEvent;
import org.neo4j.io.pagecache.tracing.MajorFlushEvent;
import org.neo4j.io.pagecache.tracing.MajorFlushEvent.ChunkEvent;
import org.neo4j.io.pagecache.tracing.PageReferenceTranslator;
import org.neo4j.logging.Log;
import org.neo4j.time.Stopwatch;
import org.neo4j.time.SystemNanoClock;


public class EnterprisePageCacheTracer extends DefaultPageCacheTracer {


  private final Log log;


  private final AtomicLong pfAtomicLong = new AtomicLong();


  private final AtomicLong pmAtomicLong = new AtomicLong();


  private final Duration strsDuration;


  private final SystemNanoClock systemNanoClock;


  private final AtomicLong wbfAtomicLong = new AtomicLong();


  private final FlushEvent flushEvent = new FlushEvent() {
    @Override
    public void addBytesWritten(long btCnt) {
      EnterprisePageCacheTracer.this.bytesWritten.add(btCnt);
      EnterprisePageCacheTracer.this.wbfAtomicLong.getAndAdd(btCnt);
    }

    @Override
    public void addPagesFlushed(int _iCp) {
      EnterprisePageCacheTracer.this.pfAtomicLong.getAndAdd(_iCp);
    }

    @Override
    public void addPagesMerged(int _iMp) {
      EnterprisePageCacheTracer.this.pmAtomicLong.getAndAdd(_iMp);
    }

    @Override
    public void done() {
      EnterprisePageCacheTracer.this.flushes.increment();
    }

    @Override
    public void done(IOException _iOException) {
      this.done();
    }
  };


  EnterprisePageCacheTracer(Config _config, Log _log, SystemNanoClock _systemNanoClock) {
    this.log = _log;
    this.systemNanoClock = _systemNanoClock;
    this.strsDuration = _config.get(
        GraphDatabaseInternalSettings.page_cache_tracer_speed_reporting_threshold);
  }


  private static String _byetosrgString(long btCnt) {
    return String.format(io.github.onograph.I18N.format(
            "io.github.onograph.kernel.trace.EnterprisePageCacheTracer.format2"),
        ByteUnit.bytesToString(btCnt), btCnt);
  }


  private static String _byinosnString(long _lgNtf, long _lgTiwb) {

    long _lgSnib = _lgNtf > 0L ? _lgTiwb / _lgNtf : _lgTiwb;
    return io.github.onograph.I18N.format(
        "io.github.onograph.kernel.trace.EnterprisePageCacheTracer.byinosnString", _lgSnib);
  }


  private static String _flsspdString(long _lgNtf, long _lgTiwb) {

    String _strNpb = _byinosnString(_lgNtf, _lgTiwb);

    long _lgScns = TimeUnit.NANOSECONDS.toSeconds(_lgNtf);
    if (_lgScns > 0L) {

      String _strVr00 = _byetosrgString(_lgTiwb / _lgScns);
      return io.github.onograph.I18N.format(
          "io.github.onograph.kernel.trace.EnterprisePageCacheTracer.flsspdString", _strVr00,
          _strNpb);
    } else {
      return _strNpb;
    }
  }


  private static String _naotosrgString(long _lgNns) {
    return String.format(io.github.onograph.I18N.format(
            "io.github.onograph.kernel.trace.EnterprisePageCacheTracer.format"),
        TimeUtil.nanosToString(_lgNns), _lgNns);
  }

  @Override
  public MajorFlushEvent beginCacheFlush() {

    return new MajorFlushEventPCImpl(this.pfAtomicLong.get(), this.pmAtomicLong.get(),
        this.wbfAtomicLong.get(),
        this.systemNanoClock.startStopWatch());
  }

  @Override
  public MajorFlushEvent beginFileFlush(PageSwapper _pageSwapper) {

    String _strNf = _pageSwapper.path().getFileName().toString();

    return new MajorFlushEventFIOImpl(this.pfAtomicLong.get(), this.pmAtomicLong.get(),
        this.wbfAtomicLong.get(), _strNf,
        this.systemNanoClock.startStopWatch());
  }

  @Override
  public void mappedFile(int _iIs, PagedFile _mfPagedFile) {

    super.mappedFile(_iIs, _mfPagedFile);
  }

  @Override
  public void unmappedFile(int _iIs, PagedFile _fmPagedFile) {

    super.unmappedFile(_iIs, _fmPagedFile);
  }


  private class ChunkEventImpl extends ChunkEvent {


    private final String strNf;


    private final Stopwatch tsStopwatch;

    ChunkEventImpl(String _strNf, Stopwatch _tsStopwatch) {
      this.strNf = _strNf;
      this.tsStopwatch = _tsStopwatch;
    }

    @Override
    public void chunkFlushed(long _lgPmn, long _lgCpf, long _lgCpb, long _lgMpc) {

    }
  }


  private class MajorFlushEventFIOImpl extends MajorFlushEventImpl {


    private final long lgSof;


    private final long lgSom;


    private final long lgSowb;


    private final String strNf;


    private final Stopwatch tsStopwatch;


    MajorFlushEventFIOImpl(long _lgSof, long _lgSom, long _lgSowb, String _strNf,
        Stopwatch _tsStopwatch) {
      super(_lgSowb, _strNf, _tsStopwatch);
      this.strNf = _strNf;
      this.lgSof = _lgSof;
      this.lgSowb = _lgSowb;
      this.lgSom = _lgSom;
      this.tsStopwatch = _tsStopwatch;
    }

    @Override
    public void close() {

      long _lgNff = this.tsStopwatch.elapsed(TimeUnit.NANOSECONDS);

      long _lgTiwb = EnterprisePageCacheTracer.this.wbfAtomicLong.get() - this.lgSowb;

      long _lgTipf = EnterprisePageCacheTracer.this.pfAtomicLong.get() - this.lgSof;

      long _lgTipm = EnterprisePageCacheTracer.this.pmAtomicLong.get() - this.lgSom;


    }
  }


  private abstract class MajorFlushEventImpl implements MajorFlushEvent {


    protected final String strNf;


    private long lgWbrl;


    private Stopwatch trlStopwatch;


    MajorFlushEventImpl(long _lgSowb, String _strNf, Stopwatch _tsStopwatch) {
      this.lgWbrl = _lgSowb;
      this.strNf = _strNf;
      this.trlStopwatch = _tsStopwatch;
    }

    @Override
    public FlushEvent beginFlush(long[] _lgRpArray, PageSwapper _pageSwapper,
        PageReferenceTranslator _pageReferenceTranslator, int _iFtp, int _iPm) {
      if (this.trlStopwatch.hasTimedOut(EnterprisePageCacheTracer.this.strsDuration)) {

        long _lgBw = EnterprisePageCacheTracer.this.wbfAtomicLong.get();

        this.trlStopwatch = EnterprisePageCacheTracer.this.systemNanoClock.startStopWatch();
        this.lgWbrl = _lgBw;
      }

      return EnterprisePageCacheTracer.this.flushEvent;
    }

    @Override
    public FlushEvent beginFlush(long _lgRp, PageSwapper _pageSwapper,
        PageReferenceTranslator _pageReferenceTranslator) {
      return this.beginFlush(new long[]{_lgRp}, _pageSwapper, _pageReferenceTranslator, 1, 0);
    }

    @Override
    public void reportIO(int _iOic) {
    }

    @Override
    public ChunkEvent startChunk(int[] _iCukArray) {
      return EnterprisePageCacheTracer.this.new ChunkEventImpl(this.strNf,
          EnterprisePageCacheTracer.this.systemNanoClock.startStopWatch());
    }

    @Override
    public void startFlush(int[][] _iTtArrayArray) {

    }

    @Override
    public void throttle(long _lgMli) {
    }
  }


  private class MajorFlushEventPCImpl extends MajorFlushEventImpl {


    private final long lgSof;


    private final long lgSom;


    private final long lgSowb;


    private final Stopwatch tsStopwatch;


    MajorFlushEventPCImpl(long _lgSof, long _lgSom, long _lgSowb, Stopwatch _tsStopwatch) {
      super(_lgSowb, io.github.onograph.I18N.format(
              "io.github.onograph.kernel.trace.EnterprisePageCacheTracer.MajorFlushEventPCImpl.super"),
          _tsStopwatch);
      this.lgSof = _lgSof;
      this.lgSowb = _lgSowb;
      this.lgSom = _lgSom;
      this.tsStopwatch = _tsStopwatch;
    }

    @Override
    public void close() {

      long _lgNfcp = this.tsStopwatch.elapsed(TimeUnit.NANOSECONDS);

      long _lgTiwb = EnterprisePageCacheTracer.this.wbfAtomicLong.get() - this.lgSowb;

      long _lgTipf = EnterprisePageCacheTracer.this.pfAtomicLong.get() - this.lgSof;

      long _lgTipm = EnterprisePageCacheTracer.this.pmAtomicLong.get() - this.lgSom;


    }
  }
}
