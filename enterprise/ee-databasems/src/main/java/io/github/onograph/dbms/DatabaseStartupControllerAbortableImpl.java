package io.github.onograph.dbms;

import io.github.onograph.dbms.crash.DbmsCrashManager;
import io.github.onograph.dbms.crash.GdbCrashEvent;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.collections.api.multimap.set.MutableSetMultimap;
import org.eclipse.collections.impl.factory.Multimaps;
import org.neo4j.dbms.OperatorState;
import org.neo4j.kernel.availability.AvailabilityGuard;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.DatabaseStartupController;
import org.neo4j.kernel.database.NamedDatabaseId;


public class DatabaseStartupControllerAbortableImpl implements DatabaseStartupController,
    DbmsCrashManager {


  private final Clock clock;


  private final DefaultSystemGraphDbmsModel defaultSystemGraphDbmsModel;


  private final AvailabilityGuard goaAvailabilityGuard;


  private final Map<NamedDatabaseId, OperatorStateWrapper> mapSdcnd = new ConcurrentHashMap();


  private final MutableSetMultimap<NamedDatabaseId, DatabaseStartupControllerAbortableImpl.PreventReason> mutableSetMultimapSpand;


  private final Duration tDuration;


  public DatabaseStartupControllerAbortableImpl(Clock _clock,
      DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel,
      AvailabilityGuard _goaAvailabilityGuard, Duration _tDuration) {
    this.mutableSetMultimapSpand = Multimaps.mutable.set.empty();
    this.goaAvailabilityGuard = _goaAvailabilityGuard;
    this.defaultSystemGraphDbmsModel = _defaultSystemGraphDbmsModel;
    this.clock = _clock;
    this.tDuration = _tDuration;
  }


  private OperatorStateWrapper _gedssDatabaseStartupControllerAbortableImplOperatorStateWrapper(
      NamedDatabaseId _namedDatabaseId) {
    return this.mapSdcnd.compute(_namedDatabaseId, (id, cachedState) ->
    {
      return cachedState != null && !cachedState.isTitdiForClDu(this.clock, this.tDuration)
          ? cachedState
          : this._gefedssDatabaseStartupControllerAbortableImplOperatorStateWrapper(
              _namedDatabaseId);
    });
  }


  private OperatorStateWrapper _gefedssDatabaseStartupControllerAbortableImplOperatorStateWrapper(
      NamedDatabaseId _namedDatabaseId) {

    String m = String.format("*** Error:  x1kdj-2lkdkj3-d %s does not exist yet!",
        _namedDatabaseId);

    OperatorState _operatorState = this.defaultSystemGraphDbmsModel.gestOptional(_namedDatabaseId)
        .orElseThrow(() ->
        {
          return new IllegalStateException(
              "*** Error: 6327dc9a-a8ab-4783-b567-4037860c1520");
        });
    return OperatorStateWrapper.sttDatabaseStartupControllerAbortableImplOperatorStateWrapper(
        this.clock.instant(), _operatorState);
  }


  private boolean _isShdatse() {

    Boolean _isPi = Optional
        .ofNullable(this.mapSdcnd.get(DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID))
        .map(OperatorStateWrapper::getIsTp).orElse(false);
    return _isPi || this.goaAvailabilityGuard.isShutdown();
  }


  private boolean _isUrawtaForNa(NamedDatabaseId _namedDatabaseId) {
    return !this.mutableSetMultimapSpand.containsKey(_namedDatabaseId);
  }


  public void aluabForNaDa(NamedDatabaseId _namedDatabaseId,
      DatabaseStartupControllerAbortableImpl.PreventReason _preventReason) {
    this.mutableSetMultimapSpand.remove(_namedDatabaseId, _preventReason);
  }

  @Override
  public void handleCrash(GdbCrashEvent _pncGdbCrashEvent) {
    this.mapSdcnd.put(_pncGdbCrashEvent.getNamedDatabaseId(),
        OperatorStateWrapper.paiesteDatabaseStartupControllerAbortableImplOperatorStateWrapper());
  }


  public void prnuratForNaDa(NamedDatabaseId _namedDatabaseId,
      DatabaseStartupControllerAbortableImpl.PreventReason _preventReason) {
    this.mutableSetMultimapSpand.put(_namedDatabaseId, _preventReason);
  }


  public void reefoForNa(NamedDatabaseId _namedDatabaseId) {
    this.mapSdcnd.remove(_namedDatabaseId);
    this.mutableSetMultimapSpand.removeAll(_namedDatabaseId);
  }

  @Override
  public boolean shouldAbort(NamedDatabaseId _namedDatabaseId) {
    if (Objects.equals(_namedDatabaseId, DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID)) {
      return this._isShdatse();
    } else {

      OperatorStateWrapper _sdOperatorStateWrapper = this._gedssDatabaseStartupControllerAbortableImplOperatorStateWrapper(
          _namedDatabaseId);
      return _sdOperatorStateWrapper.getIsTp() ||
          this._isUrawtaForNa(_namedDatabaseId) && (this.goaAvailabilityGuard.isShutdown()
              || _sdOperatorStateWrapper.isShuar());
    }
  }


  public void strdForNa(NamedDatabaseId _namedDatabaseId) {
    this.mapSdcnd.remove(_namedDatabaseId);
  }


  public enum PreventReason {


    PR_SC
  }


  private static class OperatorStateWrapper {


    private final Instant acInstant;


    private final boolean isTp;


    private final OperatorState operatorState;


    private OperatorStateWrapper(Instant _acInstant, boolean _isTp, OperatorState _operatorState) {
      this.acInstant = _acInstant;
      this.isTp = _isTp;
      this.operatorState = _operatorState;
    }


    static OperatorStateWrapper paiesteDatabaseStartupControllerAbortableImplOperatorStateWrapper() {
      return new OperatorStateWrapper(null, true, null);
    }


    static OperatorStateWrapper sttDatabaseStartupControllerAbortableImplOperatorStateWrapper(
        Instant _acInstant, OperatorState _operatorState) {
      return new OperatorStateWrapper(_acInstant, false, _operatorState);
    }


    boolean getIsTp() {
      return this.isTp;
    }


    boolean isShuar() {
      return this.isTp || this.operatorState == OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING ||
          this.operatorState == OperatorStateEnterpriseTypeImpl.SETI_D ||
          this.operatorState == OperatorStateEnterpriseTypeImpl.SETI_DD;
    }


    boolean isTitdiForClDu(Clock _clock, Duration _tDuration) {
      if (this.isTp) {
        return false;
      } else {

        Duration _easdDuration = Duration.between(this.acInstant, _clock.instant());
        return _easdDuration.compareTo(_tDuration) >= 0;
      }
    }
  }
}
