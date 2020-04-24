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
package org.neo4j.causalclustering.discovery;

import java.util.stream.Stream;
import javax.naming.NamingException;

public abstract class SrvRecordResolver
{
    public abstract Stream<SrvRecord> resolveSrvRecord( String url ) throws NamingException;

    public Stream<SrvRecord> resolveSrvRecord( String service, String protocol, String hostname ) throws NamingException
    {
        String url = String.format( "_%s._%s.%s", service, protocol, hostname );

        return resolveSrvRecord( url );
    }

    public static class SrvRecord
    {
        public final int priority;
        public final int weight;
        public final int port;
        public final String host;

        private SrvRecord( int priority, int weight, int port, String host )
        {
            this.priority = priority;
            this.weight = weight;
            this.port = port;
            // Typically the SRV record has a trailing dot - if that is the case we should remove it
            this.host = host.charAt( host.length() - 1 ) == '.' ? host.substring( 0, host.length() - 1 ) : host;
        }

        public static SrvRecord parse( String input )
        {
            String[] parts = input.split( " " );
            return new SrvRecord(
                    Integer.parseInt( parts[0] ),
                    Integer.parseInt( parts[1] ),
                    Integer.parseInt( parts[2] ),
                    parts[3]
            );
        }
    }
}
