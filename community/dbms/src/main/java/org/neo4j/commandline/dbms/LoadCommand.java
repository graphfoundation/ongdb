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
package org.neo4j.commandline.dbms;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.neo4j.cli.AbstractCommand;
import org.neo4j.cli.CommandFailedException;
import org.neo4j.cli.Converters;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.ConfigUtils;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.kernel.database.NormalizedDatabaseName;
import org.neo4j.dbms.archive.IncorrectFormat;
import org.neo4j.dbms.archive.Loader;
import org.neo4j.function.ThrowingSupplier;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.kernel.internal.locker.FileLockException;

import static java.util.Objects.requireNonNull;
import static org.neo4j.commandline.Util.wrapIOException;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.io.fs.FileUtils.deleteDirectory;
import static picocli.CommandLine.Command;
import static picocli.CommandLine.Option;

@Command(
        name = "load",
        header = "Load a database from an archive created with the dump command.",
        description = "Load a database from an archive. <archive-path> must be an archive created with the dump " +
                      "command. <database> is the name of the database to create. Existing databases can be replaced " +
                      "by specifying --force. It is not possible to replace a database that is mounted in a running " +
                      "ONgDB server. If --info is specified, then the database is not loaded, but information " +
                      "(i.e. file count, byte count, and format of load file) about the archive is printed instead."

)
public class LoadCommand extends AbstractCommand
{
    private static final String STANDARD_INPUT = "-";

    @Option( names = "--from", required = true, paramLabel = "<path>", description = "Path to archive created with the dump command " +
                                                                                     "or '-' to read from standard input." )
    private String from;
    @Option( names = "--database", description = "Name of the database to load.", defaultValue = DEFAULT_DATABASE_NAME,
            converter = Converters.DatabaseNameConverter.class )
    protected NormalizedDatabaseName database;
    @Option( names = "--force", arity = "0", description = "If an existing database should be replaced." )
    private boolean force;
    @Option( names = "--info", description = "Print meta-data information about the archive file, instead of loading the contained database." )
    private boolean info;

    private final Loader loader;

    public LoadCommand( ExecutionContext ctx, Loader loader )
    {
        super( ctx );
        this.loader = requireNonNull( loader );
    }

    @Override
    public void execute()
    {
        if ( info )
        {
            inspectDump();
        }
        else
        {
            try
            {
                loadDump();
            }
            catch ( IOException e )
            {
                wrapIOException( e );
            }
        }
    }

    private void inspectDump()
    {
        try
        {
            Loader.DumpMetaData metaData = loader.getMetaData( getArchiveInputStreamSupplier() );
            ctx.out().println( "Format: " + metaData.format );
            ctx.out().println( "Files: " + metaData.fileCount );
            ctx.out().println( "Bytes: " + metaData.byteCount );
        }
        catch ( IOException e )
        {
            wrapIOException( e );
        }
    }

    private ThrowingSupplier<InputStream,IOException> getArchiveInputStreamSupplier() throws IOException
    {
        var path = getArchivePath();
        if ( path != null )
        {
            return () -> Files.newInputStream( path );
        }
        return ctx::in;
    }

    private Path getArchivePath()
    {
        if ( STANDARD_INPUT.equals( from ) )
        {
            return null;
        }
        return Path.of( from );
    }

    protected void loadDump() throws IOException
    {
        Config config = buildConfig();

        DatabaseLayout databaseLayout = Neo4jLayout.of( config ).databaseLayout( database.name() );
        ctx.fs().mkdirs( databaseLayout.databaseDirectory() );
        ctx.fs().mkdirs( databaseLayout.getNeo4jLayout().transactionLogsRootDirectory() );
        try ( Closeable ignore = LockChecker.checkDatabaseLock( databaseLayout ) )
        {
            deleteIfNecessary( databaseLayout, force );
            load( getArchiveInputStreamSupplier(), databaseLayout, getArchivePath() );
        }
        catch ( FileLockException e )
        {
            throw new CommandFailedException( "The database is in use. Stop database '" + database.name() + "' and try again.", e );
        }
        catch ( IOException e )
        {
            wrapIOException( e );
        }
        catch ( CannotWriteException e )
        {
            throw new CommandFailedException( "You do not have permission to load the database.", e );
        }

        StoreVersionLoader.Result result = loader.getStoreVersion( ctx.fs(), config, databaseLayout );
        if ( !result.isLatest )
        {
            ctx.err().printf( "The loaded database is not on the latest format (current:%s, latest:%s). Set %s=true to enable migration.%n",
                    result.currentFormatName, result.latestFormatName, GraphDatabaseSettings.allow_upgrade.name() );
        }
    }

    protected Config buildConfig()
    {
        Config cfg = Config.newBuilder()
                           .fromFileNoThrow( ctx.confDir().resolve( Config.DEFAULT_CONFIG_FILE_NAME ) )
                           .commandExpansion( allowCommandExpansion )
                           .set( GraphDatabaseSettings.ongdb_home, ctx.homeDir() ).build();
        ConfigUtils.disableAllConnectors( cfg );
        return cfg;
    }

    private static void deleteIfNecessary( DatabaseLayout databaseLayout, boolean force )
    {
        try
        {
            if ( force )
            {
                // we remove everything except our database lock
                deleteDirectory( databaseLayout.databaseDirectory(), path -> !path.equals( databaseLayout.databaseLockFile() ) );
                FileUtils.deleteDirectory( databaseLayout.getTransactionLogsDirectory() );
            }
        }
        catch ( IOException e )
        {
            wrapIOException( e );
        }
    }

    private void load( ThrowingSupplier<InputStream,IOException> streamSupplier, DatabaseLayout databaseLayout, Path archive )
    {
        var inputName = archive == null ? "reading from stdin" : archive.toString();
        try
        {
            loader.load( databaseLayout, streamSupplier, inputName );
        }
        catch ( NoSuchFileException e )
        {
            if ( archive != null && Paths.get( e.getMessage() ).toAbsolutePath().equals( archive.toAbsolutePath() ) )
            {
                throw new CommandFailedException( "Archive does not exist: " + inputName, e );
            }
            wrapIOException( e );
        }
        catch ( FileAlreadyExistsException e )
        {
            throw new CommandFailedException( "Database already exists: " + databaseLayout.getDatabaseName(), e );
        }
        catch ( AccessDeniedException e )
        {
            throw new CommandFailedException( "You do not have permission to load the database.", e );
        }
        catch ( IOException e )
        {
            wrapIOException( e );
        }
        catch ( IncorrectFormat incorrectFormat )
        {
            throw new CommandFailedException( "Not a valid ONgDB archive: " + inputName , incorrectFormat );
        }
    }
}
