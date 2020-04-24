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
package org.neo4j.cluster.protocol.atomicbroadcast;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class LenientObjectInputStream extends ObjectInputStream
{
    private VersionMapper versionMapper;

    public LenientObjectInputStream( ByteArrayInputStream fis, VersionMapper versionMapper ) throws IOException
    {
        super( fis );
        this.versionMapper = versionMapper;
    }

    @Override
    protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException
    {
        ObjectStreamClass wireClassDescriptor = super.readClassDescriptor();
        if ( !versionMapper.hasMappingFor( wireClassDescriptor.getName() ) )
        {
            versionMapper.addMappingFor( wireClassDescriptor.getName(), wireClassDescriptor.getSerialVersionUID() );
        }

        Class localClass; // the class in the local JVM that this descriptor represents.
        try
        {
            localClass = Class.forName( wireClassDescriptor.getName() );
        }
        catch ( ClassNotFoundException e )
        {
            return wireClassDescriptor;
        }
        ObjectStreamClass localClassDescriptor = ObjectStreamClass.lookup( localClass );
        if ( localClassDescriptor != null )
        {
            final long localSUID = localClassDescriptor.getSerialVersionUID();
            final long wireSUID = wireClassDescriptor.getSerialVersionUID();
            if ( wireSUID != localSUID )
            {
                wireClassDescriptor = localClassDescriptor;
            }
        }
        return wireClassDescriptor;
    }
}
