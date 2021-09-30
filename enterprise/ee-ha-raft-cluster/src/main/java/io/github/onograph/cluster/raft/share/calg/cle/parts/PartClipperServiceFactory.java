package io.github.onograph.cluster.raft.share.calg.cle.parts;

import org.neo4j.function.Factory;
import org.neo4j.kernel.impl.transaction.log.pruning.ThresholdConfigParser;
import org.neo4j.kernel.impl.transaction.log.pruning.ThresholdConfigParser.ThresholdConfigValue;
import org.neo4j.logging.LogProvider;


public class PartClipperServiceFactory implements Factory<PartClipperService> {


  private final LogProvider logProvider;


  private final String strPsc;


  public PartClipperServiceFactory(LogProvider _logProvider, String _strPsc) {
    this.logProvider = _logProvider;
    this.strPsc = _strPsc;
  }

  @Override
  public PartClipperService newInstance() {

    ThresholdConfigValue _thresholdConfigValue = ThresholdConfigParser.parse(this.strPsc);

    String tNme = _thresholdConfigValue.type;

    long val = _thresholdConfigValue.value;

    byte _byte1 = -1;
    switch (tNme.hashCode()) {
      case -1591573360:
        if (tNme.equals(io.github.onograph.TokenConstants.ENTRIES)) {
          _byte1 = 2;
        }
        break;
      case 115311:
        if (tNme.equals(io.github.onograph.TokenConstants.TXS)) {
          _byte1 = 1;
        }
        break;
      case 3076183:
        if (tNme.equals(io.github.onograph.TokenConstants.DAYS)) {
          _byte1 = 4;
        }
        break;
      case 3530753:
        if (tNme.equals(io.github.onograph.TokenConstants.SIZE)) {
          _byte1 = 0;
        }
        break;
      case 97196323:
        if (tNme.equals(io.github.onograph.TokenConstants.FALSE)) {
          _byte1 = 5;
        }
        break;
      case 99469071:
        if (tNme.equals(io.github.onograph.TokenConstants.HOURS)) {
          _byte1 = 3;
        }
    }

    switch (_byte1) {
      case 0:
        return new PartClipperServiceGrowthImpl(val);
      case 1:
      case 2:
        return new PartClipperServiceTransactionLogEntryImpl(val, this.logProvider);
      case 3:
      case 4:

        throw new IllegalArgumentException("*** Error: 0241dfe4-64cd-465d-aab1-c3149c4b22ec");
      case 5:
        return new PartClipperServiceStandardImpl();
      default:

        throw new IllegalArgumentException("*** Error: 1935bf53-f163-45ee-bd8d-3edb916445e7");
    }
  }
}
