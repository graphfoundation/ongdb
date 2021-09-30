package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager;
import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import org.neo4j.logging.Log;


public abstract class AbstractCatchupAnswerManager<T> extends CatchupAnswerManager<T> {


  private final Log log;


  private final StoreResourceWriterService psfsStoreResourceWriterService;


  private StoreResourceWriter sfsStoreResourceWriter;


  private AbstractCatchupAnswerManager(Log _log,
      StoreResourceWriterService _psfsStoreResourceWriterService) {
    this.log = _log;
    this.psfsStoreResourceWriterService = _psfsStoreResourceWriterService;
  }


  public static AbstractCatchupAnswerManager<StoreSyncCompleted> ficadrAbstractCatchupAnswerManager(
      Log _log, StoreResourceWriterService _psfsStoreResourceWriterService) {
    return new io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.SSCCatchupAnswerManager(
        _log,
        _psfsStoreResourceWriterService);
  }


  public static AbstractCatchupAnswerManager<SetupGdbStoreSyncReply> prrsrcyatAbstractCatchupAnswerManager(
      Log _log, StoreResourceWriterService _psfsStoreResourceWriterService) {
    return new io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.SetupGSSCatchupAnswerManager(
        _log,
        _psfsStoreResourceWriterService);
  }

  @Override
  public boolean isOnficttForCoSl(CompletableFuture<T> _completableFutureSgaT, Slice _cfSlice) {
    try {
      this.sfsStoreResourceWriter.wrtForBy(_cfSlice.getPyodByteBuf());
    } catch (

        Exception _exception) {
      _completableFutureSgaT.completeExceptionally(_exception);
    }

    return _cfSlice.getIsIl();
  }

  @Override
  public void onfihdForCoSl(CompletableFuture<T> _completableFutureRosT, SliceMeta _hfSliceMeta) {
    try {

      StoreResourceWriter _sfStoreResourceWriter =
          this.psfsStoreResourceWriterService.acueStoreResourceWriter(_hfSliceMeta.getIAr(),
              _hfSliceMeta.getStrNf());
      _completableFutureRosT.whenComplete(
          new io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.CleanupBiConsumer(
              _sfStoreResourceWriter,
              _hfSliceMeta.getStrNf()));
      this.sfsStoreResourceWriter = _sfStoreResourceWriter;
    } catch (

        Exception _exception) {
      _completableFutureRosT.completeExceptionally(_exception);
    }
  }


  private static class SSCCatchupAnswerManager extends
      AbstractCatchupAnswerManager<StoreSyncCompleted> {

    SSCCatchupAnswerManager(Log _log, StoreResourceWriterService _psfsStoreResourceWriterService) {
      super(_log, _psfsStoreResourceWriterService);
    }

    @Override
    public void onccerresForCoCa(CatchupProblem _cerCatchupProblem,
        CompletableFuture<StoreSyncCompleted> _completableFutureSgaStoreSyncCompleted) {

      io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType stat =
          _cerCatchupProblem.getStat() == CatchupStatusType.CST_UNKNOWN_GDB_ERR
              ? io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_BAD_GDB_ERR
              : io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_GENERAL_ERR;
      _completableFutureSgaStoreSyncCompleted.complete(new StoreSyncCompleted(-1L, stat));
    }

    @Override
    public void onfesaceForCoSt(
        CompletableFuture<StoreSyncCompleted> _completableFutureSgaStoreSyncCompleted,
        StoreSyncCompleted _rsosStoreSyncCompleted) {
      _completableFutureSgaStoreSyncCompleted.complete(_rsosStoreSyncCompleted);
    }
  }


  private static class SetupGSSCatchupAnswerManager extends
      AbstractCatchupAnswerManager<SetupGdbStoreSyncReply> {

    SetupGSSCatchupAnswerManager(Log _log,
        StoreResourceWriterService _psfsStoreResourceWriterService) {
      super(_log, _psfsStoreResourceWriterService);
    }

    @Override
    public void onsrltresForCoSe(
        CompletableFuture<SetupGdbStoreSyncReply> _completableFutureSgaSetupGdbStoreSyncReply,
        SetupGdbStoreSyncReply _rsosSetupGdbStoreSyncReply) {
      _completableFutureSgaSetupGdbStoreSyncReply.complete(_rsosSetupGdbStoreSyncReply);
    }
  }


  private class CleanupBiConsumer<RESPONSE> implements BiConsumer<RESPONSE, Throwable> {


    private final StoreResourceWriter sfStoreResourceWriter;


    private final String strNf;

    private CleanupBiConsumer(StoreResourceWriter _sfStoreResourceWriter, String _strFn) {
      this.sfStoreResourceWriter = _sfStoreResourceWriter;
      this.strNf = _strFn;
    }

    @Override
    public void accept(RESPONSE _rsosRsos, Throwable _throwable) {
      try {
        this.sfStoreResourceWriter.close();
      } catch (

          Exception _exception) {

      }
    }
  }
}
