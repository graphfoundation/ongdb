package io.github.onograph.dbms.serverproc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.LinkedList;
import org.junit.jupiter.api.Test;

class ProcedureTimeoutDTOTest {

  @Test
  void testBulrProcedureTimeoutDTOWaitTimeoutManagerBuilder() {

    ProcedureTimeoutDTO.bulrProcedureTimeoutDTOWaitTimeoutManagerBuilder();
  }

  @Test
  void testConstructor() {

    new ProcedureTimeoutDTO(1L, new LinkedList<Long>());
  }

  @Test
  void testNettmu() {
    assertEquals(1L, (new ProcedureTimeoutDTO(1L, new LinkedList<Long>())).nettmu());
  }

  @Test
  void testNettmu2() {
    LinkedList<Long> resultLongList = new LinkedList<Long>();
    resultLongList.add(0L);
    assertEquals(0L, (new ProcedureTimeoutDTO(1L, resultLongList)).nettmu());
  }

  @Test
  void testWaitTimeoutManagerBuilderBulProcedureTimeoutDTO() {

    ProcedureTimeoutDTO.bulrProcedureTimeoutDTOWaitTimeoutManagerBuilder()
        .bulProcedureTimeoutDTO(1L);
  }

  @Test
  void testWaitTimeoutManagerBuilderNetwnwProcedureTimeoutDTOWaitTimeoutManagerBuilder() {
    ProcedureTimeoutDTO.WaitTimeoutManagerBuilder bulrProcedureTimeoutDTOWaitTimeoutManagerBuilderResult = ProcedureTimeoutDTO
        .bulrProcedureTimeoutDTOWaitTimeoutManagerBuilder();
    assertSame(bulrProcedureTimeoutDTOWaitTimeoutManagerBuilderResult,
        bulrProcedureTimeoutDTOWaitTimeoutManagerBuilderResult.netwnwProcedureTimeoutDTOWaitTimeoutManagerBuilder(
            1,
            1L));
  }

  @Test
  void testWaitTimeoutManagerBuilderNetwnwProcedureTimeoutDTOWaitTimeoutManagerBuilder2() {
    ProcedureTimeoutDTO.WaitTimeoutManagerBuilder bulrProcedureTimeoutDTOWaitTimeoutManagerBuilderResult = ProcedureTimeoutDTO
        .bulrProcedureTimeoutDTOWaitTimeoutManagerBuilder();
    assertSame(bulrProcedureTimeoutDTOWaitTimeoutManagerBuilderResult,
        bulrProcedureTimeoutDTOWaitTimeoutManagerBuilderResult.netwnwProcedureTimeoutDTOWaitTimeoutManagerBuilder(
            0,
            1L));
  }
}

