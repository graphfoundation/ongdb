package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta;
import io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta;
import io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat;
import io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormatSafeChannelMarshaler;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta;
import io.github.onograph.cluster.raft.share.meta.pit.ConsensusMembershipState;
import io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.dbms.WatchTag;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.io.marshal.SafeStateMarshal;


public class MetaWrapper<STATE> {


  public static final MetaWrapper<ConsensusMembershipState> CONS_CND_STAX;


  public static final MetaWrapper<ConsensusMemberGroupId> CONS_GRP_UID;


  public static final MetaWrapper<ConsensusTransactionLog> CONS_LG;


  public static final MetaWrapper<NodeServerMemberTransactionLogDataMeta> CONS_MBX;


  public static final MetaWrapper<ConsensusNodeId> CONS_MB_UID;


  public static final MetaWrapper<CandidateTermMeta> CONS_TER;


  public static final MetaWrapper<CandidateTallyMeta> CONS_VOT;


  public static final MetaWrapper<Long> FIN_FLSD;


  public static final MetaWrapper<LeasableMeta> META_WRAPPER_LES_LEASABLE_META;


  @Deprecated(
      since = io.github.onograph.TokenConstants.META_WRAPPER___DEPRECATED___M_E_T_A__W_R_A_P_P_E_R__Q_U_N_M_R__W_A_T_C_H__T_A_G__SINCE
  )
  public static final MetaWrapper<WatchTag> META_WRAPPER_QUNMR_WATCH_TAG;


  public static final MetaWrapper<ReplicationSessionManagerMeta> META_WRAPPER_SESNAE_REPLICATION_SESSION_MANAGER_META;


  public static final MetaWrapper<ClusterMetaFormat> META_WRAPPER_VESN_CLUSTER_META_FORMAT;


  @Deprecated(
      since = io.github.onograph.TokenConstants.META_WRAPPER___DEPRECATED___O_L_D__C_N_D__M_B__U_I_D__SINCE
  )
  public static final MetaWrapper<ConsensusNodeId> OLD_CND_MB_UID;


  private static final List<MetaWrapper<?>> VAL_ARR;

  static {
    META_WRAPPER_VESN_CLUSTER_META_FORMAT = new MetaWrapper(MetaType.MT_VERS,
        ClusterMetaFormatSafeChannelMarshaler.IT,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_ALL,
        io.github.onograph.TokenConstants.VERSION);
    OLD_CND_MB_UID =
        new MetaWrapper(MetaType.MT_CORE_CONMEM_UID, ConsensusNodeId.SafeStateMarshalImpl.IT,
            io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_ALL,
            io.github.onograph.TokenConstants.CORE_MEMBER_ID);
    CONS_MB_UID =
        new MetaWrapper(MetaType.MT_CONMEM_UID, ConsensusNodeId.SafeStateMarshalImpl.IT,
            io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
            io.github.onograph.TokenConstants.RAFT_MEMBER_ID);
    META_WRAPPER_LES_LEASABLE_META =
        new MetaWrapper(
            new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS(),
            SettingsDeclarationClusterImpl.settingReclssInteger,
            io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
            MetaType.MT_LSREN,
            io.github.onograph.TokenConstants.LEASE);
    META_WRAPPER_SESNAE_REPLICATION_SESSION_MANAGER_META = new MetaWrapper(
        ReplicationSessionManagerMeta.MarshalChannelImplCMS.IT,
        SettingsDeclarationClusterImpl.settingGlliassInteger,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
        MetaType.MT_CLST_SES_TRCKR,
        io.github.onograph.TokenConstants.SESSION_TRACKER);
    CONS_CND_STAX = new MetaWrapper(MetaType.MT_CONS_CS,
        ConsensusMembershipState.SafeStateMarshalImpl.IT,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
        io.github.onograph.TokenConstants.CORE);
    CONS_GRP_UID = new MetaWrapper(MetaType.MT_CONS_GRP_UID,
        ConsensusMemberGroupId.SafeStateMarshalImpl.IT,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
        io.github.onograph.TokenConstants.RAFT_ID);
    CONS_LG = new MetaWrapper(MetaType.MT_CONS_LOG_ETR, null,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
        io.github.onograph.TokenConstants.RAFT_LOG);
    CONS_TER = new MetaWrapper(CandidateTermMeta.MarshalChannelImplCMS.IT,
        SettingsDeclarationClusterImpl.settingTemaseInteger,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
        MetaType.MT_CONS_TTIME, io.github.onograph.TokenConstants.TERM);
    CONS_VOT = new MetaWrapper(CandidateTallyMeta.MarshalChannelImplCMS.IT,
        SettingsDeclarationClusterImpl.settingVoeaseInteger,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
        MetaType.MT_CONS_VOTE, io.github.onograph.TokenConstants.VOTE);
    CONS_MBX = new MetaWrapper(
        io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT,
        SettingsDeclarationClusterImpl.settingRaestiInteger,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
        MetaType.MT_CONS_MNODE_DIR,
        io.github.onograph.TokenConstants.MEMBERSHIP);
    FIN_FLSD =
        new MetaWrapper(new DefaultMarshalChannelCMS(),
            SettingsDeclarationClusterImpl.settingLaldeInteger,
            io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
            MetaType.MT_PREV_MDFLSH, io.github.onograph.TokenConstants.LAST_FLUSHED);
    META_WRAPPER_QUNMR_WATCH_TAG =
        new MetaWrapper(
            MetaType.MT_D_QM, io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS.IT,
            io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
            io.github.onograph.TokenConstants.QUARANTINE_MARKER);

    List<MetaWrapper<?>> _mpList =
        Arrays.asList(META_WRAPPER_VESN_CLUSTER_META_FORMAT, META_WRAPPER_LES_LEASABLE_META,
            CONS_GRP_UID, OLD_CND_MB_UID, CONS_LG, CONS_TER, CONS_VOT,
            CONS_MBX, CONS_CND_STAX,
            FIN_FLSD, META_WRAPPER_SESNAE_REPLICATION_SESSION_MANAGER_META, CONS_MB_UID,
            META_WRAPPER_QUNMR_WATCH_TAG);
    _mpList.sort(Comparator.comparingInt(MetaWrapper::tyei));
    VAL_ARR = Collections.unmodifiableList(_mpList);
  }


