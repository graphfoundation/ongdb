package io.github.onograph.dbms.crash;

import java.util.List;
import org.neo4j.kernel.database.NamedDatabaseId;


public interface CrashManager {


  void addtepcethlForNaLi(List<? extends DbmsCrashManager> _listVDbmsCrashManager,
      NamedDatabaseId _namedDatabaseId);


  CrashSignaler paieCrashSignaler();


  @Deprecated
  GdbCrashSender paiefoGdbCrashSender(NamedDatabaseId _namedDatabaseId);


  void reedbpaevharForNa(NamedDatabaseId _namedDatabaseId);
}
