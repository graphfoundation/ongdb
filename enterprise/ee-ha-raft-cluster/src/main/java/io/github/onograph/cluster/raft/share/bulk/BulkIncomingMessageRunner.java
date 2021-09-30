package io.github.onograph.cluster.raft.share.bulk;

import io.github.onograph.cluster.raft.akkamsg.FLIncomingMessageProcessor;
import io.github.onograph.cluster.raft.akkamsg.IncomingMessageProvider;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.utils.queuesrv.ElementQueueRunnerImpl;
import io.github.onograph.cluster.raft.utils.queuesrv.QueueableJobSchedulerWrapper;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.neo4j.configuration.Config;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;


public class BulkIncomingMessageRunner
    implements Runnable,
    FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> {


  private final AtomicLong cdAtomicLong;


  private final FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
      fLIncomingMessageProcessorHdArrivingMessageManager;


  private final BulkMessageManager fhbBulkMessageManager;


  private final Log log;


  private final MessageStack<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
      messageStackIqArrivingMessageManager;


  private final QueueableJobSchedulerWrapper queueableJobSchedulerWrapper;


  private final AtomicBoolean rnigAtomicBoolean = new AtomicBoolean(false);


  private volatile io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType rlMessageStackStatusType;


  BulkIncomingMessageRunner(BulkMessageSettings _cbBulkMessageSettings,
      io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackSettings _cqiMessageStackSettings,
      FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _fLIncomingMessageProcessorHdArrivingMessageManager,
      LogProvider _logProvider, QueueableJobSchedulerWrapper _queueableJobSchedulerWrapper) {
    this.rlMessageStackStatusType = io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OK;
    this.cdAtomicLong = new AtomicLong();
    this.fLIncomingMessageProcessorHdArrivingMessageManager = _fLIncomingMessageProcessorHdArrivingMessageManager;
    this.log = _logProvider.getLog(this.getClass());
    this.messageStackIqArrivingMessageManager =
        new MessageStack<>(_cqiMessageStackSettings, new BulkPriorityQueueMessageProcessor(),
            DataMessageProcessor::ofForCo);
    this.queueableJobSchedulerWrapper = _queueableJobSchedulerWrapper;
    this.fhbBulkMessageManager = new BulkMessageManager(_cbBulkMessageSettings,
        this.messageStackIqArrivingMessageManager);
  }


  public static IncomingMessageProvider copaeIncomingMessageProvider(Config _config,
      JobScheduler _jobScheduler, LogProvider _logProvider) {

    io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackSettings _iqcMessageStackSettings =
        new io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackSettings(
            (Integer) _config.get(SettingsDeclarationClusterSystemImpl.settingRaneInteger),
            (Long) _config.get(SettingsDeclarationClusterImpl.settingRaneyLong));

    BulkMessageSettings _cbBulkMessageSettings = new BulkMessageSettings(
        (Integer) _config.get(SettingsDeclarationClusterSystemImpl.settingRaneaInteger),
        (Long) _config.get(SettingsDeclarationClusterImpl.settingRaneayLong));
    return (delegate) ->
    {
      return new BulkIncomingMessageRunner(_cbBulkMessageSettings, _iqcMessageStackSettings,
          delegate, _logProvider,
          new QueueableJobSchedulerWrapper(_jobScheduler,
              new ElementQueueRunnerImpl(), Group.RAFT_HANDLER,
              _logProvider.getLog(BulkIncomingMessageRunner.class)));
    };
  }


  private void _loaygriiqu() {

    int _iRmc = this.messageStackIqArrivingMessageManager.con();
    if (_iRmc > 0) {

      ArrayList<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
          _arrayListMuArrivingMessageManager = new ArrayList(_iRmc);

      for (

          int cur = 0; cur < _iRmc; ++cur) {

        Optional<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
            _optionalNmArrivingMessageManager = this.messageStackIqArrivingMessageManager.polOptional();
        if (_optionalNmArrivingMessageManager.isEmpty()) {
          break;
        }

        _arrayListMuArrivingMessageManager.add(
            (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager) _optionalNmArrivingMessageManager.get());
      }


    }
  }


  private void _loqusteForMe(
      io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType _rslMessageStackStatusType) {
    if (_rslMessageStackStatusType
        != io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OK) {
      this.cdAtomicLong.incrementAndGet();
    }

    if (_rslMessageStackStatusType != this.rlMessageStackStatusType) {
      if (_rslMessageStackStatusType
          == io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OK) {

      } else {

      }

      this.rlMessageStackStatusType = _rslMessageStackStatusType;
    }
  }

  @Override
  public void hadForM(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _arrivingMessageManagerMcObject) {
    if (!this.rnigAtomicBoolean.get()) {

    } else {

      io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType _rslMessageStackStatusType =
          this.messageStackIqArrivingMessageManager.ofeMessageStackMessageStackStatusType(
              _arrivingMessageManagerMcObject);
      this._loqusteForMe(_rslMessageStackStatusType);
      if (_rslMessageStackStatusType
          == io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OK) {
        this.queueableJobSchedulerWrapper.ofejoForRu(this);
      }
    }
  }

  @Override
  public void run() {
    this.messageStackIqArrivingMessageManager.polOptional().ifPresent((message) ->
    {

      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>
          _arrivingMessageManagerMbObject =
          (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager) message.getM()
              .dipc(
                  this.fhbBulkMessageManager.baihnBulkMessageProcessor(
                      message.getConsensusMemberGroupId(),
                      message.getArInstant()));
      this.fLIncomingMessageProcessorHdArrivingMessageManager.hadForM(
          _arrivingMessageManagerMbObject == null ? message
              : _arrivingMessageManagerMbObject);
    });
  }

  @Override
  public void startProcessor(ConsensusMemberGroupId consensusMemberGroupId) throws Exception {
    this.rnigAtomicBoolean.set(true);
    this.fLIncomingMessageProcessorHdArrivingMessageManager.startProcessor(consensusMemberGroupId);
  }

  @Override
  public void stopProcessor() throws Exception {

    boolean _isWr = this.rnigAtomicBoolean.compareAndExchange(true, false);
    if (_isWr) {
      this.queueableJobSchedulerWrapper.stpadfu();
    }

    this.fLIncomingMessageProcessorHdArrivingMessageManager.stopProcessor();
    if (_isWr) {
      this._loaygriiqu();
    }
  }
}
