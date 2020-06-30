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
package org.neo4j.backup.impl;

import org.junit.Before;
import org.junit.Test;

import org.neo4j.helpers.AdvertisedSocketAddress;
import org.neo4j.helpers.HostnamePort;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.impl.enterprise.settings.backup.OnlineBackupSettings;
import org.neo4j.kernel.impl.util.OptionalHostnamePort;

public class AddressResolverTest
{

    AddressResolver subject;

    // Parameters
    Config defaultConfig = Config.defaults();

    @Before
    public void setup()
    {
        subject = new AddressResolver();
    }

    @Test
    public void noPortResolvesToDefault_ha()
    {
        // given
        Integer portIsNotSupplied = null;

        // when
        HostnamePort resolved = subject.resolveCorrectHAAddress( defaultConfig, new OptionalHostnamePort( "localhost", portIsNotSupplied, null ) );

        // then
        assertEquals( 6362, resolved.getPort() );
    }

    @Test
    public void noPortResolvesToDefault_cc()
    {
        Config config = Config.builder()
                              .withSetting( OnlineBackupSettings.online_backup_server, "any:1234" )
                              .build();
        AdvertisedSocketAddress resolved = subject.resolveCorrectCCAddress( config, new OptionalHostnamePort( "localhost", null, null ) );

        // then
        assertEquals( 1234, resolved.getPort() );
    }

    @Test
    public void suppliedPortResolvesToGiven_ha()
    {
        // given
        Integer portIsSupplied = 1234;

        // when
        HostnamePort resolved = subject.resolveCorrectHAAddress( defaultConfig, new OptionalHostnamePort( "localhost", portIsSupplied, null ) );

        // then
        assertEquals( resolved.getPort(), portIsSupplied.intValue() );
    }
}
