package io.github.onograph.backup;

import org.neo4j.io.layout.DatabaseLayout;


public interface BackupVerificationService {


  BackupVerificationService NOO_BACKUP_VERIFICATION_SERVICE = (databaseLayout) ->
  {
  };


  void chcsyForDa(DatabaseLayout _databaseLayout) throws BackupVerificationErrorException;
}
