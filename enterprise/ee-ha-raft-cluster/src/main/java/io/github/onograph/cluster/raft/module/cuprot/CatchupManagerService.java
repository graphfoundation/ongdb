package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds;
import io.github.onograph.cluster.raft.module.cuprot.current.info.Meta;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StoreId;


public interface CatchupManagerService extends AutoCloseable {

  <RESULT> ReqV400Service<RESULT> vCatchupManagerServiceNeedsV4Handler(
      Function<CatchupServiceV300, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> _functionVacc);


  @FunctionalInterface
  interface CatchupRequest<RESULT> {


    CompletableFuture<RESULT> exceCompletableFuture(
        CatchupAnswerServiceHandlers<RESULT> _catchupAnswerServiceHandlersVaRESULT);
  }


  interface CatchupServiceV300 {


    default io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<AllGdbIds> gealdbidCatchupManagerServiceCatchupRequest() {

      throw new UnsupportedOperationException("*** Error:  eaec848e-771b-47d0-9d82-663f121c2142");
    }


    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<SnapshotData> gecrspCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId);


    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<NamedDatabaseId> gedasidCatchupManagerServiceCatchupRequest(
        String _strVa);


    default io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<AuthMeta> gematCatchupManagerServiceCatchupRequest(
        String gdbName, String _strIm) {

      throw new UnsupportedOperationException("*** Error:  001d49ac-6589-4d10-9b65-724157d02a68");
    }


    default io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<Meta> gerclifCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId) {

      throw new UnsupportedOperationException("*** Error:  5bcb1dbe-d7a6-4250-9dba-604eb179c45f");
    }


    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<StoreSyncCompleted> gesrfiCatchupManagerServiceCatchupRequest(
        long _lgV, NamedDatabaseId _namedDatabaseId, StoreId _storeId, Path _vPath);


    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<StoreId> gesridCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId);


    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<SetupGdbStoreSyncReply> prrsrcyCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId, StoreId _storeId);


    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<TransactionChunkingCompleted> putrcsCatchupManagerServiceCatchupRequest(
        CommandReaderFactory _commandReaderFactory, long _lgVar, NamedDatabaseId _namedDatabaseId,
        StoreId _storeId);
  }


  interface CatchupServiceV400 extends CatchupServiceV300 {

    @Override
    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<AllGdbIds> gealdbidCatchupManagerServiceCatchupRequest();

    @Override
    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<AuthMeta> gematCatchupManagerServiceCatchupRequest(
        String _strV, String _strV2);

    @Override
    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<Meta> gerclifCatchupManagerServiceCatchupRequest(
        NamedDatabaseId _namedDatabaseId);
  }


  interface CatchupServiceV500 extends CatchupServiceV400 {

  }


  interface CatchupVersionedManager<RESULT> extends ReqV300Service<RESULT>, ReqV400Service<RESULT>,
      ReqV500Service<RESULT>,
      io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.ResponseRequestAble<RESULT>,
      io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.ResultRequestProvider<RESULT> {

  }


  interface ReqV300Service<RESULT> {


    ReqV400Service<RESULT> vCatchupManagerService400(
        Function<CatchupServiceV300, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> _functionVcc);
  }


  interface ReqV400Service<RESULT> {


    ReqV500Service<RESULT> vCatchupManagerServiceNeedsV5Handler(
        Function<CatchupServiceV400, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> _functionVacc);
  }


  interface ReqV500Service<RESULT> {


    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.ResponseRequestAble<RESULT> vCatchupManagerServiceResponseRequestAble(
        Function<CatchupServiceV500, io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.CatchupRequest<RESULT>> _functionVcc);
  }


  interface ResponseRequestAble<RESULT> {


    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService.ResultRequestProvider<RESULT> catchupAnswerServiceHandlersVRESULT(
        CatchupAnswerServiceHandlers<RESULT> _catchupAnswerServiceHandlersVRESULT);
  }


  interface ResultRequestProvider<RESULT> {


    RESULT reut() throws Exception;
  }
}
