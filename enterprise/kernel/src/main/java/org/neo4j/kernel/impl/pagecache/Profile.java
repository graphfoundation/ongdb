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
package org.neo4j.kernel.impl.pagecache;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.neo4j.dbms.archive.CompressionFormat;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.pagecache.PagedFile;

import static org.neo4j.kernel.impl.pagecache.PageCacheWarmer.SUFFIX_CACHEPROF;

final class Profile implements Comparable<Profile>
{

    private static final String PROFILE_DIR = "profiles";
    private final File baseDir;
    private final File profileFile;
    private final File pagedFile;
    private final long profileSequenceId;

    private Profile( File baseDir, File profileFile, File pagedFile, long profileSequenceId )
    {
        Objects.requireNonNull( profileFile );
        Objects.requireNonNull( pagedFile );
        Objects.requireNonNull( baseDir );
        this.baseDir = baseDir;
        this.profileFile = profileFile;
        this.pagedFile = pagedFile;
        this.profileSequenceId = profileSequenceId;
    }

    static Profile first( File databaseDirectory, File file )
    {
        long profileSequenceId = 0L;
        return new Profile( databaseDirectory, profileName( databaseDirectory, file, profileSequenceId ),
                            file, profileSequenceId );
    }

    private static File profileName( File baseDirectory, File mappedFile, long count )
    {
        File profileDirectory = new File( baseDirectory, PROFILE_DIR );
        File profileFileDir = FileUtils.pathToFileAfterMove( baseDirectory, profileDirectory, mappedFile )
                                       .getParentFile();
        String name = mappedFile.getName();
        return new File( profileFileDir, name + "." + count + SUFFIX_CACHEPROF );
    }

    static Predicate<Profile> relevantTo( PagedFile pagedFile )
    {
        return ( p ) ->
        {
            return p.pagedFile.equals( pagedFile.file() );
        };
    }

    static Stream<Profile> parseProfileName( Path basePath, Path profilePath, Path mappedFilePath )
    {
        String name = profilePath.getFileName().toString();
        if ( !name.endsWith( SUFFIX_CACHEPROF ) )
        {
            return Stream.empty();
        }
        else
        {
            int lastDot = name.lastIndexOf( '.' );
            int secondLastDot = name.lastIndexOf( '.', lastDot - 1 );
            String countStr = name.substring( secondLastDot + 1, lastDot );

            try
            {
                long sequenceId = Long.parseLong( countStr, 10 );
                String targetMappedFileName = name.substring( 0, secondLastDot );
                return targetMappedFileName.equals( mappedFilePath.getFileName().toString() ) ? Stream.of(
                        new Profile( basePath.toFile(), profilePath.toFile(), mappedFilePath.toFile(),
                                     sequenceId ) ) : Stream.empty();
            }
            catch ( NumberFormatException e )
            {
                return Stream.empty();
            }
        }
    }

    @Override
    public int compareTo( Profile that )
    {
        int compare = this.pagedFile.compareTo( that.pagedFile );
        return compare == 0 ? Long.compare( this.profileSequenceId, that.profileSequenceId ) : compare;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( o instanceof Profile )
        {
            Profile profile = (Profile) o;
            return this.profileFile.equals( profile.profileFile );
        }
        else
        {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        return this.profileFile.hashCode();
    }

    @Override
    public String toString()
    {
        return "Profile(" + this.profileSequenceId + " for " + this.pagedFile + ")";
    }

    File file()
    {
        return this.profileFile;
    }

    void delete( FileSystemAbstraction fs )
    {
        fs.deleteFile( this.profileFile );
    }

    InputStream read( FileSystemAbstraction fs ) throws IOException
    {
        try
        {
            return CompressionFormat.decompress( () ->
                                                 {
                                                     return fs.openAsInputStream( this.profileFile );
                                                 } );
        }
        catch ( IOException e )
        {
            throw new IOException( "Exception when building decompressor.", e );
        }
    }

    OutputStream write( FileSystemAbstraction fs ) throws IOException
    {
        fs.mkdirs( this.profileFile.getParentFile() );

        try
        {
            return CompressionFormat.compress( () ->
                                               {
                                                   return fs.openAsOutputStream( this.profileFile, false );
                                               }, CompressionFormat.GZIP );
        }
        catch ( IOException e )
        {
            throw new IOException( "Exception when building compressor.", e );
        }
    }

    Profile next()
    {
        long next = this.profileSequenceId + 1L;
        return new Profile( this.baseDir, profileName( this.baseDir, this.pagedFile, next ),
                            this.pagedFile, next );
    }
}
