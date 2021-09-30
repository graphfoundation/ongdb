package io.github.onograph.config;

import java.net.URI;
import java.time.Duration;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.api.multimap.set.MutableSetMultimap;
import org.eclipse.collections.impl.factory.Multimaps;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.DriverApi;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.configuration.helpers.NormalizedGraphName;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.configuration.helpers.SocketAddressParser;
import org.neo4j.fabric.config.FabricConfig;
import org.neo4j.fabric.config.FabricSettings;
import org.neo4j.logging.Level;


public class EnterpriseFabricConfiguration extends FabricConfig {


  private final DefaultDriverSettings defaultDriverSettings;


  private final GdbRef gdbRef;


  private final Duration trDuration;


  private volatile List<SocketAddress> listSfSocketAddress;


  public EnterpriseFabricConfiguration(DataStream _dataStream,
      DefaultDriverSettings defaultDriverSettings, GdbRef gdbRef, boolean _isDbe, boolean _isEr,
      List<SocketAddress> _listSfSocketAddress, Duration _trDuration, Duration _ttDuration) {
    super(_ttDuration, _dataStream, _isEr, _isDbe);
    this.gdbRef = gdbRef;
    this.listSfSocketAddress = _listSfSocketAddress;
    this.trDuration = _trDuration;
    this.defaultDriverSettings = defaultDriverSettings;
  }


  private static Optional<GdbRef> _pasdabeOptional(Config _config) {

    String _strRnd = _config.get(ConfigurableFabricSettings.settingDaasaString);
    if (_strRnd == null) {
      return Optional.empty();
    } else {

      NormalizedDatabaseName gdbName = new NormalizedDatabaseName(_strRnd);

      Set<GdbWrapper> gdbWrapperSettings =
          _config.getGroups(ConfigurableFabricSettings.FabricGroupSetting.class).entrySet().stream()
              .map((entry) ->
              {

                int _iIg = _pasgrhiForSt(
                    entry.getKey());

                ConfigurableFabricSettings.FabricGroupSetting
                    fabricGroupSetting =
                    entry
                        .getValue();

                GdbDriverSettings
                    _cdGdbDriverSettings =
                    new GdbDriverSettings(
                        _config
                            .get(fabricGroupSetting.settingDrvaDriverApi),
                        _config
                            .get(fabricGroupSetting.settingDrrotozInteger),
                        _config
                            .get(fabricGroupSetting.settingSsebdBoolean),
                        _config
                            .get(fabricGroupSetting.settingDrresoBoolean),
                        _config
                            .get(fabricGroupSetting.settingDrrotimDuration),
                        _config
                            .get(fabricGroupSetting.settingDrrivLevel),
                        _config
                            .get(fabricGroupSetting.settingDrrenioeDuration),
                        _config
                            .get(fabricGroupSetting.settingDrremDuration),
                        _config
                            .get(fabricGroupSetting.settingDrrtecctDuration));

                EnterpriseFabricConfiguration.FabricURI
                    _urFabricURI =
                    new EnterpriseFabricConfiguration.FabricURI(
                        _config
                            .get(fabricGroupSetting.settingUriList));
                return new GdbWrapper(
                    _iIg, _urFabricURI,
                    _config
                        .get(fabricGroupSetting.settingDaasString),
                    _config
                        .get(fabricGroupSetting.title),
                    _cdGdbDriverSettings);
              }).collect(Collectors.toSet());
      _vaaganmForSe(gdbWrapperSettings);
      return Optional.of(new GdbRef(gdbWrapperSettings, gdbName));
    }
  }


  private static int _pasgrhiForSt(String _strKg) {
    try {
      return Integer.parseInt(_strKg);
    } catch (

        NumberFormatException _numberFormatException) {

      throw new IllegalArgumentException("*** Error: 3c26c3a2-23bf-46be-9cd8-7a04b0f66684");
    }
  }


