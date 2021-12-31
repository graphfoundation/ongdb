/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.ha;

import org.neo4j.com.ObjectSerializer;
import org.neo4j.com.RequestType;
import org.neo4j.com.TargetCaller;

abstract class AbstractHaRequestTypes implements HaRequestTypes
{
    private final HaRequestType[] types = new HaRequestType[HaRequestTypes.Type.values().length];

    protected <A,B,C> void register( Type type, TargetCaller<A,B> targetCaller, ObjectSerializer<C> objectSerializer )
    {
        register( type, targetCaller, objectSerializer, true );
    }

    protected <A,B,C> void register( Type type, TargetCaller<A,B> targetCaller, ObjectSerializer<C> objectSerializer, boolean unpack )
    {
        assert types[type.ordinal()] == null;
        types[type.ordinal()] = new HaRequestType( targetCaller, objectSerializer, (byte)type.ordinal(), unpack );
    }

    @Override
    public RequestType type( Type type )
    {
        return type( (byte) type.ordinal() );
    }

    @Override
    public RequestType type( byte id )
    {
        HaRequestType requestType = types[id];
        if ( requestType == null )
        {
            throw new UnsupportedOperationException(
                    "Not used anymore, merely here to keep the ordinal ids of the others" );
        }
        return requestType;
    }
}
