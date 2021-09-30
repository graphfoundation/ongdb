package io.github.onograph.backup;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Optional;
import java.util.UUID;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.DatabaseIdFactory;


public class GdbIdRepo {


  public static final String FIL_NME = io.github.onograph.TokenConstants.DATABASE__ID;


  static final Charset DEF_CHARSET;


  private static final int UUI_BTX_LEG = 36;

  static {
    DEF_CHARSET = StandardCharsets.UTF_8;
  }


  private final FileSystemAbstraction fFileSystemAbstraction;

  public GdbIdRepo(FileSystemAbstraction _fFileSystemAbstraction) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
  }


  public static Path gedtefpPath(Path _pfPath) {
    return _pfPath.resolve(io.github.onograph.TokenConstants.DATABASE__ID);
  }


  public Optional<DatabaseId> reddtaiOptional(Path _pfPath) {

    Path _ppfPath = gedtefpPath(_pfPath);
    if (!this.fFileSystemAbstraction.fileExists(_ppfPath)) {
      return Optional.empty();
    } else {
      try {

        StoreChannel _storeChannel = this.fFileSystemAbstraction.read(_ppfPath);

        Optional _optional;
        try {

          ByteBuffer _byteBuffer = ByteBuffer.allocate(36);
          _storeChannel.readAll(_byteBuffer);

          byte[] btCnt = new byte[36];
          _byteBuffer.flip().get(btCnt);

          UUID _uUID = UUID.fromString(new String(btCnt, StandardCharsets.UTF_8));
          _optional = Optional.of(DatabaseIdFactory.from(_uUID));
        } catch (

            Throwable _throwable) {
          if (_storeChannel != null) {
            try {
              _storeChannel.close();
            } catch (

                Throwable _throwable2) {
              _throwable.addSuppressed(_throwable2);
            }
          }

          throw _throwable;
        }

        if (_storeChannel != null) {
          _storeChannel.close();
        }

        return _optional;
      } catch (

          Exception _exception) {

        throw new IllegalStateException("*** Error: 5ee49c6e-3758-419d-8024-88baf03aa5a0",
            _exception);
      }
    }
  }


  public void wrdaiForDaPa(DatabaseId _databaseId, Path _pfPath)
      throws IOException {
    if (!this.fFileSystemAbstraction.fileExists(_pfPath)) {
      this.fFileSystemAbstraction.mkdirs(_pfPath);
    }

    Path _ppfPath = gedtefpPath(_pfPath);

    StoreChannel _storeChannel = this.fFileSystemAbstraction.write(_ppfPath);

    try {
      _storeChannel.writeAll(ByteBuffer.wrap(_databaseId.uuid().toString().getBytes(DEF_CHARSET)));
    } catch (

        Throwable _throwable) {
      if (_storeChannel != null) {
        try {
          _storeChannel.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_storeChannel != null) {
      _storeChannel.close();
    }
  }
}
