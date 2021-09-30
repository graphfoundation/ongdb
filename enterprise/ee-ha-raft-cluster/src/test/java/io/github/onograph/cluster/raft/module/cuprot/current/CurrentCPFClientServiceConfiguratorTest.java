package io.github.onograph.cluster.raft.module.cuprot.current;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.MutableComProFamily;
import io.github.onograph.cluster.raft.control.MutatingProComClientManager;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.MessageRequestChannelInboundHandlerAdapter;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import io.netty.channel.embedded.EmbeddedChannel;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;

class CurrentCPFClientServiceConfiguratorTest {

  @Test
  void testAbstractBuilderConstructor() {
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    assertTrue((new CurrentCPFClientServiceConfigurator.AbstractBuilder(null, _logProvider,
        PipelineBuilderManager.inerPipelineBuilderManager()))
        .getPaApplicationComProFamily() instanceof io.github.onograph.cluster.raft.control.ApplicationComProFamilyType);
  }

  @Test
  void testConstructor() {
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>> mdrSrt =
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>>();
    assertNull((new CurrentCPFClientServiceConfigurator(null, _logProvider, mdrSrt,
        PipelineBuilderManager.inerPipelineBuilderManager())).getCatchupAnswerLimitHandler());
  }

  @Test
  void testConstructor2() {
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>> mdrSrt =
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>>();
    assertNull((new CurrentCPFClientServiceConfigurator(null, _logProvider, mdrSrt,
        PipelineBuilderManager.inerPipelineBuilderManager())).getCatchupAnswerLimitHandler());
  }

  @Test
  void testConstructor3() {
    Log4jLogProvider _logProvider = new Log4jLogProvider(new ByteArrayOutputStream(3));
    ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>> mdrSrt =
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>>();
    assertNull((new CurrentCPFClientServiceConfigurator(null, _logProvider, mdrSrt,
        PipelineBuilderManager.inerPipelineBuilderManager())).getCatchupAnswerLimitHandler());
  }

  @Test
  void testDeorForMe() {

    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>> mdrSrt =
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>>();
    CurrentCPFClientServiceConfigurator currentCPFClientServiceConfigurator = new CurrentCPFClientServiceConfigurator(
        null, _logProvider, mdrSrt, PipelineBuilderManager.inerPipelineBuilderManager());
    AssertableLogProvider _logProvider1 = new AssertableLogProvider(true);
    currentCPFClientServiceConfigurator.deorForMe(
        new MessageRequestChannelInboundHandlerAdapter<RefCatchupManagerImpl.CatchupManagerStatusType>(
            _logProvider1,
            new RefCatchupManagerImpl()));
  }

  @Test
  void testDeorForMe2() {

    CatchupAnswerLimitHandler _catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>> mdrSrt =
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>>();
    CurrentCPFClientServiceConfigurator currentCPFClientServiceConfigurator = new CurrentCPFClientServiceConfigurator(
        _catchupAnswerLimitHandler, _logProvider, mdrSrt,
        PipelineBuilderManager.inerPipelineBuilderManager());
    AssertableLogProvider _logProvider1 = new AssertableLogProvider(true);
    currentCPFClientServiceConfigurator.deorForMe(
        new MessageRequestChannelInboundHandlerAdapter<RefCatchupManagerImpl.CatchupManagerStatusType>(
            _logProvider1,
            new RefCatchupManagerImpl()));
  }

  @Test
  void testIntlForCh() {
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>> mdrSrt =
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>>();
    CurrentCPFClientServiceConfigurator currentCPFClientServiceConfigurator = new CurrentCPFClientServiceConfigurator(
        null, _logProvider, mdrSrt, PipelineBuilderManager.inerPipelineBuilderManager());
    EmbeddedChannel embeddedChannel = new EmbeddedChannel();
    currentCPFClientServiceConfigurator.intlForCh(embeddedChannel);
    assertSame(embeddedChannel, embeddedChannel.flush());
  }

  @Test
  void testIntlForCh2() {
    MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor> mutatingProComClientManager =
        (MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>) mock(
            MutatingProComClientManager.class);
    doNothing().when(mutatingProComClientManager)
        .aplForAb(
            (io.github.onograph.cluster.raft.control.AbstractNettyChannelPipelineService) any());

    ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>> mutatingProComClientManagerList =
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>>();
    mutatingProComClientManagerList.add(mutatingProComClientManager);
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    CurrentCPFClientServiceConfigurator currentCPFClientServiceConfigurator = new CurrentCPFClientServiceConfigurator(
        null, _logProvider, mutatingProComClientManagerList,
        PipelineBuilderManager.inerPipelineBuilderManager());
    EmbeddedChannel embeddedChannel = new EmbeddedChannel();
    currentCPFClientServiceConfigurator.intlForCh(embeddedChannel);
    verify(mutatingProComClientManager).aplForAb(
        (io.github.onograph.cluster.raft.control.AbstractNettyChannelPipelineService) any());
    assertSame(embeddedChannel, embeddedChannel.flush());
  }

  @Test
  void testMoieCollection() {
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>> mdrSrt =
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>>();
    assertTrue((new CurrentCPFClientServiceConfigurator(null, _logProvider, mdrSrt,
        PipelineBuilderManager.inerPipelineBuilderManager())).moieCollection().isEmpty());
  }

  @Test
  void testMoieCollection2() {
    MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor> mutatingProComClientManager =
        (MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>) mock(
            MutatingProComClientManager.class);
    when(mutatingProComClientManager.prtoCollection()).thenReturn(
        new ArrayList<MutableComProFamily>());

    ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>> mutatingProComClientManagerList =
        new ArrayList<MutatingProComClientManager<CPFConfigurator.CPFDirection.OutProcessor>>();
    mutatingProComClientManagerList.add(mutatingProComClientManager);
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    assertEquals(1, (new CurrentCPFClientServiceConfigurator(null, _logProvider,
        mutatingProComClientManagerList,
        PipelineBuilderManager.inerPipelineBuilderManager())).moieCollection().size());
    verify(mutatingProComClientManager).prtoCollection();
  }
}

