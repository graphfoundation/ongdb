/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.causalclustering.discovery;

import java.security.SecureRandom;
import java.util.Arrays;

public class SecurePassword implements AutoCloseable
{
    private final char[] password;
    private static final int lowerBound = ' ';
    private static final int upperBound = '~';
    private static final int range = upperBound - lowerBound;

    public SecurePassword( int length, SecureRandom random )
    {
        password = new char[length];
        for ( int i = 0; i < password.length; i++ )
        {
            password[i] = (char) (random.nextInt( range ) + lowerBound); // Some keystores (PKCS12 on Oracle JDK 10) check for printable ASCII range
        }
    }

    @Override
    public void close()
    {
        Arrays.fill( password, (char) 0 );
    }

    public char[] password()
    {
        return password;
    }
}
