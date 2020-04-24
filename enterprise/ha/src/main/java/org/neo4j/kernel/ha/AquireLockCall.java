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
package org.neo4j.kernel.ha;

import org.jboss.netty.buffer.ChannelBuffer;

import org.neo4j.com.RequestContext;
import org.neo4j.com.Response;
import org.neo4j.com.TargetCaller;
import org.neo4j.kernel.ha.com.master.Master;
import org.neo4j.kernel.ha.lock.LockResult;
import org.neo4j.kernel.impl.locking.ResourceTypes;
import org.neo4j.storageengine.api.lock.ResourceType;

abstract class AcquireLockCall implements TargetCaller<Master, LockResult>
{
    @Override
    public Response<LockResult> call( Master master, RequestContext context,
                                      ChannelBuffer input, ChannelBuffer target )
    {
        ResourceType type = ResourceTypes.fromId( input.readInt() );
        long[] ids = new long[input.readInt()];
        for ( int i = 0; i < ids.length; i++ )
        {
            ids[i] = input.readLong();
        }
        return lock( master, context, type, ids );
    }

    protected abstract Response<LockResult> lock( Master master, RequestContext context, ResourceType type,
                                                  long... ids );
}
