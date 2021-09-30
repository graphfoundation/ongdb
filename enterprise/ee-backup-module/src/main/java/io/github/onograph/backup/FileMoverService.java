package io.github.onograph.backup;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;


public interface FileMoverService {


  static FileMoverService covifeseFileMoverService(final Path _fpPath, final Path _pbPath) {
    return new FileMoverService() {
      @Override
      public Path filPath() {
        return _fpPath;
      }

      @Override
      public void movForPaCo(Path _ptPath, CopyOption... _sCopyOptionArray)
          throws IOException {

        Path _prPath = _pbPath.relativize(_fpPath);

        Path _prPath2 = _ptPath.resolve(_prPath);
        if (!Files.isSymbolicLink(_prPath2.getParent())) {
          Files.createDirectories(_prPath2.getParent());
        }

        Files.copy(_fpPath, _prPath2, _sCopyOptionArray);
      }
    };
  }


  static FileMoverService movifeseFileMoverService(final Path _psPath, final Path _psPath2) {
    return new FileMoverService() {
      @Override
      public Path filPath() {
        return _psPath;
      }

      @Override
      public void movForPaCo(Path _ptPath, CopyOption... _sCopyOptionArray)
          throws IOException {
        FileMoverService.covifeseFileMoverService(_psPath, _psPath2)
            .movForPaCo(_ptPath, _sCopyOptionArray);
        Files.delete(_psPath);
      }
    };
  }


  Path filPath();


  void movForPaCo(Path _varPath, CopyOption... _copyOptionArray) throws IOException;
}
