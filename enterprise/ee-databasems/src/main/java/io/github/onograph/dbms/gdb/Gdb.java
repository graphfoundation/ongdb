package io.github.onograph.dbms.gdb;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.lifecycle.LifecycleException;


public class Gdb {


  protected final LifeSupport listCmoetLifecycle = new LifeSupport();

  protected Gdb(List<Lifecycle> _listCmoetLifecycle) {

    LifeSupport _lifeSupport = this.listCmoetLifecycle;
    Objects.requireNonNull(_lifeSupport);
    _listCmoetLifecycle.forEach(_lifeSupport::add);
  }


  public static <T extends Gdb> KernelDbComponentService<T> bulrGdbKernelDbComponentService(
      Function<List<Lifecycle>, T> _functionCntutlt) {
    return new KernelDbComponentFactory(_functionCntutlt);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      Gdb _tGdb = (Gdb) obj;
      return this.listCmoetLifecycle.equals(_tGdb.listCmoetLifecycle);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.listCmoetLifecycle);
  }


  public void startLC() {
    try {
      this.listCmoetLifecycle.start();
    } catch (

        LifecycleException _lifecycleException) {
      try {
        this.stopLC();
      } catch (

          Throwable _throwable) {
        _lifecycleException.addSuppressed(_throwable);
      }

      throw _lifecycleException;
    }
  }


  public void stopLC() {
    this.listCmoetLifecycle.stop();
  }


  public interface ComponentOptService<T extends Gdb> {


    T bul();


    ComponentOptService<T> lifecycle(Lifecycle _lifecycle);
  }


  public interface KernelDbComponentService<T extends Gdb> {


    ComponentOptService<T> database(Database _database);


    KernelDbComponentService<T> lifecycle(Lifecycle _lifecycle);
  }


  private static class ComponentOptServiceFactory<T extends Gdb> implements ComponentOptService<T> {


    private final Function<List<Lifecycle>, T> functionCntutlt;


    private final List<Lifecycle> listCmoetLifecycle;

    private ComponentOptServiceFactory(Function<List<Lifecycle>, T> _functionCntutlt,
        List<Lifecycle> _listCmoetLifecycle) {
      this.functionCntutlt = _functionCntutlt;
      this.listCmoetLifecycle = _listCmoetLifecycle;
    }

    @Override
    public T bul() {
      return this.functionCntutlt.apply(this.listCmoetLifecycle);
    }

    @Override
    public ComponentOptService<T> lifecycle(Lifecycle _cmoetLifecycle) {
      this.listCmoetLifecycle.add(_cmoetLifecycle);
      return this;
    }
  }


  private static class KernelDbComponentFactory<T extends Gdb> implements
      KernelDbComponentService<T> {


    private final Function<List<Lifecycle>, T> functionCntutlt;


    private final List<Lifecycle> listCmoetLifecycle;

    private KernelDbComponentFactory(Function<List<Lifecycle>, T> _functionCntutlt) {
      this.functionCntutlt = _functionCntutlt;
      this.listCmoetLifecycle = new LinkedList();
    }

    @Override
    public ComponentOptService<T> database(Database _kreDatabase) {
      this.listCmoetLifecycle.add(_kreDatabase);
      return new ComponentOptServiceFactory(this.functionCntutlt, this.listCmoetLifecycle);
    }

    @Override
    public KernelDbComponentService<T> lifecycle(Lifecycle _cmoetLifecycle) {
      this.listCmoetLifecycle.add(_cmoetLifecycle);
      return this;
    }
  }
}
