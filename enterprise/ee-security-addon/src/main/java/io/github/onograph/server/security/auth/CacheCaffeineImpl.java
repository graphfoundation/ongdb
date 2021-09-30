package io.github.onograph.server.security.auth;

import com.github.benmanes.caffeine.cache.Ticker;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.neo4j.cypher.internal.cache.CaffeineCacheFactory;


public class CacheCaffeineImpl<K, V> implements Cache<K, V> {


  private final com.github.benmanes.caffeine.cache.Cache<K, V> cacheCckv;


  CacheCaffeineImpl(CaffeineCacheFactory _caffeineCacheFactory, int _iCm, boolean _isLttu,
      long _lgT, Ticker _ticker) {
    if (_isLttu) {
      if (_lgT <= 0L) {

        throw new IllegalArgumentException("*** Error:  0a699bf1-6c14-4473-b6fe-63c1697939a8");
      }

      this.cacheCckv = _caffeineCacheFactory.createCache(_ticker, _lgT, _iCm);
    } else {
      this.cacheCckv = _caffeineCacheFactory.createCache(_iCm);
    }
  }

  @Override
  public void clear() throws CacheException {
    this.cacheCckv.invalidateAll();
  }

  @Override
  public V get(K k) throws CacheException {
    return this.cacheCckv.getIfPresent(k);
  }

  @Override
  public Set<K> keys() {
    return this.cacheCckv.asMap().keySet();
  }

  @Override
  public V put(K k, V val) throws CacheException {
    return this.cacheCckv.asMap().put(k, val);
  }

  @Override
  public V remove(K k) throws CacheException {
    return this.cacheCckv.asMap().remove(k);
  }

  @Override
  public int size() {
    return this.cacheCckv.asMap().size();
  }

  @Override
  public Collection<V> values() {
    return this.cacheCckv.asMap().values();
  }


  public static class CacheManagerImpl implements CacheManager {


    private final CaffeineCacheFactory caffeineCacheFactory;


    private final int iCm;


    private final boolean isLttu;


    private final long lgT;


    private final Map<String, Cache<?, ?>> mapCcesc;


    private final Ticker ticker;


    public CacheManagerImpl(CaffeineCacheFactory _caffeineCacheFactory, int _iCm, boolean _isLttu,
        long _lgT, Ticker _ticker) {
      this.ticker = _ticker;
      this.lgT = _lgT;
      this.caffeineCacheFactory = _caffeineCacheFactory;
      this.iCm = _iCm;
      this.isLttu = _isLttu;
      this.mapCcesc = new HashMap();
    }

    @Override
    public <K, V> Cache<K, V> getCache(String str) throws CacheException {
      return (Cache) this.mapCcesc.computeIfAbsent(str, (ignored) ->
      {
        return this.isLttu && this.lgT <= 0L ? new NoopCacheImpl()
            : new CacheCaffeineImpl(this.caffeineCacheFactory, this.iCm,
                this.isLttu, this.lgT, this.ticker);
      });
    }
  }


  private static class NoopCacheImpl<K, V> implements Cache<K, V> {

    @Override
    public void clear() throws CacheException {
    }

    @Override
    public V get(K k) throws CacheException {
      return null;
    }

    @Override
    public Set<K> keys() {
      return Collections.emptySet();
    }

    @Override
    public V put(K k, V val) throws CacheException {
      return null;
    }

    @Override
    public V remove(K k) throws CacheException {
      return null;
    }

    @Override
    public int size() {
      return 0;
    }

    @Override
    public Collection<V> values() {
      return Collections.emptySet();
    }
  }
}
