package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.github.benmanes.caffeine.cache.Ticker;
import java.util.concurrent.Executor;
import org.apache.shiro.cache.CacheException;
import org.junit.jupiter.api.Test;
import org.neo4j.cypher.internal.cache.ExecutorBasedCaffeineCacheFactory;

class CacheCaffeineImplTest {

  @Test
  void testCacheManagerImplGetCache() throws CacheException {
    assertEquals(0, (new CacheCaffeineImpl.CacheManagerImpl(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        1, true, 1L, mock(Ticker.class))).<Object, Object>getCache("Str").size());
    assertEquals(0, (new CacheCaffeineImpl.CacheManagerImpl(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        0, true, 1L, mock(Ticker.class))).<Object, Object>getCache("Str").size());
    assertEquals(0, (new CacheCaffeineImpl.CacheManagerImpl(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        1, false, 1L, mock(Ticker.class))).<Object, Object>getCache("Str").size());
  }

  @Test
  void testCacheManagerImplGetCache2() throws CacheException {

    (new CacheCaffeineImpl.CacheManagerImpl(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), 1, true, 0L,
        mock(Ticker.class))).<Object, Object>getCache("Str");
  }

  @Test
  void testClear() throws CacheException {
    Ticker ticker = mock(Ticker.class);
    when(ticker.read()).thenReturn(1L);
    (new CacheCaffeineImpl<Object, Object>(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), 1, true, 1L,
        ticker)).clear();
    verify(ticker).read();
  }

  @Test
  void testGet() throws CacheException {
    assertNull((new CacheCaffeineImpl<Object, Object>(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), 1,
        true, 1L, mock(Ticker.class))).get("42"));
  }

  @Test
  void testKeys() {
    assertTrue((new CacheCaffeineImpl<Object, Object>(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), 1,
        true, 1L, mock(Ticker.class))).keys().isEmpty());
  }

  @Test
  void testPut() throws CacheException {
    Executor executor = mock(Executor.class);
    doNothing().when(executor).execute((Runnable) any());
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        executor);
    Ticker ticker = mock(Ticker.class);
    when(ticker.read()).thenReturn(1L);
    CacheCaffeineImpl<Object, Object> cacheCaffeineImpl = new CacheCaffeineImpl<Object, Object>(
        _caffeineCacheFactory,
        1, true, 1L, ticker);
    assertNull(cacheCaffeineImpl.put("42", "Val"));
    verify(executor).execute((Runnable) any());
    verify(ticker).read();
    assertEquals(1, cacheCaffeineImpl.size());
  }

  @Test
  void testPut2() throws CacheException {
    Executor executor = mock(Executor.class);
    doThrow(new CacheException("An error occurred")).when(executor).execute((Runnable) any());
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        executor);
    Ticker ticker = mock(Ticker.class);
    when(ticker.read()).thenReturn(1L);
    CacheCaffeineImpl<Object, Object> cacheCaffeineImpl = new CacheCaffeineImpl<Object, Object>(
        _caffeineCacheFactory,
        1, true, 1L, ticker);
    assertNull(cacheCaffeineImpl.put("42", "Val"));
    verify(executor).execute((Runnable) any());
    verify(ticker, atLeast(1)).read();
    assertEquals(1, cacheCaffeineImpl.size());
  }

  @Test
  void testRemove() throws CacheException {
    CacheCaffeineImpl<Object, Object> cacheCaffeineImpl = new CacheCaffeineImpl<Object, Object>(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), 1, true, 1L,
        mock(Ticker.class));
    assertNull(cacheCaffeineImpl.remove("42"));
    assertEquals(0, cacheCaffeineImpl.size());
  }

  @Test
  void testSize() {
    assertEquals(0, (new CacheCaffeineImpl<Object, Object>(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        1, true, 1L, mock(Ticker.class))).size());
  }

  @Test
  void testValues() {
    assertTrue((new CacheCaffeineImpl<Object, Object>(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), 1,
        true, 1L, mock(Ticker.class))).values().isEmpty());
  }

  @Test
  void testConstructor() {
    assertEquals(0, (new CacheCaffeineImpl<Object, Object>(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        1, true, 1L, mock(Ticker.class))).size());
    assertEquals(0, (new CacheCaffeineImpl<Object, Object>(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        0, true, 1L, mock(Ticker.class))).size());
    assertEquals(0, (new CacheCaffeineImpl<Object, Object>(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        1, false, 1L, mock(Ticker.class))).size());
    assertThrows(IllegalArgumentException.class,
        () -> new CacheCaffeineImpl<Object, Object>(
            new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)), 1,
            true, 0L, mock(Ticker.class)));
    assertEquals(0, (new CacheCaffeineImpl<Object, Object>(
        new ExecutorBasedCaffeineCacheFactory(mock(Executor.class)),
        0, false, 0L, mock(Ticker.class))).size());
  }
}

