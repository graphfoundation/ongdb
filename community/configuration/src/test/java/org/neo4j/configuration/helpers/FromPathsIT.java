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
package org.neo4j.configuration.helpers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Set;

import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@TestDirectoryExtension
class FromPathsIT
{
    @Inject
    private TestDirectory testDirectory;

    private Path ongdb1Directory;
    private Path mongo1Directory;
    private Path redis1Directory;
    private Path dbRoot1Directory;
    private Path ongdb2Directory;
    private Path dbRoot2Directory;

    @BeforeEach
    void setUp()
    {
        this.ongdb1Directory = testDirectory.directory( "ongdb", "db1" );
        this.mongo1Directory = testDirectory.directory( "mongo", "db1" );
        this.redis1Directory = testDirectory.directory( "redis", "db1" );
        this.ongdb2Directory = testDirectory.directory( "ongdb", "db2" );
        this.dbRoot1Directory = ongdb1Directory.getParent();
        this.dbRoot2Directory = ongdb2Directory.getParent();
    }

    @Test
    void shouldReturnTheInputValueIfThereIsNoRegexInPath()
    {
        final var filteredPaths = new FromPaths( dbRoot1Directory.toAbsolutePath().toString() ).getPaths();

        final var expected = Set.of( dbRoot1Directory );
        assertThat( filteredPaths ).containsAll( expected );
    }

    @Test
    void shouldGetAllFoldersThatMatchIfFilterIsApplied()
    {
        assertThat( new FromPaths( concatenateSubPath( dbRoot1Directory.toAbsolutePath().toString(), "o*" ) )
                            .getPaths() ).containsAll( Set.of( ongdb1Directory ) );
        assertThat( new FromPaths( concatenateSubPath( dbRoot1Directory.toAbsolutePath().toString(), "ongd?" ) )
                            .getPaths() ).containsAll( Set.of( ongdb1Directory ) );
        assertThat( new FromPaths( concatenateSubPath( dbRoot1Directory.toAbsolutePath().toString(), "ongdb" ) )
                            .getPaths() ).containsAll( Set.of( ongdb1Directory ) );
        assertThat( new FromPaths( concatenateSubPath( dbRoot1Directory.toAbsolutePath().toString(), "*ngd*" ) )
                            .getPaths() ).containsAll( Set.of( ongdb1Directory ) );
        assertThat( new FromPaths( concatenateSubPath( dbRoot1Directory.toAbsolutePath().toString(), "*" ) ).getPaths() ).containsAll(
                Set.of( ongdb1Directory, mongo1Directory, redis1Directory ) );
    }

    @Test
    void isSingleShouldReturnTrueIfInputIsSingleValue()
    {
        assertThat( new FromPaths( concatenateSubPath( "a", "b" ) ).isSingle() ).isTrue();
    }

    @Test
    void isSingleShouldReturnFalseIfInputIsListOfValues()
    {
        assertThat( new FromPaths( concatenateSubPath( "a", "b" ) + "," + concatenateSubPath( "c", "d" ) ).isSingle() ).isFalse();
    }

    @Test
    void shouldReturnTheInputListIfFilterIsNotApplied()
    {
        final var paths = new FromPaths( dbRoot1Directory.toAbsolutePath() + ", " + dbRoot2Directory.toAbsolutePath() )
                .getPaths();

        final var expected = Set.of( dbRoot1Directory, dbRoot2Directory );
        assertThat( paths ).containsAll( expected );
    }

    @Test
    void shouldGetAllFoldersFromTheListOfPathsIfFilterIsApplied()
    {
        final var filteredPaths = new FromPaths( concatenateSubPath( dbRoot1Directory.toAbsolutePath().toString(), "o*" ) + ", "
                                                 + concatenateSubPath( dbRoot2Directory.toAbsolutePath().toString(), "o*" ) ).getPaths();

        final var expected = Set.of( ongdb1Directory, ongdb2Directory );
        assertThat( filteredPaths ).containsAll( expected );
    }

    @Test
    void shouldThrowExceptionIfFromPathIllegal()
    {
        Exception e = assertThrows( IllegalArgumentException.class, () -> assertValid( "" ) );
        assertEquals( "The provided from parameter is empty.", e.getMessage() );

        Exception e2 = assertThrows( NullPointerException.class, () -> assertValid( null ) );
        assertEquals( "The provided from parameter is empty.", e2.getMessage() );

        Exception e3 = assertThrows( IllegalArgumentException.class, () -> assertValid( concatenateSubPath( "a*", "b" ) ) );
        assertThat( e3.getMessage() ).contains( "Asterisks and question marks should be placed in the last subpath" );

        Exception e4 = assertThrows( IllegalArgumentException.class, () -> assertValid( concatenateSubPath( "a", "b->" ) ) );
        assertThat( e4.getMessage() ).contains( "is in illegal format." );
    }

    @Test
    void inputShouldNotPointToTheRootOfTheFileSystem()
    {
        Iterator<Path> rootDirectories = FileSystems.getDefault().getRootDirectories().iterator();
        if ( !rootDirectories.hasNext() )
        {
            //noinspection ConstantConditions
            assumeTrue( false ); // Report as ignored
        }
        var exception = assertThrows( IllegalArgumentException.class, () -> assertValid( rootDirectories.next().toAbsolutePath().toString() ) );
        assertThat( exception.getMessage() ).contains( "should not point to the root of the file system" );
    }

    @Test
    void shouldNotThrowExceptionWhenPathContainsTwoSubpath()
    {
        new FromPaths( concatenateSubPath( "a", "b" ) );
    }

    private static void assertValid( String name )
    {
        new FromPaths( name );
    }

    private static String concatenateSubPath( String... paths )
    {
        return String.join( File.separator, paths );
    }
}
