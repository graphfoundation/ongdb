/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.server.security.enterprise.auth;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.Consumer;

import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.helpers.HostnamePort;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacade;

public interface NeoInteractionLevel<S>
{
    static String tempPath( String prefix, String suffix ) throws IOException
    {
        Path path = Files.createTempFile( prefix, suffix );
        Files.delete( path );
        return path.toString();
    }

    EnterpriseUserManager getLocalUserManager() throws Exception;

    GraphDatabaseFacade getLocalGraph();

    FileSystemAbstraction fileSystem();

    InternalTransaction beginLocalTransactionAsUser( S subject, KernelTransaction.Type txType ) throws Throwable;

    /*
     * The returned String is empty if the query executed as expected, and contains an error msg otherwise
     */
    String executeQuery( S subject, String call, Map<String,Object> params,
                         Consumer<ResourceIterator<Map<String,Object>>> resultConsumer );

    S login( String username, String password ) throws Exception;

    void logout( S subject ) throws Exception;

    void updateAuthToken( S subject, String username, String password );

    String nameOf( S subject );

    void tearDown() throws Throwable;

    void assertAuthenticated( S subject );

    void assertPasswordChangeRequired( S subject );

    void assertInitFailed( S subject );

    void assertSessionKilled( S subject );

    String getConnectionProtocol();

    HostnamePort lookupConnector( String connectorKey );
}
