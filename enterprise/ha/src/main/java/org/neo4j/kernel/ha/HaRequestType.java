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
package org.neo4j.kernel.ha;

import org.neo4j.com.ObjectSerializer;
import org.neo4j.com.RequestType;
import org.neo4j.com.TargetCaller;

public class HaRequestType implements RequestType
{
    private final TargetCaller targetCaller;
    private final ObjectSerializer objectSerializer;
    private final byte id;
    private final boolean unpack;

    public HaRequestType( TargetCaller targetCaller, ObjectSerializer objectSerializer, byte id, boolean unpack )
    {
        this.targetCaller = targetCaller;
        this.objectSerializer = objectSerializer;
        this.id = id;
        this.unpack = unpack;
    }

    @Override
    public TargetCaller getTargetCaller()
    {
        return targetCaller;
    }

    @Override
    public ObjectSerializer getObjectSerializer()
    {
        return objectSerializer;
    }

    @Override
    public byte id()
    {
        return id;
    }

    @Override
    public boolean responseShouldBeUnpacked()
    {
        return unpack;
    }
}
