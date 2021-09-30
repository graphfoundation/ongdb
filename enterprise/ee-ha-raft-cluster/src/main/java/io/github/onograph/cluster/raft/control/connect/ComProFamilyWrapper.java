package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.cluster.raft.control.ComProFamily;
import io.github.onograph.cluster.raft.control.MutableComProFamily;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class ComProFamilyWrapper {


  private final List<MutableComProFamily> listPmMutableComProFamily;


  private final ApplicationComProFamily paApplicationComProFamily;


  public ComProFamilyWrapper(List<MutableComProFamily> _listPmMutableComProFamily,
      ApplicationComProFamily _paApplicationComProFamily) {
    this.paApplicationComProFamily = _paApplicationComProFamily;
    this.listPmMutableComProFamily = Collections.unmodifiableList(_listPmMutableComProFamily);
  }


  public static io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper.ComProFamilyBuilder bulrComProFamilyWrapperComProFamilyBuilder() {
    return new io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper.ComProFamilyBuilder();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ComProFamilyWrapper _thComProFamilyWrapper = (ComProFamilyWrapper) obj;
      return Objects.equals(this.paApplicationComProFamily,
          _thComProFamilyWrapper.paApplicationComProFamily) &&
          Objects.equals(this.listPmMutableComProFamily,
              _thComProFamilyWrapper.listPmMutableComProFamily);
    } else {
      return false;
    }
  }


  public List<MutableComProFamily> getListPmMutableComProFamily() {
    return this.listPmMutableComProFamily;
  }


  public ApplicationComProFamily getPaApplicationComProFamily() {
    return this.paApplicationComProFamily;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.paApplicationComProFamily, this.listPmMutableComProFamily);
  }

  @Override
  public String toString() {

    String _strD =
        String.format(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper.format"),
            this.paApplicationComProFamily.caerString(), this.paApplicationComProFamily.getImpl());

    List<String> _listNmString = this.listPmMutableComProFamily.stream().map(ComProFamily::getImpl)
        .collect(Collectors.toList());
    if (!_listNmString.isEmpty()) {
      _strD = String.format(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper.format2"), _strD,
          String.join(", ", _listNmString));
    }

    return _strD;
  }


  public static class ComProFamilyBuilder {


    private final List<MutableComProFamily> listPmMutableComProFamily = new ArrayList();


    private ApplicationComProFamily paApplicationComProFamily;

    private ComProFamilyBuilder() {
    }


    public io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper.ComProFamilyBuilder aplaoComProFamilyWrapperComProFamilyBuilder(
        ApplicationComProFamily _paApplicationComProFamily) {
      this.paApplicationComProFamily = _paApplicationComProFamily;
      return this;
    }


    ComProFamilyWrapper bulComProFamilyWrapper() {
      return new ComProFamilyWrapper(this.listPmMutableComProFamily,
          this.paApplicationComProFamily);
    }


    public io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper.ComProFamilyBuilder moieComProFamilyWrapperComProFamilyBuilder(
        MutableComProFamily _pmMutableComProFamily) {
      this.listPmMutableComProFamily.add(_pmMutableComProFamily);
      return this;
    }


  }
}
