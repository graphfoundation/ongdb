package io.github.onograph.cluster.raft.module.dprot;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Optional;
import java.util.Properties;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;


public class DNSSRVServiceImpl extends AbstractDNSSRVService {


  private final String strSvat = io.github.onograph.TokenConstants.SRV2;


  private final String[] strSvrcrArray = new String[]{io.github.onograph.TokenConstants.SRV};


  private Optional<InitialDirContext> optional_InitialDirContext = Optional.empty();


  private static <T> Stream<T> _enrnasrStream(final Enumeration<T> _enumerationET) {
    return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new Iterator<T>() {
      @Override
      public boolean hasNext() {
        return _enumerationET.hasMoreElements();
      }

      @Override
      public T next() {
        return _enumerationET.nextElement();
      }
    }, 16), false);
  }


  private synchronized InitialDirContext _seiInitialDirContext() {
    return this.optional_InitialDirContext.orElseGet(() ->
    {

      Properties _eProperties = new Properties();
      _eProperties.put(io.github.onograph.TokenConstants.JAVA__NAMING__FACTORY__INITIAL,
          io.github.onograph.TokenConstants.COM__SUN__JNDI__DNS___DNS_CONTEXT_FACTORY);

      try {
        this.optional_InitialDirContext = Optional.of(new InitialDirContext(_eProperties));
        return this.optional_InitialDirContext.get();
      } catch (

          NamingException _namingException) {
        throw new RuntimeException(_namingException);
      }
    });
  }

  @Override
  public Stream<AbstractDNSSRVServiceImpl> revsrdStream(String _strU) throws NamingException {

    Attributes _atsAttributes = (this.optional_InitialDirContext.orElseGet(
        this::_seiInitialDirContext)).getAttributes(_strU, this.strSvrcrArray);
    return _enrnasrStream(
        (NamingEnumeration<String>) _atsAttributes.get(io.github.onograph.TokenConstants.SRV)
            .getAll()).map(
        AbstractDNSSRVServiceImpl::pasAbstractDNSSRVServiceAbstractDNSSRVServiceImpl);
  }
}
