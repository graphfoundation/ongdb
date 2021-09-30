package io.github.onograph.procedure.builtin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.netty.buffer.ByteBufAllocatorMetric;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.neo4j.bolt.transport.BoltMemoryPool;
import org.neo4j.dbms.database.SystemGraphComponent;
import org.neo4j.internal.kernel.api.procs.FieldSignature;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.lock.ActiveLock;
import org.neo4j.lock.LockType;
import org.neo4j.lock.ResourceType;
import org.neo4j.memory.GlobalMemoryGroupTracker;
import org.neo4j.memory.MemoryGroup;
import org.neo4j.memory.MemoryPools;
import org.neo4j.procedure.Mode;
import org.neo4j.scheduler.ActiveGroup;
import org.neo4j.scheduler.Group;
import org.neo4j.server.http.HttpTransactionMemoryPool;

class DbmsProceduresTest {

  @Test
  void testActiveGroupThreadWrapperConstructor() {
    DbmsProcedures.ActiveGroupThreadWrapper actualActiveGroupThreadWrapper = new DbmsProcedures.ActiveGroupThreadWrapper(
        new ActiveGroup(Group.TASK_SCHEDULER, 1));
    assertEquals("Scheduler", actualActiveGroupThreadWrapper.activeGroupName);
    assertEquals(1L, actualActiveGroupThreadWrapper.activeGroupThreads);
  }

  @Test
  void testActiveGroupThreadWrapperConstructor2() {
    DbmsProcedures.ActiveGroupThreadWrapper actualActiveGroupThreadWrapper = new DbmsProcedures.ActiveGroupThreadWrapper(
        new ActiveGroup(Group.VM_PAUSE_MONITOR, 1));
    assertEquals("VmPauseMonitor", actualActiveGroupThreadWrapper.activeGroupName);
    assertEquals(1L, actualActiveGroupThreadWrapper.activeGroupThreads);
  }

  @Test
  void testCurrentResourceLockMetaConstructor() {
    DbmsProcedures.CurrentResourceLockMeta actualCurrentResourceLockMeta = new DbmsProcedures.CurrentResourceLockMeta(
        "Mdstr", "Rt Name", 123L);

    assertEquals("Mdstr", actualCurrentResourceLockMeta.mode);
    assertEquals("Rt Name", actualCurrentResourceLockMeta.resourceType);
    assertEquals(123L, actualCurrentResourceLockMeta.resourceId);
  }

  @Test
  void testCurrentResourceLockMetaConstructor2() {
    ResourceType resourceType = mock(ResourceType.class);
    when(resourceType.name()).thenReturn("Name");
    DbmsProcedures.CurrentResourceLockMeta actualCurrentResourceLockMeta = new DbmsProcedures.CurrentResourceLockMeta(
        new ActiveLock(resourceType, LockType.SHARED, 123L, 123L));
    assertEquals("SHARED", actualCurrentResourceLockMeta.mode);
    assertEquals("Name", actualCurrentResourceLockMeta.resourceType);
    assertEquals(123L, actualCurrentResourceLockMeta.resourceId);
    verify(resourceType).name();
  }

  @Test
  void testHeapMetaConstructor() {
    DbmsProcedures.HeapMeta actualHeapMeta = new DbmsProcedures.HeapMeta(
        new HttpTransactionMemoryPool(new MemoryPools(true)));
    assertEquals("Unbounded", actualHeapMeta.fremmy);
    assertEquals("Unbounded", actualHeapMeta.topmeb);
    assertEquals("Unbounded", actualHeapMeta.topme);
    assertEquals("HTTP Transaction", actualHeapMeta.plNm);
    assertEquals("0", actualHeapMeta.naemrudbs);
    assertEquals("0B", actualHeapMeta.naemrud);
    assertEquals("0B", actualHeapMeta.hepmmyue);
    assertEquals("0", actualHeapMeta.hemeuby);
    assertEquals(DbmsProcedures.INOE_TXS_UID_PRE, actualHeapMeta.gdbName);
    assertEquals("Unbounded", actualHeapMeta.frmeb);
  }

