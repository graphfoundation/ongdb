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
package org.neo4j.consistency;

import picocli.CommandLine;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;

import java.io.PrintStream;
import java.nio.file.Path;

import org.neo4j.cli.ExecutionContext;

import static picocli.CommandLine.Help.Visibility.ALWAYS;

@SuppressWarnings( "FieldMayBeFinal" )
public class ConsistencyCheckOptions
{
    @Option( names = "--report-dir", paramLabel = "<path>",
            description = "Directory where consistency report will be written.", defaultValue = "." )
    private Path reportDir;

    @Option( names = "--check-graph", arity = "1", showDefaultValue = ALWAYS, paramLabel = "<true/false>",
            description = "Perform consistency checks between nodes, relationships, properties, types and tokens." )
    private boolean checkGraph = true;

    @Option( names = "--check-indexes", arity = "1", showDefaultValue = ALWAYS, paramLabel = "<true/false>",
            description = "Perform consistency checks on indexes." )
    private boolean checkIndexes = true;

    @Option( names = "--check-index-structure", arity = "1", showDefaultValue = ALWAYS, paramLabel = "<true/false>",
            description = "Perform structure checks on indexes." )
    private boolean checkIndexStructure = true;

    @Option( names = "--check-label-scan-store", arity = "1", paramLabel = "<true/false>",
            description = "Perform consistency checks on the label scan store. This option is deprecated and its value will be ignored. " +
                          "Checking of label scan store/lookup index on labels is controlled by --check-graph." )
    private boolean checkLabelScanStore = true;

    @Option( names = "--check-relationship-type-scan-store", arity = "1", paramLabel = "<true/false>",
            description = "Perform consistency checks on the relationship type scan store. This option is deprecated and its value will be ignored. " +
                          "Checking of relationship type scan store/lookup index on relationship types is controlled by --check-graph." )
    private boolean checkRelationshipTypeScanStore;

    @Option( names = "--check-property-owners", arity = "1", paramLabel = "<true/false>",
            description = "Perform additional consistency checks on property ownership. This check is @|bold,red very|@ expensive in time and memory. " +
                          "This option is deprecated and its value will be ignored." )
    private boolean checkPropertyOwners;

    public Path getReportDir()
    {
        return reportDir;
    }

    public boolean isCheckGraph()
    {
        return checkGraph;
    }

    public boolean isCheckIndexes()
    {
        return checkIndexes;
    }

    public boolean isCheckIndexStructure()
    {
        return checkIndexStructure;
    }

    public static void warnOnUsageOfDeprecatedOptions( CommandSpec spec, ExecutionContext ctx )
    {
        CommandLine.ParseResult parseResult = spec.commandLine().getParseResult();
        PrintStream out = ctx.out();
        checkUsageOfDeprecatedOption( parseResult, out, "--check-label-scan-store" );
        checkUsageOfDeprecatedOption( parseResult, out, "--check-relationship-type-scan-store" );
        checkUsageOfDeprecatedOption( parseResult, out, "--check-property-owners" );
    }

    private static void checkUsageOfDeprecatedOption( CommandLine.ParseResult parseResult, PrintStream out, String deprecatedOption )
    {
        if ( parseResult.hasMatchedOption( deprecatedOption ) )
        {
            out.println( "Warning: Option '" + deprecatedOption + "' has been deprecated and its value will be ignored." );
        }
    }
}
