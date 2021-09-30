package io.github.onograph.metrics.outgoing;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.jmx.JmxReporter;
import com.codahale.metrics.jmx.ObjectNameFactory;
import io.github.onograph.config.Metrics;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.Log;


public class ReportingService {


  private static final String MECBU = io.github.onograph.TokenConstants.__METRICS;


  private final Config config;


  private final ConnectorPortRegister connectorPortRegister;


  private final CsvScheduledReporter crCsvScheduledReporter;


  private final FileSystemAbstraction fileSystemAbstraction;


  private final Log gLog;


  private final LifeSupport lifeSupport;


  private final MetricRegistry metricRegistry;


  public ReportingService(Config _config, ConnectorPortRegister _connectorPortRegister,
      CsvScheduledReporter _crCsvScheduledReporter, FileSystemAbstraction _fileSystemAbstraction,
      Log _gLog, LifeSupport _lifeSupport, MetricRegistry _metricRegistry) {
    this.config = _config;
    this.connectorPortRegister = _connectorPortRegister;
    this.crCsvScheduledReporter = _crCsvScheduledReporter;
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.gLog = _gLog;
    this.lifeSupport = _lifeSupport;
    this.metricRegistry = _metricRegistry;
  }


  public boolean isCofu() {

    boolean _isCc = false;
    if (!(Boolean) this.config.get(Metrics.settingMersaeBoolean)) {
      return _isCc;
    } else {
      if (this.config.get(Metrics.settingCsebdBoolean)) {

        Csv _oCsv = new Csv(this.config, this.fileSystemAbstraction, this.gLog,
            this.crCsvScheduledReporter);
        this.lifeSupport.add(_oCsv);
        _isCc = true;
      }

      SocketAddress _sreSocketAddress;
      if (this.config.get(Metrics.settingGriaBoolean)) {
        _sreSocketAddress = this.config.get(Metrics.settingGrpteeSocketAddress);

        long _lgPro = this.config.get(Metrics.settingGritlDuration).toMillis();

        CodehaleGraphite codehaleGraphite = new CodehaleGraphite(_sreSocketAddress, _lgPro,
            this.metricRegistry, this.gLog);
        this.lifeSupport.add(codehaleGraphite);
        _isCc = true;
      }

      if (this.config.get(Metrics.settingPrteeBoolean)) {
        _sreSocketAddress = this.config.get(Metrics.settingPrteiSocketAddress);

        Prometheus _oPrometheus = new Prometheus(this.connectorPortRegister, this.gLog,
            this.metricRegistry, _sreSocketAddress);
        this.lifeSupport.add(_oPrometheus);
        _isCc = true;
      }

      if (this.config.get(Metrics.settingJmebdBoolean)) {

        String _strDmi = this.config.get(Metrics.settingMersexString)
            + io.github.onograph.TokenConstants.__METRICS;

        JmxReporter _jmxReporter = JmxReporter.forRegistry(this.metricRegistry).inDomain(_strDmi)
            .createsObjectNamesWith(
                new io.github.onograph.metrics.outgoing.ReportingService.ObjectNameFactoryImpl())
            .build();
        this.lifeSupport.add(new JavaManagementExtensions(_jmxReporter));
        _isCc = true;
      }

      return _isCc;
    }
  }


  private static class ObjectNameFactoryImpl implements ObjectNameFactory {


    private static final String TITLE = io.github.onograph.TokenConstants.NAME;

    @Override
    public ObjectName createName(String tNme, String _strDmi, String title) {
      try {

        ObjectName _objectName = new ObjectName(_strDmi, io.github.onograph.TokenConstants.NAME,
            title);

        String _strNv = _objectName.isPropertyValuePattern() ? ObjectName.quote(title) : title;
        return new ObjectName(_strDmi, io.github.onograph.TokenConstants.NAME, _strNv);
      } catch (

          MalformedObjectNameException _malformedObjectNameException) {
        try {
          return new ObjectName(_strDmi, io.github.onograph.TokenConstants.NAME,
              ObjectName.quote(title));
        } catch (

            MalformedObjectNameException _malformedObjectNameException2) {
          throw new RuntimeException(_malformedObjectNameException2);
        }
      }
    }
  }
}