  @Test
  void testHeapMetaConstructor2() {
    DbmsProcedures.HeapMeta actualHeapMeta = new DbmsProcedures.HeapMeta(
        new GlobalMemoryGroupTracker(
            new MemoryPools(true), MemoryGroup.TRANSACTION, 1L, true, true, "Limit Setting Name"));
    assertEquals("1B", actualHeapMeta.fremmy);
    assertEquals("1", actualHeapMeta.topmeb);
    assertEquals("1B", actualHeapMeta.topme);
    assertEquals("Transaction", actualHeapMeta.plNm);
    assertEquals("0", actualHeapMeta.naemrudbs);
    assertEquals("0B", actualHeapMeta.naemrud);
    assertEquals("0B", actualHeapMeta.hepmmyue);
    assertEquals("0", actualHeapMeta.hemeuby);
    assertEquals(DbmsProcedures.INOE_TXS_UID_PRE, actualHeapMeta.gdbName);
    assertEquals("1", actualHeapMeta.frmeb);
  }

  @Test
  void testHeapMetaConstructor3() {
    ByteBufAllocatorMetric byteBufAllocatorMetric = mock(ByteBufAllocatorMetric.class);
    when(byteBufAllocatorMetric.usedDirectMemory()).thenReturn(1L);
    when(byteBufAllocatorMetric.usedHeapMemory()).thenReturn(1L);
    DbmsProcedures.HeapMeta actualHeapMeta = new DbmsProcedures.HeapMeta(
        new BoltMemoryPool(new MemoryPools(true), byteBufAllocatorMetric));
    assertEquals("Unbounded", actualHeapMeta.fremmy);
    assertEquals("Unbounded", actualHeapMeta.topmeb);
    assertEquals("Unbounded", actualHeapMeta.topme);
    assertEquals("Bolt", actualHeapMeta.plNm);
    assertEquals("1", actualHeapMeta.naemrudbs);
    assertEquals("1B", actualHeapMeta.naemrud);
    assertEquals("1B", actualHeapMeta.hepmmyue);
    assertEquals("1", actualHeapMeta.hemeuby);
    assertEquals(DbmsProcedures.INOE_TXS_UID_PRE, actualHeapMeta.gdbName);
    assertEquals("Unbounded", actualHeapMeta.frmeb);
    verify(byteBufAllocatorMetric, atLeast(1)).usedDirectMemory();
    verify(byteBufAllocatorMetric, atLeast(1)).usedHeapMemory();
  }

  @Test
  void testHeapMetaConstructor4() {
    ByteBufAllocatorMetric byteBufAllocatorMetric = mock(ByteBufAllocatorMetric.class);
    when(byteBufAllocatorMetric.usedDirectMemory()).thenReturn(Long.MAX_VALUE);
    when(byteBufAllocatorMetric.usedHeapMemory()).thenReturn(1L);
    DbmsProcedures.HeapMeta actualHeapMeta = new DbmsProcedures.HeapMeta(
        new BoltMemoryPool(new MemoryPools(true), byteBufAllocatorMetric));
    assertEquals("Unbounded", actualHeapMeta.fremmy);
    assertEquals("Unbounded", actualHeapMeta.topmeb);
    assertEquals("Unbounded", actualHeapMeta.topme);
    assertEquals("Bolt", actualHeapMeta.plNm);
    assertEquals("9223372036854775807", actualHeapMeta.naemrudbs);
    assertEquals("8.389e+06TiB", actualHeapMeta.naemrud);
    assertEquals("1B", actualHeapMeta.hepmmyue);
    assertEquals("1", actualHeapMeta.hemeuby);
    assertEquals(DbmsProcedures.INOE_TXS_UID_PRE, actualHeapMeta.gdbName);
    assertEquals("Unbounded", actualHeapMeta.frmeb);
    verify(byteBufAllocatorMetric, atLeast(1)).usedDirectMemory();
    verify(byteBufAllocatorMetric, atLeast(1)).usedHeapMemory();
  }

