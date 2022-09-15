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
package org.neo4j.index;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.util.Random;

import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.kernel.api.index.IndexDirectoryStructure;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.io.ByteUnit.mebiBytes;

public class SabotageNativeIndex extends NativeIndexRestartAction
{
    private final Random random;

    SabotageNativeIndex( Random random )
    {
        super();
        this.random = random;
    }

    @Override
    protected void runOnDirectoryStructure( FileSystemAbstraction fs, IndexDirectoryStructure indexDirectoryStructure ) throws IOException
    {
        int files = scrambleIndexFiles( fs, indexDirectoryStructure.rootDirectory() );
        assertThat( files ).as( "there is no index to sabotage" ).isGreaterThanOrEqualTo( 1 );
    }

    private int scrambleIndexFiles( FileSystemAbstraction fs, Path fileOrDir ) throws IOException
    {
        if ( fs.isDirectory( fileOrDir ) )
        {
            int count = 0;
            Path[] children = fs.listFiles( fileOrDir );
            for ( Path child : children )
            {
                count += scrambleIndexFiles( fs, child );
            }

            return count;
        }
        else
        {
            // Completely scramble file, assuming small files
            try ( StoreChannel channel = fs.write( fileOrDir ) )
            {
                if ( channel.size() > mebiBytes( 10 ) )
                {
                    throw new IllegalArgumentException( "Was expecting small files here" );
                }
                byte[] bytes = new byte[(int) channel.size()];
                random.nextBytes( bytes );
                channel.writeAll( ByteBuffer.wrap( bytes ) );
            }
            return 1;
        }
    }
}
