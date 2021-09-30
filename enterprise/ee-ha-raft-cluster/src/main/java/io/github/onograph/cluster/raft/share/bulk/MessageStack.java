package io.github.onograph.cluster.raft.share.bulk;

import java.util.Objects;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Predicate;


public class MessageStack<E> {


  private final AtomicLong btCnt = new AtomicLong();


  private final io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackSettings cniMessageStackSettings;


  private final AtomicInteger cnt = new AtomicInteger();


  private final Function<E, Long> functionOsel;


  private final AtomicLong gsAtomicLong = new AtomicLong();


  private final PriorityQueue<MessageStack<E>.ObjectWithSequence> priorityQueueQeeObjectWithSequence;


  MessageStack(
      io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackSettings _cniMessageStackSettings,
      java.util.Comparator<E> _comparatorCmaaoE, Function<E, Long> _functionOsel) {
    this.cniMessageStackSettings = _cniMessageStackSettings;
    this.functionOsel = _functionOsel;
    this.priorityQueueQeeObjectWithSequence = new PriorityQueue(_cniMessageStackSettings.iMc,
        new io.github.onograph.cluster.raft.share.bulk.MessageStack.ObjectWithSequenceComparator(
            _comparatorCmaaoE));
  }


  private Optional<E> _deuOptional(MessageStack<E>.ObjectWithSequence _eeetObjectWithSequence) {
    if (_eeetObjectWithSequence == null) {
      return Optional.empty();
    } else {
      this.cnt.decrementAndGet();
      this.btCnt.addAndGet(-(Long) this.functionOsel.apply(_eeetObjectWithSequence.eEeet));
      return Optional.of(_eeetObjectWithSequence.eEeet);
    }
  }


  public long bye() {
    return this.btCnt.get();
  }


  public int con() {
    return this.cnt.get();
  }


  public synchronized io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType ofeMessageStackMessageStackStatusType(
      E _eEeet) {

    int _iCu = this.cnt.incrementAndGet();
    if (_iCu > this.cniMessageStackSettings.iMc) {
      this.cnt.decrementAndGet();
      return io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_ECNT_OVERSIZED_ERR;
    } else {

      long _lgBe = this.functionOsel.apply(_eEeet);

      long _lgUb = this.btCnt.addAndGet(_lgBe);
      if (_lgBe != 0L && _iCu > this.cniMessageStackSettings.iCm
          && _lgUb > this.cniMessageStackSettings.lgBm) {
        this.btCnt.addAndGet(-_lgBe);
        this.cnt.decrementAndGet();
        return io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OVERSIZED_ERR;
      } else if (!this.priorityQueueQeeObjectWithSequence.offer(
          new io.github.onograph.cluster.raft.share.bulk.MessageStack.ObjectWithSequence(_eEeet))) {
        throw new IllegalStateException();
      } else {
        return io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OK;
      }
    }
  }


  public synchronized Optional<E> polOptional() {
    return this._deuOptional(this.priorityQueueQeeObjectWithSequence.poll());
  }


  synchronized Optional<E> poliOptional(Predicate<E> _predicatePeiaeE) {

    MessageStack<E>.ObjectWithSequence _enObjectWithSequence = this.priorityQueueQeeObjectWithSequence.peek();
    return _enObjectWithSequence != null && _predicatePeiaeE.test(_enObjectWithSequence.eEeet)
        ? this.polOptional() : Optional.empty();
  }


  public enum MessageStackStatusType {


    MSST_OK,

    MSST_ECNT_OVERSIZED_ERR,

    MSST_OVERSIZED_ERR
  }


  public static class MessageStackSettings {


    private final int iCm;


    private final int iMc;


    private final long lgBm;

    public MessageStackSettings(int _iCm, long _lgBm) {
      this(1, _iCm, _lgBm);
    }

    public MessageStackSettings(int _iCm, int _iCm2, long _lgBm) {
      this.iCm = _iCm;
      this.iMc = _iCm2;
      this.lgBm = _lgBm;
    }
  }


  class ObjectWithSequence {


    private final E eEeet;


    private final long lgNs;

    ObjectWithSequence(E _eEeet) {
      this.lgNs = MessageStack.this.gsAtomicLong.getAndIncrement();
      this.eEeet = _eEeet;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        MessageStack.ObjectWithSequence _thaObjectWithSequence =
            (io.github.onograph.cluster.raft.share.bulk.MessageStack.ObjectWithSequence) obj;
        return this.lgNs == _thaObjectWithSequence.lgNs;
      } else {
        return false;
      }
    }


    public E getEEeet() {
      return this.eEeet;
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.lgNs);
    }
  }


  class ObjectWithSequenceComparator implements
      java.util.Comparator<MessageStack<E>.ObjectWithSequence> {


    private final java.util.Comparator<E> comparatorCmaaoE;

    ObjectWithSequenceComparator(java.util.Comparator<E> _comparatorCmaaoE) {
      this.comparatorCmaaoE = _comparatorCmaaoE;
    }

    @Override
    public int compare(MessageStack<E>.ObjectWithSequence _oObjectWithSequence,
        MessageStack<E>.ObjectWithSequence _oObjectWithSequence2) {

      int _iCmae = this.comparatorCmaaoE.compare(_oObjectWithSequence.eEeet,
          _oObjectWithSequence2.eEeet);
      return _iCmae != 0 ? _iCmae
          : Long.compare(_oObjectWithSequence.lgNs, _oObjectWithSequence2.lgNs);
    }
  }
}
