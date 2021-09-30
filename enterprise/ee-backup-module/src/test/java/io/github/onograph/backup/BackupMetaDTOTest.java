package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.DelegatingStoreChannel;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.ExternallyManagedPageCache;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.storageengine.api.StoreId;

class BackupMetaDTOTest {

  @Test
  void testConstructor() {
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DatabaseLayout _databaseLayout = mock(DatabaseLayout.class);
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(
            new ExternallyManagedPageCache(new ExternallyManagedPageCache(null))));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer defaultPageCacheTracer = new DefaultPageCacheTracer();
    new BackupMetaDTO(backupIOService, _databaseLayout, _fsStoreResources, gdbIdRepo, _logProvider,
        defaultPageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction()));

    assertEquals(0L, defaultPageCacheTracer.bytesRead());
    assertEquals(0L, defaultPageCacheTracer.unpins());
    assertEquals(0L, defaultPageCacheTracer.pins());
    assertEquals(0L, defaultPageCacheTracer.merges());
    assertEquals(0L, defaultPageCacheTracer.iopqPerformed());
    assertEquals(0L, defaultPageCacheTracer.ioLimitedTimes());
    assertEquals(0L, defaultPageCacheTracer.ioLimitedMillis());
    assertEquals(0L, defaultPageCacheTracer.hits());
    assertEquals(0L, defaultPageCacheTracer.flushes());
    assertEquals(0L, defaultPageCacheTracer.filesUnmapped());
    assertEquals(0L, defaultPageCacheTracer.filesMapped());
    assertEquals(0L, defaultPageCacheTracer.faults());
    assertEquals(0L, defaultPageCacheTracer.evictions());
    assertEquals(0L, defaultPageCacheTracer.evictionExceptions());
    assertEquals(0L, defaultPageCacheTracer.bytesWritten());
  }

  @Test
  void testConstructor2() {
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(
            new ExternallyManagedPageCache(new ExternallyManagedPageCache(null))));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertNull((new BackupMetaDTO(backupIOService, null, _fsStoreResources, gdbIdRepo, _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).getDatabaseLayout());
  }

  @Test
  void testConstructor3() {
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(
            new ExternallyManagedPageCache(new ExternallyManagedPageCache(null))));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(new ByteArrayOutputStream(3));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertNull((new BackupMetaDTO(backupIOService, null, _fsStoreResources, gdbIdRepo, _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).getDatabaseLayout());
  }

  @Test
  void testDaadrrPath() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    when(databaseLayout.databaseDirectory()).thenReturn(getResult);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertSame(getResult,
        (new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
            _logProvider,
            _pageCacheTracer,
            new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).daadrrPath());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testDaasidOptional() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).daasidOptional()
        .isPresent());
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testDaasidOptional2() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(null);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).daasidOptional()
        .isPresent());
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testDaasidOptional3() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(null);
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).daasidOptional()
        .isPresent());
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testDaasidOptional4() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.read(any()))
        .thenReturn(
            new DelegatingStoreChannel<StoreChannel>(new DelegatingStoreChannel<StoreChannel>(
                new DelegatingStoreChannel<StoreChannel>(
                    new DelegatingStoreChannel<StoreChannel>(null)))));
    when(fileSystemAbstraction.fileExists(any())).thenReturn(true);
    GdbIdRepo gdbIdRepo = new GdbIdRepo(fileSystemAbstraction);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).daasidOptional()
        .isPresent());
    verify(databaseLayout).backupToolsFolder();
    verify(fileSystemAbstraction).fileExists(any());
    verify(fileSystemAbstraction).read(any());
  }

  @Test
  void testDaasidOptional5() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.read(any())).thenThrow(new IllegalStateException("foo"));
    when(fileSystemAbstraction.fileExists(any())).thenReturn(true);
    GdbIdRepo gdbIdRepo = new GdbIdRepo(fileSystemAbstraction);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).daasidOptional()
        .isPresent());
    verify(databaseLayout).backupToolsFolder();
    verify(fileSystemAbstraction).fileExists(any());
    verify(fileSystemAbstraction).read(any());
  }

  @Test
  void testDaasidOptional6() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreChannel storeChannel = mock(StoreChannel.class);
    doNothing().when(storeChannel).close();
    doNothing().when(storeChannel).readAll(any());
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.read(any()))
        .thenReturn(
            new DelegatingStoreChannel<StoreChannel>(new DelegatingStoreChannel<StoreChannel>(
                new DelegatingStoreChannel<StoreChannel>(
                    new DelegatingStoreChannel<StoreChannel>(storeChannel)))));
    when(fileSystemAbstraction.fileExists(any())).thenReturn(true);
    GdbIdRepo gdbIdRepo = new GdbIdRepo(fileSystemAbstraction);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).daasidOptional()
        .isPresent());
    verify(databaseLayout).backupToolsFolder();
    verify(fileSystemAbstraction).fileExists(any());
    verify(fileSystemAbstraction).read(any());
    verify(storeChannel).close();
    verify(storeChannel).readAll(any());
  }

  @Test
  void testDaasidOptional7() throws IOException {
    StoreChannel storeChannel = mock(StoreChannel.class);
    doNothing().when(storeChannel).close();
    doNothing().when(storeChannel).readAll(any());
    new DelegatingStoreChannel<StoreChannel>(new DelegatingStoreChannel<StoreChannel>(
        new DelegatingStoreChannel<StoreChannel>(
            new DelegatingStoreChannel<StoreChannel>(storeChannel))));
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse(
        (new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, null, _logProvider,
            _pageCacheTracer,
            new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).daasidOptional()
            .isPresent());
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testIsCofcwhForDa() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isCofcwhForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testIsCofcwhForDa2() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(null);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isCofcwhForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testIsCofcwhForDa3() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(null);
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isCofcwhForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testIsCofcwhForDa4() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.read(any()))
        .thenReturn(
            new DelegatingStoreChannel<StoreChannel>(new DelegatingStoreChannel<StoreChannel>(
                new DelegatingStoreChannel<StoreChannel>(
                    new DelegatingStoreChannel<StoreChannel>(null)))));
    when(fileSystemAbstraction.fileExists(any())).thenReturn(true);
    GdbIdRepo gdbIdRepo = new GdbIdRepo(fileSystemAbstraction);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isCofcwhForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
    verify(fileSystemAbstraction).fileExists(any());
    verify(fileSystemAbstraction).read(any());
  }

  @Test
  void testIsCofcwhForDa5() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.read(any())).thenThrow(new IllegalStateException("foo"));
    when(fileSystemAbstraction.fileExists(any())).thenReturn(true);
    GdbIdRepo gdbIdRepo = new GdbIdRepo(fileSystemAbstraction);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isCofcwhForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
    verify(fileSystemAbstraction).fileExists(any());
    verify(fileSystemAbstraction).read(any());
  }

  @Test
  void testIsCofcwhForDa6() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreChannel storeChannel = mock(StoreChannel.class);
    doNothing().when(storeChannel).close();
    doNothing().when(storeChannel).readAll(any());
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.read(any()))
        .thenReturn(
            new DelegatingStoreChannel<StoreChannel>(new DelegatingStoreChannel<StoreChannel>(
                new DelegatingStoreChannel<StoreChannel>(
                    new DelegatingStoreChannel<StoreChannel>(storeChannel)))));
    when(fileSystemAbstraction.fileExists(any())).thenReturn(true);
    GdbIdRepo gdbIdRepo = new GdbIdRepo(fileSystemAbstraction);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isCofcwhForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
    verify(fileSystemAbstraction).fileExists(any());
    verify(fileSystemAbstraction).read(any());
    verify(storeChannel).close();
    verify(storeChannel).readAll(any());
  }

  @Test
  void testIsCofcwhForDa7() throws IOException {
    StoreChannel storeChannel = mock(StoreChannel.class);
    doNothing().when(storeChannel).close();
    doNothing().when(storeChannel).readAll(any());
    new DelegatingStoreChannel<StoreChannel>(new DelegatingStoreChannel<StoreChannel>(
        new DelegatingStoreChannel<StoreChannel>(
            new DelegatingStoreChannel<StoreChannel>(storeChannel))));
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse(
        (new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, null, _logProvider,
            _pageCacheTracer,
            new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).isCofcwhForDa(
            mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testIsHadasidForDa() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isHadasidForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testIsHadasidForDa2() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(null);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isHadasidForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testIsHadasidForDa3() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(null);
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isHadasidForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testIsHadasidForDa4() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.read(any()))
        .thenReturn(
            new DelegatingStoreChannel<StoreChannel>(new DelegatingStoreChannel<StoreChannel>(
                new DelegatingStoreChannel<StoreChannel>(
                    new DelegatingStoreChannel<StoreChannel>(null)))));
    when(fileSystemAbstraction.fileExists(any())).thenReturn(true);
    GdbIdRepo gdbIdRepo = new GdbIdRepo(fileSystemAbstraction);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isHadasidForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
    verify(fileSystemAbstraction).fileExists(any());
    verify(fileSystemAbstraction).read(any());
  }

  @Test
  void testIsHadasidForDa5() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.read(any())).thenThrow(new IllegalStateException("foo"));
    when(fileSystemAbstraction.fileExists(any())).thenReturn(true);
    GdbIdRepo gdbIdRepo = new GdbIdRepo(fileSystemAbstraction);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isHadasidForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
    verify(fileSystemAbstraction).fileExists(any());
    verify(fileSystemAbstraction).read(any());
  }

  @Test
  void testIsHadasidForDa6() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreChannel storeChannel = mock(StoreChannel.class);
    doNothing().when(storeChannel).close();
    doNothing().when(storeChannel).readAll(any());
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.read(any()))
        .thenReturn(
            new DelegatingStoreChannel<StoreChannel>(new DelegatingStoreChannel<StoreChannel>(
                new DelegatingStoreChannel<StoreChannel>(
                    new DelegatingStoreChannel<StoreChannel>(storeChannel)))));
    when(fileSystemAbstraction.fileExists(any())).thenReturn(true);
    GdbIdRepo gdbIdRepo = new GdbIdRepo(fileSystemAbstraction);
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer, new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .isHadasidForDa(mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
    verify(fileSystemAbstraction).fileExists(any());
    verify(fileSystemAbstraction).read(any());
    verify(storeChannel).close();
    verify(storeChannel).readAll(any());
  }

  @Test
  void testIsHadasidForDa7() throws IOException {
    StoreChannel storeChannel = mock(StoreChannel.class);
    doNothing().when(storeChannel).close();
    doNothing().when(storeChannel).readAll(any());
    new DelegatingStoreChannel<StoreChannel>(new DelegatingStoreChannel<StoreChannel>(
        new DelegatingStoreChannel<StoreChannel>(
            new DelegatingStoreChannel<StoreChannel>(storeChannel))));
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.backupToolsFolder()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue(
        (new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, null, _logProvider,
            _pageCacheTracer,
            new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).isHadasidForDa(
            mock(DatabaseId.class)));
    verify(databaseLayout).backupToolsFolder();
  }

  @Test
  void testIsHaeigse() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).isHaeigse());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testIsHaeigse2() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(true);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).isHaeigse());
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testIsHaeigse3() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(false);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).isHaeigse());
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testIsHasesoForBa() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout,
        _fsStoreResources, gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    BackupIOService backupIOService1 = new BackupIOService(new DefaultFileSystemAbstraction());
    DatabaseLayout _databaseLayout = mock(DatabaseLayout.class);
    DefaultFileSystemAbstraction _fFileSystemAbstraction1 = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources1 = new StoreResources(_fFileSystemAbstraction1,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo1 = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer1 = new DefaultPageCacheTracer();
    assertFalse(
        backupMetaDTO.isHasesoForBa(
            new BackupMetaDTO(backupIOService1, _databaseLayout, _fsStoreResources1, gdbIdRepo1,
                _logProvider1, _pageCacheTracer1,
                new BackupMetadataRepository(new DefaultFileSystemAbstraction()))));
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testIsHasesoForBa2() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(true);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout,
        _fsStoreResources, gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    BackupIOService backupIOService1 = new BackupIOService(new DefaultFileSystemAbstraction());
    DatabaseLayout _databaseLayout = mock(DatabaseLayout.class);
    DefaultFileSystemAbstraction _fFileSystemAbstraction1 = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources1 = new StoreResources(_fFileSystemAbstraction1,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo1 = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer1 = new DefaultPageCacheTracer();
    assertFalse(
        backupMetaDTO.isHasesoForBa(
            new BackupMetaDTO(backupIOService1, _databaseLayout, _fsStoreResources1, gdbIdRepo1,
                _logProvider1, _pageCacheTracer1,
                new BackupMetadataRepository(new DefaultFileSystemAbstraction()))));
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testIsHasesoForBa3() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isExsForPa(any())).thenReturn(true);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(false);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    when(databaseLayout.metadataStore()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreResources storeResources = mock(StoreResources.class);
    when(storeResources.redsoiStoreId(any(), any()))
        .thenReturn(new StoreId(1L));
    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout, storeResources,
        gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    DatabaseLayout databaseLayout1 = mock(DatabaseLayout.class);
    when(databaseLayout1.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService1 = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo1 = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer1 = new DefaultPageCacheTracer();
    assertFalse(
        backupMetaDTO.isHasesoForBa(
            new BackupMetaDTO(backupIOService1, databaseLayout1, _fsStoreResources, gdbIdRepo1,
                _logProvider1, _pageCacheTracer1,
                new BackupMetadataRepository(new DefaultFileSystemAbstraction()))));
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(backupIOService).isExsForPa(any());
    verify(databaseLayout).databaseDirectory();
    verify(databaseLayout).metadataStore();
    verify(storeResources).redsoiStoreId(any(), any());
    verify(databaseLayout1).databaseDirectory();
  }

  @Test
  void testIsHasesoForBa4() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isExsForPa(any())).thenReturn(true);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(false);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    when(databaseLayout.metadataStore()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreResources storeResources = mock(StoreResources.class);
    when(storeResources.redsoiStoreId(any(), any()))
        .thenReturn(new StoreId(1L));
    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout, storeResources,
        gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    DatabaseLayout databaseLayout1 = mock(DatabaseLayout.class);
    when(databaseLayout1.databaseDirectory()).thenThrow(new IllegalStateException("foo"));
    BackupIOService backupIOService1 = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo1 = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer1 = new DefaultPageCacheTracer();
    assertFalse(
        backupMetaDTO.isHasesoForBa(
            new BackupMetaDTO(backupIOService1, databaseLayout1, _fsStoreResources, gdbIdRepo1,
                _logProvider1, _pageCacheTracer1,
                new BackupMetadataRepository(new DefaultFileSystemAbstraction()))));
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(backupIOService).isExsForPa(any());
    verify(databaseLayout).databaseDirectory();
    verify(databaseLayout).metadataStore();
    verify(storeResources).redsoiStoreId(any(), any());
    verify(databaseLayout1).databaseDirectory();
  }

  @Test
  void testIsHasesoForBa5() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isExsForPa(any())).thenReturn(false);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(false);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    when(databaseLayout.metadataStore()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreResources storeResources = mock(StoreResources.class);
    when(storeResources.redsoiStoreId(any(), any()))
        .thenReturn(new StoreId(1L));
    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout, storeResources,
        gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    DatabaseLayout databaseLayout1 = mock(DatabaseLayout.class);
    when(databaseLayout1.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService1 = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo1 = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer1 = new DefaultPageCacheTracer();
    assertThrows(IllegalStateException.class,
        () -> backupMetaDTO
            .isHasesoForBa(
                new BackupMetaDTO(backupIOService1, databaseLayout1, _fsStoreResources, gdbIdRepo1,
                    _logProvider1, _pageCacheTracer1,
                    new BackupMetadataRepository(new DefaultFileSystemAbstraction()))));
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(backupIOService).isExsForPa(any());
    verify(databaseLayout).databaseDirectory();
    verify(databaseLayout).metadataStore();
  }

  @Test
  void testIsHasridForSt() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout,
        _fsStoreResources, gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    assertFalse(backupMetaDTO.isHasridForSt(new StoreId(1L)));
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testIsHasridForSt2() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(true);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout,
        _fsStoreResources, gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    assertFalse(backupMetaDTO.isHasridForSt(new StoreId(1L)));
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testIsHasridForSt3() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isExsForPa(any())).thenReturn(true);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(false);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    when(databaseLayout.metadataStore()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreResources storeResources = mock(StoreResources.class);
    when(storeResources.redsoiStoreId(any(), any()))
        .thenReturn(new StoreId(1L));
    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout, storeResources,
        gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    assertFalse(backupMetaDTO.isHasridForSt(new StoreId(1L)));
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(backupIOService).isExsForPa(any());
    verify(databaseLayout).databaseDirectory();
    verify(databaseLayout).metadataStore();
    verify(storeResources).redsoiStoreId(any(), any());
  }

  @Test
  void testIsHasridForSt4() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isExsForPa(any())).thenReturn(false);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(false);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    when(databaseLayout.metadataStore()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreResources storeResources = mock(StoreResources.class);
    when(storeResources.redsoiStoreId(any(), any()))
        .thenReturn(new StoreId(1L));
    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout, storeResources,
        gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    assertThrows(IllegalStateException.class, () -> backupMetaDTO.isHasridForSt(new StoreId(1L)));
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(backupIOService).isExsForPa(any());
    verify(databaseLayout).databaseDirectory();
    verify(databaseLayout).metadataStore();
  }

  @Test
  void testIsLotaForBa() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout,
        _fsStoreResources, gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    DatabaseLayout databaseLayout1 = mock(DatabaseLayout.class);
    when(databaseLayout1.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService1 = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction1 = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources1 = new StoreResources(_fFileSystemAbstraction1,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo1 = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer1 = new DefaultPageCacheTracer();
    assertTrue(
        backupMetaDTO.isLotaForBa(
            new BackupMetaDTO(backupIOService1, databaseLayout1, _fsStoreResources1, gdbIdRepo1,
                _logProvider1, _pageCacheTracer1,
                new BackupMetadataRepository(new DefaultFileSystemAbstraction()))));
    verify(databaseLayout).databaseDirectory();
    verify(databaseLayout1).databaseDirectory();
  }

  @Test
  void testIsLotaForBa2() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("Key"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout,
        _fsStoreResources, gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    DatabaseLayout databaseLayout1 = mock(DatabaseLayout.class);
    when(databaseLayout1.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService1 = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction1 = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources1 = new StoreResources(_fFileSystemAbstraction1,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo1 = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer1 = new DefaultPageCacheTracer();
    assertFalse(
        backupMetaDTO.isLotaForBa(
            new BackupMetaDTO(backupIOService1, databaseLayout1, _fsStoreResources1, gdbIdRepo1,
                _logProvider1, _pageCacheTracer1,
                new BackupMetadataRepository(new DefaultFileSystemAbstraction()))));
    verify(databaseLayout).databaseDirectory();
    verify(databaseLayout1).databaseDirectory();
  }

  @Test
  void testIsTrde() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).isTrde());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testIsTrde2() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    doNothing().when(backupIOService).deedForPa(any());
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).isTrde());
    verify(backupIOService).deedForPa(any());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testIsTrde3() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    doThrow(new IOException("An error occurred")).when(backupIOService).deedForPa(any());
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).isTrde());
    verify(backupIOService).deedForPa(any());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testMoetBackupMetaDTO() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    doNothing().when(backupIOService).coydleForPaPa(any(), any());
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    DatabaseLayout databaseLayout1 = (new BackupMetaDTO(backupIOService, databaseLayout,
        _fsStoreResources, gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .moetBackupMetaDTO(Paths.get("causal_clustering.leadership_priority_group", "test.txt"))
        .getDatabaseLayout();
    assertEquals(
        "DatabaseLayout{databaseDirectory=/causal_clustering.leadership_priority_group/test.txt, transactionL"
            + "ogsDirectory=/causal_clustering.leadership_priority_group/test.txt}",
        databaseLayout1.toString());
    assertEquals("test.txt", databaseLayout1.getDatabaseName());
    Path expectedTransactionLogsDirectory = databaseLayout1.databaseDirectory();
    assertEquals(expectedTransactionLogsDirectory, databaseLayout1.getTransactionLogsDirectory());
    assertEquals(
        "Neo4JLayout{ homeDir=/causal_clustering.leadership_priority_group, dataDir=/causal_clustering.leadership"
            + "_priority_group, databasesDir=/causal_clustering.leadership_priority_group, txLogsRootDir=/causal"
            + "_clustering.leadership_priority_group}",
        databaseLayout1.getNeo4jLayout().toString());
    verify(backupIOService).coydleForPaPa(any(), any());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testMoetBackupMetaDTO2() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    doNothing().when(backupIOService).coydleForPaPa(any(), any());
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    DatabaseLayout databaseLayout1 = (new BackupMetaDTO(backupIOService, databaseLayout,
        _fsStoreResources, gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .moetBackupMetaDTO(Paths.get("", "More", "More"))
        .getDatabaseLayout();
    assertEquals(
        "DatabaseLayout{databaseDirectory=/More/more, transactionLogsDirectory=/More/more}",
        databaseLayout1.toString());
    assertEquals("more", databaseLayout1.getDatabaseName());
    Path expectedTransactionLogsDirectory = databaseLayout1.databaseDirectory();
    assertEquals(expectedTransactionLogsDirectory, databaseLayout1.getTransactionLogsDirectory());
    assertEquals(
        "Neo4JLayout{ homeDir=/More, dataDir=/More, databasesDir=/More, txLogsRootDir=/More}",
        databaseLayout1.getNeo4jLayout().toString());
    verify(backupIOService).coydleForPaPa(any(), any());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testMoetBackupMetaDTO3() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    doNothing().when(backupIOService).coydleForPaPa(any(), any());
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout,
        _fsStoreResources, gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    DatabaseLayout databaseLayout1 = mock(DatabaseLayout.class);
    when(databaseLayout1.databaseDirectory())
        .thenReturn(Paths.get("causal_clustering.leadership_priority_group", "test.txt"));
    BackupIOService backupIOService1 = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction1 = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources1 = new StoreResources(_fFileSystemAbstraction1,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo1 = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer1 = new DefaultPageCacheTracer();
    DatabaseLayout databaseLayout2 = backupMetaDTO
        .moetBackupMetaDTO(
            new BackupMetaDTO(backupIOService1, databaseLayout1, _fsStoreResources1, gdbIdRepo1,
                _logProvider1, _pageCacheTracer1,
                new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .getDatabaseLayout();
    assertEquals(
        "DatabaseLayout{databaseDirectory=/causal_clustering.leadership_priority_group/test.txt, transactionL"
            + "ogsDirectory=/causal_clustering.leadership_priority_group/test.txt}",
        databaseLayout2.toString());
    assertEquals("test.txt", databaseLayout2.getDatabaseName());
    Path expectedTransactionLogsDirectory = databaseLayout2.databaseDirectory();
    assertEquals(expectedTransactionLogsDirectory, databaseLayout2.getTransactionLogsDirectory());
    assertEquals(
        "Neo4JLayout{ homeDir=/causal_clustering.leadership_priority_group, dataDir=/causal_clustering.leadership"
            + "_priority_group, databasesDir=/causal_clustering.leadership_priority_group, txLogsRootDir=/causal"
            + "_clustering.leadership_priority_group}",
        databaseLayout2.getNeo4jLayout().toString());
    verify(backupIOService).coydleForPaPa(any(), any());
    verify(databaseLayout).databaseDirectory();
    verify(databaseLayout1).databaseDirectory();
  }

  @Test
  void testMoetBackupMetaDTO4() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    doNothing().when(backupIOService).coydleForPaPa(any(), any());
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    BackupMetaDTO backupMetaDTO = new BackupMetaDTO(backupIOService, databaseLayout,
        _fsStoreResources, gdbIdRepo,
        _logProvider, _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()));
    DatabaseLayout databaseLayout1 = mock(DatabaseLayout.class);
    when(databaseLayout1.databaseDirectory()).thenReturn(Paths.get("", "More", "More"));
    BackupIOService backupIOService1 = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction1 = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources1 = new StoreResources(_fFileSystemAbstraction1,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo1 = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider1 = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer1 = new DefaultPageCacheTracer();
    DatabaseLayout databaseLayout2 = backupMetaDTO
        .moetBackupMetaDTO(
            new BackupMetaDTO(backupIOService1, databaseLayout1, _fsStoreResources1, gdbIdRepo1,
                _logProvider1, _pageCacheTracer1,
                new BackupMetadataRepository(new DefaultFileSystemAbstraction())))
        .getDatabaseLayout();
    assertEquals(
        "DatabaseLayout{databaseDirectory=/More/more, transactionLogsDirectory=/More/more}",
        databaseLayout2.toString());
    assertEquals("more", databaseLayout2.getDatabaseName());
    Path expectedTransactionLogsDirectory = databaseLayout2.databaseDirectory();
    assertEquals(expectedTransactionLogsDirectory, databaseLayout2.getTransactionLogsDirectory());
    assertEquals(
        "Neo4JLayout{ homeDir=/More, dataDir=/More, databasesDir=/More, txLogsRootDir=/More}",
        databaseLayout2.getNeo4jLayout().toString());
    verify(backupIOService).coydleForPaPa(any(), any());
    verify(databaseLayout).databaseDirectory();
    verify(databaseLayout1).databaseDirectory();
  }

  @Test
  void testStridOptional() throws IOException {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    BackupIOService backupIOService = new BackupIOService(new DefaultFileSystemAbstraction());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).stridOptional()
        .isPresent());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testStridOptional2() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(true);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    StoreResources _fsStoreResources = new StoreResources(_fFileSystemAbstraction,
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));

    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertFalse((new BackupMetaDTO(backupIOService, databaseLayout, _fsStoreResources, gdbIdRepo,
        _logProvider,
        _pageCacheTracer,
        new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).stridOptional()
        .isPresent());
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testStridOptional3() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isExsForPa(any())).thenReturn(true);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(false);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    when(databaseLayout.metadataStore()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreResources storeResources = mock(StoreResources.class);
    when(storeResources.redsoiStoreId(any(), any()))
        .thenReturn(new StoreId(1L));
    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue(
        (new BackupMetaDTO(backupIOService, databaseLayout, storeResources, gdbIdRepo, _logProvider,
            _pageCacheTracer,
            new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).stridOptional()
            .isPresent());
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(backupIOService).isExsForPa(any());
    verify(databaseLayout).databaseDirectory();
    verify(databaseLayout).metadataStore();
    verify(storeResources).redsoiStoreId(any(), any());
  }

  @Test
  void testStridOptional4() throws IOException {
    BackupIOService backupIOService = mock(BackupIOService.class);
    when(backupIOService.isExsForPa(any())).thenReturn(false);
    when(backupIOService.isDitdontetoieForPa(any())).thenReturn(false);
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    when(databaseLayout.metadataStore()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreResources storeResources = mock(StoreResources.class);
    when(storeResources.redsoiStoreId(any(), any()))
        .thenReturn(new StoreId(1L));
    GdbIdRepo gdbIdRepo = new GdbIdRepo(new DefaultFileSystemAbstraction());
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertThrows(IllegalStateException.class,
        () -> (new BackupMetaDTO(backupIOService, databaseLayout, storeResources, gdbIdRepo,
            _logProvider,
            _pageCacheTracer,
            new BackupMetadataRepository(new DefaultFileSystemAbstraction()))).stridOptional());
    verify(backupIOService).isDitdontetoieForPa(any());
    verify(backupIOService).isExsForPa(any());
    verify(databaseLayout).databaseDirectory();
    verify(databaseLayout).metadataStore();
  }
}

