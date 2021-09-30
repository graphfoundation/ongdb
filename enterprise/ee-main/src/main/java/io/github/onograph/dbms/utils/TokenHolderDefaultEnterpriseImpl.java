package io.github.onograph.dbms.utils;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.collections.api.map.MutableMap;
import org.neo4j.internal.recordstorage.StoreTokens;
import org.neo4j.token.api.NamedToken;
import org.neo4j.token.api.NonUniqueTokenException;
import org.neo4j.token.api.TokenHolder;
import org.neo4j.token.api.TokenNotFoundException;
import org.neo4j.util.VisibleForTesting;


class TokenHolderDefaultEnterpriseImpl implements TokenHolder {


  private final TokenHolder dlgtTokenHolder;


  private final MutableMap<String, List<NamedToken>> mutableMapRtsl;


  private final NodeWrapperInfoMetrics sasNodeWrapperInfoMetrics;


  private final String strTt;


  private int iCtc;


  TokenHolderDefaultEnterpriseImpl(MutableMap<String, List<NamedToken>> _mutableMapTrsl,
      NodeWrapperInfoMetrics _sasNodeWrapperInfoMetrics, String _strTt) {
    this.strTt = _strTt;
    this.dlgtTokenHolder = StoreTokens.createReadOnlyTokenHolder(_strTt);
    this.sasNodeWrapperInfoMetrics = _sasNodeWrapperInfoMetrics;
    this.mutableMapRtsl = _mutableMapTrsl;
  }

  @Override
  public void addToken(NamedToken _namedToken) throws NonUniqueTokenException {
    throw new UnsupportedOperationException();
  }


  @VisibleForTesting
  String gearceteneString(int _iNme) {

    String _strVr00 = this.getTokenType();
    return io.github.onograph.I18N.format(
        "io.github.onograph.dbms.utils.TokenHolderDefaultEnterpriseImpl.gearceteneString", _strVr00,
        _iNme);
  }

  @Override
  public Iterable<NamedToken> getAllTokens() {
    return this.dlgtTokenHolder.getAllTokens();
  }

  @Override
  public int getIdByName(String title) {
    return this.dlgtTokenHolder.getIdByName(title);
  }

  @Override
  public boolean getIdsByNames(String[] _strNmsArray, int[] _iIArray) {
    return this.dlgtTokenHolder.getIdsByNames(_strNmsArray, _iIArray);
  }

  @Override
  public NamedToken getInternalTokenById(int _iI) throws TokenNotFoundException {
    return this.dlgtTokenHolder.getInternalTokenById(_iI);
  }

  @Override
  public int getOrCreateId(String title) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void getOrCreateIds(String[] _strNmsArray, int[] _iIArray) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void getOrCreateInternalIds(String[] _strNmsArray, int[] _iIArray) {
    throw new UnsupportedOperationException();
  }

  @Override
  public NamedToken getTokenById(int _iI) {
    try {
      return this.dlgtTokenHolder.getTokenById(_iI);
    } catch (

        TokenNotFoundException _tokenNotFoundException) {
      synchronized (this) {

        NamedToken _namedToken;
        try {
          _namedToken = this.dlgtTokenHolder.getTokenById(_iI);
        } catch (

            TokenNotFoundException _tokenNotFoundException2) {
          this.sasNodeWrapperInfoMetrics.adcrtForSt(_iI, this.strTt);

          String _strTn;
          do {
            ++this.iCtc;
            _strTn = this.gearceteneString(this.iCtc);
          }
          while (this.getIdByName(_strTn) != -1);

          NamedToken _namedToken2 = new NamedToken(_strTn, _iI);
          this.dlgtTokenHolder.addToken(_namedToken2);
          this.mutableMapRtsl.getIfAbsentPut(this.getTokenType(), ArrayList::new).add(_namedToken2);
          return _namedToken2;
        }

        return _namedToken;
      }
    }
  }

  @Override
  public String getTokenType() {
    return this.dlgtTokenHolder.getTokenType();
  }

  @Override
  public boolean hasToken(int _iI) {
    return this.dlgtTokenHolder.hasToken(_iI);
  }

  @Override
  public void setInitialTokens(List<NamedToken> _listTknNamedToken) throws NonUniqueTokenException {
    this.dlgtTokenHolder.setInitialTokens(_listTknNamedToken);
  }

  @Override
  public int size() {
    return this.dlgtTokenHolder.size();
  }
}
