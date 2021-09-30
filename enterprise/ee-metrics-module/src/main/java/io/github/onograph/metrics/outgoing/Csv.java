package io.github.onograph.metrics.outgoing;

import io.github.onograph.config.Metrics;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.logging.Log;


public class Csv implements Lifecycle {


  private final Config config;


  private final FileSystemAbstraction fileSystemAbstraction;


  private final Log gLog;


  private final CsvScheduledReporter rcCsvScheduledReporter;


  Csv(Config _config, FileSystemAbstraction _fileSystemAbstraction, Log _gLog,
      CsvScheduledReporter _rcCsvScheduledReporter) {
    this.config = _config;
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.gLog = _gLog;
    this.rcCsvScheduledReporter = _rcCsvScheduledReporter;
  }

  @Override
  public void init() throws IOException {

    Path _pdPath = this.rcCsvScheduledReporter.getPdPath();
    if (!this.fileSystemAbstraction.fileExists(_pdPath)) {
      this.fileSystemAbstraction.mkdirs(_pdPath);
    }

    if (!this.fileSystemAbstraction.isDirectory(_pdPath)) {

      throw new IllegalStateException("*** Error: 8f63b75e-70b9-48df-80da-18606a10c938");
    }
  }

  @Override
  public void shutdown() {
  }

  @Override
  public void start() {
    this.rcCsvScheduledReporter.start(this.config.get(Metrics.settingCsieaDuration).toMillis(),
        TimeUnit.MILLISECONDS);

    this.gLog.info(
        io.github.onograph.I18N.format("io.github.onograph.metrics.outgoing.Csv.info",
            this.rcCsvScheduledReporter.getPdPath()));
  }

  @Override
  public void stop() {
    this.rcCsvScheduledReporter.stop();
  }
}