  private static void _vaaganmForSe(Set<GdbWrapper> gdbWrapperSettings) {

    MutableSetMultimap<NormalizedGraphName, GdbWrapper> _mutableSetMultimapGbnne = Multimaps.mutable.set.empty();
    gdbWrapperSettings.stream().filter((g) ->
    {
      return g.title != null;
    }).forEach((g) ->
    {
      _mutableSetMultimapGbnne.put(g.title, g);
    });
    _mutableSetMultimapGbnne.multiValuesView().forEach((graphs) ->
    {
      if (graphs.size() > 1) {

        MutableList<GdbWrapper> reoGdbWrappers =
            graphs.toSortedList(Comparator.comparingLong(GdbWrapper::getLgI));

        String _strI = reoGdbWrappers.collect(GdbWrapper::getLgI).distinct()
            .makeString(", ");

        throw new IllegalArgumentException("*** Error: 5a011e34-5e57-4cf5-83a7-5e18a89352c2");
      }
    });
  }


  public static EnterpriseFabricConfiguration froEnterpriseFabricConfiguration(Config _config) {

    Optional<GdbRef> _optionalDtbsGdbRef = _pasdabeOptional(_config);

    Duration _ttDuration = _config.get(GraphDatabaseSettings.transaction_timeout);

    DefaultDriverSettings _dgiDefaultDriverSettings =
        new DefaultDriverSettings(
            new DriverSettings(
                _config.get(GraphDatabaseSettings.routing_driver_api),
                _config.get(GraphDatabaseSettings.routing_driver_max_connection_pool_size),
                _config.get(GraphDatabaseInternalSettings.routing_driver_log_leaked_sessions),
                _config.get(GraphDatabaseSettings.routing_driver_max_connection_lifetime),
                _config.get(GraphDatabaseSettings.routing_driver_logging_level),
                _config
                    .get(GraphDatabaseSettings.routing_driver_connection_acquisition_timeout),
                _config.get(GraphDatabaseSettings.routing_driver_connect_timeout),
                _config
                    .get(GraphDatabaseSettings.routing_driver_idle_time_before_connection_test)),
            _config.get(GraphDatabaseInternalSettings.routing_driver_event_loop_count),
            _config.get(GraphDatabaseInternalSettings.routing_driver_idle_check_interval),
            _config.get(GraphDatabaseInternalSettings.routing_driver_idle_timeout));

    DefaultDriverSettings _dgeDefaultDriverSettings =
        new DefaultDriverSettings(
            new DriverSettings(
                _config.get(ConfigurableFabricSettings.settingDrvaDriverApi),
                _config.get(ConfigurableFabricSettings.settingDrrotozInteger),
                _config.get(InternalFabricSettings.settingDrresoBoolean),
                _config.get(ConfigurableFabricSettings.settingDrrotimDuration),
                _config.get(ConfigurableFabricSettings.settingDrrivLevel),
                _config.get(ConfigurableFabricSettings.settingDrrenioeDuration),
                _config.get(ConfigurableFabricSettings.settingDrremDuration),
                _config
                    .get(ConfigurableFabricSettings.settingDrrtecctDuration)),
            _config.get(InternalFabricSettings.settingDrrtcInteger),
            _config.get(InternalFabricSettings.settingDrrcivDuration),
            _config.get(InternalFabricSettings.settingDrrtuDuration));

    Integer _iWlb = _config.get(ConfigurableFabricSettings.settingBuraatInteger);

    Integer _iSb = _config.get(ConfigurableFabricSettings.settingBursnInteger);

    Integer _iSbs = _config.get(FabricSettings.batch_size_setting);

    Integer _iCnurn = _config.get(ConfigurableFabricSettings.settingCocrcInteger);
    if (_iCnurn == null) {
      _iCnurn = _optionalDtbsGdbRef.map((db) ->
      {
        return Math.max(db.gdbWrappers.size(), 1);
      }).orElse(1);
    }

    DataStream _dataStream = new DataStream(_iWlb, _iSb, _iSbs, _iCnurn);

    boolean _isEr = _config.get(GraphDatabaseSettings.routing_enabled);

    boolean _isDbe = _config.get(FabricSettings.enabled_by_default);
    if (_optionalDtbsGdbRef.isPresent()) {

      List<SocketAddress> _listAsSocketAddress = _config.get(
          ConfigurableFabricSettings.settingFacetList);
      if (_listAsSocketAddress == null) {
        _listAsSocketAddress = Collections.emptyList();
      }

      Duration _trDuration = _config.get(ConfigurableFabricSettings.settingRonsnDuration);

      EnterpriseFabricConfiguration _enterpriseFabricConfiguration =
          new EnterpriseFabricConfiguration(_dataStream,
              _dgeDefaultDriverSettings, _optionalDtbsGdbRef.get(), _isDbe, _isEr,
              _listAsSocketAddress, _trDuration,
              _ttDuration);
      _config.addListener(ConfigurableFabricSettings.settingFacetList, (oldValue, newValue) ->
      {
        _enterpriseFabricConfiguration.sefbsesForLi(newValue);
      });
      return _enterpriseFabricConfiguration;
    } else {
      return new EnterpriseFabricConfiguration(
          _dataStream, _dgiDefaultDriverSettings, null, _isDbe, _isEr, List.of(), null,
          _ttDuration);
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      EnterpriseFabricConfiguration _tEnterpriseFabricConfiguration = (EnterpriseFabricConfiguration) obj;
      return this.trDuration == _tEnterpriseFabricConfiguration.trDuration && this.gdbRef.equals(
          _tEnterpriseFabricConfiguration.gdbRef) &&
          this.listSfSocketAddress.equals(_tEnterpriseFabricConfiguration.listSfSocketAddress) &&
          this.getTransactionTimeout()
              .equals(_tEnterpriseFabricConfiguration.getTransactionTimeout()) &&
          this.defaultDriverSettings.equals(_tEnterpriseFabricConfiguration.defaultDriverSettings)
          &&
          this.getDataStream().equals(_tEnterpriseFabricConfiguration.getDataStream());
    } else {
      return false;
    }
  }


