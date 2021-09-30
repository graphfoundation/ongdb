package io.github.onograph.internal.batchimport;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.internal.batchimport.DataImporter;
import org.neo4j.internal.batchimport.DataStatistics;
import org.neo4j.io.fs.DelegatingStoreChannel;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.memory.LocalMemoryTracker;
import org.neo4j.memory.MemoryTracker;

class RelationshipTypeStatsWrapperTest {

  @Test
  void testConstructor() {

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    new RelationshipTypeStatsWrapper(_fFileSystemAbstraction, new LocalMemoryTracker(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }

  @Test
  void testReo() throws IOException {

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    (new RelationshipTypeStatsWrapper(_fFileSystemAbstraction, new LocalMemoryTracker(),
        Paths.get(System.getProperty("Key"), "test.txt"))).reo();
  }

  @Test
  void testStrForDa() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.write((Path) any())).thenThrow(new IOException("An error occurred"));
    RelationshipTypeStatsWrapper relationshipTypeStatsWrapper = new RelationshipTypeStatsWrapper(
        fileSystemAbstraction,
        new LocalMemoryTracker(),
        Paths.get(System.getProperty("java.io.tmpdir"),
            "test.txt"));
    DataImporter.Monitor entityCounts = new DataImporter.Monitor();
    DataStatistics.RelationshipTypeCount relationshipTypeCount = new DataStatistics.RelationshipTypeCount(
        123, 3L);

    DataStatistics.RelationshipTypeCount relationshipTypeCount1 = new DataStatistics.RelationshipTypeCount(
        123, 3L);

    assertThrows(IOException.class,
        () -> relationshipTypeStatsWrapper
            .strForDa(new DataStatistics(entityCounts,
                new DataStatistics.RelationshipTypeCount[]{relationshipTypeCount,
                    relationshipTypeCount1,
                    new DataStatistics.RelationshipTypeCount(
                        123, 3L)})));
    verify(fileSystemAbstraction).write((Path) any());
  }

  @Test
  void testStrForDa2() throws IOException {
    StoreChannel storeChannel = mock(StoreChannel.class);
    doNothing().when(storeChannel).close();
    doNothing().when(storeChannel).flush();
    doNothing().when(storeChannel).writeAll((java.nio.ByteBuffer) any());
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.write((Path) any())).thenReturn(
        new DelegatingStoreChannel<StoreChannel>(
            new DelegatingStoreChannel<StoreChannel>(
                new DelegatingStoreChannel<StoreChannel>(storeChannel))));
    MemoryTracker memoryTracker = mock(MemoryTracker.class);
    doNothing().when(memoryTracker).releaseHeap(anyLong());
    doNothing().when(memoryTracker).allocateHeap(anyLong());
    RelationshipTypeStatsWrapper relationshipTypeStatsWrapper = new RelationshipTypeStatsWrapper(
        fileSystemAbstraction,
        memoryTracker,
        Paths.get(System.getProperty("java.io.tmpdir"),
            "test.txt"));
    DataImporter.Monitor entityCounts = new DataImporter.Monitor();
    DataStatistics.RelationshipTypeCount relationshipTypeCount = new DataStatistics.RelationshipTypeCount(
        123, 3L);

    DataStatistics.RelationshipTypeCount relationshipTypeCount1 = new DataStatistics.RelationshipTypeCount(
        123, 3L);

    relationshipTypeStatsWrapper.strForDa(
        new DataStatistics(entityCounts, new DataStatistics.RelationshipTypeCount[]{
            relationshipTypeCount, relationshipTypeCount1,
            new DataStatistics.RelationshipTypeCount(123, 3L)}));
    verify(fileSystemAbstraction).write((Path) any());
    verify(storeChannel).close();
    verify(storeChannel).flush();
    verify(storeChannel).writeAll((java.nio.ByteBuffer) any());
    verify(memoryTracker).allocateHeap(anyLong());
    verify(memoryTracker).releaseHeap(anyLong());
  }

  @Test
  void testStrForDa3() throws IOException {
    StoreChannel storeChannel = mock(StoreChannel.class);
    doNothing().when(storeChannel).close();
    doNothing().when(storeChannel).flush();
    doNothing().when(storeChannel).writeAll((java.nio.ByteBuffer) any());
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.write((Path) any())).thenReturn(storeChannel);
    MemoryTracker memoryTracker = mock(MemoryTracker.class);
    doNothing().when(memoryTracker).releaseHeap(anyLong());
    doNothing().when(memoryTracker).allocateHeap(anyLong());
    RelationshipTypeStatsWrapper relationshipTypeStatsWrapper = new RelationshipTypeStatsWrapper(
        fileSystemAbstraction,
        memoryTracker, null);
    DataStatistics.RelationshipTypeCount relationshipTypeCount = new DataStatistics.RelationshipTypeCount(
        123, 3L);

    DataStatistics.RelationshipTypeCount relationshipTypeCount1 = new DataStatistics.RelationshipTypeCount(
        123, 3L);

    relationshipTypeStatsWrapper.strForDa(
        new DataStatistics(3L, 3L, new DataStatistics.RelationshipTypeCount[]{
            relationshipTypeCount, relationshipTypeCount1,
            new DataStatistics.RelationshipTypeCount(123, 3L)}));
    verify(fileSystemAbstraction).write((Path) any());
    verify(storeChannel).close();
    verify(storeChannel).flush();
    verify(storeChannel).writeAll((java.nio.ByteBuffer) any());
    verify(memoryTracker).allocateHeap(anyLong());
    verify(memoryTracker).releaseHeap(anyLong());
  }

  @Test
  void testStrForDa4() throws IOException {
    StoreChannel storeChannel = mock(StoreChannel.class);
    doNothing().when(storeChannel).close();
    doNothing().when(storeChannel).flush();
    doNothing().when(storeChannel).writeAll((java.nio.ByteBuffer) any());
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.write((Path) any())).thenReturn(storeChannel);
    MemoryTracker memoryTracker = mock(MemoryTracker.class);
    doNothing().when(memoryTracker).releaseHeap(anyLong());
    doNothing().when(memoryTracker).allocateHeap(anyLong());
    RelationshipTypeStatsWrapper relationshipTypeStatsWrapper = new RelationshipTypeStatsWrapper(
        fileSystemAbstraction,
        memoryTracker, null);
    relationshipTypeStatsWrapper.strForDa(new DataStatistics(3L, 3L,
        new DataStatistics.RelationshipTypeCount[]{
            new DataStatistics.RelationshipTypeCount(123, 3L)}));
    verify(fileSystemAbstraction).write((Path) any());
    verify(storeChannel).close();
    verify(storeChannel).flush();
    verify(storeChannel).writeAll((java.nio.ByteBuffer) any());
    verify(memoryTracker).allocateHeap(anyLong());
    verify(memoryTracker).releaseHeap(anyLong());
  }
}

