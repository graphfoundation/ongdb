package io.github.onograph.dbms;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.neo4j.kernel.database.NamedDatabaseId;


public final class DbmsResolverAction {


  private static final DbmsResolverAction SIP_DBMS_RESOLVER_ACTION = new DbmsResolverAction(null,
      Map.of(), null);


  private final NamedDatabaseId idpNamedDatabaseId;


  private final Map<String, PriorityType> mapTdsd;


  private final Throwable pocThrowable;


  private DbmsResolverAction(NamedDatabaseId _idpNamedDatabaseId,
      Map<String, PriorityType> _mapTdsd, Throwable _pocThrowable) {
    this.mapTdsd = Map.copyOf(_mapTdsd);
    this.idpNamedDatabaseId = _idpNamedDatabaseId;
    this.pocThrowable = _pocThrowable;
  }


  public static RequiresGeneration paietaeDbmsResolverActionRequiresGeneration(
      NamedDatabaseId _namedDatabaseId, Throwable _pocThrowable) {
    return new Generator(_namedDatabaseId, _pocThrowable);
  }


  public static HasImportant pritrDbmsResolverActionHasImportant(
      Set<NamedDatabaseId> _setDpNamedDatabaseId) {
    return new Generator(Set.of(), _setDpNamedDatabaseId);
  }


  public static HasImportant prottaeDbmsResolverActionHasImportant(
      NamedDatabaseId _pdNamedDatabaseId) {
    return pritrDbmsResolverActionHasImportant(Set.of(_pdNamedDatabaseId));
  }


  public static DbmsResolverAction sipDbmsResolverAction() {
    return SIP_DBMS_RESOLVER_ACTION;
  }


  public static HasDefined tagsDbmsResolverActionHasDefined(
      Set<NamedDatabaseId> _setDtbssNamedDatabaseId) {
    return new Generator(_setDtbssNamedDatabaseId, Set.of());
  }


  Optional<Throwable> casofpnOptional(NamedDatabaseId _namedDatabaseId) {

    boolean _isPhdt =
        this.pocThrowable != null && Objects.equals(_namedDatabaseId, this.idpNamedDatabaseId);
    return _isPhdt ? Optional.of(this.pocThrowable) : Optional.empty();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      DbmsResolverAction _thaDbmsResolverAction = (DbmsResolverAction) obj;
      return Objects.equals(this.mapTdsd, _thaDbmsResolverAction.mapTdsd) &&
          Objects.equals(this.idpNamedDatabaseId, _thaDbmsResolverAction.idpNamedDatabaseId) &&
          Objects.equals(this.pocThrowable, _thaDbmsResolverAction.pocThrowable);
    } else {
      return false;
    }
  }


  Set<String> exctrSet() {
    return this.mapTdsd.keySet();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mapTdsd, this.idpNamedDatabaseId, this.pocThrowable);
  }


  boolean isCauchfoForSt(String gdbName) {
    return !this.mapTdsd.containsKey(gdbName);
  }


  boolean isOvipruflfForSt(String gdbName) {
    return this.mapTdsd.containsKey(gdbName);
  }


  boolean isShdbeedapiyfForSt(String gdbName) {
    return this.mapTdsd.get(gdbName) == PriorityType.PT_TOP;
  }


  boolean isSil() {
    return this.mapTdsd.isEmpty();
  }


  private enum PriorityType {


    PT_TOP,

    PT_STANDARD


  }


  interface HasDefined extends RequiresGeneration {


    RequiresGeneration pritrDbmsResolverActionRequiresGeneration(
        Set<NamedDatabaseId> _setVNamedDatabaseId);
  }


  interface HasImportant extends RequiresGeneration {


    RequiresGeneration tagsDbmsResolverActionRequiresGeneration(
        Set<NamedDatabaseId> _setVarNamedDatabaseId);
  }


  interface RequiresGeneration {


    DbmsResolverAction create();
  }


  static class Generator implements HasImportant, HasDefined, RequiresGeneration {


    private NamedDatabaseId dpNamedDatabaseId;


    private Throwable pocThrowable;


    private Set<NamedDatabaseId> setPtNamedDatabaseId;


    private Set<NamedDatabaseId> setTnNamedDatabaseId;

    private Generator(NamedDatabaseId _dpNamedDatabaseId, Throwable _pocThrowable) {
      this.pocThrowable = _pocThrowable;
      this.dpNamedDatabaseId = _dpNamedDatabaseId;
      this.setTnNamedDatabaseId = Set.of();
      this.setPtNamedDatabaseId = Set.of(_dpNamedDatabaseId);
    }

    private Generator(Set<NamedDatabaseId> _setTnNamedDatabaseId,
        Set<NamedDatabaseId> _setTpNamedDatabaseId) {
      this.setPtNamedDatabaseId = _setTpNamedDatabaseId;
      this.setTnNamedDatabaseId = _setTnNamedDatabaseId;
    }

    @Override
    public DbmsResolverAction create() {

      Map<String, PriorityType> _mapTressd =
          this.setTnNamedDatabaseId.stream().map(NamedDatabaseId::name).distinct()
              .collect(Collectors.toMap(Function.identity(), (ignored) ->
              {
                return PriorityType.PT_STANDARD;
              }));

      Map<String, PriorityType> _mapTpsd =
          this.setPtNamedDatabaseId.stream().map(NamedDatabaseId::name).distinct()
              .collect(Collectors.toMap(Function.identity(), (ignored) ->
              {
                return PriorityType.PT_TOP;
              }));
      _mapTressd.putAll(_mapTpsd);
      return new DbmsResolverAction(this.dpNamedDatabaseId, _mapTressd, this.pocThrowable);
    }

    @Override
    public RequiresGeneration pritrDbmsResolverActionRequiresGeneration(
        Set<NamedDatabaseId> _setDtbssNamedDatabaseId) {
      this.setPtNamedDatabaseId = _setDtbssNamedDatabaseId;
      return this;
    }

    @Override
    public RequiresGeneration tagsDbmsResolverActionRequiresGeneration(
        Set<NamedDatabaseId> _setDtbssNamedDatabaseId) {
      this.setTnNamedDatabaseId = _setDtbssNamedDatabaseId;
      return this;
    }
  }
}
