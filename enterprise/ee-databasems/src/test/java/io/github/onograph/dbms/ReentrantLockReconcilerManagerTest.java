package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ReentrantLockReconcilerManagerTest {

  @Test
  void testConstructor() {

    new ReentrantLockReconcilerManager();
  }

  @Test
  void testReeelconForSt() {
    assertThrows(IllegalMonitorStateException.class,
        () -> (new ReentrantLockReconcilerManager()).reeelconForSt("Gdb Name"));
  }
}

