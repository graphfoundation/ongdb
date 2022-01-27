/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.kernel.recovery;

import java.time.Instant;
import java.util.function.Predicate;

import org.neo4j.internal.helpers.Format;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;

public interface RecoveryPredicate extends Predicate<CommittedTransactionRepresentation>
{
    RecoveryPredicate ALL = new AllTransactionsPredicate();

    static RecoveryPredicate untilTransactionId( long txId )
    {
        return new TransactionIdPredicate( txId );
    }

    static RecoveryPredicate untilInstant( Instant date )
    {
        return new TransactionDatePredicate( date );
    }

    String describe();

    class AllTransactionsPredicate implements RecoveryPredicate
    {
        private AllTransactionsPredicate()
        {
        }

        @Override
        public String describe()
        {
            return "all transactions predicate.";
        }

        @Override
        public boolean test( CommittedTransactionRepresentation committedTransactionRepresentation )
        {
            return true;
        }
    }

    class TransactionIdPredicate implements RecoveryPredicate
    {
        private final long txId;

        private TransactionIdPredicate( long txId )
        {
            this.txId = txId;
        }

        @Override
        public boolean test( CommittedTransactionRepresentation transaction )
        {
            return transaction.getCommitEntry().getTxId() < txId;
        }

        @Override
        public String describe()
        {
            return "transaction id should be < " + txId;
        }
    }

    class TransactionDatePredicate implements RecoveryPredicate
    {
        private final Instant instant;

        private TransactionDatePredicate( Instant instant )
        {
            this.instant = instant;
        }

        @Override
        public boolean test( CommittedTransactionRepresentation transaction )
        {
            return transaction.getStartEntry().getTimeWritten() < instant.toEpochMilli();
        }

        @Override
        public String describe()
        {
            return "transaction date should be before " + Format.date( instant );
        }
    }
}
