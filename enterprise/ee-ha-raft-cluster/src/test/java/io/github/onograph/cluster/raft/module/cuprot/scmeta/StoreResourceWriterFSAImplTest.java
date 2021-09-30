package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DelegatingStoreChannel;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;

class StoreResourceWriterFSAImplTest {

  @Test
  void testFrmflStoreResourceWriterFSAImpl() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.write((Path) any()))
        .thenReturn(
            new DelegatingStoreChannel<StoreChannel>(new DelegatingStoreChannel<StoreChannel>(
                new DelegatingStoreChannel<StoreChannel>(
                    new DelegatingStoreChannel<StoreChannel>(null)))));
    StoreResourceWriterFSAImpl.frmflStoreResourceWriterFSAImpl(fileSystemAbstraction,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    verify(fileSystemAbstraction).write((Path) any());
  }
}

