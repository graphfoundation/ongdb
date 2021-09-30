package io.github.onograph.server.security.auth;

import io.github.onograph.config.Security;
import io.github.onograph.config.SettingsDeclarationEnterpriseInteralImpl;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.naming.AuthenticationException;
import javax.naming.CommunicationException;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import javax.naming.ldap.StartTlsRequest;
import javax.naming.ldap.StartTlsResponse;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.AllowAllCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.ldap.DefaultLdapRealm;
import org.apache.shiro.realm.ldap.JndiLdapContextFactory;
import org.apache.shiro.realm.ldap.LdapContextFactory;
import org.apache.shiro.realm.ldap.LdapUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.neo4j.configuration.Config;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.graphdb.security.AuthProviderFailedException;
import org.neo4j.graphdb.security.AuthProviderTimeoutException;
import org.neo4j.graphdb.security.AuthorizationExpiredException;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.server.security.auth.Neo4jPrincipal;
import org.neo4j.server.security.auth.ShiroAuthToken;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;
import org.neo4j.string.SecureString;


public class EnterpriseDefaultLdapRealm extends DefaultLdapRealm implements Lifecycle,
    AuthorizationInfoSa {


  public static final String LDA_CNX_DEN_CLX_MSX =
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.var3");


  public static final String LDA_CNX_TMT_CLX_MSX =
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.var");


  public static final String LDA_RDX_TMT_CLX_MSX =
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.var2");


  public static final String LDPA = io.github.onograph.TokenConstants.LDAP;


  private static final String GRP_DEIT = ";";


  private static final String JND_LDA_CNX_TMT_MSX_PAR =
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.var4");


  private static final String JND_LDA_CONT_TMT = io.github.onograph.TokenConstants.COM__SUN__JNDI__LDAP__CONNECT__TIMEOUT;


  private static final String JND_LDA_RDX_TMT = io.github.onograph.TokenConstants.COM__SUN__JNDI__LDAP__READ__TIMEOUT;


  private static final String JND_LDA_RDX_TMT_MSX_PAR =
      io.github.onograph.I18N.format(
          "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.var5");


  private static final String MK_GRP = "\\s*('(.+)'|\"(.+)\"|(\\S)|(\\S.*\\S))\\s*";


  private static final String MK_VAU_DEIT = "=";


  private static final String RLX_DEIT = ",";


  private static final String VAU_GRP = "\\s*(.*)";


  private final AbstractSecurityLog abstractSecurityLog;


  private final Boolean isEa;


  private final Boolean isEa2;


  private final Log log;


  private final SecureHasher secureHasher;


  private final Pattern vkPattern = Pattern.compile(
      "\\s*('(.+)'|\"(.+)\"|(\\S)|(\\S.*\\S))\\s*=\\s*(.*)");


  private Boolean isAfasu;


  private Boolean isTsu;


  private boolean isUsa;


  private List<String> listNamString;


  private Map<String, Collection<String>> mapMrtgsc;


  private String strFsu;


  private String strGpa;


  private String strNau;


  private String strUsb;


  public EnterpriseDefaultLdapRealm(AbstractSecurityLog _abstractSecurityLog, Config _config,
      boolean _isEa, boolean _isEa2, LogProvider _logProvider, SecureHasher _secureHasher) {
    this.abstractSecurityLog = _abstractSecurityLog;
    this.log = _logProvider.getLog(this.getClass());
    this.secureHasher = _secureHasher;
    this.isEa = _isEa;
    this.isEa2 = _isEa2;
    this.setName(io.github.onograph.TokenConstants.LDAP);
    this._cofurlForCo(_config);
    _config.addListener(Security.settingLduiouopString, (before, after) ->
    {
      this._upastgForCoT(this::_upegptrlmpForSt, after);
    });
    _config.addListener(Security.settingLdutieetString, (before, after) ->
    {
      this._upastgForCoT(this::setUserDnTemplate, after);
    });
    _config.addListener(Security.settingLduiorceString, (before, after) ->
    {
      this._upastgForCoT((setting) ->
      {
        this.strUsb = setting;
      }, after);
    });
    _config.addListener(Security.settingLduiorctString, (before, after) ->
    {
      this._upastgForCoT((setting) ->
      {
        this.strFsu = setting;
      }, after);
    });
    _config.addListener(Security.settingLduioubiresList, (before, after) ->
    {
      this._upastgForCoT((setting) ->
      {
        this.listNamString = setting;
      }, after);
    });
    _config.addListener(Security.settingLdutiertteString, (before, after) ->
    {
      this._upastgForCoT((setting) ->
      {
        this.strNau = setting;
      }, after);
    });
    _config.addListener(Security.settingLduioereuString, (before, after) ->
    {
      this._upastgForCoT((setting) ->
      {
        this.strGpa = setting;
      }, after);
    });
    if (this.isAuthenticationCachingEnabled()) {
      this.setCredentialsMatcher(_secureHasher.getHashedCredentialsMatcher());
    } else {
      this.setCredentialsMatcher(new AllowAllCredentialsMatcher());
    }
  }


  private static boolean _isEenalacnoteForEx(Exception _exception) {
    return _exception instanceof CommunicationException && (
        ((CommunicationException) _exception).getRootCause() instanceof SocketTimeoutException ||
            ((CommunicationException) _exception).getRootCause().getMessage().contains(
                io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.contains2")));
  }


  private static boolean _isEenalardtoForEx(Exception _exception) {
    return _exception instanceof NamingException && _exception.getMessage().contains(
        io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.contains"));
  }


  private static boolean _isEencenrsForEx(Exception _exception) {
    return _exception instanceof CommunicationException
        && ((CommunicationException) _exception).getRootCause() instanceof ConnectException;
  }


  private static boolean _isSurshanrlForAu(AuthenticationToken _authenticationToken) {
    try {
      if (!(_authenticationToken instanceof ShiroAuthToken)) {
        return false;
      } else {

        ShiroAuthToken _shiroAuthToken = (ShiroAuthToken) _authenticationToken;
        return _shiroAuthToken.getScheme().equals(io.github.onograph.TokenConstants.BASIC) &&
            _shiroAuthToken.supportsRealm(io.github.onograph.TokenConstants.LDAP);
      }
    } catch (

        InvalidAuthTokenException _invalidAuthTokenException) {
      return false;
    }
  }


  private static String _palseuString(String _strSlr) {
    return _strSlr == null ? null : (_strSlr.contains("://") ? _strSlr : "ldap://" + _strSlr);
  }


  private static String _wihraString(String _strTmlt, Object... _obArgArray) {

    String _strVr00 = String.format(_strTmlt, _obArgArray);
    return io.github.onograph.I18N.format(
        "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.wihraString", _strVr00);
  }


  private void _astvdushsi() {

    boolean _isSwp = true;
    if (this.strUsb == null || this.strUsb.isEmpty()) {

      _isSwp = false;
    }

    if (this.strFsu == null || !this.strFsu.contains("{0}")) {

    }

    if (this.listNamString == null || this.listNamString.isEmpty()) {

      _isSwp = false;
    }

    if (!_isSwp) {

      throw new IllegalArgumentException("*** Error:  70bfe41c-9372-4f52-a639-ba92cf1c29ed");
    }
  }


  private void _caariifForStSe(Set<String> _setNrString, String uname) {

    Cache<Object, AuthorizationInfo> _cacheCaoa = this.getAuthorizationCache();
    _cacheCaoa.put(uname, new SimpleAuthorizationInfo(_setNrString));
  }


  private void _cofurlForCo(Config _config) {

    JndiLdapContextFactory _jndiLdapContextFactory = new JndiLdapContextFactory();

    Map<String, Object> _mapEvrneso = _jndiLdapContextFactory.getEnvironment();

    long _lgMtc = _config.get(Security.settingLdotitDuration).toMillis();

    long _lgMtr = _config.get(Security.settingLdemDuration).toMillis();
    _mapEvrneso.put(io.github.onograph.TokenConstants.COM__SUN__JNDI__LDAP__CONNECT__TIMEOUT,
        Long.toString(_lgMtc));
    _mapEvrneso.put(io.github.onograph.TokenConstants.COM__SUN__JNDI__LDAP__READ__TIMEOUT,
        Long.toString(_lgMtr));
    _jndiLdapContextFactory.setEnvironment(_mapEvrneso);
    _jndiLdapContextFactory.setUrl(_palseuString(_config.get(Security.settingLdprrString)));
    _jndiLdapContextFactory.setAuthenticationMechanism(_config.get(Security.settingLduticsString));
    _jndiLdapContextFactory.setReferral(_config.get(Security.settingLdpfrString));
    _jndiLdapContextFactory.setSystemUsername(_config.get(Security.settingLduioteeString));

    SecureString secret = _config.get(Security.settingLduiotsdSecureString);
    _jndiLdapContextFactory.setSystemPassword(secret != null ? secret.getString() : null);
    _jndiLdapContextFactory.setPoolingEnabled(
        _config.get(SettingsDeclarationEnterpriseInteralImpl.settingLduionolBoolean));
    this.setContextFactory(_jndiLdapContextFactory);

    String _strUdt = _config.get(Security.settingLdutieetString);
    if (_strUdt != null) {
      this.setUserDnTemplate(_strUdt);
    }

    this.isTsu = _config.get(Security.settingLdsrBoolean);
    this.strUsb = _config.get(Security.settingLduiorceString);
    this.strFsu = _config.get(Security.settingLduiorctString);
    this.isUsa = _config.get(Security.settingLdutieiBoolean);
    this.strNau = _config.get(Security.settingLdutiertteString);
    this.listNamString = _config.get(Security.settingLduioubiresList);
    this.isAfasu = _config.get(Security.settingLduiosmuBoolean);
    this._upegptrlmpForSt(_config.get(Security.settingLduiouopString));
    this.strGpa = _config.get(Security.settingLduioereuString);
    this.setAuthenticationCachingEnabled(_config.get(Security.settingLduticaBoolean));
    this.setAuthorizationCachingEnabled(true);
  }


  private LdapContext _gelactussttlLdapContext(Object credsObj,
      LdapContextFactory _ldapContextFactory, Object usrPrcpl) throws NamingException {

    JndiLdapContextFactory _jndiLdapContextFactory = (JndiLdapContextFactory) _ldapContextFactory;

    Hashtable<String, Object> _hashtableEso = new Hashtable();
    _hashtableEso.put(io.github.onograph.TokenConstants.JAVA__NAMING__FACTORY__INITIAL,
        _jndiLdapContextFactory.getContextFactoryClassName());
    _hashtableEso.put(io.github.onograph.TokenConstants.JAVA__NAMING__PROVIDER__URL,
        _jndiLdapContextFactory.getUrl());

    InitialLdapContext _cInitialLdapContext = null;

    String _strMe;
    try {
      _cInitialLdapContext = new InitialLdapContext(_hashtableEso, null);

      StartTlsRequest _startTlsRequest = new StartTlsRequest();

      StartTlsResponse _startTlsResponse = (StartTlsResponse) _cInitialLdapContext.extendedOperation(
          _startTlsRequest);
      _startTlsResponse.negotiate();
      _cInitialLdapContext.addToEnvironment(
          io.github.onograph.TokenConstants.JAVA__NAMING__SECURITY__AUTHENTICATION,
          _jndiLdapContextFactory.getAuthenticationMechanism());
      _cInitialLdapContext.addToEnvironment(
          io.github.onograph.TokenConstants.JAVA__NAMING__SECURITY__PRINCIPAL, usrPrcpl);
      _cInitialLdapContext.addToEnvironment(
          io.github.onograph.TokenConstants.JAVA__NAMING__SECURITY__CREDENTIALS, credsObj);
      _cInitialLdapContext.lookup(usrPrcpl.toString());
      return _cInitialLdapContext;
    } catch (

        IOException _iOException) {
      LdapUtils.closeContext(_cInitialLdapContext);
      _strMe = _wihraString(
          io.github.onograph.I18N.format(
              "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.wihraString2"),
          this._sevString(_jndiLdapContextFactory));

      throw new CommunicationException(_iOException.getMessage());
    } catch (

        Throwable _throwable) {
      LdapUtils.closeContext(_cInitialLdapContext);
      _strMe = _wihraString(
          io.github.onograph.I18N.format(
              "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.wihraString3"),
          this._sevString(_jndiLdapContextFactory));

      throw _throwable;
    }
  }


  private LdapContext _gessldcnLdapContext(LdapContextFactory _ldapContextFactory)
      throws NamingException {
    if (this.isTsu) {

      JndiLdapContextFactory _jndiLdapContextFactory = (JndiLdapContextFactory) _ldapContextFactory;
      return this
          ._gelactussttlLdapContext(_jndiLdapContextFactory.getSystemPassword(),
              _ldapContextFactory, _jndiLdapContextFactory.getSystemUsername());
    } else {
      return _ldapContextFactory.getSystemLdapContext();
    }
  }


  private String _geueefnprpString(Object usrPrcpl) {
    if (usrPrcpl instanceof Neo4jPrincipal) {
      return ((Neo4jPrincipal) usrPrcpl).getUsername();
    } else {

      throw new IllegalStateException("*** Error: 212de941-0aa9-4262-a277-91e2e1cbe2b5");
    }
  }


  private String _geurmString(PrincipalCollection _picplPrincipalCollection) {

    String uname = null;

    Collection<?> _collectionLpObject = _picplPrincipalCollection.fromRealm(this.getName());
    if (!_collectionLpObject.isEmpty()) {
      uname = this._geueefnprpString(_collectionLpObject.iterator().next());
    } else if (this.isAfasu) {
      uname = this._geueefnprpString(_picplPrincipalCollection.getPrimaryPrincipal());
    }

    return uname;
  }


  private boolean _isAepregus() {
    return this.strGpa != null && this.strGpa != "";
  }


  private Map<String, Collection<String>> _pagtremiMap(String _strSmrtg) {

    Map<String, Collection<String>> _mapMsc = new HashMap();
    if (_strSmrtg != null) {

      String[] _strVArray = _strSmrtg.split(";");

      int _iV = _strVArray.length;

      for (

          int _iVar = 0; _iVar < _iV; ++_iVar) {

        String _strRag = _strVArray[_iVar];
        if (!_strRag.isEmpty()) {

          Matcher _matcher = this.vkPattern.matcher(_strRag);

          String grp;
          if (!_matcher.find() || _matcher.groupCount() != 6) {
            grp = String.format(
                io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.format"),
                Security.settingLduiouopString.name());

            throw new IllegalArgumentException("*** Error: a6e9804a-3747-4ad0-bd77-b3b9d5b2ab99");
          }

          grp = _matcher.group(2) != null ? _matcher.group(2)
              : (_matcher.group(3) != null ? _matcher.group(3)
                  : (_matcher.group(4) != null ? _matcher.group(4)
                      : (
                          _matcher.group(5) != null ? _matcher
                              .group(5) : "")));
          if (grp.isEmpty()) {

            String _strMe = String.format(
                io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.format2"),
                Security.settingLduiouopString.name());

            throw new IllegalArgumentException("*** Error: 29d0d102-e233-4db8-95db-b9992c4c0f89");
          }

          Collection<String> _collectionLrString = new ArrayList();

          String[] _strVr0Array = _matcher.group(6).trim().split(",");

          int _iVr1 = _strVr0Array.length;

          for (

              int _iVr2 = 0; _iVr2 < _iVr1; ++_iVr2) {

            String r = _strVr0Array[_iVr2];
            if (!r.isEmpty()) {
              _collectionLrString.add(r);
            }
          }

          _mapMsc.put(grp.toLowerCase(), _collectionLrString);
        }
      }
    }

    return _mapMsc;
  }


  private AuthenticationInfo _qufatioiosamAuthenticationInfo(
      AuthenticationToken _authenticationToken, LdapContextFactory _ldapContextFactory)
      throws NamingException {

    Object usrPrcpl = _authenticationToken.getPrincipal();

    Object credsObj = _authenticationToken.getCredentials();

    LdapContext _cLdapContext = null;

    AuthenticationInfo _authenticationInfo;
    try {
      _cLdapContext = this._gessldcnLdapContext(_ldapContextFactory);

      String[] _strAtsArray = new String[]{io.github.onograph.TokenConstants.CN};

      SearchControls _csSearchControls = new SearchControls(2, 0L, 0, _strAtsArray, false, false);

      Object[] _obAsArray = new Object[]{usrPrcpl};

      String _strFle = this.strNau + "={0}";

      NamingEnumeration<SearchResult> _namingEnumerationSacSearchResult = _cLdapContext.search(
          this.strUsb, _strFle, _obAsArray, _csSearchControls);
      if (!_namingEnumerationSacSearchResult.hasMore()) {

        throw new AuthenticationException("*** Error: bb088ff1-4542-476a-b975-71895c79002b");
      }

      SearchResult _nSearchResult = _namingEnumerationSacSearchResult.next();

      String _strLu = _nSearchResult.getNameInNamespace();
      if (_namingEnumerationSacSearchResult.hasMore()) {

        throw new AuthenticationException("*** Error: 6eb703de-2b47-453b-b7b2-4ae31f0a8f04");
      }

      LdapContext _cLdapContext2 = _ldapContextFactory.getLdapContext(_strLu, credsObj);
      LdapUtils.closeContext(_cLdapContext2);
      _authenticationInfo = this.createAuthenticationInfo(_authenticationToken, usrPrcpl, credsObj,
          _cLdapContext);
    } finally {
      LdapUtils.closeContext(_cLdapContext);
    }

    return _authenticationInfo;
  }


  private String _sevString(JndiLdapContextFactory _jndiLdapContextFactory) {

    String _strVr00 = _jndiLdapContextFactory.getUrl();
    return io.github.onograph.I18N.format(
        "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.sevString", _strVr00,
        (this.isTsu ? io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm.var6") : ""));
  }


  private <T> void _upastgForCoT(Consumer<T> _consumerCnueT, T _tAtr) {
    _consumerCnueT.accept(_tAtr);

    Cache<Object, AuthenticationInfo> _cacheCaoa = this.getAuthenticationCache();
    if (_cacheCaoa != null) {
      _cacheCaoa.clear();
    }

    Cache<Object, AuthorizationInfo> _cacheCaoa2 = this.getAuthorizationCache();
    if (_cacheCaoa2 != null) {
      _cacheCaoa2.clear();
    }
  }


  private void _upegptrlmpForSt(String _strSmrtg) {
    this.mapMrtgsc = this._pagtremiMap(_strSmrtg);
  }

  @Override
  protected AuthenticationInfo createAuthenticationInfo(AuthenticationToken _authenticationToken,
      Object _obLp, Object _obCl, LdapContext _ldapContext)
      throws NamingException {

    String uname = (String) _authenticationToken.getPrincipal();
    if (this.isEa2 && (this._isAepregus() || !this.isAfasu)) {

      LdapContext _gopLdapContext =
          this.isAfasu ? this._gessldcnLdapContext(this.getContextFactory()) : _ldapContext;

      Collection<String> _collectionNgString = this.figrnafourCollection(_gopLdapContext, uname);
      if (this._isAepregus() && !_collectionNgString.contains(this.strGpa)) {
        return null;
      }

      if (!this.isAfasu) {

        Set<String> _setNrString = this.gerlnefgsSet(_collectionNgString);
        this._caariifForStSe(_setNrString, uname);
      }
    }

    if (this.isAuthenticationCachingEnabled()) {

      SimpleHash _chSimpleHash = this.secureHasher.hash(
          (byte[]) _authenticationToken.getCredentials());
      return new ShiroAuthenticationInfo(new Neo4jPrincipal(uname), _chSimpleHash.getBytes(),
          _chSimpleHash.getSalt(), this.getName(),
          AuthenticationResult.SUCCESS);
    } else {
      return new ShiroAuthenticationInfo(new Neo4jPrincipal(uname), this.getName(),
          AuthenticationResult.SUCCESS);
    }
  }

  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(
      PrincipalCollection _picplPrincipalCollection) {
    try {

      AuthorizationInfo _authorizationInfo = super.doGetAuthorizationInfo(
          _picplPrincipalCollection);

      return _authorizationInfo;
    } catch (

        AuthorizationException _authorizationException) {

      return null;
    }
  }


  Collection<String> figrnafourCollection(LdapContext _ldapContext, String uname)
      throws NamingException {

    Collection<String> _collectionNgString = new LinkedHashSet();

    SearchControls _csSearchControls = new SearchControls();
    _csSearchControls.setSearchScope(2);
    _csSearchControls.setReturningAttributes(this.listNamString.toArray(new String[1]));

    Object[] _obSaArray = new Object[]{uname};

    NamingEnumeration<?> _namingEnumerationRslObject = _ldapContext.search(this.strUsb, this.strFsu,
        _obSaArray, _csSearchControls);
    if (_namingEnumerationRslObject.hasMoreElements()) {

      SearchResult _searchResult = (SearchResult) _namingEnumerationRslObject.next();
      if (_namingEnumerationRslObject.hasMoreElements()) {

      }

      Attributes _attributes = _searchResult.getAttributes();
      if (_attributes != null) {

        NamingEnumeration<? extends Attribute> _namingEnumerationEaAttribute = _attributes.getAll();

        while (_namingEnumerationEaAttribute.hasMore()) {

          Attribute _attribute = _namingEnumerationEaAttribute.next();

          String _strAi = _attribute.getID();

          Stream<String> _streamVr00String = this.listNamString.stream();
          Objects.requireNonNull(_strAi);
          if (_streamVr00String.anyMatch(_strAi::equalsIgnoreCase)) {
            _collectionNgString.addAll(LdapUtils.getAllAttributeValues(_attribute));
          }
        }
      }
    }

    return _collectionNgString;
  }

  @Override
  public AuthorizationInfo geatznhAuthorizationInfo(PrincipalCollection _principalCollection) {
    return this.getAuthorizationInfo(_principalCollection);
  }


  Set<String> gerlnefgsSet(Collection<String> _collectionNgString) {

    Set<String> _setRlsString = new HashSet();

    Iterator _iterator = _collectionNgString.iterator();

    while (_iterator.hasNext()) {

      String grp = (String) _iterator.next();

      Collection<String> _collectionGfrString = this.mapMrtgsc.get(grp.toLowerCase());
      if (_collectionGfrString != null) {
        _setRlsString.addAll(_collectionGfrString);
      }
    }

    return _setRlsString;
  }


  Map<String, Collection<String>> getMapMrtgsc() {
    return this.mapMrtgsc;
  }

  @Override
  protected AuthenticationInfo queryForAuthenticationInfo(AuthenticationToken _authenticationToken,
      LdapContextFactory _ldapContextFactory)
      throws NamingException {
    if (!this.isEa) {
      return null;
    } else if (this.isUsa) {
      return this._qufatioiosamAuthenticationInfo(_authenticationToken, _ldapContextFactory);
    } else {

      String _strSs = this._sevString((JndiLdapContextFactory) _ldapContextFactory);

      try {

        AuthenticationInfo _authenticationInfo =
            this.isTsu ? this.qufatioiougsttAuthenticationInfo(_authenticationToken,
                _ldapContextFactory)
                : super.queryForAuthenticationInfo(_authenticationToken, _ldapContextFactory);

        return _authenticationInfo;
      } catch (

          Exception _exception) {
        if (_isEenalacnoteForEx(_exception)) {

          throw new AuthProviderTimeoutException("*** Error:  c0ef2d51-1abd-42a8-93ea-9183d16fdf0d",
              _exception);
        } else if (_isEenalardtoForEx(_exception)) {

          throw new AuthProviderTimeoutException("*** Error:  b01b5c26-6635-40c1-a51d-a4a66293531e",
              _exception);
        } else if (_isEencenrsForEx(_exception)) {

          throw new AuthProviderFailedException("*** Error:  43042b6a-3b5d-4bf7-9a73-c568e9e5dde6",
              _exception);
        } else {
          throw _exception;
        }
      }
    }
  }

  @Override
  protected AuthorizationInfo queryForAuthorizationInfo(
      PrincipalCollection _picplPrincipalCollection, LdapContextFactory _ldapContextFactory)
      throws NamingException {
    if (this.isEa2) {

      String uname = this._geurmString(_picplPrincipalCollection);
      if (uname == null) {
        return null;
      } else if (this.isAfasu) {

        LdapContext _ldapContext = this._gessldcnLdapContext(_ldapContextFactory);

        Set _nrSet;
        try {

          Collection<String> _collectionNgString = this.figrnafourCollection(_ldapContext, uname);
          _nrSet = this.gerlnefgsSet(_collectionNgString);
        } finally {
          LdapUtils.closeContext(_ldapContext);
        }

        return new SimpleAuthorizationInfo(_nrSet);
      } else {

        Cache<Object, AuthorizationInfo> _cacheCaoa = this.getAuthorizationCache();

        AuthorizationInfo _authorizationInfo = _cacheCaoa.get(uname);
        if (_authorizationInfo == null) {

          throw new AuthorizationExpiredException(
              "*** Error:  cc4f655e-64e8-4fa1-9428-58dc8a3bef88");
        } else {
          return _authorizationInfo;
        }
      }
    } else {
      return null;
    }
  }


  protected AuthenticationInfo qufatioiougsttAuthenticationInfo(
      AuthenticationToken _authenticationToken, LdapContextFactory _ldapContextFactory)
      throws NamingException {

    Object usrPrcpl = this.getLdapPrincipal(_authenticationToken);

    Object credsObj = _authenticationToken.getCredentials();

    LdapContext _cLdapContext = null;

    AuthenticationInfo _authenticationInfo;
    try {
      _cLdapContext = this._gelactussttlLdapContext(credsObj, _ldapContextFactory, usrPrcpl);
      _authenticationInfo = this.createAuthenticationInfo(_authenticationToken, usrPrcpl, credsObj,
          _cLdapContext);
    } finally {
      LdapUtils.closeContext(_cLdapContext);
    }

    return _authenticationInfo;
  }

  @Override
  public void setup() {
    if (this.isEa2) {
      this._astvdushsi();
    }
  }

  @Override
  public void shutdown() {
  }

  @Override
  public void start() {
  }

  @Override
  public void stop() {
  }

  @Override
  public boolean supports(AuthenticationToken _authenticationToken) {
    return _isSurshanrlForAu(_authenticationToken);
  }
}
