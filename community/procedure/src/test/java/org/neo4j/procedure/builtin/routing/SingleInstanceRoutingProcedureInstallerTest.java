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
package org.neo4j.procedure.builtin.routing;

import org.junit.jupiter.api.Test;

import java.util.Set;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.procedure.impl.GlobalProceduresRegistry;

import static java.util.stream.Collectors.toSet;
import static org.eclipse.collections.impl.set.mutable.UnifiedSet.newSetWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class SingleInstanceRoutingProcedureInstallerTest
{
    @Test
    void shouldRegisterRoutingProcedures() throws Exception
    {
        DatabaseManager<?> databaseManager = mock( DatabaseManager.class );
        ConnectorPortRegister portRegister = mock( ConnectorPortRegister.class );
        ClientRoutingDomainChecker clientRoutingDomainChecker = mock( ClientRoutingDomainChecker.class );
        Config config = Config.defaults();
        LogProvider logProvider = NullLogProvider.getInstance();

        SingleInstanceRoutingProcedureInstaller installer = new SingleInstanceRoutingProcedureInstaller( databaseManager, clientRoutingDomainChecker,
                                                                                                         portRegister, config, logProvider );
        GlobalProcedures procedures = spy( new GlobalProceduresRegistry() );

        installer.install( procedures );

        verify( procedures, times( 2 ) ).register( any( GetRoutingTableProcedure.class ) );

        Set<QualifiedName> expectedNames = newSetWith(
                new QualifiedName( new String[]{"dbms", "routing"}, "getRoutingTable" ),
                new QualifiedName( new String[]{"dbms", "cluster", "routing"}, "getRoutingTable" ) );

        Set<QualifiedName> actualNames = procedures.getAllProcedures()
                .stream()
                .map( ProcedureSignature::name )
                .collect( toSet() );

        assertEquals( expectedNames, actualNames );
    }
}
