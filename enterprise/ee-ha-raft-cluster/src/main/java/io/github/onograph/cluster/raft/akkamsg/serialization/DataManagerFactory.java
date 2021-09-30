package io.github.onograph.cluster.raft.akkamsg.serialization;

import java.util.function.Function;


public class DataManagerFactory<CONTENT> {


  private Function<CONTENT, CONTENT> functionFccc;


  private boolean isCi;

  private DataManagerFactory(Function<CONTENT, CONTENT> _functionFccc, boolean _isCi) {
    this.functionFccc = _functionFccc;
    this.isCi = _isCi;
  }


  public static <C> DataManagerFactory<C> emuiDataManagerFactory() {
    return new DataManagerFactory((content) ->
    {
      return content;
    }, false);
  }


  public static <C> DataManagerFactory<C> fiieDataManagerFactory(C btval) {
    return new DataManagerFactory((ignored) ->
    {
      return btval;
    }, true);
  }


  public static <C> DataManagerFactory<C> undDataManagerFactory(Function<C, C> _functionFccc) {
    return new DataManagerFactory(_functionFccc, false);
  }


  public CONTENT bul() {
    if (!this.isCi) {

      throw new IllegalStateException("*** Error:  4f005fc6-e736-4ba7-923e-50592872c0e3");
    } else {
      return this.functionFccc.apply(null);
    }
  }


  public DataManagerFactory<CONTENT> cobeDataManagerFactory(
      DataManagerFactory<CONTENT> _dataManagerFactoryCbCONTENT) {
    if (this.isCi) {

      throw new IllegalStateException("*** Error:  fae80bd1-b164-44c7-9864-eeb00641dab2");
    } else {
      this.functionFccc = this.functionFccc.compose(_dataManagerFactoryCbCONTENT.functionFccc);
      this.isCi = _dataManagerFactoryCbCONTENT.isCi;
      return this;
    }
  }


  public boolean getIsCi() {
    return this.isCi;
  }
}
