package io.github.onograph.dbms.utils;

import java.util.Iterator;
import org.neo4j.internal.kernel.api.TokenRead;
import org.neo4j.internal.kernel.api.exceptions.LabelNotFoundKernelException;
import org.neo4j.internal.kernel.api.exceptions.PropertyKeyIdNotFoundKernelException;
import org.neo4j.internal.kernel.api.exceptions.RelationshipTypeIdNotFoundKernelException;
import org.neo4j.token.TokenHolders;
import org.neo4j.token.api.NamedToken;
import org.neo4j.token.api.TokenNotFoundException;


public class TokenReadImmutableImpl implements TokenRead {


  private final TokenHolders tokenHolders;

  TokenReadImmutableImpl(TokenHolders _tokenHolders) {
    this.tokenHolders = _tokenHolders;
  }

  @Override
  public int labelCount() {
    return this.tokenHolders.labelTokens().size();
  }

  @Override
  public String labelGetName(int _iLi) {
    return this.tokenHolders.labelGetName(_iLi);
  }

  @Override
  public Iterator<NamedToken> labelsGetAllTokens() {
    return this.tokenHolders.labelTokens().getAllTokens().iterator();
  }

  @Override
  public int nodeLabel(String title) {
    return this.tokenHolders.labelTokens().getIdByName(title);
  }

  @Override
  public String nodeLabelName(int _iIl) throws LabelNotFoundKernelException {
    try {
      return this.tokenHolders.labelTokens().getTokenById(_iIl).name();
    } catch (

        TokenNotFoundException _tokenNotFoundException) {
      throw new LabelNotFoundKernelException(_iIl, _tokenNotFoundException);
    }
  }

  @Override
  public int propertyKey(String title) {
    return this.tokenHolders.propertyKeyTokens().getIdByName(title);
  }

  @Override
  public int propertyKeyCount() {
    return this.tokenHolders.propertyKeyTokens().size();
  }

  @Override
  public Iterator<NamedToken> propertyKeyGetAllTokens() {
    return this.tokenHolders.propertyKeyTokens().getAllTokens().iterator();
  }

  @Override
  public String propertyKeyGetName(int _iIkp) {
    return this.tokenHolders.propertyKeyGetName(_iIkp);
  }

  @Override
  public String propertyKeyName(int _iIkp) throws PropertyKeyIdNotFoundKernelException {
    try {
      return this.tokenHolders.propertyKeyTokens().getTokenById(_iIkp).name();
    } catch (

        TokenNotFoundException _tokenNotFoundException) {
      throw new PropertyKeyIdNotFoundKernelException(_iIkp, _tokenNotFoundException);
    }
  }

  @Override
  public int relationshipType(String title) {
    return this.tokenHolders.relationshipTypeTokens().getIdByName(title);
  }

  @Override
  public int relationshipTypeCount() {
    return this.tokenHolders.relationshipTypeTokens().size();
  }

  @Override
  public String relationshipTypeGetName(int _iRti) {
    return this.tokenHolders.relationshipTypeGetName(_iRti);
  }

  @Override
  public String relationshipTypeName(int _iRti) throws RelationshipTypeIdNotFoundKernelException {
    try {
      return this.tokenHolders.relationshipTypeTokens().getTokenById(_iRti).name();
    } catch (

        TokenNotFoundException _tokenNotFoundException) {
      throw new RelationshipTypeIdNotFoundKernelException(_iRti, _tokenNotFoundException);
    }
  }

  @Override
  public Iterator<NamedToken> relationshipTypesGetAllTokens() {
    return this.tokenHolders.relationshipTypeTokens().getAllTokens().iterator();
  }
}