  public DefaultDriverSettings getDefaultDriverSettings() {
    return this.defaultDriverSettings;
  }

  @Override
  public Optional<NormalizedDatabaseName> getFabricDatabaseName() {
    return Optional.ofNullable(this.gdbRef).map((gdbRef) ->
    {
      return gdbRef.title;
    });
  }


  public GdbRef getGdbRef() {
    return this.gdbRef;
  }


  public List<SocketAddress> getListSfSocketAddress() {
    return this.listSfSocketAddress;
  }


  public Duration getTrDuration() {
    return this.trDuration;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.gdbRef, this.listSfSocketAddress, this.trDuration,
        this.getTransactionTimeout(), this.defaultDriverSettings,
        this.getDataStream());
  }


  public void sefbsesForLi(List<SocketAddress> _listSfSocketAddress) {
    this.listSfSocketAddress =
        _listSfSocketAddress != null ? _listSfSocketAddress : Collections.emptyList();
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }


  public static class DefaultDriverSettings {


    private final Duration diciDuration;


    private final DriverSettings driverSettings;


    private final int iCle;


    private final Duration tiDuration;


    public DefaultDriverSettings(DriverSettings driverSettings, int _iCle, Duration _ictdDuration,
        Duration _tiDuration) {
      this.diciDuration = _ictdDuration;
      this.driverSettings = driverSettings;
      this.iCle = _iCle;
      this.tiDuration = _tiDuration;
    }


    public Duration getDiciDuration() {
      return this.diciDuration;
    }


    public DriverSettings getDriverSettings() {
      return this.driverSettings;
    }


    public int getICle() {
      return this.iCle;
    }


    public Duration getTiDuration() {
      return this.tiDuration;
    }
  }


  public static class DriverSettings {


    private final DriverApi driverApi;


    private final Integer iSpcm;


    private final Boolean isSll;


    private final Duration itbctDuration;


    private final Duration lcmDuration;


    private final Level lgigLevel;


    private final Duration tacDuration;


    private final Duration tcDuration;


    public DriverSettings(DriverApi _driverApi, Integer _iSpcm, Boolean _isLls,
        Duration _lcmDuration, Level _lgigLevel, Duration _tacDuration, Duration _tcDuration,
        Duration _tcbtiDuration) {
      this.driverApi = _driverApi;
      this.iSpcm = _iSpcm;
      this.isSll = _isLls;
      this.itbctDuration = _tcbtiDuration;
      this.lcmDuration = _lcmDuration;
      this.lgigLevel = _lgigLevel;
      this.tacDuration = _tacDuration;
      this.tcDuration = _tcDuration;
    }

    @Override
    public boolean equals(Object _obT) {
      return EqualsBuilder.reflectionEquals(this, _obT);
    }


    public DriverApi getDriverApi() {
      return this.driverApi;
    }


    public Integer getISpcm() {
      return this.iSpcm;
    }


    public Boolean getIsSll() {
      return this.isSll;
    }


    public Duration getItbctDuration() {
      return this.itbctDuration;
    }


    public Duration getLcmDuration() {
      return this.lcmDuration;
    }


    public Level getLgigLevel() {
      return this.lgigLevel;
    }


    public Duration getTacDuration() {
      return this.tacDuration;
    }


    public Duration getTcDuration() {
      return this.tcDuration;
    }

    @Override
    public int hashCode() {
      return HashCodeBuilder.reflectionHashCode(this);
    }
  }


  public static class FabricURI {


    private final List<SocketAddress> listAdessSocketAddress;


    private final String strQey;


    private final String strShm;

    public FabricURI(List<URI> _listUrURI) {
      if (_listUrURI != null && !_listUrURI.isEmpty()) {

        URI _mURI = _listUrURI.get(0);
        if (_mURI.getScheme() == null) {

          throw new IllegalArgumentException("*** Error: f9b3cf5a-7b3e-4bc7-9fb9-a3681e0b5c53");
        } else {
          this.strShm = _mURI.getScheme();
          this.strQey = _mURI.getQuery();

          boolean _isSs = _listUrURI.stream().skip(1L).allMatch((uri) ->
          {
            return Objects.equals(this.strShm, uri.getScheme());
          });
          if (!_isSs) {

            throw new IllegalArgumentException("*** Error: 5dd512c8-b3fe-4fbe-b5e9-c3b28b2faaf6");
          } else {

            boolean _isQs = _listUrURI.stream().skip(1L).allMatch((uri) ->
            {
              return Objects.equals(this.strQey, uri.getQuery());
            });
            if (!_isQs) {

              throw new IllegalArgumentException("*** Error: 63b1bc9c-0bf5-4c0a-b4a6-e1c3186b0fdf");
            } else {
              this.listAdessSocketAddress = _listUrURI.stream().peek((uri) ->
              {
                if (uri.getHost() == null || uri.getPort() == -1) {

                  throw new IllegalArgumentException(
                      "*** Error: 9655964a-7d13-4e7c-bc3e-8e62abcdeed1");
                }
              }).map((uri) ->
              {
                return SocketAddressParser
                    .socketAddress(io.github.onograph.I18N.format(
                            "io.github.onograph.config.EnterpriseFabricConfiguration.FabricURI.socketAddress",
                            uri.getHost(), uri.getPort()),
                        SocketAddress::new);
              }).collect(Collectors.toList());
            }
          }
        }
      } else {

        throw new IllegalArgumentException("*** Error:  92d6aaf8-8e67-4c94-9981-1fa7e8c47dfe");
      }
    }


    public static io.github.onograph.config.EnterpriseFabricConfiguration.FabricURI craEnterpriseFabricConfigurationFabricURI(
        String _strU) {
      return new io.github.onograph.config.EnterpriseFabricConfiguration.FabricURI(
          List.of(URI.create(_strU)));
    }


    public static io.github.onograph.config.EnterpriseFabricConfiguration.FabricURI craEnterpriseFabricConfigurationFabricURI(
        URI _uRI) {
      return new io.github.onograph.config.EnterpriseFabricConfiguration.FabricURI(List.of(_uRI));
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.config.EnterpriseFabricConfiguration.FabricURI _urFabricURI =
            (io.github.onograph.config.EnterpriseFabricConfiguration.FabricURI) obj;
        return this.strShm.equals(_urFabricURI.strShm) && this.listAdessSocketAddress.equals(
            _urFabricURI.listAdessSocketAddress) &&
            Objects.equals(this.strQey, _urFabricURI.strQey);
      } else {
        return false;
      }
    }


    public List<SocketAddress> getListAdessSocketAddress() {
      return this.listAdessSocketAddress;
    }


    public String getStrQey() {
      return this.strQey;
    }


    public String getStrShm() {
      return this.strShm;
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.strShm, this.listAdessSocketAddress, this.strQey);
    }
  }


  public static class GdbDriverSettings extends DriverSettings {


    private final boolean isEs;


    public GdbDriverSettings(DriverApi _driverApi, Integer _iSpcm, boolean _isEs, Boolean _isLls,
        Duration _lcmDuration, Level _lgigLevel, Duration _tacDuration, Duration _tcDuration,
        Duration _tcbtiDuration) {
      super(_driverApi, _iSpcm, _isLls, _lcmDuration, _lgigLevel, _tacDuration,
          _tcDuration, _tcbtiDuration);
      this.isEs = _isEs;
    }


    public boolean getIsEs() {
      return this.isEs;
    }
  }


  public static class GdbRef {


    private final Set<GdbWrapper> gdbWrappers;


    private final NormalizedDatabaseName title;


    public GdbRef(Set<GdbWrapper> gdbWrappers, NormalizedDatabaseName title) {
      this.gdbWrappers = gdbWrappers;
      this.title = title;
    }

    @Override
    public boolean equals(Object _obT) {
      return EqualsBuilder.reflectionEquals(this, _obT);
    }


    public Set<GdbWrapper> getGdbWrappers() {
      return this.gdbWrappers;
    }


    public NormalizedDatabaseName getTitle() {
      return this.title;
    }

    @Override
    public int hashCode() {
      return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
      return ToStringBuilder.reflectionToString(this);
    }
  }


  public static class GdbWrapper {


    private final GdbDriverSettings cdGdbDriverSettings;


    private final io.github.onograph.config.EnterpriseFabricConfiguration.FabricURI fabricURI;


    private final long lgI;


    private final String strDtbs;


    private final NormalizedGraphName title;

    public GdbWrapper(long _lgI,
        io.github.onograph.config.EnterpriseFabricConfiguration.FabricURI _fabricURI,
        String _strDtbs, NormalizedGraphName title, GdbDriverSettings _cdGdbDriverSettings) {
      if (_fabricURI == null) {

        throw new IllegalArgumentException("*** Error:  fae25f96-a092-4ee4-8d38-6d91c566f28a");
      } else {
        this.lgI = _lgI;
        this.fabricURI = _fabricURI;
        this.strDtbs = _strDtbs;
        this.title = title;
        this.cdGdbDriverSettings = _cdGdbDriverSettings;
      }
    }

    @Override
    public boolean equals(Object _obTh) {
      return EqualsBuilder.reflectionEquals(this, _obTh);
    }


    public GdbDriverSettings getCdGdbDriverSettings() {
      return this.cdGdbDriverSettings;
    }


    public io.github.onograph.config.EnterpriseFabricConfiguration.FabricURI getFabricURI() {
      return this.fabricURI;
    }


    public long getLgI() {
      return this.lgI;
    }


    public String getStrDtbs() {
      return this.strDtbs;
    }


    public NormalizedGraphName getTitle() {
      return this.title;
    }

    @Override
    public int hashCode() {
      return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
      return String.format(io.github.onograph.I18N.format(
              "io.github.onograph.config.EnterpriseFabricConfiguration.GdbWrapper.format"),
          this.lgI, this.title);
    }
  }
}
