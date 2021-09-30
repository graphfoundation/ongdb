package io.github.onograph.dbms.crash;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SysCrashEventTest {

  @Test
  void testConstructor() {
    SysCrashEvent actualSysCrashEvent = new SysCrashEvent(new Throwable(),
        SysCrashCauseInfo.CCI_MTI_IT_PROC);

    assertEquals(0, actualSysCrashEvent.getICe());
    Throwable throwable = actualSysCrashEvent.casThrowable;
    assertEquals("java.lang.Throwable", throwable.toString());
    assertNull(throwable.getMessage());
    assertNull(throwable.getLocalizedMessage());
    assertNull(throwable.getCause());
  }

  @Test
  void testConstructor2() {
    SysCrashEvent actualSysCrashEvent = new SysCrashEvent(new Throwable(),
        SysCrashCauseInfo.CCI_MTI_IT_PROC);

    assertEquals(0, actualSysCrashEvent.getICe());
    assertTrue(actualSysCrashEvent.causeInfo instanceof SysCrashCauseInfo);
  }

  @Test
  void testEquals() {
    assertFalse(
        (new SysCrashEvent(new Throwable(), SysCrashCauseInfo.CCI_MTI_IT_PROC)).equals(null));
    assertFalse((new SysCrashEvent(new Throwable(), SysCrashCauseInfo.CCI_MTI_IT_PROC))
        .equals("Different type to SysCrashEvent"));
  }

  @Test
  void testEquals2() {
    SysCrashEvent sysCrashEvent = new SysCrashEvent(new Throwable(),
        SysCrashCauseInfo.CCI_MTI_IT_PROC);
    assertTrue(sysCrashEvent.equals(sysCrashEvent));
    int expectedHashCodeResult = sysCrashEvent.hashCode();
    assertEquals(expectedHashCodeResult, sysCrashEvent.hashCode());
  }

  @Test
  void testEquals3() {
    SysCrashEvent sysCrashEvent = new SysCrashEvent(new Throwable(),
        SysCrashCauseInfo.CCI_MTI_IT_PROC);
    assertFalse(sysCrashEvent.equals(
        new SysCrashEvent(new Throwable(), SysCrashCauseInfo.CCI_MTI_IT_PROC)));
  }
}

