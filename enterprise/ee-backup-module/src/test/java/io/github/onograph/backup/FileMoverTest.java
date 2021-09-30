package io.github.onograph.backup;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;

class FileMoverTest {

  @Test
  void testConstructor() {

    new FileMover(new DefaultFileSystemAbstraction());
  }

  @Test
  void test_trrfrmnStream() {

    (new FileMover(new DefaultFileSystemAbstraction()))
        ._trrfrmnStream(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }
}

