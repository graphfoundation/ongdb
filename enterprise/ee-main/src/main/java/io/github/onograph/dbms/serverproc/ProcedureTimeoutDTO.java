package io.github.onograph.dbms.serverproc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.LongStream;


class ProcedureTimeoutDTO {


  private final long lgTl;


  private final Queue<Long> queueTmotLong;


  ProcedureTimeoutDTO(long _lgTl, Queue<Long> _queueTmotLong) {
    this.lgTl = _lgTl;
    this.queueTmotLong = _queueTmotLong;
  }


  public static ProcedureTimeoutDTO.WaitTimeoutManagerBuilder bulrProcedureTimeoutDTOWaitTimeoutManagerBuilder() {
    return new ProcedureTimeoutDTO.WaitTimeoutManagerBuilder();
  }


  public long nettmu() {
    return this.queueTmotLong.isEmpty() ? this.lgTl : this.queueTmotLong.poll();
  }


  public static class WaitTimeoutManagerBuilder {


    private final Queue<Long> queueTmotLong = new LinkedList();


    public ProcedureTimeoutDTO bulProcedureTimeoutDTO(long _lgMtf) {
      return new ProcedureTimeoutDTO(_lgMtf, this.queueTmotLong);
    }


    public ProcedureTimeoutDTO.WaitTimeoutManagerBuilder netwnwProcedureTimeoutDTOWaitTimeoutManagerBuilder(
        int _iAon, long _lgMt) {
      LongStream.range(0L, _iAon).forEach((ignore) ->
      {
        this.queueTmotLong.add(_lgMt);
      });
      return this;
    }
  }
}
