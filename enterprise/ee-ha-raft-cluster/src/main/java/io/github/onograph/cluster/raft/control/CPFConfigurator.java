package io.github.onograph.cluster.raft.control;

import io.netty.channel.Channel;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;


public interface CPFConfigurator<O extends io.github.onograph.cluster.raft.control.CPFConfigurator.CPFDirection> {


  void intlForCh(Channel _channel) throws Exception;


  Collection<Collection<MutableComProFamily>> moieCollection();


  interface CPFDirection {


    interface InProcessor extends
        io.github.onograph.cluster.raft.control.CPFConfigurator.CPFDirection {


    }


    interface OutProcessor extends
        io.github.onograph.cluster.raft.control.CPFConfigurator.CPFDirection {


    }
  }


  abstract class AbstractBuilder<O extends io.github.onograph.cluster.raft.control.CPFConfigurator.CPFDirection, I extends CPFConfigurator<O>> {


    private final Function<List<MutatingProComClientManager<O>>, I> functionCntutli;


    private final ApplicationComProFamily paApplicationComProFamily;

    protected AbstractBuilder(ApplicationComProFamily _apApplicationComProFamily,
        Function<List<MutatingProComClientManager<O>>, I> _functionCntutli) {
      this.functionCntutli = _functionCntutli;
      this.paApplicationComProFamily = _apApplicationComProFamily;
    }


    I cra(List<MutatingProComClientManager<O>> mdrSrt) {
      return this.functionCntutli.apply(mdrSrt);
    }


    public ApplicationComProFamily getPaApplicationComProFamily() {
      return this.paApplicationComProFamily;
    }
  }
}
