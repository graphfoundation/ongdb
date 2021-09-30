package io.github.onograph.cluster.raft.module.cuprot.current;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.MutableComProFamily;
import io.github.onograph.cluster.raft.control.MutatingProComClientManager;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.github.onograph.cluster.raft.module.cuprot.AdapterChannelHandlerServiceMGDBImpl;
import io.github.onograph.cluster.raft.module.cuprot.DefaultIncomingEventServiceLog;
import io.github.onograph.cluster.raft.module.cuprot.MessageRequestChannelInboundHandlerAdapter;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;

class CurrentCPFServerServiceConfiguratorTest {

  @Test
  void testAbstractBuilderConstructor() {
    PipelineBuilderManager _fbpPipelineBuilderManager = PipelineBuilderManager.inerPipelineBuilderManager();
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    assertTrue(
        (new CurrentCPFServerServiceConfigurator.AbstractBuilder(_fbpPipelineBuilderManager, null,
            _logProvider,
            new DefaultIncomingEventServiceLog(new AssertableLogProvider(true))))
            .getPaApplicationComProFamily() instanceof io.github.onograph.cluster.raft.control.ApplicationComProFamilyType);
  }

  @Test
  void testConstructor() {
    PipelineBuilderManager _fbpPipelineBuilderManager = PipelineBuilderManager.inerPipelineBuilderManager();
    AdapterChannelHandlerServiceMGDBImpl _hscAdapterChannelHandlerService = mock(
        AdapterChannelHandlerServiceMGDBImpl.class);
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    DefaultIncomingEventServiceLog _lseeIncomingEventService = new DefaultIncomingEventServiceLog(
        new AssertableLogProvider(true));
    ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>> mutatingProComClientManagerList =
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>>();
    new CurrentCPFServerServiceConfigurator(_fbpPipelineBuilderManager,
        _hscAdapterChannelHandlerService, _logProvider,
        _lseeIncomingEventService, mutatingProComClientManagerList);

    assertTrue(mutatingProComClientManagerList.isEmpty());
  }

  @Test
  void testConstructor2() {
    PipelineBuilderManager _fbpPipelineBuilderManager = PipelineBuilderManager.inerPipelineBuilderManager();
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    DefaultIncomingEventServiceLog _lseeIncomingEventService = new DefaultIncomingEventServiceLog(
        new AssertableLogProvider(true));
    assertNull(
        (new CurrentCPFServerServiceConfigurator(_fbpPipelineBuilderManager, null, _logProvider,
            _lseeIncomingEventService,
            new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>>()))
            .getHscAdapterChannelHandlerService());
  }

  @Test
  void testConstructor3() {
    PipelineBuilderManager _fbpPipelineBuilderManager = PipelineBuilderManager.inerPipelineBuilderManager();
    Log4jLogProvider _logProvider = new Log4jLogProvider(new ByteArrayOutputStream(3));
    DefaultIncomingEventServiceLog _lseeIncomingEventService = new DefaultIncomingEventServiceLog(
        new AssertableLogProvider(true));
    assertNull(
        (new CurrentCPFServerServiceConfigurator(_fbpPipelineBuilderManager, null, _logProvider,
            _lseeIncomingEventService,
            new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>>()))
            .getHscAdapterChannelHandlerService());
  }

  @Test
  void testDeorForMe() {

    PipelineBuilderManager _fbpPipelineBuilderManager = PipelineBuilderManager.inerPipelineBuilderManager();
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    DefaultIncomingEventServiceLog _lseeIncomingEventService = new DefaultIncomingEventServiceLog(
        new AssertableLogProvider(true));
    CurrentCPFServerServiceConfigurator currentCPFServerServiceConfigurator = new CurrentCPFServerServiceConfigurator(
        _fbpPipelineBuilderManager, null, _logProvider, _lseeIncomingEventService,
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>>());
    AssertableLogProvider _logProvider1 = new AssertableLogProvider(true);
    currentCPFServerServiceConfigurator
        .deorForMe(
            new MessageRequestChannelInboundHandlerAdapter<ServerRef.CatchupManagerStatusType>(
                _logProvider1,
                new ServerRef()));
  }