  @Test
  void testMetaGraphStatusInfoConstructor() {
    DbmsProcedures.MetaGraphStatusInfo actualMetaGraphStatusInfo = new DbmsProcedures.MetaGraphStatusInfo(
        " str Cmoet",
        SystemGraphComponent.Status.UNINITIALIZED);

    assertEquals(" str Cmoet", actualMetaGraphStatusInfo.cope);
    assertEquals("UNINITIALIZED", actualMetaGraphStatusInfo.stat);
    assertEquals("requires initialization", actualMetaGraphStatusInfo.reotn);
    assertEquals("No sub-graph detected for this component", actualMetaGraphStatusInfo.desc);
  }

  @Test
  void testMetaGraphUpdateInfoConstructor() {
    DbmsProcedures.MetaGraphUpdateInfo actualMetaGraphUpdateInfo = new DbmsProcedures.MetaGraphUpdateInfo(
        " str Cmoet",
        "Stat", " str Ru");

    assertEquals(" str Cmoet", actualMetaGraphUpdateInfo.cope);
    assertEquals(" str Ru", actualMetaGraphUpdateInfo.uprerst);
    assertEquals("Stat", actualMetaGraphUpdateInfo.stat);
  }

  @Test
  void testProcExMetaConstructor() {
    QualifiedName name = new QualifiedName(new ArrayList<String>(), "Name");

    ArrayList<FieldSignature> inputSignature = new ArrayList<FieldSignature>();
    DbmsProcedures.ProcExMeta actualProcExMeta = new DbmsProcedures.ProcExMeta(
        new ProcedureSignature(name, inputSignature, new ArrayList<FieldSignature>(), Mode.READ,
            true, "Deprecated",
            new String[]{"foo", "foo", "foo"}, "The characteristics of someone or something",
            "Warning", true, true,
            true, true, true));
    List<String> stringList = actualProcExMeta.defaultBuiltInRoles;
    assertEquals(1, stringList.size());
    assertEquals("admin", stringList.get(0));
    assertTrue(actualProcExMeta.worksOnSystem);
    assertEquals("Name() :: ()", actualProcExMeta.signature);
    assertEquals("Name", actualProcExMeta.name);
    assertEquals("READ", actualProcExMeta.mode);
    assertEquals("The characteristics of someone or something", actualProcExMeta.description);
  }

  @Test
  void testProcExMetaConstructor2() {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add(DbmsProcedures.INOE_TXS_UID_PRE);
    QualifiedName name = new QualifiedName(stringList, "Name");

    ArrayList<FieldSignature> inputSignature = new ArrayList<FieldSignature>();
    DbmsProcedures.ProcExMeta actualProcExMeta = new DbmsProcedures.ProcExMeta(
        new ProcedureSignature(name, inputSignature, new ArrayList<FieldSignature>(), Mode.READ,
            true, "Deprecated",
            new String[]{"foo", "foo", "foo"}, "The characteristics of someone or something",
            "Warning", true, true,
            true, true, true));
    List<String> stringList1 = actualProcExMeta.defaultBuiltInRoles;
    assertEquals(1, stringList1.size());
    assertEquals("admin", stringList1.get(0));
    assertTrue(actualProcExMeta.worksOnSystem);
    assertEquals(".Name() :: ()", actualProcExMeta.signature);
    assertEquals(".Name", actualProcExMeta.name);
    assertEquals("READ", actualProcExMeta.mode);
    assertEquals("The characteristics of someone or something", actualProcExMeta.description);
  }

