/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
package org.neo4j.io.pagecache.impl.muninn;

import org.junit.jupiter.api.extension.ExtendWith;

import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.TestDirectoryExtension;
import org.neo4j.test.rule.TestDirectory;

@ExtendWith( TestDirectoryExtension.class )
class MuninnPageCacheWithRealFileSystemIT extends MuninnPageCacheTest
{
    private static final int REAL_FILE_SYSTEM_TIMEOUT_MULTIPLIER = 8;

    @Inject
    TestDirectory directory;

    MuninnPageCacheWithRealFileSystemIT()
    {
        // Real file system runs are substantially slower than ephemeral FS runs under forked test execution.
        SHORT_TIMEOUT_MILLIS *= REAL_FILE_SYSTEM_TIMEOUT_MULTIPLIER;
        SEMI_LONG_TIMEOUT_MILLIS *= REAL_FILE_SYSTEM_TIMEOUT_MULTIPLIER;
        LONG_TIMEOUT_MILLIS *= REAL_FILE_SYSTEM_TIMEOUT_MULTIPLIER;
    }

    @Override
    protected Fixture<MuninnPageCache> createFixture()
    {
        return super.createFixture()
                    .withFileSystemAbstraction( DefaultFileSystemAbstraction::new )
                    .withFileConstructor( pathname -> directory.file( pathname ) );
    }
}