  @Test
  void testIntlForCh() {
    AdapterChannelHandlerServiceMGDBImpl adapterChannelHandlerServiceMGDBImpl = mock(
        AdapterChannelHandlerServiceMGDBImpl.class);
    when(adapterChannelHandlerServiceMGDBImpl
        .gematChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any()))
        .thenReturn(new ChannelDuplexHandler());
    when(adapterChannelHandlerServiceMGDBImpl
        .gealdbidChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any()))
        .thenReturn(new ChannelDuplexHandler());
    when(adapterChannelHandlerServiceMGDBImpl
        .geioChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any()))
        .thenReturn(new ChannelDuplexHandler());
    when(adapterChannelHandlerServiceMGDBImpl
        .snhhnChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any()))
        .thenReturn(new ChannelDuplexHandler());
    when(adapterChannelHandlerServiceMGDBImpl
        .gesoflruharChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any()))
        .thenReturn(new ChannelDuplexHandler());
    when(adapterChannelHandlerServiceMGDBImpl
        .stlnruharChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any()))
        .thenReturn(new ChannelDuplexHandler());
    when(adapterChannelHandlerServiceMGDBImpl
        .gesoirshdChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any()))
        .thenReturn(new ChannelDuplexHandler());
    when(adapterChannelHandlerServiceMGDBImpl
        .txplrehnChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any()))
        .thenReturn(new ChannelDuplexHandler());
    when(adapterChannelHandlerServiceMGDBImpl
        .gedteirqheChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any()))
        .thenReturn(new ChannelDuplexHandler());
    PipelineBuilderManager _fbpPipelineBuilderManager = PipelineBuilderManager.inerPipelineBuilderManager();
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    DefaultIncomingEventServiceLog _lseeIncomingEventService = new DefaultIncomingEventServiceLog(
        new AssertableLogProvider(true));
    CurrentCPFServerServiceConfigurator currentCPFServerServiceConfigurator = new CurrentCPFServerServiceConfigurator(
        _fbpPipelineBuilderManager, adapterChannelHandlerServiceMGDBImpl, _logProvider,
        _lseeIncomingEventService,
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>>());
    EmbeddedChannel embeddedChannel = new EmbeddedChannel();
    currentCPFServerServiceConfigurator.intlForCh(embeddedChannel);
    verify(adapterChannelHandlerServiceMGDBImpl)
        .gealdbidChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any());
    verify(adapterChannelHandlerServiceMGDBImpl)
        .gedteirqheChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any());
    verify(adapterChannelHandlerServiceMGDBImpl)
        .geioChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any());
    verify(adapterChannelHandlerServiceMGDBImpl)
        .gematChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any());
    verify(adapterChannelHandlerServiceMGDBImpl)
        .gesoflruharChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any());
    verify(adapterChannelHandlerServiceMGDBImpl)
        .gesoirshdChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any());
    verify(adapterChannelHandlerServiceMGDBImpl)
        .snhhnChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any());
    verify(adapterChannelHandlerServiceMGDBImpl)
        .stlnruharChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any());
    verify(adapterChannelHandlerServiceMGDBImpl)
        .txplrehnChannelHandler((io.github.onograph.cluster.raft.module.cuprot.ServerRef) any());
    assertTrue(embeddedChannel.deregister() instanceof io.netty.channel.DefaultChannelPromise);
    assertSame(embeddedChannel, embeddedChannel.flush());
  }

  @Test
  void testMoieCollection() {
    PipelineBuilderManager _fbpPipelineBuilderManager = PipelineBuilderManager.inerPipelineBuilderManager();
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    DefaultIncomingEventServiceLog _lseeIncomingEventService = new DefaultIncomingEventServiceLog(
        new AssertableLogProvider(true));
    assertTrue(
        (new CurrentCPFServerServiceConfigurator(_fbpPipelineBuilderManager, null, _logProvider,
            _lseeIncomingEventService,
            new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>>())).moieCollection()
            .isEmpty());
  }

  @Test
  void testMoieCollection2() {
    MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor> mutatingProComClientManager =
        (MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>) mock(
            MutatingProComClientManager.class);
    when(mutatingProComClientManager.prtoCollection()).thenReturn(
        new ArrayList<MutableComProFamily>());

    ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>> mutatingProComClientManagerList =
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.InProcessor>>();
    mutatingProComClientManagerList.add(mutatingProComClientManager);
    PipelineBuilderManager _fbpPipelineBuilderManager = PipelineBuilderManager.inerPipelineBuilderManager();
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    assertEquals(1,
        (new CurrentCPFServerServiceConfigurator(_fbpPipelineBuilderManager, null, _logProvider,
            new DefaultIncomingEventServiceLog(new AssertableLogProvider(true)),
            mutatingProComClientManagerList))
            .moieCollection()
            .size());
    verify(mutatingProComClientManager).prtoCollection();
  }
}

