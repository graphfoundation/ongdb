package io.github.onograph.kernel.srv.pagecache;

import java.util.HashMap;
import java.util.Map;


class PageShapeMetadata {


  private final Map<PageShape, Count> mapBpp = new HashMap();


  synchronized void demrecnForPa(PageShape[] _poiePageShapeArray) {

    PageShape[] _pageShapeArray = _poiePageShapeArray;

    int _iV = _poiePageShapeArray.length;

    for (

        int _iVa = 0; _iVa < _iV; ++_iVa) {

      PageShape _poiePageShape = _pageShapeArray[_iVa];
      this.mapBpp.computeIfPresent(_poiePageShape, (p, i) ->
      {
        return i.demang() == 0 ? null : i;
      });
    }
  }


  synchronized void inmrecnForPa(PageShape[] _poiePageShapeArray) {

    PageShape[] _pageShapeArray = _poiePageShapeArray;

    int _iVa = _poiePageShapeArray.length;

    for (

        int _iV = 0; _iV < _iVa; ++_iV) {

      PageShape _poiePageShape = _pageShapeArray[_iV];
      this.mapBpp.computeIfAbsent(_poiePageShape, (p) ->
      {
        return new Count();
      }).inre();
    }
  }


  synchronized boolean isCotnForPa(PageShape _poiePageShape) {
    return this.mapBpp.containsKey(_poiePageShape);
  }


  private static class Count {


    private int cnt;


    int demang() {
      return --this.cnt;
    }


    void inre() {
      ++this.cnt;
    }
  }
}
