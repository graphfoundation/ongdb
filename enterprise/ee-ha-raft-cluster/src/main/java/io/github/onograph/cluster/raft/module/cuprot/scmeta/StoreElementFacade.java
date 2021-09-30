package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Objects;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;


public class StoreElementFacade {


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final Path path;


  private final int rLeng;


  private final String strPr;


  public StoreElementFacade(FileSystemAbstraction _fFileSystemAbstraction, Path _path, int rLeng,
      String _strPr) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.path = _path;
    this.rLeng = rLeng;
    this.strPr = _strPr;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      StoreElementFacade _tStoreElementFacade = (StoreElementFacade) obj;
      return this.rLeng == _tStoreElementFacade.rLeng && Objects.equals(this.path,
          _tStoreElementFacade.path) &&
          Objects.equals(this.strPr, _tStoreElementFacade.strPr);
    } else {
      return false;
    }
  }


  Path getPath() {
    return this.path;
  }


  int getRLeng() {
    return this.rLeng;
  }


  public String getStrPr() {
    return this.strPr;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.path, this.strPr, this.rLeng);
  }


  StoreChannel opeStoreChannel() throws IOException {
    return this.fFileSystemAbstraction.read(this.path);
  }


}
