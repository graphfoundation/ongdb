package io.github.onograph.dbms.utils;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.neo4j.exceptions.KernelException;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.token.DelegatingTokenHolder;
import org.neo4j.token.TokenCreator;
import org.neo4j.token.TokenHolders;

class SchemaQueryGenServiceTest {

  @Test
  void testGecnhsteString() throws KernelException {
    ConstraintDescriptor constraintDescriptor = mock(ConstraintDescriptor.class);
    when(constraintDescriptor.schema()).thenThrow(new IllegalArgumentException("foo"));
    when(constraintDescriptor.getName()).thenReturn("Name");
    Function<String, IndexDescriptor> _functionLisi = (Function<String, IndexDescriptor>) mock(
        Function.class);
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertThrows(IllegalArgumentException.class,
        () -> SchemaQueryGenService.gecnhsteString(constraintDescriptor, _functionLisi,
            new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
                new DelegatingTokenHolder(
                    mock(TokenCreator.class),
                    "ABC123")))));
    verify(constraintDescriptor).getName();
    verify(constraintDescriptor).schema();
  }
}

