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
package org.neo4j.server;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.helpers.TestWebContainer;
import org.neo4j.test.server.ExclusiveWebContainerTestBase;
import org.neo4j.test.server.HTTP;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.internal.helpers.collection.MapUtil.map;
import static org.neo4j.kernel.api.exceptions.Status.Transaction.TransactionNotFound;
import static org.neo4j.server.helpers.CommunityWebContainerBuilder.serverOnRandomPorts;

class TransactionTimeoutIT extends ExclusiveWebContainerTestBase
{
    private TestWebContainer testWebContainer;

    @AfterEach
    void stopTheServer()
    {
        testWebContainer.shutdown();
    }

    @Test
    void shouldHonorReallyLowSessionTimeout() throws Exception
    {
        // Given
        testWebContainer = serverOnRandomPorts()
                .withProperty( ServerSettings.transaction_idle_timeout.name(), "1" ).build();

        String tx = HTTP.POST( txURI(), map("statements", singletonList( map( "statement", "CREATE (n)" ) ) ) ).location();

        // When
        Thread.sleep( 1000 * 5 );
        Map<String, Object> response = HTTP.POST( tx + "/commit" ).content();

        // Then
        @SuppressWarnings( "unchecked" )
        List<Map<String, Object>> errors = (List<Map<String, Object>>) response.get( "errors" );
        assertThat( errors.get( 0 ).get( "code" ) ).isEqualTo( TransactionNotFound.code().serialize() );
    }

    private String txURI()
    {
        return testWebContainer.getBaseUri() + txEndpoint();
    }

}
