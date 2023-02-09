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
package org.neo4j.kernel.recovery.facade;

import java.time.Instant;

import org.neo4j.kernel.recovery.RecoveryPredicate;

public interface RecoveryCriteria
{
    RecoveryCriteria ALL = () -> RecoveryPredicate.ALL;

    static RecoveryCriteria until( long txId )
    {
        return new TransactionIdCriteria( txId );
    }

    static RecoveryCriteria until( Instant date )
    {
        return new TransactionDateCriteria( date );
    }

    RecoveryPredicate toPredicate();

    class TransactionDateCriteria implements RecoveryCriteria
    {
        private final Instant instant;

        TransactionDateCriteria( Instant instant )
        {
            this.instant = instant;
        }

        public long getEpochMillis()
        {
            return instant.toEpochMilli();
        }

        @Override
        public RecoveryPredicate toPredicate()
        {
            return RecoveryPredicate.untilInstant( instant );
        }
    }

    class TransactionIdCriteria implements RecoveryCriteria
    {
        private final long txId;

        TransactionIdCriteria( long txId )
        {
            this.txId = txId;
        }

        public long getTxId()
        {
            return txId;
        }

        @Override
        public RecoveryPredicate toPredicate()
        {
            return RecoveryPredicate.untilTransactionId( txId );
        }
    }
}
