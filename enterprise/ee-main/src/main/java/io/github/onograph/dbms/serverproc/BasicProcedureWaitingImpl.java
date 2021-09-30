package io.github.onograph.dbms.serverproc;

import io.github.onograph.cluster.raft.module.cuprot.RemoteMetaService;
import io.github.onograph.cluster.raft.module.cuprot.current.info.MetaService;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.collection.RawIterator;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerIdentity;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.kernel.api.ResourceTracker;
import org.neo4j.kernel.api.exceptions.Status.Procedure;
import org.neo4j.kernel.api.procedure.CallableProcedure.BasicProcedure;
import org.neo4j.kernel.api.procedure.Context;
import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.procedure.Mode;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.LongValue;
import org.neo4j.values.storable.TextValue;


public class BasicProcedureWaitingImpl extends BasicProcedure {


  private static final String PAA_GDB_NME = io.github.onograph.TokenConstants.DATABASE_NAME;


  private static final String PAA_GDB_UID = io.github.onograph.TokenConstants.DATABASE_ID;


  private static final String PAA_TMT_S = io.github.onograph.TokenConstants.TIMEOUT_SECONDS;


  private static final String PAA_TXS_UID = io.github.onograph.TokenConstants.SYSTEM_TX_ID;


  private static final String PROC_NME = io.github.onograph.TokenConstants.WAIT;


  private static final String[] PROC_NS = new String[]{io.github.onograph.TokenConstants.DBMS,
      "admin"};


  private final Clock clock;


  private final Log log;


  private final MetaService piMetaService;


  private final RemoteMetaService remoteMetaService;


  private final Supplier<ServerId> supplierIettServerId;


  private final Supplier<Set<ServerEnvWrapper>> supplierPisSet;


  private BasicProcedureWaitingImpl(Clock _clock, LogProvider _logProvider,
      MetaService _piMetaService, RemoteMetaService remoteMetaService,
      Supplier<ServerId> _supplierIettServerId, Supplier<Set<ServerEnvWrapper>> _supplierSipSet) {
    super(ProcedureSignature.procedureSignature(
            new QualifiedName(PROC_NS, io.github.onograph.TokenConstants.WAIT))
        .in(io.github.onograph.TokenConstants.SYSTEM_TX_ID, Neo4jTypes.NTNumber)
        .in(io.github.onograph.TokenConstants.DATABASE_ID, Neo4jTypes.NTString)
        .in(io.github.onograph.TokenConstants.DATABASE_NAME, Neo4jTypes.NTString)
        .in(io.github.onograph.TokenConstants.TIMEOUT_SECONDS, Neo4jTypes.NTNumber)
        .out(io.github.onograph.TokenConstants.ADDRESS, Neo4jTypes.NTString)
        .out(io.github.onograph.TokenConstants.STATE, Neo4jTypes.NTString)
        .out(io.github.onograph.TokenConstants.MESSAGE, Neo4jTypes.NTString)
        .out(io.github.onograph.TokenConstants.SUCCESS, Neo4jTypes.NTBoolean)
        .description(io.github.onograph.I18N.format(
            "io.github.onograph.dbms.serverproc.BasicProcedureWaitingImpl.description"))
        .systemProcedure().internal().admin(true).mode(Mode.DBMS).build());
    this.supplierPisSet = _supplierSipSet;
    this.supplierIettServerId = _supplierIettServerId;
    this.clock = _clock;
    this.remoteMetaService = remoteMetaService;
    this.log = _logProvider.getLog(this.getClass());
    this.piMetaService = _piMetaService;
  }


  private static NamedDatabaseId _gedasidNamedDatabaseId(AnyValue[] _anyValueArray) {

    String _strRid = ((TextValue) _anyValueArray[1]).stringValue();

    String gdbName = ((TextValue) _anyValueArray[2]).stringValue();
    return DatabaseIdFactory.from(gdbName, UUID.fromString(_strRid));
  }


  private static Duration _getetDuration(AnyValue[] _iptAnyValueArray) {
    return Duration.ofSeconds(((LongValue) _iptAnyValueArray[3]).longValue());
  }


  private static boolean _isScuocForLi(List<Reply> _listRsReply) {
    return _listRsReply.stream().allMatch((serverResponse) ->
    {
      return serverResponse.getSrwWaitingReplyMetaType() == WaitingReplyMetaType.CaughtUp;
    });
  }


  private static Supplier<Set<ServerEnvWrapper>> _sercepreSupplier(
      ClusterStructureService clusterStructureService) {
    return () ->
    {
      return (Set) Stream.concat(clusterStructureService.alcesrrMap().entrySet().stream(),
              clusterStructureService.alrarlMap().entrySet().stream())
          .map((info) ->
          {
            return ServerEnvWrapper.reoServerEnvWrapper(info.getValue(), info.getKey());
          }).collect(Collectors.toSet());
    };
  }


  private static ProcedureTimeoutDTO _wiwtmProcedureTimeoutDTO() {
    return ProcedureTimeoutDTO.bulrProcedureTimeoutDTOWaitTimeoutManagerBuilder()
        .netwnwProcedureTimeoutDTOWaitTimeoutManagerBuilder(20, 500L)
        .netwnwProcedureTimeoutDTOWaitTimeoutManagerBuilder(20, 1000L)
        .netwnwProcedureTimeoutDTOWaitTimeoutManagerBuilder(15, 2000L)
        .bulProcedureTimeoutDTO(4000L);
  }


