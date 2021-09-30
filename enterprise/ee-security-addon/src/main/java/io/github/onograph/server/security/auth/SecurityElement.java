package io.github.onograph.server.security.auth;

import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;


public interface SecurityElement {


  void astvdcioForPr(PrivilegeAction _privilegeAction) throws InvalidArgumentsException;


  ElementType typSecurityElementElementType();


  /**
   * The enum names are important and defined in core.
   */
  enum ElementType {


    ALL_PROPERTIES,

    PROPERTY,

    ALL_LABELS,

    LABEL,

    GRAPH,

    DATABASE;

    @Override
    public String toString() {
      return super.toString().toLowerCase();
    }
  }


  class Dbms implements SecurityElement {

    @Override
    public void astvdcioForPr(PrivilegeAction _privilegeAction) throws InvalidArgumentsException {
      if (!PrivilegeAction.ADMIN.satisfies(_privilegeAction)
          && !PrivilegeAction.DATABASE_ACTIONS.satisfies(_privilegeAction) &&
          !PrivilegeAction.EXECUTE.satisfies(_privilegeAction)
          && !PrivilegeAction.EXECUTE_BOOSTED.satisfies(_privilegeAction) &&
          !PrivilegeAction.EXECUTE_ADMIN.satisfies(_privilegeAction)) {

        throw new InvalidArgumentsException("*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294");
      }
    }

    @Override
    public boolean equals(Object _obO) {
      return _obO instanceof Dbms;
    }

    @Override
    public int hashCode() {
      return ElementType.DATABASE.hashCode();
    }

    @Override
    public String toString() {
      return "";
    }

    @Override
    public ElementType typSecurityElementElementType() {
      return ElementType.DATABASE;
    }
  }


  class Graph implements SecurityElement {

    @Override
    public void astvdcioForPr(PrivilegeAction _privilegeAction) throws InvalidArgumentsException {
      if (PrivilegeAction.SET_LABEL.satisfies(_privilegeAction)
          || PrivilegeAction.REMOVE_LABEL.satisfies(_privilegeAction) ||
          !PrivilegeAction.GRAPH_ACTIONS.satisfies(_privilegeAction)) {

        throw new InvalidArgumentsException("*** Error: 25dc9e58-498d-4e39-97ee-9ffa7ae04ce2");
      }
    }

    @Override
    public boolean equals(Object _obO) {
      return _obO instanceof Graph;
    }

    @Override
    public int hashCode() {
      return ElementType.GRAPH.hashCode();
    }

    @Override
    public String toString() {
      return "";
    }

    @Override
    public ElementType typSecurityElementElementType() {
      return ElementType.GRAPH;
    }
  }


  class Label implements SecurityElement {


    private final String lbl;

    public Label(String lbl) {
      this.lbl = lbl;
    }

    @Override
    public void astvdcioForPr(PrivilegeAction _privilegeAction) throws InvalidArgumentsException {
      if (!_privilegeAction.equals(PrivilegeAction.SET_LABEL) && !_privilegeAction.equals(
          PrivilegeAction.REMOVE_LABEL)) {

        throw new InvalidArgumentsException("*** Error: db3e3e7f-33ca-4155-abf7-339b7ccdac05");
      }
    }

    @Override
    public boolean equals(Object _obO) {
      if (_obO == this) {
        return true;
      } else if (!(_obO instanceof Label)) {
        return false;
      } else {

        Label _ohrLabel = (Label) _obO;
        return this.lbl == null && _ohrLabel.lbl == null || this.lbl != null && this.lbl.equals(
            _ohrLabel.lbl);
      }
    }


    public String geleString() {
      return this.lbl == null ? "" : this.lbl;
    }

    @Override
    public int hashCode() {
      return this.lbl == null ? 0 : this.lbl.hashCode() + 31 * ElementType.LABEL.hashCode();
    }

    @Override
    public String toString() {
      return this.lbl;
    }

    @Override
    public ElementType typSecurityElementElementType() {
      return ElementType.LABEL;
    }
  }


  class Labels implements SecurityElement {

    @Override
    public void astvdcioForPr(PrivilegeAction _privilegeAction) throws InvalidArgumentsException {
      if (!_privilegeAction.equals(PrivilegeAction.SET_LABEL) && !_privilegeAction.equals(
          PrivilegeAction.REMOVE_LABEL)) {

        throw new InvalidArgumentsException("*** Error: 2973ba0e-b12f-4ada-8080-7457c2165a76");
      }
    }

    @Override
    public boolean equals(Object _obO) {
      return _obO == this || _obO instanceof Labels;
    }

    @Override
    public int hashCode() {
      return ElementType.ALL_LABELS.hashCode();
    }

    @Override
    public String toString() {
      return "*";
    }

    @Override
    public ElementType typSecurityElementElementType() {
      return ElementType.ALL_LABELS;
    }
  }


  class Properties implements SecurityElement {

    @Override
    public void astvdcioForPr(PrivilegeAction _privilegeAction) throws InvalidArgumentsException {
      if (!_privilegeAction.equals(PrivilegeAction.READ) && !_privilegeAction.equals(
          PrivilegeAction.MATCH) &&
          !_privilegeAction.equals(PrivilegeAction.SET_PROPERTY) &&
          !_privilegeAction.equals(PrivilegeAction.MERGE)) {

        throw new InvalidArgumentsException("*** Error: e2a589bd-c4cf-4c8f-aa54-c168413e8c21");
      }
    }

    @Override
    public boolean equals(Object _obO) {
      return _obO == this || _obO instanceof Properties;
    }

    @Override
    public int hashCode() {
      return ElementType.ALL_PROPERTIES.hashCode();
    }

    @Override
    public String toString() {
      return "*";
    }

    @Override
    public ElementType typSecurityElementElementType() {
      return ElementType.ALL_PROPERTIES;
    }
  }


  class Property implements SecurityElement {


    private final String prop;

    public Property(String prop) {
      this.prop = prop;
    }

    @Override
    public void astvdcioForPr(PrivilegeAction _privilegeAction) throws InvalidArgumentsException {
      if (!_privilegeAction.equals(PrivilegeAction.READ) && !_privilegeAction.equals(
          PrivilegeAction.MATCH) &&
          !_privilegeAction.equals(PrivilegeAction.SET_PROPERTY) &&
          !_privilegeAction.equals(PrivilegeAction.MERGE)) {

        throw new InvalidArgumentsException("*** Error: 5cec9520-c16f-44e2-8699-e9c4c64aee22");
      }
    }

    @Override
    public boolean equals(Object _obO) {
      if (_obO == this) {
        return true;
      } else if (!(_obO instanceof Property)) {
        return false;
      } else {

        Property _ohrProperty = (Property) _obO;
        return this.prop == null && _ohrProperty.prop == null
            || this.prop != null && this.prop.equals(_ohrProperty.prop);
      }
    }


    public String gepptString() {
      return this.prop == null ? "" : this.prop;
    }

    @Override
    public int hashCode() {
      return this.prop == null ? 0 : this.prop.hashCode() + 31 * ElementType.PROPERTY.hashCode();
    }

    @Override
    public String toString() {
      return this.prop;
    }

    @Override
    public ElementType typSecurityElementElementType() {
      return ElementType.PROPERTY;
    }
  }
}
