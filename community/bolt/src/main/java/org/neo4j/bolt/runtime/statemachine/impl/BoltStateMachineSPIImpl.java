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
package org.neo4j.bolt.runtime.statemachine.impl;

import java.util.Map;

import org.neo4j.bolt.BoltChannel;
import org.neo4j.bolt.runtime.Neo4jError;
import org.neo4j.bolt.runtime.statemachine.BoltStateMachineSPI;
import org.neo4j.bolt.runtime.statemachine.TransactionStateMachineSPIProvider;
import org.neo4j.bolt.security.auth.Authentication;
import org.neo4j.bolt.security.auth.AuthenticationException;
import org.neo4j.bolt.security.auth.AuthenticationResult;
import org.neo4j.internal.kernel.api.security.LoginContext;
import org.neo4j.kernel.internal.Version;
import org.neo4j.logging.internal.LogService;
import org.neo4j.memory.HeapEstimator;

public class BoltStateMachineSPIImpl implements BoltStateMachineSPI
{
    public static final long SHALLOW_SIZE = HeapEstimator.shallowSizeOfInstance( BoltStateMachineSPIImpl.class );
    public static final String BOLT_SERVER_VERSION_PREFIX = "Neo4j/";

    private final ErrorReporter errorReporter;
    private final Authentication authentication;
    private final String version;
    private final TransactionStateMachineSPIProvider transactionSpiProvider;
    private final BoltChannel boltChannel;

    public BoltStateMachineSPIImpl( LogService logging, Authentication authentication,
                                    TransactionStateMachineSPIProvider transactionSpiProvider, BoltChannel boltChannel )
    {
        this.errorReporter = new ErrorReporter( logging );
        this.authentication = authentication;
        this.transactionSpiProvider = transactionSpiProvider;
        this.boltChannel = boltChannel;
        this.version = BOLT_SERVER_VERSION_PREFIX + Version.getONgDBVersion();
    }

    @Override
    public TransactionStateMachineSPIProvider transactionStateMachineSPIProvider()
    {
        return transactionSpiProvider;
    }

    @Override
    public void reportError( Neo4jError err )
    {
        errorReporter.report( err );
    }

    @Override
    public AuthenticationResult authenticate( Map<String,Object> authToken ) throws AuthenticationException
    {
        return authentication.authenticate( authToken, boltChannel.info() );
    }

    @Override
    public LoginContext impersonate( LoginContext context, String userToImpersonate ) throws AuthenticationException
    {
        return this.authentication.impersonate( context, userToImpersonate );
    }

    @Override
    public String version()
    {
        return version;
    }
}
