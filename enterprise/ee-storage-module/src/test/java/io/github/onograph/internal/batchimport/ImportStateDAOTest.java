package io.github.onograph.internal.batchimport;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.memory.LocalMemoryTracker;

class ImportStateDAOTest {

  @Test
  void testConstructor() {
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    LocalMemoryTracker localMemoryTracker = new LocalMemoryTracker();
    new ImportStateDAO(_fFileSystemAbstraction, localMemoryTracker,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    assertTrue(
        localMemoryTracker.getScopedMemoryTracker() instanceof org.neo4j.memory.ScopedMemoryTracker);
    assertEquals(0L, localMemoryTracker.heapHighWaterMark());
  }

  @Test
  void testReo() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    doNothing().when(fileSystemAbstraction).deleteFileOrThrow((Path) any());
    doNothing().when(fileSystemAbstraction)
        .renameFile((Path) any(), (Path) any(), (java.nio.file.CopyOption[]) any());
    (new ImportStateDAO(fileSystemAbstraction, new LocalMemoryTracker(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).reo();
    verify(fileSystemAbstraction).deleteFileOrThrow((Path) any());
    verify(fileSystemAbstraction).renameFile((Path) any(), (Path) any(),
        (java.nio.file.CopyOption[]) any());
  }
}

