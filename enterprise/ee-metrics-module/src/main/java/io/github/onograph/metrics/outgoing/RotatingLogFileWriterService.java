package io.github.onograph.metrics.outgoing;

import java.nio.file.Path;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.log4j.RotatingLogFileWriter;


@FunctionalInterface
public interface RotatingLogFileWriterService {


  RotatingLogFileWriter crawtRotatingLogFileWriter(FileSystemAbstraction _fileSystemAbstraction,
      Path _vaPath, long _lgVar, int _iV, String _strV, String _strV2);
}
