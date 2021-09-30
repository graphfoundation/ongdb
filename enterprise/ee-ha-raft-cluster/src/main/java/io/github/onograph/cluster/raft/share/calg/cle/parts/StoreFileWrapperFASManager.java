package io.github.onograph.cluster.raft.share.calg.cle.parts;

import java.io.IOException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


class StoreFileWrapperFASManager {


  private final Clock clock;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final int iSm;


  private final Log log;


  private final LogFilePathManager nfLogFilePathManager;


  private ArrayList<StoreChannelFileWrapper> plNm;


  StoreFileWrapperFASManager(Clock _clock, FileSystemAbstraction _fFileSystemAbstraction, int _iSm,
      LogProvider _logProvider, LogFilePathManager _nfLogFilePathManager) {
    this.plNm = new ArrayList(_iSm);
    this.iSm = _iSm;
    this.log = _logProvider.getLog(this.getClass());
    this.nfLogFilePathManager = _nfLogFilePathManager;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.clock = _clock;
  }


  private StoreChannelFileWrapper _crafStoreChannelFileWrapper(long _lgVrin) throws IOException {
    return new StoreChannelFileWrapper(this.fFileSystemAbstraction, _lgVrin,
        this.nfLogFilePathManager.gefsmtPath(_lgVrin));
  }


  private void _dipeForSt(StoreChannelFileWrapper RNME) {
    try {
      RNME.close();
    } catch (

        IOException _iOException) {

    }
  }


  private synchronized StoreChannelFileWrapper _gefmpoStoreChannelFileWrapper(long _lgVrin) {

    Iterator _iIterator = this.plNm.iterator();

    StoreChannelFileWrapper RNME;
    do {
      if (!_iIterator.hasNext()) {
        return null;
      }

      RNME = (StoreChannelFileWrapper) _iIterator.next();
    }
    while (RNME.getLgVrin() != _lgVrin);

    _iIterator.remove();
    return RNME;
  }


  private synchronized Optional<StoreChannelFileWrapper> _puipoOptional(
      StoreChannelFileWrapper RNME) {
    this.plNm.add(RNME);
    return this.plNm.size() > this.iSm ? Optional.of(this.plNm.remove(0)) : Optional.empty();
  }


  StoreChannelFileWrapper acueStoreChannelFileWrapper(long _lgOb, long _lgVrin)
      throws IOException {

    StoreChannelFileWrapper RNME = this._gefmpoStoreChannelFileWrapper(_lgVrin);
    if (RNME == null) {
      RNME = this._crafStoreChannelFileWrapper(_lgVrin);
    }

    RNME.getStoreChannel().position(_lgOb);
    return RNME;
  }


  synchronized void cls() throws IOException {

    Iterator _iterator = this.plNm.iterator();

    while (_iterator.hasNext()) {

      StoreChannelFileWrapper RNME = (StoreChannelFileWrapper) _iterator.next();
      RNME.close();
    }

    this.plNm.clear();
    this.plNm = null;
  }


  synchronized void prnForTi(long _lgAm, TimeUnit _timeUnit) {
    if (this.plNm != null) {

      long _lgMte = this.clock.millis() - _timeUnit.toMillis(_lgAm);

      Iterator _iIterator = this.plNm.iterator();

      while (_iIterator.hasNext()) {

        StoreChannelFileWrapper RNME = (StoreChannelFileWrapper) _iIterator.next();
        if (RNME.getLgSt() < _lgMte) {
          this._dipeForSt(RNME);
          _iIterator.remove();
        }
      }
    }
  }


  public synchronized void prnForTi(long _lgVrin) {
    if (this.plNm != null) {

      Iterator _iIterator = this.plNm.iterator();

      while (_iIterator.hasNext()) {

        StoreChannelFileWrapper RNME = (StoreChannelFileWrapper) _iIterator.next();
        if (RNME.getLgVrin() == _lgVrin) {
          this._dipeForSt(RNME);
          _iIterator.remove();
        }
      }
    }
  }


  void reeeForSt(StoreChannelFileWrapper RNME) {
    RNME.setesa(this.clock.millis());

    Optional<StoreChannelFileWrapper> _optionalOoStoreChannelFileWrapper = this._puipoOptional(
        RNME);
    _optionalOoStoreChannelFileWrapper.ifPresent(this::_dipeForSt);
  }
}