  @Test
  void testProcExMetaConstructor3() {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add(DbmsProcedures.INOE_TXS_UID_PRE);
    stringList.add(DbmsProcedures.INOE_TXS_UID_PRE);
    QualifiedName name = new QualifiedName(stringList, "Name");

    ArrayList<FieldSignature> inputSignature = new ArrayList<FieldSignature>();
    DbmsProcedures.ProcExMeta actualProcExMeta = new DbmsProcedures.ProcExMeta(
        new ProcedureSignature(name, inputSignature, new ArrayList<FieldSignature>(), Mode.READ,
            true, "Deprecated",
            new String[]{"foo", "foo", "foo"}, "The characteristics of someone or something",
            "Warning", true, true,
            true, true, true));
    List<String> stringList1 = actualProcExMeta.defaultBuiltInRoles;
    assertEquals(1, stringList1.size());
    assertEquals("admin", stringList1.get(0));
    assertTrue(actualProcExMeta.worksOnSystem);
    assertEquals("..Name() :: ()", actualProcExMeta.signature);
    assertEquals("..Name", actualProcExMeta.name);
    assertEquals("READ", actualProcExMeta.mode);
    assertEquals("The characteristics of someone or something", actualProcExMeta.description);
  }

  @Test
  void testProcExMetaConstructor4() {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("dbms.security.changePassword");
    QualifiedName name = new QualifiedName(stringList, "Name");

    ArrayList<FieldSignature> fieldSignatureList = new ArrayList<FieldSignature>();
    DbmsProcedures.ProcExMeta actualProcExMeta = new DbmsProcedures.ProcExMeta(
        new ProcedureSignature(name, fieldSignatureList, new ArrayList<FieldSignature>(), Mode.READ,
            true, "Deprecated",
            new String[]{"foo", "foo", "foo"}, "The characteristics of someone or something",
            "Warning", true, true,
            true, true, true));
    assertEquals(fieldSignatureList, actualProcExMeta.defaultBuiltInRoles);
    assertTrue(actualProcExMeta.worksOnSystem);
    assertEquals("dbms.security.changePassword.Name() :: ()", actualProcExMeta.signature);
    assertEquals("dbms.security.changePassword.Name", actualProcExMeta.name);
    assertEquals("READ", actualProcExMeta.mode);
    assertEquals("The characteristics of someone or something", actualProcExMeta.description);
  }

  @Test
  void testProfileReturnedMetaConstructor() {
    assertEquals(" str Poie", (new DbmsProcedures.ProfileReturnedMeta(" str Poie")).prfe);
  }

  @Test
  void testScupregpStream() throws InterruptedException {
    assertThrows(IllegalArgumentException.class, () -> (new DbmsProcedures())
        .scupregpStream("alice.liddell@example.org", " str Ng", "alice.liddell@example.org"));
    assertThrows(IllegalArgumentException.class,
        () -> (new DbmsProcedures()).scupregpStream("sample", " str Ng",
            "alice.liddell@example.org"));
    assertThrows(IllegalArgumentException.class,
        () -> (new DbmsProcedures()).scupregpStream("sample", null, "alice.liddell@example.org"));
    assertThrows(IllegalArgumentException.class, () -> (new DbmsProcedures())
        .scupregpStream("alice.liddell@example.org", "PageCacheEviction",
            "alice.liddell@example.org"));
  }

  @Test
  void testTransactionResourceLockMetaConstructor() {
    DbmsProcedures.TransactionResourceLockMeta actualTransactionResourceLockMeta = new DbmsProcedures.TransactionResourceLockMeta(
        "Mdstr", "Rt Name", 123L, "Trans Idx");

    assertEquals("Mdstr", actualTransactionResourceLockMeta.mdstr);
    assertEquals("Trans Idx", actualTransactionResourceLockMeta.transIdx);
    assertEquals(123L, actualTransactionResourceLockMeta.rxId);
    assertEquals("Rt Name", actualTransactionResourceLockMeta.rtName);
  }
}

