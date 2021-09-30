package io.github.onograph.cluster.raft.logservice;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.time.Clock;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.neo4j.io.IOUtils;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.util.Preconditions;
import org.neo4j.util.VisibleForTesting;


public class ConsensusMessageLogServiceDefaultImpl<MEMBER> extends LifecycleAdapter implements
    ConsensusMessageLogService<MEMBER> {


  private static final DateTimeFormatter DT_LTM_FMXR = DateTimeFormatter.ofPattern(
      io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceDefaultImpl.ofPattern"));


  private final Clock clock;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final ReadWriteLock llReadWriteLock = new ReentrantReadWriteLock();


  private final Path lpPath;


  private PrintWriter printWriter;


  public ConsensusMessageLogServiceDefaultImpl(Clock _clock,
      FileSystemAbstraction _fFileSystemAbstraction, Path _plPath) {
    this.clock = _clock;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.lpPath = _plPath;
  }


  private static String _nusamstString(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m) {
    return Objects.isNull(m) ? io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceDefaultImpl.nusamstString")
        : m.getTNme().toString();
  }


  private String _cordaiString(NamedDatabaseId _namedDatabaseId) {
    return _namedDatabaseId == null ? io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceDefaultImpl.cordaiString")
        : String.format(
            io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceDefaultImpl.format"),
            _namedDatabaseId);
  }


  private void _logForStCoMEStSt(
      io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceDefaultImpl.ConsensusMessageLogDirectionType _consensusMessageLogDirectionType,
      String m, MEMBER _mmeRmt, String _strDf, String tNme) {

  }

  @Override
  public void loiodForNaMECo(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m,
      MEMBER _mmeRmt, NamedDatabaseId _namedDatabaseId) {
    this._logForStCoMEStSt(
        io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceDefaultImpl.ConsensusMessageLogDirectionType.INCOMING,
        String.valueOf(m), _mmeRmt, this._cordaiString(_namedDatabaseId),
        _nusamstString(m));
  }

  @Override
  public void loobnForNaMECo(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m,
      MEMBER _mmeRmt, NamedDatabaseId _namedDatabaseId) {
    this._logForStCoMEStSt(
        io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceDefaultImpl.ConsensusMessageLogDirectionType.OUTGOING,
        String.valueOf(m), _mmeRmt, this._cordaiString(_namedDatabaseId),
        _nusamstString(m));
  }


  @VisibleForTesting
  protected PrintWriter opprwrPrintWriter() throws IOException {
    this.fFileSystemAbstraction.mkdirs(this.lpPath.getParent());
    return new PrintWriter(this.fFileSystemAbstraction.openAsOutputStream(this.lpPath, true));
  }

  @Override
  public void start() throws IOException {
    this.llReadWriteLock.writeLock().lock();

    try {
      Preconditions.checkState(this.printWriter == null, io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceDefaultImpl.checkState"));
      this.printWriter = this.opprwrPrintWriter();
    } finally {
      this.llReadWriteLock.writeLock().unlock();
    }
  }

  @Override
  public void stop() {
    this.llReadWriteLock.writeLock().lock();

    try {
      IOUtils.closeAllSilently(this.printWriter);
      this.printWriter = null;
    } finally {
      this.llReadWriteLock.writeLock().unlock();
    }
  }


  private enum ConsensusMessageLogDirectionType {


    OUTGOING("-->"),

    INCOMING("<--");


    public final String dirIndicator;

    ConsensusMessageLogDirectionType(String _dirIndicator) {
      this.dirIndicator = _dirIndicator;
    }
  }
}
