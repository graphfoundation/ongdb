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
package org.neo4j.kernel.impl.coreapi;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.neo4j.graphdb.Entity;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.kernel.impl.core.TransactionalEntityFactory;

public interface InternalTransaction extends Transaction, TransactionalEntityFactory
{
    void setTransaction( KernelTransaction transaction );

    /**
     * Loop-hole to access underlying kernel transaction. This is intended to allow
     * gradual removal of the InternalTransaction interface.
     */
    KernelTransaction kernelTransaction();

    KernelTransaction.Type transactionType();

    SecurityContext securityContext();

    ClientConnectionInfo clientInfo();

    KernelTransaction.Revertable overrideWith( SecurityContext context );

    Optional<Status> terminationReason();

    void setMetaData( Map<String, Object> txMeta );

    void checkInTransaction();

    boolean isOpen();

    void terminate( Status reason );

    UUID getDatabaseId();

    String getDatabaseName();

    <E extends Entity> E validateSameDB( E entity );

    /**
     * Attach a callback that will be called when the transaction is closed. This can be used by e.g. procedures to register
     * resources that should be closed together with the transaction.
     *
     * @param callback to be invoked when the transaction is closed.
     */
    default void addCloseCallback( TransactionClosedCallback callback )
    {
        throw new UnsupportedOperationException( "This transaction implementation does not allow close callbacks" );
    }

    @FunctionalInterface
    interface TransactionClosedCallback
    {
        void transactionClosed();
    }
}
