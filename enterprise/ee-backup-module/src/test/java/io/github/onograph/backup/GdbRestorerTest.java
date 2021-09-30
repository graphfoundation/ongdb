package io.github.onograph.backup;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;

class GdbRestorerTest {

  @Test
  void testConstructor() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    PrintStream _ocPrintStream = new PrintStream(new ByteArrayOutputStream(3));
    Path _pdfPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    Path _rgpPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getScriptDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    new GdbRestorer(_fFileSystemAbstraction, true, true, _ocPrintStream, _pdfPath, _rgpPath,
        databaseLayout);
  }

  @Test
  void testConstructor2() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    PrintStream _ocPrintStream = new PrintStream(new ByteArrayOutputStream(3));
    Path _pdfPath = Paths.get("causal_clustering.leadership_priority_group", "test.txt");
    Path _rgpPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getScriptDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    new GdbRestorer(_fFileSystemAbstraction, true, true, _ocPrintStream, _pdfPath, _rgpPath,
        databaseLayout);
  }

  @Test
  void testConstructor3() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    PrintStream _ocPrintStream = new PrintStream(new ByteArrayOutputStream(3));
    Path _pdfPath = Paths.get("", "More", "More");
    Path _rgpPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getScriptDirectory()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    new GdbRestorer(_fFileSystemAbstraction, true, true, _ocPrintStream, _pdfPath, _rgpPath,
        databaseLayout);
  }
}

