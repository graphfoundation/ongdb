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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MockSrvRecordResolver extends SrvRecordResolver
{

    private final HashMap<String,List<SrvRecord>> records;

    public MockSrvRecordResolver( HashMap<String,List<SrvRecord>> records )
    {
        this.records = records;
    }

    public void addRecords( String url, Collection<SrvRecord> records )
    {
        records.forEach( r -> addRecord( url, r ) );
    }

    public synchronized void addRecord( String url, SrvRecord record )
    {
        List<SrvRecord> srvRecords = records.getOrDefault( url, new ArrayList<>() );
        srvRecords.add( record );

        if ( !records.containsKey( url ) )
        {
            records.put( url, srvRecords );
        }
    }

    @Override
    public Stream<SrvRecord> resolveSrvRecord( String url )
    {
        return Optional.ofNullable( records.get( url ) ).map( List::stream ).orElse( Stream.empty() );
    }
}
