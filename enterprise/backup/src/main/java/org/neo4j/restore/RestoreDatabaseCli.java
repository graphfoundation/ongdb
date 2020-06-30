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
package org.neo4j.restore;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.cli.AbstractCommand;
import org.neo4j.cli.Converters.DatabaseNameConverter;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.ConfigUtils;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;

@Command( name = "restore", description = {"Restore a backed up db."} )
public class RestoreDatabaseCli extends AbstractCommand
{
    @Option( names = {"--from"}, paramLabel = "<path>", required = true, description = {"Path to backup to restore from."} )
    private File from;
    @Option( names = {"--db"}, description = {"Name of the db to restore."}, defaultValue = "neo4j", converter = {DatabaseNameConverter.class} )
    private NormalizedDatabaseName database;
    @Option( names = {"--force"}, arity = "0", description = {"If an existing db should be replaced."} )
    private boolean force;

    public RestoreDatabaseCli( ExecutionContext ctx )
    {
        super( ctx );
    }

    private static Config loadNeo4jConfig( Path homeDir, Path configDir )
    {
        Config cfg = Config.newBuilder().fromFile( configDir.resolve( "neo4j.conf" ).toFile() ).set( GraphDatabaseSettings.neo4j_home, homeDir ).build();
        ConfigUtils.disableAllConnectors( cfg );
        return cfg;
    }

    @Override
    public void execute() throws IOException
    {
        Config config = loadNeo4jConfig( this.ctx.homeDir(), this.ctx.confDir() );
        RestoreDatabaseCommand restoreDatabaseCommand = new RestoreDatabaseCommand( this.ctx.fs(), this.from, config, this.database.name(), this.force );
        restoreDatabaseCommand.execute();
    }
}