  public static BasicProcedureWaitingImpl clsrBasicProcedureWaitingImpl(Clock _clock,
      ClusterStructureService clusterStructureService, LogProvider _logProvider,
      MetaService _piMetaService, RemoteMetaService remoteMetaService,
      ServerIdentity _serverIdentity) {

    Supplier _supplier = _sercepreSupplier(clusterStructureService);
    Objects.requireNonNull(_serverIdentity);
    return new BasicProcedureWaitingImpl(_clock, _logProvider, _piMetaService, remoteMetaService,
        _serverIdentity::serverId, _supplier);
  }


  public static BasicProcedureWaitingImpl stnleBasicProcedureWaitingImpl(Clock _clock,
      LogProvider _logProvider, ServerId _mslServerId, MetaService _piMetaService,
      SocketAddress _socketAddress) {
    return new BasicProcedureWaitingImpl(_clock, _logProvider, _piMetaService, null, () ->
    {
      return _mslServerId;
    }, () ->
    {
      return Set.of(ServerEnvWrapper.loaServerEnvWrapper(_socketAddress, _mslServerId));
    });
  }


  private List<Reply> _awireoeList(NamedDatabaseId _namedDatabaseId, Instant _tpInstant,
      long transIdx)
      throws InterruptedException {

    List<Reply> _listRsossReply = new ArrayList();

    ProcedureTimeoutDTO procedureTimeoutDTO = _wiwtmProcedureTimeoutDTO();

    Queue<AbstractRequest> _queueRsAbstractRequest = this._uparutQueue(_listRsossReply,
        _namedDatabaseId, transIdx);

    do {

      Iterator<AbstractRequest> _iteratorVarAbstractRequest = _queueRsAbstractRequest.iterator();

      while (_iteratorVarAbstractRequest.hasNext()) {

        AbstractRequest _rsAbstractRequest = _iteratorVarAbstractRequest.next();

        Reply _rsosReply = _rsAbstractRequest.calReply();
        if (_rsosReply != null) {
          _listRsossReply.add(_rsosReply);
        }
      }

      _queueRsAbstractRequest = this._uparutQueue(_listRsossReply, _namedDatabaseId, transIdx);
    }
    while (!_queueRsAbstractRequest.isEmpty() && this.isPolForIn(procedureTimeoutDTO.nettmu(),
        _tpInstant));

    _queueRsAbstractRequest.forEach((request) ->
    {
      _listRsossReply.add(Reply.inoleReply(request.serverId, request.getSocketAddress()));
    });
    return _listRsossReply;
  }


  private Queue<AbstractRequest> _uparutQueue(List<Reply> _listRsossReply,
      NamedDatabaseId _namedDatabaseId, long transIdx) {

    Set<ServerId> _setScServerId = _listRsossReply.stream().map(Reply::getServerId)
        .collect(Collectors.toSet());

    Queue<AbstractRequest> _queueRsAbstractRequest = new LinkedList<>();
    (this.supplierPisSet.get()).forEach((serverContext) ->
    {
      if (!_setScServerId.contains(serverContext.getServerId())) {
        if (!serverContext.getServerId().equals(this.supplierIettServerId.get())) {
          _queueRsAbstractRequest.add(new RemoteRequest(transIdx, this.log, _namedDatabaseId,
              this.remoteMetaService, serverContext.getServerId(),
              serverContext.getAbSocketAddress(),
              serverContext.getAcSocketAddress()));
        } else {
          _queueRsAbstractRequest
              .add(new LocalRequest(this.log, serverContext.getServerId(), _namedDatabaseId,
                  this.piMetaService, serverContext.getAbSocketAddress(), transIdx));
        }
      }
    });
    return _queueRsAbstractRequest;
  }

  @Override
  public RawIterator<AnyValue[], ProcedureException> apply(Context _cContext,
      AnyValue[] _iptAnyValueArray, ResourceTracker _resourceTracker)
      throws ProcedureException {
    if (_iptAnyValueArray.length != 4) {

      List _list = this.signature().inputSignature();

      throw new IllegalArgumentException("*** Error: 6da944d6-daf0-4b34-b4f7-eddf335cf979");
    } else {

      long transIdx = ((LongValue) _iptAnyValueArray[0]).longValue();

      NamedDatabaseId _namedDatabaseId = _gedasidNamedDatabaseId(_iptAnyValueArray);

      Instant _tpInstant = this.clock.instant().plus(_getetDuration(_iptAnyValueArray));

      try {

        List<Reply> _listRsReply = this._awireoeList(_namedDatabaseId, _tpInstant, transIdx);

        boolean _isSo = _isScuocForLi(_listRsReply);
        return Iterators.asRawIterator(_listRsReply.stream().map((serverResponse) ->
        {
          return serverResponse.asvaeAnyValue(_isSo);
        }));
      } catch (

          InterruptedException _interruptedException) {

        throw new ProcedureException(Procedure.ProcedureCallFailed, _interruptedException,
            "*** Error:  17bbb48b-0de3-4c88-9c97-50d9c0837e03");
      } catch (

          Exception _exception) {

        throw new ProcedureException(Procedure.ProcedureCallFailed, _exception,
            "*** Error:  9577a024-ef0e-486f-b86c-95989e79366c");
      }
    }
  }


  boolean isPolForIn(long _lgTmot, Instant _tpInstant)
      throws InterruptedException {
    if (this.clock.instant().isAfter(_tpInstant)) {
      return false;
    } else {
      Thread.sleep(_lgTmot);
      return true;
    }
  }
}
