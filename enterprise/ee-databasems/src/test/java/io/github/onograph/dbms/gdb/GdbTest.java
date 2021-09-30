package io.github.onograph.dbms.gdb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.netty.channel.DefaultEventLoop;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.id.DefaultIdController;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.lifecycle.LifecycleListener;
import org.neo4j.kernel.lifecycle.LifecycleStatus;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;

class GdbTest {

  //@Test
  void testConstructor() {
    ArrayList<Lifecycle> lifecycleList = new ArrayList<Lifecycle>();
    LifeSupport lifeSupport = (new Gdb(lifecycleList)).listCmoetLifecycle;
    assertEquals(lifecycleList, lifeSupport.getLifecycleInstances());
    assertEquals(LifecycleStatus.NONE, lifeSupport.getStatus());
  }

  //@Test
  void testConstructor2() {
    ArrayList<Lifecycle> lifecycleList = new ArrayList<Lifecycle>();
    lifecycleList.add(new DefaultIdController());
    LifeSupport lifeSupport = (new Gdb(lifecycleList)).listCmoetLifecycle;
    assertEquals(lifecycleList, lifeSupport.getLifecycleInstances());
    assertEquals(LifecycleStatus.NONE, lifeSupport.getStatus());
  }

  //@Test
  void testConstructor3() {
    ArrayList<Lifecycle> lifecycleList = new ArrayList<Lifecycle>();
    lifecycleList.add(new DefaultIdController());
    lifecycleList.add(new DefaultIdController());
    LifeSupport lifeSupport = (new Gdb(lifecycleList)).listCmoetLifecycle;
    assertEquals(lifecycleList, lifeSupport.getLifecycleInstances());
    assertEquals(LifecycleStatus.NONE, lifeSupport.getStatus());
  }

  //@Test
  void testConstructor4() {
    DefaultEventLoop defaultEventLoop = new DefaultEventLoop();
    defaultEventLoop.addShutdownHook(mock(Runnable.class));
    ThreadPoolJobScheduler e = new ThreadPoolJobScheduler(defaultEventLoop);

    ArrayList<Lifecycle> lifecycleList = new ArrayList<Lifecycle>();
    lifecycleList.add(e);
    lifecycleList.add(new DefaultIdController());
    LifeSupport lifeSupport = (new Gdb(lifecycleList)).listCmoetLifecycle;
    assertEquals(lifecycleList, lifeSupport.getLifecycleInstances());
    assertEquals(LifecycleStatus.NONE, lifeSupport.getStatus());
  }

  @Test
  void testBulrGdbKernelDbComponentService() {

    Gdb.<Gdb>bulrGdbKernelDbComponentService((Function<List<Lifecycle>, Gdb>) mock(Function.class));
  }

  @Test
  void testEquals() {
    assertFalse((new Gdb(new ArrayList<Lifecycle>())).equals(null));
    assertFalse((new Gdb(new ArrayList<Lifecycle>())).equals("Different type to Gdb"));
  }

  @Test
  void testEquals2() {
    Gdb gdb = new Gdb(new ArrayList<Lifecycle>());
    assertTrue(gdb.equals(gdb));
    int expectedHashCodeResult = gdb.hashCode();
    assertEquals(expectedHashCodeResult, gdb.hashCode());
  }

  @Test
  void testEquals3() {
    Gdb gdb = new Gdb(new ArrayList<Lifecycle>());
    assertFalse(gdb.equals(new Gdb(new ArrayList<Lifecycle>())));
  }

  //@Test
  void testStartLC() {
    Gdb gdb = new Gdb(new ArrayList<Lifecycle>());
    gdb.startLC();
    assertEquals(LifecycleStatus.STARTED, gdb.listCmoetLifecycle.getStatus());
  }

  //@Test
  void testStartLC2() {
    ArrayList<Lifecycle> lifecycleList = new ArrayList<Lifecycle>();
    lifecycleList.add(new DefaultIdController());
    Gdb gdb = new Gdb(lifecycleList);
    gdb.startLC();
    assertEquals(LifecycleStatus.STARTED, gdb.listCmoetLifecycle.getStatus());
  }

  //@Test
  void testStartLC3() {
    ArrayList<Lifecycle> lifecycleList = new ArrayList<Lifecycle>();
    lifecycleList.add(new LifeSupport());
    Gdb gdb = new Gdb(lifecycleList);
    gdb.startLC();
    LifeSupport lifeSupport = gdb.listCmoetLifecycle;
    assertEquals(LifecycleStatus.STARTED, lifeSupport.getStatus());
    assertEquals(LifecycleStatus.STARTED,
        ((LifeSupport) lifeSupport.getLifecycleInstances().get(0)).getStatus());
  }

  //@Test
  void testStartLC4() {
    ArrayList<Lifecycle> lifecycleList = new ArrayList<Lifecycle>();
    lifecycleList.add(new DefaultIdController());
    lifecycleList.add(new LifeSupport());
    Gdb gdb = new Gdb(lifecycleList);
    gdb.startLC();
    LifeSupport lifeSupport = gdb.listCmoetLifecycle;
    assertEquals(LifecycleStatus.STARTED, lifeSupport.getStatus());
    assertEquals(LifecycleStatus.STARTED,
        ((LifeSupport) lifeSupport.getLifecycleInstances().get(1)).getStatus());
  }

  //@Test
  void testStartLC5() {
    LifecycleListener lifecycleListener = mock(LifecycleListener.class);
    doNothing().when(lifecycleListener)
        .notifyStatusChanged((Object) any(), (LifecycleStatus) any(), (LifecycleStatus) any());

    LifeSupport lifeSupport = new LifeSupport();
    lifeSupport.addLifecycleListener(lifecycleListener);

    ArrayList<Lifecycle> lifecycleList = new ArrayList<Lifecycle>();
    lifecycleList.add(lifeSupport);
    Gdb gdb = new Gdb(lifecycleList);
    gdb.startLC();
    verify(lifecycleListener, atLeast(1)).notifyStatusChanged((Object) any(),
        (LifecycleStatus) any(),
        (LifecycleStatus) any());
    LifeSupport lifeSupport1 = gdb.listCmoetLifecycle;
    assertEquals(LifecycleStatus.STARTED, lifeSupport1.getStatus());
    assertEquals(LifecycleStatus.STARTED,
        ((LifeSupport) lifeSupport1.getLifecycleInstances().get(0)).getStatus());
  }

  //@Test
  void testStopLC() {

    (new Gdb(new ArrayList<Lifecycle>())).stopLC();
  }
}

