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
package org.neo4j.bolt.v3.messaging.encoder;

import java.io.IOException;

import org.neo4j.bolt.messaging.ResponseMessageEncoder;
import org.neo4j.bolt.packstream.Neo4jPack;
import org.neo4j.bolt.v3.messaging.response.RecordMessage;
import org.neo4j.bolt.v41.messaging.IncrementalRecordMessageEncoder;
import org.neo4j.values.AnyValue;

public class RecordMessageEncoder implements ResponseMessageEncoder<RecordMessage>,
        IncrementalRecordMessageEncoder
{
    @Override
    public void encode( Neo4jPack.Packer packer, RecordMessage message ) throws IOException
    {
        AnyValue[] fields = message.fields();
        packer.packStructHeader( 1, message.signature() );
        packer.packListHeader( fields.length );
        for ( AnyValue field : fields )
        {
            packer.pack( field );
        }
    }

    public void beginRecord( Neo4jPack.Packer packer, int numberOfFields ) throws IOException
    {
        packer.packStructHeader( 1, RecordMessage.SIGNATURE );
        packer.packListHeader( numberOfFields );
    }

    public void onField( Neo4jPack.Packer packer, AnyValue field ) throws IOException
    {
        packer.pack( field );
    }
}
