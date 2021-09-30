package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import org.apache.commons.io.file.DirectoryStreamFilter;
import org.apache.commons.io.file.PathFilter;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.DelegatingPageCache;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.cursor.DefaultPageCursorTracer;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;

class StoreResourcesTest {

  @Test
  void testConstructor() {

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    DirectoryStreamFilter _filterFfPath = new DirectoryStreamFilter(mock(PathFilter.class));
    new StoreResources(_fFileSystemAbstraction, _filterFfPath,
        new DelegatingPageCache(
            new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null)))));
  }

  @Test
  void testConstructor2() {

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    new StoreResources(_fFileSystemAbstraction,
        new DelegatingPageCache(
            new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null)))));
  }

  @Test
  void testDeeForLo() throws IOException {
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    StoreResources storeResources = new StoreResources(_fFileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    LogFiles logFiles = mock(LogFiles.class);
    when(logFiles.logFiles()).thenThrow(new IOException("An error occurred"));
    assertThrows(IOException.class, () -> storeResources.deeForLo(databaseLayout, logFiles));
    verify(databaseLayout).databaseDirectory();
    verify(logFiles).logFiles();
  }

  @Test
  void testDeeForLo2() throws IOException {
    EphemeralFileSystemAbstraction _fFileSystemAbstraction = new EphemeralFileSystemAbstraction();
    StoreResources storeResources = new StoreResources(_fFileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    LogFiles logFiles = mock(LogFiles.class);
    when(logFiles.logFiles()).thenReturn(new Path[]{});
    storeResources.deeForLo(databaseLayout, logFiles);
    verify(databaseLayout).databaseDirectory();
    verify(logFiles).logFiles();
  }

  @Test
  void testDeeForLo3() throws IOException {
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    StoreResources storeResources = new StoreResources(_fFileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    LogFiles logFiles = mock(LogFiles.class);
    when(logFiles.logFiles()).thenThrow(new IOException("An error occurred"));
    assertThrows(IOException.class, () -> storeResources.deeForLo(logFiles));
    verify(logFiles).logFiles();
  }

  @Test
  void testDeeForLo4() throws IOException {
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    StoreResources storeResources = new StoreResources(_fFileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    LogFiles logFiles = mock(LogFiles.class);
    when(logFiles.logFiles()).thenReturn(
        new Path[]{Paths.get(System.getProperty("Key"), "test.txt")});
    storeResources.deeForLo(logFiles);
    verify(logFiles).logFiles();
  }

  @Test
  void testDeeForLo5() throws IOException {
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    StoreResources storeResources = new StoreResources(_fFileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    LogFiles logFiles = mock(LogFiles.class);
    when(logFiles.logFiles()).thenReturn(
        new Path[]{Paths.get(System.getProperty("java.io.tmpdir"), "More", "More")});
    storeResources.deeForLo(logFiles);
    verify(logFiles).logFiles();
  }

  @Test
  void testDeeForLo6() throws IOException {
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    StoreResources storeResources = new StoreResources(_fFileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    LogFiles logFiles = mock(LogFiles.class);
    when(logFiles.logFiles()).thenReturn(new Path[]{});
    storeResources.deeForLo(logFiles);
    verify(logFiles).logFiles();
  }

  @Test
  void testIsEmyForDa() throws IOException {
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    StoreResources storeResources = new StoreResources(_fFileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.storeFiles()).thenReturn(new HashSet<Path>());
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    assertTrue(storeResources.isEmyForDa(databaseLayout));
    verify(databaseLayout, atLeast(1)).databaseDirectory();
    //verify( databaseLayout ).storeFiles();
  }

  @Test
  void testIsEmyForDa2() throws IOException {
    EphemeralFileSystemAbstraction _fFileSystemAbstraction = new EphemeralFileSystemAbstraction();
    StoreResources storeResources = new StoreResources(_fFileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.storeFiles()).thenReturn(new HashSet<Path>());
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    assertTrue(storeResources.isEmyForDa(databaseLayout));
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testIsEmyForDa3() throws IOException {
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    StoreResources storeResources = new StoreResources(_fFileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.storeFiles()).thenReturn(new HashSet<Path>());
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "More"));
    assertTrue(storeResources.isEmyForDa(databaseLayout));
    verify(databaseLayout, atLeast(1)).databaseDirectory();
    //verify( databaseLayout ).storeFiles();
  }

  @Test
  void testMoetForPaDaLo() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    doNothing().when(fileSystemAbstraction).moveToDirectory((Path) any(), (Path) any());
    when(fileSystemAbstraction.listFiles((Path) any(),
        (java.nio.file.DirectoryStream.Filter<Path>) any()))
        .thenReturn(new Path[]{Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")});
    doNothing().when(fileSystemAbstraction).mkdirs((Path) any());
    StoreResources storeResources = new StoreResources(fileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    LogFiles logFiles = mock(LogFiles.class);
    when(logFiles.isLogFile((Path) any())).thenReturn(true);
    when(logFiles.logFilesDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    Path _sucPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getTransactionLogsDirectory())
        .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    storeResources.moetForPaDaLo(logFiles, _sucPath, databaseLayout);
    verify(fileSystemAbstraction).listFiles((Path) any(),
        (java.nio.file.DirectoryStream.Filter<Path>) any());
    verify(fileSystemAbstraction).mkdirs((Path) any());
    verify(fileSystemAbstraction).moveToDirectory((Path) any(), (Path) any());
    verify(logFiles).isLogFile((Path) any());
    verify(logFiles).logFilesDirectory();
    verify(databaseLayout).getTransactionLogsDirectory();
  }

  @Test
  void testMoetForPaDaLo2() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    doNothing().when(fileSystemAbstraction).moveToDirectory((Path) any(), (Path) any());
    when(fileSystemAbstraction.listFiles((Path) any(),
        (java.nio.file.DirectoryStream.Filter<Path>) any()))
        .thenReturn(new Path[]{});
    doNothing().when(fileSystemAbstraction).mkdirs((Path) any());
    StoreResources storeResources = new StoreResources(fileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    LogFiles logFiles = mock(LogFiles.class);
    when(logFiles.isLogFile((Path) any())).thenReturn(true);
    when(logFiles.logFilesDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    Path _sucPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getTransactionLogsDirectory())
        .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    storeResources.moetForPaDaLo(logFiles, _sucPath, databaseLayout);
    verify(fileSystemAbstraction).listFiles((Path) any(),
        (java.nio.file.DirectoryStream.Filter<Path>) any());
    verify(fileSystemAbstraction).mkdirs((Path) any());
    verify(logFiles).logFilesDirectory();
  }

  @Test
  void testMoetForPaDaLo3() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    doNothing().when(fileSystemAbstraction).moveToDirectory((Path) any(), (Path) any());
    when(fileSystemAbstraction.listFiles((Path) any(),
        (java.nio.file.DirectoryStream.Filter<Path>) any()))
        .thenReturn(new Path[]{Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")});
    doNothing().when(fileSystemAbstraction).mkdirs((Path) any());
    StoreResources storeResources = new StoreResources(fileSystemAbstraction,
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    LogFiles logFiles = mock(LogFiles.class);
    when(logFiles.isLogFile((Path) any())).thenReturn(false);
    when(logFiles.logFilesDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    Path _sucPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.databaseDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(databaseLayout.getTransactionLogsDirectory())
        .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    storeResources.moetForPaDaLo(logFiles, _sucPath, databaseLayout);
    verify(fileSystemAbstraction).listFiles((Path) any(),
        (java.nio.file.DirectoryStream.Filter<Path>) any());
    verify(fileSystemAbstraction).mkdirs((Path) any());
    verify(fileSystemAbstraction).moveToDirectory((Path) any(), (Path) any());
    verify(logFiles).isLogFile((Path) any());
    verify(logFiles).logFilesDirectory();
    verify(databaseLayout).databaseDirectory();
  }

  @Test
  void testRedasifrdsOptional() throws IOException {
    PageCache pageCache = mock(PageCache.class);
    when(pageCache.map((Path) any(), anyInt(), (String) any(),
        (org.eclipse.collections.api.set.ImmutableSet<java.nio.file.OpenOption>) any(),
        (org.neo4j.io.pagecache.IOController) any())).thenThrow(
        new IOException("An error occurred"));
    when(pageCache.pageSize()).thenReturn(3);
    DelegatingPageCache _pageCache = new DelegatingPageCache(new DelegatingPageCache(pageCache));
    StoreResources storeResources = new StoreResources(
        new AdversarialChannelDefaultFileSystemAbstraction(),
        _pageCache);
    CursorContext _cursorContext = new CursorContext(
        new DefaultPageCursorTracer(new DefaultPageCacheTracer(), "Tag"));
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    when(databaseLayout.metadataStore()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    assertFalse(storeResources.redasifrdsOptional(_cursorContext, databaseLayout).isPresent());
    verify(pageCache).map((Path) any(), anyInt(), (String) any(),
        (org.eclipse.collections.api.set.ImmutableSet<java.nio.file.OpenOption>) any(),
        (org.neo4j.io.pagecache.IOController) any());
    verify(pageCache).pageSize();
    verify(databaseLayout).getDatabaseName();
    verify(databaseLayout, atLeast(1)).metadataStore();
  }
}