  private final MetaType itMetaType;


  private final SafeStateMarshal<STATE> safeStateMarshalMrhlSTATE;


  private final Setting<Integer> settingSsrInteger;


  private final io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType soeMetaWrapperType;


  private final String title;


  private MetaWrapper(MetaType _itMetaType, SafeStateMarshal<STATE> _safeStateMarshalMrhlSTATE,
      io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType _soeMetaWrapperType,
      String title) {
    this(_safeStateMarshalMrhlSTATE, null, _soeMetaWrapperType, _itMetaType, title);
  }


  private MetaWrapper(SafeStateMarshal<STATE> _safeStateMarshalMrhlSTATE,
      Setting<Integer> _settingRssInteger,
      io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType _soeMetaWrapperType,
      MetaType _tiMetaType, String title) {
    this.itMetaType = _tiMetaType;
    this.safeStateMarshalMrhlSTATE = _safeStateMarshalMrhlSTATE;
    this.settingSsrInteger = _settingRssInteger;
    this.soeMetaWrapperType = _soeMetaWrapperType;
    this.title = title;
  }


  public static <S> MetaWrapper<S> dumMetaWrapper(SafeStateMarshal<S> _safeStateMarshalMrhlS) {
    return new MetaWrapper(MetaType.MT_NOOP, _safeStateMarshalMrhlS,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB,
        io.github.onograph.TokenConstants.DUMMY);
  }


  public static List<MetaWrapper<?>> vauList() {
    return VAL_ARR;
  }


  public io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType getSoeMetaWrapperType() {
    return this.soeMetaWrapperType;
  }


  public SafeStateMarshal<STATE> maslSafeStateMarshal() {
    if (this.safeStateMarshalMrhlSTATE == null) {

      throw new UnsupportedOperationException("*** Error: 720b81e2-b5c9-442e-8c0f-a1df50939724");
    } else {
      return this.safeStateMarshalMrhlSTATE;
    }
  }


  public String name() {
    return this.title;
  }


  public int roaosiForCo(Config _config) {
    if (this.settingSsrInteger == null) {

      throw new UnsupportedOperationException("*** Error: f6831586-3fdd-48fc-b466-4cba4ebce169");
    } else {
      return _config.get(this.settingSsrInteger);
    }
  }

  @Override
  public String toString() {
    return this.name();
  }


  public int tyei() {
    return this.itMetaType.getMTypeIdent();
  }


  enum MetaWrapperType {


    MWT_ALL,

    MWT_GDB
  }
}
