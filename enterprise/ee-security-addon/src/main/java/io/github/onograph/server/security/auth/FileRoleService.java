package io.github.onograph.server.security.auth;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import org.neo4j.cypher.internal.security.FormatException;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.server.security.auth.FileRepository;
import org.neo4j.server.security.auth.ListSnapshot;


public class FileRoleService extends AbstractRoleService implements FileRepository {


  private final FileSystemAbstraction fileSystemAbstraction;


  private final Log log;


  private final Path prPath;


  private final RoleDTOFileRepositorySerializer sraiaRoleDTOFileRepositorySerializer = new RoleDTOFileRepositorySerializer();


  public FileRoleService(FileSystemAbstraction _fileSystemAbstraction, LogProvider _logProvider,
      Path _path) {
    this.prPath = _path;
    this.log = _logProvider.getLog(this.getClass());
    this.fileSystemAbstraction = _fileSystemAbstraction;
  }

  @Override
  public ListSnapshot<RoleDTO> gespoListSnapshot() throws IOException {
    if (this.latladAtomicLong.get() < this.fileSystemAbstraction.lastModifiedTime(this.prPath)) {
      return this.repetrlListSnapshot();
    } else {
      synchronized (this) {
        return new ListSnapshot(this.latladAtomicLong.get(), new ArrayList(this.listRoeRoleDTO));
      }
    }
  }

  @Override
  public void makamre() throws IOException {
    super.makamre();

    Path _pdPath = FileRepository.getMigratedFile(this.prPath);
    this.fileSystemAbstraction.renameFile(this.prPath, _pdPath, StandardCopyOption.REPLACE_EXISTING,
        StandardCopyOption.COPY_ATTRIBUTES);
  }

  @Override
  protected void pestrl() throws IOException {
    this.sraiaRoleDTOFileRepositorySerializer.saveRecordsToFile(this.fileSystemAbstraction,
        this.prPath, this.listRoeRoleDTO);
  }

  @Override
  public void pug() throws IOException {
    super.pug();
    this.fileSystemAbstraction.deleteFile(this.prPath);
  }

  @Override
  protected ListSnapshot<RoleDTO> repetrlListSnapshot() throws IOException {
    if (this.fileSystemAbstraction.fileExists(this.prPath)) {

      long _lgTr;

      List _rrList;
      try {
        _lgTr = this.fileSystemAbstraction.lastModifiedTime(this.prPath);
        _rrList = this.sraiaRoleDTOFileRepositorySerializer.loadRecordsFromFile(
            this.fileSystemAbstraction, this.prPath);
      } catch (

          FormatException _formatException) {

        throw new IllegalStateException("*** Error: 6682777c-5e13-43fd-b4e5-52f6889e16f8");
      }

      return new ListSnapshot(_lgTr, _rrList);
    } else {
      return null;
    }
  }

  @Override
  public void start() throws Exception {
    this.cla();
    FileRepository.assertNotMigrated(this.prPath, this.fileSystemAbstraction, this.log);

    ListSnapshot<RoleDTO> _listSnapshotOdrRoleDTO = this.repetrlListSnapshot();
    if (_listSnapshotOdrRoleDTO != null) {
      this.sereForLi(_listSnapshotOdrRoleDTO);
    }
  }
}
