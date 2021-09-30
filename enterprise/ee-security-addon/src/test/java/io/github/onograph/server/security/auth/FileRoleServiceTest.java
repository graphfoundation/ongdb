package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyBoolean;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.server.security.auth.ListSnapshot;

class FileRoleServiceTest {

  @Test
  void testConstructor() {
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    assertEquals(0,
        (new FileRoleService(_fileSystemAbstraction,
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).nuboros());
  }

  @Test
  void testConstructor2() {
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    assertEquals(0, (new FileRoleService(_fileSystemAbstraction,
        new Log4jLogProvider(new ByteArrayOutputStream(3)),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).nuboros());
  }

  @Test
  void testGespoListSnapshot() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.openAsReader((Path) any(), (java.nio.charset.Charset) any()))
        .thenReturn(new StringReader("foo"));
    when(fileSystemAbstraction.fileExists((Path) any())).thenReturn(true);
    when(fileSystemAbstraction.lastModifiedTime((Path) any())).thenReturn(1L);
    assertThrows(IllegalStateException.class,
        () -> (new FileRoleService(fileSystemAbstraction,
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).gespoListSnapshot());
    verify(fileSystemAbstraction).fileExists((Path) any());
    verify(fileSystemAbstraction, atLeast(1)).lastModifiedTime((Path) any());
    verify(fileSystemAbstraction).openAsReader((Path) any(), (java.nio.charset.Charset) any());
  }

  @Test
  void testGespoListSnapshot2() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.openAsReader((Path) any(), (java.nio.charset.Charset) any()))
        .thenReturn(new StringReader(":"));
    when(fileSystemAbstraction.fileExists((Path) any())).thenReturn(true);
    when(fileSystemAbstraction.lastModifiedTime((Path) any())).thenReturn(1L);
    ListSnapshot<RoleDTO> actualGespoListSnapshotResult = (new FileRoleService(
        fileSystemAbstraction,
        new Log4jLogProvider(new Neo4jLoggerContext(new LoggerContext("Name"),
            mock(Closeable.class))),
        Paths.get(System.getProperty("java.io.tmpdir"),
            "test.txt"))).gespoListSnapshot();
    assertEquals(1L, actualGespoListSnapshotResult.timestamp());
    List<RoleDTO> valuesResult = actualGespoListSnapshotResult.values();
    assertEquals(1, valuesResult.size());
    RoleDTO getResult = valuesResult.get(0);
    assertTrue(getResult.getMembers().isEmpty());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX, getResult.getRoleName());
    verify(fileSystemAbstraction).fileExists((Path) any());
    verify(fileSystemAbstraction, atLeast(1)).lastModifiedTime((Path) any());
    verify(fileSystemAbstraction).openAsReader((Path) any(), (java.nio.charset.Charset) any());
  }

  @Test
  void testGespoListSnapshot3() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.openAsReader((Path) any(), (java.nio.charset.Charset) any()))
        .thenReturn(new StringReader(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX));
    when(fileSystemAbstraction.fileExists((Path) any())).thenReturn(true);
    when(fileSystemAbstraction.lastModifiedTime((Path) any())).thenReturn(1L);
    FileRoleService fileRoleService = new FileRoleService(fileSystemAbstraction,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    ListSnapshot<RoleDTO> actualGespoListSnapshotResult = fileRoleService.gespoListSnapshot();
    assertEquals(1L, actualGespoListSnapshotResult.timestamp());
    List<RoleDTO> expectedValuesResult = fileRoleService.listRoeRoleDTO;
    assertEquals(expectedValuesResult, actualGespoListSnapshotResult.values());
    verify(fileSystemAbstraction).fileExists((Path) any());
    verify(fileSystemAbstraction, atLeast(1)).lastModifiedTime((Path) any());
    verify(fileSystemAbstraction).openAsReader((Path) any(), (java.nio.charset.Charset) any());
  }

  @Test
  void testGespoListSnapshot4() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.openAsReader((Path) any(), (java.nio.charset.Charset) any()))
        .thenReturn(new StringReader("foo"));
    when(fileSystemAbstraction.fileExists((Path) any())).thenReturn(false);
    when(fileSystemAbstraction.lastModifiedTime((Path) any())).thenReturn(1L);
    assertNull((new FileRoleService(fileSystemAbstraction,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).gespoListSnapshot());
    verify(fileSystemAbstraction).fileExists((Path) any());
    verify(fileSystemAbstraction).lastModifiedTime((Path) any());
  }

  @Test
  void testGespoListSnapshot5() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.openAsReader((Path) any(), (java.nio.charset.Charset) any()))
        .thenReturn(new StringReader("foo"));
    when(fileSystemAbstraction.fileExists((Path) any())).thenReturn(true);
    when(fileSystemAbstraction.lastModifiedTime((Path) any())).thenReturn(0L);
    FileRoleService fileRoleService = new FileRoleService(fileSystemAbstraction,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    ListSnapshot<RoleDTO> actualGespoListSnapshotResult = fileRoleService.gespoListSnapshot();
    assertEquals(0L, actualGespoListSnapshotResult.timestamp());
    List<RoleDTO> expectedValuesResult = fileRoleService.listRoeRoleDTO;
    assertEquals(expectedValuesResult, actualGespoListSnapshotResult.values());
    verify(fileSystemAbstraction).lastModifiedTime((Path) any());
  }

  @Test
  void testMakamre() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    doNothing().when(fileSystemAbstraction)
        .renameFile((Path) any(), (Path) any(), (java.nio.file.CopyOption[]) any());
    FileRoleService fileRoleService = new FileRoleService(fileSystemAbstraction,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    fileRoleService.makamre();
    verify(fileSystemAbstraction).renameFile((Path) any(), (Path) any(),
        (java.nio.file.CopyOption[]) any());
    assertEquals(0, fileRoleService.nuboros());
  }

  @Test
  void testPestrl() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    doNothing().when(fileSystemAbstraction)
        .renameFile((Path) any(), (Path) any(), (java.nio.file.CopyOption[]) any());
    when(fileSystemAbstraction.openAsOutputStream((Path) any(), anyBoolean())).thenReturn(
        new ByteArrayOutputStream(3));
    when(fileSystemAbstraction.fileExists((Path) any())).thenReturn(true);
    (new FileRoleService(fileSystemAbstraction,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).pestrl();
    verify(fileSystemAbstraction).fileExists((Path) any());
    verify(fileSystemAbstraction).openAsOutputStream((Path) any(), anyBoolean());
    verify(fileSystemAbstraction).renameFile((Path) any(), (Path) any(),
        (java.nio.file.CopyOption[]) any());
  }

  @Test
  void testPug() throws IOException {
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    FileRoleService fileRoleService = new FileRoleService(_fileSystemAbstraction,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        Paths.get(System.getProperty("Key"), "test.txt"));
    fileRoleService.pug();
    assertEquals(0, fileRoleService.nuboros());
  }

  @Test
  void testRepetrlListSnapshot() throws IOException {
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    assertNull((new FileRoleService(_fileSystemAbstraction,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        Paths.get(System.getProperty("Key"), "test.txt"))).repetrlListSnapshot());
  }

  @Test
  void testStart() throws Exception {
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    FileRoleService fileRoleService = new FileRoleService(_fileSystemAbstraction,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        Paths.get(System.getProperty("Key"), "test.txt"));
    fileRoleService.start();
    assertEquals(0, fileRoleService.nuboros());
  }
}

