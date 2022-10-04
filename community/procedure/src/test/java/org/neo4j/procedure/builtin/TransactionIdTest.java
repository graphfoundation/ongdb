/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.procedure.builtin;

import org.junit.jupiter.api.Test;

import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.configuration.helpers.DatabaseNameValidator.MAXIMUM_DATABASE_NAME_LENGTH;

class TransactionIdTest
{
    @Test
    void printsTransactionIds() throws InvalidArgumentsException
    {
        assertThat( new TransactionId( "ongdb", 12L ).toString() ).isEqualTo( "ongdb-transaction-12" );
    }

    @Test
    void doesNotConstructNegativeTransactionIds()
    {
        assertThrows( InvalidArgumentsException.class, () -> new TransactionId( "ongdb", -15L ) );
    }

    @Test
    void parsesTransactionIds() throws InvalidArgumentsException
    {
        assertThat( TransactionId.parse( "ongdb-transaction-14" ) ).isEqualTo( new TransactionId( "ongdb", 14L ) );
    }

    @Test
    void doesNotParseNegativeTransactionIds()
    {
        assertThrows( InvalidArgumentsException.class, () -> TransactionId.parse( "ongdb-transaction--12" ) );
    }

    @Test
    void doesNotParseWrongSeparator()
    {
        assertThrows( InvalidArgumentsException.class, () -> TransactionId.parse( "ongdb-transactioo-12" ) );
    }

    @Test
    void doesNotParseRandomText()
    {
        assertThrows( InvalidArgumentsException.class, () -> TransactionId.parse( "blarglbarf" ) );
    }

    @Test
    void doesNotParseTrailingRandomText()
    {
        assertThrows( InvalidArgumentsException.class, () -> TransactionId.parse( "ongdb-transaction-12  " ) );
    }

    @Test
    void doesNotParseEmptyText()
    {
        assertThrows( InvalidArgumentsException.class, () -> TransactionId.parse( "" ) );
    }

    @Test
    void validateAndNormalizeDatabaseName() throws InvalidArgumentsException
    {
        assertThat( TransactionId.parse( "ONGDB-transaction-14" ) ).isEqualTo( new TransactionId( "ongdb", 14L ) );
        IllegalArgumentException e = assertThrows( IllegalArgumentException.class, () ->
                TransactionId.parse( "a".repeat( MAXIMUM_DATABASE_NAME_LENGTH + 1 ) + "-transaction-14" ) );
        assertThat( e.getMessage() ).contains( " must have a length between " );
    }
}
