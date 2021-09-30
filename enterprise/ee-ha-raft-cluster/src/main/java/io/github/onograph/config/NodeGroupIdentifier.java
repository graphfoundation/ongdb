package io.github.onograph.config;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nonnull;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.configuration.SettingValueParser;
import org.neo4j.configuration.SettingValueParsers;


@PublicApi
public class NodeGroupIdentifier implements CharSequence, Comparable<NodeGroupIdentifier> {


  public static final NodeGroupIdentifier EMT_NODE_GROUP_IDENTIFIER = new NodeGroupIdentifier("");


  public static final SettingValueParser<NodeGroupIdentifier> SVX_GRP_NME = new SettingValueParser<NodeGroupIdentifier>() {
    @Override
    public String getDescription() {
      return io.github.onograph.I18N.format(
          "io.github.onograph.config.NodeGroupIdentifier.getDescription");
    }

    @Override
    public Class<NodeGroupIdentifier> getType() {
      return NodeGroupIdentifier.class;
    }

    @Override
    public NodeGroupIdentifier parse(String val) {

      NodeGroupIdentifier _preNodeGroupIdentifier = new NodeGroupIdentifier(
          SettingValueParsers.STRING.parse(val));
      this.validate(_preNodeGroupIdentifier);
      return _preNodeGroupIdentifier;
    }

    @Override
    public void validate(NodeGroupIdentifier val) {
      if (val.getVal().contains(",")) {

        throw new IllegalArgumentException("*** Error: 02e9cb38-9bd1-4d5e-ae8c-bc6e75b92cd4");
      }
    }
  };


  private final String val;

  public NodeGroupIdentifier(@Nonnull String title) {
    this.val = title;
  }


  public static List<NodeGroupIdentifier> litoList(String... _strNmsArray) {
    return List.of(Arrays.stream(_strNmsArray).map(NodeGroupIdentifier::new).toArray((i) ->
    {
      return new NodeGroupIdentifier[i];
    }));
  }


  public static Set<NodeGroupIdentifier> seoSet(String... _strNmsArray) {
    return seoSet(Arrays.asList(_strNmsArray));
  }


  public static Set<NodeGroupIdentifier> seoSet(Collection<String> _collectionNmsString) {

    Set<NodeGroupIdentifier> _setNdNodeGroupIdentifier = _collectionNmsString.stream()
        .map(NodeGroupIdentifier::new).collect(Collectors.toSet());
    return Set.of(_setNdNodeGroupIdentifier.toArray((i) ->
    {
      return new NodeGroupIdentifier[i];
    }));
  }

  @Override
  public char charAt(int idx) {
    return this.val.charAt(idx);
  }

  @Override
  public IntStream chars() {
    return this.val.chars();
  }

  @Override
  public IntStream codePoints() {
    return this.val.codePoints();
  }

  @Override
  public int compareTo(NodeGroupIdentifier obj) {
    return this.val.compareTo(obj.val);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      NodeGroupIdentifier _thaNodeGroupIdentifier = (NodeGroupIdentifier) obj;
      return this.val.equals(_thaNodeGroupIdentifier.val);
    } else {
      return false;
    }
  }


  public String getVal() {
    return this.val;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.val);
  }

  @Override
  public int length() {
    return this.val.length();
  }

  @Override
  public CharSequence subSequence(int _iSat, int _iE) {
    return this.val.subSequence(_iSat, _iE);
  }

  @Override
  public String toString() {
    return this.val;
  }
}
